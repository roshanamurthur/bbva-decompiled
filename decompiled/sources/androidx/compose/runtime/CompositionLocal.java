package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H ¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/ProvidedValue;", "value", "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime_release", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "updatedStateOf", "a", "Landroidx/compose/runtime/ValueHolder;", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/ValueHolder;", "defaultValueHolder", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "getCurrent$annotations", "()V", "current", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyValueHolder f14523a;

    public CompositionLocal() {
        throw null;
    }

    public CompositionLocal(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this.f14523a = new LazyValueHolder(function0);
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getCurrent")
    public final T getCurrent(@Nullable Composer composer, int i10) {
        return (T) composer.consume(this);
    }

    @NotNull
    public ValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.f14523a;
    }

    @NotNull
    public abstract ValueHolder<T> updatedStateOf$runtime_release(@NotNull ProvidedValue<T> value, @Nullable ValueHolder<T> previous);

    public static /* synthetic */ void getCurrent$annotations() {
    }
}
