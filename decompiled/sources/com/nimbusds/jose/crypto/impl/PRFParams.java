package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import java.security.Provider;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class PRFParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f62614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62615c;

    public PRFParams(String str, Provider provider, int i10) {
        this.f62613a = str;
        this.f62614b = provider;
        this.f62615c = i10;
    }

    public static PRFParams resolve(JWEAlgorithm jWEAlgorithm, Provider provider) throws JOSEException {
        String str;
        int i10;
        if (JWEAlgorithm.PBES2_HS256_A128KW.equals(jWEAlgorithm)) {
            str = "HmacSHA256";
            i10 = 16;
        } else if (JWEAlgorithm.PBES2_HS384_A192KW.equals(jWEAlgorithm)) {
            str = "HmacSHA384";
            i10 = 24;
        } else {
            if (!JWEAlgorithm.PBES2_HS512_A256KW.equals(jWEAlgorithm)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, PasswordBasedCryptoProvider.SUPPORTED_ALGORITHMS));
            }
            str = "HmacSHA512";
            i10 = 32;
        }
        return new PRFParams(str, provider, i10);
    }

    public int getDerivedKeyByteLength() {
        return this.f62615c;
    }

    public String getMACAlgorithm() {
        return this.f62613a;
    }

    public Provider getMacProvider() {
        return this.f62614b;
    }
}
