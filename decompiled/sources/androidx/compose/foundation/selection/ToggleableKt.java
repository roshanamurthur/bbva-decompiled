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
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
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

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u000e\u001aG\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u000f\u001aS\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001aA\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"toggleable", "Landroidx/compose/ui/Modifier;", "value", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "role", "Landroidx/compose/ui/semantics/Role;", "onValueChange", "Lkotlin/Function1;", "", "toggleable-O2vRcR0", "toggleable-XHw0xAI", "triStateToggleable", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "triStateToggleable-O2vRcR0", "triStateToggleable-XHw0xAI", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,228:1\n135#2:229\n135#2:230\n146#2:231\n135#2:232\n135#2:233\n146#2:234\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n59#1:229\n108#1:230\n107#1:231\n156#1:232\n208#1:233\n207#1:234\n*E\n"})
public final class ToggleableKt {

    /* JADX INFO: compiled from: Toggleable.kt */
    @SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n25#2:229\n1097#3,6:230\n76#4:236\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n*L\n69#1:229\n69#1:230,6\n70#1:236\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f5598p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f5599q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Role f5600r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f5601s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, boolean z11, Role role, Function1<? super Boolean, Unit> function1) {
            super(3);
            this.f5598p0 = z10;
            this.f5599q0 = z11;
            this.f5600r0 = role;
            this.f5601s0 = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 290332169);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(290332169, iA, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:65)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z10 = this.f5598p0;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(companion, z10, (MutableInteractionSource) objRememberedValue, (Indication) composer2.consume(IndicationKt.getLocalIndication()), this.f5599q0, this.f5600r0, this.f5601s0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierM462toggleableO2vRcR0;
        }
    }

    /* JADX INFO: compiled from: Toggleable.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f5602p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f5603q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1, boolean z10) {
            super(0);
            this.f5602p0 = function1;
            this.f5603q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f5602p0.invoke(Boolean.valueOf(!this.f5603q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Toggleable.kt */
    @SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n25#2:229\n1097#3,6:230\n76#4:236\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$triStateToggleable$2\n*L\n166#1:229\n166#1:230,6\n167#1:236\n*E\n"})
    public static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ToggleableState f5604p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f5605q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Role f5606r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f5607s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ToggleableState toggleableState, boolean z10, Role role, Function0<Unit> function0) {
            super(3);
            this.f5604p0 = toggleableState;
            this.f5605q0 = z10;
            this.f5606r0 = role;
            this.f5607s0 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, -1808118329);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1808118329, iA, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:162)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ToggleableState toggleableState = this.f5604p0;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(companion, toggleableState, (MutableInteractionSource) objRememberedValue, (Indication) composer2.consume(IndicationKt.getLocalIndication()), this.f5605q0, this.f5606r0, this.f5607s0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierM466triStateToggleableO2vRcR0;
        }
    }

    /* JADX INFO: compiled from: Toggleable.kt */
    public static final class d extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ToggleableState f5608p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ToggleableState toggleableState) {
            super(1);
            this.f5608p0 = toggleableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setToggleableState(semantics, this.f5608p0);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m462toggleableO2vRcR0(@NotNull Modifier toggleable, final boolean z10, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z11, @Nullable final Role role, @NotNull final Function1<? super Boolean, Unit> onValueChange) {
        Intrinsics.checkNotNullParameter(toggleable, "$this$toggleable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        return InspectableValueKt.inspectableWrapper(toggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                a.b(z10, androidx.activity.a.c(inspectorInfo, "$this$null", "toggleable"), "value", inspectorInfo).set("interactionSource", interactionSource);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("indication", indication);
                a.b(z11, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onValueChange", onValueChange);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), m466triStateToggleableO2vRcR0(Modifier.INSTANCE, ToggleableStateKt.ToggleableState(z10), interactionSource, indication, z11, role, new b(onValueChange, z10)));
    }

    /* JADX INFO: renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m463toggleableO2vRcR0$default(Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Role role, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            role = null;
        }
        return m462toggleableO2vRcR0(modifier, z10, mutableInteractionSource, indication, z12, role, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m464toggleableXHw0xAI(@NotNull Modifier toggleable, final boolean z10, final boolean z11, @Nullable final Role role, @NotNull final Function1<? super Boolean, Unit> onValueChange) {
        Intrinsics.checkNotNullParameter(toggleable, "$this$toggleable");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        return ComposedModifierKt.composed(toggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                a.b(z11, a.b(z10, androidx.activity.a.c(inspectorInfo, "$this$null", "toggleable"), "value", inspectorInfo), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onValueChange", onValueChange);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new a(z10, z11, role, onValueChange));
    }

    /* JADX INFO: renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m465toggleableXHw0xAI$default(Modifier modifier, boolean z10, boolean z11, Role role, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m464toggleableXHw0xAI(modifier, z10, z11, role, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m466triStateToggleableO2vRcR0(@NotNull Modifier triStateToggleable, @NotNull final ToggleableState state, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z10, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(triStateToggleable, "$this$triStateToggleable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return InspectableValueKt.inspectableWrapper(triStateToggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "triStateToggleable").set("state", state);
                a.b(z10, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("interactionSource", interactionSource);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("indication", indication);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onClick", onClick);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), SemanticsModifierKt.semantics$default(ClickableKt.m146clickableO2vRcR0$default(Modifier.INSTANCE, interactionSource, indication, z10, null, role, onClick, 8, null), false, new d(state), 1, null));
    }

    /* JADX INFO: renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m467triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z10, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            role = null;
        }
        return m466triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z11, role, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m468triStateToggleableXHw0xAI(@NotNull Modifier triStateToggleable, @NotNull final ToggleableState state, final boolean z10, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(triStateToggleable, "$this$triStateToggleable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(triStateToggleable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "triStateToggleable").set("state", state);
                a.b(z10, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo).set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onClick", onClick);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new c(state, z10, role, onClick));
    }

    /* JADX INFO: renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m469triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z10, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m468triStateToggleableXHw0xAI(modifier, toggleableState, z10, role, function0);
    }
}
