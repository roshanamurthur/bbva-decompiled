package l0;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.MutableState;
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

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$clockDial$2$2", f = "TimePicker.kt", i = {}, l = {1254}, m = "invokeSuspend", n = {}, s = {})
public final class j5 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82631p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f82632q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f82633r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f82634s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82635t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f82636u0;
    public final /* synthetic */ float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ boolean f82637w0;

    /* JADX INFO: compiled from: TimePicker.kt */
    @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$clockDial$2$2$1", f = "TimePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ long f82638p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f82639q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f82640r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Float> mutableState, MutableState<Float> mutableState2, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f82639q0 = mutableState;
            this.f82640r0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            long f15533a = offset.getF15533a();
            a aVar = new a(this.f82639q0, this.f82640r0, continuation);
            aVar.f82638p0 = f15533a;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long j10 = this.f82638p0;
            this.f82639q0.setValue(Float.valueOf(Offset.m2275getXimpl(j10)));
            this.f82640r0.setValue(Float.valueOf(Offset.m2276getYimpl(j10)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class b extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f82641p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f82642q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f82643r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f82644s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineScope coroutineScope, TimePickerState timePickerState, float f6, boolean z10) {
            super(1);
            this.f82641p0 = coroutineScope;
            this.f82642q0 = timePickerState;
            this.f82643r0 = f6;
            this.f82644s0 = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            BuildersKt__Builders_commonKt.launch$default(this.f82641p0, null, null, new k5(this.f82642q0, offset.getF15533a(), this.f82643r0, this.f82644s0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(float f6, TimePickerState timePickerState, MutableState mutableState, MutableState mutableState2, Continuation continuation, CoroutineScope coroutineScope, boolean z10) {
        super(2, continuation);
        this.f82633r0 = mutableState;
        this.f82634s0 = mutableState2;
        this.f82635t0 = coroutineScope;
        this.f82636u0 = timePickerState;
        this.v0 = f6;
        this.f82637w0 = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MutableState<Float> mutableState = this.f82633r0;
        MutableState<Float> mutableState2 = this.f82634s0;
        CoroutineScope coroutineScope = this.f82635t0;
        j5 j5Var = new j5(this.v0, this.f82636u0, mutableState, mutableState2, continuation, coroutineScope, this.f82637w0);
        j5Var.f82632q0 = obj;
        return j5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((j5) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f82631p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f82632q0;
            a aVar = new a(this.f82633r0, this.f82634s0, null);
            b bVar = new b(this.f82635t0, this.f82636u0, this.v0, this.f82637w0);
            this.f82631p0 = 1;
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
