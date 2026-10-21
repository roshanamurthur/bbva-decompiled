package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {TypedValues.MotionType.TYPE_PATHMOTION_ARC}, m = "invokeSuspend", n = {}, s = {})
public final class u2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f9045p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f9046q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Map<Float, Object> f9047r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ResistanceConfig f9048s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Density f9049t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function2<Object, Object, ThresholdConfig> f9050u0;
    public final /* synthetic */ float v0;

    /* JADX INFO: compiled from: Swipeable.kt */
    @SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1#2:891\n*E\n"})
    public static final class a extends Lambda implements Function2<Float, Float, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map<Float, Object> f9051p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Object, Object, ThresholdConfig> f9052q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Density f9053r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<Float, Object> map, Function2<Object, Object, ? extends ThresholdConfig> function2, Density density) {
            super(2);
            this.f9051p0 = map;
            this.f9052q0 = function2;
            this.f9053r0 = density;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Float f6, Float f10) {
            float fFloatValue = f6.floatValue();
            float fFloatValue2 = f10.floatValue();
            Float fValueOf = Float.valueOf(fFloatValue);
            Map<Float, Object> map = this.f9051p0;
            return Float.valueOf(this.f9052q0.invoke(bk.q.getValue(map, fValueOf), bk.q.getValue(map, Float.valueOf(fFloatValue2))).computeThreshold(this.f9053r0, fFloatValue, fFloatValue2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u2(SwipeableState<Object> swipeableState, Map<Float, Object> map, ResistanceConfig resistanceConfig, Density density, Function2<Object, Object, ? extends ThresholdConfig> function2, float f6, Continuation<? super u2> continuation) {
        super(2, continuation);
        this.f9046q0 = swipeableState;
        this.f9047r0 = map;
        this.f9048s0 = resistanceConfig;
        this.f9049t0 = density;
        this.f9050u0 = function2;
        this.v0 = f6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new u2(this.f9046q0, this.f9047r0, this.f9048s0, this.f9049t0, this.f9050u0, this.v0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((u2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f9045p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            SwipeableState<Object> swipeableState = this.f9046q0;
            Map<Float, ? extends Object> anchors$material_release = swipeableState.getAnchors$material_release();
            Map<Float, ? extends Object> map = this.f9047r0;
            swipeableState.setAnchors$material_release(map);
            swipeableState.setResistance$material_release(this.f9048s0);
            Function2<Object, Object, ThresholdConfig> function2 = this.f9050u0;
            Density density = this.f9049t0;
            swipeableState.setThresholds$material_release(new a(map, function2, density));
            swipeableState.setVelocityThreshold$material_release(density.mo415toPx0680j_4(this.v0));
            this.f9045p0 = 1;
            if (swipeableState.processNewAnchors$material_release(anchors$material_release, map, this) == coroutine_suspended) {
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
