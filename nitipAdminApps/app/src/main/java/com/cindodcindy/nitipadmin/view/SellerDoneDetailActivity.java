package com.cindodcindy.nitipadmin.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.cindodcindy.nitipadmin.R;

public class SellerDoneDetailActivity extends AppCompatActivity {

    //buyer tf
    private TextView textView_by_nama_pengirim, textView_by_tgal_kirim, textView_by_jumlah_kirim, textView_by_nama_bank;

    //admin get
    private TextView textView_ad_nama_pengirim, textView_ad_tgal_kirim, textView_ad_jumlah_kirim, textView_ad_nama_bank;

    //data jasa
    private TextView textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_jenis_barang, textView_kapasitas;


    //data buyer

    private TextView textView_by_asal, textView_by_tujuan, textView_by_pengirim, textView_by_penerima, textView_by_jenis_barang, textView_by_berat_brg;

    //data barang di terima
    private TextView textView_nama_penerima_barang_ar, textView_tanggal_terima_barang_arr,
    textView_lokasi_terima_barang_arr;

    //btn
    private TextView textView_btn_bayar_seller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_done_detail);

        //data jasa

        textView_asal=findViewById(R.id.id_tv_sell_don_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_sell_don_lugg_tujuan);
        textView_date_going=findViewById(R.id.tv_sell_don_lugg_tgal_going);
        textView_date_arive=findViewById(R.id.tv_sell_don_lugg_tgal_arr);
        textView_time_going=findViewById(R.id.tv_sell_don_lugg_time_going);
        textView_time_arrive=findViewById(R.id.tv_sell_don_lugg_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_sell_don_lugg_nama_seller);
        textView_harga=findViewById(R.id.tv_sell_don_lugg_price);
        textView_jenis_barang=findViewById(R.id.tv_sell_don_lugg_type);
        textView_kapasitas=findViewById(R.id.tv_sell_don_lugg_height);

        //data pembeli

        textView_by_asal=findViewById(R.id.tv_sell_don_by_asal);
        textView_by_tujuan=findViewById(R.id.tv_sell_don_by_tujuan);
        textView_by_pengirim=findViewById(R.id.tv_sell_don_by_pengirim);
        textView_by_penerima=findViewById(R.id.tv_sell_don_by_penerima);
        textView_by_jenis_barang=findViewById(R.id.tv_sell_don_by_jenis_barang);
        textView_by_berat_brg=findViewById(R.id.tv_sell_don_by_berat_barang);

        //pengirim
        textView_by_nama_pengirim=findViewById(R.id.tv_sell_don_by_tf_nama_akun);
        textView_by_tgal_kirim=findViewById(R.id.tv_sell_don_by_tf_tgal_pay_jasa);
        textView_by_jumlah_kirim=findViewById(R.id.tv_sell_don_by_tf_jumlah_uang);
        textView_by_nama_bank=findViewById(R.id.tv_sell_don_by_tf_nama_bank_kirim);

        //penerima
        textView_ad_nama_pengirim=findViewById(R.id.tv_sell_don_ad_nama_terima);
        textView_ad_tgal_kirim=findViewById(R.id.tv_sell_don_ad_tgal_terima);
        textView_ad_jumlah_kirim=findViewById(R.id.tv_sell_don_ad_jumlah_uang_terima);
        textView_ad_nama_bank=findViewById(R.id.tv_sell_don_ad_nama_bank_terima);

        textView_btn_bayar_seller=findViewById(R.id.tv_sell_don_btn_bayar_seller);

    }


    public void getDataDetailDone(){
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

            textView_diterima_oleh.setText(bundle.getString("namaPenerimaBarang"));
            textView_tgal_diterima.setText(bundle.getString("tanggalBarangTiba"));
            textView_lokasi_get_brg.setText(bundle.getString("lokasiBarangDiterima"));




        }
    }
}