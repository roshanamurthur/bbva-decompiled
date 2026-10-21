package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import m0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,126:1\n314#2,11:127\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n64#1:127,11\n*E\n"})
public final class a implements MonotonicFrameClock {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final a f14814p0 = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Choreographer f14815q0 = (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain().getImmediate(), new C0057a(2, null));

    /* JADX INFO: renamed from: androidx.compose.runtime.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActualAndroid.android.kt */
    @DebugMetadata(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0057a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Choreographer>, Object> {
        public C0057a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0057a(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Choreographer> continuation) {
            return ((C0057a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Choreographer.getInstance();
        }
    }

    /* JADX INFO: compiled from: ActualAndroid.android.kt */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f14816p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.f14816p0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            a.f14815q0.removeFrameCallback(this.f14816p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ActualAndroid.android.kt */
    @SourceDebugExtension({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<R> f14817p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, R> f14818q0;

        public c(CancellableContinuationImpl cancellableContinuationImpl, Function1 function1) {
            this.f14817p0 = cancellableContinuationImpl;
            this.f14818q0 = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objM5535constructorimpl;
            a aVar = a.f14814p0;
            Function1<Long, R> function1 = this.f14818q0;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(function1.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            this.f14817p0.resumeWith(objM5535constructorimpl);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r3, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r3, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public final /* synthetic */ CoroutineContext.Key getKey() {
        return o.a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public final <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        c cVar = new c(cancellableContinuationImpl, function1);
        f14815q0.postFrameCallback(cVar);
        cancellableContinuationImpl.invokeOnCancellation(new b(cVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
