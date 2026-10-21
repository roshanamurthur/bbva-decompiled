package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aY\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001ay\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u008b\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a£\u0001\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "clickable-XHw0xAI", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "clickable", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "clickable-O2vRcR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-cJG_KMw", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "combinedClickable", "combinedClickable-XVZzFYc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Lkotlinx/coroutines/CoroutineScope;", "indicationScope", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "currentKeyPressInteractions", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/geometry/Offset;", "keyClickOffset", "genericClickableWithoutGesture-Kqv-Bsg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Lkotlinx/coroutines/CoroutineScope;Ljava/util/Map;Landroidx/compose/runtime/State;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "genericClickableWithoutGesture", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,978:1\n135#2:979\n135#2:980\n146#2:981\n135#2:982\n135#2:983\n146#2:984\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n91#1:979\n141#1:980\n140#1:981\n191#1:982\n255#1:983\n254#1:984\n*E\n"})
public final class ClickableKt {

    /* JADX INFO: compiled from: Clickable.kt */
    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,978:1\n76#2:979\n25#3:980\n1097#4,6:981\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$2\n*L\n104#1:979\n105#1:980\n105#1:981,6\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f3314p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f3315q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Role f3316r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f3317s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, String str, Role role, Function0<Unit> function0) {
            super(3);
            this.f3314p0 = z10;
            this.f3315q0 = str;
            this.f3316r0 = role;
            this.f3317s0 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, -756081143);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-756081143, iA, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:97)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Indication indication = (Indication) composer2.consume(IndicationKt.getLocalIndication());
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierM145clickableO2vRcR0 = ClickableKt.m145clickableO2vRcR0(companion, (MutableInteractionSource) objRememberedValue, indication, this.f3314p0, this.f3315q0, this.f3316r0, this.f3317s0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierM145clickableO2vRcR0;
        }
    }

    /* JADX INFO: compiled from: Clickable.kt */
    @SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,978:1\n76#2:979\n25#3:980\n1097#4,6:981\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$2\n*L\n210#1:979\n211#1:980\n211#1:981,6\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f3318p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f3319q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Role f3320r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f3321s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f3322t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f3323u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, String str, Role role, Function0 function0, Function0 function1, Function0 function2, String str2) {
            super(3);
            this.f3318p0 = z10;
            this.f3319q0 = str;
            this.f3320r0 = role;
            this.f3321s0 = str2;
            this.f3322t0 = function0;
            this.f3323u0 = function1;
            this.v0 = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 1969174843);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1969174843, iA, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:200)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Indication indication = (Indication) composer2.consume(IndicationKt.getLocalIndication());
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierM149combinedClickableXVZzFYc = ClickableKt.m149combinedClickableXVZzFYc(companion, (MutableInteractionSource) objRememberedValue, indication, this.f3318p0, this.f3319q0, this.f3320r0, this.f3321s0, this.f3322t0, this.f3323u0, this.v0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierM149combinedClickableXVZzFYc;
        }
    }

    /* JADX INFO: renamed from: access$handlePressInteraction-EPk0efs, reason: not valid java name */
    public static final Object m144access$handlePressInteractionEPk0efs(PressGestureScope pressGestureScope, long j10, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, Function0 function0, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new d(pressGestureScope, j10, mutableInteractionSource, interactionData, function0, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m145clickableO2vRcR0(@NotNull Modifier clickable, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z10, @Nullable final String str, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return InspectableValueKt.inspectableWrapper(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "clickable").set("interactionSource", interactionSource);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("indication", indication);
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo).set("onClickLabel", str);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onClick", onClick);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(Modifier.INSTANCE, interactionSource, indication), interactionSource, z10), z10, interactionSource).then(new ClickableElement(interactionSource, z10, str, role, onClick)));
    }

    /* JADX INFO: renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m146clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z10, String str, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return m145clickableO2vRcR0(modifier, mutableInteractionSource, indication, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : role, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m147clickableXHw0xAI(@NotNull Modifier clickable, final boolean z10, @Nullable final String str, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, androidx.activity.a.c(inspectorInfo, "$this$null", "clickable"), "enabled", inspectorInfo).set("onClickLabel", str);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onClick", onClick);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new a(z10, str, role, onClick));
    }

    /* JADX INFO: renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m148clickableXHw0xAI$default(Modifier modifier, boolean z10, String str, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m147clickableXHw0xAI(modifier, z10, str, role, function0);
    }

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final Modifier m149combinedClickableXVZzFYc(@NotNull Modifier combinedClickable, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z10, @Nullable final String str, @Nullable final Role role, @Nullable final String str2, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return InspectableValueKt.inspectableWrapper(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "combinedClickable").set("indication", indication);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("interactionSource", interactionSource);
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo).set("onClickLabel", str);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onClick", onClick);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onDoubleClick", function1);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onLongClick", function0);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onLongClickLabel", str2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(Modifier.INSTANCE, interactionSource, indication), interactionSource, z10), z10, interactionSource).then(new CombinedClickableElement(interactionSource, z10, str, role, onClick, str2, function0, function1)));
    }

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final Modifier m151combinedClickablecJG_KMw(@NotNull Modifier combinedClickable, final boolean z10, @Nullable final String str, @Nullable final Role role, @Nullable final String str2, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, androidx.activity.a.c(inspectorInfo, "$this$null", "combinedClickable"), "enabled", inspectorInfo).set("onClickLabel", str);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("role", role);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onClick", onClick);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onDoubleClick", function1);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onLongClick", function0);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("onLongClickLabel", str2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new b(z10, str, role, function0, function1, onClick, str2));
    }

    @NotNull
    /* JADX INFO: renamed from: genericClickableWithoutGesture-Kqv-Bsg, reason: not valid java name */
    public static final Modifier m153genericClickableWithoutGestureKqvBsg(@NotNull Modifier genericClickableWithoutGesture, @NotNull MutableInteractionSource interactionSource, @Nullable Indication indication, @NotNull CoroutineScope indicationScope, @NotNull Map<Key, PressInteraction.Press> currentKeyPressInteractions, @NotNull State<Offset> keyClickOffset, boolean z10, @Nullable String str, @Nullable Role role, @Nullable String str2, @Nullable Function0<Unit> function0, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(indicationScope, "indicationScope");
        Intrinsics.checkNotNullParameter(currentKeyPressInteractions, "currentKeyPressInteractions");
        Intrinsics.checkNotNullParameter(keyClickOffset, "keyClickOffset");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return genericClickableWithoutGesture.then(FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(KeyInputModifierKt.onKeyEvent(new ClickableSemanticsElement(role, str2, str, function0, onClick, z10), new t.m(z10, currentKeyPressInteractions, keyClickOffset, indicationScope, onClick, interactionSource)), interactionSource, indication), interactionSource, z10), z10, interactionSource));
    }
}
