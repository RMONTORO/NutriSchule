package com.montororg.nutrischule.adapter;

import android.content.res.ColorStateList;
import android.graphics.Color;

public class WeekCard {

    public static final int COLOR_0 = 0;
    public static final int COLOR_1 = 1;
    public static final int COLOR_2 = 2;

    public int color;
    public String txt;

    public WeekCard(int color, String txt) {
        this.color = color;
        this.txt = txt;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
