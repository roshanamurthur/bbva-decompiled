package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.canvas.CanvasCompat;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class ShapeableDelegate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ShapeAppearanceModel f45331c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45329a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45330b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f45332d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f45333e = new Path();

    @NonNull
    public static ShapeableDelegate create(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 33 ? new d(view) : new c(view);
    }

    public abstract void a(@NonNull View view);

    public abstract boolean b();

    public final void c() {
        RectF rectF = this.f45332d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || this.f45331c == null) {
            return;
        }
        ShapeAppearancePathProvider.getInstance().calculatePath(this.f45331c, 1.0f, this.f45332d, this.f45333e);
    }

    public boolean isForceCompatClippingEnabled() {
        return this.f45329a;
    }

    public void maybeClip(@NonNull Canvas canvas, @NonNull CanvasCompat.CanvasOperation canvasOperation) {
        if (b()) {
            Path path = this.f45333e;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                canvasOperation.run(canvas);
                canvas.restore();
                return;
            }
        }
        canvasOperation.run(canvas);
    }

    public void onMaskChanged(@NonNull View view, @NonNull RectF rectF) {
        this.f45332d = rectF;
        c();
        a(view);
    }

    public void onShapeAppearanceChanged(@NonNull View view, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f45331c = shapeAppearanceModel;
        c();
        a(view);
    }

    public void setForceCompatClippingEnabled(@NonNull View view, boolean z10) {
        if (z10 != this.f45329a) {
            this.f45329a = z10;
            a(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(@NonNull View view, boolean z10) {
        this.f45330b = z10;
        a(view);
    }
}
