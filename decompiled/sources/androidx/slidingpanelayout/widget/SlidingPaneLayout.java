package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    public static final boolean S0;
    public int E0;
    public float F0;
    public float G0;
    public final CopyOnWriteArrayList H0;

    @Nullable
    public PanelSlideListener I0;
    public final ViewDragHelper J0;
    public boolean K0;
    public boolean L0;
    public final Rect M0;
    public final ArrayList<c> N0;
    public int O0;
    public FoldingFeature P0;
    public final a Q0;
    public FoldingFeatureObserver R0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f23462p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f23463q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Drawable f23464r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Drawable f23465s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f23466t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View f23467u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f23468w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f23469x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f23470y0;

    public interface PanelSlideListener {
        void onPanelClosed(@NonNull View view);

        void onPanelOpened(@NonNull View view);

        void onPanelSlide(@NonNull View view, float f6);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f23474q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f23475r0;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f23474q0 = parcel.readInt() != 0;
            this.f23475r0 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f23474q0 ? 1 : 0);
            parcel.writeInt(this.f23475r0);
        }
    }

    public class a implements FoldingFeatureObserver.OnFoldingFeatureChangeListener {
        public a() {
        }

        @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
        public final void onFoldingFeatureChange(@NonNull FoldingFeature foldingFeature) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.P0 = foldingFeature;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(300L);
            changeBounds.setInterpolator(PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
            TransitionManager.beginDelayedTransition(slidingPaneLayout, changeBounds);
            slidingPaneLayout.requestLayout();
        }
    }

    public class b extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f23477a = new Rect();

        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            Rect rect = this.f23477a;
            accessibilityNodeInfoCompatObtain.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompatObtain.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompatObtain.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompatObtain.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompatObtain.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompatObtain.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompatObtain.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompatObtain.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompatObtain.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompatObtain.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompatObtain.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompatObtain.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompatObtain.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompatObtain.getMovementGranularities());
            accessibilityNodeInfoCompatObtain.recycle();
            accessibilityNodeInfoCompat.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            accessibilityNodeInfoCompat.setSource(view);
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = slidingPaneLayout.getChildAt(i10);
                if (!slidingPaneLayout.a(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.a(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class d extends ViewDragHelper.Callback {
        public d() {
        }

        public final boolean a() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f23470y0 || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (slidingPaneLayout.isOpen() && slidingPaneLayout.getLockMode() == 1) {
                return false;
            }
            return slidingPaneLayout.isOpen() || slidingPaneLayout.getLockMode() != 2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i10, int i11) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f23467u0.getLayoutParams();
            if (!slidingPaneLayout.b()) {
                int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i10, paddingLeft), slidingPaneLayout.f23469x0 + paddingLeft);
            }
            int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f23467u0.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i10, width), width - slidingPaneLayout.f23469x0);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f23469x0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeDragStarted(int i10, int i11) {
            if (a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.J0.captureChildView(slidingPaneLayout.f23467u0, i11);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeTouched(int i10, int i11) {
            if (a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.J0.captureChildView(slidingPaneLayout.f23467u0, i11);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i10) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = slidingPaneLayout.getChildAt(i11);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i10) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.J0.getViewDragState() == 0) {
                float f6 = slidingPaneLayout.v0;
                CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.H0;
                if (f6 != 1.0f) {
                    View view = slidingPaneLayout.f23467u0;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((PanelSlideListener) it.next()).onPanelOpened(view);
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.K0 = true;
                    return;
                }
                slidingPaneLayout.e(slidingPaneLayout.f23467u0);
                View view2 = slidingPaneLayout.f23467u0;
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((PanelSlideListener) it2.next()).onPanelClosed(view2);
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.K0 = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f23467u0 == null) {
                slidingPaneLayout.v0 = 0.0f;
            } else {
                boolean zB = slidingPaneLayout.b();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f23467u0.getLayoutParams();
                int width = slidingPaneLayout.f23467u0.getWidth();
                if (zB) {
                    i10 = (slidingPaneLayout.getWidth() - i10) - width;
                }
                float paddingRight = (i10 - ((zB ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zB ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f23469x0;
                slidingPaneLayout.v0 = paddingRight;
                if (slidingPaneLayout.E0 != 0) {
                    slidingPaneLayout.c(paddingRight);
                }
                View view2 = slidingPaneLayout.f23467u0;
                Iterator it = slidingPaneLayout.H0.iterator();
                while (it.hasNext()) {
                    ((PanelSlideListener) it.next()).onPanelSlide(view2, slidingPaneLayout.v0);
                }
            }
            slidingPaneLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f6, float f10) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.b()) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f6 < 0.0f || (f6 == 0.0f && slidingPaneLayout.v0 > 0.5f)) {
                    paddingRight += slidingPaneLayout.f23469x0;
                }
                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f23467u0.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f6 > 0.0f || (f6 == 0.0f && slidingPaneLayout.v0 > 0.5f)) {
                    paddingLeft += slidingPaneLayout.f23469x0;
                }
            }
            slidingPaneLayout.J0.settleCapturedViewAt(paddingLeft, view.getTop());
            slidingPaneLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i10) {
            if (a()) {
                return ((LayoutParams) view.getLayoutParams()).f23472a;
            }
            return false;
        }
    }

    public static class e extends FrameLayout {
        @Override // android.view.View
        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        S0 = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat rootWindowInsets;
        if (!S0 || (rootWindowInsets = ViewCompat.getRootWindowInsets(this)) == null) {
            return null;
        }
        return rootWindowInsets.getSystemGestureInsets();
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.R0 = foldingFeatureObserver;
        foldingFeatureObserver.setOnFoldingFeatureChangeListener(this.Q0);
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return this.f23466t0 && ((LayoutParams) view.getLayoutParams()).f23473b && this.v0 > 0.0f;
    }

    public void addPanelSlideListener(@NonNull PanelSlideListener panelSlideListener) {
        this.H0.add(panelSlideListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i10, layoutParams);
            return;
        }
        e eVar = new e(view.getContext());
        eVar.addView(view);
        super.addView(eVar, i10, layoutParams);
    }

    public final boolean b() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final void c(float f6) {
        boolean zB = b();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f23467u0) {
                float f10 = 1.0f - this.f23468w0;
                int i11 = this.E0;
                this.f23468w0 = f6;
                int i12 = ((int) (f10 * i11)) - ((int) ((1.0f - f6) * i11));
                if (zB) {
                    i12 = -i12;
                }
                childAt.offsetLeftAndRight(i12);
            }
        }
    }

    public boolean canScroll(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && canScroll(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z10) {
            if (view.canScrollHorizontally(b() ? i10 : -i10)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean canSlide() {
        return this.f23466t0;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closePane();
    }

    public boolean closePane() {
        if (!this.f23466t0) {
            this.K0 = false;
        }
        if (!this.L0 && !d(1.0f)) {
            return false;
        }
        this.K0 = false;
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        ViewDragHelper viewDragHelper = this.J0;
        if (viewDragHelper.continueSettling(true)) {
            if (this.f23466t0) {
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                viewDragHelper.abort();
            }
        }
    }

    public final boolean d(float f6) {
        int paddingLeft;
        if (!this.f23466t0) {
            return false;
        }
        boolean zB = b();
        LayoutParams layoutParams = (LayoutParams) this.f23467u0.getLayoutParams();
        if (zB) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f6 * this.f23469x0) + paddingRight) + this.f23467u0.getWidth()));
        } else {
            paddingLeft = (int) ((f6 * this.f23469x0) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        View view = this.f23467u0;
        if (!this.J0.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int right;
        super.draw(canvas);
        Drawable drawable = b() ? this.f23465s0 : this.f23464r0;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (b()) {
            right = childAt.getRight();
            i10 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i11 = left - intrinsicWidth;
            i10 = left;
            right = i11;
        }
        drawable.setBounds(right, top, i10, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean zB = b() ^ isOpen();
        ViewDragHelper viewDragHelper = this.J0;
        if (zB) {
            viewDragHelper.setEdgeTrackingEnabled(1);
            Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                viewDragHelper.setEdgeSize(Math.max(viewDragHelper.getDefaultEdgeSize(), systemGestureInsets.left));
            }
        } else {
            viewDragHelper.setEdgeTrackingEnabled(2);
            Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                viewDragHelper.setEdgeSize(Math.max(viewDragHelper.getDefaultEdgeSize(), systemGestureInsets2.right));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f23466t0 && !layoutParams.f23472a && this.f23467u0 != null) {
            Rect rect = this.M0;
            canvas.getClipBounds(rect);
            if (b()) {
                rect.left = Math.max(rect.left, this.f23467u0.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f23467u0.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final void e(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zB = b();
        int width = zB ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zB ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount && (childAt = getChildAt(i10)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zB ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zB ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i10++;
            view2 = view;
            zB = zB;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f23463q0;
    }

    public final int getLockMode() {
        return this.O0;
    }

    @Px
    public int getParallaxDistance() {
        return this.E0;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.f23462p0;
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return !this.f23466t0 || this.v0 == 0.0f;
    }

    public boolean isSlideable() {
        return this.f23466t0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.L0 = true;
        if (this.R0 != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                this.R0.registerLayoutStateChangeCallback(activity);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L0 = true;
        FoldingFeatureObserver foldingFeatureObserver = this.R0;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.unregisterLayoutStateChangeCallback();
        }
        ArrayList<c> arrayList = this.N0;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = this.f23466t0;
        ViewDragHelper viewDragHelper = this.J0;
        if (!z11 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.K0 = viewDragHelper.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f23466t0 || (this.f23470y0 && actionMasked != 0)) {
            viewDragHelper.cancel();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            viewDragHelper.cancel();
            return false;
        }
        if (actionMasked == 0) {
            this.f23470y0 = false;
            float x4 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.F0 = x4;
            this.G0 = y7;
            if (viewDragHelper.isViewUnder(this.f23467u0, (int) x4, (int) y7) && a(this.f23467u0)) {
                z10 = true;
            }
            return viewDragHelper.shouldInterceptTouchEvent(motionEvent) || z10;
        }
        if (actionMasked == 2) {
            float x6 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float fAbs = Math.abs(x6 - this.F0);
            float fAbs2 = Math.abs(y10 - this.G0);
            if (fAbs > viewDragHelper.getTouchSlop() && fAbs2 > fAbs) {
                viewDragHelper.cancel();
                this.f23470y0 = true;
                return false;
            }
        }
        z10 = false;
        if (viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zB = b();
        int i19 = i12 - i10;
        int paddingRight = zB ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zB ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.L0) {
            this.v0 = (this.f23466t0 && this.K0) ? 0.0f : 1.0f;
        }
        int i20 = paddingRight;
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                i14 = i20;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f23472a) {
                    int i22 = i19 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i22) - i20) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f23469x0 = iMin;
                    int i23 = zB ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f23473b = (measuredWidth / 2) + ((i20 + i23) + iMin) > i22;
                    int i24 = (int) (iMin * this.v0);
                    i14 = i23 + i24 + i20;
                    this.v0 = i24 / iMin;
                    i15 = 0;
                } else if (!this.f23466t0 || (i16 = this.E0) == 0) {
                    i14 = paddingRight;
                    i15 = 0;
                } else {
                    i15 = (int) ((1.0f - this.v0) * i16);
                    i14 = paddingRight;
                }
                if (zB) {
                    i18 = (i19 - i14) + i15;
                    i17 = i18 - measuredWidth;
                } else {
                    i17 = i14 - i15;
                    i18 = i17 + measuredWidth;
                }
                childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                FoldingFeature foldingFeature = this.P0;
                paddingRight = Math.abs((foldingFeature != null && foldingFeature.getOrientation() == FoldingFeature.Orientation.VERTICAL && this.P0.isSeparating()) ? this.P0.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
            }
            i21++;
            i20 = i14;
        }
        if (this.L0) {
            if (this.f23466t0 && this.E0 != 0) {
                c(this.v0);
            }
            e(this.f23467u0);
        }
        this.L0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x007d A[PHI: r16
      0x007d: PHI (r16v2 float) = (r16v1 float), (r16v3 float) binds: [B:16:0x0073, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b0  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v36 */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int paddingTop;
        int iMin;
        int i12;
        int iMax;
        int iMakeMeasureSpec;
        int i13;
        ArrayList arrayList;
        int i14;
        int minimumWidth;
        int iMax2;
        int i15;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z10;
        int i16;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        ?? r10 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f23467u0 = null;
        int i17 = 0;
        boolean z11 = false;
        int i18 = iMax3;
        float f6 = 0.0f;
        while (true) {
            i12 = 8;
            if (i17 >= childCount) {
                break;
            }
            View childAt = getChildAt(i17);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i19 = size;
            if (childAt.getVisibility() == 8) {
                layoutParams.f23473b = r10;
            } else {
                float f10 = layoutParams.weight;
                if (f10 > 0.0f) {
                    f6 += f10;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r10);
                        i15 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (i15 == -2) {
                            if (mode == 0) {
                                i16 = mode;
                            } else {
                                i16 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i16);
                        } else if (i15 == -1) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i18 -= measuredWidth;
                        if (i17 != 0) {
                            if (i18 < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            layoutParams.f23472a = z10;
                            z11 |= z10;
                            if (z10) {
                                this.f23467u0 = childAt;
                            }
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r10);
                    i15 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    if (i15 == -2) {
                        if (mode == 0) {
                            i16 = mode;
                        } else {
                            i16 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i16);
                    } else if (i15 == -1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i18 -= measuredWidth2;
                    if (i17 != 0) {
                        if (i18 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        layoutParams.f23472a = z10;
                        z11 |= z10;
                        if (z10) {
                            this.f23467u0 = childAt;
                        }
                    }
                }
            }
            i17++;
            size = i19;
            r10 = 0;
        }
        int i20 = size;
        if (z11 || f6 > 0.0f) {
            int i21 = 0;
            while (i21 < childCount) {
                View childAt2 = getChildAt(i21);
                if (childAt2.getVisibility() == i12) {
                    i13 = i18;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth3 = (((ViewGroup.MarginLayoutParams) layoutParams2).width != 0 || layoutParams2.weight <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z11) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (layoutParams2.weight > 0.0f) {
                        iMax = ((int) ((layoutParams2.weight * Math.max(0, i18)) / f6)) + measuredWidth3;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    i13 = i18;
                    int iMakeMeasureSpec3 = (((ViewGroup.MarginLayoutParams) layoutParams3).width != 0 || layoutParams3.weight <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i11, paddingBottom, ((ViewGroup.MarginLayoutParams) layoutParams3).height);
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i21++;
                i18 = i13;
                i12 = 8;
            }
        }
        FoldingFeature foldingFeature = this.P0;
        if (foldingFeature == null || !foldingFeature.isSeparating() || this.P0.getBounds().left == 0 || this.P0.getBounds().top != 0) {
            arrayList = null;
        } else {
            FoldingFeature foldingFeature2 = this.P0;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i22 = iArr[0];
            Rect rect = new Rect(i22, iArr[1], getWidth() + i22, getWidth() + iArr[1]);
            Rect rect2 = new Rect(foldingFeature2.getBounds());
            boolean zIntersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 == null) {
                arrayList = null;
            } else {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        if (arrayList != null && !z11) {
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                if (childAt3.getVisibility() != 8) {
                    Rect rect4 = (Rect) arrayList.get(i23);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    int i24 = ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) != 1) {
                        boolean z12 = childAt3 instanceof e;
                        if (z12) {
                            i14 = 0;
                            minimumWidth = ViewCompat.getMinimumWidth(((e) childAt3).getChildAt(0));
                        } else {
                            i14 = 0;
                            minimumWidth = ViewCompat.getMinimumWidth(childAt3);
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z12 ? ViewCompat.getMinimumWidth(((e) childAt3).getChildAt(i14)) : ViewCompat.getMinimumWidth(childAt3))) {
                            }
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                    }
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i24, 1073741824), iMakeMeasureSpec4);
                    if (i23 != 0) {
                        layoutParams4.f23472a = true;
                        this.f23467u0 = childAt3;
                        z11 = true;
                    }
                }
            }
        }
        setMeasuredDimension(i20, getPaddingBottom() + getPaddingTop() + iMin);
        this.f23466t0 = z11;
        ViewDragHelper viewDragHelper = this.J0;
        if (viewDragHelper.getViewDragState() == 0 || z11) {
            return;
        }
        viewDragHelper.abort();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f23474q0) {
            openPane();
        } else {
            closePane();
        }
        this.K0 = savedState.f23474q0;
        setLockMode(savedState.f23475r0);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23474q0 = isSlideable() ? isOpen() : this.K0;
        savedState.f23475r0 = this.O0;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.L0 = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23466t0) {
            return super.onTouchEvent(motionEvent);
        }
        ViewDragHelper viewDragHelper = this.J0;
        viewDragHelper.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.F0 = x4;
            this.G0 = y7;
        } else if (actionMasked == 1 && a(this.f23467u0)) {
            float x6 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f6 = x6 - this.F0;
            float f10 = y10 - this.G0;
            int touchSlop = viewDragHelper.getTouchSlop();
            if ((f10 * f10) + (f6 * f6) < touchSlop * touchSlop && viewDragHelper.isViewUnder(this.f23467u0, (int) x6, (int) y10)) {
                if (!this.f23466t0) {
                    this.K0 = false;
                }
                if (this.L0 || d(1.0f)) {
                    this.K0 = false;
                }
            }
        }
        return true;
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openPane();
    }

    public boolean openPane() {
        if (!this.f23466t0) {
            this.K0 = true;
        }
        if (!this.L0 && !d(0.0f)) {
            return false;
        }
        this.K0 = true;
        return true;
    }

    public void removePanelSlideListener(@NonNull PanelSlideListener panelSlideListener) {
        this.H0.remove(panelSlideListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NonNull View view) {
        if (view.getParent() instanceof e) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f23466t0) {
            return;
        }
        this.K0 = view == this.f23467u0;
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int i10) {
        this.f23463q0 = i10;
    }

    public final void setLockMode(int i10) {
        this.O0 = i10;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        PanelSlideListener panelSlideListener2 = this.I0;
        if (panelSlideListener2 != null) {
            removePanelSlideListener(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            addPanelSlideListener(panelSlideListener);
        }
        this.I0 = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i10) {
        this.E0 = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f23464r0 = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.f23465s0 = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i10) {
        setShadowDrawableLeft(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i10));
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int i10) {
        this.f23462p0 = i10;
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f23471c = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23473b;
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23471c);
            this.weight = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23462p0 = 0;
        this.v0 = 1.0f;
        this.H0 = new CopyOnWriteArrayList();
        this.L0 = true;
        this.M0 = new Rect();
        this.N0 = new ArrayList<>();
        this.Q0 = new a();
        float f6 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new b());
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 0.5f, new d());
        this.J0 = viewDragHelperCreate;
        viewDragHelperCreate.setMinVelocity(f6 * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(k.a(context), ContextCompat.getMainExecutor(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(@NonNull View view, float f6) {
        }
    }
}
