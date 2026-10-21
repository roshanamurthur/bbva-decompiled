package androidx.compose.material3;

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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u0011B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000eR/\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", TypedValues.TransitionType.S_DURATION, "Landroidx/compose/material3/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SnackbarData;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData", "<init>", "()V", "a", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,456:1\n76#2:457\n102#2,2:458\n107#3,8:460\n116#3:479\n115#3:480\n314#4,11:468\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n69#1:457\n69#1:458,2\n125#1:460,8\n125#1:479\n125#1:480\n127#1:468,11\n*E\n"})
public final class SnackbarHostState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Mutex f11518a = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState currentSnackbarData = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: compiled from: SnackbarHost.kt */
    public static final class a implements SnackbarData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SnackbarVisuals f11520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final CancellableContinuation<SnackbarResult> f11521b;

        public a(@NotNull SnackbarVisuals visuals, @NotNull CancellableContinuationImpl continuation) {
            Intrinsics.checkNotNullParameter(visuals, "visuals");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f11520a = visuals;
            this.f11521b = continuation;
        }

        @Override // androidx.compose.material3.SnackbarData
        public final void dismiss() {
            CancellableContinuation<SnackbarResult> cancellableContinuation = this.f11521b;
            if (cancellableContinuation.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5535constructorimpl(SnackbarResult.Dismissed));
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f11520a, aVar.f11520a) && Intrinsics.areEqual(this.f11521b, aVar.f11521b);
        }

        @Override // androidx.compose.material3.SnackbarData
        @NotNull
        public final SnackbarVisuals getVisuals() {
            return this.f11520a;
        }

        public final int hashCode() {
            return this.f11521b.hashCode() + (this.f11520a.hashCode() * 31);
        }

        @Override // androidx.compose.material3.SnackbarData
        public final void performAction() {
            CancellableContinuation<SnackbarResult> cancellableContinuation = this.f11521b;
            if (cancellableContinuation.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5535constructorimpl(SnackbarResult.ActionPerformed));
            }
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    public static final class b implements SnackbarVisuals {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f11522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f11523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f11524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final SnackbarDuration f11525d;

        public b(@NotNull String message, @Nullable String str, boolean z10, @NotNull SnackbarDuration duration) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f11522a = message;
            this.f11523b = str;
            this.f11524c = z10;
            this.f11525d = duration;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f11522a, bVar.f11522a) && Intrinsics.areEqual(this.f11523b, bVar.f11523b) && this.f11524c == bVar.f11524c && this.f11525d == bVar.f11525d;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @Nullable
        public final String getActionLabel() {
            return this.f11523b;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @NotNull
        public final SnackbarDuration getDuration() {
            return this.f11525d;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @NotNull
        public final String getMessage() {
            return this.f11522a;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public final boolean getWithDismissAction() {
            return this.f11524c;
        }

        public final int hashCode() {
            int iHashCode = this.f11522a.hashCode() * 31;
            String str = this.f11523b;
            return this.f11525d.hashCode() + ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.f11524c ? 1231 : 1237)) * 31);
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @DebugMetadata(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {462, 465}, m = "showSnackbar", n = {"this", "visuals", "$this$withLock_u24default$iv", "this", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SnackbarHostState f11526p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SnackbarVisuals f11527q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Mutex f11528r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f11529s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f11531u0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11529s0 = obj;
            this.f11531u0 |= Integer.MIN_VALUE;
            return SnackbarHostState.this.showSnackbar(null, this);
        }
    }

    public static final void access$setCurrentSnackbarData(SnackbarHostState snackbarHostState, SnackbarData snackbarData) {
        snackbarHostState.currentSnackbarData.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z10, SnackbarDuration snackbarDuration, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, z11, snackbarDuration, continuation);
    }

    @Nullable
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData.getValue();
    }

    @Nullable
    public final Object showSnackbar(@NotNull String str, @Nullable String str2, boolean z10, @NotNull SnackbarDuration snackbarDuration, @NotNull Continuation<? super SnackbarResult> continuation) {
        return showSnackbar(new b(str, str2, z10, snackbarDuration), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object showSnackbar(@NotNull SnackbarVisuals snackbarVisuals, @NotNull Continuation<? super SnackbarResult> continuation) {
        c cVar;
        Mutex mutex;
        SnackbarHostState snackbarHostState;
        SnackbarVisuals snackbarVisuals2;
        SnackbarHostState snackbarHostState2;
        Throwable th2;
        Mutex mutex2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f11531u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f11531u0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f11529s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f11531u0;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    cVar.f11526p0 = this;
                    cVar.f11527q0 = snackbarVisuals;
                    mutex = this.f11518a;
                    cVar.f11528r0 = mutex;
                    cVar.f11531u0 = 1;
                    if (mutex.lock(null, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    snackbarHostState = this;
                    snackbarVisuals2 = snackbarVisuals;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = cVar.f11528r0;
                        snackbarHostState2 = cVar.f11526p0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            snackbarHostState2.currentSnackbarData.setValue(null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            snackbarHostState2.currentSnackbarData.setValue(null);
                            throw th2;
                        }
                    }
                    Mutex mutex3 = cVar.f11528r0;
                    SnackbarVisuals snackbarVisuals3 = cVar.f11527q0;
                    snackbarHostState = cVar.f11526p0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    snackbarVisuals2 = snackbarVisuals3;
                }
                cVar.f11526p0 = snackbarHostState;
                cVar.f11527q0 = snackbarVisuals2;
                cVar.f11528r0 = mutex;
                cVar.getClass();
                cVar.f11531u0 = 2;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar), 1);
                cancellableContinuationImpl.initCancellability();
                access$setCurrentSnackbarData(snackbarHostState, new a(snackbarVisuals2, cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(cVar);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
                snackbarHostState2 = snackbarHostState;
                Mutex mutex4 = mutex;
                obj = result;
                mutex2 = mutex4;
                snackbarHostState2.currentSnackbarData.setValue(null);
                mutex2.unlock(null);
                return obj;
            } catch (Throwable th4) {
                snackbarHostState2 = snackbarHostState;
                th2 = th4;
                snackbarHostState2.currentSnackbarData.setValue(null);
                throw th2;
            }
        } catch (Throwable th5) {
            snackbarVisuals.unlock(null);
            throw th5;
        }
    }
}
