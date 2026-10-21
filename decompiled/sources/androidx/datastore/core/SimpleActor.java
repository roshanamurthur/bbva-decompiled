package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\t\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\f\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/datastore/core/SimpleActor;", ExifInterface.GPS_DIRECTION_TRUE, "", NotificationCompat.CATEGORY_MESSAGE, "", "offer", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function1;", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/Continuation;", "consumeMessage", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class SimpleActor<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f20645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function2<T, Continuation<? super Unit>, Object> f20646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Channel<T> f20647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f20648d;

    /* JADX INFO: compiled from: SimpleActor.kt */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Throwable, Unit> f20649p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SimpleActor<T> f20650q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<T, Throwable, Unit> f20651r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, Unit> function1, SimpleActor<T> simpleActor, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.f20649p0 = function1;
            this.f20650q0 = simpleActor;
            this.f20651r0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Unit unit;
            Throwable th3 = th2;
            this.f20649p0.invoke(th3);
            SimpleActor<T> simpleActor = this.f20650q0;
            simpleActor.f20647c.close(th3);
            do {
                Object objM5968getOrNullimpl = ChannelResult.m5968getOrNullimpl(simpleActor.f20647c.mo5958tryReceivePtdJZtk());
                if (objM5968getOrNullimpl == null) {
                    unit = null;
                } else {
                    this.f20651r0.invoke((T) objM5968getOrNullimpl, th3);
                    unit = Unit.INSTANCE;
                }
            } while (unit != null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SimpleActor.kt */
    @DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function2 f20652p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f20653q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SimpleActor<T> f20654r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SimpleActor<T> simpleActor, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f20654r0 = simpleActor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f20654r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0050  */
        /* JADX WARN: Code duplicated, block: B:19:0x005f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0060  */
        /* JADX WARN: Code duplicated, block: B:23:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0060 -> B:21:0x0062). Please report as a decompilation issue!!! */
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
                int r1 = r7.f20653q0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
                goto L62
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.jvm.functions.Function2 r1 = r7.f20652p0
                kotlin.ResultKt.throwOnFailure(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L54
            L24:
                kotlin.ResultKt.throwOnFailure(r8)
                androidx.datastore.core.SimpleActor<T> r8 = r7.f20654r0
                java.util.concurrent.atomic.AtomicInteger r8 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L71
                r8 = r7
            L34:
                androidx.datastore.core.SimpleActor<T> r1 = r8.f20654r0
                kotlinx.coroutines.CoroutineScope r4 = androidx.datastore.core.SimpleActor.access$getScope$p(r1)
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(r4)
                kotlin.jvm.functions.Function2 r4 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r1)
                kotlinx.coroutines.channels.Channel r1 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r1)
                r8.f20652p0 = r4
                r8.f20653q0 = r3
                java.lang.Object r1 = r1.receive(r8)
                if (r1 != r0) goto L50
                return r0
            L50:
                r6 = r0
                r0 = r8
                r8 = r1
                r1 = r6
            L54:
                r5 = 0
                r0.f20652p0 = r5
                r0.f20653q0 = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L60
                return r1
            L60:
                r8 = r0
                r0 = r1
            L62:
                androidx.datastore.core.SimpleActor<T> r1 = r8.f20654r0
                java.util.concurrent.atomic.AtomicInteger r1 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L34
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L71:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(@NotNull CoroutineScope scope, @NotNull Function1<? super Throwable, Unit> onComplete, @NotNull Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f20645a = scope;
        this.f20646b = consumeMessage;
        this.f20647c = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.f20648d = new AtomicInteger(0);
        Job job = (Job) scope.getCoroutineContext().get(Job.INSTANCE);
        if (job == null) {
            return;
        }
        job.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
    }

    public final void offer(T msg) throws Throwable {
        Object objMo5953trySendJP2dKIU = this.f20647c.mo5953trySendJP2dKIU(msg);
        if (objMo5953trySendJP2dKIU instanceof ChannelResult.Closed) {
            Throwable thM5967exceptionOrNullimpl = ChannelResult.m5967exceptionOrNullimpl(objMo5953trySendJP2dKIU);
            if (thM5967exceptionOrNullimpl != null) {
                throw thM5967exceptionOrNullimpl;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.m5973isSuccessimpl(objMo5953trySendJP2dKIU)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f20648d.getAndIncrement() == 0) {
            BuildersKt__Builders_commonKt.launch$default(this.f20645a, null, null, new b(this, null), 3, null);
        }
    }
}
