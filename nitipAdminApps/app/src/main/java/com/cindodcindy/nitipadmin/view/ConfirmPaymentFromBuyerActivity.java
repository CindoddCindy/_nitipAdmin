package com.cindodcindy.nitipadmin.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.cindodcindy.nitipadmin.R;
import com.cindodcindy.nitipadmin.model.pojo_buyer_payment.pojo_post_payment.NitipPostPaymentRespon;
import com.cindodcindy.nitipadmin.retrofit.MethodFactory;
import com.cindodcindy.nitipadmin.retrofit.RetrofitHandle;
import com.cindodcindy.nitipadmin.shared_pref.SpHandle;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConfirmPaymentFromBuyerActivity extends AppCompatActivity {

    //buyer data dari buyer
    private TextView textView_by_akun_bank_nama, textView_by_tgal_kirim_tf, textView_by_jumlah_kirim, textView_by_nama_bank;

    //admin get
    private TextView textView_ad_nama_pengirim, textView_ad_no_rek, textView_ad_bank_name, textView_ad_jumlah_kirim, textView_ad_wktu_tf;

    //phone
    private TextView textView_phone_penerima;
    private TextView textView_phone_pengirim;

    //data jasa
    private TextView textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_jenis_barang, textView_kapasitas;


    //data buyer

    private TextView textView_by_asal, textView_by_tujuan, textView_by_pengirim, textView_by_penerima, textView_by_jenis_barang, textView_by_berat_brg;

    private SpHandle spHandle;

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

        spHandle=new SpHandle(ConfirmPaymentFromBuyerActivity.this);

        //data pembeli

        textView_by_asal=findViewById(R.id.tv_conf_in_by_asal);
        textView_by_tujuan=findViewById(R.id.tv_conf_in_by_tujuan);
        textView_by_pengirim=findViewById(R.id.tv_conf_in_det_by_pengirim);
        textView_by_penerima=findViewById(R.id.tv_conf_in_det_by_penerima);
        textView_by_jenis_barang=findViewById(R.id.tv_conf_in_by_jenis_barang);
        textView_by_berat_brg=findViewById(R.id.tv_conf_in_by_berat_barang);

        //pengirim
        textView_by_akun_bank_nama=findViewById(R.id.tv_ad_in_by_tf_nama_akun);
        textView_by_tgal_kirim_tf=findViewById(R.id.tv_conf_in_by_tf_tgal_pay_jasa);
        textView_by_jumlah_kirim=findViewById(R.id.tv_conf_in_by_tf_jumlah_uang);
        textView_by_nama_bank=findViewById(R.id.tv_conf_in_by_tf_nama_bank_kirim);

        //penerima
        textView_ad_nama_pengirim=findViewById(R.id.tv_conf_in_ad_nama_terima);
        textView_ad_no_rek=findViewById(R.id.tv_conf_in_ad_no_rek_penerima);
        textView_ad_jumlah_kirim=findViewById(R.id.tv_conf_in_ad_jumlah_uang_terima);
        textView_ad_bank_name=findViewById(R.id.tv_conf_in_ad_nama_bank_terima);
        textView_ad_wktu_tf=findViewById(R.id.tv_conf_in_ad_wktu_tf);

        //phone
        textView_phone_penerima=findViewById(R.id.tv_by_pay_det_phone_penerima_brg);
        textView_phone_pengirim=findViewById(R.id.tv_by_pay_det_phone_pengirim);

        textView_btn_konfirm_seller_payment_to_buyer=findViewById(R.id.tv_btn_confirm_input_payment_to_by);

    }

    public void getDataPaymentFromDetailBuyer(){

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

            //pengirim
            textView_by_akun_bank_nama.setText(bundle.getString("namaPengirimUang"));
            textView_by_tgal_kirim_tf.setText(bundle.getString("TanggalUangDikirim"));
            textView_by_jumlah_kirim.setText(bundle.getString("JumlahUangDikirim"));
            textView_by_nama_bank.setText(bundle.getString("BankPengirim"));

            //penerima
            textView_ad_nama_pengirim.setText(bundle.getString("namaPenerimaUang"));
            textView_ad_no_rek.setText(bundle.getString("noRekPenerima"));
            textView_ad_jumlah_kirim.setText(bundle.getString("bankPenerima"));
            textView_ad_bank_name.setText(bundle.getString("jumlahUang"));
            textView_ad_wktu_tf.setText(bundle.getString(""));


            textView_phone_penerima.setText(bundle.getString("phonePenerima"));
            textView_phone_pengirim.setText(bundle.getString("phonePengirim"));


        }

    }

    public void sendDataPaymentToSeller(){

        String asalBy = textView_by_asal.getText().toString();
        String tujuanBy = textView_by_tujuan.getText().toString();
        String pengirimBy = textView_by_pengirim.getText().toString();
        String penerimaBy = textView_by_penerima.getText().toString();
        String jenisBarangby = textView_by_jenis_barang.getText().toString();
        String beratbarangby = textView_by_berat_brg.getText().toString();

        String tfNamaPengirim=textView_by_akun_bank_nama.getText().toString();
        String tfBankPengirim=textView_by_nama_bank.getText().toString();
        String tfTanggalUangKirim=textView_by_tgal_kirim_tf.getText().toString();
        String tfJumlhaUangKirim=textView_by_jumlah_kirim.getText().toString();

        String tfNamaPenerima=textView_ad_nama_pengirim.getText().toString();
        String tfNorekPenerima=textView_ad_no_rek.getText().toString();
        String tfBankPenerima=textView_ad_bank_name.getText().toString();
        String tfJumlhaPenerima=textView_ad_jumlah_kirim.getText().toString();
        String tfWaktuBayarPenerima=textView_ad_wktu_tf.getText().toString();



        String tfPhonePhonePenerima=textView_phone_penerima.getText().toString();
        String tfPhonePengirim=textView_phone_pengirim.getText().toString();

        Long idSeller=spHandle.getIdSeller();
        Long idBuyer=spHandle.getIdBuyer();

        //data jasa
        String asalSl = textView_asal.getText().toString();
        String tujuanSl  = textView_tujuan.getText().toString();
        String tgalGoSl =  textView_date_going.getText().toString();
        String tgalArrSl =  textView_date_arive.getText().toString();
        String timeGoSl =  textView_time_going.getText().toString();
        String timeArrSl = textView_time_arrive.getText().toString();
        String namaPenjualSl  =  textView_nama_penjual.getText().toString();
        String hargaSl  =  textView_harga.getText().toString();
        String jenisBarangsl  = textView_jenis_barang.getText().toString();
        String kapasitasSl =  textView_kapasitas.getText().toString();




        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("namaPengirimUang", tfNamaPengirim);
        jsonObject.addProperty("bankPengirimUang",tfBankPengirim);
        jsonObject.addProperty("tanggalTransfer", tfTanggalUangKirim);
        jsonObject.addProperty("uangSejumlah", tfJumlhaUangKirim);
        jsonObject.addProperty("phonePenerimaBarang", tfPhonePhonePenerima);
        jsonObject.addProperty("phonePengirimBarang", tfPhonePengirim);

        jsonObject.addProperty("idBuyer", idBuyer);
        jsonObject.addProperty("idSeller",idSeller);

        jsonObject.addProperty("namaPenerimUang",tfNamaPenerima );
        jsonObject.addProperty("noRekPenerimaUang",tfNorekPenerima);
        jsonObject.addProperty("bankPenerimaUang", tfBankPenerima);
        jsonObject.addProperty("jumlahTfPenerimaUang",tfJumlhaPenerima );
        jsonObject.addProperty("waktuPenerimaUang", tfWaktuBayarPenerima);



        jsonObject.addProperty("namaPembeli",pengirimBy );
        jsonObject.addProperty("alamatPembeli",asalBy);
        jsonObject.addProperty("alamatPenerima",tujuanBy );
        jsonObject.addProperty("namaPenerima",penerimaBy );
        jsonObject.addProperty("jenisBarangKirim",jenisBarangby );
        jsonObject.addProperty("kapasitasBarang",beratbarangby );

        jsonObject.addProperty("namaPenjual",namaPenjualSl );
        jsonObject.addProperty("asal",asalSl );
        jsonObject.addProperty("tujuan",tujuanSl );
        jsonObject.addProperty("tanggalBerangkat",tgalGoSl );
        jsonObject.addProperty("jamBerangkat",timeGoSl );
        jsonObject.addProperty("tanggalTiba",tgalArrSl);
        jsonObject.addProperty("jamTiba", timeArrSl);
        jsonObject.addProperty("kapasitas",kapasitasSl);
        jsonObject.addProperty("jenisBarang", jenisBarangsl);
        jsonObject.addProperty("hargaBagasi", hargaSl);





        MethodFactory methodsFactory =  RetrofitHandle.getRetrofitLink().create(MethodFactory.class);
        Call<NitipPostPaymentRespon> postPaymentResponCall= methodsFactory.sendPaymentToSeller(idBuyer,jsonObject);
        postPaymentResponCall.enqueue(new Callback<NitipPostPaymentRespon>() {
            @Override
            public void onResponse(Call<NitipPostPaymentRespon> call, Response<NitipPostPaymentRespon> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(ConfirmPaymentFromBuyerActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(ConfirmPaymentFromBuyerActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(ConfirmPaymentFromBuyerActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(ConfirmPaymentFromBuyerActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipPostPaymentRespon> call, Throwable t) {
                Toast.makeText(ConfirmPaymentFromBuyerActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });






    }

    public void sendDataPaymentToAdmin(){

        String asalBy = textView_by_asal.getText().toString();
        String tujuanBy = textView_by_tujuan.getText().toString();
        String pengirimBy = textView_by_pengirim.getText().toString();
        String penerimaBy = textView_by_penerima.getText().toString();
        String jenisBarangby = textView_by_jenis_barang.getText().toString();
        String beratbarangby = textView_by_berat_brg.getText().toString();

        String tfNamaPengirim=textView_by_akun_bank_nama.getText().toString();
        String tfBankPengirim=textView_by_nama_bank.getText().toString();
        String tfTanggalUangKirim=textView_by_tgal_kirim_tf.getText().toString();
        String tfJumlhaUangKirim=textView_by_jumlah_kirim.getText().toString();

        String tfNamaPenerima=textView_ad_nama_pengirim.getText().toString();
        String tfNorekPenerima=textView_ad_no_rek.getText().toString();
        String tfBankPenerima=textView_ad_bank_name.getText().toString();
        String tfJumlhaPenerima=textView_ad_jumlah_kirim.getText().toString();
        String tfWaktuBayarPenerima=textView_ad_wktu_tf.getText().toString();



        String tfPhonePhonePenerima=textView_phone_penerima.getText().toString();
        String tfPhonePengirim=textView_phone_pengirim.getText().toString();

        Long idSeller=spHandle.getIdSeller();
        Long idBuyer=spHandle.getIdBuyer();

        //data jasa
        String asalSl = textView_asal.getText().toString();
        String tujuanSl  = textView_tujuan.getText().toString();
        String tgalGoSl =  textView_date_going.getText().toString();
        String tgalArrSl =  textView_date_arive.getText().toString();
        String timeGoSl =  textView_time_going.getText().toString();
        String timeArrSl = textView_time_arrive.getText().toString();
        String namaPenjualSl  =  textView_nama_penjual.getText().toString();
        String hargaSl  =  textView_harga.getText().toString();
        String jenisBarangsl  = textView_jenis_barang.getText().toString();
        String kapasitasSl =  textView_kapasitas.getText().toString();




        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("namaPengirimUang", tfNamaPengirim);
        jsonObject.addProperty("bankPengirimUang",tfBankPengirim);
        jsonObject.addProperty("tanggalTransfer", tfTanggalUangKirim);
        jsonObject.addProperty("uangSejumlah", tfJumlhaUangKirim);
        jsonObject.addProperty("phonePenerimaBarang", tfPhonePhonePenerima);
        jsonObject.addProperty("phonePengirimBarang", tfPhonePengirim);

        jsonObject.addProperty("idBuyer", idBuyer);
        jsonObject.addProperty("idSeller",idSeller);

        jsonObject.addProperty("namaPenerimUang",tfNamaPenerima );
        jsonObject.addProperty("noRekPenerimaUang",tfNorekPenerima);
        jsonObject.addProperty("bankPenerimaUang", tfBankPenerima);
        jsonObject.addProperty("jumlahTfPenerimaUang",tfJumlhaPenerima );
        jsonObject.addProperty("waktuPenerimaUang", tfWaktuBayarPenerima);



        jsonObject.addProperty("namaPembeli",pengirimBy );
        jsonObject.addProperty("alamatPembeli",asalBy);
        jsonObject.addProperty("alamatPenerima",tujuanBy );
        jsonObject.addProperty("namaPenerima",penerimaBy );
        jsonObject.addProperty("jenisBarangKirim",jenisBarangby );
        jsonObject.addProperty("kapasitasBarang",beratbarangby );

        jsonObject.addProperty("namaPenjual",namaPenjualSl );
        jsonObject.addProperty("asal",asalSl );
        jsonObject.addProperty("tujuan",tujuanSl );
        jsonObject.addProperty("tanggalBerangkat",tgalGoSl );
        jsonObject.addProperty("jamBerangkat",timeGoSl );
        jsonObject.addProperty("tanggalTiba",tgalArrSl);
        jsonObject.addProperty("jamTiba", timeArrSl);
        jsonObject.addProperty("kapasitas",kapasitasSl);
        jsonObject.addProperty("jenisBarang", jenisBarangsl);
        jsonObject.addProperty("hargaBagasi", hargaSl);

        MethodFactory methodsFactory =  RetrofitHandle.getRetrofitLink().create(MethodFactory.class);
        Call<NitipPostPaymentRespon> postPaymentResponCall= methodsFactory.sendPaymentToOwnAdmin(idBuyer,jsonObject);
        postPaymentResponCall.enqueue(new Callback<NitipPostPaymentRespon>() {
            @Override
            public void onResponse(Call<NitipPostPaymentRespon> call, Response<NitipPostPaymentRespon> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(ConfirmPaymentFromBuyerActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(ConfirmPaymentFromBuyerActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(ConfirmPaymentFromBuyerActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(ConfirmPaymentFromBuyerActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipPostPaymentRespon> call, Throwable t) {
                Toast.makeText(ConfirmPaymentFromBuyerActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });







    }
}