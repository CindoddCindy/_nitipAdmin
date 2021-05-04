package com.cindodcindy.nitipadmin.retrofit;

import com.cindodcindy.nitipadmin.model.pojo_auth.pojo_login.NitipLoginRespon;
import com.cindodcindy.nitipadmin.model.pojo_auth.pojo_regis.NitipRegisRespon;
import com.cindodcindy.nitipadmin.model.pojo_buyer_payment.pojo_get_payment.NitipGetPaymentRespon;
import com.cindodcindy.nitipadmin.model.pojo_buyer_payment.pojo_post_payment.NitipPostPaymentRespon;
import com.cindodcindy.nitipadmin.model.pojo_done.pojo_get_done.NitipGetDoneRespon;
import com.cindodcindy.nitipadmin.model.pojo_money.pojo_get_money.NitipGetMoneyRespon;
import com.cindodcindy.nitipadmin.model.pojo_money.pojo_post_money.NitipPostMoneyRespon;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MethodFactory {
    @Headers({
            "Content-Type:application/json"
    })
    @POST("auth/registration")
    Call<NitipRegisRespon> adminRegistration(@Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("auth/login")
    Call<NitipLoginRespon> buyerLogin(@Body JsonObject body);


    @Headers({
            "Content-Type:application/json"
    })
    @GET("payment/users/{userId}/payments")
    Call<NitipGetPaymentRespon> AdminGetPaymentListFromBuyer(@Path("userId") Long user_id);

    @Headers({
            "Content-Type:application/json"
    })
    @GET("payment/users/{userId}/payments")
    Call<NitipGetPaymentRespon> AdminGetPaymentListFromOwn(@Path("userId") Long user_id);


    @Headers({
            "Content-Type:application/json"
    })
    @POST("payment/users/{userId}/payments")
    Call<NitipPostPaymentRespon> sendPaymentToSeller(@Path("userId") Long user_id, @Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("payment/users/{userId}/payments")
    Call<NitipPostPaymentRespon> sendPaymentToOwnAdmin(@Path("userId") Long user_id, @Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("money/users/{userId}/moneys")
    Call<NitipPostMoneyRespon> sendMoneyToOwnAdmin(@Path("userId") Long user_id, @Body JsonObject body);

    @Headers({
            "Content-Type:application/json"
    })
    @POST("money/users/{userId}/moneys")
    Call<NitipPostMoneyRespon> sendMoneyToSeller(@Path("userId") Long user_id, @Body JsonObject body);



    @Headers({
            "Content-Type:application/json"
    })
    @GET("payment/users/{userId}/payments")
    Call<NitipGetPaymentRespon> getBeforeDoneToSeller(@Path("userId") Long user_id);

    @Headers({
            "Content-Type:application/json"
    })
    @GET("done/users/{userId}/dones")
    Call<NitipGetDoneRespon> getDoneFromSeller(@Path("userId") Long user_id);

    @Headers({
            "Content-Type:application/json"
    })
    @GET("money/users/{userId}/moneys")
    Call<NitipGetMoneyRespon> getPaymentToSeller(@Path("userId") Long user_id);





}
