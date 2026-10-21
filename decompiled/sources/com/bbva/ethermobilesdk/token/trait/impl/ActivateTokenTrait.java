package com.bbva.ethermobilesdk.token.trait.impl;

import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.extension.TokenActivationKt;
import com.bbva.ethermobilesdk.token.model.ActivateTokenRequest;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.EtherTokenInternalError;
import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.ethermobilesdk.token.model.Token;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.token.model.TokenRSA;
import com.bbva.ethermobilesdk.token.ocra.OcraParser;
import com.bbva.ethermobilesdk.token.storage.TokenStorage;
import com.bbva.ethermobilesdk.token.trait.Trait;
import ek.a;
import java.util.Locale;
import junit.runner.BaseTestRunner;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivateTokenTrait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/token/trait/impl/ActivateTokenTrait;", "Lcom/bbva/ethermobilesdk/token/trait/Trait;", "Lcom/bbva/ethermobilesdk/token/model/ActivateTokenRequest;", "", "request", NotificationCompat.CATEGORY_CALL, "(Lcom/bbva/ethermobilesdk/token/model/ActivateTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;", "tokenStorage", "Lcom/bbva/ethermobilesdk/token/model/OcraSuite;", "defaultOcraSuite", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;Lcom/bbva/ethermobilesdk/token/model/OcraSuite;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class ActivateTokenTrait extends Trait<ActivateTokenRequest, String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TokenStorage f30253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final OcraSuite f30254c;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.token.trait.impl.ActivateTokenTrait$call$1, reason: invalid class name */
    /* JADX INFO: compiled from: ActivateTokenTrait.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.trait.impl.ActivateTokenTrait", f = "ActivateTokenTrait.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7}, l = {43, 48, 49, 50, 56, 59, 62, 63}, m = NotificationCompat.CATEGORY_CALL, n = {"this", "request", BaseTestRunner.SUITE_METHODNAME, "tokenIdUnreal", "this", "request", BaseTestRunner.SUITE_METHODNAME, "tokenIdUnreal", "tokenIdPayload", "this", "request", BaseTestRunner.SUITE_METHODNAME, "tokenIdPayload", "tokenUnreal", "this", "request", BaseTestRunner.SUITE_METHODNAME, "tokenIdPayload", "this", "request", "tokenIdReal", "this", "request", "tokenIdReal", "this", "request", "request"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f30255p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ActivateTokenRequest f30256q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f30257r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public String f30258s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Object f30259t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f30260u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f30261w0;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30260u0 = obj;
            this.f30261w0 |= Integer.MIN_VALUE;
            return ActivateTokenTrait.this.call((ActivateTokenRequest) null, (Continuation<? super String>) this);
        }
    }

    public /* synthetic */ ActivateTokenTrait(TokenStorage tokenStorage, OcraSuite ocraSuite, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenStorage, (i10 & 2) != 0 ? null : ocraSuite);
    }

    public ActivateTokenTrait(@NotNull TokenStorage tokenStorage, @Nullable OcraSuite ocraSuite) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        this.f30253b = tokenStorage;
        this.f30254c = ocraSuite;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0167 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #4 {all -> 0x00c7, blocks: (B:42:0x00c2, B:65:0x0143, B:66:0x0161, B:68:0x0167), top: B:111:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x019b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x01fa A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:21:0x004e, B:89:0x01f2, B:91:0x01fa, B:26:0x0061, B:86:0x01e0), top: B:107:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x020b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x020c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0226 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v17, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v26, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r11v40, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v42, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.bbva.ethermobilesdk.token.model.ActivateTokenRequest] */
    @Override // com.bbva.ethermobilesdk.token.trait.Trait
    @Nullable
    public Object call(@NotNull ActivateTokenRequest activateTokenRequest, @NotNull Continuation<? super String> continuation) throws EtherTokenInternalError {
        AnonymousClass1 anonymousClass1;
        Object objM5535constructorimpl;
        OcraSuite ocraSuite;
        String tokenId;
        ActivateTokenTrait activateTokenTrait;
        ?? r10;
        TokenActivation tokenActivation;
        ?? r11;
        String strExtractTokenIdFromPlainPayload;
        OcraSuite ocraSuite2;
        OcraSuite ocraSuite3;
        ?? r12;
        ActivateTokenTrait activateTokenTrait2;
        Object token;
        OcraSuite ocraSuite4;
        String str;
        Object obj;
        String str2;
        ?? r13;
        ActivateTokenTrait activateTokenTrait3;
        Token token2;
        TokenStorage tokenStorage;
        OcraSuite ocraSuite5;
        ?? r14;
        String str3;
        TokenStorage tokenStorage2;
        TokenRSA rsa;
        OcraSuite ocraSuite6;
        ?? r3;
        ActivateTokenTrait activateTokenTrait4;
        TokenStorage tokenStorage3;
        TokenActivation activation;
        ?? r4;
        String str4;
        TokenStorage tokenStorage4;
        ?? r15;
        ActivateTokenTrait activateTokenTrait5;
        TokenStorage tokenStorage5;
        String tokenId2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.f30261w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f30261w0 = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object token3 = anonymousClass1.f30260u0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        ?? r16 = anonymousClass1.f30261w0;
        try {
            try {
                try {
                    switch (r16) {
                        case 0:
                            ResultKt.throwOnFailure(token3);
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM5535constructorimpl = Result.m5535constructorimpl(new OcraParser().parse(new String(EncodingUtilsKt.base64ToByteArray(activateTokenRequest.getActivation().getConfiguration()), Charsets.UTF_8)));
                                break;
                            } catch (Throwable th2) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                            }
                            if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null && (objM5535constructorimpl = this.f30254c) == null) {
                                throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.INVALID_OCRA_SUITE, null);
                            }
                            ocraSuite = (OcraSuite) objM5535constructorimpl;
                            tokenId = activateTokenRequest.getActivation().getTokenId();
                            TokenActivation activation2 = activateTokenRequest.getActivation();
                            if (TokenActivationKt.isPlainPayload(activation2)) {
                                activateTokenTrait = this;
                                r11 = activateTokenRequest;
                                strExtractTokenIdFromPlainPayload = TokenActivationKt.extractTokenIdFromPlainPayload(activation2);
                            } else {
                                TokenStorage tokenStorage6 = this.f30253b;
                                String tokenId3 = activation2.getTokenId();
                                anonymousClass1.f30255p0 = this;
                                anonymousClass1.f30256q0 = activateTokenRequest;
                                anonymousClass1.f30257r0 = ocraSuite;
                                anonymousClass1.f30258s0 = tokenId;
                                anonymousClass1.f30259t0 = activation2;
                                anonymousClass1.f30261w0 = 1;
                                Object token4 = tokenStorage6.getToken(tokenId3, anonymousClass1);
                                if (token4 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                activateTokenTrait = this;
                                r10 = activateTokenRequest;
                                tokenActivation = activation2;
                                token3 = token4;
                                String upperCase = ((Token) token3).getRsa().getPrivateKey().toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                strExtractTokenIdFromPlainPayload = TokenActivationKt.extractTokenIdFromEncryptedPayload(tokenActivation, EncodingUtilsKt.hexStringToByteArray$default(upperCase, null, 1, null));
                                r11 = r10;
                            }
                            ocraSuite2 = ocraSuite;
                            if (Intrinsics.areEqual(strExtractTokenIdFromPlainPayload, tokenId)) {
                                ocraSuite3 = ocraSuite2;
                                r12 = r11;
                                activateTokenTrait2 = activateTokenTrait;
                            } else {
                                TokenStorage tokenStorage7 = activateTokenTrait.f30253b;
                                anonymousClass1.f30255p0 = activateTokenTrait;
                                anonymousClass1.f30256q0 = r11;
                                anonymousClass1.f30257r0 = ocraSuite2;
                                anonymousClass1.f30258s0 = tokenId;
                                anonymousClass1.f30259t0 = strExtractTokenIdFromPlainPayload;
                                anonymousClass1.f30261w0 = 2;
                                token = tokenStorage7.getToken(tokenId, anonymousClass1);
                                if (token == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ocraSuite4 = ocraSuite2;
                                str = tokenId;
                                obj = token;
                                str2 = strExtractTokenIdFromPlainPayload;
                                r13 = r11;
                                activateTokenTrait3 = activateTokenTrait;
                                token2 = (Token) obj;
                                tokenStorage = activateTokenTrait3.f30253b;
                                anonymousClass1.f30255p0 = activateTokenTrait3;
                                anonymousClass1.f30256q0 = r13;
                                anonymousClass1.f30257r0 = ocraSuite4;
                                anonymousClass1.f30258s0 = str2;
                                anonymousClass1.f30259t0 = token2;
                                anonymousClass1.f30261w0 = 3;
                                if (tokenStorage.deleteToken(str, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ocraSuite5 = ocraSuite4;
                                r14 = r13;
                                str3 = str2;
                                tokenStorage2 = activateTokenTrait3.f30253b;
                                rsa = token2.getRsa();
                                anonymousClass1.f30255p0 = activateTokenTrait3;
                                anonymousClass1.f30256q0 = r14;
                                anonymousClass1.f30257r0 = ocraSuite5;
                                anonymousClass1.f30258s0 = str3;
                                anonymousClass1.f30259t0 = null;
                                anonymousClass1.f30261w0 = 4;
                                if (tokenStorage2.setTokenRSA(str3, rsa, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ocraSuite6 = ocraSuite5;
                                r3 = r14;
                                activateTokenTrait4 = activateTokenTrait3;
                                ocraSuite3 = ocraSuite6;
                                tokenId = str3;
                                r12 = r3;
                                activateTokenTrait2 = activateTokenTrait4;
                            }
                            tokenStorage3 = activateTokenTrait2.f30253b;
                            activation = r12.getActivation();
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r12;
                            anonymousClass1.f30257r0 = tokenId;
                            anonymousClass1.f30258s0 = null;
                            anonymousClass1.f30259t0 = null;
                            anonymousClass1.f30261w0 = 5;
                            if (tokenStorage3.setTokenActivation(tokenId, activation, ocraSuite3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            String str5 = tokenId;
                            r4 = r12;
                            str4 = str5;
                            TokenStorage tokenStorage8 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r4;
                            anonymousClass1.f30257r0 = str4;
                            anonymousClass1.f30261w0 = 6;
                            token3 = tokenStorage8.getToken(str4, anonymousClass1);
                            r16 = r4;
                            if (token3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Token) token3).isActive()) {
                                return str4;
                            }
                            tokenStorage4 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r16;
                            anonymousClass1.f30257r0 = null;
                            anonymousClass1.f30261w0 = 7;
                            if (tokenStorage4.deleteToken(str4, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r15 = r16;
                            activateTokenTrait5 = activateTokenTrait2;
                            tokenStorage5 = activateTokenTrait5.f30253b;
                            tokenId2 = r15.getActivation().getTokenId();
                            anonymousClass1.f30255p0 = r15;
                            anonymousClass1.f30256q0 = null;
                            anonymousClass1.f30261w0 = 8;
                            activateTokenRequest = r15;
                            if (tokenStorage5.deleteToken(tokenId2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, th);
                        case 1:
                            tokenActivation = (TokenActivation) anonymousClass1.f30259t0;
                            tokenId = anonymousClass1.f30258s0;
                            ocraSuite = (OcraSuite) anonymousClass1.f30257r0;
                            r11 = anonymousClass1.f30256q0;
                            activateTokenTrait = (ActivateTokenTrait) anonymousClass1.f30255p0;
                            try {
                                ResultKt.throwOnFailure(token3);
                                r10 = r11;
                                String upperCase2 = ((Token) token3).getRsa().getPrivateKey().toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                                strExtractTokenIdFromPlainPayload = TokenActivationKt.extractTokenIdFromEncryptedPayload(tokenActivation, EncodingUtilsKt.hexStringToByteArray$default(upperCase2, null, 1, null));
                                r11 = r10;
                                ocraSuite2 = ocraSuite;
                                if (Intrinsics.areEqual(strExtractTokenIdFromPlainPayload, tokenId)) {
                                    TokenStorage tokenStorage9 = activateTokenTrait.f30253b;
                                    anonymousClass1.f30255p0 = activateTokenTrait;
                                    anonymousClass1.f30256q0 = r11;
                                    anonymousClass1.f30257r0 = ocraSuite2;
                                    anonymousClass1.f30258s0 = tokenId;
                                    anonymousClass1.f30259t0 = strExtractTokenIdFromPlainPayload;
                                    anonymousClass1.f30261w0 = 2;
                                    token = tokenStorage9.getToken(tokenId, anonymousClass1);
                                    if (token == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    ocraSuite4 = ocraSuite2;
                                    str = tokenId;
                                    obj = token;
                                    str2 = strExtractTokenIdFromPlainPayload;
                                    r13 = r11;
                                    activateTokenTrait3 = activateTokenTrait;
                                    token2 = (Token) obj;
                                    tokenStorage = activateTokenTrait3.f30253b;
                                    anonymousClass1.f30255p0 = activateTokenTrait3;
                                    anonymousClass1.f30256q0 = r13;
                                    anonymousClass1.f30257r0 = ocraSuite4;
                                    anonymousClass1.f30258s0 = str2;
                                    anonymousClass1.f30259t0 = token2;
                                    anonymousClass1.f30261w0 = 3;
                                    if (tokenStorage.deleteToken(str, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    ocraSuite5 = ocraSuite4;
                                    r14 = r13;
                                    str3 = str2;
                                    tokenStorage2 = activateTokenTrait3.f30253b;
                                    rsa = token2.getRsa();
                                    anonymousClass1.f30255p0 = activateTokenTrait3;
                                    anonymousClass1.f30256q0 = r14;
                                    anonymousClass1.f30257r0 = ocraSuite5;
                                    anonymousClass1.f30258s0 = str3;
                                    anonymousClass1.f30259t0 = null;
                                    anonymousClass1.f30261w0 = 4;
                                    if (tokenStorage2.setTokenRSA(str3, rsa, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    ocraSuite6 = ocraSuite5;
                                    r3 = r14;
                                    activateTokenTrait4 = activateTokenTrait3;
                                    ocraSuite3 = ocraSuite6;
                                    tokenId = str3;
                                    r12 = r3;
                                    activateTokenTrait2 = activateTokenTrait4;
                                } else {
                                    ocraSuite3 = ocraSuite2;
                                    r12 = r11;
                                    activateTokenTrait2 = activateTokenTrait;
                                }
                                tokenStorage3 = activateTokenTrait2.f30253b;
                                activation = r12.getActivation();
                                anonymousClass1.f30255p0 = activateTokenTrait2;
                                anonymousClass1.f30256q0 = r12;
                                anonymousClass1.f30257r0 = tokenId;
                                anonymousClass1.f30258s0 = null;
                                anonymousClass1.f30259t0 = null;
                                anonymousClass1.f30261w0 = 5;
                                if (tokenStorage3.setTokenActivation(tokenId, activation, ocraSuite3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                String str6 = tokenId;
                                r4 = r12;
                                str4 = str6;
                                TokenStorage tokenStorage10 = activateTokenTrait2.f30253b;
                                anonymousClass1.f30255p0 = activateTokenTrait2;
                                anonymousClass1.f30256q0 = r4;
                                anonymousClass1.f30257r0 = str4;
                                anonymousClass1.f30261w0 = 6;
                                token3 = tokenStorage10.getToken(str4, anonymousClass1);
                                r16 = r4;
                                if (token3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Token) token3).isActive()) {
                                    return str4;
                                }
                                tokenStorage4 = activateTokenTrait2.f30253b;
                                anonymousClass1.f30255p0 = activateTokenTrait2;
                                anonymousClass1.f30256q0 = r16;
                                anonymousClass1.f30257r0 = null;
                                anonymousClass1.f30261w0 = 7;
                                if (tokenStorage4.deleteToken(str4, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r15 = r16;
                                activateTokenTrait5 = activateTokenTrait2;
                                tokenStorage5 = activateTokenTrait5.f30253b;
                                tokenId2 = r15.getActivation().getTokenId();
                                anonymousClass1.f30255p0 = r15;
                                anonymousClass1.f30256q0 = null;
                                anonymousClass1.f30261w0 = 8;
                                activateTokenRequest = r15;
                                if (tokenStorage5.deleteToken(tokenId2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                                throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, th);
                            } catch (Throwable th3) {
                                th = th3;
                                activateTokenRequest = r11;
                            }
                            break;
                        case 2:
                            String str7 = (String) anonymousClass1.f30259t0;
                            String str8 = anonymousClass1.f30258s0;
                            OcraSuite ocraSuite7 = (OcraSuite) anonymousClass1.f30257r0;
                            ActivateTokenRequest activateTokenRequest2 = anonymousClass1.f30256q0;
                            activateTokenTrait3 = (ActivateTokenTrait) anonymousClass1.f30255p0;
                            ResultKt.throwOnFailure(token3);
                            str2 = str7;
                            r13 = activateTokenRequest2;
                            ocraSuite4 = ocraSuite7;
                            str = str8;
                            obj = token3;
                            token2 = (Token) obj;
                            tokenStorage = activateTokenTrait3.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait3;
                            anonymousClass1.f30256q0 = r13;
                            anonymousClass1.f30257r0 = ocraSuite4;
                            anonymousClass1.f30258s0 = str2;
                            anonymousClass1.f30259t0 = token2;
                            anonymousClass1.f30261w0 = 3;
                            if (tokenStorage.deleteToken(str, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ocraSuite5 = ocraSuite4;
                            r14 = r13;
                            str3 = str2;
                            tokenStorage2 = activateTokenTrait3.f30253b;
                            rsa = token2.getRsa();
                            anonymousClass1.f30255p0 = activateTokenTrait3;
                            anonymousClass1.f30256q0 = r14;
                            anonymousClass1.f30257r0 = ocraSuite5;
                            anonymousClass1.f30258s0 = str3;
                            anonymousClass1.f30259t0 = null;
                            anonymousClass1.f30261w0 = 4;
                            if (tokenStorage2.setTokenRSA(str3, rsa, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ocraSuite6 = ocraSuite5;
                            r3 = r14;
                            activateTokenTrait4 = activateTokenTrait3;
                            ocraSuite3 = ocraSuite6;
                            tokenId = str3;
                            r12 = r3;
                            activateTokenTrait2 = activateTokenTrait4;
                            tokenStorage3 = activateTokenTrait2.f30253b;
                            activation = r12.getActivation();
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r12;
                            anonymousClass1.f30257r0 = tokenId;
                            anonymousClass1.f30258s0 = null;
                            anonymousClass1.f30259t0 = null;
                            anonymousClass1.f30261w0 = 5;
                            if (tokenStorage3.setTokenActivation(tokenId, activation, ocraSuite3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            String str9 = tokenId;
                            r4 = r12;
                            str4 = str9;
                            TokenStorage tokenStorage11 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r4;
                            anonymousClass1.f30257r0 = str4;
                            anonymousClass1.f30261w0 = 6;
                            token3 = tokenStorage11.getToken(str4, anonymousClass1);
                            r16 = r4;
                            if (token3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Token) token3).isActive()) {
                                return str4;
                            }
                            tokenStorage4 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r16;
                            anonymousClass1.f30257r0 = null;
                            anonymousClass1.f30261w0 = 7;
                            if (tokenStorage4.deleteToken(str4, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r15 = r16;
                            activateTokenTrait5 = activateTokenTrait2;
                            tokenStorage5 = activateTokenTrait5.f30253b;
                            tokenId2 = r15.getActivation().getTokenId();
                            anonymousClass1.f30255p0 = r15;
                            anonymousClass1.f30256q0 = null;
                            anonymousClass1.f30261w0 = 8;
                            activateTokenRequest = r15;
                            if (tokenStorage5.deleteToken(tokenId2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, th);
                        case 3:
                            Token token5 = (Token) anonymousClass1.f30259t0;
                            String str10 = anonymousClass1.f30258s0;
                            ocraSuite5 = (OcraSuite) anonymousClass1.f30257r0;
                            ActivateTokenRequest activateTokenRequest3 = anonymousClass1.f30256q0;
                            activateTokenTrait3 = (ActivateTokenTrait) anonymousClass1.f30255p0;
                            ResultKt.throwOnFailure(token3);
                            token2 = token5;
                            str3 = str10;
                            r14 = activateTokenRequest3;
                            tokenStorage2 = activateTokenTrait3.f30253b;
                            rsa = token2.getRsa();
                            anonymousClass1.f30255p0 = activateTokenTrait3;
                            anonymousClass1.f30256q0 = r14;
                            anonymousClass1.f30257r0 = ocraSuite5;
                            anonymousClass1.f30258s0 = str3;
                            anonymousClass1.f30259t0 = null;
                            anonymousClass1.f30261w0 = 4;
                            if (tokenStorage2.setTokenRSA(str3, rsa, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ocraSuite6 = ocraSuite5;
                            r3 = r14;
                            activateTokenTrait4 = activateTokenTrait3;
                            ocraSuite3 = ocraSuite6;
                            tokenId = str3;
                            r12 = r3;
                            activateTokenTrait2 = activateTokenTrait4;
                            tokenStorage3 = activateTokenTrait2.f30253b;
                            activation = r12.getActivation();
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r12;
                            anonymousClass1.f30257r0 = tokenId;
                            anonymousClass1.f30258s0 = null;
                            anonymousClass1.f30259t0 = null;
                            anonymousClass1.f30261w0 = 5;
                            if (tokenStorage3.setTokenActivation(tokenId, activation, ocraSuite3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            String str11 = tokenId;
                            r4 = r12;
                            str4 = str11;
                            TokenStorage tokenStorage12 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r4;
                            anonymousClass1.f30257r0 = str4;
                            anonymousClass1.f30261w0 = 6;
                            token3 = tokenStorage12.getToken(str4, anonymousClass1);
                            r16 = r4;
                            if (token3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Token) token3).isActive()) {
                                return str4;
                            }
                            tokenStorage4 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r16;
                            anonymousClass1.f30257r0 = null;
                            anonymousClass1.f30261w0 = 7;
                            if (tokenStorage4.deleteToken(str4, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r15 = r16;
                            activateTokenTrait5 = activateTokenTrait2;
                            tokenStorage5 = activateTokenTrait5.f30253b;
                            tokenId2 = r15.getActivation().getTokenId();
                            anonymousClass1.f30255p0 = r15;
                            anonymousClass1.f30256q0 = null;
                            anonymousClass1.f30261w0 = 8;
                            activateTokenRequest = r15;
                            if (tokenStorage5.deleteToken(tokenId2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, th);
                        case 4:
                            str3 = anonymousClass1.f30258s0;
                            ocraSuite6 = (OcraSuite) anonymousClass1.f30257r0;
                            ActivateTokenRequest activateTokenRequest4 = anonymousClass1.f30256q0;
                            activateTokenTrait4 = (ActivateTokenTrait) anonymousClass1.f30255p0;
                            try {
                                ResultKt.throwOnFailure(token3);
                                r3 = activateTokenRequest4;
                                ocraSuite3 = ocraSuite6;
                                tokenId = str3;
                                r12 = r3;
                                activateTokenTrait2 = activateTokenTrait4;
                                tokenStorage3 = activateTokenTrait2.f30253b;
                                activation = r12.getActivation();
                                anonymousClass1.f30255p0 = activateTokenTrait2;
                                anonymousClass1.f30256q0 = r12;
                                anonymousClass1.f30257r0 = tokenId;
                                anonymousClass1.f30258s0 = null;
                                anonymousClass1.f30259t0 = null;
                                anonymousClass1.f30261w0 = 5;
                                if (tokenStorage3.setTokenActivation(tokenId, activation, ocraSuite3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                String str12 = tokenId;
                                r4 = r12;
                                str4 = str12;
                                TokenStorage tokenStorage13 = activateTokenTrait2.f30253b;
                                anonymousClass1.f30255p0 = activateTokenTrait2;
                                anonymousClass1.f30256q0 = r4;
                                anonymousClass1.f30257r0 = str4;
                                anonymousClass1.f30261w0 = 6;
                                token3 = tokenStorage13.getToken(str4, anonymousClass1);
                                r16 = r4;
                                if (token3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Token) token3).isActive()) {
                                    return str4;
                                }
                                tokenStorage4 = activateTokenTrait2.f30253b;
                                anonymousClass1.f30255p0 = activateTokenTrait2;
                                anonymousClass1.f30256q0 = r16;
                                anonymousClass1.f30257r0 = null;
                                anonymousClass1.f30261w0 = 7;
                                if (tokenStorage4.deleteToken(str4, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                r15 = r16;
                                activateTokenTrait5 = activateTokenTrait2;
                                tokenStorage5 = activateTokenTrait5.f30253b;
                                tokenId2 = r15.getActivation().getTokenId();
                                anonymousClass1.f30255p0 = r15;
                                anonymousClass1.f30256q0 = null;
                                anonymousClass1.f30261w0 = 8;
                                activateTokenRequest = r15;
                                if (tokenStorage5.deleteToken(tokenId2, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                                throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, th);
                            } catch (Throwable th4) {
                                th = th4;
                                activateTokenRequest = activateTokenRequest4;
                            }
                            break;
                        case 5:
                            str4 = (String) anonymousClass1.f30257r0;
                            ActivateTokenRequest activateTokenRequest5 = anonymousClass1.f30256q0;
                            activateTokenTrait2 = (ActivateTokenTrait) anonymousClass1.f30255p0;
                            ResultKt.throwOnFailure(token3);
                            r4 = activateTokenRequest5;
                            TokenStorage tokenStorage14 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r4;
                            anonymousClass1.f30257r0 = str4;
                            anonymousClass1.f30261w0 = 6;
                            token3 = tokenStorage14.getToken(str4, anonymousClass1);
                            r16 = r4;
                            if (token3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Token) token3).isActive()) {
                                return str4;
                            }
                            tokenStorage4 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r16;
                            anonymousClass1.f30257r0 = null;
                            anonymousClass1.f30261w0 = 7;
                            if (tokenStorage4.deleteToken(str4, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r15 = r16;
                            activateTokenTrait5 = activateTokenTrait2;
                            tokenStorage5 = activateTokenTrait5.f30253b;
                            tokenId2 = r15.getActivation().getTokenId();
                            anonymousClass1.f30255p0 = r15;
                            anonymousClass1.f30256q0 = null;
                            anonymousClass1.f30261w0 = 8;
                            activateTokenRequest = r15;
                            if (tokenStorage5.deleteToken(tokenId2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, th);
                        case 6:
                            str4 = (String) anonymousClass1.f30257r0;
                            ActivateTokenRequest activateTokenRequest6 = anonymousClass1.f30256q0;
                            activateTokenTrait2 = (ActivateTokenTrait) anonymousClass1.f30255p0;
                            ResultKt.throwOnFailure(token3);
                            r16 = activateTokenRequest6;
                            if (((Token) token3).isActive()) {
                                return str4;
                            }
                            tokenStorage4 = activateTokenTrait2.f30253b;
                            anonymousClass1.f30255p0 = activateTokenTrait2;
                            anonymousClass1.f30256q0 = r16;
                            anonymousClass1.f30257r0 = null;
                            anonymousClass1.f30261w0 = 7;
                            if (tokenStorage4.deleteToken(str4, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r15 = r16;
                            activateTokenTrait5 = activateTokenTrait2;
                            tokenStorage5 = activateTokenTrait5.f30253b;
                            tokenId2 = r15.getActivation().getTokenId();
                            anonymousClass1.f30255p0 = r15;
                            anonymousClass1.f30256q0 = null;
                            anonymousClass1.f30261w0 = 8;
                            activateTokenRequest = r15;
                            if (tokenStorage5.deleteToken(tokenId2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, th);
                        case 7:
                            ActivateTokenRequest activateTokenRequest7 = anonymousClass1.f30256q0;
                            activateTokenTrait5 = (ActivateTokenTrait) anonymousClass1.f30255p0;
                            ResultKt.throwOnFailure(token3);
                            r15 = activateTokenRequest7;
                            tokenStorage5 = activateTokenTrait5.f30253b;
                            tokenId2 = r15.getActivation().getTokenId();
                            anonymousClass1.f30255p0 = r15;
                            anonymousClass1.f30256q0 = null;
                            anonymousClass1.f30261w0 = 8;
                            activateTokenRequest = r15;
                            if (tokenStorage5.deleteToken(tokenId2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                        case 8:
                            ActivateTokenRequest activateTokenRequest8 = (ActivateTokenRequest) anonymousClass1.f30255p0;
                            ResultKt.throwOnFailure(token3);
                            activateTokenRequest = activateTokenRequest8;
                            throw ActivateTokenTraitKt.access$toError(activateTokenRequest, EtherTokenErrorType.BAD_TOKEN_ACTIVATION, null);
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th5) {
                    th = th5;
                    activateTokenRequest = r14;
                }
            } catch (Throwable th6) {
                th = th6;
                activateTokenRequest = r16;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
