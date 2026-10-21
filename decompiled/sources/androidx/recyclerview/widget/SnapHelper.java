package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SnapHelper extends RecyclerView.OnFlingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f22864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scroller f22865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f22866c = new a();

    public class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22867a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f22867a) {
                this.f22867a = false;
                SnapHelper.this.a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f22867a = true;
        }
    }

    public class b extends LinearSmoothScroller {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            SnapHelper snapHelper = SnapHelper.this;
            RecyclerView recyclerView = snapHelper.f22864a;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = snapHelper.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                action.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    public final void a() {
        RecyclerView.LayoutManager layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.f22864a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i10 = iArrCalculateDistanceToFinalSnap[0];
        if (i10 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.f22864a.smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f22864a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f22866c;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(aVar);
            this.f22864a.setOnFlingListener(null);
        }
        this.f22864a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f22864a.addOnScrollListener(aVar);
            this.f22864a.setOnFlingListener(this);
            this.f22865b = new Scroller(this.f22864a.getContext(), new DecelerateInterpolator());
            a();
        }
    }

    @Nullable
    public abstract int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i10, int i11) {
        this.f22865b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f22865b.getFinalX(), this.f22865b.getFinalY()};
    }

    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        return createSnapScroller(layoutManager);
    }

    @Nullable
    @Deprecated
    public LinearSmoothScroller createSnapScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new b(this.f22864a.getContext());
        }
        return null;
    }

    @Nullable
    @SuppressLint({"UnknownNullness"})
    public abstract View findSnapView(RecyclerView.LayoutManager layoutManager);

    @SuppressLint({"UnknownNullness"})
    public abstract int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i10, int i11) {
        RecyclerView.SmoothScroller smoothScrollerCreateScroller;
        int iFindTargetSnapPosition;
        RecyclerView.LayoutManager layoutManager = this.f22864a.getLayoutManager();
        if (layoutManager == null || this.f22864a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f22864a.getMinFlingVelocity();
        if ((Math.abs(i11) <= minFlingVelocity && Math.abs(i10) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (smoothScrollerCreateScroller = createScroller(layoutManager)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(layoutManager, i10, i11)) == -1) {
            return false;
        }
        smoothScrollerCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        layoutManager.startSmoothScroll(smoothScrollerCreateScroller);
        return true;
    }
}
