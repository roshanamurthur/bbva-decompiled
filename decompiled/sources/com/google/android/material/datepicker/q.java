package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: compiled from: MaterialDatePicker.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f44593p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ View f44594q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f44595r0;

    public q(int i10, View view, int i11) {
        this.f44593p0 = i10;
        this.f44594q0 = view;
        this.f44595r0 = i11;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i10 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
        View view2 = this.f44594q0;
        int i11 = this.f44593p0;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f44595r0 + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return windowInsetsCompat;
    }
}
