package androidx.lifecycle.compose;

import androidx.annotation.CheckResult;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.a;

/* JADX INFO: compiled from: DropUnlessLifecycle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function0;", "", "block", "dropUnlessStarted", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "dropUnlessResumed", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDropUnlessLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n77#2:109\n77#2:116\n77#2:117\n1225#3,6:110\n*S KotlinDebug\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n*L\n49#1:109\n81#1:116\n105#1:117\n57#1:110,6\n*E\n"})
public final class DropUnlessLifecycleKt {
    @CheckResult
    @Composable
    public static final Function0 a(Lifecycle.State state, LifecycleOwner lifecycleOwner, Function0 function0, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057956404, i10, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:50)");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.".toString());
        }
        boolean zChangedInstance = composer.changedInstance(lifecycleOwner) | ((((i10 & 14) ^ 6) > 4 && composer.changed(state)) || (i10 & 6) == 4) | ((((i10 & 896) ^ BluetoothState.REQUEST_CONNECT_DEVICE) > 256 && composer.changed(function0)) || (i10 & BluetoothState.REQUEST_CONNECT_DEVICE) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new a(lifecycleOwner, state, function0);
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function1 = (Function0) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return function1;
    }

    @CheckResult
    @Composable
    @NotNull
    public static final Function0<Unit> dropUnlessResumed(@Nullable LifecycleOwner lifecycleOwner, @NotNull Function0<Unit> function0, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331131589, i10, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:106)");
        }
        int i12 = i10 << 3;
        Function0<Unit> function0A = a(Lifecycle.State.RESUMED, lifecycleOwner, function0, composer, (i12 & 896) | (i12 & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return function0A;
    }

    @CheckResult
    @Composable
    @NotNull
    public static final Function0<Unit> dropUnlessStarted(@Nullable LifecycleOwner lifecycleOwner, @NotNull Function0<Unit> function0, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1207869935, i10, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:82)");
        }
        int i12 = i10 << 3;
        Function0<Unit> function0A = a(Lifecycle.State.STARTED, lifecycleOwner, function0, composer, (i12 & 896) | (i12 & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return function0A;
    }
}
