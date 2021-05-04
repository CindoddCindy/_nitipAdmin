package com.cindodcindy.nitipadmin.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitipadmin.R;
import com.cindodcindy.nitipadmin.model.pojo_money.pojo_get_money.Content;
import com.cindodcindy.nitipadmin.view.SellerDoneDetailActivity;

import java.util.List;


public class AdminPaymentAdapter extends RecyclerView.Adapter<AdminPaymentAdapter.AdminPaymentChild> {

    public List<com.cindodcindy.nitipadmin.model.pojo_money.pojo_get_money.Content> contentList;
    public Context context;

    public  AdminPaymentAdapter(List<Content> contentList, Context context){
        this.contentList=contentList;
        this.context=context;

    }

    @NonNull
    @Override
    public AdminPaymentChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_pay_to_seller_item, parent, false);
        AdminPaymentChild mViewHolder = new AdminPaymentChild(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdminPaymentChild holder, int position) {

        final Content content= contentList.get(position);
        holder.textView_nama_penerima.setText(content.getAnPenerima());
        holder.textView_jumlah_uang.setText(content.getJumlahUang());
        holder.textView_nama_bank.setText(content.getKeBank());
        holder.textView_tanggal_dikirim.setText(content.getTanggalTransfer());

        holder.cardView_admin_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putLong("id_seller", content.getIdSeller());
                bundle.putString("asal",content.getAsal());
                bundle.putString("tujuan",content.getTujuan());
                bundle.putString("tglgo",content.getTanggalBerangkat());
                bundle.putString("tglarr",content.getTanggalTiba());
                bundle.putString("jamgo", content.getJamBerangkat());
                bundle.putString("jamarr",content.getJamTiba());
                bundle.putString("namapenjual",content.getNamaPenjual());
                bundle.putString("kapasitas",content.getKapasitas());
                bundle.putString("jenisbarang",content.getJenisBarang());
                bundle.putString("harga", content.getHargaBagasi());

                bundle.putString("asalBr",content.getAlamatPembeli());
                bundle.putString("tujuanBr",content.getAlamatPenerima());
                bundle.putString("pengirim",content.getNamaPembeli());
                bundle.putString("penerima",content.getNamaPenerima());
                bundle.putString("jenisBr", content.getJenisBarangKirim());
                bundle.putString("beratBr",content.getKapasitasBarang());

                bundle.putString("namaPenerimaUang",content.getAnPenerima());
                bundle.putString("jumlahUang",content.getJumlahUang());
                bundle.putString("bankTf",content.getKeBank());
                bundle.putString("tanggalTf",content.getTanggalTransfer());


                bundle.putString("tanggalBarangTiba",content.getTglBrgArr());
                bundle.putString("namaPenerimaBarang",content.getAnBrgArr());
                bundle.putString("lokasiBarangDiterima",content.getLocBrgArr());

                Intent intent = new Intent(context, SellerDoneDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AdminPaymentChild extends RecyclerView.ViewHolder{
        private TextView textView_nama_penerima, textView_tanggal_dikirim, textView_jumlah_uang, textView_nama_bank;

        private CardView cardView_admin_payment;

        public AdminPaymentChild(@NonNull View itemView) {
            super(itemView);
            textView_nama_penerima=itemView.findViewById(R.id.tv_add_pay_nama_penerima);
            textView_jumlah_uang=itemView.findViewById(R.id.tv_add_pay_jumlah_uang_tf_to_sell);
            textView_nama_bank=itemView.findViewById(R.id.tv_add_pay_nama_bank_seller);
            textView_tanggal_dikirim=itemView.findViewById(R.id.tv_add_pay_tgal_di_tf);

            cardView_admin_payment=itemView.findViewById(R.id.cv_admin_pay);


        }
    }
}
