package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.processing.f;
import androidx.coordinatorlayout.R;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    public static final String O0;
    public static final Class<?>[] P0;
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> Q0;
    public static final d R0;
    public static final Pools.SynchronizedPool S0;
    public View E0;
    public View F0;
    public c G0;
    public boolean H0;
    public WindowInsetsCompat I0;
    public boolean J0;
    public Drawable K0;
    public ViewGroup.OnHierarchyChangeListener L0;
    public a M0;
    public final NestedScrollingParentHelper N0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f19815p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DirectedAcyclicGraph<View> f19816q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f19817r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList f19818s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Paint f19819t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f19820u0;
    public final int[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f19821w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f19822x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int[] f19823y0;

    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).m;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((LayoutParams) view.getLayoutParams()).m = obj;
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
            return getScrimOpacity(coordinatorLayout, v3) > 0.0f;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
            return ViewCompat.MEASURED_STATE_MASK;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view) {
            return false;
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view) {
            return false;
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, float f6, float f10, boolean z10) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, float f6, float f10) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i10) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Rect rect, boolean z10) {
            return false;
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i10) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
            if (i12 == 0) {
                onNestedPreScroll(coordinatorLayout, v3, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                onNestedScroll(coordinatorLayout, v3, view, i10, i11, i12, i13);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v3, view, view2, i10);
            }
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                return onStartNestedScroll(coordinatorLayout, v3, view, view2, i10);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10) {
            if (i10 == 0) {
                onStopNestedScroll(coordinatorLayout, v3, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            onNestedScroll(coordinatorLayout, v3, view, i10, i11, i12, i13, i14);
        }

        public void onDetachedFromLayoutParams() {
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams layoutParams) {
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view) {
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Parcelable parcelable) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DispatchChangeEvent {
    }

    public class a implements OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            Behavior behavior;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!ObjectsCompat.equals(coordinatorLayout.I0, windowInsetsCompat)) {
                coordinatorLayout.I0 = windowInsetsCompat;
                boolean z10 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
                coordinatorLayout.J0 = z10;
                coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
                if (!windowInsetsCompat.isConsumed()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        if (ViewCompat.getFitsSystemWindows(childAt) && (behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior()) != null) {
                            windowInsetsCompat = behavior.onApplyWindowInsets(coordinatorLayout, childAt, windowInsetsCompat);
                            if (windowInsetsCompat.isConsumed()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return windowInsetsCompat;
        }
    }

    public class b implements ViewGroup.OnHierarchyChangeListener {
        public b() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.L0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.f(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.L0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class c implements ViewTreeObserver.OnPreDrawListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.f(0);
            return true;
        }
    }

    public static class d implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            float z10 = ViewCompat.getZ(view);
            float z11 = ViewCompat.getZ(view2);
            if (z10 > z11) {
                return -1;
            }
            return z10 < z11 ? 1 : 0;
        }
    }

    static {
        Package r1 = CoordinatorLayout.class.getPackage();
        O0 = r1 != null ? r1.getName() : null;
        R0 = new d();
        P0 = new Class[]{Context.class, AttributeSet.class};
        Q0 = new ThreadLocal<>();
        S0 = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static Rect a() {
        Rect rect = (Rect) S0.acquire();
        return rect == null ? new Rect() : rect;
    }

    public static void d(int i10, Rect rect, Rect rect2, LayoutParams layoutParams, int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13 = layoutParams.gravity;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i13, i10);
        int i14 = layoutParams.anchorGravity;
        if ((i14 & 7) == 0) {
            i14 |= GravityCompat.START;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            iWidth = i17 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            iHeight = i18 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LayoutParams e(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f19825b) {
            if (view instanceof AttachedBehavior) {
                layoutParams.setBehavior(((AttachedBehavior) view).getBehavior());
                layoutParams.f19825b = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        layoutParams.setBehavior(defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        defaultBehavior.value().getClass();
                    }
                }
                layoutParams.f19825b = true;
            }
        }
        return layoutParams;
    }

    public static void j(int i10, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i11 = layoutParams.f19827d;
        if (i11 != i10) {
            ViewCompat.offsetLeftAndRight(view, i10 - i11);
            layoutParams.f19827d = i10;
        }
    }

    public static void k(int i10, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i11 = layoutParams.f19828e;
        if (i11 != i10) {
            ViewCompat.offsetTopAndBottom(view, i10 - i11);
            layoutParams.f19828e = i10;
        }
    }

    public final void b(LayoutParams layoutParams, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final void c(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            ViewGroupUtils.getDescendantRect(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List incomingEdges = this.f19816q0.getIncomingEdges(view);
        if (incomingEdges == null || incomingEdges.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < incomingEdges.size(); i10++) {
            View view2 = (View) incomingEdges.get(i10);
            Behavior behavior = ((LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        Pools.SynchronizedPool synchronizedPool = S0;
        boolean z10 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectA = a();
        c(view, view.getParent() != this, rectA);
        Rect rectA2 = a();
        c(view2, view2.getParent() != this, rectA2);
        try {
            if (rectA.left <= rectA2.right && rectA.top <= rectA2.bottom && rectA.right >= rectA2.left && rectA.bottom >= rectA2.top) {
                z10 = true;
            }
            return z10;
        } finally {
            rectA.setEmpty();
            synchronizedPool.release(rectA);
            rectA2.setEmpty();
            synchronizedPool.release(rectA2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Behavior behavior = layoutParams.f19824a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f19819t0 == null) {
                    this.f19819t0 = new Paint();
                }
                this.f19819t0.setColor(layoutParams.f19824a.getScrimColor(this, view));
                Paint paint = this.f19819t0;
                int iRound = Math.round(scrimOpacity * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f19819t0);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.K0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    public final void f(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean zOnDependentViewChanged;
        boolean z10;
        boolean z11;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        View view;
        Pools.SynchronizedPool synchronizedPool;
        Behavior behavior;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        ArrayList arrayList2 = this.f19815p0;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i19 = 0;
        while (true) {
            Pools.SynchronizedPool synchronizedPool2 = S0;
            if (i19 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                synchronizedPool2.release(rectA);
                rectA2.setEmpty();
                synchronizedPool2.release(rectA2);
                rect2.setEmpty();
                synchronizedPool2.release(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i19);
            LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
            if (i10 != 0 || view2.getVisibility() != 8) {
                int i20 = 0;
                while (i20 < i19) {
                    if (layoutParams.f19830g == ((View) arrayList2.get(i20))) {
                        LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                        if (layoutParams2.f19829f != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            Rect rectA6 = a();
                            ViewGroupUtils.getDescendantRect(this, layoutParams2.f19829f, rectA4);
                            c(view2, false, rectA5);
                            int measuredWidth = view2.getMeasuredWidth();
                            int measuredHeight = view2.getMeasuredHeight();
                            view = view2;
                            synchronizedPool = synchronizedPool2;
                            d(layoutDirection, rectA4, rectA6, layoutParams2, measuredWidth, measuredHeight);
                            boolean z12 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(r16, rectA6, measuredWidth, measuredHeight);
                            int i21 = rectA6.left - rectA5.left;
                            int i22 = rectA6.top - rectA5.top;
                            if (i21 != 0) {
                                ViewCompat.offsetLeftAndRight(view, i21);
                            }
                            if (i22 != 0) {
                                ViewCompat.offsetTopAndBottom(view, i22);
                            }
                            if (z12 && (behavior = r16.getBehavior()) != null) {
                                behavior.onDependentViewChanged(this, view, layoutParams2.f19829f);
                            }
                            rectA4.setEmpty();
                            synchronizedPool.release(rectA4);
                            rectA5.setEmpty();
                            synchronizedPool.release(rectA5);
                            rectA6.setEmpty();
                            synchronizedPool.release(rectA6);
                        } else {
                            view = view2;
                            synchronizedPool = synchronizedPool2;
                        }
                    } else {
                        view = view2;
                        synchronizedPool = synchronizedPool2;
                    }
                    i20++;
                    synchronizedPool2 = synchronizedPool;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i19 = i19;
                    layoutParams = layoutParams;
                    rectA3 = rectA3;
                }
                LayoutParams layoutParams3 = layoutParams;
                ArrayList arrayList3 = arrayList2;
                int i23 = size;
                Rect rect3 = rectA3;
                i11 = i19;
                View view3 = view2;
                Pools.SynchronizedPool synchronizedPool3 = synchronizedPool2;
                c(view3, true, rectA2);
                if (layoutParams3.insetEdge != 0 && !rectA2.isEmpty()) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(layoutParams3.insetEdge, layoutDirection);
                    int i24 = absoluteGravity & 112;
                    if (i24 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i24 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i25 = absoluteGravity & 7;
                    if (i25 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i25 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (layoutParams3.dodgeInsetEdges != 0 && view3.getVisibility() == 0 && ViewCompat.isLaidOut(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                    LayoutParams layoutParams4 = (LayoutParams) view3.getLayoutParams();
                    Behavior behavior2 = layoutParams4.getBehavior();
                    Rect rectA7 = a();
                    Rect rectA8 = a();
                    rectA8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                    if (behavior2 == null || !behavior2.getInsetDodgeRect(this, view3, rectA7)) {
                        rectA7.set(rectA8);
                    } else if (!rectA8.contains(rectA7)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                    }
                    rectA8.setEmpty();
                    synchronizedPool3.release(rectA8);
                    if (rectA7.isEmpty()) {
                        rectA7.setEmpty();
                        synchronizedPool3.release(rectA7);
                    } else {
                        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(layoutParams4.dodgeInsetEdges, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i17 = (rectA7.top - ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin) - layoutParams4.f19828e) >= (i18 = rectA.top)) {
                            z10 = false;
                        } else {
                            k(i18 - i17, view3);
                            z10 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin) + layoutParams4.f19828e) < (i16 = rectA.bottom)) {
                            k(height - i16, view3);
                        } else if (!z10) {
                            k(0, view3);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i14 = (rectA7.left - ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin) - layoutParams4.f19827d) >= (i15 = rectA.left)) {
                            z11 = false;
                        } else {
                            j(i15 - i14, view3);
                            z11 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin) + layoutParams4.f19827d) < (i13 = rectA.right)) {
                            j(width - i13, view3);
                        } else if (!z11) {
                            j(0, view3);
                        }
                        rectA7.setEmpty();
                        synchronizedPool3.release(rectA7);
                    }
                }
                if (i10 != 2) {
                    rect = rect3;
                    rect.set(((LayoutParams) view3.getLayoutParams()).f19835l);
                    if (rect.equals(rectA2)) {
                        arrayList = arrayList3;
                        i12 = i23;
                    } else {
                        ((LayoutParams) view3.getLayoutParams()).f19835l.set(rectA2);
                    }
                } else {
                    rect = rect3;
                }
                int i26 = i11 + 1;
                i12 = i23;
                while (true) {
                    arrayList = arrayList3;
                    if (i26 >= i12) {
                        break;
                    }
                    View view4 = (View) arrayList.get(i26);
                    LayoutParams layoutParams5 = (LayoutParams) view4.getLayoutParams();
                    Behavior behavior3 = layoutParams5.getBehavior();
                    if (behavior3 != null && behavior3.layoutDependsOn(this, view4, view3)) {
                        if (i10 == 0 && layoutParams5.f19834k) {
                            layoutParams5.f19834k = false;
                        } else {
                            if (i10 != 2) {
                                zOnDependentViewChanged = behavior3.onDependentViewChanged(this, view4, view3);
                            } else {
                                behavior3.onDependentViewRemoved(this, view4, view3);
                                zOnDependentViewChanged = true;
                            }
                            if (i10 == 1) {
                                layoutParams5.f19834k = zOnDependentViewChanged;
                            }
                        }
                    }
                    i26++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i12 = size;
                rect = rectA3;
                i11 = i19;
            }
            i19 = i11 + 1;
            rectA3 = rect;
            size = i12;
            arrayList2 = arrayList;
        }
    }

    public final boolean g(MotionEvent motionEvent, int i10) {
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f19817r0;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        d dVar = R0;
        if (dVar != null) {
            Collections.sort(arrayList, dVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.getBehavior();
            if (!(zOnInterceptTouchEvent || z10) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behavior != null) {
                    if (i10 == 0) {
                        zOnInterceptTouchEvent = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zOnInterceptTouchEvent = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.E0 = view;
                    }
                }
                Behavior behavior2 = layoutParams.f19824a;
                if (behavior2 == null) {
                    layoutParams.f19831h = false;
                }
                boolean z11 = layoutParams.f19831h;
                if (z11) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = (behavior2 != null ? behavior2.blocksInteractionBelow(this, view) : false) | z11;
                    layoutParams.f19831h = zBlocksInteractionBelow;
                }
                boolean z12 = zBlocksInteractionBelow && !z11;
                if (zBlocksInteractionBelow && !z12) {
                    break;
                }
                z10 = z12;
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    behavior.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zOnInterceptTouchEvent;
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        List<View> outgoingEdges = this.f19816q0.getOutgoingEdges(view);
        ArrayList arrayList = this.f19818s0;
        arrayList.clear();
        if (outgoingEdges != null) {
            arrayList.addAll(outgoingEdges);
        }
        return arrayList;
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        h();
        return Collections.unmodifiableList(this.f19815p0);
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List incomingEdges = this.f19816q0.getIncomingEdges(view);
        ArrayList arrayList = this.f19818s0;
        arrayList.clear();
        if (incomingEdges != null) {
            arrayList.addAll(incomingEdges);
        }
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.I0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.N0.getNestedScrollAxes();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.K0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:74:0x006b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:32:0x0077
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.h():void");
    }

    public final void i(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    behavior.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behavior.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((LayoutParams) getChildAt(i11).getLayoutParams()).f19831h = false;
        }
        this.E0 = null;
        this.f19821w0 = false;
    }

    public boolean isPointInChildBounds(@NonNull View view, int i10, int i11) {
        Pools.SynchronizedPool synchronizedPool = S0;
        Rect rectA = a();
        ViewGroupUtils.getDescendantRect(this, view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            rectA.setEmpty();
            synchronizedPool.release(rectA);
        }
    }

    public final void l() {
        if (!ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.setOnApplyWindowInsetsListener(this, null);
            return;
        }
        if (this.M0 == null) {
            this.M0 = new a();
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, this.M0);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i(false);
        if (this.H0) {
            if (this.G0 == null) {
                this.G0 = new c();
            }
            getViewTreeObserver().addOnPreDrawListener(this.G0);
        }
        if (this.I0 == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.f19822x0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i(false);
        if (this.H0 && this.G0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.G0);
        }
        View view = this.F0;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f19822x0 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.J0 || this.K0 == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.I0;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.K0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.K0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            i(true);
        }
        boolean zG = g(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            i(true);
        }
        return zG;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Behavior behavior;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        ArrayList arrayList = this.f19815p0;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).getBehavior()) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i10) {
        int i11;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        View view2 = layoutParams.f19829f;
        if (view2 == null && layoutParams.f19826c != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        Pools.SynchronizedPool synchronizedPool = S0;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                ViewGroupUtils.getDescendantRect(this, view2, rectA);
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                d(i10, rectA, rectA2, layoutParams2, measuredWidth, measuredHeight);
                b(layoutParams2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                synchronizedPool.release(rectA);
                rectA2.setEmpty();
                synchronizedPool.release(rectA2);
            }
        }
        int i12 = layoutParams.keyline;
        if (i12 < 0) {
            LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
            if (this.I0 != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
                rectA3.left = this.I0.getSystemWindowInsetLeft() + rectA3.left;
                rectA3.top = this.I0.getSystemWindowInsetTop() + rectA3.top;
                rectA3.right -= this.I0.getSystemWindowInsetRight();
                rectA3.bottom -= this.I0.getSystemWindowInsetBottom();
            }
            Rect rectA4 = a();
            int i13 = layoutParams3.gravity;
            if ((i13 & 7) == 0) {
                i13 |= GravityCompat.START;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            GravityCompat.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i10);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            synchronizedPool.release(rectA3);
            rectA4.setEmpty();
            synchronizedPool.release(rectA4);
            return;
        }
        LayoutParams layoutParams4 = (LayoutParams) view.getLayoutParams();
        int i14 = layoutParams4.gravity;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int[] iArr = this.f19823y0;
        int i17 = 0;
        if (iArr != null && i12 >= 0 && i12 < iArr.length) {
            i11 = iArr[i12];
        } else {
            toString();
            i11 = 0;
        }
        int i18 = i11 - measuredWidth2;
        if (i15 == 1) {
            i18 += measuredWidth2 / 2;
        } else if (i15 == 5) {
            i18 += measuredWidth2;
        }
        if (i16 == 16) {
            i17 = measuredHeight2 / 2;
        } else if (i16 == 80) {
            i17 = measuredHeight2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, Math.min(i18, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, Math.min(i17, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x0162  */
    /* JADX WARN: Code duplicated, block: B:84:0x0185  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behavior;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int absoluteGravity;
        h();
        int childCount = getChildCount();
        int i20 = 0;
        while (true) {
            if (i20 >= childCount) {
                z10 = false;
                break;
            }
            if (this.f19816q0.hasOutgoingEdges(getChildAt(i20))) {
                z10 = true;
                break;
            }
            i20++;
        }
        if (z10 != this.H0) {
            if (z10) {
                if (this.f19822x0) {
                    if (this.G0 == null) {
                        this.G0 = new c();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.G0);
                }
                this.H0 = true;
            } else {
                if (this.f19822x0 && this.G0 != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.G0);
                }
                this.H0 = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        boolean z12 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i21 = paddingLeft + paddingRight;
        int i22 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z13 = this.I0 != null && ViewCompat.getFitsSystemWindows(this);
        ArrayList arrayList2 = this.f19815p0;
        int size3 = arrayList2.size();
        int iMax2 = suggestedMinimumWidth;
        int iMax3 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i23 = 0;
        while (i23 < size3) {
            View view = (View) arrayList2.get(i23);
            if (view.getVisibility() == 8) {
                i13 = i23;
                i16 = size3;
                arrayList = arrayList2;
                z11 = false;
            } else {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                int i24 = layoutParams.keyline;
                if (i24 < 0 || mode == 0) {
                    i12 = iCombineMeasuredStates;
                    i13 = i23;
                } else {
                    i12 = iCombineMeasuredStates;
                    int[] iArr = this.f19823y0;
                    if (iArr == null) {
                        toString();
                        i13 = i23;
                    } else {
                        i13 = i23;
                        if (i24 < 0 || i24 >= iArr.length) {
                            toString();
                        } else {
                            i18 = iArr[i24];
                        }
                        i19 = layoutParams.gravity;
                        if (i19 == 0) {
                            i19 = 8388661;
                        }
                        absoluteGravity = GravityCompat.getAbsoluteGravity(i19, layoutDirection) & 7;
                        if ((absoluteGravity != 3 && !z12) || (absoluteGravity == 5 && z12)) {
                            iMax = Math.max(0, (size - paddingRight) - i18);
                        } else if ((absoluteGravity != 5 && !z12) || (absoluteGravity == 3 && z12)) {
                            iMax = Math.max(0, i18 - paddingLeft);
                        }
                        if (z13 || ViewCompat.getFitsSystemWindows(view)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int systemWindowInsetRight = this.I0.getSystemWindowInsetRight() + this.I0.getSystemWindowInsetLeft();
                            int systemWindowInsetBottom = this.I0.getSystemWindowInsetBottom() + this.I0.getSystemWindowInsetTop();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - systemWindowInsetRight, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetBottom, mode2);
                        }
                        behavior = layoutParams.getBehavior();
                        if (behavior != null) {
                            i17 = i12;
                            z11 = false;
                            i14 = iMax3;
                            i15 = iMax2;
                            i16 = size3;
                            arrayList = arrayList2;
                            if (!behavior.onMeasureChild(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                            }
                            iMax2 = Math.max(i15, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                            iMax3 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i17, view.getMeasuredState());
                        } else {
                            i14 = iMax3;
                            i15 = iMax2;
                            i16 = size3;
                            arrayList = arrayList2;
                            i17 = i12;
                            z11 = false;
                        }
                        onMeasureChild(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                        iMax2 = Math.max(i15, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        iMax3 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i17, view.getMeasuredState());
                    }
                    i18 = 0;
                    i19 = layoutParams.gravity;
                    if (i19 == 0) {
                        i19 = 8388661;
                    }
                    absoluteGravity = GravityCompat.getAbsoluteGravity(i19, layoutDirection) & 7;
                    if (absoluteGravity != 3) {
                        if (absoluteGravity != 5) {
                        }
                    } else if (absoluteGravity != 5) {
                    }
                    if (z13) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        i17 = i12;
                        z11 = false;
                        i14 = iMax3;
                        i15 = iMax2;
                        i16 = size3;
                        arrayList = arrayList2;
                        if (!behavior.onMeasureChild(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        iMax2 = Math.max(i15, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        iMax3 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i17, view.getMeasuredState());
                    } else {
                        i14 = iMax3;
                        i15 = iMax2;
                        i16 = size3;
                        arrayList = arrayList2;
                        i17 = i12;
                        z11 = false;
                    }
                    onMeasureChild(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    iMax2 = Math.max(i15, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    iMax3 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i17, view.getMeasuredState());
                }
                iMax = 0;
                if (z13) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    i17 = i12;
                    z11 = false;
                    i14 = iMax3;
                    i15 = iMax2;
                    i16 = size3;
                    arrayList = arrayList2;
                    if (!behavior.onMeasureChild(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                    }
                    iMax2 = Math.max(i15, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    iMax3 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i17, view.getMeasuredState());
                } else {
                    i14 = iMax3;
                    i15 = iMax2;
                    i16 = size3;
                    arrayList = arrayList2;
                    i17 = i12;
                    z11 = false;
                }
                onMeasureChild(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                iMax2 = Math.max(i15, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                iMax3 = Math.max(i14, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i17, view.getMeasuredState());
            }
            i23 = i13 + 1;
            size3 = i16;
            arrayList2 = arrayList;
        }
        int i25 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(iMax2, i10, (-16777216) & i25), View.resolveSizeAndState(iMax3, i11, i25 << 16));
    }

    public void onMeasureChild(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f6, float f10, boolean z10) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zOnNestedFling = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(0) && (behavior = layoutParams.getBehavior()) != null) {
                    zOnNestedFling |= behavior.onNestedFling(this, childAt, view, f6, f10, z10);
                }
            }
        }
        if (zOnNestedFling) {
            f(1);
        }
        return zOnNestedFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f6, float f10) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zOnNestedPreFling = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(0) && (behavior = layoutParams.getBehavior()) != null) {
                    zOnNestedPreFling |= behavior.onNestedPreFling(this, childAt, view, f6, f10);
                }
            }
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f19836q0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            Behavior behavior = e(childAt).getBehavior();
            if (id != -1 && behavior != null && (parcelable2 = sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (id != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.f19836q0 = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zG;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.E0 == null) {
            zG = g(motionEvent, 1);
            if (!zG) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.E0 == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zG) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                i(false);
            }
            return zOnTouchEvent;
        }
        zG = false;
        Behavior behavior = ((LayoutParams) this.E0.getLayoutParams()).getBehavior();
        if (behavior != null) {
            zOnTouchEvent = behavior.onTouchEvent(this, this.E0, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.E0 == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zG) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            i(false);
        } else {
            i(false);
        }
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f19821w0) {
            return;
        }
        i(false);
        this.f19821w0 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        l();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.L0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.K0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.K0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.K0.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.K0, ViewCompat.getLayoutDirection(this));
                this.K0.setVisible(getVisibility() == 0, false);
                this.K0.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i10) {
        setStatusBarBackground(i10 != 0 ? ContextCompat.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.K0;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.K0.setVisible(z10, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.K0;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(i12) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.f19820u0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f19820u0;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr3[1]) : Math.min(iMax2, iArr3[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            f(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.v0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        Behavior behavior;
        this.N0.onNestedScrollAccepted(view, view2, i10, i11);
        this.F0 = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.a(i11) && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    boolean zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i10, i11);
                    z10 |= zOnStartNestedScroll;
                    if (i11 == 0) {
                        layoutParams.f19832i = zOnStartNestedScroll;
                    } else if (i11 == 1) {
                        layoutParams.f19833j = zOnStartNestedScroll;
                    }
                } else if (i11 == 0) {
                    layoutParams.f19832i = false;
                } else if (i11 == 1) {
                    layoutParams.f19833j = false;
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i10) {
        this.N0.onStopNestedScroll(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.a(i10)) {
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    layoutParams.f19832i = false;
                } else if (i10 == 1) {
                    layoutParams.f19833j = false;
                }
                layoutParams.f19834k = false;
            }
        }
        this.F0 = null;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i10);
        this.f19815p0 = new ArrayList();
        this.f19816q0 = new DirectedAcyclicGraph<>();
        this.f19817r0 = new ArrayList();
        this.f19818s0 = new ArrayList();
        this.f19820u0 = new int[2];
        this.v0 = new int[2];
        this.N0 = new NestedScrollingParentHelper(this);
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, R.styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, R.styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f19823y0 = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f19823y0;
                iArr[i11] = (int) (iArr[i11] * f6);
            }
        }
        this.K0 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        l();
        super.setOnHierarchyChangeListener(new b());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        Behavior behavior;
        int iMin;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(i14) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.f19820u0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f19820u0;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i13 > 0) {
                        iMin = Math.max(i15, iArr3[1]);
                    } else {
                        iMin = Math.min(i15, iArr3[1]);
                    }
                    i15 = iMin;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i15;
        if (z10) {
            f(1);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SparseArray<Parcelable> f19836q0;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f19836q0 = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f19836q0.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f19836q0;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f19836q0.keyAt(i11);
                parcelableArr[i11] = this.f19836q0.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Behavior f19824a;
        public int anchorGravity;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19827d;
        public int dodgeInsetEdges;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f19829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f19830g;
        public int gravity;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f19831h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f19832i;
        public int insetEdge;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f19833j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f19834k;
        public int keyline;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Rect f19835l;
        public Object m;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f19825b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f19826c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f19835l = new Rect();
        }

        public final boolean a(int i10) {
            if (i10 == 0) {
                return this.f19832i;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f19833j;
        }

        @IdRes
        public int getAnchorId() {
            return this.f19826c;
        }

        @Nullable
        public Behavior getBehavior() {
            return this.f19824a;
        }

        public void setAnchorId(@IdRes int i10) {
            this.f19830g = null;
            this.f19829f = null;
            this.f19826c = i10;
        }

        public void setBehavior(@Nullable Behavior behavior) {
            Behavior behavior2 = this.f19824a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f19824a = behavior;
                this.m = null;
                this.f19825b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            Behavior behaviorNewInstance;
            super(context, attributeSet);
            this.f19825b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f19826c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f19835l = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f19826c = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = typedArrayObtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = typedArrayObtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = typedArrayObtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = typedArrayObtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i10 = R.styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f19825b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(i10);
                String str = CoordinatorLayout.O0;
                if (TextUtils.isEmpty(string)) {
                    behaviorNewInstance = null;
                } else {
                    if (string.startsWith(Constant.DOT_STRING)) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.O0;
                        if (!TextUtils.isEmpty(str2)) {
                            string = ad.d.e(str2, '.', string);
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.Q0;
                        Map<String, Constructor<Behavior>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<Behavior> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.P0);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behaviorNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e5) {
                        throw new RuntimeException(f.d("Could not inflate Behavior subclass ", string), e5);
                    }
                }
                this.f19824a = behaviorNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f19824a;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f19825b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f19826c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f19835l = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f19825b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f19826c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f19835l = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19825b = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.f19826c = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.f19835l = new Rect();
        }
    }
}
