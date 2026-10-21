package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bb\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012-\u0010\f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0002\b\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/BlockRunner;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "maybeRun", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "", "timeoutInMs", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/jvm/functions/Function2;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
public final class BlockRunner<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineLiveData<T> f21811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> f21812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f21814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f21815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f21816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f21817g;

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21818p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ BlockRunner<T> f21819q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BlockRunner<T> blockRunner, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21819q0 = blockRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f21819q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21818p0;
            BlockRunner<T> blockRunner = this.f21819q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                long j10 = blockRunner.f21813c;
                this.f21818p0 = 1;
                if (DelayKt.delay(j10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!blockRunner.f21811a.hasActiveObservers()) {
                Job job = blockRunner.f21816f;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                blockRunner.f21816f = null;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21820p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f21821q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BlockRunner<T> f21822r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BlockRunner<T> blockRunner, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21822r0 = blockRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f21822r0, continuation);
            bVar.f21821q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21820p0;
            BlockRunner<T> blockRunner = this.f21822r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(blockRunner.f21811a, ((CoroutineScope) this.f21821q0).getCoroutineContext());
                Function2 function2 = blockRunner.f21812b;
                this.f21820p0 = 1;
                if (function2.invoke(liveDataScopeImpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            blockRunner.f21815e.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(@NotNull CoroutineLiveData<T> liveData, @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block, long j10, @NotNull CoroutineScope scope, @NotNull Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.f21811a = liveData;
        this.f21812b = block;
        this.f21813c = j10;
        this.f21814d = scope;
        this.f21815e = onDone;
    }

    @MainThread
    public final void cancel() {
        if (this.f21817g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
        }
        this.f21817g = BuildersKt__Builders_commonKt.launch$default(this.f21814d, Dispatchers.getMain().getImmediate(), null, new a(this, null), 2, null);
    }

    @MainThread
    public final void maybeRun() {
        Job job = this.f21817g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f21817g = null;
        if (this.f21816f != null) {
            return;
        }
        this.f21816f = BuildersKt__Builders_commonKt.launch$default(this.f21814d, null, null, new b(this, null), 3, null);
    }
}
