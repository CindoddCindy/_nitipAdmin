package com.cindodcindy.nitipadmin.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.cindodcindy.nitipadmin.R;

public class BuyerPaymentDetailActivity extends AppCompatActivity {

    //buyer tf
    private TextView textView_by_tf_nama_pengirim, textView_by_tf_tgal_kirim, textView_by_tf_jumlah_kirim, textView_by_tf_nama_bank;

    //admin get
    private TextView textView_ad_nama_penerima, textView_ad_no_rek, textView_ad_jumlah_kirim, textView_ad_nama_bank, textView_ad_waktu_kirim;

    private  TextView textView_phone_penerima, textView_phone_pengirim;
    //data jasa
    private TextView textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_jenis_barang, textView_kapasitas;


    //data buyer

    private TextView textView_by_asal, textView_by_tujuan, textView_by_pengirim, textView_by_penerima, textView_by_jenis_barang, textView_by_berat_brg;

    private TextView textView_btn_conf_pay_bf_don;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_payment_detail);

        //data jasa

        textView_asal=findViewById(R.id.id_tv_pay_det_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_pay_det_lugg_tujuan);
        textView_date_going=findViewById(R.id.tv_pay_det_lugg_tgal_going);
        textView_date_arive=findViewById(R.id.tv_pay_det_lugg_tgal_arr);
        textView_time_going=findViewById(R.id.tv_pay_det_lugg_time_going);
        textView_time_arrive=findViewById(R.id.tv_pay_det_lugg_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_pay_det_lugg_nama_seller);
        textView_harga=findViewById(R.id.tv_pay_det_lugg_price);
        textView_jenis_barang=findViewById(R.id.tv_pay_det_by_jenis_barang);
        textView_kapasitas=findViewById(R.id.tv_pay_det_lugg_height);

        //data pembeli

        textView_by_asal=findViewById(R.id.tv_pay_det_by_asal);
        textView_by_tujuan=findViewById(R.id.tv_pay_det_by_tujuan);
        textView_by_pengirim=findViewById(R.id.tv_pay_det_det_by_pengirim);
        textView_by_penerima=findViewById(R.id.tv_pay_det_det_by_penerima);
        textView_by_jenis_barang=findViewById(R.id.tv_pay_det_by_jenis_barang);
        textView_by_berat_brg=findViewById(R.id.tv_pay_det_by_berat_barang);

        //pengirim
        textView_by_tf_nama_pengirim=findViewById(R.id.tv_pay_det_by_tf_nama_akun);
        textView_by_tf_tgal_kirim=findViewById(R.id.tv_pay_det_by_tf_tgal_pay_jasa);
        textView_by_tf_jumlah_kirim=findViewById(R.id.tv_pay_det_by_tf_jumlah_uang);
        textView_by_tf_nama_bank=findViewById(R.id.tv_pay_det_by_tf_nama_bank_kirim);

        //penerima
        textView_ad_nama_penerima=findViewById(R.id.tv_pay_det_ad_nama_terima);
        textView_ad_no_rek=findViewById(R.id.tv_pay_det_ad_no_rek);
        textView_ad_jumlah_kirim=findViewById(R.id.tv_pay_det_ad_jumlah_uang_terima);
        textView_ad_nama_bank=findViewById(R.id.tv_pay_det_ad_nama_bank_terima);
        textView_ad_waktu_kirim=findViewById(R.id.tv_pay_det_ad_wktu_tf);

        textView_phone_penerima=findViewById(R.id.tv_by_pay_det_phone_penerima_brg);
        textView_phone_pengirim=findViewById(R.id.tv_by_pay_det_phone_pengirim);

        //btn
        textView_btn_conf_pay_bf_don=findViewById(R.id.tv_btn_confirm_payment_to_by);



    }

    public void getDataDetailBuyer(){

        if(getIntent().getExtras()!=null) {
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();

            // spHandle.setSpIdConfirmOrderEdit(SpHandle.SP_ID_CONFIRM_ORDER_EDIT, bundle.getLong("id_customer"));
            //spHandle.setSpIdConfirmOrder(SpHandle.SP_ID_CONFIRM_ORDER,bundle.getLong("id_confirm"));
            textView_asal.setText(bundle.getString("asal"));
            textView_tujuan.setText(bundle.getString("tujuan"));
            textView_date_going.setText(bundle.getString("tglgo"));
            textView_date_arive.setText(bundle.getString("tglarr"));
            textView_time_going.setText(bundle.getString("jamgo"));
            textView_time_arrive.setText(bundle.getString("jamarr"));
            textView_nama_penjual.setText(bundle.getString("namapenjual"));
            textView_harga.setText(bundle.getString("harga"));
            textView_kapasitas.setText(bundle.getString("kapasitas"));
            textView_jenis_barang.setText(bundle.getString("jenisbarang"));

            textView_by_asal.setText(bundle.getString("asalBr"));
            textView_by_tujuan.setText(bundle.getString("tujuanBr"));
            textView_by_pengirim.setText(bundle.getString("pengirim"));
            textView_by_penerima.setText(bundle.getString("penerima"));
            textView_by_jenis_barang.setText(bundle.getString("jenisBr"));
            textView_by_berat_brg.setText(bundle.getString("beratBr"));

            textView_by_tf_nama_pengirim.setText(bundle.getString("namaPengirimUang"));
            textView_by_tf_tgal_kirim.setText(bundle.getString("TanggalUangDikirim"));
            textView_by_tf_jumlah_kirim.setText(bundle.getString("JumlahUangDikirim"));
            textView_by_tf_nama_bank.setText(bundle.getString("BankPengirim"));

            textView_ad_nama_penerima.setText(bundle.getString("namaPenerimaUang"));
            textView_ad_no_rek.setText(bundle.getString("noRekPenerima"));
            textView_ad_jumlah_kirim.setText(bundle.getString("jumlahUang"));
            textView_ad_nama_bank.setText(bundle.getString("bankPenerima"));
            textView_ad_waktu_kirim.setText(bundle.getString("waktuBayar"));
            textView_phone_penerima.setText(bundle.getString("phonePenerima"));
            textView_phone_pengirim.setText(bundle.getString("phonePengirim"));








        }

    }
}