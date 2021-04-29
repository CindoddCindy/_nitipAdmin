package com.cindodcindy.nitipadmin.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cindodcindy.nitipadmin.R;
import com.cindodcindy.nitipadmin.model.pojo_auth.pojo_login.NitipLoginRespon;
import com.cindodcindy.nitipadmin.retrofit.MethodFactory;
import com.cindodcindy.nitipadmin.retrofit.RetrofitHandle;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText editText_nama, editText_password;
    private TextView textView_btn_login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText_nama=findViewById(R.id.et_login_name);
        editText_password=findViewById(R.id.et_login_password);

        textView_btn_login=findViewById(R.id.tv_login_btn);

        textView_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText_nama.getText().toString().isEmpty()&&editText_password.getText().toString().isEmpty()){
                    editText_nama.setError("nama belum diisi");
                    editText_password.setError("password belum diisi");


                }else {
                    // btnLogin();


                }


            }
        });
    }

    public void btnLogin(){

        String name = editText_nama.getText().toString();
        String password = editText_password.getText().toString();

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("name", name);
        jsonObject.addProperty("password", password);



        MethodFactory methodsFactory =  RetrofitHandle.getRetrofitLink().create(MethodFactory.class);
        Call<NitipLoginRespon> loginResponCall= methodsFactory.buyerLogin(jsonObject);
        loginResponCall.enqueue(new Callback<NitipLoginRespon>() {
            @Override
            public void onResponse(Call<NitipLoginRespon> call, Response<NitipLoginRespon> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(LoginActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(LoginActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(LoginActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(LoginActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipLoginRespon> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });




    }
}