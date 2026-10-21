package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B \u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/ComputedProvidableCompositionLocal;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "value", "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue", "Landroidx/compose/runtime/ComputedValueHolder;", "b", "Landroidx/compose/runtime/ComputedValueHolder;", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/ComputedValueHolder;", "defaultValueHolder", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "defaultComputation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ComputedValueHolder<T> defaultValueHolder;

    /* JADX INFO: compiled from: CompositionLocal.kt */
    public static final class a extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f14540p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            ComposerKt.composeRuntimeError("Unexpected call to default provider");
            throw new KotlinNothingValueException();
        }
    }

    public ComputedProvidableCompositionLocal(@NotNull Function1<? super CompositionLocalAccessorScope, ? extends T> function1) {
        super(a.f14540p0);
        this.defaultValueHolder = new ComputedValueHolder<>(function1);
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    @NotNull
    public ProvidedValue<T> defaultProvidedValue$runtime_release(T value) {
        return new ProvidedValue<>(this, value, value == null, null, null, null, true);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    @NotNull
    public ComputedValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }
}
