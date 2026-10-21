package l0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material3.SliderDraggableState$dragScope$1;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1508:1\n76#2:1509\n102#2,2:1510\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDraggableState\n*L\n1435#1:1509\n1435#1:1510,2\n*E\n"})
public final class o3 implements DraggableState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Unit> f82761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f82762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SliderDraggableState$dragScope$1 f82763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f82764d;

    /* JADX INFO: compiled from: Slider.kt */
    @DebugMetadata(c = "androidx.compose.material3.SliderDraggableState$drag$2", f = "Slider.kt", i = {}, l = {1449}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f82765p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f82767r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> f82768s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f82767r0 = mutatePriority;
            this.f82768s0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o3.this.new a(this.f82767r0, this.f82768s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f82765p0;
            o3 o3Var = o3.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                o3Var.f82762b.setValue(Boolean.TRUE);
                this.f82765p0 = 1;
                if (o3Var.f82764d.mutateWith(o3Var.f82763c, this.f82767r0, this.f82768s0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o3Var.f82762b.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.material3.SliderDraggableState$dragScope$1] */
    public o3(@NotNull SliderKt.a0 onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f82761a = onDelta;
        this.f82762b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f82763c = new DragScope() { // from class: androidx.compose.material3.SliderDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float pixels) {
                this.f11329a.f82761a.invoke(Float.valueOf(pixels));
            }
        };
        this.f82764d = new MutatorMutex();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float f6) {
        this.f82761a.invoke(Float.valueOf(f6));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public final Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(mutatePriority, function2, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
