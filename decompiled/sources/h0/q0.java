package h0;

import androidx.compose.material.BottomDrawerState;
import androidx.compose.material.BottomDrawerValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$2", f = "Drawer.kt", i = {}, l = {953}, m = "invokeSuspend", n = {}, s = {})
public final class q0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69068p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f69069q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ BottomDrawerValue f69070r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, Continuation<? super q0> continuation) {
        super(2, continuation);
        this.f69069q0 = bottomDrawerState;
        this.f69070r0 = bottomDrawerValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new q0(this.f69069q0, this.f69070r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((q0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69068p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f69068p0 = 1;
            if (this.f69069q0.snapTo$material_release(this.f69070r0, this) == coroutine_suspended) {
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
