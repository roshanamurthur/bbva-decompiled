package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
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
import t.c0;
import t.f0;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalIndication", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalIndication", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,186:1\n135#2:187\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n115#1:187\n*E\n"})
public final class IndicationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Indication> f3388a = CompositionLocalKt.staticCompositionLocalOf(a.f3389p0);

    /* JADX INFO: compiled from: Indication.kt */
    public static final class a extends Lambda implements Function0<Indication> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3389p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Indication invoke() {
            return t.o.f93424a;
        }
    }

    /* JADX INFO: compiled from: Indication.kt */
    @SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1097#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt$indication$2\n*L\n111#1:187\n111#1:188,6\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Indication f3390p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f3391q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Indication indication, InteractionSource interactionSource) {
            super(3);
            this.f3390p0 = indication;
            this.f3391q0 = interactionSource;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, -353972293);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-353972293, iA, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:107)");
            }
            Indication indication = this.f3390p0;
            if (indication == null) {
                indication = f0.f93376a;
            }
            IndicationInstance indicationInstanceRememberUpdatedInstance = indication.rememberUpdatedInstance(this.f3391q0, composer2, 0);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(indicationInstanceRememberUpdatedInstance);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new c0(indicationInstanceRememberUpdatedInstance);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            c0 c0Var = (c0) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return c0Var;
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<Indication> getLocalIndication() {
        return f3388a;
    }

    @NotNull
    public static final Modifier indication(@NotNull Modifier modifier, @NotNull final InteractionSource interactionSource, @Nullable final Indication indication) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.IndicationKt$indication$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "indication").set("indication", indication);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("interactionSource", interactionSource);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new b(indication, interactionSource));
    }
}
