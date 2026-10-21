package com.bbva.ethermobilesdk.token.trait.impl;

import ad.d;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.token.generator.HashGenerator;
import com.bbva.ethermobilesdk.cipher.token.generator.RSAKeyGenerator;
import com.bbva.ethermobilesdk.cipher.token.generator.SecretKeyGenerator;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyBundle;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyGeneratorAttributes;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.constant.ConstantKt;
import com.bbva.ethermobilesdk.token.extension.CipherKt;
import com.bbva.ethermobilesdk.token.model.CreateActivationRequest;
import com.bbva.ethermobilesdk.token.model.TokenActivationForm;
import com.bbva.ethermobilesdk.token.model.TokenRSA;
import com.bbva.ethermobilesdk.token.storage.TokenStorage;
import com.bbva.ethermobilesdk.token.trait.Trait;
import ek.a;
import java.security.KeyPair;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CreateActivationTrait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/token/trait/impl/CreateActivationTrait;", "Lcom/bbva/ethermobilesdk/token/trait/Trait;", "Lcom/bbva/ethermobilesdk/token/model/CreateActivationRequest;", "Lcom/bbva/ethermobilesdk/token/model/TokenActivationForm;", "request", NotificationCompat.CATEGORY_CALL, "(Lcom/bbva/ethermobilesdk/token/model/CreateActivationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;", "tokenStorage", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class CreateActivationTrait extends Trait<CreateActivationRequest, TokenActivationForm> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TokenStorage f30262b;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.token.trait.impl.CreateActivationTrait$call$1, reason: invalid class name */
    /* JADX INFO: compiled from: CreateActivationTrait.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.trait.impl.CreateActivationTrait", f = "CreateActivationTrait.kt", i = {0, 0, 0, 0, 0, 0}, l = {63}, m = NotificationCompat.CATEGORY_CALL, n = {"this", "request", "salt", "secretKey", "authCodeHash", "activationData"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CreateActivationTrait f30263p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public CreateActivationRequest f30264q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public byte[] f30265r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public SecretKeyBundle f30266s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public byte[] f30267t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public String f30268u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f30270x0;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v0 = obj;
            this.f30270x0 |= Integer.MIN_VALUE;
            return CreateActivationTrait.this.call((CreateActivationRequest) null, (Continuation<? super TokenActivationForm>) this);
        }
    }

    public CreateActivationTrait(@NotNull TokenStorage tokenStorage) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        this.f30262b = tokenStorage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.bbva.ethermobilesdk.token.trait.Trait
    @Nullable
    public Object call(@NotNull CreateActivationRequest createActivationRequest, @NotNull Continuation<? super TokenActivationForm> continuation) {
        AnonymousClass1 anonymousClass1;
        SecretKeyBundle secretKeyBundle;
        CreateActivationRequest createActivationRequest2;
        CreateActivationTrait createActivationTrait;
        String str;
        byte[] bArr;
        byte[] bArr2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.f30270x0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f30270x0 = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.v0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.f30270x0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            KeyPair keyPair = (KeyPair) CipherKt.valueOrThrow(RSAKeyGenerator.INSTANCE.generateRSAKeyPair("RSA", 2048));
            byte[] encoded = keyPair.getPublic().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "keyPair.public.encoded");
            String hex$default = EncodingUtilsKt.toHex$default(encoded, null, 1, null);
            byte[] encoded2 = keyPair.getPrivate().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded2, "keyPair.private.encoded");
            String hex$default2 = EncodingUtilsKt.toHex$default(encoded2, null, 1, null);
            SecretKeyGenerator secretKeyGenerator = SecretKeyGenerator.INSTANCE;
            byte[] bArr3 = (byte[]) CipherKt.valueOrThrow(SecretKeyGenerator.generateSalt$default(secretKeyGenerator, 8, null, 2, null));
            secretKeyBundle = (SecretKeyBundle) CipherKt.valueOrThrow(secretKeyGenerator.generateSecretKey(createActivationRequest.getAuthCode(), new SecretKeyGeneratorAttributes(ConstantKt.PWD_KEYFACTORY_ALGORITHM, "AES", 256, 1000, bArr3)));
            HashGenerator hashGenerator = HashGenerator.INSTANCE;
            byte[] bArr4 = (byte[]) CipherKt.valueOrThrow(hashGenerator.generateHash(createActivationRequest.getAuthCode(), "SHA-256"));
            String hex$default3 = EncodingUtilsKt.toHex$default(bArr4, null, 1, null);
            String deviceId = createActivationRequest.getDeviceId();
            String protocolVersion = createActivationRequest.getProtocolVersion();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hex$default3);
            sb2.append("#");
            sb2.append(deviceId);
            sb2.append("#");
            sb2.append(protocolVersion);
            String strF = d.f(sb2, "#", hex$default);
            String strB = androidx.camera.core.impl.utils.a.b(strF, "#", EncodingUtilsKt.toHex$default((byte[]) CipherKt.valueOrThrow(hashGenerator.generateHash(strF, "SHA-256")), null, 1, null));
            TokenRSA tokenRSA = new TokenRSA(hex$default2, createActivationRequest.getAuthCode(), createActivationRequest.getDeviceId(), createActivationRequest.getProtocolVersion());
            String tokenId = createActivationRequest.getTokenId();
            anonymousClass1.f30263p0 = this;
            createActivationRequest2 = createActivationRequest;
            anonymousClass1.f30264q0 = createActivationRequest2;
            anonymousClass1.f30265r0 = bArr3;
            anonymousClass1.f30266s0 = secretKeyBundle;
            anonymousClass1.f30267t0 = bArr4;
            anonymousClass1.f30268u0 = strB;
            anonymousClass1.f30270x0 = 1;
            if (this.f30262b.setTokenRSA(tokenId, tokenRSA, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            createActivationTrait = this;
            str = strB;
            bArr = bArr3;
            bArr2 = bArr4;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = anonymousClass1.f30268u0;
            bArr2 = anonymousClass1.f30267t0;
            secretKeyBundle = anonymousClass1.f30266s0;
            bArr = anonymousClass1.f30265r0;
            createActivationRequest2 = anonymousClass1.f30264q0;
            createActivationTrait = anonymousClass1.f30263p0;
            ResultKt.throwOnFailure(obj);
        }
        String tokenId2 = createActivationRequest2.getTokenId();
        SoftCipher cipher = createActivationTrait.getCipher();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new TokenActivationForm(tokenId2, EncodingUtilsKt.toBase64((byte[]) CipherKt.valueOrThrow(cipher.encrypt(bytes, secretKeyBundle.getKey(), "AES/CBC/PKCS5Padding", ConstantKt.getCIPHER_BYTE_IV()))), EncodingUtilsKt.toBase64(bArr2), EncodingUtilsKt.toBase64(bArr));
    }
}
