package com.cindodcindy.nitipadmin.retrofit;

import com.cindodcindy.nitipadmin.model.pojo_auth.pojo_regis.NitipRegisRespon;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface MethodFactory {
    @Headers({
            "Content-Type:application/json"
    })
    @POST("auth/registration")
    Call<NitipRegisRespon> adminRegistration(@Body JsonObject body);

}
