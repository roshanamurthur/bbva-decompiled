package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;
import tg.a;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class PointF3D {
    @NonNull
    public static PointF3D from(float f6, float f10, float f11) {
        return new a(f6, f10, f11);
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
