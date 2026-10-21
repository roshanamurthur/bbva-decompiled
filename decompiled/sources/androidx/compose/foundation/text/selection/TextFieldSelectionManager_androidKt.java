package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
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

/* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"isShiftPressed", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "textFieldMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "foundation_release", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldSelectionManager_androidKt {

    /* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
    @SourceDebugExtension({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,66:1\n76#2:67\n25#3:68\n50#3:75\n49#3:76\n1097#4,6:69\n1097#4,6:77\n81#5:83\n107#5,2:84\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n45#1:67\n46#1:68\n51#1:75\n51#1:76\n46#1:69,6\n51#1:77,6\n46#1:83\n46#1:84,2\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f6444p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextFieldSelectionManager textFieldSelectionManager) {
            super(3);
            this.f6444p0 = textFieldSelectionManager;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 1980580247);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1980580247, iA, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:43)");
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
            k kVar = new k(this.f6444p0, mutableState);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(mutableState) | composer2.changed(density);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new n(density, mutableState);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierAnimatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier2, kVar, (Function1) objRememberedValue2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierAnimatedSelectionMagnifier;
        }
    }

    public static final boolean isShiftPressed(@NotNull PointerEvent pointerEvent) {
        Intrinsics.checkNotNullParameter(pointerEvent, "<this>");
        return false;
    }

    @NotNull
    public static final Modifier textFieldMagnifier(@NotNull Modifier modifier, @NotNull TextFieldSelectionManager manager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return !MagnifierStyle.INSTANCE.getTextDefault().isSupported() ? modifier : ComposedModifierKt.composed$default(modifier, null, new a(manager), 1, null);
    }
}
