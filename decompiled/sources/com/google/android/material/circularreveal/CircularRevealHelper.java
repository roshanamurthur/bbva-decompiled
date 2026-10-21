package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.g0;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Delegate f44297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f44298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Path f44299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Paint f44300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Paint f44301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CircularRevealWidget.RevealInfo f44302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f44303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44305i;

    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(Delegate delegate) {
        this.f44297a = delegate;
        View view = (View) delegate;
        this.f44298b = view;
        view.setWillNotDraw(false);
        this.f44299c = new Path();
        this.f44300d = new Paint(7);
        Paint paint = new Paint(1);
        this.f44301e = paint;
        paint.setColor(0);
    }

    public final boolean a() {
        CircularRevealWidget.RevealInfo revealInfo = this.f44302f;
        boolean z10 = revealInfo == null || revealInfo.isInvalid();
        if (STRATEGY == 0) {
            return !z10 && this.f44305i;
        }
        return !z10;
    }

    public final boolean b() {
        return (this.f44304h || Color.alpha(this.f44301e.getColor()) == 0) ? false : true;
    }

    public void buildCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f44304h = true;
            this.f44305i = false;
            View view = this.f44298b;
            view.buildDrawingCache();
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache == null && view.getWidth() != 0 && view.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                view.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f44300d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f44304h = false;
            this.f44305i = true;
        }
    }

    public void destroyCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f44305i = false;
            View view = this.f44298b;
            view.destroyDrawingCache();
            this.f44300d.setShader(null);
            view.invalidate();
        }
    }

    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        boolean zA = a();
        Delegate delegate = this.f44297a;
        Paint paint = this.f44301e;
        View view = this.f44298b;
        if (zA) {
            int i10 = STRATEGY;
            if (i10 == 0) {
                CircularRevealWidget.RevealInfo revealInfo = this.f44302f;
                canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, this.f44300d);
                if (b()) {
                    CircularRevealWidget.RevealInfo revealInfo2 = this.f44302f;
                    canvas.drawCircle(revealInfo2.centerX, revealInfo2.centerY, revealInfo2.radius, paint);
                }
            } else if (i10 == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.f44299c);
                delegate.actualDraw(canvas);
                if (b()) {
                    canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
                }
                canvas.restoreToCount(iSave);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(g0.c("Unsupported strategy ", i10));
                }
                delegate.actualDraw(canvas);
                if (b()) {
                    canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
                }
            }
        } else {
            delegate.actualDraw(canvas);
            if (b()) {
                canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
            }
        }
        if (this.f44304h || (drawable = this.f44303g) == null || this.f44302f == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float fWidth = this.f44302f.centerX - (bounds.width() / 2.0f);
        float fHeight = this.f44302f.centerY - (bounds.height() / 2.0f);
        canvas.translate(fWidth, fHeight);
        this.f44303g.draw(canvas);
        canvas.translate(-fWidth, -fHeight);
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f44303g;
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
        return this.f44301e.getColor();
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        CircularRevealWidget.RevealInfo revealInfo = this.f44302f;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.isInvalid()) {
            float f6 = revealInfo2.centerX;
            float f10 = revealInfo2.centerY;
            View view = this.f44298b;
            revealInfo2.radius = MathUtils.distanceToFurthestCorner(f6, f10, 0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        return revealInfo2;
    }

    public boolean isOpaque() {
        return this.f44297a.actualIsOpaque() && !a();
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f44303g = drawable;
        this.f44298b.invalidate();
    }

    public void setCircularRevealScrimColor(@ColorInt int i10) {
        this.f44301e.setColor(i10);
        this.f44298b.invalidate();
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        View view = this.f44298b;
        if (revealInfo == null) {
            this.f44302f = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.f44302f;
            if (revealInfo2 == null) {
                this.f44302f = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                revealInfo2.set(revealInfo);
            }
            if (MathUtils.geq(revealInfo.radius, MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 0.0f, 0.0f, view.getWidth(), view.getHeight()), 1.0E-4f)) {
                this.f44302f.radius = Float.MAX_VALUE;
            }
        }
        if (STRATEGY == 1) {
            Path path = this.f44299c;
            path.rewind();
            CircularRevealWidget.RevealInfo revealInfo3 = this.f44302f;
            if (revealInfo3 != null) {
                path.addCircle(revealInfo3.centerX, revealInfo3.centerY, revealInfo3.radius, Path.Direction.CW);
            }
        }
        view.invalidate();
    }
}
