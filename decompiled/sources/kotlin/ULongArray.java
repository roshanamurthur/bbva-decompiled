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

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,B\u0011\b\u0001\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010 \u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010(\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"\u0088\u0001.\u0092\u0001\u00020-\u0082\u0002\u0004\n\u0002\b!¨\u00061"}, d2 = {"Lkotlin/ULongArray;", "", "Lkotlin/ULong;", "", FirebaseAnalytics.Param.INDEX, "get-s-VKNKU", "([JI)J", "get", "value", "", "set-k8EXiF4", "([JIJ)V", SetCommand.ID, "", "iterator-impl", "([J)Ljava/util/Iterator;", "iterator", "element", "", "contains-VKZWuLQ", "([JJ)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "elements", "containsAll-impl", "([JLjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([J)Z", "isEmpty", "", "toString-impl", "([J)Ljava/lang/String;", "toString", "hashCode-impl", "([J)I", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals-impl", "([JLjava/lang/Object;)Z", "equals", "getSize-impl", "size", "constructor-impl", "(I)[J", "", "storage", "([J)[J", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
public final class ULongArray implements Collection<ULong>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final long[] f79404p0;

    /* JADX INFO: compiled from: ULongArray.kt */
    public static final class a implements Iterator<ULong>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final long[] f79405p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f79406q0;

        public a(@NotNull long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f79405p0 = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79406q0 < this.f79405p0.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ULong next() {
            return ULong.m5594boximpl(m5618nextsVKNKU());
        }

        /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
        public long m5618nextsVKNKU() {
            int i10 = this.f79406q0;
            long[] jArr = this.f79405p0;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f79406q0));
            }
            this.f79406q0 = i10 + 1;
            return ULong.m5595constructorimpl(jArr[i10]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @PublishedApi
    public /* synthetic */ ULongArray(long[] jArr) {
        this.f79404p0 = jArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULongArray m5601boximpl(long[] jArr) {
        return new ULongArray(jArr);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long[] m5603constructorimpl(@NotNull long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m5605containsAllimpl(long[] jArr, @NotNull Collection<ULong> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<ULong> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof ULong) || !ArraysKt___ArraysKt.contains(jArr, ((ULong) obj).getF79403p0())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5606equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.areEqual(jArr, ((ULongArray) obj).getF79404p0());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5607equalsimpl0(long[] jArr, long[] jArr2) {
        return Intrinsics.areEqual(jArr, jArr2);
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m5608getsVKNKU(long[] jArr, int i10) {
        return ULong.m5595constructorimpl(jArr[i10]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m5609getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5610hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m5611isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<ULong> m5612iteratorimpl(long[] jArr) {
        return new a(jArr);
    }

    /* JADX INFO: renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m5613setk8EXiF4(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5614toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + RootService.CLOSE_BRACKET;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ULong uLong) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-VKZWuLQ, reason: not valid java name */
    public boolean m5615addVKZWuLQ(long j10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ULong> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m5616containsVKZWuLQ(((ULong) obj).getF79403p0());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m5616containsVKZWuLQ(long j10) {
        return m5604containsVKZWuLQ(this.f79404p0, j10);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m5605containsAllimpl(this.f79404p0, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m5606equalsimpl(this.f79404p0, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m5609getSizeimpl(this.f79404p0);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m5610hashCodeimpl(this.f79404p0);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m5611isEmptyimpl(this.f79404p0);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<ULong> iterator() {
        return m5612iteratorimpl(this.f79404p0);
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
        return m5614toStringimpl(this.f79404p0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long[] getF79404p0() {
        return this.f79404p0;
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long[] m5602constructorimpl(int i10) {
        return m5603constructorimpl(new long[i10]);
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m5604containsVKZWuLQ(long[] jArr, long j10) {
        return ArraysKt___ArraysKt.contains(jArr, j10);
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
