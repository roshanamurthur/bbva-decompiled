package kotlin.sequences;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¨\u0006\u000f"}, d2 = {"Lkotlin/sequences/SubSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "", "n", "drop", "take", "", "iterator", "sequence", "startIndex", "endIndex", "<init>", "(Lkotlin/sequences/Sequence;II)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sequence<T> f82247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82249c;

    /* JADX INFO: renamed from: kotlin.sequences.SubSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "", "hasNext", "next", "()Ljava/lang/Object;", "p0", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPosition", "()I", "setPosition", "(I)V", "position", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Iterator<T> iterator;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int position;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SubSequence<T> f82252r0;

        public AnonymousClass1(SubSequence<T> subSequence) {
            this.f82252r0 = subSequence;
            this.iterator = subSequence.f82247a.iterator();
        }

        public final void a() {
            while (this.position < this.f82252r0.f82248b) {
                Iterator<T> it = this.iterator;
                if (!it.hasNext()) {
                    return;
                }
                it.next();
                this.position++;
            }
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.position < this.f82252r0.f82249c && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.position >= this.f82252r0.f82249c) {
                throw new NoSuchElementException();
            }
            this.position++;
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setPosition(int i10) {
            this.position = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(@NotNull Sequence<? extends T> sequence, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f82247a = sequence;
        this.f82248b = i10;
        this.f82249c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("startIndex should be non-negative, but is ", i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(g0.c("endIndex should be non-negative, but is ", i11).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(n1.e("endIndex should be not less than startIndex, but was ", i11, " < ", i10).toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> drop(int n7) {
        int i10 = this.f82249c;
        int i11 = this.f82248b;
        if (n7 >= i10 - i11) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return new SubSequence(this.f82247a, i11 + n7, i10);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int n7) {
        int i10 = this.f82249c;
        int i11 = this.f82248b;
        if (n7 >= i10 - i11) {
            return this;
        }
        return new SubSequence(this.f82247a, i11, n7 + i11);
    }
}
