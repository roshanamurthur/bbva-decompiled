package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ByteIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends ByteIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f79747p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79748q0;

    public b(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79747p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79748q0 < this.f79747p0.length;
    }

    @Override // kotlin.collections.ByteIterator
    public byte nextByte() {
        try {
            byte[] bArr = this.f79747p0;
            int i10 = this.f79748q0;
            this.f79748q0 = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79748q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
