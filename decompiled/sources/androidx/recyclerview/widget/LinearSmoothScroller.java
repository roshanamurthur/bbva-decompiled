package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class LinearSmoothScroller extends RecyclerView.SmoothScroller {
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DisplayMetrics f22726i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f22728k;

    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22727j = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;

    @SuppressLint({"UnknownNullness"})
    public LinearSmoothScroller(Context context) {
        this.f22726i = context.getResources().getDisplayMetrics();
    }

    public int calculateDtToFit(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View view, int i10) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View view, int i10) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int calculateTimeForDeceleration(int i10) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i10)) / 0.3356d);
    }

    public int calculateTimeForScrolling(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f22727j) {
            this.f22728k = calculateSpeedPerPixel(this.f22726i);
            this.f22727j = true;
        }
        return (int) Math.ceil(fAbs * this.f22728k);
    }

    public int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f6 = pointF.x;
            if (f6 != 0.0f) {
                return f6 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f6 = pointF.y;
            if (f6 != 0.0f) {
                return f6 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    @SuppressLint({"UnknownNullness"})
    public void onSeekTargetStep(int i10, int i11, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        int i12 = this.mInterimTargetDx;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.mInterimTargetDx = i13;
        int i14 = this.mInterimTargetDy;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.mInterimTargetDy = i16;
        if (i13 == 0 && i16 == 0) {
            updateActionForInterimTarget(action);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    @SuppressLint({"UnknownNullness"})
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDyToMakeVisible * iCalculateDyToMakeVisible) + (iCalculateDxToMakeVisible * iCalculateDxToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            action.jumpTo(getTargetPosition());
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        action.update((int) (this.mInterimTargetDx * 1.2f), (int) (this.mInterimTargetDy * 1.2f), (int) (calculateTimeForScrolling(10000) * 1.2f), this.mLinearInterpolator);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStart() {
    }
}
