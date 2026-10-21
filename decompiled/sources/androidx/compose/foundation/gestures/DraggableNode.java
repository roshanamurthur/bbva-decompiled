package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import i1.n;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÕ\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a\u0012<\u0010%\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001c¢\u0006\u0002\b$\u0012<\u0010(\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001c¢\u0006\u0002\b$\u0012\u0006\u0010)\u001a\u00020\u0013ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b,\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0016J-\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0003H\u0016JÛ\u0001\u0010*\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2<\u0010%\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001c¢\u0006\u0002\b$2<\u0010(\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001c¢\u0006\u0002\b$2\u0006\u0010)\u001a\u00020\u0013ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "", "onDetach", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/foundation/gestures/DraggableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "update", "(Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class DraggableNode extends DelegatingNode implements PointerInputModifierNode {

    @NotNull
    public DraggableState J0;

    @NotNull
    public Function1<? super PointerInputChange, Boolean> K0;

    @NotNull
    public Orientation L0;
    public boolean M0;

    @Nullable
    public MutableInteractionSource N0;

    @NotNull
    public Function0<Boolean> O0;

    @NotNull
    public Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> P0;

    @NotNull
    public Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> Q0;
    public boolean R0;

    @NotNull
    public final a S0;

    @NotNull
    public final b T0;

    @NotNull
    public final VelocityTracker U0;

    @NotNull
    public final SuspendingPointerInputModifierNode V0;

    @NotNull
    public final Channel<DragEvent> W0;

    @Nullable
    public DragInteraction.Start X0;

    /* JADX INFO: compiled from: Draggable.kt */
    public static final class a extends Lambda implements Function1<PointerInputChange, Boolean> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            PointerInputChange it = pointerInputChange;
            Intrinsics.checkNotNullParameter(it, "it");
            return (Boolean) DraggableNode.this.K0.invoke(it);
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return (Boolean) DraggableNode.this.O0.invoke();
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1", f = "Draggable.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3760p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3761q0;

        /* JADX INFO: compiled from: Draggable.kt */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {326}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f3763p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f3764q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ PointerInputScope f3765r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ DraggableNode f3766s0;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableNode$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Draggable.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {305, 307, 309, TypedValues.AttributesType.TYPE_PATH_ROTATE, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 321}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
            public static final class C0017a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public Ref.ObjectRef f3767p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public Ref.ObjectRef f3768q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public int f3769r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public /* synthetic */ Object f3770s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public final /* synthetic */ DraggableNode f3771t0;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableNode$c$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Draggable.kt */
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1", f = "Draggable.kt", i = {0}, l = {312}, m = "invokeSuspend", n = {"$this$drag"}, s = {"L$0"})
                @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableNode$pointerInputNode$1$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,583:1\n1#2:584\n*E\n"})
                public static final class C0018a extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public Ref.ObjectRef f3772p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f3773q0;

                    /* JADX INFO: renamed from: r0, reason: collision with root package name */
                    public /* synthetic */ Object f3774r0;

                    /* JADX INFO: renamed from: s0, reason: collision with root package name */
                    public final /* synthetic */ Ref.ObjectRef<DragEvent> f3775s0;

                    /* JADX INFO: renamed from: t0, reason: collision with root package name */
                    public final /* synthetic */ DraggableNode f3776t0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0018a(Ref.ObjectRef<DragEvent> objectRef, DraggableNode draggableNode, Continuation<? super C0018a> continuation) {
                        super(2, continuation);
                        this.f3775s0 = objectRef;
                        this.f3776t0 = draggableNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C0018a c0018a = new C0018a(this.f3775s0, this.f3776t0, continuation);
                        c0018a.f3774r0 = obj;
                        return c0018a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
                        return ((C0018a) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:24:0x0068). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        DragScope dragScope;
                        C0018a c0018a;
                        DragEvent dragEvent;
                        C0018a c0018a2;
                        T t10;
                        DragScope dragScope2;
                        Ref.ObjectRef<DragEvent> objectRef;
                        Object obj2;
                        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                        int i10 = this.f3773q0;
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            dragScope = (DragScope) this.f3774r0;
                            c0018a = this;
                            Ref.ObjectRef<DragEvent> objectRef2 = c0018a.f3775s0;
                            dragEvent = objectRef2.element;
                            if (!(dragEvent instanceof DragEvent.DragStopped) || (dragEvent instanceof DragEvent.DragCancelled)) {
                                return Unit.INSTANCE;
                            }
                            DragEvent.DragDelta dragDelta = dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null;
                            DraggableNode draggableNode = c0018a.f3776t0;
                            if (dragDelta != null) {
                                dragScope.dragBy(DraggableKt.m203access$toFloat3MmeM6k(dragDelta.getDelta(), draggableNode.L0));
                            }
                            Channel channel = draggableNode.W0;
                            c0018a.f3774r0 = dragScope;
                            c0018a.f3772p0 = objectRef2;
                            c0018a.f3773q0 = 1;
                            Object objReceive = channel.receive(c0018a);
                            if (objReceive == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Object obj3 = coroutine_suspended;
                            c0018a2 = c0018a;
                            t10 = objReceive;
                            dragScope2 = dragScope;
                            objectRef = objectRef2;
                            obj2 = obj3;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ref.ObjectRef<DragEvent> objectRef3 = this.f3772p0;
                            DragScope dragScope3 = (DragScope) this.f3774r0;
                            ResultKt.throwOnFailure(obj);
                            dragScope2 = dragScope3;
                            objectRef = objectRef3;
                            obj2 = coroutine_suspended;
                            c0018a2 = this;
                            t10 = obj;
                        }
                        objectRef.element = t10;
                        c0018a = c0018a2;
                        coroutine_suspended = obj2;
                        dragScope = dragScope2;
                        Ref.ObjectRef<DragEvent> objectRef4 = c0018a.f3775s0;
                        dragEvent = objectRef4.element;
                        if (dragEvent instanceof DragEvent.DragStopped) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0017a(DraggableNode draggableNode, Continuation<? super C0017a> continuation) {
                    super(2, continuation);
                    this.f3771t0 = draggableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C0017a c0017a = new C0017a(this.f3771t0, continuation);
                    c0017a.f3770s0 = obj;
                    return c0017a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0017a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:23:0x0063  */
                /* JADX WARN: Code duplicated, block: B:25:0x007d A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:26:0x007e  */
                /* JADX WARN: Code duplicated, block: B:29:0x008c  */
                /* JADX WARN: Code duplicated, block: B:31:0x009f A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
                /* JADX WARN: Code duplicated, block: B:35:0x00bd A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:36:0x00be  */
                /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[Catch: CancellationException -> 0x00dc, TryCatch #1 {CancellationException -> 0x00dc, blocks: (B:37:0x00bf, B:39:0x00c5, B:43:0x00de, B:45:0x00e2), top: B:60:0x00bf }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00db A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:43:0x00de A[Catch: CancellationException -> 0x00dc, TryCatch #1 {CancellationException -> 0x00dc, blocks: (B:37:0x00bf, B:39:0x00c5, B:43:0x00de, B:45:0x00e2), top: B:60:0x00bf }] */
                /* JADX WARN: Code duplicated, block: B:45:0x00e2 A[Catch: CancellationException -> 0x00dc, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00dc, blocks: (B:37:0x00bf, B:39:0x00c5, B:43:0x00de, B:45:0x00e2), top: B:60:0x00bf }] */
                /* JADX WARN: Code duplicated, block: B:47:0x00f1 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:54:0x0108  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:21:0x005d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0108 -> B:21:0x005d). Please report as a decompilation issue!!! */
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
                        Method dump skipped, instruction units count: 290
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode.c.a.C0017a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: compiled from: Draggable.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2", f = "Draggable.kt", i = {0, 1, 1}, l = {328, 336}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "isDragSuccessful"}, s = {"L$0", "L$0", "I$0"})
            public static final class b extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public DraggableNode f3777p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public CoroutineScope f3778q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public int f3779r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public /* synthetic */ Object f3780s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f3781t0;

                /* JADX INFO: renamed from: u0, reason: collision with root package name */
                public final /* synthetic */ DraggableNode f3782u0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(DraggableNode draggableNode, CoroutineScope coroutineScope, Continuation continuation) {
                    super(2, continuation);
                    this.f3781t0 = coroutineScope;
                    this.f3782u0 = draggableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    b bVar = new b(this.f3782u0, this.f3781t0, continuation);
                    bVar.f3780s0 = obj;
                    return bVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((b) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:20:0x004e  */
                /* JADX WARN: Code duplicated, block: B:22:0x0070 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:23:0x0071  */
                /* JADX WARN: Code duplicated, block: B:26:0x0078  */
                /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
                /* JADX WARN: Code duplicated, block: B:63:0x0130  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b8 -> B:72:0x00bf). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0130 -> B:59:0x0122). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) {
                    /*
                        Method dump skipped, instruction units count: 313
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode.c.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PointerInputScope pointerInputScope, DraggableNode draggableNode, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f3765r0 = pointerInputScope;
                this.f3766s0 = draggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f3765r0, this.f3766s0, continuation);
                aVar.f3764q0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0054  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineScope coroutineScope;
                CancellationException e5;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f3763p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f3764q0;
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    DraggableNode draggableNode = this.f3766s0;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, coroutineStart, new C0017a(draggableNode, null), 1, null);
                    try {
                        PointerInputScope pointerInputScope = this.f3765r0;
                        b bVar = new b(draggableNode, coroutineScope2, null);
                        this.f3764q0 = coroutineScope2;
                        this.f3763p0 = 1;
                        if (pointerInputScope.awaitPointerEventScope(bVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CancellationException e7) {
                        coroutineScope = coroutineScope2;
                        e5 = e7;
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            throw e5;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.f3764q0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException e10) {
                        e5 = e10;
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            throw e5;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = DraggableNode.this.new c(continuation);
            cVar.f3761q0 = obj;
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
            int i10 = this.f3760p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f3761q0;
                DraggableNode draggableNode = DraggableNode.this;
                if (!draggableNode.M0) {
                    return Unit.INSTANCE;
                }
                a aVar = new a(pointerInputScope, draggableNode, null);
                this.f3760p0 = 1;
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

    public DraggableNode(@NotNull DraggableState state, @NotNull Function1<? super PointerInputChange, Boolean> canDrag, @NotNull Orientation orientation, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function0<Boolean> startDragImmediately, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        this.J0 = state;
        this.K0 = canDrag;
        this.L0 = orientation;
        this.M0 = z10;
        this.N0 = mutableInteractionSource;
        this.O0 = startDragImmediately;
        this.P0 = onDragStarted;
        this.Q0 = onDragStopped;
        this.R0 = z11;
        this.S0 = new a();
        this.T0 = new b();
        this.U0 = new VelocityTracker();
        this.V0 = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new c(null)));
        this.W0 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$processDragCancel(DraggableNode draggableNode, CoroutineScope coroutineScope, Continuation continuation) {
        u.d dVar;
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        Velocity velocityM4605boximpl;
        draggableNode.getClass();
        if (continuation instanceof u.d) {
            dVar = (u.d) continuation;
            int i10 = dVar.f93646t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f93646t0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new u.d(draggableNode, continuation);
            }
        } else {
            dVar = new u.d(draggableNode, continuation);
        }
        Object obj = dVar.f93644r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f93646t0;
        if (i11 != 0) {
            if (i11 == 1) {
                coroutineScope = dVar.f93643q0;
                draggableNode = dVar.f93642p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        DragInteraction.Start start = draggableNode.X0;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = draggableNode.N0;
            if (mutableInteractionSource != null) {
                DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                dVar.f93642p0 = draggableNode;
                dVar.f93643q0 = coroutineScope;
                dVar.f93646t0 = 1;
                if (mutableInteractionSource.emit(cancel, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        function3 = draggableNode.Q0;
        velocityM4605boximpl = Velocity.m4605boximpl(Velocity.INSTANCE.m4625getZero9UxMQ8M());
        dVar.f93642p0 = null;
        dVar.f93643q0 = null;
        dVar.f93646t0 = 2;
        if (function3.invoke(coroutineScope, velocityM4605boximpl, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        draggableNode.X0 = null;
        function3 = draggableNode.Q0;
        velocityM4605boximpl = Velocity.m4605boximpl(Velocity.INSTANCE.m4625getZero9UxMQ8M());
        dVar.f93642p0 = null;
        dVar.f93643q0 = null;
        dVar.f93646t0 = 2;
        if (function3.invoke(coroutineScope, velocityM4605boximpl, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$processDragStart(DraggableNode draggableNode, CoroutineScope coroutineScope, DragEvent.DragStarted dragStarted, Continuation continuation) {
        androidx.compose.foundation.gestures.b bVar;
        MutableInteractionSource mutableInteractionSource;
        DragInteraction.Start start;
        DraggableNode draggableNode2;
        DragInteraction.Start start2;
        CoroutineScope coroutineScope2;
        DragEvent.DragStarted dragStarted2;
        Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3;
        Offset offsetM2264boximpl;
        draggableNode.getClass();
        if (continuation instanceof androidx.compose.foundation.gestures.b) {
            bVar = (androidx.compose.foundation.gestures.b) continuation;
            int i10 = bVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new androidx.compose.foundation.gestures.b(draggableNode, continuation);
            }
        } else {
            bVar = new androidx.compose.foundation.gestures.b(draggableNode, continuation);
        }
        Object obj = bVar.f4018t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.v0;
        if (i11 != 0) {
            if (i11 == 1) {
                dragStarted = bVar.f4016r0;
                coroutineScope = bVar.f4015q0;
                draggableNode = bVar.f4014p0;
                ResultKt.throwOnFailure(obj);
            } else if (i11 == 2) {
                start2 = bVar.f4017s0;
                dragStarted2 = bVar.f4016r0;
                coroutineScope2 = bVar.f4015q0;
                draggableNode2 = bVar.f4014p0;
                ResultKt.throwOnFailure(obj);
                start = start2;
                draggableNode = draggableNode2;
                CoroutineScope coroutineScope3 = coroutineScope2;
                dragStarted = dragStarted2;
                coroutineScope = coroutineScope3;
                draggableNode.X0 = start;
                function3 = draggableNode.P0;
                offsetM2264boximpl = Offset.m2264boximpl(dragStarted.getStartPoint());
                bVar.f4014p0 = null;
                bVar.f4015q0 = null;
                bVar.f4016r0 = null;
                bVar.f4017s0 = null;
                bVar.v0 = 3;
                if (function3.invoke(coroutineScope, offsetM2264boximpl, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        DragInteraction.Start start3 = draggableNode.X0;
        if (start3 != null && (mutableInteractionSource = draggableNode.N0) != null) {
            DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
            bVar.f4014p0 = draggableNode;
            bVar.f4015q0 = coroutineScope;
            bVar.f4016r0 = dragStarted;
            bVar.v0 = 1;
            if (mutableInteractionSource.emit(cancel, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        start = new DragInteraction.Start();
        MutableInteractionSource mutableInteractionSource2 = draggableNode.N0;
        if (mutableInteractionSource2 != null) {
            bVar.f4014p0 = draggableNode;
            bVar.f4015q0 = coroutineScope;
            bVar.f4016r0 = dragStarted;
            bVar.f4017s0 = start;
            bVar.v0 = 2;
            if (mutableInteractionSource2.emit(start, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            draggableNode2 = draggableNode;
            start2 = start;
            DragEvent.DragStarted dragStarted3 = dragStarted;
            coroutineScope2 = coroutineScope;
            dragStarted2 = dragStarted3;
            start = start2;
            draggableNode = draggableNode2;
            CoroutineScope coroutineScope4 = coroutineScope2;
            dragStarted = dragStarted2;
            coroutineScope = coroutineScope4;
        }
        draggableNode.X0 = start;
        function3 = draggableNode.P0;
        offsetM2264boximpl = Offset.m2264boximpl(dragStarted.getStartPoint());
        bVar.f4014p0 = null;
        bVar.f4015q0 = null;
        bVar.f4016r0 = null;
        bVar.f4017s0 = null;
        bVar.v0 = 3;
        if (function3.invoke(coroutineScope, offsetM2264boximpl, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$processDragStop(DraggableNode draggableNode, CoroutineScope coroutineScope, DragEvent.DragStopped dragStopped, Continuation continuation) {
        androidx.compose.foundation.gestures.c cVar;
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        Velocity velocityM4605boximpl;
        draggableNode.getClass();
        if (continuation instanceof androidx.compose.foundation.gestures.c) {
            cVar = (androidx.compose.foundation.gestures.c) continuation;
            int i10 = cVar.f4025u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f4025u0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new androidx.compose.foundation.gestures.c(draggableNode, continuation);
            }
        } else {
            cVar = new androidx.compose.foundation.gestures.c(draggableNode, continuation);
        }
        Object obj = cVar.f4023s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f4025u0;
        if (i11 != 0) {
            if (i11 == 1) {
                dragStopped = cVar.f4022r0;
                coroutineScope = cVar.f4021q0;
                draggableNode = cVar.f4020p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        DragInteraction.Start start = draggableNode.X0;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = draggableNode.N0;
            if (mutableInteractionSource != null) {
                DragInteraction.Stop stop = new DragInteraction.Stop(start);
                cVar.f4020p0 = draggableNode;
                cVar.f4021q0 = coroutineScope;
                cVar.f4022r0 = dragStopped;
                cVar.f4025u0 = 1;
                if (mutableInteractionSource.emit(stop, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        function3 = draggableNode.Q0;
        velocityM4605boximpl = Velocity.m4605boximpl(dragStopped.getVelocity());
        cVar.f4020p0 = null;
        cVar.f4021q0 = null;
        cVar.f4022r0 = null;
        cVar.f4025u0 = 2;
        if (function3.invoke(coroutineScope, velocityM4605boximpl, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        draggableNode.X0 = null;
        function3 = draggableNode.Q0;
        velocityM4605boximpl = Velocity.m4605boximpl(dragStopped.getVelocity());
        cVar.f4020p0 = null;
        cVar.f4021q0 = null;
        cVar.f4022r0 = null;
        cVar.f4025u0 = 2;
        if (function3.invoke(coroutineScope, velocityM4605boximpl, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public final void b() {
        DragInteraction.Start start = this.X0;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.N0;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.X0 = null;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return n.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.V0.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onDensityChange() {
        n.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        b();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo115onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.V0.mo115onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onViewConfigurationChange() {
        n.c(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return n.d(this);
    }

    public final void update(@NotNull DraggableState state, @NotNull Function1<? super PointerInputChange, Boolean> canDrag, @NotNull Orientation orientation, boolean enabled, @Nullable MutableInteractionSource interactionSource, @NotNull Function0<Boolean> startDragImmediately, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z10;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        boolean z11 = true;
        if (Intrinsics.areEqual(this.J0, state)) {
            z10 = false;
        } else {
            this.J0 = state;
            z10 = true;
        }
        this.K0 = canDrag;
        if (this.L0 != orientation) {
            this.L0 = orientation;
            z10 = true;
        }
        if (this.M0 != enabled) {
            this.M0 = enabled;
            if (!enabled) {
                b();
            }
        } else {
            z11 = z10;
        }
        if (!Intrinsics.areEqual(this.N0, interactionSource)) {
            b();
            this.N0 = interactionSource;
        }
        this.O0 = startDragImmediately;
        this.P0 = onDragStarted;
        this.Q0 = onDragStopped;
        if (this.R0 != reverseDirection) {
            this.R0 = reverseDirection;
        } else if (!z11) {
            return;
        }
        this.V0.resetPointerInputHandler();
    }
}
