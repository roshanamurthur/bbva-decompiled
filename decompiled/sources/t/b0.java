package t;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Modifier.Node implements PointerInputModifierNode {

    @NotNull
    public MutableInteractionSource H0;

    @Nullable
    public HoverInteraction.Enter I0;

    /* JADX INFO: compiled from: Hoverable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0, 0}, l = {108}, m = "emitEnter", n = {"this", "interaction"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public b0 f93349p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public HoverInteraction.Enter f93350q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f93351r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f93353t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f93351r0 = obj;
            this.f93353t0 |= Integer.MIN_VALUE;
            return b0.this.a(this);
        }
    }

    /* JADX INFO: compiled from: Hoverable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {116}, m = "emitExit", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public b0 f93354p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f93355q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f93357s0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f93355q0 = obj;
            this.f93357s0 |= Integer.MIN_VALUE;
            return b0.this.b(this);
        }
    }

    /* JADX INFO: compiled from: Hoverable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f93358p0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return b0.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f93358p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f93358p0 = 1;
                if (b0.this.a(this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Hoverable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f93360p0;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return b0.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f93360p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f93360p0 = 1;
                if (b0.this.b(this) == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        b0 b0Var;
        HoverInteraction.Enter enter;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f93353t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f93353t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f93351r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f93353t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.I0 == null) {
                HoverInteraction.Enter enter2 = new HoverInteraction.Enter();
                MutableInteractionSource mutableInteractionSource = this.H0;
                aVar.f93349p0 = this;
                aVar.f93350q0 = enter2;
                aVar.f93353t0 = 1;
                if (mutableInteractionSource.emit(enter2, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                b0Var = this;
                enter = enter2;
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        enter = aVar.f93350q0;
        b0Var = aVar.f93349p0;
        ResultKt.throwOnFailure(obj);
        b0Var.I0 = enter;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull Continuation<? super Unit> continuation) {
        b bVar;
        b0 b0Var;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f93357s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f93357s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f93355q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f93357s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            HoverInteraction.Enter enter = this.I0;
            if (enter != null) {
                HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
                MutableInteractionSource mutableInteractionSource = this.H0;
                bVar.f93354p0 = this;
                bVar.f93357s0 = 1;
                if (mutableInteractionSource.emit(exit, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                b0Var = this;
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b0Var = bVar.f93354p0;
        ResultKt.throwOnFailure(obj);
        b0Var.I0 = null;
        return Unit.INSTANCE;
    }

    public final void c() {
        HoverInteraction.Enter enter = this.I0;
        if (enter != null) {
            this.H0.tryEmit(new HoverInteraction.Exit(enter));
            this.I0 = null;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return i1.n.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        c();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onDensityChange() {
        i1.n.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        c();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo115onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long j10) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        if (pass == PointerEventPass.Main) {
            int type = pointerEvent.getType();
            PointerEventType.Companion companion = PointerEventType.INSTANCE;
            if (PointerEventType.m3428equalsimpl0(type, companion.m3432getEnter7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new c(null), 3, null);
            } else if (PointerEventType.m3428equalsimpl0(type, companion.m3433getExit7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new d(null), 3, null);
            }
        }
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
