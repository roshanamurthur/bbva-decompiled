package t;

import androidx.compose.foundation.FocusedBoundsNode;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
public final class v extends DelegatingNode implements FocusEventModifierNode, LayoutAwareModifierNode, SemanticsModifierNode, GlobalPositionAwareModifierNode {

    @Nullable
    public FocusState J0;

    @NotNull
    public final y K0 = (y) delegate(new y());

    @NotNull
    public final u L0;

    @NotNull
    public final x M0;

    @NotNull
    public final FocusedBoundsNode N0;

    @NotNull
    public final BringIntoViewRequester O0;

    @NotNull
    public final BringIntoViewRequesterNode P0;

    /* JADX INFO: compiled from: Focusable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f93433p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return v.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f93433p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BringIntoViewRequester bringIntoViewRequester = v.this.O0;
                this.f93433p0 = 1;
                if (c0.a.a(bringIntoViewRequester, null, this, 1, null) == coroutine_suspended) {
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

    public v(@Nullable MutableInteractionSource mutableInteractionSource) {
        u uVar = new u();
        uVar.H0 = mutableInteractionSource;
        this.L0 = (u) delegate(uVar);
        this.M0 = (x) delegate(new x());
        this.N0 = (FocusedBoundsNode) delegate(new FocusedBoundsNode());
        BringIntoViewRequester BringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
        this.O0 = BringIntoViewRequester;
        this.P0 = (BringIntoViewRequesterNode) delegate(new BringIntoViewRequesterNode(BringIntoViewRequester));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        this.K0.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldClearDescendantSemantics */
    public final /* synthetic */ boolean getIsClearingSemantics() {
        return i1.p.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return i1.p.b(this);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (Intrinsics.areEqual(this.J0, focusState)) {
            return;
        }
        boolean zIsFocused = focusState.isFocused();
        if (zIsFocused) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new a(null), 3, null);
        }
        if (getIsAttached()) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        u uVar = this.L0;
        MutableInteractionSource mutableInteractionSource = uVar.H0;
        if (mutableInteractionSource != null) {
            if (zIsFocused) {
                FocusInteraction.Focus focus = uVar.I0;
                if (focus != null) {
                    uVar.a(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    uVar.I0 = null;
                }
                FocusInteraction.Focus focus2 = new FocusInteraction.Focus();
                uVar.a(mutableInteractionSource, focus2);
                uVar.I0 = focus2;
            } else {
                FocusInteraction.Focus focus3 = uVar.I0;
                if (focus3 != null) {
                    uVar.a(mutableInteractionSource, new FocusInteraction.Unfocus(focus3));
                    uVar.I0 = null;
                }
            }
        }
        this.N0.setFocus(zIsFocused);
        x xVar = this.M0;
        if (zIsFocused) {
            xVar.getClass();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverModifierNodeKt.observeReads(xVar, new w(objectRef, xVar));
            PinnableContainer pinnableContainer = (PinnableContainer) objectRef.element;
            xVar.H0 = pinnableContainer != null ? pinnableContainer.pin() : null;
        } else {
            PinnableContainer.PinnedHandle pinnedHandle = xVar.H0;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            xVar.H0 = null;
        }
        xVar.I0 = zIsFocused;
        this.K0.H0 = zIsFocused;
        this.J0 = focusState;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.N0.onGloballyPositioned(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.P0.onPlaced(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public final /* synthetic */ void mo457onRemeasuredozmzZPI(long j10) {
        i1.i.b(this, j10);
    }
}
