package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.DoubleIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends DoubleIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final double[] f79751p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79752q0;

    public d(@NotNull double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79751p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79752q0 < this.f79751p0.length;
    }

    @Override // kotlin.collections.DoubleIterator
    public double nextDouble() {
        try {
            double[] dArr = this.f79751p0;
            int i10 = this.f79752q0;
            this.f79752q0 = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79752q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
