package com.example.quizz_v1;

import static com.example.quizz_v1.Check.Trangthai;
import static com.example.quizz_v1.Check.lichsulist;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizz_v1.databinding.FragmentScreen03Binding;
import com.example.quizz_v1.databinding.FragmentScreen04Binding;

public class screen_04 extends Fragment {

    FragmentScreen04Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentScreen04Binding.inflate(inflater, container, false);
        binding.scoreFinal.setText(Trangthai.getCnt()+"/5");
        lichsulist.add(new Check(Trangthai.getCnt(),Trangthai.getCategory(),Trangthai.getLevel(),Trangthai.getTime(),Trangthai.getHour()));
        binding.shareBtn.setOnClickListener(view ->{
            Intent sendintent = new Intent();
            sendintent.setAction(Intent.ACTION_SEND);
            sendintent.putExtra(Intent.EXTRA_TEXT, "Tôi đã trả lời đúng "+Trangthai.getCnt()+" câu hỏi ở cấp độ "+Trangthai.getLevel()+" ở chủ đề "+Trangthai.getCategory());
            sendintent.setType("text/plain");
            if(sendintent.resolveActivity(getActivity().getPackageManager())!= null){
                startActivity(sendintent);
            }
        });
        binding.completeBtn.setOnClickListener(view->{
            Navigation.findNavController(view).navigate(R.id.action_screen_4_to_screen_1);
        });
        return binding.getRoot();
    }
}