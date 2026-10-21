package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class Font {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Typeface f25953d;

    public Font(String str, String str2, String str3, float f6) {
        this.f25950a = str;
        this.f25951b = str2;
        this.f25952c = str3;
    }

    public String getFamily() {
        return this.f25950a;
    }

    public String getName() {
        return this.f25951b;
    }

    public String getStyle() {
        return this.f25952c;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f25953d;
    }

    public void setTypeface(@Nullable Typeface typeface) {
        this.f25953d = typeface;
    }
}
