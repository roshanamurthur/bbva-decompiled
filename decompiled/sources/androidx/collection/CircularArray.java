package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CircularArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\tJ\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u0014R\u0011\u0010\u0017\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0011\u0010\u0019\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\t¨\u0006\u001d"}, d2 = {"Landroidx/collection/CircularArray;", ExifInterface.LONGITUDE_EAST, "", "element", "", "addFirst", "(Ljava/lang/Object;)V", "addLast", "popFirst", "()Ljava/lang/Object;", "popLast", ClearCommand.ID, "", "count", "removeFromStart", "removeFromEnd", FirebaseAnalytics.Param.INDEX, "get", "(I)Ljava/lang/Object;", "size", "", "isEmpty", "getFirst", "first", "getLast", "last", "minCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
public final class CircularArray<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public E[] f2358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2361d;

    @JvmOverloads
    public CircularArray() {
        this(0, 1, null);
    }

    public final void a() {
        E[] eArr = this.f2358a;
        int length = eArr.length;
        int i10 = this.f2359b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        ArraysKt___ArraysJvmKt.copyInto(eArr, eArr2, 0, i10, length);
        ArraysKt___ArraysJvmKt.copyInto(this.f2358a, eArr2, i11, 0, this.f2359b);
        this.f2358a = eArr2;
        this.f2359b = 0;
        this.f2360c = length;
        this.f2361d = i12 - 1;
    }

    public final void addFirst(E element) {
        int i10 = (this.f2359b - 1) & this.f2361d;
        this.f2359b = i10;
        this.f2358a[i10] = element;
        if (i10 == this.f2360c) {
            a();
        }
    }

    public final void addLast(E element) {
        E[] eArr = this.f2358a;
        int i10 = this.f2360c;
        eArr[i10] = element;
        int i11 = this.f2361d & (i10 + 1);
        this.f2360c = i11;
        if (i11 == this.f2359b) {
            a();
        }
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final E get(int index) {
        if (index < 0 || index >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e5 = this.f2358a[this.f2361d & (this.f2359b + index)];
        Intrinsics.checkNotNull(e5);
        return e5;
    }

    public final E getFirst() {
        int i10 = this.f2359b;
        if (i10 == this.f2360c) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e5 = this.f2358a[i10];
        Intrinsics.checkNotNull(e5);
        return e5;
    }

    public final E getLast() {
        int i10 = this.f2359b;
        int i11 = this.f2360c;
        if (i10 == i11) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e5 = this.f2358a[(i11 - 1) & this.f2361d];
        Intrinsics.checkNotNull(e5);
        return e5;
    }

    public final boolean isEmpty() {
        return this.f2359b == this.f2360c;
    }

    public final E popFirst() {
        int i10 = this.f2359b;
        if (i10 == this.f2360c) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f2358a;
        E e5 = eArr[i10];
        eArr[i10] = null;
        this.f2359b = (i10 + 1) & this.f2361d;
        return e5;
    }

    public final E popLast() {
        int i10 = this.f2359b;
        int i11 = this.f2360c;
        if (i10 == i11) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f2361d & (i11 - 1);
        E[] eArr = this.f2358a;
        E e5 = eArr[i12];
        eArr[i12] = null;
        this.f2360c = i12;
        return e5;
    }

    public final void removeFromEnd(int count) {
        if (count <= 0) {
            return;
        }
        if (count > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = this.f2360c;
        int i11 = count < i10 ? i10 - count : 0;
        for (int i12 = i11; i12 < i10; i12++) {
            this.f2358a[i12] = null;
        }
        int i13 = this.f2360c;
        int i14 = i13 - i11;
        int i15 = count - i14;
        this.f2360c = i13 - i14;
        if (i15 > 0) {
            int length = this.f2358a.length;
            this.f2360c = length;
            int i16 = length - i15;
            for (int i17 = i16; i17 < length; i17++) {
                this.f2358a[i17] = null;
            }
            this.f2360c = i16;
        }
    }

    public final void removeFromStart(int count) {
        if (count <= 0) {
            return;
        }
        if (count > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f2358a.length;
        int i10 = this.f2359b;
        if (count < length - i10) {
            length = i10 + count;
        }
        while (i10 < length) {
            this.f2358a[i10] = null;
            i10++;
        }
        int i11 = this.f2359b;
        int i12 = length - i11;
        int i13 = count - i12;
        this.f2359b = this.f2361d & (i11 + i12);
        if (i13 > 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                this.f2358a[i14] = null;
            }
            this.f2359b = i13;
        }
    }

    public final int size() {
        return (this.f2360c - this.f2359b) & this.f2361d;
    }

    @JvmOverloads
    public CircularArray(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30".toString());
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f2361d = i10 - 1;
        this.f2358a = (E[]) new Object[i10];
    }

    public /* synthetic */ CircularArray(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
