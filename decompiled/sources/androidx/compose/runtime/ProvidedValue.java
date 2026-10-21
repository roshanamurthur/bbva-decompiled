package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bl\b\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u00104\u001a\u00020 \u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0012\u0019\u0010\u001f\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018¢\u0006\u0002\b\u001a\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b5\u00106J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R-\u0010\u001f\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018¢\u0006\u0002\b\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010)\u001a\u00020 2\u0006\u0010&\u001a\u00020 8G@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010.\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010+R\u0014\u00103\u001a\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010$¨\u00067"}, d2 = {"Landroidx/compose/runtime/ProvidedValue;", ExifInterface.GPS_DIRECTION_TRUE, "", "ifNotAlreadyProvided$runtime_release", "()Landroidx/compose/runtime/ProvidedValue;", "ifNotAlreadyProvided", "Landroidx/compose/runtime/CompositionLocal;", "a", "Landroidx/compose/runtime/CompositionLocal;", "getCompositionLocal", "()Landroidx/compose/runtime/CompositionLocal;", "compositionLocal", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "c", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getMutationPolicy$runtime_release", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "mutationPolicy", "Landroidx/compose/runtime/MutableState;", "d", "Landroidx/compose/runtime/MutableState;", "getState$runtime_release", "()Landroidx/compose/runtime/MutableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "e", "Lkotlin/jvm/functions/Function1;", "getCompute$runtime_release", "()Lkotlin/jvm/functions/Function1;", "compute", "", "f", "Z", "isDynamic$runtime_release", "()Z", "isDynamic", "<set-?>", "h", "getCanOverride", "canOverride", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "getEffectiveValue$runtime_release", "getEffectiveValue$runtime_release$annotations", "effectiveValue", "isStatic$runtime_release", "isStatic", "explicitNull", "<init>", "(Landroidx/compose/runtime/CompositionLocal;Ljava/lang/Object;ZLandroidx/compose/runtime/SnapshotMutationPolicy;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Z)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ProvidedValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4584:1\n1#2:4585\n*E\n"})
public final class ProvidedValue<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CompositionLocal<T> compositionLocal;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SnapshotMutationPolicy<T> mutationPolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final MutableState<T> state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<CompositionLocalAccessorScope, T> compute;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isDynamic;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final T f14637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean canOverride = true;

    /* JADX WARN: Multi-variable type inference failed */
    public ProvidedValue(@NotNull CompositionLocal<T> compositionLocal, @Nullable T t10, boolean z10, @Nullable SnapshotMutationPolicy<T> snapshotMutationPolicy, @Nullable MutableState<T> mutableState, @Nullable Function1<? super CompositionLocalAccessorScope, ? extends T> function1, boolean z11) {
        this.compositionLocal = compositionLocal;
        this.f14632b = z10;
        this.mutationPolicy = snapshotMutationPolicy;
        this.state = mutableState;
        this.compute = function1;
        this.isDynamic = z11;
        this.f14637g = t10;
    }

    @JvmName(name = "getCanOverride")
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    @NotNull
    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    @Nullable
    public final Function1<CompositionLocalAccessorScope, T> getCompute$runtime_release() {
        return this.compute;
    }

    public final T getEffectiveValue$runtime_release() {
        if (this.f14632b) {
            return null;
        }
        MutableState<T> mutableState = this.state;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        T t10 = this.f14637g;
        if (t10 != null) {
            return t10;
        }
        ComposerKt.composeRuntimeError("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    @Nullable
    public final SnapshotMutationPolicy<T> getMutationPolicy$runtime_release() {
        return this.mutationPolicy;
    }

    @Nullable
    public final MutableState<T> getState$runtime_release() {
        return this.state;
    }

    public final T getValue() {
        return this.f14637g;
    }

    @NotNull
    public final ProvidedValue<T> ifNotAlreadyProvided$runtime_release() {
        this.canOverride = false;
        return this;
    }

    /* JADX INFO: renamed from: isDynamic$runtime_release, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public final boolean isStatic$runtime_release() {
        return (this.f14632b || getValue() != null) && !this.isDynamic;
    }

    public static /* synthetic */ void getEffectiveValue$runtime_release$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
