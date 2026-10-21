package b0;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1", f = "LazyLayoutPager.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f24745p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f24746q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ PagerState f24747r0;

    /* JADX INFO: compiled from: LazyLayoutPager.kt */
    @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f24748p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f24749q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PagerState f24750r0;

        /* JADX INFO: renamed from: b0.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LazyLayoutPager.kt */
        @DebugMetadata(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", i = {0, 1, 1, 1}, l = {268, 271}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "downEvent", "upEventOrCancellation"}, s = {"L$0", "L$0", "L$1", "L$2"})
        @SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,282:1\n86#2,2:283\n33#2,6:285\n88#2:291\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1$1$1\n*L\n272#1:283,2\n272#1:285,6\n272#1:291\n*E\n"})
        public static final class C0109a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public PointerInputChange f24751p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public PointerInputChange f24752q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f24753r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public /* synthetic */ Object f24754s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ PagerState f24755t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0109a(PagerState pagerState, Continuation<? super C0109a> continuation) {
                super(2, continuation);
                this.f24755t0 = pagerState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0109a c0109a = new C0109a(this.f24755t0, continuation);
                c0109a.f24754s0 = obj;
                return c0109a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C0109a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0073  */
            /* JADX WARN: Code duplicated, block: B:24:0x0085 A[LOOP:0: B:20:0x0071->B:24:0x0085, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:28:0x0088 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:29:0x007f A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005f -> B:19:0x0066). Please report as a decompilation issue!!! */
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
                    int r1 = r12.f24753r0
                    r2 = 1
                    r3 = 2
                    r4 = 0
                    if (r1 == 0) goto L30
                    if (r1 == r2) goto L28
                    if (r1 != r3) goto L20
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = r12.f24752q0
                    androidx.compose.ui.input.pointer.PointerInputChange r2 = r12.f24751p0
                    java.lang.Object r5 = r12.f24754s0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                    kotlin.ResultKt.throwOnFailure(r13)
                    r6 = r5
                    r5 = r2
                    r2 = r1
                    r1 = r0
                    r0 = r12
                    goto L66
                L20:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L28:
                    java.lang.Object r1 = r12.f24754s0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r13)
                    goto L45
                L30:
                    kotlin.ResultKt.throwOnFailure(r13)
                    java.lang.Object r13 = r12.f24754s0
                    r1 = r13
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r12.f24754s0 = r1
                    r12.f24753r0 = r2
                    java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r4, r13, r12)
                    if (r13 != r0) goto L45
                    return r0
                L45:
                    androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                    r2 = 0
                    r5 = r1
                    r1 = r2
                    r2 = r13
                    r13 = r12
                L4c:
                    if (r1 != 0) goto L99
                    androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r13.f24754s0 = r5
                    r13.f24751p0 = r2
                    r13.f24752q0 = r1
                    r13.f24753r0 = r3
                    java.lang.Object r6 = r5.awaitPointerEvent(r6, r13)
                    if (r6 != r0) goto L5f
                    return r0
                L5f:
                    r11 = r0
                    r0 = r13
                    r13 = r6
                    r6 = r5
                    r5 = r2
                    r2 = r1
                    r1 = r11
                L66:
                    androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                    java.util.List r7 = r13.getChanges()
                    int r8 = r7.size()
                    r9 = r4
                L71:
                    if (r9 >= r8) goto L88
                    java.lang.Object r10 = r7.get(r9)
                    androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                    boolean r10 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r10)
                    if (r10 != 0) goto L85
                    r13 = r0
                    r0 = r1
                    r1 = r2
                    r2 = r5
                    r5 = r6
                    goto L4c
                L85:
                    int r9 = r9 + 1
                    goto L71
                L88:
                    java.util.List r13 = r13.getChanges()
                    java.lang.Object r13 = r13.get(r4)
                    androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                    r2 = r5
                    r5 = r6
                    r11 = r1
                    r1 = r13
                    r13 = r0
                    r0 = r11
                    goto L4c
                L99:
                    long r0 = r1.getPosition()
                    long r2 = r2.getPosition()
                    long r0 = androidx.compose.ui.geometry.Offset.m2279minusMKHz9U(r0, r2)
                    androidx.compose.foundation.pager.PagerState r13 = r13.f24755t0
                    r13.m456setUpDownDifferencek4lQ0M$foundation_release(r0)
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: b0.b.a.C0109a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PointerInputScope pointerInputScope, PagerState pagerState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f24749q0 = pointerInputScope;
            this.f24750r0 = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f24749q0, this.f24750r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f24748p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0109a c0109a = new C0109a(this.f24750r0, null);
                this.f24748p0 = 1;
                if (ForEachGestureKt.awaitEachGesture(this.f24749q0, c0109a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PagerState pagerState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f24747r0 = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        b bVar = new b(this.f24747r0, continuation);
        bVar.f24746q0 = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((b) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f24745p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = new a((PointerInputScope) this.f24746q0, this.f24747r0, null);
            this.f24745p0 = 1;
            if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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
