package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/LazyValueHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", "local", "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class LazyValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f14590a;

    public LazyValueHolder(@NotNull Function0<? extends T> function0) {
        this.f14590a = LazyKt__LazyJVMKt.lazy(function0);
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(@NotNull PersistentCompositionLocalMap map) {
        return (T) this.f14590a.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    @NotNull
    public ProvidedValue<T> toProvided(@NotNull CompositionLocal<T> local) {
        ComposerKt.composeRuntimeError("Cannot produce a provider from a lazy value holder");
        throw new KotlinNothingValueException();
    }
}
