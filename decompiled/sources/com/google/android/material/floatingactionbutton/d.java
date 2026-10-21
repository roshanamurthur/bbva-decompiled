package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* JADX INFO: compiled from: ExtendedFloatingActionButton.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements ExtendedFloatingActionButton.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f44701a;

    public d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f44701a = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int a() {
        return this.f44701a.S0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int c() {
        return this.f44701a.R0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int getHeight() {
        return this.f44701a.getMeasuredHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f44701a;
        return (extendedFloatingActionButton.getMeasuredWidth() - (extendedFloatingActionButton.getCollapsedPadding() * 2)) + extendedFloatingActionButton.R0 + extendedFloatingActionButton.S0;
    }
}
