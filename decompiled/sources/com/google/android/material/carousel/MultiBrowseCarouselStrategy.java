package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.h0;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f44211d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f44212e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44213c = 0;

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public final b c(@NonNull fe.b bVar, @NonNull View view) {
        float containerHeight = bVar.getContainerHeight();
        if (bVar.isHorizontal()) {
            containerHeight = bVar.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.isHorizontal()) {
            f6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f10 = f6;
        float smallItemSizeMin = getSmallItemSizeMin() + f10;
        float fMax = Math.max(getSmallItemSizeMax() + f10, smallItemSizeMin);
        float fMin = Math.min(measuredHeight + f10, containerHeight);
        float fClamp = MathUtils.clamp((measuredHeight / 3.0f) + f10, smallItemSizeMin + f10, fMax + f10);
        float f11 = (fMin + fClamp) / 2.0f;
        int[] iArrA = f44211d;
        boolean z10 = false;
        if (containerHeight < 2.0f * smallItemSizeMin) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f44212e;
        if (bVar.getCarouselAlignment() == 1) {
            iArrA = CarouselStrategy.a(iArrA);
            iArrA2 = CarouselStrategy.a(iArrA2);
        }
        int[] iArr = iArrA;
        int[] iArr2 = iArrA2;
        int iMax = (int) Math.max(1.0d, Math.floor(h0.a(fMax, a.e(iArr), containerHeight - (a.e(iArr2) * f11), fMin)));
        int iCeil = (int) Math.ceil(containerHeight / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        fe.a aVarA = fe.a.a(containerHeight, fClamp, smallItemSizeMin, fMax, iArr, f11, iArr2, fMin, iArr3);
        int i12 = aVarA.f68404c + aVarA.f68405d;
        int i13 = aVarA.f68408g;
        this.f44213c = i12 + i13;
        int itemCount = bVar.getItemCount();
        int i14 = aVarA.f68404c;
        int i15 = aVarA.f68405d;
        int i16 = ((i14 + i15) + i13) - itemCount;
        if (i16 > 0 && (i14 > 0 || i15 > 1)) {
            z10 = true;
        }
        while (i16 > 0) {
            int i17 = aVarA.f68404c;
            if (i17 > 0) {
                aVarA.f68404c = i17 - 1;
            } else {
                int i18 = aVarA.f68405d;
                if (i18 > 1) {
                    aVarA.f68405d = i18 - 1;
                }
            }
            i16--;
        }
        if (z10) {
            aVarA = fe.a.a(containerHeight, fClamp, smallItemSizeMin, fMax, new int[]{aVarA.f68404c}, f11, new int[]{aVarA.f68405d}, fMin, new int[]{i13});
        }
        return a.c(view.getContext(), f10, containerHeight, aVarA, bVar.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public final boolean d(fe.b bVar, int i10) {
        return (i10 < this.f44213c && bVar.getItemCount() >= this.f44213c) || (i10 >= this.f44213c && bVar.getItemCount() < this.f44213c);
    }
}
