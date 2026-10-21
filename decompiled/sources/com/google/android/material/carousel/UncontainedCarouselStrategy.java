package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UncontainedCarouselStrategy() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public final b c(@NonNull fe.b bVar, @NonNull View view) {
        float containerWidth = bVar.isHorizontal() ? bVar.getContainerWidth() : bVar.getContainerHeight();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.isHorizontal()) {
            f6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f10 = measuredHeight + f6;
        Resources resources = view.getContext().getResources();
        int i10 = R.dimen.m3_carousel_gone_size;
        float dimension = resources.getDimension(i10) + f6;
        float dimension2 = view.getContext().getResources().getDimension(i10) + f6;
        int iMax = Math.max(1, (int) Math.floor(containerWidth / f10));
        float f11 = iMax * f10;
        float f12 = containerWidth - f11;
        if (bVar.getCarouselAlignment() == 1) {
            float f13 = f12 / 2.0f;
            float fMax = Math.max(Math.min(3.0f * f13, f10), getSmallItemSizeMin() + f6);
            float fMin = Math.min(dimension2, f10);
            float fB = CarouselStrategy.b(fMin, f10, f6);
            float fB2 = CarouselStrategy.b(fMax, f10, f6);
            float f14 = fMax / 2.0f;
            float f15 = (f13 + 0.0f) - f14;
            float f16 = f15 + f14;
            float f17 = fMin / 2.0f;
            float f18 = (f10 / 2.0f) + f16;
            float f19 = f11 + f16;
            b.a aVar = new b.a(f10, containerWidth);
            aVar.a((f15 - f14) - f17, fB, fMin, false, true);
            aVar.a(f15, fB2, fMax, false, false);
            aVar.c(f18, 0.0f, f10, iMax, true);
            aVar.a(f19 + f14, fB2, fMax, false, false);
            aVar.a(f19 + fMax + f17, fB, fMin, false, true);
            return aVar.d();
        }
        ?? r10 = f12 > 0.0f;
        float fMax2 = Math.max(1.5f * f12, dimension);
        float f20 = 0.85f * f10;
        if (fMax2 > f20) {
            fMax2 = Math.max(f20, f12 * 1.2f);
        }
        float fMin2 = Math.min(f10, fMax2);
        Context context = view.getContext();
        float fMin3 = Math.min(dimension2, f10);
        float fMax3 = Math.max(fMin3, 0.5f * fMin2);
        float fB3 = CarouselStrategy.b(fMax3, f10, f6);
        float fB4 = CarouselStrategy.b(fMin3, f10, f6);
        float fB5 = CarouselStrategy.b(fMin2, f10, f6);
        float f21 = 0.0f + f11;
        b.a aVar2 = new b.a(f10, containerWidth);
        aVar2.a(0.0f - (fMax3 / 2.0f), fB3, fMax3, false, true);
        aVar2.c(f10 / 2.0f, 0.0f, f10, iMax, true);
        if (r10 > 0) {
            float f22 = (fMin2 / 2.0f) + f21;
            f21 += fMin2;
            aVar2.a(f22, fB5, fMin2, false, false);
        }
        aVar2.a((context.getResources().getDimension(i10) / 2.0f) + f21, fB4, fMin3, false, true);
        return aVar2.d();
    }
}
