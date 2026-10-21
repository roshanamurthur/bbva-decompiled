package h0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material.SliderDraggableState$dragScope$1;
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
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1190:1\n81#2:1191\n107#2,2:1192\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n*L\n1169#1:1191\n1169#1:1192,2\n*E\n"})
public final class m2 implements DraggableState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Unit> f68912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f68913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SliderDraggableState$dragScope$1 f68914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f68915d;

    /* JADX INFO: compiled from: Slider.kt */
    @DebugMetadata(c = "androidx.compose.material.SliderDraggableState$drag$2", f = "Slider.kt", i = {}, l = {1183}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f68916p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f68918r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> f68919s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f68918r0 = mutatePriority;
            this.f68919s0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return m2.this.new a(this.f68918r0, this.f68919s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f68916p0;
            m2 m2Var = m2.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                m2Var.f68913b.setValue(Boolean.TRUE);
                this.f68916p0 = 1;
                if (m2Var.f68915d.mutateWith(m2Var.f68914c, this.f68918r0, this.f68919s0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m2Var.f68913b.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.material.SliderDraggableState$dragScope$1] */
    public m2(@NotNull androidx.compose.material.e2 onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f68912a = onDelta;
        this.f68913b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f68914c = new DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float pixels) {
                this.f7611a.f68912a.invoke(Float.valueOf(pixels));
            }
        };
        this.f68915d = new MutatorMutex();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float f6) {
        this.f68912a.invoke(Float.valueOf(f6));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @Nullable
    public final Object drag(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(mutatePriority, function2, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
