package f7;

import com.bbva.ethermobilesdk.geolocation.activity.model.ActivityResponse;
import com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityGooglePlayServicesProvider;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: ActivityGooglePlayServicesProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityGooglePlayServicesProvider$notifyActivity$1", f = "ActivityGooglePlayServicesProvider.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68385p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ActivityGooglePlayServicesProvider f68386q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ActivityResponse f68387r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ActivityGooglePlayServicesProvider activityGooglePlayServicesProvider, ActivityResponse activityResponse, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f68386q0 = activityGooglePlayServicesProvider;
        this.f68387r0 = activityResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new e(this.f68386q0, this.f68387r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68385p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.f68386q0.f29782r0;
            this.f68385p0 = 1;
            if (mutableSharedFlow.emit(this.f68387r0, this) == coroutine_suspended) {
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
