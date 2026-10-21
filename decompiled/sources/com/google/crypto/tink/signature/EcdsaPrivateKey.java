package com.google.crypto.tink.signature;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.InsecureSecretKeyAccess;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.util.SecretBigInteger;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class EcdsaPrivateKey extends SignaturePrivateKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EcdsaPublicKey f47331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBigInteger f47332b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EcdsaPublicKey f47333a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SecretBigInteger f47334b = null;

        @AccessesPartialKey
        public EcdsaPrivateKey build() throws GeneralSecurityException {
            if (this.f47333a == null) {
                throw new GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            SecretBigInteger secretBigInteger = this.f47334b;
            if (secretBigInteger == null) {
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            BigInteger bigInteger = secretBigInteger.getBigInteger(InsecureSecretKeyAccess.get());
            ECPoint publicPoint = this.f47333a.getPublicPoint();
            EcdsaParameters.CurveType curveType = this.f47333a.getParameters().getCurveType();
            BigInteger order = curveType.toParameterSpec().getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            }
            if (EllipticCurvesUtil.multiplyByGenerator(bigInteger, curveType.toParameterSpec()).equals(publicPoint)) {
                return new EcdsaPrivateKey(this.f47333a, this.f47334b);
            }
            throw new GeneralSecurityException("Invalid private value");
        }

        @CanIgnoreReturnValue
        public Builder setPrivateValue(SecretBigInteger secretBigInteger) {
            this.f47334b = secretBigInteger;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPublicKey(EcdsaPublicKey ecdsaPublicKey) {
            this.f47333a = ecdsaPublicKey;
            return this;
        }
    }

    public EcdsaPrivateKey(EcdsaPublicKey ecdsaPublicKey, SecretBigInteger secretBigInteger) {
        this.f47331a = ecdsaPublicKey;
        this.f47332b = secretBigInteger;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof EcdsaPrivateKey)) {
            return false;
        }
        EcdsaPrivateKey ecdsaPrivateKey = (EcdsaPrivateKey) key;
        return ecdsaPrivateKey.f47331a.equalsKey(this.f47331a) && this.f47332b.equalsSecretBigInteger(ecdsaPrivateKey.f47332b);
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBigInteger getPrivateValue() {
        return this.f47332b;
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.Key
    public EcdsaParameters getParameters() {
        return this.f47331a.getParameters();
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public EcdsaPublicKey getPublicKey() {
        return this.f47331a;
    }
}
