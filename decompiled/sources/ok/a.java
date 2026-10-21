package ok;

import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements ClosedFloatingPointRange<Double> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final double f85412p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final double f85413q0;

    public a(double d2, double d3) {
        this.f85412p0 = d2;
        this.f85413q0 = d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f85412p0 != aVar.f85412p0 || this.f85413q0 != aVar.f85413q0) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f85412p0);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f85413q0);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.f85412p0 > this.f85413q0;
    }

    public boolean lessThanOrEquals(double d2, double d3) {
        return d2 <= d3;
    }

    @NotNull
    public String toString() {
        return this.f85412p0 + ".." + this.f85413q0;
    }

    public boolean contains(double d2) {
        return d2 >= this.f85412p0 && d2 <= this.f85413q0;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Double getEndInclusive() {
        return Double.valueOf(this.f85413q0);
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Double getStart() {
        return Double.valueOf(this.f85412p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }
}
