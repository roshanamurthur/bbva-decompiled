package h5;

import com.bbva.component.root.checker.RootCheckerComponent;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.root.RootApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RootCheckerComponent.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.root.checker.RootCheckerComponent$isRooted$2", f = "RootCheckerComponent.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69350p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RootCheckerComponent f69351q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RootCheckerComponent rootCheckerComponent, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f69351q0 = rootCheckerComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f69351q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69350p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            RootApi root = this.f69351q0.f28231r0.getRoot();
            this.f69350p0 = 1;
            obj = RootApi.isRoot$default(root, false, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Boolean bool = (Boolean) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull((Result) obj);
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }
}
