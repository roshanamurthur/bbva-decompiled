package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class MaterialArcMotion extends PathMotion {
    @Override // android.transition.PathMotion
    @NonNull
    public Path getPath(float f6, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f6, f10);
        PointF pointF = f10 > f12 ? new PointF(f11, f10) : new PointF(f6, f12);
        path.quadTo(pointF.x, pointF.y, f11, f12);
        return path;
    }
}
