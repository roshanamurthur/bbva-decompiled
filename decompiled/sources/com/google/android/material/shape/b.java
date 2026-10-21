package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends ShapePath.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f45337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f45338d;

    public b(ArrayList arrayList, Matrix matrix) {
        this.f45337c = arrayList;
        this.f45338d = matrix;
    }

    @Override // com.google.android.material.shape.ShapePath.d
    public final void a(Matrix matrix, ShadowRenderer shadowRenderer, int i10, Canvas canvas) {
        Iterator it = this.f45337c.iterator();
        while (it.hasNext()) {
            ((ShapePath.d) it.next()).a(this.f45338d, shadowRenderer, i10, canvas);
        }
    }
}
