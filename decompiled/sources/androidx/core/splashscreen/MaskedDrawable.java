package androidx.core.splashscreen;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bbva.androidtoolkit.utils.PluginUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MaskedDrawable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014¨\u0006\u0015"}, d2 = {"Landroidx/core/splashscreen/MaskedDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "", "draw", "", "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", PluginUtils.IDENTIFIER_DRAWABLE, "", "maskDiameter", "<init>", "(Landroid/graphics/drawable/Drawable;F)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
public final class MaskedDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Drawable f20076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Path f20077b;

    public MaskedDrawable(@NotNull Drawable drawable, float f6) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f20076a = drawable;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f6 / 2.0f, Path.Direction.CW);
        this.f20077b = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f20077b);
        this.f20076a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20076a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f20076a.setBounds(bounds);
        this.f20077b.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f20076a.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f20076a.setColorFilter(colorFilter);
    }
}
