package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public boolean E;
    public boolean F;
    public SavedState G;
    public int H;
    public int[] M;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c[] f22888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public OrientationHelper f22889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public OrientationHelper f22890t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22891u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22892v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final n f22893w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public BitSet f22896z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22887q = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22894x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f22895y = false;
    public int A = -1;
    public int B = Integer.MIN_VALUE;
    public final LazySpanLookup C = new LazySpanLookup();
    public int D = 2;
    public final Rect I = new Rect();
    public final b J = new b();
    public boolean K = false;
    public final boolean L = true;
    public final a N = new a();

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f22897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22898f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int getSpanIndex() {
            c cVar = this.f22897e;
            if (cVar == null) {
                return -1;
            }
            return cVar.f22926e;
        }

        public boolean isFullSpan() {
            return this.f22898f;
        }

        public void setFullSpan(boolean z10) {
            this.f22898f = z10;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f22899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<FullSpanItem> f22900b;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f22901p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f22902q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int[] f22903r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public boolean f22904s0;

            public class a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    FullSpanItem fullSpanItem = new FullSpanItem();
                    fullSpanItem.f22901p0 = parcel.readInt();
                    fullSpanItem.f22902q0 = parcel.readInt();
                    fullSpanItem.f22904s0 = parcel.readInt() == 1;
                    int i10 = parcel.readInt();
                    if (i10 > 0) {
                        int[] iArr = new int[i10];
                        fullSpanItem.f22903r0 = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return fullSpanItem;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f22901p0 + ", mGapDir=" + this.f22902q0 + ", mHasUnwantedGapAfter=" + this.f22904s0 + ", mGapPerSpan=" + Arrays.toString(this.f22903r0) + AbstractJsonLexerKt.END_OBJ;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f22901p0);
                parcel.writeInt(this.f22902q0);
                parcel.writeInt(this.f22904s0 ? 1 : 0);
                int[] iArr = this.f22903r0;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f22903r0);
                }
            }
        }

        public final void a(FullSpanItem fullSpanItem) {
            if (this.f22900b == null) {
                this.f22900b = new ArrayList();
            }
            int size = this.f22900b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f22900b.get(i10);
                if (fullSpanItem2.f22901p0 == fullSpanItem.f22901p0) {
                    this.f22900b.remove(i10);
                }
                if (fullSpanItem2.f22901p0 >= fullSpanItem.f22901p0) {
                    this.f22900b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f22900b.add(fullSpanItem);
        }

        public final void b() {
            int[] iArr = this.f22899a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f22900b = null;
        }

        public final void c(int i10) {
            int[] iArr = this.f22899a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f22899a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f22899a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f22899a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void d(int i10) {
            List<FullSpanItem> list = this.f22900b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f22900b.get(size).f22901p0 >= i10) {
                        this.f22900b.remove(size);
                    }
                }
            }
            g(i10);
        }

        public final FullSpanItem e(int i10, int i11, int i12) {
            List<FullSpanItem> list = this.f22900b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f22900b.get(i13);
                int i14 = fullSpanItem.f22901p0;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f22902q0 == i12 || fullSpanItem.f22904s0)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.f22900b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f22900b.get(size);
                if (fullSpanItem.f22901p0 == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x000e  */
        public final int g(int i10) {
            int i11;
            int[] iArr = this.f22899a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            if (this.f22900b != null) {
                FullSpanItem fullSpanItemF = f(i10);
                if (fullSpanItemF != null) {
                    this.f22900b.remove(fullSpanItemF);
                }
                int size = this.f22900b.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        i12 = -1;
                        break;
                    }
                    if (this.f22900b.get(i12).f22901p0 >= i10) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1) {
                    FullSpanItem fullSpanItem = this.f22900b.get(i12);
                    this.f22900b.remove(i12);
                    i11 = fullSpanItem.f22901p0;
                } else {
                    i11 = -1;
                }
            } else {
                i11 = -1;
            }
            if (i11 == -1) {
                int[] iArr2 = this.f22899a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f22899a.length;
            }
            int iMin = Math.min(i11 + 1, this.f22899a.length);
            Arrays.fill(this.f22899a, i10, iMin, -1);
            return iMin;
        }

        public final void h(int i10, int i11) {
            int[] iArr = this.f22899a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f22899a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f22899a, i10, i12, -1);
            List<FullSpanItem> list = this.f22900b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f22900b.get(size);
                int i13 = fullSpanItem.f22901p0;
                if (i13 >= i10) {
                    fullSpanItem.f22901p0 = i13 + i11;
                }
            }
        }

        public final void i(int i10, int i11) {
            int[] iArr = this.f22899a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f22899a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f22899a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            List<FullSpanItem> list = this.f22900b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f22900b.get(size);
                int i13 = fullSpanItem.f22901p0;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f22900b.remove(size);
                    } else {
                        fullSpanItem.f22901p0 = i13 - i11;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f22905p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f22906q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f22907r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int[] f22908s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f22909t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int[] f22910u0;
        public List<LazySpanLookup.FullSpanItem> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f22911w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public boolean f22912x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public boolean f22913y0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f22905p0 = parcel.readInt();
                savedState.f22906q0 = parcel.readInt();
                int i10 = parcel.readInt();
                savedState.f22907r0 = i10;
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    savedState.f22908s0 = iArr;
                    parcel.readIntArray(iArr);
                }
                int i11 = parcel.readInt();
                savedState.f22909t0 = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    savedState.f22910u0 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.f22911w0 = parcel.readInt() == 1;
                savedState.f22912x0 = parcel.readInt() == 1;
                savedState.f22913y0 = parcel.readInt() == 1;
                savedState.v0 = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
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
            parcel.writeInt(this.f22905p0);
            parcel.writeInt(this.f22906q0);
            parcel.writeInt(this.f22907r0);
            if (this.f22907r0 > 0) {
                parcel.writeIntArray(this.f22908s0);
            }
            parcel.writeInt(this.f22909t0);
            if (this.f22909t0 > 0) {
                parcel.writeIntArray(this.f22910u0);
            }
            parcel.writeInt(this.f22911w0 ? 1 : 0);
            parcel.writeInt(this.f22912x0 ? 1 : 0);
            parcel.writeInt(this.f22913y0 ? 1 : 0);
            parcel.writeList(this.v0);
        }

        public SavedState(SavedState savedState) {
            this.f22907r0 = savedState.f22907r0;
            this.f22905p0 = savedState.f22905p0;
            this.f22906q0 = savedState.f22906q0;
            this.f22908s0 = savedState.f22908s0;
            this.f22909t0 = savedState.f22909t0;
            this.f22910u0 = savedState.f22910u0;
            this.f22911w0 = savedState.f22911w0;
            this.f22912x0 = savedState.f22912x0;
            this.f22913y0 = savedState.f22913y0;
            this.v0 = savedState.v0;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.n();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f22920f;

        public b() {
            a();
        }

        public final void a() {
            this.f22915a = -1;
            this.f22916b = Integer.MIN_VALUE;
            this.f22917c = false;
            this.f22918d = false;
            this.f22919e = false;
            int[] iArr = this.f22920f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f22922a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22923b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22924c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22925d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f22926e;

        public c(int i10) {
            this.f22926e = i10;
        }

        public final void a(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f22897e = this;
            ArrayList<View> arrayList = this.f22922a;
            arrayList.add(view);
            this.f22924c = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.f22923b = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.f22925d = StaggeredGridLayoutManager.this.f22889s.getDecoratedMeasurement(view) + this.f22925d;
            }
        }

        public final void b() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = (View) androidx.appcompat.view.menu.b.b(this.f22922a, 1);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f22924c = staggeredGridLayoutManager.f22889s.getDecoratedEnd(view);
            if (layoutParams.f22898f && (fullSpanItemF = staggeredGridLayoutManager.C.f(layoutParams.getViewLayoutPosition())) != null && fullSpanItemF.f22902q0 == 1) {
                int i10 = this.f22924c;
                int[] iArr = fullSpanItemF.f22903r0;
                this.f22924c = i10 + (iArr == null ? 0 : iArr[this.f22926e]);
            }
        }

        public final void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = this.f22922a.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f22923b = staggeredGridLayoutManager.f22889s.getDecoratedStart(view);
            if (layoutParams.f22898f && (fullSpanItemF = staggeredGridLayoutManager.C.f(layoutParams.getViewLayoutPosition())) != null && fullSpanItemF.f22902q0 == -1) {
                int i10 = this.f22923b;
                int[] iArr = fullSpanItemF.f22903r0;
                this.f22923b = i10 - (iArr != null ? iArr[this.f22926e] : 0);
            }
        }

        public final void d() {
            this.f22922a.clear();
            this.f22923b = Integer.MIN_VALUE;
            this.f22924c = Integer.MIN_VALUE;
            this.f22925d = 0;
        }

        public final int e() {
            boolean z10 = StaggeredGridLayoutManager.this.f22894x;
            ArrayList<View> arrayList = this.f22922a;
            return z10 ? g(arrayList.size() - 1, -1, false, false, true) : g(0, arrayList.size(), false, false, true);
        }

        public final int f() {
            boolean z10 = StaggeredGridLayoutManager.this.f22894x;
            ArrayList<View> arrayList = this.f22922a;
            return z10 ? g(0, arrayList.size(), false, false, true) : g(arrayList.size() - 1, -1, false, false, true);
        }

        public final int g(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int startAfterPadding = staggeredGridLayoutManager.f22889s.getStartAfterPadding();
            int endAfterPadding = staggeredGridLayoutManager.f22889s.getEndAfterPadding();
            int i12 = i10;
            int i13 = i11 > i12 ? 1 : -1;
            while (i12 != i11) {
                View view = this.f22922a.get(i12);
                int decoratedStart = staggeredGridLayoutManager.f22889s.getDecoratedStart(view);
                int decoratedEnd = staggeredGridLayoutManager.f22889s.getDecoratedEnd(view);
                boolean z13 = false;
                boolean z14 = !z12 ? decoratedStart >= endAfterPadding : decoratedStart > endAfterPadding;
                if (!z12 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                            return staggeredGridLayoutManager.getPosition(view);
                        }
                    } else {
                        if (z11) {
                            return staggeredGridLayoutManager.getPosition(view);
                        }
                        if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                            return staggeredGridLayoutManager.getPosition(view);
                        }
                    }
                }
                i12 += i13;
            }
            return -1;
        }

        public final int h(int i10) {
            int i11 = this.f22924c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f22922a.size() == 0) {
                return i10;
            }
            b();
            return this.f22924c;
        }

        public final View i(int i10, int i11) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f22922a;
            View view = null;
            if (i11 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f22894x && staggeredGridLayoutManager.getPosition(view2) >= i10) || ((!staggeredGridLayoutManager.f22894x && staggeredGridLayoutManager.getPosition(view2) <= i10) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = arrayList.get(i12);
                    if ((staggeredGridLayoutManager.f22894x && staggeredGridLayoutManager.getPosition(view3) <= i10) || ((!staggeredGridLayoutManager.f22894x && staggeredGridLayoutManager.getPosition(view3) >= i10) || !view3.hasFocusable())) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public final int j(int i10) {
            int i11 = this.f22923b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f22922a.size() == 0) {
                return i10;
            }
            c();
            return this.f22923b;
        }

        public final void k() {
            ArrayList<View> arrayList = this.f22922a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            LayoutParams layoutParams = (LayoutParams) viewRemove.getLayoutParams();
            layoutParams.f22897e = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.f22925d -= StaggeredGridLayoutManager.this.f22889s.getDecoratedMeasurement(viewRemove);
            }
            if (size == 1) {
                this.f22923b = Integer.MIN_VALUE;
            }
            this.f22924c = Integer.MIN_VALUE;
        }

        public final void l() {
            ArrayList<View> arrayList = this.f22922a;
            View viewRemove = arrayList.remove(0);
            LayoutParams layoutParams = (LayoutParams) viewRemove.getLayoutParams();
            layoutParams.f22897e = null;
            if (arrayList.size() == 0) {
                this.f22924c = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.f22925d -= StaggeredGridLayoutManager.this.f22889s.getDecoratedMeasurement(viewRemove);
            }
            this.f22923b = Integer.MIN_VALUE;
        }

        public final void m(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f22897e = this;
            ArrayList<View> arrayList = this.f22922a;
            arrayList.add(0, view);
            this.f22923b = Integer.MIN_VALUE;
            if (arrayList.size() == 1) {
                this.f22924c = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.f22925d = StaggeredGridLayoutManager.this.f22889s.getDecoratedMeasurement(view) + this.f22925d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.f22893w = new n();
        this.f22889s = OrientationHelper.createOrientationHelper(this, this.f22891u);
        this.f22890t = OrientationHelper.createOrientationHelper(this, 1 - this.f22891u);
    }

    public static int P(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void A(int i10, int i11, int i12) {
        int i13;
        int i14;
        LazySpanLookup lazySpanLookup;
        int iX;
        int iX2 = this.f22895y ? x() : w();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            lazySpanLookup = this.C;
            lazySpanLookup.g(i14);
            if (i12 != 1) {
                lazySpanLookup.h(i10, i11);
            } else if (i12 != 2) {
                lazySpanLookup.i(i10, i11);
            } else if (i12 == 8) {
                lazySpanLookup.i(i10, 1);
                lazySpanLookup.h(i11, 1);
            }
            if (i13 <= iX2) {
                return;
            }
            if (this.f22895y) {
                iX = w();
            } else {
                iX = x();
            }
            if (i14 <= iX) {
                requestLayout();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        lazySpanLookup = this.C;
        lazySpanLookup.g(i14);
        if (i12 != 1) {
            lazySpanLookup.h(i10, i11);
        } else if (i12 != 2) {
            lazySpanLookup.i(i10, i11);
        } else if (i12 == 8) {
            lazySpanLookup.i(i10, 1);
            lazySpanLookup.h(i11, 1);
        }
        if (i13 <= iX2) {
            return;
        }
        if (this.f22895y) {
            iX = w();
        } else {
            iX = x();
        }
        if (i14 <= iX) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb A[SYNTHETIC] */
    public final View B() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int childCount = getChildCount();
        int i11 = childCount - 1;
        BitSet bitSet = new BitSet(this.f22887q);
        bitSet.set(0, this.f22887q, true);
        byte b10 = (this.f22891u == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f22895y) {
            childCount = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < childCount ? 1 : -1;
        while (i11 != childCount) {
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (bitSet.get(layoutParams.f22897e.f22926e)) {
                c cVar = layoutParams.f22897e;
                if (this.f22895y) {
                    int i13 = cVar.f22924c;
                    if (i13 == Integer.MIN_VALUE) {
                        cVar.b();
                        i13 = cVar.f22924c;
                    }
                    if (i13 < this.f22889s.getEndAfterPadding()) {
                        z12 = ((LayoutParams) ((View) androidx.appcompat.view.menu.b.b(cVar.f22922a, 1)).getLayoutParams()).f22898f;
                        if (!z12) {
                            return childAt;
                        }
                    }
                } else {
                    int i14 = cVar.f22923b;
                    if (i14 == Integer.MIN_VALUE) {
                        cVar.c();
                        i14 = cVar.f22923b;
                    }
                    if (i14 > this.f22889s.getStartAfterPadding()) {
                        z12 = ((LayoutParams) cVar.f22922a.get(0).getLayoutParams()).f22898f;
                        if (!z12) {
                            return childAt;
                        }
                    }
                }
                bitSet.clear(layoutParams.f22897e.f22926e);
            }
            if (!layoutParams.f22898f && (i10 = i11 + i12) != childCount) {
                View childAt2 = getChildAt(i10);
                if (this.f22895y) {
                    int decoratedEnd = this.f22889s.getDecoratedEnd(childAt);
                    int decoratedEnd2 = this.f22889s.getDecoratedEnd(childAt2);
                    if (decoratedEnd < decoratedEnd2) {
                        return childAt;
                    }
                    if (decoratedEnd == decoratedEnd2) {
                        if (layoutParams.f22897e.f22926e - ((LayoutParams) childAt2.getLayoutParams()).f22897e.f22926e < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 != z11) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int decoratedStart = this.f22889s.getDecoratedStart(childAt);
                    int decoratedStart2 = this.f22889s.getDecoratedStart(childAt2);
                    if (decoratedStart > decoratedStart2) {
                        return childAt;
                    }
                    if (decoratedStart == decoratedStart2) {
                        if (layoutParams.f22897e.f22926e - ((LayoutParams) childAt2.getLayoutParams()).f22897e.f22926e < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 != z11) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i11 += i12;
        }
        return null;
    }

    public final void C(View view, int i10, int i11) {
        Rect rect = this.I;
        calculateItemDecorationsForChild(view, rect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iP = P(i10, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int iP2 = P(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (j(view, iP, iP2, layoutParams)) {
            view.measure(iP, iP2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01df  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:246:0x040e  */
    /* JADX WARN: Code duplicated, block: B:258:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x01dd A[SYNTHETIC] */
    public final void D(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10) {
        boolean z11;
        SavedState savedState;
        int childCount;
        int i10;
        int position;
        int position2;
        int childCount2;
        int i11;
        SavedState savedState2 = this.G;
        b bVar = this.J;
        if (!(savedState2 == null && this.A == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            bVar.a();
            return;
        }
        boolean z12 = (bVar.f22919e && this.A == -1 && this.G == null) ? false : true;
        LazySpanLookup lazySpanLookup = this.C;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        if (z12) {
            bVar.a();
            SavedState savedState3 = this.G;
            if (savedState3 != null) {
                int i12 = savedState3.f22907r0;
                if (i12 > 0) {
                    if (i12 == this.f22887q) {
                        for (int i13 = 0; i13 < this.f22887q; i13++) {
                            this.f22888r[i13].d();
                            SavedState savedState4 = this.G;
                            int endAfterPadding = savedState4.f22908s0[i13];
                            if (endAfterPadding != Integer.MIN_VALUE) {
                                endAfterPadding += savedState4.f22912x0 ? this.f22889s.getEndAfterPadding() : this.f22889s.getStartAfterPadding();
                            }
                            c cVar = this.f22888r[i13];
                            cVar.f22923b = endAfterPadding;
                            cVar.f22924c = endAfterPadding;
                        }
                    } else {
                        savedState3.f22908s0 = null;
                        savedState3.f22907r0 = 0;
                        savedState3.f22909t0 = 0;
                        savedState3.f22910u0 = null;
                        savedState3.v0 = null;
                        savedState3.f22905p0 = savedState3.f22906q0;
                    }
                }
                SavedState savedState5 = this.G;
                this.F = savedState5.f22913y0;
                setReverseLayout(savedState5.f22911w0);
                J();
                SavedState savedState6 = this.G;
                int i14 = savedState6.f22905p0;
                if (i14 != -1) {
                    this.A = i14;
                    bVar.f22917c = savedState6.f22912x0;
                } else {
                    bVar.f22917c = this.f22895y;
                }
                if (savedState6.f22909t0 > 1) {
                    lazySpanLookup.f22899a = savedState6.f22910u0;
                    lazySpanLookup.f22900b = savedState6.v0;
                }
            } else {
                J();
                bVar.f22917c = this.f22895y;
            }
            if (state.isPreLayout() || (i11 = this.A) == -1) {
                if (this.E) {
                    int itemCount = state.getItemCount();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < itemCount) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int itemCount2 = state.getItemCount();
                    childCount = getChildCount();
                    i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i10));
                        if (position < 0 && position < itemCount2) {
                            position2 = position;
                            break;
                        }
                        i10++;
                    }
                }
                bVar.f22915a = position2;
                bVar.f22916b = Integer.MIN_VALUE;
            } else if (i11 < 0 || i11 >= state.getItemCount()) {
                this.A = -1;
                this.B = Integer.MIN_VALUE;
                if (this.E) {
                    int itemCount3 = state.getItemCount();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        } else {
                            position2 = getPosition(getChildAt(childCount2));
                            if (position2 < 0) {
                            }
                            childCount2--;
                        }
                    }
                } else {
                    int itemCount4 = state.getItemCount();
                    childCount = getChildCount();
                    i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            position2 = 0;
                            break;
                        } else {
                            position = getPosition(getChildAt(i10));
                            if (position < 0) {
                            }
                            i10++;
                        }
                    }
                }
                bVar.f22915a = position2;
                bVar.f22916b = Integer.MIN_VALUE;
            } else {
                SavedState savedState7 = this.G;
                if (savedState7 == null || savedState7.f22905p0 == -1 || savedState7.f22907r0 < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.A);
                    if (viewFindViewByPosition != null) {
                        bVar.f22915a = this.f22895y ? x() : w();
                        if (this.B != Integer.MIN_VALUE) {
                            if (bVar.f22917c) {
                                bVar.f22916b = (this.f22889s.getEndAfterPadding() - this.B) - this.f22889s.getDecoratedEnd(viewFindViewByPosition);
                            } else {
                                bVar.f22916b = (this.f22889s.getStartAfterPadding() + this.B) - this.f22889s.getDecoratedStart(viewFindViewByPosition);
                            }
                        } else if (this.f22889s.getDecoratedMeasurement(viewFindViewByPosition) > this.f22889s.getTotalSpace()) {
                            bVar.f22916b = bVar.f22917c ? this.f22889s.getEndAfterPadding() : this.f22889s.getStartAfterPadding();
                        } else {
                            int decoratedStart = this.f22889s.getDecoratedStart(viewFindViewByPosition) - this.f22889s.getStartAfterPadding();
                            if (decoratedStart < 0) {
                                bVar.f22916b = -decoratedStart;
                            } else {
                                int endAfterPadding2 = this.f22889s.getEndAfterPadding() - this.f22889s.getDecoratedEnd(viewFindViewByPosition);
                                if (endAfterPadding2 < 0) {
                                    bVar.f22916b = endAfterPadding2;
                                } else {
                                    bVar.f22916b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i15 = this.A;
                        bVar.f22915a = i15;
                        int i16 = this.B;
                        if (i16 == Integer.MIN_VALUE) {
                            boolean z13 = m(i15) == 1;
                            bVar.f22917c = z13;
                            bVar.f22916b = z13 ? staggeredGridLayoutManager.f22889s.getEndAfterPadding() : staggeredGridLayoutManager.f22889s.getStartAfterPadding();
                        } else if (bVar.f22917c) {
                            bVar.f22916b = staggeredGridLayoutManager.f22889s.getEndAfterPadding() - i16;
                        } else {
                            bVar.f22916b = staggeredGridLayoutManager.f22889s.getStartAfterPadding() + i16;
                        }
                        bVar.f22918d = true;
                    }
                } else {
                    bVar.f22916b = Integer.MIN_VALUE;
                    bVar.f22915a = this.A;
                }
            }
            bVar.f22919e = true;
        }
        if (this.G == null && this.A == -1 && (bVar.f22917c != this.E || isLayoutRTL() != this.F)) {
            lazySpanLookup.b();
            bVar.f22918d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.G) == null || savedState.f22907r0 < 1)) {
            if (bVar.f22918d) {
                for (int i17 = 0; i17 < this.f22887q; i17++) {
                    this.f22888r[i17].d();
                    int i18 = bVar.f22916b;
                    if (i18 != Integer.MIN_VALUE) {
                        c cVar2 = this.f22888r[i17];
                        cVar2.f22923b = i18;
                        cVar2.f22924c = i18;
                    }
                }
            } else if (z12 || bVar.f22920f == null) {
                for (int i19 = 0; i19 < this.f22887q; i19++) {
                    c cVar3 = this.f22888r[i19];
                    boolean z14 = this.f22895y;
                    int i20 = bVar.f22916b;
                    int iH = z14 ? cVar3.h(Integer.MIN_VALUE) : cVar3.j(Integer.MIN_VALUE);
                    cVar3.d();
                    if (iH != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z14 || iH >= staggeredGridLayoutManager2.f22889s.getEndAfterPadding()) && (z14 || iH <= staggeredGridLayoutManager2.f22889s.getStartAfterPadding())) {
                            if (i20 != Integer.MIN_VALUE) {
                                iH += i20;
                            }
                            cVar3.f22924c = iH;
                            cVar3.f22923b = iH;
                        }
                    }
                }
                c[] cVarArr = this.f22888r;
                int length = cVarArr.length;
                int[] iArr = bVar.f22920f;
                if (iArr == null || iArr.length < length) {
                    bVar.f22920f = new int[staggeredGridLayoutManager.f22888r.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    bVar.f22920f[i21] = cVarArr[i21].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i22 = 0; i22 < this.f22887q; i22++) {
                    c cVar4 = this.f22888r[i22];
                    cVar4.d();
                    int i23 = bVar.f22920f[i22];
                    cVar4.f22923b = i23;
                    cVar4.f22924c = i23;
                }
            }
        }
        detachAndScrapAttachedViews(recycler);
        n nVar = this.f22893w;
        nVar.f23046a = false;
        this.K = false;
        int totalSpace = this.f22890t.getTotalSpace();
        this.f22892v = totalSpace / this.f22887q;
        this.H = View.MeasureSpec.makeMeasureSpec(totalSpace, this.f22890t.getMode());
        N(bVar.f22915a, state);
        if (bVar.f22917c) {
            L(-1);
            r(recycler, nVar, state);
            L(1);
            nVar.f23048c = bVar.f22915a + nVar.f23049d;
            r(recycler, nVar, state);
        } else {
            L(1);
            r(recycler, nVar, state);
            L(-1);
            nVar.f23048c = bVar.f22915a + nVar.f23049d;
            r(recycler, nVar, state);
        }
        if (this.f22890t.getMode() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i24 = 0; i24 < childCount3; i24++) {
                View childAt = getChildAt(i24);
                float decoratedMeasurement = this.f22890t.getDecoratedMeasurement(childAt);
                if (decoratedMeasurement >= fMax) {
                    if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                        decoratedMeasurement = (decoratedMeasurement * 1.0f) / this.f22887q;
                    }
                    fMax = Math.max(fMax, decoratedMeasurement);
                }
            }
            int i25 = this.f22892v;
            int iRound = Math.round(fMax * this.f22887q);
            if (this.f22890t.getMode() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f22890t.getTotalSpace());
            }
            this.f22892v = iRound / this.f22887q;
            this.H = View.MeasureSpec.makeMeasureSpec(iRound, this.f22890t.getMode());
            if (this.f22892v != i25) {
                for (int i26 = 0; i26 < childCount3; i26++) {
                    View childAt2 = getChildAt(i26);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.f22898f) {
                        if (isLayoutRTL() && this.f22891u == 1) {
                            int i27 = -((this.f22887q - 1) - layoutParams.f22897e.f22926e);
                            childAt2.offsetLeftAndRight((this.f22892v * i27) - (i27 * i25));
                        } else {
                            int i28 = layoutParams.f22897e.f22926e;
                            int i29 = this.f22892v * i28;
                            int i30 = i28 * i25;
                            if (this.f22891u == 1) {
                                childAt2.offsetLeftAndRight(i29 - i30);
                            } else {
                                childAt2.offsetTopAndBottom(i29 - i30);
                            }
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f22895y) {
                u(recycler, state, true);
                v(recycler, state, false);
            } else {
                v(recycler, state, true);
                u(recycler, state, false);
            }
        }
        if (z10 && !state.isPreLayout() && this.D != 0 && getChildCount() > 0 && (this.K || B() != null)) {
            removeCallbacks(this.N);
            z11 = n();
        }
        if (state.isPreLayout()) {
            bVar.a();
        }
        this.E = bVar.f22917c;
        this.F = isLayoutRTL();
        if (z11) {
            bVar.a();
            D(recycler, state, false);
        }
    }

    public final boolean E(int i10) {
        if (this.f22891u == 0) {
            return (i10 == -1) != this.f22895y;
        }
        return ((i10 == -1) == this.f22895y) == isLayoutRTL();
    }

    public final void F(int i10, RecyclerView.State state) {
        int iW;
        int i11;
        if (i10 > 0) {
            iW = x();
            i11 = 1;
        } else {
            iW = w();
            i11 = -1;
        }
        n nVar = this.f22893w;
        nVar.f23046a = true;
        N(iW, state);
        L(i11);
        nVar.f23048c = iW + nVar.f23049d;
        nVar.f23047b = Math.abs(i10);
    }

    public final void G(RecyclerView.Recycler recycler, n nVar) {
        int iMin;
        if (!nVar.f23046a || nVar.f23054i) {
            return;
        }
        if (nVar.f23047b == 0) {
            if (nVar.f23050e == -1) {
                H(nVar.f23052g, recycler);
                return;
            } else {
                I(nVar.f23051f, recycler);
                return;
            }
        }
        int i10 = 1;
        if (nVar.f23050e == -1) {
            int i11 = nVar.f23051f;
            int iJ = this.f22888r[0].j(i11);
            while (i10 < this.f22887q) {
                int iJ2 = this.f22888r[i10].j(i11);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i10++;
            }
            int i12 = i11 - iJ;
            H(i12 < 0 ? nVar.f23052g : nVar.f23052g - Math.min(i12, nVar.f23047b), recycler);
            return;
        }
        int i13 = nVar.f23052g;
        int iH = this.f22888r[0].h(i13);
        while (i10 < this.f22887q) {
            int iH2 = this.f22888r[i10].h(i13);
            if (iH2 < iH) {
                iH = iH2;
            }
            i10++;
        }
        int i14 = iH - nVar.f23052g;
        if (i14 < 0) {
            iMin = nVar.f23051f;
        } else {
            iMin = Math.min(i14, nVar.f23047b) + nVar.f23051f;
        }
        I(iMin, recycler);
    }

    public final void H(int i10, RecyclerView.Recycler recycler) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f22889s.getDecoratedStart(childAt) < i10 || this.f22889s.getTransformedStartWithDecoration(childAt) < i10) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f22898f) {
                for (int i11 = 0; i11 < this.f22887q; i11++) {
                    if (this.f22888r[i11].f22922a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f22887q; i12++) {
                    this.f22888r[i12].k();
                }
            } else if (layoutParams.f22897e.f22922a.size() == 1) {
                return;
            } else {
                layoutParams.f22897e.k();
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    public final void I(int i10, RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f22889s.getDecoratedEnd(childAt) > i10 || this.f22889s.getTransformedEndWithDecoration(childAt) > i10) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f22898f) {
                for (int i11 = 0; i11 < this.f22887q; i11++) {
                    if (this.f22888r[i11].f22922a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f22887q; i12++) {
                    this.f22888r[i12].l();
                }
            } else if (layoutParams.f22897e.f22922a.size() == 1) {
                return;
            } else {
                layoutParams.f22897e.l();
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    public final void J() {
        if (this.f22891u == 1 || !isLayoutRTL()) {
            this.f22895y = this.f22894x;
        } else {
            this.f22895y = !this.f22894x;
        }
    }

    public final int K(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        F(i10, state);
        n nVar = this.f22893w;
        int iR = r(recycler, nVar, state);
        if (nVar.f23047b >= iR) {
            i10 = i10 < 0 ? -iR : iR;
        }
        this.f22889s.offsetChildren(-i10);
        this.E = this.f22895y;
        nVar.f23047b = 0;
        G(recycler, nVar);
        return i10;
    }

    public final void L(int i10) {
        n nVar = this.f22893w;
        nVar.f23050e = i10;
        nVar.f23049d = this.f22895y != (i10 == -1) ? -1 : 1;
    }

    public final void M(int i10, int i11) {
        for (int i12 = 0; i12 < this.f22887q; i12++) {
            if (!this.f22888r[i12].f22922a.isEmpty()) {
                O(this.f22888r[i12], i10, i11);
            }
        }
    }

    public final void N(int i10, RecyclerView.State state) {
        int totalSpace;
        int totalSpace2;
        int targetScrollPosition;
        n nVar = this.f22893w;
        boolean z10 = false;
        nVar.f23047b = 0;
        nVar.f23048c = i10;
        if (!isSmoothScrolling() || (targetScrollPosition = state.getTargetScrollPosition()) == -1) {
            totalSpace = 0;
            totalSpace2 = 0;
        } else {
            if (this.f22895y == (targetScrollPosition < i10)) {
                totalSpace = this.f22889s.getTotalSpace();
                totalSpace2 = 0;
            } else {
                totalSpace2 = this.f22889s.getTotalSpace();
                totalSpace = 0;
            }
        }
        if (getClipToPadding()) {
            nVar.f23051f = this.f22889s.getStartAfterPadding() - totalSpace2;
            nVar.f23052g = this.f22889s.getEndAfterPadding() + totalSpace;
        } else {
            nVar.f23052g = this.f22889s.getEnd() + totalSpace;
            nVar.f23051f = -totalSpace2;
        }
        nVar.f23053h = false;
        nVar.f23046a = true;
        if (this.f22889s.getMode() == 0 && this.f22889s.getEnd() == 0) {
            z10 = true;
        }
        nVar.f23054i = z10;
    }

    public final void O(c cVar, int i10, int i11) {
        int i12 = cVar.f22925d;
        int i13 = cVar.f22926e;
        if (i10 == -1) {
            int i14 = cVar.f22923b;
            if (i14 == Integer.MIN_VALUE) {
                cVar.c();
                i14 = cVar.f22923b;
            }
            if (i14 + i12 <= i11) {
                this.f22896z.set(i13, false);
                return;
            }
            return;
        }
        int i15 = cVar.f22924c;
        if (i15 == Integer.MIN_VALUE) {
            cVar.b();
            i15 = cVar.f22924c;
        }
        if (i15 - i12 >= i11) {
            this.f22896z.set(i13, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.G == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f22891u == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f22891u == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        n nVar;
        int iH;
        int iJ;
        if (this.f22891u != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        F(i10, state);
        int[] iArr = this.M;
        if (iArr == null || iArr.length < this.f22887q) {
            this.M = new int[this.f22887q];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f22887q;
            nVar = this.f22893w;
            if (i12 >= i14) {
                break;
            }
            if (nVar.f23049d == -1) {
                iH = nVar.f23051f;
                iJ = this.f22888r[i12].j(iH);
            } else {
                iH = this.f22888r[i12].h(nVar.f23052g);
                iJ = nVar.f23052g;
            }
            int i15 = iH - iJ;
            if (i15 >= 0) {
                this.M[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.M, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = nVar.f23048c;
            if (i17 < 0 || i17 >= state.getItemCount()) {
                return;
            }
            layoutPrefetchRegistry.addPosition(nVar.f23048c, this.M[i16]);
            nVar.f23048c += nVar.f23049d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return o(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return p(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return q(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i10) {
        int iM = m(i10);
        PointF pointF = new PointF();
        if (iM == 0) {
            return null;
        }
        if (this.f22891u == 0) {
            pointF.x = iM;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return o(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return p(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return q(state);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f22887q];
        } else if (iArr.length < this.f22887q) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f22887q + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f22887q; i10++) {
            c cVar = this.f22888r[i10];
            boolean z10 = StaggeredGridLayoutManager.this.f22894x;
            ArrayList<View> arrayList = cVar.f22922a;
            iArr[i10] = z10 ? cVar.g(arrayList.size() - 1, -1, true, true, false) : cVar.g(0, arrayList.size(), true, true, false);
        }
        return iArr;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f22887q];
        } else if (iArr.length < this.f22887q) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f22887q + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f22887q; i10++) {
            c cVar = this.f22888r[i10];
            boolean z10 = StaggeredGridLayoutManager.this.f22894x;
            ArrayList<View> arrayList = cVar.f22922a;
            iArr[i10] = z10 ? cVar.g(arrayList.size() - 1, -1, false, true, false) : cVar.g(0, arrayList.size(), false, true, false);
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f22887q];
        } else if (iArr.length < this.f22887q) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f22887q + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f22887q; i10++) {
            c cVar = this.f22888r[i10];
            boolean z10 = StaggeredGridLayoutManager.this.f22894x;
            ArrayList<View> arrayList = cVar.f22922a;
            iArr[i10] = z10 ? cVar.g(0, arrayList.size(), true, true, false) : cVar.g(arrayList.size() - 1, -1, true, true, false);
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f22887q];
        } else if (iArr.length < this.f22887q) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f22887q + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f22887q; i10++) {
            c cVar = this.f22888r[i10];
            boolean z10 = StaggeredGridLayoutManager.this.f22894x;
            ArrayList<View> arrayList = cVar.f22922a;
            iArr[i10] = z10 ? cVar.g(0, arrayList.size(), false, true, false) : cVar.g(arrayList.size() - 1, -1, false, true, false);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f22891u == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getGapStrategy() {
        return this.D;
    }

    public int getOrientation() {
        return this.f22891u;
    }

    public boolean getReverseLayout() {
        return this.f22894x;
    }

    public int getSpanCount() {
        return this.f22887q;
    }

    public void invalidateSpanAssignments() {
        this.C.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return this.D != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final int m(int i10) {
        if (getChildCount() == 0) {
            return this.f22895y ? 1 : -1;
        }
        return (i10 < w()) != this.f22895y ? -1 : 1;
    }

    public final boolean n() {
        int iW;
        int iX;
        if (getChildCount() == 0 || this.D == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f22895y) {
            iW = x();
            iX = w();
        } else {
            iW = w();
            iX = x();
        }
        LazySpanLookup lazySpanLookup = this.C;
        if (iW == 0 && B() != null) {
            lazySpanLookup.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.K) {
            return false;
        }
        int i10 = this.f22895y ? -1 : 1;
        int i11 = iX + 1;
        LazySpanLookup.FullSpanItem fullSpanItemE = lazySpanLookup.e(iW, i11, i10);
        if (fullSpanItemE == null) {
            this.K = false;
            lazySpanLookup.d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = lazySpanLookup.e(iW, fullSpanItemE.f22901p0, i10 * (-1));
        if (fullSpanItemE2 == null) {
            lazySpanLookup.d(fullSpanItemE.f22901p0);
        } else {
            lazySpanLookup.d(fullSpanItemE2.f22901p0 + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final int o(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        OrientationHelper orientationHelper = this.f22889s;
        boolean z10 = this.L;
        return w.a(state, orientationHelper, t(!z10), s(!z10), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.f22887q; i11++) {
            c cVar = this.f22888r[i11];
            int i12 = cVar.f22923b;
            if (i12 != Integer.MIN_VALUE) {
                cVar.f22923b = i12 + i10;
            }
            int i13 = cVar.f22924c;
            if (i13 != Integer.MIN_VALUE) {
                cVar.f22924c = i13 + i10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.f22887q; i11++) {
            c cVar = this.f22888r[i11];
            int i12 = cVar.f22923b;
            if (i12 != Integer.MIN_VALUE) {
                cVar.f22923b = i12 + i10;
            }
            int i13 = cVar.f22924c;
            if (i13 != Integer.MIN_VALUE) {
                cVar.f22924c = i13 + i10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.C.b();
        for (int i10 = 0; i10 < this.f22887q; i10++) {
            this.f22888r[i10].d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.N);
        for (int i10 = 0; i10 < this.f22887q; i10++) {
            this.f22888r[i10].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045  */
    /* JADX WARN: Code duplicated, block: B:38:0x004d  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewFindContainingItemView;
        int i11;
        View viewI;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        J();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 == 66 ? this.f22891u == 0 : !(i10 != 130 || this.f22891u != 1)) {
                            i11 = 1;
                        }
                    } else if (this.f22891u == 1) {
                        i11 = -1;
                    }
                    i11 = Integer.MIN_VALUE;
                } else if (this.f22891u == 0) {
                    i11 = -1;
                } else {
                    i11 = Integer.MIN_VALUE;
                }
            } else if (this.f22891u != 1 && isLayoutRTL()) {
                i11 = -1;
            } else {
                i11 = 1;
            }
        } else if (this.f22891u != 1 && isLayoutRTL()) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        boolean z10 = layoutParams.f22898f;
        c cVar = layoutParams.f22897e;
        int iX = i11 == 1 ? x() : w();
        N(iX, state);
        L(i11);
        n nVar = this.f22893w;
        nVar.f23048c = nVar.f23049d + iX;
        nVar.f23047b = (int) (this.f22889s.getTotalSpace() * 0.33333334f);
        nVar.f23053h = true;
        nVar.f23046a = false;
        r(recycler, nVar, state);
        this.E = this.f22895y;
        if (!z10 && (viewI = cVar.i(iX, i11)) != null && viewI != viewFindContainingItemView) {
            return viewI;
        }
        if (E(i11)) {
            for (int i12 = this.f22887q - 1; i12 >= 0; i12--) {
                View viewI2 = this.f22888r[i12].i(iX, i11);
                if (viewI2 != null && viewI2 != viewFindContainingItemView) {
                    return viewI2;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.f22887q; i13++) {
                View viewI3 = this.f22888r[i13].i(iX, i11);
                if (viewI3 != null && viewI3 != viewFindContainingItemView) {
                    return viewI3;
                }
            }
        }
        boolean z11 = (this.f22894x ^ true) == (i11 == -1);
        if (!z10) {
            View viewFindViewByPosition = findViewByPosition(z11 ? cVar.e() : cVar.f());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (E(i11)) {
            for (int i14 = this.f22887q - 1; i14 >= 0; i14--) {
                if (i14 != cVar.f22926e) {
                    View viewFindViewByPosition2 = findViewByPosition(z11 ? this.f22888r[i14].e() : this.f22888r[i14].f());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i15 = 0; i15 < this.f22887q; i15++) {
                View viewFindViewByPosition3 = findViewByPosition(z11 ? this.f22888r[i15].e() : this.f22888r[i15].f());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewT = t(false);
            View viewS = s(false);
            if (viewT == null || viewS == null) {
                return;
            }
            int position = getPosition(viewT);
            int position2 = getPosition(viewS);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        A(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.C.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        A(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        A(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        A(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        D(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.G = null;
        this.J.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.G = savedState;
            if (this.A != -1) {
                savedState.f22908s0 = null;
                savedState.f22907r0 = 0;
                savedState.f22905p0 = -1;
                savedState.f22906q0 = -1;
                savedState.f22908s0 = null;
                savedState.f22907r0 = 0;
                savedState.f22909t0 = 0;
                savedState.f22910u0 = null;
                savedState.v0 = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int iJ;
        int startAfterPadding;
        int[] iArr;
        SavedState savedState = this.G;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f22911w0 = this.f22894x;
        savedState2.f22912x0 = this.E;
        savedState2.f22913y0 = this.F;
        LazySpanLookup lazySpanLookup = this.C;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f22899a) == null) {
            savedState2.f22909t0 = 0;
        } else {
            savedState2.f22910u0 = iArr;
            savedState2.f22909t0 = iArr.length;
            savedState2.v0 = lazySpanLookup.f22900b;
        }
        if (getChildCount() > 0) {
            savedState2.f22905p0 = this.E ? x() : w();
            View viewS = this.f22895y ? s(true) : t(true);
            savedState2.f22906q0 = viewS != null ? getPosition(viewS) : -1;
            int i10 = this.f22887q;
            savedState2.f22907r0 = i10;
            savedState2.f22908s0 = new int[i10];
            for (int i11 = 0; i11 < this.f22887q; i11++) {
                if (this.E) {
                    iJ = this.f22888r[i11].h(Integer.MIN_VALUE);
                    if (iJ != Integer.MIN_VALUE) {
                        startAfterPadding = this.f22889s.getEndAfterPadding();
                        iJ -= startAfterPadding;
                    }
                } else {
                    iJ = this.f22888r[i11].j(Integer.MIN_VALUE);
                    if (iJ != Integer.MIN_VALUE) {
                        startAfterPadding = this.f22889s.getStartAfterPadding();
                        iJ -= startAfterPadding;
                    }
                }
                savedState2.f22908s0[i11] = iJ;
            }
        } else {
            savedState2.f22905p0 = -1;
            savedState2.f22906q0 = -1;
            savedState2.f22907r0 = 0;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            n();
        }
    }

    public final int p(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        OrientationHelper orientationHelper = this.f22889s;
        boolean z10 = this.L;
        return w.b(state, orientationHelper, t(!z10), s(!z10), this, this.L, this.f22895y);
    }

    public final int q(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        OrientationHelper orientationHelper = this.f22889s;
        boolean z10 = this.L;
        return w.c(state, orientationHelper, t(!z10), s(!z10), this, this.L);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b7 A[LOOP:2: B:149:0x02b5->B:150:0x02b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:154:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d1 A[LOOP:3: B:155:0x02cf->B:156:0x02d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x02db  */
    /* JADX WARN: Code duplicated, block: B:167:0x0311  */
    /* JADX WARN: Code duplicated, block: B:169:0x0315  */
    /* JADX WARN: Code duplicated, block: B:170:0x031c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0336  */
    /* JADX WARN: Code duplicated, block: B:175:0x0344  */
    /* JADX WARN: Code duplicated, block: B:178:0x0357  */
    /* JADX WARN: Code duplicated, block: B:180:0x0361  */
    /* JADX WARN: Code duplicated, block: B:188:0x037f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    public final int r(RecyclerView.Recycler recycler, n nVar, RecyclerView.State state) {
        c cVar;
        int i10;
        int decoratedMeasurement;
        int i11;
        boolean z10;
        ?? r3;
        int i12;
        int startAfterPadding;
        int decoratedMeasurement2;
        int decoratedMeasurement3;
        View view;
        LayoutParams layoutParams;
        int i13;
        int i14;
        ?? r1;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        int i18;
        RecyclerView.Recycler recycler2 = recycler;
        int i19 = 0;
        int i20 = 1;
        this.f22896z.set(0, this.f22887q, true);
        n nVar2 = this.f22893w;
        int i21 = nVar2.f23054i ? nVar.f23050e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar.f23050e == 1 ? nVar.f23052g + nVar.f23047b : nVar.f23051f - nVar.f23047b;
        M(nVar.f23050e, i21);
        int endAfterPadding = this.f22895y ? this.f22889s.getEndAfterPadding() : this.f22889s.getStartAfterPadding();
        boolean z13 = false;
        while (true) {
            int i22 = nVar.f23048c;
            if (((i22 < 0 || i22 >= state.getItemCount()) ? i19 : i20) == 0 || (!nVar2.f23054i && this.f22896z.isEmpty())) {
                break;
            }
            View viewForPosition = recycler2.getViewForPosition(nVar.f23048c);
            nVar.f23048c += nVar.f23049d;
            LayoutParams layoutParams2 = (LayoutParams) viewForPosition.getLayoutParams();
            int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
            LazySpanLookup lazySpanLookup = this.C;
            int[] iArr = lazySpanLookup.f22899a;
            int i23 = (iArr == null || viewLayoutPosition >= iArr.length) ? -1 : iArr[viewLayoutPosition];
            int i24 = i23 == -1 ? i20 : i19;
            if (i24 != 0) {
                if (layoutParams2.f22898f) {
                    cVar = this.f22888r[i19];
                } else {
                    if (E(nVar.f23050e)) {
                        i17 = this.f22887q - i20;
                        i16 = -1;
                        i18 = -1;
                    } else {
                        i16 = this.f22887q;
                        i17 = i19;
                        i18 = i20;
                    }
                    c cVar2 = null;
                    if (nVar.f23050e == i20) {
                        int startAfterPadding2 = this.f22889s.getStartAfterPadding();
                        int i25 = Integer.MAX_VALUE;
                        while (i17 != i16) {
                            c cVar3 = this.f22888r[i17];
                            int iH = cVar3.h(startAfterPadding2);
                            if (iH < i25) {
                                i25 = iH;
                                cVar2 = cVar3;
                            }
                            i17 += i18;
                        }
                    } else {
                        int endAfterPadding2 = this.f22889s.getEndAfterPadding();
                        int i26 = Integer.MIN_VALUE;
                        while (i17 != i16) {
                            c cVar4 = this.f22888r[i17];
                            int iJ = cVar4.j(endAfterPadding2);
                            if (iJ > i26) {
                                cVar2 = cVar4;
                                i26 = iJ;
                            }
                            i17 += i18;
                        }
                    }
                    cVar = cVar2;
                }
                lazySpanLookup.c(viewLayoutPosition);
                lazySpanLookup.f22899a[viewLayoutPosition] = cVar.f22926e;
            } else {
                cVar = this.f22888r[i23];
            }
            c cVar5 = cVar;
            layoutParams2.f22897e = cVar5;
            if (nVar.f23050e == 1) {
                addView(viewForPosition);
            } else {
                addView(viewForPosition, 0);
            }
            if (!layoutParams2.f22898f) {
                i10 = i21;
                if (this.f22891u == 1) {
                    C(viewForPosition, RecyclerView.LayoutManager.getChildMeasureSpec(this.f22892v, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams2).height, true));
                } else {
                    C(viewForPosition, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams2).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.f22892v, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false));
                }
            } else if (this.f22891u == 1) {
                i10 = i21;
                C(viewForPosition, this.H, RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams2).height, true));
            } else {
                i10 = i21;
                C(viewForPosition, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams2).width, true), this.H);
            }
            if (nVar.f23050e == 1) {
                int iY = layoutParams2.f22898f ? y(endAfterPadding) : cVar5.h(endAfterPadding);
                int decoratedMeasurement4 = this.f22889s.getDecoratedMeasurement(viewForPosition) + iY;
                if (i24 != 0 && layoutParams2.f22898f) {
                    LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
                    fullSpanItem.f22903r0 = new int[this.f22887q];
                    for (int i27 = 0; i27 < this.f22887q; i27++) {
                        fullSpanItem.f22903r0[i27] = iY - this.f22888r[i27].h(iY);
                    }
                    fullSpanItem.f22902q0 = -1;
                    fullSpanItem.f22901p0 = viewLayoutPosition;
                    lazySpanLookup.a(fullSpanItem);
                }
                i11 = decoratedMeasurement4;
                decoratedMeasurement = iY;
            } else {
                int iZ = layoutParams2.f22898f ? z(endAfterPadding) : cVar5.j(endAfterPadding);
                decoratedMeasurement = iZ - this.f22889s.getDecoratedMeasurement(viewForPosition);
                if (i24 != 0 && layoutParams2.f22898f) {
                    LazySpanLookup.FullSpanItem fullSpanItem2 = new LazySpanLookup.FullSpanItem();
                    fullSpanItem2.f22903r0 = new int[this.f22887q];
                    for (int i28 = 0; i28 < this.f22887q; i28++) {
                        fullSpanItem2.f22903r0[i28] = this.f22888r[i28].j(iZ) - iZ;
                    }
                    fullSpanItem2.f22902q0 = 1;
                    fullSpanItem2.f22901p0 = viewLayoutPosition;
                    lazySpanLookup.a(fullSpanItem2);
                }
                i11 = iZ;
            }
            if (layoutParams2.f22898f && nVar.f23049d == -1) {
                if (i24 != 0) {
                    z10 = true;
                    this.K = true;
                } else {
                    if (nVar.f23050e == 1) {
                        int iH2 = this.f22888r[0].h(Integer.MIN_VALUE);
                        int i29 = 1;
                        while (true) {
                            if (i29 >= this.f22887q) {
                                z11 = true;
                                z12 = true;
                            } else if (this.f22888r[i29].h(Integer.MIN_VALUE) != iH2) {
                                z11 = true;
                                z12 = false;
                            } else {
                                i29++;
                            }
                        }
                    } else {
                        int iJ2 = this.f22888r[0].j(Integer.MIN_VALUE);
                        int i30 = 1;
                        while (true) {
                            if (i30 >= this.f22887q) {
                                z11 = true;
                                z12 = true;
                            } else if (this.f22888r[i30].j(Integer.MIN_VALUE) != iJ2) {
                                z11 = true;
                                z12 = false;
                            } else {
                                i30++;
                            }
                        }
                    }
                    r3 = z11;
                    if (!z12) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = lazySpanLookup.f(viewLayoutPosition);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.f22904s0 = z11;
                        }
                        this.K = z11;
                        r3 = z11;
                    }
                }
                if (nVar.f23050e == r3) {
                    if (layoutParams2.f22898f) {
                        r1 = this.f22887q - r3;
                        while (i15 >= 0) {
                            i15 = r1;
                            this.f22888r[i15].a(viewForPosition);
                            i15--;
                        }
                        i15 = r1;
                    } else {
                        layoutParams2.f22897e.a(viewForPosition);
                    }
                } else if (layoutParams2.f22898f) {
                    for (i12 = this.f22887q - 1; i12 >= 0; i12--) {
                        this.f22888r[i12].m(viewForPosition);
                    }
                } else {
                    layoutParams2.f22897e.m(viewForPosition);
                }
                if (isLayoutRTL() || this.f22891u != 1) {
                    if (layoutParams2.f22898f) {
                        startAfterPadding = this.f22890t.getStartAfterPadding();
                    } else {
                        startAfterPadding = (cVar5.f22926e * this.f22892v) + this.f22890t.getStartAfterPadding();
                    }
                    decoratedMeasurement2 = startAfterPadding;
                    decoratedMeasurement3 = this.f22890t.getDecoratedMeasurement(viewForPosition) + startAfterPadding;
                } else {
                    int endAfterPadding3 = layoutParams2.f22898f ? this.f22890t.getEndAfterPadding() : this.f22890t.getEndAfterPadding() - (((this.f22887q - 1) - cVar5.f22926e) * this.f22892v);
                    decoratedMeasurement3 = endAfterPadding3;
                    decoratedMeasurement2 = endAfterPadding3 - this.f22890t.getDecoratedMeasurement(viewForPosition);
                }
                if (this.f22891u == 1) {
                    view = viewForPosition;
                    layoutDecoratedWithMargins(viewForPosition, decoratedMeasurement2, decoratedMeasurement, decoratedMeasurement3, i11);
                    layoutParams = layoutParams2;
                } else {
                    view = viewForPosition;
                    int i31 = i11;
                    layoutParams = layoutParams2;
                    layoutDecoratedWithMargins(view, decoratedMeasurement, decoratedMeasurement2, i31, decoratedMeasurement3);
                }
                if (layoutParams.f22898f) {
                    i13 = i10;
                    M(nVar2.f23050e, i13);
                } else {
                    i13 = i10;
                    O(cVar5, nVar2.f23050e, i13);
                }
                G(recycler, nVar2);
                if (nVar2.f23053h || !view.hasFocusable()) {
                    i14 = 0;
                } else if (layoutParams.f22898f) {
                    this.f22896z.clear();
                    i14 = 0;
                } else {
                    i14 = 0;
                    this.f22896z.set(cVar5.f22926e, false);
                }
                recycler2 = recycler;
                i19 = i14;
                z13 = true;
                i20 = 1;
                i21 = i13;
            } else {
                z10 = true;
            }
            r3 = z10;
            if (nVar.f23050e == r3) {
                if (layoutParams2.f22898f) {
                    r1 = this.f22887q - r3;
                    while (i15 >= 0) {
                        i15 = r1;
                        this.f22888r[i15].a(viewForPosition);
                        i15--;
                    }
                    i15 = r1;
                } else {
                    layoutParams2.f22897e.a(viewForPosition);
                }
            } else if (layoutParams2.f22898f) {
                while (i12 >= 0) {
                    this.f22888r[i12].m(viewForPosition);
                }
            } else {
                layoutParams2.f22897e.m(viewForPosition);
            }
            if (isLayoutRTL()) {
                if (layoutParams2.f22898f) {
                    startAfterPadding = this.f22890t.getStartAfterPadding();
                } else {
                    startAfterPadding = (cVar5.f22926e * this.f22892v) + this.f22890t.getStartAfterPadding();
                }
                decoratedMeasurement2 = startAfterPadding;
                decoratedMeasurement3 = this.f22890t.getDecoratedMeasurement(viewForPosition) + startAfterPadding;
            } else {
                if (layoutParams2.f22898f) {
                    startAfterPadding = this.f22890t.getStartAfterPadding();
                } else {
                    startAfterPadding = (cVar5.f22926e * this.f22892v) + this.f22890t.getStartAfterPadding();
                }
                decoratedMeasurement2 = startAfterPadding;
                decoratedMeasurement3 = this.f22890t.getDecoratedMeasurement(viewForPosition) + startAfterPadding;
            }
            if (this.f22891u == 1) {
                view = viewForPosition;
                layoutDecoratedWithMargins(viewForPosition, decoratedMeasurement2, decoratedMeasurement, decoratedMeasurement3, i11);
                layoutParams = layoutParams2;
            } else {
                view = viewForPosition;
                int i32 = i11;
                layoutParams = layoutParams2;
                layoutDecoratedWithMargins(view, decoratedMeasurement, decoratedMeasurement2, i32, decoratedMeasurement3);
            }
            if (layoutParams.f22898f) {
                i13 = i10;
                M(nVar2.f23050e, i13);
            } else {
                i13 = i10;
                O(cVar5, nVar2.f23050e, i13);
            }
            G(recycler, nVar2);
            if (nVar2.f23053h) {
                i14 = 0;
            } else {
                i14 = 0;
            }
            recycler2 = recycler;
            i19 = i14;
            z13 = true;
            i20 = 1;
            i21 = i13;
        }
        RecyclerView.Recycler recycler3 = recycler2;
        int i33 = i19;
        if (!z13) {
            G(recycler3, nVar2);
        }
        int startAfterPadding3 = nVar2.f23050e == -1 ? this.f22889s.getStartAfterPadding() - z(this.f22889s.getStartAfterPadding()) : y(this.f22889s.getEndAfterPadding()) - this.f22889s.getEndAfterPadding();
        return startAfterPadding3 > 0 ? Math.min(nVar.f23047b, startAfterPadding3) : i33;
    }

    public final View s(boolean z10) {
        int startAfterPadding = this.f22889s.getStartAfterPadding();
        int endAfterPadding = this.f22889s.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.f22889s.getDecoratedStart(childAt);
            int decoratedEnd = this.f22889s.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return K(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        SavedState savedState = this.G;
        if (savedState != null && savedState.f22905p0 != i10) {
            savedState.f22908s0 = null;
            savedState.f22907r0 = 0;
            savedState.f22905p0 = -1;
            savedState.f22906q0 = -1;
        }
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        SavedState savedState = this.G;
        if (savedState != null) {
            savedState.f22908s0 = null;
            savedState.f22907r0 = 0;
            savedState.f22905p0 = -1;
            savedState.f22906q0 = -1;
        }
        this.A = i10;
        this.B = i11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return K(i10, recycler, state);
    }

    public void setGapStrategy(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 == this.D) {
            return;
        }
        if (i10 != 0 && i10 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.D = i10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f22891u == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i10, (this.f22892v * this.f22887q) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i11, (this.f22892v * this.f22887q) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f22891u) {
            return;
        }
        this.f22891u = i10;
        OrientationHelper orientationHelper = this.f22889s;
        this.f22889s = this.f22890t;
        this.f22890t = orientationHelper;
        requestLayout();
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.G;
        if (savedState != null && savedState.f22911w0 != z10) {
            savedState.f22911w0 = z10;
        }
        this.f22894x = z10;
        requestLayout();
    }

    public void setSpanCount(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f22887q) {
            invalidateSpanAssignments();
            this.f22887q = i10;
            this.f22896z = new BitSet(this.f22887q);
            this.f22888r = new c[this.f22887q];
            for (int i11 = 0; i11 < this.f22887q; i11++) {
                this.f22888r[i11] = new c(i11);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.G == null;
    }

    public final View t(boolean z10) {
        int startAfterPadding = this.f22889s.getStartAfterPadding();
        int endAfterPadding = this.f22889s.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int decoratedStart = this.f22889s.getDecoratedStart(childAt);
            if (this.f22889s.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void u(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10) {
        int endAfterPadding;
        int iY = y(Integer.MIN_VALUE);
        if (iY != Integer.MIN_VALUE && (endAfterPadding = this.f22889s.getEndAfterPadding() - iY) > 0) {
            int i10 = endAfterPadding - (-K(-endAfterPadding, recycler, state));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f22889s.offsetChildren(i10);
        }
    }

    public final void v(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z10) {
        int startAfterPadding;
        int iZ = z(Integer.MAX_VALUE);
        if (iZ != Integer.MAX_VALUE && (startAfterPadding = iZ - this.f22889s.getStartAfterPadding()) > 0) {
            int iK = startAfterPadding - K(startAfterPadding, recycler, state);
            if (!z10 || iK <= 0) {
                return;
            }
            this.f22889s.offsetChildren(-iK);
        }
    }

    public final int w() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int x() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int y(int i10) {
        int iH = this.f22888r[0].h(i10);
        for (int i11 = 1; i11 < this.f22887q; i11++) {
            int iH2 = this.f22888r[i11].h(i10);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    public final int z(int i10) {
        int iJ = this.f22888r[0].j(i10);
        for (int i11 = 1; i11 < this.f22887q; i11++) {
            int iJ2 = this.f22888r[i11].j(i10);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.f22891u = i11;
        setSpanCount(i10);
        this.f22893w = new n();
        this.f22889s = OrientationHelper.createOrientationHelper(this, this.f22891u);
        this.f22890t = OrientationHelper.createOrientationHelper(this, 1 - this.f22891u);
    }
}
