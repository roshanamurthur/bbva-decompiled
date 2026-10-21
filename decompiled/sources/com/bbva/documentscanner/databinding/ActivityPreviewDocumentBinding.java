package com.bbva.documentscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.documentscanner.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPreviewDocumentBinding implements ViewBinding {

    @NonNull
    public final LinearLayout buttonPanel;

    @NonNull
    public final CellsImageView close;

    @NonNull
    public final CellsButton confirm;

    @NonNull
    public final CellsImageView image;

    @NonNull
    public final FrameLayout imageContainer;

    @NonNull
    public final View overlay;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f29226p0;

    @NonNull
    public final CellsButton retry;

    @NonNull
    public final CellsTextView title;

    public ActivityPreviewDocumentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull CellsImageView cellsImageView, @NonNull CellsButton cellsButton, @NonNull CellsImageView cellsImageView2, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull CellsButton cellsButton2, @NonNull CellsTextView cellsTextView) {
        this.f29226p0 = constraintLayout;
        this.buttonPanel = linearLayout;
        this.close = cellsImageView;
        this.confirm = cellsButton;
        this.image = cellsImageView2;
        this.imageContainer = frameLayout;
        this.overlay = view;
        this.retry = cellsButton2;
        this.title = cellsTextView;
    }

    @NonNull
    public static ActivityPreviewDocumentBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.buttonPanel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
        if (linearLayout != null) {
            i10 = R.id.close;
            CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
            if (cellsImageView != null) {
                i10 = R.id.confirm;
                CellsButton cellsButton = (CellsButton) ViewBindings.findChildViewById(view, i10);
                if (cellsButton != null) {
                    i10 = R.id.image;
                    CellsImageView cellsImageView2 = (CellsImageView) ViewBindings.findChildViewById(view, i10);
                    if (cellsImageView2 != null) {
                        i10 = R.id.imageContainer;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.overlay))) != null) {
                            i10 = R.id.retry;
                            CellsButton cellsButton2 = (CellsButton) ViewBindings.findChildViewById(view, i10);
                            if (cellsButton2 != null) {
                                i10 = R.id.title;
                                CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                if (cellsTextView != null) {
                                    return new ActivityPreviewDocumentBinding((ConstraintLayout) view, linearLayout, cellsImageView, cellsButton, cellsImageView2, frameLayout, viewFindChildViewById, cellsButton2, cellsTextView);
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
    public static ActivityPreviewDocumentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPreviewDocumentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_preview_document, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f29226p0;
    }
}
