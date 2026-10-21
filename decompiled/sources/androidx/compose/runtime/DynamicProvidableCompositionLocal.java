package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.naturalauth.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/DynamicProvidableCompositionLocal;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "value", "Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", Constants.policy, "Lkotlin/Function0;", "defaultFactory", "<init>", "(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SnapshotMutationPolicy<T> f14556b;

    public DynamicProvidableCompositionLocal(@NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy, @NotNull Function0<? extends T> function0) {
        super(function0);
        this.f14556b = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    @NotNull
    public ProvidedValue<T> defaultProvidedValue$runtime_release(T value) {
        return new ProvidedValue<>(this, value, value == null, this.f14556b, null, null, true);
    }
}
