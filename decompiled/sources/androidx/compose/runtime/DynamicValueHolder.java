package androidx.compose.runtime;

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
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bHÆ\u0003J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/DynamicValueHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", "local", "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "Landroidx/compose/runtime/MutableState;", "component1", "state", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Landroidx/compose/runtime/MutableState;", "getState", "()Landroidx/compose/runtime/MutableState;", "<init>", "(Landroidx/compose/runtime/MutableState;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DynamicValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState<T> state;

    public DynamicValueHolder(@NotNull MutableState<T> mutableState) {
        this.state = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicValueHolder copy$default(DynamicValueHolder dynamicValueHolder, MutableState mutableState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutableState = dynamicValueHolder.state;
        }
        return dynamicValueHolder.copy(mutableState);
    }

    @NotNull
    public final MutableState<T> component1() {
        return this.state;
    }

    @NotNull
    public final DynamicValueHolder<T> copy(@NotNull MutableState<T> state) {
        return new DynamicValueHolder<>(state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DynamicValueHolder) && Intrinsics.areEqual(this.state, ((DynamicValueHolder) other).state);
    }

    @NotNull
    public final MutableState<T> getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(@NotNull PersistentCompositionLocalMap map) {
        return this.state.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    @NotNull
    public ProvidedValue<T> toProvided(@NotNull CompositionLocal<T> local) {
        return new ProvidedValue<>(local, null, false, null, this.state, null, true);
    }

    @NotNull
    public String toString() {
        return "DynamicValueHolder(state=" + this.state + RootService.CLOSE_BRACKET;
    }
}
