package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;

/* JADX INFO: compiled from: ExtendedFloatingActionButton.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements ExtendedFloatingActionButton.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.j f44704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.j f44705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f44706c;

    public f(ExtendedFloatingActionButton extendedFloatingActionButton, e eVar, d dVar) {
        this.f44706c = extendedFloatingActionButton;
        this.f44704a = eVar;
        this.f44705b = dVar;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int a() {
        return this.f44706c.S0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final ViewGroup.LayoutParams b() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f44706c;
        int i10 = extendedFloatingActionButton.X0;
        if (i10 == 0) {
            i10 = -2;
        }
        int i11 = extendedFloatingActionButton.Y0;
        return new ViewGroup.LayoutParams(i10, i11 != 0 ? i11 : -2);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int c() {
        return this.f44706c.R0;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int getHeight() {
        int i10 = this.f44706c.Y0;
        if (i10 == -1) {
            return this.f44704a.getHeight();
        }
        return (i10 == 0 || i10 == -2) ? this.f44705b.getHeight() : i10;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
    public final int getWidth() {
        int i10 = this.f44706c.X0;
        if (i10 == -1) {
            return this.f44704a.getWidth();
        }
        return (i10 == 0 || i10 == -2) ? this.f44705b.getWidth() : i10;
    }
}
