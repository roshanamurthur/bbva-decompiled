package ok;

import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements ClosedFloatingPointRange<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f85414p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f85415q0;

    public b(float f6, float f10) {
        this.f85414p0 = f6;
        this.f85415q0 = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (this.f85414p0 != bVar.f85414p0 || this.f85415q0 != bVar.f85415q0) {
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
        return (Float.floatToIntBits(this.f85414p0) * 31) + Float.floatToIntBits(this.f85415q0);
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.f85414p0 > this.f85415q0;
    }

    public boolean lessThanOrEquals(float f6, float f10) {
        return f6 <= f10;
    }

    @NotNull
    public String toString() {
        return this.f85414p0 + ".." + this.f85415q0;
    }

    public boolean contains(float f6) {
        return f6 >= this.f85414p0 && f6 <= this.f85415q0;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Float getEndInclusive() {
        return Float.valueOf(this.f85415q0);
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Float getStart() {
        return Float.valueOf(this.f85414p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }
}
