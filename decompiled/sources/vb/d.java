package vb;

import com.bbva.selfiecapture.plugin.command.LaunchSelfieCaptureCommand;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LaunchSelfieCaptureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.selfiecapture.plugin.command.LaunchSelfieCaptureCommand$processAndEncodeResultCaptures$1", f = "LaunchSelfieCaptureCommand.kt", i = {0, 1, 1}, l = {127, 130}, m = "invokeSuspend", n = {"destination$iv$iv", "destination$iv$iv", "it"}, s = {"L$1", "L$1", "L$3"})
@SourceDebugExtension({"SMAP\nLaunchSelfieCaptureCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchSelfieCaptureCommand.kt\ncom/bbva/selfiecapture/plugin/command/LaunchSelfieCaptureCommand$processAndEncodeResultCaptures$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1557#2:166\n1628#2,3:167\n*S KotlinDebug\n*F\n+ 1 LaunchSelfieCaptureCommand.kt\ncom/bbva/selfiecapture/plugin/command/LaunchSelfieCaptureCommand$processAndEncodeResultCaptures$1\n*L\n124#1:166\n124#1:167,3\n*E\n"})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public LaunchSelfieCaptureCommand f94011p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Collection f94012q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Iterator f94013r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Object f94014s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Object f94015t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Collection f94016u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ LaunchSelfieCaptureCommand f94017w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LaunchSelfieCaptureCommand launchSelfieCaptureCommand, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f94017w0 = launchSelfieCaptureCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new d(this.f94017w0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0075 A[Catch: Exception -> 0x0127, TryCatch #2 {Exception -> 0x0127, blocks: (B:37:0x0104, B:18:0x006d, B:20:0x0075, B:22:0x007f, B:29:0x00bb, B:31:0x00bf, B:38:0x010a, B:39:0x010f, B:40:0x0110), top: B:51:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x007f A[Catch: Exception -> 0x0127, TRY_LEAVE, TryCatch #2 {Exception -> 0x0127, blocks: (B:37:0x0104, B:18:0x006d, B:20:0x0075, B:22:0x007f, B:29:0x00bb, B:31:0x00bf, B:38:0x010a, B:39:0x010f, B:40:0x0110), top: B:51:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[Catch: Exception -> 0x0127, TRY_ENTER, TryCatch #2 {Exception -> 0x0127, blocks: (B:37:0x0104, B:18:0x006d, B:20:0x0075, B:22:0x007f, B:29:0x00bb, B:31:0x00bf, B:38:0x010a, B:39:0x010f, B:40:0x0110), top: B:51:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf A[Catch: Exception -> 0x0127, TRY_LEAVE, TryCatch #2 {Exception -> 0x0127, blocks: (B:37:0x0104, B:18:0x006d, B:20:0x0075, B:22:0x007f, B:29:0x00bb, B:31:0x00bf, B:38:0x010a, B:39:0x010f, B:40:0x0110), top: B:51:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a A[Catch: Exception -> 0x0127, TryCatch #2 {Exception -> 0x0127, blocks: (B:37:0x0104, B:18:0x006d, B:20:0x0075, B:22:0x007f, B:29:0x00bb, B:31:0x00bf, B:38:0x010a, B:39:0x010f, B:40:0x0110), top: B:51:0x0104 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b5 -> B:51:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ea -> B:49:0x00f2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
