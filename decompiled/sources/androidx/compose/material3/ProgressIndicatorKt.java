package androidx.compose.material3;

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
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
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
import androidx.profileinstaller.ProfileVerifier;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\u001aE\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u001d\u0010\"\u001a\u00020\u00138\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u001d\u0010%\u001a\u00020\u00138\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!\"\u001d\u0010(\u001a\u00020\u00138\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "trackColor", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "strokeWidth", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "a", "F", "getLinearIndicatorWidth", "()F", "LinearIndicatorWidth", "b", "getLinearIndicatorHeight", "LinearIndicatorHeight", "c", "getCircularIndicatorDiameter", "CircularIndicatorDiameter", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,612:1\n83#2,3:613\n83#2,3:622\n1114#3,6:616\n1114#3,6:625\n76#4:631\n76#4:632\n75#5,7:633\n92#5:641\n58#5:642\n154#6:640\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n*L\n85#1:613,3\n166#1:622,3\n85#1:616,6\n166#1:625,6\n296#1:631\n336#1:632\n487#1:633,7\n558#1:641\n558#1:642\n549#1:640\n*E\n"})
public final class ProgressIndicatorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11033a = Dp.m4389constructorimpl(240);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11034b = LinearProgressIndicatorTokens.INSTANCE.m1766getTrackHeightD9Ej5fM();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f11036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f11037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f11038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f11039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final CubicBezierEasing f11040h;

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class a extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11041p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f11042q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Stroke f11043r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f11044s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, long j10, Stroke stroke, long j11) {
            super(1);
            this.f11041p0 = f6;
            this.f11042q0 = j10;
            this.f11043r0 = stroke;
            this.f11044s0 = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float f6 = 360.0f * this.f11041p0;
            ProgressIndicatorKt.a(Canvas, 0.0f, 360.0f, this.f11042q0, this.f11043r0);
            ProgressIndicatorKt.a(Canvas, 270.0f, f6, this.f11044s0, this.f11043r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11045p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11046q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11047r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f11048s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f11049t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11050u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f11051w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6, Modifier modifier, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f11045p0 = f6;
            this.f11046q0 = modifier;
            this.f11047r0 = j10;
            this.f11048s0 = f10;
            this.f11049t0 = j11;
            this.f11050u0 = i10;
            this.v0 = i11;
            this.f11051w0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m1206CircularProgressIndicatorDUhRLBM(this.f11045p0, this.f11046q0, this.f11047r0, this.f11048s0, this.f11049t0, this.f11050u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f11051w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class c extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f11052p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Stroke f11053q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Integer> f11054r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11055s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11056t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11057u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f11058w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f6, long j10, long j11, State state, State state2, State state3, State state4, Stroke stroke) {
            super(1);
            this.f11052p0 = j10;
            this.f11053q0 = stroke;
            this.f11054r0 = state;
            this.f11055s0 = state2;
            this.f11056t0 = state3;
            this.f11057u0 = state4;
            this.v0 = f6;
            this.f11058w0 = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            ProgressIndicatorKt.a(Canvas, 0.0f, 360.0f, this.f11052p0, this.f11053q0);
            float fFloatValue = (this.f11054r0.getValue().floatValue() * 216.0f) % 360.0f;
            float fFloatValue2 = this.f11055s0.getValue().floatValue();
            State<Float> state = this.f11056t0;
            ProgressIndicatorKt.m1216access$drawIndeterminateCircularIndicatorhrjfTZI(Canvas, this.f11057u0.getValue().floatValue() + (fFloatValue - 90.0f) + state.getValue().floatValue(), this.v0, Math.abs(fFloatValue2 - state.getValue().floatValue()), this.f11058w0, this.f11053q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11059p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f11060q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f11061r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f11062s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11063t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11064u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6, int i10, int i11, int i12, long j10, long j11, Modifier modifier) {
            super(2);
            this.f11059p0 = modifier;
            this.f11060q0 = j10;
            this.f11061r0 = f6;
            this.f11062s0 = j11;
            this.f11063t0 = i10;
            this.f11064u0 = i11;
            this.v0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m1207CircularProgressIndicatorLxG7B9w(this.f11059p0, this.f11060q0, this.f11061r0, this.f11062s0, this.f11063t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11064u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11065p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11066q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11067r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f11068s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11069t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11070u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f6, float f10, int i10, int i11, long j10, Modifier modifier) {
            super(2);
            this.f11065p0 = f6;
            this.f11066q0 = modifier;
            this.f11067r0 = j10;
            this.f11068s0 = f10;
            this.f11069t0 = i10;
            this.f11070u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m1208CircularProgressIndicatorMBs18nI(this.f11065p0, this.f11066q0, this.f11067r0, this.f11068s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11069t0 | 1), this.f11070u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11071p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f11072q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f11073r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f11074s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11075t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f6, int i10, int i11, long j10, Modifier modifier) {
            super(2);
            this.f11071p0 = modifier;
            this.f11072q0 = j10;
            this.f11073r0 = f6;
            this.f11074s0 = i10;
            this.f11075t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m1209CircularProgressIndicatoraMcp0Q(this.f11071p0, this.f11072q0, this.f11073r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11074s0 | 1), this.f11075t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class g extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f11076p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(1332);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f11040h);
            keyframes.at(Float.valueOf(290.0f), 666);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class h extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f11077p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(1332);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.f11040h);
            keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class i extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f11078p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f11079q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f11080r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f11081s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j10, int i10, long j11, float f6) {
            super(1);
            this.f11078p0 = j10;
            this.f11079q0 = i10;
            this.f11080r0 = f6;
            this.f11081s0 = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fM2341getHeightimpl = Size.m2341getHeightimpl(Canvas.mo2909getSizeNHjbRc());
            ProgressIndicatorKt.b(Canvas, 0.0f, 1.0f, this.f11078p0, fM2341getHeightimpl, this.f11079q0);
            ProgressIndicatorKt.b(Canvas, 0.0f, this.f11080r0, this.f11081s0, fM2341getHeightimpl, this.f11079q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11082p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11083q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11084r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f11085s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11086t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11087u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f6, int i10, int i11, int i12, long j10, long j11, Modifier modifier) {
            super(2);
            this.f11082p0 = f6;
            this.f11083q0 = modifier;
            this.f11084r0 = j10;
            this.f11085s0 = j11;
            this.f11086t0 = i10;
            this.f11087u0 = i11;
            this.v0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m1212LinearProgressIndicator_5eSRE(this.f11082p0, this.f11083q0, this.f11084r0, this.f11085s0, this.f11086t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11087u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class k extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f11088p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f11089q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11090r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11091s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f11092t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11093u0;
        public final /* synthetic */ State<Float> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i10, long j10, long j11, State state, State state2, State state3, State state4) {
            super(1);
            this.f11088p0 = j10;
            this.f11089q0 = i10;
            this.f11090r0 = state;
            this.f11091s0 = state2;
            this.f11092t0 = j11;
            this.f11093u0 = state3;
            this.v0 = state4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fM2341getHeightimpl = Size.m2341getHeightimpl(Canvas.mo2909getSizeNHjbRc());
            ProgressIndicatorKt.b(Canvas, 0.0f, 1.0f, this.f11088p0, fM2341getHeightimpl, this.f11089q0);
            State<Float> state = this.f11090r0;
            float fFloatValue = state.getValue().floatValue();
            State<Float> state2 = this.f11091s0;
            if (fFloatValue - state2.getValue().floatValue() > 0.0f) {
                ProgressIndicatorKt.b(Canvas, state.getValue().floatValue(), state2.getValue().floatValue(), this.f11092t0, fM2341getHeightimpl, this.f11089q0);
            }
            State<Float> state3 = this.f11093u0;
            float fFloatValue2 = state3.getValue().floatValue();
            State<Float> state4 = this.v0;
            if (fFloatValue2 - state4.getValue().floatValue() > 0.0f) {
                ProgressIndicatorKt.b(Canvas, state3.getValue().floatValue(), state4.getValue().floatValue(), this.f11092t0, fM2341getHeightimpl, this.f11089q0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11094p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f11095q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11096r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f11097s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11098t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11099u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Modifier modifier, long j10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f11094p0 = modifier;
            this.f11095q0 = j10;
            this.f11096r0 = j11;
            this.f11097s0 = i10;
            this.f11098t0 = i11;
            this.f11099u0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m1210LinearProgressIndicator2cYBFYY(this.f11094p0, this.f11095q0, this.f11096r0, this.f11097s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11098t0 | 1), this.f11099u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class m extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11100p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11101q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11102r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f11103s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11104t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11105u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f6, Modifier modifier, long j10, long j11, int i10, int i11) {
            super(2);
            this.f11100p0 = f6;
            this.f11101q0 = modifier;
            this.f11102r0 = j10;
            this.f11103s0 = j11;
            this.f11104t0 = i10;
            this.f11105u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m1213LinearProgressIndicatoreaDK9VM(this.f11100p0, this.f11101q0, this.f11102r0, this.f11103s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11104t0 | 1), this.f11105u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class n extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11106p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f11107q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f11108r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f11109s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11110t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Modifier modifier, long j10, long j11, int i10, int i11) {
            super(2);
            this.f11106p0 = modifier;
            this.f11107q0 = j10;
            this.f11108r0 = j11;
            this.f11109s0 = i10;
            this.f11110t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ProgressIndicatorKt.m1211LinearProgressIndicatorRIQooxk(this.f11106p0, this.f11107q0, this.f11108r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11109s0 | 1), this.f11110t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class o extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f11111p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(ReturnCode.ERR_MANAGEMENT);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f11036d);
            keyframes.at(Float.valueOf(1.0f), 750);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class p extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f11112p0 = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(ReturnCode.ERR_MANAGEMENT);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.f11037e);
            keyframes.at(Float.valueOf(1.0f), 1183);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class q extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f11113p0 = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(ReturnCode.ERR_MANAGEMENT);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.f11038f);
            keyframes.at(Float.valueOf(1.0f), 1567);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ProgressIndicator.kt */
    public static final class r extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f11114p0 = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(ReturnCode.ERR_MANAGEMENT);
            keyframes.with(keyframes.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.f11039g);
            keyframes.at(Float.valueOf(1.0f), ReturnCode.ERR_MANAGEMENT);
            return Unit.INSTANCE;
        }
    }

    static {
        CircularProgressIndicatorTokens circularProgressIndicatorTokens = CircularProgressIndicatorTokens.INSTANCE;
        f11035c = Dp.m4389constructorimpl(circularProgressIndicatorTokens.m1538getSizeD9Ej5fM() - Dp.m4389constructorimpl(circularProgressIndicatorTokens.m1537getActiveIndicatorWidthD9Ej5fM() * 2));
        f11036d = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        f11037e = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        f11038f = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        f11039g = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        f11040h = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0180  */
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
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final void m1206CircularProgressIndicatorDUhRLBM(float f6, @Nullable Modifier modifier, long j10, float f10, long j11, int i10, @Nullable Composer composer, int i11, int i12) {
        int i13;
        Modifier modifier2;
        long circularColor;
        int i14;
        float fM1204getCircularStrokeWidthD9Ej5fM;
        int i15;
        long circularTrackColor;
        int i16;
        int iM1202getCircularDeterminateStrokeCapKaPHkGw;
        int i17;
        long j12;
        long j13;
        int i18;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1472321743);
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
                    circularColor = j10;
                    int i20 = composerStartRestartGroup.changed(circularColor) ? 256 : 128;
                    i13 |= i20;
                } else {
                    circularColor = j10;
                }
                i13 |= i20;
            } else {
                circularColor = j10;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 7168) == 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = f10;
                    if (composerStartRestartGroup.changed(fM1204getCircularStrokeWidthD9Ej5fM)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((57344 & i11) == 0) {
                    if ((i12 & 16) == 0) {
                        circularTrackColor = j11;
                        int i21 = composerStartRestartGroup.changed(circularTrackColor) ? 16384 : 8192;
                        i13 |= i21;
                    } else {
                        circularTrackColor = j11;
                    }
                    i13 |= i21;
                } else {
                    circularTrackColor = j11;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((458752 & i11) == 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = i10;
                        if (composerStartRestartGroup.changed(iM1202getCircularDeterminateStrokeCapKaPHkGw)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i13 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i19 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i12 & 4) != 0) {
                                circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            }
                            if (i14 != 0) {
                                fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                            }
                            if ((i12 & 16) != 0) {
                                circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            }
                            if (i16 != 0) {
                                iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                        }
                        float fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                        CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f11035c), new a(fCoerceIn, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    j12 = circularColor;
                    j13 = circularTrackColor;
                    i18 = iM1202getCircularDeterminateStrokeCapKaPHkGw;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM1204getCircularStrokeWidthD9Ej5fM, j13, i18, i11, i12));
                }
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                iM1202getCircularDeterminateStrokeCapKaPHkGw = i10;
                if ((i13 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                    }
                    float fCoerceIn2 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn2, null, 0, 6, null), f11035c), new a(fCoerceIn2, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
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
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                    }
                    float fCoerceIn3 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn3, null, 0, 6, null), f11035c), new a(fCoerceIn3, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j12 = circularColor;
                j13 = circularTrackColor;
                i18 = iM1202getCircularDeterminateStrokeCapKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM1204getCircularStrokeWidthD9Ej5fM, j13, i18, i11, i12));
            }
            i13 |= 3072;
            fM1204getCircularStrokeWidthD9Ej5fM = f10;
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    circularTrackColor = j11;
                    if (composerStartRestartGroup.changed(circularTrackColor)) {
                    }
                    i13 |= i21;
                } else {
                    circularTrackColor = j11;
                }
                i13 |= i21;
            } else {
                circularTrackColor = j11;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    iM1202getCircularDeterminateStrokeCapKaPHkGw = i10;
                    if (composerStartRestartGroup.changed(iM1202getCircularDeterminateStrokeCapKaPHkGw)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i13 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                    }
                    float fCoerceIn4 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn4, null, 0, 6, null), f11035c), new a(fCoerceIn4, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
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
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                    }
                    float fCoerceIn5 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn5, null, 0, 6, null), f11035c), new a(fCoerceIn5, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j12 = circularColor;
                j13 = circularTrackColor;
                i18 = iM1202getCircularDeterminateStrokeCapKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM1204getCircularStrokeWidthD9Ej5fM, j13, i18, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            iM1202getCircularDeterminateStrokeCapKaPHkGw = i10;
            if ((i13 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                }
                float fCoerceIn6 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn6, null, 0, 6, null), f11035c), new a(fCoerceIn6, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
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
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                }
                float fCoerceIn7 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn7, null, 0, 6, null), f11035c), new a(fCoerceIn7, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j12 = circularColor;
            j13 = circularTrackColor;
            i18 = iM1202getCircularDeterminateStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM1204getCircularStrokeWidthD9Ej5fM, j13, i18, i11, i12));
        }
        i13 |= 48;
        modifier2 = modifier;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                circularColor = j10;
                if (composerStartRestartGroup.changed(circularColor)) {
                }
                i13 |= i20;
            } else {
                circularColor = j10;
            }
            i13 |= i20;
        } else {
            circularColor = j10;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 7168) == 0) {
                fM1204getCircularStrokeWidthD9Ej5fM = f10;
                if (composerStartRestartGroup.changed(fM1204getCircularStrokeWidthD9Ej5fM)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    circularTrackColor = j11;
                    if (composerStartRestartGroup.changed(circularTrackColor)) {
                    }
                    i13 |= i21;
                } else {
                    circularTrackColor = j11;
                }
                i13 |= i21;
            } else {
                circularTrackColor = j11;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    iM1202getCircularDeterminateStrokeCapKaPHkGw = i10;
                    if (composerStartRestartGroup.changed(iM1202getCircularDeterminateStrokeCapKaPHkGw)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i13 & 374491) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                    }
                    float fCoerceIn8 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn8, null, 0, 6, null), f11035c), new a(fCoerceIn8, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
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
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i16 != 0) {
                            iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                    }
                    float fCoerceIn9 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn9, null, 0, 6, null), f11035c), new a(fCoerceIn9, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                j12 = circularColor;
                j13 = circularTrackColor;
                i18 = iM1202getCircularDeterminateStrokeCapKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM1204getCircularStrokeWidthD9Ej5fM, j13, i18, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            iM1202getCircularDeterminateStrokeCapKaPHkGw = i10;
            if ((i13 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                }
                float fCoerceIn10 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn10, null, 0, 6, null), f11035c), new a(fCoerceIn10, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
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
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                }
                float fCoerceIn11 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn11, null, 0, 6, null), f11035c), new a(fCoerceIn11, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j12 = circularColor;
            j13 = circularTrackColor;
            i18 = iM1202getCircularDeterminateStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM1204getCircularStrokeWidthD9Ej5fM, j13, i18, i11, i12));
        }
        i13 |= 3072;
        fM1204getCircularStrokeWidthD9Ej5fM = f10;
        if ((57344 & i11) == 0) {
            if ((i12 & 16) == 0) {
                circularTrackColor = j11;
                if (composerStartRestartGroup.changed(circularTrackColor)) {
                }
                i13 |= i21;
            } else {
                circularTrackColor = j11;
            }
            i13 |= i21;
        } else {
            circularTrackColor = j11;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                iM1202getCircularDeterminateStrokeCapKaPHkGw = i10;
                if (composerStartRestartGroup.changed(iM1202getCircularDeterminateStrokeCapKaPHkGw)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i13 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                }
                float fCoerceIn12 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn12, null, 0, 6, null), f11035c), new a(fCoerceIn12, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
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
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i16 != 0) {
                        iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
                }
                float fCoerceIn13 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn13, null, 0, 6, null), f11035c), new a(fCoerceIn13, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j12 = circularColor;
            j13 = circularTrackColor;
            i18 = iM1202getCircularDeterminateStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM1204getCircularStrokeWidthD9Ej5fM, j13, i18, i11, i12));
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        iM1202getCircularDeterminateStrokeCapKaPHkGw = i10;
        if ((i13 & 374491) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                }
                if ((i12 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                }
                if (i16 != 0) {
                    iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                }
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                }
                if ((i12 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                }
                if (i16 != 0) {
                    iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
            }
            float fCoerceIn14 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
            CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn14, null, 0, 6, null), f11035c), new a(fCoerceIn14, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
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
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                }
                if ((i12 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                }
                if (i16 != 0) {
                    iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                }
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                }
                if ((i12 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                }
                if (i16 != 0) {
                    iM1202getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1202getCircularDeterminateStrokeCapKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1472321743, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:286)");
            }
            float fCoerceIn15 = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
            CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn15, null, 0, 6, null), f11035c), new a(fCoerceIn15, circularTrackColor, new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(fM1204getCircularStrokeWidthD9Ej5fM), 0.0f, iM1202getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null), circularColor), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        j12 = circularColor;
        j13 = circularTrackColor;
        i18 = iM1202getCircularDeterminateStrokeCapKaPHkGw;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, modifier2, j12, fM1204getCircularStrokeWidthD9Ej5fM, j13, i18, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2 A[PHI: r2 r6 r9 r10
      0x00c2: PHI (r2v6 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v7 androidx.compose.ui.Modifier) binds: [B:81:0x00ef, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r6v9 long) = (r6v3 long), (r6v2 long) binds: [B:81:0x00ef, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r9v13 float) = (r9v3 float), (r9v2 float) binds: [B:81:0x00ef, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r10v14 long) = (r10v7 long), (r10v6 long) binds: [B:81:0x00ef, B:68:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x0244  */
    /* JADX WARN: Code duplicated, block: B:93:0x0255  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    public static final void m1207CircularProgressIndicatorLxG7B9w(@Nullable Modifier modifier, long j10, float f6, long j11, int i10, @Nullable Composer composer, int i11, int i12) {
        Modifier modifier2;
        int i13;
        long circularColor;
        float fM1204getCircularStrokeWidthD9Ej5fM;
        long circularTrackColor;
        int i14;
        int i15;
        int i16;
        Modifier modifier3;
        int iM1203getCircularIndeterminateStrokeCapKaPHkGw;
        long j12;
        float f10;
        long j13;
        Modifier modifier4;
        long j14;
        long j15;
        int i17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-115871647);
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
                circularColor = j10;
                int i19 = composerStartRestartGroup.changed(circularColor) ? 32 : 16;
                i13 |= i19;
            } else {
                circularColor = j10;
            }
            i13 |= i19;
        } else {
            circularColor = j10;
        }
        int i20 = i12 & 4;
        if (i20 == 0) {
            if ((i11 & 896) == 0) {
                fM1204getCircularStrokeWidthD9Ej5fM = f6;
                i13 |= composerStartRestartGroup.changed(fM1204getCircularStrokeWidthD9Ej5fM) ? 256 : 128;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    circularTrackColor = j11;
                    int i21 = composerStartRestartGroup.changed(circularTrackColor) ? 2048 : 1024;
                    i13 |= i21;
                } else {
                    circularTrackColor = j11;
                }
                i13 |= i21;
            } else {
                circularTrackColor = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    i15 = i10;
                    if (composerStartRestartGroup.changed(i15)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
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
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        }
                        if (i20 != 0) {
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i12 & 8) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                            j12 = circularColor;
                            f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                            j13 = circularTrackColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-115871647, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)");
                        }
                        Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM1203getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                        InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                        int i22 = InfiniteTransition.$stable;
                        int i23 = InfiniteRepeatableSpec.$stable;
                        fM1204getCircularStrokeWidthD9Ej5fM = f10;
                        CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f11035c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i22 | 4528 | (i23 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f11076p0), null, 0L, 6, null), null, composerStartRestartGroup, i22 | 432 | (i23 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f11077p0), null, 0L, 6, null), null, composerStartRestartGroup, i22 | 432 | (i23 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i22 | 432 | (i23 << 9), 8), stroke), composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        j14 = j12;
                        j15 = j13;
                        i17 = iM1203getCircularIndeterminateStrokeCapKaPHkGw;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    }
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-115871647, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)");
                    }
                    Stroke stroke2 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM1203getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    TwoWayConverter<Integer, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i24 = InfiniteTransition.$stable;
                    int i25 = InfiniteRepeatableSpec.$stable;
                    fM1204getCircularStrokeWidthD9Ej5fM = f10;
                    CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f11035c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition2, 0, 5, vectorConverter2, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i24 | 4528 | (i25 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f11076p0), null, 0L, 6, null), null, composerStartRestartGroup, i24 | 432 | (i25 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f11077p0), null, 0L, 6, null), null, composerStartRestartGroup, i24 | 432 | (i25 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i24 | 432 | (i25 << 9), 8), stroke2), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j14 = j12;
                    j15 = j13;
                    i17 = iM1203getCircularIndeterminateStrokeCapKaPHkGw;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j14 = circularColor;
                    j15 = circularTrackColor;
                    i17 = i15;
                    modifier4 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(fM1204getCircularStrokeWidthD9Ej5fM, i17, i11, i12, j14, j15, modifier4));
            }
            i13 |= 24576;
            i15 = i10;
            if ((i13 & 46811) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                    } else {
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                    } else {
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-115871647, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)");
                }
                Stroke stroke3 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM1203getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition3 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default3 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i26 = InfiniteTransition.$stable;
                int i27 = InfiniteRepeatableSpec.$stable;
                fM1204getCircularStrokeWidthD9Ej5fM = f10;
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f11035c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition3, 0, 5, vectorConverter3, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default3, null, composerStartRestartGroup, i26 | 4528 | (i27 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f11076p0), null, 0L, 6, null), null, composerStartRestartGroup, i26 | 432 | (i27 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f11077p0), null, 0L, 6, null), null, composerStartRestartGroup, i26 | 432 | (i27 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i26 | 432 | (i27 << 9), 8), stroke3), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j14 = j12;
                j15 = j13;
                i17 = iM1203getCircularIndeterminateStrokeCapKaPHkGw;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                    } else {
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                    } else {
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-115871647, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)");
                }
                Stroke stroke4 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM1203getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition4 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default4 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i28 = InfiniteTransition.$stable;
                int i29 = InfiniteRepeatableSpec.$stable;
                fM1204getCircularStrokeWidthD9Ej5fM = f10;
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f11035c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition4, 0, 5, vectorConverter4, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default4, null, composerStartRestartGroup, i28 | 4528 | (i29 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f11076p0), null, 0L, 6, null), null, composerStartRestartGroup, i28 | 432 | (i29 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f11077p0), null, 0L, 6, null), null, composerStartRestartGroup, i28 | 432 | (i29 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i28 | 432 | (i29 << 9), 8), stroke4), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j14 = j12;
                j15 = j13;
                i17 = iM1203getCircularIndeterminateStrokeCapKaPHkGw;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(fM1204getCircularStrokeWidthD9Ej5fM, i17, i11, i12, j14, j15, modifier4));
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        fM1204getCircularStrokeWidthD9Ej5fM = f6;
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                circularTrackColor = j11;
                if (composerStartRestartGroup.changed(circularTrackColor)) {
                }
                i13 |= i21;
            } else {
                circularTrackColor = j11;
            }
            i13 |= i21;
        } else {
            circularTrackColor = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                i15 = i10;
                if (composerStartRestartGroup.changed(i15)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
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
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                    } else {
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                    } else {
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-115871647, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)");
                }
                Stroke stroke5 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM1203getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition5 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter5 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default5 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i210 = InfiniteTransition.$stable;
                int i211 = InfiniteRepeatableSpec.$stable;
                fM1204getCircularStrokeWidthD9Ej5fM = f10;
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f11035c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition5, 0, 5, vectorConverter5, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default5, null, composerStartRestartGroup, i210 | 4528 | (i211 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f11076p0), null, 0L, 6, null), null, composerStartRestartGroup, i210 | 432 | (i211 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f11077p0), null, 0L, 6, null), null, composerStartRestartGroup, i210 | 432 | (i211 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i210 | 432 | (i211 << 9), 8), stroke5), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j14 = j12;
                j15 = j13;
                i17 = iM1203getCircularIndeterminateStrokeCapKaPHkGw;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                    } else {
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i12 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                    } else {
                        j12 = circularColor;
                        f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                        j13 = circularTrackColor;
                        iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-115871647, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)");
                }
                Stroke stroke6 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM1203getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition6 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                TwoWayConverter<Integer, AnimationVector1D> vectorConverter6 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default6 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i212 = InfiniteTransition.$stable;
                int i213 = InfiniteRepeatableSpec.$stable;
                fM1204getCircularStrokeWidthD9Ej5fM = f10;
                CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f11035c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition6, 0, 5, vectorConverter6, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default6, null, composerStartRestartGroup, i212 | 4528 | (i213 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f11076p0), null, 0L, 6, null), null, composerStartRestartGroup, i212 | 432 | (i213 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f11077p0), null, 0L, 6, null), null, composerStartRestartGroup, i212 | 432 | (i213 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i212 | 432 | (i213 << 9), 8), stroke6), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j14 = j12;
                j15 = j13;
                i17 = iM1203getCircularIndeterminateStrokeCapKaPHkGw;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(fM1204getCircularStrokeWidthD9Ej5fM, i17, i11, i12, j14, j15, modifier4));
        }
        i13 |= 24576;
        i15 = i10;
        if ((i13 & 46811) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                }
                if (i20 != 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                }
                if ((i12 & 8) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                } else {
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                }
                if (i20 != 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                }
                if ((i12 & 8) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                } else {
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-115871647, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)");
            }
            Stroke stroke7 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM1203getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition7 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter7 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default7 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i214 = InfiniteTransition.$stable;
            int i215 = InfiniteRepeatableSpec.$stable;
            fM1204getCircularStrokeWidthD9Ej5fM = f10;
            CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f11035c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition7, 0, 5, vectorConverter7, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default7, null, composerStartRestartGroup, i214 | 4528 | (i215 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f11076p0), null, 0L, 6, null), null, composerStartRestartGroup, i214 | 432 | (i215 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f11077p0), null, 0L, 6, null), null, composerStartRestartGroup, i214 | 432 | (i215 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i214 | 432 | (i215 << 9), 8), stroke7), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j14 = j12;
            j15 = j13;
            i17 = iM1203getCircularIndeterminateStrokeCapKaPHkGw;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                }
                if (i20 != 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                }
                if ((i12 & 8) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                } else {
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                }
                if (i20 != 0) {
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                }
                if ((i12 & 8) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1203getCircularIndeterminateStrokeCapKaPHkGw();
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                } else {
                    j12 = circularColor;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                    j13 = circularTrackColor;
                    iM1203getCircularIndeterminateStrokeCapKaPHkGw = i15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-115871647, i11, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:328)");
            }
            Stroke stroke8 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f10), 0.0f, iM1203getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition8 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter8 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default8 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i216 = InfiniteTransition.$stable;
            int i217 = InfiniteRepeatableSpec.$stable;
            fM1204getCircularStrokeWidthD9Ej5fM = f10;
            CanvasKt.Canvas(SizeKt.m335size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), f11035c), new c(f10, j13, j12, InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition8, 0, 5, vectorConverter8, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default8, null, composerStartRestartGroup, i216 | 4528 | (i217 << 12), 16), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(g.f11076p0), null, 0L, 6, null), null, composerStartRestartGroup, i216 | 432 | (i217 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, 290.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(h.f11077p0), null, 0L, 6, null), null, composerStartRestartGroup, i216 | 432 | (i217 << 9), 8), InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, 286.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i216 | 432 | (i217 << 9), 8), stroke8), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j14 = j12;
            j15 = j13;
            i17 = iM1203getCircularIndeterminateStrokeCapKaPHkGw;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(fM1204getCircularStrokeWidthD9Ej5fM, i17, i11, i12, j14, j15, modifier4));
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
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    public static final /* synthetic */ void m1208CircularProgressIndicatorMBs18nI(float f6, Modifier modifier, long j10, float f10, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        long j11;
        int i13;
        float f11;
        int i14;
        Modifier modifier3;
        long circularColor;
        Modifier modifier4;
        long j12;
        float fM1204getCircularStrokeWidthD9Ej5fM;
        Modifier modifier5;
        long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(402841196);
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
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i12 &= -897;
                        } else {
                            circularColor = j11;
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j12 = circularColor;
                            fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        } else {
                            modifier4 = modifier3;
                            j12 = circularColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)");
                        }
                        ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
                        m1206CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults.m1202getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        j13 = j12;
                        f11 = fM1204getCircularStrokeWidthD9Ej5fM;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        modifier4 = modifier2;
                        j12 = j11;
                    }
                    fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)");
                    }
                    ProgressIndicatorDefaults progressIndicatorDefaults2 = ProgressIndicatorDefaults.INSTANCE;
                    m1206CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults2.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults2.m1202getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j13 = j12;
                    f11 = fM1204getCircularStrokeWidthD9Ej5fM;
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
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    } else {
                        circularColor = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    } else {
                        circularColor = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)");
                }
                ProgressIndicatorDefaults progressIndicatorDefaults3 = ProgressIndicatorDefaults.INSTANCE;
                m1206CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults3.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults3.m1202getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j13 = j12;
                f11 = fM1204getCircularStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    } else {
                        circularColor = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    } else {
                        circularColor = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)");
                }
                ProgressIndicatorDefaults progressIndicatorDefaults4 = ProgressIndicatorDefaults.INSTANCE;
                m1206CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults4.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults4.m1202getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j13 = j12;
                f11 = fM1204getCircularStrokeWidthD9Ej5fM;
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
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    } else {
                        circularColor = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    } else {
                        circularColor = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)");
                }
                ProgressIndicatorDefaults progressIndicatorDefaults5 = ProgressIndicatorDefaults.INSTANCE;
                m1206CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults5.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults5.m1202getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j13 = j12;
                f11 = fM1204getCircularStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    } else {
                        circularColor = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    } else {
                        circularColor = j11;
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    } else {
                        modifier4 = modifier3;
                        j12 = circularColor;
                        fM1204getCircularStrokeWidthD9Ej5fM = f11;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)");
                }
                ProgressIndicatorDefaults progressIndicatorDefaults6 = ProgressIndicatorDefaults.INSTANCE;
                m1206CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults6.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults6.m1202getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j13 = j12;
                f11 = fM1204getCircularStrokeWidthD9Ej5fM;
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
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                } else {
                    circularColor = j11;
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j12 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                } else {
                    modifier4 = modifier3;
                    j12 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = f11;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                } else {
                    circularColor = j11;
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j12 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                } else {
                    modifier4 = modifier3;
                    j12 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = f11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)");
            }
            ProgressIndicatorDefaults progressIndicatorDefaults7 = ProgressIndicatorDefaults.INSTANCE;
            m1206CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults7.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults7.m1202getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j13 = j12;
            f11 = fM1204getCircularStrokeWidthD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                } else {
                    circularColor = j11;
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j12 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                } else {
                    modifier4 = modifier3;
                    j12 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = f11;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                } else {
                    circularColor = j11;
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j12 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                } else {
                    modifier4 = modifier3;
                    j12 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = f11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:412)");
            }
            ProgressIndicatorDefaults progressIndicatorDefaults8 = ProgressIndicatorDefaults.INSTANCE;
            m1206CircularProgressIndicatorDUhRLBM(f6, modifier4, j12, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults8.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults8.m1202getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, 196608 | (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j13 = j12;
            f11 = fM1204getCircularStrokeWidthD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(f6, f11, i10, i11, j13, modifier5));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    public static final /* synthetic */ void m1209CircularProgressIndicatoraMcp0Q(Modifier modifier, long j10, float f6, Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long circularColor;
        float f10;
        Modifier modifier3;
        Modifier modifier4;
        float fM1204getCircularStrokeWidthD9Ej5fM;
        long j11;
        Modifier modifier5;
        long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(947193756);
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
                circularColor = j10;
                int i14 = composerStartRestartGroup.changed(circularColor) ? 32 : 16;
                i12 |= i14;
            } else {
                circularColor = j10;
            }
            i12 |= i14;
        } else {
            circularColor = j10;
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
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i12 &= -113;
                    }
                    if (i15 != 0) {
                        modifier4 = modifier3;
                        fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                        j11 = circularColor;
                    } else {
                        modifier4 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(947193756, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:428)");
                    }
                    ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
                    m1207CircularProgressIndicatorLxG7B9w(modifier4, j11, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults.m1203getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j12 = j11;
                    f10 = fM1204getCircularStrokeWidthD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    modifier4 = modifier2;
                }
                j11 = circularColor;
                fM1204getCircularStrokeWidthD9Ej5fM = f10;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(947193756, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:428)");
                }
                ProgressIndicatorDefaults progressIndicatorDefaults2 = ProgressIndicatorDefaults.INSTANCE;
                m1207CircularProgressIndicatorLxG7B9w(modifier4, j11, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults2.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults2.m1203getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j12 = j11;
                f10 = fM1204getCircularStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                long j13 = circularColor;
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
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if (i15 != 0) {
                    modifier4 = modifier3;
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    j11 = circularColor;
                } else {
                    modifier4 = modifier3;
                    j11 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = f10;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if (i15 != 0) {
                    modifier4 = modifier3;
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    j11 = circularColor;
                } else {
                    modifier4 = modifier3;
                    j11 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = f10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947193756, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:428)");
            }
            ProgressIndicatorDefaults progressIndicatorDefaults3 = ProgressIndicatorDefaults.INSTANCE;
            m1207CircularProgressIndicatorLxG7B9w(modifier4, j11, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults3.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults3.m1203getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j12 = j11;
            f10 = fM1204getCircularStrokeWidthD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if (i15 != 0) {
                    modifier4 = modifier3;
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    j11 = circularColor;
                } else {
                    modifier4 = modifier3;
                    j11 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = f10;
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if (i15 != 0) {
                    modifier4 = modifier3;
                    fM1204getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1204getCircularStrokeWidthD9Ej5fM();
                    j11 = circularColor;
                } else {
                    modifier4 = modifier3;
                    j11 = circularColor;
                    fM1204getCircularStrokeWidthD9Ej5fM = f10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947193756, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:428)");
            }
            ProgressIndicatorDefaults progressIndicatorDefaults4 = ProgressIndicatorDefaults.INSTANCE;
            m1207CircularProgressIndicatorLxG7B9w(modifier4, j11, fM1204getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults4.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults4.m1203getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j12 = j11;
            f10 = fM1204getCircularStrokeWidthD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(f10, i10, i11, j12, modifier5));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[PHI: r2 r8 r10
      0x00a2: PHI (r2v5 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v6 androidx.compose.ui.Modifier) binds: [B:68:0x00c4, B:57:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r8v28 long) = (r8v3 long), (r8v2 long) binds: [B:68:0x00c4, B:57:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r10v9 long) = (r10v3 long), (r10v2 long) binds: [B:68:0x00c4, B:57:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1 A[LOOP:0: B:74:0x01cf->B:75:0x01d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0207  */
    /* JADX WARN: Code duplicated, block: B:88:0x0216  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
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
    public static final void m1210LinearProgressIndicator2cYBFYY(@Nullable Modifier modifier, long j10, long j11, int i10, @Nullable Composer composer, int i11, int i12) {
        Modifier modifier2;
        int i13;
        long linearColor;
        long linearTrackColor;
        int i14;
        Modifier modifier3;
        int iM1205getLinearStrokeCapKaPHkGw;
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-476865359);
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
                linearColor = j10;
                int i18 = composerStartRestartGroup.changed(linearColor) ? 32 : 16;
                i13 |= i18;
            } else {
                linearColor = j10;
            }
            i13 |= i18;
        } else {
            linearColor = j10;
        }
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                linearTrackColor = j11;
                int i19 = composerStartRestartGroup.changed(linearTrackColor) ? 256 : 128;
                i13 |= i19;
            } else {
                linearTrackColor = j11;
            }
            i13 |= i19;
        } else {
            linearTrackColor = j11;
        }
        int i20 = i12 & 8;
        if (i20 == 0) {
            if ((i11 & 7168) == 0) {
                i14 = i10;
                i13 |= composerStartRestartGroup.changed(i14) ? 2048 : 1024;
            }
            if ((i13 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 2) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 4) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i20 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                        j12 = linearColor;
                        j13 = linearTrackColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-476865359, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:107)");
                    }
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(o.f11111p0), null, 0L, 6, null);
                    int i21 = InfiniteTransition.$stable;
                    int i22 = InfiniteRepeatableSpec.$stable;
                    stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i21 | 432 | (i22 << 9), 8);
                    stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(p.f11112p0), null, 0L, 6, null), null, composerStartRestartGroup, i21 | 432 | (i22 << 9), 8);
                    stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(q.f11113p0), null, 0L, 6, null), null, composerStartRestartGroup, i21 | 432 | (i22 << 9), 8);
                    stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(r.f11114p0), null, 0L, 6, null), null, composerStartRestartGroup, i21 | 432 | (i22 << 9), 8);
                    Modifier modifierM337sizeVpY3zN4 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), f11033a, f11034b);
                    objArr = new Object[]{Color.m2498boximpl(j13), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), stateAnimateFloat, stateAnimateFloat2, Color.m2498boximpl(j12), stateAnimateFloat3, stateAnimateFloat4};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    for (i15 = 0; i15 < 7; i15++) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i15]);
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new k(iM1205getLinearStrokeCapKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM337sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    linearColor = j12;
                    j14 = j13;
                    i16 = iM1205getLinearStrokeCapKaPHkGw;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                j12 = linearColor;
                j13 = linearTrackColor;
                iM1205getLinearStrokeCapKaPHkGw = i14;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-476865359, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:107)");
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(o.f11111p0), null, 0L, 6, null);
                int i23 = InfiniteTransition.$stable;
                int i24 = InfiniteRepeatableSpec.$stable;
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i23 | 432 | (i24 << 9), 8);
                stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(p.f11112p0), null, 0L, 6, null), null, composerStartRestartGroup, i23 | 432 | (i24 << 9), 8);
                stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(q.f11113p0), null, 0L, 6, null), null, composerStartRestartGroup, i23 | 432 | (i24 << 9), 8);
                stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(r.f11114p0), null, 0L, 6, null), null, composerStartRestartGroup, i23 | 432 | (i24 << 9), 8);
                Modifier modifierM337sizeVpY3zN5 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), f11033a, f11034b);
                objArr = new Object[]{Color.m2498boximpl(j13), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), stateAnimateFloat, stateAnimateFloat2, Color.m2498boximpl(j12), stateAnimateFloat3, stateAnimateFloat4};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i15 < 7) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i15]);
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new k(iM1205getLinearStrokeCapKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new k(iM1205getLinearStrokeCapKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM337sizeVpY3zN5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                linearColor = j12;
                j14 = j13;
                i16 = iM1205getLinearStrokeCapKaPHkGw;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j14 = linearTrackColor;
                i16 = i14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l(modifier3, linearColor, j14, i16, i11, i12));
        }
        i13 |= 3072;
        i14 = i10;
        if ((i13 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if ((i12 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                }
                if (i20 != 0) {
                    iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    j12 = linearColor;
                    j13 = linearTrackColor;
                } else {
                    j12 = linearColor;
                    j13 = linearTrackColor;
                    iM1205getLinearStrokeCapKaPHkGw = i14;
                }
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if ((i12 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                }
                if (i20 != 0) {
                    iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    j12 = linearColor;
                    j13 = linearTrackColor;
                } else {
                    j12 = linearColor;
                    j13 = linearTrackColor;
                    iM1205getLinearStrokeCapKaPHkGw = i14;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476865359, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:107)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition3 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default3 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(o.f11111p0), null, 0L, 6, null);
            int i25 = InfiniteTransition.$stable;
            int i26 = InfiniteRepeatableSpec.$stable;
            stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 1.0f, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default3, null, composerStartRestartGroup, i25 | 432 | (i26 << 9), 8);
            stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(p.f11112p0), null, 0L, 6, null), null, composerStartRestartGroup, i25 | 432 | (i26 << 9), 8);
            stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(q.f11113p0), null, 0L, 6, null), null, composerStartRestartGroup, i25 | 432 | (i26 << 9), 8);
            stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(r.f11114p0), null, 0L, 6, null), null, composerStartRestartGroup, i25 | 432 | (i26 << 9), 8);
            Modifier modifierM337sizeVpY3zN6 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), f11033a, f11034b);
            objArr = new Object[]{Color.m2498boximpl(j13), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), stateAnimateFloat, stateAnimateFloat2, Color.m2498boximpl(j12), stateAnimateFloat3, stateAnimateFloat4};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i15 < 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i15]);
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new k(iM1205getLinearStrokeCapKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new k(iM1205getLinearStrokeCapKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM337sizeVpY3zN6, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearColor = j12;
            j14 = j13;
            i16 = iM1205getLinearStrokeCapKaPHkGw;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if ((i12 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                }
                if (i20 != 0) {
                    iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    j12 = linearColor;
                    j13 = linearTrackColor;
                } else {
                    j12 = linearColor;
                    j13 = linearTrackColor;
                    iM1205getLinearStrokeCapKaPHkGw = i14;
                }
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if ((i12 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                }
                if (i20 != 0) {
                    iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    j12 = linearColor;
                    j13 = linearTrackColor;
                } else {
                    j12 = linearColor;
                    j13 = linearTrackColor;
                    iM1205getLinearStrokeCapKaPHkGw = i14;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476865359, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:107)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition4 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            InfiniteRepeatableSpec infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default4 = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(o.f11111p0), null, 0L, 6, null);
            int i27 = InfiniteTransition.$stable;
            int i28 = InfiniteRepeatableSpec.$stable;
            stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 1.0f, infiniteRepeatableSpecM78infiniteRepeatable9IiC70o$default4, null, composerStartRestartGroup, i27 | 432 | (i28 << 9), 8);
            stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(p.f11112p0), null, 0L, 6, null), null, composerStartRestartGroup, i27 | 432 | (i28 << 9), 8);
            stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(q.f11113p0), null, 0L, 6, null), null, composerStartRestartGroup, i27 | 432 | (i28 << 9), 8);
            stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 1.0f, AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(r.f11114p0), null, 0L, 6, null), null, composerStartRestartGroup, i27 | 432 | (i28 << 9), 8);
            Modifier modifierM337sizeVpY3zN7 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), f11033a, f11034b);
            objArr = new Object[]{Color.m2498boximpl(j13), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), stateAnimateFloat, stateAnimateFloat2, Color.m2498boximpl(j12), stateAnimateFloat3, stateAnimateFloat4};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i15 < 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i15]);
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new k(iM1205getLinearStrokeCapKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new k(iM1205getLinearStrokeCapKaPHkGw, j13, j12, stateAnimateFloat, stateAnimateFloat2, stateAnimateFloat3, stateAnimateFloat4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM337sizeVpY3zN7, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearColor = j12;
            j14 = j13;
            i16 = iM1205getLinearStrokeCapKaPHkGw;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l(modifier3, linearColor, j14, i16, i11, i12));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1211LinearProgressIndicatorRIQooxk(Modifier modifier, long j10, long j11, Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long linearColor;
        long linearTrackColor;
        Modifier modifier3;
        long j12;
        Composer composerStartRestartGroup = composer.startRestartGroup(585576195);
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
            linearColor = j10;
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        } else {
            linearColor = j10;
        }
        if ((i10 & 896) == 0) {
            linearTrackColor = j11;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128;
        } else {
            linearTrackColor = j11;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j12 = linearColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i11 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
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
            j12 = linearColor;
            long j13 = linearTrackColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i14, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:206)");
            }
            m1210LinearProgressIndicator2cYBFYY(modifier3, j12, j13, ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 112) | (i14 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearTrackColor = j13;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n(modifier3, j12, linearTrackColor, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a A[LOOP:0: B:84:0x0138->B:85:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:93:0x0173  */
    /* JADX WARN: Code duplicated, block: B:97:0x017f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m1212LinearProgressIndicator_5eSRE(float f6, @Nullable Modifier modifier, long j10, long j11, int i10, @Nullable Composer composer, int i11, int i12) {
        int i13;
        Modifier modifier2;
        long linearColor;
        long linearTrackColor;
        int i14;
        int iM1205getLinearStrokeCapKaPHkGw;
        int i15;
        float fCoerceIn;
        Object[] objArr;
        int i16;
        boolean zChanged;
        Object objRememberedValue;
        long j12;
        Modifier modifier3;
        long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(905419617);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 == 0) {
            if ((i11 & 112) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i11 & 896) == 0) {
                if ((i12 & 4) == 0) {
                    linearColor = j10;
                    int i18 = composerStartRestartGroup.changed(linearColor) ? 256 : 128;
                    i13 |= i18;
                } else {
                    linearColor = j10;
                }
                i13 |= i18;
            } else {
                linearColor = j10;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    linearTrackColor = j11;
                    int i19 = composerStartRestartGroup.changed(linearTrackColor) ? 2048 : 1024;
                    i13 |= i19;
                } else {
                    linearTrackColor = j11;
                }
                i13 |= i19;
            } else {
                linearTrackColor = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    iM1205getLinearStrokeCapKaPHkGw = i10;
                    if (composerStartRestartGroup.changed(iM1205getLinearStrokeCapKaPHkGw)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i13 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i12 & 4) != 0) {
                            linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        }
                        if ((i12 & 8) != 0) {
                            linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        }
                        if (i14 != 0) {
                            iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(905419617, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)");
                    }
                    fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                    Modifier modifierM337sizeVpY3zN4 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f11033a, f11034b);
                    objArr = new Object[]{Color.m2498boximpl(linearTrackColor), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(linearColor)};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    i16 = 0;
                    zChanged = false;
                    for (int i20 = 4; i16 < i20; i20 = 4) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                        i16++;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
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
                j12 = linearColor;
                modifier3 = modifier2;
                j13 = linearTrackColor;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new j(f6, iM1205getLinearStrokeCapKaPHkGw, i11, i12, j12, j13, modifier3));
            }
            i13 |= 24576;
            iM1205getLinearStrokeCapKaPHkGw = i10;
            if ((i13 & 46811) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(905419617, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)");
                }
                fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                Modifier modifierM337sizeVpY3zN5 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f11033a, f11034b);
                objArr = new Object[]{Color.m2498boximpl(linearTrackColor), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(linearColor)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i16 = 0;
                zChanged = false;
                while (i16 < i20) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                    i16++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
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
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(905419617, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)");
                }
                fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                Modifier modifierM337sizeVpY3zN6 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f11033a, f11034b);
                objArr = new Object[]{Color.m2498boximpl(linearTrackColor), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(linearColor)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i16 = 0;
                zChanged = false;
                while (i16 < i20) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                    i16++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM337sizeVpY3zN6, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j12 = linearColor;
            modifier3 = modifier2;
            j13 = linearTrackColor;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(f6, iM1205getLinearStrokeCapKaPHkGw, i11, i12, j12, j13, modifier3));
        }
        i13 |= 48;
        modifier2 = modifier;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                linearColor = j10;
                if (composerStartRestartGroup.changed(linearColor)) {
                }
                i13 |= i18;
            } else {
                linearColor = j10;
            }
            i13 |= i18;
        } else {
            linearColor = j10;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                linearTrackColor = j11;
                if (composerStartRestartGroup.changed(linearTrackColor)) {
                }
                i13 |= i19;
            } else {
                linearTrackColor = j11;
            }
            i13 |= i19;
        } else {
            linearTrackColor = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                iM1205getLinearStrokeCapKaPHkGw = i10;
                if (composerStartRestartGroup.changed(iM1205getLinearStrokeCapKaPHkGw)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i13 & 46811) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(905419617, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)");
                }
                fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                Modifier modifierM337sizeVpY3zN7 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f11033a, f11034b);
                objArr = new Object[]{Color.m2498boximpl(linearTrackColor), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(linearColor)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i16 = 0;
                zChanged = false;
                while (i16 < i20) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                    i16++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM337sizeVpY3zN7, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i12 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    }
                    if ((i12 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    }
                    if (i14 != 0) {
                        iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(905419617, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)");
                }
                fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
                Modifier modifierM337sizeVpY3zN8 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f11033a, f11034b);
                objArr = new Object[]{Color.m2498boximpl(linearTrackColor), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(linearColor)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i16 = 0;
                zChanged = false;
                while (i16 < i20) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                    i16++;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM337sizeVpY3zN8, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            j12 = linearColor;
            modifier3 = modifier2;
            j13 = linearTrackColor;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(f6, iM1205getLinearStrokeCapKaPHkGw, i11, i12, j12, j13, modifier3));
        }
        i13 |= 24576;
        iM1205getLinearStrokeCapKaPHkGw = i10;
        if ((i13 & 46811) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if ((i12 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                }
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if ((i12 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(905419617, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)");
            }
            fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
            Modifier modifierM337sizeVpY3zN9 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f11033a, f11034b);
            objArr = new Object[]{Color.m2498boximpl(linearTrackColor), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(linearColor)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i16 = 0;
            zChanged = false;
            while (i16 < i20) {
                zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                i16++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM337sizeVpY3zN9, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if ((i12 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                }
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                }
                if ((i12 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    iM1205getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(905419617, i11, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:72)");
            }
            fCoerceIn = kotlin.ranges.c.coerceIn(f6, 0.0f, 1.0f);
            Modifier modifierM337sizeVpY3zN10 = SizeKt.m337sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), f11033a, f11034b);
            objArr = new Object[]{Color.m2498boximpl(linearTrackColor), StrokeCap.m2801boximpl(iM1205getLinearStrokeCapKaPHkGw), Float.valueOf(fCoerceIn), Color.m2498boximpl(linearColor)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i16 = 0;
            zChanged = false;
            while (i16 < i20) {
                zChanged |= composerStartRestartGroup.changed(objArr[i16]);
                i16++;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new i(linearTrackColor, iM1205getLinearStrokeCapKaPHkGw, linearColor, fCoerceIn);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM337sizeVpY3zN10, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        j12 = linearColor;
        modifier3 = modifier2;
        j13 = linearTrackColor;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j(f6, iM1205getLinearStrokeCapKaPHkGw, i11, i12, j12, j13, modifier3));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8 A[PHI: r3 r4 r8
      0x00a8: PHI (r3v16 int) = (r3v11 int), (r3v18 int) binds: [B:70:0x00c1, B:61:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r4v5 androidx.compose.ui.Modifier) = (r4v2 androidx.compose.ui.Modifier), (r4v8 androidx.compose.ui.Modifier) binds: [B:70:0x00c1, B:61:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r8v10 long) = (r8v2 long), (r8v1 long) binds: [B:70:0x00c1, B:61:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    public static final /* synthetic */ void m1213LinearProgressIndicatoreaDK9VM(float f6, Modifier modifier, long j10, long j11, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        long linearColor;
        long j12;
        Modifier modifier3;
        long linearTrackColor;
        long j13;
        long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-372717133);
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
                linearColor = j10;
                if ((i11 & 4) == 0 || !composerStartRestartGroup.changed(linearColor)) {
                    i14 = 128;
                } else {
                    i14 = 256;
                }
                i12 |= i14;
            } else {
                linearColor = j10;
            }
            if ((i10 & 7168) == 0) {
                j12 = j11;
                if ((i11 & 8) == 0 || !composerStartRestartGroup.changed(j12)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i12 |= i13;
            } else {
                j12 = j11;
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
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        j13 = linearColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:191)");
                    }
                    m1212LinearProgressIndicator_5eSRE(f6, modifier3, j13, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    linearColor = j13;
                    j14 = linearTrackColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                j13 = linearColor;
                linearTrackColor = j12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:191)");
                }
                m1212LinearProgressIndicator_5eSRE(f6, modifier3, j13, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                linearColor = j13;
                j14 = linearTrackColor;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j14 = j12;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new m(f6, modifier3, linearColor, j14, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            linearColor = j10;
            if ((i11 & 4) == 0) {
                i14 = 128;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            linearColor = j10;
        }
        if ((i10 & 7168) == 0) {
            j12 = j11;
            if ((i11 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        } else {
            j12 = j11;
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
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    j13 = linearColor;
                } else {
                    j13 = linearColor;
                    linearTrackColor = j12;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    j13 = linearColor;
                } else {
                    j13 = linearColor;
                    linearTrackColor = j12;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:191)");
            }
            m1212LinearProgressIndicator_5eSRE(f6, modifier3, j13, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearColor = j13;
            j14 = linearTrackColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    j13 = linearColor;
                } else {
                    j13 = linearColor;
                    linearTrackColor = j12;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    j13 = linearColor;
                } else {
                    j13 = linearColor;
                    linearTrackColor = j12;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:191)");
            }
            m1212LinearProgressIndicator_5eSRE(f6, modifier3, j13, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m1205getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearColor = j13;
            j14 = linearTrackColor;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new m(f6, modifier3, linearColor, j14, i10, i11));
    }

    public static final void a(DrawScope drawScope, float f6, float f10, long j10, Stroke stroke) {
        float f11 = 2;
        float width = stroke.getWidth() / f11;
        float fM2344getWidthimpl = Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc()) - (f11 * width);
        a1.b.v(drawScope, j10, f6, f10, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(fM2344getWidthimpl, fM2344getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: renamed from: access$drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1216access$drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f6, float f10, float f11, long j10, Stroke stroke) {
        float fM4389constructorimpl;
        if (StrokeCap.m2804equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m2808getButtKaPHkGw())) {
            fM4389constructorimpl = 0.0f;
        } else {
            fM4389constructorimpl = ((f10 / Dp.m4389constructorimpl(f11035c / 2)) * 57.29578f) / 2.0f;
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

    public static final float getCircularIndicatorDiameter() {
        return f11035c;
    }

    public static final float getLinearIndicatorHeight() {
        return f11034b;
    }

    public static final float getLinearIndicatorWidth() {
        return f11033a;
    }
}
