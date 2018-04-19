package com.app.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Divyesh Weapplinse on 4/22/2016.
 */
public class FontUtils {
    public static String TCM = "TCM";

    public static Typeface createTypeface(Context context, String type) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/TCM_____.TTF");
    }

    public static void setFont(ViewGroup group, Typeface font) {
        int count = group.getChildCount();
        View v;
        for (int i = 0; i < count; i++) {
            v = group.getChildAt(i);
            if (v instanceof TextView || v instanceof EditText
                    || v instanceof Button) {
                ((TextView) v).setTypeface(font);
            } else if (v instanceof ViewGroup)
                setFont((ViewGroup) v, font);
        }
    }

    public static void setFont(View v, Typeface font) {
        if (v instanceof TextView || v instanceof EditText
                || v instanceof Button) {
            ((TextView) v).setTypeface(font);
        }
    }
}
