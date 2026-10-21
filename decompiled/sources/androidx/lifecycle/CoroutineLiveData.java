package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BJ\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012-\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\tH\u0080@¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\tH\u0014J\b\u0010\u000e\u001a\u00020\tH\u0014¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/DisposableHandle;", "emitSource$lifecycle_livedata_release", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "", "clearSource$lifecycle_livedata_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSource", "onActive", "onInactive", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public BlockRunner<T> f21829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public EmittedSource f21830b;

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineLiveData<T> f21831p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineLiveData<T> coroutineLiveData) {
            super(0);
            this.f21831p0 = coroutineLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f21831p0.f21829a = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {235}, m = "clearSource$lifecycle_livedata_release", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CoroutineLiveData f21832p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f21833q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineLiveData<T> f21834r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f21835s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineLiveData<T> coroutineLiveData, Continuation<? super b> continuation) {
            super(continuation);
            this.f21834r0 = coroutineLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21833q0 = obj;
            this.f21835s0 |= Integer.MIN_VALUE;
            return this.f21834r0.clearSource$lifecycle_livedata_release(this);
        }
    }

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0, 0, 1}, l = {228, 229}, m = "emitSource$lifecycle_livedata_release", n = {"this", "source", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CoroutineLiveData f21836p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LiveData f21837q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f21838r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CoroutineLiveData<T> f21839s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f21840t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineLiveData<T> coroutineLiveData, Continuation<? super c> continuation) {
            super(continuation);
            this.f21839s0 = coroutineLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21838r0 = obj;
            this.f21840t0 |= Integer.MIN_VALUE;
            return this.f21839s0.emitSource$lifecycle_livedata_release(null, this);
        }
    }

    public /* synthetic */ CoroutineLiveData(CoroutineContext coroutineContext, long j10, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i10 & 2) != 0 ? 5000L : j10, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object clearSource$lifecycle_livedata_release(@NotNull Continuation<? super Unit> continuation) {
        b bVar;
        CoroutineLiveData<T> coroutineLiveData;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f21835s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f21835s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object obj = bVar.f21833q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f21835s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            EmittedSource emittedSource = this.f21830b;
            if (emittedSource != null) {
                bVar.f21832p0 = this;
                bVar.f21835s0 = 1;
                if (emittedSource.disposeNow(bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            coroutineLiveData = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineLiveData = bVar.f21832p0;
            ResultKt.throwOnFailure(obj);
        }
        coroutineLiveData.f21830b = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object emitSource$lifecycle_livedata_release(@NotNull LiveData<T> liveData, @NotNull Continuation<? super DisposableHandle> continuation) {
        c cVar;
        LiveData<T> liveData2;
        CoroutineLiveData coroutineLiveData;
        CoroutineLiveData coroutineLiveData2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f21840t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f21840t0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, continuation);
            }
        } else {
            cVar = new c(this, continuation);
        }
        Object objAddDisposableSource = cVar.f21838r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f21840t0;
        if (i11 != 0) {
            if (i11 == 1) {
                LiveData<T> liveData3 = cVar.f21837q0;
                CoroutineLiveData coroutineLiveData3 = cVar.f21836p0;
                ResultKt.throwOnFailure(objAddDisposableSource);
                liveData2 = liveData3;
                coroutineLiveData = coroutineLiveData3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineLiveData coroutineLiveData4 = cVar.f21836p0;
                ResultKt.throwOnFailure(objAddDisposableSource);
                coroutineLiveData2 = coroutineLiveData4;
            }
            EmittedSource emittedSource = (EmittedSource) objAddDisposableSource;
            coroutineLiveData2.f21830b = emittedSource;
            return emittedSource;
        }
        ResultKt.throwOnFailure(objAddDisposableSource);
        cVar.f21836p0 = this;
        cVar.f21837q0 = liveData;
        cVar.f21840t0 = 1;
        if (clearSource$lifecycle_livedata_release(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        liveData2 = liveData;
        coroutineLiveData = this;
        cVar.f21836p0 = coroutineLiveData;
        cVar.f21837q0 = null;
        cVar.f21840t0 = 2;
        objAddDisposableSource = CoroutineLiveDataKt.addDisposableSource(coroutineLiveData, liveData2, cVar);
        coroutineLiveData2 = coroutineLiveData;
        if (objAddDisposableSource == coroutine_suspended) {
            return coroutine_suspended;
        }
        EmittedSource emittedSource2 = (EmittedSource) objAddDisposableSource;
        coroutineLiveData2.f21830b = emittedSource2;
        return emittedSource2;
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.f21829a;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.f21829a;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    public CoroutineLiveData(@NotNull CoroutineContext context, long j10, @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f21829a = new BlockRunner<>(this, block, j10, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(context).plus(SupervisorKt.SupervisorJob((Job) context.get(Job.INSTANCE)))), new a(this));
    }
}
