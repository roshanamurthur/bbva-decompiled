package h0;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.DragGestureDetectorCopyKt;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.view.PointerIconCompat;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {983}, m = "invokeSuspend", n = {}, s = {})
public final class w2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69152p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f69153q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f69154r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f69155s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f69156t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f69157u0;
    public final /* synthetic */ State<Function2<Boolean, Float, Unit>> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ boolean f69158w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ float f69159x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Boolean, Unit>> f69160y0;

    /* JADX INFO: compiled from: Slider.kt */
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {984}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f69161p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f69162q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f69163r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f69164s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f69165t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ e2 f69166u0;
        public final /* synthetic */ State<Float> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Boolean, Unit>> f69167w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f69168x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ State<Function2<Boolean, Float, Unit>> f69169y0;

        /* JADX INFO: renamed from: h0.w2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {985, 995, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        public static final class C0288a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ CoroutineScope E0;
            public final /* synthetic */ State<Function1<Boolean, Unit>> F0;
            public final /* synthetic */ State<Float> G0;
            public final /* synthetic */ State<Function2<Boolean, Float, Unit>> H0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Object f69170p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public DragInteraction.Start f69171q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public Ref.FloatRef f69172r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public Ref.BooleanRef f69173s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f69174t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public /* synthetic */ Object f69175u0;
            public final /* synthetic */ boolean v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public final /* synthetic */ float f69176w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public final /* synthetic */ e2 f69177x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public final /* synthetic */ State<Float> f69178y0;

            /* JADX INFO: renamed from: h0.w2$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Slider.kt */
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1031}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0289a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f69179p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ e2 f69180q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ Ref.BooleanRef f69181r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ DragInteraction f69182s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0289a(e2 e2Var, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super C0289a> continuation) {
                    super(2, continuation);
                    this.f69180q0 = e2Var;
                    this.f69181r0 = booleanRef;
                    this.f69182s0 = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0289a(this.f69180q0, this.f69181r0, this.f69182s0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0289a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f69179p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        boolean z10 = this.f69181r0.element;
                        e2 e2Var = this.f69180q0;
                        MutableInteractionSource mutableInteractionSource = z10 ? e2Var.f68731a : e2Var.f68732b;
                        this.f69179p0 = 1;
                        if (mutableInteractionSource.emit(this.f69182s0, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: h0.w2$a$a$b */
            /* JADX INFO: compiled from: Slider.kt */
            public static final class b extends Lambda implements Function1<PointerInputChange, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ State<Function2<Boolean, Float, Unit>> f69183p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Ref.BooleanRef f69184q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ boolean f69185r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(State<? extends Function2<? super Boolean, ? super Float, Unit>> state, Ref.BooleanRef booleanRef, boolean z10) {
                    super(1);
                    this.f69183p0 = state;
                    this.f69184q0 = booleanRef;
                    this.f69185r0 = z10;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(PointerInputChange pointerInputChange) {
                    PointerInputChange it = pointerInputChange;
                    Intrinsics.checkNotNullParameter(it, "it");
                    float fM2275getXimpl = Offset.m2275getXimpl(PointerEventKt.positionChange(it));
                    Function2<Boolean, Float, Unit> value = this.f69183p0.getValue();
                    Boolean boolValueOf = Boolean.valueOf(this.f69184q0.element);
                    if (this.f69185r0) {
                        fM2275getXimpl = -fM2275getXimpl;
                    }
                    value.invoke(boolValueOf, Float.valueOf(fM2275getXimpl));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0288a(boolean z10, float f6, e2 e2Var, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C0288a> continuation) {
                super(2, continuation);
                this.v0 = z10;
                this.f69176w0 = f6;
                this.f69177x0 = e2Var;
                this.f69178y0 = state;
                this.E0 = coroutineScope;
                this.F0 = state2;
                this.G0 = state3;
                this.H0 = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0288a c0288a = new C0288a(this.v0, this.f69176w0, this.f69177x0, this.f69178y0, this.E0, this.F0, this.G0, this.H0, continuation);
                c0288a.f69175u0 = obj;
                return c0288a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C0288a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0102  */
            /* JADX WARN: Code duplicated, block: B:52:0x018b  */
            /* JADX WARN: Code duplicated, block: B:54:0x0198  */
            /* JADX WARN: Code duplicated, block: B:58:0x01d3 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:61:0x01dc A[Catch: CancellationException -> 0x01e2, TryCatch #0 {CancellationException -> 0x01e2, blocks: (B:59:0x01d4, B:61:0x01dc, B:63:0x01e4, B:56:0x01b5), top: B:69:0x01b5 }] */
            /* JADX WARN: Code duplicated, block: B:63:0x01e4 A[Catch: CancellationException -> 0x01e2, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01e2, blocks: (B:59:0x01d4, B:61:0x01dc, B:63:0x01e4, B:56:0x01b5), top: B:69:0x01b5 }] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objAwaitFirstDown$default;
                AwaitPointerEventScope awaitPointerEventScope;
                Ref.FloatRef floatRef;
                float fM2275getXimpl;
                Object objM816access$awaitSlop8vUncbI;
                DragInteraction.Start interaction;
                Ref.BooleanRef booleanRef;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange;
                Pair pair;
                boolean z10;
                State<Float> state;
                DragInteraction.Start start;
                Object objM195horizontalDragjO51t88;
                float fM748pointerSlopE8SPZFQ;
                DragInteraction cancel;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f69174t0;
                State<Float> state2 = this.f69178y0;
                e2 e2Var = this.f69177x0;
                boolean z11 = this.v0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f69175u0;
                    this.f69175u0 = awaitPointerEventScope3;
                    this.f69174t0 = 1;
                    objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope3, false, null, this, 2, null);
                    if (objAwaitFirstDown$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope = awaitPointerEventScope3;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            booleanRef = (Ref.BooleanRef) this.f69170p0;
                            start = (DragInteraction.Start) this.f69175u0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                interaction = start;
                                objM195horizontalDragjO51t88 = obj;
                                if (((Boolean) objM195horizontalDragjO51t88).booleanValue()) {
                                    cancel = new DragInteraction.Stop(interaction);
                                } else {
                                    cancel = new DragInteraction.Cancel(interaction);
                                }
                            } catch (CancellationException unused) {
                                cancel = new DragInteraction.Cancel(start);
                            }
                            this.F0.getValue().invoke(Boxing.boxBoolean(booleanRef.element));
                            BuildersKt__Builders_commonKt.launch$default(this.E0, null, null, new C0289a(e2Var, booleanRef, cancel, null), 3, null);
                            return Unit.INSTANCE;
                        }
                        booleanRef = this.f69173s0;
                        floatRef = this.f69172r0;
                        DragInteraction.Start start2 = this.f69171q0;
                        PointerInputChange pointerInputChange2 = (PointerInputChange) this.f69170p0;
                        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.f69175u0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        pointerInputChange = pointerInputChange2;
                        interaction = start2;
                        objM816access$awaitSlop8vUncbI = obj;
                        pair = (Pair) objM816access$awaitSlop8vUncbI;
                        if (pair != null) {
                            fM748pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m748pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                            if (Math.abs(this.G0.getValue().floatValue() - floatRef.element) < fM748pointerSlopE8SPZFQ && Math.abs(state2.getValue().floatValue() - floatRef.element) < fM748pointerSlopE8SPZFQ) {
                                float fFloatValue = ((Number) pair.getSecond()).floatValue();
                                booleanRef.element = z11 ? fFloatValue < 0.0f : fFloatValue >= 0.0f;
                                floatRef.element = Offset.m2275getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst())) + floatRef.element;
                            }
                        }
                        z10 = booleanRef.element;
                        float f6 = floatRef.element;
                        CoroutineScope scope = this.E0;
                        e2Var.getClass();
                        Intrinsics.checkNotNullParameter(interaction, "interaction");
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        Function2<Boolean, Float, Unit> value = e2Var.f68735e.getValue();
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        if (z10) {
                            state = e2Var.f68733c;
                        } else {
                            state = e2Var.f68734d;
                        }
                        value.invoke(boolValueOf, Float.valueOf(f6 - state.getValue().floatValue()));
                        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new d2(e2Var, z10, interaction, null), 3, null);
                        try {
                            long id = pointerInputChange.getId();
                            b bVar = new b(this.H0, booleanRef, z11);
                            this.f69175u0 = interaction;
                            this.f69170p0 = booleanRef;
                            this.f69171q0 = null;
                            this.f69172r0 = null;
                            this.f69173s0 = null;
                            this.f69174t0 = 3;
                            objM195horizontalDragjO51t88 = DragGestureDetectorKt.m195horizontalDragjO51t88(awaitPointerEventScope2, id, bVar, this);
                            if (objM195horizontalDragjO51t88 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Boolean) objM195horizontalDragjO51t88).booleanValue()) {
                                cancel = new DragInteraction.Stop(interaction);
                            } else {
                                cancel = new DragInteraction.Cancel(interaction);
                            }
                        } catch (CancellationException unused2) {
                            start = interaction;
                            cancel = new DragInteraction.Cancel(start);
                        }
                        this.F0.getValue().invoke(Boxing.boxBoolean(booleanRef.element));
                        BuildersKt__Builders_commonKt.launch$default(this.E0, null, null, new C0289a(e2Var, booleanRef, cancel, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.f69175u0;
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = awaitPointerEventScope5;
                    objAwaitFirstDown$default = obj;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) objAwaitFirstDown$default;
                DragInteraction.Start start3 = new DragInteraction.Start();
                floatRef = new Ref.FloatRef();
                long position = pointerInputChange3.getPosition();
                if (z11) {
                    fM2275getXimpl = this.f69176w0 - Offset.m2275getXimpl(position);
                } else {
                    fM2275getXimpl = Offset.m2275getXimpl(position);
                }
                floatRef.element = fM2275getXimpl;
                int iCompare = Float.compare(Math.abs(e2Var.f68733c.getValue().floatValue() - fM2275getXimpl), Math.abs(e2Var.f68734d.getValue().floatValue() - fM2275getXimpl));
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.element = iCompare == 0 ? state2.getValue().floatValue() > floatRef.element : iCompare < 0;
                long id2 = pointerInputChange3.getId();
                int type = pointerInputChange3.getType();
                this.f69175u0 = awaitPointerEventScope;
                this.f69170p0 = pointerInputChange3;
                this.f69171q0 = start3;
                this.f69172r0 = floatRef;
                this.f69173s0 = booleanRef2;
                this.f69174t0 = 2;
                objM816access$awaitSlop8vUncbI = SliderKt.m816access$awaitSlop8vUncbI(awaitPointerEventScope, id2, type, this);
                if (objM816access$awaitSlop8vUncbI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interaction = start3;
                booleanRef = booleanRef2;
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerInputChange = pointerInputChange3;
                pair = (Pair) objM816access$awaitSlop8vUncbI;
                if (pair != null) {
                    fM748pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m748pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                    if (Math.abs(this.G0.getValue().floatValue() - floatRef.element) < fM748pointerSlopE8SPZFQ) {
                        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
                        booleanRef.element = z11 ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f;
                        floatRef.element = Offset.m2275getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst())) + floatRef.element;
                    }
                }
                z10 = booleanRef.element;
                float f10 = floatRef.element;
                CoroutineScope scope2 = this.E0;
                e2Var.getClass();
                Intrinsics.checkNotNullParameter(interaction, "interaction");
                Intrinsics.checkNotNullParameter(scope2, "scope");
                Function2<Boolean, Float, Unit> value2 = e2Var.f68735e.getValue();
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                if (z10) {
                    state = e2Var.f68733c;
                } else {
                    state = e2Var.f68734d;
                }
                value2.invoke(boolValueOf2, Float.valueOf(f10 - state.getValue().floatValue()));
                BuildersKt__Builders_commonKt.launch$default(scope2, null, null, new d2(e2Var, z10, interaction, null), 3, null);
                long id3 = pointerInputChange.getId();
                b bVar2 = new b(this.H0, booleanRef, z11);
                this.f69175u0 = interaction;
                this.f69170p0 = booleanRef;
                this.f69171q0 = null;
                this.f69172r0 = null;
                this.f69173s0 = null;
                this.f69174t0 = 3;
                objM195horizontalDragjO51t88 = DragGestureDetectorKt.m195horizontalDragjO51t88(awaitPointerEventScope2, id3, bVar2, this);
                if (objM195horizontalDragjO51t88 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objM195horizontalDragjO51t88).booleanValue()) {
                    cancel = new DragInteraction.Stop(interaction);
                } else {
                    cancel = new DragInteraction.Cancel(interaction);
                }
                this.F0.getValue().invoke(Boxing.boxBoolean(booleanRef.element));
                BuildersKt__Builders_commonKt.launch$default(this.E0, null, null, new C0289a(e2Var, booleanRef, cancel, null), 3, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PointerInputScope pointerInputScope, boolean z10, float f6, e2 e2Var, State<Float> state, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f69163r0 = pointerInputScope;
            this.f69164s0 = z10;
            this.f69165t0 = f6;
            this.f69166u0 = e2Var;
            this.v0 = state;
            this.f69167w0 = state2;
            this.f69168x0 = state3;
            this.f69169y0 = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f69163r0, this.f69164s0, this.f69165t0, this.f69166u0, this.v0, this.f69167w0, this.f69168x0, this.f69169y0, continuation);
            aVar.f69162q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f69161p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0288a c0288a = new C0288a(this.f69164s0, this.f69165t0, this.f69166u0, this.v0, (CoroutineScope) this.f69162q0, this.f69167w0, this.f69168x0, this.f69169y0, null);
                this.f69161p0 = 1;
                if (ForEachGestureKt.awaitEachGesture(this.f69163r0, c0288a, this) == coroutine_suspended) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public w2(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends Function2<? super Boolean, ? super Float, Unit>> state3, boolean z10, float f6, State<? extends Function1<? super Boolean, Unit>> state4, Continuation<? super w2> continuation) {
        super(2, continuation);
        this.f69154r0 = mutableInteractionSource;
        this.f69155s0 = mutableInteractionSource2;
        this.f69156t0 = state;
        this.f69157u0 = state2;
        this.v0 = state3;
        this.f69158w0 = z10;
        this.f69159x0 = f6;
        this.f69160y0 = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        w2 w2Var = new w2(this.f69154r0, this.f69155s0, this.f69156t0, this.f69157u0, this.v0, this.f69158w0, this.f69159x0, this.f69160y0, continuation);
        w2Var.f69153q0 = obj;
        return w2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((w2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69152p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = new a((PointerInputScope) this.f69153q0, this.f69158w0, this.f69159x0, new e2(this.f69154r0, this.f69155s0, this.f69156t0, this.f69157u0, this.v0), this.f69156t0, this.f69160y0, this.f69157u0, this.v0, null);
            this.f69152p0 = 1;
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
