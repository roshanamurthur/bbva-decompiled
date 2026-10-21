package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class i extends ShortIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final short[] f79761p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79762q0;

    public i(@NotNull short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79761p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79762q0 < this.f79761p0.length;
    }

    @Override // kotlin.collections.ShortIterator
    public short nextShort() {
        try {
            short[] sArr = this.f79761p0;
            int i10 = this.f79762q0;
            this.f79762q0 = i10 + 1;
            return sArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79762q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
