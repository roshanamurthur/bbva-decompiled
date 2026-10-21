package kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u0015*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0016B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "isInitialized", "", "toString", "q0", "Ljava/lang/Object;", "_value", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "r0", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f79389s0 = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "q0");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public volatile Function0<? extends T> f79390p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile Object _value;

    public SafePublicationLazyImpl(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f79390p0 = initializer;
        this._value = UNINITIALIZED_VALUE.INSTANCE;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t10 = (T) this._value;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.INSTANCE;
        if (t10 != uninitialized_value) {
            return t10;
        }
        Function0<? extends T> function0 = this.f79390p0;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = f79389s0;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, uninitialized_value, tInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != uninitialized_value) {
                }
            }
            this.f79390p0 = null;
            return tInvoke;
        }
        return (T) this._value;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this._value != UNINITIALIZED_VALUE.INSTANCE;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
