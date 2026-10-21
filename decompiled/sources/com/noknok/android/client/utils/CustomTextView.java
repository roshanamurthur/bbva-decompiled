package com.noknok.android.client.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes11.dex */
public class CustomTextView extends AppCompatTextView {
    public CustomTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    private void a() {
        setTypeface(Typeface.create("sans-serif", 0));
    }

    public CustomTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public CustomTextView(Context context) {
        super(context);
        a();
    }
}
