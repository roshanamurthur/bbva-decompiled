package com.bbva.glomohybrid.qrscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.glomohybrid.qrscanner.R;
import com.bbva.glomohybrid.qrscanner.view.CustomQRToolbarView;

/* JADX INFO: loaded from: classes6.dex */
public final class QrCustomToolbarOverlayBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CustomQRToolbarView f34415p0;

    public QrCustomToolbarOverlayBinding(@NonNull CustomQRToolbarView customQRToolbarView) {
        this.f34415p0 = customQRToolbarView;
    }

    @NonNull
    public static QrCustomToolbarOverlayBinding bind(@NonNull View view) {
        if (view != null) {
            return new QrCustomToolbarOverlayBinding((CustomQRToolbarView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static QrCustomToolbarOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static QrCustomToolbarOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.qr_custom_toolbar_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CustomQRToolbarView getRoot() {
        return this.f34415p0;
    }
}
