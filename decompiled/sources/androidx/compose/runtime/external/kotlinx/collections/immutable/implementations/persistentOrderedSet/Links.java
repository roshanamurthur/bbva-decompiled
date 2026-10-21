package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentOrderedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0016B\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "", "newNext", "withNext", "newPrevious", "withPrevious", "a", "Ljava/lang/Object;", "getPrevious", "()Ljava/lang/Object;", "previous", "b", "getNext", "next", "", "getHasNext", "()Z", "hasNext", "getHasPrevious", "hasPrevious", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class Links {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object previous;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object next;

    public Links(@Nullable Object obj, @Nullable Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }

    @Nullable
    public final Object getNext() {
        return this.next;
    }

    @Nullable
    public final Object getPrevious() {
        return this.previous;
    }

    @NotNull
    public final Links withNext(@Nullable Object newNext) {
        return new Links(this.previous, newNext);
    }

    @NotNull
    public final Links withPrevious(@Nullable Object newPrevious) {
        return new Links(newPrevious, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Links() {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this(endOfChain, endOfChain);
    }

    public Links(@Nullable Object obj) {
        this(obj, EndOfChain.INSTANCE);
    }
}
