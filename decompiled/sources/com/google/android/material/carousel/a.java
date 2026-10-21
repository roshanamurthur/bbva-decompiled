package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.R;

/* JADX INFO: compiled from: CarouselStrategyHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static float a(float f6, float f10, int i10) {
        return (Math.max(0, i10 - 1) * f10) + f6;
    }

    public static float b(float f6, float f10, int i10) {
        return i10 > 0 ? (f10 / 2.0f) + f6 : f6;
    }

    public static b c(@NonNull Context context, float f6, float f10, @NonNull fe.a aVar, int i10) {
        if (i10 != 1) {
            return d(context, f6, f10, aVar);
        }
        float fMin = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f6, aVar.f68407f);
        float f11 = fMin / 2.0f;
        float fB = b(0.0f, aVar.f68403b, aVar.f68404c);
        float f12 = f(0.0f, a(fB, aVar.f68403b, (int) Math.floor(aVar.f68404c / 2.0f)), aVar.f68403b, aVar.f68404c);
        float fB2 = b(f12, aVar.f68406e, aVar.f68405d);
        float f13 = f(f12, a(fB2, aVar.f68406e, (int) Math.floor(aVar.f68405d / 2.0f)), aVar.f68406e, aVar.f68405d);
        float f14 = aVar.f68407f;
        int i11 = aVar.f68408g;
        float fB3 = b(f13, f14, i11);
        float f15 = f(f13, a(fB3, aVar.f68407f, i11), aVar.f68407f, i11);
        float fB4 = b(f15, aVar.f68406e, aVar.f68405d);
        float fB5 = b(f(f15, a(fB4, aVar.f68406e, (int) Math.ceil(aVar.f68405d / 2.0f)), aVar.f68406e, aVar.f68405d), aVar.f68403b, aVar.f68404c);
        float f16 = f10 + f11;
        float fB6 = CarouselStrategy.b(fMin, aVar.f68407f, f6);
        float fB7 = CarouselStrategy.b(aVar.f68403b, aVar.f68407f, f6);
        float fB8 = CarouselStrategy.b(aVar.f68406e, aVar.f68407f, f6);
        b.a aVar2 = new b.a(aVar.f68407f, f10);
        aVar2.a(0.0f - f11, fB6, fMin, false, true);
        int i12 = aVar.f68404c;
        if (i12 > 0) {
            aVar2.c(fB, fB7, aVar.f68403b, (int) Math.floor(i12 / 2.0f), false);
        }
        int i13 = aVar.f68405d;
        if (i13 > 0) {
            aVar2.c(fB2, fB8, aVar.f68406e, (int) Math.floor(i13 / 2.0f), false);
        }
        aVar2.c(fB3, 0.0f, aVar.f68407f, aVar.f68408g, true);
        int i14 = aVar.f68405d;
        if (i14 > 0) {
            aVar2.c(fB4, fB8, aVar.f68406e, (int) Math.ceil(i14 / 2.0f), false);
        }
        int i15 = aVar.f68404c;
        if (i15 > 0) {
            aVar2.c(fB5, fB7, aVar.f68403b, (int) Math.ceil(i15 / 2.0f), false);
        }
        aVar2.a(f16, fB6, fMin, false, true);
        return aVar2.d();
    }

    public static b d(@NonNull Context context, float f6, float f10, @NonNull fe.a aVar) {
        float fMin = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f6, aVar.f68407f);
        float f11 = fMin / 2.0f;
        float f12 = 0.0f - f11;
        float f13 = aVar.f68407f;
        int i10 = aVar.f68408g;
        float fB = b(0.0f, f13, i10);
        float f14 = f(0.0f, a(fB, aVar.f68407f, i10), aVar.f68407f, i10);
        float fB2 = b(f14, aVar.f68406e, aVar.f68405d);
        float fB3 = b(f(f14, fB2, aVar.f68406e, aVar.f68405d), aVar.f68403b, aVar.f68404c);
        float f15 = f11 + f10;
        float fB4 = CarouselStrategy.b(fMin, aVar.f68407f, f6);
        float fB5 = CarouselStrategy.b(aVar.f68403b, aVar.f68407f, f6);
        float fB6 = CarouselStrategy.b(aVar.f68406e, aVar.f68407f, f6);
        b.a aVar2 = new b.a(aVar.f68407f, f10);
        aVar2.a(f12, fB4, fMin, false, true);
        aVar2.c(fB, 0.0f, aVar.f68407f, aVar.f68408g, true);
        if (aVar.f68405d > 0) {
            aVar2.a(fB2, fB6, aVar.f68406e, false, false);
        }
        int i11 = aVar.f68404c;
        if (i11 > 0) {
            aVar2.c(fB3, fB5, aVar.f68403b, i11, false);
        }
        aVar2.a(f15, fB4, fMin, false, true);
        return aVar2.d();
    }

    public static int e(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    public static float f(float f6, float f10, float f11, int i10) {
        return i10 > 0 ? (f11 / 2.0f) + f10 : f6;
    }
}
