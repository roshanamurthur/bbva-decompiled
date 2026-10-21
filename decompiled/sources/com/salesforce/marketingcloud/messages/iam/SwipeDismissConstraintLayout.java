package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.R;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class SwipeDismissConstraintLayout extends ConstraintLayout {
    private static final float DRAG_SENSITIVITY = 1.0f;
    ViewDragHelper dragHelper;
    int draggingState;
    SwipeDismissListener listener;
    float minScaledFlingVelocity;
    View swipeTarget;
    private int swipeTargetId;

    @MCKeep
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public interface SwipeDismissListener {
        void onDismissed();

        void onSwipeStarted();

        void onViewSettled();
    }

    public class a extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f64640a;

        public a() {
        }

        private boolean a(View view, float f6) {
            if (Math.abs(f6) <= SwipeDismissConstraintLayout.this.minScaledFlingVelocity) {
                return false;
            }
            int left = view.getLeft();
            int i10 = this.f64640a;
            return (left < i10 && f6 < 0.0f) || (left > i10 && f6 > 0.0f);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            return MathUtils.clamp(this.f64640a - view.getWidth(), i10, view.getWidth() + this.f64640a);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(@NonNull View view, int i10) {
            this.f64640a = (int) ((SwipeDismissConstraintLayout.this.getWidth() - view.getWidth()) * 0.5f);
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
            if (swipeDismissListener != null) {
                swipeDismissListener.onSwipeStarted();
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i10) {
            SwipeDismissConstraintLayout.this.draggingState = i10;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(@NonNull View view, float f6, float f10) {
            int i10;
            boolean z10;
            int width = view.getWidth();
            if (a(view, f6)) {
                int x4 = (int) (this.f64640a - SwipeDismissConstraintLayout.this.getX());
                int left = view.getLeft();
                int i11 = this.f64640a;
                i10 = left < i11 ? (i11 - width) - x4 : i11 + width + x4;
                z10 = true;
            } else {
                i10 = this.f64640a;
                z10 = false;
            }
            if (SwipeDismissConstraintLayout.this.dragHelper.settleCapturedViewAt(i10, view.getTop())) {
                ViewCompat.postOnAnimation(view, SwipeDismissConstraintLayout.this.new b(view, z10));
            } else {
                SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
                if (swipeDismissListener != null) {
                    if (z10) {
                        swipeDismissListener.onDismissed();
                    } else {
                        swipeDismissListener.onViewSettled();
                    }
                }
            }
            SwipeDismissConstraintLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(@NonNull View view, int i10) {
            return view == SwipeDismissConstraintLayout.this.swipeTarget;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f64642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f64643b;

        public b(View view, boolean z10) {
            this.f64642a = view;
            this.f64643b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper viewDragHelper = SwipeDismissConstraintLayout.this.dragHelper;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.f64642a, this);
                return;
            }
            SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
            if (swipeDismissListener != null) {
                if (this.f64643b) {
                    swipeDismissListener.onDismissed();
                } else {
                    swipeDismissListener.onViewSettled();
                }
            }
        }
    }

    public SwipeDismissConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SwipeDismissConstraintLayout, 0, 0);
        try {
            this.swipeTargetId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SwipeDismissConstraintLayout_swipeTargetId, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.dragHelper = ViewDragHelper.create(this, 1.0f, new a());
            this.minScaledFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private boolean isTarget(MotionEvent motionEvent) {
        int i10;
        View view = this.swipeTarget;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int i11 = iArr[0];
        return rawX > i11 && rawX < this.swipeTarget.getMeasuredWidth() + i11 && rawY > (i10 = iArr[1]) && rawY < this.swipeTarget.getMeasuredWidth() + i10;
    }

    public boolean isMoving() {
        int i10 = this.draggingState;
        return i10 == 1 || i10 == 2;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        this.swipeTarget = findViewById(this.swipeTargetId);
        super.onFinishInflate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isTarget(motionEvent) && this.dragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isTarget(motionEvent) && !isMoving()) {
            return super.onTouchEvent(motionEvent);
        }
        this.dragHelper.processTouchEvent(motionEvent);
        return true;
    }

    public void setListener(SwipeDismissListener swipeDismissListener) {
        this.listener = swipeDismissListener;
    }

    public SwipeDismissConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context, attributeSet);
    }
}
