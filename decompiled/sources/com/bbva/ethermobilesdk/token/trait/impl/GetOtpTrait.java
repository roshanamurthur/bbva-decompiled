package com.bbva.ethermobilesdk.token.trait.impl;

import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.cipher.token.generator.OTPGenerator;
import com.bbva.ethermobilesdk.token.extension.CipherKt;
import com.bbva.ethermobilesdk.token.extension.TokenKt;
import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.GetOtpRequest;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.ethermobilesdk.token.model.Token;
import com.bbva.ethermobilesdk.token.storage.TokenStorage;
import com.bbva.ethermobilesdk.token.time.TimeProvider;
import com.bbva.ethermobilesdk.token.trait.Trait;
import ek.a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetOtpTrait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/token/trait/impl/GetOtpTrait;", "Lcom/bbva/ethermobilesdk/token/trait/Trait;", "Lcom/bbva/ethermobilesdk/token/model/GetOtpRequest;", "Lcom/bbva/ethermobilesdk/token/model/OTP;", "request", NotificationCompat.CATEGORY_CALL, "(Lcom/bbva/ethermobilesdk/token/model/GetOtpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;", "tokenStorage", "Lcom/bbva/ethermobilesdk/token/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;Lcom/bbva/ethermobilesdk/token/time/TimeProvider;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class GetOtpTrait extends Trait<GetOtpRequest, OTP> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TokenStorage f30289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TimeProvider f30290c;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.token.trait.impl.GetOtpTrait$call$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetOtpTrait.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.trait.impl.GetOtpTrait", f = "GetOtpTrait.kt", i = {0, 0}, l = {26}, m = NotificationCompat.CATEGORY_CALL, n = {"this", "request"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public GetOtpTrait f30291p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public GetOtpRequest f30292q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30293r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30295t0;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30293r0 = obj;
            this.f30295t0 |= Integer.MIN_VALUE;
            return GetOtpTrait.this.call((GetOtpRequest) null, (Continuation<? super OTP>) this);
        }
    }

    public GetOtpTrait(@NotNull TokenStorage tokenStorage, @NotNull TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f30289b = tokenStorage;
        this.f30290c = timeProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.trait.Trait
    @Nullable
    public Object call(@NotNull GetOtpRequest getOtpRequest, @NotNull Continuation<? super OTP> continuation) throws EtherTokenError {
        AnonymousClass1 anonymousClass1;
        GetOtpTrait getOtpTrait;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.f30295t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f30295t0 = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object token = anonymousClass1.f30293r0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.f30295t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(token);
            String tokenId = getOtpRequest.getTokenId();
            anonymousClass1.f30291p0 = this;
            anonymousClass1.f30292q0 = getOtpRequest;
            anonymousClass1.f30295t0 = 1;
            token = this.f30289b.getToken(tokenId, anonymousClass1);
            if (token == coroutine_suspended) {
                return coroutine_suspended;
            }
            getOtpTrait = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getOtpRequest = anonymousClass1.f30292q0;
            getOtpTrait = anonymousClass1.f30291p0;
            ResultKt.throwOnFailure(token);
        }
        Token token2 = (Token) token;
        if (!token2.isActive()) {
            throw new EtherTokenError(EtherTokenErrorType.TOKEN_IS_NOT_ACTIVE, null, 2, null);
        }
        byte[] bArrSeed = TokenKt.seed(token2, getOtpTrait.getCipher());
        OcraSuite ocraSuite = token2.getOcraSuite();
        Intrinsics.checkNotNull(ocraSuite);
        int value = ocraSuite.getOtpLength().getValue();
        int seconds = token2.getOcraSuite().getTimeStep().getSeconds();
        int timeDrift = getOtpRequest.getTimeDrift();
        long jNow = getOtpTrait.f30290c.now();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        return new OTP((String) CipherKt.valueOrThrow(OTPGenerator.INSTANCE.generateOTP(bArrSeed, value, seconds, timeDrift, jNow)), (((long) (((timeDrift + 1) * seconds) * 1000)) - (jNow % ((long) (seconds * 1000)))) + timeInMillis, seconds);
    }
}
