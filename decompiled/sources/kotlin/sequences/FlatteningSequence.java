package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002¨\u0006\f"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", ExifInterface.GPS_DIRECTION_TRUE, "R", ExifInterface.LONGITUDE_EAST, "Lkotlin/sequences/Sequence;", "", "iterator", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T> f82141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<T, R> f82142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<R, Iterator<E>> f82143c;

    /* JADX INFO: renamed from: kotlin.sequences.FlatteningSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "p0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "q0", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<E>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Iterator<? extends E> itemIterator;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FlatteningSequence<T, R, E> f82146r0;

        public AnonymousClass1(FlatteningSequence<T, R, E> flatteningSequence) {
            this.f82146r0 = flatteningSequence;
            this.iterator = flatteningSequence.f82141a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.itemIterator;
            if (it != null && !it.hasNext()) {
                this.itemIterator = null;
            }
            while (this.itemIterator == null) {
                Iterator<T> it2 = this.iterator;
                if (!it2.hasNext()) {
                    return false;
                }
                T next = it2.next();
                FlatteningSequence<T, R, E> flatteningSequence = this.f82146r0;
                Iterator<? extends E> it3 = (Iterator) flatteningSequence.f82143c.invoke(flatteningSequence.f82142b.invoke(next));
                if (it3.hasNext()) {
                    this.itemIterator = it3;
                    break;
                }
            }
            return true;
        }

        @Nullable
        public final Iterator<E> getItemIterator() {
            return this.itemIterator;
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.itemIterator;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setItemIterator(@Nullable Iterator<? extends E> it) {
            this.itemIterator = it;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f82141a = sequence;
        this.f82142b = transformer;
        this.f82143c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<E> iterator() {
        return new AnonymousClass1(this);
    }
}
