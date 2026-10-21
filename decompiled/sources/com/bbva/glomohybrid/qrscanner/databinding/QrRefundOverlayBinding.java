package com.bbva.glomohybrid.qrscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bbva.glomohybrid.qrscanner.R;

/* JADX INFO: loaded from: classes6.dex */
public final class QrRefundOverlayBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f34419p0;

    public QrRefundOverlayBinding(@NonNull ConstraintLayout constraintLayout) {
        this.f34419p0 = constraintLayout;
    }

    @NonNull
    public static QrRefundOverlayBinding bind(@NonNull View view) {
        if (view != null) {
            return new QrRefundOverlayBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static QrRefundOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static QrRefundOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.qr_refund_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f34419p0;
    }
}
