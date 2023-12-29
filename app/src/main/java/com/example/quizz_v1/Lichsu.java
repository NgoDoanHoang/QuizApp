package com.example.quizz_v1;

import static com.example.quizz_v1.Check.lichsulist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizz_v1.databinding.FragmentLichsuBinding;
import com.example.quizz_v1.databinding.LichsuItemBinding;

import java.util.ArrayList;
import java.util.List;


public class Lichsu extends Fragment {

    FragmentLichsuBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentLichsuBinding.inflate(inflater, container, false);
        binding.lichsu.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.lichsu.setAdapter(new Lichsu_Adapter(lichsulist));
        return binding.getRoot();
    }
}