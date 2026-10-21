package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.util.StandardCharset;
import hi.a;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PasswordBasedCryptoProvider extends a {
    public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f62616a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.PBES2_HS256_A128KW);
        linkedHashSet.add(JWEAlgorithm.PBES2_HS384_A192KW);
        linkedHashSet.add(JWEAlgorithm.PBES2_HS512_A256KW);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    public PasswordBasedCryptoProvider(byte[] bArr) {
        super(SUPPORTED_ALGORITHMS, ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("The password must not be null or empty");
        }
        this.f62616a = bArr;
    }

    @Override // hi.a, com.nimbusds.jose.jca.JCAAware
    public /* bridge */ /* synthetic */ JWEJCAContext getJCAContext() {
        return super.getJCAContext();
    }

    public byte[] getPassword() {
        return this.f62616a;
    }

    public String getPasswordString() {
        return new String(this.f62616a, StandardCharset.UTF_8);
    }

    @Override // hi.a, com.nimbusds.jose.JWEProvider
    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    @Override // hi.a, com.nimbusds.jose.JWEProvider
    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }
}
