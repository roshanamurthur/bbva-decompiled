package h0;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.mastercard.sonic.StatusCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
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

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {StatusCode.ERROR_WHILE_PLAYING_HAPTICS}, m = "invokeSuspend", n = {}, s = {})
public final class x2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69198p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f69199q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f69200r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f69201s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f69202t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f69203u0;
    public final /* synthetic */ CoroutineScope v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ DraggableState f69204w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f69205x0;

    /* JADX INFO: compiled from: Slider.kt */
    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {915}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f69206p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ PressGestureScope f69207q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ long f69208r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f69209s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f69210t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f69211u0;
        public final /* synthetic */ State<Float> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, float f6, MutableState<Float> mutableState, State<Float> state, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f69209s0 = z10;
            this.f69210t0 = f6;
            this.f69211u0 = mutableState;
            this.v0 = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            long f15533a = offset.getF15533a();
            a aVar = new a(this.f69209s0, this.f69210t0, this.f69211u0, this.v0, continuation);
            aVar.f69207q0 = pressGestureScope;
            aVar.f69208r0 = f15533a;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f69206p0;
            MutableState<Float> mutableState = this.f69211u0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PressGestureScope pressGestureScope = this.f69207q0;
                    long j10 = this.f69208r0;
                    mutableState.setValue(Boxing.boxFloat((this.f69209s0 ? this.f69210t0 - Offset.m2275getXimpl(j10) : Offset.m2275getXimpl(j10)) - this.v0.getValue().floatValue()));
                    this.f69206p0 = 1;
                    if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (GestureCancellationException unused) {
                mutableState.setValue(Boxing.boxFloat(0.0f));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    public static final class b extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f69212p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DraggableState f69213q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Float, Unit>> f69214r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state) {
            super(1);
            this.f69212p0 = coroutineScope;
            this.f69213q0 = draggableState;
            this.f69214r0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getF15533a();
            BuildersKt__Builders_commonKt.launch$default(this.f69212p0, null, null, new y2(this.f69213q0, this.f69214r0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x2(boolean z10, float f6, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1<? super Float, Unit>> state2, Continuation<? super x2> continuation) {
        super(2, continuation);
        this.f69200r0 = z10;
        this.f69201s0 = f6;
        this.f69202t0 = mutableState;
        this.f69203u0 = state;
        this.v0 = coroutineScope;
        this.f69204w0 = draggableState;
        this.f69205x0 = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        x2 x2Var = new x2(this.f69200r0, this.f69201s0, this.f69202t0, this.f69203u0, this.v0, this.f69204w0, this.f69205x0, continuation);
        x2Var.f69199q0 = obj;
        return x2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((x2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69198p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f69199q0;
            a aVar = new a(this.f69200r0, this.f69201s0, this.f69202t0, this.f69203u0, null);
            b bVar = new b(this.v0, this.f69204w0, this.f69205x0);
            this.f69198p0 = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, aVar, bVar, this, 3, null) == coroutine_suspended) {
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
