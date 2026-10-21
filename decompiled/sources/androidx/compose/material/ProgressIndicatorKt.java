package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\u001aE\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'²\u0006\f\u0010\u001e\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "backgroundColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "strokeWidth", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "startAngle", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,587:1\n83#2,3:588\n83#2,3:597\n1097#3,6:591\n1097#3,6:600\n76#4:606\n76#4:607\n75#5,7:608\n81#6:615\n81#6:616\n81#6:617\n81#6:618\n81#6:619\n81#6:620\n81#6:621\n81#6:622\n154#7:623\n154#7:624\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n86#1:588,3\n165#1:597,3\n86#1:591,6\n165#1:600,6\n296#1:606\n334#1:607\n512#1:608,7\n117#1:615\n128#1:616\n139#1:617\n150#1:618\n340#1:619\n352#1:620\n363#1:621\n375#1:622\n530#1:623\n534#1:624\n*E\n"})
public final class ProgressIndicatorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7482a = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7483b = Dp.m4389constructorimpl(240);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7484c = Dp.m4389constructorimpl(40);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f7485d = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f7486e = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f7487f = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f7488g = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f7489h = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class a extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f7490p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7491q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Stroke f7492r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f7493s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, long j10, Stroke stroke, long j11) {
            super(1);
            this.f7490p0 = f6;
            this.f7491q0 = j10;
            this.f7492r0 = stroke;
            this.f7493s0 = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float f6 = 360.0f * this.f7490p0;
            ProgressIndicatorKt.a(Canvas, 0.0f, 360.0f, this.f7491q0, this.f7492r0);
            ProgressIndicatorKt.a(Canvas, 270.0f, f6, this.f7493s0, this.f7492r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f7494p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7495q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f7496r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f7497s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f7498t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7499u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7500w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6, Modifier modifier, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f7494p0 = f6;
            this.f7495q0 = modifier;
            this.f7496r0 = j10;
            this.f7497s0 = f10;
            this.f7498t0 = j11;
            this.f7499u0 = i10;
            this.v0 = i11;
            this.f7500w0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m798CircularProgressIndicatorDUhRLBM(this.f7494p0, this.f7495q0, this.f7496r0, this.f7497s0, this.f7498t0, this.f7499u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f7500w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class c extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f7501p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Stroke f7502q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f7503r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f7504s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Integer> f7505t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f7506u0;
        public final /* synthetic */ State<Float> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f7507w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f6, long j10, long j11, State state, State state2, State state3, State state4, Stroke stroke) {
            super(1);
            this.f7501p0 = j10;
            this.f7502q0 = stroke;
            this.f7503r0 = f6;
            this.f7504s0 = j11;
            this.f7505t0 = state;
            this.f7506u0 = state2;
            this.v0 = state3;
            this.f7507w0 = state4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            ProgressIndicatorKt.a(Canvas, 0.0f, 360.0f, this.f7501p0, this.f7502q0);
            float fAccess$CircularProgressIndicator_LxG7B9w$lambda$8 = (ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$8(this.f7505t0) * 216.0f) % 360.0f;
            float fAccess$CircularProgressIndicator_LxG7B9w$lambda$10 = ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$10(this.f7506u0);
            State<Float> state = this.v0;
            ProgressIndicatorKt.m808access$drawIndeterminateCircularIndicatorhrjfTZI(Canvas, ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$9(this.f7507w0) + (fAccess$CircularProgressIndicator_LxG7B9w$lambda$8 - 90.0f) + ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$11(state), this.f7503r0, Math.abs(fAccess$CircularProgressIndicator_LxG7B9w$lambda$10 - ProgressIndicatorKt.access$CircularProgressIndicator_LxG7B9w$lambda$11(state)), this.f7504s0, this.f7502q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7508p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7509q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f7510r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f7511s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7512t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7513u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6, int i10, int i11, int i12, long j10, long j11, Modifier modifier) {
            super(2);
            this.f7508p0 = modifier;
            this.f7509q0 = j10;
            this.f7510r0 = f6;
            this.f7511s0 = j11;
            this.f7512t0 = i10;
            this.f7513u0 = i11;
            this.v0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m799CircularProgressIndicatorLxG7B9w(this.f7508p0, this.f7509q0, this.f7510r0, this.f7511s0, this.f7512t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7513u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f7514p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7515q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f7516r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f7517s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7518t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7519u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f6, float f10, int i10, int i11, long j10, Modifier modifier) {
            super(2);
            this.f7514p0 = f6;
            this.f7515q0 = modifier;
            this.f7516r0 = j10;
            this.f7517s0 = f10;
            this.f7518t0 = i10;
            this.f7519u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m800CircularProgressIndicatorMBs18nI(this.f7514p0, this.f7515q0, this.f7516r0, this.f7517s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7518t0 | 1), this.f7519u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7520p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7521q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f7522r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7523s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7524t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f6, int i10, int i11, long j10, Modifier modifier) {
            super(2);
            this.f7520p0 = modifier;
            this.f7521q0 = j10;
            this.f7522r0 = f6;
            this.f7523s0 = i10;
            this.f7524t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m801CircularProgressIndicatoraMcp0Q(this.f7520p0, this.f7521q0, this.f7522r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7523s0 | 1), this.f7524t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class g extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f7525p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(1332);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f7489h);
            keyframes.at(Float.valueOf(290.0f), 666);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class h extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f7526p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(1332);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.f7489h);
            keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class i extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f7527p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f7528q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f7529r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f7530s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j10, int i10, long j11, float f6) {
            super(1);
            this.f7527p0 = j10;
            this.f7528q0 = i10;
            this.f7529r0 = f6;
            this.f7530s0 = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fM2341getHeightimpl = Size.m2341getHeightimpl(Canvas.mo2909getSizeNHjbRc());
            ProgressIndicatorKt.b(Canvas, 0.0f, 1.0f, this.f7527p0, fM2341getHeightimpl, this.f7528q0);
            ProgressIndicatorKt.b(Canvas, 0.0f, this.f7529r0, this.f7530s0, fM2341getHeightimpl, this.f7528q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f7531p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7532q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f7533r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f7534s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7535t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7536u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f6, int i10, int i11, int i12, long j10, long j11, Modifier modifier) {
            super(2);
            this.f7531p0 = f6;
            this.f7532q0 = modifier;
            this.f7533r0 = j10;
            this.f7534s0 = j11;
            this.f7535t0 = i10;
            this.f7536u0 = i11;
            this.v0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m804LinearProgressIndicator_5eSRE(this.f7531p0, this.f7532q0, this.f7533r0, this.f7534s0, this.f7535t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7536u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class k extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f7537p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f7538q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f7539r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f7540s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f7541t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f7542u0;
        public final /* synthetic */ State<Float> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i10, long j10, long j11, State state, State state2, State state3, State state4) {
            super(1);
            this.f7537p0 = j10;
            this.f7538q0 = i10;
            this.f7539r0 = j11;
            this.f7540s0 = state;
            this.f7541t0 = state2;
            this.f7542u0 = state3;
            this.v0 = state4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fM2341getHeightimpl = Size.m2341getHeightimpl(Canvas.mo2909getSizeNHjbRc());
            ProgressIndicatorKt.b(Canvas, 0.0f, 1.0f, this.f7537p0, fM2341getHeightimpl, this.f7538q0);
            State<Float> state = this.f7540s0;
            float fAccess$LinearProgressIndicator_2cYBFYY$lambda$1 = ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$1(state);
            State<Float> state2 = this.f7541t0;
            if (fAccess$LinearProgressIndicator_2cYBFYY$lambda$1 - ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$2(state2) > 0.0f) {
                ProgressIndicatorKt.b(Canvas, ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$1(state), ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$2(state2), this.f7539r0, fM2341getHeightimpl, this.f7538q0);
            }
            State<Float> state3 = this.f7542u0;
            float fAccess$LinearProgressIndicator_2cYBFYY$lambda$3 = ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$3(state3);
            State<Float> state4 = this.v0;
            if (fAccess$LinearProgressIndicator_2cYBFYY$lambda$3 - ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$4(state4) > 0.0f) {
                ProgressIndicatorKt.b(Canvas, ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$3(state3), ProgressIndicatorKt.access$LinearProgressIndicator_2cYBFYY$lambda$4(state4), this.f7539r0, fM2341getHeightimpl, this.f7538q0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7543p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7544q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f7545r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7546s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7547t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7548u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Modifier modifier, long j10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f7543p0 = modifier;
            this.f7544q0 = j10;
            this.f7545r0 = j11;
            this.f7546s0 = i10;
            this.f7547t0 = i11;
            this.f7548u0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m802LinearProgressIndicator2cYBFYY(this.f7543p0, this.f7544q0, this.f7545r0, this.f7546s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7547t0 | 1), this.f7548u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class m extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f7549p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7550q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f7551r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f7552s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7553t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7554u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f6, Modifier modifier, long j10, long j11, int i10, int i11) {
            super(2);
            this.f7549p0 = f6;
            this.f7550q0 = modifier;
            this.f7551r0 = j10;
            this.f7552s0 = j11;
            this.f7553t0 = i10;
            this.f7554u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m805LinearProgressIndicatoreaDK9VM(this.f7549p0, this.f7550q0, this.f7551r0, this.f7552s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7553t0 | 1), this.f7554u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class n extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7555p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7556q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f7557r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f7558s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7559t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Modifier modifier, long j10, long j11, int i10, int i11) {
            super(2);
            this.f7555p0 = modifier;
            this.f7556q0 = j10;
            this.f7557r0 = j11;
            this.f7558s0 = i10;
            this.f7559t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m803LinearProgressIndicatorRIQooxk(this.f7555p0, this.f7556q0, this.f7557r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7558s0 | 1), this.f7559t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class o extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f7560p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(ReturnCode.ERR_MANAGEMENT);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f7485d);
            keyframes.at(Float.valueOf(1.0f), 750);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class p extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f7561p0 = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(ReturnCode.ERR_MANAGEMENT);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.f7486e);
            keyframes.at(Float.valueOf(1.0f), 1183);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class q extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f7562p0 = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(ReturnCode.ERR_MANAGEMENT);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.f7487f);
            keyframes.at(Float.valueOf(1.0f), 1567);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class r extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f7563p0 = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(ReturnCode.ERR_MANAGEMENT);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.f7488g);
            keyframes.at(Float.valueOf(1.0f), ReturnCode.ERR_MANAGEMENT);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0184  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0178  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final void m798CircularProgressIndicatorDUhRLBM(float f6, @Nullable Modifier modifier, long j10, float f10, long j11, int i10, @Nullable Composer composer, int i11, int i12) {
        int i13;
        Modifier modifier2;
        long jM713getPrimary0d7_KjU;
        int i14;
        float fM797getStrokeWidthD9Ej5fM;
        int i15;
        int i16;
        long jM2543getTransparent0d7_KjU;
        int i17;
        int iM2808getButtKaPHkGw;
        long j12;
        long j13;
        int i18;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1746618448);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 112) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i11 & 896) == 0) {
                if ((i12 & 4) == 0) {
                    jM713getPrimary0d7_KjU = j10;
                    int i20 = composerStartRestartGroup.changed(jM713getPrimary0d7_KjU) ? 256 : 128;
                    i13 |= i20;
                } else {
                    jM713getPrimary0d7_KjU = j10;
                }
                i13 |= i20;
            } else {
                jM713getPrimary0d7_KjU = j10;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 7168) == 0) {
                    fM797getStrokeWidthD9Ej5fM = f10;
                    if (composerStartRestartGroup.changed(fM797getStrokeWidthD9Ej5fM)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((57344 & i11) == 0) {
                        jM2543getTransparent0d7_KjU = j11;
                        if (composerStartRestartGroup.changed(jM2543getTransparent0d7_KjU)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                    if ((458752 & i11) == 0) {
                        if ((i12 & 32) == 0) {
                            iM2808getButtKaPHkGw = i10;
                            int i21 = composerStartRestartGroup.changed(iM2808getButtKaPHkGw) ? 131072 : 65536;
                            i13 |= i21;
                        } else {
                            iM2808getButtKaPHkGw = i10;
                        }
                        i13 |= i21;
                    } else {
                        iM2808getButtKaPHkGw = i10;
                    }
                    if ((i13 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i19 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i12 & 4) != 0) {
                                jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            }
                            if (i14 != 0) {
                                fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                            }
                            if (i16 != 0) {
                                jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                            }
                            if ((i12 & 32) != 0) {
                                iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                        }
                        float fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                        CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f7484c), new a(fCoerceIn, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    j12 = jM713getPrimary0d7_KjU;
                    j13 = jM2543getTransparent0d7_KjU;
                    i18 = iM2808getButtKaPHkGw;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM797getStrokeWidthD9Ej5fM, j13, i18, i11, i12));
                }
                i13 |= 24576;
                jM2543getTransparent0d7_KjU = j11;
                if ((458752 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        iM2808getButtKaPHkGw = i10;
                        if (composerStartRestartGroup.changed(iM2808getButtKaPHkGw)) {
                        }
                        i13 |= i21;
                    } else {
                        iM2808getButtKaPHkGw = i10;
                    }
                    i13 |= i21;
                } else {
                    iM2808getButtKaPHkGw = i10;
                }
                if ((i13 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    float fCoerceIn2 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn2, null, 0, 6, null), f7484c), new a(fCoerceIn2, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    float fCoerceIn3 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn3, null, 0, 6, null), f7484c), new a(fCoerceIn3, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j12 = jM713getPrimary0d7_KjU;
                j13 = jM2543getTransparent0d7_KjU;
                i18 = iM2808getButtKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM797getStrokeWidthD9Ej5fM, j13, i18, i11, i12));
            }
            i13 |= 3072;
            fM797getStrokeWidthD9Ej5fM = f10;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((57344 & i11) == 0) {
                    jM2543getTransparent0d7_KjU = j11;
                    if (composerStartRestartGroup.changed(jM2543getTransparent0d7_KjU)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((458752 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        iM2808getButtKaPHkGw = i10;
                        if (composerStartRestartGroup.changed(iM2808getButtKaPHkGw)) {
                        }
                        i13 |= i21;
                    } else {
                        iM2808getButtKaPHkGw = i10;
                    }
                    i13 |= i21;
                } else {
                    iM2808getButtKaPHkGw = i10;
                }
                if ((i13 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    float fCoerceIn4 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn4, null, 0, 6, null), f7484c), new a(fCoerceIn4, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    float fCoerceIn5 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn5, null, 0, 6, null), f7484c), new a(fCoerceIn5, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j12 = jM713getPrimary0d7_KjU;
                j13 = jM2543getTransparent0d7_KjU;
                i18 = iM2808getButtKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM797getStrokeWidthD9Ej5fM, j13, i18, i11, i12));
            }
            i13 |= 24576;
            jM2543getTransparent0d7_KjU = j11;
            if ((458752 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    iM2808getButtKaPHkGw = i10;
                    if (composerStartRestartGroup.changed(iM2808getButtKaPHkGw)) {
                    }
                    i13 |= i21;
                } else {
                    iM2808getButtKaPHkGw = i10;
                }
                i13 |= i21;
            } else {
                iM2808getButtKaPHkGw = i10;
            }
            if ((i13 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                float fCoerceIn6 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn6, null, 0, 6, null), f7484c), new a(fCoerceIn6, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                float fCoerceIn7 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn7, null, 0, 6, null), f7484c), new a(fCoerceIn7, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j12 = jM713getPrimary0d7_KjU;
            j13 = jM2543getTransparent0d7_KjU;
            i18 = iM2808getButtKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM797getStrokeWidthD9Ej5fM, j13, i18, i11, i12));
        }
        i13 |= 48;
        modifier2 = modifier;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                jM713getPrimary0d7_KjU = j10;
                if (composerStartRestartGroup.changed(jM713getPrimary0d7_KjU)) {
                }
                i13 |= i20;
            } else {
                jM713getPrimary0d7_KjU = j10;
            }
            i13 |= i20;
        } else {
            jM713getPrimary0d7_KjU = j10;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 7168) == 0) {
                fM797getStrokeWidthD9Ej5fM = f10;
                if (composerStartRestartGroup.changed(fM797getStrokeWidthD9Ej5fM)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((57344 & i11) == 0) {
                    jM2543getTransparent0d7_KjU = j11;
                    if (composerStartRestartGroup.changed(jM2543getTransparent0d7_KjU)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((458752 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        iM2808getButtKaPHkGw = i10;
                        if (composerStartRestartGroup.changed(iM2808getButtKaPHkGw)) {
                        }
                        i13 |= i21;
                    } else {
                        iM2808getButtKaPHkGw = i10;
                    }
                    i13 |= i21;
                } else {
                    iM2808getButtKaPHkGw = i10;
                }
                if ((i13 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    float fCoerceIn8 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn8, null, 0, 6, null), f7484c), new a(fCoerceIn8, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i14 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i16 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 32) != 0) {
                            iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                    }
                    float fCoerceIn9 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn9, null, 0, 6, null), f7484c), new a(fCoerceIn9, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j12 = jM713getPrimary0d7_KjU;
                j13 = jM2543getTransparent0d7_KjU;
                i18 = iM2808getButtKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM797getStrokeWidthD9Ej5fM, j13, i18, i11, i12));
            }
            i13 |= 24576;
            jM2543getTransparent0d7_KjU = j11;
            if ((458752 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    iM2808getButtKaPHkGw = i10;
                    if (composerStartRestartGroup.changed(iM2808getButtKaPHkGw)) {
                    }
                    i13 |= i21;
                } else {
                    iM2808getButtKaPHkGw = i10;
                }
                i13 |= i21;
            } else {
                iM2808getButtKaPHkGw = i10;
            }
            if ((i13 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                float fCoerceIn10 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn10, null, 0, 6, null), f7484c), new a(fCoerceIn10, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                float fCoerceIn11 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn11, null, 0, 6, null), f7484c), new a(fCoerceIn11, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j12 = jM713getPrimary0d7_KjU;
            j13 = jM2543getTransparent0d7_KjU;
            i18 = iM2808getButtKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM797getStrokeWidthD9Ej5fM, j13, i18, i11, i12));
        }
        i13 |= 3072;
        fM797getStrokeWidthD9Ej5fM = f10;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((57344 & i11) == 0) {
                jM2543getTransparent0d7_KjU = j11;
                if (composerStartRestartGroup.changed(jM2543getTransparent0d7_KjU)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((458752 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    iM2808getButtKaPHkGw = i10;
                    if (composerStartRestartGroup.changed(iM2808getButtKaPHkGw)) {
                    }
                    i13 |= i21;
                } else {
                    iM2808getButtKaPHkGw = i10;
                }
                i13 |= i21;
            } else {
                iM2808getButtKaPHkGw = i10;
            }
            if ((i13 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                float fCoerceIn12 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn12, null, 0, 6, null), f7484c), new a(fCoerceIn12, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i14 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i16 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 32) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
                }
                float fCoerceIn13 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn13, null, 0, 6, null), f7484c), new a(fCoerceIn13, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j12 = jM713getPrimary0d7_KjU;
            j13 = jM2543getTransparent0d7_KjU;
            i18 = iM2808getButtKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM797getStrokeWidthD9Ej5fM, j13, i18, i11, i12));
        }
        i13 |= 24576;
        jM2543getTransparent0d7_KjU = j11;
        if ((458752 & i11) == 0) {
            if ((i12 & 32) == 0) {
                iM2808getButtKaPHkGw = i10;
                if (composerStartRestartGroup.changed(iM2808getButtKaPHkGw)) {
                }
                i13 |= i21;
            } else {
                iM2808getButtKaPHkGw = i10;
            }
            i13 |= i21;
        } else {
            iM2808getButtKaPHkGw = i10;
        }
        if ((i13 & 374491) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if (i14 != 0) {
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                }
                if (i16 != 0) {
                    jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                }
                if ((i12 & 32) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                }
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if (i14 != 0) {
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                }
                if (i16 != 0) {
                    jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                }
                if ((i12 & 32) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
            }
            float fCoerceIn14 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
            CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn14, null, 0, 6, null), f7484c), new a(fCoerceIn14, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if (i14 != 0) {
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                }
                if (i16 != 0) {
                    jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                }
                if ((i12 & 32) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                }
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if (i14 != 0) {
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                }
                if (i16 != 0) {
                    jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                }
                if ((i12 & 32) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1746618448, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:285)");
            }
            float fCoerceIn15 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
            CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn15, null, 0, 6, null), f7484c), new a(fCoerceIn15, jM2543getTransparent0d7_KjU, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM797getStrokeWidthD9Ej5fM), 0.0f, iM2808getButtKaPHkGw, 0, null, 26, null), jM713getPrimary0d7_KjU), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        j12 = jM713getPrimary0d7_KjU;
        j13 = jM2543getTransparent0d7_KjU;
        i18 = iM2808getButtKaPHkGw;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM797getStrokeWidthD9Ej5fM, j13, i18, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2 A[PHI: r2 r6 r9 r11
      0x00c2: PHI (r2v6 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v7 androidx.compose.ui.Modifier) binds: [B:81:0x00f4, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r6v9 long) = (r6v3 long), (r6v2 long) binds: [B:81:0x00f4, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r9v13 float) = (r9v3 float), (r9v2 float) binds: [B:81:0x00f4, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r11v8 long) = (r11v3 long), (r11v2 long) binds: [B:81:0x00f4, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0249  */
    /* JADX WARN: Code duplicated, block: B:93:0x025a  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    public static final void m799CircularProgressIndicatorLxG7B9w(@Nullable Modifier modifier, long j10, float f6, long j11, int i10, @Nullable Composer composer, int i11, int i12) {
        Modifier modifier2;
        int i13;
        long jM713getPrimary0d7_KjU;
        float fM797getStrokeWidthD9Ej5fM;
        int i14;
        long jM2543getTransparent0d7_KjU;
        int i15;
        int i16;
        Modifier modifier3;
        int iM2810getSquareKaPHkGw;
        long j12;
        float f10;
        long j13;
        Modifier modifier4;
        long j14;
        long j15;
        int i17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1119119072);
        int i18 = i12 & 1;
        if (i18 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 14) == 0) {
            modifier2 = modifier;
            i13 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                jM713getPrimary0d7_KjU = j10;
                int i19 = composerStartRestartGroup.changed(jM713getPrimary0d7_KjU) ? 32 : 16;
                i13 |= i19;
            } else {
                jM713getPrimary0d7_KjU = j10;
            }
            i13 |= i19;
        } else {
            jM713getPrimary0d7_KjU = j10;
        }
        int i20 = i12 & 4;
        if (i20 == 0) {
            if ((i11 & 896) == 0) {
                fM797getStrokeWidthD9Ej5fM = f6;
                i13 |= composerStartRestartGroup.changed(fM797getStrokeWidthD9Ej5fM) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 7168) == 0) {
                    jM2543getTransparent0d7_KjU = j11;
                    if (composerStartRestartGroup.changed(jM2543getTransparent0d7_KjU)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((57344 & i11) == 0) {
                    if ((i12 & 16) == 0) {
                        i16 = i10;
                        int i21 = composerStartRestartGroup.changed(i16) ? 16384 : 8192;
                        i13 |= i21;
                    } else {
                        i16 = i10;
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                if ((i13 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i12 & 2) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        }
                        if (i20 != 0) {
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        }
                        if (i14 != 0) {
                            jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                        }
                        if ((i12 & 16) != 0) {
                            iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                            j12 = jM713getPrimary0d7_KjU;
                            f10 = fM797getStrokeWidthD9Ej5fM;
                            j13 = jM2543getTransparent0d7_KjU;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                        }
                        Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM2810getSquareKaPHkGw, 0, null, 26, null);
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                        InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                        int i22 = InfiniteTransition.$stable;
                        int i23 = InfiniteRepeatableSpec.$stable;
                        fM797getStrokeWidthD9Ej5fM = f10;
                        CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f7484c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i22 | 4528 | (i23 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f7525p0), null, 0L, 6, null), null, composerStartRestartGroup, i22 | 432 | (i23 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f7526p0), null, 0L, 6, null), null, composerStartRestartGroup, i22 | 432 | (i23 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i22 | 432 | (i23 << 9), 8), stroke), composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        j14 = j12;
                        j15 = j13;
                        i17 = iM2810getSquareKaPHkGw;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                    iM2810getSquareKaPHkGw = i16;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                    }
                    Stroke stroke2 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM2810getSquareKaPHkGw, 0, null, 26, null);
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    TwoWayConverter<Integer, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i24 = InfiniteTransition.$stable;
                    int i25 = InfiniteRepeatableSpec.$stable;
                    fM797getStrokeWidthD9Ej5fM = f10;
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f7484c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition2, 0, 5, vectorConverter2, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i24 | 4528 | (i25 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f7525p0), null, 0L, 6, null), null, composerStartRestartGroup, i24 | 432 | (i25 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f7526p0), null, 0L, 6, null), null, composerStartRestartGroup, i24 | 432 | (i25 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i24 | 432 | (i25 << 9), 8), stroke2), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j14 = j12;
                    j15 = j13;
                    i17 = iM2810getSquareKaPHkGw;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    j14 = jM713getPrimary0d7_KjU;
                    j15 = jM2543getTransparent0d7_KjU;
                    i17 = i16;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(fM797getStrokeWidthD9Ej5fM, i17, i11, i12, j14, j15, modifier4));
            }
            i13 |= 3072;
            jM2543getTransparent0d7_KjU = j11;
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    i16 = i10;
                    if (composerStartRestartGroup.changed(i16)) {
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            if ((i13 & 46811) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i20 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i14 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 16) != 0) {
                        iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                    } else {
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                        iM2810getSquareKaPHkGw = i16;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i20 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i14 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 16) != 0) {
                        iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                    } else {
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                        iM2810getSquareKaPHkGw = i16;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                Stroke stroke3 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM2810getSquareKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition3 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default3 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i26 = InfiniteTransition.$stable;
                int i27 = InfiniteRepeatableSpec.$stable;
                fM797getStrokeWidthD9Ej5fM = f10;
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f7484c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition3, 0, 5, vectorConverter3, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default3, null, composerStartRestartGroup, i26 | 4528 | (i27 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f7525p0), null, 0L, 6, null), null, composerStartRestartGroup, i26 | 432 | (i27 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f7526p0), null, 0L, 6, null), null, composerStartRestartGroup, i26 | 432 | (i27 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i26 | 432 | (i27 << 9), 8), stroke3), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j14 = j12;
                j15 = j13;
                i17 = iM2810getSquareKaPHkGw;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i20 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i14 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 16) != 0) {
                        iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                    } else {
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                        iM2810getSquareKaPHkGw = i16;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i20 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i14 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 16) != 0) {
                        iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                    } else {
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                        iM2810getSquareKaPHkGw = i16;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                Stroke stroke4 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM2810getSquareKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition4 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default4 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i28 = InfiniteTransition.$stable;
                int i29 = InfiniteRepeatableSpec.$stable;
                fM797getStrokeWidthD9Ej5fM = f10;
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f7484c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition4, 0, 5, vectorConverter4, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default4, null, composerStartRestartGroup, i28 | 4528 | (i29 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f7525p0), null, 0L, 6, null), null, composerStartRestartGroup, i28 | 432 | (i29 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f7526p0), null, 0L, 6, null), null, composerStartRestartGroup, i28 | 432 | (i29 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i28 | 432 | (i29 << 9), 8), stroke4), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j14 = j12;
                j15 = j13;
                i17 = iM2810getSquareKaPHkGw;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(fM797getStrokeWidthD9Ej5fM, i17, i11, i12, j14, j15, modifier4));
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        fM797getStrokeWidthD9Ej5fM = f6;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 7168) == 0) {
                jM2543getTransparent0d7_KjU = j11;
                if (composerStartRestartGroup.changed(jM2543getTransparent0d7_KjU)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    i16 = i10;
                    if (composerStartRestartGroup.changed(i16)) {
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            if ((i13 & 46811) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i20 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i14 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 16) != 0) {
                        iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                    } else {
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                        iM2810getSquareKaPHkGw = i16;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i20 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i14 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 16) != 0) {
                        iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                    } else {
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                        iM2810getSquareKaPHkGw = i16;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                Stroke stroke5 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM2810getSquareKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition5 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter5 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default5 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i210 = InfiniteTransition.$stable;
                int i211 = InfiniteRepeatableSpec.$stable;
                fM797getStrokeWidthD9Ej5fM = f10;
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f7484c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition5, 0, 5, vectorConverter5, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default5, null, composerStartRestartGroup, i210 | 4528 | (i211 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f7525p0), null, 0L, 6, null), null, composerStartRestartGroup, i210 | 432 | (i211 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f7526p0), null, 0L, 6, null), null, composerStartRestartGroup, i210 | 432 | (i211 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i210 | 432 | (i211 << 9), 8), stroke5), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j14 = j12;
                j15 = j13;
                i17 = iM2810getSquareKaPHkGw;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i20 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i14 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 16) != 0) {
                        iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                    } else {
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                        iM2810getSquareKaPHkGw = i16;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if (i20 != 0) {
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    }
                    if (i14 != 0) {
                        jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    }
                    if ((i12 & 16) != 0) {
                        iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                    } else {
                        j12 = jM713getPrimary0d7_KjU;
                        f10 = fM797getStrokeWidthD9Ej5fM;
                        j13 = jM2543getTransparent0d7_KjU;
                        iM2810getSquareKaPHkGw = i16;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
                }
                Stroke stroke6 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM2810getSquareKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition6 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter6 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default6 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i212 = InfiniteTransition.$stable;
                int i213 = InfiniteRepeatableSpec.$stable;
                fM797getStrokeWidthD9Ej5fM = f10;
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f7484c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition6, 0, 5, vectorConverter6, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default6, null, composerStartRestartGroup, i212 | 4528 | (i213 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f7525p0), null, 0L, 6, null), null, composerStartRestartGroup, i212 | 432 | (i213 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f7526p0), null, 0L, 6, null), null, composerStartRestartGroup, i212 | 432 | (i213 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i212 | 432 | (i213 << 9), 8), stroke6), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j14 = j12;
                j15 = j13;
                i17 = iM2810getSquareKaPHkGw;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(fM797getStrokeWidthD9Ej5fM, i17, i11, i12, j14, j15, modifier4));
        }
        i13 |= 3072;
        jM2543getTransparent0d7_KjU = j11;
        if ((57344 & i11) == 0) {
            if ((i12 & 16) == 0) {
                i16 = i10;
                if (composerStartRestartGroup.changed(i16)) {
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            i13 |= i21;
        } else {
            i16 = i10;
        }
        if ((i13 & 46811) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if (i20 != 0) {
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                }
                if (i14 != 0) {
                    jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                }
                if ((i12 & 16) != 0) {
                    iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                } else {
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                    iM2810getSquareKaPHkGw = i16;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if (i20 != 0) {
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                }
                if (i14 != 0) {
                    jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                }
                if ((i12 & 16) != 0) {
                    iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                } else {
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                    iM2810getSquareKaPHkGw = i16;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
            }
            Stroke stroke7 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM2810getSquareKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition7 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter7 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default7 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i214 = InfiniteTransition.$stable;
            int i215 = InfiniteRepeatableSpec.$stable;
            fM797getStrokeWidthD9Ej5fM = f10;
            CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f7484c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition7, 0, 5, vectorConverter7, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default7, null, composerStartRestartGroup, i214 | 4528 | (i215 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f7525p0), null, 0L, 6, null), null, composerStartRestartGroup, i214 | 432 | (i215 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f7526p0), null, 0L, 6, null), null, composerStartRestartGroup, i214 | 432 | (i215 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i214 | 432 | (i215 << 9), 8), stroke7), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j14 = j12;
            j15 = j13;
            i17 = iM2810getSquareKaPHkGw;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if (i20 != 0) {
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                }
                if (i14 != 0) {
                    jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                }
                if ((i12 & 16) != 0) {
                    iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                } else {
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                    iM2810getSquareKaPHkGw = i16;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if (i20 != 0) {
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                }
                if (i14 != 0) {
                    jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                }
                if ((i12 & 16) != 0) {
                    iM2810getSquareKaPHkGw = StrokeCap.INSTANCE.m2810getSquareKaPHkGw();
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                } else {
                    j12 = jM713getPrimary0d7_KjU;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                    j13 = jM2543getTransparent0d7_KjU;
                    iM2810getSquareKaPHkGw = i16;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119119072, i11, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:326)");
            }
            Stroke stroke8 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM2810getSquareKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition8 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter8 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default8 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i216 = InfiniteTransition.$stable;
            int i217 = InfiniteRepeatableSpec.$stable;
            fM797getStrokeWidthD9Ej5fM = f10;
            CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f7484c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition8, 0, 5, vectorConverter8, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default8, null, composerStartRestartGroup, i216 | 4528 | (i217 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f7525p0), null, 0L, 6, null), null, composerStartRestartGroup, i216 | 432 | (i217 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f7526p0), null, 0L, 6, null), null, composerStartRestartGroup, i216 | 432 | (i217 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i216 | 432 | (i217 << 9), 8), stroke8), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j14 = j12;
            j15 = j13;
            i17 = iM2810getSquareKaPHkGw;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(fM797getStrokeWidthD9Ej5fM, i17, i11, i12, j14, j15, modifier4));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    public static final /* synthetic */ void m800CircularProgressIndicatorMBs18nI(float f6, Modifier modifier, long j10, float f10, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        long j11;
        int i13;
        float f11;
        int i14;
        Modifier modifier3;
        long jM713getPrimary0d7_KjU;
        Modifier modifier4;
        long j12;
        float fM797getStrokeWidthD9Ej5fM;
        Modifier modifier5;
        long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-409649739);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    j11 = j10;
                    int i16 = composerStartRestartGroup.changed(j11) ? 256 : 128;
                    i12 |= i16;
                } else {
                    j11 = j10;
                }
                i12 |= i16;
            } else {
                j11 = j10;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    f11 = f10;
                    if (composerStartRestartGroup.changed(f11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 4) != 0) {
                            jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                            i12 &= -897;
                        } else {
                            jM713getPrimary0d7_KjU = j11;
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j12 = jM713getPrimary0d7_KjU;
                            fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        } else {
                            modifier4 = modifier3;
                            j12 = jM713getPrimary0d7_KjU;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                        }
                        m798CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        j13 = j12;
                        f11 = fM797getStrokeWidthD9Ej5fM;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        modifier4 = modifier2;
                        j12 = j11;
                    }
                    fM797getStrokeWidthD9Ej5fM = f11;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                    }
                    m798CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j13 = j12;
                    f11 = fM797getStrokeWidthD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    long j14 = j11;
                    modifier5 = modifier2;
                    j13 = j14;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(f6, f11, i10, i11, j13, modifier5));
            }
            i12 |= 3072;
            f11 = f10;
            if ((i12 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = f11;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = f11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                }
                m798CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j13 = j12;
                f11 = fM797getStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = f11;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = f11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                }
                m798CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j13 = j12;
                f11 = fM797getStrokeWidthD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(f6, f11, i10, i11, j13, modifier5));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j10;
                if (composerStartRestartGroup.changed(j11)) {
                }
                i12 |= i16;
            } else {
                j11 = j10;
            }
            i12 |= i16;
        } else {
            j11 = j10;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                f11 = f10;
                if (composerStartRestartGroup.changed(f11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = f11;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = f11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                }
                m798CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j13 = j12;
                f11 = fM797getStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = f11;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = jM713getPrimary0d7_KjU;
                        fM797getStrokeWidthD9Ej5fM = f11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
                }
                m798CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j13 = j12;
                f11 = fM797getStrokeWidthD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(f6, f11, i10, i11, j13, modifier5));
        }
        i12 |= 3072;
        f11 = f10;
        if ((i12 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -897;
                } else {
                    jM713getPrimary0d7_KjU = j11;
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j12 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                } else {
                    modifier4 = modifier3;
                    j12 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = f11;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -897;
                } else {
                    jM713getPrimary0d7_KjU = j11;
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j12 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                } else {
                    modifier4 = modifier3;
                    j12 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = f11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
            }
            m798CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j13 = j12;
            f11 = fM797getStrokeWidthD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -897;
                } else {
                    jM713getPrimary0d7_KjU = j11;
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j12 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                } else {
                    modifier4 = modifier3;
                    j12 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = f11;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -897;
                } else {
                    jM713getPrimary0d7_KjU = j11;
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j12 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                } else {
                    modifier4 = modifier3;
                    j12 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = f11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:405)");
            }
            m798CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j13 = j12;
            f11 = fM797getStrokeWidthD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(f6, f11, i10, i11, j13, modifier5));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    public static final /* synthetic */ void m801CircularProgressIndicatoraMcp0Q(Modifier modifier, long j10, float f6, Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long jM713getPrimary0d7_KjU;
        float f10;
        Modifier modifier3;
        Modifier modifier4;
        float fM797getStrokeWidthD9Ej5fM;
        long j11;
        Modifier modifier5;
        long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-392089979);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                jM713getPrimary0d7_KjU = j10;
                int i14 = composerStartRestartGroup.changed(jM713getPrimary0d7_KjU) ? 32 : 16;
                i12 |= i14;
            } else {
                jM713getPrimary0d7_KjU = j10;
            }
            i12 |= i14;
        } else {
            jM713getPrimary0d7_KjU = j10;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 896) == 0) {
                f10 = f6;
                i12 |= composerStartRestartGroup.changed(f10) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -113;
                    }
                    if (i15 != 0) {
                        modifier4 = modifier3;
                        fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                        j11 = jM713getPrimary0d7_KjU;
                    } else {
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-392089979, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
                    }
                    m799CircularProgressIndicatorLxG7B9w(modifier4, j11, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2810getSquareKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j12 = j11;
                    f10 = fM797getStrokeWidthD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    modifier4 = modifier2;
                }
                j11 = jM713getPrimary0d7_KjU;
                fM797getStrokeWidthD9Ej5fM = f10;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-392089979, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
                }
                m799CircularProgressIndicatorLxG7B9w(modifier4, j11, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2810getSquareKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j12 = j11;
                f10 = fM797getStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                long j13 = jM713getPrimary0d7_KjU;
                modifier5 = modifier2;
                j12 = j13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(f10, i10, i11, j12, modifier5));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        f10 = f6;
        if ((i12 & 731) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -113;
                }
                if (i15 != 0) {
                    modifier4 = modifier3;
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    j11 = jM713getPrimary0d7_KjU;
                } else {
                    modifier4 = modifier3;
                    j11 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = f10;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -113;
                }
                if (i15 != 0) {
                    modifier4 = modifier3;
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    j11 = jM713getPrimary0d7_KjU;
                } else {
                    modifier4 = modifier3;
                    j11 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = f10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-392089979, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
            }
            m799CircularProgressIndicatorLxG7B9w(modifier4, j11, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2810getSquareKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j12 = j11;
            f10 = fM797getStrokeWidthD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -113;
                }
                if (i15 != 0) {
                    modifier4 = modifier3;
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    j11 = jM713getPrimary0d7_KjU;
                } else {
                    modifier4 = modifier3;
                    j11 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = f10;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -113;
                }
                if (i15 != 0) {
                    modifier4 = modifier3;
                    fM797getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m797getStrokeWidthD9Ej5fM();
                    j11 = jM713getPrimary0d7_KjU;
                } else {
                    modifier4 = modifier3;
                    j11 = jM713getPrimary0d7_KjU;
                    fM797getStrokeWidthD9Ej5fM = f10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-392089979, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:421)");
            }
            m799CircularProgressIndicatorLxG7B9w(modifier4, j11, fM797getStrokeWidthD9Ej5fM, Color.INSTANCE.m2543getTransparent0d7_KjU(), StrokeCap.INSTANCE.m2810getSquareKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j12 = j11;
            f10 = fM797getStrokeWidthD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(f10, i10, i11, j12, modifier5));
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e4 A[LOOP:0: B:75:0x01e2->B:76:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x021a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final void m802LinearProgressIndicator2cYBFYY(@Nullable Modifier modifier, long j10, long j11, int i10, @Nullable Composer composer, int i11, int i12) {
        Modifier modifier2;
        int i13;
        long jM713getPrimary0d7_KjU;
        long jM2507copywmQWz5c$default;
        int i14;
        Modifier modifier3;
        int iM2808getButtKaPHkGw;
        long j12;
        long j13;
        State<Float> stateAnimateFloat;
        State<Float> stateAnimateFloat2;
        State<Float> stateAnimateFloat3;
        State<Float> stateAnimateFloat4;
        Object[] objArr;
        boolean zChanged;
        int i15;
        Object objRememberedValue;
        long j14;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(1501635280);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 14) == 0) {
            modifier2 = modifier;
            i13 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                jM713getPrimary0d7_KjU = j10;
                int i18 = composerStartRestartGroup.changed(jM713getPrimary0d7_KjU) ? 32 : 16;
                i13 |= i18;
            } else {
                jM713getPrimary0d7_KjU = j10;
            }
            i13 |= i18;
        } else {
            jM713getPrimary0d7_KjU = j10;
        }
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                jM2507copywmQWz5c$default = j11;
                int i19 = composerStartRestartGroup.changed(jM2507copywmQWz5c$default) ? 256 : 128;
                i13 |= i19;
            } else {
                jM2507copywmQWz5c$default = j11;
            }
            i13 |= i19;
        } else {
            jM2507copywmQWz5c$default = j11;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                i14 = i10;
                int i20 = composerStartRestartGroup.changed(i14) ? 2048 : 1024;
                i13 |= i20;
            } else {
                i14 = i10;
            }
            i13 |= i20;
        } else {
            i14 = i10;
        }
        if ((i13 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j14 = jM2507copywmQWz5c$default;
            i16 = i14;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i17 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i12 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if ((i12 & 4) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i12 & 8) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    j12 = jM713getPrimary0d7_KjU;
                    j13 = jM2507copywmQWz5c$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1501635280, i11, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:106)");
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(o.f7560p0), null, 0L, 6, null);
                int i21 = InfiniteTransition.$stable;
                int i22 = InfiniteRepeatableSpec.$stable;
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i21 | 432 | (i22 << 9), 8);
                stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(p.f7561p0), null, 0L, 6, null), null, composerStartRestartGroup, i21 | 432 | (i22 << 9), 8);
                stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(q.f7562p0), null, 0L, 6, null), null, composerStartRestartGroup, i21 | 432 | (i22 << 9), 8);
                stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(r.f7563p0), null, 0L, 6, null), null, composerStartRestartGroup, i21 | 432 | (i22 << 9), 8);
                Modifier modifierM337sizeVpY3zN4 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), f7483b, f7482a);
                objArr = new Object[]{Color.m2498boximpl(j13), StrokeCap.m2801boximpl(iM2808getButtKaPHkGw), stateAnimateFloat, stateAnimateFloat2, Color.m2498boximpl(j12), stateAnimateFloat3, stateAnimateFloat4};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                for (i15 = 0; i15 < 7; i15++) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i15]);
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new k(iM2808getButtKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM337sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM713getPrimary0d7_KjU = j12;
                j14 = j13;
                i16 = iM2808getButtKaPHkGw;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            j12 = jM713getPrimary0d7_KjU;
            j13 = jM2507copywmQWz5c$default;
            iM2808getButtKaPHkGw = i14;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501635280, i11, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:106)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(o.f7560p0), null, 0L, 6, null);
            int i23 = InfiniteTransition.$stable;
            int i24 = InfiniteRepeatableSpec.$stable;
            stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i23 | 432 | (i24 << 9), 8);
            stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(p.f7561p0), null, 0L, 6, null), null, composerStartRestartGroup, i23 | 432 | (i24 << 9), 8);
            stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(q.f7562p0), null, 0L, 6, null), null, composerStartRestartGroup, i23 | 432 | (i24 << 9), 8);
            stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(r.f7563p0), null, 0L, 6, null), null, composerStartRestartGroup, i23 | 432 | (i24 << 9), 8);
            Modifier modifierM337sizeVpY3zN5 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), f7483b, f7482a);
            objArr = new Object[]{Color.m2498boximpl(j13), StrokeCap.m2801boximpl(iM2808getButtKaPHkGw), stateAnimateFloat, stateAnimateFloat2, Color.m2498boximpl(j12), stateAnimateFloat3, stateAnimateFloat4};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i15 < 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i15]);
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new k(iM2808getButtKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new k(iM2808getButtKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM337sizeVpY3zN5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM713getPrimary0d7_KjU = j12;
            j14 = j13;
            i16 = iM2808getButtKaPHkGw;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l(modifier3, jM713getPrimary0d7_KjU, j14, i16, i11, i12));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m803LinearProgressIndicatorRIQooxk(Modifier modifier, long j10, long j11, Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long jM713getPrimary0d7_KjU;
        long jM2507copywmQWz5c$default;
        Modifier modifier3;
        long j12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-819397058);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            jM713getPrimary0d7_KjU = j10;
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changed(jM713getPrimary0d7_KjU)) ? 32 : 16;
        } else {
            jM713getPrimary0d7_KjU = j10;
        }
        if ((i10 & 896) == 0) {
            jM2507copywmQWz5c$default = j11;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(jM2507copywmQWz5c$default)) ? 256 : 128;
        } else {
            jM2507copywmQWz5c$default = j11;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j12 = jM713getPrimary0d7_KjU;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i11 & 2) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                modifier3 = modifier2;
            }
            int i14 = i12;
            j12 = jM713getPrimary0d7_KjU;
            long j13 = jM2507copywmQWz5c$default;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i14, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:205)");
            }
            m802LinearProgressIndicator2cYBFYY(modifier3, j12, j13, StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i14 & 14) | (i14 & 112) | (i14 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM2507copywmQWz5c$default = j13;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n(modifier3, j12, jM2507copywmQWz5c$default, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c A[LOOP:0: B:85:0x014a->B:86:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0165  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:98:0x0191  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m804LinearProgressIndicator_5eSRE(float f6, @Nullable Modifier modifier, long j10, long j11, int i10, @Nullable Composer composer, int i11, int i12) {
        int i13;
        Modifier modifier2;
        long jM713getPrimary0d7_KjU;
        long jM2507copywmQWz5c$default;
        int iM2808getButtKaPHkGw;
        float fCoerceIn;
        Object[] objArr;
        int i14;
        boolean zChanged;
        Object objRememberedValue;
        long j12;
        Modifier modifier3;
        long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-531984864);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 == 0) {
            if ((i11 & 112) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i11 & 896) == 0) {
                if ((i12 & 4) == 0) {
                    jM713getPrimary0d7_KjU = j10;
                    int i16 = composerStartRestartGroup.changed(jM713getPrimary0d7_KjU) ? 256 : 128;
                    i13 |= i16;
                } else {
                    jM713getPrimary0d7_KjU = j10;
                }
                i13 |= i16;
            } else {
                jM713getPrimary0d7_KjU = j10;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    jM2507copywmQWz5c$default = j11;
                    int i17 = composerStartRestartGroup.changed(jM2507copywmQWz5c$default) ? 2048 : 1024;
                    i13 |= i17;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                i13 |= i17;
            } else {
                jM2507copywmQWz5c$default = j11;
            }
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    iM2808getButtKaPHkGw = i10;
                    int i18 = composerStartRestartGroup.changed(iM2808getButtKaPHkGw) ? 16384 : 8192;
                    i13 |= i18;
                } else {
                    iM2808getButtKaPHkGw = i10;
                }
                i13 |= i18;
            } else {
                iM2808getButtKaPHkGw = i10;
            }
            if ((i13 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    }
                    if ((i12 & 8) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    if ((i12 & 16) != 0) {
                        iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531984864, i11, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:72)");
                }
                fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                Modifier modifierM337sizeVpY3zN4 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f7483b, f7482a);
                objArr = new Object[]{Color.m2498boximpl(jM2507copywmQWz5c$default), StrokeCap.m2801boximpl(iM2808getButtKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(jM713getPrimary0d7_KjU)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i14 = 0;
                zChanged = false;
                for (int i19 = 4; i14 < i19; i19 = 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i14]);
                    i14++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new i(jM2507copywmQWz5c$default, iM2808getButtKaPHkGw, jM713getPrimary0d7_KjU, fCoerceIn);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM337sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            j12 = jM713getPrimary0d7_KjU;
            modifier3 = modifier2;
            j13 = jM2507copywmQWz5c$default;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(f6, iM2808getButtKaPHkGw, i11, i12, j12, j13, modifier3));
        }
        i13 |= 48;
        modifier2 = modifier;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                jM713getPrimary0d7_KjU = j10;
                if (composerStartRestartGroup.changed(jM713getPrimary0d7_KjU)) {
                }
                i13 |= i16;
            } else {
                jM713getPrimary0d7_KjU = j10;
            }
            i13 |= i16;
        } else {
            jM713getPrimary0d7_KjU = j10;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                jM2507copywmQWz5c$default = j11;
                if (composerStartRestartGroup.changed(jM2507copywmQWz5c$default)) {
                }
                i13 |= i17;
            } else {
                jM2507copywmQWz5c$default = j11;
            }
            i13 |= i17;
        } else {
            jM2507copywmQWz5c$default = j11;
        }
        if ((57344 & i11) == 0) {
            if ((i12 & 16) == 0) {
                iM2808getButtKaPHkGw = i10;
                if (composerStartRestartGroup.changed(iM2808getButtKaPHkGw)) {
                }
                i13 |= i18;
            } else {
                iM2808getButtKaPHkGw = i10;
            }
            i13 |= i18;
        } else {
            iM2808getButtKaPHkGw = i10;
        }
        if ((i13 & 46811) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if ((i12 & 8) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i12 & 16) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                }
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if ((i12 & 8) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i12 & 16) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531984864, i11, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:72)");
            }
            fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
            Modifier modifierM337sizeVpY3zN5 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f7483b, f7482a);
            objArr = new Object[]{Color.m2498boximpl(jM2507copywmQWz5c$default), StrokeCap.m2801boximpl(iM2808getButtKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(jM713getPrimary0d7_KjU)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i14 = 0;
            zChanged = false;
            while (i14 < i19) {
                zChanged |= composerStartRestartGroup.changed(objArr[i14]);
                i14++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new i(jM2507copywmQWz5c$default, iM2808getButtKaPHkGw, jM713getPrimary0d7_KjU, fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new i(jM2507copywmQWz5c$default, iM2808getButtKaPHkGw, jM713getPrimary0d7_KjU, fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM337sizeVpY3zN5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if ((i12 & 8) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i12 & 16) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                }
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                }
                if ((i12 & 8) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                if ((i12 & 16) != 0) {
                    iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531984864, i11, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:72)");
            }
            fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
            Modifier modifierM337sizeVpY3zN6 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f7483b, f7482a);
            objArr = new Object[]{Color.m2498boximpl(jM2507copywmQWz5c$default), StrokeCap.m2801boximpl(iM2808getButtKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(jM713getPrimary0d7_KjU)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i14 = 0;
            zChanged = false;
            while (i14 < i19) {
                zChanged |= composerStartRestartGroup.changed(objArr[i14]);
                i14++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new i(jM2507copywmQWz5c$default, iM2808getButtKaPHkGw, jM713getPrimary0d7_KjU, fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new i(jM2507copywmQWz5c$default, iM2808getButtKaPHkGw, jM713getPrimary0d7_KjU, fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM337sizeVpY3zN6, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        j12 = jM713getPrimary0d7_KjU;
        modifier3 = modifier2;
        j13 = jM2507copywmQWz5c$default;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j(f6, iM2808getButtKaPHkGw, i11, i12, j12, j13, modifier3));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9 A[PHI: r3 r4 r5
      0x00a9: PHI (r3v16 int) = (r3v11 int), (r3v18 int) binds: [B:71:0x00c7, B:61:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r4v5 androidx.compose.ui.Modifier) = (r4v2 androidx.compose.ui.Modifier), (r4v8 androidx.compose.ui.Modifier) binds: [B:71:0x00c7, B:61:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r5v11 long) = (r5v5 long), (r5v12 long) binds: [B:71:0x00c7, B:61:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x010e  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    public static final /* synthetic */ void m805LinearProgressIndicatoreaDK9VM(float f6, Modifier modifier, long j10, long j11, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        long j12;
        long j13;
        Modifier modifier3;
        long jM713getPrimary0d7_KjU;
        long jM2507copywmQWz5c$default;
        long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-850309746);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                j12 = j10;
                if ((i11 & 4) == 0 || !composerStartRestartGroup.changed(j12)) {
                    i14 = 128;
                } else {
                    i14 = 256;
                }
                i12 |= i14;
            } else {
                j12 = j10;
            }
            if ((i10 & 7168) == 0) {
                j13 = j11;
                if ((i11 & 8) == 0 || !composerStartRestartGroup.changed(j13)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i12 |= i13;
            } else {
                j13 = j11;
            }
            if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                        i12 &= -897;
                    } else {
                        jM713getPrimary0d7_KjU = j12;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850309746, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
                    }
                    m804LinearProgressIndicator_5eSRE(f6, modifier3, jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j12 = jM713getPrimary0d7_KjU;
                    j14 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    modifier3 = modifier2;
                    jM713getPrimary0d7_KjU = j12;
                }
                jM2507copywmQWz5c$default = j13;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850309746, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
                }
                m804LinearProgressIndicator_5eSRE(f6, modifier3, jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j12 = jM713getPrimary0d7_KjU;
                j14 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j14 = j13;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new m(f6, modifier3, j12, j14, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            j12 = j10;
            if ((i11 & 4) == 0) {
                i14 = 128;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            j12 = j10;
        }
        if ((i10 & 7168) == 0) {
            j13 = j11;
            if ((i11 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        } else {
            j13 = j11;
        }
        if ((i12 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -897;
                } else {
                    jM713getPrimary0d7_KjU = j12;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j13;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -897;
                } else {
                    jM713getPrimary0d7_KjU = j12;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j13;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850309746, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
            }
            m804LinearProgressIndicator_5eSRE(f6, modifier3, jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j12 = jM713getPrimary0d7_KjU;
            j14 = jM2507copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -897;
                } else {
                    jM713getPrimary0d7_KjU = j12;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j13;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    jM713getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m713getPrimary0d7_KjU();
                    i12 &= -897;
                } else {
                    jM713getPrimary0d7_KjU = j12;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM713getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j13;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850309746, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:190)");
            }
            m804LinearProgressIndicator_5eSRE(f6, modifier3, jM713getPrimary0d7_KjU, jM2507copywmQWz5c$default, StrokeCap.INSTANCE.m2808getButtKaPHkGw(), composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j12 = jM713getPrimary0d7_KjU;
            j14 = jM2507copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new m(f6, modifier3, j12, j14, i10, i11));
    }

    public static final void a(DrawScope drawScope, float f6, float f10, long j10, Stroke stroke) {
        float f11 = 2;
        float width = stroke.getWidth() / f11;
        float fM2344getWidthimpl = Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc()) - (f11 * width);
        a1.b.v(drawScope, j10, f6, f10, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(fM2344getWidthimpl, fM2344getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    public static final float access$CircularProgressIndicator_LxG7B9w$lambda$10(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float access$CircularProgressIndicator_LxG7B9w$lambda$11(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final int access$CircularProgressIndicator_LxG7B9w$lambda$8(State state) {
        return ((Number) state.getValue()).intValue();
    }

    public static final float access$CircularProgressIndicator_LxG7B9w$lambda$9(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float access$LinearProgressIndicator_2cYBFYY$lambda$1(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float access$LinearProgressIndicator_2cYBFYY$lambda$2(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float access$LinearProgressIndicator_2cYBFYY$lambda$3(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float access$LinearProgressIndicator_2cYBFYY$lambda$4(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: access$drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m808access$drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f6, float f10, float f11, long j10, Stroke stroke) {
        float fM4389constructorimpl;
        if (StrokeCap.m2804equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m2808getButtKaPHkGw())) {
            fM4389constructorimpl = 0.0f;
        } else {
            fM4389constructorimpl = ((f10 / Dp.m4389constructorimpl(f7484c / 2)) * 57.29578f) / 2.0f;
        }
        a(drawScope, f6 + fM4389constructorimpl, Math.max(f11, 0.1f), j10, stroke);
    }

    public static final void b(DrawScope drawScope, float f6, float f10, long j10, float f11, int i10) {
        float fM2344getWidthimpl = Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc());
        float fM2341getHeightimpl = Size.m2341getHeightimpl(drawScope.mo2909getSizeNHjbRc());
        float f12 = 2;
        float f13 = fM2341getHeightimpl / f12;
        boolean z10 = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f14 = (z10 ? f6 : 1.0f - f10) * fM2344getWidthimpl;
        float f15 = (z10 ? f10 : 1.0f - f6) * fM2344getWidthimpl;
        if (StrokeCap.m2804equalsimpl0(i10, StrokeCap.INSTANCE.m2808getButtKaPHkGw()) || fM2341getHeightimpl > fM2344getWidthimpl) {
            a1.b.C(drawScope, j10, OffsetKt.Offset(f14, f13), OffsetKt.Offset(f15, f13), f11, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f16 = f11 / f12;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = ok.e.rangeTo(f16, fM2344getWidthimpl - f16);
        float fFloatValue = ((Number) kotlin.ranges.c.coerceIn(Float.valueOf(f14), closedFloatingPointRangeRangeTo)).floatValue();
        float fFloatValue2 = ((Number) kotlin.ranges.c.coerceIn(Float.valueOf(f15), closedFloatingPointRangeRangeTo)).floatValue();
        if (Math.abs(f10 - f6) > 0.0f) {
            a1.b.C(drawScope, j10, OffsetKt.Offset(fFloatValue, f13), OffsetKt.Offset(fFloatValue2, f13), f11, i10, null, 0.0f, null, 0, 480, null);
        }
    }
}
