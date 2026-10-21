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
@DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1", f = "ModalBottomSheet.kt", i = {}, l = {819}, m = "invokeSuspend", n = {}, s = {})
public final class p1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69031p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f69032q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetValue f69033r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, Continuation<? super p1> continuation) {
        super(2, continuation);
        this.f69032q0 = modalBottomSheetState;
        this.f69033r0 = modalBottomSheetValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new p1(this.f69032q0, this.f69033r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((p1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69031p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ModalBottomSheetState modalBottomSheetState = this.f69032q0;
            float lastVelocity$material_release = modalBottomSheetState.getLastVelocity$material_release();
            this.f69031p0 = 1;
            if (modalBottomSheetState.animateTo$material_release(this.f69033r0, lastVelocity$material_release, this) == coroutine_suspended) {
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
