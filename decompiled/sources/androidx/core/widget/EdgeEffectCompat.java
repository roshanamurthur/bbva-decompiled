package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class EdgeEffectCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EdgeEffect f20439a;

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static void a(EdgeEffect edgeEffect, float f6, float f10) {
            edgeEffect.onPull(f6, f10);
        }
    }

    @RequiresApi(31)
    public static class b {
        @DoNotInline
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @DoNotInline
        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @DoNotInline
        public static float c(EdgeEffect edgeEffect, float f6, float f10) {
            try {
                return edgeEffect.onPullDistance(f6, f10);
            } catch (Throwable unused) {
                edgeEffect.onPull(f6, f10);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        this.f20439a = new EdgeEffect(context);
    }

    @NonNull
    public static EdgeEffect create(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public static float getDistance(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float onPullDistance(@NonNull EdgeEffect edgeEffect, float f6, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f6, f10);
        }
        onPull(edgeEffect, f6, f10);
        return f6;
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        return this.f20439a.draw(canvas);
    }

    @Deprecated
    public void finish() {
        this.f20439a.finish();
    }

    @Deprecated
    public boolean isFinished() {
        return this.f20439a.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int i10) {
        this.f20439a.onAbsorb(i10);
        return true;
    }

    @Deprecated
    public boolean onPull(float f6) {
        this.f20439a.onPull(f6);
        return true;
    }

    @Deprecated
    public boolean onRelease() {
        EdgeEffect edgeEffect = this.f20439a;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }

    @Deprecated
    public void setSize(int i10, int i11) {
        this.f20439a.setSize(i10, i11);
    }

    @Deprecated
    public boolean onPull(float f6, float f10) {
        onPull(this.f20439a, f6, f10);
        return true;
    }

    public static void onPull(@NonNull EdgeEffect edgeEffect, float f6, float f10) {
        a.a(edgeEffect, f6, f10);
    }
}
