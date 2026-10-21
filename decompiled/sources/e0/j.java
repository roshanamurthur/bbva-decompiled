package e0;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LongPressTextDragObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {99, 103}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,125:1\n101#2,2:126\n33#2,6:128\n103#2:134\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n104#1:126,2\n104#1:128,6\n104#1:134\n*E\n"})
public final class j extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PointerInputChange f68235p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f68236q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f68237r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f68238s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TextDragObserver textDragObserver, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f68238s0 = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        j jVar = new j(this.f68238s0, continuation);
        jVar.f68237r0 = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((j) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:18:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0072
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
            int r1 = r14.f68236q0
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L24
            if (r1 != r3) goto L1c
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r14.f68235p0
            java.lang.Object r4 = r14.f68237r0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            kotlin.ResultKt.throwOnFailure(r15)
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r14
            goto L67
        L1c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L24:
            java.lang.Object r1 = r14.f68237r0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L45
        L2c:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.f68237r0
            r1 = r15
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r5 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r14.f68237r0 = r1
            r14.f68236q0 = r2
            r4 = r1
            r7 = r14
            java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
            if (r15 != r0) goto L45
            return r0
        L45:
            androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
            long r4 = r15.getPosition()
            androidx.compose.foundation.text.TextDragObserver r6 = r14.f68238s0
            r6.mo538onDownk4lQ0M(r4)
            r4 = r1
            r1 = r15
            r15 = r14
        L53:
            r15.f68237r0 = r4
            r15.f68235p0 = r1
            r15.f68236q0 = r3
            r5 = 0
            java.lang.Object r5 = e1.a.t(r4, r5, r15, r2, r5)
            if (r5 != r0) goto L61
            return r0
        L61:
            r13 = r0
            r0 = r15
            r15 = r5
            r5 = r4
            r4 = r1
            r1 = r13
        L67:
            androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
            java.util.List r15 = r15.getChanges()
            int r6 = r15.size()
            r7 = 0
        L72:
            if (r7 >= r6) goto L96
            java.lang.Object r8 = r15.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            long r9 = r8.getId()
            long r11 = r4.getId()
            boolean r9 = androidx.compose.ui.input.pointer.PointerId.m3461equalsimpl0(r9, r11)
            if (r9 == 0) goto L93
            boolean r8 = r8.getPressed()
            if (r8 == 0) goto L93
            r15 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L53
        L93:
            int r7 = r7 + 1
            goto L72
        L96:
            androidx.compose.foundation.text.TextDragObserver r15 = r0.f68238s0
            r15.onUp()
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
