package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T extends Comparable<? super T>> implements ClosedRange<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final T f79814p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final T f79815q0;

    public b(@NotNull T start, @NotNull T endInclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
        this.f79814p0 = start;
        this.f79815q0 = endInclusive;
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean contains(@NotNull T t10) {
        return ClosedRange.DefaultImpls.contains(this, t10);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (!Intrinsics.areEqual(getStart(), bVar.getStart()) || !Intrinsics.areEqual(getEndInclusive(), bVar.getEndInclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public T getEndInclusive() {
        return this.f79815q0;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public T getStart() {
        return this.f79814p0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return ClosedRange.DefaultImpls.isEmpty(this);
    }

    @NotNull
    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
