package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultDraggableState implements DraggableState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Unit> f3537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DefaultDraggableState$dragScope$1 f3538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f3539c;

    /* JADX INFO: compiled from: Draggable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", i = {}, l = {563}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3540p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f3542r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> f3543s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3542r0 = mutatePriority;
            this.f3543s0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DefaultDraggableState.this.new a(this.f3542r0, this.f3543s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3540p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DefaultDraggableState defaultDraggableState = DefaultDraggableState.this;
                MutatorMutex mutatorMutex = defaultDraggableState.f3539c;
                this.f3540p0 = 1;
                if (mutatorMutex.mutateWith(defaultDraggableState.f3538b, this.f3542r0, this.f3543s0, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1] */
    public DefaultDraggableState(@NotNull Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f3537a = onDelta;
        this.f3538b = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float pixels) {
                this.f3544a.f3537a.invoke(Float.valueOf(pixels));
            }
        };
        this.f3539c = new MutatorMutex();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float f6) {
        this.f3537a.invoke(Float.valueOf(f6));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public final Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(mutatePriority, function2, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
