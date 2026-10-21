package mb;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.wearables.info.library.WearableDeviceInfo;
import com.bbva.plugin.wearables.info.library.models.PairedDeviceState;
import com.bbva.plugin.wearables.info.plugin.commands.GetWearableConnectivityCommand;
import com.bbva.plugin.wearables.info.plugin.models.WearableConnectivityRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetWearableConnectivityCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.wearables.info.plugin.commands.GetWearableConnectivityCommand$getConnectivity$1", f = "GetWearableConnectivityCommand.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83384p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GetWearableConnectivityCommand f83385q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ WearableConnectivityRequest f83386r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f83387s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GetWearableConnectivityCommand getWearableConnectivityCommand, WearableConnectivityRequest wearableConnectivityRequest, CommandCallback commandCallback, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f83385q0 = getWearableConnectivityCommand;
        this.f83386r0 = wearableConnectivityRequest;
        this.f83387s0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f83385q0, this.f83386r0, this.f83387s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83384p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            WearableDeviceInfo wearableDeviceInfo = this.f83385q0.f36088p0;
            String appId = this.f83386r0.getAppId();
            this.f83384p0 = 1;
            obj = wearableDeviceInfo.getConnectionState(appId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f83387s0.sendEvent(((PairedDeviceState) obj).getId());
        return Unit.INSTANCE;
    }
}
