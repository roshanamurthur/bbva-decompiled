package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u00062\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a¹\u0001\u0010)\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0001*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c28\b\u0002\u0010\"\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"*\u0010/\u001a\u00020*\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmStateChange", "Landroidx/compose/material/SwipeableState;", "rememberSwipeableState", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "value", "", "onValueChange", "rememberSwipeableStateFor", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "Landroidx/compose/ui/Modifier;", "state", "", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function2;", "from", TypedValues.TransitionType.S_TO, "Landroidx/compose/material/ThresholdConfig;", "thresholds", "Landroidx/compose/material/ResistanceConfig;", "resistance", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "swipeable", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "PreUpPostDownNestedScrollConnection", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,890:1\n25#2:891\n25#2:898\n1097#3,6:892\n1097#3,6:899\n135#4:905\n766#5:906\n857#5,2:907\n766#5:909\n857#5,2:910\n288#5,2:912\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n502#1:891\n509#1:898\n502#1:892,6\n509#1:899,6\n574#1:905\n739#1:906\n739#1:907,2\n740#1:909\n740#1:910,2\n797#1:912,2\n*E\n"})
public final class SwipeableKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class a<T> extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7889p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class b<T> extends Lambda implements Function0<SwipeableState<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T f7890p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f7891q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f7892r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t10, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
            super(0);
            this.f7890p0 = t10;
            this.f7891q0 = animationSpec;
            this.f7892r0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new SwipeableState(this.f7890p0, this.f7891q0, this.f7892r0);
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    @DebugMetadata(c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1", f = "Swipeable.kt", i = {}, l = {512}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f7893p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f7894q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7895r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(T t10, SwipeableState<T> swipeableState, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f7894q0 = t10;
            this.f7895r0 = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f7894q0, this.f7895r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f7893p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(this.f7894q0, this.f7895r0.getCurrentValue())) {
                    SwipeableState<T> swipeableState = this.f7895r0;
                    T t10 = this.f7894q0;
                    this.f7893p0 = 1;
                    if (SwipeableState.animateTo$default(swipeableState, t10, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$rememberSwipeableStateFor$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,890:1\n63#2,5:891\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$rememberSwipeableStateFor$2\n*L\n520#1:891,5\n*E\n"})
    public static final class d extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T f7896p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7897q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f7898r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f7899s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(T t10, SwipeableState<T> swipeableState, Function1<? super T, Unit> function1, MutableState<Boolean> mutableState) {
            super(1);
            this.f7896p0 = t10;
            this.f7897q0 = swipeableState;
            this.f7898r0 = function1;
            this.f7899s0 = mutableState;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            SwipeableState<T> swipeableState = this.f7897q0;
            if (!Intrinsics.areEqual(this.f7896p0, swipeableState.getCurrentValue())) {
                this.f7898r0.invoke((T) swipeableState.getCurrentValue());
                MutableState<Boolean> mutableState = this.f7899s0;
                mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
            }
            return new DisposableEffectResult() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Swipeable.kt */
    public static final class e<T> extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f7900p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,890:1\n154#2:891\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$1\n*L\n570#1:891\n*E\n"})
    public static final class f extends Lambda implements Function2 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f7901p0 = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new FixedThreshold(Dp.m4389constructorimpl(56), null);
        }
    }

    /* JADX INFO: compiled from: Swipeable.kt */
    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,890:1\n76#2:891\n36#3:892\n1097#4,6:893\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3\n*L\n593#1:891\n616#1:892\n616#1:893,6\n*E\n"})
    public static final class g extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map<Float, T> f7902p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f7903q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Orientation f7904r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7905s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7906t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f7907u0;
        public final /* synthetic */ ResistanceConfig v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<T, T, ThresholdConfig> f7908w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ float f7909x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SwipeableState swipeableState, Map map, Orientation orientation, boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, Function2 function2, ResistanceConfig resistanceConfig, float f6) {
            super(3);
            this.f7902p0 = map;
            this.f7903q0 = swipeableState;
            this.f7904r0 = orientation;
            this.f7905s0 = z10;
            this.f7906t0 = mutableInteractionSource;
            this.f7907u0 = z11;
            this.v0 = resistanceConfig;
            this.f7908w0 = function2;
            this.f7909x0 = f6;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 43594985);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(43594985, iA, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
            }
            Map<Float, T> map = this.f7902p0;
            if (!(!map.isEmpty())) {
                throw new IllegalArgumentException("You must have at least one anchor.".toString());
            }
            if (CollectionsKt___CollectionsKt.distinct(map.values()).size() != map.size()) {
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
            }
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            SwipeableState<T> swipeableState = this.f7903q0;
            swipeableState.ensureInit$material_release(map);
            Map<Float, T> map2 = this.f7902p0;
            SwipeableState<T> swipeableState2 = this.f7903q0;
            EffectsKt.LaunchedEffect(map2, swipeableState2, new u2(swipeableState2, map2, this.v0, density, this.f7908w0, this.f7909x0, null), composer2, 520);
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zIsAnimationRunning = swipeableState.isAnimationRunning();
            DraggableState draggableState = swipeableState.getDraggableState();
            Orientation orientation = this.f7904r0;
            boolean z10 = this.f7905s0;
            MutableInteractionSource mutableInteractionSource = this.f7906t0;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(swipeableState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new v2(swipeableState, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierDraggable = DraggableKt.draggable(companion, draggableState, orientation, (32 & 4) != 0 ? true : z10, (32 & 8) != 0 ? null : mutableInteractionSource, (32 & 16) != 0 ? false : zIsAnimationRunning, (32 & 32) != 0 ? new DraggableKt.a(3, null) : null, (32 & 64) != 0 ? new DraggableKt.b(3, null) : (Function3) objRememberedValue, (32 & 128) != 0 ? false : this.f7907u0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierDraggable;
        }
    }

    public static final List<Float> a(float f6, Set<Float> set) {
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Number) obj).floatValue() <= ((double) f6) + 0.001d) {
                arrayList.add(obj);
            }
        }
        Float fM5653maxOrNull = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() >= ((double) f6) - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        Float fM5661minOrNull = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) arrayList2);
        if (fM5653maxOrNull == null) {
            return CollectionsKt__CollectionsKt.listOfNotNull(fM5661minOrNull);
        }
        if (fM5661minOrNull == null) {
            return bk.d.listOf(fM5653maxOrNull);
        }
        return Intrinsics.areEqual(fM5653maxOrNull, fM5661minOrNull) ? bk.d.listOf(fM5653maxOrNull) : CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{fM5653maxOrNull, fM5661minOrNull});
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    public static final float access$computeTarget(float f6, float f10, Set set, Function2 function2, float f11, float f12) {
        List<Float> listA = a(f6, set);
        int size = listA.size();
        if (size != 0) {
            if (size != 1) {
                float fFloatValue = listA.get(0).floatValue();
                float fFloatValue2 = listA.get(1).floatValue();
                if (f10 <= f6) {
                    if (f11 >= f12) {
                        return fFloatValue2;
                    }
                    if (f6 < ((Number) function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue()) {
                        f10 = fFloatValue;
                    } else {
                        f10 = fFloatValue2;
                    }
                } else {
                    if (f11 <= (-f12)) {
                        return fFloatValue;
                    }
                    if (f6 > ((Number) function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue))).floatValue()) {
                        f10 = fFloatValue2;
                    } else {
                        f10 = fFloatValue;
                    }
                }
            } else {
                f10 = listA.get(0).floatValue();
            }
        }
        return f10;
    }

    public static final Float access$getOffset(Map map, Object obj) {
        Object next;
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    @NotNull
    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(@NotNull SwipeableState<T> swipeableState) {
        Intrinsics.checkNotNullParameter(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> SwipeableState<T> rememberSwipeableState(@NotNull T initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super T, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1237755169);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = a.f7889p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1237755169, i10, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:467)");
        }
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) SwipeableState.INSTANCE.Saver(animationSpec, function1), (String) null, (Function0) new b(initialValue, animationSpec, function1), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(@NotNull T value, @NotNull Function1<? super T, Unit> onValueChange, @Nullable AnimationSpec<Float> animationSpec, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        composer.startReplaceableGroup(1156387078);
        if ((i11 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1156387078, i10, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:496)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new SwipeableState(value, animationSpec, e.f7900p0);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SwipeableState<T> swipeableState = (SwipeableState) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue2;
        int i12 = i10 & 8;
        EffectsKt.LaunchedEffect(value, mutableState.getValue(), new c(value, swipeableState, null), composer, (i10 & 14) | i12 | 512);
        EffectsKt.DisposableEffect(swipeableState.getCurrentValue(), new d(value, swipeableState, onValueChange, mutableState), composer, i12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m841swipeablepPrIpRY(@NotNull Modifier swipeable, @NotNull final SwipeableState<T> state, @NotNull final Map<Float, ? extends T> anchors, @NotNull final Orientation orientation, final boolean z10, final boolean z11, @Nullable final MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super T, ? super T, ? extends ThresholdConfig> thresholds, @Nullable final ResistanceConfig resistanceConfig, final float f6) {
        Intrinsics.checkNotNullParameter(swipeable, "$this$swipeable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        return ComposedModifierKt.composed(swipeable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "swipeable").set("state", state);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("anchors", anchors);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("orientation", orientation);
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z11, com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "enabled", inspectorInfo), "reverseDirection", inspectorInfo).set("interactionSource", mutableInteractionSource);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("thresholds", thresholds);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("resistance", resistanceConfig);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("velocityThreshold", Dp.m4387boximpl(f6));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new g(state, anchors, orientation, z10, z11, mutableInteractionSource, thresholds, resistanceConfig, f6));
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState) {
    }
}
