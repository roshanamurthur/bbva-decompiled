package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final int DEFAULT_SPAN_COUNT = -1;
    public boolean G;
    public int H;
    public int[] I;
    public View[] J;
    public final SparseIntArray K;
    public final SparseIntArray L;
    public SpanSizeLookup M;
    public final Rect N;
    public boolean O;

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i10) {
            return 1;
        }
    }

    public static abstract class SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f22643a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseIntArray f22644b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22645c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22646d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public final int b(int i10, int i11) {
            if (!this.f22646d) {
                return getSpanGroupIndex(i10, i11);
            }
            SparseIntArray sparseIntArray = this.f22644b;
            int i12 = sparseIntArray.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int spanGroupIndex = getSpanGroupIndex(i10, i11);
            sparseIntArray.put(i10, spanGroupIndex);
            return spanGroupIndex;
        }

        public final int c(int i10, int i11) {
            if (!this.f22645c) {
                return getSpanIndex(i10, i11);
            }
            SparseIntArray sparseIntArray = this.f22643a;
            int i12 = sparseIntArray.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int spanIndex = getSpanIndex(i10, i11);
            sparseIntArray.put(i10, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i10, int i11) {
            int i12;
            int spanSize;
            int i13;
            SparseIntArray sparseIntArray;
            int iA;
            if (!this.f22646d || (iA = a((sparseIntArray = this.f22644b), i10)) == -1) {
                i12 = 0;
                spanSize = 0;
                i13 = 0;
            } else {
                i12 = sparseIntArray.get(iA);
                i13 = iA + 1;
                spanSize = getSpanSize(iA) + c(iA, i11);
                if (spanSize == i11) {
                    i12++;
                    spanSize = 0;
                }
            }
            int spanSize2 = getSpanSize(i10);
            while (i13 < i10) {
                int spanSize3 = getSpanSize(i13);
                spanSize += spanSize3;
                if (spanSize == i11) {
                    i12++;
                    spanSize = 0;
                } else if (spanSize > i11) {
                    i12++;
                    spanSize = spanSize3;
                }
                i13++;
            }
            return spanSize + spanSize2 > i11 ? i12 + 1 : i12;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0022  */
        /* JADX WARN: Code duplicated, block: B:14:0x0029  */
        /* JADX WARN: Code duplicated, block: B:15:0x002b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:17:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002b -> B:17:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:17:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f22645c
                if (r2 == 0) goto L1e
                android.util.SparseIntArray r2 = r5.f22643a
                int r3 = a(r2, r6)
                if (r3 < 0) goto L1e
                int r2 = r2.get(r3)
                int r4 = r5.getSpanSize(r3)
                int r4 = r4 + r2
                goto L2e
            L1e:
                r3 = r1
                r4 = r3
            L20:
                if (r3 >= r6) goto L31
                int r2 = r5.getSpanSize(r3)
                int r4 = r4 + r2
                if (r4 != r7) goto L2b
                r4 = r1
                goto L2e
            L2b:
                if (r4 <= r7) goto L2e
                r4 = r2
            L2e:
                int r3 = r3 + 1
                goto L20
            L31:
                int r0 = r0 + r4
                if (r0 > r7) goto L35
                return r4
            L35:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i10);

        public void invalidateSpanGroupIndexCache() {
            this.f22644b.clear();
        }

        public void invalidateSpanIndexCache() {
            this.f22643a.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.f22646d;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.f22645c;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.f22644b.clear();
            }
            this.f22646d = z10;
        }

        public void setSpanIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.f22644b.clear();
            }
            this.f22645c = z10;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new DefaultSpanSizeLookup();
        this.N = new Rect();
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i10, i11).spanCount);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.b bVar, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int decoratedMeasurementInOther;
        int decoratedMeasurementInOther2;
        int i17;
        int decoratedMeasurementInOther3;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z10;
        int i18;
        View viewB;
        int modeInOther = this.f22698s.getModeInOther();
        boolean z11 = modeInOther != 1073741824;
        int i19 = getChildCount() > 0 ? this.I[this.H] : 0;
        if (z11) {
            U();
        }
        boolean z12 = bVar.f22718e == 1;
        int iR = this.H;
        if (!z12) {
            iR = R(bVar.f22717d, recycler, state) + S(bVar.f22717d, recycler, state);
        }
        int i20 = 0;
        while (i20 < this.H && (i18 = bVar.f22717d) >= 0 && i18 < state.getItemCount() && iR > 0) {
            int i21 = bVar.f22717d;
            int iS = S(i21, recycler, state);
            if (iS > this.H) {
                throw new IllegalArgumentException(androidx.appcompat.widget.a.c(androidx.collection.h.e("Item at position ", i21, " requires ", iS, " spans but GridLayoutManager has only "), this.H, " spans."));
            }
            iR -= iS;
            if (iR < 0 || (viewB = bVar.b(recycler)) == null) {
                break;
            }
            this.J[i20] = viewB;
            i20++;
        }
        if (i20 == 0) {
            layoutChunkResult.mFinished = true;
            return;
        }
        if (z12) {
            i12 = 1;
            i11 = i20;
            i10 = 0;
        } else {
            i10 = i20 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i22 = 0;
        while (i10 != i11) {
            View view = this.J[i10];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iS2 = S(getPosition(view), recycler, state);
            layoutParams.f22642f = iS2;
            layoutParams.f22641e = i22;
            i22 += iS2;
            i10 += i12;
        }
        float f6 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < i20; i24++) {
            View view2 = this.J[i24];
            if (bVar.f22724k != null) {
                z10 = false;
                if (z12) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z12) {
                addView(view2);
                z10 = false;
            } else {
                z10 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.N);
            T(view2, modeInOther, z10);
            int decoratedMeasurement = this.f22698s.getDecoratedMeasurement(view2);
            if (decoratedMeasurement > i23) {
                i23 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther4 = (this.f22698s.getDecoratedMeasurementInOther(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).f22642f;
            if (decoratedMeasurementInOther4 > f6) {
                f6 = decoratedMeasurementInOther4;
            }
        }
        if (z11) {
            L(Math.max(Math.round(f6 * this.H), i19));
            i23 = 0;
            for (int i25 = 0; i25 < i20; i25++) {
                View view3 = this.J[i25];
                T(view3, 1073741824, true);
                int decoratedMeasurement2 = this.f22698s.getDecoratedMeasurement(view3);
                if (decoratedMeasurement2 > i23) {
                    i23 = decoratedMeasurement2;
                }
            }
        }
        for (int i26 = 0; i26 < i20; i26++) {
            View view4 = this.J[i26];
            if (this.f22698s.getDecoratedMeasurement(view4) != i23) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.f22797b;
                int i27 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i28 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iP = P(layoutParams2.f22641e, layoutParams2.f22642f);
                if (this.f22696q == 1) {
                    childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(iP, 1073741824, i28, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i27, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i28, 1073741824);
                    childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(iP, 1073741824, i27, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (l(view4, childMeasureSpec2, childMeasureSpec, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        int i29 = 0;
        layoutChunkResult.mConsumed = i23;
        if (this.f22696q != 1) {
            if (bVar.f22719f == -1) {
                int i30 = bVar.f22715b;
                i14 = i30 - i23;
                i13 = i30;
            } else {
                int i31 = bVar.f22715b;
                i13 = i31 + i23;
                i14 = i31;
            }
            i15 = 0;
            i16 = 0;
        } else if (bVar.f22719f == -1) {
            i16 = bVar.f22715b;
            i15 = i16 - i23;
            i14 = 0;
            i13 = 0;
        } else {
            int i32 = bVar.f22715b;
            i15 = i32;
            i13 = 0;
            i16 = i32 + i23;
            i14 = 0;
        }
        while (i29 < i20) {
            View view5 = this.J[i29];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.f22696q != 1) {
                int paddingTop = getPaddingTop() + this.I[layoutParams3.f22641e];
                decoratedMeasurementInOther = i14;
                decoratedMeasurementInOther2 = i13;
                i17 = paddingTop;
                decoratedMeasurementInOther3 = this.f22698s.getDecoratedMeasurementInOther(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                int paddingLeft = getPaddingLeft() + this.I[this.H - layoutParams3.f22641e];
                decoratedMeasurementInOther2 = paddingLeft;
                i17 = i15;
                decoratedMeasurementInOther3 = i16;
                decoratedMeasurementInOther = paddingLeft - this.f22698s.getDecoratedMeasurementInOther(view5);
            } else {
                int paddingLeft2 = getPaddingLeft() + this.I[layoutParams3.f22641e];
                decoratedMeasurementInOther2 = this.f22698s.getDecoratedMeasurementInOther(view5) + paddingLeft2;
                i17 = i15;
                decoratedMeasurementInOther3 = i16;
                decoratedMeasurementInOther = paddingLeft2;
            }
            layoutDecoratedWithMargins(view5, decoratedMeasurementInOther, i17, decoratedMeasurementInOther2, decoratedMeasurementInOther3);
            if (layoutParams3.isItemRemoved() || layoutParams3.isItemChanged()) {
                layoutChunkResult.mIgnoreConsumed = true;
            }
            layoutChunkResult.mFocusable |= view5.hasFocusable();
            i29++;
            i14 = decoratedMeasurementInOther;
            i13 = decoratedMeasurementInOther2;
            i15 = i17;
            i16 = decoratedMeasurementInOther3;
        }
        Arrays.fill(this.J, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.a aVar, int i10) {
        U();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            boolean z10 = i10 == 1;
            int iR = R(aVar.f22710b, recycler, state);
            if (z10) {
                while (iR > 0) {
                    int i11 = aVar.f22710b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f22710b = i12;
                    iR = R(i12, recycler, state);
                }
            } else {
                int itemCount = state.getItemCount() - 1;
                int i13 = aVar.f22710b;
                while (i13 < itemCount) {
                    int i14 = i13 + 1;
                    int iR2 = R(i14, recycler, state);
                    if (iR2 <= iR) {
                        break;
                    }
                    i13 = i14;
                    iR = iR2;
                }
                aVar.f22710b = i13;
            }
        }
        O();
    }

    public final void L(int i10) {
        int i11;
        int[] iArr = this.I;
        int i12 = this.H;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.I = iArr;
    }

    public final int M(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            r();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            boolean z10 = !zIsSmoothScrollbarEnabled;
            View viewU = u(z10);
            View viewT = t(z10);
            if (viewU != null && viewT != null) {
                int iB = this.M.b(getPosition(viewU), this.H);
                int iB2 = this.M.b(getPosition(viewT), this.H);
                int iMax = this.f22701v ? Math.max(0, ((this.M.b(state.getItemCount() - 1, this.H) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.f22698s.getDecoratedEnd(viewT) - this.f22698s.getDecoratedStart(viewU)) / ((this.M.b(getPosition(viewT), this.H) - this.M.b(getPosition(viewU), this.H)) + 1))) + (this.f22698s.getStartAfterPadding() - this.f22698s.getDecoratedStart(viewU)));
                }
                return iMax;
            }
        }
        return 0;
    }

    public final int N(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            r();
            View viewU = u(!isSmoothScrollbarEnabled());
            View viewT = t(!isSmoothScrollbarEnabled());
            if (viewU != null && viewT != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.M.b(state.getItemCount() - 1, this.H) + 1;
                }
                return (int) (((this.f22698s.getDecoratedEnd(viewT) - this.f22698s.getDecoratedStart(viewU)) / ((this.M.b(getPosition(viewT), this.H) - this.M.b(getPosition(viewU), this.H)) + 1)) * (this.M.b(state.getItemCount() - 1, this.H) + 1));
            }
        }
        return 0;
    }

    public final void O() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    public final int P(int i10, int i11) {
        if (this.f22696q != 1 || !isLayoutRTL()) {
            int[] iArr = this.I;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.I;
        int i12 = this.H;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int Q(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.isPreLayout()) {
            return this.M.b(i10, this.H);
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i10);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.M.b(iConvertPreLayoutPositionToPostLayout, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int R(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.isPreLayout()) {
            return this.M.c(i10, this.H);
        }
        int i11 = this.L.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i10);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.M.c(iConvertPreLayoutPositionToPostLayout, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int S(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!state.isPreLayout()) {
            return this.M.getSpanSize(i10);
        }
        int i11 = this.K.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i10);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.M.getSpanSize(iConvertPreLayoutPositionToPostLayout);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public final void T(View view, int i10, boolean z10) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f22797b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iP = P(layoutParams.f22641e, layoutParams.f22642f);
        if (this.f22696q == 1) {
            childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(iP, i10, i12, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(this.f22698s.getTotalSpace(), getHeightMode(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.LayoutManager.getChildMeasureSpec(iP, i10, i11, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.LayoutManager.getChildMeasureSpec(this.f22698s.getTotalSpace(), getWidthMode(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z10 ? l(view, childMeasureSpec2, childMeasureSpec, layoutParams2) : j(view, childMeasureSpec2, childMeasureSpec, layoutParams2)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void U() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        L(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.O ? M(state) : super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.O ? N(state) : super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.O ? M(state) : super.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.O ? N(state) : super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f22696q == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f22696q == 1) {
            return this.H;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return Q(state.getItemCount() - 1, recycler, state) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f22696q == 0) {
            return this.H;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return Q(state.getItemCount() - 1, recycler, state) + 1;
    }

    public int getSpanCount() {
        return this.H;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.M;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.O;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void m(RecyclerView.State state, LinearLayoutManager.b bVar, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i10;
        int spanSize = this.H;
        for (int i11 = 0; i11 < this.H && (i10 = bVar.f22717d) >= 0 && i10 < state.getItemCount() && spanSize > 0; i11++) {
            int i12 = bVar.f22717d;
            layoutPrefetchRegistry.addPosition(i12, Math.max(0, bVar.f22720g));
            spanSize -= this.M.getSpanSize(i12);
            bVar.f22717d += bVar.f22718e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            c(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iQ = Q(layoutParams2.getViewLayoutPosition(), recycler, state);
        if (this.f22696q == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), iQ, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(iQ, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        this.M.invalidateSpanIndexCache();
        this.M.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.M.invalidateSpanIndexCache();
        this.M.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.M.invalidateSpanIndexCache();
        this.M.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        this.M.invalidateSpanIndexCache();
        this.M.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.M.invalidateSpanIndexCache();
        this.M.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean zIsPreLayout = state.isPreLayout();
        SparseIntArray sparseIntArray = this.L;
        SparseIntArray sparseIntArray2 = this.K;
        if (zIsPreLayout) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i10).getLayoutParams();
                int viewLayoutPosition = layoutParams.getViewLayoutPosition();
                sparseIntArray2.put(viewLayoutPosition, layoutParams.getSpanSize());
                sparseIntArray.put(viewLayoutPosition, layoutParams.getSpanIndex());
            }
        }
        super.onLayoutChildren(recycler, state);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.G = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        U();
        O();
        return super.scrollHorizontallyBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        U();
        O();
        return super.scrollVerticallyBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        if (this.I == null) {
            super.setMeasuredDimension(rect, i10, i11);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f22696q == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.I;
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i10, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.I;
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i11, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setSpanCount(int i10) {
        if (i10 == this.H) {
            return;
        }
        this.G = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(g0.c("Span count should be at least 1. Provided ", i10));
        }
        this.H = i10;
        this.M.invalidateSpanIndexCache();
        requestLayout();
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.M = spanSizeLookup;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z10) {
        this.O = z10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.B == null && !this.G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View x(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10, boolean z11) {
        int i10;
        int childCount;
        int childCount2 = getChildCount();
        int i11 = 1;
        if (z11) {
            childCount = getChildCount() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = childCount2;
            childCount = 0;
        }
        int itemCount = state.getItemCount();
        r();
        int startAfterPadding = this.f22698s.getStartAfterPadding();
        int endAfterPadding = this.f22698s.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (childCount != i10) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && R(position, recycler, state) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f22698s.getDecoratedStart(childAt) < endAfterPadding && this.f22698s.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22642f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22641e = -1;
            this.f22642f = 0;
        }

        public int getSpanIndex() {
            return this.f22641e;
        }

        public int getSpanSize() {
            return this.f22642f;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f22641e = -1;
            this.f22642f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22641e = -1;
            this.f22642f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22641e = -1;
            this.f22642f = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22641e = -1;
            this.f22642f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new DefaultSpanSizeLookup();
        this.N = new Rect();
        setSpanCount(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new DefaultSpanSizeLookup();
        this.N = new Rect();
        setSpanCount(i10);
    }
}
