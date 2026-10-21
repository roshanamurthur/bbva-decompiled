package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ViewDragHelper {
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f20492x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20494b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f20496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f20497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f20498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f20499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f20500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f20501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f20502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f20504l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f20505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f20507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f20509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Callback f20510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f20511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f20513v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20495c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f20514w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            float f10 = f6 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper.this.j(0);
        }
    }

    public ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f20513v = viewGroup;
        this.f20510s = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f20507p = i10;
        this.f20506o = i10;
        this.f20494b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f20505n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f20509r = new OverScroller(context, f20492x);
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    public final boolean a(float f6, float f10, int i10, int i11) {
        float fAbs = Math.abs(f6);
        float fAbs2 = Math.abs(f10);
        if ((this.f20500h[i10] & i11) != i11 || (this.f20508q & i11) == 0 || (this.f20502j[i10] & i11) == i11 || (this.f20501i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f20494b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f20510s.onEdgeLock(i11)) {
            return (this.f20501i[i10] & i11) == 0 && fAbs > ((float) this.f20494b);
        }
        int[] iArr = this.f20502j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    public void abort() {
        cancel();
        if (this.f20493a == 2) {
            OverScroller overScroller = this.f20509r;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f20510s.onViewPositionChanged(this.f20511t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        j(0);
    }

    public final boolean b(View view, float f6, float f10) {
        if (view == null) {
            return false;
        }
        Callback callback = this.f20510s;
        boolean z10 = callback.getViewHorizontalDragRange(view) > 0;
        boolean z11 = callback.getViewVerticalDragRange(view) > 0;
        if (z10 && z11) {
            float f11 = (f10 * f10) + (f6 * f6);
            int i10 = this.f20494b;
            return f11 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f6) > ((float) this.f20494b);
        }
        return z11 && Math.abs(f10) > ((float) this.f20494b);
    }

    public final void c(int i10) {
        if (this.f20496d == null || !isPointerDown(i10)) {
            return;
        }
        this.f20496d[i10] = 0.0f;
        this.f20497e[i10] = 0.0f;
        this.f20498f[i10] = 0.0f;
        this.f20499g[i10] = 0.0f;
        this.f20500h[i10] = 0;
        this.f20501i[i10] = 0;
        this.f20502j[i10] = 0;
        this.f20503k = (~(1 << i10)) & this.f20503k;
    }

    public boolean canScroll(@NonNull View view, boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && canScroll(childAt, true, i10, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && (view.canScrollHorizontally(-i10) || view.canScrollVertically(-i11));
    }

    public void cancel() {
        this.f20495c = -1;
        float[] fArr = this.f20496d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f20497e, 0.0f);
            Arrays.fill(this.f20498f, 0.0f);
            Arrays.fill(this.f20499g, 0.0f);
            Arrays.fill(this.f20500h, 0);
            Arrays.fill(this.f20501i, 0);
            Arrays.fill(this.f20502j, 0);
            this.f20503k = 0;
        }
        VelocityTracker velocityTracker = this.f20504l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20504l = null;
        }
    }

    public void captureChildView(@NonNull View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f20513v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f20511t = view;
        this.f20495c = i10;
        this.f20510s.onViewCaptured(view, i10);
        j(1);
    }

    public boolean checkTouchSlop(int i10) {
        int length = this.f20496d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (checkTouchSlop(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean continueSettling(boolean z10) {
        if (this.f20493a == 2) {
            OverScroller overScroller = this.f20509r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f20511t.getLeft();
            int top = currY - this.f20511t.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.f20511t, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.f20511t, top);
            }
            if (left != 0 || top != 0) {
                this.f20510s.onViewPositionChanged(this.f20511t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
            } else if (!zComputeScrollOffset) {
            }
            if (z10) {
                this.f20513v.post(this.f20514w);
            } else {
                j(0);
            }
        }
        return this.f20493a == 2;
    }

    public final int d(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f20513v.getWidth();
        float f6 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f6) + f6;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean e(int i10, int i11, int i12, int i13) {
        float f6;
        float f10;
        float f11;
        float f12;
        int left = this.f20511t.getLeft();
        int top = this.f20511t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f20509r;
        int i16 = 0;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            j(0);
            return false;
        }
        View view = this.f20511t;
        int i17 = (int) this.f20505n;
        int i18 = (int) this.m;
        int iAbs = Math.abs(i12);
        if (iAbs < i17) {
            i12 = 0;
        } else if (iAbs > i18) {
            i12 = i12 > 0 ? i18 : -i18;
        }
        int i19 = (int) this.f20505n;
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i19) {
            i13 = i16;
        } else if (iAbs2 > i18) {
            if (i13 > 0) {
                i13 = i18;
            } else {
                i16 = -i18;
                i13 = i16;
            }
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i20 = iAbs5 + iAbs6;
        int i21 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f6 = iAbs5;
            f10 = i20;
        } else {
            f6 = iAbs3;
            f10 = i21;
        }
        float f13 = f6 / f10;
        if (i13 != 0) {
            f11 = iAbs6;
            f12 = i20;
        } else {
            f11 = iAbs4;
            f12 = i21;
        }
        float f14 = f11 / f12;
        Callback callback = this.f20510s;
        overScroller.startScroll(left, top, i14, i15, (int) ((d(i15, i13, callback.getViewVerticalDragRange(view)) * f14) + (d(i14, i12, callback.getViewHorizontalDragRange(view)) * f13)));
        j(2);
        return true;
    }

    public final void f() {
        VelocityTracker velocityTracker = this.f20504l;
        float f6 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f6);
        float xVelocity = this.f20504l.getXVelocity(this.f20495c);
        float f10 = this.f20505n;
        float fAbs = Math.abs(xVelocity);
        float f11 = 0.0f;
        if (fAbs < f10) {
            xVelocity = 0.0f;
        } else if (fAbs > f6) {
            xVelocity = xVelocity > 0.0f ? f6 : -f6;
        }
        float yVelocity = this.f20504l.getYVelocity(this.f20495c);
        float f12 = this.f20505n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f12) {
            if (fAbs2 > f6) {
                if (yVelocity <= 0.0f) {
                    f6 = -f6;
                }
                f11 = f6;
            } else {
                f11 = yVelocity;
            }
        }
        this.f20512u = true;
        this.f20510s.onViewReleased(this.f20511t, xVelocity, f11);
        this.f20512u = false;
        if (this.f20493a == 1) {
            j(0);
        }
    }

    @Nullable
    public View findTopChildUnder(int i10, int i11) {
        ViewGroup viewGroup = this.f20513v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f20510s.getOrderedChildIndex(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i10, int i11, int i12, int i13) {
        if (!this.f20512u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f20509r.fling(this.f20511t.getLeft(), this.f20511t.getTop(), (int) this.f20504l.getXVelocity(this.f20495c), (int) this.f20504l.getYVelocity(this.f20495c), i10, i12, i11, i13);
        j(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(float f6, float f10, int i10) {
        int i11;
        boolean zA = a(f6, f10, i10, 1);
        ?? r1 = zA;
        if (a(f10, f6, i10, 4)) {
            r1 = (zA ? 1 : 0) | 4;
        }
        ?? r3 = r1;
        if (a(f6, f10, i10, 2)) {
            r3 = (r1 == true ? 1 : 0) | 2;
        }
        ?? r4 = r3;
        if (a(f10, f6, i10, 8)) {
            i11 = (r3 == true ? 1 : 0) | 8;
        }
        if (r4 == 0) {
            r4 = i11;
            return;
        }
        r4 = i11;
        int[] iArr = this.f20501i;
        iArr[i10] = (iArr[i10] | r4) == true ? 1 : 0;
        this.f20510s.onEdgeDragStarted(r4, i10);
    }

    public int getActivePointerId() {
        return this.f20495c;
    }

    @Nullable
    public View getCapturedView() {
        return this.f20511t;
    }

    @Px
    public int getDefaultEdgeSize() {
        return this.f20507p;
    }

    @Px
    public int getEdgeSize() {
        return this.f20506o;
    }

    public float getMinVelocity() {
        return this.f20505n;
    }

    @Px
    public int getTouchSlop() {
        return this.f20494b;
    }

    public int getViewDragState() {
        return this.f20493a;
    }

    public final void h(float f6, float f10, int i10) {
        float[] fArr = this.f20496d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f20497e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f20498f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f20499g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f20500h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f20501i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f20502j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f20496d = fArr2;
            this.f20497e = fArr3;
            this.f20498f = fArr4;
            this.f20499g = fArr5;
            this.f20500h = iArr;
            this.f20501i = iArr2;
            this.f20502j = iArr3;
        }
        float[] fArr9 = this.f20496d;
        this.f20498f[i10] = f6;
        fArr9[i10] = f6;
        float[] fArr10 = this.f20497e;
        this.f20499g[i10] = f10;
        fArr10[i10] = f10;
        int[] iArr7 = this.f20500h;
        int i12 = (int) f6;
        int i13 = (int) f10;
        ViewGroup viewGroup = this.f20513v;
        int i14 = i12 < viewGroup.getLeft() + this.f20506o ? 1 : 0;
        if (i13 < viewGroup.getTop() + this.f20506o) {
            i14 |= 4;
        }
        if (i12 > viewGroup.getRight() - this.f20506o) {
            i14 |= 2;
        }
        if (i13 > viewGroup.getBottom() - this.f20506o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f20503k |= 1 << i10;
    }

    public final void i(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (isPointerDown(pointerId)) {
                float x4 = motionEvent.getX(i10);
                float y7 = motionEvent.getY(i10);
                this.f20498f[pointerId] = x4;
                this.f20499g[pointerId] = y7;
            }
        }
    }

    public boolean isCapturedViewUnder(int i10, int i11) {
        return isViewUnder(this.f20511t, i10, i11);
    }

    public boolean isEdgeTouched(int i10) {
        int length = this.f20500h.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (isEdgeTouched(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i10) {
        return ((1 << i10) & this.f20503k) != 0;
    }

    public boolean isViewUnder(@Nullable View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public final void j(int i10) {
        this.f20513v.removeCallbacks(this.f20514w);
        if (this.f20493a != i10) {
            this.f20493a = i10;
            this.f20510s.onViewDragStateChanged(i10);
            if (this.f20493a == 0) {
                this.f20511t = null;
            }
        }
    }

    public final boolean k(int i10, View view) {
        if (view == this.f20511t && this.f20495c == i10) {
            return true;
        }
        if (view == null || !this.f20510s.tryCaptureView(view, i10)) {
            return false;
        }
        this.f20495c = i10;
        captureChildView(view, i10);
        return true;
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.f20504l == null) {
            this.f20504l = VelocityTracker.obtain();
        }
        this.f20504l.addMovement(motionEvent);
        int i10 = 0;
        Callback callback = this.f20510s;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewFindTopChildUnder = findTopChildUnder((int) x4, (int) y7);
            h(x4, y7, pointerId);
            k(pointerId, viewFindTopChildUnder);
            int i11 = this.f20500h[pointerId] & this.f20508q;
            if (i11 != 0) {
                callback.onEdgeTouched(i11, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f20493a == 1) {
                f();
            }
            cancel();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f20493a == 1) {
                    this.f20512u = true;
                    callback.onViewReleased(this.f20511t, 0.0f, 0.0f);
                    this.f20512u = false;
                    if (this.f20493a == 1) {
                        j(0);
                    }
                }
                cancel();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x6 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                h(x6, y10, pointerId2);
                if (this.f20493a != 0) {
                    if (isCapturedViewUnder((int) x6, (int) y10)) {
                        k(pointerId2, this.f20511t);
                        return;
                    }
                    return;
                } else {
                    k(pointerId2, findTopChildUnder((int) x6, (int) y10));
                    int i12 = this.f20500h[pointerId2] & this.f20508q;
                    if (i12 != 0) {
                        callback.onEdgeTouched(i12, pointerId2);
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f20493a == 1 && pointerId3 == this.f20495c) {
                int pointerCount = motionEvent.getPointerCount();
                while (i10 < pointerCount) {
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f20495c) {
                        View viewFindTopChildUnder2 = findTopChildUnder((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view = this.f20511t;
                        if (viewFindTopChildUnder2 == view && k(pointerId4, view)) {
                            if (this.f20495c == -1) {
                                break;
                            }
                        }
                    }
                    i10++;
                }
                f();
            }
            c(pointerId3);
            return;
        }
        if (this.f20493a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i10 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i10);
                if (isPointerDown(pointerId5)) {
                    float x7 = motionEvent.getX(i10);
                    float y11 = motionEvent.getY(i10);
                    float f6 = x7 - this.f20496d[pointerId5];
                    float f10 = y11 - this.f20497e[pointerId5];
                    g(f6, f10, pointerId5);
                    if (this.f20493a != 1) {
                        View viewFindTopChildUnder3 = findTopChildUnder((int) x7, (int) y11);
                        if (b(viewFindTopChildUnder3, f6, f10) && k(pointerId5, viewFindTopChildUnder3)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i10++;
            }
            i(motionEvent);
            return;
        }
        if (isPointerDown(this.f20495c)) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f20495c);
            float x10 = motionEvent.getX(iFindPointerIndex);
            float y12 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f20498f;
            int i13 = this.f20495c;
            int i14 = (int) (x10 - fArr[i13]);
            int i15 = (int) (y12 - this.f20499g[i13]);
            int left = this.f20511t.getLeft() + i14;
            int top = this.f20511t.getTop() + i15;
            int left2 = this.f20511t.getLeft();
            int top2 = this.f20511t.getTop();
            if (i14 != 0) {
                left = callback.clampViewPositionHorizontal(this.f20511t, left, i14);
                ViewCompat.offsetLeftAndRight(this.f20511t, left - left2);
            }
            int i16 = left;
            if (i15 != 0) {
                top = callback.clampViewPositionVertical(this.f20511t, top, i15);
                ViewCompat.offsetTopAndBottom(this.f20511t, top - top2);
            }
            int i17 = top;
            if (i14 != 0 || i15 != 0) {
                this.f20510s.onViewPositionChanged(this.f20511t, i16, i17, i16 - left2, i17 - top2);
            }
            i(motionEvent);
        }
    }

    public void setEdgeSize(@IntRange(from = 0) @Px int i10) {
        this.f20506o = i10;
    }

    public void setEdgeTrackingEnabled(int i10) {
        this.f20508q = i10;
    }

    public void setMinVelocity(float f6) {
        this.f20505n = f6;
    }

    public boolean settleCapturedViewAt(int i10, int i11) {
        if (this.f20512u) {
            return e(i10, i11, (int) this.f20504l.getXVelocity(this.f20495c), (int) this.f20504l.getYVelocity(this.f20495c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    public boolean shouldInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z10;
        View viewFindTopChildUnder;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.f20504l == null) {
            this.f20504l = VelocityTracker.obtain();
        }
        this.f20504l.addMovement(motionEvent);
        Callback callback = this.f20510s;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                cancel();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    cancel();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y7 = motionEvent.getY(actionIndex);
                    h(x4, y7, pointerId);
                    int i10 = this.f20493a;
                    if (i10 == 0) {
                        int i11 = this.f20500h[pointerId] & this.f20508q;
                        if (i11 != 0) {
                            callback.onEdgeTouched(i11, pointerId);
                        }
                    } else if (i10 == 2 && (viewFindTopChildUnder = findTopChildUnder((int) x4, (int) y7)) == this.f20511t) {
                        k(pointerId, viewFindTopChildUnder);
                    }
                } else if (actionMasked == 6) {
                    c(motionEvent.getPointerId(actionIndex));
                }
            } else if (this.f20496d != null && this.f20497e != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    int pointerId2 = motionEvent.getPointerId(i12);
                    if (isPointerDown(pointerId2)) {
                        float x6 = motionEvent.getX(i12);
                        float y10 = motionEvent.getY(i12);
                        float f6 = x6 - this.f20496d[pointerId2];
                        float f10 = y10 - this.f20497e[pointerId2];
                        View viewFindTopChildUnder2 = findTopChildUnder((int) x6, (int) y10);
                        boolean z11 = viewFindTopChildUnder2 != null && b(viewFindTopChildUnder2, f6, f10);
                        if (!z11) {
                            g(f6, f10, pointerId2);
                            if (this.f20493a != 1) {
                                break;
                            }
                        } else {
                            int left = viewFindTopChildUnder2.getLeft();
                            int i13 = (int) f6;
                            int iClampViewPositionHorizontal = callback.clampViewPositionHorizontal(viewFindTopChildUnder2, left + i13, i13);
                            int top = viewFindTopChildUnder2.getTop();
                            int i14 = (int) f10;
                            int iClampViewPositionVertical = callback.clampViewPositionVertical(viewFindTopChildUnder2, top + i14, i14);
                            int viewHorizontalDragRange = callback.getViewHorizontalDragRange(viewFindTopChildUnder2);
                            int viewVerticalDragRange = callback.getViewVerticalDragRange(viewFindTopChildUnder2);
                            if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                                break;
                            }
                            g(f6, f10, pointerId2);
                            if (this.f20493a != 1 || (z11 && k(pointerId2, viewFindTopChildUnder2))) {
                                break;
                            }
                        }
                    }
                }
                i(motionEvent);
            }
            z10 = false;
        } else {
            float x7 = motionEvent.getX();
            float y11 = motionEvent.getY();
            z10 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            h(x7, y11, pointerId3);
            View viewFindTopChildUnder3 = findTopChildUnder((int) x7, (int) y11);
            if (viewFindTopChildUnder3 == this.f20511t && this.f20493a == 2) {
                k(pointerId3, viewFindTopChildUnder3);
            }
            int i15 = this.f20500h[pointerId3] & this.f20508q;
            if (i15 != 0) {
                callback.onEdgeTouched(i15, pointerId3);
            }
        }
        if (this.f20493a == 1) {
            return true;
        }
        return z10;
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i10, int i11) {
        this.f20511t = view;
        this.f20495c = -1;
        boolean zE = e(i10, i11, 0, 0);
        if (!zE && this.f20493a == 0 && this.f20511t != null) {
            this.f20511t = null;
        }
        return zE;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f6, @NonNull Callback callback) {
        ViewDragHelper viewDragHelperCreate = create(viewGroup, callback);
        viewDragHelperCreate.f20494b = (int) ((1.0f / f6) * viewDragHelperCreate.f20494b);
        return viewDragHelperCreate;
    }

    public boolean checkTouchSlop(int i10, int i11) {
        if (!isPointerDown(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f6 = this.f20498f[i11] - this.f20496d[i11];
        float f10 = this.f20499g[i11] - this.f20497e[i11];
        if (z10 && z11) {
            float f11 = (f10 * f10) + (f6 * f6);
            int i12 = this.f20494b;
            return f11 > ((float) (i12 * i12));
        }
        if (z10) {
            return Math.abs(f6) > ((float) this.f20494b);
        }
        return z11 && Math.abs(f10) > ((float) this.f20494b);
    }

    public boolean isEdgeTouched(int i10, int i11) {
        return isPointerDown(i11) && (i10 & this.f20500h[i11]) != 0;
    }

    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
            return 0;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public boolean onEdgeLock(int i10) {
            return false;
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i10);

        public int getOrderedChildIndex(int i10) {
            return i10;
        }

        public void onViewDragStateChanged(int i10) {
        }

        public void onEdgeDragStarted(int i10, int i11) {
        }

        public void onEdgeTouched(int i10, int i11) {
        }

        public void onViewCaptured(@NonNull View view, int i10) {
        }

        public void onViewReleased(@NonNull View view, float f6, float f10) {
        }

        public void onViewPositionChanged(@NonNull View view, int i10, int i11, @Px int i12, @Px int i13) {
        }
    }
}
