package androidx.compose.material.pullrefresh;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.databinding.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PullRefreshState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"", "refreshing", "Lkotlin/Function0;", "", "onRefresh", "Landroidx/compose/ui/unit/Dp;", "refreshThreshold", "refreshingOffset", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "rememberPullRefreshState-UuyPYSY", "(ZLkotlin/jvm/functions/Function0;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;", "rememberPullRefreshState", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,234:1\n154#2:235\n1#3:236\n486#4,4:237\n490#4,2:245\n494#4:251\n25#5:241\n36#5:253\n1097#6,3:242\n1100#6,3:248\n1097#6,6:254\n486#7:247\n76#8:252\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n*L\n63#1:235\n65#1:237,4\n65#1:245,2\n65#1:251\n65#1:241\n75#1:253\n65#1:242,3\n65#1:248,3\n75#1:254,6\n65#1:247\n70#1:252\n*E\n"})
public final class PullRefreshStateKt {

    /* JADX INFO: compiled from: PullRefreshState.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PullRefreshState f8905p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f8906q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f8907r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f8908s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PullRefreshState pullRefreshState, boolean z10, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(0);
            this.f8905p0 = pullRefreshState;
            this.f8906q0 = z10;
            this.f8907r0 = floatRef;
            this.f8908s0 = floatRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PullRefreshState pullRefreshState = this.f8905p0;
            pullRefreshState.setRefreshing$material_release(this.f8906q0);
            pullRefreshState.setThreshold$material_release(this.f8907r0.element);
            pullRefreshState.setRefreshingOffset$material_release(this.f8908s0.element);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m892rememberPullRefreshStateUuyPYSY(boolean z10, @NotNull Function0<Unit> onRefresh, float f6, float f10, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        composer.startReplaceableGroup(-174977512);
        if ((i11 & 4) != 0) {
            f6 = PullRefreshDefaults.INSTANCE.m887getRefreshThresholdD9Ej5fM();
        }
        if ((i11 & 8) != 0) {
            f10 = PullRefreshDefaults.INSTANCE.m888getRefreshingOffsetD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-174977512, i10, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:56)");
        }
        if (Dp.m4388compareTo0680j_4(f6, Dp.m4389constructorimpl(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
        }
        Object objB = c.b(composer, 773894976, -492369756);
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.getEmpty()) {
            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
        composer.endReplaceableGroup();
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onRefresh, composer, (i10 >> 3) & 14);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        floatRef.element = density.mo415toPx0680j_4(f6);
        floatRef2.element = density.mo415toPx0680j_4(f10);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(coroutineScope);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new PullRefreshState(coroutineScope, stateRememberUpdatedState, floatRef2.element, floatRef.element);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PullRefreshState pullRefreshState = (PullRefreshState) objRememberedValue;
        EffectsKt.SideEffect(new a(pullRefreshState, z10, floatRef, floatRef2), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pullRefreshState;
    }
}
