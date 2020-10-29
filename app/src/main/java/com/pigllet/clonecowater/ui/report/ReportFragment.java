package com.pigllet.clonecowater.ui.report;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.pigllet.clonecowater.ConstApp;
import com.pigllet.clonecowater.R;
import com.pigllet.clonecowater.UserService;
import com.pigllet.clonecowater.ultis.home.Datum;
import com.pigllet.clonecowater.ultis.login.ResultLogin;
import com.pigllet.clonecowater.ultis.report.ReportResponse;
import com.readystatesoftware.chuck.ChuckInterceptor;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import okhttp3.OkHttpClient;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ReportFragment extends Fragment implements OnItemClickListenner {
    private RecyclerView rvDetailList;
    private View view;
    private UserService userService;
    private ReportAdapter reportAdapter;
    private List<ReportResponse.Data.ReportActivity> projectActivityList = new ArrayList<>();
    private Context context;
    private List<Datum> datumList = new ArrayList<>();

    public ReportFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    /*public static DetailListFragment newInstance(String param1, String param2) {
        DetailListFragment fragment = new DetailListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    private void iniViews() {
        rvDetailList = view.findViewById(R.id.rvDetailList);
        reportAdapter = new ReportAdapter(getContext(), this);
        rvDetailList.setAdapter(reportAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_report, container, false);
        iniViews();
        initConnection();
        loadData();
        return view;
    }

    private void loadData() {

        Call<ReportResponse> call = userService.getListActivities(26, 27, "05185b107e238e2f642c848547fc1488a3a4af4e", "vn", 1);
        call.enqueue(new Callback<ReportResponse>() {
            @Override
            public void onResponse(@NotNull Call<ReportResponse> call, @NotNull Response<ReportResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    for (ReportResponse.Data.ReportActivity reportActivity : response.body().getData().getReport_activity()){
                        if (reportActivity.getProject_activity() != null){
                            projectActivityList.add(reportActivity);
                        }
                    }
                    reportAdapter.updateData(projectActivityList);


                }else {
                    Toast.makeText(getContext(),"Fail",Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<ReportResponse> call, Throwable t) {
int a =1 ;
            }
        });

    }

    private void initConnection() {
       /* OkHttpClient.Builder client = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        client.addInterceptor(httpLoggingInterceptor);*/

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new ChuckInterceptor(context))
                .build();

        Retrofit.Builder builder = new Retrofit.Builder().client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ConstApp.BASE_URL);
        Retrofit retrofit = builder.build();
        userService = retrofit.create(UserService.class);
    }


    @Override
    public void onStop() {
        super.onStop();
    }


    @Override
    public void onItemClick(int position) {

    }

    interface DetailListCallback{
        void getData(ReportResponse data);
    }
}