package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class ClockFaceView extends d implements ClockHandView.OnRotateListener {
    public final float[] E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public String[] J0;
    public float K0;
    public final ColorStateList L0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ClockHandView f45715s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Rect f45716t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final RectF f45717u0;
    public final Rect v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final SparseArray<TextView> f45718w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final b f45719x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int[] f45720y0;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ClockFaceView clockFaceView = ClockFaceView.this;
            if (!clockFaceView.isShown()) {
                return true;
            }
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            clockFaceView.setRadius(((clockFaceView.getHeight() / 2) - clockFaceView.f45715s0.E0) - clockFaceView.F0);
            return true;
        }
    }

    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (iIntValue > 0) {
                accessibilityNodeInfoCompat.setTraversalAfter(ClockFaceView.this.f45718w0.get(iIntValue - 1));
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = ClockFaceView.this;
            view.getHitRect(clockFaceView.f45716t0);
            float fCenterX = clockFaceView.f45716t0.centerX();
            float fCenterY = clockFaceView.f45716t0.centerY();
            clockFaceView.f45715s0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            clockFaceView.f45715s0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.timepicker.d
    public final void a() {
        super.a();
        int i10 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f45718w0;
            if (i10 >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i10).setVisibility(0);
            i10++;
        }
    }

    public final void b() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f45715s0.H0;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f45718w0;
            int size = sparseArray.size();
            rectF = this.f45717u0;
            rect = this.f45716t0;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f6) {
                    textView = textView2;
                    f6 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.v0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f45720y0, this.E0, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.J0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.I0 / Math.max(Math.max(this.G0 / displayMetrics.heightPixels, this.H0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public final void onRotate(float f6, boolean z10) {
        if (Math.abs(this.K0 - f6) > 0.001f) {
            this.K0 = f6;
            b();
        }
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f6) {
        this.f45715s0.setHandRotation(f6);
        b();
    }

    @Override // com.google.android.material.timepicker.d
    public void setRadius(int i10) {
        if (i10 != this.f45772q0) {
            super.setRadius(i10);
            this.f45715s0.setCircleRadius(this.f45772q0);
        }
    }

    public void setValues(String[] strArr, @StringRes int i10) {
        this.J0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray<TextView> sparseArray = this.f45718w0;
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.J0.length, size); i11++) {
            TextView textView = sparseArray.get(i11);
            if (i11 >= this.J0.length) {
                removeView(textView);
                sparseArray.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.J0[i11]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.f45719x0);
                textView.setTextColor(this.L0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.J0[i11]));
                }
            }
        }
        ClockHandView clockHandView = this.f45715s0;
        if (clockHandView.f45730x0 && !z10) {
            clockHandView.O0 = 1;
        }
        clockHandView.f45730x0 = z10;
        clockHandView.invalidate();
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45716t0 = new Rect();
        this.f45717u0 = new RectF();
        this.v0 = new Rect();
        this.f45718w0 = new SparseArray<>();
        this.E0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i10, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.L0 = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f45715s0 = clockHandView;
        this.F0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.f45720y0 = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.f45731y0.add(this);
        int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f45719x0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.G0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.H0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.I0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
