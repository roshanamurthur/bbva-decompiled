package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.image.transform.MonochromeImageTransformer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aH\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0001\u001a}\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e28\u0010\u0017\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0010H\u0001ø\u0001\u0000\u001a\\\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u00002\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b2#\b\u0002\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00060\u001dH\u0001¢\u0006\u0004\b \u0010!\u001aC\u0010)\u001a(\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00160\u0010¢\u0006\u0002\b&2\u0006\u0010#\u001a\u00020\"H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a6\u0010+\u001a(\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00160\u0010¢\u0006\u0002\b&2\u0006\u0010*\u001a\u00020\u0016H\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/SwipeableV2State;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "swipeableV2", "", "possibleValues", "Landroidx/compose/material3/AnchorChangeHandler;", "anchorChangeHandler", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Landroidx/compose/ui/unit/IntSize;", "layoutSize", "", "calculateAnchor", "swipeAnchors", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function1;", "newValue", "confirmValueChange", "rememberSwipeableV2State", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeableV2State;", "Landroidx/compose/ui/unit/Dp;", MonochromeImageTransformer.THRESHOLD, "Landroidx/compose/ui/unit/Density;", "distance", "Lkotlin/ExtensionFunctionType;", "fixedPositionalThreshold-0680j_4", "(F)Lkotlin/jvm/functions/Function2;", "fixedPositionalThreshold", "fraction", "fractionalPositionalThreshold", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,692:1\n135#2:693\n1#3:694\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt\n*L\n136#1:693\n*E\n"})
public final class SwipeableV2Kt {

    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class a extends Lambda implements Function2<Density, Float, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11813p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6) {
            super(2);
            this.f11813p0 = f6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Density density, Float f6) {
            Density density2 = density;
            f6.floatValue();
            Intrinsics.checkNotNullParameter(density2, "$this$null");
            return Float.valueOf(density2.mo415toPx0680j_4(this.f11813p0));
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class b extends Lambda implements Function2<Density, Float, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f11814p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6) {
            super(2);
            this.f11814p0 = f6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Density density, Float f6) {
            float fFloatValue = f6.floatValue();
            Intrinsics.checkNotNullParameter(density, "$this$null");
            return Float.valueOf(fFloatValue * this.f11814p0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class c<T> extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f11815p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class d<T> extends Lambda implements Function0<SwipeableV2State<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T f11816p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AnimationSpec<Float> f11817q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Boolean> f11818r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(T t10, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
            super(0);
            this.f11816p0 = t10;
            this.f11817q0 = animationSpec;
            this.f11818r0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            T t10 = this.f11816p0;
            AnimationSpec<Float> animationSpec = this.f11817q0;
            Function1<T, Boolean> function1 = this.f11818r0;
            SwipeableV2Defaults swipeableV2Defaults = SwipeableV2Defaults.INSTANCE;
            return new SwipeableV2State(t10, animationSpec, function1, swipeableV2Defaults.getPositionalThreshold(), swipeableV2Defaults.m1339getVelocityThresholdD9Ej5fM(), null);
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    public static final class e extends Lambda implements Function1<Density, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SwipeableV2State<T> f11819p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SwipeableV2State<T> swipeableV2State) {
            super(1);
            this.f11819p0 = swipeableV2State;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Density density) {
            Density it = density;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f11819p0.setDensity$material3_release(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    @SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt$swipeAnchors$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,692:1\n1855#2,2:693\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt$swipeAnchors$2\n*L\n118#1:693,2\n*E\n"})
    public static final class f extends Lambda implements Function1<IntSize, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SwipeableV2State<T> f11820p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Set<T> f11821q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AnchorChangeHandler<T> f11822r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<T, IntSize, Float> f11823s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(SwipeableV2State<T> swipeableV2State, Set<? extends T> set, AnchorChangeHandler<T> anchorChangeHandler, Function2<? super T, ? super IntSize, Float> function2) {
            super(1);
            this.f11820p0 = swipeableV2State;
            this.f11821q0 = set;
            this.f11822r0 = anchorChangeHandler;
            this.f11823s0 = function2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntSize intSize) {
            AnchorChangeHandler<T> anchorChangeHandler;
            long f18319a = intSize.getF18319a();
            SwipeableV2State<T> swipeableV2State = this.f11820p0;
            Map anchors$material3_release = swipeableV2State.getAnchors$material3_release();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : this.f11821q0) {
                Float fInvoke = this.f11823s0.invoke((T) obj, IntSize.m4541boximpl(f18319a));
                if (fInvoke != null) {
                    linkedHashMap.put(obj, fInvoke);
                }
            }
            if (!Intrinsics.areEqual(anchors$material3_release, linkedHashMap)) {
                Object targetValue = swipeableV2State.getTargetValue();
                if (swipeableV2State.updateAnchors$material3_release(linkedHashMap) && (anchorChangeHandler = this.f11822r0) != 0) {
                    anchorChangeHandler.onAnchorsChanged((T) targetValue, (Map<T, Float>) anchors$material3_release, linkedHashMap);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SwipeableV2.kt */
    @DebugMetadata(c = "androidx.compose.material3.SwipeableV2Kt$swipeableV2$1", f = "SwipeableV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ CoroutineScope f11824p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ float f11825q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SwipeableV2State<T> f11826r0;

        /* JADX INFO: compiled from: SwipeableV2.kt */
        @DebugMetadata(c = "androidx.compose.material3.SwipeableV2Kt$swipeableV2$1$1", f = "SwipeableV2.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f11827p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SwipeableV2State<T> f11828q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ float f11829r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SwipeableV2State<T> swipeableV2State, float f6, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f11828q0 = swipeableV2State;
                this.f11829r0 = f6;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f11828q0, this.f11829r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f11827p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f11827p0 = 1;
                    if (this.f11828q0.settle(this.f11829r0, this) == coroutine_suspended) {
                        return coroutine_suspended;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SwipeableV2State<T> swipeableV2State, Continuation<? super g> continuation) {
            super(3, continuation);
            this.f11826r0 = swipeableV2State;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, Float f6, Continuation<? super Unit> continuation) {
            float fFloatValue = f6.floatValue();
            g gVar = new g(this.f11826r0, continuation);
            gVar.f11824p0 = coroutineScope;
            gVar.f11825q0 = fFloatValue;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.f11824p0, null, null, new a(this.f11826r0, this.f11825q0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final <T> T a(Map<T, Float> map, float f6, boolean z10) {
        if (!(!map.isEmpty())) {
            throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
        }
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (it.hasNext()) {
            float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
            float f10 = z10 ? fFloatValue - f6 : f6 - fFloatValue;
            if (f10 < 0.0f) {
                f10 = Float.POSITIVE_INFINITY;
            }
            do {
                T next2 = it.next();
                float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                float f11 = z10 ? fFloatValue2 - f6 : f6 - fFloatValue2;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                if (Float.compare(f10, f11) > 0) {
                    next = next2;
                    f10 = f11;
                }
            } while (it.hasNext());
        }
        return (T) ((Map.Entry) next).getKey();
    }

    public static final Float access$maxOrNull(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float access$minOrNull(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* JADX INFO: renamed from: fixedPositionalThreshold-0680j_4, reason: not valid java name */
    public static final Function2<Density, Float, Float> m1340fixedPositionalThreshold0680j_4(float f6) {
        return new a(f6);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final Function2<Density, Float, Float> fractionalPositionalThreshold(float f6) {
        return new b(f6);
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final <T> SwipeableV2State<T> rememberSwipeableV2State(@NotNull T initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super T, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(856267266);
        if ((i11 & 2) != 0) {
            animationSpec = SwipeableV2Defaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 4) != 0) {
            function1 = c.f11815p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(856267266, i10, -1, "androidx.compose.material3.rememberSwipeableV2State (SwipeableV2.kt:517)");
        }
        SwipeableV2State.Companion companion = SwipeableV2State.INSTANCE;
        SwipeableV2Defaults swipeableV2Defaults = SwipeableV2Defaults.INSTANCE;
        SwipeableV2State<T> swipeableV2State = (SwipeableV2State) RememberSaveableKt.m2165rememberSaveable(new Object[]{initialValue, animationSpec, function1}, (Saver) companion.m1342SavereqLRuRQ(animationSpec, function1, swipeableV2Defaults.getPositionalThreshold(), swipeableV2Defaults.m1339getVelocityThresholdD9Ej5fM()), (String) null, (Function0) new d(initialValue, animationSpec, function1), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableV2State;
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final <T> Modifier swipeAnchors(@NotNull Modifier modifier, @NotNull final SwipeableV2State<T> state, @NotNull final Set<? extends T> possibleValues, @Nullable final AnchorChangeHandler<T> anchorChangeHandler, @NotNull final Function2<? super T, ? super IntSize, Float> calculateAnchor) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(possibleValues, "possibleValues");
        Intrinsics.checkNotNullParameter(calculateAnchor, "calculateAnchor");
        return modifier.then(new l0.d4(new e(state), new f(state, possibleValues, anchorChangeHandler, calculateAnchor), InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "swipeAnchors").set("state", state);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("possibleValues", possibleValues);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("anchorChangeHandler", anchorChangeHandler);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("calculateAnchor", calculateAnchor);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier swipeAnchors$default(Modifier modifier, SwipeableV2State swipeableV2State, Set set, AnchorChangeHandler anchorChangeHandler, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            anchorChangeHandler = null;
        }
        return swipeAnchors(modifier, swipeableV2State, set, anchorChangeHandler, function2);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final <T> Modifier swipeableV2(@NotNull Modifier modifier, @NotNull SwipeableV2State<T> state, @NotNull Orientation orientation, boolean z10, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return DraggableKt.draggable(modifier, state.getSwipeDraggableState$material3_release(), orientation, (32 & 4) != 0 ? true : z10, (32 & 8) != 0 ? null : mutableInteractionSource, (32 & 16) != 0 ? false : state.isAnimationRunning(), (32 & 32) != 0 ? new DraggableKt.a(3, null) : null, (32 & 64) != 0 ? new DraggableKt.b(3, null) : new g(state, null), (32 & 128) != 0 ? false : z11);
    }

    public static /* synthetic */ Modifier swipeableV2$default(Modifier modifier, SwipeableV2State swipeableV2State, Orientation orientation, boolean z10, boolean z11, MutableInteractionSource mutableInteractionSource, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return swipeableV2(modifier, swipeableV2State, orientation, z12, z13, mutableInteractionSource);
    }
}
