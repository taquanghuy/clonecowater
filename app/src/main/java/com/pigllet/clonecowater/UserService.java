package com.pigllet.clonecowater;

import com.pigllet.clonecowater.ultis.report.ReportResponse;
import com.pigllet.clonecowater.ultis.home.Item;
import com.pigllet.clonecowater.ultis.login.ResultLogin;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserService {

    @POST("users/login")
    Call<ResultLogin> login(@Query("username") String username,
                            @Query("password") String password);
    @GET("reports/list")
    Call<Item> getReport(@Query("project_id") int project_id,
                         @Query("sort") String sort,
                         @Query("sort_2") String sort_2,
                         @Query("token") String token,
                         @Query("lang") String lang);

    @GET("reports/detail")
    Call<ReportResponse> getListActivities(@Query("id") int id,
                                           @Query("project_id") int project_id,
                                           @Query("token") String token,
                                           @Query("lang") String lang,
                                           @Query("mobile") int isMobile);

}
