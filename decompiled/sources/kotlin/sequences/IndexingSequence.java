package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0096\u0002¨\u0006\t"}, d2 = {"Lkotlin/sequences/IndexingSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "", "iterator", "sequence", "<init>", "(Lkotlin/sequences/Sequence;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T> f82152a;

    /* JADX INFO: renamed from: kotlin.sequences.IndexingSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", "next", "", "hasNext", "p0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int index;

        public AnonymousClass1(IndexingSequence<T> indexingSequence) {
            this.iterator = indexingSequence.f82152a.iterator();
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }

        @Override // java.util.Iterator
        @NotNull
        public IndexedValue<T> next() {
            int i10 = this.index;
            this.index = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            return new IndexedValue<>(i10, this.iterator.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingSequence(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f82152a = sequence;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<IndexedValue<T>> iterator() {
        return new AnonymousClass1(this);
    }
}
