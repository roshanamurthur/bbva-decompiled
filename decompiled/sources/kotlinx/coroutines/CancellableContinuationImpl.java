package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001f\u0012\f\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000e\u0012\u0006\u0010]\u001a\u000204¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0001J\u0010\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J1\u0010#\u001a\u00020\u00072!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00070\u001f2\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u000eH\u0001J\u000f\u0010*\u001a\u00020\u0007H\u0000¢\u0006\u0004\b(\u0010)J \u0010-\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010.J<\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00028\u00002#\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001fH\u0016¢\u0006\u0004\b0\u00101J\u001c\u00106\u001a\u00020\u00072\n\u00103\u001a\u0006\u0012\u0002\b\u0003022\u0006\u00105\u001a\u000204H\u0016J1\u00106\u001a\u00020\u00072'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00070\u001fj\u0002`7H\u0016J\u000f\u00109\u001a\u00020\u0007H\u0000¢\u0006\u0004\b8\u0010)J#\u0010;\u001a\u0004\u0018\u00010\u000e2\u0006\u0010/\u001a\u00028\u00002\b\u0010:\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b;\u0010<JH\u0010;\u001a\u0004\u0018\u00010\u000e2\u0006\u0010/\u001a\u00028\u00002\b\u0010:\u001a\u0004\u0018\u00010\u000e2#\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001fH\u0016¢\u0006\u0004\b;\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u000e2\u0006\u0010>\u001a\u00020\u0013H\u0016J\u0010\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u000eH\u0016J\u001b\u0010C\u001a\u00020\u0007*\u00020B2\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0004\bC\u0010DJ\u0014\u0010E\u001a\u00020\u0007*\u00020B2\u0006\u0010>\u001a\u00020\u0013H\u0016J\u001f\u0010I\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010F\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\bG\u0010HJ\u001b\u0010L\u001a\u0004\u0018\u00010\u00132\b\u0010F\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\bJ\u0010KJ\b\u0010N\u001a\u00020MH\u0016J\b\u0010O\u001a\u00020MH\u0014J\b\u0010P\u001a\u00020\tH\u0002J\u0010\u0010Q\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u001e\u0010R\u001a\u00020\u00072\n\u00103\u001a\u0006\u0012\u0002\b\u0003022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010S\u001a\u00020\tH\u0002J\b\u0010;\u001a\u00020\tH\u0002J\n\u0010U\u001a\u0004\u0018\u00010TH\u0002J\u0010\u0010V\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\u001a\u0010W\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010F\u001a\u0004\u0018\u00010\u000eH\u0002J1\u0010X\u001a\u00020\u001c2'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00070\u001fj\u0002`7H\u0002J\u0010\u0010Z\u001a\u00020\u00072\u0006\u0010Y\u001a\u000204H\u0002JS\u0010^\u001a\u0004\u0018\u00010\u000e2\u0006\u0010F\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u000e2\u0006\u0010]\u001a\u0002042#\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f2\b\u0010:\u001a\u0004\u0018\u00010\u000eH\u0002JA\u0010_\u001a\u00020\u00072\b\u0010\\\u001a\u0004\u0018\u00010\u000e2\u0006\u0010]\u001a\u0002042%\b\u0002\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001fH\u0002JC\u0010a\u001a\u0004\u0018\u00010`2\b\u0010\\\u001a\u0004\u0018\u00010\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u000e2#\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001fH\u0002J\u0012\u0010c\u001a\u00020b2\b\u0010\\\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010d\u001a\u00020\u0007H\u0002R \u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010k\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0016\u0010F\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0010R\u0014\u0010p\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010qR\u0014\u0010s\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010qR\u001c\u0010v\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0016\u0010y\u001a\u0004\u0018\u00010T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010|\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u000b\u0010~\u001a\u00020}8\u0002X\u0082\u0004R\u0014\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0\u007f8\u0002X\u0082\u0004R\u0014\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u007f8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0084\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "", "initCancellability", "", "resetStateReusable", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "takenState", "", "cause", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "Lkotlinx/coroutines/CancelHandler;", "handler", "callCancelHandler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "callOnCancellation", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "getResult", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "()V", "releaseClaimedReusableContinuation", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/Segment;", "segment", "", FirebaseAnalytics.Param.INDEX, "invokeOnCancellation", "Lkotlinx/coroutines/CompletionHandler;", "detachChild$kotlinx_coroutines_core", "detachChild", "idempotent", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "tryResumeWithException", "token", "completeResume", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "state", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "", "toString", "nameString", "isReusable", "cancelLater", "callSegmentOnCancellation", "trySuspend", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "invokeOnCancellationImpl", "multipleHandlersError", "makeCancelHandler", "mode", "dispatchResume", "Lkotlinx/coroutines/NotCompleted;", "proposedUpdate", "resumeMode", "resumedState", "resumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "", "alreadyResumedError", "detachChildIfNonResuable", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getState$kotlinx_coroutines_core", "isActive", "()Z", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "parentHandle", "getStateDebugRepresentation", "()Ljava/lang/String;", "stateDebugRepresentation", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {

    @Volatile
    private volatile int _decisionAndIndex;

    @Volatile
    @Nullable
    private volatile Object _parentHandle;

    @Volatile
    @Nullable
    private volatile Object _state;

    @NotNull
    private final CoroutineContext context;

    @NotNull
    private final Continuation<T> delegate;

    @NotNull
    private static final AtomicIntegerFieldUpdater _decisionAndIndex$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex");

    @NotNull
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state");

    @NotNull
    private static final AtomicReferenceFieldUpdater _parentHandle$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle");

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(@NotNull Continuation<? super T> continuation, int i10) {
        super(i10);
        this.delegate = continuation;
        this.context = continuation.getContext();
        this._decisionAndIndex = 536870911;
        this._state = Active.INSTANCE;
    }

    private final Void alreadyResumedError(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void callSegmentOnCancellation(Segment<?> segment, Throwable cause) {
        int i10 = _decisionAndIndex$FU.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            segment.onCancellation(i10, cause, getContext());
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean cancelLater(Throwable cause) {
        if (!isReusable()) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) continuation).postponeCancellation$kotlinx_coroutines_core(cause);
    }

    private final void detachChildIfNonResuable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    private final void dispatchResume(int mode) {
        if (tryResume()) {
            return;
        }
        DispatchedTaskKt.dispatch(this, mode);
    }

    private final DisposableHandle getParentHandle() {
        return (DisposableHandle) _parentHandle$FU.get(this);
    }

    private final String getStateDebugRepresentation() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof NotCompleted) {
            return "Active";
        }
        return state$kotlinx_coroutines_core instanceof CancelledContinuation ? "Cancelled" : "Completed";
    }

    private final DisposableHandle installParentHandle() {
        Job job = (Job) getContext().get(Job.INSTANCE);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleInvokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new ChildContinuation(this), 2, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _parentHandle$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, disposableHandleInvokeOnCompletion$default) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        return disposableHandleInvokeOnCompletion$default;
    }

    private final void invokeOnCancellationImpl(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Active) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, handler)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof CancelHandler) && !(obj instanceof Segment)) {
                boolean z10 = obj instanceof CompletedExceptionally;
                if (z10) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                    if (!completedExceptionally.makeHandled()) {
                        multipleHandlersError(handler, obj);
                    }
                    if (obj instanceof CancelledContinuation) {
                        if (!z10) {
                            completedExceptionally = null;
                        }
                        Throwable th2 = completedExceptionally != null ? completedExceptionally.cause : null;
                        if (handler instanceof CancelHandler) {
                            callCancelHandler((CancelHandler) handler, th2);
                            return;
                        } else {
                            Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            callSegmentOnCancellation((Segment) handler, th2);
                            return;
                        }
                    }
                    return;
                }
                if (!(obj instanceof CompletedContinuation)) {
                    if (handler instanceof Segment) {
                        return;
                    }
                    Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    CompletedContinuation completedContinuation = new CompletedContinuation(obj, (CancelHandler) handler, null, null, null, 28, null);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$FU;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, completedContinuation)) {
                        if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        }
                    }
                    return;
                }
                CompletedContinuation completedContinuation2 = (CompletedContinuation) obj;
                if (completedContinuation2.cancelHandler != null) {
                    multipleHandlersError(handler, obj);
                }
                if (handler instanceof Segment) {
                    return;
                }
                Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                CancelHandler cancelHandler = (CancelHandler) handler;
                if (completedContinuation2.getCancelled()) {
                    callCancelHandler(cancelHandler, completedContinuation2.cancelCause);
                    return;
                }
                CompletedContinuation completedContinuationCopy$default = CompletedContinuation.copy$default(completedContinuation2, null, cancelHandler, null, null, null, 29, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = _state$FU;
                while (!atomicReferenceFieldUpdater4.compareAndSet(this, obj, completedContinuationCopy$default)) {
                    if (atomicReferenceFieldUpdater4.get(this) != obj) {
                    }
                }
                return;
            }
            multipleHandlersError(handler, obj);
        }
    }

    private final boolean isReusable() {
        if (DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            Continuation<T> continuation = this.delegate;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((DispatchedContinuation) continuation).isReusable$kotlinx_coroutines_core()) {
                return true;
            }
        }
        return false;
    }

    private final CancelHandler makeCancelHandler(Function1<? super Throwable, Unit> handler) {
        return handler instanceof CancelHandler ? (CancelHandler) handler : new InvokeOnCancel(handler);
    }

    private final void multipleHandlersError(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    private final void resumeImpl(Object proposedUpdate, int resumeMode, Function1<? super Throwable, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                if (obj instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj;
                    if (cancelledContinuation.makeResumed()) {
                        if (onCancellation != null) {
                            callOnCancellation(onCancellation, cancelledContinuation.cause);
                            return;
                        }
                        return;
                    }
                }
                alreadyResumedError(proposedUpdate);
                throw new KotlinNothingValueException();
            }
            Object objResumedState = resumedState((NotCompleted) obj, proposedUpdate, resumeMode, onCancellation, null);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$FU;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, objResumedState)) {
                    detachChildIfNonResuable();
                    dispatchResume(resumeMode);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void resumeImpl$default(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i10, Function1 function1, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        cancellableContinuationImpl.resumeImpl(obj, i10, function1);
    }

    private final Object resumedState(NotCompleted state, Object proposedUpdate, int resumeMode, Function1<? super Throwable, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof CompletedExceptionally) {
            return proposedUpdate;
        }
        if (!DispatchedTaskKt.isCancellableMode(resumeMode) && idempotent == null) {
            return proposedUpdate;
        }
        if (onCancellation == null && !(state instanceof CancelHandler) && idempotent == null) {
            return proposedUpdate;
        }
        return new CompletedContinuation(proposedUpdate, state instanceof CancelHandler ? (CancelHandler) state : null, onCancellation, idempotent, null, 16, null);
    }

    private final boolean tryResume() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!_decisionAndIndex$FU.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final Symbol tryResumeImpl(Object proposedUpdate, Object idempotent, Function1<? super Throwable, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                if ((obj instanceof CompletedContinuation) && idempotent != null && ((CompletedContinuation) obj).idempotentResume == idempotent) {
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
                return null;
            }
            Object objResumedState = resumedState((NotCompleted) obj, proposedUpdate, this.resumeMode, onCancellation, idempotent);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$FU;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, objResumedState)) {
                    detachChildIfNonResuable();
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == obj);
        }
    }

    private final boolean trySuspend() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!_decisionAndIndex$FU.compareAndSet(this, i10, PKIFailureInfo.duplicateCertReq + (536870911 & i10)));
        return true;
    }

    public final void callCancelHandler(@NotNull CancelHandler handler, @Nullable Throwable cause) {
        try {
            handler.invoke(cause);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void callOnCancellation(@NotNull Function1<? super Throwable, Unit> onCancellation, @NotNull Throwable cause) {
        try {
            onCancellation.invoke(cause);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(@Nullable Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            CancelledContinuation cancelledContinuation = new CancelledContinuation(this, cause, (obj instanceof CancelHandler) || (obj instanceof Segment));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$FU;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, cancelledContinuation)) {
                    NotCompleted notCompleted = (NotCompleted) obj;
                    if (notCompleted instanceof CancelHandler) {
                        callCancelHandler((CancelHandler) obj, cause);
                    } else if (notCompleted instanceof Segment) {
                        callSegmentOnCancellation((Segment) obj, cause);
                    }
                    detachChildIfNonResuable();
                    dispatchResume(this.resumeMode);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(@Nullable Object takenState, @NotNull Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof NotCompleted) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj instanceof CompletedExceptionally) {
                return;
            }
            if (!(obj instanceof CompletedContinuation)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$FU;
                CompletedContinuation completedContinuation = new CompletedContinuation(obj, null, null, null, cause, 14, null);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, completedContinuation)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj;
            if (!(!completedContinuation2.getCancelled())) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            CompletedContinuation completedContinuationCopy$default = CompletedContinuation.copy$default(completedContinuation2, null, null, null, null, cause, 15, null);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$FU;
            do {
                if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, completedContinuationCopy$default)) {
                    completedContinuation2.invokeHandlers(this, cause);
                    return;
                }
            } while (atomicReferenceFieldUpdater3.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(@NotNull Object token) {
        dispatchResume(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$FU.set(this, NonDisposableHandle.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    @NotNull
    public Throwable getContinuationCancellationCause(@NotNull Job parent) {
        return parent.getCancellationException();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @NotNull
    public final Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @Nullable
    public Throwable getExceptionalResult$kotlinx_coroutines_core(@Nullable Object state) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(state);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    @PublishedApi
    @Nullable
    public final Object getResult() throws Throwable {
        Job job;
        boolean zIsReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return ek.a.getCOROUTINE_SUSPENDED();
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        if (!DispatchedTaskKt.isCancellableMode(this.resumeMode) || (job = (Job) getContext().get(Job.INSTANCE)) == null || job.isActive()) {
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
        throw cancellationException;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Nullable
    public final Object getState$kotlinx_coroutines_core() {
        return _state$FU.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(@Nullable Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle disposableHandleInstallParentHandle = installParentHandle();
        if (disposableHandleInstallParentHandle != null && isCompleted()) {
            disposableHandleInstallParentHandle.dispose();
            _parentHandle$FU.set(this, NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(@NotNull Segment<?> segment, int index) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + index));
        invokeOnCancellationImpl(segment);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof CancelledContinuation;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    @NotNull
    public String nameString() {
        return "CancellableContinuation";
    }

    public final void parentCancelled$kotlinx_coroutines_core(@NotNull Throwable cause) {
        if (cancelLater(cause)) {
            return;
        }
        cancel(cause);
        detachChildIfNonResuable();
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation<T> continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    @JvmName(name = "resetStateReusable")
    public final boolean resetStateReusable() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$FU.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, Active.INSTANCE);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T value, @Nullable Function1<? super Throwable, Unit> onCancellation) {
        resumeImpl(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(@NotNull CoroutineDispatcher coroutineDispatcher, T t10) {
        Continuation<T> continuation = this.delegate;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl$default(this, t10, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th2) {
        Continuation<T> continuation = this.delegate;
        Object[] objArr = 0;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        resumeImpl$default(this, new CompletedExceptionally(th2, false, 2, objArr == true ? 1 : 0), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        resumeImpl$default(this, CompletionStateKt.toState(result, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @Nullable
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    @NotNull
    public String toString() {
        return nameString() + RootService.OPEN_BRACKET + DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + DebugStringsKt.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResumeWithException(@NotNull Throwable exception) {
        return tryResumeImpl(new CompletedExceptionally(exception, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(@NotNull Function1<? super Throwable, Unit> handler) {
        invokeOnCancellationImpl(makeCancelHandler(handler));
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResume(T value, @Nullable Object idempotent) {
        return tryResumeImpl(value, idempotent, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResume(T value, @Nullable Object idempotent, @Nullable Function1<? super Throwable, Unit> onCancellation) {
        return tryResumeImpl(value, idempotent, onCancellation);
    }
}
