package com.example.quizz_v1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Check {
    private int cnt;
    private String category,level;
    private String time = "DD/MM/YYYY";
    private String hour = "hh:mm:ss";


    public Check() {

    }

    public Check(int cnt, String category, String level, String time, String hour) {
        this.cnt = cnt;
        this.category = category;
        this.level = level;
        this.time = time;
        this.hour = hour;
    }

    public static List<Check> lichsulist = new ArrayList<>();
    public static List<Check> templist = new ArrayList<>();

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public static Check Trangthai = new Check();

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}


