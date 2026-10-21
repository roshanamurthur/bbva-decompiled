package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H ¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\b\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\t\u0010\u0006J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\fH\u0086\u0004J3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/CompositionLocal;", "value", "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue", "provides", "providesDefault", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "compute", "providesComputed", "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime_release", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "updatedStateOf", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public ProvidableCompositionLocal(@NotNull Function0<? extends T> function0) {
        super(function0, null);
    }

    @NotNull
    public abstract ProvidedValue<T> defaultProvidedValue$runtime_release(T value);

    @NotNull
    public final ProvidedValue<T> provides(T value) {
        return defaultProvidedValue$runtime_release(value);
    }

    @NotNull
    public final ProvidedValue<T> providesComputed(@NotNull Function1<? super CompositionLocalAccessorScope, ? extends T> compute) {
        return new ProvidedValue<>(this, null, false, null, null, compute, false);
    }

    @NotNull
    public final ProvidedValue<T> providesDefault(T value) {
        return defaultProvidedValue$runtime_release(value).ifNotAlreadyProvided$runtime_release();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 java.lang.Object) = (r5v13 java.lang.Object), (r5v14 java.lang.Object) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.CompositionLocal
    @NotNull
    public ValueHolder<T> updatedStateOf$runtime_release(@NotNull ProvidedValue<T> value, @Nullable ValueHolder<T> previous) {
        ComputedValueHolder computedValueHolder;
        Object obj;
        StaticValueHolder staticValueHolder;
        ValueHolder<T> dynamicValueHolder;
        DynamicValueHolder dynamicValueHolder2 = null;
        if (previous instanceof DynamicValueHolder) {
            if (value.getIsDynamic()) {
                dynamicValueHolder2 = (DynamicValueHolder) previous;
                dynamicValueHolder2.getState().setValue(value.getEffectiveValue$runtime_release());
            }
        } else if (previous instanceof StaticValueHolder) {
            if (value.isStatic$runtime_release()) {
                staticValueHolder = (StaticValueHolder) previous;
                if (Intrinsics.areEqual(value.getEffectiveValue$runtime_release(), staticValueHolder.getValue())) {
                    obj = computedValueHolder;
                    obj = staticValueHolder;
                    dynamicValueHolder2 = (ValueHolder<T>) obj;
                }
            }
        } else if (previous instanceof ComputedValueHolder) {
            computedValueHolder = (ComputedValueHolder) previous;
            if (value.getCompute$runtime_release() == computedValueHolder.getCompute()) {
                obj = computedValueHolder;
                obj = staticValueHolder;
                dynamicValueHolder2 = (ValueHolder<T>) obj;
            }
        }
        if (dynamicValueHolder2 != null) {
            return dynamicValueHolder2;
        }
        if (value.getIsDynamic()) {
            MutableState<T> state$runtime_release = value.getState$runtime_release();
            if (state$runtime_release == null) {
                T value2 = value.getValue();
                SnapshotMutationPolicy<T> mutationPolicy$runtime_release = value.getMutationPolicy$runtime_release();
                if (mutationPolicy$runtime_release == null) {
                    mutationPolicy$runtime_release = SnapshotStateKt.structuralEqualityPolicy();
                }
                state$runtime_release = SnapshotStateKt.mutableStateOf(value2, mutationPolicy$runtime_release);
            }
            dynamicValueHolder = new DynamicValueHolder<>(state$runtime_release);
        } else if (value.getCompute$runtime_release() != null) {
            dynamicValueHolder = new ComputedValueHolder<>(value.getCompute$runtime_release());
        } else {
            dynamicValueHolder = value.getState$runtime_release() != null ? new DynamicValueHolder<>(value.getState$runtime_release()) : new StaticValueHolder<>(value.getEffectiveValue$runtime_release());
        }
        return dynamicValueHolder;
    }
}
