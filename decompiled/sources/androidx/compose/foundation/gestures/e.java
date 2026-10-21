package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$block$1$1", f = "Transformable.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class e extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f4037p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f4038q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ State<Boolean> f4039r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Channel<TransformEvent> f4040s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ State<Function0<Boolean>> f4041t0;

    /* JADX INFO: compiled from: Transformable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$block$1$1$1", f = "Transformable.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f4042p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f4043q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f4044r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f4045s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Channel<TransformEvent> f4046t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ State<Function0<Boolean>> f4047u0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Transformable.kt */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$block$1$1$1$1", f = "Transformable.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0025a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f4048p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f4049q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ State<Boolean> f4050r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Channel<TransformEvent> f4051s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ State<Function0<Boolean>> f4052t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f4053u0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0025a(State<Boolean> state, Channel<TransformEvent> channel, State<? extends Function0<Boolean>> state2, CoroutineScope coroutineScope, Continuation<? super C0025a> continuation) {
                super(2, continuation);
                this.f4050r0 = state;
                this.f4051s0 = channel;
                this.f4052t0 = state2;
                this.f4053u0 = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0025a c0025a = new C0025a(this.f4050r0, this.f4051s0, this.f4052t0, this.f4053u0, continuation);
                c0025a.f4049q0 = obj;
                return c0025a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C0025a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f4048p0;
                Channel<TransformEvent> channel = this.f4051s0;
                try {
                    try {
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f4049q0;
                            State<Boolean> state = this.f4050r0;
                            State<Function0<Boolean>> state2 = this.f4052t0;
                            this.f4048p0 = 1;
                            if (TransformableKt.access$detectZoom(awaitPointerEventScope, state, channel, state2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                    } catch (CancellationException e5) {
                        if (!CoroutineScopeKt.isActive(this.f4053u0)) {
                            throw e5;
                        }
                    }
                    channel.mo5953trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    channel.mo5953trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PointerInputScope pointerInputScope, State<Boolean> state, Channel<TransformEvent> channel, State<? extends Function0<Boolean>> state2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4044r0 = pointerInputScope;
            this.f4045s0 = state;
            this.f4046t0 = channel;
            this.f4047u0 = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f4044r0, this.f4045s0, this.f4046t0, this.f4047u0, continuation);
            aVar.f4043q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f4042p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0025a c0025a = new C0025a(this.f4045s0, this.f4046t0, this.f4047u0, (CoroutineScope) this.f4043q0, null);
                this.f4042p0 = 1;
                if (ForEachGestureKt.awaitEachGesture(this.f4044r0, c0025a, this) == coroutine_suspended) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public e(State<Boolean> state, Channel<TransformEvent> channel, State<? extends Function0<Boolean>> state2, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f4039r0 = state;
        this.f4040s0 = channel;
        this.f4041t0 = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        e eVar = new e(this.f4039r0, this.f4040s0, this.f4041t0, continuation);
        eVar.f4038q0 = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((e) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f4037p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = new a((PointerInputScope) this.f4038q0, this.f4039r0, this.f4040s0, this.f4041t0, null);
            this.f4037p0 = 1;
            if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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
