package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/DropWhileSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "", "iterator", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class DropWhileSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T> f82128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<T, Boolean> f82129b;

    /* JADX INFO: renamed from: kotlin.sequences.DropWhileSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0003\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"kotlin/sequences/DropWhileSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "p0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDropState", "()I", "setDropState", "(I)V", "dropState", "r0", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int dropState = -1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public T nextItem;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DropWhileSequence<T> f82133s0;

        public AnonymousClass1(DropWhileSequence<T> dropWhileSequence) {
            this.f82133s0 = dropWhileSequence;
            this.iterator = dropWhileSequence.f82128a.iterator();
        }

        public final void a() {
            T next;
            do {
                Iterator<T> it = this.iterator;
                if (!it.hasNext()) {
                    this.dropState = 0;
                    return;
                }
                next = it.next();
            } while (((Boolean) this.f82133s0.f82129b.invoke(next)).booleanValue());
            this.nextItem = next;
            this.dropState = 1;
        }

        public final int getDropState() {
            return this.dropState;
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        @Nullable
        public final T getNextItem() {
            return this.nextItem;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.dropState == -1) {
                a();
            }
            return this.dropState == 1 || this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.dropState == -1) {
                a();
            }
            if (this.dropState != 1) {
                return this.iterator.next();
            }
            T t10 = this.nextItem;
            this.nextItem = null;
            this.dropState = 0;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setDropState(int i10) {
            this.dropState = i10;
        }

        public final void setNextItem(@Nullable T t10) {
            this.nextItem = t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropWhileSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f82128a = sequence;
        this.f82129b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }
}
