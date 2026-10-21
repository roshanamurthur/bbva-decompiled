package androidx.collection;

import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CircularIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0011\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0010R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "", "element", "", "addFirst", "addLast", "popFirst", "popLast", ClearCommand.ID, "count", "removeFromStart", "removeFromEnd", FirebaseAnalytics.Param.INDEX, "get", "size", "", "isEmpty", "getFirst", "()I", "first", "getLast", "last", "minCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
public final class CircularIntArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f2362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2365d;

    @JvmOverloads
    public CircularIntArray() {
        this(0, 1, null);
    }

    public final void a() {
        int[] iArr = this.f2362a;
        int length = iArr.length;
        int i10 = this.f2363b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, i10, length);
        ArraysKt___ArraysJvmKt.copyInto(this.f2362a, iArr2, i11, 0, this.f2363b);
        this.f2362a = iArr2;
        this.f2363b = 0;
        this.f2364c = length;
        this.f2365d = i12 - 1;
    }

    public final void addFirst(int element) {
        int i10 = (this.f2363b - 1) & this.f2365d;
        this.f2363b = i10;
        this.f2362a[i10] = element;
        if (i10 == this.f2364c) {
            a();
        }
    }

    public final void addLast(int element) {
        int[] iArr = this.f2362a;
        int i10 = this.f2364c;
        iArr[i10] = element;
        int i11 = this.f2365d & (i10 + 1);
        this.f2364c = i11;
        if (i11 == this.f2363b) {
            a();
        }
    }

    public final void clear() {
        this.f2364c = this.f2363b;
    }

    public final int get(int index) {
        if (index < 0 || index >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f2362a[this.f2365d & (this.f2363b + index)];
    }

    public final int getFirst() {
        int i10 = this.f2363b;
        if (i10 != this.f2364c) {
            return this.f2362a[i10];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getLast() {
        int i10 = this.f2363b;
        int i11 = this.f2364c;
        if (i10 != i11) {
            return this.f2362a[(i11 - 1) & this.f2365d];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        return this.f2363b == this.f2364c;
    }

    public final int popFirst() {
        int i10 = this.f2363b;
        if (i10 == this.f2364c) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f2362a[i10];
        this.f2363b = (i10 + 1) & this.f2365d;
        return i11;
    }

    public final int popLast() {
        int i10 = this.f2363b;
        int i11 = this.f2364c;
        if (i10 == i11) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f2365d & (i11 - 1);
        int i13 = this.f2362a[i12];
        this.f2364c = i12;
        return i13;
    }

    public final void removeFromEnd(int count) {
        if (count <= 0) {
            return;
        }
        if (count > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f2364c = this.f2365d & (this.f2364c - count);
    }

    public final void removeFromStart(int count) {
        if (count <= 0) {
            return;
        }
        if (count > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f2363b = this.f2365d & (this.f2363b + count);
    }

    public final int size() {
        return (this.f2364c - this.f2363b) & this.f2365d;
    }

    @JvmOverloads
    public CircularIntArray(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30".toString());
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f2365d = i10 - 1;
        this.f2362a = new int[i10];
    }

    public /* synthetic */ CircularIntArray(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
