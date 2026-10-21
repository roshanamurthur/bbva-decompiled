package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class c0 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f6096p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f6097q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f6098r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableState<PressInteraction.Press> f6099s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f6100t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Offset, Unit>> f6101u0;

    /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f6102p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ PressGestureScope f6103q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ long f6104r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f6105s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableState<PressInteraction.Press> f6106t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6107u0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.c0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
        public static final class C0040a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Object f6108p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f6109q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ MutableState<PressInteraction.Press> f6110r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ long f6111s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ MutableInteractionSource f6112t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0040a(MutableState<PressInteraction.Press> mutableState, long j10, MutableInteractionSource mutableInteractionSource, Continuation<? super C0040a> continuation) {
                super(2, continuation);
                this.f6110r0 = mutableState;
                this.f6111s0 = j10;
                this.f6112t0 = mutableInteractionSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0040a(this.f6110r0, this.f6111s0, this.f6112t0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0040a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0055  */
            /* JADX WARN: Code duplicated, block: B:23:0x005f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:24:0x0060  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MutableState<PressInteraction.Press> mutableState;
                PressInteraction.Press press;
                PressInteraction.Press press2;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f6109q0;
                MutableInteractionSource mutableInteractionSource = this.f6112t0;
                MutableState<PressInteraction.Press> mutableState2 = this.f6110r0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mutableState = (MutableState) this.f6108p0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        press2 = (PressInteraction.Press) this.f6108p0;
                        ResultKt.throwOnFailure(obj);
                    }
                    press = press2;
                    mutableState2.setValue(press);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                PressInteraction.Press value = mutableState2.getValue();
                if (value != null) {
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(value);
                    if (mutableInteractionSource != null) {
                        this.f6108p0 = mutableState2;
                        this.f6109q0 = 1;
                        if (mutableInteractionSource.emit(cancel, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    mutableState = mutableState2;
                } else {
                    press = new PressInteraction.Press(this.f6111s0, null);
                    if (mutableInteractionSource != null) {
                        this.f6108p0 = press;
                        this.f6109q0 = 2;
                        if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        press2 = press;
                        press = press2;
                    }
                }
                mutableState2.setValue(press);
                return Unit.INSTANCE;
                mutableState.setValue(null);
                press = new PressInteraction.Press(this.f6111s0, null);
                if (mutableInteractionSource != null) {
                    this.f6108p0 = press;
                    this.f6109q0 = 2;
                    if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    press2 = press;
                    press = press2;
                }
                mutableState2.setValue(press);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public MutableState f6113p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f6114q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ MutableState<PressInteraction.Press> f6115r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ boolean f6116s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ MutableInteractionSource f6117t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MutableState<PressInteraction.Press> mutableState, boolean z10, MutableInteractionSource mutableInteractionSource, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f6115r0 = mutableState;
                this.f6116s0 = z10;
                this.f6117t0 = mutableInteractionSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f6115r0, this.f6116s0, this.f6117t0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MutableState<PressInteraction.Press> mutableState;
                MutableState<PressInteraction.Press> mutableState2;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f6114q0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutableState = this.f6115r0;
                    PressInteraction.Press value = mutableState.getValue();
                    if (value != null) {
                        Interaction release = this.f6116s0 ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                        MutableInteractionSource mutableInteractionSource = this.f6117t0;
                        if (mutableInteractionSource != null) {
                            this.f6113p0 = mutableState;
                            this.f6114q0 = 1;
                            if (mutableInteractionSource.emit(release, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableState2 = mutableState;
                        }
                        mutableState.setValue(null);
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState2 = this.f6113p0;
                ResultKt.throwOnFailure(obj);
                mutableState = mutableState2;
                mutableState.setValue(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f6105s0 = coroutineScope;
            this.f6106t0 = mutableState;
            this.f6107u0 = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            long f15533a = offset.getF15533a();
            a aVar = new a(this.f6105s0, this.f6106t0, this.f6107u0, continuation);
            aVar.f6103q0 = pressGestureScope;
            aVar.f6104r0 = f15533a;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f6102p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = this.f6103q0;
                BuildersKt__Builders_commonKt.launch$default(this.f6105s0, null, null, new C0040a(this.f6106t0, this.f6104r0, this.f6107u0, null), 3, null);
                this.f6102p0 = 1;
                obj = pressGestureScope.tryAwaitRelease(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(this.f6105s0, null, null, new b(this.f6106t0, ((Boolean) obj).booleanValue(), this.f6107u0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldPressGestureFilter.kt */
    public static final class b extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Offset, Unit>> f6118p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<? extends Function1<? super Offset, Unit>> state) {
            super(1);
            this.f6118p0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            this.f6118p0.getValue().invoke(Offset.m2264boximpl(offset.getF15533a()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1<? super Offset, Unit>> state, Continuation<? super c0> continuation) {
        super(2, continuation);
        this.f6098r0 = coroutineScope;
        this.f6099s0 = mutableState;
        this.f6100t0 = mutableInteractionSource;
        this.f6101u0 = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        c0 c0Var = new c0(this.f6098r0, this.f6099s0, this.f6100t0, this.f6101u0, continuation);
        c0Var.f6097q0 = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((c0) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f6096p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f6097q0;
            a aVar = new a(this.f6098r0, this.f6099s0, this.f6100t0, null);
            b bVar = new b(this.f6101u0);
            this.f6096p0 = 1;
            if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, aVar, bVar, this) == coroutine_suspended) {
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
