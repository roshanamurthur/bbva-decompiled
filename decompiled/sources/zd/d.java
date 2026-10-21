package zd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: HeaderBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d<V extends View> extends f<V> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public a f95037s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public OverScroller f95038t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f95039u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f95040w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f95041x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public VelocityTracker f95042y0;

    /* JADX INFO: compiled from: HeaderBehavior.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CoordinatorLayout f95043p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final V f95044q0;

        public a(CoordinatorLayout coordinatorLayout, V v3) {
            this.f95043p0 = coordinatorLayout;
            this.f95044q0 = v3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            OverScroller overScroller;
            V v3 = this.f95044q0;
            if (v3 == null || (overScroller = (dVar = d.this).f95038t0) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f95043p0;
            if (!zComputeScrollOffset) {
                dVar.e(coordinatorLayout, v3);
            } else {
                dVar.g(coordinatorLayout, v3, dVar.f95038t0.getCurrY());
                ViewCompat.postOnAnimation(v3, this);
            }
        }
    }

    public d() {
        this.v0 = -1;
        this.f95041x0 = -1;
    }

    public boolean b(V v3) {
        return false;
    }

    public int c(@NonNull V v3) {
        return -v3.getHeight();
    }

    public int d(@NonNull V v3) {
        return v3.getHeight();
    }

    public int f(CoordinatorLayout coordinatorLayout, V v3, int i10, int i11, int i12) {
        int iClamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i11 == 0 || topAndBottomOffset < i11 || topAndBottomOffset > i12 || topAndBottomOffset == (iClamp = MathUtils.clamp(i10, i11, i12))) {
            return 0;
        }
        setTopAndBottomOffset(iClamp);
        return topAndBottomOffset - iClamp;
    }

    public final void g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        f(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f95041x0 < 0) {
            this.f95041x0 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f95039u0) {
            int i10 = this.v0;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y7 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y7 - this.f95040w0) > this.f95041x0) {
                this.f95040w0 = y7;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.v0 = -1;
            int x4 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            boolean z10 = b(v3) && coordinatorLayout.isPointInChildBounds(v3, x4, y10);
            this.f95039u0 = z10;
            if (z10) {
                this.f95040w0 = y10;
                this.v0 = motionEvent.getPointerId(0);
                if (this.f95042y0 == null) {
                    this.f95042y0 = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f95038t0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f95038t0.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f95042y0;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.v0);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y7 = (int) motionEvent.getY(iFindPointerIndex);
                int i10 = this.f95040w0 - y7;
                this.f95040w0 = y7;
                f(coordinatorLayout, v3, a() - i10, c(v3), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.v0 = motionEvent.getPointerId(i11);
                    this.f95040w0 = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z10 = false;
            velocityTracker2 = this.f95042y0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f95039u0 || z10;
        }
        VelocityTracker velocityTracker3 = this.f95042y0;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f95042y0.computeCurrentVelocity(1000);
            float yVelocity = this.f95042y0.getYVelocity(this.v0);
            int i12 = -d(v3);
            a aVar = this.f95037s0;
            if (aVar != null) {
                v3.removeCallbacks(aVar);
                this.f95037s0 = null;
            }
            if (this.f95038t0 == null) {
                this.f95038t0 = new OverScroller(v3.getContext());
            }
            this.f95038t0.fling(0, getTopAndBottomOffset(), 0, Math.round(yVelocity), 0, 0, i12, 0);
            if (this.f95038t0.computeScrollOffset()) {
                a aVar2 = new a(coordinatorLayout, v3);
                this.f95037s0 = aVar2;
                ViewCompat.postOnAnimation(v3, aVar2);
            } else {
                e(coordinatorLayout, v3);
            }
            z10 = true;
        }
        this.f95039u0 = false;
        this.v0 = -1;
        velocityTracker = this.f95042y0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f95042y0 = null;
        }
        velocityTracker2 = this.f95042y0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f95039u0) {
            return true;
        }
        z10 = false;
        this.f95039u0 = false;
        this.v0 = -1;
        velocityTracker = this.f95042y0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f95042y0 = null;
        }
        velocityTracker2 = this.f95042y0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f95039u0) {
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v0 = -1;
        this.f95041x0 = -1;
    }

    public void e(CoordinatorLayout coordinatorLayout, V v3) {
    }
}
