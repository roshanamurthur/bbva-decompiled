package com.bbva.glomohybrid.qrscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.glomohybrid.qrscanner.R;
import com.bbva.glomohybrid.qrscanner.view.CustomQrNavigationView;

/* JADX INFO: loaded from: classes6.dex */
public final class QrCustomNavigationOverlayBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CustomQrNavigationView f34414p0;

    public QrCustomNavigationOverlayBinding(@NonNull CustomQrNavigationView customQrNavigationView) {
        this.f34414p0 = customQrNavigationView;
    }

    @NonNull
    public static QrCustomNavigationOverlayBinding bind(@NonNull View view) {
        if (view != null) {
            return new QrCustomNavigationOverlayBinding((CustomQrNavigationView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static QrCustomNavigationOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static QrCustomNavigationOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.qr_custom_navigation_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CustomQrNavigationView getRoot() {
        return this.f34414p0;
    }
}
