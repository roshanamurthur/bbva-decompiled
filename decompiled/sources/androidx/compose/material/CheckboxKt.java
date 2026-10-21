package androidx.compose.material;

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
@Metadata(d1 = {"\u0000D\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u001b²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/CheckboxColors;", "colors", "Checkbox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "TriStateCheckbox", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "", "checkDrawFraction", "checkCenterGravitationShiftFraction", "Landroidx/compose/ui/graphics/Color;", "checkColor", "boxColor", "borderColor", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,485:1\n25#2:486\n50#2:493\n49#2:494\n25#2:501\n25#2:526\n83#2,3:533\n1097#3,6:487\n1097#3,6:495\n1097#3,6:502\n1097#3,6:527\n1097#3,6:536\n937#4,4:508\n858#4,5:512\n937#4,4:517\n858#4,5:521\n81#5:542\n81#5:543\n81#5:544\n81#5:545\n81#5:546\n154#6:547\n154#6:548\n154#6:549\n154#6:550\n154#6:551\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n91#1:486\n96#1:493\n96#1:494\n137#1:501\n297#1:526\n301#1:533,3\n91#1:487,6\n96#1:495,6\n137#1:502,6\n297#1:527,6\n301#1:536,6\n266#1:508,4\n266#1:512,5\n282#1:517,4\n282#1:521,5\n266#1:542\n282#1:543\n298#1:544\n299#1:545\n300#1:546\n480#1:547\n481#1:548\n482#1:549\n483#1:550\n484#1:551\n*E\n"})
public final class CheckboxKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f6926b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f6928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f6929e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f6925a = Dp.m4389constructorimpl(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f6927c = Dp.m4389constructorimpl(20);

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
        public final /* synthetic */ Function1<Boolean, Unit> f6930p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f6931q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, Unit> function1, boolean z10) {
            super(0);
            this.f6930p0 = function1;
            this.f6931q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f6930p0.invoke(Boolean.valueOf(!this.f6931q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6932p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f6933q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6934r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f6935s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6936t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CheckboxColors f6937u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6938w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, int i10, int i11) {
            super(2);
            this.f6932p0 = z10;
            this.f6933q0 = function1;
            this.f6934r0 = modifier;
            this.f6935s0 = z11;
            this.f6936t0 = mutableInteractionSource;
            this.f6937u0 = checkboxColors;
            this.v0 = i10;
            this.f6938w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CheckboxKt.Checkbox(this.f6932p0, this.f6933q0, this.f6934r0, this.f6935s0, this.f6936t0, this.f6937u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f6938w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class c extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ h0.d0 f6939p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f6940q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f6941r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f6942s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f6943t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f6944u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h0.d0 d0Var, State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5) {
            super(1);
            this.f6939p0 = d0Var;
            this.f6940q0 = state;
            this.f6941r0 = state2;
            this.f6942s0 = state3;
            this.f6943t0 = state4;
            this.f6944u0 = state5;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fFloor = (float) Math.floor(Canvas.mo415toPx0680j_4(CheckboxKt.f6928d));
            CheckboxKt.m694access$drawBox1wkBAMs(Canvas, CheckboxKt.access$CheckboxImpl$lambda$9(this.f6940q0), CheckboxKt.access$CheckboxImpl$lambda$10(this.f6941r0), Canvas.mo415toPx0680j_4(CheckboxKt.f6929e), fFloor);
            CheckboxKt.m695access$drawCheck3IgeMak(Canvas, CheckboxKt.access$CheckboxImpl$lambda$8(this.f6942s0), CheckboxKt.access$CheckboxImpl$lambda$4(this.f6943t0), CheckboxKt.access$CheckboxImpl$lambda$6(this.f6944u0), fFloor, this.f6939p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6945p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ToggleableState f6946q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6947r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CheckboxColors f6948s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6949t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i10) {
            super(2);
            this.f6945p0 = z10;
            this.f6946q0 = toggleableState;
            this.f6947r0 = modifier;
            this.f6948s0 = checkboxColors;
            this.f6949t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CheckboxKt.a(this.f6945p0, this.f6946q0, this.f6947r0, this.f6948s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6949t0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    public static final class e extends Lambda implements Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f6950p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer, Integer num) {
            FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
            Transition.Segment<ToggleableState> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, 1075283605);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1075283605, iD, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:282)");
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
        public static final f f6951p0 = new f(3);

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer, Integer num) {
            FiniteAnimationSpec<Float> finiteAnimationSpecSnap;
            Transition.Segment<ToggleableState> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -1707702900);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1707702900, iD, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:266)");
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
        public final /* synthetic */ ToggleableState f6952p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6953q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6954r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f6955s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6956t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CheckboxColors f6957u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6958w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ToggleableState toggleableState, Function0<Unit> function0, Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, int i10, int i11) {
            super(2);
            this.f6952p0 = toggleableState;
            this.f6953q0 = function0;
            this.f6954r0 = modifier;
            this.f6955s0 = z10;
            this.f6956t0 = mutableInteractionSource;
            this.f6957u0 = checkboxColors;
            this.v0 = i10;
            this.f6958w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CheckboxKt.TriStateCheckbox(this.f6952p0, this.f6953q0, this.f6954r0, this.f6955s0, this.f6956t0, this.f6957u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f6958w0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 2;
        f6926b = Dp.m4389constructorimpl(f6);
        f6928d = Dp.m4389constructorimpl(f6);
        f6929e = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0146  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:106:0x0171  */
    /* JADX WARN: Code duplicated, block: B:108:0x0179  */
    /* JADX WARN: Code duplicated, block: B:110:0x0188  */
    /* JADX WARN: Code duplicated, block: B:113:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Checkbox(boolean z10, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable CheckboxColors checkboxColors, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        CheckboxColors checkboxColors2;
        Modifier modifier3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource3;
        int i17;
        CheckboxColors checkboxColorsM693colorszjMxDiM;
        Object objRememberedValue;
        Function0 function0;
        CheckboxColors checkboxColors3;
        boolean z14;
        boolean zChanged;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2118660998);
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
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 458752) == 0) {
                        if ((i11 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            int i19 = composerStartRestartGroup.changed(checkboxColors2) ? 131072 : 65536;
                            i12 |= i19;
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i12 |= i19;
                    } else {
                        checkboxColors2 = checkboxColors;
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
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 32) != 0) {
                                i17 = i12 & (-458753);
                                checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            } else {
                                i17 = i12;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                            }
                            ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z10);
                            composerStartRestartGroup.startReplaceableGroup(1433125990);
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
                            TriStateCheckbox(ToggleableState, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            boolean z15 = z13;
                            checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                            z14 = z15;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            i17 = i12;
                            modifier3 = modifier2;
                            z13 = z12;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                        }
                        ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z10);
                        composerStartRestartGroup.startReplaceableGroup(1433125990);
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
                        TriStateCheckbox(ToggleableState2, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        boolean z16 = z13;
                        checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                        z14 = z16;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z14 = z12;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, mutableInteractionSource3, checkboxColors3, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState3 = ToggleableStateKt.ToggleableState(z10);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
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
                    TriStateCheckbox(ToggleableState3, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z17 = z13;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                    z14 = z17;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState4 = ToggleableStateKt.ToggleableState(z10);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
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
                    TriStateCheckbox(ToggleableState4, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z18 = z13;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                    z14 = z18;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, mutableInteractionSource3, checkboxColors3, i10, i11));
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState5 = ToggleableStateKt.ToggleableState(z10);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
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
                    TriStateCheckbox(ToggleableState5, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z19 = z13;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                    z14 = z19;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState6 = ToggleableStateKt.ToggleableState(z10);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
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
                    TriStateCheckbox(ToggleableState6, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z110 = z13;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                    z14 = z110;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, mutableInteractionSource3, checkboxColors3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState7 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
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
                TriStateCheckbox(ToggleableState7, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z111 = z13;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                z14 = z111;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState8 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf8 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf8) | composerStartRestartGroup.changed(function1);
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
                TriStateCheckbox(ToggleableState8, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z112 = z13;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                z14 = z112;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, mutableInteractionSource3, checkboxColors3, i10, i11));
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
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState9 = ToggleableStateKt.ToggleableState(z10);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
                    if (function1 != null) {
                        Boolean boolValueOf9 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf9) | composerStartRestartGroup.changed(function1);
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
                    TriStateCheckbox(ToggleableState9, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z113 = z13;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                    z14 = z113;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            i17 = i12 & (-458753);
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        } else {
                            i17 = i12;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                    }
                    ToggleableState ToggleableState10 = ToggleableStateKt.ToggleableState(z10);
                    composerStartRestartGroup.startReplaceableGroup(1433125990);
                    if (function1 != null) {
                        Boolean boolValueOf10 = Boolean.valueOf(z10);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(boolValueOf10) | composerStartRestartGroup.changed(function1);
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
                    TriStateCheckbox(ToggleableState10, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    boolean z114 = z13;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                    z14 = z114;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, mutableInteractionSource3, checkboxColors3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState11 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf11 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf11) | composerStartRestartGroup.changed(function1);
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
                TriStateCheckbox(ToggleableState11, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z115 = z13;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                z14 = z115;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState12 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf12 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf12) | composerStartRestartGroup.changed(function1);
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
                TriStateCheckbox(ToggleableState12, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z116 = z13;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                z14 = z116;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, mutableInteractionSource3, checkboxColors3, i10, i11));
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState13 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf13 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf13) | composerStartRestartGroup.changed(function1);
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
                TriStateCheckbox(ToggleableState13, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z117 = z13;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                z14 = z117;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        i17 = i12 & (-458753);
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    } else {
                        i17 = i12;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                }
                ToggleableState ToggleableState14 = ToggleableStateKt.ToggleableState(z10);
                composerStartRestartGroup.startReplaceableGroup(1433125990);
                if (function1 != null) {
                    Boolean boolValueOf14 = Boolean.valueOf(z10);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(boolValueOf14) | composerStartRestartGroup.changed(function1);
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
                TriStateCheckbox(ToggleableState14, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                boolean z118 = z13;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                z14 = z118;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, mutableInteractionSource3, checkboxColors3, i10, i11));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
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
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    i17 = i12 & (-458753);
                    checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                } else {
                    i17 = i12;
                    checkboxColorsM693colorszjMxDiM = checkboxColors2;
                }
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
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    i17 = i12 & (-458753);
                    checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                } else {
                    i17 = i12;
                    checkboxColorsM693colorszjMxDiM = checkboxColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
            }
            ToggleableState ToggleableState15 = ToggleableStateKt.ToggleableState(z10);
            composerStartRestartGroup.startReplaceableGroup(1433125990);
            if (function1 != null) {
                Boolean boolValueOf15 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(boolValueOf15) | composerStartRestartGroup.changed(function1);
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
            TriStateCheckbox(ToggleableState15, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z119 = z13;
            checkboxColors3 = checkboxColorsM693colorszjMxDiM;
            z14 = z119;
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
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    i17 = i12 & (-458753);
                    checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                } else {
                    i17 = i12;
                    checkboxColorsM693colorszjMxDiM = checkboxColors2;
                }
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
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    i17 = i12 & (-458753);
                    checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                } else {
                    i17 = i12;
                    checkboxColorsM693colorszjMxDiM = checkboxColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118660998, i17, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
            }
            ToggleableState ToggleableState16 = ToggleableStateKt.ToggleableState(z10);
            composerStartRestartGroup.startReplaceableGroup(1433125990);
            if (function1 != null) {
                Boolean boolValueOf16 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(boolValueOf16) | composerStartRestartGroup.changed(function1);
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
            TriStateCheckbox(ToggleableState16, function0, modifier3, z13, mutableInteractionSource3, checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z1110 = z13;
            checkboxColors3 = checkboxColorsM693colorszjMxDiM;
            z14 = z1110;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, function1, modifier3, z14, mutableInteractionSource3, checkboxColors3, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0151  */
    /* JADX WARN: Code duplicated, block: B:103:0x015f  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0194  */
    /* JADX WARN: Code duplicated, block: B:108:0x019b  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:116:0x01db  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x011a  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0140  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TriStateCheckbox(@NotNull ToggleableState state, @Nullable Function0<Unit> function0, @Nullable Modifier modifier, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable CheckboxColors checkboxColors, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        CheckboxColors checkboxColors2;
        Modifier modifier3;
        boolean z12;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier4;
        boolean z13;
        MutableInteractionSource mutableInteractionSource4;
        CheckboxColors checkboxColorsM693colorszjMxDiM;
        int i17;
        Object objRememberedValue;
        Modifier modifierM466triStateToggleableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        boolean z14;
        MutableInteractionSource mutableInteractionSource5;
        CheckboxColors checkboxColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(2031255194);
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
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            int i19 = composerStartRestartGroup.changed(checkboxColors2) ? 131072 : 65536;
                            i12 |= i19;
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i12 |= i19;
                    } else {
                        checkboxColors2 = checkboxColors;
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
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 32) != 0) {
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i17 = i12 & (-458753);
                                modifier4 = modifier3;
                            } else {
                                modifier4 = modifier3;
                                z13 = z12;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                checkboxColorsM693colorszjMxDiM = checkboxColors2;
                                i17 = i12;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            i17 = i12;
                            z13 = z11;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                            modifier4 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1517549514);
                        if (function0 != null) {
                            modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                        } else {
                            modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (function0 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        z14 = z13;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z14 = z11;
                        composerStartRestartGroup = composerStartRestartGroup;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        checkboxColors3 = checkboxColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier2, z14, mutableInteractionSource5, checkboxColors3, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                            i17 = i12;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z14 = z13;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                            i17 = i12;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z14 = z13;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier2, z14, mutableInteractionSource5, checkboxColors3, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                            i17 = i12;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z14 = z13;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                            i17 = i12;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z14 = z13;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier2, z14, mutableInteractionSource5, checkboxColors3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z14 = z13;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z14 = z13;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier2, z14, mutableInteractionSource5, checkboxColors3, i10, i11));
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
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                            i17 = i12;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z14 = z13;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 32) != 0) {
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            i17 = i12 & (-458753);
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            z13 = z12;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            checkboxColorsM693colorszjMxDiM = checkboxColors2;
                            i17 = i12;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1517549514);
                    if (function0 != null) {
                        modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                    } else {
                        modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (function0 != null) {
                        modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                    } else {
                        modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                    }
                    a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    z14 = z13;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    checkboxColors3 = checkboxColorsM693colorszjMxDiM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier2, z14, mutableInteractionSource5, checkboxColors3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z14 = z13;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z14 = z13;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier2, z14, mutableInteractionSource5, checkboxColors3, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z14 = z13;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 32) != 0) {
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                        i17 = i12 & (-458753);
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        checkboxColorsM693colorszjMxDiM = checkboxColors2;
                        i17 = i12;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1517549514);
                if (function0 != null) {
                    modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
                } else {
                    modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (function0 != null) {
                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                } else {
                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                }
                a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z14 = z13;
                mutableInteractionSource5 = mutableInteractionSource4;
                checkboxColors3 = checkboxColorsM693colorszjMxDiM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier2, z14, mutableInteractionSource5, checkboxColors3, i10, i11));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
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
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    i17 = i12 & (-458753);
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    i17 = i12 & (-458753);
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    i17 = i12;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1517549514);
            if (function0 != null) {
                modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
            } else {
                modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            z14 = z13;
            mutableInteractionSource5 = mutableInteractionSource4;
            checkboxColors3 = checkboxColorsM693colorszjMxDiM;
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
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    i17 = i12 & (-458753);
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM693colorszjMxDiM = checkboxColors2;
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
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 32) != 0) {
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM693colorszjMxDiM = CheckboxDefaults.INSTANCE.m693colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    i17 = i12 & (-458753);
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    checkboxColorsM693colorszjMxDiM = checkboxColors2;
                    i17 = i12;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1517549514);
            if (function0 != null) {
                modifierM466triStateToggleableO2vRcR0 = ToggleableKt.m466triStateToggleableO2vRcR0(Modifier.INSTANCE, state, mutableInteractionSource4, RippleKt.m900rememberRipple9IZ8Weo(false, f6925a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), function0);
            } else {
                modifierM466triStateToggleableO2vRcR0 = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function0 != null) {
                modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
            } else {
                modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
            }
            a(z13, state, PaddingKt.m296padding3ABfNKs(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM466triStateToggleableO2vRcR0), f6926b), checkboxColorsM693colorszjMxDiM, composerStartRestartGroup, ((i17 >> 9) & 14) | ((i17 << 3) & 112) | ((i17 >> 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            z14 = z13;
            mutableInteractionSource5 = mutableInteractionSource4;
            checkboxColors3 = checkboxColorsM693colorszjMxDiM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(state, function0, modifier2, z14, mutableInteractionSource5, checkboxColors3, i10, i11));
    }

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
        int i11;
        float f11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2118895727);
        int i13 = (i10 & 14) == 0 ? (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(toggleableState) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        int i14 = i13;
        if ((i14 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118895727, i14, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:258)");
            }
            int i15 = i14 >> 3;
            int i16 = i15 & 14;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(toggleableState, (String) null, composerStartRestartGroup, i16, 2);
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            ToggleableState toggleableState2 = (ToggleableState) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-1798345588);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i17 = iArr[toggleableState2.ordinal()];
            float f12 = 0.0f;
            if (i17 == 1) {
                f6 = 1.0f;
            } else if (i17 != 2) {
                if (i17 != 3) {
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
            composerStartRestartGroup.startReplaceableGroup(-1798345588);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
            }
            int i18 = iArr[toggleableState3.ordinal()];
            if (i18 == 1) {
                f10 = 1.0f;
            } else if (i18 != 2) {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f10), f.f6951p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject);
            composerStartRestartGroup.startReplaceableGroup(-142660079);
            ToggleableState toggleableState4 = (ToggleableState) transitionUpdateTransition.getCurrentState();
            composerStartRestartGroup.startReplaceableGroup(-2098942571);
            if (ComposerKt.isTraceInProgress()) {
                i11 = -1;
                ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
            } else {
                i11 = -1;
            }
            int i19 = iArr[toggleableState4.ordinal()];
            if (i19 == 1 || i19 == 2) {
                f11 = 0.0f;
            } else {
                if (i19 != 3) {
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
            composerStartRestartGroup.startReplaceableGroup(-2098942571);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2098942571, 0, i11, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
            }
            int i20 = iArr[toggleableState5.ordinal()];
            if (i20 != 1) {
                i12 = 2;
                if (i20 != 2) {
                    if (i20 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f12 = 1.0f;
                }
            } else {
                i12 = 2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i21 = i12;
            State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f12), e.f6950p0.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new h0.d0(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            h0.d0 d0Var = (h0.d0) objRememberedValue;
            State<Color> stateCheckmarkColor = checkboxColors.checkmarkColor(toggleableState, composerStartRestartGroup, i16 | ((i14 >> 6) & 112));
            int i22 = (i15 & 896) | (i14 & 14) | (i14 & 112);
            State<Color> stateBoxColor = checkboxColors.boxColor(z10, toggleableState, composerStartRestartGroup, i22);
            State<Color> stateBorderColor = checkboxColors.borderColor(z10, toggleableState, composerStartRestartGroup, i22);
            Modifier modifierM327requiredSize3ABfNKs = SizeKt.m327requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.INSTANCE.getCenter(), false, i21, null), f6927c);
            Object[] objArr = new Object[6];
            objArr[0] = stateBoxColor;
            objArr[1] = stateBorderColor;
            objArr[i21] = stateCheckmarkColor;
            objArr[3] = stateCreateTransitionAnimation;
            objArr[4] = stateCreateTransitionAnimation2;
            objArr[5] = d0Var;
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            boolean zChanged = false;
            for (int i23 = 0; i23 < 6; i23++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i23]);
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c(d0Var, stateBoxColor, stateBorderColor, stateCheckmarkColor, stateCreateTransitionAnimation, stateCreateTransitionAnimation2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM327requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
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

    public static final long access$CheckboxImpl$lambda$10(State state) {
        return ((Color) state.getValue()).m2518unboximpl();
    }

    public static final float access$CheckboxImpl$lambda$4(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float access$CheckboxImpl$lambda$6(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final long access$CheckboxImpl$lambda$8(State state) {
        return ((Color) state.getValue()).m2518unboximpl();
    }

    public static final long access$CheckboxImpl$lambda$9(State state) {
        return ((Color) state.getValue()).m2518unboximpl();
    }

    /* JADX INFO: renamed from: access$drawBox-1wkBAMs, reason: not valid java name */
    public static final void m694access$drawBox1wkBAMs(DrawScope drawScope, long j10, long j11, float f6, float f10) {
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
    public static final void m695access$drawCheck3IgeMak(DrawScope drawScope, long j10, float f6, float f10, float f11, h0.d0 d0Var) {
        Stroke stroke = new Stroke(f11, 0.0f, StrokeCap.INSTANCE.m2810getSquareKaPHkGw(), 0, null, 26, null);
        float fM2344getWidthimpl = Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc());
        float fLerp = MathHelpersKt.lerp(0.4f, 0.5f, f10);
        float fLerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f10);
        float fLerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f10);
        float fLerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f10);
        d0Var.f68709a.reset();
        Path path = d0Var.f68709a;
        path.moveTo(0.2f * fM2344getWidthimpl, fLerp3 * fM2344getWidthimpl);
        path.lineTo(fLerp * fM2344getWidthimpl, fLerp2 * fM2344getWidthimpl);
        path.lineTo(0.8f * fM2344getWidthimpl, fM2344getWidthimpl * fLerp4);
        PathMeasure pathMeasure = d0Var.f68710b;
        pathMeasure.setPath(path, false);
        Path path2 = d0Var.f68711c;
        path2.reset();
        pathMeasure.getSegment(0.0f, pathMeasure.getLength() * f6, path2, true);
        a1.b.G(drawScope, d0Var.f68711c, j10, 0.0f, stroke, null, 0, 52, null);
    }
}
