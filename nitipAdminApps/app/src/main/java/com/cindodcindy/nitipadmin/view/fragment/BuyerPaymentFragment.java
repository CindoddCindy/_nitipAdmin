package com.cindodcindy.nitipadmin.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cindodcindy.nitipadmin.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BuyerPaymentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BuyerPaymentFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private RecyclerView recyclerView;
    private DoneAdapter doneAdapter;
    private List<com.cindodcindy.nitip.pojo.pojo_done.pojo_get_done.Content> contentList = new ArrayList<>();
    private RetrofitMethodHandle retrofitMethodHandle;
    private SpHandle spHandle;




    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BuyerPaymentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BuyerPaymentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BuyerPaymentFragment newInstance(String param1, String param2) {
        BuyerPaymentFragment fragment = new BuyerPaymentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buyer_payment, container, false);

        spHandle = new SpHandle(getContext());

        recyclerView = view.findViewById(R.id.rv_done);
        doneAdapter = new DoneAdapter( contentList, getContext());
        recyclerView.setAdapter(doneAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        sellerGetPayment();
    }

    public void sellerGetPayment(){

        Long id = spHandle.getIdSeller();

        retrofitMethodHandle = RetrofitHandle.getRetrofitLink().create(RetrofitMethodHandle.class);
        Call<NitipGetDoneRespon> doneResponCall= retrofitMethodHandle.sellerGetDone(id);
        doneResponCall.enqueue(new Callback<NitipGetDoneRespon>() {
            @Override
            public void onResponse(Call<NitipGetDoneRespon> call, Response<NitipGetDoneRespon> response) {

                if (response.isSuccessful()) {
                    List<Content> content = response.body().getContent();
                    doneAdapter = new DoneAdapter(content, getContext());
                    recyclerView.setAdapter(doneAdapter);
                    doneAdapter.notifyDataSetChanged();
                }
                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(getContext(), "404 not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(getContext(), "500 internal server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(getContext(), "401 unauthorized", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(getContext(), "unknown error", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }

            @Override
            public void onFailure(Call<NitipGetDoneRespon> call, Throwable t) {
                Toast.makeText(getContext(), "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}