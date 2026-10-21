package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterators.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends CharIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final char[] f79749p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79750q0;

    public c(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f79749p0 = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f79750q0 < this.f79749p0.length;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        try {
            char[] cArr = this.f79749p0;
            int i10 = this.f79750q0;
            this.f79750q0 = i10 + 1;
            return cArr[i10];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f79750q0--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
