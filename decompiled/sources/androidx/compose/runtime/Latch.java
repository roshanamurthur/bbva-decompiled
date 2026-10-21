package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Latch.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "R", "Lkotlin/Function0;", "block", "withClosed", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "closeLatch", "openLatch", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isOpen", "()Z", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n89#2:92\n89#2:93\n89#2:94\n89#2:104\n314#3,9:95\n323#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:92\n51#1:93\n57#1:94\n79#1:104\n78#1:95,9\n78#1:105,2\n*E\n"})
public final class Latch {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f14581a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<Continuation<Unit>> f14582b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public List<Continuation<Unit>> f14583c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14584d = true;

    /* JADX INFO: compiled from: Latch.kt */
    @SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,91:1\n89#2:92\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n*L\n84#1:92\n*E\n"})
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Unit> f14586q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CancellableContinuationImpl cancellableContinuationImpl) {
            super(1);
            this.f14586q0 = cancellableContinuationImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Object obj = Latch.this.f14581a;
            Latch latch = Latch.this;
            CancellableContinuation<Unit> cancellableContinuation = this.f14586q0;
            synchronized (obj) {
                latch.f14582b.remove(cancellableContinuation);
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public final Object await(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (isOpen()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this.f14581a) {
            this.f14582b.add(cancellableContinuationImpl);
        }
        cancellableContinuationImpl.invokeOnCancellation(new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == ek.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final void closeLatch() {
        synchronized (this.f14581a) {
            this.f14584d = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean isOpen() {
        boolean z10;
        synchronized (this.f14581a) {
            z10 = this.f14584d;
        }
        return z10;
    }

    public final void openLatch() {
        synchronized (this.f14581a) {
            try {
                if (isOpen()) {
                    return;
                }
                List<Continuation<Unit>> list = this.f14582b;
                this.f14582b = this.f14583c;
                this.f14583c = list;
                this.f14584d = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Continuation<Unit> continuation = list.get(i10);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
                }
                list.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <R> R withClosed(@NotNull Function0<? extends R> block) {
        closeLatch();
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            openLatch();
            InlineMarker.finallyEnd(1);
        }
    }
}
