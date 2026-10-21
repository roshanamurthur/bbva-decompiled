package u;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
public final class p extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f93688p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f93689q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f93690r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ PointerInputChange f93691s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(PointerInputChange pointerInputChange, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f93691s0 = pointerInputChange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        p pVar = new p(this.f93691s0, continuation);
        pVar.f93690r0 = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
        return ((p) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:13:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
            int r1 = r12.f93689q0
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            long r3 = r12.f93688p0
            java.lang.Object r1 = r12.f93690r0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.throwOnFailure(r13)
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r12
            goto L52
        L19:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L21:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f93690r0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r12.f93691s0
            long r3 = r1.getUptimeMillis()
            androidx.compose.ui.platform.ViewConfiguration r1 = r13.getViewConfiguration()
            long r5 = r1.getDoubleTapMinTimeMillis()
            long r5 = r5 + r3
            r1 = r13
            r9 = r5
            r13 = r12
        L3a:
            r4 = 0
            r5 = 0
            r7 = 3
            r8 = 0
            r13.f93690r0 = r1
            r13.f93688p0 = r9
            r13.f93689q0 = r2
            r3 = r1
            r6 = r13
            java.lang.Object r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r3, r4, r5, r6, r7, r8)
            if (r3 != r0) goto L4d
            return r0
        L4d:
            r11 = r0
            r0 = r13
            r13 = r3
            r3 = r1
            r1 = r11
        L52:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            long r4 = r13.getUptimeMillis()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 < 0) goto L5d
            return r13
        L5d:
            r13 = r0
            r0 = r1
            r1 = r3
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: u.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
