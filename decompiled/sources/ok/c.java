package ok;

import kotlin.ranges.OpenEndRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements OpenEndRange<Double> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final double f85416p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final double f85417q0;

    public c(double d2, double d3) {
        this.f85416p0 = d2;
        this.f85417q0 = d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f85416p0 != cVar.f85416p0 || this.f85417q0 != cVar.f85417q0) {
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.f85416p0);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f85417q0);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this.f85416p0 >= this.f85417q0;
    }

    @NotNull
    public String toString() {
        return this.f85416p0 + "..<" + this.f85417q0;
    }

    public boolean contains(double d2) {
        return d2 >= this.f85416p0 && d2 < this.f85417q0;
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Double getEndExclusive() {
        return Double.valueOf(this.f85417q0);
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Double getStart() {
        return Double.valueOf(this.f85416p0);
    }
}
