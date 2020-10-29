package com.pigllet.clonecowater.ultis.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pigllet.clonecowater.ultis.Profile;

public class ResultLogin {
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("profile")
    @Expose
    private Profile profile;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
