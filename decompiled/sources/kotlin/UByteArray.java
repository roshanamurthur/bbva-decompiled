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

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,B\u0011\b\u0001\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010 \u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010(\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"\u0088\u0001.\u0092\u0001\u00020-\u0082\u0002\u0004\n\u0002\b!¨\u00061"}, d2 = {"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "", FirebaseAnalytics.Param.INDEX, "get-w2LRezQ", "([BI)B", "get", "value", "", "set-VurrAj0", "([BIB)V", SetCommand.ID, "", "iterator-impl", "([B)Ljava/util/Iterator;", "iterator", "element", "", "contains-7apg3OU", "([BB)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "elements", "containsAll-impl", "([BLjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([B)Z", "isEmpty", "", "toString-impl", "([B)Ljava/lang/String;", "toString", "hashCode-impl", "([B)I", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals-impl", "([BLjava/lang/Object;)Z", "equals", "getSize-impl", "size", "constructor-impl", "(I)[B", "", "storage", "([B)[B", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
public final class UByteArray implements Collection<UByte>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f79396p0;

    /* JADX INFO: compiled from: UByteArray.kt */
    public static final class a implements Iterator<UByte>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final byte[] f79397p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f79398q0;

        public a(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f79397p0 = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79398q0 < this.f79397p0.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UByte next() {
            return UByte.m5544boximpl(m5568nextw2LRezQ());
        }

        /* JADX INFO: renamed from: next-w2LRezQ, reason: not valid java name */
        public byte m5568nextw2LRezQ() {
            int i10 = this.f79398q0;
            byte[] bArr = this.f79397p0;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f79398q0));
            }
            this.f79398q0 = i10 + 1;
            return UByte.m5545constructorimpl(bArr[i10]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ UByteArray(byte[] bArr) {
        this.f79396p0 = bArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByteArray m5551boximpl(byte[] bArr) {
        return new UByteArray(bArr);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m5553constructorimpl(@NotNull byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m5555containsAllimpl(byte[] bArr, @NotNull Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<UByte> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UByte) || !ArraysKt___ArraysKt.contains(bArr, ((UByte) obj).getF79395p0())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5556equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.areEqual(bArr, ((UByteArray) obj).getF79396p0());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5557equalsimpl0(byte[] bArr, byte[] bArr2) {
        return Intrinsics.areEqual(bArr, bArr2);
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m5558getw2LRezQ(byte[] bArr, int i10) {
        return UByte.m5545constructorimpl(bArr[i10]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m5559getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5560hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m5561isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<UByte> m5562iteratorimpl(byte[] bArr) {
        return new a(bArr);
    }

    /* JADX INFO: renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m5563setVurrAj0(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5564toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + RootService.CLOSE_BRACKET;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-7apg3OU, reason: not valid java name */
    public boolean m5565add7apg3OU(byte b10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m5566contains7apg3OU(((UByte) obj).getF79395p0());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m5566contains7apg3OU(byte b10) {
        return m5554contains7apg3OU(this.f79396p0, b10);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m5555containsAllimpl(this.f79396p0, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m5556equalsimpl(this.f79396p0, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m5559getSizeimpl(this.f79396p0);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m5560hashCodeimpl(this.f79396p0);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m5561isEmptyimpl(this.f79396p0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<UByte> iterator() {
        return m5562iteratorimpl(this.f79396p0);
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
        return m5564toStringimpl(this.f79396p0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte[] getF79396p0() {
        return this.f79396p0;
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m5552constructorimpl(int i10) {
        return m5553constructorimpl(new byte[i10]);
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m5554contains7apg3OU(byte[] bArr, byte b10) {
        return ArraysKt___ArraysKt.contains(bArr, b10);
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
