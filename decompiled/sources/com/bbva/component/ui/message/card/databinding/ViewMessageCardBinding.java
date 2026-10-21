package com.bbva.component.ui.message.card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.message.card.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewMessageCardBinding implements ViewBinding {

    @NonNull
    public final LinearLayoutCompat messageCard;

    @NonNull
    public final RelativeLayout messageCardBackground;

    @NonNull
    public final LinearLayout messageCardButtonContainer;

    @NonNull
    public final CellsImageView messageCardCloseView;

    @NonNull
    public final CellsImageView messageCardImageView;

    @NonNull
    public final CellsTextView messageCardPrimaryTextView;

    @NonNull
    public final CellsTextView messageCardSecondaryTextView;

    @NonNull
    public final CellsTextView messageCardTitleView;

    @NonNull
    public final FrameLayout messageLink;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28636p0;

    @NonNull
    public final FrameLayout skeletonContainerView;

    public ViewMessageCardBinding(@NonNull View view, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull CellsImageView cellsImageView, @NonNull CellsImageView cellsImageView2, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2, @NonNull CellsTextView cellsTextView3, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f28636p0 = view;
        this.messageCard = linearLayoutCompat;
        this.messageCardBackground = relativeLayout;
        this.messageCardButtonContainer = linearLayout;
        this.messageCardCloseView = cellsImageView;
        this.messageCardImageView = cellsImageView2;
        this.messageCardPrimaryTextView = cellsTextView;
        this.messageCardSecondaryTextView = cellsTextView2;
        this.messageCardTitleView = cellsTextView3;
        this.messageLink = frameLayout;
        this.skeletonContainerView = frameLayout2;
    }

    @NonNull
    public static ViewMessageCardBinding bind(@NonNull View view) {
        int i10 = R.id.message_card;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i10);
        if (linearLayoutCompat != null) {
            i10 = R.id.message_card_background;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
            if (relativeLayout != null) {
                i10 = R.id.message_card_button_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.message_card_close_view;
                    CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
                    if (cellsImageView != null) {
                        i10 = R.id.message_card_image_view;
                        CellsImageView cellsImageView2 = (CellsImageView) ViewBindings.findChildViewById(view, i10);
                        if (cellsImageView2 != null) {
                            i10 = R.id.message_card_primary_text_view;
                            CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                            if (cellsTextView != null) {
                                i10 = R.id.message_card_secondary_text_view;
                                CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                if (cellsTextView2 != null) {
                                    i10 = R.id.message_card_title_view;
                                    CellsTextView cellsTextView3 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                    if (cellsTextView3 != null) {
                                        i10 = R.id.message_link;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                                        if (frameLayout != null) {
                                            i10 = R.id.skeleton_container_view;
                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                                            if (frameLayout2 != null) {
                                                return new ViewMessageCardBinding(view, linearLayoutCompat, relativeLayout, linearLayout, cellsImageView, cellsImageView2, cellsTextView, cellsTextView2, cellsTextView3, frameLayout, frameLayout2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewMessageCardBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_message_card, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28636p0;
    }
}
