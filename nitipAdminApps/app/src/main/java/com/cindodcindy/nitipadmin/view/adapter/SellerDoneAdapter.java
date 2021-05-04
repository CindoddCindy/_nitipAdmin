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
import com.cindodcindy.nitipadmin.model.pojo_done.pojo_get_done.Content;
import com.cindodcindy.nitipadmin.view.SellerDoneDetailActivity;

import java.util.List;

public class SellerDoneAdapter extends RecyclerView.Adapter<SellerDoneAdapter.SellerDoneChild> {

    public List<Content> contentList;
    public Context context;

    public  SellerDoneAdapter(List<Content> contentList, Context context){
        this.contentList=contentList;
        this.context=context;

    }

    @NonNull
    @Override
    public SellerDoneChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.done_item_layout, parent, false);
        SellerDoneChild mViewHolder = new SellerDoneChild(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SellerDoneChild holder, int position) {
        final Content content= contentList.get(position);
        holder.textView_nama_penerima.setText(content.getDiterimaOleh());
        holder.textView_tgal_diterimma.setText(content.getTanggalBarangTiba());

        holder.cardView_seller_done.setOnClickListener(new View.OnClickListener() {
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


                bundle.putString("akunBayar",content.getAlamatPembeli());
                bundle.putString("tanggalBayar",content.getAlamatPenerima());
                bundle.putString("bankBayar",content.getNamaPembeli());
                bundle.putString("hargaBayar",content.getNamaPenerima());

                bundle.putString("akunTerima", content.getJenisBarangKirim());
                bundle.putString("noRekTerima",content.getKapasitasBarang());
                bundle.putString("jumlahTerima", content.getJenisBarangKirim());
                bundle.putString("bankTerima",content.getKapasitasBarang());


                bundle.putString("tanggalBarangTiba",content.getTanggalBarangTiba());
                bundle.putString("namaPenerimaBarang",content.getDiterimaOleh());
                bundle.putString("lokasiBarangDiterima",content.getLokasiBarangDiterima());

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

    public  class SellerDoneChild extends RecyclerView.ViewHolder{

        private TextView textView_nama_penerima, textView_tgal_diterimma;
        private CardView cardView_seller_done;

        public SellerDoneChild(@NonNull View itemView) {
            super(itemView);

            textView_nama_penerima=itemView.findViewById(R.id.tv_sell_don_item_nama_penerima);
            textView_tgal_diterimma=itemView.findViewById(R.id.tv_sell_don_item_tgal_diterima);
            cardView_seller_done=itemView.findViewById(R.id.cv_done_seller);
        }
    }
}
