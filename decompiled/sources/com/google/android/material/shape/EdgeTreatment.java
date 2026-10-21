package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class EdgeTreatment {
    public boolean a() {
        return this instanceof MarkerEdgeTreatment;
    }

    @Deprecated
    public void getEdgePath(float f6, float f10, @NonNull ShapePath shapePath) {
        getEdgePath(f6, f6 / 2.0f, f10, shapePath);
    }

    public void getEdgePath(float f6, float f10, float f11, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f6, 0.0f);
    }
}
