package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import ek.a;
import java.lang.reflect.InvocationTargetException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\n\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0001\u001a\u0013\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u0016\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002\u001a\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002\"\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/HandlerDispatcher;", "from", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/HandlerDispatcher;", "asCoroutineDispatcher", "Landroid/os/Looper;", "", "async", "asHandler", "", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFrameSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "updateChoreographerAndPostFrameCallback", "Landroid/view/Choreographer;", "choreographer", "postFrameCallback", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n314#2,11:218\n314#2,9:229\n323#2,2:239\n17#3:238\n1#4:241\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n189#1:218,11\n197#1:229,9\n197#1:239,2\n201#1:238\n*E\n"})
public final class HandlerDispatcherKt {

    @JvmField
    @Nullable
    public static final HandlerDispatcher Main;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Main = (HandlerDispatcher) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    @VisibleForTesting
    @NotNull
    public static final Handler asHandler(@NotNull Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    @Nullable
    public static final Object awaitFrame(@NotNull Continuation<? super Long> continuation) throws Throwable {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(continuation);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        postFrameCallback(choreographer2, cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitFrameSlowPath(Continuation<? super Long> continuation) throws Throwable {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(cancellableContinuationImpl);
        } else {
            Dispatchers.getMain().mo6007dispatch(cancellableContinuationImpl.getContext(), new Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(cancellableContinuationImpl);
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @JvmOverloads
    @JvmName(name = "from")
    @NotNull
    public static final HandlerDispatcher from(@NotNull Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler handler, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(Choreographer choreographer2, final CancellableContinuation<? super Long> cancellableContinuation) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: ml.b
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                HandlerDispatcherKt.postFrameCallback$lambda$6(cancellableContinuation, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback$lambda$6(CancellableContinuation cancellableContinuation, long j10) {
        cancellableContinuation.resumeUndispatched(Dispatchers.getMain(), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(CancellableContinuation<? super Long> cancellableContinuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, cancellableContinuation);
    }

    @JvmOverloads
    @JvmName(name = "from")
    @NotNull
    public static final HandlerDispatcher from(@NotNull Handler handler, @Nullable String str) {
        return new HandlerContext(handler, str);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
    }
}
