package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class g<T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final T[] f79757p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79758q0;

    public g(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79757p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79758q0 < this.f79757p0.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f79757p0;
            int i10 = this.f79758q0;
            this.f79758q0 = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79758q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
