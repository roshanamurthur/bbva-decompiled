package androidx.compose.runtime;

import androidx.camera.core.impl.v;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0010\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\r\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\r\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", "local", "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "component1", "()Ljava/lang/Object;", "value", "copy", "(Ljava/lang/Object;)Landroidx/compose/runtime/StaticValueHolder;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class StaticValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final T value;

    public StaticValueHolder(T t10) {
        this.value = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = staticValueHolder.value;
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    @NotNull
    public final StaticValueHolder<T> copy(T value) {
        return new StaticValueHolder<>(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StaticValueHolder) && Intrinsics.areEqual(this.value, ((StaticValueHolder) other).value);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t10 = this.value;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(@NotNull PersistentCompositionLocalMap map) {
        return this.value;
    }

    @Override // androidx.compose.runtime.ValueHolder
    @NotNull
    public ProvidedValue<T> toProvided(@NotNull CompositionLocal<T> local) {
        T t10 = this.value;
        return new ProvidedValue<>(local, t10, t10 == null, null, null, null, false);
    }

    @NotNull
    public String toString() {
        return v.d(new StringBuilder("StaticValueHolder(value="), this.value, RootService.CLOSE_BRACKET);
    }
}
