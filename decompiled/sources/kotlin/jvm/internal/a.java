package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.BooleanIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends BooleanIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final boolean[] f79745p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79746q0;

    public a(@NotNull boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79745p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79746q0 < this.f79745p0.length;
    }

    @Override // kotlin.collections.BooleanIterator
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f79745p0;
            int i10 = this.f79746q0;
            this.f79746q0 = i10 + 1;
            return zArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79746q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
