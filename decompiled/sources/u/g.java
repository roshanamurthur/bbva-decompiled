package u;

import androidx.compose.foundation.gestures.ScrollConfig;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends DelegatingNode implements PointerInputModifierNode {

    @NotNull
    public State<ScrollingLogic> J0;

    @NotNull
    public ScrollConfig K0;

    @NotNull
    public final SuspendingPointerInputModifierNode L0;

    /* JADX INFO: compiled from: Scrollable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1", f = "Scrollable.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f93650p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f93651q0;

        /* JADX INFO: renamed from: u.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Scrollable.kt */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1", f = "Scrollable.kt", i = {0}, l = {338}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$pointerInputNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,637:1\n86#2,2:638\n33#2,6:640\n88#2:646\n33#2,6:647\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollNode$pointerInputNode$1$1\n*L\n339#1:638,2\n339#1:640,6\n339#1:646\n346#1:647,6\n*E\n"})
        public static final class C0495a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f93653p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f93654q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ g f93655r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0495a(g gVar, Continuation<? super C0495a> continuation) {
                super(2, continuation);
                this.f93655r0 = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0495a c0495a = new C0495a(this.f93655r0, continuation);
                c0495a.f93654q0 = obj;
                return c0495a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C0495a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0045  */
            /* JADX WARN: Code duplicated, block: B:18:0x0053 A[LOOP:0: B:14:0x0043->B:18:0x0053, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:22:0x007e  */
            /* JADX WARN: Code duplicated, block: B:24:0x0088 A[LOOP:1: B:23:0x0086->B:24:0x0088, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:26:0x0094 A[EDGE_INSN: B:26:0x0094->B:25:0x0094 BREAK  A[LOOP:0: B:14:0x0043->B:18:0x0053], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:27:0x0056 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x007e
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                    int r1 = r10.f93653p0
                    r2 = 1
                    if (r1 == 0) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r10.f93654q0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r11)
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    goto L37
                L16:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1e:
                    kotlin.ResultKt.throwOnFailure(r11)
                    java.lang.Object r11 = r10.f93654q0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                    r1 = r11
                    r11 = r10
                L27:
                    r11.f93654q0 = r1
                    r11.f93653p0 = r2
                    java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r1, r11)
                    if (r3 != r0) goto L32
                    return r0
                L32:
                    r9 = r0
                    r0 = r11
                    r11 = r3
                    r3 = r1
                    r1 = r9
                L37:
                    androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
                    java.util.List r4 = r11.getChanges()
                    int r5 = r4.size()
                    r6 = 0
                    r7 = r6
                L43:
                    if (r7 >= r5) goto L56
                    java.lang.Object r8 = r4.get(r7)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                    boolean r8 = r8.isConsumed()
                    r8 = r8 ^ r2
                    if (r8 != 0) goto L53
                    goto L94
                L53:
                    int r7 = r7 + 1
                    goto L43
                L56:
                    u.g r4 = r0.f93655r0
                    androidx.compose.foundation.gestures.ScrollConfig r5 = r4.K0
                    long r7 = r3.mo3396getSizeYbymL2g()
                    long r7 = r5.mo217calculateMouseWheelScroll8xgXZGE(r3, r11, r7)
                    androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r4.J0
                    java.lang.Object r4 = r4.getValue()
                    androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                    float r5 = r4.f(r7)
                    float r5 = r4.e(r5)
                    androidx.compose.foundation.gestures.ScrollableState r4 = r4.f3843d
                    float r4 = r4.dispatchRawDelta(r5)
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 != 0) goto L7e
                    goto L94
                L7e:
                    java.util.List r11 = r11.getChanges()
                    int r4 = r11.size()
                L86:
                    if (r6 >= r4) goto L94
                    java.lang.Object r5 = r11.get(r6)
                    androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
                    r5.consume()
                    int r6 = r6 + 1
                    goto L86
                L94:
                    r11 = r0
                    r0 = r1
                    r1 = r3
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: u.g.a.C0495a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f93651q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((a) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f93650p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f93651q0;
                C0495a c0495a = new C0495a(g.this, null);
                this.f93650p0 = 1;
                if (pointerInputScope.awaitPointerEventScope(c0495a, this) == coroutine_suspended) {
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

    public g(@NotNull State<ScrollingLogic> scrollingLogicState, @NotNull ScrollConfig mouseWheelScrollConfig) {
        Intrinsics.checkNotNullParameter(scrollingLogicState, "scrollingLogicState");
        Intrinsics.checkNotNullParameter(mouseWheelScrollConfig, "mouseWheelScrollConfig");
        this.J0 = scrollingLogicState;
        this.K0 = mouseWheelScrollConfig;
        this.L0 = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new a(null)));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return i1.n.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.L0.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onDensityChange() {
        i1.n.b(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo115onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long j10) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.L0.mo115onPointerEventH0pRuoY(pointerEvent, pass, j10);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onViewConfigurationChange() {
        i1.n.c(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return i1.n.d(this);
    }
}
