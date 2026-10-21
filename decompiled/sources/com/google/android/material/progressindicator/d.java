package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: compiled from: IndeterminateAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d<T extends Animator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IndeterminateDrawable f45066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f45067b = new ArrayList();

    public d(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f45067b.add(new DrawingDelegate.ActiveIndicator());
        }
    }

    public static float b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void a();

    public abstract void c();

    public abstract void d(@NonNull BaseProgressIndicator.c cVar);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
