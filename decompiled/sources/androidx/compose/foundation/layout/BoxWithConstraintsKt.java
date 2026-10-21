package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.j;

/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"BoxWithConstraints", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n50#2:125\n49#2:126\n1097#3,6:127\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125\n67#1:126\n67#1:127,6\n*E\n"})
public final class BoxWithConstraintsKt {

    /* JADX INFO: compiled from: BoxWithConstraints.kt */
    @SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt$BoxWithConstraints$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    public static final class a extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MeasurePolicy f4221p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxWithConstraintsScope, Composer, Integer, Unit> f4222q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f4223r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MeasurePolicy measurePolicy, Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f4221p0 = measurePolicy;
            this.f4222q0 = function3;
            this.f4223r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
            SubcomposeMeasureScope SubcomposeLayout = subcomposeMeasureScope;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
            return this.f4221p0.mo113measure3p2s80s(SubcomposeLayout, SubcomposeLayout.subcompose(Unit.INSTANCE, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new androidx.compose.foundation.layout.a(this.f4222q0, new j(SubcomposeLayout, f18296a), this.f4223r0))), f18296a);
        }
    }

    /* JADX INFO: compiled from: BoxWithConstraints.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f4224p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Alignment f4225q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f4226r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxWithConstraintsScope, Composer, Integer, Unit> f4227s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f4228t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f4229u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, Alignment alignment, boolean z10, Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f4224p0 = modifier;
            this.f4225q0 = alignment;
            this.f4226r0 = z10;
            this.f4227s0 = function3;
            this.f4228t0 = i10;
            this.f4229u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BoxWithConstraintsKt.BoxWithConstraints(this.f4224p0, this.f4225q0, this.f4226r0, this.f4227s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4228t0 | 1), this.f4229u0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @UiComposable
    public static final void BoxWithConstraints(@Nullable Modifier modifier, @Nullable Alignment alignment, boolean z10, @NotNull Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1781813501);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(alignment) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i14 != 0) {
                alignment = Alignment.INSTANCE.getTopStart();
            }
            if (i15 != 0) {
                z10 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781813501, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)");
            }
            int i16 = i12 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment, z10, composerStartRestartGroup, (i16 & 112) | (i16 & 14));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(content) | composerStartRestartGroup.changed(measurePolicyRememberBoxMeasurePolicy);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(measurePolicyRememberBoxMeasurePolicy, content, i12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i12 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Alignment alignment2 = alignment;
        boolean z11 = z10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, alignment2, z11, content, i10, i11));
    }
}
