package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Selectable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aS\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u000e\u001aA\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"selectable", "Landroidx/compose/ui/Modifier;", "selected", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "selectable-O2vRcR0", "selectable-XHw0xAI", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,134:1\n135#2:135\n135#2:136\n146#2:137\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n61#1:135\n114#1:136\n113#1:137\n*E\n"})
public final class SelectableKt {

    /* JADX INFO: compiled from: Selectable.kt */
    @SourceDebugExtension({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,134:1\n25#2:135\n1097#3,6:136\n76#4:142\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt$selectable$2\n*L\n73#1:135\n73#1:136,6\n74#1:142\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f5583p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f5584q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Role f5585r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f5586s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, boolean z11, Role role, Function0<Unit> function0) {
            super(3);
            this.f5583p0 = z10;
            this.f5584q0 = z11;
            this.f5585r0 = role;
            this.f5586s0 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, -2124609672);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2124609672, iA, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:67)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierM458selectableO2vRcR0 = SelectableKt.m458selectableO2vRcR0(companion, this.f5583p0, (MutableInteractionSource) objRememberedValue, (Indication) composer2.consume(IndicationKt.getLocalIndication()), this.f5584q0, this.f5585r0, this.f5586s0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierM458selectableO2vRcR0;
        }
    }

    /* JADX INFO: compiled from: Selectable.kt */
    public static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f5587p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10) {
            super(1);
            this.f5587p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setSelected(semantics, this.f5587p0);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m458selectableO2vRcR0(@NotNull Modifier selectable, final boolean z10, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z11, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(selectable, "$this$selectable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return InspectableValueKt.inspectableWrapper(selectable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                a.b(z10, androidx.activity.a.c(inspectorInfo, "$this$null", "selectable"), "selected", inspectorInfo).set("interactionSource", interactionSource);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("indication", indication);
                a.b(z11, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onClick", onClick);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(Modifier.INSTANCE, interactionSource, indication, z11, null, role, onClick, 8, null), false, new b(z10), 1, null));
    }

    /* JADX INFO: renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m459selectableO2vRcR0$default(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            role = null;
        }
        return m458selectableO2vRcR0(modifier, z10, mutableInteractionSource, indication, z12, role, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final Modifier m460selectableXHw0xAI(@NotNull Modifier selectable, final boolean z10, final boolean z11, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(selectable, "$this$selectable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(selectable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                a.b(z11, a.b(z10, androidx.activity.a.c(inspectorInfo, "$this$null", "selectable"), "selected", inspectorInfo), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onClick", onClick);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new a(z10, z11, role, onClick));
    }

    /* JADX INFO: renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m461selectableXHw0xAI$default(Modifier modifier, boolean z10, boolean z11, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m460selectableXHw0xAI(modifier, z10, z11, role, function0);
    }
}
