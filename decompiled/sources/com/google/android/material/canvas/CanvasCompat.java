package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CanvasCompat {

    public interface CanvasOperation {
        void run(@NonNull Canvas canvas);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, @Nullable RectF rectF, int i10) {
        return canvas.saveLayerAlpha(rectF, i10);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, float f6, float f10, float f11, float f12, int i10) {
        return canvas.saveLayerAlpha(f6, f10, f11, f12, i10);
    }
}
