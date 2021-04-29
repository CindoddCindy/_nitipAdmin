package com.cindodcindy.nitipadmin.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitipadmin.R;


public class AdminPaymentAdapter extends RecyclerView.Adapter<AdminPaymentAdapter.AdminPaymentChild> {

    @NonNull
    @Override
    public AdminPaymentChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdminPaymentChild holder, int position) {

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
