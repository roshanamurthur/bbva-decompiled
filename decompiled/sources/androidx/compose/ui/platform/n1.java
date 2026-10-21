package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {115, 121}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
public final class n1 extends SuspendLambda implements Function2<FlowCollector<? super Float>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ChannelIterator f17421p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f17422q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f17423r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f17424s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Uri f17425t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 f17426u0;
    public final /* synthetic */ Channel<Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Context f17427w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, Channel<Unit> channel, Context context, Continuation<? super n1> continuation) {
        super(2, continuation);
        this.f17424s0 = contentResolver;
        this.f17425t0 = uri;
        this.f17426u0 = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.v0 = channel;
        this.f17427w0 = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        n1 n1Var = new n1(this.f17424s0, this.f17425t0, this.f17426u0, this.v0, this.f17427w0, continuation);
        n1Var.f17423r0 = obj;
        return n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Float> flowCollector, Continuation<? super Unit> continuation) {
        return ((n1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:19:0x0049, B:23:0x0059, B:25:0x0061), top: B:35:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0083 -> B:35:0x0049). Please report as a decompilation issue!!! */
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
            int r1 = r9.f17422q0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            kotlinx.coroutines.channels.ChannelIterator r1 = r9.f17421p0
            java.lang.Object r4 = r9.f17423r0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L19
            r10 = r4
            goto L48
        L19:
            r10 = move-exception
            r4 = r9
            goto L91
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            kotlinx.coroutines.channels.ChannelIterator r1 = r9.f17421p0
            java.lang.Object r4 = r9.f17423r0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L19
            r5 = r4
            r4 = r9
            goto L59
        L31:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f17423r0
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            android.content.ContentResolver r1 = r9.f17424s0
            android.net.Uri r4 = r9.f17425t0
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r9.f17426u0
            r1.registerContentObserver(r4, r5, r6)
            kotlinx.coroutines.channels.Channel<kotlin.Unit> r1 = r9.v0     // Catch: java.lang.Throwable -> L19
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L19
        L48:
            r4 = r9
        L49:
            r4.f17423r0 = r10     // Catch: java.lang.Throwable -> L85
            r4.f17421p0 = r1     // Catch: java.lang.Throwable -> L85
            r4.f17422q0 = r3     // Catch: java.lang.Throwable -> L85
            java.lang.Object r5 = r1.hasNext(r4)     // Catch: java.lang.Throwable -> L85
            if (r5 != r0) goto L56
            return r0
        L56:
            r8 = r5
            r5 = r10
            r10 = r8
        L59:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L85
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L87
            r1.next()     // Catch: java.lang.Throwable -> L85
            android.content.Context r10 = r4.f17427w0     // Catch: java.lang.Throwable -> L85
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r10)     // Catch: java.lang.Throwable -> L85
            r4.f17423r0 = r5     // Catch: java.lang.Throwable -> L85
            r4.f17421p0 = r1     // Catch: java.lang.Throwable -> L85
            r4.f17422q0 = r2     // Catch: java.lang.Throwable -> L85
            java.lang.Object r10 = r5.emit(r10, r4)     // Catch: java.lang.Throwable -> L85
            if (r10 != r0) goto L83
            return r0
        L83:
            r10 = r5
            goto L49
        L85:
            r10 = move-exception
            goto L91
        L87:
            android.content.ContentResolver r10 = r4.f17424s0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r4.f17426u0
            r10.unregisterContentObserver(r0)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L91:
            android.content.ContentResolver r0 = r4.f17424s0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r4.f17426u0
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
