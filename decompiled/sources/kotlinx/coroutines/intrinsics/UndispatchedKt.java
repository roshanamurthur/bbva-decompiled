package kotlinx.coroutines.intrinsics;

import androidx.exifinterface.media.ExifInterface;
import ek.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a@\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001aT\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a[\u0010\u0010\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000b\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\u0002\b\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a[\u0010\u0012\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000b\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\u0002\b\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "startCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "startCoroutineUndispatched", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "block", "startUndispatchedOrReturn", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,127:1\n55#1:128\n56#1,11:130\n55#1:141\n56#1,2:143\n58#1,9:150\n55#1:159\n56#1,2:161\n58#1,9:168\n97#1,4:178\n114#1,6:182\n120#1,5:190\n97#1,4:195\n114#1,6:199\n120#1,5:207\n11#2:129\n11#2:142\n11#2:160\n11#2:177\n95#3,5:145\n95#3,5:163\n61#4,2:188\n61#4,2:205\n61#4,2:212\n61#4,2:214\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n18#1:128\n18#1:130,11\n29#1:141\n29#1:143,2\n29#1:150,9\n42#1:159\n42#1:161,2\n42#1:168,9\n77#1:178,4\n77#1:182,6\n77#1:190,5\n88#1:195,4\n88#1:199,6\n88#1:207,5\n18#1:129\n29#1:142\n42#1:160\n55#1:177\n30#1:145,5\n43#1:163,5\n77#1:188,2\n88#1:205,2\n119#1:212,2\n120#1:214,2\n*E\n"})
public final class UndispatchedKt {
    public static final <T> void startCoroutineUndispatched(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext f79584p0 = continuation.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(f79584p0, null);
            try {
                Object objInvoke = ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(continuationProbeCoroutineCreated);
                ThreadContextKt.restoreThreadContext(f79584p0, objUpdateThreadContext);
                if (objInvoke != a.getCOROUTINE_SUSPENDED()) {
                    continuationProbeCoroutineCreated.resumeWith(Result.m5535constructorimpl(objInvoke));
                }
            } catch (Throwable th2) {
                ThreadContextKt.restoreThreadContext(f79584p0, objUpdateThreadContext);
                throw th2;
            }
        } catch (Throwable th3) {
            Result.Companion companion = Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(th3)));
        }
    }

    public static final <T> void startCoroutineUnintercepted(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            Object objInvoke = ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(continuationProbeCoroutineCreated);
            if (objInvoke != a.getCOROUTINE_SUSPENDED()) {
                continuationProbeCoroutineCreated.resumeWith(Result.m5535constructorimpl(objInvoke));
            }
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    @Nullable
    public static final <T, R> Object startUndispatchedOrReturn(@NotNull ScopeCoroutine<? super T> scopeCoroutine, R r3, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object completedExceptionally;
        try {
            completedExceptionally = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r3, scopeCoroutine);
        } catch (Throwable th2) {
            completedExceptionally = new CompletedExceptionally(th2, false, 2, null);
        }
        if (completedExceptionally == a.getCOROUTINE_SUSPENDED()) {
            return a.getCOROUTINE_SUSPENDED();
        }
        Object objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally);
        if (objMakeCompletingOnce$kotlinx_coroutines_core == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return a.getCOROUTINE_SUSPENDED();
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
        }
        return JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    @Nullable
    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(@NotNull ScopeCoroutine<? super T> scopeCoroutine, R r3, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) throws Throwable {
        Object completedExceptionally;
        try {
            completedExceptionally = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r3, scopeCoroutine);
        } catch (Throwable th2) {
            completedExceptionally = new CompletedExceptionally(th2, false, 2, null);
        }
        if (completedExceptionally == a.getCOROUTINE_SUSPENDED()) {
            return a.getCOROUTINE_SUSPENDED();
        }
        Object objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally);
        if (objMakeCompletingOnce$kotlinx_coroutines_core == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return a.getCOROUTINE_SUSPENDED();
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            Throwable th3 = ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
            if (!(th3 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th3).coroutine != scopeCoroutine) {
                throw th3;
            }
            if (completedExceptionally instanceof CompletedExceptionally) {
                throw ((CompletedExceptionally) completedExceptionally).cause;
            }
        } else {
            completedExceptionally = JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        return completedExceptionally;
    }

    public static final <R, T> void startCoroutineUndispatched(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r3, @NotNull Continuation<? super T> continuation) {
        Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext f79584p0 = continuation.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(f79584p0, null);
            try {
                Object objInvoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r3, continuationProbeCoroutineCreated);
                ThreadContextKt.restoreThreadContext(f79584p0, objUpdateThreadContext);
                if (objInvoke != a.getCOROUTINE_SUSPENDED()) {
                    continuationProbeCoroutineCreated.resumeWith(Result.m5535constructorimpl(objInvoke));
                }
            } catch (Throwable th2) {
                ThreadContextKt.restoreThreadContext(f79584p0, objUpdateThreadContext);
                throw th2;
            }
        } catch (Throwable th3) {
            Result.Companion companion = Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(th3)));
        }
    }
}
