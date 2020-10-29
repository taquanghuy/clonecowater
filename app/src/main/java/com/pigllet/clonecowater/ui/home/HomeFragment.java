package com.pigllet.clonecowater.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.pigllet.clonecowater.R;
import com.pigllet.clonecowater.ShareStoreUtils;
import com.pigllet.clonecowater.UserService;
import com.pigllet.clonecowater.ConstApp;
import com.pigllet.clonecowater.ui.report.ReportFragment;
import com.pigllet.clonecowater.ui.report.OnItemClickListenner;
import com.pigllet.clonecowater.ultis.home.Datum;
import com.pigllet.clonecowater.ultis.home.Item;
import com.pigllet.clonecowater.ultis.login.ResultLogin;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeFragment extends Fragment implements OnItemClickListenner {
    private HomeAdapter homeAdapter;
    private List<Datum> datas = new ArrayList<>();
    private RecyclerView recyclerView;
    private UserService userService;
    private View view;
    private HomeFragment homeFragment;
    private Context mContext;
    private ResultLogin resultLogin;
    ReportFragment reportFragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniViews();
        initConnection();
        loadItemReport();
    }

    private void iniViews() {
        homeAdapter = new HomeAdapter(datas, getContext(), this);
        recyclerView = view.findViewById(R.id.rvHome);
        //recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(homeAdapter);
    }


    private void initConnection() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        okHttpClient.addInterceptor(httpLoggingInterceptor);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(ConstApp.BASE_URL)
                .client(okHttpClient.build())
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        userService = retrofit.create(UserService.class);
    }

    private void loadItemReport() {
        ResultLogin resultLogin = ShareStoreUtils.getUser(mContext);
        if (resultLogin != null) {
            String token = resultLogin.getToken();
            Call<Item> call = userService.getReport(27, "year", "type", token, "vn");
            call.enqueue(new Callback<Item>() {
                @Override
                public void onResponse(Call<Item> call, Response<Item> response) {
                    if (response.isSuccessful() && response.body().getData() != null) {
                        if (!datas.isEmpty()) {
                            datas.clear();
                        }
                        datas = response.body().getData();
                        homeAdapter.updateData(datas);
                    } else {
                        Toast.makeText(getContext(), "No Result", Toast.LENGTH_LONG).show();
                    }
                }
                @Override
                public void onFailure(Call<Item> call, Throwable t) {

                }
            });
        }

    }


    @Override
    public void onItemClick(int position) {
        String token = ShareStoreUtils.getUser(getContext()).getToken();
        Log.d("TOKEN", token);
        reportFragment = new ReportFragment();
        FragmentManager fragmentManager;
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.nav_fragment, reportFragment).commit();

    }

   /* @Override
    public boolean onBackPressed() {

    }*/
}
