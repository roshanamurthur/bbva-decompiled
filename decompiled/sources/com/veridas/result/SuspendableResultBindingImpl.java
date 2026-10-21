package com.veridas.result;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendableBinding.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/veridas/result/SuspendableResultBindingImpl;", ExifInterface.LONGITUDE_EAST, "Lcom/veridas/result/SuspendableResultBinding;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/veridas/result/Result;", "bind", "(Lcom/veridas/result/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/veridas/result/Err;", "internalError", "Lcom/veridas/result/Err;", "getInternalError", "()Lcom/veridas/result/Err;", "setInternalError", "(Lcom/veridas/result/Err;)V", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nSuspendableBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableBinding.kt\ncom/veridas/result/SuspendableResultBindingImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,73:1\n120#2,10:74\n*S KotlinDebug\n*F\n+ 1 SuspendableBinding.kt\ncom/veridas/result/SuspendableResultBindingImpl\n*L\n62#1:74,10\n*E\n"})
public final class SuspendableResultBindingImpl<E> implements SuspendableResultBinding<E> {
    public Err<? extends E> internalError;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Mutex f67467q0;

    /* JADX INFO: compiled from: SuspendableBinding.kt */
    @DebugMetadata(c = "com.veridas.result.SuspendableResultBindingImpl", f = "SuspendableBinding.kt", i = {0, 0, 0}, l = {79}, m = "bind", n = {"this", "$this$bind", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class a<V> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SuspendableResultBindingImpl f67468p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Result f67469q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Mutex f67470r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f67471s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ SuspendableResultBindingImpl<E> f67472t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f67473u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SuspendableResultBindingImpl<E> suspendableResultBindingImpl, Continuation<? super a> continuation) {
            super(continuation);
            this.f67472t0 = suspendableResultBindingImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f67471s0 = obj;
            this.f67473u0 |= Integer.MIN_VALUE;
            return this.f67472t0.bind(null, this);
        }
    }

    public SuspendableResultBindingImpl(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
        this.f67467q0 = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.veridas.result.SuspendableResultBinding
    @Nullable
    public <V> Object bind(@NotNull Result<? extends V, ? extends E> result, @NotNull Continuation<? super V> continuation) {
        a aVar;
        Mutex mutex;
        SuspendableResultBindingImpl<E> suspendableResultBindingImpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f67473u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f67473u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object obj = aVar.f67471s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f67473u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (result instanceof Ok) {
                return ((Ok) result).getValue();
            }
            if (!(result instanceof Err)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.f67468p0 = this;
            aVar.f67469q0 = result;
            mutex = this.f67467q0;
            aVar.f67470r0 = mutex;
            aVar.f67473u0 = 1;
            if (mutex.lock(null, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            suspendableResultBindingImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = aVar.f67470r0;
            Result<? extends V, ? extends E> result2 = aVar.f67469q0;
            suspendableResultBindingImpl = aVar.f67468p0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            result = result2;
        }
        try {
            if (suspendableResultBindingImpl.internalError == null) {
                suspendableResultBindingImpl.setInternalError((Err) result);
                CoroutineScopeKt.cancel(suspendableResultBindingImpl, BindCancellationException.INSTANCE);
            }
            throw BindCancellationException.INSTANCE;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    public final Err<E> getInternalError() {
        Err<? extends E> err = this.internalError;
        if (err != null) {
            return err;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalError");
        return null;
    }

    public final void setInternalError(@NotNull Err<? extends E> err) {
        Intrinsics.checkNotNullParameter(err, "<set-?>");
        this.internalError = err;
    }
}
