package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode, PointerInputModifierNode {
    public boolean J0;

    @Nullable
    public MutableInteractionSource K0;

    @NotNull
    public Function0<Unit> L0;

    @NotNull
    public final AbstractClickableNode.InteractionData M0;

    @NotNull
    public final C0011a N0 = new C0011a();

    @NotNull
    public final SuspendingPointerInputModifierNode O0 = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new b(null)));

    /* JADX INFO: renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Clickable.kt */
    public static final class C0011a extends Lambda implements Function0<Boolean> {
        public C0011a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            ProvidableModifierLocal<Boolean> modifierLocalScrollableContainer = ScrollableKt.getModifierLocalScrollableContainer();
            a aVar = a.this;
            aVar.getClass();
            return Boolean.valueOf(((Boolean) h1.c.a(aVar, modifierLocalScrollableContainer)).booleanValue() || Clickable_androidKt.isComposeRootInScrollableContainer(aVar));
        }
    }

    /* JADX INFO: compiled from: Clickable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", i = {}, l = {846}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3483p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3484q0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f3484q0 = obj;
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
            int i10 = this.f3483p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f3484q0;
                this.f3483p0 = 1;
                if (a.this.b(pointerInputScope, this) == coroutine_suspended) {
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

    public a(boolean z10, MutableInteractionSource mutableInteractionSource, Function0 function0, AbstractClickableNode.InteractionData interactionData) {
        this.J0 = z10;
        this.K0 = mutableInteractionSource;
        this.L0 = function0;
        this.M0 = interactionData;
    }

    @Nullable
    public abstract Object b(@NotNull PointerInputScope pointerInputScope, @NotNull Continuation<? super Unit> continuation);

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return h1.c.a(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ ModifierLocalMap getProvidedValues() {
        return h1.c.b(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return i1.n.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.O0.onCancelPointerInput();
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
        this.O0.mo115onPointerEventH0pRuoY(pointerEvent, pass, j10);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onViewConfigurationChange() {
        i1.n.c(this);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        h1.c.c(this, modifierLocal, obj);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return i1.n.d(this);
    }
}
