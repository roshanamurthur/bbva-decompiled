package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public final b c(@NonNull fe.b bVar, @NonNull View view) {
        float containerHeight;
        int i10;
        int i11;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (bVar.isHorizontal()) {
            containerHeight = bVar.getContainerWidth();
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            containerHeight = bVar.getContainerHeight();
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        float f6 = i10 + i11;
        return a.d(view.getContext(), f6, containerHeight, new fe.a(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(containerHeight + f6, containerHeight), 1, containerHeight));
    }
}
