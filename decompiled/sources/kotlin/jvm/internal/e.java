package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.FloatIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends FloatIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final float[] f79753p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79754q0;

    public e(@NotNull float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79753p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79754q0 < this.f79753p0.length;
    }

    @Override // kotlin.collections.FloatIterator
    public float nextFloat() {
        try {
            float[] fArr = this.f79753p0;
            int i10 = this.f79754q0;
            this.f79754q0 = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79754q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
