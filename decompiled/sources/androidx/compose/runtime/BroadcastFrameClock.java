package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import m0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BroadcastFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J*\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000e\u001a\u00020\u00042\f\b\u0002\u0010\r\u001a\u00060\u000bj\u0002`\fR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "", "timeNanos", "", "sendFrame", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "", "getHasAwaiters", "()Z", "hasAwaiters", "Lkotlin/Function0;", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,139:1\n89#2:140\n89#2:150\n89#2:153\n314#3,9:141\n323#3,2:151\n33#4,6:154\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n66#1:140\n86#1:150\n118#1:153\n84#1:141,9\n84#1:151,2\n121#1:154,6\n*E\n"})
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f14434p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Object f14435q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Throwable f14436r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public List<a<?>> f14437s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public List<a<?>> f14438t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final AtomicInt f14439u0;

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
    public static final class a<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function1<Long, R> f14440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Continuation<R> f14441b;

        public a(@NotNull Function1 function1, @NotNull CancellableContinuationImpl cancellableContinuationImpl) {
            this.f14440a = function1;
            this.f14441b = cancellableContinuationImpl;
        }
    }

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,139:1\n89#2:140\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n*L\n99#1:140\n*E\n"})
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ a<R> f14443q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<R> aVar) {
            super(1);
            this.f14443q0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Object obj = BroadcastFrameClock.this.f14435q0;
            BroadcastFrameClock broadcastFrameClock = BroadcastFrameClock.this;
            Object obj2 = this.f14443q0;
            synchronized (obj) {
                broadcastFrameClock.f14437s0.remove(obj2);
                if (broadcastFrameClock.f14437s0.isEmpty()) {
                    broadcastFrameClock.f14439u0.set(0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    public final void a(Throwable th2) {
        synchronized (this.f14435q0) {
            try {
                if (this.f14436r0 != null) {
                    return;
                }
                this.f14436r0 = th2;
                List<a<?>> list = this.f14437s0;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Continuation<?> continuation = list.get(i10).f14441b;
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
                }
                this.f14437s0.clear();
                this.f14439u0.set(0);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void cancel(@NotNull CancellationException cancellationException) {
        a(cancellationException);
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

    public final boolean getHasAwaiters() {
        return this.f14439u0.get() != 0;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public final /* synthetic */ CoroutineContext.Key getKey() {
        return o.a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final void sendFrame(long timeNanos) {
        Object objM5535constructorimpl;
        synchronized (this.f14435q0) {
            try {
                List<a<?>> list = this.f14437s0;
                this.f14437s0 = this.f14438t0;
                this.f14438t0 = list;
                this.f14439u0.set(0);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a<?> aVar = list.get(i10);
                    aVar.getClass();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(aVar.f14440a.invoke(Long.valueOf(timeNanos)));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                    }
                    aVar.f14441b.resumeWith(objM5535constructorimpl);
                }
                list.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        a aVar = new a(function1, cancellableContinuationImpl);
        synchronized (this.f14435q0) {
            Throwable th2 = this.f14436r0;
            if (th2 != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
            } else {
                boolean zIsEmpty = this.f14437s0.isEmpty();
                boolean z10 = !zIsEmpty;
                this.f14437s0.add(aVar);
                if (!z10) {
                    this.f14439u0.set(1);
                }
                cancellableContinuationImpl.invokeOnCancellation(new b(aVar));
                if (zIsEmpty && this.f14434p0 != null) {
                    try {
                        this.f14434p0.invoke();
                    } catch (Throwable th3) {
                        a(th3);
                    }
                }
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public BroadcastFrameClock(@Nullable Function0<Unit> function0) {
        this.f14434p0 = function0;
        this.f14435q0 = new Object();
        this.f14437s0 = new ArrayList();
        this.f14438t0 = new ArrayList();
        this.f14439u0 = new AtomicInt(0);
    }

    public /* synthetic */ BroadcastFrameClock(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0);
    }
}
