package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveDataScope;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/DisposableHandle;", "emitSource", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/CoroutineLiveData;", "a", "Landroidx/lifecycle/CoroutineLiveData;", "getTarget$lifecycle_livedata_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "target", "getLatestValue", "()Ljava/lang/Object;", "latestValue", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public CoroutineLiveData<T> target;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f21927b;

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21928p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LiveDataScopeImpl<T> f21929q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ T f21930r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveDataScopeImpl<T> liveDataScopeImpl, T t10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21929q0 = liveDataScopeImpl;
            this.f21930r0 = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f21929q0, this.f21930r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21928p0;
            LiveDataScopeImpl<T> liveDataScopeImpl = this.f21929q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineLiveData<T> target$lifecycle_livedata_release = liveDataScopeImpl.getTarget$lifecycle_livedata_release();
                this.f21928p0 = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            liveDataScopeImpl.getTarget$lifecycle_livedata_release().setValue(this.f21930r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DisposableHandle>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21931p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LiveDataScopeImpl<T> f21932q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LiveData<T> f21933r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21932q0 = liveDataScopeImpl;
            this.f21933r0 = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f21932q0, this.f21933r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DisposableHandle> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21931p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.f21932q0.getTarget$lifecycle_livedata_release();
                this.f21931p0 = 1;
                obj = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(this.f21933r0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public LiveDataScopeImpl(@NotNull CoroutineLiveData<T> target, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.target = target;
        this.f21927b = context.plus(Dispatchers.getMain().getImmediate());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    @Nullable
    public Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.f21927b, new a(this, t10, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LiveDataScope
    @Nullable
    public Object emitSource(@NotNull LiveData<T> liveData, @NotNull Continuation<? super DisposableHandle> continuation) {
        return BuildersKt.withContext(this.f21927b, new b(this, liveData, null), continuation);
    }

    @Override // androidx.lifecycle.LiveDataScope
    @Nullable
    public T getLatestValue() {
        return this.target.getValue();
    }

    @NotNull
    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(@NotNull CoroutineLiveData<T> coroutineLiveData) {
        Intrinsics.checkNotNullParameter(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
