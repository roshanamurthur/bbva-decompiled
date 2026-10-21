package q7;

import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.extension.LoggerKt;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STOtpImpl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompat.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompat$generateOTP$1", f = "TokenCompat.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super STOtp>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92768p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TokenCompat f92769q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f92770r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f92771s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ String f92772t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ String f92773u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TokenCompat tokenCompat, String str, boolean z10, String str2, String str3, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f92769q0 = tokenCompat;
        this.f92770r0 = str;
        this.f92771s0 = z10;
        this.f92772t0 = str2;
        this.f92773u0 = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f92769q0, this.f92770r0, this.f92771s0, this.f92772t0, this.f92773u0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super STOtp> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92768p0;
        String str = this.f92773u0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.f92770r0;
            TokenCompat tokenCompat = this.f92769q0;
            TokenCompat.access$setPin(tokenCompat, str2);
            boolean z10 = this.f92771s0;
            String str3 = z10 ? "next" : "current";
            String str4 = this.f92772t0;
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Generating ", str3, " ", (str4 == null || str4.length() == 0) ? "Time-Based" : "Challenge-Response", " OTP for [");
            sbC.append(str);
            sbC.append(Constant.BRACKET_CLOSE);
            LoggerKt.log(sbC.toString());
            EtherToken etherToken = tokenCompat.getEtherToken();
            this.f92768p0 = 1;
            obj = etherToken.generateOtp(str, str4, z10, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        EtherTokenResult etherTokenResult = (EtherTokenResult) obj;
        if (etherTokenResult instanceof EtherTokenResult.Success) {
            LoggerKt.log("Generated OTP for token [" + str + Constant.BRACKET_CLOSE);
            return new STOtpImpl.OtpOk(null, ((OTP) ((EtherTokenResult.Success) etherTokenResult).getValue()).getValue(), 1, null);
        }
        if (!(etherTokenResult instanceof EtherTokenResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        EtherTokenResult.Error error = (EtherTokenResult.Error) etherTokenResult;
        String message = error.getValue().getMessage();
        Object ex = error.getValue().getEx();
        if (ex == null) {
            ex = "";
        }
        StringBuilder sbC2 = androidx.constraintlayout.core.parser.a.c("Failed to generate OTP for token [", str, "]: ", message, " ");
        sbC2.append(ex);
        LoggerKt.logError(sbC2.toString(), error.getValue().getEx());
        return new STOtpImpl.OtpNull(null, null, 3, null);
    }
}
