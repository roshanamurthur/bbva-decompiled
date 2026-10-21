package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T extends Comparable<? super T>> implements OpenEndRange<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final T f79812p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final T f79813q0;

    public a(@NotNull T start, @NotNull T endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.f79812p0 = start;
        this.f79813q0 = endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean contains(@NotNull T t10) {
        return OpenEndRange.DefaultImpls.contains(this, t10);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!Intrinsics.areEqual(getStart(), aVar.getStart()) || !Intrinsics.areEqual(getEndExclusive(), aVar.getEndExclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public T getEndExclusive() {
        return this.f79813q0;
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public T getStart() {
        return this.f79812p0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return OpenEndRange.DefaultImpls.isEmpty(this);
    }

    @NotNull
    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
