package com.pigllet.clonecowater.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.pigllet.clonecowater.MainActivity;
import com.pigllet.clonecowater.R;
import com.pigllet.clonecowater.ShareStoreUtils;
import com.pigllet.clonecowater.UserService;
import com.pigllet.clonecowater.ConstApp;
import com.pigllet.clonecowater.ultis.login.ResultLogin;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;
    private UserService userService;
    private ConstraintLayout clWrong;
    private TextView txtDismiss;
    private TextView txtAccountName;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        iniRetrofit();
        iniViews();
    }

    private void iniViews(){
        edtPassword = findViewById(R.id.edtPassword);
        edtUsername = findViewById(R.id.edtUsername);
        clWrong = findViewById(R.id.clWrong);
        txtDismiss = findViewById(R.id.txtDismiss);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        txtDismiss.setOnClickListener(this);
        txtAccountName = findViewById(R.id.txtAccountName);
    }

    private void iniRetrofit(){
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(); //Log out histories and status from request/respone
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        client.addInterceptor(loggingInterceptor);
        //Retrofit
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(ConstApp.BASE_URL)
                .client(client.build())
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        //khoi tao phuong thuc trong userservice
        userService = retrofit.create(UserService.class);
    }

    private void login(){
        String email = edtUsername.getText().toString().trim();
        String pass = edtPassword.getText().toString().trim();
        //String name = txtAccountName.getText().toString().trim();
        Log.d("pass", pass);
        email = "PLLT001maikieulc";
        pass = "12345678";
        //Login login = new Login(email, pass);

        Call<ResultLogin> call = userService.login(email,pass);
        call.enqueue(new Callback<ResultLogin>() {
            @Override
            public void onResponse(Call<ResultLogin> call, Response<ResultLogin> response) {
                if (response.isSuccessful() && response.body() != null) {
                    // neu ket noi thanh cong se luu token va chay toi main
                    ShareStoreUtils.saveToken(LoginActivity.this, response.body());
                    // Set name's user
                    //name= response.body().getProfile().getName();
                    startMainActivity();
                    Log.d("HUY",response.body().getToken());
                }else {
                    clWrong.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onFailure(Call<ResultLogin> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Erros", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });

        Toast.makeText(LoginActivity.this, "Login is failed", Toast.LENGTH_SHORT);
    }

    private void startMainActivity() {
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                login();
                break;
            case R.id.txtDismiss:
                clWrong.setVisibility(View.INVISIBLE);
                break;
        }
    }

}
