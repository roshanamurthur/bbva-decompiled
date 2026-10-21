package com.google.android.material.floatingactionbutton;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ExtendedFloatingActionButton.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements ExtendedFloatingActionButton.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.j f44702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f44703b;

    public e(ExtendedFloatingActionButton extendedFloatingActionButton, d dVar) {
        this.f44703b = extendedFloatingActionButton;
        this.f44702a = dVar;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int a() {
        return this.f44703b.S0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final ViewGroup.LayoutParams b() {
        int i10 = this.f44703b.Y0;
        if (i10 == 0) {
            i10 = -2;
        }
        return new ViewGroup.LayoutParams(-1, i10);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int c() {
        return this.f44703b.R0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int getHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f44703b;
        int i10 = extendedFloatingActionButton.Y0;
        ExtendedFloatingActionButton.j jVar = this.f44702a;
        if (i10 != -1) {
            return (i10 == 0 || i10 == -2) ? jVar.getHeight() : i10;
        }
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return jVar.getHeight();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return jVar.getHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f44703b;
        boolean z10 = extendedFloatingActionButton.getParent() instanceof View;
        ExtendedFloatingActionButton.j jVar = this.f44702a;
        if (!z10) {
            return jVar.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return jVar.getWidth();
    }
}
