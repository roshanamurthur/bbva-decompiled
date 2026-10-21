package dk;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class j<T> implements Comparator<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Comparator<T> f68194p0;

    public j(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f68194p0 = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f68194p0.compare(t11, t10);
    }

    @NotNull
    public final Comparator<T> getComparator() {
        return this.f68194p0;
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.f68194p0;
    }
}
