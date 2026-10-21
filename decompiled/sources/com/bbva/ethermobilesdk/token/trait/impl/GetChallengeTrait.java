package com.bbva.ethermobilesdk.token.trait.impl;

import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.cipher.token.generator.OCRAGenerator;
import com.bbva.ethermobilesdk.token.extension.CipherKt;
import com.bbva.ethermobilesdk.token.extension.TokenKt;
import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.EtherTokenInternalError;
import com.bbva.ethermobilesdk.token.model.GetChallengeRequest;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.ethermobilesdk.token.model.Token;
import com.bbva.ethermobilesdk.token.storage.TokenStorage;
import com.bbva.ethermobilesdk.token.time.TimeProvider;
import com.bbva.ethermobilesdk.token.trait.Trait;
import ek.a;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetChallengeTrait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/token/trait/impl/GetChallengeTrait;", "Lcom/bbva/ethermobilesdk/token/trait/Trait;", "Lcom/bbva/ethermobilesdk/token/model/GetChallengeRequest;", "Lcom/bbva/ethermobilesdk/token/model/OTP;", "request", NotificationCompat.CATEGORY_CALL, "(Lcom/bbva/ethermobilesdk/token/model/GetChallengeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;", "tokenStorage", "Lcom/bbva/ethermobilesdk/token/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;Lcom/bbva/ethermobilesdk/token/time/TimeProvider;)V", "Companion", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class GetChallengeTrait extends Trait<GetChallengeRequest, OTP> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TokenStorage f30282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TimeProvider f30283c;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.token.trait.impl.GetChallengeTrait$call$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetChallengeTrait.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.trait.impl.GetChallengeTrait", f = "GetChallengeTrait.kt", i = {0, 0}, l = {28}, m = NotificationCompat.CATEGORY_CALL, n = {"this", "request"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public GetChallengeTrait f30284p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public GetChallengeRequest f30285q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30286r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30288t0;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30286r0 = obj;
            this.f30288t0 |= Integer.MIN_VALUE;
            return GetChallengeTrait.this.call((GetChallengeRequest) null, (Continuation<? super OTP>) this);
        }
    }

    public GetChallengeTrait(@NotNull TokenStorage tokenStorage, @NotNull TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f30282b = tokenStorage;
        this.f30283c = timeProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.bbva.ethermobilesdk.token.trait.Trait
    @Nullable
    public Object call(@NotNull GetChallengeRequest getChallengeRequest, @NotNull Continuation<? super OTP> continuation) throws EtherTokenInternalError, EtherTokenError {
        AnonymousClass1 anonymousClass1;
        GetChallengeTrait getChallengeTrait;
        GetChallengeRequest getChallengeRequest2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.f30288t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f30288t0 = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object token = anonymousClass1.f30286r0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.f30288t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(token);
            String tokenId = getChallengeRequest.getTokenId();
            anonymousClass1.f30284p0 = this;
            anonymousClass1.f30285q0 = getChallengeRequest;
            anonymousClass1.f30288t0 = 1;
            token = this.f30282b.getToken(tokenId, anonymousClass1);
            if (token == coroutine_suspended) {
                return coroutine_suspended;
            }
            getChallengeTrait = this;
            getChallengeRequest2 = getChallengeRequest;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getChallengeRequest2 = anonymousClass1.f30285q0;
            getChallengeTrait = anonymousClass1.f30284p0;
            ResultKt.throwOnFailure(token);
        }
        Token token2 = (Token) token;
        if (!token2.isActive()) {
            throw new EtherTokenError(EtherTokenErrorType.TOKEN_IS_NOT_ACTIVE, null, 2, null);
        }
        try {
            byte[] bArrSeed = TokenKt.seed(token2, getChallengeTrait.getCipher());
            OcraSuite ocraSuite = token2.getOcraSuite();
            Intrinsics.checkNotNull(ocraSuite);
            int seconds = ocraSuite.getTimeStep().getSeconds();
            int timeDrift = getChallengeRequest2.getTimeDrift();
            String string = token2.getOcraSuite().toString();
            long jNow = getChallengeTrait.f30283c.now();
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            return new OTP((String) CipherKt.valueOrThrow(OCRAGenerator.INSTANCE.getOcra(getChallengeRequest2.getChallengeName(), bArrSeed, seconds, timeDrift, string, jNow)), (((long) (((timeDrift + 1) * seconds) * 1000)) - (jNow % ((long) (seconds * 1000)))) + timeInMillis, seconds);
        } catch (Throwable th2) {
            EtherTokenErrorType etherTokenErrorType = EtherTokenErrorType.UNKNOWN;
            OcraSuite ocraSuite2 = token2.getOcraSuite();
            getChallengeTrait.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (ocraSuite2 != null) {
                linkedHashMap.put("ocra_version", ocraSuite2.getVersion());
                linkedHashMap.put("ocra_function_name", ocraSuite2.getFunction().name());
                linkedHashMap.put("ocra_function_value", ocraSuite2.getFunction().getValue());
                linkedHashMap.put("ocra_otp_length", ocraSuite2.getOtpLength().toString());
                linkedHashMap.put("ocra_time_step", ocraSuite2.getTimeStep().toString());
                linkedHashMap.put("ocra_challenge_type", ocraSuite2.getChallengeType().name());
                linkedHashMap.put("ocra_challenge_length", String.valueOf(ocraSuite2.getChallengeLength()));
                linkedHashMap.put("ocra_has_counter", String.valueOf(ocraSuite2.getHasCounter()));
            }
            throw new EtherTokenInternalError(etherTokenErrorType, th2, linkedHashMap);
        }
    }
}
