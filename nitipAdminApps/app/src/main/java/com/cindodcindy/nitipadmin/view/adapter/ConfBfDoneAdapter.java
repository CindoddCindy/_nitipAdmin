package com.cindodcindy.nitipadmin.view.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ConfBfDoneAdapter extends RecyclerView.Adapter<ConfBfDoneAdapter.BfDoneChild> {

    @NonNull
    @Override
    public BfDoneChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BfDoneChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BfDoneChild extends RecyclerView.ViewHolder{

        public BfDoneChild(@NonNull View itemView) {
            super(itemView);
        }
    }
}
