package kotlin.text;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DelimitedRangesSequence implements Sequence<IntRange> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f82279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> f82282d;

    /* JADX INFO: renamed from: kotlin.text.DelimitedRangesSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\f¨\u0006!"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "next", "", "hasNext", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNextState", "()I", "setNextState", "(I)V", "nextState", "q0", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "r0", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "s0", "Lkotlin/ranges/IntRange;", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextItem", "t0", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<IntRange>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public int nextState = -1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int currentStartIndex;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        public int nextSearchIndex;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public IntRange nextItem;

        /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
        public int counter;

        public AnonymousClass1() {
            int iCoerceIn = kotlin.ranges.c.coerceIn(DelimitedRangesSequence.this.f82280b, 0, DelimitedRangesSequence.this.f82279a.length());
            this.currentStartIndex = iCoerceIn;
            this.nextSearchIndex = iCoerceIn;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002d A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x008c  */
        /* JADX WARN: Code duplicated, block: B:9:0x0021  */
        public final void a() {
            Pair pair;
            if (this.nextSearchIndex < 0) {
                this.nextState = 0;
                this.nextItem = null;
                return;
            }
            DelimitedRangesSequence delimitedRangesSequence = DelimitedRangesSequence.this;
            if (delimitedRangesSequence.f82281c > 0) {
                int i10 = this.counter + 1;
                this.counter = i10;
                if (i10 >= delimitedRangesSequence.f82281c) {
                    this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.getLastIndex(delimitedRangesSequence.f82279a));
                    this.nextSearchIndex = -1;
                } else if (this.nextSearchIndex > delimitedRangesSequence.f82279a.length() && (pair = (Pair) delimitedRangesSequence.f82282d.invoke(delimitedRangesSequence.f82279a, Integer.valueOf(this.nextSearchIndex))) != null) {
                    int iIntValue = ((Number) pair.component1()).intValue();
                    int iIntValue2 = ((Number) pair.component2()).intValue();
                    this.nextItem = kotlin.ranges.c.until(this.currentStartIndex, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.currentStartIndex = i11;
                    this.nextSearchIndex = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.getLastIndex(delimitedRangesSequence.f82279a));
                    this.nextSearchIndex = -1;
                }
            } else if (this.nextSearchIndex > delimitedRangesSequence.f82279a.length()) {
                this.nextItem = new IntRange(this.currentStartIndex, StringsKt__StringsKt.getLastIndex(delimitedRangesSequence.f82279a));
                this.nextSearchIndex = -1;
            } else {
                int iIntValue3 = ((Number) pair.component1()).intValue();
                int iIntValue4 = ((Number) pair.component2()).intValue();
                this.nextItem = kotlin.ranges.c.until(this.currentStartIndex, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.currentStartIndex = i12;
                this.nextSearchIndex = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.nextState = 1;
        }

        public final int getCounter() {
            return this.counter;
        }

        public final int getCurrentStartIndex() {
            return this.currentStartIndex;
        }

        @Nullable
        public final IntRange getNextItem() {
            return this.nextItem;
        }

        public final int getNextSearchIndex() {
            return this.nextSearchIndex;
        }

        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                a();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCounter(int i10) {
            this.counter = i10;
        }

        public final void setCurrentStartIndex(int i10) {
            this.currentStartIndex = i10;
        }

        public final void setNextItem(@Nullable IntRange intRange) {
            this.nextItem = intRange;
        }

        public final void setNextSearchIndex(int i10) {
            this.nextSearchIndex = i10;
        }

        public final void setNextState(int i10) {
            this.nextState = i10;
        }

        @Override // java.util.Iterator
        @NotNull
        public IntRange next() {
            if (this.nextState == -1) {
                a();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.nextItem;
            Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.nextItem = null;
            this.nextState = -1;
            return intRange;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(@NotNull CharSequence input, int i10, int i11, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f82279a = input;
        this.f82280b = i10;
        this.f82281c = i11;
        this.f82282d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<IntRange> iterator() {
        return new AnonymousClass1();
    }
}
