package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.collection.ScatterMapKt;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f45034a;

    public static class ActiveIndicator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public float f45035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public float f45036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ColorInt
        public int f45037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Px
        public int f45038d;
    }

    public DrawingDelegate(S s4) {
        this.f45034a = s4;
    }

    public abstract void a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, to = 1.0d) float f6, boolean z10, boolean z11);

    public abstract void b(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11);

    public abstract void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10);

    public abstract void d(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10, @ColorInt int i10, @IntRange(from = 0, to = ScatterMapKt.Sentinel) int i11, @Px int i12);

    public abstract int e();

    public abstract int f();
}
