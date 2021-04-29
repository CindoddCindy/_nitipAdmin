package com.cindodcindy.nitipadmin.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitipadmin.R;

public class SellerDoneAdapter extends RecyclerView.Adapter<SellerDoneAdapter.SellerDoneChild> {

    @NonNull
    @Override
    public SellerDoneChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SellerDoneChild holder, int position) {

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

            textView_nama_penerima=itemView.findViewById(R.id.tv_sell_don_nama_penerima);
            textView_tgal_diterimma=itemView.findViewById(R.id.tv_sell_don_tgal_diterima);
            cardView_seller_done=itemView.findViewById(R.id.cv_done_seller);
        }
    }
}
