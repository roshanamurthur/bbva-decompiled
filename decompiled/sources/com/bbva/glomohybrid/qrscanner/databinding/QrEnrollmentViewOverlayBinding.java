package com.bbva.glomohybrid.qrscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.glomohybrid.qrscanner.R;
import com.bbva.glomohybrid.qrscanner.customenroll.widget.QrEnrollmentView;

/* JADX INFO: loaded from: classes6.dex */
public final class QrEnrollmentViewOverlayBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final QrEnrollmentView f34417p0;

    public QrEnrollmentViewOverlayBinding(@NonNull QrEnrollmentView qrEnrollmentView) {
        this.f34417p0 = qrEnrollmentView;
    }

    @NonNull
    public static QrEnrollmentViewOverlayBinding bind(@NonNull View view) {
        if (view != null) {
            return new QrEnrollmentViewOverlayBinding((QrEnrollmentView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static QrEnrollmentViewOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static QrEnrollmentViewOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.qr_enrollment_view_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public QrEnrollmentView getRoot() {
        return this.f34417p0;
    }
}
