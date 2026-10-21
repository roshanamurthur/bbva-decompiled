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

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0017\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,B\u0011\b\u0001\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010 \u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010(\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"\u0088\u0001.\u0092\u0001\u00020-\u0082\u0002\u0004\n\u0002\b!¨\u00061"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "", FirebaseAnalytics.Param.INDEX, "get-Mh2AYeg", "([SI)S", "get", "value", "", "set-01HTLdE", "([SIS)V", SetCommand.ID, "", "iterator-impl", "([S)Ljava/util/Iterator;", "iterator", "element", "", "contains-xj2QHRw", "([SS)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([S)Z", "isEmpty", "", "toString-impl", "([S)Ljava/lang/String;", "toString", "hashCode-impl", "([S)I", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals-impl", "([SLjava/lang/Object;)Z", "equals", "getSize-impl", "size", "constructor-impl", "(I)[S", "", "storage", "([S)[S", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
public final class UShortArray implements Collection<UShort>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final short[] f79408p0;

    /* JADX INFO: compiled from: UShortArray.kt */
    public static final class a implements Iterator<UShort>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final short[] f79409p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f79410q0;

        public a(@NotNull short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f79409p0 = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79410q0 < this.f79409p0.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UShort next() {
            return UShort.m5619boximpl(m5643nextMh2AYeg());
        }

        /* JADX INFO: renamed from: next-Mh2AYeg, reason: not valid java name */
        public short m5643nextMh2AYeg() {
            int i10 = this.f79410q0;
            short[] sArr = this.f79409p0;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f79410q0));
            }
            this.f79410q0 = i10 + 1;
            return UShort.m5620constructorimpl(sArr[i10]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ UShortArray(short[] sArr) {
        this.f79408p0 = sArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShortArray m5626boximpl(short[] sArr) {
        return new UShortArray(sArr);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short[] m5628constructorimpl(@NotNull short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m5630containsAllimpl(short[] sArr, @NotNull Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<UShort> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UShort) || !ArraysKt___ArraysKt.contains(sArr, ((UShort) obj).getF79407p0())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5631equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof UShortArray) && Intrinsics.areEqual(sArr, ((UShortArray) obj).getF79408p0());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5632equalsimpl0(short[] sArr, short[] sArr2) {
        return Intrinsics.areEqual(sArr, sArr2);
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m5633getMh2AYeg(short[] sArr, int i10) {
        return UShort.m5620constructorimpl(sArr[i10]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m5634getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5635hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m5636isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<UShort> m5637iteratorimpl(short[] sArr) {
        return new a(sArr);
    }

    /* JADX INFO: renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m5638set01HTLdE(short[] sArr, int i10, short s4) {
        sArr[i10] = s4;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5639toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + RootService.CLOSE_BRACKET;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UShort uShort) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-xj2QHRw, reason: not valid java name */
    public boolean m5640addxj2QHRw(short s4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UShort> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m5641containsxj2QHRw(((UShort) obj).getF79407p0());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m5641containsxj2QHRw(short s4) {
        return m5629containsxj2QHRw(this.f79408p0, s4);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m5630containsAllimpl(this.f79408p0, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m5631equalsimpl(this.f79408p0, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m5634getSizeimpl(this.f79408p0);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m5635hashCodeimpl(this.f79408p0);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m5636isEmptyimpl(this.f79408p0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UShort> iterator() {
        return m5637iteratorimpl(this.f79408p0);
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
        return m5639toStringimpl(this.f79408p0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short[] getF79408p0() {
        return this.f79408p0;
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short[] m5627constructorimpl(int i10) {
        return m5628constructorimpl(new short[i10]);
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m5629containsxj2QHRw(short[] sArr, short s4) {
        return ArraysKt___ArraysKt.contains(sArr, s4);
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
