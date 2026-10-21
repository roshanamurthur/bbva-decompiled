package ok;

import kotlin.ranges.OpenEndRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements OpenEndRange<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f85418p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final float f85419q0;

    public d(float f6, float f10) {
        this.f85418p0 = f6;
        this.f85419q0 = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f85418p0 != dVar.f85418p0 || this.f85419q0 != dVar.f85419q0) {
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
        return (Float.floatToIntBits(this.f85418p0) * 31) + Float.floatToIntBits(this.f85419q0);
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this.f85418p0 >= this.f85419q0;
    }

    @NotNull
    public String toString() {
        return this.f85418p0 + "..<" + this.f85419q0;
    }

    public boolean contains(float f6) {
        return f6 >= this.f85418p0 && f6 < this.f85419q0;
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Float getEndExclusive() {
        return Float.valueOf(this.f85419q0);
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Float getStart() {
        return Float.valueOf(this.f85418p0);
    }
}
