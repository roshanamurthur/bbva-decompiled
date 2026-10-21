package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J5\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/sequences/TransformingSequence;", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlin/sequences/Sequence;", "", "iterator", ExifInterface.LONGITUDE_EAST, "Lkotlin/Function1;", "flatten$kotlin_stdlib", "(Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "flatten", "sequence", "transformer", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class TransformingSequence<T, R> implements Sequence<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T> f82268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<T, R> f82269b;

    /* JADX INFO: renamed from: kotlin.sequences.TransformingSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "p0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<R>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TransformingSequence<T, R> f82271q0;

        public AnonymousClass1(TransformingSequence<T, R> transformingSequence) {
            this.f82271q0 = transformingSequence;
            this.iterator = transformingSequence.f82268a.iterator();
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
        public R next() {
            return (R) this.f82271q0.f82269b.invoke(this.iterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f82268a = sequence;
        this.f82269b = transformer;
    }

    @NotNull
    public final <E> Sequence<E> flatten$kotlin_stdlib(@NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new FlatteningSequence(this.f82268a, this.f82269b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<R> iterator() {
        return new AnonymousClass1(this);
    }
}
