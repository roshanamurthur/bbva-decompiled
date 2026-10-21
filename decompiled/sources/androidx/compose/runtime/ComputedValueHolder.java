package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B \u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u001a\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\rHÆ\u0003J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\rHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R(\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/ComputedValueHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "map", "readValue", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionLocal;", "local", "Landroidx/compose/runtime/ProvidedValue;", "toProvided", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "component1", "compute", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lkotlin/jvm/functions/Function1;", "getCompute", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ComputedValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<CompositionLocalAccessorScope, T> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ComputedValueHolder(@NotNull Function1<? super CompositionLocalAccessorScope, ? extends T> function1) {
        this.compute = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComputedValueHolder copy$default(ComputedValueHolder computedValueHolder, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = computedValueHolder.compute;
        }
        return computedValueHolder.copy(function1);
    }

    @NotNull
    public final Function1<CompositionLocalAccessorScope, T> component1() {
        return this.compute;
    }

    @NotNull
    public final ComputedValueHolder<T> copy(@NotNull Function1<? super CompositionLocalAccessorScope, ? extends T> compute) {
        return new ComputedValueHolder<>(compute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComputedValueHolder) && Intrinsics.areEqual(this.compute, ((ComputedValueHolder) other).compute);
    }

    @NotNull
    public final Function1<CompositionLocalAccessorScope, T> getCompute() {
        return this.compute;
    }

    public int hashCode() {
        return this.compute.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(@NotNull PersistentCompositionLocalMap map) {
        return this.compute.invoke(map);
    }

    @Override // androidx.compose.runtime.ValueHolder
    @NotNull
    public ProvidedValue<T> toProvided(@NotNull CompositionLocal<T> local) {
        return new ProvidedValue<>(local, null, false, null, null, this.compute, false);
    }

    @NotNull
    public String toString() {
        return ci.a.c(new StringBuilder("ComputedValueHolder(compute="), this.compute, RootService.CLOSE_BRACKET);
    }
}
