package l0;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.DragGestureDetectorCopyKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
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
@DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1249}, m = "invokeSuspend", n = {}, s = {})
public final class s3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82882p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f82883q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f82884r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f82885s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f82886t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f82887u0;
    public final /* synthetic */ State<Function2<Boolean, Float, Unit>> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ boolean f82888w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f82889x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Boolean, Unit>> f82890y0;

    /* JADX INFO: compiled from: Slider.kt */
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1250}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f82891p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f82892q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f82893r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f82894s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f82895t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ w2 f82896u0;
        public final /* synthetic */ State<Float> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Boolean, Unit>> f82897w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f82898x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ State<Function2<Boolean, Float, Unit>> f82899y0;

        /* JADX INFO: renamed from: l0.s3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1251, ReturnCode.ERR_CRY_ENC_INVALID_KEY, 1280}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
        public static final class C0457a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ CoroutineScope E0;
            public final /* synthetic */ State<Function1<Boolean, Unit>> F0;
            public final /* synthetic */ State<Float> G0;
            public final /* synthetic */ State<Function2<Boolean, Float, Unit>> H0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Object f82900p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public DragInteraction.Start f82901q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public Ref.FloatRef f82902r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public Ref.BooleanRef f82903s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f82904t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public /* synthetic */ Object f82905u0;
            public final /* synthetic */ boolean v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public final /* synthetic */ int f82906w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public final /* synthetic */ w2 f82907x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public final /* synthetic */ State<Float> f82908y0;

            /* JADX INFO: renamed from: l0.s3$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Slider.kt */
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1297}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0458a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f82909p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ w2 f82910q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ Ref.BooleanRef f82911r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ DragInteraction f82912s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0458a(w2 w2Var, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super C0458a> continuation) {
                    super(2, continuation);
                    this.f82910q0 = w2Var;
                    this.f82911r0 = booleanRef;
                    this.f82912s0 = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0458a(this.f82910q0, this.f82911r0, this.f82912s0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0458a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f82909p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        boolean z10 = this.f82911r0.element;
                        w2 w2Var = this.f82910q0;
                        MutableInteractionSource mutableInteractionSource = z10 ? w2Var.f83021a : w2Var.f83022b;
                        this.f82909p0 = 1;
                        if (mutableInteractionSource.emit(this.f82912s0, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: l0.s3$a$a$b */
            /* JADX INFO: compiled from: Slider.kt */
            public static final class b extends Lambda implements Function1<PointerInputChange, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ State<Function2<Boolean, Float, Unit>> f82913p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Ref.BooleanRef f82914q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ boolean f82915r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(State<? extends Function2<? super Boolean, ? super Float, Unit>> state, Ref.BooleanRef booleanRef, boolean z10) {
                    super(1);
                    this.f82913p0 = state;
                    this.f82914q0 = booleanRef;
                    this.f82915r0 = z10;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(PointerInputChange pointerInputChange) {
                    PointerInputChange it = pointerInputChange;
                    Intrinsics.checkNotNullParameter(it, "it");
                    float fM2275getXimpl = Offset.m2275getXimpl(PointerEventKt.positionChange(it));
                    Function2<Boolean, Float, Unit> value = this.f82913p0.getValue();
                    Boolean boolValueOf = Boolean.valueOf(this.f82914q0.element);
                    if (this.f82915r0) {
                        fM2275getXimpl = -fM2275getXimpl;
                    }
                    value.invoke(boolValueOf, Float.valueOf(fM2275getXimpl));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0457a(boolean z10, int i10, w2 w2Var, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C0457a> continuation) {
                super(2, continuation);
                this.v0 = z10;
                this.f82906w0 = i10;
                this.f82907x0 = w2Var;
                this.f82908y0 = state;
                this.E0 = coroutineScope;
                this.F0 = state2;
                this.G0 = state3;
                this.H0 = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0457a c0457a = new C0457a(this.v0, this.f82906w0, this.f82907x0, this.f82908y0, this.E0, this.F0, this.G0, this.H0, continuation);
                c0457a.f82905u0 = obj;
                return c0457a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C0457a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0107  */
            /* JADX WARN: Code duplicated, block: B:52:0x0190  */
            /* JADX WARN: Code duplicated, block: B:54:0x019d  */
            /* JADX WARN: Code duplicated, block: B:58:0x01d8 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:61:0x01e1 A[Catch: CancellationException -> 0x01e7, TryCatch #1 {CancellationException -> 0x01e7, blocks: (B:59:0x01d9, B:61:0x01e1, B:63:0x01e9, B:56:0x01ba), top: B:71:0x01ba }] */
            /* JADX WARN: Code duplicated, block: B:63:0x01e9 A[Catch: CancellationException -> 0x01e7, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x01e7, blocks: (B:59:0x01d9, B:61:0x01e1, B:63:0x01e9, B:56:0x01ba), top: B:71:0x01ba }] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objAwaitFirstDown$default;
                AwaitPointerEventScope awaitPointerEventScope;
                Ref.FloatRef floatRef;
                Object objM1245access$awaitSlop8vUncbI;
                DragInteraction.Start interaction;
                Ref.BooleanRef booleanRef;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange;
                Pair pair;
                boolean z10;
                State<Float> state;
                DragInteraction.Start start;
                Object objM195horizontalDragjO51t88;
                float fM1085pointerSlopE8SPZFQ;
                DragInteraction cancel;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f82904t0;
                State<Float> state2 = this.f82908y0;
                w2 w2Var = this.f82907x0;
                boolean z11 = this.v0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f82905u0;
                    this.f82905u0 = awaitPointerEventScope3;
                    this.f82904t0 = 1;
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
                            booleanRef = (Ref.BooleanRef) this.f82900p0;
                            start = (DragInteraction.Start) this.f82905u0;
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
                            BuildersKt__Builders_commonKt.launch$default(this.E0, null, null, new C0458a(w2Var, booleanRef, cancel, null), 3, null);
                            return Unit.INSTANCE;
                        }
                        booleanRef = this.f82903s0;
                        floatRef = this.f82902r0;
                        DragInteraction.Start start2 = this.f82901q0;
                        PointerInputChange pointerInputChange2 = (PointerInputChange) this.f82900p0;
                        AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.f82905u0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        pointerInputChange = pointerInputChange2;
                        interaction = start2;
                        objM1245access$awaitSlop8vUncbI = obj;
                        pair = (Pair) objM1245access$awaitSlop8vUncbI;
                        if (pair != null) {
                            fM1085pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m1085pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                            if (Math.abs(this.G0.getValue().floatValue() - floatRef.element) < fM1085pointerSlopE8SPZFQ && Math.abs(state2.getValue().floatValue() - floatRef.element) < fM1085pointerSlopE8SPZFQ) {
                                float fFloatValue = ((Number) pair.getSecond()).floatValue();
                                booleanRef.element = z11 ? fFloatValue < 0.0f : fFloatValue >= 0.0f;
                                floatRef.element = Offset.m2275getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst())) + floatRef.element;
                            }
                        }
                        z10 = booleanRef.element;
                        float f6 = floatRef.element;
                        CoroutineScope scope = this.E0;
                        w2Var.getClass();
                        Intrinsics.checkNotNullParameter(interaction, "interaction");
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        Function2<Boolean, Float, Unit> value = w2Var.f83025e.getValue();
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        if (z10) {
                            state = w2Var.f83023c;
                        } else {
                            state = w2Var.f83024d;
                        }
                        value.invoke(boolValueOf, Float.valueOf(f6 - state.getValue().floatValue()));
                        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new v2(w2Var, z10, interaction, null), 3, null);
                        try {
                            long id = pointerInputChange.getId();
                            b bVar = new b(this.H0, booleanRef, z11);
                            this.f82905u0 = interaction;
                            this.f82900p0 = booleanRef;
                            this.f82901q0 = null;
                            this.f82902r0 = null;
                            this.f82903s0 = null;
                            this.f82904t0 = 3;
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
                        BuildersKt__Builders_commonKt.launch$default(this.E0, null, null, new C0458a(w2Var, booleanRef, cancel, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.f82905u0;
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = awaitPointerEventScope5;
                    objAwaitFirstDown$default = obj;
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) objAwaitFirstDown$default;
                DragInteraction.Start start3 = new DragInteraction.Start();
                floatRef = new Ref.FloatRef();
                float fM2275getXimpl = z11 ? this.f82906w0 - Offset.m2275getXimpl(pointerInputChange3.getPosition()) : Offset.m2275getXimpl(pointerInputChange3.getPosition());
                floatRef.element = fM2275getXimpl;
                int iCompare = Float.compare(Math.abs(w2Var.f83023c.getValue().floatValue() - fM2275getXimpl), Math.abs(w2Var.f83024d.getValue().floatValue() - fM2275getXimpl));
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.element = iCompare == 0 ? state2.getValue().floatValue() > floatRef.element : iCompare < 0;
                long id2 = pointerInputChange3.getId();
                int type = pointerInputChange3.getType();
                this.f82905u0 = awaitPointerEventScope;
                this.f82900p0 = pointerInputChange3;
                this.f82901q0 = start3;
                this.f82902r0 = floatRef;
                this.f82903s0 = booleanRef2;
                this.f82904t0 = 2;
                objM1245access$awaitSlop8vUncbI = SliderKt.m1245access$awaitSlop8vUncbI(awaitPointerEventScope, id2, type, this);
                if (objM1245access$awaitSlop8vUncbI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interaction = start3;
                booleanRef = booleanRef2;
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerInputChange = pointerInputChange3;
                pair = (Pair) objM1245access$awaitSlop8vUncbI;
                if (pair != null) {
                    fM1085pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m1085pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                    if (Math.abs(this.G0.getValue().floatValue() - floatRef.element) < fM1085pointerSlopE8SPZFQ) {
                        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
                        booleanRef.element = z11 ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f;
                        floatRef.element = Offset.m2275getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst())) + floatRef.element;
                    }
                }
                z10 = booleanRef.element;
                float f10 = floatRef.element;
                CoroutineScope scope2 = this.E0;
                w2Var.getClass();
                Intrinsics.checkNotNullParameter(interaction, "interaction");
                Intrinsics.checkNotNullParameter(scope2, "scope");
                Function2<Boolean, Float, Unit> value2 = w2Var.f83025e.getValue();
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                if (z10) {
                    state = w2Var.f83023c;
                } else {
                    state = w2Var.f83024d;
                }
                value2.invoke(boolValueOf2, Float.valueOf(f10 - state.getValue().floatValue()));
                BuildersKt__Builders_commonKt.launch$default(scope2, null, null, new v2(w2Var, z10, interaction, null), 3, null);
                long id3 = pointerInputChange.getId();
                b bVar2 = new b(this.H0, booleanRef, z11);
                this.f82905u0 = interaction;
                this.f82900p0 = booleanRef;
                this.f82901q0 = null;
                this.f82902r0 = null;
                this.f82903s0 = null;
                this.f82904t0 = 3;
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
                BuildersKt__Builders_commonKt.launch$default(this.E0, null, null, new C0458a(w2Var, booleanRef, cancel, null), 3, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PointerInputScope pointerInputScope, boolean z10, int i10, w2 w2Var, State<Float> state, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f82893r0 = pointerInputScope;
            this.f82894s0 = z10;
            this.f82895t0 = i10;
            this.f82896u0 = w2Var;
            this.v0 = state;
            this.f82897w0 = state2;
            this.f82898x0 = state3;
            this.f82899y0 = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f82893r0, this.f82894s0, this.f82895t0, this.f82896u0, this.v0, this.f82897w0, this.f82898x0, this.f82899y0, continuation);
            aVar.f82892q0 = obj;
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
            int i10 = this.f82891p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0457a c0457a = new C0457a(this.f82894s0, this.f82895t0, this.f82896u0, this.v0, (CoroutineScope) this.f82892q0, this.f82897w0, this.f82898x0, this.f82899y0, null);
                this.f82891p0 = 1;
                if (ForEachGestureKt.awaitEachGesture(this.f82893r0, c0457a, this) == coroutine_suspended) {
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
    public s3(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends Function2<? super Boolean, ? super Float, Unit>> state3, boolean z10, int i10, State<? extends Function1<? super Boolean, Unit>> state4, Continuation<? super s3> continuation) {
        super(2, continuation);
        this.f82884r0 = mutableInteractionSource;
        this.f82885s0 = mutableInteractionSource2;
        this.f82886t0 = state;
        this.f82887u0 = state2;
        this.v0 = state3;
        this.f82888w0 = z10;
        this.f82889x0 = i10;
        this.f82890y0 = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        s3 s3Var = new s3(this.f82884r0, this.f82885s0, this.f82886t0, this.f82887u0, this.v0, this.f82888w0, this.f82889x0, this.f82890y0, continuation);
        s3Var.f82883q0 = obj;
        return s3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((s3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82882p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = new a((PointerInputScope) this.f82883q0, this.f82888w0, this.f82889x0, new w2(this.f82884r0, this.f82885s0, this.f82886t0, this.f82887u0, this.v0), this.f82886t0, this.f82890y0, this.f82887u0, this.v0, null);
            this.f82882p0 = 1;
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
