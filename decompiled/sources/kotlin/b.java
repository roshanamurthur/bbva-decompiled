package kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlin/b;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "isInitialized", "", "toString", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "lock", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class b<T> implements Lazy<T>, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Function0<? extends T> f79414p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public volatile Object f79415q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Object f79416r0;

    public b(@NotNull Function0<? extends T> initializer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f79414p0 = initializer;
        this.f79415q0 = UNINITIALIZED_VALUE.INSTANCE;
        this.f79416r0 = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T tInvoke;
        T t10 = (T) this.f79415q0;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.INSTANCE;
        if (t10 != uninitialized_value) {
            return t10;
        }
        synchronized (this.f79416r0) {
            tInvoke = (T) this.f79415q0;
            if (tInvoke == uninitialized_value) {
                Function0<? extends T> function0 = this.f79414p0;
                Intrinsics.checkNotNull(function0);
                tInvoke = function0.invoke();
                this.f79415q0 = tInvoke;
                this.f79414p0 = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f79415q0 != UNINITIALIZED_VALUE.INSTANCE;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ b(Function0 function0, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i10 & 2) != 0 ? null : obj);
    }
}
