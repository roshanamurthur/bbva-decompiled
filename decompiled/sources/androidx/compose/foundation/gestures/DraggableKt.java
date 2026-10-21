package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.unit.Velocity;
import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aÑ\u0001\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192>\b\u0002\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\fø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,583:1\n25#2:584\n1097#3,6:585\n658#4,18:591\n676#4,4:618\n680#4,58:629\n581#4,6:687\n615#4,4:693\n619#4,2:706\n621#4,8:715\n588#4,10:723\n116#5,2:609\n33#5,6:611\n118#5:617\n33#5,6:622\n118#5:628\n116#5,2:697\n33#5,6:699\n118#5:705\n33#5,6:708\n118#5:714\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n142#1:584\n142#1:585,6\n490#1:591,18\n490#1:618,4\n490#1:629,58\n543#1:687,6\n543#1:693,4\n543#1:706,2\n543#1:715,8\n543#1:723,10\n490#1:609,2\n490#1:611,6\n490#1:617\n490#1:622,6\n490#1:628\n543#1:697,2\n543#1:699,6\n543#1:705\n543#1:708,6\n543#1:714\n*E\n"})
public final class DraggableKt {

    /* JADX INFO: compiled from: Draggable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
            offset.getF15533a();
            return new a(3, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, Float f6, Continuation<? super Unit> continuation) {
            f6.floatValue();
            return new b(3, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    public static final class c extends Lambda implements Function1<PointerInputChange, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f3742p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            PointerInputChange it = pointerInputChange;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    public static final class d extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f3743p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10) {
            super(0);
            this.f3743p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f3743p0);
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", i = {}, l = {Opcodes.MONITORENTER}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3744p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ CoroutineScope f3745q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ long f3746r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> f3747s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Orientation f3748t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function3, Orientation orientation, Continuation<? super e> continuation) {
            super(3, continuation);
            this.f3747s0 = function3;
            this.f3748t0 = orientation;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, Velocity velocity, Continuation<? super Unit> continuation) {
            long f18328a = velocity.getF18328a();
            e eVar = new e(this.f3747s0, this.f3748t0, continuation);
            eVar.f3745q0 = coroutineScope;
            eVar.f3746r0 = f18328a;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3744p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = this.f3745q0;
                Float fBoxFloat = Boxing.boxFloat(DraggableKt.m204access$toFloatsFctU(this.f3746r0, this.f3748t0));
                this.f3744p0 = 1;
                if (this.f3747s0.invoke(coroutineScope, fBoxFloat, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Draggable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0}, l = {592}, m = "onDragOrUp-Axegvzg", n = {"onDrag", "motionFromChange", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f3749p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Function1 f3750q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AwaitPointerEventScope f3751r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public AwaitPointerEventScope f3752s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Ref.LongRef f3753t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f3754u0;
        public int v0;

        public f() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3754u0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return DraggableKt.a(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    public static final class g extends Lambda implements Function1<PointerInputChange, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f3755p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(PointerInputChange pointerInputChange) {
            PointerInputChange it = pointerInputChange;
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(Offset.m2276getYimpl(PointerEventKt.positionChangeIgnoreConsumed(it)));
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    public static final class h extends Lambda implements Function1<PointerInputChange, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f3756p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(PointerInputChange pointerInputChange) {
            PointerInputChange it = pointerInputChange;
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(Offset.m2275getXimpl(PointerEventKt.positionChangeIgnoreConsumed(it)));
        }
    }

    /* JADX INFO: compiled from: Draggable.kt */
    public static final class i extends Lambda implements Function1<Float, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Float, Unit>> f3757p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(State<? extends Function1<? super Float, Unit>> state) {
            super(1);
            this.f3757p0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f6) {
            this.f3757p0.getValue().invoke(Float.valueOf(f6.floatValue()));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final DraggableState DraggableState(@NotNull Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[LOOP:0: B:28:0x009a->B:32:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c1 A[EDGE_INSN: B:74:0x00c1->B:34:0x00c1 BREAK  A[LOOP:0: B:28:0x009a->B:32:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008a -> B:27:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.foundation.gestures.Orientation r18, long r19, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> r21, kotlin.coroutines.Continuation<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01df A[LOOP:0: B:44:0x01c2->B:48:0x01df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ef A[EDGE_INSN: B:96:0x01ef->B:50:0x01ef BREAK  A[LOOP:0: B:44:0x01c2->B:48:0x01df], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v15, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0228 -> B:39:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0292 -> B:79:0x029e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x02ee -> B:39:0x018d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function0 r21, androidx.compose.ui.input.pointer.util.VelocityTracker r22, androidx.compose.foundation.gestures.Orientation r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.access$awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: access$awaitDrag-Su4bsnU, reason: not valid java name */
    public static final Object m201access$awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j10, VelocityTracker velocityTracker, SendChannel sendChannel, boolean z10, Orientation orientation, Continuation continuation) {
        sendChannel.mo5953trySendJP2dKIU(new DragEvent.DragStarted(Offset.m2279minusMKHz9U(pointerInputChange.getPosition(), OffsetKt.Offset(Offset.m2275getXimpl(j10) * Math.signum(Offset.m2275getXimpl(pointerInputChange.getPosition())), Offset.m2276getYimpl(j10) * Math.signum(Offset.m2276getYimpl(pointerInputChange.getPosition())))), null));
        sendChannel.mo5953trySendJP2dKIU(new DragEvent.DragDelta(z10 ? Offset.m2282timestuRUvjQ(j10, -1.0f) : j10, null));
        return a(awaitPointerEventScope, orientation, pointerInputChange.getId(), new androidx.compose.foundation.gestures.a(velocityTracker, sendChannel, z10), continuation);
    }

    /* JADX INFO: renamed from: access$toFloat-3MmeM6k, reason: not valid java name */
    public static final float m203access$toFloat3MmeM6k(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m2276getYimpl(j10) : Offset.m2275getXimpl(j10);
    }

    /* JADX INFO: renamed from: access$toFloat-sF-c-tU, reason: not valid java name */
    public static final float m204access$toFloatsFctU(long j10, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m4615getYimpl(j10) : Velocity.m4614getXimpl(j10);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull DraggableState state, @NotNull Orientation orientation, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, boolean z11, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z12) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return modifier.then(new DraggableElement(state, c.f3742p0, orientation, z10, mutableInteractionSource, new d(z11), onDragStarted, new e(onDragStopped, orientation, null), z12));
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull Function1<? super Float, Unit> onDelta, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:139)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i10 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new i(stateRememberUpdatedState));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }
}
