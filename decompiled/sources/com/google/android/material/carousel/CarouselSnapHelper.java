package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes10.dex */
public class CarouselSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f44198e;

    public class a extends LinearSmoothScroller {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.LayoutManager f44199l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, RecyclerView.LayoutManager layoutManager) {
            super(context);
            this.f44199l = layoutManager;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            float f6;
            float f10;
            if (this.f44199l.canScrollVertically()) {
                f6 = displayMetrics.densityDpi;
                f10 = 50.0f;
            } else {
                f6 = displayMetrics.densityDpi;
                f10 = 100.0f;
            }
            return f10 / f6;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            RecyclerView recyclerView = CarouselSnapHelper.this.f44198e;
            if (recyclerView != null) {
                int[] iArrB = CarouselSnapHelper.b(recyclerView.getLayoutManager(), view, true);
                int i10 = iArrB[0];
                int i11 = iArrB[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
                if (iCalculateTimeForDeceleration > 0) {
                    action.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        }
    }

    public CarouselSnapHelper() {
        this(true);
    }

    public static int[] b(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, boolean z10) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
        int iW = carouselLayoutManager.w(carouselLayoutManager.getPosition(view), z10);
        if (layoutManager.canScrollHorizontally()) {
            return new int[]{iW, 0};
        }
        return layoutManager.canScrollVertically() ? new int[]{0, iW} : new int[]{0, 0};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.f44198e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return b(layoutManager, view, false);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new a(this.f44198e.getContext(), layoutManager);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = layoutManager.getChildAt(i11);
                int iAbs = Math.abs(carouselLayoutManager.w(layoutManager.getPosition(childAt), false));
                if (iAbs < i10) {
                    view = childAt;
                    i10 = iAbs;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        int itemCount;
        PointF pointFComputeScrollVectorForPosition;
        if (!this.f44197d || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        boolean z10 = false;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = layoutManager.getChildAt(i14);
            if (childAt != null) {
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
                int iW = carouselLayoutManager.w(carouselLayoutManager.getPosition(childAt), false);
                if (iW <= 0 && iW > i13) {
                    view2 = childAt;
                    i13 = iW;
                }
                if (iW >= 0 && iW < i12) {
                    view = childAt;
                    i12 = iW;
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

    public CarouselSnapHelper(boolean z10) {
        this.f44197d = z10;
    }
}
