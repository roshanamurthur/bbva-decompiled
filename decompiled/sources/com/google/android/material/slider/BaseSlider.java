package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.bbva.nativesettings.common.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    public static final int M1 = R.style.Widget_MaterialComponents_Slider;
    public static final int N1 = R.attr.motionDurationMedium4;
    public static final int O1 = R.attr.motionDurationShort3;
    public static final int P1 = R.attr.motionEasingEmphasizedInterpolator;
    public static final int Q1 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    @NonNull
    public ColorStateList A1;

    @NonNull
    public ColorStateList B1;

    @NonNull
    public ColorStateList C1;

    @NonNull
    public final Path D1;
    public final int E0;

    @NonNull
    public final RectF E1;

    @NonNull
    public final ArrayList F0;

    @NonNull
    public final RectF F1;

    @NonNull
    public final ArrayList G0;

    @NonNull
    public final MaterialShapeDrawable G1;

    @NonNull
    public final ArrayList H0;

    @Nullable
    public Drawable H1;
    public boolean I0;

    @NonNull
    public List<Drawable> I1;
    public ValueAnimator J0;
    public float J1;
    public ValueAnimator K0;
    public int K1;
    public final int L0;

    @NonNull
    public final com.google.android.material.slider.a L1;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public final int Q0;
    public final int R0;

    @Px
    public final int S0;
    public final int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f45363a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f45364b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f45365c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f45366d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f45367e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f45368f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final int f45369g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public float f45370h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public MotionEvent f45371i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public LabelFormatter f45372j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f45373k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public float f45374l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public float f45375m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public ArrayList<Float> f45376n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f45377o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Paint f45378p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f45379p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final Paint f45380q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public float f45381q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final Paint f45382r0;
    public float[] r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public final Paint f45383s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f45384s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NonNull
    public final Paint f45385t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f45386t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NonNull
    public final Paint f45387u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f45388u1;

    @NonNull
    public final Paint v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f45389v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NonNull
    public final e f45390w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f45391w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final AccessibilityManager f45392x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f45393x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public BaseSlider<S, L, T>.d f45394y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @NonNull
    public ColorStateList f45395y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @NonNull
    public ColorStateList f45396z1;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f45397p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public float f45398q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public ArrayList<Float> f45399r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public float f45400s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f45401t0;

        public class a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SliderState createFromParcel(@NonNull Parcel parcel) {
                SliderState sliderState = new SliderState(parcel);
                sliderState.f45397p0 = parcel.readFloat();
                sliderState.f45398q0 = parcel.readFloat();
                ArrayList<Float> arrayList = new ArrayList<>();
                sliderState.f45399r0 = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                sliderState.f45400s0 = parcel.readFloat();
                sliderState.f45401t0 = parcel.createBooleanArray()[0];
                return sliderState;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SliderState[] newArray(int i10) {
                return new SliderState[i10];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f45397p0);
            parcel.writeFloat(this.f45398q0);
            parcel.writeList(this.f45399r0);
            parcel.writeFloat(this.f45400s0);
            parcel.writeBooleanArray(new boolean[]{this.f45401t0});
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseSlider baseSlider = BaseSlider.this;
            Iterator it = baseSlider.F0.iterator();
            while (it.hasNext()) {
                ((TooltipDrawable) it.next()).setRevealFraction(fFloatValue);
            }
            ViewCompat.postInvalidateOnAnimation(baseSlider);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            BaseSlider baseSlider = BaseSlider.this;
            ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(baseSlider);
            Iterator it = baseSlider.F0.iterator();
            while (it.hasNext()) {
                contentViewOverlay.remove((TooltipDrawable) it.next());
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45404a;

        static {
            int[] iArr = new int[f.values().length];
            f45404a = iArr;
            try {
                iArr[f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45404a[f.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45404a[f.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45404a[f.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f45405p0 = -1;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.f45390w0.sendEventForVirtualView(this.f45405p0, 4);
        }
    }

    public static class e extends ExploreByTouchHelper {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f45407n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Rect f45408o;

        public e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f45408o = new Rect();
            this.f45407n = baseSlider;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final int getVirtualViewAt(float f6, float f10) {
            int i10 = 0;
            while (true) {
                BaseSlider<?, ?, ?> baseSlider = this.f45407n;
                if (i10 >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.f45408o;
                baseSlider.s(i10, rect);
                if (rect.contains((int) f6, (int) f10)) {
                    return i10;
                }
                i10++;
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void getVisibleVirtualViews(List<Integer> list) {
            for (int i10 = 0; i10 < this.f45407n.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            BaseSlider<?, ?, ?> baseSlider = this.f45407n;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 != 16908349 || bundle == null || !bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) || !baseSlider.r(bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE), i10)) {
                    return false;
                }
                baseSlider.t();
                baseSlider.postInvalidate();
                invalidateVirtualView(i10);
                return true;
            }
            float fRound = baseSlider.f45381q1;
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            float f6 = (baseSlider.f45375m1 - baseSlider.f45374l1) / fRound;
            float f10 = 20;
            if (f6 > f10) {
                fRound *= Math.round(f6 / f10);
            }
            if (i11 == 8192) {
                fRound = -fRound;
            }
            if (baseSlider.k()) {
                fRound = -fRound;
            }
            if (!baseSlider.r(MathUtils.clamp(baseSlider.getValues().get(i10).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()), i10)) {
                return false;
            }
            baseSlider.t();
            baseSlider.postInvalidate();
            invalidateVirtualView(i10);
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onPopulateNodeForVirtualView(int i10, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String string;
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            BaseSlider<?, ?, ?> baseSlider = this.f45407n;
            List<Float> values = baseSlider.getValues();
            float fFloatValue = values.get(i10).floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (fFloatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, fFloatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb2.append(baseSlider.getContentDescription());
                sb2.append(",");
            }
            String strG = baseSlider.g(fFloatValue);
            String string2 = baseSlider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                if (i10 == baseSlider.getValues().size() - 1) {
                    string = baseSlider.getContext().getString(R.string.material_slider_range_end);
                } else {
                    string = i10 == 0 ? baseSlider.getContext().getString(R.string.material_slider_range_start) : "";
                }
                string2 = string;
            }
            sb2.append(String.format(Locale.US, "%s, %s", string2, strG));
            accessibilityNodeInfoCompat.setContentDescription(sb2.toString());
            Rect rect = this.f45408o;
            baseSlider.s(i10, rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f BOTH;
        public static final f LEFT;
        public static final f NONE;
        public static final f RIGHT;

        static {
            f fVar = new f("BOTH", 0);
            BOTH = fVar;
            f fVar2 = new f("LEFT", 1);
            LEFT = fVar2;
            f fVar3 = new f("RIGHT", 2);
            RIGHT = fVar3;
            f fVar4 = new f(ExpectedUserActionOnPoiTypes.NONE, 3);
            NONE = fVar4;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    private float[] getActiveRange() {
        float fFloatValue = this.f45376n1.get(0).floatValue();
        float fFloatValue2 = ((Float) androidx.appcompat.view.menu.b.b(this.f45376n1, 1)).floatValue();
        if (this.f45376n1.size() == 1) {
            fFloatValue = this.f45374l1;
        }
        float fO = o(fFloatValue);
        float fO2 = o(fFloatValue2);
        return k() ? new float[]{fO2, fO} : new float[]{fO, fO2};
    }

    private float getValueOfTouchPosition() {
        double dRound;
        float f6 = this.J1;
        float f10 = this.f45381q1;
        if (f10 > 0.0f) {
            int i10 = (int) ((this.f45375m1 - this.f45374l1) / f10);
            dRound = ((double) Math.round(f6 * i10)) / ((double) i10);
        } else {
            dRound = f6;
        }
        if (k()) {
            dRound = 1.0d - dRound;
        }
        float f11 = this.f45375m1;
        float f12 = this.f45374l1;
        return (float) ((dRound * ((double) (f11 - f12))) + ((double) f12));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f6 = this.J1;
        if (k()) {
            f6 = 1.0f - f6;
        }
        float f10 = this.f45375m1;
        float f11 = this.f45374l1;
        return androidx.datastore.preferences.protobuf.e.a(f10, f11, f6, f11);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        ViewOverlayImpl contentViewOverlay;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f45376n1.size() == arrayList.size() && this.f45376n1.equals(arrayList)) {
            return;
        }
        this.f45376n1 = arrayList;
        this.f45393x1 = true;
        this.f45379p1 = 0;
        t();
        ArrayList arrayList2 = this.F0;
        if (arrayList2.size() > this.f45376n1.size()) {
            List<TooltipDrawable> listSubList = arrayList2.subList(this.f45376n1.size(), arrayList2.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (ViewCompat.isAttachedToWindow(this) && (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) != null) {
                    contentViewOverlay.remove(tooltipDrawable);
                    tooltipDrawable.detachView(ViewUtils.getContentView(this));
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f45376n1.size()) {
            TooltipDrawable tooltipDrawableCreateFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.E0);
            arrayList2.add(tooltipDrawableCreateFromAttributes);
            if (ViewCompat.isAttachedToWindow(this)) {
                tooltipDrawableCreateFromAttributes.setRelativeToView(ViewUtils.getContentView(this));
            }
        }
        int i10 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((TooltipDrawable) it.next()).setStrokeWidth(i10);
        }
        for (BaseOnChangeListener baseOnChangeListener : this.G0) {
            Iterator<Float> it2 = this.f45376n1.iterator();
            while (it2.hasNext()) {
                baseOnChangeListener.onValueChange(this, it2.next().floatValue(), false);
            }
        }
        postInvalidate();
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.Y0, this.Z0);
        } else {
            float fMax = Math.max(this.Y0, this.Z0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public void addOnChangeListener(@NonNull L l6) {
        this.G0.add(l6);
    }

    public void addOnSliderTouchListener(@NonNull T t10) {
        this.H0.add(t10);
    }

    public final int b() {
        int i10 = this.U0 / 2;
        int i11 = this.V0;
        return i10 + ((i11 == 1 || i11 == 3) ? ((TooltipDrawable) this.F0.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator c(boolean z10) {
        int iResolveThemeDuration;
        TimeInterpolator timeInterpolatorResolveThemeInterpolator;
        float fFloatValue = z10 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z10 ? this.K0 : this.J0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z10 ? 1.0f : 0.0f);
        if (z10) {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), N1, 83);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), P1, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), O1, 117);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), Q1, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(iResolveThemeDuration);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorResolveThemeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new a());
        return valueAnimatorOfFloat;
    }

    public void clearOnChangeListeners() {
        this.G0.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.H0.clear();
    }

    public final void d(@NonNull Canvas canvas, int i10, int i11, float f6, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.X0 + ((int) (o(f6) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f45390w0.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f45378p0.setColor(h(this.C1));
        this.f45380q0.setColor(h(this.B1));
        this.f45385t0.setColor(h(this.A1));
        this.f45387u0.setColor(h(this.f45396z1));
        this.v0.setColor(h(this.B1));
        for (TooltipDrawable tooltipDrawable : this.F0) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        MaterialShapeDrawable materialShapeDrawable = this.G1;
        if (materialShapeDrawable.isStateful()) {
            materialShapeDrawable.setState(getDrawableState());
        }
        Paint paint = this.f45383s0;
        paint.setColor(h(this.f45395y1));
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.I0) {
            this.I0 = true;
            ValueAnimator valueAnimatorC = c(true);
            this.J0 = valueAnimatorC;
            this.K0 = null;
            valueAnimatorC.start();
        }
        ArrayList arrayList = this.F0;
        Iterator it = arrayList.iterator();
        for (int i10 = 0; i10 < this.f45376n1.size() && it.hasNext(); i10++) {
            if (i10 != this.f45379p1) {
                q((TooltipDrawable) it.next(), this.f45376n1.get(i10).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f45376n1.size())));
        }
        q((TooltipDrawable) it.next(), this.f45376n1.get(this.f45379p1).floatValue());
    }

    public final void f() {
        if (this.I0) {
            this.I0 = false;
            ValueAnimator valueAnimatorC = c(false);
            this.K0 = valueAnimatorC;
            this.J0 = null;
            valueAnimatorC.addListener(new b());
            this.K0.start();
        }
    }

    public final String g(float f6) {
        if (hasLabelFormatter()) {
            return this.f45372j1.getFormattedValue(f6);
        }
        return String.format(((float) ((int) f6)) == f6 ? "%.0f" : "%.2f", Float.valueOf(f6));
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f45390w0.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f45377o1;
    }

    public int getFocusedThumbIndex() {
        return this.f45379p1;
    }

    @Px
    public int getHaloRadius() {
        return this.f45363a1;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f45395y1;
    }

    public int getLabelBehavior() {
        return this.V0;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f45381q1;
    }

    public float getThumbElevation() {
        return this.G1.getElevation();
    }

    @Px
    public int getThumbHeight() {
        return this.Z0;
    }

    @Px
    public int getThumbRadius() {
        return this.Y0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.G1.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.G1.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.G1.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.f45364b1;
    }

    @Px
    public int getThumbWidth() {
        return this.Y0;
    }

    @Px
    public int getTickActiveRadius() {
        return this.f45386t1;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f45396z1;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.f45388u1;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.A1;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.A1.equals(this.f45396z1)) {
            return this.f45396z1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.B1;
    }

    @Px
    public int getTrackHeight() {
        return this.W0;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.C1;
    }

    public int getTrackInsideCornerSize() {
        return this.f45368f1;
    }

    @Px
    public int getTrackSidePadding() {
        return this.X0;
    }

    public int getTrackStopIndicatorSize() {
        return this.f45367e1;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.C1.equals(this.B1)) {
            return this.B1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.f45389v1;
    }

    public float getValueFrom() {
        return this.f45374l1;
    }

    public float getValueTo() {
        return this.f45375m1;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f45376n1);
    }

    @ColorInt
    public final int h(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public boolean hasLabelFormatter() {
        return this.f45372j1 != null;
    }

    public final boolean i(double d2) {
        double dDoubleValue = new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Float.toString(this.f45381q1)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public boolean isTickVisible() {
        return this.f45384s1;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final void l() {
        if (this.f45381q1 <= 0.0f) {
            return;
        }
        x();
        int iMin = Math.min((int) (((this.f45375m1 - this.f45374l1) / this.f45381q1) + 1.0f), (this.f45389v1 / this.R0) + 1);
        float[] fArr = this.r1;
        if (fArr == null || fArr.length != iMin * 2) {
            this.r1 = new float[iMin * 2];
        }
        float f6 = this.f45389v1 / (iMin - 1);
        for (int i10 = 0; i10 < iMin * 2; i10 += 2) {
            float[] fArr2 = this.r1;
            fArr2[i10] = ((i10 / 2.0f) * f6) + this.X0;
            fArr2[i10 + 1] = b();
        }
    }

    public final boolean m(int i10) {
        int i11 = this.f45379p1;
        int iClamp = (int) MathUtils.clamp(((long) i11) + ((long) i10), 0L, this.f45376n1.size() - 1);
        this.f45379p1 = iClamp;
        if (iClamp == i11) {
            return false;
        }
        if (this.f45377o1 != -1) {
            this.f45377o1 = iClamp;
        }
        t();
        postInvalidate();
        return true;
    }

    public final void n(int i10) {
        if (k()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        m(i10);
    }

    public final float o(float f6) {
        float f10 = this.f45374l1;
        float f11 = (f6 - f10) / (this.f45375m1 - f10);
        return k() ? 1.0f - f11 : f11;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.L1);
        Iterator it = this.F0.iterator();
        while (it.hasNext()) {
            ((TooltipDrawable) it.next()).setRelativeToView(ViewUtils.getContentView(this));
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f45394y0;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.I0 = false;
        for (TooltipDrawable tooltipDrawable : this.F0) {
            ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
            if (contentViewOverlay != null) {
                contentViewOverlay.remove(tooltipDrawable);
                tooltipDrawable.detachView(ViewUtils.getContentView(this));
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.L1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0177  */
    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int i10;
        float f6;
        if (this.f45393x1) {
            x();
            l();
        }
        super.onDraw(canvas);
        int iB = b();
        float fFloatValue = this.f45376n1.get(0).floatValue();
        float fFloatValue2 = ((Float) androidx.appcompat.view.menu.b.b(this.f45376n1, 1)).floatValue();
        float f10 = this.f45375m1;
        RectF rectF = this.E1;
        if (fFloatValue2 < f10 || (this.f45376n1.size() > 1 && fFloatValue > this.f45374l1)) {
            int i11 = this.f45389v1;
            float[] activeRange = getActiveRange();
            int i12 = this.X0;
            float f11 = i11;
            float f12 = i12 + (activeRange[1] * f11);
            float f13 = i12 + i11;
            Paint paint = this.f45378p0;
            if (f12 < f13) {
                int i13 = this.f45364b1;
                if (i13 > 0) {
                    float f14 = f12 + i13;
                    float f15 = iB;
                    float f16 = this.W0 / 2.0f;
                    rectF.set(f14, f15 - f16, i12 + i11 + f16, f16 + f15);
                    v(canvas, paint, rectF, f.RIGHT);
                } else {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f17 = iB;
                    canvas.drawLine(f12, f17, this.X0 + i11, f17, paint);
                }
            }
            int i14 = this.X0;
            float f18 = i14;
            float f19 = (activeRange[0] * f11) + f18;
            if (f19 > f18) {
                int i15 = this.f45364b1;
                if (i15 > 0) {
                    float f20 = this.W0 / 2.0f;
                    float f21 = iB;
                    rectF.set(i14 - f20, f21 - f20, f19 - i15, f20 + f21);
                    v(canvas, paint, rectF, f.LEFT);
                } else {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f22 = iB;
                    canvas.drawLine(this.X0, f22, f19, f22, paint);
                }
            }
        }
        if (fFloatValue2 > this.f45374l1) {
            int i16 = this.f45389v1;
            float[] activeRange2 = getActiveRange();
            float f23 = this.X0;
            float f24 = i16;
            float fZ = (activeRange2[1] * f24) + f23;
            float fZ2 = (activeRange2[0] * f24) + f23;
            boolean z10 = this.f45364b1 > 0;
            Paint paint2 = this.f45380q0;
            if (z10) {
                f fVar = f.NONE;
                if (this.f45376n1.size() == 1) {
                    fVar = k() ? f.RIGHT : f.LEFT;
                }
                for (int i17 = 0; i17 < this.f45376n1.size(); i17++) {
                    if (this.f45376n1.size() > 1) {
                        if (i17 > 0) {
                            fZ2 = z(this.f45376n1.get(i17 - 1).floatValue());
                        }
                        fZ = z(this.f45376n1.get(i17).floatValue());
                        if (k()) {
                            fZ = fZ2;
                            fZ2 = fZ;
                        }
                    }
                    int i18 = c.f45404a[fVar.ordinal()];
                    if (i18 != 1) {
                        if (i18 == 2) {
                            fZ2 -= this.W0 / 2.0f;
                            f6 = this.f45364b1;
                        } else if (i18 == 3) {
                            fZ2 += this.f45364b1;
                            fZ = (this.W0 / 2.0f) + fZ;
                        }
                        if (fZ2 >= fZ) {
                            float f25 = iB;
                            float f26 = this.W0 / 2.0f;
                            rectF.set(fZ2, f25 - f26, fZ, f26 + f25);
                            v(canvas, paint2, rectF, fVar);
                        }
                    } else {
                        f6 = this.f45364b1;
                        fZ2 += f6;
                    }
                    fZ -= f6;
                    if (fZ2 >= fZ) {
                        float f27 = iB;
                        float f28 = this.W0 / 2.0f;
                        rectF.set(fZ2, f27 - f28, fZ, f28 + f27);
                        v(canvas, paint2, rectF, fVar);
                    }
                }
            } else {
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                float f29 = iB;
                canvas.drawLine(fZ2, f29, fZ, f29, paint2);
            }
        }
        if (this.f45384s1 && this.f45381q1 > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int iCeil = (int) Math.ceil(((this.r1.length / 2.0f) - 1.0f) * activeRange3[0]);
            int iFloor = (int) Math.floor(((this.r1.length / 2.0f) - 1.0f) * activeRange3[1]);
            Paint paint3 = this.f45385t0;
            if (iCeil > 0) {
                canvas.drawPoints(this.r1, 0, iCeil * 2, paint3);
            }
            if (iCeil <= iFloor) {
                i10 = 1;
                canvas.drawPoints(this.r1, iCeil * 2, ((iFloor - iCeil) + 1) * 2, this.f45387u0);
            } else {
                i10 = 1;
            }
            int i19 = (iFloor + i10) * 2;
            float[] fArr = this.r1;
            if (i19 < fArr.length) {
                canvas.drawPoints(fArr, i19, fArr.length - i19, paint3);
            }
        }
        if (this.f45367e1 > 0) {
            int size = this.f45376n1.size();
            Paint paint4 = this.v0;
            if (size >= 1) {
                float fFloatValue3 = ((Float) androidx.appcompat.view.menu.b.b(this.f45376n1, 1)).floatValue();
                float f30 = this.f45375m1;
                if (fFloatValue3 < f30) {
                    canvas.drawPoint(z(f30), iB, paint4);
                }
            }
            if (this.f45376n1.size() > 1) {
                float fFloatValue4 = this.f45376n1.get(0).floatValue();
                float f31 = this.f45374l1;
                if (fFloatValue4 > f31) {
                    canvas.drawPoint(z(f31), iB, paint4);
                }
            }
        }
        if ((this.f45373k1 || isFocused()) && isEnabled()) {
            int i20 = this.f45389v1;
            if (!(getBackground() instanceof RippleDrawable)) {
                int iO = (int) ((o(this.f45376n1.get(this.f45379p1).floatValue()) * i20) + this.X0);
                if (Build.VERSION.SDK_INT < 28) {
                    int i21 = this.f45363a1;
                    canvas.clipRect(iO - i21, iB - i21, iO + i21, i21 + iB, Region.Op.UNION);
                }
                canvas.drawCircle(iO, iB, this.f45363a1, this.f45383s0);
            }
        }
        u();
        int i22 = this.f45389v1;
        for (int i23 = 0; i23 < this.f45376n1.size(); i23++) {
            float fFloatValue5 = this.f45376n1.get(i23).floatValue();
            Drawable drawable = this.H1;
            if (drawable != null) {
                d(canvas, i22, iB, fFloatValue5, drawable);
            } else if (i23 < this.I1.size()) {
                d(canvas, i22, iB, fFloatValue5, this.I1.get(i23));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((o(fFloatValue5) * i22) + this.X0, iB, getThumbRadius(), this.f45382r0);
                }
                d(canvas, i22, iB, fFloatValue5, this.G1);
            }
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, @Nullable Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        e eVar = this.f45390w0;
        if (!z10) {
            this.f45377o1 = -1;
            eVar.clearKeyboardFocusForVirtualView(this.f45379p1);
            return;
        }
        if (i10 == 1) {
            m(Integer.MAX_VALUE);
        } else if (i10 == 2) {
            m(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            n(Integer.MAX_VALUE);
        } else if (i10 == 66) {
            n(Integer.MIN_VALUE);
        }
        eVar.requestKeyboardFocusForVirtualView(this.f45379p1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f45376n1.size() == 1) {
            this.f45377o1 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.f45377o1 == -1) {
            if (i10 != 61) {
                if (i10 == 66) {
                    this.f45377o1 = this.f45379p1;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i10 == 81) {
                    m(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i10 == 69) {
                    m(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            n(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            n(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23:
                            this.f45377o1 = this.f45379p1;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    m(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(m(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(m(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i10, keyEvent);
        }
        boolean zIsLongPress = this.f45391w1 | keyEvent.isLongPress();
        this.f45391w1 = zIsLongPress;
        float fRound = 1.0f;
        if (zIsLongPress) {
            float f6 = this.f45381q1;
            fRound = f6 != 0.0f ? f6 : 1.0f;
            float f10 = (this.f45375m1 - this.f45374l1) / fRound;
            float f11 = 20;
            if (f10 > f11) {
                fRound *= Math.round(f10 / f11);
            }
        } else {
            float f12 = this.f45381q1;
            if (f12 != 0.0f) {
                fRound = f12;
            }
        }
        if (i10 == 21) {
            if (!k()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i10 == 22) {
            if (k()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i10 == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i10 == 70 || i10 == 81) {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (r(fValueOf.floatValue() + this.f45376n1.get(this.f45377o1).floatValue(), this.f45377o1)) {
                t();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m(-1);
                }
                return false;
            }
            if (i10 != 66) {
                return super.onKeyDown(i10, keyEvent);
            }
        }
        this.f45377o1 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, @NonNull KeyEvent keyEvent) {
        this.f45391w1 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.U0;
        int i13 = this.V0;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12 + ((i13 == 1 || i13 == 3) ? ((TooltipDrawable) this.F0.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f45374l1 = sliderState.f45397p0;
        this.f45375m1 = sliderState.f45398q0;
        setValuesInternal(sliderState.f45399r0);
        this.f45381q1 = sliderState.f45400s0;
        if (sliderState.f45401t0) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f45397p0 = this.f45374l1;
        sliderState.f45398q0 = this.f45375m1;
        sliderState.f45399r0 = new ArrayList<>(this.f45376n1);
        sliderState.f45400s0 = this.f45381q1;
        sliderState.f45401t0 = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f45389v1 = Math.max(i10 - (this.X0 * 2), 0);
        l();
        t();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4 A[LOOP:0: B:46:0x00de->B:48:0x00e4, LOOP_END] */
    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        Iterator it;
        int i10;
        float f6;
        if (!isEnabled()) {
            return false;
        }
        float x4 = motionEvent.getX();
        float f10 = (x4 - this.X0) / this.f45389v1;
        this.J1 = f10;
        float fMax = Math.max(0.0f, f10);
        this.J1 = fMax;
        this.J1 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i11 = this.L0;
            if (actionMasked == 1) {
                this.f45373k1 = false;
                motionEvent2 = this.f45371i1;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                    f6 = i11;
                    if (Math.abs(this.f45371i1.getX() - motionEvent.getX()) <= f6 && Math.abs(this.f45371i1.getY() - motionEvent.getY()) <= f6 && pickActiveThumb()) {
                        p();
                    }
                }
                if (this.f45377o1 != -1) {
                    r(getValueOfTouchPosition(), this.f45377o1);
                    t();
                    if (this.f45364b1 > 0 && (i10 = this.f45365c1) != -1 && this.f45366d1 != -1) {
                        setThumbWidth(i10);
                        setThumbTrackGapSize(this.f45366d1);
                    }
                    this.f45377o1 = -1;
                    it = this.H0.iterator();
                    while (it.hasNext()) {
                        ((BaseOnSliderTouchListener) it.next()).onStopTrackingTouch(this);
                    }
                }
                invalidate();
            } else if (actionMasked == 2) {
                if (!this.f45373k1) {
                    if (j(motionEvent) && Math.abs(x4 - this.f45370h1) < i11) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    p();
                }
                if (pickActiveThumb()) {
                    this.f45373k1 = true;
                    r(getValueOfTouchPosition(), this.f45377o1);
                    t();
                    invalidate();
                }
            } else if (actionMasked == 3) {
                this.f45373k1 = false;
                motionEvent2 = this.f45371i1;
                if (motionEvent2 != null) {
                    f6 = i11;
                    if (Math.abs(this.f45371i1.getX() - motionEvent.getX()) <= f6) {
                        p();
                    }
                }
                if (this.f45377o1 != -1) {
                    r(getValueOfTouchPosition(), this.f45377o1);
                    t();
                    if (this.f45364b1 > 0) {
                        setThumbWidth(i10);
                        setThumbTrackGapSize(this.f45366d1);
                    }
                    this.f45377o1 = -1;
                    it = this.H0.iterator();
                    while (it.hasNext()) {
                        ((BaseOnSliderTouchListener) it.next()).onStopTrackingTouch(this);
                    }
                }
                invalidate();
            }
        } else {
            this.f45370h1 = x4;
            if (!j(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.f45373k1 = true;
                    r(getValueOfTouchPosition(), this.f45377o1);
                    t();
                    int i12 = this.f45364b1;
                    if (i12 > 0) {
                        int i13 = this.Y0;
                        this.f45365c1 = i13;
                        this.f45366d1 = i12;
                        int iRound = Math.round(i13 * 0.5f);
                        int i14 = this.Y0 - iRound;
                        setThumbWidth(iRound);
                        setThumbTrackGapSize(this.f45364b1 - (i14 / 2));
                    }
                    invalidate();
                    p();
                }
            }
        }
        setPressed(this.f45373k1);
        this.f45371i1 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        ViewOverlayImpl contentViewOverlay;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) == null) {
            return;
        }
        Iterator it = this.F0.iterator();
        while (it.hasNext()) {
            contentViewOverlay.remove((TooltipDrawable) it.next());
        }
    }

    public final void p() {
        Iterator it = this.H0.iterator();
        while (it.hasNext()) {
            ((BaseOnSliderTouchListener) it.next()).onStartTrackingTouch(this);
        }
    }

    public boolean pickActiveThumb() {
        if (this.f45377o1 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fZ = z(valueOfTouchPositionAbsolute);
        this.f45377o1 = 0;
        float fAbs = Math.abs(this.f45376n1.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.f45376n1.size(); i10++) {
            float fAbs2 = Math.abs(this.f45376n1.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float fZ2 = z(this.f45376n1.get(i10).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z10 = !k() ? fZ2 - fZ >= 0.0f : fZ2 - fZ <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f45377o1 = i10;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fZ2 - fZ) < this.L0) {
                        this.f45377o1 = -1;
                        return false;
                    }
                    if (z10) {
                        this.f45377o1 = i10;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f45377o1 != -1;
    }

    public final void q(TooltipDrawable tooltipDrawable, float f6) {
        tooltipDrawable.setText(g(f6));
        int iO = (this.X0 + ((int) (o(f6) * this.f45389v1))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int iB = b() - ((this.Z0 / 2) + this.f45369g1);
        tooltipDrawable.setBounds(iO, iB - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + iO, iB);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    public final boolean r(float f6, int i10) {
        this.f45379p1 = i10;
        if (Math.abs(f6 - this.f45376n1.get(i10).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.K1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f10 = (minSeparation - this.X0) / this.f45389v1;
                float f11 = this.f45374l1;
                minSeparation = androidx.datastore.preferences.protobuf.e.a(f11, this.f45375m1, f10, f11);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        this.f45376n1.set(i10, Float.valueOf(MathUtils.clamp(f6, i12 < 0 ? this.f45374l1 : minSeparation + this.f45376n1.get(i12).floatValue(), i11 >= this.f45376n1.size() ? this.f45375m1 : this.f45376n1.get(i11).floatValue() - minSeparation)));
        Iterator it = this.G0.iterator();
        while (it.hasNext()) {
            ((BaseOnChangeListener) it.next()).onValueChange(this, this.f45376n1.get(i10).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f45392x0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.d dVar = this.f45394y0;
            if (dVar == null) {
                this.f45394y0 = new d();
            } else {
                removeCallbacks(dVar);
            }
            BaseSlider<S, L, T>.d dVar2 = this.f45394y0;
            dVar2.f45405p0 = i10;
            postDelayed(dVar2, 200L);
        }
        return true;
    }

    public void removeOnChangeListener(@NonNull L l6) {
        this.G0.remove(l6);
    }

    public void removeOnSliderTouchListener(@NonNull T t10) {
        this.H0.remove(t10);
    }

    public final void s(int i10, Rect rect) {
        int iO = this.X0 + ((int) (o(getValues().get(i10).floatValue()) * this.f45389v1));
        int iB = b();
        int iMax = Math.max(this.Y0 / 2, this.S0 / 2);
        int iMax2 = Math.max(this.Z0 / 2, this.S0 / 2);
        rect.set(iO - iMax, iB - iMax2, iO + iMax, iB + iMax2);
    }

    public void setActiveThumbIndex(int i10) {
        this.f45377o1 = i10;
    }

    public void setCustomThumbDrawable(@DrawableRes int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f45376n1.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f45379p1 = i10;
        this.f45390w0.requestKeyboardFocusForVirtualView(i10);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = 0) @Px int i10) {
        if (i10 == this.f45363a1) {
            return;
        }
        this.f45363a1 = i10;
        Drawable background = getBackground();
        if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.f45363a1);
        }
    }

    public void setHaloRadiusResource(@DimenRes int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f45395y1)) {
            return;
        }
        this.f45395y1 = colorStateList;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f45383s0;
        paint.setColor(h(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.V0 != i10) {
            this.V0 = i10;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.f45372j1 = labelFormatter;
    }

    public void setSeparationUnit(int i10) {
        this.K1 = i10;
        this.f45393x1 = true;
        postInvalidate();
    }

    public void setStepSize(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f6), Float.valueOf(this.f45374l1), Float.valueOf(this.f45375m1)));
        }
        if (this.f45381q1 != f6) {
            this.f45381q1 = f6;
            this.f45393x1 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f6) {
        this.G1.setElevation(f6);
    }

    public void setThumbElevationResource(@DimenRes int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbHeight(@IntRange(from = 0) @Px int i10) {
        if (i10 == this.Z0) {
            return;
        }
        this.Z0 = i10;
        this.G1.setBounds(0, 0, this.Y0, i10);
        Drawable drawable = this.H1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator<Drawable> it = this.I1.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        w();
    }

    public void setThumbHeightResource(@DimenRes int i10) {
        setThumbHeight(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbRadius(@IntRange(from = 0) @Px int i10) {
        int i11 = i10 * 2;
        setThumbWidth(i11);
        setThumbHeight(i11);
    }

    public void setThumbRadiusResource(@DimenRes int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.G1.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f6) {
        this.G1.setStrokeWidth(f6);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.G1;
        if (colorStateList.equals(materialShapeDrawable.getFillColor())) {
            return;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i10) {
        if (this.f45364b1 == i10) {
            return;
        }
        this.f45364b1 = i10;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0) @Px int i10) {
        if (i10 == this.Y0) {
            return;
        }
        this.Y0 = i10;
        MaterialShapeDrawable materialShapeDrawable = this.G1;
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.Y0 / 2.0f).build());
        materialShapeDrawable.setBounds(0, 0, this.Y0, this.Z0);
        Drawable drawable = this.H1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator<Drawable> it = this.I1.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        w();
    }

    public void setThumbWidthResource(@DimenRes int i10) {
        setThumbWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setTickActiveRadius(@IntRange(from = 0) @Px int i10) {
        if (this.f45386t1 != i10) {
            this.f45386t1 = i10;
            this.f45387u0.setStrokeWidth(i10 * 2);
            w();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f45396z1)) {
            return;
        }
        this.f45396z1 = colorStateList;
        this.f45387u0.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0) @Px int i10) {
        if (this.f45388u1 != i10) {
            this.f45388u1 = i10;
            this.f45385t0.setStrokeWidth(i10 * 2);
            w();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.A1)) {
            return;
        }
        this.A1 = colorStateList;
        this.f45385t0.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.f45384s1 != z10) {
            this.f45384s1 = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.B1)) {
            return;
        }
        this.B1 = colorStateList;
        this.f45380q0.setColor(h(colorStateList));
        this.v0.setColor(h(this.B1));
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Px int i10) {
        if (this.W0 != i10) {
            this.W0 = i10;
            this.f45378p0.setStrokeWidth(i10);
            this.f45380q0.setStrokeWidth(this.W0);
            w();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.C1)) {
            return;
        }
        this.C1 = colorStateList;
        this.f45378p0.setColor(h(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i10) {
        if (this.f45368f1 == i10) {
            return;
        }
        this.f45368f1 = i10;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i10) {
        if (this.f45367e1 == i10) {
            return;
        }
        this.f45367e1 = i10;
        this.v0.setStrokeWidth(i10);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f6) {
        this.f45374l1 = f6;
        this.f45393x1 = true;
        postInvalidate();
    }

    public void setValueTo(float f6) {
        this.f45375m1 = f6;
        this.f45393x1 = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public final void t() {
        if ((!(getBackground() instanceof RippleDrawable)) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iO = (int) ((o(this.f45376n1.get(this.f45379p1).floatValue()) * this.f45389v1) + this.X0);
            int iB = b();
            int i10 = this.f45363a1;
            DrawableCompat.setHotspotBounds(background, iO - i10, iB - i10, iO + i10, iB + i10);
        }
    }

    public final void u() {
        int i10 = this.V0;
        if (i10 == 0 || i10 == 1) {
            if (this.f45377o1 == -1 || !isEnabled()) {
                f();
                return;
            } else {
                e();
                return;
            }
        }
        if (i10 == 2) {
            f();
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.V0);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            ViewUtils.getContentView(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                e();
                return;
            }
        }
        f();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0083  */
    /* JADX WARN: Code duplicated, block: B:18:0x0095  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a2  */
    public final void v(Canvas canvas, Paint paint, RectF rectF, f fVar) {
        int i10;
        Path path;
        float fMax;
        int i11;
        RectF rectF2;
        int i12 = this.W0;
        float f6 = i12 / 2.0f;
        float f10 = i12 / 2.0f;
        int[] iArr = c.f45404a;
        int i13 = iArr[fVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                i10 = this.f45368f1;
            } else if (i13 == 3) {
                f6 = this.f45368f1;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            path = this.D1;
            path.reset();
            if (rectF.width() >= f6 + f10) {
                path.addRoundRect(rectF, new float[]{f6, f6, f10, f10, f10, f10, f6, f6}, Path.Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            float fMin = Math.min(f6, f10);
            fMax = Math.max(f6, f10);
            canvas.save();
            path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(path);
            i11 = iArr[fVar.ordinal()];
            rectF2 = this.F1;
            if (i11 != 2) {
                float f11 = rectF.left;
                rectF2.set(f11, rectF.top, (2.0f * fMax) + f11, rectF.bottom);
            } else if (i11 != 3) {
                rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                float f12 = rectF.right;
                rectF2.set(f12 - (2.0f * fMax), rectF.top, f12, rectF.bottom);
            }
            canvas.drawRoundRect(rectF2, fMax, fMax, paint);
            canvas.restore();
        }
        i10 = this.f45368f1;
        f6 = i10;
        f10 = i10;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        path = this.D1;
        path.reset();
        if (rectF.width() >= f6 + f10) {
            path.addRoundRect(rectF, new float[]{f6, f6, f10, f10, f10, f10, f6, f6}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin2 = Math.min(f6, f10);
        fMax = Math.max(f6, f10);
        canvas.save();
        path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(path);
        i11 = iArr[fVar.ordinal()];
        rectF2 = this.F1;
        if (i11 != 2) {
            float f13 = rectF.left;
            rectF2.set(f13, rectF.top, (2.0f * fMax) + f13, rectF.bottom);
        } else if (i11 != 3) {
            rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            float f14 = rectF.right;
            rectF2.set(f14 - (2.0f * fMax), rectF.top, f14, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
        canvas.restore();
    }

    public final void w() {
        boolean z10;
        int iMax = Math.max(this.T0, Math.max(this.W0 + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.Z0));
        boolean z11 = false;
        if (iMax == this.U0) {
            z10 = false;
        } else {
            this.U0 = iMax;
            z10 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.Y0 / 2) - this.N0, 0), Math.max((this.W0 - this.O0) / 2, 0)), Math.max(Math.max(this.f45386t1 - this.P0, 0), Math.max(this.f45388u1 - this.Q0, 0))) + this.M0;
        if (this.X0 != iMax2) {
            this.X0 = iMax2;
            if (ViewCompat.isLaidOut(this)) {
                this.f45389v1 = Math.max(getWidth() - (this.X0 * 2), 0);
                l();
            }
            z11 = true;
        }
        if (z10) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public final void x() {
        if (this.f45393x1) {
            float f6 = this.f45374l1;
            float f10 = this.f45375m1;
            if (f6 >= f10) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f45374l1), Float.valueOf(this.f45375m1)));
            }
            if (f10 <= f6) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f45375m1), Float.valueOf(this.f45374l1)));
            }
            if (this.f45381q1 > 0.0f && !y(f10)) {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f45381q1), Float.valueOf(this.f45374l1), Float.valueOf(this.f45375m1)));
            }
            for (Float f11 : this.f45376n1) {
                if (f11.floatValue() < this.f45374l1 || f11.floatValue() > this.f45375m1) {
                    throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f11, Float.valueOf(this.f45374l1), Float.valueOf(this.f45375m1)));
                }
                if (this.f45381q1 > 0.0f && !y(f11.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f11, Float.valueOf(this.f45374l1), Float.valueOf(this.f45381q1), Float.valueOf(this.f45381q1)));
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
            }
            float f12 = this.f45381q1;
            if (f12 > 0.0f && minSeparation > 0.0f) {
                if (this.K1 != 1) {
                    throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f45381q1)));
                }
                if (minSeparation < f12 || !i(minSeparation)) {
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f45381q1), Float.valueOf(this.f45381q1)));
                }
            }
            float f13 = this.f45381q1;
            if (f13 != 0.0f) {
                if (((int) f13) != f13) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f13)));
                }
                float f14 = this.f45374l1;
                if (((int) f14) != f14) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f14)));
                }
                float f15 = this.f45375m1;
                if (((int) f15) != f15) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f15)));
                }
            }
            this.f45393x1 = false;
        }
    }

    public final boolean y(float f6) {
        return i(new BigDecimal(Float.toString(f6)).subtract(new BigDecimal(Float.toString(this.f45374l1)), MathContext.DECIMAL64).doubleValue());
    }

    public final float z(float f6) {
        return (o(f6) * this.f45389v1) + this.X0;
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.H1 = drawableNewDrawable;
        this.I1.clear();
        postInvalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.material.slider.a] */
    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = M1;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = false;
        this.f45365c1 = -1;
        this.f45366d1 = -1;
        this.f45373k1 = false;
        this.f45376n1 = new ArrayList<>();
        this.f45377o1 = -1;
        this.f45379p1 = -1;
        this.f45381q1 = 0.0f;
        this.f45384s1 = true;
        this.f45391w1 = false;
        this.D1 = new Path();
        this.E1 = new RectF();
        this.F1 = new RectF();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.G1 = materialShapeDrawable;
        this.I1 = Collections.emptyList();
        this.K1 = 0;
        this.L1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f45411a.u();
            }
        };
        Context context2 = getContext();
        this.f45378p0 = new Paint();
        this.f45380q0 = new Paint();
        Paint paint = new Paint(1);
        this.f45382r0 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f45383s0 = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f45385t0 = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f45387u0 = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.v0 = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.T0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.M0 = dimensionPixelOffset;
        this.X0 = dimensionPixelOffset;
        this.N0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.O0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        int i12 = R.dimen.mtrl_slider_tick_radius;
        this.P0 = resources.getDimensionPixelSize(i12);
        this.Q0 = resources.getDimensionPixelSize(i12);
        this.R0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f45369g1 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.Slider, i10, i11, new int[0]);
        this.E0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.f45374l1 = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.f45375m1 = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f45374l1));
        this.f45381q1 = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.S0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        int i13 = R.styleable.Slider_trackColor;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i13);
        int i14 = zHasValue ? i13 : R.styleable.Slider_trackColorInactive;
        i13 = zHasValue ? i13 : R.styleable.Slider_trackColorActive;
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i14);
        setTrackInactiveTintList(colorStateList == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_inactive_track_color) : colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i13);
        setTrackActiveTintList(colorStateList2 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_active_track_color) : colorStateList2);
        materialShapeDrawable.setFillColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.Slider_thumbColor));
        int i15 = R.styleable.Slider_thumbStrokeColor;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i15));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.Slider_haloColor);
        setHaloTintList(colorStateList3 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_halo_color) : colorStateList3);
        this.f45384s1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true);
        int i16 = R.styleable.Slider_tickColor;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i16);
        int i17 = zHasValue2 ? i16 : R.styleable.Slider_tickColorInactive;
        i16 = zHasValue2 ? i16 : R.styleable.Slider_tickColorActive;
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i17);
        setTickInactiveTintList(colorStateList4 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i16);
        setTickActiveTintList(colorStateList5 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_active_tick_marks_color) : colorStateList5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, this.f45367e1 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, this.f45367e1 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.L0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.f45390w0 = eVar;
        ViewCompat.setAccessibilityDelegate(this, eVar);
        this.f45392x0 = (AccessibilityManager) getContext().getSystemService(Constants.ACCESSIBILITY);
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.H1 = null;
        this.I1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.I1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
