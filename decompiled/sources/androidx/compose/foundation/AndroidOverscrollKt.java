package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/OverscrollEffect;", "rememberOverscrollEffect", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,589:1\n76#2:590\n76#2:591\n50#3:592\n49#3:593\n1097#4,6:594\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n*L\n64#1:590\n65#1:591\n67#1:592\n67#1:593\n67#1:594,6\n*E\n"})
public final class AndroidOverscrollKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Modifier f3280a;

    /* JADX INFO: compiled from: AndroidOverscroll.kt */
    @SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,589:1\n92#2:590\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n*L\n563#1:590\n*E\n"})
    public static final class a extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3281p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            MeasureScope layout = measureScope;
            Measurable measurable2 = measurable;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable2, "measurable");
            Placeable placeableMo3575measureBRTryo0 = measurable2.mo3575measureBRTryo0(f18296a);
            int iMo413roundToPx0680j_4 = layout.mo413roundToPx0680j_4(Dp.m4389constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
            return MeasureScope.CC.q(layout, placeableMo3575measureBRTryo0.getMeasuredWidth() - iMo413roundToPx0680j_4, placeableMo3575measureBRTryo0.getMeasuredHeight() - iMo413roundToPx0680j_4, null, new androidx.compose.foundation.b(iMo413roundToPx0680j_4, placeableMo3575measureBRTryo0), 4, null);
        }
    }

    /* JADX INFO: compiled from: AndroidOverscroll.kt */
    @SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,589:1\n92#2:590\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2\n*L\n579#1:590\n*E\n"})
    public static final class b extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f3282p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            MeasureScope layout = measureScope;
            Measurable measurable2 = measurable;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable2, "measurable");
            Placeable placeableMo3575measureBRTryo0 = measurable2.mo3575measureBRTryo0(f18296a);
            int iMo413roundToPx0680j_4 = layout.mo413roundToPx0680j_4(Dp.m4389constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
            return MeasureScope.CC.q(layout, placeableMo3575measureBRTryo0.getWidth() + iMo413roundToPx0680j_4, placeableMo3575measureBRTryo0.getHeight() + iMo413roundToPx0680j_4, null, new c(iMo413roundToPx0680j_4, placeableMo3575measureBRTryo0), 4, null);
        }
    }

    static {
        f3280a = Build.VERSION.SDK_INT >= 31 ? LayoutModifierKt.layout(LayoutModifierKt.layout(Modifier.INSTANCE, a.f3281p0), b.f3282p0) : Modifier.INSTANCE;
    }

    @Composable
    @NotNull
    public static final OverscrollEffect rememberOverscrollEffect(@Nullable Composer composer, int i10) {
        OverscrollEffect overscrollEffect;
        composer.startReplaceableGroup(-81138291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-81138291, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfigurationKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration != null) {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(context) | composer.changed(overscrollConfiguration);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            overscrollEffect = (OverscrollEffect) objRememberedValue;
        } else {
            overscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return overscrollEffect;
    }
}
