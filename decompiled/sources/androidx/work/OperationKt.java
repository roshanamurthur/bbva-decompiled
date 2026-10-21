package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "Landroidx/work/Operation$State$SUCCESS;", "Landroidx/work/Operation;", "(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class OperationKt {

    /* JADX INFO: compiled from: Operation.kt */
    @DebugMetadata(c = "androidx.work.OperationKt", f = "Operation.kt", i = {0}, l = {39}, m = "await", n = {"$this$await$iv"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ListenableFuture f24312p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f24313q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f24314r0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24313q0 = obj;
            this.f24314r0 |= Integer.MIN_VALUE;
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object await(@NotNull Operation operation, @NotNull Continuation<? super Operation.State.SUCCESS> continuation) throws Throwable {
        a aVar;
        Object obj;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f24314r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f24314r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object result = aVar.f24313q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f24314r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(result);
            ListenableFuture<Operation.State.SUCCESS> result2 = operation.getResult();
            Intrinsics.checkNotNullExpressionValue(result2, "result");
            if (result2.isDone()) {
                try {
                    obj = result2.get();
                } catch (ExecutionException e5) {
                    Throwable cause = e5.getCause();
                    if (cause == null) {
                        throw e5;
                    }
                    throw cause;
                }
            } else {
                aVar.f24312p0 = result2;
                aVar.f24314r0 = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(aVar), 1);
                cancellableContinuationImpl.initCancellability();
                result2.addListener(new ListenableFutureKt$await$2$1(cancellableContinuationImpl, result2), DirectExecutor.INSTANCE);
                cancellableContinuationImpl.invokeOnCancellation(new ListenableFutureKt$await$2$2(result2));
                result = cancellableContinuationImpl.getResult();
                if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(aVar);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
            return obj;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(result);
        obj = result;
        Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
        return obj;
    }
}
