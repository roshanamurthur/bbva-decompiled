package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.util.ByteUtils;
import hi.a;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DirectCryptoProvider extends a {
    public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f62605a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.DIR);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DirectCryptoProvider(SecretKey secretKey) throws KeyLengthException {
        Set<JWEAlgorithm> set = SUPPORTED_ALGORITHMS;
        Set<EncryptionMethod> set2 = ContentCryptoProvider.COMPATIBLE_ENCRYPTION_METHODS.get(Integer.valueOf(ByteUtils.bitLength(secretKey.getEncoded())));
        if (set2 == null) {
            throw new KeyLengthException("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
        }
        super(set, set2);
        this.f62605a = secretKey;
    }

    @Override // hi.a, com.nimbusds.jose.jca.JCAAware
    public /* bridge */ /* synthetic */ JWEJCAContext getJCAContext() {
        return super.getJCAContext();
    }

    public SecretKey getKey() {
        return this.f62605a;
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
