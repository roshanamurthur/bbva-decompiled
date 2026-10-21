package q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: RoundRectDrawable.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f92728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f92729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f92730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f92731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f92732e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f92735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f92736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f92737j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f92733f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f92734g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f92738k = PorterDuff.Mode.SRC_IN;

    public c(float f6, ColorStateList colorStateList) {
        this.f92728a = f6;
        Paint paint = new Paint(5);
        this.f92729b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f92735h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f92735h.getDefaultColor()));
        this.f92730c = new RectF();
        this.f92731d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f92730c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f92731d;
        rect2.set(rect);
        if (this.f92733f) {
            rect2.inset((int) Math.ceil(d.a(this.f92732e, this.f92728a, this.f92734g)), (int) Math.ceil(d.b(this.f92732e, this.f92728a, this.f92734g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f92729b;
        if (this.f92736i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f92736i);
            z10 = true;
        }
        RectF rectF = this.f92730c;
        float f6 = this.f92728a;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f92731d, this.f92728a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f92737j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f92735h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f92735h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f92729b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f92737j;
        if (colorStateList2 == null || (mode = this.f92738k) == null) {
            return z10;
        }
        this.f92736i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f92729b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f92729b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f92737j = colorStateList;
        this.f92736i = a(colorStateList, this.f92738k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f92738k = mode;
        this.f92736i = a(this.f92737j, mode);
        invalidateSelf();
    }
}
