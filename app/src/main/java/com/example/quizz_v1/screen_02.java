package com.example.quizz_v1;

import static com.example.quizz_v1.Check.Trangthai;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizz_v1.databinding.FragmentScreen01Binding;
import com.example.quizz_v1.databinding.FragmentScreen02Binding;

public class screen_02 extends Fragment {

    FragmentScreen02Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentScreen02Binding.inflate(inflater, container, false);
        binding.easy.setOnClickListener(view -> {
            Trangthai.setLevel("Dễ");
            Navigation.findNavController(view).navigate(R.id.action_screen2_to_screen3);
        });
        binding.medium.setOnClickListener(view -> {
            Trangthai.setLevel("Trung bình");
            Navigation.findNavController(view).navigate(R.id.action_screen2_to_screen3);
        });
        binding.hard.setOnClickListener(view -> {
            Trangthai.setLevel("Khó");
            Navigation.findNavController(view).navigate(R.id.action_screen2_to_screen3);
        });
        return binding.getRoot();
    }



}