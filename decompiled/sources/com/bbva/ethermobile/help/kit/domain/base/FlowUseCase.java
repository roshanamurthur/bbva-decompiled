package com.bbva.ethermobile.help.kit.domain.base;

import com.bbva.ethermobile.help.kit.result.Result;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FlowUseCase.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobile/help/kit/domain/base/FlowUseCase;", "P", "R", "", "parameters", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "invoke", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "execute", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "help-kit_release"}, k = 1, mv = {1, 9, 0})
public abstract class FlowUseCase<P, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f29260a;

    /* JADX INFO: compiled from: FlowUseCase.kt */
    @DebugMetadata(c = "com.bbva.ethermobile.help.kit.domain.base.FlowUseCase$invoke$1", f = "FlowUseCase.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<FlowCollector<? super Result<R>>, Throwable, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29261p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ FlowCollector f29262q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Throwable f29263r0;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Throwable th2, Continuation<? super Unit> continuation) {
            a aVar = new a(3, continuation);
            aVar.f29262q0 = (FlowCollector) obj;
            aVar.f29263r0 = th2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29261p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = this.f29262q0;
                Result.Error error = new Result.Error(new Exception(this.f29263r0));
                this.f29262q0 = null;
                this.f29261p0 = 1;
                if (flowCollector.emit(error, this) == coroutine_suspended) {
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

    public FlowUseCase(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.f29260a = coroutineDispatcher;
    }

    @NotNull
    public abstract Flow<Result<R>> execute(P parameters);

    @NotNull
    public final Flow<Result<R>> invoke(P parameters) {
        return FlowKt.flowOn(FlowKt.m5982catch(execute(parameters), new a(3, null)), this.f29260a);
    }
}
