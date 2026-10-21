package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"isCopyKeyEvent", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "isCopyKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "selectionMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "foundation_release", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SelectionManager_androidKt {

    /* JADX INFO: compiled from: SelectionManager.android.kt */
    @SourceDebugExtension({"SMAP\nSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,67:1\n76#2:68\n25#3:69\n50#3:76\n49#3:77\n1097#4,6:70\n1097#4,6:78\n81#5:84\n107#5,2:85\n*S KotlinDebug\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n*L\n47#1:68\n48#1:69\n53#1:76\n53#1:77\n48#1:70,6\n53#1:78,6\n48#1:84\n48#1:85,2\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SelectionManager f6384p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SelectionManager selectionManager) {
            super(3);
            this.f6384p0 = selectionManager;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, -1914520728);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1914520728, iA, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:45)");
            }
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(IntSize.m4541boximpl(IntSize.INSTANCE.m4554getZeroYbymL2g()), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            g gVar = new g(this.f6384p0, mutableState);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(mutableState) | composer2.changed(density);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new j(density, mutableState);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierAnimatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier2, gVar, (Function1) objRememberedValue2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierAnimatedSelectionMagnifier;
        }
    }

    /* JADX INFO: renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m634isCopyKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo501mapZmokQxo(keyEvent) == KeyCommand.COPY;
    }

    @NotNull
    public static final Modifier selectionMagnifier(@NotNull Modifier modifier, @NotNull SelectionManager manager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return !MagnifierStyle.INSTANCE.getTextDefault().isSupported() ? modifier : ComposedModifierKt.composed$default(modifier, null, new a(manager), 1, null);
    }
}
