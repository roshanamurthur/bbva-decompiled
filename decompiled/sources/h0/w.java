package h0;

import androidx.compose.material.BottomSheetState;
import androidx.compose.material.BottomSheetValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$1", f = "BottomSheetScaffold.kt", i = {}, l = {737}, m = "invokeSuspend", n = {}, s = {})
public final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69145p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f69146q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetValue f69147r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, Continuation<? super w> continuation) {
        super(2, continuation);
        this.f69146q0 = bottomSheetState;
        this.f69147r0 = bottomSheetValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new w(this.f69146q0, this.f69147r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69145p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            BottomSheetState bottomSheetState = this.f69146q0;
            float lastVelocity$material_release = bottomSheetState.getLastVelocity$material_release();
            this.f69145p0 = 1;
            if (bottomSheetState.animateTo$material_release(this.f69147r0, lastVelocity$material_release, this) == coroutine_suspended) {
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
