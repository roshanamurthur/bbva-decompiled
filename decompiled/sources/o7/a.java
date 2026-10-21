package o7;

import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.GetChallengeRequest;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.trait.impl.GetChallengeTrait;
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
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken$executeChallengeRequest$2", f = "EtherToken.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EtherTokenResult<OTP>>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85281p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f85282q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f85283r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f85284s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f85285t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EtherToken etherToken, String str, String str2, int i10, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f85282q0 = etherToken;
        this.f85283r0 = str;
        this.f85284s0 = str2;
        this.f85285t0 = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f85282q0, this.f85283r0, this.f85284s0, this.f85285t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EtherTokenResult<OTP>> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85281p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            EtherToken etherToken = this.f85282q0;
            GetChallengeTrait getChallengeTrait = new GetChallengeTrait(etherToken.f30036a, etherToken.f30037b);
            GetChallengeRequest getChallengeRequest = new GetChallengeRequest(this.f85283r0, this.f85284s0, this.f85285t0);
            this.f85281p0 = 1;
            obj = getChallengeTrait.execute(getChallengeRequest, this);
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
