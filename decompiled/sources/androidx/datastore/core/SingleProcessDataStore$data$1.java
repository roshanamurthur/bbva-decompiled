package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.c;
import r2.g;
import r2.h;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
public final class SingleProcessDataStore$data$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f20678p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f20679q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f20680r0;

    /* JADX INFO: compiled from: SingleProcessDataStore.kt */
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<g<T>, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f20681p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ g<T> f20682q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g<T> gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f20682q0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f20682q0, continuation);
            aVar.f20681p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return ((a) create((g) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            g<T> gVar = (g) this.f20681p0;
            g<T> gVar2 = this.f20682q0;
            boolean z10 = false;
            if (!(gVar2 instanceof r2.a) && !(gVar2 instanceof r2.b) && gVar == gVar2) {
                z10 = true;
            }
            return Boxing.boxBoolean(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$data$1> continuation) {
        super(2, continuation);
        this.f20680r0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.f20680r0, continuation);
        singleProcessDataStore$data$1.f20679q0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((SingleProcessDataStore$data$1) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f20678p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f20679q0;
            SingleProcessDataStore<T> singleProcessDataStore = this.f20680r0;
            g gVar = (g) singleProcessDataStore.f20664h.getValue();
            if (!(gVar instanceof r2.a)) {
                singleProcessDataStore.f20666j.offer(new SingleProcessDataStore.Message.Read(gVar));
            }
            final Flow flowDropWhile = FlowKt.dropWhile(singleProcessDataStore.f20664h, new a(gVar, null));
            Flow<T> flow = new Flow<T>() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Collect.kt */
                @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$lambda-1$$inlined$collect$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1}, xi = 48)
                public static final class AnonymousClass2 implements FlowCollector<g<T>> {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f20684p0;

                    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public /* synthetic */ Object f20685p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public int f20686q0;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f20685p0 = obj;
                            this.f20686q0 |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f20684p0 = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i10 = anonymousClass1.f20686q0;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f20686q0 = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f20685p0;
                        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                        int i11 = anonymousClass1.f20686q0;
                        if (i11 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            g gVar = (g) obj;
                            if (gVar instanceof c) {
                                throw ((c) gVar).f92906a;
                            }
                            if (gVar instanceof r2.b) {
                                throw ((r2.b) gVar).f92905a;
                            }
                            if (!(gVar instanceof r2.a)) {
                                if (gVar instanceof h) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            T t10 = ((r2.a) gVar).f92903a;
                            anonymousClass1.f20686q0 = 1;
                            if (this.f20684p0.emit(t10, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector2, @NotNull Continuation continuation) {
                    Object objCollect = flowDropWhile.collect(new AnonymousClass2(flowCollector2), continuation);
                    return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.f20678p0 = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
