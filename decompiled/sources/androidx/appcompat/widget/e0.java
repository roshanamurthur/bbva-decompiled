package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: AppCompatSeekBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f1592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f1594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1597i;

    public e0(SeekBar seekBar) {
        super(seekBar);
        this.f1594f = null;
        this.f1595g = null;
        this.f1596h = false;
        this.f1597i = false;
        this.f1592d = seekBar;
    }

    @Override // androidx.appcompat.widget.c0
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, i10);
        SeekBar seekBar = this.f1592d;
        Context context = seekBar.getContext();
        int[] iArr = R.styleable.AppCompatSeekBar;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar2 = this.f1592d;
        ViewCompat.saveAttributeDataForStyleable(seekBar2, seekBar2.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            seekBar.setThumb(drawableIfKnown);
        }
        Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.AppCompatSeekBar_tickMark);
        Drawable drawable2 = this.f1593e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1593e = drawable;
        if (drawable != null) {
            drawable.setCallback(seekBar);
            DrawableCompat.setLayoutDirection(drawable, seekBar.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        int i11 = R.styleable.AppCompatSeekBar_tickMarkTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f1595g = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i11, -1), this.f1595g);
            this.f1597i = true;
        }
        int i12 = R.styleable.AppCompatSeekBar_tickMarkTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f1594f = tintTypedArrayObtainStyledAttributes.getColorStateList(i12);
            this.f1596h = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1593e;
        if (drawable != null) {
            if (this.f1596h || this.f1597i) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
                this.f1593e = drawableWrap;
                if (this.f1596h) {
                    DrawableCompat.setTintList(drawableWrap, this.f1594f);
                }
                if (this.f1597i) {
                    DrawableCompat.setTintMode(this.f1593e, this.f1595g);
                }
                if (this.f1593e.isStateful()) {
                    this.f1593e.setState(this.f1592d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f1593e != null) {
            SeekBar seekBar = this.f1592d;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1593e.getIntrinsicWidth();
                int intrinsicHeight = this.f1593e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1593e.setBounds(-i10, -i11, i10, i11);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1593e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
