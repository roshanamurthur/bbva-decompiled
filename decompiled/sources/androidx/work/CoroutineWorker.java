package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineWorker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u0012\u001a\u00020\u000bR\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010&\u001a\u00020\u001f8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "startWork", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/ForegroundInfo;", "getForegroundInfo", "Landroidx/work/Data;", "data", "", "setProgress", "(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/ForegroundInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "Lkotlinx/coroutines/CompletableJob;", "u0", "Lkotlinx/coroutines/CompletableJob;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/CompletableJob;", "job", "Landroidx/work/impl/utils/futures/SettableFuture;", "v0", "Landroidx/work/impl/utils/futures/SettableFuture;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "future", "Lkotlinx/coroutines/CoroutineDispatcher;", "w0", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "()V", "coroutineContext", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
public abstract class CoroutineWorker extends ListenableWorker {

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CompletableJob job;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final SettableFuture<ListenableWorker.Result> future;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineDispatcher coroutineContext;

    /* JADX INFO: compiled from: CoroutineWorker.kt */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            if (coroutineWorker.getFuture$work_runtime_ktx_release().isCancelled()) {
                Job.DefaultImpls.cancel$default((Job) coroutineWorker.getJob(), (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public JobListenableFuture f24282p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f24283q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ JobListenableFuture<ForegroundInfo> f24284r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f24285s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f24284r0 = jobListenableFuture;
            this.f24285s0 = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f24284r0, this.f24285s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            JobListenableFuture jobListenableFuture;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f24283q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.f24284r0;
                this.f24282p0 = jobListenableFuture2;
                this.f24283q0 = 1;
                Object foregroundInfo = this.f24285s0.getForegroundInfo(this);
                if (foregroundInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jobListenableFuture = jobListenableFuture2;
                obj = foregroundInfo;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jobListenableFuture = this.f24282p0;
                ResultKt.throwOnFailure(obj);
            }
            jobListenableFuture.complete(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f24286p0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoroutineWorker.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f24286p0;
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f24286p0 = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                coroutineWorker.getFuture$work_runtime_ktx_release().set((ListenableWorker.Result) obj);
            } catch (Throwable th2) {
                coroutineWorker.getFuture$work_runtime_ktx_release().setException(th2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(settableFutureCreate, "create()");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new a(), getTaskExecutor().getBackgroundExecutor());
        this.coroutineContext = Dispatchers.getDefault();
    }

    @Nullable
    public abstract Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation);

    @NotNull
    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull Continuation<? super ForegroundInfo> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.work.ListenableWorker
    @NotNull
    public final ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(completableJobJob$default));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(completableJobJob$default, null, 2, 0 == true ? 1 : 0);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new b(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    @NotNull
    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    @NotNull
    /* JADX INFO: renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final CompletableJob getJob() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    @Nullable
    public final Object setForeground(@NotNull ForegroundInfo foregroundInfo, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object result;
        ListenableFuture<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                result = foregroundAsync.get();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (cause == null) {
                    throw e5;
                }
                throw cause;
            }
        } else {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(cancellableContinuationImpl, foregroundAsync), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new ListenableFutureKt$await$2$2(foregroundAsync));
            result = cancellableContinuationImpl.getResult();
            if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return result == ek.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Nullable
    public final Object setProgress(@NotNull Data data, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object result;
        ListenableFuture<Void> progressAsync = setProgressAsync(data);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                result = progressAsync.get();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (cause == null) {
                    throw e5;
                }
                throw cause;
            }
        } else {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(cancellableContinuationImpl, progressAsync), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new ListenableFutureKt$await$2$2(progressAsync));
            result = cancellableContinuationImpl.getResult();
            if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return result == ek.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(this.job)), null, null, new c(null), 3, null);
        return this.future;
    }

    @Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
