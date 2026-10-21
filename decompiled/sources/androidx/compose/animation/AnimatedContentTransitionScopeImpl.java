package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002T!B'\b\u0000\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0006\u0010-\u001a\u00020&\u0012\u0006\u00105\u001a\u00020.¢\u0006\u0004\bR\u0010SJ\u0017\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0004JN\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014JN\u0010\u001a\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R4\u0010>\u001a\u0002062\u0006\u00107\u001a\u0002068@@@X\u0080\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R/\u0010E\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002060@0?8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR-\u0010L\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010@8\u0000@\u0000X\u0080\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010N\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006W²\u0006\u0014\u0010V\u001a\u00020U\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "using", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "towards", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "initialOffset", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainer", "targetOffset", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainer", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "Landroidx/compose/animation/core/Transition;", "a", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", ConstantsKt.TRANSITION_EXTRA_ID, "Landroidx/compose/ui/Alignment;", "b", "Landroidx/compose/ui/Alignment;", "getContentAlignment$animation_release", "()Landroidx/compose/ui/Alignment;", "setContentAlignment$animation_release", "(Landroidx/compose/ui/Alignment;)V", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "c", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "", "Landroidx/compose/runtime/State;", "e", "Ljava/util/Map;", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "targetSizeMap", "f", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "animatedSize", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "ChildData", "", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,862:1\n81#2:863\n107#2,2:864\n81#2:880\n107#2,2:881\n36#3:866\n36#3:873\n1097#4,6:867\n1097#4,6:874\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n544#1:863\n544#1:864,2\n558#1:880\n558#1:881,2\n558#1:866\n570#1:873\n558#1:867,6\n570#1:874,6\n*E\n"})
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Transition<S> transition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Alignment contentAlignment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState measuredSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f2582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public State<IntSize> animatedSize;

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "", "component1", "isTarget", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "setTarget", "(Z)V", "<init>", "animation_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ChildData implements ParentDataModifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean isTarget;

        public ChildData(boolean z10) {
            this.isTarget = z10;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = childData.isTarget;
            }
            return childData.copy(z10);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean all(Function1 function1) {
            return u0.f.a(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean any(Function1 function1) {
            return u0.f.b(this, function1);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsTarget() {
            return this.isTarget;
        }

        @NotNull
        public final ChildData copy(boolean isTarget) {
            return new ChildData(isTarget);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChildData) && this.isTarget == ((ChildData) other).isTarget;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
            return u0.f.c(this, obj, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
            return u0.f.d(this, obj, function2);
        }

        public int hashCode() {
            boolean z10 = this.isTarget;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        @NotNull
        public Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return this;
        }

        public final void setTarget(boolean z10) {
            this.isTarget = z10;
        }

        @Override // androidx.compose.ui.Modifier
        public final /* synthetic */ Modifier then(Modifier modifier) {
            return u0.e.a(this, modifier);
        }

        @NotNull
        public String toString() {
            return bc.org.bouncycastle.math.ec.custom.sec.a.d(new StringBuilder("ChildData(isTarget="), this.isTarget, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public final class a extends LayoutModifierWithPassThroughIntrinsics {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> f2585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final State<SizeTransform> f2586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2587c;

        /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnimatedContent.kt */
        public static final class C0006a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Placeable f2588p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ long f2589q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0006a(Placeable placeable, long j10) {
                super(1);
                this.f2588p0 = placeable;
                this.f2589q0 = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.m3611place70tqf50$default(layout, this.f2588p0, this.f2589q0, 0.0f, 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: AnimatedContent.kt */
        public static final class b extends Lambda implements Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2590p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ AnimatedContentTransitionScopeImpl<S>.a f2591q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, AnimatedContentTransitionScopeImpl<S>.a aVar) {
                super(1);
                this.f2590p0 = animatedContentTransitionScopeImpl;
                this.f2591q0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final FiniteAnimationSpec<IntSize> invoke(Object obj) {
                FiniteAnimationSpec<IntSize> finiteAnimationSpecMo64createAnimationSpecTemP2vQ;
                Transition.Segment animate = (Transition.Segment) obj;
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2590p0;
                State<IntSize> state = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(animate.getInitialState());
                long f18319a = state != null ? state.getValue().getF18319a() : IntSize.INSTANCE.m4554getZeroYbymL2g();
                State<IntSize> state2 = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(animate.getTargetState());
                long f18319a2 = state2 != null ? state2.getValue().getF18319a() : IntSize.INSTANCE.m4554getZeroYbymL2g();
                SizeTransform value = this.f2591q0.f2586b.getValue();
                return (value == null || (finiteAnimationSpecMo64createAnimationSpecTemP2vQ = value.mo64createAnimationSpecTemP2vQ(f18319a, f18319a2)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : finiteAnimationSpecMo64createAnimationSpecTemP2vQ;
            }
        }

        /* JADX INFO: compiled from: AnimatedContent.kt */
        public static final class c extends Lambda implements Function1<S, IntSize> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2592p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
                super(1);
                this.f2592p0 = animatedContentTransitionScopeImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public final IntSize invoke(Object obj) {
                State<IntSize> state = this.f2592p0.getTargetSizeMap$animation_release().get(obj);
                return IntSize.m4541boximpl(state != null ? state.getValue().getF18319a() : IntSize.INSTANCE.m4554getZeroYbymL2g());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, @NotNull Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, State<? extends SizeTransform> sizeTransform) {
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.f2587c = animatedContentTransitionScopeImpl;
            this.f2585a = sizeAnimation;
            this.f2586b = sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public final MeasureResult mo47measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2587c;
            State<IntSize> stateAnimate = this.f2585a.animate(new b(animatedContentTransitionScopeImpl, this), new c(animatedContentTransitionScopeImpl));
            animatedContentTransitionScopeImpl.setAnimatedSize$animation_release(stateAnimate);
            return MeasureScope.CC.q(measure, IntSize.m4549getWidthimpl(stateAnimate.getValue().getF18319a()), IntSize.m4548getHeightimpl(stateAnimate.getValue().getF18319a()), null, new C0006a(placeableMo3575measureBRTryo0, animatedContentTransitionScopeImpl.getContentAlignment().mo2184alignKFBX0sM(IntSizeKt.IntSize(placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight()), stateAnimate.getValue().getF18319a(), LayoutDirection.Ltr)), 4, null);
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class b extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2593p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2594q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, Function1 function1) {
            super(1);
            this.f2593p0 = function1;
            this.f2594q0 = animatedContentTransitionScopeImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2594q0;
            return this.f2593p0.invoke(Integer.valueOf(IntSize.m4549getWidthimpl(AnimatedContentTransitionScopeImpl.m44access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl)) - IntOffset.m4507getXimpl(AnimatedContentTransitionScopeImpl.m43access$calculateOffsetemnUabE(animatedContentTransitionScopeImpl, IntSizeKt.IntSize(iIntValue, iIntValue), AnimatedContentTransitionScopeImpl.m44access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl)))));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class c extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2595p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2596q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, Function1 function1) {
            super(1);
            this.f2595p0 = function1;
            this.f2596q0 = animatedContentTransitionScopeImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            long jIntSize = IntSizeKt.IntSize(iIntValue, iIntValue);
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2596q0;
            return this.f2595p0.invoke(Integer.valueOf((-IntOffset.m4507getXimpl(AnimatedContentTransitionScopeImpl.m43access$calculateOffsetemnUabE(animatedContentTransitionScopeImpl, jIntSize, AnimatedContentTransitionScopeImpl.m44access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl)))) - iIntValue));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class d extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2597p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2598q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, Function1 function1) {
            super(1);
            this.f2597p0 = function1;
            this.f2598q0 = animatedContentTransitionScopeImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2598q0;
            return this.f2597p0.invoke(Integer.valueOf(IntSize.m4548getHeightimpl(AnimatedContentTransitionScopeImpl.m44access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl)) - IntOffset.m4508getYimpl(AnimatedContentTransitionScopeImpl.m43access$calculateOffsetemnUabE(animatedContentTransitionScopeImpl, IntSizeKt.IntSize(iIntValue, iIntValue), AnimatedContentTransitionScopeImpl.m44access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl)))));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class e extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2599p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2600q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, Function1 function1) {
            super(1);
            this.f2599p0 = function1;
            this.f2600q0 = animatedContentTransitionScopeImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            long jIntSize = IntSizeKt.IntSize(iIntValue, iIntValue);
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2600q0;
            return this.f2599p0.invoke(Integer.valueOf((-IntOffset.m4508getYimpl(AnimatedContentTransitionScopeImpl.m43access$calculateOffsetemnUabE(animatedContentTransitionScopeImpl, jIntSize, AnimatedContentTransitionScopeImpl.m44access$getCurrentSizeYbymL2g(animatedContentTransitionScopeImpl)))) - iIntValue));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class f extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2601p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2602q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2601p0 = animatedContentTransitionScopeImpl;
            this.f2602q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2601p0;
            State<IntSize> state = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(animatedContentTransitionScopeImpl.getTransition$animation_release().getTargetState());
            return this.f2602q0.invoke(Integer.valueOf((-IntOffset.m4507getXimpl(AnimatedContentTransitionScopeImpl.m43access$calculateOffsetemnUabE(animatedContentTransitionScopeImpl, IntSizeKt.IntSize(iIntValue, iIntValue), state != null ? state.getValue().getF18319a() : IntSize.INSTANCE.m4554getZeroYbymL2g()))) - iIntValue));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class g extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2603p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2604q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2603p0 = animatedContentTransitionScopeImpl;
            this.f2604q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2603p0;
            State<IntSize> state = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(animatedContentTransitionScopeImpl.getTransition$animation_release().getTargetState());
            long f18319a = state != null ? state.getValue().getF18319a() : IntSize.INSTANCE.m4554getZeroYbymL2g();
            return this.f2604q0.invoke(Integer.valueOf(IntSize.m4549getWidthimpl(f18319a) + (-IntOffset.m4507getXimpl(AnimatedContentTransitionScopeImpl.m43access$calculateOffsetemnUabE(animatedContentTransitionScopeImpl, IntSizeKt.IntSize(iIntValue, iIntValue), f18319a)))));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class h extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2605p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2606q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2605p0 = animatedContentTransitionScopeImpl;
            this.f2606q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2605p0;
            State<IntSize> state = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(animatedContentTransitionScopeImpl.getTransition$animation_release().getTargetState());
            return this.f2606q0.invoke(Integer.valueOf((-IntOffset.m4508getYimpl(AnimatedContentTransitionScopeImpl.m43access$calculateOffsetemnUabE(animatedContentTransitionScopeImpl, IntSizeKt.IntSize(iIntValue, iIntValue), state != null ? state.getValue().getF18319a() : IntSize.INSTANCE.m4554getZeroYbymL2g()))) - iIntValue));
        }
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    public static final class i extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f2607p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f2608q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1<? super Integer, Integer> function1) {
            super(1);
            this.f2607p0 = animatedContentTransitionScopeImpl;
            this.f2608q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f2607p0;
            State<IntSize> state = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(animatedContentTransitionScopeImpl.getTransition$animation_release().getTargetState());
            long f18319a = state != null ? state.getValue().getF18319a() : IntSize.INSTANCE.m4554getZeroYbymL2g();
            return this.f2608q0.invoke(Integer.valueOf(IntSize.m4548getHeightimpl(f18319a) + (-IntOffset.m4508getYimpl(AnimatedContentTransitionScopeImpl.m43access$calculateOffsetemnUabE(animatedContentTransitionScopeImpl, IntSizeKt.IntSize(iIntValue, iIntValue), f18319a)))));
        }
    }

    public AnimatedContentTransitionScopeImpl(@NotNull Transition<S> transition, @NotNull Alignment contentAlignment, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        this.measuredSize = SnapshotStateKt.mutableStateOf$default(IntSize.m4541boximpl(IntSize.INSTANCE.m4554getZeroYbymL2g()), null, 2, null);
        this.f2582e = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: access$calculateOffset-emnUabE, reason: not valid java name */
    public static final long m43access$calculateOffsetemnUabE(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, long j10, long j11) {
        return animatedContentTransitionScopeImpl.contentAlignment.mo2184alignKFBX0sM(j10, j11, LayoutDirection.Ltr);
    }

    /* JADX INFO: renamed from: access$getCurrentSize-YbymL2g, reason: not valid java name */
    public static final long m44access$getCurrentSizeYbymL2g(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        State<IntSize> state = animatedContentTransitionScopeImpl.animatedSize;
        return state != null ? state.getValue().getF18319a() : animatedContentTransitionScopeImpl.m45getMeasuredSizeYbymL2g$animation_release();
    }

    public final boolean a(int i10) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        return AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(i10, companion.m39getLeftDKzdypw()) || (AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(i10, companion.m41getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) || (AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(i10, companion.m38getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl);
    }

    public final boolean b(int i10) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        return AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(i10, companion.m40getRightDKzdypw()) || (AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(i10, companion.m41getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) || (AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(i10, companion.m38getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @NotNull
    public final Modifier createSizeAnimationModifier$animation_release(@NotNull ContentTransform contentTransform, @Nullable Composer composer, int i10) {
        Modifier modifier;
        Intrinsics.checkNotNullParameter(contentTransform, "contentTransform");
        composer.startReplaceableGroup(93755870);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:554)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        Transition<S> transition = this.transition;
        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            mutableState.setValue(Boolean.FALSE);
        } else if (stateRememberUpdatedState.getValue() != null) {
            mutableState.setValue(Boolean.TRUE);
        }
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) stateRememberUpdatedState.getValue();
                objRememberedValue2 = ((sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.INSTANCE) : Modifier.INSTANCE).then(new a(this, deferredAnimationCreateDeferredAnimation, stateRememberUpdatedState));
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) objRememberedValue2;
        } else {
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    @Nullable
    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    @NotNull
    /* JADX INFO: renamed from: getContentAlignment$animation_release, reason: from getter */
    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutDirection$animation_release, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m45getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize.getValue()).getF18319a();
    }

    @NotNull
    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.f2582e;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @NotNull
    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public final /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
        return s.e.a(this, obj, obj2);
    }

    public final void setAnimatedSize$animation_release(@Nullable State<IntSize> state) {
        this.animatedSize = state;
    }

    public final void setContentAlignment$animation_release(@NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m46setMeasuredSizeozmzZPI$animation_release(long j10) {
        this.measuredSize.setValue(IntSize.m4541boximpl(j10));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    /* JADX INFO: renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo28slideIntoContainermOhB8PU(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        if (a(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new b(this, initialOffset));
        }
        if (b(towards)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new c(this, initialOffset));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        if (AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(towards, companion.m42getUpDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(animationSpec, new d(this, initialOffset));
        }
        return AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(towards, companion.m37getDownDKzdypw()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new e(this, initialOffset)) : EnterTransition.INSTANCE.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    /* JADX INFO: renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo29slideOutOfContainermOhB8PU(int towards, @NotNull FiniteAnimationSpec<IntOffset> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        if (a(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new f(this, targetOffset));
        }
        if (b(towards)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new g(this, targetOffset));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
        if (AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(towards, companion.m42getUpDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(animationSpec, new h(this, targetOffset));
        }
        return AnimatedContentTransitionScope.SlideDirection.m33equalsimpl0(towards, companion.m37getDownDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new i(this, targetOffset)) : ExitTransition.INSTANCE.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @NotNull
    public ContentTransform using(@NotNull ContentTransform contentTransform, @Nullable SizeTransform sizeTransform) {
        Intrinsics.checkNotNullParameter(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
