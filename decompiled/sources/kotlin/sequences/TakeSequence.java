package kotlin.sequences;

import androidx.collection.g;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¨\u0006\u000e"}, d2 = {"Lkotlin/sequences/TakeSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "", "n", "drop", "take", "", "iterator", "sequence", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class TakeSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T> f82253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82254b;

    /* JADX INFO: renamed from: kotlin.sequences.TakeSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLeft", "()I", "setLeft", "(I)V", Parameters.DIRECTION.LEFT, "q0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public int left;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T> iterator;

        public AnonymousClass1(TakeSequence<T> takeSequence) {
            this.left = takeSequence.f82254b;
            this.iterator = takeSequence.f82253a.iterator();
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final int getLeft() {
            return this.left;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.left > 0 && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.left;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.left = i10 - 1;
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i10) {
            this.left = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakeSequence(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f82253a = sequence;
        this.f82254b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(g.a("count must be non-negative, but was ", i10, '.').toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> drop(int n7) {
        int i10 = this.f82254b;
        return n7 >= i10 ? SequencesKt__SequencesKt.emptySequence() : new SubSequence(this.f82253a, n7, i10);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int n7) {
        return n7 >= this.f82254b ? this : new TakeSequence(this.f82253a, n7);
    }
}
