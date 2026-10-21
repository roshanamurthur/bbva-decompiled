package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class LinearSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public OrientationHelper f22729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public OrientationHelper f22730e;

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

    public final int b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i10, int i11) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i10, i11);
        int childCount = layoutManager.getChildCount();
        float f6 = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = layoutManager.getChildAt(i14);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i13) {
                        view = childAt;
                        i13 = position;
                    }
                    if (position > i12) {
                        view2 = childAt;
                        i12 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(orientationHelper.getDecoratedEnd(view), orientationHelper.getDecoratedEnd(view2)) - Math.min(orientationHelper.getDecoratedStart(view), orientationHelper.getDecoratedStart(view2));
                if (iMax != 0) {
                    f6 = (iMax * 1.0f) / ((i12 - i13) + 1);
                }
            }
        }
        if (f6 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / f6);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            OrientationHelper orientationHelperD = d(layoutManager);
            iArr[0] = ((orientationHelperD.getDecoratedMeasurement(view) / 2) + orientationHelperD.getDecoratedStart(view)) - ((orientationHelperD.getTotalSpace() / 2) + orientationHelperD.getStartAfterPadding());
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            OrientationHelper orientationHelperE = e(layoutManager);
            iArr[1] = ((orientationHelperE.getDecoratedMeasurement(view) / 2) + orientationHelperE.getDecoratedStart(view)) - ((orientationHelperE.getTotalSpace() / 2) + orientationHelperE.getStartAfterPadding());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @NonNull
    public final OrientationHelper d(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f22730e;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.f22730e = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f22730e;
    }

    @NonNull
    public final OrientationHelper e(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f22729d;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.f22729d = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f22729d;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
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
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i12;
        PointF pointFComputeScrollVectorForPosition;
        int iB;
        int iB2;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (itemCount = layoutManager.getItemCount()) == 0 || (viewFindSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(viewFindSnapView)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition((i12 = itemCount - 1))) == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            iB = b(layoutManager, d(layoutManager), i10, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iB = -iB;
            }
        } else {
            iB = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iB2 = b(layoutManager, e(layoutManager), 0, i11);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iB2 = -iB2;
            }
        } else {
            iB2 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iB = iB2;
        }
        if (iB == 0) {
            return -1;
        }
        int i13 = position + iB;
        int i14 = i13 >= 0 ? i13 : 0;
        return i14 >= itemCount ? i12 : i14;
    }
}
