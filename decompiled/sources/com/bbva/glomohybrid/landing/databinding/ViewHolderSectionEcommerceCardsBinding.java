package com.bbva.glomohybrid.landing.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.carousel.cards.view.CarouselCardsView;
import com.bbva.glomohybrid.landing.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewHolderSectionEcommerceCardsBinding implements ViewBinding {

    @NonNull
    public final CarouselCardsView ecommerceCards;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CarouselCardsView f32548p0;

    public ViewHolderSectionEcommerceCardsBinding(@NonNull CarouselCardsView carouselCardsView, @NonNull CarouselCardsView carouselCardsView2) {
        this.f32548p0 = carouselCardsView;
        this.ecommerceCards = carouselCardsView2;
    }

    @NonNull
    public static ViewHolderSectionEcommerceCardsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CarouselCardsView carouselCardsView = (CarouselCardsView) view;
        return new ViewHolderSectionEcommerceCardsBinding(carouselCardsView, carouselCardsView);
    }

    @NonNull
    public static ViewHolderSectionEcommerceCardsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewHolderSectionEcommerceCardsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_holder_section_ecommerce_cards, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CarouselCardsView getRoot() {
        return this.f32548p0;
    }
}
