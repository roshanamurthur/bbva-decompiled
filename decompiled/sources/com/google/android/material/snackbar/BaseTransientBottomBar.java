package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bbva.nativesettings.common.Constants;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f45416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f45417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f45418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ViewGroup f45419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f45420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.snackbar.ContentViewCallback f45421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public f f45424l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @RequiresApi(29)
    public final b f45425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f45430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f45432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f45433v;

    @NonNull
    protected final SnackbarBaseLayout view;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Behavior f45434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f45435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final e f45436y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final TimeInterpolator f45412z = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    public static final TimeInterpolator A = AnimationUtils.LINEAR_INTERPOLATOR;
    public static final TimeInterpolator B = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
    public static final int[] D = {R.attr.snackbarStyle};
    public static final String E = "BaseTransientBottomBar";

    @NonNull
    public static final Handler C = new Handler(Looper.getMainLooper(), new a());

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AnimationMode {
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        @NonNull
        public final BehaviorDelegate F0 = new BehaviorDelegate(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return this.F0.canSwipeDismissView(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.F0.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BehaviorDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f45437a;

        public BehaviorDelegate(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.setStartAlphaSwipeDistance(0.1f);
            swipeDismissBehavior.setEndAlphaSwipeDistance(0.6f);
            swipeDismissBehavior.setSwipeDirection(0);
        }

        public boolean canSwipeDismissView(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    m.b().d(this.f45437a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                m.b().e(this.f45437a);
            }
        }

        public void setBaseTransientBottomBar(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f45437a = baseTransientBottomBar.f45436y;
        }
    }

    @Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @IntRange(from = WorkQueueKt.NOTHING_TO_STEAL)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Duration {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {
        public static final a F0 = new a();
        public boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public BaseTransientBottomBar<?> f45438p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public final ShapeAppearanceModel f45439q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f45440r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final float f45441s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final float f45442t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f45443u0;
        public final int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public ColorStateList f45444w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public PorterDuff.Mode f45445x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        @Nullable
        public Rect f45446y0;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(@NonNull Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f45438p0 = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f45442t0;
        }

        public int getAnimationMode() {
            return this.f45440r0;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f45441s0;
        }

        public int getMaxInlineActionWidth() {
            return this.v0;
        }

        public int getMaxWidth() {
            return this.f45443u0;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f45438p0;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.view.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        baseTransientBottomBar.f45430s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                        baseTransientBottomBar.e();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f45438p0;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.isShownOrQueued()) {
                return;
            }
            BaseTransientBottomBar.C.post(new h(baseTransientBottomBar));
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f45438p0;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f45432u) {
                return;
            }
            baseTransientBottomBar.d();
            baseTransientBottomBar.f45432u = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int i12 = this.f45443u0;
            if (i12 <= 0 || getMeasuredWidth() <= i12) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }

        public void setAnimationMode(int i10) {
            this.f45440r0 = i10;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f45444w0 != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.f45444w0);
                DrawableCompat.setTintMode(drawable, this.f45445x0);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f45444w0 = colorStateList;
            if (getBackground() != null) {
                Drawable drawableWrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(drawableWrap, colorStateList);
                DrawableCompat.setTintMode(drawableWrap, this.f45445x0);
                if (drawableWrap != getBackground()) {
                    super.setBackgroundDrawable(drawableWrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f45445x0 = mode;
            if (getBackground() != null) {
                Drawable drawableWrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(drawableWrap, mode);
                if (drawableWrap != getBackground()) {
                    super.setBackgroundDrawable(drawableWrap);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.E0 || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f45446y0 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f45438p0;
            if (baseTransientBottomBar != null) {
                int i10 = BaseTransientBottomBar.ANIMATION_MODE_SLIDE;
                baseTransientBottomBar.e();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : F0);
            super.setOnClickListener(onClickListener);
        }

        public SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
            Drawable drawable;
            Drawable drawableWrap;
            super(MaterialThemeOverlay.wrap(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            int i10 = R.styleable.SnackbarLayout_elevation;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                ViewCompat.setElevation(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f45440r0 = typedArrayObtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f45439q0 = ShapeAppearanceModel.builder(context2, attributeSet, 0, 0).build();
            }
            this.f45441s0 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f45442t0 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f45443u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(F0);
            setFocusable(true);
            if (getBackground() == null) {
                int iLayer = MaterialColors.layer(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha());
                ShapeAppearanceModel shapeAppearanceModel = this.f45439q0;
                if (shapeAppearanceModel != null) {
                    int i11 = BaseTransientBottomBar.ANIMATION_MODE_SLIDE;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
                    materialShapeDrawable.setFillColor(ColorStateList.valueOf(iLayer));
                    drawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    int i12 = BaseTransientBottomBar.ANIMATION_MODE_SLIDE;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iLayer);
                    drawable = gradientDrawable;
                }
                if (this.f45444w0 != null) {
                    drawableWrap = DrawableCompat.wrap(drawable);
                    DrawableCompat.setTintList(drawableWrap, this.f45444w0);
                } else {
                    drawableWrap = DrawableCompat.wrap(drawable);
                }
                ViewCompat.setBackground(this, drawableWrap);
            }
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i10 = message.what;
            if (i10 == 0) {
                BaseTransientBottomBar<?> baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                if (baseTransientBottomBar.view.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.view.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                        SwipeDismissBehavior<? extends View> newBehavior = baseTransientBottomBar.f45434w;
                        if (newBehavior == null) {
                            newBehavior = baseTransientBottomBar.getNewBehavior();
                        }
                        if (newBehavior instanceof Behavior) {
                            ((Behavior) newBehavior).F0.setBaseTransientBottomBar(baseTransientBottomBar);
                        }
                        newBehavior.setListener(new i(baseTransientBottomBar));
                        layoutParams2.setBehavior(newBehavior);
                        if (baseTransientBottomBar.getAnchorView() == null) {
                            layoutParams2.insetEdge = 80;
                        }
                    }
                    SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.view;
                    snackbarBaseLayout.E0 = true;
                    baseTransientBottomBar.f45419g.addView(snackbarBaseLayout);
                    snackbarBaseLayout.E0 = false;
                    baseTransientBottomBar.c();
                    baseTransientBottomBar.view.setVisibility(4);
                }
                if (ViewCompat.isLaidOut(baseTransientBottomBar.view)) {
                    baseTransientBottomBar.d();
                } else {
                    baseTransientBottomBar.f45432u = true;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i11 = message.arg1;
            AccessibilityManager accessibilityManager = baseTransientBottomBar2.f45435x;
            if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || baseTransientBottomBar2.view.getVisibility() != 0) {
                baseTransientBottomBar2.a(i11);
            } else if (baseTransientBottomBar2.view.getAnimationMode() == 1) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar2.f45416d);
                valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.snackbar.b(baseTransientBottomBar2));
                valueAnimatorOfFloat.setDuration(baseTransientBottomBar2.f45414b);
                valueAnimatorOfFloat.addListener(new com.google.android.material.snackbar.a(baseTransientBottomBar2, i11));
                valueAnimatorOfFloat.start();
            } else {
                ValueAnimator valueAnimator = new ValueAnimator();
                int height = baseTransientBottomBar2.view.getHeight();
                ViewGroup.LayoutParams layoutParams3 = baseTransientBottomBar2.view.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                }
                valueAnimator.setIntValues(0, height);
                valueAnimator.setInterpolator(baseTransientBottomBar2.f45417e);
                valueAnimator.setDuration(baseTransientBottomBar2.f45415c);
                valueAnimator.addListener(new com.google.android.material.snackbar.f(baseTransientBottomBar2, i11));
                valueAnimator.addUpdateListener(new g(baseTransientBottomBar2));
                valueAnimator.start();
            }
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.view == null || (context = baseTransientBottomBar.f45420h) == null) {
                return;
            }
            int iHeight = WindowUtils.getCurrentWindowBounds(context).height();
            int[] iArr = new int[2];
            baseTransientBottomBar.view.getLocationInWindow(iArr);
            int height = (iHeight - (baseTransientBottomBar.view.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.view.getTranslationY());
            int i10 = baseTransientBottomBar.f45430s;
            if (height >= i10) {
                baseTransientBottomBar.f45431t = i10;
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.E, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            int i11 = baseTransientBottomBar.f45430s;
            baseTransientBottomBar.f45431t = i11;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (i11 - height) + marginLayoutParams.bottomMargin;
            baseTransientBottomBar.view.requestLayout();
        }
    }

    public class c implements OnApplyWindowInsetsListener {
        public c() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        @NonNull
        public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            baseTransientBottomBar.f45426o = systemWindowInsetBottom;
            baseTransientBottomBar.f45427p = windowInsetsCompat.getSystemWindowInsetLeft();
            baseTransientBottomBar.f45428q = windowInsetsCompat.getSystemWindowInsetRight();
            baseTransientBottomBar.e();
            return windowInsetsCompat;
        }
    }

    public class d extends AccessibilityDelegateCompat {
        public d() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            BaseTransientBottomBar.this.dismiss();
            return true;
        }
    }

    public class e implements m.b {
        public e() {
        }

        @Override // com.google.android.material.snackbar.m.b
        public final void a(int i10) {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.m.b
        public final void show() {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public static class f implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final WeakReference<BaseTransientBottomBar> f45451p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public final WeakReference<View> f45452q0;

        public f(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.f45451p0 = new WeakReference<>(baseTransientBottomBar);
            this.f45452q0 = new WeakReference<>(view);
        }

        public final void a() {
            WeakReference<View> weakReference = this.f45452q0;
            if (weakReference.get() != null) {
                weakReference.get().removeOnAttachStateChangeListener(this);
                ViewUtils.removeOnGlobalLayoutListener(weakReference.get(), this);
            }
            weakReference.clear();
            this.f45451p0.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            WeakReference<BaseTransientBottomBar> weakReference = this.f45451p0;
            if (weakReference.get() == null) {
                a();
            } else if (weakReference.get().m) {
                weakReference.get().c();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (this.f45451p0.get() == null) {
                a();
            } else {
                ViewUtils.addOnGlobalLayoutListener(view, this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.f45451p0.get() == null) {
                a();
            } else {
                ViewUtils.removeOnGlobalLayoutListener(view, this);
            }
        }
    }

    public BaseTransientBottomBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        this(viewGroup.getContext(), viewGroup, view, contentViewCallback);
    }

    public final void a(int i10) {
        m mVarB = m.b();
        e eVar = this.f45436y;
        synchronized (mVarB.f45473a) {
            try {
                if (mVarB.c(eVar)) {
                    mVarB.f45475c = null;
                    m.c cVar = mVarB.f45476d;
                    if (cVar != null && cVar != null) {
                        mVarB.f45475c = cVar;
                        mVarB.f45476d = null;
                        m.b bVar = cVar.f45478a.get();
                        if (bVar != null) {
                            bVar.show();
                        } else {
                            mVarB.f45475c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = this.f45433v;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f45433v.get(size)).onDismissed(this, i10);
            }
        }
        ViewParent parent = this.view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.view);
        }
    }

    @NonNull
    public B addCallback(@Nullable BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        if (this.f45433v == null) {
            this.f45433v = new ArrayList();
        }
        this.f45433v.add(baseCallback);
        return this;
    }

    public final void b() {
        m mVarB = m.b();
        e eVar = this.f45436y;
        synchronized (mVarB.f45473a) {
            try {
                if (mVarB.c(eVar)) {
                    mVarB.f(mVarB.f45475c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = this.f45433v;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f45433v.get(size)).onShown(this);
            }
        }
    }

    public final void c() {
        int height;
        if (getAnchorView() == null) {
            height = 0;
        } else {
            int[] iArr = new int[2];
            getAnchorView().getLocationOnScreen(iArr);
            int i10 = iArr[1];
            int[] iArr2 = new int[2];
            ViewGroup viewGroup = this.f45419g;
            viewGroup.getLocationOnScreen(iArr2);
            height = (viewGroup.getHeight() + iArr2[1]) - i10;
        }
        this.f45429r = height;
        e();
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f45435x;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            this.view.post(new j(this));
            return;
        }
        if (this.view.getParent() != null) {
            this.view.setVisibility(0);
        }
        b();
    }

    public void dismiss() {
        dispatchDismiss(3);
    }

    public void dispatchDismiss(int i10) {
        m mVarB = m.b();
        e eVar = this.f45436y;
        synchronized (mVarB.f45473a) {
            try {
                if (mVarB.c(eVar)) {
                    mVarB.a(mVarB.f45475c, i10);
                } else {
                    m.c cVar = mVarB.f45476d;
                    if (cVar != null && eVar != null && cVar.f45478a.get() == eVar) {
                        mVarB.a(mVarB.f45476d, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        boolean z10 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = E;
        if (!z10) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        SnackbarBaseLayout snackbarBaseLayout = this.view;
        if (snackbarBaseLayout.f45446y0 == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (snackbarBaseLayout.getParent() == null) {
            return;
        }
        int i10 = getAnchorView() != null ? this.f45429r : this.f45426o;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        SnackbarBaseLayout snackbarBaseLayout2 = this.view;
        Rect rect = snackbarBaseLayout2.f45446y0;
        int i11 = rect.bottom + i10;
        int i12 = rect.left + this.f45427p;
        int i13 = rect.right + this.f45428q;
        int i14 = rect.top;
        boolean z11 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z11) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            snackbarBaseLayout2.requestLayout();
        }
        if ((z11 || this.f45431t != this.f45430s) && Build.VERSION.SDK_INT >= 29 && this.f45430s > 0 && !this.f45423k) {
            ViewGroup.LayoutParams layoutParams2 = this.view.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams2).getBehavior() instanceof SwipeDismissBehavior)) {
                SnackbarBaseLayout snackbarBaseLayout3 = this.view;
                b bVar = this.f45425n;
                snackbarBaseLayout3.removeCallbacks(bVar);
                this.view.post(bVar);
            }
        }
    }

    @Nullable
    public View getAnchorView() {
        f fVar = this.f45424l;
        if (fVar == null) {
            return null;
        }
        return fVar.f45452q0.get();
    }

    public int getAnimationMode() {
        return this.view.getAnimationMode();
    }

    public Behavior getBehavior() {
        return this.f45434w;
    }

    @NonNull
    public Context getContext() {
        return this.f45420h;
    }

    public int getDuration() {
        return this.f45422j;
    }

    @NonNull
    public SwipeDismissBehavior<? extends View> getNewBehavior() {
        return new Behavior();
    }

    @LayoutRes
    public int getSnackbarBaseLayoutResId() {
        return hasSnackbarStyleAttr() ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar;
    }

    @NonNull
    public View getView() {
        return this.view;
    }

    public boolean hasSnackbarStyleAttr() {
        TypedArray typedArrayObtainStyledAttributes = this.f45420h.obtainStyledAttributes(D);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
        return this.m;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f45423k;
    }

    public boolean isShown() {
        boolean zC;
        m mVarB = m.b();
        e eVar = this.f45436y;
        synchronized (mVarB.f45473a) {
            zC = mVarB.c(eVar);
        }
        return zC;
    }

    public boolean isShownOrQueued() {
        boolean z10;
        m.c cVar;
        m mVarB = m.b();
        e eVar = this.f45436y;
        synchronized (mVarB.f45473a) {
            z10 = mVarB.c(eVar) || !((cVar = mVarB.f45476d) == null || eVar == null || cVar.f45478a.get() != eVar);
        }
        return z10;
    }

    @NonNull
    public B removeCallback(@Nullable BaseCallback<B> baseCallback) {
        ArrayList arrayList;
        if (baseCallback == null || (arrayList = this.f45433v) == null) {
            return this;
        }
        arrayList.remove(baseCallback);
        return this;
    }

    @NonNull
    public B setAnchorView(@Nullable View view) {
        f fVar;
        f fVar2 = this.f45424l;
        if (fVar2 != null) {
            fVar2.a();
        }
        if (view == null) {
            fVar = null;
        } else {
            f fVar3 = new f(this, view);
            if (ViewCompat.isAttachedToWindow(view)) {
                ViewUtils.addOnGlobalLayoutListener(view, fVar3);
            }
            view.addOnAttachStateChangeListener(fVar3);
            fVar = fVar3;
        }
        this.f45424l = fVar;
        return this;
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z10) {
        this.m = z10;
    }

    @NonNull
    public B setAnimationMode(int i10) {
        this.view.setAnimationMode(i10);
        return this;
    }

    @NonNull
    public B setBehavior(Behavior behavior) {
        this.f45434w = behavior;
        return this;
    }

    @NonNull
    public B setDuration(int i10) {
        this.f45422j = i10;
        return this;
    }

    @NonNull
    public B setGestureInsetBottomIgnored(boolean z10) {
        this.f45423k = z10;
        return this;
    }

    public void show() {
        m mVarB = m.b();
        int duration = getDuration();
        e eVar = this.f45436y;
        synchronized (mVarB.f45473a) {
            try {
                if (mVarB.c(eVar)) {
                    m.c cVar = mVarB.f45475c;
                    cVar.f45479b = duration;
                    mVarB.f45474b.removeCallbacksAndMessages(cVar);
                    mVarB.f(mVarB.f45475c);
                    return;
                }
                m.c cVar2 = mVarB.f45476d;
                if (cVar2 == null || eVar == null || cVar2.f45478a.get() != eVar) {
                    mVarB.f45476d = new m.c(duration, eVar);
                } else {
                    mVarB.f45476d.f45479b = duration;
                }
                m.c cVar3 = mVarB.f45475c;
                if (cVar3 == null || !mVarB.a(cVar3, 4)) {
                    mVarB.f45475c = null;
                    m.c cVar4 = mVarB.f45476d;
                    if (cVar4 != null) {
                        mVarB.f45475c = cVar4;
                        mVarB.f45476d = null;
                        m.b bVar = cVar4.f45478a.get();
                        if (bVar != null) {
                            bVar.show();
                        } else {
                            mVarB.f45475c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        this.m = false;
        this.f45425n = new b();
        this.f45436y = new e();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (contentViewCallback == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f45419g = viewGroup;
        this.f45421i = contentViewCallback;
        this.f45420h = context;
        ThemeEnforcement.checkAppCompatTheme(context);
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(getSnackbarBaseLayoutResId(), viewGroup, false);
        this.view = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = snackbarBaseLayout.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f45454q0.setTextColor(MaterialColors.layer(MaterialColors.getColor(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f45454q0.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        ViewCompat.setAccessibilityLiveRegion(snackbarBaseLayout, 1);
        ViewCompat.setImportantForAccessibility(snackbarBaseLayout, 1);
        ViewCompat.setFitsSystemWindows(snackbarBaseLayout, true);
        ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new c());
        ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new d());
        this.f45435x = (AccessibilityManager) context.getSystemService(Constants.ACCESSIBILITY);
        int i10 = R.attr.motionDurationLong2;
        this.f45415c = MotionUtils.resolveThemeDuration(context, i10, 250);
        this.f45413a = MotionUtils.resolveThemeDuration(context, i10, 150);
        this.f45414b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium1, 75);
        int i11 = R.attr.motionEasingEmphasizedInterpolator;
        this.f45416d = MotionUtils.resolveThemeInterpolator(context, i11, A);
        this.f45418f = MotionUtils.resolveThemeInterpolator(context, i11, B);
        this.f45417e = MotionUtils.resolveThemeInterpolator(context, i11, f45412z);
    }

    @NonNull
    public B setAnchorView(@IdRes int i10) {
        View viewFindViewById = this.f45419g.findViewById(i10);
        if (viewFindViewById != null) {
            return (B) setAnchorView(viewFindViewById);
        }
        throw new IllegalArgumentException(g0.c("Unable to find anchor view with id: ", i10));
    }

    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DismissEvent {
        }

        public void onShown(B b10) {
        }

        public void onDismissed(B b10, int i10) {
        }
    }
}
