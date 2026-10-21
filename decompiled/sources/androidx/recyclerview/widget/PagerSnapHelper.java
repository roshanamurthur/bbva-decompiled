package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class PagerSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public OrientationHelper f22735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public OrientationHelper f22736e;

    public class a extends LinearSmoothScroller {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final float calculateSpeedPerPixel(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int calculateTimeForScrolling(int i10) {
            return Math.min(100, super.calculateTimeForScrolling(i10));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public final void onTargetFound(@NonNull View view, @NonNull RecyclerView.State state, @NonNull RecyclerView.SmoothScroller.Action action) {
            PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
            int[] iArrCalculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.f22864a.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                action.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    public static int b(@NonNull View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.getDecoratedMeasurement(view) / 2) + orientationHelper.getDecoratedStart(view)) - ((orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding());
    }

    @Nullable
    public static View c(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int totalSpace = (orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = layoutManager.getChildAt(i11);
            int iAbs = Math.abs(((orientationHelper.getDecoratedMeasurement(childAt) / 2) + orientationHelper.getDecoratedStart(childAt)) - totalSpace);
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = b(view, d(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = b(view, e(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new a(this.f22864a.getContext());
        }
        return null;
    }

    @NonNull
    public final OrientationHelper d(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f22736e;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.f22736e = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f22736e;
    }

    @NonNull
    public final OrientationHelper e(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f22735d;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.f22735d = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f22735d;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return c(layoutManager, e(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return c(layoutManager, d(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        OrientationHelper orientationHelperE = layoutManager.canScrollVertically() ? e(layoutManager) : layoutManager.canScrollHorizontally() ? d(layoutManager) : null;
        if (orientationHelperE == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = layoutManager.getChildAt(i14);
            if (childAt != null) {
                int iB = b(childAt, orientationHelperE);
                if (iB <= 0 && iB > i13) {
                    view2 = childAt;
                    i13 = iB;
                }
                if (iB >= 0 && iB < i12) {
                    view = childAt;
                    i12 = iB;
                }
            }
        }
        boolean z11 = !layoutManager.canScrollHorizontally() ? i11 <= 0 : i10 <= 0;
        if (z11 && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!z11 && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (z11) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        int itemCount2 = layoutManager.getItemCount();
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
            z10 = true;
        }
        int i15 = position + (z10 == z11 ? -1 : 1);
        if (i15 < 0 || i15 >= itemCount) {
            return -1;
        }
        return i15;
    }
}
