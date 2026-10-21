package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$clockDial$2$3", f = "TimePicker.kt", i = {}, l = {1265}, m = "invokeSuspend", n = {}, s = {})
public final class d5 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f12767p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f12768q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12769r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12770s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f12771t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ float f12772u0;
    public final /* synthetic */ MutableState<Float> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f12773w0;

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f12774p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12775q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f12776r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineScope coroutineScope, TimePickerState timePickerState, boolean z10) {
            super(0);
            this.f12774p0 = coroutineScope;
            this.f12775q0 = timePickerState;
            this.f12776r0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f12774p0, null, null, new c5(this.f12775q0, this.f12776r0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class b extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f12777p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12778q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f12779r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f12780s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f12781t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineScope coroutineScope, TimePickerState timePickerState, float f6, MutableState<Float> mutableState, MutableState<Float> mutableState2) {
            super(2);
            this.f12777p0 = coroutineScope;
            this.f12778q0 = timePickerState;
            this.f12779r0 = f6;
            this.f12780s0 = mutableState;
            this.f12781t0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
            long f15533a = offset.getF15533a();
            Intrinsics.checkNotNullParameter(pointerInputChange, "<anonymous parameter 0>");
            BuildersKt__Builders_commonKt.launch$default(this.f12777p0, null, null, new e5(f15533a, this.f12778q0, this.f12780s0, this.f12781t0, null), 3, null);
            this.f12778q0.moveSelector$material3_release(this.f12780s0.getValue().floatValue(), this.f12781t0.getValue().floatValue(), this.f12779r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(float f6, TimePickerState timePickerState, MutableState mutableState, MutableState mutableState2, Continuation continuation, CoroutineScope coroutineScope, boolean z10) {
        super(2, continuation);
        this.f12769r0 = coroutineScope;
        this.f12770s0 = timePickerState;
        this.f12771t0 = z10;
        this.f12772u0 = f6;
        this.v0 = mutableState;
        this.f12773w0 = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CoroutineScope coroutineScope = this.f12769r0;
        d5 d5Var = new d5(this.f12772u0, this.f12770s0, this.v0, this.f12773w0, continuation, coroutineScope, this.f12771t0);
        d5Var.f12768q0 = obj;
        return d5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((d5) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f12767p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f12768q0;
            a aVar = new a(this.f12769r0, this.f12770s0, this.f12771t0);
            b bVar = new b(this.f12769r0, this.f12770s0, this.f12772u0, this.v0, this.f12773w0);
            this.f12767p0 = 1;
            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, aVar, null, bVar, this, 5, null) == coroutine_suspended) {
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
