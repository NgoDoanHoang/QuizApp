package com.example.quizz_v1;

import static com.example.quizz_v1.Check.Trangthai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.quizz_v1.databinding.CategoryItemBinding;
import com.example.quizz_v1.databinding.LichsuItemBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class Lichsu_Adapter extends RecyclerView.Adapter<Lichsu_Adapter.Viewholder> {

    private List<Check> historyList;

    public Lichsu_Adapter(List<Check> historyList) {
        this.historyList = historyList;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        LichsuItemBinding binding = LichsuItemBinding.inflate(inflater,parent,false );
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.setData(historyList.get(position));
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        LichsuItemBinding binding;

        public Viewholder(LichsuItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

        public void setData(Check item) {
            binding.t1.setText(item.getCnt()+"/5");
            binding.t2.setText(item.getCategory());
            binding.t3.setText(item.getLevel());
            binding.t4.setText(item.getHour()+"\n"+item.getTime());
        }
    }
}


