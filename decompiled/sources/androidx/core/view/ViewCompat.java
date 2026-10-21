package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.PathInterpolator;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.collection.SimpleArrayMap;
import androidx.core.R;
import androidx.core.graphics.Insets;
import androidx.core.util.Preconditions;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import androidx.webkit.ProxyConfig;
import com.bbva.nativesettings.common.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;

    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f20231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f20232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f20233d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f20235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f20236g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f20230a = new AtomicInteger(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static WeakHashMap<View, ViewPropertyAnimatorCompat> f20234e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f20237h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f20238i = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final OnReceiveContentViewBehavior f20239j = new z();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final e f20240k = new e();

    public static abstract class AccessibilityViewProperty<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f20241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<T> f20242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f20244d;

        public AccessibilityViewProperty(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f20243c;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T d(View view);

        public abstract void e(View view, T t10);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f20241a);
            if (this.f20242b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        public void g(View view, T t10) {
            if (c()) {
                e(view, t10);
                return;
            }
            if (b() && h(f(view), t10)) {
                AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view);
                if (accessibilityDelegate == null) {
                    accessibilityDelegate = new AccessibilityDelegateCompat();
                }
                ViewCompat.setAccessibilityDelegate(view, accessibilityDelegate);
                view.setTag(this.f20241a, t10);
                ViewCompat.k(view, this.f20244d);
            }
        }

        public boolean h(T t10, T t11) {
            return !t11.equals(t10);
        }

        public AccessibilityViewProperty(int i10, Class<T> cls, int i11, int i12) {
            this.f20241a = i10;
            this.f20242b = cls;
            this.f20244d = i11;
            this.f20243c = i12;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NestedScrollType {
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollIndicators {
    }

    public class a extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi(28)
        public final Boolean d(@NonNull View view) {
            return Boolean.valueOf(p.d(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi(28)
        public final void e(@NonNull View view, Boolean bool) {
            p.j(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class b extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi(28)
        public final CharSequence d(View view) {
            return p.b(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi(28)
        public final void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class c extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi(30)
        public final CharSequence d(View view) {
            return r.b(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi(30)
        public final void e(View view, CharSequence charSequence) {
            r.f(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi(28)
        public final Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        @RequiresApi(28)
        public final void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    @RequiresApi(15)
    public static class f {
        @DoNotInline
        public static boolean a(@NonNull View view) {
            return view.hasOnClickListeners();
        }
    }

    @RequiresApi(16)
    public static class g {
        @DoNotInline
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @DoNotInline
        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        @DoNotInline
        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        @DoNotInline
        public static int d(View view) {
            return view.getMinimumHeight();
        }

        @DoNotInline
        public static int e(View view) {
            return view.getMinimumWidth();
        }

        @DoNotInline
        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        @DoNotInline
        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @DoNotInline
        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        @DoNotInline
        public static boolean i(View view) {
            return view.hasTransientState();
        }

        @DoNotInline
        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        @DoNotInline
        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        @DoNotInline
        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        @DoNotInline
        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @DoNotInline
        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        @DoNotInline
        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @DoNotInline
        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        @DoNotInline
        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @DoNotInline
        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        @DoNotInline
        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    @RequiresApi(17)
    public static class h {
        @DoNotInline
        public static int a() {
            return View.generateViewId();
        }

        @DoNotInline
        public static Display b(@NonNull View view) {
            return view.getDisplay();
        }

        @DoNotInline
        public static int c(View view) {
            return view.getLabelFor();
        }

        @DoNotInline
        public static int d(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        public static int e(View view) {
            return view.getPaddingEnd();
        }

        @DoNotInline
        public static int f(View view) {
            return view.getPaddingStart();
        }

        @DoNotInline
        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        @DoNotInline
        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        @DoNotInline
        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @DoNotInline
        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        @DoNotInline
        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    @RequiresApi(18)
    public static class i {
        @DoNotInline
        public static Rect a(@NonNull View view) {
            return view.getClipBounds();
        }

        @DoNotInline
        public static boolean b(@NonNull View view) {
            return view.isInLayout();
        }

        @DoNotInline
        public static void c(@NonNull View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    @RequiresApi(19)
    public static class j {
        @DoNotInline
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @DoNotInline
        public static boolean b(@NonNull View view) {
            return view.isAttachedToWindow();
        }

        @DoNotInline
        public static boolean c(@NonNull View view) {
            return view.isLaidOut();
        }

        @DoNotInline
        public static boolean d(@NonNull View view) {
            return view.isLayoutDirectionResolved();
        }

        @DoNotInline
        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        @DoNotInline
        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        @DoNotInline
        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    @RequiresApi(20)
    public static class k {
        @DoNotInline
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    @RequiresApi(21)
    public static class l {

        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public WindowInsetsCompat f20246a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f20247b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ OnApplyWindowInsetsListener f20248c;

            public a(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
                this.f20247b = view;
                this.f20248c = onApplyWindowInsetsListener;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f20248c;
                if (i10 < 30) {
                    l.a(windowInsets, this.f20247b);
                    if (windowInsetsCompat.equals(this.f20246a)) {
                        return onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.f20246a = windowInsetsCompat;
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompat);
                if (i10 >= 30) {
                    return windowInsetsCompatOnApplyWindowInsets.toWindowInsets();
                }
                ViewCompat.requestApplyInsets(view);
                return windowInsetsCompatOnApplyWindowInsets.toWindowInsets();
            }
        }

        @DoNotInline
        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        public static WindowInsetsCompat b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        @DoNotInline
        public static boolean c(@NonNull View view, float f6, float f10, boolean z10) {
            return view.dispatchNestedFling(f6, f10, z10);
        }

        @DoNotInline
        public static boolean d(@NonNull View view, float f6, float f10) {
            return view.dispatchNestedPreFling(f6, f10);
        }

        @DoNotInline
        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        @DoNotInline
        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        @DoNotInline
        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        public static float i(View view) {
            return view.getElevation();
        }

        @Nullable
        @DoNotInline
        public static WindowInsetsCompat j(@NonNull View view) {
            if (!WindowInsetsCompat.a.f20323d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = WindowInsetsCompat.a.f20320a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) WindowInsetsCompat.a.f20321b.get(obj);
                Rect rect2 = (Rect) WindowInsetsCompat.a.f20322c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder().setStableInsets(Insets.of(rect)).setSystemWindowInsets(Insets.of(rect2)).build();
                windowInsetsCompatBuild.e(windowInsetsCompatBuild);
                windowInsetsCompatBuild.a(view.getRootView());
                return windowInsetsCompatBuild;
            } catch (IllegalAccessException e5) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e5.getMessage(), e5);
                return null;
            }
        }

        @DoNotInline
        public static String k(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        public static float l(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        public static float m(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        @DoNotInline
        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        @DoNotInline
        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        public static void s(View view, float f6) {
            view.setElevation(f6);
        }

        @DoNotInline
        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        @DoNotInline
        public static void u(@NonNull View view, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, onApplyWindowInsetsListener));
            }
        }

        @DoNotInline
        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        public static void w(View view, float f6) {
            view.setTranslationZ(f6);
        }

        @DoNotInline
        public static void x(@NonNull View view, float f6) {
            view.setZ(f6);
        }

        @DoNotInline
        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        @DoNotInline
        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    @RequiresApi(23)
    public static class m {
        @Nullable
        public static WindowInsetsCompat a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.e(windowInsetsCompat);
            windowInsetsCompat.a(view.getRootView());
            return windowInsetsCompat;
        }

        @DoNotInline
        public static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        @DoNotInline
        public static void c(@NonNull View view, int i10) {
            view.setScrollIndicators(i10);
        }

        @DoNotInline
        public static void d(@NonNull View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    @RequiresApi(24)
    public static class n {
        @DoNotInline
        public static void a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        @DoNotInline
        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @DoNotInline
        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @DoNotInline
        public static void d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @DoNotInline
        public static boolean e(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        @DoNotInline
        public static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @RequiresApi(26)
    public static class o {
        @DoNotInline
        public static void a(@NonNull View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        @DoNotInline
        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        @DoNotInline
        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        public static int d(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        @DoNotInline
        public static boolean e(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        @DoNotInline
        public static boolean f(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        @DoNotInline
        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        @DoNotInline
        public static boolean h(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        @DoNotInline
        public static View i(@NonNull View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        @DoNotInline
        public static boolean j(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        @DoNotInline
        public static void k(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @DoNotInline
        public static void l(@NonNull View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        @DoNotInline
        public static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        @DoNotInline
        public static void n(@NonNull View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        @DoNotInline
        public static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        @DoNotInline
        public static void p(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @RequiresApi(28)
    public static class p {
        @DoNotInline
        public static void a(@NonNull View view, @NonNull final OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            int i10 = R.id.tag_unhandled_key_listeners;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(i10);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(i10, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.a0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return onUnhandledKeyEventListenerCompat.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        public static void e(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        @DoNotInline
        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        @DoNotInline
        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        public static void i(View view, AutofillId autofillId) {
            view.setAutofillId(autofillId);
        }

        @DoNotInline
        public static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    @RequiresApi(29)
    public static class q {
        @DoNotInline
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        @DoNotInline
        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @DoNotInline
        public static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        @DoNotInline
        public static void e(View view, ContentCaptureSession contentCaptureSession) {
            view.setContentCaptureSession(contentCaptureSession);
        }

        @DoNotInline
        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @RequiresApi(30)
    public static class r {
        @DoNotInline
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        @DoNotInline
        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        @Nullable
        public static WindowInsetsControllerCompat c(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        @DoNotInline
        public static void e(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        @DoNotInline
        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @RequiresApi(31)
    public static final class s {
        @Nullable
        @DoNotInline
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        @DoNotInline
        public static ContentInfoCompat b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfo = contentInfoCompat.toContentInfo();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfo);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfo ? contentInfoCompat : ContentInfoCompat.toContentInfoCompat(contentInfoPerformReceiveContent);
        }

        @DoNotInline
        public static void c(@NonNull View view, @Nullable String[] strArr, @Nullable OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(onReceiveContentListener));
            }
        }
    }

    @RequiresApi(31)
    public static final class t implements android.view.OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final OnReceiveContentListener f20249a;

        public t(@NonNull OnReceiveContentListener onReceiveContentListener) {
            this.f20249a = onReceiveContentListener;
        }

        @Nullable
        public final ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = ContentInfoCompat.toContentInfoCompat(contentInfo);
            ContentInfoCompat contentInfoCompatOnReceiveContent = this.f20249a.onReceiveContent(view, contentInfoCompat);
            if (contentInfoCompatOnReceiveContent == null) {
                return null;
            }
            return contentInfoCompatOnReceiveContent == contentInfoCompat ? contentInfo : contentInfoCompatOnReceiveContent.toContentInfo();
        }
    }

    public static class u {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f20250d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public WeakHashMap<View, Boolean> f20251a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f20252b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f20253c = null;

        public static boolean b(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f20251a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewA != null) {
                            return viewA;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }
    }

    @Deprecated
    public ViewCompat() {
    }

    private static AccessibilityViewProperty<Boolean> a() {
        return new d(R.id.tag_accessibility_heading, Boolean.class, 28);
    }

    public static int addAccessibilityAction(@NonNull View view, @NonNull CharSequence charSequence, @NonNull AccessibilityViewCommand accessibilityViewCommand) {
        int i10 = i(view, charSequence);
        if (i10 != -1) {
            b(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i10, charSequence, accessibilityViewCommand));
        }
        return i10;
    }

    public static void addKeyboardNavigationClusters(@NonNull View view, @NonNull Collection<View> collection, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.a(view, collection, i10);
        }
    }

    public static void addOnUnhandledKeyEventListener(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            p.a(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        int i10 = R.id.tag_unhandled_key_listeners;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i10, arrayList);
        }
        arrayList.add(onUnhandledKeyEventListenerCompat);
        if (arrayList.size() == 1) {
            ArrayList<WeakReference<View>> arrayList2 = u.f20250d;
            synchronized (arrayList2) {
                try {
                    Iterator<WeakReference<View>> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                        }
                    }
                    u.f20250d.add(new WeakReference<>(view));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NonNull
    public static ViewPropertyAnimatorCompat animate(@NonNull View view) {
        if (f20234e == null) {
            f20234e = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = f20234e.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f20234e.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    private static void b(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
        m(accessibilityActionCompat.getId(), view);
        h(view).add(accessibilityActionCompat);
        k(view, 0);
    }

    private static void c() {
        try {
            f20231b = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            f20232c = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        f20233d = true;
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i10) {
        return view.canScrollHorizontally(i10);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i10) {
        return view.canScrollVertically(i10);
    }

    public static void cancelDragAndDrop(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            n.a(view);
        }
    }

    @Deprecated
    public static int combineMeasuredStates(int i10, int i11) {
        return View.combineMeasuredStates(i10, i11);
    }

    @NonNull
    public static WindowInsetsCompat computeSystemWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
        return l.b(view, windowInsetsCompat, rect);
    }

    @UiThread
    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = u.f20250d;
        int i10 = R.id.tag_unhandled_key_event_manager;
        u uVar = (u) view.getTag(i10);
        if (uVar == null) {
            uVar = new u();
            view.setTag(i10, uVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = uVar.f20251a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = u.f20250d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (uVar.f20251a == null) {
                            uVar.f20251a = new WeakHashMap<>();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList3 = u.f20250d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                uVar.f20251a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    uVar.f20251a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        View viewA = uVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (uVar.f20252b == null) {
                    uVar.f20252b = new SparseArray<>();
                }
                uVar.f20252b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    @NonNull
    public static WindowInsetsCompat dispatchApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsA = k.a(view, windowInsets);
            if (!windowInsetsA.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void dispatchFinishTemporaryDetach(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            n.b(view);
            return;
        }
        if (!f20233d) {
            c();
        }
        Method method = f20232c;
        if (method == null) {
            view.onFinishTemporaryDetach();
        } else {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean dispatchNestedFling(@NonNull View view, float f6, float f10, boolean z10) {
        return l.c(view, f6, f10, z10);
    }

    public static boolean dispatchNestedPreFling(@NonNull View view, float f6, float f10) {
        return l.d(view, f6, f10);
    }

    public static boolean dispatchNestedPreScroll(@NonNull View view, int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return l.e(view, i10, i11, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr) {
        return l.f(view, i10, i11, i12, i13, iArr);
    }

    public static void dispatchStartTemporaryDetach(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            n.c(view);
            return;
        }
        if (!f20233d) {
            c();
        }
        Method method = f20231b;
        if (method == null) {
            view.onStartTemporaryDetach();
        } else {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @UiThread
    public static boolean e(View view, KeyEvent keyEvent) {
        WeakReference<View> weakReferenceValueAt;
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = u.f20250d;
        int i10 = R.id.tag_unhandled_key_event_manager;
        u uVar = (u) view.getTag(i10);
        if (uVar == null) {
            uVar = new u();
            view.setTag(i10, uVar);
        }
        WeakReference<KeyEvent> weakReference = uVar.f20253c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        uVar.f20253c = new WeakReference<>(keyEvent);
        if (uVar.f20252b == null) {
            uVar.f20252b = new SparseArray<>();
        }
        SparseArray<WeakReference<View>> sparseArray = uVar.f20252b;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReferenceValueAt = null;
        } else {
            weakReferenceValueAt = sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReferenceValueAt == null) {
            weakReferenceValueAt = sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReferenceValueAt == null) {
            return false;
        }
        View view2 = weakReferenceValueAt.get();
        if (view2 != null && isAttachedToWindow(view2)) {
            u.b(view2, keyEvent);
        }
        return true;
    }

    public static void enableAccessibleClickableSpanSupport(@NonNull View view) {
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    @Nullable
    private static View.AccessibilityDelegate f(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : g(view);
    }

    @Nullable
    private static View.AccessibilityDelegate g(@NonNull View view) {
        if (f20237h) {
            return null;
        }
        if (f20236g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f20236g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f20237h = true;
                return null;
            }
        }
        try {
            Object obj = f20236g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f20237h = true;
            return null;
        }
    }

    public static int generateViewId() {
        return h.a();
    }

    @Nullable
    public static AccessibilityDelegateCompat getAccessibilityDelegate(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateF = f(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof AccessibilityDelegateCompat.a ? ((AccessibilityDelegateCompat.a) accessibilityDelegateF).f20169a : new AccessibilityDelegateCompat(accessibilityDelegateF);
    }

    public static int getAccessibilityLiveRegion(@NonNull View view) {
        return j.a(view);
    }

    @Nullable
    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = g.a(view);
        if (accessibilityNodeProviderA != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProviderA);
        }
        return null;
    }

    @Nullable
    @UiThread
    public static CharSequence getAccessibilityPaneTitle(@NonNull View view) {
        return l().f(view);
    }

    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    @Nullable
    public static AutofillIdCompat getAutofillId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AutofillIdCompat.toAutofillIdCompat(o.b(view));
        }
        return null;
    }

    @Nullable
    public static ColorStateList getBackgroundTintList(@NonNull View view) {
        return l.g(view);
    }

    @Nullable
    public static PorterDuff.Mode getBackgroundTintMode(@NonNull View view) {
        return l.h(view);
    }

    @Nullable
    public static Rect getClipBounds(@NonNull View view) {
        return i.a(view);
    }

    @Nullable
    public static ContentCaptureSessionCompat getContentCaptureSession(@NonNull View view) {
        ContentCaptureSession contentCaptureSessionB;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionB = q.b(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSessionB, view);
    }

    @Nullable
    public static Display getDisplay(@NonNull View view) {
        return h.b(view);
    }

    public static float getElevation(@NonNull View view) {
        return l.i(view);
    }

    public static boolean getFitsSystemWindows(@NonNull View view) {
        return g.b(view);
    }

    public static int getImportantForAccessibility(@NonNull View view) {
        return g.c(view);
    }

    @SuppressLint({"InlinedApi"})
    public static int getImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.c(view);
        }
        return 0;
    }

    public static int getImportantForContentCapture(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return r.a(view);
        }
        return 0;
    }

    public static int getLabelFor(@NonNull View view) {
        return h.c(view);
    }

    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    public static int getLayoutDirection(@NonNull View view) {
        return h.d(view);
    }

    @Nullable
    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static int getMinimumHeight(@NonNull View view) {
        return g.d(view);
    }

    public static int getMinimumWidth(@NonNull View view) {
        return g.e(view);
    }

    public static int getNextClusterForwardId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.d(view);
        }
        return -1;
    }

    @Nullable
    public static String[] getOnReceiveContentMimeTypes(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @Px
    public static int getPaddingEnd(@NonNull View view) {
        return h.e(view);
    }

    @Px
    public static int getPaddingStart(@NonNull View view) {
        return h.f(view);
    }

    @Nullable
    public static ViewParent getParentForAccessibility(@NonNull View view) {
        return g.f(view);
    }

    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    @Nullable
    public static WindowInsetsCompat getRootWindowInsets(@NonNull View view) {
        return m.a(view);
    }

    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    public static int getScrollIndicators(@NonNull View view) {
        return m.b(view);
    }

    @Nullable
    @UiThread
    public static CharSequence getStateDescription(@NonNull View view) {
        return o().f(view);
    }

    @NonNull
    public static List<Rect> getSystemGestureExclusionRects(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.c(view) : Collections.emptyList();
    }

    @Nullable
    public static String getTransitionName(@NonNull View view) {
        return l.k(view);
    }

    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    public static float getTranslationZ(@NonNull View view) {
        return l.l(view);
    }

    @Nullable
    @Deprecated
    public static WindowInsetsControllerCompat getWindowInsetsController(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return r.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return WindowCompat.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(@NonNull View view) {
        return g.g(view);
    }

    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static float getZ(@NonNull View view) {
        return l.m(view);
    }

    private static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> h(View view) {
        int i10 = R.id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static boolean hasAccessibilityDelegate(@NonNull View view) {
        return f(view) != null;
    }

    public static boolean hasExplicitFocusable(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 26 ? o.e(view) : view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(@NonNull View view) {
        return l.n(view);
    }

    public static boolean hasOnClickListeners(@NonNull View view) {
        return f.a(view);
    }

    public static boolean hasOverlappingRendering(@NonNull View view) {
        return g.h(view);
    }

    public static boolean hasTransientState(@NonNull View view) {
        return g.i(view);
    }

    private static int i(View view, @NonNull CharSequence charSequence) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> listH = h(view);
        for (int i10 = 0; i10 < listH.size(); i10++) {
            if (TextUtils.equals(charSequence, listH.get(i10).getLabel())) {
                return listH.get(i10).getId();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f20238i;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listH.size(); i14++) {
                z10 &= listH.get(i14).getId() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    @UiThread
    public static boolean isAccessibilityHeading(@NonNull View view) {
        Boolean boolF = a().f(view);
        return boolF != null && boolF.booleanValue();
    }

    public static boolean isAttachedToWindow(@NonNull View view) {
        return j.b(view);
    }

    public static boolean isFocusedByDefault(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.f(view);
        }
        return false;
    }

    public static boolean isImportantForAccessibility(@NonNull View view) {
        return l.o(view);
    }

    public static boolean isImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.g(view);
        }
        return true;
    }

    public static boolean isImportantForContentCapture(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return r.d(view);
        }
        return false;
    }

    public static boolean isInLayout(@NonNull View view) {
        return i.b(view);
    }

    public static boolean isKeyboardNavigationCluster(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.h(view);
        }
        return false;
    }

    public static boolean isLaidOut(@NonNull View view) {
        return j.c(view);
    }

    public static boolean isLayoutDirectionResolved(@NonNull View view) {
        return j.d(view);
    }

    public static boolean isNestedScrollingEnabled(@NonNull View view) {
        return l.p(view);
    }

    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    public static boolean isPaddingRelative(@NonNull View view) {
        return h.g(view);
    }

    @UiThread
    public static boolean isScreenReaderFocusable(@NonNull View view) {
        Boolean boolF = n().f(view);
        return boolF != null && boolF.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static OnReceiveContentViewBehavior j(@NonNull View view) {
        return view instanceof OnReceiveContentViewBehavior ? (OnReceiveContentViewBehavior) view : f20239j;
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @RequiresApi(19)
    public static void k(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService(Constants.ACCESSIBILITY);
        if (accessibilityManager.isEnabled()) {
            boolean z10 = getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (getAccessibilityLiveRegion(view) != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                j.g(accessibilityEventObtain, i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(getAccessibilityPaneTitle(view));
                    if (getImportantForAccessibility(view) == 0) {
                        setImportantForAccessibility(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        j.e(view.getParent(), view, view, i10);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            j.g(accessibilityEventObtain2, i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(getAccessibilityPaneTitle(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    @Nullable
    public static View keyboardNavigationClusterSearch(@NonNull View view, @Nullable View view2, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.i(view, view2, i10);
        }
        return null;
    }

    private static AccessibilityViewProperty<CharSequence> l() {
        return new b(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    private static void m(int i10, View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> listH = h(view);
        for (int i11 = 0; i11 < listH.size(); i11++) {
            if (listH.get(i11).getId() == i10) {
                listH.remove(i11);
                return;
            }
        }
    }

    private static AccessibilityViewProperty<Boolean> n() {
        return new a(R.id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    private static AccessibilityViewProperty<CharSequence> o() {
        return new c(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    public static void offsetLeftAndRight(@NonNull View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void offsetTopAndBottom(@NonNull View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    @NonNull
    public static WindowInsetsCompat onApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsB = k.b(view, windowInsets);
            if (!windowInsetsB.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsB, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    public static boolean performAccessibilityAction(@NonNull View view, int i10, @Nullable Bundle bundle) {
        return g.j(view, i10, bundle);
    }

    public static boolean performHapticFeedback(@NonNull View view, int i10) {
        int iA = HapticFeedbackConstantsCompat.a(i10);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA);
    }

    @Nullable
    public static ContentInfoCompat performReceiveContent(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(contentInfoCompat);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener == null) {
            return j(view).onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatOnReceiveContent = onReceiveContentListener.onReceiveContent(view, contentInfoCompat);
        if (contentInfoCompatOnReceiveContent == null) {
            return null;
        }
        return j(view).onReceiveContent(contentInfoCompatOnReceiveContent);
    }

    public static void postInvalidateOnAnimation(@NonNull View view) {
        g.k(view);
    }

    public static void postOnAnimation(@NonNull View view, @NonNull Runnable runnable) {
        g.m(view, runnable);
    }

    @SuppressLint({"LambdaLast"})
    public static void postOnAnimationDelayed(@NonNull View view, @NonNull Runnable runnable, long j10) {
        g.n(view, runnable, j10);
    }

    public static void removeAccessibilityAction(@NonNull View view, int i10) {
        m(i10, view);
        k(view, 0);
    }

    public static void removeOnUnhandledKeyEventListener(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            p.e(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(onUnhandledKeyEventListenerCompat);
        if (arrayList.size() != 0) {
            return;
        }
        synchronized (u.f20250d) {
            int i10 = 0;
            while (true) {
                try {
                    ArrayList<WeakReference<View>> arrayList2 = u.f20250d;
                    if (i10 >= arrayList2.size()) {
                        return;
                    }
                    if (arrayList2.get(i10).get() == view) {
                        arrayList2.remove(i10);
                        return;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void replaceAccessibilityAction(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, @Nullable CharSequence charSequence, @Nullable AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            removeAccessibilityAction(view, accessibilityActionCompat.getId());
        } else {
            b(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
        }
    }

    public static void requestApplyInsets(@NonNull View view) {
        k.c(view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull View view, @IdRes int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) p.f(view, i10);
        }
        T t10 = (T) view.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i10, int i11, int i12) {
        return View.resolveSizeAndState(i10, i11, i12);
    }

    public static boolean restoreDefaultFocus(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 26 ? o.j(view) : view.requestFocus();
    }

    public static void saveAttributeDataForStyleable(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static void setAccessibilityDelegate(@NonNull View view, @Nullable AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (f(view) instanceof AccessibilityDelegateCompat.a)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (getImportantForAccessibility(view) == 0) {
            setImportantForAccessibility(view, 1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    @UiThread
    public static void setAccessibilityHeading(@NonNull View view, boolean z10) {
        a().g(view, Boolean.valueOf(z10));
    }

    public static void setAccessibilityLiveRegion(@NonNull View view, int i10) {
        j.f(view, i10);
    }

    @UiThread
    public static void setAccessibilityPaneTitle(@NonNull View view, @Nullable CharSequence charSequence) {
        l().g(view, charSequence);
        if (charSequence != null) {
            f20240k.a(view);
        } else {
            f20240k.d(view);
        }
    }

    @Deprecated
    public static void setActivated(View view, boolean z10) {
        view.setActivated(z10);
    }

    @Deprecated
    public static void setAlpha(View view, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        view.setAlpha(f6);
    }

    public static void setAutofillHints(@NonNull View view, @Nullable String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.k(view, strArr);
        }
    }

    public static void setAutofillId(@NonNull View view, @Nullable AutofillIdCompat autofillIdCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            p.i(view, autofillIdCompat.toAutofillId());
        }
    }

    public static void setBackground(@NonNull View view, @Nullable Drawable drawable) {
        g.q(view, drawable);
    }

    public static void setBackgroundTintList(@NonNull View view, @Nullable ColorStateList colorStateList) {
        l.q(view, colorStateList);
    }

    public static void setBackgroundTintMode(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        l.r(view, mode);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z10) {
        if (f20235f == null) {
            try {
                f20235f = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            f20235f.setAccessible(true);
        }
        try {
            f20235f.invoke(viewGroup, Boolean.valueOf(z10));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static void setClipBounds(@NonNull View view, @Nullable Rect rect) {
        i.c(view, rect);
    }

    public static void setContentCaptureSession(@NonNull View view, @Nullable ContentCaptureSessionCompat contentCaptureSessionCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.e(view, contentCaptureSessionCompat.toContentCaptureSession());
        }
    }

    public static void setElevation(@NonNull View view, float f6) {
        l.s(view, f6);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    public static void setFocusedByDefault(@NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, z10);
        }
    }

    public static void setHasTransientState(@NonNull View view, boolean z10) {
        g.r(view, z10);
    }

    @UiThread
    public static void setImportantForAccessibility(@NonNull View view, int i10) {
        g.s(view, i10);
    }

    public static void setImportantForAutofill(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.m(view, i10);
        }
    }

    public static void setImportantForContentCapture(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            r.e(view, i10);
        }
    }

    public static void setKeyboardNavigationCluster(@NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.n(view, z10);
        }
    }

    public static void setLabelFor(@NonNull View view, @IdRes int i10) {
        h.h(view, i10);
    }

    public static void setLayerPaint(@NonNull View view, @Nullable Paint paint) {
        h.i(view, paint);
    }

    @Deprecated
    public static void setLayerType(View view, int i10, Paint paint) {
        view.setLayerType(i10, paint);
    }

    public static void setLayoutDirection(@NonNull View view, int i10) {
        h.j(view, i10);
    }

    public static void setNestedScrollingEnabled(@NonNull View view, boolean z10) {
        l.t(view, z10);
    }

    public static void setNextClusterForwardId(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.o(view, i10);
        }
    }

    public static void setOnApplyWindowInsetsListener(@NonNull View view, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        l.u(view, onApplyWindowInsetsListener);
    }

    public static void setOnReceiveContentListener(@NonNull View view, @Nullable String[] strArr, @Nullable OnReceiveContentListener onReceiveContentListener) {
        if (Build.VERSION.SDK_INT >= 31) {
            s.c(view, strArr, onReceiveContentListener);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z10 = false;
        if (onReceiveContentListener != null) {
            Preconditions.checkArgument(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (str.startsWith(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    z10 = true;
                    break;
                }
            }
            Preconditions.checkArgument(!z10, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, onReceiveContentListener);
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i10) {
        view.setOverScrollMode(i10);
    }

    public static void setPaddingRelative(@NonNull View view, @Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        h.k(view, i10, i11, i12, i13);
    }

    @Deprecated
    public static void setPivotX(View view, float f6) {
        view.setPivotX(f6);
    }

    @Deprecated
    public static void setPivotY(View view, float f6) {
        view.setPivotY(f6);
    }

    public static void setPointerIcon(@NonNull View view, @Nullable PointerIconCompat pointerIconCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            n.d(view, androidx.camera.camera2.internal.compat.params.a.b(pointerIconCompat != null ? pointerIconCompat.getPointerIcon() : null));
        }
    }

    @Deprecated
    public static void setRotation(View view, float f6) {
        view.setRotation(f6);
    }

    @Deprecated
    public static void setRotationX(View view, float f6) {
        view.setRotationX(f6);
    }

    @Deprecated
    public static void setRotationY(View view, float f6) {
        view.setRotationY(f6);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z10) {
        view.setSaveFromParentEnabled(z10);
    }

    @Deprecated
    public static void setScaleX(View view, float f6) {
        view.setScaleX(f6);
    }

    @Deprecated
    public static void setScaleY(View view, float f6) {
        view.setScaleY(f6);
    }

    @UiThread
    public static void setScreenReaderFocusable(@NonNull View view, boolean z10) {
        n().g(view, Boolean.valueOf(z10));
    }

    public static void setScrollIndicators(@NonNull View view, int i10) {
        m.c(view, i10);
    }

    @UiThread
    public static void setStateDescription(@NonNull View view, @Nullable CharSequence charSequence) {
        o().g(view, charSequence);
    }

    public static void setSystemGestureExclusionRects(@NonNull View view, @NonNull List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.f(view, list);
        }
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.p(view, charSequence);
        }
    }

    public static void setTransitionName(@NonNull View view, @Nullable String str) {
        l.v(view, str);
    }

    @Deprecated
    public static void setTranslationX(View view, float f6) {
        view.setTranslationX(f6);
    }

    @Deprecated
    public static void setTranslationY(View view, float f6) {
        view.setTranslationY(f6);
    }

    public static void setTranslationZ(@NonNull View view, float f6) {
        l.w(view, f6);
    }

    public static void setWindowInsetsAnimationCallback(@NonNull View view, @Nullable WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(callback != null ? new WindowInsetsAnimationCompat.b.a(callback) : null);
            return;
        }
        PathInterpolator pathInterpolator = WindowInsetsAnimationCompat.a.f20290f;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (callback == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0073a = new WindowInsetsAnimationCompat.a.ViewOnApplyWindowInsetsListenerC0073a(view, callback);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0073a);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0073a);
        }
    }

    @Deprecated
    public static void setX(View view, float f6) {
        view.setX(f6);
    }

    @Deprecated
    public static void setY(View view, float f6) {
        view.setY(f6);
    }

    public static void setZ(@NonNull View view, float f6) {
        l.x(view, f6);
    }

    public static boolean startDragAndDrop(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? n.e(view, clipData, dragShadowBuilder, obj, i10) : view.startDrag(clipData, dragShadowBuilder, obj, i10);
    }

    public static boolean startNestedScroll(@NonNull View view, int i10) {
        return l.y(view, i10);
    }

    public static void stopNestedScroll(@NonNull View view) {
        l.z(view);
    }

    public static void updateDragShadow(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            n.f(view, dragShadowBuilder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(@NonNull View view, int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2, int i12) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
        }
        if (i12 == 0) {
            return dispatchNestedPreScroll(view, i10, i11, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, @NonNull int[] iArr2) {
        if (view instanceof NestedScrollingChild3) {
            ((NestedScrollingChild3) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
        } else {
            dispatchNestedScroll(view, i10, i11, i12, i13, iArr, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(@NonNull View view, int i10) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).hasNestedScrollingParent(i10);
            return false;
        }
        if (i10 == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    public static void postInvalidateOnAnimation(@NonNull View view, int i10, int i11, int i12, int i13) {
        g.l(view, i10, i11, i12, i13);
    }

    public static void setScrollIndicators(@NonNull View view, int i10, int i11) {
        m.d(view, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(@NonNull View view, int i10, int i11) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).startNestedScroll(i10, i11);
        }
        if (i11 == 0) {
            return startNestedScroll(view, i10);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(@NonNull View view, int i10) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).stopNestedScroll(i10);
        } else if (i10 == 0) {
            stopNestedScroll(view);
        }
    }

    public static boolean performHapticFeedback(@NonNull View view, int i10, int i11) {
        int iA = HapticFeedbackConstantsCompat.a(i10);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
        }
        if (i14 == 0) {
            return dispatchNestedScroll(view, i10, i11, i12, i13, iArr);
        }
        return false;
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f20245p0 = new WeakHashMap<>();

        @RequiresApi(19)
        private void b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                ViewCompat.k(view, z11 ? 16 : 32);
                this.f20245p0.put(view, Boolean.valueOf(z11));
            }
        }

        @RequiresApi(19)
        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @RequiresApi(19)
        private void e(View view) {
            g.o(view.getViewTreeObserver(), this);
        }

        @RequiresApi(19)
        public void a(View view) {
            this.f20245p0.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (j.b(view)) {
                c(view);
            }
        }

        @RequiresApi(19)
        public void d(View view) {
            this.f20245p0.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @RequiresApi(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f20245p0.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @RequiresApi(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
