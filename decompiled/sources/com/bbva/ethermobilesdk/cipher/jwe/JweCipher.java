package com.bbva.ethermobilesdk.cipher.jwe;

import com.bbva.ethermobilesdk.cipher.jwe.jwk.Jwk;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.AESDecrypter;
import com.nimbusds.jose.crypto.AESEncrypter;
import com.nimbusds.jose.crypto.RSADecrypter;
import com.nimbusds.jose.crypto.RSAEncrypter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JweCipher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/jwe/JweCipher;", "", "", "text", "Lcom/bbva/ethermobilesdk/cipher/jwe/jwk/Jwk;", "key", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "encrypt", "encryptedData", "decrypt", "Lcom/bbva/ethermobilesdk/cipher/jwe/CipherAlgorithm;", "algorithm", "<init>", "(Lcom/bbva/ethermobilesdk/cipher/jwe/CipherAlgorithm;)V", "jwe-cipher_release"}, k = 1, mv = {1, 8, 0})
public final class JweCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CipherAlgorithm f29313a;

    public JweCipher(@NotNull CipherAlgorithm algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        this.f29313a = algorithm;
    }

    @NotNull
    public final CipherResult<String> decrypt(@NotNull String encryptedData, @NotNull Jwk key) {
        JWEDecrypter aESDecrypter;
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            JWEObject jWEObject = JWEObject.parse(encryptedData);
            if (key instanceof Jwk.JwkRsa) {
                aESDecrypter = new RSADecrypter(((Jwk.JwkRsa) key).getKey());
            } else {
                if (!(key instanceof Jwk.JwkOctet)) {
                    throw new NoWhenBranchMatchedException();
                }
                aESDecrypter = new AESDecrypter(((Jwk.JwkOctet) key).getKey());
            }
            jWEObject.decrypt(aESDecrypter);
            String string = jWEObject.getPayload().toString();
            Intrinsics.checkNotNullExpressionValue(string, "jweObject.payload.toString()");
            return new CipherResult.Success(string);
        } catch (Throwable th2) {
            return new CipherResult.Error(th2);
        }
    }

    @NotNull
    public final CipherResult<String> encrypt(@NotNull String text, @NotNull Jwk key) {
        JWEEncrypter aESEncrypter;
        CipherAlgorithm cipherAlgorithm = this.f29313a;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            JWEObject jWEObject = new JWEObject(new JWEHeader(JWEAlgorithm.parse(cipherAlgorithm.getName()), EncryptionMethod.parse(cipherAlgorithm.getEncryptionMethod())), new Payload(text));
            if (key instanceof Jwk.JwkRsa) {
                aESEncrypter = new RSAEncrypter(((Jwk.JwkRsa) key).getKey());
            } else {
                if (!(key instanceof Jwk.JwkOctet)) {
                    throw new NoWhenBranchMatchedException();
                }
                aESEncrypter = new AESEncrypter(((Jwk.JwkOctet) key).getKey());
            }
            jWEObject.encrypt(aESEncrypter);
            String strSerialize = jWEObject.serialize();
            Intrinsics.checkNotNullExpressionValue(strSerialize, "jweObject.serialize()");
            return new CipherResult.Success(strSerialize);
        } catch (Throwable th2) {
            return new CipherResult.Error(th2);
        }
    }
}
