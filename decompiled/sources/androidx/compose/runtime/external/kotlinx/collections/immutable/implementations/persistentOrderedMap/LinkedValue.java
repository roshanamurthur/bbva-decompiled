package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentOrderedMap.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001dB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u000e\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "newValue", "withValue", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "newPrevious", "withPrevious", "newNext", "withNext", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "b", "getPrevious", "previous", "c", "getNext", "next", "", "getHasNext", "()Z", "hasNext", "getHasPrevious", "hasPrevious", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class LinkedValue<V> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final V value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object previous;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object next;

    public LinkedValue(V v3, @Nullable Object obj, @Nullable Object obj2) {
        this.value = v3;
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

    public final V getValue() {
        return this.value;
    }

    @NotNull
    public final LinkedValue<V> withNext(@Nullable Object newNext) {
        return new LinkedValue<>(this.value, this.previous, newNext);
    }

    @NotNull
    public final LinkedValue<V> withPrevious(@Nullable Object newPrevious) {
        return new LinkedValue<>(this.value, newPrevious, this.next);
    }

    @NotNull
    public final LinkedValue<V> withValue(V newValue) {
        return new LinkedValue<>(newValue, this.previous, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkedValue(V v3) {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this(v3, endOfChain, endOfChain);
    }

    public LinkedValue(V v3, @Nullable Object obj) {
        this(v3, obj, EndOfChain.INSTANCE);
    }
}
