package f0;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$1", f = "SelectionController.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68374p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68375q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1 f68376r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1 selectionControllerKt$makeSelectionModifier$longPressDragObserver$1, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f68376r0 = selectionControllerKt$makeSelectionModifier$longPressDragObserver$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        c cVar = new c(this.f68376r0, continuation);
        cVar.f68375q0 = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((c) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68374p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f68375q0;
            this.f68374p0 = 1;
            if (LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver(pointerInputScope, this.f68376r0, this) == coroutine_suspended) {
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
