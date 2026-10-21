package o7;

import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.GetOtpRequest;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.trait.impl.GetOtpTrait;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherToken.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken$executeOtpRequest$2", f = "EtherToken.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EtherTokenResult<OTP>>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85286p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f85287q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f85288r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f85289s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EtherToken etherToken, String str, int i10, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f85287q0 = etherToken;
        this.f85288r0 = str;
        this.f85289s0 = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f85287q0, this.f85288r0, this.f85289s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EtherTokenResult<OTP>> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85286p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            EtherToken etherToken = this.f85287q0;
            GetOtpTrait getOtpTrait = new GetOtpTrait(etherToken.f30036a, etherToken.f30037b);
            GetOtpRequest getOtpRequest = new GetOtpRequest(this.f85288r0, this.f85289s0);
            this.f85286p0 = 1;
            obj = getOtpTrait.execute(getOtpRequest, this);
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
