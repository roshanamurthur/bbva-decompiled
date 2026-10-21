package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class h extends LongIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final long[] f79759p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79760q0;

    public h(@NotNull long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79759p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79760q0 < this.f79759p0.length;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        try {
            long[] jArr = this.f79759p0;
            int i10 = this.f79760q0;
            this.f79760q0 = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79760q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
