package com.google.android.material.carousel;

import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CarouselStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f44200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f44201b;

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static float b(float f6, float f10, float f11) {
        return 1.0f - ((f6 - f11) / (f10 - f11));
    }

    public abstract b c(@NonNull fe.b bVar, @NonNull View view);

    public boolean d(fe.b bVar, int i10) {
        return false;
    }

    public float getSmallItemSizeMax() {
        return this.f44201b;
    }

    public float getSmallItemSizeMin() {
        return this.f44200a;
    }

    public void setSmallItemSizeMax(float f6) {
        this.f44201b = f6;
    }

    public void setSmallItemSizeMin(float f6) {
        this.f44200a = f6;
    }
}
