package kotlin.ranges;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB!\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001e"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "Lkotlin/collections/LongIterator;", "iterator", "", "isEmpty", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "p0", "J", "getFirst", "()J", "first", "q0", "getLast", "last", "r0", "getStep", "step", EventDataKeys.Lifecycle.LIFECYCLE_START, "endInclusive", "<init>", "(JJJ)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public class LongProgression implements Iterable<Long>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final long first;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final long last;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final long step;

    /* JADX INFO: compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LongProgression fromClosedRange(long rangeStart, long rangeEnd, long step) {
            return new LongProgression(rangeStart, rangeEnd, step);
        }
    }

    public LongProgression(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j10;
        this.last = ProgressionUtilKt.getProgressionLastElement(j10, j11, j12);
        this.step = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof LongProgression) {
            if (!isEmpty() || !((LongProgression) other).isEmpty()) {
                LongProgression longProgression = (LongProgression) other;
                if (this.first != longProgression.first || this.last != longProgression.last || this.step != longProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.first;
        long j12 = this.last;
        long j13 = (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32))) * j10;
        long j14 = this.step;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j10 = this.step;
        long j11 = this.last;
        long j12 = this.first;
        if (j10 > 0) {
            if (j12 <= j11) {
                return false;
            }
        } else if (j12 >= j11) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        long j10 = this.step;
        long j11 = this.last;
        long j12 = this.first;
        if (j10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append("..");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(j10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append(" downTo ");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(-j10);
        }
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Long> iterator() {
        return new LongProgressionIterator(this.first, this.last, this.step);
    }
}
