package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class f extends IntIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final int[] f79755p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79756q0;

    public f(@NotNull int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79755p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79756q0 < this.f79755p0.length;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        try {
            int[] iArr = this.f79755p0;
            int i10 = this.f79756q0;
            this.f79756q0 = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79756q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
