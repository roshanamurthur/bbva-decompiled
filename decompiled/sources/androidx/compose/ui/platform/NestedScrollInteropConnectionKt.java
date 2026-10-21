package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NestedScrollInteropConnection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", TypedValues.CycleType.S_WAVE_OFFSET, "", "composeToViewOffset", "Landroid/view/View;", "hostView", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "rememberNestedScrollInteropConnection", "(Landroid/view/View;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,236:1\n76#2:237\n36#3:238\n1097#4,6:239\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n233#1:237\n234#1:238\n234#1:239,6\n*E\n"})
public final class NestedScrollInteropConnectionKt {
    /* JADX INFO: renamed from: access$getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m3808access$getScrollAxesk4lQ0M(long j10) {
        int i10 = Math.abs(Offset.m2275getXimpl(j10)) >= 0.5f ? 1 : 0;
        return Math.abs(Offset.m2276getYimpl(j10)) >= 0.5f ? i10 | 2 : i10;
    }

    /* JADX INFO: renamed from: access$toViewType-GyEprt8, reason: not valid java name */
    public static final int m3810access$toViewTypeGyEprt8(int i10) {
        return !NestedScrollSource.m3387equalsimpl0(i10, NestedScrollSource.INSTANCE.m3392getDragWNlRxjI()) ? 1 : 0;
    }

    public static final float access$toViewVelocity(float f6) {
        return f6 * (-1.0f);
    }

    public static final int composeToViewOffset(float f6) {
        return ((int) (f6 >= 0.0f ? Math.ceil(f6) : Math.floor(f6))) * (-1);
    }

    @Composable
    @NotNull
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(@Nullable View view, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1260107652);
        if ((i11 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1260107652, i10, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.kt:231)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(view);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScrollInteropConnection;
    }
}
