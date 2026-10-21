package f0;

import androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
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
@DebugMetadata(c = "androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$2", f = "SelectionController.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68378q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1 f68379r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1 selectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f68379r0 = selectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        d dVar = new d(this.f68379r0, continuation);
        dVar.f68378q0 = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((d) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68377p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f68378q0;
            this.f68377p0 = 1;
            if (TextSelectionMouseDetectorKt.mouseSelectionDetector(pointerInputScope, this.f68379r0, this) == coroutine_suspended) {
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
