package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
public final class k2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f12964p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SheetState f12965q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f12966r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(SheetState sheetState, float f6, Continuation<? super k2> continuation) {
        super(2, continuation);
        this.f12965q0 = sheetState;
        this.f12966r0 = f6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new k2(this.f12965q0, this.f12966r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((k2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f12964p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f12964p0 = 1;
            if (this.f12965q0.settle$material3_release(this.f12966r0, this) == coroutine_suspended) {
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
