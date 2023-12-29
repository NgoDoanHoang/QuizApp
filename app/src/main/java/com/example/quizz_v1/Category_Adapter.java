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
import com.google.android.material.snackbar.Snackbar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Category_Adapter extends RecyclerView.Adapter<Category_Adapter.Viewholder> {

    private List<categoryModel> categoryModelList;

    public Category_Adapter(List<categoryModel> categoryModelList) {
        this.categoryModelList = categoryModelList;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
                CategoryItemBinding binding = CategoryItemBinding.inflate(inflater,parent,false );
                return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.setData(categoryModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        private ImageView imageview;
        private TextView title;
        CategoryItemBinding binding;

        public Viewholder(CategoryItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            imageview = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.title);
        }

        public void setData(categoryModel item) {
            Glide.with(itemView.getContext()).load(item.getImageUrl()).centerCrop().into(imageview);
            binding.title.setText(item.getTitle());
            //Them hanh dong khi nhan vao cac item
                binding.getRoot().setOnClickListener(view -> {
                    Trangthai.setCategory(item.getTitle());
                    Navigation.findNavController(view).navigate(R.id.action_screen1_to_screen2);
                    SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat dinhdanggio = new SimpleDateFormat("hh:mm:ss");
                    Calendar calendar = Calendar.getInstance();
                    Trangthai.setTime(dinhdang.format(calendar.getTime()));
                    Trangthai.setHour(dinhdanggio.format(calendar.getTime()));
                });
            }
        }



}

