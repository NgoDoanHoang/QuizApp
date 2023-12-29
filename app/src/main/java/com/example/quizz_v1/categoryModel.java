package com.example.quizz_v1;

import java.util.ArrayList;
import java.util.Arrays;

public class categoryModel {
    private String imageUrl, title;

    public static ArrayList<categoryModel> list = new ArrayList<>(
            Arrays.asList(
                    new categoryModel("TOÁN"),
                    new categoryModel("VẬT LÍ"),
                    new categoryModel("ANH")
            )
    );

    public categoryModel( String title) {
        this.title = title;

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


