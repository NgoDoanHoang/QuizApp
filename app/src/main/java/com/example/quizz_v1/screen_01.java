package com.example.quizz_v1;

import static com.example.quizz_v1.categoryModel.list;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.quizz_v1.databinding.FragmentScreen01Binding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class screen_01 extends Fragment {

    FragmentScreen01Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         binding =  FragmentScreen01Binding.inflate(inflater, container, false);
        //Dat cho danh sach hien thi theo chieu doc
        binding.rv.setLayoutManager(new LinearLayoutManager(getContext()));

        //Dat Adapter cho Recycleview
        binding.rv.setAdapter(new Category_Adapter(list));

        View view = binding.getRoot();
        return view;

    }



}