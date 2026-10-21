package androidx.compose.ui.input.pointer;

import e1.d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1", f = "PointerIcon.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f16492p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f16493q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ d f16494r0;

    /* JADX INFO: compiled from: PointerIcon.kt */
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1$1", f = "PointerIcon.kt", i = {0}, l = {112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    public static final class a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f16495p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f16496q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ d f16497r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16497r0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f16497r0, continuation);
            aVar.f16496q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0033 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0034  */
        /* JADX WARN: Code duplicated, block: B:15:0x004d  */
        /* JADX WARN: Code duplicated, block: B:17:0x0053  */
        /* JADX WARN: Code duplicated, block: B:19:0x0059  */
        /* JADX WARN: Code duplicated, block: B:21:0x0064  */
        /* JADX WARN: Code duplicated, block: B:23:0x0072  */
        /* JADX WARN: Code duplicated, block: B:25:0x007a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x007c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:13:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0034
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r8.f16495p0
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r8.f16496q0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r9)
                r3 = r1
                r1 = r0
                r0 = r8
                goto L39
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f16496q0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
                r1 = r9
                r9 = r8
            L27:
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                r9.f16496q0 = r1
                r9.f16495p0 = r2
                java.lang.Object r3 = r1.awaitPointerEvent(r3, r9)
                if (r3 != r0) goto L34
                return r0
            L34:
                r7 = r0
                r0 = r9
                r9 = r3
                r3 = r1
                r1 = r7
            L39:
                androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
                int r4 = r9.getType()
                androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                int r6 = r5.m3432getEnter7fucELk()
                boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m3428equalsimpl0(r4, r6)
                e1.d r6 = r0.f16497r0
                if (r4 == 0) goto L64
                r6.f68265f = r2
                boolean r9 = r6.f68264e
                if (r9 != 0) goto L89
                e1.d r9 = r6.c()
                if (r9 == 0) goto L5c
                r9.e()
            L5c:
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerIcon, kotlin.Unit> r9 = r6.f68262c
                androidx.compose.ui.input.pointer.PointerIcon r4 = r6.f68260a
                r9.invoke(r4)
                goto L89
            L64:
                int r9 = r9.getType()
                int r4 = r5.m3433getExit7fucELk()
                boolean r9 = androidx.compose.ui.input.pointer.PointerEventType.m3428equalsimpl0(r9, r4)
                if (r9 == 0) goto L89
                e1.d r9 = r6.c()
                boolean r4 = r6.f68265f
                if (r4 == 0) goto L86
                if (r9 != 0) goto L83
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerIcon, kotlin.Unit> r9 = r6.f68262c
                r4 = 0
                r9.invoke(r4)
                goto L86
            L83:
                r9.f()
            L86:
                r9 = 0
                r6.f68265f = r9
            L89:
                r9 = r0
                r0 = r1
                r1 = r3
                goto L27
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f16494r0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        c cVar = new c(this.f16494r0, continuation);
        cVar.f16493q0 = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((c) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f16492p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f16493q0;
            a aVar = new a(this.f16494r0, null);
            this.f16492p0 = 1;
            if (pointerInputScope.awaitPointerEventScope(aVar, this) == coroutine_suspended) {
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
