package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetDialog f44126p0;

    public a(BottomSheetDialog bottomSheetDialog) {
        this.f44126p0 = bottomSheetDialog;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        BottomSheetDialog bottomSheetDialog = this.f44126p0;
        BottomSheetDialog.b bVar = bottomSheetDialog.H0;
        if (bVar != null) {
            bottomSheetDialog.f44108u0.removeBottomSheetCallback(bVar);
        }
        if (windowInsetsCompat != null) {
            BottomSheetDialog.b bVar2 = new BottomSheetDialog.b(bottomSheetDialog.f44110x0, windowInsetsCompat);
            bottomSheetDialog.H0 = bVar2;
            bVar2.c(bottomSheetDialog.getWindow());
            bottomSheetDialog.f44108u0.addBottomSheetCallback(bottomSheetDialog.H0);
        }
        return windowInsetsCompat;
    }
}
