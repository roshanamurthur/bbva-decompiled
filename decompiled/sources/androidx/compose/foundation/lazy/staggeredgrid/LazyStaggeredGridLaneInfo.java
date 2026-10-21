package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.camera.core.impl.utils.b;
import dk.e;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "", "itemIndex", "lane", "", "setLane", "getLane", "targetLane", "", "assignedToLane", "upperBound", "lowerBound", "reset", "findPreviousItemIndex", "findNextItemIndex", "requestedIndex", "ensureValidIndex", "", "gaps", "setGaps", "getGaps", "<init>", "()V", "Companion", "a", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,207:1\n1#2:208\n388#3,7:209\n388#3,7:216\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:209,7\n187#1:216,7\n*E\n"})
public final class LazyStaggeredGridLaneInfo {
    public static final int FullSpan = -2;
    public static final int Unset = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f5208b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<a> f5209c = new ArrayDeque<>();

    /* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public int[] f5211b;

        public a(int i10, @NotNull int[] gaps) {
            Intrinsics.checkNotNullParameter(gaps, "gaps");
            this.f5210a = i10;
            this.f5211b = gaps;
        }
    }

    public final void a(int i10, int i11) {
        if (i10 > 131072) {
            throw new IllegalArgumentException(b.a("Requested item capacity ", i10, " is larger than max supported: 131072!").toString());
        }
        int[] iArr = this.f5208b;
        if (iArr.length < i10) {
            int length = iArr.length;
            while (length < i10) {
                length *= 2;
            }
            this.f5208b = ArraysKt___ArraysJvmKt.copyInto$default(this.f5208b, new int[length], i11, 0, 0, 12, (Object) null);
        }
    }

    public final boolean assignedToLane(int itemIndex, int targetLane) {
        int lane = getLane(itemIndex);
        return lane == targetLane || lane == -1 || lane == -2;
    }

    public final void ensureValidIndex(int requestedIndex) {
        ArrayDeque<a> arrayDeque;
        int i10 = this.f5207a;
        int i11 = requestedIndex - i10;
        if (i11 < 0 || i11 >= 131072) {
            int iMax = Math.max(requestedIndex - (this.f5208b.length / 2), 0);
            this.f5207a = iMax;
            int i12 = iMax - i10;
            if (i12 >= 0) {
                int[] iArr = this.f5208b;
                if (i12 < iArr.length) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, 0, i12, iArr.length);
                }
                int[] iArr2 = this.f5208b;
                ArraysKt___ArraysJvmKt.fill(iArr2, 0, Math.max(0, iArr2.length - i12), this.f5208b.length);
            } else {
                int i13 = -i12;
                int[] iArr3 = this.f5208b;
                if (iArr3.length + i13 < 131072) {
                    a(iArr3.length + i13 + 1, i13);
                } else {
                    if (i13 < iArr3.length) {
                        ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr3, i13, 0, iArr3.length - i13);
                    }
                    int[] iArr4 = this.f5208b;
                    ArraysKt___ArraysJvmKt.fill(iArr4, 0, 0, Math.min(iArr4.length, i13));
                }
            }
        } else {
            a(i11 + 1, 0);
        }
        while (true) {
            arrayDeque = this.f5209c;
            if (!(!arrayDeque.isEmpty()) || arrayDeque.first().f5210a >= getF5207a()) {
                break;
            } else {
                arrayDeque.removeFirst();
            }
        }
        while ((!arrayDeque.isEmpty()) && arrayDeque.last().f5210a > upperBound()) {
            arrayDeque.removeLast();
        }
    }

    public final int findNextItemIndex(int itemIndex, int targetLane) {
        int iUpperBound = upperBound();
        for (int i10 = itemIndex + 1; i10 < iUpperBound; i10++) {
            if (assignedToLane(i10, targetLane)) {
                return i10;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int itemIndex, int targetLane) {
        do {
            itemIndex--;
            if (-1 >= itemIndex) {
                return -1;
            }
        } while (!assignedToLane(itemIndex, targetLane));
        return itemIndex;
    }

    @Nullable
    public final int[] getGaps(int itemIndex) {
        final Integer numValueOf = Integer.valueOf(itemIndex);
        ArrayDeque<a> arrayDeque = this.f5209c;
        a aVar = (a) CollectionsKt___CollectionsKt.getOrNull(arrayDeque, CollectionsKt__CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new Function1<a, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(LazyStaggeredGridLaneInfo.a aVar2) {
                return Integer.valueOf(e.compareValues(Integer.valueOf(aVar2.f5210a), numValueOf));
            }
        }));
        if (aVar != null) {
            return aVar.f5211b;
        }
        return null;
    }

    public final int getLane(int itemIndex) {
        if (itemIndex < getF5207a() || itemIndex >= upperBound()) {
            return -1;
        }
        return this.f5208b[itemIndex - this.f5207a] - 1;
    }

    /* JADX INFO: renamed from: lowerBound, reason: from getter */
    public final int getF5207a() {
        return this.f5207a;
    }

    public final void reset() {
        ArraysKt___ArraysJvmKt.fill$default(this.f5208b, 0, 0, 0, 6, (Object) null);
        this.f5209c.clear();
    }

    public final void setGaps(int itemIndex, @Nullable int[] gaps) {
        final Integer numValueOf = Integer.valueOf(itemIndex);
        ArrayDeque<a> arrayDeque = this.f5209c;
        int iBinarySearch = CollectionsKt__CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new Function1<a, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(LazyStaggeredGridLaneInfo.a aVar) {
                return Integer.valueOf(e.compareValues(Integer.valueOf(aVar.f5210a), numValueOf));
            }
        });
        if (iBinarySearch < 0) {
            if (gaps == null) {
                return;
            }
            arrayDeque.add(-(iBinarySearch + 1), new a(itemIndex, gaps));
        } else {
            if (gaps == null) {
                arrayDeque.remove(iBinarySearch);
                return;
            }
            a aVar = arrayDeque.get(iBinarySearch);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(gaps, "<set-?>");
            aVar.f5211b = gaps;
        }
    }

    public final void setLane(int itemIndex, int lane) {
        if (itemIndex < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported".toString());
        }
        ensureValidIndex(itemIndex);
        this.f5208b[itemIndex - this.f5207a] = lane + 1;
    }

    public final int upperBound() {
        return this.f5207a + this.f5208b.length;
    }
}
