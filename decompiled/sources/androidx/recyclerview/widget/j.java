package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.os.TraceCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: GapWorker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final ThreadLocal<j> f23026t0 = new ThreadLocal<>();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f23027u0 = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f23029q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f23030r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList<RecyclerView> f23028p0 = new ArrayList<>();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList<c> f23031s0 = new ArrayList<>();

    /* JADX INFO: compiled from: GapWorker.java */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(androidx.recyclerview.widget.j.c r7, androidx.recyclerview.widget.j.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.j$c r7 = (androidx.recyclerview.widget.j.c) r7
                androidx.recyclerview.widget.j$c r8 = (androidx.recyclerview.widget.j.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f23039d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f23039d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f23036a
                boolean r3 = r8.f23036a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f23037b
                int r2 = r7.f23037b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f23038c
                int r8 = r8.f23038c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.j.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* JADX INFO: compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f23034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23035d;

        public final void a(RecyclerView recyclerView, boolean z10) {
            this.f23035d = 0;
            int[] iArr = this.f23034c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.H0;
            if (recyclerView.G0 == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f22761t0.g()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.G0.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.f23032a, this.f23033b, recyclerView.f22772z1, this);
            }
            int i10 = this.f23035d;
            if (i10 > layoutManager.f22789k) {
                layoutManager.f22789k = i10;
                layoutManager.f22790l = z10;
                recyclerView.f22758r0.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public final void addPosition(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f23035d;
            int i13 = i12 * 2;
            int[] iArr = this.f23034c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f23034c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f23034c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f23034c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f23035d++;
        }
    }

    /* JADX INFO: compiled from: GapWorker.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f23039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23040e;
    }

    public static RecyclerView.ViewHolder c(RecyclerView recyclerView, int i10, long j10) {
        int iH = recyclerView.f22763u0.h();
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.ViewHolder viewHolderD = RecyclerView.D(recyclerView.f22763u0.g(i11));
            if (viewHolderD.mPosition == i10 && !viewHolderD.isInvalid()) {
                return null;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.f22758r0;
        try {
            recyclerView.K();
            RecyclerView.ViewHolder viewHolderJ = recycler.j(i10, j10);
            if (viewHolderJ != null) {
                if (!viewHolderJ.isBound() || viewHolderJ.isInvalid()) {
                    recycler.a(viewHolderJ, false);
                } else {
                    recycler.recycleView(viewHolderJ.itemView);
                }
            }
            return viewHolderJ;
        } finally {
            recyclerView.L(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f23029q0 == 0) {
            this.f23029q0 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f22771y1;
        bVar.f23032a = i10;
        bVar.f23033b = i11;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x012f  */
    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f23028p0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f22771y1;
                bVar.a(recyclerView3, false);
                i10 += bVar.f23035d;
            }
        }
        ArrayList<c> arrayList2 = this.f23031s0;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f22771y1;
                int iAbs = Math.abs(bVar2.f23033b) + Math.abs(bVar2.f23032a);
                for (int i14 = 0; i14 < bVar2.f23035d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i12);
                    }
                    int[] iArr = bVar2.f23034c;
                    int i15 = iArr[i14 + 1];
                    cVar2.f23036a = i15 <= iAbs;
                    cVar2.f23037b = iAbs;
                    cVar2.f23038c = i15;
                    cVar2.f23039d = recyclerView4;
                    cVar2.f23040e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f23027u0);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i16)).f23039d) != null; i16++) {
            RecyclerView.ViewHolder viewHolderC = c(recyclerView, cVar.f23040e, cVar.f23036a ? Long.MAX_VALUE : j10);
            if (viewHolderC != null && viewHolderC.mNestedRecyclerView != null && viewHolderC.isBound() && !viewHolderC.isInvalid() && (recyclerView2 = viewHolderC.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.Y0 && recyclerView2.f22763u0.h() != 0) {
                    RecyclerView.ItemAnimator itemAnimator = recyclerView2.f22746h1;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimations();
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView2.H0;
                    RecyclerView.Recycler recycler = recyclerView2.f22758r0;
                    if (layoutManager != null) {
                        layoutManager.removeAndRecycleAllViews(recycler);
                        recyclerView2.H0.d(recycler);
                    }
                    recycler.clear();
                }
                b bVar3 = recyclerView2.f22771y1;
                bVar3.a(recyclerView2, true);
                if (bVar3.f23035d != 0) {
                    try {
                        TraceCompat.beginSection("RV Nested Prefetch");
                        RecyclerView.State state = recyclerView2.f22772z1;
                        RecyclerView.Adapter adapter = recyclerView2.G0;
                        state.f22835e = 1;
                        state.f22836f = adapter.getItemCount();
                        state.f22838h = false;
                        state.f22839i = false;
                        state.f22840j = false;
                        for (int i17 = 0; i17 < bVar3.f23035d * 2; i17 += 2) {
                            c(recyclerView2, bVar3.f23034c[i17], j10);
                        }
                        TraceCompat.endSection();
                    } catch (Throwable th2) {
                        TraceCompat.endSection();
                        throw th2;
                    }
                }
            }
            cVar.f23036a = false;
            cVar.f23037b = 0;
            cVar.f23038c = 0;
            cVar.f23039d = null;
            cVar.f23040e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            TraceCompat.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f23028p0;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f23030r0);
                }
            }
        } finally {
            this.f23029q0 = 0L;
            TraceCompat.endSection();
        }
    }
}
