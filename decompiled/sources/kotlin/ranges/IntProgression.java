package kotlin.ranges;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB!\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001d"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "Lkotlin/collections/IntIterator;", "iterator", "", "isEmpty", "", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFirst", "()I", "first", "q0", "getLast", "last", "r0", "getStep", "step", EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(III)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public class IntProgression implements Iterable<Integer>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int first;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int last;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int step;

    /* JADX INFO: compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntProgression fromClosedRange(int rangeStart, int rangeEnd, int step) {
            return new IntProgression(rangeStart, rangeEnd, step);
        }
    }

    public IntProgression(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i10;
        this.last = ProgressionUtilKt.getProgressionLastElement(i10, i11, i12);
        this.step = i12;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) other).isEmpty()) {
                IntProgression intProgression = (IntProgression) other;
                if (this.first != intProgression.first || this.last != intProgression.last || this.step != intProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        int i10 = this.step;
        int i11 = this.last;
        int i12 = this.first;
        if (i10 > 0) {
            if (i12 <= i11) {
                return false;
            }
        } else if (i12 >= i11) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10 = this.last;
        int i11 = this.first;
        int i12 = this.step;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Integer> iterator() {
        return new IntProgressionIterator(this.first, this.last, this.step);
    }
}
