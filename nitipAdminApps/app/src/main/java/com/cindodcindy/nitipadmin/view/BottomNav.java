package com.cindodcindy.nitipadmin.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.cindodcindy.nitipadmin.R;
import com.cindodcindy.nitipadmin.view.fragment.AdminConfirmBeforeDoneFragment;
import com.cindodcindy.nitipadmin.view.fragment.AdminSendPaymentFragment;
import com.cindodcindy.nitipadmin.view.fragment.BuyerPaymentFragment;
import com.cindodcindy.nitipadmin.view.fragment.SellerDoneFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new BuyerPaymentFragment());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.buyer_payment:
                        fragment = new BuyerPaymentFragment();
                        break;

                    case R.id.confirm_to_seller:
                        fragment = new AdminConfirmBeforeDoneFragment();
                        break;

                    case R.id.seller_done:
                        fragment = new SellerDoneFragment();
                        break;

                    case R.id.admin_payment:
                        fragment = new AdminSendPaymentFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }


    //Menampilkan halaman Fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}