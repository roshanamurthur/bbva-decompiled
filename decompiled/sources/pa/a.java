package pa;

import com.bbva.network.extension.OkHttpKt;
import com.bbva.network.impl.OkHttpNetworkWorker;
import com.bbva.network.model.SpeedEvent;
import com.bbva.network.model.response.MutableNetworkResponse;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OkHttpNetworkWorker.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.network.impl.OkHttpNetworkWorker$handleResponse$1$2$1", f = "OkHttpNetworkWorker.kt", i = {}, l = {ErrorCodes.ERR_CRY_BAD_PROTO}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92595p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ OkHttpNetworkWorker f92596q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Response f92597r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableNetworkResponse f92598s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OkHttpNetworkWorker okHttpNetworkWorker, Response response, MutableNetworkResponse mutableNetworkResponse, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f92596q0 = okHttpNetworkWorker;
        this.f92597r0 = response;
        this.f92598s0 = mutableNetworkResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f92596q0, this.f92597r0, this.f92598s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92595p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel channel = this.f92596q0.v0;
            SpeedEvent speedEvent = OkHttpKt.toSpeedEvent(this.f92597r0, this.f92598s0);
            this.f92595p0 = 1;
            if (channel.send(speedEvent, this) == coroutine_suspended) {
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
