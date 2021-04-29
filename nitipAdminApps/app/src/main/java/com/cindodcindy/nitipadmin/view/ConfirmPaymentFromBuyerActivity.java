package com.cindodcindy.nitipadmin.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.cindodcindy.nitipadmin.R;

public class ConfirmPaymentFromBuyerActivity extends AppCompatActivity {

    //buyer tf
    private TextView textView_by_nama_pengirim, textView_by_tgal_kirim, textView_by_jumlah_kirim, textView_by_nama_bank;

    //admin get
    private TextView textView_ad_nama_pengirim, textView_ad_tgal_kirim, textView_ad_jumlah_kirim, textView_ad_nama_bank;

    //data jasa
    private TextView textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_jenis_barang, textView_kapasitas;


    //data buyer

    private TextView textView_by_asal, textView_by_tujuan, textView_by_pengirim, textView_by_penerima, textView_by_jenis_barang, textView_by_berat_brg;

    private TextView textView_btn_konfirm_seller_payment_to_buyer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_payment_from_buyer);

        //data jasa

        textView_asal=findViewById(R.id.id_tv_conf_in_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_conf_in_lugg_tujuan);
        textView_date_going=findViewById(R.id.tv_conf_in_lugg_tgal_going);
        textView_date_arive=findViewById(R.id.tv_conf_in_lugg_tgal_arr);
        textView_time_going=findViewById(R.id.tv_conf_in_lugg_time_going);
        textView_time_arrive=findViewById(R.id.tv_conf_in_lugg_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_conf_in_lugg_nama_seller);
        textView_harga=findViewById(R.id.tv_conf_in_lugg_price);
        textView_jenis_barang=findViewById(R.id.tv_conf_in_lugg_type);
        textView_kapasitas=findViewById(R.id.tv_conf_in_lugg_height);

        //data pembeli

        textView_by_asal=findViewById(R.id.tv_conf_in_by_asal);
        textView_by_tujuan=findViewById(R.id.tv_conf_in_by_tujuan);
        textView_by_pengirim=findViewById(R.id.tv_conf_in_det_by_pengirim);
        textView_by_penerima=findViewById(R.id.tv_conf_in_det_by_penerima);
        textView_by_jenis_barang=findViewById(R.id.tv_conf_in_by_jenis_barang);
        textView_by_berat_brg=findViewById(R.id.tv_conf_in_by_berat_barang);

        //pengirim
        textView_by_nama_pengirim=findViewById(R.id.tv_conf_in_ad_nama_terima);
        textView_by_tgal_kirim=findViewById(R.id.tv_conf_in_ad_tgal_terima);
        textView_by_jumlah_kirim=findViewById(R.id.tv_conf_in_ad_jumlah_uang_terima);
        textView_by_nama_bank=findViewById(R.id.tv_conf_in_ad_nama_bank_terima);

        //penerima
        textView_ad_nama_pengirim=findViewById(R.id.tv_conf_in_by_tf_nama_akun);
        textView_ad_tgal_kirim=findViewById(R.id.tv_conf_in_by_tf_tgal_pay_jasa);
        textView_ad_jumlah_kirim=findViewById(R.id.tv_conf_in_by_tf_jumlah_uang);
        textView_ad_nama_bank=findViewById(R.id.tv_conf_in_by_tf_nama_bank_kirim);

    }
}