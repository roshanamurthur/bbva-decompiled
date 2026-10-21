package h0;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$2", f = "ModalBottomSheet.kt", i = {}, l = {823}, m = "invokeSuspend", n = {}, s = {})
public final class q1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69071p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f69072q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetValue f69073r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super q1> continuation) {
        super(2, continuation);
        this.f69072q0 = modalBottomSheetState;
        this.f69073r0 = modalBottomSheetValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new q1(this.f69072q0, this.f69073r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((q1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69071p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f69071p0 = 1;
            if (this.f69072q0.snapTo$material_release(this.f69073r0, this) == coroutine_suspended) {
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
