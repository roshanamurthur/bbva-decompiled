package m0;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,223:1\n314#2,11:224\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n50#1:224,11\n*E\n"})
public final class y<T> implements ProduceStateScope<T>, MutableState<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f83336p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<T> f83337q0;

    /* JADX INFO: compiled from: ProduceState.kt */
    @DebugMetadata(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {224}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function0 f83338p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f83339q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ y<T> f83340r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f83341s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y<T> yVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f83340r0 = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83339q0 = obj;
            this.f83341s0 |= Integer.MIN_VALUE;
            return this.f83340r0.awaitDispose(null, this);
        }
    }

    public y(@NotNull MutableState<T> mutableState, @NotNull CoroutineContext coroutineContext) {
        this.f83336p0 = coroutineContext;
        this.f83337q0 = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.runtime.ProduceStateScope
    @Nullable
    public final Object awaitDispose(@NotNull Function0<Unit> function0, @NotNull Continuation<?> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f83341s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f83341s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object obj = aVar.f83339q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f83341s0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar.f83338p0 = function0;
                aVar.f83341s0 = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(aVar), 1);
                cancellableContinuationImpl.initCancellability();
                Object result = cancellableContinuationImpl.getResult();
                if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(aVar);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = aVar.f83338p0;
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.MutableState
    public final T component1() {
        return this.f83337q0.component1();
    }

    @Override // androidx.compose.runtime.MutableState
    @NotNull
    public final Function1<T, Unit> component2() {
        return this.f83337q0.component2();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f83336p0;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public final T getValue() {
        return this.f83337q0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(T t10) {
        this.f83337q0.setValue(t10);
    }
}
