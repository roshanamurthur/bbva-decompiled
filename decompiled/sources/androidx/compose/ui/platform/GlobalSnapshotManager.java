package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "", "ensureStarted", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class GlobalSnapshotManager {

    @NotNull
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f17222a = new AtomicBoolean(false);

    /* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
    @DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,55:1\n103#2:56\n80#2,6:57\n104#2,2:63\n90#2:65\n86#2,4:66\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n45#1:56\n45#1:57,6\n45#1:63,2\n45#1:65\n45#1:66,4\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ReceiveChannel f17223p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ChannelIterator f17224q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f17225r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Channel<Unit> f17226s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Channel<Unit> channel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17226s0 = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f17226s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0038 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0039  */
        /* JADX WARN: Code duplicated, block: B:20:0x0047 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:18:0x003f, B:20:0x0047), top: B:32:0x003f }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0039 -> B:32:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r6.f17225r0
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                kotlinx.coroutines.channels.ChannelIterator r1 = r6.f17224q0
                kotlinx.coroutines.channels.ReceiveChannel r3 = r6.f17223p0
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L17
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r6
                goto L3f
            L17:
                r7 = move-exception
                goto L61
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.channels.Channel<kotlin.Unit> r3 = r6.f17226s0
                kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r7
                r7 = r6
            L2c:
                r7.f17223p0 = r3     // Catch: java.lang.Throwable -> L17
                r7.f17224q0 = r1     // Catch: java.lang.Throwable -> L17
                r7.f17225r0 = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r4 = r1.hasNext(r7)     // Catch: java.lang.Throwable -> L17
                if (r4 != r0) goto L39
                return r0
            L39:
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L3f:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L57
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L57
                if (r7 == 0) goto L5a
                java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L57
                kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Throwable -> L57
                androidx.compose.runtime.snapshots.Snapshot$Companion r7 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L57
                r7.sendApplyNotifications()     // Catch: java.lang.Throwable -> L57
                r7 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2c
            L57:
                r7 = move-exception
                r3 = r4
                goto L61
            L5a:
                r7 = 0
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L61:
                throw r7     // Catch: java.lang.Throwable -> L62
            L62:
                r0 = move-exception
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
    public static final class b extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Channel<Unit> f17227p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Channel<Unit> channel) {
            super(1);
            this.f17227p0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Unit unit = Unit.INSTANCE;
            this.f17227p0.mo5953trySendJP2dKIU(unit);
            return unit;
        }
    }

    public final void ensureStarted() {
        if (f17222a.compareAndSet(false, true)) {
            Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.INSTANCE.getMain()), null, null, new a(channelChannel$default, null), 3, null);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new b(channelChannel$default));
        }
    }
}
