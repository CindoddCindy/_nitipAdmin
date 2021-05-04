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
import com.cindodcindy.nitipadmin.model.pojo_buyer_payment.pojo_get_payment.Content;
import com.cindodcindy.nitipadmin.model.pojo_buyer_payment.pojo_get_payment.NitipGetPaymentRespon;
import com.cindodcindy.nitipadmin.retrofit.MethodFactory;
import com.cindodcindy.nitipadmin.retrofit.RetrofitHandle;
import com.cindodcindy.nitipadmin.shared_pref.SpHandle;
import com.cindodcindy.nitipadmin.view.adapter.ConfBfDoneAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AdminConfirmBeforeDoneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdminConfirmBeforeDoneFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private RecyclerView recyclerView;
    private ConfBfDoneAdapter confBfDoneAdapter;
    private List<Content> contentList = new ArrayList<>();
    private MethodFactory methodFactory;
    private SpHandle spHandle;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AdminConfirmBeforeDoneFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AdminConfirmBeforeDoneFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AdminConfirmBeforeDoneFragment newInstance(String param1, String param2) {
        AdminConfirmBeforeDoneFragment fragment = new AdminConfirmBeforeDoneFragment();
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
         View view = inflater.inflate(R.layout.fragment_admin_confirm_before_done, container, false);

        spHandle = new SpHandle(getContext());

        recyclerView = view.findViewById(R.id.rv_conf_bf_don);
        confBfDoneAdapter = new ConfBfDoneAdapter( contentList, getContext());
        recyclerView.setAdapter(confBfDoneAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        sellerGetPayment();

        return view;
    }

    public void sellerGetPayment(){

        Long id = spHandle.getIdSeller();

        methodFactory = RetrofitHandle.getRetrofitLink().create(MethodFactory.class);
        Call<NitipGetPaymentRespon> doneResponCall= methodFactory.getBeforeDoneToSeller(id);
        doneResponCall.enqueue(new Callback<NitipGetPaymentRespon>() {
            @Override
            public void onResponse(Call<NitipGetPaymentRespon> call, Response<NitipGetPaymentRespon> response) {

                if (response.isSuccessful()) {
                    List<Content> content = response.body().getContent();
                    confBfDoneAdapter = new ConfBfDoneAdapter(content, getContext());
                    recyclerView.setAdapter(confBfDoneAdapter);
                    confBfDoneAdapter.notifyDataSetChanged();
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
            public void onFailure(Call<NitipGetPaymentRespon> call, Throwable t) {
                Toast.makeText(getContext(), "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}