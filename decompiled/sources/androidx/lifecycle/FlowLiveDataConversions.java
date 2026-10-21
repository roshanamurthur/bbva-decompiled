package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomTrackingLiveData;
import java.time.Duration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "asLiveData", "timeout", "Ljava/time/Duration;", "context", "Lkotlin/coroutines/CoroutineContext;", "timeoutInMs", "", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "FlowLiveDataConversions")
public final class FlowLiveDataConversions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 1, 2}, l = {107, 112, 113, 115}, m = "invokeSuspend", n = {"observer", "observer", "observer"}, s = {"L$0", "L$0", "L$0"})
    public static final class a<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21865p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f21866q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LiveData<T> f21867r0;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FlowLiveData.kt */
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0088a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LiveData<T> f21868p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Observer<T> f21869q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0088a(LiveData<T> liveData, Observer<T> observer, Continuation<? super C0088a> continuation) {
                super(2, continuation);
                this.f21868p0 = liveData;
                this.f21869q0 = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0088a(this.f21868p0, this.f21869q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0088a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f21868p0.observeForever((Observer<? super T>) this.f21869q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: FlowLiveData.kt */
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LiveData<T> f21870p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Observer<T> f21871q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LiveData<T> liveData, Observer<T> observer, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f21870p0 = liveData;
                this.f21871q0 = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f21870p0, this.f21871q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f21870p0.observeForever((Observer<? super T>) this.f21871q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: FlowLiveData.kt */
        @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LiveData<T> f21872p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Observer<T> f21873q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(LiveData<T> liveData, Observer<T> observer, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f21872p0 = liveData;
                this.f21873q0 = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.f21872p0, this.f21873q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f21872p0.removeObserver((Observer<? super T>) this.f21873q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveData<T> liveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21867r0 = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f21867r0, continuation);
            aVar.f21866q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((ProducerScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0089 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            e eVar;
            Observer observer;
            Observer observer2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f21865p0;
            LiveData<T> liveData = this.f21867r0;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        Observer observer3 = (Observer) this.f21866q0;
                        ResultKt.throwOnFailure(obj);
                        observer = observer3;
                    } else if (r1 == 2) {
                        Observer observer4 = (Observer) this.f21866q0;
                        ResultKt.throwOnFailure(obj);
                        observer2 = observer4;
                        this.f21866q0 = observer2;
                        this.f21865p0 = 3;
                        r1 = observer2;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (r1 != 3) {
                            if (r1 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) this.f21866q0;
                            ResultKt.throwOnFailure(obj);
                            throw th2;
                        }
                        Observer observer5 = (Observer) this.f21866q0;
                        ResultKt.throwOnFailure(obj);
                        r1 = observer5;
                    }
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
                eVar = new e((ProducerScope) this.f21866q0, 0);
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                C0088a c0088a = new C0088a(liveData, eVar, null);
                this.f21866q0 = eVar;
                this.f21865p0 = 1;
                if (BuildersKt.withContext(immediate, c0088a, this) == coroutine_suspended) {
                    observer = eVar;
                    return coroutine_suspended;
                }
                observer = eVar;
                MainCoroutineDispatcher immediate2 = Dispatchers.getMain().getImmediate();
                b bVar = new b(liveData, observer, null);
                this.f21866q0 = observer;
                this.f21865p0 = 2;
                observer2 = observer;
                if (BuildersKt.withContext(immediate2, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.f21866q0 = observer2;
                this.f21865p0 = 3;
                r1 = observer2;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                CoroutineContext coroutineContextPlus = Dispatchers.getMain().getImmediate().plus(NonCancellable.INSTANCE);
                c cVar = new c(liveData, r1, null);
                this.f21866q0 = th3;
                this.f21865p0 = 4;
                if (BuildersKt.withContext(coroutineContextPlus, cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<T> extends SuspendLambda implements Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21874p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f21875q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f21876r0;

        /* JADX INFO: compiled from: FlowLiveData.kt */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LiveDataScope<T> f21877p0;

            public a(LiveDataScope<T> liveDataScope) {
                this.f21877p0 = liveDataScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
                Object objEmit = this.f21877p0.emit(t10, continuation);
                return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Flow<? extends T> flow, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21876r0 = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f21876r0, continuation);
            bVar.f21875q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((b) create((LiveDataScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21874p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a((LiveDataScope) this.f21875q0);
                this.f21874p0 = 1;
                if (this.f21876r0.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> Flow<T> asFlow(@NotNull LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        return FlowKt.conflate(FlowKt.callbackFlow(new a(liveData, null)));
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull Flow<? extends T> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return asLiveData$default(flow, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(Flow flow, CoroutineContext coroutineContext, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return asLiveData(flow, coroutineContext, j10);
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull Flow<? extends T> flow, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData$default(flow, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull Flow<? extends T> flow, @NotNull CoroutineContext context, long j10) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        RoomTrackingLiveData roomTrackingLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j10, new b(flow, null));
        if (flow instanceof StateFlow) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                roomTrackingLiveData.setValue(((StateFlow) flow).getValue());
            } else {
                roomTrackingLiveData.postValue(((StateFlow) flow).getValue());
            }
        }
        return roomTrackingLiveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(Flow flow, Duration duration, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(flow, duration, coroutineContext);
    }

    @RequiresApi(26)
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull Flow<? extends T> flow, @NotNull Duration timeout, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData(flow, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
