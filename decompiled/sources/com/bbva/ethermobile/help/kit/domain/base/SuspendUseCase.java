package com.bbva.ethermobile.help.kit.domain.base;

import com.bbva.ethermobile.help.kit.result.Result;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendUseCase.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086B¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H¤@¢\u0006\u0004\b\b\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobile/help/kit/domain/base/SuspendUseCase;", "P", "R", "", "parameters", "Lcom/bbva/ethermobile/help/kit/result/Result;", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "help-kit_release"}, k = 1, mv = {1, 9, 0})
public abstract class SuspendUseCase<P, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f29264a;

    /* JADX INFO: compiled from: SuspendUseCase.kt */
    @DebugMetadata(c = "com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase", f = "SuspendUseCase.kt", i = {}, l = {20}, m = "invoke", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29265p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SuspendUseCase<P, R> f29266q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f29267r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(SuspendUseCase<? super P, R> suspendUseCase, Continuation<? super a> continuation) {
            super(continuation);
            this.f29266q0 = suspendUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29265p0 = obj;
            this.f29267r0 |= Integer.MIN_VALUE;
            return this.f29266q0.invoke(null, this);
        }
    }

    /* JADX INFO: compiled from: SuspendUseCase.kt */
    @DebugMetadata(c = "com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase$invoke$2", f = "SuspendUseCase.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result.Success<R>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29268p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SuspendUseCase<P, R> f29269q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ P f29270r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(SuspendUseCase<? super P, R> suspendUseCase, P p4, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f29269q0 = suspendUseCase;
            this.f29270r0 = p4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f29269q0, this.f29270r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((b) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29268p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f29268p0 = 1;
                obj = this.f29269q0.execute(this.f29270r0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Result.Success(obj);
        }
    }

    public SuspendUseCase(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.f29264a = coroutineDispatcher;
    }

    @Nullable
    public abstract Object execute(P p4, @NotNull Continuation<? super R> continuation);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object invoke(P p4, @NotNull Continuation<? super Result<R>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29267r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29267r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object objWithContext = aVar.f29265p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29267r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.f29264a;
                b bVar = new b(this, p4, null);
                aVar.f29267r0 = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, bVar, aVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            return (Result) objWithContext;
        } catch (Exception e5) {
            return new Result.Error(e5);
        }
    }
}
