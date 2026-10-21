package kotlin.collections;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import bk.d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
public final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Object[] f79497p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f79498q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f79499r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79500s0;

    public RingBuffer(@NotNull Object[] buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f79497p0 = buffer;
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("ring buffer filled size should not be negative but it is ", i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f79498q0 = buffer.length;
            this.f79500s0 = i10;
        } else {
            StringBuilder sbC = o1.c("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
            sbC.append(buffer.length);
            throw new IllegalArgumentException(sbC.toString().toString());
        }
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T t10) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f79497p0[(size() + this.f79499r0) % this.f79498q0] = t10;
        this.f79500s0 = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final RingBuffer<T> expanded(int i10) {
        Object[] array;
        int i11 = this.f79498q0;
        int iCoerceAtMost = c.coerceAtMost(i11 + (i11 >> 1) + 1, i10);
        if (this.f79499r0 == 0) {
            array = Arrays.copyOf(this.f79497p0, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iCoerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i10) {
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(i10, size());
        return (T) this.f79497p0[(this.f79499r0 + i10) % this.f79498q0];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f79500s0;
    }

    public final boolean isFull() {
        return size() == this.f79498q0;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer.iterator.1

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f79501r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f79502s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ RingBuffer<T> f79503t0;

            {
                this.f79503t0 = this;
                this.f79501r0 = this.size();
                this.f79502s0 = this.f79499r0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                if (this.f79501r0 == 0) {
                    done();
                    return;
                }
                RingBuffer<T> ringBuffer = this.f79503t0;
                setNext(ringBuffer.f79497p0[this.f79502s0]);
                this.f79502s0 = (this.f79502s0 + 1) % ringBuffer.f79498q0;
                this.f79501r0--;
            }
        };
    }

    public final void removeFirst(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("n shouldn't be negative but it is ", i10).toString());
        }
        if (i10 > size()) {
            StringBuilder sbC = o1.c("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            sbC.append(size());
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        if (i10 > 0) {
            int i11 = this.f79499r0;
            int i12 = (i11 + i10) % this.f79498q0;
            Object[] objArr = this.f79497p0;
            if (i11 > i12) {
                ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i11, this.f79498q0);
                ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, 0, i12);
            } else {
                ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i11, i12);
            }
            this.f79499r0 = i12;
            this.f79500s0 = size() - i10;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        Object[] objArr2 = array;
        if (length < size()) {
            Object[] objArr3 = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(objArr3, "copyOf(...)");
            objArr2 = objArr3;
        }
        int size = size();
        int i10 = this.f79499r0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f79497p0;
            if (i12 >= size || i10 >= this.f79498q0) {
                break;
            }
            objArr2[i12] = objArr[i10];
            i12++;
            i10++;
        }
        while (i12 < size) {
            objArr2[i12] = objArr[i11];
            i12++;
            i11++;
        }
        return (T[]) d.terminateCollectionToArray(size, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public RingBuffer(int i10) {
        this(new Object[i10], 0);
    }
}
