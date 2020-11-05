package com.pigllet.clonecowater.ui.list_report;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pigllet.clonecowater.MainActivity;
import com.pigllet.clonecowater.R;
import com.pigllet.clonecowater.UserService;
import com.pigllet.clonecowater.constant.ConstApp;
import com.pigllet.clonecowater.constant.ShareStoreUtils;
import com.pigllet.clonecowater.ui.report.OnItemClickListenner;
import com.pigllet.clonecowater.ui.report.ReportAdapter;
import com.pigllet.clonecowater.ultis.login.ResultLogin;
import com.pigllet.clonecowater.ultis.report.ReportResponse;
import com.readystatesoftware.chuck.ChuckInterceptor;

import org.jetbrains.annotations.NotNull;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListReportFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListReportFragment extends Fragment implements OnItemClickListenner {
    private View view;
    private RecyclerView recyclerView;
    private ListReportAdapter listReportAdapter;
    private List<ReportResponse.Data.ReportActivity.RealTime> listRealtime;
    private ReportResponse.Data.ReportActivity mReportActivity;
    private Context context;
    private UserService userService;
    private Button btnAddReport;
    private TextView txtNumber;
    private int count;

    public ListReportFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ListReportFragment newInstance() {
        ListReportFragment fragment = new ListReportFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                Objects.requireNonNull(getActivity()).getSupportFragmentManager().popBackStack();
            }
        };
        new MainActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_list_report, container, false);
        iniViews();
        iniConnection();
        loadData();
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    private void iniConnection() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new ChuckInterceptor(context))
                .build();
        Retrofit.Builder builder = new Retrofit.Builder().client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ConstApp.BASE_URL);
        Retrofit retrofit = builder.build();
        userService = retrofit.create(UserService.class);
    }

    /*private void receiveData(){
        listRealtime.add(getArguments().getParcelable(ConstApp.KEY_LIST_REORT_MODEL));
    }*/

    private void loadData() {
        assert getArguments() != null;
        final int reportId = getArguments().getInt(ConstApp.KEY_LIST_REPORT);
        Log.d("REPORTID", String.valueOf(reportId));
        int id = getArguments().getInt(ConstApp.KEY_LIST_REORT_ID);
        Log.d("ID", String.valueOf(id));

        if (getArguments() != null) {
            ResultLogin resultLogin = ShareStoreUtils.getUser(requireActivity());
            Log.d("Result", String.valueOf(resultLogin));
            if (resultLogin != null) {
                String token = resultLogin.getToken();
                Log.d("Token", token);
                Call<ReportResponse> call = userService.getListActivities(id, resultLogin.getProfile().getProject().getId(), token, "vn", 1);
                call.enqueue(new Callback<ReportResponse>() {
                    @Override
                    public void onResponse(@NotNull Call<ReportResponse> call, @NotNull Response<ReportResponse> response) {
                        if (response.isSuccessful() && response.body().getData().getReport_activity() != null) {
                            for (ReportResponse.Data.ReportActivity mReportActivity : response.body().getData().getReport_activity()) {
                                if (reportId == mReportActivity.getProject_activity_id()) {
                                    for (int i = 0; i < mReportActivity.getReal_time().size(); i++) {
                                        listRealtime.add(mReportActivity.getReal_time().get(i));
                                        count += 1;
                                    }
                                    Log.d("COUNT", String.valueOf(count));
                                    txtNumber.setText(String.valueOf(count));

                                    //mReportActivity.getReal_time().add(listRealtime);
                                }
                                //listRealtime.add(mRealtime);
                            }
                            /*count = listRealtime.size();*/
                            listReportAdapter.updateData(listRealtime);
                        } else {
                            Toast.makeText(getContext(), "Fail", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(@NotNull Call<ReportResponse> call, @NotNull Throwable t) {
                        int a = 1;
                    }
                });
            }
        }
    }


    private void iniViews() {
        listRealtime = new ArrayList<>();
        btnAddReport = view.findViewById(R.id.btnAddReport);
        txtNumber = view.findViewById(R.id.txtNumber);

        recyclerView = view.findViewById(R.id.recyclerView);
        listReportAdapter = new ListReportAdapter(getContext(), this);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(requireActivity(), DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(getActivity().getDrawable(R.drawable.line_divider));
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setAdapter(listReportAdapter);
    }


    @Override
    public void onItemClick(int position) {

    }
}