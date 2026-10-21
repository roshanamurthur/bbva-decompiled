package com.airbnb.lottie.utils;

import ad.d;
import androidx.core.os.TraceCompat;
import ci.a;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class LottieTrace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f26202a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f26203b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26204c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26205d = 0;

    public void beginSection(String str) {
        int i10 = this.f26204c;
        if (i10 == 5) {
            this.f26205d++;
            return;
        }
        this.f26202a[i10] = str;
        this.f26203b[i10] = System.nanoTime();
        TraceCompat.beginSection(str);
        this.f26204c++;
    }

    public float endSection(String str) {
        int i10 = this.f26205d;
        if (i10 > 0) {
            this.f26205d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f26204c - 1;
        this.f26204c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        String[] strArr = this.f26202a;
        if (!str.equals(strArr[i11])) {
            throw new IllegalStateException(d.f(a.d("Unbalanced trace call ", str, ". Expected "), strArr[this.f26204c], Constant.DOT_STRING));
        }
        TraceCompat.endSection();
        return (System.nanoTime() - this.f26203b[this.f26204c]) / 1000000.0f;
    }
}
