package com.example.android11lesson3dz.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android11lesson3dz.NamesAdapter;
import com.example.android11lesson3dz.R;

import java.util.ArrayList;
import java.util.List;


public class  NamesFragment extends Fragment {

    private List<String> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_names, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_names);

        list.add("Жафар");
        list.add("Жафар1");
        list.add("Жафар2");
        list.add("Жафар3");
        list.add("Жафар4");
        list.add("Жафар5");
        list.add("Жафар6");
        list.add("Жафар7");
        list.add("Жафар8");
        list.add("Жафар9");
        list.add("Жафар10");
        list.add("Жафар11");
        list.add("Жафар12");
        list.add("Жафар13");
        list.add("Жафар14");
        list.add("Жафар15");
        list.add("Жафар16");
        list.add("Жафар17");
        list.add("Жафар18");
        list.add("Жафар19");
        list.add("Жафар20");
        list.add("Жафар21");
        list.add("Жафар22");
        list.add("Жафар23");
        list.add("Жафар24");

        NamesAdapter namesAdapter = new NamesAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView
                .VERTICAL, false));
        recyclerView.setAdapter(namesAdapter);
    }
}