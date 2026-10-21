package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes11.dex */
class g {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64666a;

        static {
            int[] iArr = new int[InAppMessage.Alignment.values().length];
            f64666a = iArr;
            try {
                iArr[InAppMessage.Alignment.center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64666a[InAppMessage.Alignment.end.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64666a[InAppMessage.Alignment.beginning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @ColorInt
    public static int a(Context context, @Nullable String str, @ColorRes int i10) {
        try {
            context = str != null ? Color.parseColor(str.replace("0x", "#")) : context.getResources().getColor(i10);
            return context;
        } catch (Exception unused) {
            return context.getResources().getColor(i10);
        }
    }

    public static int a(InAppMessage.Alignment alignment) {
        int i10 = a.f64666a[alignment.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? GravityCompat.START : GravityCompat.END;
        }
        return 17;
    }

    public static Drawable a(@ColorInt int i10, float f6, @ColorInt int i11, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f6);
        gradientDrawable.setColor(i10);
        gradientDrawable.setStroke(Math.round(f10), i11);
        return gradientDrawable;
    }

    public static void a(TextView textView, String str, @ColorInt int i10, @Dimension float f6, int i11) {
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setTextSize(0, f6);
        textView.setGravity(i11);
    }
}
