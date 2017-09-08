package com.example.admin.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;


public class CustomViewTextView extends TextView {

    public CustomViewTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomViewTextView);
        String fontName = a.getString(R.styleable.CustomViewTextView_fontName);
        if (fontName!=null) {
            Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/"+fontName);
            setTypeface(myTypeface);
        }
        a.recycle();
    }


}
