package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PausableMonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J9\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "", EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "resume", "R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPaused", "()Z", "frameClock", "<init>", "(Landroidx/compose/runtime/MonotonicFrameClock;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MonotonicFrameClock f14623p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Latch f14624q0 = new Latch();

    /* JADX INFO: compiled from: PausableMonotonicFrameClock.kt */
    @DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {62, 63}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
    public static final class a<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PausableMonotonicFrameClock f14625p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Function1 f14626q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f14627r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f14629t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14627r0 = obj;
            this.f14629t0 |= Integer.MIN_VALUE;
            return PausableMonotonicFrameClock.this.withFrameNanos(null, this);
        }
    }

    public PausableMonotonicFrameClock(@NotNull MonotonicFrameClock monotonicFrameClock) {
        this.f14623p0 = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r3, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r3, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public final /* synthetic */ CoroutineContext.Key getKey() {
        return o.a(this);
    }

    public final boolean isPaused() {
        return !this.f14624q0.isOpen();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    public final void pause() {
        this.f14624q0.closeLatch();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final void resume() {
        this.f14624q0.openLatch();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        a aVar;
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f14629t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f14629t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithFrameNanos = aVar.f14627r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f14629t0;
        if (i11 != 0) {
            if (i11 == 1) {
                function1 = aVar.f14626q0;
                pausableMonotonicFrameClock = aVar.f14625p0;
                ResultKt.throwOnFailure(objWithFrameNanos);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithFrameNanos);
            }
        }
        ResultKt.throwOnFailure(objWithFrameNanos);
        aVar.f14625p0 = this;
        aVar.f14626q0 = function1;
        aVar.f14629t0 = 1;
        if (this.f14624q0.await(aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        pausableMonotonicFrameClock = this;
        MonotonicFrameClock monotonicFrameClock = pausableMonotonicFrameClock.f14623p0;
        aVar.f14625p0 = null;
        aVar.f14626q0 = null;
        aVar.f14629t0 = 2;
        objWithFrameNanos = monotonicFrameClock.withFrameNanos(function1, aVar);
        return objWithFrameNanos == coroutine_suspended ? coroutine_suspended : objWithFrameNanos;
    }
}
