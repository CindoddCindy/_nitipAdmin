package com.cindodcindy.nitipadmin.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.cindodcindy.nitipadmin.R;

public class SellerDoneDetailActivity extends AppCompatActivity {

    //buyer tf
    private TextView textView_by_nama_pengirim, textView_by_tgal_kirim, textView_by_jumlah_kirim, textView_by_nama_bank;

    //admin get
    private TextView textView_ad_nama_pengirim, textView_ad_no_rek_seller, textView_ad_jumlah_kirim, textView_ad_nama_bank;

    //data jasa
    private TextView textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_jenis_barang, textView_kapasitas;


    //data buyer

    private TextView textView_by_asal, textView_by_tujuan, textView_by_pengirim, textView_by_penerima, textView_by_jenis_barang, textView_by_berat_brg;

    //data barang di terima
    private TextView textView_nama_penerima_barang_arr, textView_tanggal_terima_barang_arr,
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
        textView_ad_no_rek_seller=findViewById(R.id.tv_sell_don_ad_no_rek);
        textView_ad_jumlah_kirim=findViewById(R.id.tv_sell_don_ad_jumlah_uang_terima);
        textView_ad_nama_bank=findViewById(R.id.tv_sell_don_ad_nama_bank_terima);

        textView_nama_penerima_barang_arr=findViewById(R.id.tv_sell_don_nama_penerima_brg);
        textView_tanggal_terima_barang_arr=findViewById(R.id.tv_sell_don_tagl_diterima_brg);
        textView_lokasi_terima_barang_arr=findViewById(R.id.tv_sell_don_lokasi_diterima_brg);

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

            textView_nama_penerima_barang_arr.setText(bundle.getString("namaPenerimaBarang"));
            textView_tanggal_terima_barang_arr.setText(bundle.getString("tanggalBarangTiba"));
            textView_lokasi_terima_barang_arr.setText(bundle.getString("lokasiBarangDiterima"));


            //pengirim
            textView_by_nama_pengirim.setText(bundle.getString("akunBayar"));
            textView_by_tgal_kirim.setText(bundle.getString("tanggalBayar"));
            textView_by_jumlah_kirim.setText(bundle.getString("hargaBayar"));
            textView_by_nama_bank.setText(bundle.getString("bankBayar"));

            //penerima
            textView_ad_nama_pengirim.setText(bundle.getString("akunTerima"));
            textView_ad_no_rek_seller.setText(bundle.getString("noRekTerima"));
            textView_ad_jumlah_kirim.setText(bundle.getString("jumlahTerima"));
            textView_ad_nama_bank.setText(bundle.getString("bankTerima"));






        }
    }

    public void sendToAdminInputPay(){

        Bundle bundle = new Bundle();
      //  bundle.putLong("id_seller", textView_asal.getText().toString());
        bundle.putString("asal",textView_asal.getText().toString());
        bundle.putString("tujuan",textView_tujuan.getText().toString());
        bundle.putString("tglgo",textView_date_going.getText().toString());
        bundle.putString("tglarr",textView_date_arive.getText().toString());
        bundle.putString("jamgo", textView_time_going.getText().toString());
        bundle.putString("jamarr",textView_time_arrive.getText().toString());
        bundle.putString("namapenjual",textView_nama_penjual.getText().toString());
        bundle.putString("kapasitas",textView_kapasitas.getText().toString());
        bundle.putString("jenisbarang",textView_jenis_barang.getText().toString());
        bundle.putString("harga",textView_harga.getText().toString() );

        bundle.putString("asalBr",textView_by_asal.getText().toString());
        bundle.putString("tujuanBr",textView_by_tujuan.getText().toString());
        bundle.putString("pengirim",textView_by_pengirim.getText().toString());
        bundle.putString("penerima",textView_by_penerima.getText().toString());
        bundle.putString("jenisBr", textView_by_jenis_barang.getText().toString());
        bundle.putString("beratBr",textView_by_berat_brg.getText().toString());


        bundle.putString("akunBayar",textView_by_nama_pengirim.getText().toString());
        bundle.putString("tanggalBayar",textView_by_tgal_kirim.getText().toString());
        bundle.putString("bankBayar",textView_by_nama_bank.getText().toString());
        bundle.putString("hargaBayar",textView_by_jumlah_kirim.getText().toString());

        bundle.putString("akunTerima", textView_ad_nama_pengirim.getText().toString());
        bundle.putString("noRekTerima",textView_ad_no_rek_seller.getText().toString());
        bundle.putString("jumlahTerima", textView_ad_jumlah_kirim.getText().toString());
        bundle.putString("bankTerima",textView_ad_nama_bank.getText().toString());


        bundle.putString("tanggalBarangTiba",textView_tanggal_terima_barang_arr.getText().toString());
        bundle.putString("namaPenerimaBarang",textView_nama_penerima_barang_arr.getText().toString());
        bundle.putString("lokasiBarangDiterima",textView_lokasi_terima_barang_arr.getText().toString());

        Intent intent = new Intent(SellerDoneDetailActivity.this, InputPaymentActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}