package l0;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
@DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {1176}, m = "invokeSuspend", n = {}, s = {})
public final class t3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82944p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f82945q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f82946r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82947s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f82948t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f82949u0;
    public final /* synthetic */ CoroutineScope v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ DraggableState f82950w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ State<Function0<Unit>> f82951x0;

    /* JADX INFO: compiled from: Slider.kt */
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {1181}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f82952p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ PressGestureScope f82953q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ long f82954r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f82955s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f82956t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f82957u0;
        public final /* synthetic */ State<Float> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, int i10, MutableState<Float> mutableState, State<Float> state, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f82955s0 = z10;
            this.f82956t0 = i10;
            this.f82957u0 = mutableState;
            this.v0 = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            long f15533a = offset.getF15533a();
            a aVar = new a(this.f82955s0, this.f82956t0, this.f82957u0, this.v0, continuation);
            aVar.f82953q0 = pressGestureScope;
            aVar.f82954r0 = f15533a;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f82952p0;
            MutableState<Float> mutableState = this.f82957u0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PressGestureScope pressGestureScope = this.f82953q0;
                    long j10 = this.f82954r0;
                    mutableState.setValue(Boxing.boxFloat((this.f82955s0 ? this.f82956t0 - Offset.m2275getXimpl(j10) : Offset.m2275getXimpl(j10)) - this.v0.getValue().floatValue()));
                    this.f82952p0 = 1;
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
        public final /* synthetic */ CoroutineScope f82958p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DraggableState f82959q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Function0<Unit>> f82960r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function0<Unit>> state) {
            super(1);
            this.f82958p0 = coroutineScope;
            this.f82959q0 = draggableState;
            this.f82960r0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getF15533a();
            BuildersKt__Builders_commonKt.launch$default(this.f82958p0, null, null, new u3(this.f82959q0, this.f82960r0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t3(boolean z10, int i10, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function0<Unit>> state2, Continuation<? super t3> continuation) {
        super(2, continuation);
        this.f82946r0 = z10;
        this.f82947s0 = i10;
        this.f82948t0 = mutableState;
        this.f82949u0 = state;
        this.v0 = coroutineScope;
        this.f82950w0 = draggableState;
        this.f82951x0 = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        t3 t3Var = new t3(this.f82946r0, this.f82947s0, this.f82948t0, this.f82949u0, this.v0, this.f82950w0, this.f82951x0, continuation);
        t3Var.f82945q0 = obj;
        return t3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((t3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82944p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f82945q0;
            a aVar = new a(this.f82946r0, this.f82947s0, this.f82948t0, this.f82949u0, null);
            b bVar = new b(this.v0, this.f82950w0, this.f82951x0);
            this.f82944p0 = 1;
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
