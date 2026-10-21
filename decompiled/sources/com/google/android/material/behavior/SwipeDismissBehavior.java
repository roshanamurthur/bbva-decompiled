package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;

/* JADX INFO: loaded from: classes10.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ViewDragHelper f43998p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OnDismissListener f43999q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f44000r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f44001s0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f44003u0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f44002t0 = 0.0f;
    public int v0 = 2;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f44004w0 = 0.5f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f44005x0 = 0.0f;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f44006y0 = 0.5f;
    public final a E0 = new a();

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i10);
    }

    public class a extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44008d = -1;

        public a() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = ViewCompat.getLayoutDirection(view) == 1;
            int i12 = SwipeDismissBehavior.this.v0;
            if (i12 == 0) {
                if (z10) {
                    width = this.f44007c - view.getWidth();
                    width2 = this.f44007c;
                } else {
                    width = this.f44007c;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f44007c - view.getWidth();
                width2 = view.getWidth() + this.f44007c;
            } else if (z10) {
                width = this.f44007c;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f44007c - view.getWidth();
                width2 = this.f44007c;
            }
            return Math.min(Math.max(width, i10), width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(@NonNull View view, int i10) {
            this.f44008d = i10;
            this.f44007c = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f44001s0 = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f44001s0 = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i10) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.f43999q0;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i10);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(@NonNull View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f6 = width * swipeDismissBehavior.f44005x0;
            float width2 = view.getWidth() * swipeDismissBehavior.f44006y0;
            float fAbs = Math.abs(i10 - this.f44007c);
            if (fAbs <= f6) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f6) / (width2 - f6))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0050  */
        /* JADX WARN: Code duplicated, block: B:29:0x0054  */
        /* JADX WARN: Code duplicated, block: B:32:0x005d  */
        /* JADX WARN: Code duplicated, block: B:33:0x005f  */
        /* JADX WARN: Code duplicated, block: B:34:0x0064  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(@NonNull View view, float f6, float f10) {
            int i10;
            int left;
            int i11;
            OnDismissListener onDismissListener;
            this.f44008d = -1;
            int width = view.getWidth();
            boolean z10 = true;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f6 != 0.0f) {
                boolean z11 = ViewCompat.getLayoutDirection(view) == 1;
                int i12 = swipeDismissBehavior.v0;
                if (i12 != 2 && (i12 != 0 ? i12 != 1 || (!z11 ? f6 < 0.0f : f6 > 0.0f) : !z11 ? f6 > 0.0f : f6 < 0.0f)) {
                    i10 = this.f44007c;
                    z10 = false;
                } else if (f6 >= 0.0f) {
                    left = view.getLeft();
                    i11 = this.f44007c;
                    if (left < i11) {
                        i10 = this.f44007c - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f44007c - width;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f44007c) < Math.round(view.getWidth() * swipeDismissBehavior.f44004w0)) {
                    i10 = this.f44007c;
                    z10 = false;
                } else if (f6 >= 0.0f) {
                    left = view.getLeft();
                    i11 = this.f44007c;
                    if (left < i11) {
                        i10 = this.f44007c - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f44007c - width;
                }
            }
            if (swipeDismissBehavior.f43998p0.settleCapturedViewAt(i10, view.getTop())) {
                ViewCompat.postOnAnimation(view, new b(view, z10));
            } else {
                if (!z10 || (onDismissListener = swipeDismissBehavior.f43999q0) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i10) {
            int i11 = this.f44008d;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final View f44010p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f44011q0;

        public b(View view, boolean z10) {
            this.f44010p0 = view;
            this.f44011q0 = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OnDismissListener onDismissListener;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            ViewDragHelper viewDragHelper = swipeDismissBehavior.f43998p0;
            View view = this.f44010p0;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(view, this);
            } else {
                if (!this.f44011q0 || (onDismissListener = swipeDismissBehavior.f43999q0) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper = this.f43998p0;
        if (viewDragHelper != null) {
            return viewDragHelper.getViewDragState();
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
        return this.f43999q0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.f44000r0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v3, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f44000r0 = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f44000r0 = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        if (this.f43998p0 == null) {
            boolean z10 = this.f44003u0;
            a aVar = this.E0;
            this.f43998p0 = z10 ? ViewDragHelper.create(coordinatorLayout, this.f44002t0, aVar) : ViewDragHelper.create(coordinatorLayout, aVar);
        }
        return !this.f44001s0 && this.f43998p0.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i10) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v3, i10);
        if (ViewCompat.getImportantForAccessibility(v3) == 0) {
            ViewCompat.setImportantForAccessibility(v3, 1);
            ViewCompat.removeAccessibilityAction(v3, 1048576);
            if (canSwipeDismissView(v3)) {
                ViewCompat.replaceAccessibilityAction(v3, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new com.google.android.material.behavior.a(this));
            }
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        if (this.f43998p0 == null) {
            return false;
        }
        if (this.f44001s0 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f43998p0.processTouchEvent(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f6) {
        this.f44004w0 = Math.min(Math.max(0.0f, f6), 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f6) {
        this.f44006y0 = Math.min(Math.max(0.0f, f6), 1.0f);
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
        this.f43999q0 = onDismissListener;
    }

    public void setSensitivity(float f6) {
        this.f44002t0 = f6;
        this.f44003u0 = true;
    }

    public void setStartAlphaSwipeDistance(float f6) {
        this.f44005x0 = Math.min(Math.max(0.0f, f6), 1.0f);
    }

    public void setSwipeDirection(int i10) {
        this.v0 = i10;
    }
}
