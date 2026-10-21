package ak;

import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> f256p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Object f257q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Continuation<Object> f258r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public Object f259s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function3<? super DeepRecursiveScope<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T t10) {
        super(null);
        Intrinsics.checkNotNullParameter(block, "block");
        this.f256p0 = block;
        this.f257q0 = t10;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f258r0 = this;
        this.f259s0 = DeepRecursiveKt.f79377a;
    }

    @Override // kotlin.DeepRecursiveScope
    @Nullable
    public Object callRecursive(T t10, @NotNull Continuation<? super R> continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f258r0 = continuation;
        this.f257q0 = t10;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext getF79378p0() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        this.f258r0 = null;
        this.f259s0 = obj;
    }

    public final R runCallLoop() {
        while (true) {
            R r3 = (R) this.f259s0;
            Continuation<Object> continuation = this.f258r0;
            if (continuation == null) {
                ResultKt.throwOnFailure(r3);
                return r3;
            }
            if (Result.m5537equalsimpl0(DeepRecursiveKt.f79377a, r3)) {
                try {
                    Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3 = this.f256p0;
                    Object obj = this.f257q0;
                    Object objWrapWithContinuationImpl = !(function3 instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.wrapWithContinuationImpl(function3, this, obj, continuation) : ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(this, obj, continuation);
                    if (objWrapWithContinuationImpl != ek.a.getCOROUTINE_SUSPENDED()) {
                        continuation.resumeWith(Result.m5535constructorimpl(objWrapWithContinuationImpl));
                    }
                } catch (Throwable th2) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
                }
            } else {
                this.f259s0 = DeepRecursiveKt.f79377a;
                continuation.resumeWith(r3);
            }
        }
    }

    @Override // kotlin.DeepRecursiveScope
    @Nullable
    public <U, S> Object callRecursive(@NotNull DeepRecursiveFunction<U, S> deepRecursiveFunction, U u2, @NotNull final Continuation<? super S> continuation) {
        Function3<DeepRecursiveScope<U, S>, U, Continuation<? super S>, Object> block$kotlin_stdlib = deepRecursiveFunction.getBlock$kotlin_stdlib();
        Intrinsics.checkNotNull(block$kotlin_stdlib, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        final Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3 = this.f256p0;
        if (block$kotlin_stdlib != function3) {
            this.f256p0 = block$kotlin_stdlib;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            final EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            this.f258r0 = new Continuation<Object>() { // from class: kotlin.DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1
                @Override // kotlin.coroutines.Continuation
                @NotNull
                /* JADX INFO: renamed from: getContext, reason: from getter */
                public CoroutineContext getF79378p0() {
                    return emptyCoroutineContext;
                }

                @Override // kotlin.coroutines.Continuation
                public void resumeWith(@NotNull Object result) {
                    Function3 function4 = function3;
                    ak.a aVar = this;
                    aVar.f256p0 = function4;
                    aVar.f258r0 = continuation;
                    aVar.f259s0 = result;
                }
            };
        } else {
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f258r0 = continuation;
        }
        this.f257q0 = u2;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }
}
