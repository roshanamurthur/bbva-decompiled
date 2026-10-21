package kotlin.sequences;

import androidx.collection.g;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¨\u0006\u000e"}, d2 = {"Lkotlin/sequences/DropSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "", "n", "drop", "take", "", "iterator", "sequence", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T> f82124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82125b;

    /* JADX INFO: renamed from: kotlin.sequences.DropSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "p0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLeft", "()I", "setLeft", "(I)V", Parameters.DIRECTION.LEFT, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int left;

        public AnonymousClass1(DropSequence<T> dropSequence) {
            this.iterator = dropSequence.f82124a.iterator();
            this.left = dropSequence.f82125b;
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
            Iterator<T> it;
            while (true) {
                int i10 = this.left;
                it = this.iterator;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.left--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            Iterator<T> it;
            while (true) {
                int i10 = this.left;
                it = this.iterator;
                if (i10 <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.left--;
            }
            return it.next();
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
    public DropSequence(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f82124a = sequence;
        this.f82125b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(g.a("count must be non-negative, but was ", i10, '.').toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> drop(int n7) {
        int i10 = this.f82125b + n7;
        return i10 < 0 ? new DropSequence(this, n7) : new DropSequence(this.f82124a, i10);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int n7) {
        int i10 = this.f82125b;
        int i11 = i10 + n7;
        return i11 < 0 ? new TakeSequence(this, n7) : new SubSequence(this.f82124a, i10, i11);
    }
}
