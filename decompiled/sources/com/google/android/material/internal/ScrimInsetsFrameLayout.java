package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Drawable f44872p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Rect f44873q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Rect f44874r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f44875s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f44876t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f44877u0;
    public boolean v0;

    public class a implements OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f44873q0 == null) {
                scrimInsetsFrameLayout.f44873q0 = new Rect();
            }
            scrimInsetsFrameLayout.f44873q0.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            scrimInsetsFrameLayout.onInsetsChanged(windowInsetsCompat);
            scrimInsetsFrameLayout.setWillNotDraw(!windowInsetsCompat.hasSystemWindowInsets() || scrimInsetsFrameLayout.f44872p0 == null);
            ViewCompat.postInvalidateOnAnimation(scrimInsetsFrameLayout);
            return windowInsetsCompat.consumeSystemWindowInsets();
        }
    }

    public ScrimInsetsFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f44873q0 == null || this.f44872p0 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z10 = this.f44875s0;
        Rect rect = this.f44874r0;
        if (z10) {
            rect.set(0, 0, width, this.f44873q0.top);
            this.f44872p0.setBounds(rect);
            this.f44872p0.draw(canvas);
        }
        if (this.f44876t0) {
            rect.set(0, height - this.f44873q0.bottom, width, height);
            this.f44872p0.setBounds(rect);
            this.f44872p0.draw(canvas);
        }
        if (this.f44877u0) {
            Rect rect2 = this.f44873q0;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f44872p0.setBounds(rect);
            this.f44872p0.draw(canvas);
        }
        if (this.v0) {
            Rect rect3 = this.f44873q0;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f44872p0.setBounds(rect);
            this.f44872p0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f44872p0;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f44872p0;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f44876t0 = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f44877u0 = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.v0 = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f44875s0 = z10;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f44872p0 = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44874r0 = new Rect();
        this.f44875s0 = true;
        this.f44876t0 = true;
        this.f44877u0 = true;
        this.v0 = true;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.ScrimInsetsFrameLayout, i10, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f44872p0 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ScrimInsetsFrameLayout_insetForeground);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new a());
    }

    public void onInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
    }
}
