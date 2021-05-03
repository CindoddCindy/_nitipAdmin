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
import com.cindodcindy.nitipadmin.model.pojo_buyer_payment.pojo_get_payment.Content;
import com.cindodcindy.nitipadmin.view.BuyerPaymentDetailActivity;

import java.util.List;

public class BuyerPayAdapter extends RecyclerView.Adapter<BuyerPayAdapter.BuyerPayChild> {

    public List<Content> contentList;
    public Context context;

    public  BuyerPayAdapter(List<Content> contentList, Context context){
        this.contentList=contentList;
        this.context=context;

    }

    @NonNull
    @Override
    public BuyerPayChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.buyer_payment_item, parent, false);
        BuyerPayChild mViewHolder = new BuyerPayChild(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BuyerPayChild holder, int position) {

        final Content content= contentList.get(position);
        holder.textView_nama_pengirim.setText(content.getNamaPengirimUang());
        holder.textView_tgal_kirim.setText(content.getTanggalTransfer());
        holder.textView_jumlah_kirim.setText(content.getUangSejumlah());
        holder.textView_nama_bank.setText(content.getBankPengirimUang());

        holder.cardView_buyer_payment_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putLong("id_buyer", content.getIdBuyer());
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

                bundle.putString("namaPengirimUang",content.getNamaPengirimUang());
                bundle.putString("TanggalUangDikirim",content.getTanggalTransfer());
                bundle.putString("JumlahUangDikirim",content.getUangSejumlah());
                bundle.putString("BankPengirim",content.getBankPengirimUang());

                bundle.putString("namaPenerimaUang",content.getNamaPengirimUang());
                bundle.putString("noRekPenerima",content.getTanggalTransfer());
                bundle.putString("bankPenerima",content.getUangSejumlah());
                bundle.putString("jumlahUang",content.getBankPengirimUang());

                bundle.putString("waktuBayar",content.getTanggalTransfer());
                bundle.putString("phonePenerima",content.getUangSejumlah());
                bundle.putString("PhonePengirim",content.getBankPengirimUang());




                Intent intent = new Intent(context, BuyerPaymentDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BuyerPayChild extends RecyclerView.ViewHolder{

        private TextView textView_nama_pengirim, textView_tgal_kirim, textView_jumlah_kirim, textView_nama_bank;
        private CardView cardView_buyer_payment_item;

        public BuyerPayChild(@NonNull View itemView) {
            super(itemView);
            textView_nama_pengirim=itemView.findViewById(R.id.tv_buyer_pay_rv_nama_pengirm);
            textView_tgal_kirim=itemView.findViewById(R.id.tv_buyer_pay_rv_tgal_dikirim);
            textView_jumlah_kirim=itemView.findViewById(R.id.tv_buyer_pay_rv_jumlah_kirim);
            textView_nama_bank=itemView.findViewById(R.id.tv_buyer_pay_rv_nama_bank_kirim);
            cardView_buyer_payment_item=itemView.findViewById(R.id.cv_buyer_payment);
        }
    }
}
