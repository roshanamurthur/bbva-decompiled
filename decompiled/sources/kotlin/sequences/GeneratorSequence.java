package kotlin.sequences;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class GeneratorSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<T> f82147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<T, T> f82148b;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002R$\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0003\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "p0", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public T nextItem;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int nextState = -2;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ GeneratorSequence<T> f82151r0;

        public AnonymousClass1(GeneratorSequence<T> generatorSequence) {
            this.f82151r0 = generatorSequence;
        }

        public final void a() {
            T t10;
            int i10 = this.nextState;
            GeneratorSequence<T> generatorSequence = this.f82151r0;
            if (i10 == -2) {
                t10 = (T) generatorSequence.f82147a.invoke();
            } else {
                Function1 function1 = generatorSequence.f82148b;
                T t11 = this.nextItem;
                Intrinsics.checkNotNull(t11);
                t10 = (T) function1.invoke(t11);
            }
            this.nextItem = t10;
            this.nextState = t10 == null ? 0 : 1;
        }

        @Nullable
        public final T getNextItem() {
            return this.nextItem;
        }

        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState < 0) {
                a();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        @NotNull
        public T next() {
            if (this.nextState < 0) {
                a();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.nextItem;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.nextState = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(@Nullable T t10) {
            this.nextItem = t10;
        }

        public final void setNextState(int i10) {
            this.nextState = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(@NotNull Function0<? extends T> getInitialValue, @NotNull Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f82147a = getInitialValue;
        this.f82148b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }
}
