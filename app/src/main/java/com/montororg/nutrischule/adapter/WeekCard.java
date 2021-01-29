package com.montororg.nutrischule.adapter;

import android.content.res.ColorStateList;
import android.graphics.Color;

public class WeekCard {

    public int txtColor, bgColor;
    public String txt;

    public WeekCard(int txtColor, int bgColor, String txt) {
        this.txtColor = txtColor;
        this.bgColor = bgColor;
        this.txt = txt;
    }

    public int getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(int txtColor) {
        this.txtColor = txtColor;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

}
