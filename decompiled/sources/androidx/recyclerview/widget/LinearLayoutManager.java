package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.fragment.app.FragmentTransaction;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    public boolean A;
    public SavedState B;
    public final a C;
    public final LayoutChunkResult D;
    public int E;
    public final int[] F;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f22697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public OrientationHelper f22698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22699t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22701v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22704y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f22705z;

    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f22706p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f22707q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f22708r0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f22706p0 = parcel.readInt();
                savedState.f22707q0 = parcel.readInt();
                savedState.f22708r0 = parcel.readInt() == 1;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f22706p0);
            parcel.writeInt(this.f22707q0);
            parcel.writeInt(this.f22708r0 ? 1 : 0);
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f22706p0 = savedState.f22706p0;
            this.f22707q0 = savedState.f22707q0;
            this.f22708r0 = savedState.f22708r0;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OrientationHelper f22709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22713e;

        public a() {
            d();
        }

        public final void a() {
            this.f22711c = this.f22712d ? this.f22709a.getEndAfterPadding() : this.f22709a.getStartAfterPadding();
        }

        public final void b(int i10, View view) {
            if (this.f22712d) {
                this.f22711c = this.f22709a.getTotalSpaceChange() + this.f22709a.getDecoratedEnd(view);
            } else {
                this.f22711c = this.f22709a.getDecoratedStart(view);
            }
            this.f22710b = i10;
        }

        public final void c(int i10, View view) {
            int totalSpaceChange = this.f22709a.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                b(i10, view);
                return;
            }
            this.f22710b = i10;
            if (!this.f22712d) {
                int decoratedStart = this.f22709a.getDecoratedStart(view);
                int startAfterPadding = decoratedStart - this.f22709a.getStartAfterPadding();
                this.f22711c = decoratedStart;
                if (startAfterPadding > 0) {
                    int endAfterPadding = (this.f22709a.getEndAfterPadding() - Math.min(0, (this.f22709a.getEndAfterPadding() - totalSpaceChange) - this.f22709a.getDecoratedEnd(view))) - (this.f22709a.getDecoratedMeasurement(view) + decoratedStart);
                    if (endAfterPadding < 0) {
                        this.f22711c -= Math.min(startAfterPadding, -endAfterPadding);
                        return;
                    }
                    return;
                }
                return;
            }
            int endAfterPadding2 = (this.f22709a.getEndAfterPadding() - totalSpaceChange) - this.f22709a.getDecoratedEnd(view);
            this.f22711c = this.f22709a.getEndAfterPadding() - endAfterPadding2;
            if (endAfterPadding2 > 0) {
                int decoratedMeasurement = this.f22711c - this.f22709a.getDecoratedMeasurement(view);
                int startAfterPadding2 = this.f22709a.getStartAfterPadding();
                int iMin = decoratedMeasurement - (Math.min(this.f22709a.getDecoratedStart(view) - startAfterPadding2, 0) + startAfterPadding2);
                if (iMin < 0) {
                    this.f22711c = Math.min(endAfterPadding2, -iMin) + this.f22711c;
                }
            }
        }

        public final void d() {
            this.f22710b = -1;
            this.f22711c = Integer.MIN_VALUE;
            this.f22712d = false;
            this.f22713e = false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f22710b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f22711c);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f22712d);
            sb2.append(", mValid=");
            return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.f22713e, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22720g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22721h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22722i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22723j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<RecyclerView.ViewHolder> f22724k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f22725l;

        public final void a(View view) {
            int viewLayoutPosition;
            int size = this.f22724k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f22724k.get(i11).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.f22717d) * this.f22718e) >= 0 && viewLayoutPosition < i10) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    } else {
                        i10 = viewLayoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f22717d = -1;
            } else {
                this.f22717d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition();
            }
        }

        public final View b(RecyclerView.Recycler recycler) {
            List<RecyclerView.ViewHolder> list = this.f22724k;
            if (list == null) {
                View viewForPosition = recycler.getViewForPosition(this.f22717d);
                this.f22717d += this.f22718e;
                return viewForPosition;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f22724k.get(i10).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && this.f22717d == layoutParams.getViewLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    public final View A() {
        return getChildAt(this.f22701v ? 0 : getChildCount() - 1);
    }

    public final View B() {
        return getChildAt(this.f22701v ? getChildCount() - 1 : 0);
    }

    public void C(RecyclerView.Recycler recycler, RecyclerView.State state, b bVar, LayoutChunkResult layoutChunkResult) {
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int decoratedMeasurementInOther;
        View viewB = bVar.b(recycler);
        if (viewB == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        if (bVar.f22724k == null) {
            if (this.f22701v == (bVar.f22719f == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (this.f22701v == (bVar.f22719f == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        layoutChunkResult.mConsumed = this.f22698s.getDecoratedMeasurement(viewB);
        if (this.f22696q == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                paddingLeft = decoratedMeasurementInOther - this.f22698s.getDecoratedMeasurementInOther(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                decoratedMeasurementInOther = this.f22698s.getDecoratedMeasurementInOther(viewB) + paddingLeft;
            }
            if (bVar.f22719f == -1) {
                int i13 = bVar.f22715b;
                i12 = i13;
                i11 = decoratedMeasurementInOther;
                i10 = i13 - layoutChunkResult.mConsumed;
            } else {
                int i14 = bVar.f22715b;
                i10 = i14;
                i11 = decoratedMeasurementInOther;
                i12 = layoutChunkResult.mConsumed + i14;
            }
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.f22698s.getDecoratedMeasurementInOther(viewB) + paddingTop;
            if (bVar.f22719f == -1) {
                int i15 = bVar.f22715b;
                i11 = i15;
                i10 = paddingTop;
                i12 = decoratedMeasurementInOther2;
                paddingLeft = i15 - layoutChunkResult.mConsumed;
            } else {
                int i16 = bVar.f22715b;
                i10 = paddingTop;
                i11 = layoutChunkResult.mConsumed + i16;
                i12 = decoratedMeasurementInOther2;
                paddingLeft = i16;
            }
        }
        layoutDecoratedWithMargins(viewB, paddingLeft, i10, i11, i12);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = viewB.hasFocusable();
    }

    public final void E(RecyclerView.Recycler recycler, b bVar) {
        if (!bVar.f22714a || bVar.f22725l) {
            return;
        }
        int i10 = bVar.f22720g;
        int i11 = bVar.f22722i;
        if (bVar.f22719f == -1) {
            int childCount = getChildCount();
            if (i10 < 0) {
                return;
            }
            int end = (this.f22698s.getEnd() - i10) + i11;
            if (this.f22701v) {
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (this.f22698s.getDecoratedStart(childAt) < end || this.f22698s.getTransformedStartWithDecoration(childAt) < end) {
                        F(recycler, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = childCount - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View childAt2 = getChildAt(i14);
                if (this.f22698s.getDecoratedStart(childAt2) < end || this.f22698s.getTransformedStartWithDecoration(childAt2) < end) {
                    F(recycler, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int childCount2 = getChildCount();
        if (!this.f22701v) {
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt3 = getChildAt(i16);
                if (this.f22698s.getDecoratedEnd(childAt3) > i15 || this.f22698s.getTransformedEndWithDecoration(childAt3) > i15) {
                    F(recycler, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = childCount2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View childAt4 = getChildAt(i18);
            if (this.f22698s.getDecoratedEnd(childAt4) > i15 || this.f22698s.getTransformedEndWithDecoration(childAt4) > i15) {
                F(recycler, i17, i18);
                return;
            }
        }
    }

    public final void F(RecyclerView.Recycler recycler, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                removeAndRecycleViewAt(i10, recycler);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, recycler);
            }
        }
    }

    public final void G() {
        if (this.f22696q == 1 || !isLayoutRTL()) {
            this.f22701v = this.f22700u;
        } else {
            this.f22701v = !this.f22700u;
        }
    }

    public final int H(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        r();
        this.f22697r.f22714a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        I(i11, iAbs, true, state);
        b bVar = this.f22697r;
        int iS = s(recycler, bVar, state, false) + bVar.f22720g;
        if (iS < 0) {
            return 0;
        }
        if (iAbs > iS) {
            i10 = i11 * iS;
        }
        this.f22698s.offsetChildren(-i10);
        this.f22697r.f22723j = i10;
        return i10;
    }

    public final void I(int i10, int i11, boolean z10, RecyclerView.State state) {
        int startAfterPadding;
        this.f22697r.f22725l = this.f22698s.getMode() == 0 && this.f22698s.getEnd() == 0;
        this.f22697r.f22719f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        b bVar = this.f22697r;
        int i12 = z11 ? iMax2 : iMax;
        bVar.f22721h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        bVar.f22722i = iMax;
        if (z11) {
            bVar.f22721h = this.f22698s.getEndPadding() + i12;
            View viewA = A();
            b bVar2 = this.f22697r;
            bVar2.f22718e = this.f22701v ? -1 : 1;
            int position = getPosition(viewA);
            b bVar3 = this.f22697r;
            bVar2.f22717d = position + bVar3.f22718e;
            bVar3.f22715b = this.f22698s.getDecoratedEnd(viewA);
            startAfterPadding = this.f22698s.getDecoratedEnd(viewA) - this.f22698s.getEndAfterPadding();
        } else {
            View viewB = B();
            b bVar4 = this.f22697r;
            bVar4.f22721h = this.f22698s.getStartAfterPadding() + bVar4.f22721h;
            b bVar5 = this.f22697r;
            bVar5.f22718e = this.f22701v ? 1 : -1;
            int position2 = getPosition(viewB);
            b bVar6 = this.f22697r;
            bVar5.f22717d = position2 + bVar6.f22718e;
            bVar6.f22715b = this.f22698s.getDecoratedStart(viewB);
            startAfterPadding = (-this.f22698s.getDecoratedStart(viewB)) + this.f22698s.getStartAfterPadding();
        }
        b bVar7 = this.f22697r;
        bVar7.f22716c = i11;
        if (z10) {
            bVar7.f22716c = i11 - startAfterPadding;
        }
        bVar7.f22720g = startAfterPadding;
    }

    public final void J(int i10, int i11) {
        this.f22697r.f22716c = this.f22698s.getEndAfterPadding() - i11;
        b bVar = this.f22697r;
        bVar.f22718e = this.f22701v ? -1 : 1;
        bVar.f22717d = i10;
        bVar.f22719f = 1;
        bVar.f22715b = i11;
        bVar.f22720g = Integer.MIN_VALUE;
    }

    public final void K(int i10, int i11) {
        this.f22697r.f22716c = i11 - this.f22698s.getStartAfterPadding();
        b bVar = this.f22697r;
        bVar.f22717d = i10;
        bVar.f22718e = this.f22701v ? 1 : -1;
        bVar.f22719f = -1;
        bVar.f22715b = i11;
        bVar.f22720g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.B == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.f22697r.f22719f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f22696q == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f22696q == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.f22696q != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        r();
        I(i10 > 0 ? 1 : -1, Math.abs(i10), true, state);
        m(state, this.f22697r, layoutPrefetchRegistry);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i10, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z10;
        int i11;
        SavedState savedState = this.B;
        if (savedState == null || (i11 = savedState.f22706p0) < 0) {
            G();
            z10 = this.f22701v;
            i11 = this.f22704y;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            z10 = savedState.f22708r0;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.E && i11 >= 0 && i11 < i10; i13++) {
            layoutPrefetchRegistry.addPosition(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return n(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return o(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return p(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        int i11 = (i10 < getPosition(getChildAt(0))) != this.f22701v ? -1 : 1;
        return this.f22696q == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return n(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return o(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return p(state);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewW = w(0, getChildCount(), true, false);
        if (viewW == null) {
            return -1;
        }
        return getPosition(viewW);
    }

    public int findFirstVisibleItemPosition() {
        View viewW = w(0, getChildCount(), false, true);
        if (viewW == null) {
            return -1;
        }
        return getPosition(viewW);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewW = w(getChildCount() - 1, -1, true, false);
        if (viewW == null) {
            return -1;
        }
        return getPosition(viewW);
    }

    public int findLastVisibleItemPosition() {
        View viewW = w(getChildCount() - 1, -1, false, true);
        if (viewW == null) {
            return -1;
        }
        return getPosition(viewW);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.f22698s.getTotalSpace();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.E;
    }

    public int getOrientation() {
        return this.f22696q;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.A;
    }

    public boolean getReverseLayout() {
        return this.f22700u;
    }

    public boolean getStackFromEnd() {
        return this.f22702w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.f22703x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean k() {
        if (getHeightMode() == 1073741824 || getWidthMode() == 1073741824) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public void m(RecyclerView.State state, b bVar, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i10 = bVar.f22717d;
        if (i10 < 0 || i10 >= state.getItemCount()) {
            return;
        }
        layoutPrefetchRegistry.addPosition(i10, Math.max(0, bVar.f22720g));
    }

    public final int n(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        r();
        return w.a(state, this.f22698s, u(!this.f22703x), t(!this.f22703x), this, this.f22703x);
    }

    public final int o(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        r();
        return w.b(state, this.f22698s, u(!this.f22703x), t(!this.f22703x), this, this.f22703x, this.f22701v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.A) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iQ;
        View viewV;
        G();
        if (getChildCount() == 0 || (iQ = q(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        r();
        I(iQ, (int) (this.f22698s.getTotalSpace() * 0.33333334f), false, state);
        b bVar = this.f22697r;
        bVar.f22720g = Integer.MIN_VALUE;
        bVar.f22714a = false;
        s(recycler, bVar, state, true);
        if (iQ == -1) {
            viewV = this.f22701v ? v(getChildCount() - 1, -1) : v(0, getChildCount());
        } else {
            viewV = this.f22701v ? v(0, getChildCount()) : v(getChildCount() - 1, -1);
        }
        View viewB = iQ == -1 ? B() : A();
        if (!viewB.hasFocusable()) {
            return viewV;
        }
        if (viewV == null) {
            return null;
        }
        return viewB;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0205  */
    /* JADX WARN: Code duplicated, block: B:83:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c0  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int itemCount;
        View focusedChild;
        boolean z10;
        boolean z11;
        View viewX;
        int decoratedStart;
        int decoratedEnd;
        int startAfterPadding;
        int endAfterPadding;
        boolean z12;
        boolean z13;
        RecyclerView.LayoutParams layoutParams;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iY;
        int i15;
        View viewFindViewByPosition;
        int decoratedStart2;
        int endAfterPadding2;
        int i16;
        int i17 = -1;
        if (!(this.B == null && this.f22704y == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.B;
        if (savedState != null && (i16 = savedState.f22706p0) >= 0) {
            this.f22704y = i16;
        }
        r();
        this.f22697r.f22714a = false;
        G();
        View focusedChild2 = getFocusedChild();
        a aVar = this.C;
        boolean z14 = true;
        if (!aVar.f22713e || this.f22704y != -1 || this.B != null) {
            aVar.d();
            aVar.f22712d = this.f22701v ^ this.f22702w;
            if (state.isPreLayout() || (i10 = this.f22704y) == -1) {
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
                        if (!layoutParams.isItemRemoved() || layoutParams.getViewLayoutPosition() < 0 || layoutParams.getViewLayoutPosition() >= state.getItemCount()) {
                            z10 = this.f22699t;
                            z11 = this.f22702w;
                            if (z10 == z11 || (viewX = x(recycler, state, aVar.f22712d, z11)) == null) {
                                aVar.a();
                                if (this.f22702w) {
                                    itemCount = state.getItemCount() - 1;
                                } else {
                                    itemCount = 0;
                                }
                                aVar.f22710b = itemCount;
                            } else {
                                aVar.b(getPosition(viewX), viewX);
                                if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
                                    decoratedStart = this.f22698s.getDecoratedStart(viewX);
                                    decoratedEnd = this.f22698s.getDecoratedEnd(viewX);
                                    startAfterPadding = this.f22698s.getStartAfterPadding();
                                    endAfterPadding = this.f22698s.getEndAfterPadding();
                                    if (decoratedEnd <= startAfterPadding || decoratedStart >= startAfterPadding) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (decoratedStart >= endAfterPadding || decoratedEnd <= endAfterPadding) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (z12 || z13) {
                                        if (aVar.f22712d) {
                                            startAfterPadding = endAfterPadding;
                                        }
                                        aVar.f22711c = startAfterPadding;
                                    }
                                }
                            }
                        } else {
                            aVar.c(getPosition(focusedChild), focusedChild);
                        }
                    } else {
                        z10 = this.f22699t;
                        z11 = this.f22702w;
                        if (z10 == z11) {
                            aVar.a();
                            if (this.f22702w) {
                                itemCount = state.getItemCount() - 1;
                            } else {
                                itemCount = 0;
                            }
                            aVar.f22710b = itemCount;
                        } else {
                            aVar.b(getPosition(viewX), viewX);
                            if (!state.isPreLayout()) {
                                decoratedStart = this.f22698s.getDecoratedStart(viewX);
                                decoratedEnd = this.f22698s.getDecoratedEnd(viewX);
                                startAfterPadding = this.f22698s.getStartAfterPadding();
                                endAfterPadding = this.f22698s.getEndAfterPadding();
                                if (decoratedEnd <= startAfterPadding) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (decoratedStart >= endAfterPadding) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z12) {
                                    if (aVar.f22712d) {
                                        startAfterPadding = endAfterPadding;
                                    }
                                    aVar.f22711c = startAfterPadding;
                                } else {
                                    if (aVar.f22712d) {
                                        startAfterPadding = endAfterPadding;
                                    }
                                    aVar.f22711c = startAfterPadding;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.f22702w) {
                        itemCount = state.getItemCount() - 1;
                    } else {
                        itemCount = 0;
                    }
                    aVar.f22710b = itemCount;
                }
            } else if (i10 < 0 || i10 >= state.getItemCount()) {
                this.f22704y = -1;
                this.f22705z = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
                        if (layoutParams.isItemRemoved()) {
                            z10 = this.f22699t;
                            z11 = this.f22702w;
                            if (z10 == z11) {
                                aVar.a();
                                if (this.f22702w) {
                                    itemCount = state.getItemCount() - 1;
                                } else {
                                    itemCount = 0;
                                }
                                aVar.f22710b = itemCount;
                            } else {
                                aVar.b(getPosition(viewX), viewX);
                                if (!state.isPreLayout()) {
                                    decoratedStart = this.f22698s.getDecoratedStart(viewX);
                                    decoratedEnd = this.f22698s.getDecoratedEnd(viewX);
                                    startAfterPadding = this.f22698s.getStartAfterPadding();
                                    endAfterPadding = this.f22698s.getEndAfterPadding();
                                    if (decoratedEnd <= startAfterPadding) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (decoratedStart >= endAfterPadding) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12) {
                                        if (aVar.f22712d) {
                                            startAfterPadding = endAfterPadding;
                                        }
                                        aVar.f22711c = startAfterPadding;
                                    } else {
                                        if (aVar.f22712d) {
                                            startAfterPadding = endAfterPadding;
                                        }
                                        aVar.f22711c = startAfterPadding;
                                    }
                                }
                            }
                        } else {
                            z10 = this.f22699t;
                            z11 = this.f22702w;
                            if (z10 == z11) {
                                aVar.a();
                                if (this.f22702w) {
                                    itemCount = state.getItemCount() - 1;
                                } else {
                                    itemCount = 0;
                                }
                                aVar.f22710b = itemCount;
                            } else {
                                aVar.b(getPosition(viewX), viewX);
                                if (!state.isPreLayout()) {
                                    decoratedStart = this.f22698s.getDecoratedStart(viewX);
                                    decoratedEnd = this.f22698s.getDecoratedEnd(viewX);
                                    startAfterPadding = this.f22698s.getStartAfterPadding();
                                    endAfterPadding = this.f22698s.getEndAfterPadding();
                                    if (decoratedEnd <= startAfterPadding) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (decoratedStart >= endAfterPadding) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12) {
                                        if (aVar.f22712d) {
                                            startAfterPadding = endAfterPadding;
                                        }
                                        aVar.f22711c = startAfterPadding;
                                    } else {
                                        if (aVar.f22712d) {
                                            startAfterPadding = endAfterPadding;
                                        }
                                        aVar.f22711c = startAfterPadding;
                                    }
                                }
                            }
                        }
                    } else {
                        z10 = this.f22699t;
                        z11 = this.f22702w;
                        if (z10 == z11) {
                            aVar.a();
                            if (this.f22702w) {
                                itemCount = state.getItemCount() - 1;
                            } else {
                                itemCount = 0;
                            }
                            aVar.f22710b = itemCount;
                        } else {
                            aVar.b(getPosition(viewX), viewX);
                            if (!state.isPreLayout()) {
                                decoratedStart = this.f22698s.getDecoratedStart(viewX);
                                decoratedEnd = this.f22698s.getDecoratedEnd(viewX);
                                startAfterPadding = this.f22698s.getStartAfterPadding();
                                endAfterPadding = this.f22698s.getEndAfterPadding();
                                if (decoratedEnd <= startAfterPadding) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (decoratedStart >= endAfterPadding) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z12) {
                                    if (aVar.f22712d) {
                                        startAfterPadding = endAfterPadding;
                                    }
                                    aVar.f22711c = startAfterPadding;
                                } else {
                                    if (aVar.f22712d) {
                                        startAfterPadding = endAfterPadding;
                                    }
                                    aVar.f22711c = startAfterPadding;
                                }
                            }
                        }
                    }
                } else {
                    aVar.a();
                    if (this.f22702w) {
                        itemCount = state.getItemCount() - 1;
                    } else {
                        itemCount = 0;
                    }
                    aVar.f22710b = itemCount;
                }
            } else {
                int i18 = this.f22704y;
                aVar.f22710b = i18;
                SavedState savedState2 = this.B;
                if (savedState2 != null && savedState2.f22706p0 >= 0) {
                    boolean z15 = savedState2.f22708r0;
                    aVar.f22712d = z15;
                    if (z15) {
                        aVar.f22711c = this.f22698s.getEndAfterPadding() - this.B.f22707q0;
                    } else {
                        aVar.f22711c = this.f22698s.getStartAfterPadding() + this.B.f22707q0;
                    }
                } else if (this.f22705z == Integer.MIN_VALUE) {
                    View viewFindViewByPosition2 = findViewByPosition(i18);
                    if (viewFindViewByPosition2 == null) {
                        if (getChildCount() > 0) {
                            aVar.f22712d = (this.f22704y < getPosition(getChildAt(0))) == this.f22701v;
                        }
                        aVar.a();
                    } else if (this.f22698s.getDecoratedMeasurement(viewFindViewByPosition2) > this.f22698s.getTotalSpace()) {
                        aVar.a();
                    } else if (this.f22698s.getDecoratedStart(viewFindViewByPosition2) - this.f22698s.getStartAfterPadding() < 0) {
                        aVar.f22711c = this.f22698s.getStartAfterPadding();
                        aVar.f22712d = false;
                    } else if (this.f22698s.getEndAfterPadding() - this.f22698s.getDecoratedEnd(viewFindViewByPosition2) < 0) {
                        aVar.f22711c = this.f22698s.getEndAfterPadding();
                        aVar.f22712d = true;
                    } else {
                        aVar.f22711c = aVar.f22712d ? this.f22698s.getTotalSpaceChange() + this.f22698s.getDecoratedEnd(viewFindViewByPosition2) : this.f22698s.getDecoratedStart(viewFindViewByPosition2);
                    }
                } else {
                    boolean z16 = this.f22701v;
                    aVar.f22712d = z16;
                    if (z16) {
                        aVar.f22711c = this.f22698s.getEndAfterPadding() - this.f22705z;
                    } else {
                        aVar.f22711c = this.f22698s.getStartAfterPadding() + this.f22705z;
                    }
                }
            }
            aVar.f22713e = true;
        } else if (focusedChild2 != null && (this.f22698s.getDecoratedStart(focusedChild2) >= this.f22698s.getEndAfterPadding() || this.f22698s.getDecoratedEnd(focusedChild2) <= this.f22698s.getStartAfterPadding())) {
            aVar.c(getPosition(focusedChild2), focusedChild2);
        }
        b bVar = this.f22697r;
        bVar.f22719f = bVar.f22723j >= 0 ? 1 : -1;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int startAfterPadding2 = this.f22698s.getStartAfterPadding() + Math.max(0, iArr[0]);
        int endPadding = this.f22698s.getEndPadding() + Math.max(0, iArr[1]);
        if (state.isPreLayout() && (i15 = this.f22704y) != -1 && this.f22705z != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i15)) != null) {
            if (this.f22701v) {
                endAfterPadding2 = this.f22698s.getEndAfterPadding() - this.f22698s.getDecoratedEnd(viewFindViewByPosition);
                decoratedStart2 = this.f22705z;
            } else {
                decoratedStart2 = this.f22698s.getDecoratedStart(viewFindViewByPosition) - this.f22698s.getStartAfterPadding();
                endAfterPadding2 = this.f22705z;
            }
            int i19 = endAfterPadding2 - decoratedStart2;
            if (i19 > 0) {
                startAfterPadding2 += i19;
            } else {
                endPadding -= i19;
            }
        }
        if (!aVar.f22712d ? !this.f22701v : this.f22701v) {
            i17 = 1;
        }
        D(recycler, state, aVar, i17);
        detachAndScrapAttachedViews(recycler);
        this.f22697r.f22725l = this.f22698s.getMode() == 0 && this.f22698s.getEnd() == 0;
        b bVar2 = this.f22697r;
        state.isPreLayout();
        bVar2.getClass();
        this.f22697r.f22722i = 0;
        if (aVar.f22712d) {
            K(aVar.f22710b, aVar.f22711c);
            b bVar3 = this.f22697r;
            bVar3.f22721h = startAfterPadding2;
            s(recycler, bVar3, state, false);
            b bVar4 = this.f22697r;
            i12 = bVar4.f22715b;
            int i20 = bVar4.f22717d;
            int i21 = bVar4.f22716c;
            if (i21 > 0) {
                endPadding += i21;
            }
            J(aVar.f22710b, aVar.f22711c);
            b bVar5 = this.f22697r;
            bVar5.f22721h = endPadding;
            bVar5.f22717d += bVar5.f22718e;
            s(recycler, bVar5, state, false);
            b bVar6 = this.f22697r;
            i11 = bVar6.f22715b;
            int i22 = bVar6.f22716c;
            if (i22 > 0) {
                K(i20, i12);
                b bVar7 = this.f22697r;
                bVar7.f22721h = i22;
                s(recycler, bVar7, state, false);
                i12 = this.f22697r.f22715b;
            }
        } else {
            J(aVar.f22710b, aVar.f22711c);
            b bVar8 = this.f22697r;
            bVar8.f22721h = endPadding;
            s(recycler, bVar8, state, false);
            b bVar9 = this.f22697r;
            i11 = bVar9.f22715b;
            int i23 = bVar9.f22717d;
            int i24 = bVar9.f22716c;
            if (i24 > 0) {
                startAfterPadding2 += i24;
            }
            K(aVar.f22710b, aVar.f22711c);
            b bVar10 = this.f22697r;
            bVar10.f22721h = startAfterPadding2;
            bVar10.f22717d += bVar10.f22718e;
            s(recycler, bVar10, state, false);
            b bVar11 = this.f22697r;
            int i25 = bVar11.f22715b;
            int i26 = bVar11.f22716c;
            if (i26 > 0) {
                J(i23, i11);
                b bVar12 = this.f22697r;
                bVar12.f22721h = i26;
                s(recycler, bVar12, state, false);
                i11 = this.f22697r.f22715b;
            }
            i12 = i25;
        }
        if (getChildCount() > 0) {
            if (this.f22701v ^ this.f22702w) {
                int iY2 = y(i11, recycler, state, true);
                i13 = i12 + iY2;
                i14 = i11 + iY2;
                iY = z(i13, recycler, state, false);
            } else {
                int iZ = z(i12, recycler, state, true);
                i13 = i12 + iZ;
                i14 = i11 + iZ;
                iY = y(i14, recycler, state, false);
            }
            i12 = i13 + iY;
            i11 = i14 + iY;
        }
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i27 = 0;
            int decoratedMeasurement = 0;
            int decoratedMeasurement2 = 0;
            while (i27 < size) {
                RecyclerView.ViewHolder viewHolder = scrapList.get(i27);
                if (!viewHolder.isRemoved()) {
                    if ((viewHolder.getLayoutPosition() < position ? z14 : false) != this.f22701v) {
                        decoratedMeasurement += this.f22698s.getDecoratedMeasurement(viewHolder.itemView);
                    } else {
                        decoratedMeasurement2 += this.f22698s.getDecoratedMeasurement(viewHolder.itemView);
                    }
                }
                i27++;
                z14 = true;
            }
            this.f22697r.f22724k = scrapList;
            if (decoratedMeasurement > 0) {
                K(getPosition(B()), i12);
                b bVar13 = this.f22697r;
                bVar13.f22721h = decoratedMeasurement;
                bVar13.f22716c = 0;
                bVar13.a(null);
                s(recycler, this.f22697r, state, false);
            }
            if (decoratedMeasurement2 > 0) {
                J(getPosition(A()), i11);
                b bVar14 = this.f22697r;
                bVar14.f22721h = decoratedMeasurement2;
                bVar14.f22716c = 0;
                bVar14.a(null);
                s(recycler, this.f22697r, state, false);
            }
            this.f22697r.f22724k = null;
        }
        if (state.isPreLayout()) {
            aVar.d();
        } else {
            this.f22698s.onLayoutComplete();
        }
        this.f22699t = this.f22702w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.B = null;
        this.f22704y = -1;
        this.f22705z = Integer.MIN_VALUE;
        this.C.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.B = savedState;
            if (this.f22704y != -1) {
                savedState.f22706p0 = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.B;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            r();
            boolean z10 = this.f22699t ^ this.f22701v;
            savedState2.f22708r0 = z10;
            if (z10) {
                View viewA = A();
                savedState2.f22707q0 = this.f22698s.getEndAfterPadding() - this.f22698s.getDecoratedEnd(viewA);
                savedState2.f22706p0 = getPosition(viewA);
            } else {
                View viewB = B();
                savedState2.f22706p0 = getPosition(viewB);
                savedState2.f22707q0 = this.f22698s.getDecoratedStart(viewB) - this.f22698s.getStartAfterPadding();
            }
        } else {
            savedState2.f22706p0 = -1;
        }
        return savedState2;
    }

    public final int p(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        r();
        return w.c(state, this.f22698s, u(!this.f22703x), t(!this.f22703x), this, this.f22703x);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i10, int i11) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        r();
        G();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b10 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.f22701v) {
            if (b10 == 1) {
                scrollToPositionWithOffset(position2, this.f22698s.getEndAfterPadding() - (this.f22698s.getDecoratedMeasurement(view) + this.f22698s.getDecoratedStart(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.f22698s.getEndAfterPadding() - this.f22698s.getDecoratedEnd(view2));
                return;
            }
        }
        if (b10 == -1) {
            scrollToPositionWithOffset(position2, this.f22698s.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, this.f22698s.getDecoratedEnd(view2) - this.f22698s.getDecoratedMeasurement(view));
        }
    }

    public final int q(int i10) {
        if (i10 == 1) {
            return (this.f22696q != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f22696q != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f22696q == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f22696q == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f22696q == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f22696q == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void r() {
        if (this.f22697r == null) {
            b bVar = new b();
            bVar.f22714a = true;
            bVar.f22721h = 0;
            bVar.f22722i = 0;
            bVar.f22724k = null;
            this.f22697r = bVar;
        }
    }

    public final int s(RecyclerView.Recycler recycler, b bVar, RecyclerView.State state, boolean z10) {
        int i10;
        int i11 = bVar.f22716c;
        int i12 = bVar.f22720g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                bVar.f22720g = i12 + i11;
            }
            E(recycler, bVar);
        }
        int i13 = bVar.f22716c + bVar.f22721h;
        while (true) {
            if ((!bVar.f22725l && i13 <= 0) || (i10 = bVar.f22717d) < 0 || i10 >= state.getItemCount()) {
                break;
            }
            LayoutChunkResult layoutChunkResult = this.D;
            layoutChunkResult.mConsumed = 0;
            layoutChunkResult.mFinished = false;
            layoutChunkResult.mIgnoreConsumed = false;
            layoutChunkResult.mFocusable = false;
            C(recycler, state, bVar, layoutChunkResult);
            if (!layoutChunkResult.mFinished) {
                bVar.f22715b = (layoutChunkResult.mConsumed * bVar.f22719f) + bVar.f22715b;
                if (!layoutChunkResult.mIgnoreConsumed || bVar.f22724k != null || !state.isPreLayout()) {
                    int i14 = bVar.f22716c;
                    int i15 = layoutChunkResult.mConsumed;
                    bVar.f22716c = i14 - i15;
                    i13 -= i15;
                }
                int i16 = bVar.f22720g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + layoutChunkResult.mConsumed;
                    bVar.f22720g = i17;
                    int i18 = bVar.f22716c;
                    if (i18 < 0) {
                        bVar.f22720g = i17 + i18;
                    }
                    E(recycler, bVar);
                }
                if (z10 && layoutChunkResult.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - bVar.f22716c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f22696q == 1) {
            return 0;
        }
        return H(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.f22704y = i10;
        this.f22705z = Integer.MIN_VALUE;
        SavedState savedState = this.B;
        if (savedState != null) {
            savedState.f22706p0 = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.f22704y = i10;
        this.f22705z = i11;
        SavedState savedState = this.B;
        if (savedState != null) {
            savedState.f22706p0 = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f22696q == 0) {
            return 0;
        }
        return H(i10, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.E = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(g0.c("invalid orientation:", i10));
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f22696q || this.f22698s == null) {
            OrientationHelper orientationHelperCreateOrientationHelper = OrientationHelper.createOrientationHelper(this, i10);
            this.f22698s = orientationHelperCreateOrientationHelper;
            this.C.f22709a = orientationHelperCreateOrientationHelper;
            this.f22696q = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.A = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.f22700u) {
            return;
        }
        this.f22700u = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.f22703x = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.f22702w == z10) {
            return;
        }
        this.f22702w = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.B == null && this.f22699t == this.f22702w;
    }

    public final View t(boolean z10) {
        return this.f22701v ? w(0, getChildCount(), z10, true) : w(getChildCount() - 1, -1, z10, true);
    }

    public final View u(boolean z10) {
        return this.f22701v ? w(getChildCount() - 1, -1, z10, true) : w(0, getChildCount(), z10, true);
    }

    public final View v(int i10, int i11) {
        int i12;
        int i13;
        r();
        if (i11 <= i10 && i11 >= i10) {
            return getChildAt(i10);
        }
        if (this.f22698s.getDecoratedStart(getChildAt(i10)) < this.f22698s.getStartAfterPadding()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        return this.f22696q == 0 ? this.f22781c.a(i10, i11, i12, i13) : this.f22782d.a(i10, i11, i12, i13);
    }

    public final View w(int i10, int i11, boolean z10, boolean z11) {
        r();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f22696q == 0 ? this.f22781c.a(i10, i11, i12, i13) : this.f22782d.a(i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View x(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10, boolean z11) {
        int i10;
        int childCount;
        int i11;
        r();
        int childCount2 = getChildCount();
        if (z11) {
            childCount = getChildCount() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = childCount2;
            childCount = 0;
            i11 = 1;
        }
        int itemCount = state.getItemCount();
        int startAfterPadding = this.f22698s.getStartAfterPadding();
        int endAfterPadding = this.f22698s.getEndAfterPadding();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i10) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int decoratedStart = this.f22698s.getDecoratedStart(childAt);
            int decoratedEnd = this.f22698s.getDecoratedEnd(childAt);
            if (position >= 0 && position < itemCount) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    boolean z12 = decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding;
                    boolean z13 = decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding;
                    if (!z12 && !z13) {
                        return childAt;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z12) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int y(int i10, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10) {
        int endAfterPadding;
        int endAfterPadding2 = this.f22698s.getEndAfterPadding() - i10;
        if (endAfterPadding2 <= 0) {
            return 0;
        }
        int i11 = -H(-endAfterPadding2, recycler, state);
        int i12 = i10 + i11;
        if (!z10 || (endAfterPadding = this.f22698s.getEndAfterPadding() - i12) <= 0) {
            return i11;
        }
        this.f22698s.offsetChildren(endAfterPadding);
        return endAfterPadding + i11;
    }

    public final int z(int i10, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10) {
        int startAfterPadding;
        int startAfterPadding2 = i10 - this.f22698s.getStartAfterPadding();
        if (startAfterPadding2 <= 0) {
            return 0;
        }
        int i11 = -H(startAfterPadding2, recycler, state);
        int i12 = i10 + i11;
        if (!z10 || (startAfterPadding = i12 - this.f22698s.getStartAfterPadding()) <= 0) {
            return i11;
        }
        this.f22698s.offsetChildren(-startAfterPadding);
        return i11 - startAfterPadding;
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.f22696q = 1;
        this.f22700u = false;
        this.f22701v = false;
        this.f22702w = false;
        this.f22703x = true;
        this.f22704y = -1;
        this.f22705z = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new LayoutChunkResult();
        this.E = 2;
        this.F = new int[2];
        setOrientation(i10);
        setReverseLayout(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f22696q = 1;
        this.f22700u = false;
        this.f22701v = false;
        this.f22702w = false;
        this.f22703x = true;
        this.f22704y = -1;
        this.f22705z = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new LayoutChunkResult();
        this.E = 2;
        this.F = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
    }

    public void D(RecyclerView.Recycler recycler, RecyclerView.State state, a aVar, int i10) {
    }
}
