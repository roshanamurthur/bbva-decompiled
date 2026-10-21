package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "", "message", "actionLabel", "Landroidx/compose/material/SnackbarDuration;", TypedValues.TransitionType.S_DURATION, "Landroidx/compose/material/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/SnackbarData;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData", "<init>", "()V", "a", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,373:1\n81#2:374\n107#2,2:375\n107#3,8:377\n116#3:396\n115#3:397\n314#4,11:385\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n72#1:374\n72#1:375,2\n102#1:377,8\n102#1:396\n102#1:397\n104#1:385,11\n*E\n"})
public final class SnackbarHostState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Mutex f7714a = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState currentSnackbarData = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Stable
    public static final class a implements SnackbarData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f7716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f7717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final SnackbarDuration f7718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final CancellableContinuation<SnackbarResult> f7719d;

        public a(@NotNull String message, @Nullable String str, @NotNull SnackbarDuration duration, @NotNull CancellableContinuationImpl continuation) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f7716a = message;
            this.f7717b = str;
            this.f7718c = duration;
            this.f7719d = continuation;
        }

        @Override // androidx.compose.material.SnackbarData
        public final void dismiss() {
            CancellableContinuation<SnackbarResult> cancellableContinuation = this.f7719d;
            if (cancellableContinuation.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5535constructorimpl(SnackbarResult.Dismissed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        @Nullable
        public final String getActionLabel() {
            return this.f7717b;
        }

        @Override // androidx.compose.material.SnackbarData
        @NotNull
        public final SnackbarDuration getDuration() {
            return this.f7718c;
        }

        @Override // androidx.compose.material.SnackbarData
        @NotNull
        public final String getMessage() {
            return this.f7716a;
        }

        @Override // androidx.compose.material.SnackbarData
        public final void performAction() {
            CancellableContinuation<SnackbarResult> cancellableContinuation = this.f7719d;
            if (cancellableContinuation.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5535constructorimpl(SnackbarResult.ActionPerformed));
            }
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {379, 382}, m = "showSnackbar", n = {"this", "message", "actionLabel", TypedValues.TransitionType.S_DURATION, "$this$withLock_u24default$iv", "this", "message", "actionLabel", TypedValues.TransitionType.S_DURATION, "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SnackbarHostState f7720p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f7721q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f7722r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public SnackbarDuration f7723s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Mutex f7724t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f7725u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f7726w0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f7725u0 = obj;
            this.f7726w0 |= Integer.MIN_VALUE;
            return SnackbarHostState.this.showSnackbar(null, null, null, this);
        }
    }

    public static final void access$setCurrentSnackbarData(SnackbarHostState snackbarHostState, SnackbarData snackbarData) {
        snackbarHostState.currentSnackbarData.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, continuation);
    }

    @Nullable
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object showSnackbar(@NotNull String str, @Nullable String str2, @NotNull SnackbarDuration snackbarDuration, @NotNull Continuation<? super SnackbarResult> continuation) {
        b bVar;
        Mutex mutex;
        SnackbarDuration snackbarDuration2;
        String str3;
        SnackbarHostState snackbarHostState;
        String str4;
        Mutex mutex2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f7726w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f7726w0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f7725u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f7726w0;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    bVar.f7720p0 = this;
                    bVar.f7721q0 = str;
                    bVar.f7722r0 = str2;
                    bVar.f7723s0 = snackbarDuration;
                    mutex = this.f7714a;
                    bVar.f7724t0 = mutex;
                    bVar.f7726w0 = 1;
                    if (mutex.lock(null, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    snackbarDuration2 = snackbarDuration;
                    str3 = str2;
                    snackbarHostState = this;
                    str4 = str;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = bVar.f7724t0;
                        snackbarHostState = bVar.f7720p0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            snackbarHostState.currentSnackbarData.setValue(null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            snackbarHostState.currentSnackbarData.setValue(null);
                            throw th;
                        }
                    }
                    Mutex mutex3 = bVar.f7724t0;
                    SnackbarDuration snackbarDuration3 = bVar.f7723s0;
                    String str5 = bVar.f7722r0;
                    String str6 = bVar.f7721q0;
                    SnackbarHostState snackbarHostState2 = bVar.f7720p0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    str4 = str6;
                    snackbarDuration2 = snackbarDuration3;
                    str3 = str5;
                    snackbarHostState = snackbarHostState2;
                }
                bVar.f7720p0 = snackbarHostState;
                bVar.f7721q0 = str4;
                bVar.f7722r0 = str3;
                bVar.f7723s0 = snackbarDuration2;
                bVar.f7724t0 = mutex;
                bVar.getClass();
                bVar.f7726w0 = 2;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(bVar), 1);
                cancellableContinuationImpl.initCancellability();
                access$setCurrentSnackbarData(snackbarHostState, new a(str4, str3, snackbarDuration2, cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(bVar);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Mutex mutex4 = mutex;
                obj = result;
                mutex2 = mutex4;
                snackbarHostState.currentSnackbarData.setValue(null);
                mutex2.unlock(null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                snackbarHostState.currentSnackbarData.setValue(null);
                throw th;
            }
        } catch (Throwable th4) {
            str.unlock(null);
            throw th4;
        }
    }
}
