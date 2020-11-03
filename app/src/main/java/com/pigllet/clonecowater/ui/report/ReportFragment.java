package com.pigllet.clonecowater.ui.report;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.pigllet.clonecowater.MainActivity;
import com.pigllet.clonecowater.R;
import com.pigllet.clonecowater.UserService;
import com.pigllet.clonecowater.constant.ConstApp;
import com.pigllet.clonecowater.constant.ShareStoreUtils;
import com.pigllet.clonecowater.ui.list_report.ListReportFragment;
import com.pigllet.clonecowater.ultis.home.Datum;
import com.pigllet.clonecowater.ultis.login.ResultLogin;
import com.pigllet.clonecowater.ultis.report.ReportResponse;
import com.readystatesoftware.chuck.ChuckInterceptor;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
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
    private ListReportFragment listReportFragment;

    public ReportFragment() {
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        };
        new MainActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }


    public static ReportFragment newInstance() {
        ReportFragment fragment = new ReportFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }


    private void iniViews() {
        rvDetailList = view.findViewById(R.id.rvDetailList);
        reportAdapter = new ReportAdapter(getContext(), this);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(getActivity().getDrawable(R.drawable.line_divider));
        rvDetailList.addItemDecoration(itemDecoration);
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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void loadData() {
        int reportId;
        if (getArguments() != null) {
            reportId = getArguments().getInt(ConstApp.KEY_REPORT);
            Log.d("RP", String.valueOf(reportId));
            ResultLogin resultLogin = ShareStoreUtils.getUser(getContext());
            Log.d("Result_1", String.valueOf(resultLogin));
            if (resultLogin != null) {
                String token = resultLogin.getToken();
                Call<ReportResponse> call = userService.getListActivities(reportId, 27, token, "vn", 1);
                call.enqueue(new Callback<ReportResponse>() {
                    @Override
                    public void onResponse(@NotNull Call<ReportResponse> call, @NotNull Response<ReportResponse> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            for (ReportResponse.Data.ReportActivity reportActivity : response.body().getData().getReport_activity()) {
                                if (reportActivity.getProject_activity() != null) {
                                    projectActivityList.add(reportActivity);
                                }
                            }
                            reportAdapter.updateData(projectActivityList);
                        } else {
                            Toast.makeText(getContext(), "Fail", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ReportResponse> call, Throwable t) {
                        int a = 1;
                    }
                });
            } else Log.d("Checkk", "Failll");
        }


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
        listReportFragment = ListReportFragment.newInstance();
        FragmentManager fragmentManager = getFragmentManager();
        int homeId = projectActivityList.get(position).getProject_activity_id();
        Bundle bundle = new Bundle();
        bundle.putInt(ConstApp.KEY_LIST_REPORT, homeId);
        /*int detailId = projectActivityList.get(position).getProject_activity().getId();
        bundle.putInt(ConstApp.KEY_LIST_REORT_ID, detailId);*/
        listReportFragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(R.id.nav_fragment, listReportFragment).addToBackStack(null).commit();
    }

}