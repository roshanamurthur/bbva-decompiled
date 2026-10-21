package kotlin;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,B\u0011\b\u0001\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010 \u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010(\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"\u0088\u0001.\u0092\u0001\u00020-\u0082\u0002\u0004\n\u0002\b!¨\u00061"}, d2 = {"Lkotlin/UIntArray;", "", "Lkotlin/UInt;", "", FirebaseAnalytics.Param.INDEX, "get-pVg5ArA", "([II)I", "get", "value", "", "set-VXSXFK8", "([III)V", SetCommand.ID, "", "iterator-impl", "([I)Ljava/util/Iterator;", "iterator", "element", "", "contains-WZ4Q5Ns", "([II)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "elements", "containsAll-impl", "([ILjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([I)Z", "isEmpty", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "hashCode-impl", "([I)I", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "getSize-impl", "size", "constructor-impl", "(I)[I", "", "storage", "([I)[I", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
public final class UIntArray implements Collection<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final int[] f79400p0;

    /* JADX INFO: compiled from: UIntArray.kt */
    public static final class a implements Iterator<UInt>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final int[] f79401p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f79402q0;

        public a(@NotNull int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f79401p0 = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79402q0 < this.f79401p0.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UInt next() {
            return UInt.m5569boximpl(m5593nextpVg5ArA());
        }

        /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
        public int m5593nextpVg5ArA() {
            int i10 = this.f79402q0;
            int[] iArr = this.f79401p0;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f79402q0));
            }
            this.f79402q0 = i10 + 1;
            return UInt.m5570constructorimpl(iArr[i10]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ UIntArray(int[] iArr) {
        this.f79400p0 = iArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UIntArray m5576boximpl(int[] iArr) {
        return new UIntArray(iArr);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m5578constructorimpl(@NotNull int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m5580containsAllimpl(int[] iArr, @NotNull Collection<UInt> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<UInt> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UInt) || !ArraysKt___ArraysKt.contains(iArr, ((UInt) obj).getF79399p0())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5581equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof UIntArray) && Intrinsics.areEqual(iArr, ((UIntArray) obj).getF79400p0());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5582equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m5583getpVg5ArA(int[] iArr, int i10) {
        return UInt.m5570constructorimpl(iArr[i10]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m5584getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5585hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m5586isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<UInt> m5587iteratorimpl(int[] iArr) {
        return new a(iArr);
    }

    /* JADX INFO: renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m5588setVXSXFK8(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5589toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + RootService.CLOSE_BRACKET;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UInt uInt) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-WZ4Q5Ns, reason: not valid java name */
    public boolean m5590addWZ4Q5Ns(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m5591containsWZ4Q5Ns(((UInt) obj).getF79399p0());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m5591containsWZ4Q5Ns(int i10) {
        return m5579containsWZ4Q5Ns(this.f79400p0, i10);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m5580containsAllimpl(this.f79400p0, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m5581equalsimpl(this.f79400p0, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m5584getSizeimpl(this.f79400p0);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m5585hashCodeimpl(this.f79400p0);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m5586isEmptyimpl(this.f79400p0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UInt> iterator() {
        return m5587iteratorimpl(this.f79400p0);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return m5589toStringimpl(this.f79400p0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int[] getF79400p0() {
        return this.f79400p0;
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m5577constructorimpl(int i10) {
        return m5578constructorimpl(new int[i10]);
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m5579containsWZ4Q5Ns(int[] iArr, int i10) {
        return ArraysKt___ArraysKt.contains(iArr, i10);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    @PublishedApi
    public static /* synthetic */ void getStorage$annotations() {
    }
}
