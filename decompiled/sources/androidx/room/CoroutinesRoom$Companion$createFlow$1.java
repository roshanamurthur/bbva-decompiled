package androidx.room;

import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutinesRoom$Companion$createFlow$1<R> extends SuspendLambda implements Function2<FlowCollector<R>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f23177p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f23178q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f23179r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f23180s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ String[] f23181t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Callable<R> f23182u0;

    /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutinesRoom.kt */
    @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f23183p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f23184q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f23185r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f23186s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ FlowCollector<R> f23187t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String[] f23188u0;
        public final /* synthetic */ Callable<R> v0;

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a */
        /* JADX INFO: compiled from: CoroutinesRoom.kt */
        @DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {128, 130}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public ChannelIterator f23189p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f23190q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ RoomDatabase f23191r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 f23192s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ Channel<Unit> f23193t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ Callable<R> f23194u0;
            public final /* synthetic */ Channel<R> v0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, Channel channel, Callable callable, Channel channel2, Continuation continuation) {
                super(2, continuation);
                this.f23191r0 = roomDatabase;
                this.f23192s0 = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.f23193t0 = channel;
                this.f23194u0 = callable;
                this.v0 = channel2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.f23191r0, this.f23192s0, this.f23193t0, this.f23194u0, this.v0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0047 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:22:0x0048  */
            /* JADX WARN: Code duplicated, block: B:25:0x0053 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #1 {all -> 0x006b, blocks: (B:19:0x003d, B:23:0x004b, B:25:0x0053), top: B:36:0x003d }] */
            /* JADX WARN: Code duplicated, block: B:27:0x0068 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:28:0x0069  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0069 -> B:36:0x003d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f23190q0
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L28
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.f23189p0
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L15
                    r8 = r1
                    goto L3c
                L15:
                    r8 = move-exception
                    r1 = r7
                    goto L7b
                L18:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L20:
                    kotlinx.coroutines.channels.ChannelIterator r1 = r7.f23189p0
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L15
                    r4 = r1
                    r1 = r7
                    goto L4b
                L28:
                    kotlin.ResultKt.throwOnFailure(r8)
                    androidx.room.RoomDatabase r8 = r7.f23191r0
                    androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r7.f23192s0
                    r8.addObserver(r1)
                    kotlinx.coroutines.channels.Channel<kotlin.Unit> r8 = r7.f23193t0     // Catch: java.lang.Throwable -> L15
                    kotlinx.coroutines.channels.ChannelIterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L15
                L3c:
                    r1 = r7
                L3d:
                    r1.f23189p0 = r8     // Catch: java.lang.Throwable -> L6b
                    r1.f23190q0 = r3     // Catch: java.lang.Throwable -> L6b
                    java.lang.Object r4 = r8.hasNext(r1)     // Catch: java.lang.Throwable -> L6b
                    if (r4 != r0) goto L48
                    return r0
                L48:
                    r6 = r4
                    r4 = r8
                    r8 = r6
                L4b:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L6b
                    boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L6b
                    if (r8 == 0) goto L6d
                    r4.next()     // Catch: java.lang.Throwable -> L6b
                    java.util.concurrent.Callable<R> r8 = r1.f23194u0     // Catch: java.lang.Throwable -> L6b
                    java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L6b
                    kotlinx.coroutines.channels.Channel<R> r5 = r1.v0     // Catch: java.lang.Throwable -> L6b
                    r1.f23189p0 = r4     // Catch: java.lang.Throwable -> L6b
                    r1.f23190q0 = r2     // Catch: java.lang.Throwable -> L6b
                    java.lang.Object r8 = r5.send(r8, r1)     // Catch: java.lang.Throwable -> L6b
                    if (r8 != r0) goto L69
                    return r0
                L69:
                    r8 = r4
                    goto L3d
                L6b:
                    r8 = move-exception
                    goto L7b
                L6d:
                    androidx.room.RoomDatabase r8 = r1.f23191r0
                    androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r0 = r1.f23192s0
                    r8.removeObserver(r0)
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                L7b:
                    androidx.room.RoomDatabase r0 = r1.f23191r0
                    androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r1.f23192s0
                    r0.removeObserver(r1)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, RoomDatabase roomDatabase, FlowCollector<R> flowCollector, String[] strArr, Callable<R> callable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f23185r0 = z10;
            this.f23186s0 = roomDatabase;
            this.f23187t0 = flowCollector;
            this.f23188u0 = strArr;
            this.v0 = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23185r0, this.f23186s0, this.f23187t0, this.f23188u0, this.v0, continuation);
            anonymousClass1.f23184q0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ContinuationInterceptor transactionDispatcher;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f23183p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f23184q0;
                final Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                final String[] strArr = this.f23188u0;
                ?? r10 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(@NotNull Set<String> tables) {
                        channelChannel$default.mo5953trySendJP2dKIU(Unit.INSTANCE);
                    }
                };
                channelChannel$default.mo5953trySendJP2dKIU(Unit.INSTANCE);
                TransactionElement transactionElement = (TransactionElement) coroutineScope.getCoroutineContext().get(TransactionElement.INSTANCE);
                if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                    boolean z10 = this.f23185r0;
                    RoomDatabase roomDatabase = this.f23186s0;
                    transactionDispatcher = z10 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
                }
                Channel channelChannel$default2 = ChannelKt.Channel$default(0, null, null, 7, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, transactionDispatcher, null, new a(this.f23186s0, r10, channelChannel$default, this.v0, channelChannel$default2, null), 2, null);
                this.f23183p0 = 1;
                if (FlowKt.emitAll(this.f23187t0, channelChannel$default2, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z10, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, Continuation<? super CoroutinesRoom$Companion$createFlow$1> continuation) {
        super(2, continuation);
        this.f23179r0 = z10;
        this.f23180s0 = roomDatabase;
        this.f23181t0 = strArr;
        this.f23182u0 = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.f23179r0, this.f23180s0, this.f23181t0, this.f23182u0, continuation);
        coroutinesRoom$Companion$createFlow$1.f23178q0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((CoroutinesRoom$Companion$createFlow$1) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f23177p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23179r0, this.f23180s0, (FlowCollector) this.f23178q0, this.f23181t0, this.f23182u0, null);
            this.f23177p0 = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
