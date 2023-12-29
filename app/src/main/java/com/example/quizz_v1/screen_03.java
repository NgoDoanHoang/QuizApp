package com.example.quizz_v1;

import static android.content.Intent.getIntent;
import static com.example.quizz_v1.Check.Trangthai;
import static com.example.quizz_v1.Question.anh_de;
import static com.example.quizz_v1.Question.anh_kho;
import static com.example.quizz_v1.Question.anh_trungbinh;
import static com.example.quizz_v1.Question.toan_de;
import static com.example.quizz_v1.Question.toan_kho;
import static com.example.quizz_v1.Question.toan_trungbinh;
import static com.example.quizz_v1.Question.vatly_de;
import static com.example.quizz_v1.Question.vatly_kho;
import static com.example.quizz_v1.Question.vatly_trungbinh;


import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Random;

import com.example.quizz_v1.databinding.FragmentScreen02Binding;
import com.example.quizz_v1.databinding.FragmentScreen03Binding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.quizz_v1.screen_02;

public class screen_03 extends Fragment {

    FragmentScreen03Binding binding;
    FragmentScreen02Binding binding1;
    private static List<Question> questions = new ArrayList<>();
    private LinearLayout optionsContainer;
    private int questionIndex;
    private int countquestion = 1;
    private int score = 0;
    private void updateQuestionText(){
        binding.questionText.setText(questions.get(questionIndex).getQuestionText());
        if(countquestion<=5) binding.qt.setText("Câu hỏi: "+countquestion+"/5");
        binding.button5.setText("A"+": "+questions.get(questionIndex).getOptionA());
        binding.button6.setText("B"+": "+questions.get(questionIndex).getOptionB());
        binding.button7.setText("C"+": "+questions.get(questionIndex).getOptionC());
        binding.button8.setText("D"+": "+questions.get(questionIndex).getOptionD());
    }

    @SuppressLint("SuspiciousIndentation")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentScreen03Binding.inflate(inflater, container, false);
        Random random= new Random();
        questionIndex = random.nextInt(5);
        switch (Trangthai.getCategory()) {
            case "TOÁN":
                if (Trangthai.getLevel() == "Dễ") questions = Question.toan_de;
                else if (Trangthai.getLevel() == "Trung bình") questions = toan_trungbinh;
                else if (Trangthai.getLevel() == "Khó") questions = toan_kho;
                break;
            case "ANH":
                if (Trangthai.getLevel() == "Dễ") questions = anh_de;
                else if (Trangthai.getLevel() == "Trung bình") questions = anh_trungbinh;
                else if (Trangthai.getLevel() == "Khó") questions = anh_kho;
                break;
            case "VẬT LÍ":
                if (Trangthai.getLevel() == "Dễ") questions = vatly_de;
                else if (Trangthai.getLevel() == "Trung bình") questions = vatly_trungbinh;
                else if (Trangthai.getLevel() == "Khó") questions = vatly_kho;
                break;
        }
        updateQuestionText();

        binding.button5.setOnClickListener(view-> {
            if (countquestion  < 5) {
                int current = binding.progressBar.getProgress();
                binding.progressBar.setProgress(current + 1);
                if (questions.get(questionIndex).getCorrectAns()=="A")
                    score = score + 1;
                Random random1 = new Random();
                questionIndex = random1.nextInt(5);
                countquestion += 1;
                updateQuestionText();
            }
            else if(countquestion==5){
                int current = binding.progressBar.getProgress();
                binding.progressBar.setProgress(current + 1);
                if (questions.get(questionIndex).getCorrectAns()=="A")
                    score = score + 1;
                Trangthai.setCnt(score);
                Navigation.findNavController(view).navigate(R.id.action_screen3_to_screen4);
            }
        });

        binding.button6.setOnClickListener(view -> {
            if (countquestion  < 5) {
                int current = binding.progressBar.getProgress();
                binding.progressBar.setProgress(current+1);
                if(questions.get(questionIndex).getCorrectAns()=="B")
                    score = score+1;
                Random random1= new Random();
                questionIndex = random1.nextInt(5);
                countquestion += 1;
                updateQuestionText();
            }
            else if(countquestion==5){
                int current = binding.progressBar.getProgress();
                binding.progressBar.setProgress(current + 1);
                if(questions.get(questionIndex).getCorrectAns()=="B")
                    score = score+1;
                Trangthai.setCnt(score);
                Navigation.findNavController(view).navigate(R.id.action_screen3_to_screen4);
            }
        });
        binding.button7.setOnClickListener(view -> {
            if (countquestion  < 5) {
                int current = binding.progressBar.getProgress();
                binding.progressBar.setProgress(current+1);
                if(questions.get(questionIndex).getCorrectAns()=="C")
                    score = score+1;
                Random random1= new Random();
                questionIndex = random1.nextInt(5);
                countquestion += 1;
                updateQuestionText();
            }
            else if(countquestion==5){
                int current = binding.progressBar.getProgress();
                binding.progressBar.setProgress(current + 1);
                if(questions.get(questionIndex).getCorrectAns()=="C")
                    score = score+1;
                Trangthai.setCnt(score);
                Navigation.findNavController(view).navigate(R.id.action_screen3_to_screen4);
            }
        });

        binding.button8.setOnClickListener(view -> {
            if (countquestion  < 5) {
                int current = binding.progressBar.getProgress();
                binding.progressBar.setProgress(current+1);
                if(questions.get(questionIndex).getCorrectAns()=="D")
                    score = score+1;
                Random random1= new Random();
                questionIndex = random1.nextInt(5);
                countquestion += 1;
                updateQuestionText();
            }
            else if(countquestion==5){
                int current = binding.progressBar.getProgress();
                binding.progressBar.setProgress(current + 1);
                if(questions.get(questionIndex).getCorrectAns()=="D")
                    score = score+1;
                Trangthai.setCnt(score);
                Navigation.findNavController(view).navigate(R.id.action_screen3_to_screen4);
            }
        });

        return binding.getRoot();
    }


}