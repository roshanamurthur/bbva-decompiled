package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/CheckboxColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Checkbox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "TriStateCheckbox", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,516:1\n25#2:517\n50#2:524\n49#2:525\n25#2:532\n25#2:558\n83#2,3:565\n1114#3,6:518\n1114#3,6:526\n1114#3,6:533\n1114#3,6:559\n1114#3,6:568\n75#4:539\n936#5,4:540\n857#5,5:544\n936#5,4:549\n857#5,5:553\n154#6:574\n154#6:575\n154#6:576\n154#6:577\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n*L\n94#1:517\n99#1:524\n99#1:525\n144#1:532\n268#1:558\n276#1:565,3\n94#1:518,6\n99#1:526,6\n144#1:533,6\n268#1:559,6\n276#1:568,6\n156#1:539\n237#1:540,4\n237#1:544,5\n253#1:549,4\n253#1:553,5\n512#1:574\n513#1:575\n514#1:576\n515#1:577\n*E\n"})
public final class CheckboxKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9628b = Dp.m4389constructorimpl(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f9629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f9630d;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f9631p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f9632q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, Unit> function1, boolean z10) {
            super(0);
            this.f9631p0 = function1;
            this.f9632q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f9631p0.invoke(Boolean.valueOf(!this.f9632q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f9633p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f9634q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9635r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f9636s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CheckboxColors f9637t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f9638u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f9639w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z11, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f9633p0 = z10;
            this.f9634q0 = function1;
            this.f9635r0 = modifier;
            this.f9636s0 = z11;
            this.f9637t0 = checkboxColors;
            this.f9638u0 = mutableInteractionSource;
            this.v0 = i10;
            this.f9639w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CheckboxKt.Checkbox(this.f9633p0, this.f9634q0, this.f9635r0, this.f9636s0, this.f9637t0, this.f9638u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f9639w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class c extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f9640p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f9641q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f9642r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f9643s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f9644t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ l0.a0 f9645u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5, l0.a0 a0Var) {
            super(1);
            this.f9640p0 = state;
            this.f9641q0 = state2;
            this.f9642r0 = state3;
            this.f9643s0 = state4;
            this.f9644t0 = state5;
            this.f9645u0 = a0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fFloor = (float) Math.floor(Canvas.mo415toPx0680j_4(CheckboxKt.f9629c));
            CheckboxKt.m947access$drawBox1wkBAMs(Canvas, this.f9640p0.getValue().m2518unboximpl(), this.f9641q0.getValue().m2518unboximpl(), Canvas.mo415toPx0680j_4(CheckboxKt.f9630d), fFloor);
            CheckboxKt.m948access$drawCheck3IgeMak(Canvas, this.f9642r0.getValue().m2518unboximpl(), this.f9643s0.getValue().floatValue(), this.f9644t0.getValue().floatValue(), fFloor, this.f9645u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f9646p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ToggleableState f9647q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9648r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CheckboxColors f9649s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9650t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i10) {
            super(2);
            this.f9646p0 = z10;
            this.f9647q0 = toggleableState;
            this.f9648r0 = modifier;
            this.f9649s0 = checkboxColors;
            this.f9650t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CheckboxKt.a(this.f9646p0, this.f9647q0, this.f9648r0, this.f9649s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9650t0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class e extends Lambda implements Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f9651p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer, Integer num) {
            FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
            Transition.Segment<ToggleableState> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -1324481169);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1324481169, iD, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:253)");
            }
            ToggleableState initialState = segment2.getInitialState();
            ToggleableState toggleableState = ToggleableState.Off;
            if (initialState == toggleableState) {
                finiteAnimationSpecSnap = AnimationSpecKt.snap$default(0, 1, null);
            } else {
                finiteAnimationSpecSnap = segment2.getTargetState() == toggleableState ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return finiteAnimationSpecSnap;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class f extends Lambda implements Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f9652p0 = new f(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer, Integer num) {
            FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
            Transition.Segment<ToggleableState> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, 1373301606);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1373301606, iD, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:237)");
            }
            ToggleableState initialState = segment2.getInitialState();
            ToggleableState toggleableState = ToggleableState.Off;
            if (initialState == toggleableState) {
                finiteAnimationSpecSnap = AnimationSpecKt.tween$default(100, 0, null, 6, null);
            } else {
                finiteAnimationSpecSnap = segment2.getTargetState() == toggleableState ? AnimationSpecKt.snap(100) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return finiteAnimationSpecSnap;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ToggleableState f9653p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9654q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9655r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f9656s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CheckboxColors f9657t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f9658u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f9659w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ToggleableState toggleableState, Function0<Unit> function0, Modifier modifier, boolean z10, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f9653p0 = toggleableState;
            this.f9654q0 = function0;
            this.f9655r0 = modifier;
            this.f9656s0 = z10;
            this.f9657t0 = checkboxColors;
            this.f9658u0 = mutableInteractionSource;
            this.v0 = i10;
            this.f9659w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CheckboxKt.TriStateCheckbox(this.f9653p0, this.f9654q0, this.f9655r0, this.f9656s0, this.f9657t0, this.f9658u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f9659w0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 2;
        f9627a = Dp.m4389constructorimpl(f6);
        f9629c = Dp.m4389constructorimpl(f6);
        f9630d = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014d  */
    /* JADX WARN: Code duplicated, block: B:103:0x015f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0178  */
    /* JADX WARN: Code duplicated, block: B:107:0x0180  */
    /* JADX WARN: Code duplicated, block: B:109:0x018f  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0141  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Checkbox(boolean z10, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z11, @Nullable CheckboxColors checkboxColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        CheckboxColors checkboxColors2;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        Modifier modifier3;
        boolean z13;
        CheckboxColors checkboxColorsM946colors5tl4gsc;
        MutableInteractionSource mutableInteractionSource3;
        int i17;
        CheckboxColors checkboxColors3;
        Object objRememberedValue;
        Function0 function0;
        boolean z14;
        MutableInteractionSource mutableInteractionSource4;
        boolean zChanged;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1406741137);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z11;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        checkboxColors2 = checkboxColors;
                        int i19 = composerStartRestartGroup.changed(checkboxColors2) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    i12 |= i19;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if ((i11 & 16) != 0) {
                            checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -57345;
                        } else {
                            checkboxColorsM946colors5tl4gsc = checkboxColors2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        CheckboxColors checkboxColors4 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        checkboxColors3 = checkboxColors4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        i17 = i12;
                        modifier3 = modifier2;
                        z13 = z12;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                    }
                    ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z10);
                    composerStartRestartGroup.startReplaceableGroup(1557792622);
                    if (function1 != null) {
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new a(function1, z10);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function0 = (Function0) objRememberedValue2;
                    } else {
                        function0 = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TriStateCheckbox(ToggleableState, function0, modifier3, z13, checkboxColors3, mutableInteractionSource3, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    checkboxColors2 = checkboxColors3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z14 = z12;
                    mutableInteractionSource4 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, checkboxColors2, mutableInteractionSource4, i10, i11));
            }
            i12 |= 3072;
            z12 = z11;
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i12 |= i19;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i12 |= i19;
            } else {
                checkboxColors2 = checkboxColors;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    CheckboxColors checkboxColors5 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    checkboxColors3 = checkboxColors5;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    CheckboxColors checkboxColors6 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    checkboxColors3 = checkboxColors6;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                }
                ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1557792622);
                if (function1 != null) {
                    Boolean boolValueOf2 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(function1, z10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(function1, z10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState2, function0, modifier3, z13, checkboxColors3, mutableInteractionSource3, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                checkboxColors2 = checkboxColors3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    CheckboxColors checkboxColors7 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    checkboxColors3 = checkboxColors7;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    CheckboxColors checkboxColors8 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    checkboxColors3 = checkboxColors8;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                }
                ToggleableState ToggleableState3 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1557792622);
                if (function1 != null) {
                    Boolean boolValueOf3 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(function1, z10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(function1, z10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState3, function0, modifier3, z13, checkboxColors3, mutableInteractionSource3, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                checkboxColors2 = checkboxColors3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, checkboxColors2, mutableInteractionSource4, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z11;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    checkboxColors2 = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColors2)) {
                    }
                    i12 |= i19;
                } else {
                    checkboxColors2 = checkboxColors;
                }
                i12 |= i19;
            } else {
                checkboxColors2 = checkboxColors;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    CheckboxColors checkboxColors9 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    checkboxColors3 = checkboxColors9;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    CheckboxColors checkboxColors10 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    checkboxColors3 = checkboxColors10;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                }
                ToggleableState ToggleableState4 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1557792622);
                if (function1 != null) {
                    Boolean boolValueOf4 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf4) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(function1, z10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(function1, z10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState4, function0, modifier3, z13, checkboxColors3, mutableInteractionSource3, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                checkboxColors2 = checkboxColors3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    CheckboxColors checkboxColors11 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    checkboxColors3 = checkboxColors11;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if ((i11 & 16) != 0) {
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -57345;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    CheckboxColors checkboxColors12 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    checkboxColors3 = checkboxColors12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                }
                ToggleableState ToggleableState5 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1557792622);
                if (function1 != null) {
                    Boolean boolValueOf5 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf5) | composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new a(function1, z10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new a(function1, z10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function0 = (Function0) objRememberedValue2;
                } else {
                    function0 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TriStateCheckbox(ToggleableState5, function0, modifier3, z13, checkboxColors3, mutableInteractionSource3, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                checkboxColors2 = checkboxColors3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, checkboxColors2, mutableInteractionSource4, i10, i11));
        }
        i12 |= 3072;
        z12 = z11;
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                checkboxColors2 = checkboxColors;
                if (composerStartRestartGroup.changed(checkboxColors2)) {
                }
                i12 |= i19;
            } else {
                checkboxColors2 = checkboxColors;
            }
            i12 |= i19;
        } else {
            checkboxColors2 = checkboxColors;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -57345;
                } else {
                    checkboxColorsM946colors5tl4gsc = checkboxColors2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                CheckboxColors checkboxColors13 = checkboxColorsM946colors5tl4gsc;
                i17 = i12;
                checkboxColors3 = checkboxColors13;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -57345;
                } else {
                    checkboxColorsM946colors5tl4gsc = checkboxColors2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                CheckboxColors checkboxColors14 = checkboxColorsM946colors5tl4gsc;
                i17 = i12;
                checkboxColors3 = checkboxColors14;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
            }
            ToggleableState ToggleableState6 = ToggleableStateKt.ToggleableState(z10);
            composerStartRestartGroup.startReplaceableGroup(1557792622);
            if (function1 != null) {
                Boolean boolValueOf6 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(boolValueOf6) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(function1, z10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(function1, z10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                function0 = (Function0) objRememberedValue2;
            } else {
                function0 = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            TriStateCheckbox(ToggleableState6, function0, modifier3, z13, checkboxColors3, mutableInteractionSource3, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            checkboxColors2 = checkboxColors3;
            z14 = z13;
            mutableInteractionSource4 = mutableInteractionSource3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -57345;
                } else {
                    checkboxColorsM946colors5tl4gsc = checkboxColors2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                CheckboxColors checkboxColors15 = checkboxColorsM946colors5tl4gsc;
                i17 = i12;
                checkboxColors3 = checkboxColors15;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if ((i11 & 16) != 0) {
                    checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -57345;
                } else {
                    checkboxColorsM946colors5tl4gsc = checkboxColors2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                CheckboxColors checkboxColors16 = checkboxColorsM946colors5tl4gsc;
                i17 = i12;
                checkboxColors3 = checkboxColors16;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1406741137, i17, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
            }
            ToggleableState ToggleableState7 = ToggleableStateKt.ToggleableState(z10);
            composerStartRestartGroup.startReplaceableGroup(1557792622);
            if (function1 != null) {
                Boolean boolValueOf7 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(boolValueOf7) | composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(function1, z10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(function1, z10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                function0 = (Function0) objRememberedValue2;
            } else {
                function0 = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            TriStateCheckbox(ToggleableState7, function0, modifier3, z13, checkboxColors3, mutableInteractionSource3, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            checkboxColors2 = checkboxColors3;
            z14 = z13;
            mutableInteractionSource4 = mutableInteractionSource3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, checkboxColors2, mutableInteractionSource4, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138  */
    /* JADX WARN: Code duplicated, block: B:96:0x014d  */
    /* JADX WARN: Code duplicated, block: B:99:0x015e  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TriStateCheckbox(@NotNull ToggleableState state, @Nullable Function0<Unit> function0, @Nullable Modifier modifier, boolean z10, @Nullable CheckboxColors checkboxColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        CheckboxColors checkboxColorsM946colors5tl4gsc;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        Modifier modifier3;
        boolean z12;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        boolean z13;
        CheckboxColors checkboxColors2;
        Object objRememberedValue;
        int i17;
        Modifier modifierM466triStateToggleableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        Modifier modifier5;
        boolean z14;
        CheckboxColors checkboxColors3;
        MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1608358065);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        checkboxColorsM946colors5tl4gsc = checkboxColors;
                        int i19 = composerStartRestartGroup.changed(checkboxColorsM946colors5tl4gsc) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        checkboxColorsM946colors5tl4gsc = checkboxColors;
                    }
                    i12 |= i19;
                } else {
                    checkboxColorsM946colors5tl4gsc = checkboxColors;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            z13 = z12;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                            i17 = i12;
                            modifier4 = modifier3;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            modifier4 = modifier3;
                            z13 = z12;
                            checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1797978260);
                        if (function0 != null) {
                            modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(CheckboxTokens.INSTANCE.m1528getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                        } else {
                            modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function0 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f9627a), checkboxColors2, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 7168));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        z14 = z13;
                        checkboxColors3 = checkboxColors2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        modifier4 = modifier2;
                        z13 = z11;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    i17 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1797978260);
                    if (function0 != null) {
                        modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(CheckboxTokens.INSTANCE.m1528getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f9627a), checkboxColors2, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    z14 = z13;
                    checkboxColors3 = checkboxColors2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    z14 = z11;
                    checkboxColors3 = checkboxColorsM946colors5tl4gsc;
                    composerStartRestartGroup = composerStartRestartGroup;
                    mutableInteractionSource4 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier5, z14, checkboxColors3, mutableInteractionSource4, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    checkboxColorsM946colors5tl4gsc = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColorsM946colors5tl4gsc)) {
                    }
                    i12 |= i19;
                } else {
                    checkboxColorsM946colors5tl4gsc = checkboxColors;
                }
                i12 |= i19;
            } else {
                checkboxColorsM946colors5tl4gsc = checkboxColors;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        z13 = z12;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        modifier4 = modifier3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier3;
                        z13 = z12;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        z13 = z12;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        modifier4 = modifier3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier3;
                        z13 = z12;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
                }
                composerStartRestartGroup.startReplaceableGroup(1797978260);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(CheckboxTokens.INSTANCE.m1528getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f9627a), checkboxColors2, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                z14 = z13;
                checkboxColors3 = checkboxColors2;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        z13 = z12;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        modifier4 = modifier3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier3;
                        z13 = z12;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        z13 = z12;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        modifier4 = modifier3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier3;
                        z13 = z12;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
                }
                composerStartRestartGroup.startReplaceableGroup(1797978260);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(CheckboxTokens.INSTANCE.m1528getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f9627a), checkboxColors2, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                z14 = z13;
                checkboxColors3 = checkboxColors2;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier5, z14, checkboxColors3, mutableInteractionSource4, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    checkboxColorsM946colors5tl4gsc = checkboxColors;
                    if (composerStartRestartGroup.changed(checkboxColorsM946colors5tl4gsc)) {
                    }
                    i12 |= i19;
                } else {
                    checkboxColorsM946colors5tl4gsc = checkboxColors;
                }
                i12 |= i19;
            } else {
                checkboxColorsM946colors5tl4gsc = checkboxColors;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        z13 = z12;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        modifier4 = modifier3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier3;
                        z13 = z12;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        z13 = z12;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        modifier4 = modifier3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier3;
                        z13 = z12;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
                }
                composerStartRestartGroup.startReplaceableGroup(1797978260);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(CheckboxTokens.INSTANCE.m1528getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f9627a), checkboxColors2, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                z14 = z13;
                checkboxColors3 = checkboxColors2;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        z13 = z12;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        modifier4 = modifier3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier3;
                        z13 = z12;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                    }
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        z13 = z12;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                        modifier4 = modifier3;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier4 = modifier3;
                        z13 = z12;
                        checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
                }
                composerStartRestartGroup.startReplaceableGroup(1797978260);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(CheckboxTokens.INSTANCE.m1528getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f9627a), checkboxColors2, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                z14 = z13;
                checkboxColors3 = checkboxColors2;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier5, z14, checkboxColors3, mutableInteractionSource4, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                checkboxColorsM946colors5tl4gsc = checkboxColors;
                if (composerStartRestartGroup.changed(checkboxColorsM946colors5tl4gsc)) {
                }
                i12 |= i19;
            } else {
                checkboxColorsM946colors5tl4gsc = checkboxColors;
            }
            i12 |= i19;
        } else {
            checkboxColorsM946colors5tl4gsc = checkboxColors;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    z13 = z12;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    modifier4 = modifier3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    modifier4 = modifier3;
                    z13 = z12;
                    checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    z13 = z12;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    modifier4 = modifier3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    modifier4 = modifier3;
                    z13 = z12;
                    checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
            }
            composerStartRestartGroup.startReplaceableGroup(1797978260);
            if (function0 != null) {
                modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(CheckboxTokens.INSTANCE.m1528getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
            } else {
                modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f9627a), checkboxColors2, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            z14 = z13;
            checkboxColors3 = checkboxColors2;
            mutableInteractionSource4 = mutableInteractionSource3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    z13 = z12;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    modifier4 = modifier3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    modifier4 = modifier3;
                    z13 = z12;
                    checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                }
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    checkboxColorsM946colors5tl4gsc = CheckboxDefaults.INSTANCE.m946colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    z13 = z12;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                    modifier4 = modifier3;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    modifier4 = modifier3;
                    z13 = z12;
                    checkboxColors2 = checkboxColorsM946colors5tl4gsc;
                    i17 = i12;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1608358065, i17, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
            }
            composerStartRestartGroup.startReplaceableGroup(1797978260);
            if (function0 != null) {
                modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(CheckboxTokens.INSTANCE.m1528getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
            } else {
                modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f9627a), checkboxColors2, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 3) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            z14 = z13;
            checkboxColors3 = checkboxColors2;
            mutableInteractionSource4 = mutableInteractionSource3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier5, z14, checkboxColors3, mutableInteractionSource4, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:107:0x0212  */
    /* JADX WARN: Code duplicated, block: B:110:0x026b A[LOOP:0: B:109:0x0269->B:110:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0283  */
    /* JADX WARN: Code duplicated, block: B:118:0x029c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:75:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x019a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c9  */
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
    public static final void a(boolean z10, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, Composer composer, int i10) {
        float f6;
        float f10;
        State stateCreateTransitionAnimation;
        int i11;
        int i12;
        float f11;
        int i13;
        int i14;
        State stateCreateTransitionAnimation2;
        Object objRememberedValue;
        l0.a0 a0Var;
        State<Color> stateCheckmarkColor$material3_release;
        State<Color> stateBoxColor$material3_release;
        State<Color> stateBorderColor$material3_release;
        Object[] objArr;
        boolean zChanged;
        int i15;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2007131616);
        int i16 = (i10 & 14) == 0 ? (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i16 |= composerStartRestartGroup.changed(toggleableState) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i16 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i16 |= composerStartRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        int i17 = i16;
        if ((i17 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2007131616, i17, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:229)");
            }
            int i18 = i17 >> 3;
            int i19 = i18 & 14;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(toggleableState, (String) null, composerStartRestartGroup, i19, 2);
            f fVar = f.f9652p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            ToggleableState toggleableState2 = (ToggleableState) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(1800065638);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:244)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i20 = iArr[toggleableState2.ordinal()];
            float f12 = 0.0f;
            if (i20 == 1) {
                f6 = 1.0f;
            } else if (i20 != 2) {
                if (i20 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf = Float.valueOf(f6);
            ToggleableState toggleableState3 = (ToggleableState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(1800065638);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:244)");
            }
            int i21 = iArr[toggleableState3.ordinal()];
            if (i21 != 1) {
                if (i21 == 2) {
                    f10 = 0.0f;
                } else if (i21 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f10), fVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                e eVar = e.f9651p0;
                composerStartRestartGroup.startReplaceableGroup(-1338768149);
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
                composerStartRestartGroup.startReplaceableGroup(-142660079);
                ToggleableState toggleableState4 = (ToggleableState) transitionUpdateTransition.getCurrentState();
                composerStartRestartGroup.startReplaceableGroup(-1426969489);
                if (ComposerKt.isTraceInProgress()) {
                    i11 = -1;
                    ComposerKt.traceEventStart(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:260)");
                } else {
                    i11 = -1;
                }
                i12 = iArr[toggleableState4.ordinal()];
                if (i12 != 1 || i12 == 2) {
                    f11 = 0.0f;
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f11 = 1.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Float fValueOf2 = Float.valueOf(f11);
                ToggleableState toggleableState5 = (ToggleableState) transitionUpdateTransition.getTargetState();
                composerStartRestartGroup.startReplaceableGroup(-1426969489);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1426969489, 0, i11, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:260)");
                }
                i13 = iArr[toggleableState5.ordinal()];
                if (i13 != 1) {
                    i14 = 2;
                    if (i13 != 2) {
                        if (i13 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f12 = 1.0f;
                    }
                } else {
                    i14 = 2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i22 = i14;
                stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f12), eVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new l0.a0(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a0Var = (l0.a0) objRememberedValue;
                stateCheckmarkColor$material3_release = checkboxColors.checkmarkColor$material3_release(toggleableState, composerStartRestartGroup, i19 | ((i17 >> 6) & 112));
                int i23 = (i18 & 896) | (i17 & 14) | (i17 & 112);
                stateBoxColor$material3_release = checkboxColors.boxColor$material3_release(z10, toggleableState, composerStartRestartGroup, i23);
                stateBorderColor$material3_release = checkboxColors.borderColor$material3_release(z10, toggleableState, composerStartRestartGroup, i23);
                Modifier modifierM327requiredSize3ABfNKs = SizeKt.m327requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, i22, null), f9628b);
                objArr = new Object[6];
                objArr[0] = stateBoxColor$material3_release;
                objArr[1] = stateBorderColor$material3_release;
                objArr[i22] = stateCheckmarkColor$material3_release;
                objArr[3] = stateCreateTransitionAnimation;
                objArr[4] = stateCreateTransitionAnimation2;
                objArr[5] = a0Var;
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                for (i15 = 0; i15 < 6; i15++) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i15]);
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new c(stateBoxColor$material3_release, stateBorderColor$material3_release, stateCheckmarkColor$material3_release, stateCreateTransitionAnimation, stateCreateTransitionAnimation2, a0Var);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM327requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f10 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f10), fVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            e eVar2 = e.f9651p0;
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            ToggleableState toggleableState6 = (ToggleableState) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1426969489);
            if (ComposerKt.isTraceInProgress()) {
                i11 = -1;
                ComposerKt.traceEventStart(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:260)");
            } else {
                i11 = -1;
            }
            i12 = iArr[toggleableState6.ordinal()];
            if (i12 != 1) {
                f11 = 0.0f;
            } else {
                f11 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Float fValueOf3 = Float.valueOf(f11);
            ToggleableState toggleableState7 = (ToggleableState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceableGroup(-1426969489);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1426969489, 0, i11, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:260)");
            }
            i13 = iArr[toggleableState7.ordinal()];
            if (i13 != 1) {
                i14 = 2;
                if (i13 != 2) {
                    if (i13 == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                }
            } else {
                i14 = 2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i24 = i14;
            stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f12), eVar2.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter3, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l0.a0(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            a0Var = (l0.a0) objRememberedValue;
            stateCheckmarkColor$material3_release = checkboxColors.checkmarkColor$material3_release(toggleableState, composerStartRestartGroup, i19 | ((i17 >> 6) & 112));
            int i25 = (i18 & 896) | (i17 & 14) | (i17 & 112);
            stateBoxColor$material3_release = checkboxColors.boxColor$material3_release(z10, toggleableState, composerStartRestartGroup, i25);
            stateBorderColor$material3_release = checkboxColors.borderColor$material3_release(z10, toggleableState, composerStartRestartGroup, i25);
            Modifier modifierM327requiredSize3ABfNKs2 = SizeKt.m327requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, i24, null), f9628b);
            objArr = new Object[6];
            objArr[0] = stateBoxColor$material3_release;
            objArr[1] = stateBorderColor$material3_release;
            objArr[i24] = stateCheckmarkColor$material3_release;
            objArr[3] = stateCreateTransitionAnimation;
            objArr[4] = stateCreateTransitionAnimation2;
            objArr[5] = a0Var;
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i15 < 6) {
                zChanged |= composerStartRestartGroup.changed(objArr[i15]);
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new c(stateBoxColor$material3_release, stateBorderColor$material3_release, stateCheckmarkColor$material3_release, stateCreateTransitionAnimation, stateCreateTransitionAnimation2, a0Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new c(stateBoxColor$material3_release, stateBorderColor$material3_release, stateCheckmarkColor$material3_release, stateCreateTransitionAnimation, stateCreateTransitionAnimation2, a0Var);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM327requiredSize3ABfNKs2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(z10, toggleableState, modifier, checkboxColors, i10));
    }

    /* JADX INFO: renamed from: access$drawBox-1wkBAMs, reason: not valid java name */
    public static final void m947access$drawBox1wkBAMs(DrawScope drawScope, long j10, long j11, float f6, float f10) {
        float f11 = f10 / 2.0f;
        Stroke stroke = new Stroke(f10, 0.0f, 0, 0, null, 30, null);
        float fM2344getWidthimpl = Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc());
        if (Color.m2509equalsimpl0(j10, j11)) {
            a1.b.M(drawScope, j10, 0L, androidx.compose.ui.geometry.SizeKt.Size(fM2344getWidthimpl, fM2344getWidthimpl), CornerRadiusKt.CornerRadius$default(f6, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float f12 = fM2344getWidthimpl - (2 * f10);
        a1.b.M(drawScope, j10, OffsetKt.Offset(f10, f10), androidx.compose.ui.geometry.SizeKt.Size(f12, f12), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f6 - f10), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f13 = fM2344getWidthimpl - f10;
        a1.b.M(drawScope, j11, OffsetKt.Offset(f11, f11), androidx.compose.ui.geometry.SizeKt.Size(f13, f13), CornerRadiusKt.CornerRadius$default(f6 - f11, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: renamed from: access$drawCheck-3IgeMak, reason: not valid java name */
    public static final void m948access$drawCheck3IgeMak(DrawScope drawScope, long j10, float f6, float f10, float f11, l0.a0 a0Var) {
        Stroke stroke = new Stroke(f11, 0.0f, StrokeCap.INSTANCE.m2810getSquareKaPHkGw(), 0, null, 26, null);
        float fM2344getWidthimpl = Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc());
        float fLerp = MathHelpersKt.lerp(0.4f, 0.5f, f10);
        float fLerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f10);
        float fLerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f10);
        float fLerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f10);
        a0Var.f82401a.reset();
        Path path = a0Var.f82401a;
        path.moveTo(0.2f * fM2344getWidthimpl, fLerp3 * fM2344getWidthimpl);
        path.lineTo(fLerp * fM2344getWidthimpl, fLerp2 * fM2344getWidthimpl);
        path.lineTo(0.8f * fM2344getWidthimpl, fM2344getWidthimpl * fLerp4);
        PathMeasure pathMeasure = a0Var.f82402b;
        pathMeasure.setPath(path, false);
        Path path2 = a0Var.f82403c;
        path2.reset();
        pathMeasure.getSegment(0.0f, pathMeasure.getLength() * f6, path2, true);
        a1.b.G(drawScope, a0Var.f82403c, j10, 0.0f, stroke, null, 0, 52, null);
    }
}
