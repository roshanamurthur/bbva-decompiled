package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InteractiveComponentSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\"&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u0012\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "minimumInteractiveComponentSize", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumInteractiveComponentEnforcement", "b", "getLocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement$annotations", "LocalMinimumTouchTargetEnforcement", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,128:1\n135#2:129\n154#3:130\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n48#1:129\n127#1:130\n*E\n"})
public final class InteractiveComponentSizeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Boolean> f7232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Boolean> f7233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f7234c;

    /* JADX INFO: compiled from: InteractiveComponentSize.kt */
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7235p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: InteractiveComponentSize.kt */
    @SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt$minimumInteractiveComponentSize$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,128:1\n76#2:129\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt$minimumInteractiveComponentSize$2\n*L\n56#1:129\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f7236p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 1964721376);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1964721376, iA, -1, "androidx.compose.material.minimumInteractiveComponentSize.<anonymous> (InteractiveComponentSize.kt:54)");
            }
            Modifier o1Var = ((Boolean) composer2.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement())).booleanValue() ? new h0.o1(InteractiveComponentSizeKt.f7234c) : Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return o1Var;
        }
    }

    static {
        ProvidableCompositionLocal<Boolean> providableCompositionLocalStaticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(a.f7235p0);
        f7232a = providableCompositionLocalStaticCompositionLocalOf;
        f7233b = providableCompositionLocalStaticCompositionLocalOf;
        float f6 = 48;
        f7234c = DpKt.m4411DpSizeYgX7TsA(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6));
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return f7232a;
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumTouchTargetEnforcement() {
        return f7233b;
    }

    @NotNull
    public static final Modifier minimumInteractiveComponentSize(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.InteractiveComponentSizeKt$minimumInteractiveComponentSize$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("minimumInteractiveComponentSize");
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
            }
        } : InspectableValueKt.getNoInspectorInfo(), b.f7236p0);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @ReplaceWith(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    @ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }
}
