package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup implements Openable {
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int[] f21162f1 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int[] f21163g1 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final boolean f21164h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final boolean f21165i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final boolean f21166j1;
    public int E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;

    @Nullable
    public DrawerListener M0;
    public ArrayList N0;
    public float O0;
    public float P0;
    public Drawable Q0;
    public Drawable R0;
    public Drawable S0;
    public CharSequence T0;
    public CharSequence U0;
    public Object V0;
    public boolean W0;
    public Drawable X0;
    public Drawable Y0;
    public Drawable Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Drawable f21167a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final ArrayList<View> f21168b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Rect f21169c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public Matrix f21170d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final a f21171e1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final d f21172p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f21173q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f21174r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f21175s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f21176t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Paint f21177u0;
    public final ViewDragHelper v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ViewDragHelper f21178w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final e f21179x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final e f21180y0;

    public interface DrawerListener {
        void onDrawerClosed(@NonNull View view);

        void onDrawerOpened(@NonNull View view);

        void onDrawerSlide(@NonNull View view, float f6);

        void onDrawerStateChanged(int i10);
    }

    public class a implements AccessibilityViewCommand {
        public a() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (!drawerLayout.isDrawerOpen(view) || drawerLayout.getDrawerLockMode(view) == 2) {
                return false;
            }
            drawerLayout.closeDrawer(view);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f21190a = new Rect();

        public c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence drawerTitle;
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewE = drawerLayout.e();
            if (viewE == null || (drawerTitle = drawerLayout.getDrawerTitle(drawerLayout.f(viewE))) == null) {
                return true;
            }
            text.add(drawerTitle);
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.f21164h1) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
                accessibilityNodeInfoCompat.setSource(view);
                Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
                if (parentForAccessibility instanceof View) {
                    accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
                }
                Rect rect = this.f21190a;
                accessibilityNodeInfoCompatObtain.getBoundsInScreen(rect);
                accessibilityNodeInfoCompat.setBoundsInScreen(rect);
                accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompatObtain.isVisibleToUser());
                accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompatObtain.getPackageName());
                accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompatObtain.getClassName());
                accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompatObtain.getContentDescription());
                accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompatObtain.isEnabled());
                accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompatObtain.isFocused());
                accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompatObtain.isAccessibilityFocused());
                accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompatObtain.isSelected());
                accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompatObtain.getActions());
                accessibilityNodeInfoCompatObtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (DrawerLayout.h(childAt)) {
                        accessibilityNodeInfoCompat.addChild(childAt);
                    }
                }
            }
            accessibilityNodeInfoCompat.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfoCompat.setFocusable(false);
            accessibilityNodeInfoCompat.setFocused(false);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f21164h1 || DrawerLayout.h(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class d extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (DrawerLayout.h(view)) {
                return;
            }
            accessibilityNodeInfoCompat.setParent(null);
        }
    }

    public class e extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewDragHelper f21193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f21194e = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View viewC;
                int width;
                e eVar = e.this;
                int edgeSize = eVar.f21193d.getEdgeSize();
                int i10 = eVar.f21192c;
                boolean z10 = i10 == 3;
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z10) {
                    viewC = drawerLayout.c(3);
                    width = (viewC != null ? -viewC.getWidth() : 0) + edgeSize;
                } else {
                    viewC = drawerLayout.c(5);
                    width = drawerLayout.getWidth() - edgeSize;
                }
                if (viewC != null) {
                    if (((!z10 || viewC.getLeft() >= width) && (z10 || viewC.getLeft() <= width)) || drawerLayout.getDrawerLockMode(viewC) != 0) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) viewC.getLayoutParams();
                    eVar.f21193d.smoothSlideViewTo(viewC, width, viewC.getTop());
                    layoutParams.f21182b = true;
                    drawerLayout.invalidate();
                    View viewC2 = drawerLayout.c(i10 == 3 ? 5 : 3);
                    if (viewC2 != null) {
                        drawerLayout.closeDrawer(viewC2);
                    }
                    if (drawerLayout.L0) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        drawerLayout.getChildAt(i11).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.L0 = true;
                }
            }
        }

        public e(int i10) {
            this.f21192c = i10;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i10, int i11) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.j(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeDragStarted(int i10, int i11) {
            int i12 = i10 & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewC = i12 == 1 ? drawerLayout.c(3) : drawerLayout.c(5);
            if (viewC == null || drawerLayout.getDrawerLockMode(viewC) != 0) {
                return;
            }
            this.f21193d.captureChildView(viewC, i11);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean onEdgeLock(int i10) {
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeTouched(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f21194e, 160L);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i10) {
            ((LayoutParams) view.getLayoutParams()).f21182b = false;
            int i11 = this.f21192c == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewC = drawerLayout.c(i11);
            if (viewC != null) {
                drawerLayout.closeDrawer(viewC);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i10) {
            DrawerLayout.this.p(i10, this.f21193d.getCapturedView());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.a(3, view) ? i10 + width : drawerLayout.getWidth() - i10) / width;
            drawerLayout.m(width2, view);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f6, float f10) {
            int i10;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f11 = ((LayoutParams) view.getLayoutParams()).f21181a;
            int width = view.getWidth();
            if (drawerLayout.a(3, view)) {
                i10 = (f6 > 0.0f || (f6 == 0.0f && f11 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f6 < 0.0f || (f6 == 0.0f && f11 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f21193d.settleCapturedViewAt(i10, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i10) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            return DrawerLayout.j(view) && drawerLayout.a(this.f21192c, view) && drawerLayout.getDrawerLockMode(view) == 0;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f21164h1 = true;
        f21165i1 = true;
        f21166j1 = i10 >= 29;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    public static String g(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean h(View view) {
        return (ViewCompat.getImportantForAccessibility(view) == 4 || ViewCompat.getImportantForAccessibility(view) == 2) ? false : true;
    }

    public static boolean i(View view) {
        return ((LayoutParams) view.getLayoutParams()).gravity == 0;
    }

    public static boolean j(View view) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(int i10, View view) {
        return (f(view) & i10) == i10;
    }

    public void addDrawerListener(@NonNull DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.N0 == null) {
            this.N0 = new ArrayList();
        }
        this.N0.add(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            arrayList2 = this.f21168b1;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (!j(childAt)) {
                arrayList2.add(childAt);
            } else if (isDrawerOpen(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
            i12++;
        }
        if (!z10) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = arrayList2.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (d() != null || j(view)) {
            ViewCompat.setImportantForAccessibility(view, 4);
        } else {
            ViewCompat.setImportantForAccessibility(view, 1);
        }
        if (f21164h1) {
            return;
        }
        ViewCompat.setAccessibilityDelegate(view, this.f21172p0);
    }

    public final void b(boolean z10) {
        int childCount = getChildCount();
        boolean zSmoothSlideViewTo = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (j(childAt) && (!z10 || layoutParams.f21182b)) {
                zSmoothSlideViewTo |= a(3, childAt) ? this.v0.smoothSlideViewTo(childAt, -childAt.getWidth(), childAt.getTop()) : this.f21178w0.smoothSlideViewTo(childAt, getWidth(), childAt.getTop());
                layoutParams.f21182b = false;
            }
        }
        e eVar = this.f21179x0;
        DrawerLayout.this.removeCallbacks(eVar.f21194e);
        e eVar2 = this.f21180y0;
        DrawerLayout.this.removeCallbacks(eVar2.f21194e);
        if (zSmoothSlideViewTo) {
            invalidate();
        }
    }

    public final View c(int i10) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((f(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closeDrawer(GravityCompat.START);
    }

    public void closeDrawer(@NonNull View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        b(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i10).getLayoutParams()).f21181a);
        }
        this.f21176t0 = fMax;
        boolean zContinueSettling = this.v0.continueSettling(true);
        boolean zContinueSettling2 = this.f21178w0.continueSettling(true);
        if (zContinueSettling || zContinueSettling2) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final View d() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((LayoutParams) childAt.getLayoutParams()).f21183c & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f21176t0 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y7 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.f21169c1 == null) {
                this.f21169c1 = new Rect();
            }
            childAt.getHitRect(this.f21169c1);
            if (this.f21169c1.contains((int) x4, (int) y7) && !i(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f21170d1 == null) {
                            this.f21170d1 = new Matrix();
                        }
                        matrix.invert(this.f21170d1);
                        motionEventObtain.transform(this.f21170d1);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        Drawable background;
        int height = getHeight();
        boolean zI = i(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zI) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && j(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f6 = this.f21176t0;
        if (f6 > 0.0f && zI) {
            int i13 = this.f21175s0;
            int i14 = (i13 & ViewCompat.MEASURED_SIZE_MASK) | (((int) ((((-16777216) & i13) >>> 24) * f6)) << 24);
            Paint paint = this.f21177u0;
            paint.setColor(i14);
            canvas.drawRect(i10, 0.0f, width, getHeight(), paint);
        } else if (this.R0 != null && a(3, view)) {
            int intrinsicWidth = this.R0.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.v0.getEdgeSize(), 1.0f));
            this.R0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.R0.setAlpha((int) (fMax * 255.0f));
            this.R0.draw(canvas);
        } else if (this.S0 != null && a(5, view)) {
            int intrinsicWidth2 = this.S0.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f21178w0.getEdgeSize(), 1.0f));
            this.S0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.S0.setAlpha((int) (fMax2 * 255.0f));
            this.S0.draw(canvas);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (j(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final int f(View view) {
        return GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f21165i1) {
            return this.f21173q0;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i10) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        if (i10 == 3) {
            int i11 = this.H0;
            if (i11 != 3) {
                return i11;
            }
            int i12 = layoutDirection == 0 ? this.J0 : this.K0;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.I0;
            if (i13 != 3) {
                return i13;
            }
            int i14 = layoutDirection == 0 ? this.K0 : this.J0;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.J0;
            if (i15 != 3) {
                return i15;
            }
            int i16 = layoutDirection == 0 ? this.H0 : this.I0;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.K0;
        if (i17 != 3) {
            return i17;
        }
        int i18 = layoutDirection == 0 ? this.I0 : this.H0;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    @Nullable
    public CharSequence getDrawerTitle(int i10) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            return this.T0;
        }
        if (absoluteGravity == 5) {
            return this.U0;
        }
        return null;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.Q0;
    }

    public boolean isDrawerOpen(@NonNull View view) {
        if (j(view)) {
            return (((LayoutParams) view.getLayoutParams()).f21183c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerVisible(@NonNull View view) {
        if (j(view)) {
            return ((LayoutParams) view.getLayoutParams()).f21181a > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return isDrawerOpen(GravityCompat.START);
    }

    public final void k(float f6, View view) {
        float f10 = ((LayoutParams) view.getLayoutParams()).f21181a;
        float width = view.getWidth();
        int i10 = ((int) (width * f6)) - ((int) (f10 * width));
        if (!a(3, view)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        m(f6, view);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0055  */
    public final void l() {
        Drawable drawable;
        Drawable drawable2;
        if (f21165i1) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        if (layoutDirection == 0) {
            Drawable drawable3 = this.X0;
            if (drawable3 != null) {
                if (DrawableCompat.isAutoMirrored(drawable3)) {
                    DrawableCompat.setLayoutDirection(drawable3, layoutDirection);
                }
                drawable = this.X0;
            } else {
                drawable = this.Z0;
            }
        } else {
            Drawable drawable4 = this.Y0;
            if (drawable4 != null) {
                if (DrawableCompat.isAutoMirrored(drawable4)) {
                    DrawableCompat.setLayoutDirection(drawable4, layoutDirection);
                }
                drawable = this.Y0;
            } else {
                drawable = this.Z0;
            }
        }
        this.R0 = drawable;
        int layoutDirection2 = ViewCompat.getLayoutDirection(this);
        if (layoutDirection2 == 0) {
            Drawable drawable5 = this.Y0;
            if (drawable5 != null) {
                if (DrawableCompat.isAutoMirrored(drawable5)) {
                    DrawableCompat.setLayoutDirection(drawable5, layoutDirection2);
                }
                drawable2 = this.Y0;
            } else {
                drawable2 = this.f21167a1;
            }
        } else {
            Drawable drawable6 = this.X0;
            if (drawable6 != null) {
                if (DrawableCompat.isAutoMirrored(drawable6)) {
                    DrawableCompat.setLayoutDirection(drawable6, layoutDirection2);
                }
                drawable2 = this.X0;
            } else {
                drawable2 = this.f21167a1;
            }
        }
        this.S0 = drawable2;
    }

    public final void m(float f6, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f6 == layoutParams.f21181a) {
            return;
        }
        layoutParams.f21181a = f6;
        ArrayList arrayList = this.N0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((DrawerListener) this.N0.get(size)).onDrawerSlide(view, f6);
            }
        }
    }

    public final void n(View view) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS;
        ViewCompat.removeAccessibilityAction(view, accessibilityActionCompat.getId());
        if (!isDrawerOpen(view) || getDrawerLockMode(view) == 2) {
            return;
        }
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, this.f21171e1);
    }

    public final void o(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || j(childAt)) && !(z10 && childAt == view)) {
                ViewCompat.setImportantForAccessibility(childAt, 4);
            } else {
                ViewCompat.setImportantForAccessibility(childAt, 1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.W0 || this.Q0 == null) {
            return;
        }
        Object obj = this.V0;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.Q0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.Q0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewFindTopChildUnder;
        int actionMasked = motionEvent.getActionMasked();
        ViewDragHelper viewDragHelper = this.v0;
        boolean zShouldInterceptTouchEvent = viewDragHelper.shouldInterceptTouchEvent(motionEvent) | this.f21178w0.shouldInterceptTouchEvent(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                b(true);
                this.L0 = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    b(true);
                    this.L0 = false;
                }
            } else if (viewDragHelper.checkTouchSlop(3)) {
                e eVar = this.f21179x0;
                DrawerLayout.this.removeCallbacks(eVar.f21194e);
                e eVar2 = this.f21180y0;
                DrawerLayout.this.removeCallbacks(eVar2.f21194e);
            }
            z10 = false;
        } else {
            float x4 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.O0 = x4;
            this.P0 = y7;
            z10 = this.f21176t0 > 0.0f && (viewFindTopChildUnder = viewDragHelper.findTopChildUnder((int) x4, (int) y7)) != null && i(viewFindTopChildUnder);
            this.L0 = false;
        }
        if (zShouldInterceptTouchEvent || z10) {
            return true;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((LayoutParams) getChildAt(i10).getLayoutParams()).f21182b) {
                return true;
            }
        }
        return this.L0;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || e() == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewE = e();
        if (viewE != null && getDrawerLockMode(viewE) == 0) {
            closeDrawers();
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f6;
        int i14;
        boolean z11 = true;
        this.F0 = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (i(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f10 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (layoutParams.f21181a * f10));
                        f6 = (measuredWidth + i14) / f10;
                    } else {
                        float f11 = measuredWidth;
                        int i18 = i15 - ((int) (layoutParams.f21181a * f11));
                        f6 = (i15 - i18) / f11;
                        i14 = i18;
                    }
                    boolean z12 = f6 != layoutParams.f21181a ? z11 : false;
                    int i19 = layoutParams.gravity & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = i20 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i23 > i24) {
                                i21 = i24 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z12) {
                        m(f6, childAt);
                    }
                    int i27 = layoutParams.f21181a > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (f21166j1 && (rootWindowInsets = getRootWindowInsets()) != null) {
            Insets systemGestureInsets = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets).getSystemGestureInsets();
            ViewDragHelper viewDragHelper = this.v0;
            viewDragHelper.setEdgeSize(Math.max(viewDragHelper.getDefaultEdgeSize(), systemGestureInsets.left));
            ViewDragHelper viewDragHelper2 = this.f21178w0;
            viewDragHelper2.setEdgeSize(Math.max(viewDragHelper2.getDefaultEdgeSize(), systemGestureInsets.right));
        }
        this.F0 = false;
        this.G0 = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.V0 != null && ViewCompat.getFitsSystemWindows(this);
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z10) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(layoutParams.gravity, layoutDirection);
                    if (ViewCompat.getFitsSystemWindows(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.V0;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.V0;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (i(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!j(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f21165i1) {
                        float elevation = ViewCompat.getElevation(childAt);
                        float f6 = this.f21173q0;
                        if (elevation != f6) {
                            ViewCompat.setElevation(childAt, f6);
                        }
                    }
                    int iF = f(childAt) & 7;
                    boolean z13 = iF == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + g(iF) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f21174r0 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewC;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i10 = savedState.f21184q0;
        if (i10 != 0 && (viewC = c(i10)) != null) {
            openDrawer(viewC);
        }
        int i11 = savedState.f21185r0;
        if (i11 != 3) {
            setDrawerLockMode(i11, 3);
        }
        int i12 = savedState.f21186s0;
        if (i12 != 3) {
            setDrawerLockMode(i12, 5);
        }
        int i13 = savedState.f21187t0;
        if (i13 != 3) {
            setDrawerLockMode(i13, GravityCompat.START);
        }
        int i14 = savedState.f21188u0;
        if (i14 != 3) {
            setDrawerLockMode(i14, GravityCompat.END);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        l();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i10).getLayoutParams();
            int i11 = layoutParams.f21183c;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                savedState.f21184q0 = layoutParams.gravity;
                break;
            }
        }
        savedState.f21185r0 = this.H0;
        savedState.f21186s0 = this.I0;
        savedState.f21187t0 = this.J0;
        savedState.f21188u0 = this.K0;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewD;
        ViewDragHelper viewDragHelper = this.v0;
        viewDragHelper.processTouchEvent(motionEvent);
        this.f21178w0.processTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x4 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.O0 = x4;
            this.P0 = y7;
            this.L0 = false;
        } else if (action == 1) {
            float x6 = motionEvent.getX();
            float y10 = motionEvent.getY();
            View viewFindTopChildUnder = viewDragHelper.findTopChildUnder((int) x6, (int) y10);
            if (viewFindTopChildUnder != null && i(viewFindTopChildUnder)) {
                float f6 = x6 - this.O0;
                float f10 = y10 - this.P0;
                int touchSlop = viewDragHelper.getTouchSlop();
                z10 = (f10 * f10) + (f6 * f6) >= ((float) (touchSlop * touchSlop)) || (viewD = d()) == null || getDrawerLockMode(viewD) == 2;
            }
            b(z10);
        } else if (action == 3) {
            b(true);
            this.L0 = false;
        }
        return true;
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openDrawer(GravityCompat.START);
    }

    public void openDrawer(@NonNull View view) {
        openDrawer(view, true);
    }

    public final void p(int i10, View view) {
        int i11;
        View rootView;
        int viewDragState = this.v0.getViewDragState();
        int viewDragState2 = this.f21178w0.getViewDragState();
        if (viewDragState == 1 || viewDragState2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (viewDragState != 2 && viewDragState2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f6 = ((LayoutParams) view.getLayoutParams()).f21181a;
            if (f6 == 0.0f) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.f21183c & 1) == 1) {
                    layoutParams.f21183c = 0;
                    ArrayList arrayList = this.N0;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((DrawerListener) this.N0.get(size)).onDrawerClosed(view);
                        }
                    }
                    o(view, false);
                    n(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f6 == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.f21183c & 1) == 0) {
                    layoutParams2.f21183c = 1;
                    ArrayList arrayList2 = this.N0;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((DrawerListener) this.N0.get(size2)).onDrawerOpened(view);
                        }
                    }
                    o(view, true);
                    n(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i11 != this.E0) {
            this.E0 = i11;
            ArrayList arrayList3 = this.N0;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((DrawerListener) this.N0.get(size3)).onDrawerStateChanged(i11);
                }
            }
        }
    }

    public void removeDrawerListener(@NonNull DrawerListener drawerListener) {
        ArrayList arrayList;
        if (drawerListener == null || (arrayList = this.N0) == null) {
            return;
        }
        arrayList.remove(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            b(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.F0) {
            return;
        }
        super.requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setChildInsets(Object obj, boolean z10) {
        this.V0 = obj;
        this.W0 = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f6) {
        this.f21173q0 = f6;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (j(childAt)) {
                ViewCompat.setElevation(childAt, this.f21173q0);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        DrawerListener drawerListener2 = this.M0;
        if (drawerListener2 != null) {
            removeDrawerListener(drawerListener2);
        }
        if (drawerListener != null) {
            addDrawerListener(drawerListener);
        }
        this.M0 = drawerListener;
    }

    public void setDrawerLockMode(int i10) {
        setDrawerLockMode(i10, 3);
        setDrawerLockMode(i10, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i10) {
        if (f21165i1) {
            return;
        }
        if ((i10 & GravityCompat.START) == 8388611) {
            this.X0 = drawable;
        } else if ((i10 & GravityCompat.END) == 8388613) {
            this.Y0 = drawable;
        } else if ((i10 & 3) == 3) {
            this.Z0 = drawable;
        } else if ((i10 & 5) != 5) {
            return;
        } else {
            this.f21167a1 = drawable;
        }
        l();
        invalidate();
    }

    public void setDrawerTitle(int i10, @Nullable CharSequence charSequence) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i10, ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            this.T0 = charSequence;
        } else if (absoluteGravity == 5) {
            this.U0 = charSequence;
        }
    }

    public void setScrimColor(@ColorInt int i10) {
        this.f21175s0 = i10;
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.Q0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i10) {
        this.Q0 = new ColorDrawable(i10);
        invalidate();
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.drawerlayout.R.attr.drawerLayoutStyle);
    }

    public void closeDrawer(@NonNull View view, boolean z10) {
        if (!j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.G0) {
            layoutParams.f21181a = 0.0f;
            layoutParams.f21183c = 0;
        } else if (z10) {
            layoutParams.f21183c |= 4;
            if (a(3, view)) {
                this.v0.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
            } else {
                this.f21178w0.smoothSlideViewTo(view, getWidth(), view.getTop());
            }
        } else {
            k(0.0f, view);
            p(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void openDrawer(@NonNull View view, boolean z10) {
        if (!j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.G0) {
            layoutParams.f21181a = 1.0f;
            layoutParams.f21183c = 1;
            o(view, true);
            n(view);
        } else if (z10) {
            layoutParams.f21183c |= 2;
            if (a(3, view)) {
                this.v0.smoothSlideViewTo(view, 0, view.getTop());
            } else {
                this.f21178w0.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            k(1.0f, view);
            p(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21172p0 = new d();
        this.f21175s0 = -1728053248;
        this.f21177u0 = new Paint();
        this.G0 = true;
        this.H0 = 3;
        this.I0 = 3;
        this.J0 = 3;
        this.K0 = 3;
        this.X0 = null;
        this.Y0 = null;
        this.Z0 = null;
        this.f21167a1 = null;
        this.f21171e1 = new a();
        setDescendantFocusability(262144);
        float f6 = getResources().getDisplayMetrics().density;
        this.f21174r0 = (int) ((64.0f * f6) + 0.5f);
        float f10 = f6 * 400.0f;
        e eVar = new e(3);
        this.f21179x0 = eVar;
        e eVar2 = new e(5);
        this.f21180y0 = eVar2;
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 1.0f, eVar);
        this.v0 = viewDragHelperCreate;
        viewDragHelperCreate.setEdgeTrackingEnabled(1);
        viewDragHelperCreate.setMinVelocity(f10);
        eVar.f21193d = viewDragHelperCreate;
        ViewDragHelper viewDragHelperCreate2 = ViewDragHelper.create(this, 1.0f, eVar2);
        this.f21178w0 = viewDragHelperCreate2;
        viewDragHelperCreate2.setEdgeTrackingEnabled(2);
        viewDragHelperCreate2.setMinVelocity(f10);
        eVar2.f21193d = viewDragHelperCreate2;
        setFocusableInTouchMode(true);
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewCompat.setAccessibilityDelegate(this, new c());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.getFitsSystemWindows(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f21162f1);
            try {
                this.Q0 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.R.styleable.DrawerLayout, i10, 0);
        try {
            int i11 = androidx.drawerlayout.R.styleable.DrawerLayout_elevation;
            if (typedArrayObtainStyledAttributes2.hasValue(i11)) {
                this.f21173q0 = typedArrayObtainStyledAttributes2.getDimension(i11, 0.0f);
            } else {
                this.f21173q0 = getResources().getDimension(androidx.drawerlayout.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f21168b1 = new ArrayList<>();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    public void setDrawerLockMode(int i10, int i11) {
        View viewC;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i11, ViewCompat.getLayoutDirection(this));
        if (i11 == 3) {
            this.H0 = i10;
        } else if (i11 == 5) {
            this.I0 = i10;
        } else if (i11 == 8388611) {
            this.J0 = i10;
        } else if (i11 == 8388613) {
            this.K0 = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.v0 : this.f21178w0).cancel();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewC = c(absoluteGravity)) != null) {
                openDrawer(viewC);
                return;
            }
            return;
        }
        View viewC2 = c(absoluteGravity);
        if (viewC2 != null) {
            closeDrawer(viewC2);
        }
    }

    public void setStatusBarBackground(int i10) {
        this.Q0 = i10 != 0 ? ContextCompat.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    public boolean isDrawerVisible(int i10) {
        View viewC = c(i10);
        if (viewC != null) {
            return isDrawerVisible(viewC);
        }
        return false;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f21181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f21182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21183c;
        public int gravity;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f21163g1);
            this.gravity = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.gravity = 0;
        }

        public LayoutParams(int i10, int i11, int i12) {
            this(i10, i11);
            this.gravity = i12;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = 0;
        }
    }

    public boolean isDrawerOpen(int i10) {
        View viewC = c(i10);
        if (viewC != null) {
            return isDrawerOpen(viewC);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f21184q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f21185r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f21186s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f21187t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f21188u0;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21184q0 = 0;
            this.f21184q0 = parcel.readInt();
            this.f21185r0 = parcel.readInt();
            this.f21186s0 = parcel.readInt();
            this.f21187t0 = parcel.readInt();
            this.f21188u0 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21184q0);
            parcel.writeInt(this.f21185r0);
            parcel.writeInt(this.f21186s0);
            parcel.writeInt(this.f21187t0);
            parcel.writeInt(this.f21188u0);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.f21184q0 = 0;
        }
    }

    public void setDrawerShadow(@DrawableRes int i10, int i11) {
        setDrawerShadow(ContextCompat.getDrawable(getContext(), i10), i11);
    }

    public int getDrawerLockMode(@NonNull View view) {
        if (j(view)) {
            return getDrawerLockMode(((LayoutParams) view.getLayoutParams()).gravity);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerLockMode(int i10, @NonNull View view) {
        if (j(view)) {
            setDrawerLockMode(i10, ((LayoutParams) view.getLayoutParams()).gravity);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i10) {
        closeDrawer(i10, true);
    }

    public void closeDrawer(int i10, boolean z10) {
        View viewC = c(i10);
        if (viewC != null) {
            closeDrawer(viewC, z10);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + g(i10));
        }
    }

    public void openDrawer(int i10) {
        openDrawer(i10, true);
    }

    public void openDrawer(int i10, boolean z10) {
        View viewC = c(i10);
        if (viewC != null) {
            openDrawer(viewC, z10);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + g(i10));
        }
    }

    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i10) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(View view, float f6) {
        }
    }
}
