package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: StaticLayoutBuilderCompat.java */
/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f44911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f44912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44914d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44921k;

    @Nullable
    public StaticLayoutBuilderConfigurer m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f44915e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44916f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f44917g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44918h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44919i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44920j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TextUtils.TruncateAt f44922l = null;

    /* JADX INFO: compiled from: StaticLayoutBuilderCompat.java */
    public static class a extends Exception {
    }

    public d(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f44911a = charSequence;
        this.f44912b = textPaint;
        this.f44913c = i10;
        this.f44914d = charSequence.length();
    }

    public final StaticLayout a() throws a {
        if (this.f44911a == null) {
            this.f44911a = "";
        }
        int iMax = Math.max(0, this.f44913c);
        CharSequence charSequenceEllipsize = this.f44911a;
        int i10 = this.f44916f;
        TextPaint textPaint = this.f44912b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f44922l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f44914d);
        this.f44914d = iMin;
        if (this.f44921k && this.f44916f == 1) {
            this.f44915e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f44915e);
        builderObtain.setIncludePad(this.f44920j);
        builderObtain.setTextDirection(this.f44921k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f44922l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f44916f);
        float f6 = this.f44917g;
        if (f6 != 0.0f || this.f44918h != 1.0f) {
            builderObtain.setLineSpacing(f6, this.f44918h);
        }
        if (this.f44916f > 1) {
            builderObtain.setHyphenationFrequency(this.f44919i);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.m;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.configure(builderObtain);
        }
        return builderObtain.build();
    }
}
