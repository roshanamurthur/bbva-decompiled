package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0012J-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "p0", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "(Landroid/view/Choreographer;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,60:1\n314#2,11:61\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n38#1:61,11\n*E\n"})
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Choreographer choreographer;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final AndroidUiDispatcher f17132q0;

    /* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AndroidUiDispatcher f17133p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f17134q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AndroidUiDispatcher androidUiDispatcher, c cVar) {
            super(1);
            this.f17133p0 = androidUiDispatcher;
            this.f17134q0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f17133p0.removeFrameCallback$ui_release(this.f17134q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f17136q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.f17136q0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            AndroidUiFrameClock.this.getChoreographer().removeFrameCallback(this.f17136q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
    public static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<R> f17137p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, R> f17138q0;

        public c(CancellableContinuationImpl cancellableContinuationImpl, AndroidUiFrameClock androidUiFrameClock, Function1 function1) {
            this.f17137p0 = cancellableContinuationImpl;
            this.f17138q0 = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objM5535constructorimpl;
            Function1<Long, R> function1 = this.f17138q0;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(function1.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            this.f17137p0.resumeWith(objM5535constructorimpl);
        }
    }

    public AndroidUiFrameClock(@NotNull Choreographer choreographer, @Nullable AndroidUiDispatcher androidUiDispatcher) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.choreographer = choreographer;
        this.f17132q0 = androidUiDispatcher;
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

    @NotNull
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public final /* synthetic */ CoroutineContext.Key getKey() {
        return m0.o.a(this);
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

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) throws Throwable {
        AndroidUiDispatcher androidUiDispatcher = this.f17132q0;
        if (androidUiDispatcher == null) {
            CoroutineContext.Element element = continuation.getF79378p0().get(ContinuationInterceptor.INSTANCE);
            androidUiDispatcher = element instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) element : null;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        c cVar = new c(cancellableContinuationImpl, this, function1);
        if (androidUiDispatcher == null || !Intrinsics.areEqual(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(cVar);
            cancellableContinuationImpl.invokeOnCancellation(new b(cVar));
        } else {
            androidUiDispatcher.postFrameCallback$ui_release(cVar);
            cancellableContinuationImpl.invokeOnCancellation(new a(androidUiDispatcher, cVar));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock(@NotNull Choreographer choreographer) {
        this(choreographer, null);
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
    }
}
