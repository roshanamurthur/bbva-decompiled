package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.Consumer;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Landroidx/window/layout/WindowMetricsCalculator;", "windowMetricsCalculator", "Landroidx/window/layout/WindowBackend;", "windowBackend", "<init>", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/WindowBackend;)V", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
public final class WindowInfoTrackerImpl implements WindowInfoTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowMetricsCalculator f24216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WindowBackend f24217b;

    /* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
    @DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "$this$flow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super WindowLayoutInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Consumer f24218p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ChannelIterator f24219q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f24220r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f24221s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Activity f24223u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f24223u0 = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = WindowInfoTrackerImpl.this.new a(this.f24223u0, continuation);
            aVar.f24221s0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super WindowLayoutInfo> flowCollector, Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:25:0x007a A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:19:0x0060, B:23:0x0072, B:25:0x007a), top: B:35:0x0060 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x008e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008f -> B:35:0x0060). Please report as a decompilation issue!!! */
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
                int r1 = r9.f24220r0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L35
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.f24219q0
                androidx.core.util.Consumer r4 = r9.f24218p0
                java.lang.Object r5 = r9.f24221s0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L1b
                r10 = r5
                goto L5f
            L1b:
                r10 = move-exception
                r5 = r9
                goto L9f
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                kotlinx.coroutines.channels.ChannelIterator r1 = r9.f24219q0
                androidx.core.util.Consumer r4 = r9.f24218p0
                java.lang.Object r5 = r9.f24221s0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L1b
                r6 = r5
                r5 = r9
                goto L72
            L35:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f24221s0
                kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                r4 = 10
                r5 = 0
                r6 = 4
                kotlinx.coroutines.channels.Channel r1 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r4, r1, r5, r6, r5)
                androidx.window.layout.l r4 = new androidx.window.layout.l
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                a3.f r6 = new a3.f
                r6.<init>(r3)
                android.app.Activity r7 = r9.f24223u0
                r5.registerLayoutChangeCallback(r7, r6, r4)
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L5f:
                r5 = r9
            L60:
                r5.f24221s0 = r10     // Catch: java.lang.Throwable -> L91
                r5.f24218p0 = r4     // Catch: java.lang.Throwable -> L91
                r5.f24219q0 = r1     // Catch: java.lang.Throwable -> L91
                r5.f24220r0 = r3     // Catch: java.lang.Throwable -> L91
                java.lang.Object r6 = r1.hasNext(r5)     // Catch: java.lang.Throwable -> L91
                if (r6 != r0) goto L6f
                return r0
            L6f:
                r8 = r6
                r6 = r10
                r10 = r8
            L72:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L91
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L91
                if (r10 == 0) goto L93
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L91
                androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> L91
                r5.f24221s0 = r6     // Catch: java.lang.Throwable -> L91
                r5.f24218p0 = r4     // Catch: java.lang.Throwable -> L91
                r5.f24219q0 = r1     // Catch: java.lang.Throwable -> L91
                r5.f24220r0 = r2     // Catch: java.lang.Throwable -> L91
                java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> L91
                if (r10 != r0) goto L8f
                return r0
            L8f:
                r10 = r6
                goto L60
            L91:
                r10 = move-exception
                goto L9f
            L93:
                androidx.window.layout.WindowInfoTrackerImpl r10 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
                r10.unregisterLayoutChangeCallback(r4)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L9f:
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public WindowInfoTrackerImpl(@NotNull WindowMetricsCalculator windowMetricsCalculator, @NotNull WindowBackend windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.f24216a = windowMetricsCalculator;
        this.f24217b = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    @NotNull
    public Flow<WindowLayoutInfo> windowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return FlowKt.flow(new a(activity, null));
    }
}
