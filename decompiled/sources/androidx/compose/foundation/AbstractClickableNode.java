package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,978:1\n1855#2,2:979\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n691#1:979,2\n*E\n"})
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode {

    @NotNull
    public MutableInteractionSource J0;
    public boolean K0;

    @NotNull
    public Function0<Unit> L0;

    @NotNull
    public final InteractionData M0;

    /* JADX INFO: compiled from: Clickable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "a", "Ljava/util/Map;", "getCurrentKeyPressInteractions", "()Ljava/util/Map;", "currentKeyPressInteractions", "b", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getPressInteraction", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "setPressInteraction", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "pressInteraction", "Landroidx/compose/ui/geometry/Offset;", "c", "J", "getCentreOffset-F1C5BW0", "()J", "setCentreOffset-k-4lQ0M", "(J)V", "centreOffset", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class InteractionData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public PressInteraction.Press pressInteraction;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f3242a = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public long centreOffset = Offset.INSTANCE.m2291getZeroF1C5BW0();

        /* JADX INFO: renamed from: getCentreOffset-F1C5BW0, reason: not valid java name and from getter */
        public final long getCentreOffset() {
            return this.centreOffset;
        }

        @NotNull
        public final Map<Key, PressInteraction.Press> getCurrentKeyPressInteractions() {
            return this.f3242a;
        }

        @Nullable
        public final PressInteraction.Press getPressInteraction() {
            return this.pressInteraction;
        }

        /* JADX INFO: renamed from: setCentreOffset-k-4lQ0M, reason: not valid java name */
        public final void m118setCentreOffsetk4lQ0M(long j10) {
            this.centreOffset = j10;
        }

        public final void setPressInteraction(@Nullable PressInteraction.Press press) {
            this.pressInteraction = press;
        }
    }

    /* JADX INFO: compiled from: Clickable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", i = {}, l = {718}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3245p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PressInteraction.Press f3247r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PressInteraction.Press press, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3247r0 = press;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AbstractClickableNode.this.new a(this.f3247r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3245p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableInteractionSource mutableInteractionSource = AbstractClickableNode.this.J0;
                this.f3245p0 = 1;
                if (mutableInteractionSource.emit(this.f3247r0, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Clickable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", i = {}, l = {727}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3248p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PressInteraction.Press f3250r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PressInteraction.Press press, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f3250r0 = press;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AbstractClickableNode.this.new b(this.f3250r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3248p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableInteractionSource mutableInteractionSource = AbstractClickableNode.this.J0;
                PressInteraction.Release release = new PressInteraction.Release(this.f3250r0);
                this.f3248p0 = 1;
                if (mutableInteractionSource.emit(release, this) == coroutine_suspended) {
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

    public AbstractClickableNode(MutableInteractionSource interactionSource, boolean z10, Function0 onClick) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.J0 = interactionSource;
        this.K0 = z10;
        this.L0 = onClick;
        this.M0 = new InteractionData();
    }

    public final void b() {
        InteractionData interactionData = this.M0;
        PressInteraction.Press pressInteraction = interactionData.getPressInteraction();
        if (pressInteraction != null) {
            this.J0.tryEmit(new PressInteraction.Cancel(pressInteraction));
        }
        Iterator<T> it = interactionData.getCurrentKeyPressInteractions().values().iterator();
        while (it.hasNext()) {
            this.J0.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
        }
        interactionData.setPressInteraction(null);
        interactionData.getCurrentKeyPressInteractions().clear();
    }

    @NotNull
    public abstract androidx.compose.foundation.a c();

    public final void d(@NotNull MutableInteractionSource interactionSource, boolean z10, @NotNull Function0 onClick) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (!Intrinsics.areEqual(this.J0, interactionSource)) {
            b();
            this.J0 = interactionSource;
        }
        if (this.K0 != z10) {
            if (!z10) {
                b();
            }
            this.K0 = z10;
        }
        this.L0 = onClick;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return i1.n.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        c().onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ void onDensityChange() {
        i1.n.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        b();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo114onKeyEventZmokQxo(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z10 = this.K0;
        InteractionData interactionData = this.M0;
        if (z10 && Clickable_androidKt.m156isPressZmokQxo(event)) {
            if (interactionData.getCurrentKeyPressInteractions().containsKey(Key.m3055boximpl(KeyEvent_androidKt.m3366getKeyZmokQxo(event)))) {
                return false;
            }
            PressInteraction.Press press = new PressInteraction.Press(interactionData.getCentreOffset(), null);
            interactionData.getCurrentKeyPressInteractions().put(Key.m3055boximpl(KeyEvent_androidKt.m3366getKeyZmokQxo(event)), press);
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new a(press, null), 3, null);
        } else {
            if (!this.K0 || !Clickable_androidKt.m155isClickZmokQxo(event)) {
                return false;
            }
            PressInteraction.Press pressRemove = interactionData.getCurrentKeyPressInteractions().remove(Key.m3055boximpl(KeyEvent_androidKt.m3366getKeyZmokQxo(event)));
            if (pressRemove != null) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new b(pressRemove, null), 3, null);
            }
            this.L0.invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void mo115onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long j10) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        c().mo115onPointerEventH0pRuoY(pointerEvent, pass, j10);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo116onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
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
