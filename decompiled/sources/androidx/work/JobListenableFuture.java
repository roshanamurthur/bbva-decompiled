package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0096\u0001J\u0018\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ0\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000fH\u0096\u0003¢\u0006\u0004\b\f\u0010\u0010J\t\u0010\u0011\u001a\u00020\nH\u0096\u0001J\t\u0010\u0012\u001a\u00020\nH\u0096\u0001J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Landroidx/work/JobListenableFuture;", "R", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "p0", "Ljava/util/concurrent/Executor;", "p1", "", "addListener", "", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", "result", "complete", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/Job;", "job", "Landroidx/work/impl/utils/futures/SettableFuture;", "underlying", "<init>", "(Lkotlinx/coroutines/Job;Landroidx/work/impl/utils/futures/SettableFuture;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
public final class JobListenableFuture<R> implements ListenableFuture<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Job f24296p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SettableFuture<R> f24297q0;

    /* JADX INFO: compiled from: ListenableFuture.kt */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ JobListenableFuture<R> f24298p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobListenableFuture<R> jobListenableFuture) {
            super(1);
            this.f24298p0 = jobListenableFuture;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable th3 = th2;
            JobListenableFuture<R> jobListenableFuture = this.f24298p0;
            if (th3 == null) {
                if (!jobListenableFuture.f24297q0.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th3 instanceof CancellationException) {
                jobListenableFuture.f24297q0.cancel(true);
            } else {
                SettableFuture settableFuture = jobListenableFuture.f24297q0;
                Throwable cause = th3.getCause();
                if (cause != null) {
                    th3 = cause;
                }
                settableFuture.setException(th3);
            }
            return Unit.INSTANCE;
        }
    }

    public JobListenableFuture(@NotNull Job job, @NotNull SettableFuture<R> underlying) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f24296p0 = job;
        this.f24297q0 = underlying;
        job.invokeOnCompletion(new a(this));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable p4, Executor p10) {
        this.f24297q0.addListener(p4, p10);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean p4) {
        return this.f24297q0.cancel(p4);
    }

    public final void complete(R result) {
        this.f24297q0.set(result);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f24297q0.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f24297q0.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f24297q0.isDone();
    }

    @Override // java.util.concurrent.Future
    public R get(long p4, TimeUnit p10) {
        return this.f24297q0.get(p4, p10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JobListenableFuture(Job job, SettableFuture settableFuture, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            settableFuture = SettableFuture.create();
            Intrinsics.checkNotNullExpressionValue(settableFuture, "create()");
        }
        this(job, settableFuture);
    }
}
