package com.bbva.glomohybrid.qrscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.qrscanner.R;

/* JADX INFO: loaded from: classes6.dex */
public final class QrCodeBoxLayoutBinding implements ViewBinding {

    @NonNull
    public final View bottom;

    @NonNull
    public final View center;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f34413p0;

    @NonNull
    public final View top;

    public QrCodeBoxLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f34413p0 = constraintLayout;
        this.bottom = view;
        this.center = view2;
        this.top = view3;
    }

    @NonNull
    public static QrCodeBoxLayoutBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i10 = R.id.bottom;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i10);
        if (viewFindChildViewById3 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.center))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i10 = R.id.top))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        return new QrCodeBoxLayoutBinding((ConstraintLayout) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2);
    }

    @NonNull
    public static QrCodeBoxLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static QrCodeBoxLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.qr_code_box_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f34413p0;
    }
}
