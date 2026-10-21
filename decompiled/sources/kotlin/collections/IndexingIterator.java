package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¨\u0006\n"}, d2 = {"Lkotlin/collections/IndexingIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/collections/IndexedValue;", "", "hasNext", "next", "iterator", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Iterator<T> f79486p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79487q0;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterator(@NotNull Iterator<? extends T> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f79486p0 = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f79486p0.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @NotNull
    public final IndexedValue<T> next() {
        int i10 = this.f79487q0;
        this.f79487q0 = i10 + 1;
        if (i10 < 0) {
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return new IndexedValue<>(i10, this.f79486p0.next());
    }
}
