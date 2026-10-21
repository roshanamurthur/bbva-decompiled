package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"tapPressTextFieldModifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onTap", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldPressGestureFilterKt {

    /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
    @SourceDebugExtension({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,85:1\n486#2,4:86\n490#2,2:94\n494#2:100\n25#3:90\n25#3:101\n50#3:108\n49#3:109\n1097#4,3:91\n1100#4,3:97\n1097#4,6:102\n1097#4,6:110\n486#5:96\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n41#1:86,4\n41#1:94,2\n41#1:100\n41#1:90\n42#1:101\n44#1:108\n44#1:109\n41#1:91,3\n41#1:97,3\n42#1:102,6\n44#1:110,6\n41#1:96\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Offset, Unit> f6023p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6024q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Offset, Unit> function1, MutableInteractionSource mutableInteractionSource) {
            super(3);
            this.f6023p0 = function1;
            this.f6024q0 = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, -102778667);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-102778667, iA, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:39)");
            }
            Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
            }
            composer2.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.f6023p0, composer2, 0);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(mutableState);
            MutableInteractionSource mutableInteractionSource = this.f6024q0;
            boolean zChanged2 = zChanged | composer2.changed(mutableInteractionSource);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new b0(mutableState, mutableInteractionSource);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            EffectsKt.DisposableEffect(mutableInteractionSource, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MutableInteractionSource mutableInteractionSource2 = this.f6024q0;
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource2, new c0(coroutineScope, mutableState, mutableInteractionSource2, stateRememberUpdatedState, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierPointerInput;
        }
    }

    @NotNull
    public static final Modifier tapPressTextFieldModifier(@NotNull Modifier modifier, @Nullable MutableInteractionSource mutableInteractionSource, boolean z10, @NotNull Function1<? super Offset, Unit> onTap) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        return z10 ? ComposedModifierKt.composed$default(modifier, null, new a(onTap, mutableInteractionSource), 1, null) : modifier;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z10, function1);
    }
}
