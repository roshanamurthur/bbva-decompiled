package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* JADX INFO: loaded from: classes10.dex */
public final class MaterialArcMotion extends PathMotion {
    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f6, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f6, f10);
        PointF pointF = f10 > f12 ? new PointF(f11, f10) : new PointF(f6, f12);
        path.quadTo(pointF.x, pointF.y, f11, f12);
        return path;
    }
}
