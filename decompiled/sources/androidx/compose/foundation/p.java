package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {ResultCode.ERROR_CONN_SSL_HANDSHAKE}, m = "invokeSuspend", n = {}, s = {})
public final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f5342p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MarqueeModifierNode f5343q0;

    /* JADX INFO: compiled from: BasicMarquee.kt */
    public static final class a extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MarqueeModifierNode f5344p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MarqueeModifierNode marqueeModifierNode) {
            super(0);
            this.f5344p0 = marqueeModifierNode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            MarqueeModifierNode marqueeModifierNode = this.f5344p0;
            if (marqueeModifierNode.L0.getIntValue() <= marqueeModifierNode.M0.getIntValue()) {
                return null;
            }
            if (MarqueeAnimationMode.m164equalsimpl0(((MarqueeAnimationMode) marqueeModifierNode.P0.getValue()).getF3415a(), MarqueeAnimationMode.INSTANCE.m171getWhileFocusedZbEOnfQ()) && !((Boolean) marqueeModifierNode.N0.getValue()).booleanValue()) {
                return null;
            }
            return Float.valueOf(marqueeModifierNode.b() + marqueeModifierNode.L0.getIntValue());
        }
    }

    /* JADX INFO: compiled from: BasicMarquee.kt */
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {365, 367, 369, 369}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AnimationSpec f5345p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f5346q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f5347r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MarqueeModifierNode f5348s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MarqueeModifierNode marqueeModifierNode, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5348s0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f5348s0, continuation);
            bVar.f5347r0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Float f6, Continuation<? super Unit> continuation) {
            return ((b) create(f6, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0099 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AnimationSpec animationSpecM124access$createMarqueeAnimationSpecZ4HSEVQ;
            Float f6;
            Animatable<Float, AnimationVector1D> animatable;
            Float fBoxFloat;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f5346q0;
            MarqueeModifierNode marqueeModifierNode = this.f5348s0;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        AnimationSpec animationSpec = this.f5345p0;
                        f6 = (Float) this.f5347r0;
                        ResultKt.throwOnFailure(obj);
                        animationSpecM124access$createMarqueeAnimationSpecZ4HSEVQ = animationSpec;
                    } else if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        animatable = marqueeModifierNode.Q0;
                        fBoxFloat = Boxing.boxFloat(0.0f);
                        this.f5346q0 = 3;
                        if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) this.f5347r0;
                            ResultKt.throwOnFailure(obj);
                            throw th2;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                Float f10 = (Float) this.f5347r0;
                if (f10 == null) {
                    return Unit.INSTANCE;
                }
                animationSpecM124access$createMarqueeAnimationSpecZ4HSEVQ = BasicMarqueeKt.m124access$createMarqueeAnimationSpecZ4HSEVQ(marqueeModifierNode.H0, f10.floatValue(), marqueeModifierNode.J0, marqueeModifierNode.I0, marqueeModifierNode.K0, DelegatableNodeKt.requireDensity(marqueeModifierNode));
                Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                this.f5347r0 = f10;
                this.f5345p0 = animationSpecM124access$createMarqueeAnimationSpecZ4HSEVQ;
                this.f5346q0 = 1;
                if (marqueeModifierNode.Q0.snapTo(fBoxFloat2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                f6 = f10;
                Animatable<Float, AnimationVector1D> animatable2 = marqueeModifierNode.Q0;
                this.f5347r0 = null;
                this.f5345p0 = null;
                this.f5346q0 = 2;
                if (Animatable.animateTo$default(animatable2, f6, animationSpecM124access$createMarqueeAnimationSpecZ4HSEVQ, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animatable = marqueeModifierNode.Q0;
                fBoxFloat = Boxing.boxFloat(0.0f);
                this.f5346q0 = 3;
                if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                Animatable<Float, AnimationVector1D> animatable3 = marqueeModifierNode.Q0;
                Float fBoxFloat3 = Boxing.boxFloat(0.0f);
                this.f5347r0 = th3;
                this.f5345p0 = null;
                this.f5346q0 = 4;
                if (animatable3.snapTo(fBoxFloat3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MarqueeModifierNode marqueeModifierNode, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f5343q0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new p(this.f5343q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f5342p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MarqueeModifierNode marqueeModifierNode = this.f5343q0;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new a(marqueeModifierNode));
            b bVar = new b(marqueeModifierNode, null);
            this.f5342p0 = 1;
            if (FlowKt.collectLatest(flowSnapshotFlow, bVar, this) == coroutine_suspended) {
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
