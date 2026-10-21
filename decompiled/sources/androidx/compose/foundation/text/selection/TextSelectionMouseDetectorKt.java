package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "observer", "", "mouseSelectionDetector", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ClicksSlop", "D", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextSelectionMouseDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,134:1\n86#2,2:135\n33#2,6:137\n88#2:143\n*S KotlinDebug\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n*L\n128#1:135,2\n128#1:137,6\n128#1:143\n*E\n"})
public final class TextSelectionMouseDetectorKt {
    public static final double ClicksSlop = 100.0d;

    /* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", i = {0, 0, 1, 1, 2, 2}, l = {89, 96, 111}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public g0.a f6451p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f6452q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f6453r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MouseSelectionObserver f6454s0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
        public static final class C0042a extends Lambda implements Function1<PointerInputChange, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MouseSelectionObserver f6455p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0042a(MouseSelectionObserver mouseSelectionObserver) {
                super(1);
                this.f6455p0 = mouseSelectionObserver;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(PointerInputChange pointerInputChange) {
                PointerInputChange it = pointerInputChange;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f6455p0.mo591onExtendDragk4lQ0M(it.getPosition())) {
                    it.consume();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
        public static final class b extends Lambda implements Function1<PointerInputChange, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ MouseSelectionObserver f6456p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SelectionAdjustment f6457q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MouseSelectionObserver mouseSelectionObserver, SelectionAdjustment selectionAdjustment) {
                super(1);
                this.f6456p0 = mouseSelectionObserver;
                this.f6457q0 = selectionAdjustment;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(PointerInputChange pointerInputChange) {
                PointerInputChange it = pointerInputChange;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f6456p0.mo589onDrag3MmeM6k(it.getPosition(), this.f6457q0)) {
                    it.consume();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MouseSelectionObserver mouseSelectionObserver, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6454s0 = mouseSelectionObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f6454s0, continuation);
            aVar.f6453r0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x006d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x0087  */
        /* JADX WARN: Code duplicated, block: B:20:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:26:0x00de  */
        /* JADX WARN: Code duplicated, block: B:28:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:30:0x0100 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x0101  */
        /* JADX WARN: Code duplicated, block: B:32:0x0104  */
        /* JADX WARN: Code duplicated, block: B:33:0x0106  */
        /* JADX WARN: Code duplicated, block: B:35:0x010a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:36:0x010c  */
        /* JADX WARN: Code duplicated, block: B:37:0x0113  */
        /* JADX WARN: Code duplicated, block: B:38:0x011a  */
        /* JADX WARN: Code duplicated, block: B:41:0x012a  */
        /* JADX WARN: Code duplicated, block: B:43:0x0143 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0141 -> B:44:0x0144). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0036 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof g0.i
            if (r0 == 0) goto L13
            r0 = r10
            g0.i r0 = (g0.i) r0
            int r1 = r0.f68576r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68576r0 = r1
            goto L18
        L13:
            g0.i r0 = new g0.i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f68575q0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f68576r0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = r0.f68574p0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L43
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
        L36:
            androidx.compose.ui.input.pointer.PointerEventPass r10 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.f68574p0 = r9
            r0.f68576r0 = r3
            java.lang.Object r10 = r9.awaitPointerEvent(r10, r0)
            if (r10 != r1) goto L43
            goto L7a
        L43:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            int r2 = r10.getButtons()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m3452isPrimaryPressedaHzCxE(r2)
            if (r2 == 0) goto L36
            java.util.List r2 = r10.getChanges()
            int r4 = r2.size()
            r5 = 0
        L58:
            if (r5 >= r4) goto L79
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            int r7 = r6.getType()
            androidx.compose.ui.input.pointer.PointerType$Companion r8 = androidx.compose.ui.input.pointer.PointerType.INSTANCE
            int r8 = r8.m3537getMouseT8wyACA()
            boolean r7 = androidx.compose.ui.input.pointer.PointerType.m3532equalsimpl0(r7, r8)
            if (r7 == 0) goto L36
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r6)
            if (r6 == 0) goto L36
            int r5 = r5 + 1
            goto L58
        L79:
            r1 = r10
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.access$awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object mouseSelectionDetector(@NotNull PointerInputScope pointerInputScope, @NotNull MouseSelectionObserver mouseSelectionObserver, @NotNull Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new a(mouseSelectionObserver, null), continuation);
        return objAwaitEachGesture == ek.a.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }
}
