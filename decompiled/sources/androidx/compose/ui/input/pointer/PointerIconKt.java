package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u0.e;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "pointerHoverIcon", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,242:1\n135#2:243\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n86#1:243\n*E\n"})
public final class PointerIconKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableModifierLocal<d> f16392a = ModifierLocalKt.modifierLocalOf(a.f16393p0);

    /* JADX INFO: compiled from: PointerIcon.kt */
    public static final class a extends Lambda implements Function0<d> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16393p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ d invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: PointerIcon.kt */
    @SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n76#2:243\n25#3:244\n83#3,3:251\n36#3:260\n1097#4,6:245\n1097#4,6:254\n1097#4,6:261\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n*L\n91#1:243\n98#1:244\n101#1:251,3\n109#1:260\n98#1:245,6\n101#1:254,6\n109#1:261,6\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PointerIcon f16394p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f16395q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PointerIcon pointerIcon, boolean z10) {
            super(3);
            this.f16394p0 = pointerIcon;
            this.f16395q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifierPointerInput;
            Modifier modifierA;
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 811087536);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(811087536, iA, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:89)");
            }
            PointerIconService pointerIconService = (PointerIconService) composer2.consume(CompositionLocalsKt.getLocalPointerIconService());
            if (pointerIconService == null) {
                modifierA = Modifier.INSTANCE;
            } else {
                androidx.compose.ui.input.pointer.b bVar = new androidx.compose.ui.input.pointer.b(pointerIconService);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Object empty = Composer.INSTANCE.getEmpty();
                boolean z10 = this.f16395q0;
                PointerIcon pointerIcon = this.f16394p0;
                if (objRememberedValue == empty) {
                    objRememberedValue = new d(pointerIcon, z10, bVar);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                d dVar = (d) objRememberedValue;
                Object[] objArr = {dVar, pointerIcon, Boolean.valueOf(z10), bVar};
                composer2.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i10 = 0; i10 < 4; i10++) {
                    zChanged |= composer2.changed(objArr[i10]);
                }
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new androidx.compose.ui.input.pointer.a(dVar, pointerIcon, z10, bVar);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue2, composer2, 0);
                d dVarC = dVar.c();
                if (dVarC == null || !dVarC.d()) {
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged2 = composer2.changed(dVar);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new c(dVar, null);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier2, dVar, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3);
                } else {
                    modifierPointerInput = Modifier.INSTANCE;
                }
                modifierA = e.a(dVar, modifierPointerInput);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierA;
        }
    }

    @Stable
    @NotNull
    public static final Modifier pointerHoverIcon(@NotNull Modifier modifier, @NotNull final PointerIcon icon, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "pointerHoverIcon").set("icon", icon);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("overrideDescendants", Boolean.valueOf(z10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new b(icon, z10));
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z10);
    }
}
