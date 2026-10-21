package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\"\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\"\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0007\u001a>\u0010\u0010\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\nH\u0007ø\u0001\u0000\u001a>\u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\nH\u0007ø\u0001\u0000\u001a9\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a9\u0010\u001c\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aT\u0010\"\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\nH\u0007ø\u0001\u0000\u001aT\u0010%\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\nH\u0007ø\u0001\u0000\u001aT\u0010*\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001e\u001a\u00020&2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010)\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b((\u0012\u0004\u0012\u00020'0\nH\u0007ø\u0001\u0000\u001aT\u0010.\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001e\u001a\u00020+2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010-\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020'0\nH\u0007ø\u0001\u0000\u001aT\u00100\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010#\u001a\u00020&2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u0010/\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b((\u0012\u0004\u0012\u00020'0\nH\u0007ø\u0001\u0000\u001aT\u00102\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010#\u001a\u00020+2\b\b\u0002\u0010 \u001a\u00020\u001f2#\b\u0002\u00101\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020'0\nH\u0007ø\u0001\u0000\u001a@\u00104\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b((\u0012\u0004\u0012\u00020'0\nH\u0007ø\u0001\u0000\u001a@\u00106\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020'0\nH\u0007ø\u0001\u0000\u001a@\u00108\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b((\u0012\u0004\u0012\u00020'0\nH\u0007ø\u0001\u0000\u001a@\u0010:\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00109\u001a\u001d\u0012\u0013\u0012\u00110'¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020'0\nH\u0007ø\u0001\u0000\u001a1\u0010B\u001a\u00020A*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010C\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006I²\u0006\u000e\u0010D\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010E\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010F\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010G\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\u000e\u0010H\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010H\u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/EnterTransition;", "fadeIn", "targetAlpha", "Landroidx/compose/animation/ExitTransition;", "fadeOut", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "initialOffset", "slideIn", "targetOffset", "slideOut", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleIn", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "scaleOut", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "initialSize", "expandIn", "shrinkTowards", "targetSize", "shrinkOut", "Landroidx/compose/ui/Alignment$Horizontal;", "", "fullWidth", "initialWidth", "expandHorizontally", "Landroidx/compose/ui/Alignment$Vertical;", "fullHeight", "initialHeight", "expandVertically", "targetWidth", "shrinkHorizontally", "targetHeight", "shrinkVertically", "initialOffsetX", "slideInHorizontally", "initialOffsetY", "slideInVertically", "targetOffsetX", "slideOutHorizontally", "targetOffsetY", "slideOutVertically", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", HearingDisabilitiesConstants.EXIT_VIDEO_CALL, "", "label", "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "shouldAnimateAlpha", "shouldAnimateScale", "alpha", ImageScaleTypeHandler.ID, "shouldAnimate", "animation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1177:1\n36#2:1178\n36#2:1185\n25#2:1192\n25#2:1205\n67#2,3:1228\n66#2:1231\n36#2:1238\n1097#3,6:1179\n1097#3,6:1186\n1097#3,6:1193\n1097#3,6:1206\n1097#3,6:1232\n1097#3,6:1239\n940#4:1199\n858#4,5:1200\n940#4:1212\n858#4,5:1213\n853#4,10:1218\n81#5:1245\n107#5,2:1246\n81#5:1248\n107#5,2:1249\n81#5:1251\n81#5:1252\n81#5:1253\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n845#1:1178\n846#1:1185\n870#1:1192\n893#1:1205\n922#1:1228,3\n922#1:1231\n929#1:1238\n845#1:1179,6\n846#1:1186,6\n870#1:1193,6\n893#1:1206,6\n922#1:1232,6\n929#1:1239,6\n860#1:1199\n860#1:1200,5\n883#1:1212\n883#1:1213,5\n909#1:1218,10\n845#1:1245\n845#1:1246,2\n846#1:1248\n846#1:1249,2\n859#1:1251\n883#1:1252\n909#1:1253\n*E\n"})
public final class EnterExitTransitionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<TransformOrigin, AnimationVector2D> f2737a = VectorConvertersKt.TwoWayConverter(a.f2742p0, b.f2743p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final MutableFloatState f2738b = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<Float> f2739c = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<IntOffset> f2740d = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<IntSize> f2741e = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4541boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class a extends Lambda implements Function1<TransformOrigin, AnimationVector2D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f2742p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector2D invoke(TransformOrigin transformOrigin) {
            long f15746a = transformOrigin.getF15746a();
            return new AnimationVector2D(TransformOrigin.m2840getPivotFractionXimpl(f15746a), TransformOrigin.m2841getPivotFractionYimpl(f15746a));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class b extends Lambda implements Function1<AnimationVector2D, TransformOrigin> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f2743p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final TransformOrigin invoke(AnimationVector2D animationVector2D) {
            AnimationVector2D it = animationVector2D;
            Intrinsics.checkNotNullParameter(it, "it");
            return TransformOrigin.m2832boximpl(TransformOriginKt.TransformOrigin(it.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String(), it.getV2()));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class c extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f2744p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f2745q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<TransformOrigin> f2746r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
            super(1);
            this.f2744p0 = state;
            this.f2745q0 = state2;
            this.f2746r0 = state3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(EnterExitTransitionKt.access$createModifier$lambda$8(this.f2744p0));
            State<Float> state = this.f2745q0;
            graphicsLayer.setScaleX(EnterExitTransitionKt.access$createModifier$lambda$11(state));
            graphicsLayer.setScaleY(EnterExitTransitionKt.access$createModifier$lambda$11(state));
            graphicsLayer.mo2664setTransformOrigin__ExYCQ(EnterExitTransitionKt.access$createModifier$lambda$13(this.f2746r0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class d extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f2747p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(State<Float> state) {
            super(1);
            this.f2747p0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setAlpha(EnterExitTransitionKt.access$createModifier$lambda$8(this.f2747p0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class e extends Lambda implements Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2748p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2749q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnterTransition enterTransition, ExitTransition exitTransition) {
            super(3);
            this.f2748p0 = enterTransition;
            this.f2749q0 = exitTransition;
        }

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer, Integer num) {
            FiniteAnimationSpec<Float> animationSpec;
            Fade fade;
            Transition.Segment<EnterExitState> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -57153604);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-57153604, iD, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:860)");
            }
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (segment2.isTransitioningTo(enterExitState, enterExitState2)) {
                Fade fade2 = this.f2748p0.getData$animation_release().getFade();
                if (fade2 == null || (animationSpec = fade2.getAnimationSpec()) == null) {
                    animationSpec = EnterExitTransitionKt.f2739c;
                }
            } else if (!segment2.isTransitioningTo(enterExitState2, EnterExitState.PostExit) || (fade = this.f2749q0.getData$animation_release().getFade()) == null || (animationSpec = fade.getAnimationSpec()) == null) {
                animationSpec = EnterExitTransitionKt.f2739c;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return animationSpec;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class f extends Lambda implements Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f2750p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f2751q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnterTransition enterTransition, ExitTransition exitTransition) {
            super(3);
            this.f2750p0 = enterTransition;
            this.f2751q0 = exitTransition;
        }

        @Override // kotlin.jvm.functions.Function3
        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer, Integer num) {
            FiniteAnimationSpec<Float> animationSpec;
            Scale scale;
            Transition.Segment<EnterExitState> segment2 = segment;
            Composer composer2 = composer;
            int iD = androidx.datastore.preferences.protobuf.e.d(num, segment2, "$this$animateFloat", composer2, -53984035);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-53984035, iD, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:883)");
            }
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (segment2.isTransitioningTo(enterExitState, enterExitState2)) {
                Scale scale2 = this.f2750p0.getData$animation_release().getScale();
                if (scale2 == null || (animationSpec = scale2.getAnimationSpec()) == null) {
                    animationSpec = EnterExitTransitionKt.f2739c;
                }
            } else if (!segment2.isTransitioningTo(enterExitState2, EnterExitState.PostExit) || (scale = this.f2751q0.getData$animation_release().getScale()) == null || (animationSpec = scale.getAnimationSpec()) == null) {
                animationSpec = EnterExitTransitionKt.f2739c;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return animationSpec;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class g extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f2752p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            num.intValue();
            return 0;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class h extends Lambda implements Function1<IntSize, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2753p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2753p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(IntSize intSize) {
            long f18319a = intSize.getF18319a();
            return IntSize.m4541boximpl(IntSizeKt.IntSize(this.f2753p0.invoke(Integer.valueOf(IntSize.m4549getWidthimpl(f18319a))).intValue(), IntSize.m4548getHeightimpl(f18319a)));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class i extends Lambda implements Function1<IntSize, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f2754p0 = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(IntSize intSize) {
            intSize.getF18319a();
            return IntSize.m4541boximpl(IntSizeKt.IntSize(0, 0));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class j extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f2755p0 = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            num.intValue();
            return 0;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class k extends Lambda implements Function1<IntSize, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2756p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2756p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(IntSize intSize) {
            long f18319a = intSize.getF18319a();
            return IntSize.m4541boximpl(IntSizeKt.IntSize(IntSize.m4549getWidthimpl(f18319a), this.f2756p0.invoke(Integer.valueOf(IntSize.m4548getHeightimpl(f18319a))).intValue()));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class l extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f2757p0 = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            num.intValue();
            return 0;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class m extends Lambda implements Function1<IntSize, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2758p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2758p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(IntSize intSize) {
            long f18319a = intSize.getF18319a();
            return IntSize.m4541boximpl(IntSizeKt.IntSize(this.f2758p0.invoke(Integer.valueOf(IntSize.m4549getWidthimpl(f18319a))).intValue(), IntSize.m4548getHeightimpl(f18319a)));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class n extends Lambda implements Function1<IntSize, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f2759p0 = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(IntSize intSize) {
            intSize.getF18319a();
            return IntSize.m4541boximpl(IntSizeKt.IntSize(0, 0));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class o extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f2760p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            num.intValue();
            return 0;
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class p extends Lambda implements Function1<IntSize, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2761p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2761p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(IntSize intSize) {
            long f18319a = intSize.getF18319a();
            return IntSize.m4541boximpl(IntSizeKt.IntSize(IntSize.m4549getWidthimpl(f18319a), this.f2761p0.invoke(Integer.valueOf(IntSize.m4548getHeightimpl(f18319a))).intValue()));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class q extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f2762p0 = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf((-num.intValue()) / 2);
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class r extends Lambda implements Function1<IntSize, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2763p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2763p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(IntSize intSize) {
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(this.f2763p0.invoke(Integer.valueOf(IntSize.m4549getWidthimpl(intSize.getF18319a()))).intValue(), 0));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class s extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final s f2764p0 = new s(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf((-num.intValue()) / 2);
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class t extends Lambda implements Function1<IntSize, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2765p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2765p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(IntSize intSize) {
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(0, this.f2765p0.invoke(Integer.valueOf(IntSize.m4548getHeightimpl(intSize.getF18319a()))).intValue()));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class u extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final u f2766p0 = new u(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf((-num.intValue()) / 2);
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class v extends Lambda implements Function1<IntSize, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2767p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2767p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(IntSize intSize) {
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(this.f2767p0.invoke(Integer.valueOf(IntSize.m4549getWidthimpl(intSize.getF18319a()))).intValue(), 0));
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class w extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final w f2768p0 = new w(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf((-num.intValue()) / 2);
        }
    }

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class x extends Lambda implements Function1<IntSize, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2769p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2769p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(IntSize intSize) {
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(0, this.f2769p0.invoke(Integer.valueOf(IntSize.m4548getHeightimpl(intSize.getF18319a()))).intValue()));
        }
    }

    public static final Alignment a(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(horizontal, companion.getStart())) {
            return companion.getCenterStart();
        }
        return Intrinsics.areEqual(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    public static final float access$createModifier$lambda$11(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final long access$createModifier$lambda$13(State state) {
        return ((TransformOrigin) state.getValue()).getF15746a();
    }

    public static final float access$createModifier$lambda$8(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final Alignment b(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(vertical, companion.getTop())) {
            return companion.getTopCenter();
        }
        return Intrinsics.areEqual(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0403  */
    /* JADX WARN: Code duplicated, block: B:158:0x047a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0500  */
    /* JADX WARN: Code duplicated, block: B:47:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0330  */
    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @NotNull
    public static final Modifier createModifier(@NotNull Transition<EnterExitState> transition, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull String label, @Nullable Composer composer, int i10) {
        MutableState mutableState;
        int i11;
        State stateCreateTransitionAnimation;
        Modifier modifierGraphicsLayer;
        float scale;
        TransformOrigin transformOriginM2832boximpl;
        TransformOrigin transformOriginM2832boximpl2;
        TransformOrigin transformOriginM2832boximpl3;
        float alpha;
        char c10;
        float alpha2;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(label, "label");
        composer.startReplaceableGroup(914000546);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(914000546, i10, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:819)");
        }
        Modifier modifierComposed$default = ComposedModifierKt.composed$default(ComposedModifierKt.composed$default(Modifier.INSTANCE, null, new r.d(transition, SnapshotStateKt.rememberUpdatedState(enter.getData$animation_release().getSlide(), composer, 0), SnapshotStateKt.rememberUpdatedState(exit.getData$animation_release().getSlide(), composer, 0), label), 1, null), null, new r.c(transition, SnapshotStateKt.rememberUpdatedState(enter.getData$animation_release().getChangeSize(), composer, 0), SnapshotStateKt.rememberUpdatedState(exit.getData$animation_release().getChangeSize(), composer, 0), label), 1, null);
        int i12 = i10 & 14;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(transition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue2;
        if (transition.getCurrentState() != transition.getTargetState() || transition.isSeeking()) {
            if (enter.getData$animation_release().getFade() != null || exit.getData$animation_release().getFade() != null) {
                mutableState2.setValue(Boolean.TRUE);
            }
            if (enter.getData$animation_release().getScale() != null || exit.getData$animation_release().getScale() != null) {
                mutableState3.setValue(Boolean.TRUE);
            }
        } else {
            Boolean bool = Boolean.FALSE;
            mutableState2.setValue(bool);
            mutableState3.setValue(bool);
        }
        composer.startReplaceableGroup(1657241561);
        float scale2 = 1.0f;
        if (((Boolean) mutableState2.getValue()).booleanValue()) {
            e eVar = new e(enter, exit);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = label + " alpha";
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            String str = (String) objRememberedValue3;
            int i13 = i12 | BluetoothState.REQUEST_CONNECT_DEVICE;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i14 = i13 & 14;
            int i15 = i13 << 3;
            int i16 = (i15 & 7168) | i14 | (i15 & 896) | (i15 & 57344);
            composer.startReplaceableGroup(-142660079);
            int i17 = (i16 >> 9) & 112;
            EnterExitState currentState = transition.getCurrentState();
            composer.startReplaceableGroup(755689166);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755689166, i17, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:870)");
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i18 = iArr[currentState.ordinal()];
            if (i18 == 1) {
                alpha = 1.0f;
            } else if (i18 == 2) {
                Fade fade = enter.getData$animation_release().getFade();
                if (fade != null) {
                    alpha = fade.getAlpha();
                } else {
                    alpha = 1.0f;
                }
            } else {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Fade fade2 = exit.getData$animation_release().getFade();
                if (fade2 != null) {
                    alpha = fade2.getAlpha();
                } else {
                    alpha = 1.0f;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            Float fValueOf = Float.valueOf(alpha);
            EnterExitState targetState = transition.getTargetState();
            composer.startReplaceableGroup(755689166);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755689166, i17, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:870)");
            }
            int i19 = iArr[targetState.ordinal()];
            if (i19 != 1) {
                if (i19 != 2) {
                    c10 = 3;
                    if (i19 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Fade fade3 = exit.getData$animation_release().getFade();
                    if (fade3 != null) {
                        alpha2 = fade3.getAlpha();
                    }
                } else {
                    c10 = 3;
                    Fade fade4 = enter.getData$animation_release().getFade();
                    if (fade4 != null) {
                        alpha2 = fade4.getAlpha();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                mutableState = mutableState3;
                i11 = -492369756;
                stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(alpha2), eVar.invoke(transition.getSegment(), composer, Integer.valueOf((i16 >> 3) & 112)), vectorConverter, str, composer, (i16 & 14) | ((i16 << 9) & 57344) | ((i16 << 6) & 458752));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                c10 = 3;
            }
            alpha2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            mutableState = mutableState3;
            i11 = -492369756;
            stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(alpha2), eVar.invoke(transition.getSegment(), composer, Integer.valueOf((i16 >> 3) & 112)), vectorConverter, str, composer, (i16 & 14) | ((i16 << 9) & 57344) | ((i16 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        } else {
            mutableState = mutableState3;
            i11 = -492369756;
            stateCreateTransitionAnimation = f2738b;
        }
        State state = stateCreateTransitionAnimation;
        composer.endReplaceableGroup();
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            composer.startReplaceableGroup(1657242461);
            f fVar = new f(enter, exit);
            composer.startReplaceableGroup(i11);
            Object objRememberedValue4 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = label + " scale";
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            String str2 = (String) objRememberedValue4;
            int i20 = i12 | BluetoothState.REQUEST_CONNECT_DEVICE;
            composer.startReplaceableGroup(-1338768149);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            int i21 = i20 & 14;
            int i22 = i20 << 3;
            int i23 = (i22 & 57344) | i21 | (i22 & 896) | (i22 & 7168);
            composer.startReplaceableGroup(-142660079);
            int i24 = (i23 >> 9) & 112;
            EnterExitState currentState2 = transition.getCurrentState();
            composer.startReplaceableGroup(-596129937);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596129937, i24, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:893)");
            }
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            int i25 = iArr2[currentState2.ordinal()];
            if (i25 == 1) {
                scale = 1.0f;
            } else if (i25 == 2) {
                Scale scale3 = enter.getData$animation_release().getScale();
                if (scale3 != null) {
                    scale = scale3.getScale();
                } else {
                    scale = 1.0f;
                }
            } else {
                if (i25 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scale4 = exit.getData$animation_release().getScale();
                if (scale4 != null) {
                    scale = scale4.getScale();
                } else {
                    scale = 1.0f;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            Float fValueOf2 = Float.valueOf(scale);
            EnterExitState targetState2 = transition.getTargetState();
            composer.startReplaceableGroup(-596129937);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596129937, i24, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:893)");
            }
            int i26 = iArr2[targetState2.ordinal()];
            if (i26 != 1) {
                if (i26 == 2) {
                    Scale scale5 = enter.getData$animation_release().getScale();
                    if (scale5 != null) {
                        scale2 = scale5.getScale();
                    }
                } else {
                    if (i26 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scale6 = exit.getData$animation_release().getScale();
                    if (scale6 != null) {
                        scale2 = scale6.getScale();
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            State stateCreateTransitionAnimation2 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf2, Float.valueOf(scale2), fVar.invoke(transition.getSegment(), composer, Integer.valueOf((i23 >> 3) & 112)), vectorConverter2, str2, composer, (i23 & 14) | ((i23 << 9) & 57344) | ((i23 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (transition.getCurrentState() == EnterExitState.PreEnter) {
                Scale scale7 = enter.getData$animation_release().getScale();
                if (scale7 == null && (scale7 = exit.getData$animation_release().getScale()) == null) {
                    transformOriginM2832boximpl = null;
                } else {
                    transformOriginM2832boximpl = TransformOrigin.m2832boximpl(scale7.m55getTransformOriginSzJe1aQ());
                }
            } else {
                Scale scale8 = exit.getData$animation_release().getScale();
                if (scale8 == null && (scale8 = enter.getData$animation_release().getScale()) == null) {
                    transformOriginM2832boximpl = null;
                } else {
                    transformOriginM2832boximpl = TransformOrigin.m2832boximpl(scale8.m55getTransformOriginSzJe1aQ());
                }
            }
            TwoWayConverter<TransformOrigin, AnimationVector2D> twoWayConverter = f2737a;
            int i27 = i12 | 3136;
            composer.startReplaceableGroup(-142660079);
            EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1 = new Function3<Transition.Segment<EnterExitState>, Composer, Integer, SpringSpec<TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1
                @Composable
                @NotNull
                public final SpringSpec<TransformOrigin> invoke(@NotNull Transition.Segment<EnterExitState> segment, @Nullable Composer composer2, int i28) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer2.startReplaceableGroup(-895531546);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-895531546, i28, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:852)");
                    }
                    SpringSpec<TransformOrigin> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<TransformOrigin> invoke(Transition.Segment<EnterExitState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }
            };
            int i28 = (i27 >> 9) & 112;
            EnterExitState currentState3 = transition.getCurrentState();
            composer.startReplaceableGroup(-288165413);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288165413, i28, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:911)");
            }
            int i29 = iArr2[currentState3.ordinal()];
            if (i29 == 1) {
                transformOriginM2832boximpl2 = transformOriginM2832boximpl;
            } else if (i29 == 2) {
                Scale scale9 = enter.getData$animation_release().getScale();
                if (scale9 == null && (scale9 = exit.getData$animation_release().getScale()) == null) {
                    transformOriginM2832boximpl2 = null;
                } else {
                    transformOriginM2832boximpl2 = TransformOrigin.m2832boximpl(scale9.m55getTransformOriginSzJe1aQ());
                }
            } else {
                if (i29 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scale10 = exit.getData$animation_release().getScale();
                if (scale10 == null && (scale10 = enter.getData$animation_release().getScale()) == null) {
                    transformOriginM2832boximpl2 = null;
                } else {
                    transformOriginM2832boximpl2 = TransformOrigin.m2832boximpl(scale10.m55getTransformOriginSzJe1aQ());
                }
            }
            long f15746a = transformOriginM2832boximpl2 != null ? transformOriginM2832boximpl2.getF15746a() : TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            TransformOrigin transformOriginM2832boximpl4 = TransformOrigin.m2832boximpl(f15746a);
            EnterExitState targetState3 = transition.getTargetState();
            composer.startReplaceableGroup(-288165413);
            TransformOrigin transformOrigin = transformOriginM2832boximpl;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288165413, i28, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:911)");
            }
            int i30 = iArr2[targetState3.ordinal()];
            if (i30 == 1) {
                transformOriginM2832boximpl3 = transformOrigin;
            } else if (i30 == 2) {
                Scale scale11 = enter.getData$animation_release().getScale();
                if (scale11 == null && (scale11 = exit.getData$animation_release().getScale()) == null) {
                    transformOriginM2832boximpl3 = null;
                } else {
                    transformOriginM2832boximpl3 = TransformOrigin.m2832boximpl(scale11.m55getTransformOriginSzJe1aQ());
                }
            } else {
                if (i30 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scale12 = exit.getData$animation_release().getScale();
                if (scale12 == null && (scale12 = enter.getData$animation_release().getScale()) == null) {
                    transformOriginM2832boximpl3 = null;
                } else {
                    transformOriginM2832boximpl3 = TransformOrigin.m2832boximpl(scale12.m55getTransformOriginSzJe1aQ());
                }
            }
            long f15746a2 = transformOriginM2832boximpl3 != null ? transformOriginM2832boximpl3.getF15746a() : TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            State stateCreateTransitionAnimation3 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, transformOriginM2832boximpl4, TransformOrigin.m2832boximpl(f15746a2), enterExitTransitionKt$createModifier$$inlined$animateValue$1.invoke(transition.getSegment(), composer, Integer.valueOf((i27 >> 3) & 112)), twoWayConverter, "TransformOriginInterruptionHandling", composer, (i27 & 14) | ((i27 << 9) & 57344) | ((i27 << 6) & 458752));
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1618982084);
            boolean zChanged3 = composer.changed(state) | composer.changed(stateCreateTransitionAnimation2) | composer.changed(stateCreateTransitionAnimation3);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new c(state, stateCreateTransitionAnimation2, stateCreateTransitionAnimation3);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierComposed$default, (Function1) objRememberedValue5);
            composer.endReplaceableGroup();
        } else if (((Boolean) mutableState2.getValue()).booleanValue()) {
            composer.startReplaceableGroup(1657244550);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged4 = composer.changed(state);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new d(state);
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierComposed$default, (Function1) objRememberedValue6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1657244642);
            composer.endReplaceableGroup();
            modifierGraphicsLayer = modifierComposed$default;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierGraphicsLayer;
    }

    @Stable
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal expandFrom, boolean z10, @NotNull Function1<? super Integer, Integer> initialWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialWidth, "initialWidth");
        return expandIn(animationSpec, a(expandFrom), z10, new h(initialWidth));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4541boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = g.f2752p0;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z10, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment expandFrom, boolean z10, @NotNull Function1<? super IntSize, IntSize> initialSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        return new r.e(new TransitionData(null, null, new ChangeSize(expandFrom, initialSize, animationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4541boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = i.f2754p0;
        }
        return expandIn(finiteAnimationSpec, alignment, z10, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical expandFrom, boolean z10, @NotNull Function1<? super Integer, Integer> initialHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialHeight, "initialHeight");
        return expandIn(animationSpec, b(expandFrom), z10, new k(initialHeight));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4541boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = j.f2755p0;
        }
        return expandVertically(finiteAnimationSpec, vertical, z10, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec<Float> animationSpec, float f6) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new r.e(new TransitionData(new Fade(f6, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f6);
    }

    @Stable
    @NotNull
    public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec<Float> animationSpec, float f6) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new r.f(new TransitionData(new Fade(f6, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f6);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m48scaleInL8ZKhE(@NotNull FiniteAnimationSpec<Float> animationSpec, float f6, long j10) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new r.e(new TransitionData(null, null, null, new Scale(f6, j10, animationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m49scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f6, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();
        }
        return m48scaleInL8ZKhE(finiteAnimationSpec, f6, j10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m50scaleOutL8ZKhE(@NotNull FiniteAnimationSpec<Float> animationSpec, float f6, long j10) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new r.f(new TransitionData(null, null, null, new Scale(f6, j10, animationSpec, null), 7, null));
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m51scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f6, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ();
        }
        return m50scaleOutL8ZKhE(finiteAnimationSpec, f6, j10);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Horizontal shrinkTowards, boolean z10, @NotNull Function1<? super Integer, Integer> targetWidth) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetWidth, "targetWidth");
        return shrinkOut(animationSpec, a(shrinkTowards), z10, new m(targetWidth));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4541boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = l.f2757p0;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z10, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment shrinkTowards, boolean z10, @NotNull Function1<? super IntSize, IntSize> targetSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        return new r.f(new TransitionData(null, null, new ChangeSize(shrinkTowards, targetSize, animationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4541boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = n.f2759p0;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z10, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec<IntSize> animationSpec, @NotNull Alignment.Vertical shrinkTowards, boolean z10, @NotNull Function1<? super Integer, Integer> targetHeight) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        return shrinkOut(animationSpec, b(shrinkTowards), z10, new p(targetHeight));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m4541boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = o.f2760p0;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z10, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        return new r.e(new TransitionData(null, new Slide(initialOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetX, "initialOffsetX");
        return slideIn(animationSpec, new r(initialOffsetX));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = q.f2762p0;
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetY, "initialOffsetY");
        return slideIn(animationSpec, new t(initialOffsetY));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = s.f2764p0;
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super IntSize, IntOffset> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        return new r.f(new TransitionData(null, new Slide(targetOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetX, "targetOffsetX");
        return slideOut(animationSpec, new v(targetOffsetX));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = u.f2766p0;
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffsetY) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetY, "targetOffsetY");
        return slideOut(animationSpec, new x(targetOffsetY));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = w.f2768p0;
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }
}
