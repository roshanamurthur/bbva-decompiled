package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OrientationHelper {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22733a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f22734b = new Rect();
    protected final RecyclerView.LayoutManager mLayoutManager;

    public class a extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedEnd(View view) {
            return this.mLayoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedMeasurement(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.mLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedMeasurementInOther(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.mLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedStart(View view) {
            return this.mLayoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEnd() {
            return this.mLayoutManager.getWidth();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEndAfterPadding() {
            return this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEndPadding() {
            return this.mLayoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getMode() {
            return this.mLayoutManager.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getModeInOther() {
            return this.mLayoutManager.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getStartAfterPadding() {
            return this.mLayoutManager.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTotalSpace() {
            return (this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingLeft()) - this.mLayoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTransformedEndWithDecoration(View view) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            Rect rect = this.f22734b;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTransformedStartWithDecoration(View view) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            Rect rect = this.f22734b;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void offsetChild(View view, int i10) {
            view.offsetLeftAndRight(i10);
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void offsetChildren(int i10) {
            this.mLayoutManager.offsetChildrenHorizontal(i10);
        }
    }

    public class b extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedEnd(View view) {
            return this.mLayoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedMeasurement(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.mLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedMeasurementInOther(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.mLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getDecoratedStart(View view) {
            return this.mLayoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEnd() {
            return this.mLayoutManager.getHeight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEndAfterPadding() {
            return this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getEndPadding() {
            return this.mLayoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getMode() {
            return this.mLayoutManager.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getModeInOther() {
            return this.mLayoutManager.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getStartAfterPadding() {
            return this.mLayoutManager.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTotalSpace() {
            return (this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingTop()) - this.mLayoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTransformedEndWithDecoration(View view) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            Rect rect = this.f22734b;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final int getTransformedStartWithDecoration(View view) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            Rect rect = this.f22734b;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void offsetChild(View view, int i10) {
            view.offsetTopAndBottom(i10);
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        public final void offsetChildren(int i10) {
            this.mLayoutManager.offsetChildrenVertical(i10);
        }
    }

    public OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.mLayoutManager = layoutManager;
    }

    public static OrientationHelper createHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        return new a(layoutManager);
    }

    public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager layoutManager, int i10) {
        if (i10 == 0) {
            return createHorizontalHelper(layoutManager);
        }
        if (i10 == 1) {
            return createVerticalHelper(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static OrientationHelper createVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        return new b(layoutManager);
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public RecyclerView.LayoutManager getLayoutManager() {
        return this.mLayoutManager;
    }

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange() {
        if (Integer.MIN_VALUE == this.f22733a) {
            return 0;
        }
        return getTotalSpace() - this.f22733a;
    }

    public abstract int getTransformedEndWithDecoration(View view);

    public abstract int getTransformedStartWithDecoration(View view);

    public abstract void offsetChild(View view, int i10);

    public abstract void offsetChildren(int i10);

    public void onLayoutComplete() {
        this.f22733a = getTotalSpace();
    }
}
