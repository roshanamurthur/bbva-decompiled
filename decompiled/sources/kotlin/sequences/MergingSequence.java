package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B=\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002¨\u0006\r"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/sequences/Sequence;", "", "iterator", "sequence1", "sequence2", "Lkotlin/Function2;", "transform", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T1> f82155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Sequence<T2> f82156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function2<T1, T2, V> f82157c;

    /* JADX INFO: renamed from: kotlin.sequences.MergingSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "p0", "Ljava/util/Iterator;", "getIterator1", "()Ljava/util/Iterator;", "iterator1", "q0", "getIterator2", "iterator2", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<V>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T1> iterator1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T2> iterator2;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MergingSequence<T1, T2, V> f82160r0;

        public AnonymousClass1(MergingSequence<T1, T2, V> mergingSequence) {
            this.f82160r0 = mergingSequence;
            this.iterator1 = mergingSequence.f82155a.iterator();
            this.iterator2 = mergingSequence.f82156b.iterator();
        }

        @NotNull
        public final Iterator<T1> getIterator1() {
            return this.iterator1;
        }

        @NotNull
        public final Iterator<T2> getIterator2() {
            return this.iterator2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator1.hasNext() && this.iterator2.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f82160r0.f82157c.invoke(this.iterator1.next(), this.iterator2.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(@NotNull Sequence<? extends T1> sequence1, @NotNull Sequence<? extends T2> sequence2, @NotNull Function2<? super T1, ? super T2, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f82155a = sequence1;
        this.f82156b = sequence2;
        this.f82157c = transform;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<V> iterator() {
        return new AnonymousClass1(this);
    }
}
