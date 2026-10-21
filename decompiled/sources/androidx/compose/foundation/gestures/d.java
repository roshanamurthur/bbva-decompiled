package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$1", f = "Transformable.kt", i = {0, 0, 1}, l = {105, 108}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "event", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0"})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Ref.ObjectRef f4026p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Ref.ObjectRef f4027q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f4028r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f4029s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Channel<TransformEvent> f4030t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ TransformableState f4031u0;

    /* JADX INFO: compiled from: Transformable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1", f = "Transformable.kt", i = {0}, l = {113}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.ObjectRef f4032p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f4033q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f4034r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<TransformEvent> f4035s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Channel<TransformEvent> f4036t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<TransformEvent> objectRef, Channel<TransformEvent> channel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4035s0 = objectRef;
            this.f4036t0 = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f4035s0, this.f4036t0, continuation);
            aVar.f4034r0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((a) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        /* JADX WARN: Code duplicated, block: B:14:0x0039  */
        /* JADX WARN: Code duplicated, block: B:16:0x003c  */
        /* JADX WARN: Code duplicated, block: B:19:0x0059 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x005a  */
        /* JADX WARN: Code duplicated, block: B:22:0x0066  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005a -> B:21:0x0060). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r9.f4033q0
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                kotlin.jvm.internal.Ref$ObjectRef r1 = r9.f4032p0
                java.lang.Object r3 = r9.f4034r0
                androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                kotlin.ResultKt.throwOnFailure(r10)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L60
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f4034r0
                androidx.compose.foundation.gestures.TransformScope r10 = (androidx.compose.foundation.gestures.TransformScope) r10
                r3 = r10
                r10 = r9
            L2a:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r10.f4035s0
                T r4 = r1.element
                boolean r5 = r4 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                if (r5 != 0) goto L66
                boolean r5 = r4 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                if (r5 == 0) goto L39
                androidx.compose.foundation.gestures.TransformEvent$TransformDelta r4 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r4
                goto L3a
            L39:
                r4 = 0
            L3a:
                if (r4 == 0) goto L4b
                float r5 = r4.getZoomChange()
                long r6 = r4.getPanChange()
                float r4 = r4.getRotationChange()
                r3.mo177transformByd4ec7I(r5, r6, r4)
            L4b:
                r10.f4034r0 = r3
                r10.f4032p0 = r1
                r10.f4033q0 = r2
                kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r4 = r10.f4036t0
                java.lang.Object r4 = r4.receive(r10)
                if (r4 != r0) goto L5a
                return r0
            L5a:
                r8 = r0
                r0 = r10
                r10 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L60:
                r3.element = r10
                r10 = r0
                r0 = r1
                r3 = r4
                goto L2a
            L66:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Channel<TransformEvent> channel, TransformableState transformableState, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f4030t0 = channel;
        this.f4031u0 = transformableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        d dVar = new d(this.f4030t0, this.f4031u0, continuation);
        dVar.f4029s0 = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
            int r1 = r11.f4028r0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r11.f4029s0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L15
        L15:
            r12 = r1
            goto L34
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r11.f4027q0
            kotlin.jvm.internal.Ref$ObjectRef r4 = r11.f4026p0
            java.lang.Object r5 = r11.f4029s0
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            kotlin.ResultKt.throwOnFailure(r12)
            r6 = r4
            r4 = r11
            goto L57
        L2d:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.f4029s0
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
        L34:
            r1 = r11
        L35:
            boolean r4 = kotlinx.coroutines.CoroutineScopeKt.isActive(r12)
            if (r4 == 0) goto L7d
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            r1.f4029s0 = r12
            r1.f4026p0 = r4
            r1.f4027q0 = r4
            r1.f4028r0 = r3
            kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r5 = r1.f4030t0
            java.lang.Object r5 = r5.receive(r1)
            if (r5 != r0) goto L51
            return r0
        L51:
            r6 = r4
            r4 = r1
            r1 = r6
            r10 = r5
            r5 = r12
            r12 = r10
        L57:
            r1.element = r12
            T r12 = r6.element
            boolean r12 = r12 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
            if (r12 == 0) goto L7a
            androidx.compose.foundation.gestures.TransformableState r12 = r4.f4031u0     // Catch: java.util.concurrent.CancellationException -> L7a
            androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L7a
            androidx.compose.foundation.gestures.d$a r7 = new androidx.compose.foundation.gestures.d$a     // Catch: java.util.concurrent.CancellationException -> L7a
            kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r8 = r4.f4030t0     // Catch: java.util.concurrent.CancellationException -> L7a
            r9 = 0
            r7.<init>(r6, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L7a
            r4.f4029s0 = r5     // Catch: java.util.concurrent.CancellationException -> L7a
            r4.f4026p0 = r9     // Catch: java.util.concurrent.CancellationException -> L7a
            r4.f4027q0 = r9     // Catch: java.util.concurrent.CancellationException -> L7a
            r4.f4028r0 = r2     // Catch: java.util.concurrent.CancellationException -> L7a
            java.lang.Object r12 = r12.transform(r1, r7, r4)     // Catch: java.util.concurrent.CancellationException -> L7a
            if (r12 != r0) goto L7a
            return r0
        L7a:
            r1 = r4
            r12 = r5
            goto L35
        L7d:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
