package com.google.android.material.floatingactionbutton;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ j f44759p0;

    public m(j jVar) {
        this.f44759p0 = jVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        j jVar = this.f44759p0;
        float rotation = jVar.f44736v.getRotation();
        if (jVar.f44729o == rotation) {
            return true;
        }
        jVar.f44729o = rotation;
        jVar.p();
        return true;
    }
}
