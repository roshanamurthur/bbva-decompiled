package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.h0;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class HeroCarouselStrategy extends CarouselStrategy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f44202d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f44203e = {0, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44204c = 0;

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public final b c(@NonNull fe.b bVar, @NonNull View view) {
        int i10;
        int containerHeight = bVar.getContainerHeight();
        if (bVar.isHorizontal()) {
            containerHeight = bVar.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (bVar.isHorizontal()) {
            f6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f6;
        float fMax = Math.max(getSmallItemSizeMax() + f6, smallItemSizeMin);
        float f10 = containerHeight;
        float fMin = Math.min(measuredWidth + f6, f10);
        float fClamp = MathUtils.clamp((measuredWidth / 3.0f) + f6, smallItemSizeMin + f6, fMax + f6);
        float f11 = (fMin + fClamp) / 2.0f;
        int[] iArr = f44202d;
        int[] iArr2 = f10 < 2.0f * smallItemSizeMin ? new int[]{0} : iArr;
        int iMax = (int) Math.max(1.0d, Math.floor(h0.a(fMax, a.e(iArr), f10, fMin)));
        int iCeil = (((int) Math.ceil(f10 / fMin)) - iMax) + 1;
        int[] iArr3 = new int[iCeil];
        for (int i11 = 0; i11 < iCeil; i11++) {
            iArr3[i11] = iMax + i11;
        }
        int i12 = bVar.getCarouselAlignment() == 1 ? 1 : 0;
        int[] iArrA = i12 != 0 ? CarouselStrategy.a(iArr2) : iArr2;
        int[] iArr4 = f44203e;
        fe.a aVarA = fe.a.a(f10, fClamp, smallItemSizeMin, fMax, iArrA, f11, i12 != 0 ? CarouselStrategy.a(iArr4) : iArr4, fMin, iArr3);
        int i13 = aVarA.f68404c;
        int i14 = aVarA.f68405d;
        int i15 = aVarA.f68408g;
        this.f44204c = i13 + i14 + i15;
        if (i13 + i14 + i15 > bVar.getItemCount()) {
            aVarA = fe.a.a(f10, fClamp, smallItemSizeMin, fMax, iArr2, f11, iArr4, fMin, iArr3);
            i10 = 0;
        } else {
            i10 = i12;
        }
        return a.c(view.getContext(), f6, f10, aVarA, i10);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public final boolean d(@NonNull fe.b bVar, int i10) {
        if (bVar.getCarouselAlignment() == 1) {
            if (i10 < this.f44204c && bVar.getItemCount() >= this.f44204c) {
                return true;
            }
            if (i10 >= this.f44204c && bVar.getItemCount() < this.f44204c) {
                return true;
            }
        }
        return false;
    }
}
