package nc;

import com.bbva.videocapture.command.LaunchVideoCaptureCommand;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LaunchVideoCaptureCommand.kt */
/* JADX INFO: loaded from: classes9.dex */
@DebugMetadata(c = "com.bbva.videocapture.command.LaunchVideoCaptureCommand$processAndEncodeResultCaptures$1", f = "LaunchVideoCaptureCommand.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
@SourceDebugExtension({"SMAP\nLaunchVideoCaptureCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchVideoCaptureCommand.kt\ncom/bbva/videocapture/command/LaunchVideoCaptureCommand$processAndEncodeResultCaptures$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1557#2:79\n1628#2,3:80\n*S KotlinDebug\n*F\n+ 1 LaunchVideoCaptureCommand.kt\ncom/bbva/videocapture/command/LaunchVideoCaptureCommand$processAndEncodeResultCaptures$1\n*L\n66#1:79\n66#1:80,3\n*E\n"})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LaunchVideoCaptureCommand f84497p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Collection f84498q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Iterator f84499r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f84500s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Collection f84501t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f84502u0;
    public final /* synthetic */ LaunchVideoCaptureCommand v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LaunchVideoCaptureCommand launchVideoCaptureCommand, Continuation<? super b> continuation) {
        super(2, continuation);
        this.v0 = launchVideoCaptureCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new b(this.v0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a5, blocks: (B:14:0x0048, B:16:0x0050, B:23:0x008e), top: B:33:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:31:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.bbva.videocapture.command.LaunchVideoCaptureCommand r0 = r9.v0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r9.f84502u0
            r3 = 1
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            java.util.Collection r0 = r9.f84501t0
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String r2 = r9.f84500s0
            java.util.Iterator r4 = r9.f84499r0
            java.util.Collection r5 = r9.f84498q0
            java.util.Collection r5 = (java.util.Collection) r5
            com.bbva.videocapture.command.LaunchVideoCaptureCommand r6 = r9.f84497p0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L21
            r7 = r4
            r4 = r9
            goto L7d
        L21:
            r2 = r9
            goto La5
        L24:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2c:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.List r10 = com.bbva.videocapture.command.LaunchVideoCaptureCommand.access$getCaptures$p(r0)     // Catch: java.lang.Exception -> L21
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Exception -> L21
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L21
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r10, r4)     // Catch: java.lang.Exception -> L21
            r2.<init>(r4)     // Catch: java.lang.Exception -> L21
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L21
            r4 = r10
            r10 = r0
            r0 = r2
            r2 = r9
        L48:
            com.bbva.videocapture.command.LaunchVideoCaptureCommand r5 = r2.v0     // Catch: java.lang.Exception -> La5
            boolean r6 = r4.hasNext()     // Catch: java.lang.Exception -> La5
            if (r6 == 0) goto L8e
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> La5
            com.bbva.videocapture.command.params.response.CachedCapturedVideo r5 = (com.bbva.videocapture.command.params.response.CachedCapturedVideo) r5     // Catch: java.lang.Exception -> La5
            java.lang.String r6 = r5.getId()     // Catch: java.lang.Exception -> La5
            byte[] r5 = r5.getContent()     // Catch: java.lang.Exception -> La5
            r2.f84497p0 = r10     // Catch: java.lang.Exception -> La5
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Exception -> La5
            r2.f84498q0 = r7     // Catch: java.lang.Exception -> La5
            r2.f84499r0 = r4     // Catch: java.lang.Exception -> La5
            r2.f84500s0 = r6     // Catch: java.lang.Exception -> La5
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Exception -> La5
            r2.f84501t0 = r7     // Catch: java.lang.Exception -> La5
            r2.f84502u0 = r3     // Catch: java.lang.Exception -> La5
            java.lang.Object r5 = com.bbva.videocapture.command.LaunchVideoCaptureCommand.access$createUrl(r10, r5, r2)     // Catch: java.lang.Exception -> La5
            if (r5 != r1) goto L77
            return r1
        L77:
            r7 = r4
            r4 = r2
            r2 = r6
            r6 = r10
            r10 = r5
            r5 = r0
        L7d:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L8c
            com.bbva.videocapture.command.params.response.CapturedVideo r8 = new com.bbva.videocapture.command.params.response.CapturedVideo     // Catch: java.lang.Exception -> L8c
            r8.<init>(r2, r10)     // Catch: java.lang.Exception -> L8c
            r0.add(r8)     // Catch: java.lang.Exception -> L8c
            r2 = r4
            r0 = r5
            r10 = r6
            r4 = r7
            goto L48
        L8c:
            r2 = r4
            goto La5
        L8e:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> La5
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: java.lang.Exception -> La5
            com.google.gson.Gson r1 = com.bbva.videocapture.command.LaunchVideoCaptureCommand.access$getMGson$p$s769395629(r5)     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = r1.toJson(r0)     // Catch: java.lang.Exception -> La5
            r10.<init>(r0)     // Catch: java.lang.Exception -> La5
            com.bbva.androidtoolkit.plugin.command.callback.CommandCallback r0 = com.bbva.videocapture.command.LaunchVideoCaptureCommand.access$getMCommandCallback$p$s769395629(r5)     // Catch: java.lang.Exception -> La5
            r0.sendEvent(r10)     // Catch: java.lang.Exception -> La5
            goto Lb2
        La5:
            com.bbva.videocapture.command.LaunchVideoCaptureCommand r10 = r2.v0
            com.bbva.androidtoolkit.plugin.command.callback.CommandCallback r10 = com.bbva.videocapture.command.LaunchVideoCaptureCommand.access$getMCommandCallback$p$s769395629(r10)
            if (r10 == 0) goto Lb2
            com.bbva.androidtoolkit.plugin.response.Errors r0 = com.bbva.androidtoolkit.plugin.response.Errors.ErrorDefault
            r10.sendError(r0)
        Lb2:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
