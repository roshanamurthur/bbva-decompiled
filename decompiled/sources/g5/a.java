package g5;

import com.bbva.component.request.headers.HeaderAccessIdInterceptor;
import com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HeaderAccessIdInterceptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.request.headers.HeaderAccessIdInterceptor$obtainAccessId$1", f = "HeaderAccessIdInterceptor.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68586p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ HeaderAccessIdInterceptor f68587q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HeaderAccessIdInterceptor headerAccessIdInterceptor, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f68587q0 = headerAccessIdInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f68587q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68586p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            DeviceManagerDataSource deviceManagerDataSource = this.f68587q0.f28220b;
            this.f68586p0 = 1;
            obj = deviceManagerDataSource.getAccessId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
