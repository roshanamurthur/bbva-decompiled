package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f6, float f10, @NonNull ShapePath shapePath) {
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f10, float f11) {
        getCornerPath(f6, f10, shapePath);
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f6, float f10, @NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        getCornerPath(shapePath, f6, f10, cornerSize.getCornerSize(rectF));
    }
}
