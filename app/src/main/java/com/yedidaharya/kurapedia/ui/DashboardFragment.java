package com.yedidaharya.kurapedia.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.yedidaharya.kurapedia.MyAdapter;
import com.yedidaharya.kurapedia.R;

import java.util.ArrayList;
import java.util.List;


public class DashboardFragment extends Fragment {

    RecyclerView recyclerView;
    List<String> titles;
    List<Integer> images;







    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);


        recyclerView = view.findViewById(R.id.dataList);
        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Brazil");
        titles.add("Dada Merah");
        titles.add("Common Sniping");
        titles.add("Alligator Sniping");
        titles.add("Kuya Batok");
        titles.add("Daun");
        titles.add("Byuku");
        titles.add("Tuntong Sungai");
        titles.add("Matahari");
        titles.add("Leher Panjang");

        images.add(R.drawable.kura1);
        images.add(R.drawable.kura2);
        images.add(R.drawable.kura3);
        images.add(R.drawable.kura4);
        images.add(R.drawable.kura5);
        images.add(R.drawable.kura6);
        images.add(R.drawable.kura7);
        images.add(R.drawable.kura8);
        images.add(R.drawable.kura9);
        images.add(R.drawable.kura10);

        MyAdapter adapter = new MyAdapter(getActivity(), titles, images);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);





        return view;






    }










}