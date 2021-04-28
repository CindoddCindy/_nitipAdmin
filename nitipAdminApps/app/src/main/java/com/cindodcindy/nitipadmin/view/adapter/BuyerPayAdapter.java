package com.cindodcindy.nitipadmin.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitipadmin.R;

public class BuyerPayAdapter extends RecyclerView.Adapter<BuyerPayAdapter.BuyerPayChild> {

    @NonNull
    @Override
    public BuyerPayChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BuyerPayChild holder, int position) {

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
