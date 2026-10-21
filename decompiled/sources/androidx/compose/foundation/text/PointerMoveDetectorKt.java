package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerMoveDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"detectMoves", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "pointerEventPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "onMove", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PointerMoveDetectorKt {

    /* JADX INFO: compiled from: PointerMoveDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,57:1\n329#2:58\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:58\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f5958p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f5959q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PointerEventPass f5960r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Offset, Unit> f5961s0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PointerMoveDetector.kt */
        @DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
        public static final class C0039a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Ref.ObjectRef f5962p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f5963q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public /* synthetic */ Object f5964r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ CoroutineContext f5965s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ PointerEventPass f5966t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ Function1<Offset, Unit> f5967u0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0039a(CoroutineContext coroutineContext, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super C0039a> continuation) {
                super(2, continuation);
                this.f5965s0 = coroutineContext;
                this.f5966t0 = pointerEventPass;
                this.f5967u0 = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0039a c0039a = new C0039a(this.f5965s0, this.f5966t0, this.f5967u0, continuation);
                c0039a.f5964r0 = obj;
                return c0039a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C0039a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0037  */
            /* JADX WARN: Code duplicated, block: B:13:0x0045 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:14:0x0046  */
            /* JADX WARN: Code duplicated, block: B:18:0x005f  */
            /* JADX WARN: Code duplicated, block: B:23:0x0074  */
            /* JADX WARN: Code duplicated, block: B:26:0x0093  */
            /* JADX WARN: Code duplicated, block: B:28:0x0096  */
            /* JADX WARN: Type inference failed for: r10v14, types: [T, androidx.compose.ui.geometry.Offset] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0046 -> B:15:0x004c). Please report as a decompilation issue!!! */
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
                    int r1 = r9.f5963q0
                    r2 = 1
                    if (r1 == 0) goto L21
                    if (r1 != r2) goto L19
                    kotlin.jvm.internal.Ref$ObjectRef r1 = r9.f5962p0
                    java.lang.Object r3 = r9.f5964r0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.ResultKt.throwOnFailure(r10)
                    r4 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r9
                    goto L4c
                L19:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L21:
                    kotlin.ResultKt.throwOnFailure(r10)
                    java.lang.Object r10 = r9.f5964r0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    r3 = r10
                    r10 = r9
                L2f:
                    kotlin.coroutines.CoroutineContext r4 = r10.f5965s0
                    boolean r4 = kotlinx.coroutines.JobKt.isActive(r4)
                    if (r4 == 0) goto Lae
                    r10.f5964r0 = r3
                    r10.f5962p0 = r1
                    r10.f5963q0 = r2
                    androidx.compose.ui.input.pointer.PointerEventPass r4 = r10.f5966t0
                    java.lang.Object r4 = r3.awaitPointerEvent(r4, r10)
                    if (r4 != r0) goto L46
                    return r0
                L46:
                    r8 = r0
                    r0 = r10
                    r10 = r4
                    r4 = r3
                    r3 = r1
                    r1 = r8
                L4c:
                    androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                    int r5 = r10.getType()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r6 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                    int r7 = r6.m3434getMove7fucELk()
                    boolean r7 = androidx.compose.ui.input.pointer.PointerEventType.m3428equalsimpl0(r5, r7)
                    if (r7 == 0) goto L5f
                    goto L74
                L5f:
                    int r7 = r6.m3432getEnter7fucELk()
                    boolean r7 = androidx.compose.ui.input.pointer.PointerEventType.m3428equalsimpl0(r5, r7)
                    if (r7 == 0) goto L6a
                    goto L74
                L6a:
                    int r6 = r6.m3433getExit7fucELk()
                    boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m3428equalsimpl0(r5, r6)
                    if (r5 == 0) goto La9
                L74:
                    java.util.List r10 = r10.getChanges()
                    java.lang.Object r10 = kotlin.collections.CollectionsKt___CollectionsKt.first(r10)
                    androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                    long r5 = r10.getPosition()
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2264boximpl(r5)
                    long r5 = r10.getF15533a()
                    T r7 = r3.element
                    boolean r5 = androidx.compose.ui.geometry.Offset.m2271equalsimpl(r5, r7)
                    if (r5 != 0) goto L93
                    goto L94
                L93:
                    r10 = 0
                L94:
                    if (r10 == 0) goto La9
                    long r5 = r10.getF15533a()
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2264boximpl(r5)
                    r3.element = r10
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2264boximpl(r5)
                    kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r5 = r0.f5967u0
                    r5.invoke(r10)
                La9:
                    r10 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L2f
                Lae:
                    kotlin.Unit r10 = kotlin.Unit.INSTANCE
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.a.C0039a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5959q0 = pointerInputScope;
            this.f5960r0 = pointerEventPass;
            this.f5961s0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f5959q0, this.f5960r0, this.f5961s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f5958p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0039a c0039a = new C0039a(getF79378p0(), this.f5960r0, this.f5961s0, null);
                this.f5958p0 = 1;
                if (this.f5959q0.awaitPointerEventScope(c0039a, this) == coroutine_suspended) {
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

    @Nullable
    public static final Object detectMoves(@NotNull PointerInputScope pointerInputScope, @NotNull PointerEventPass pointerEventPass, @NotNull Function1<? super Offset, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(pointerInputScope, pointerEventPass, function1, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, function1, continuation);
    }
}
