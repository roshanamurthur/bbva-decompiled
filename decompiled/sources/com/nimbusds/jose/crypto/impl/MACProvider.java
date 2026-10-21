package com.nimbusds.jose.crypto.impl;

import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.StandardCharset;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MACProvider extends BaseJWSProvider {
    public static final Set<JWSAlgorithm> SUPPORTED_ALGORITHMS;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f62612c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.HS256);
        linkedHashSet.add(JWSAlgorithm.HS384);
        linkedHashSet.add(JWSAlgorithm.HS512);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    public MACProvider(byte[] bArr, Set<JWSAlgorithm> set) throws KeyLengthException {
        super(set);
        if (bArr.length < 32) {
            throw new KeyLengthException("The secret length must be at least 256 bits");
        }
        this.f62612c = bArr;
    }

    public static String getJCAAlgorithmName(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (jWSAlgorithm.equals(JWSAlgorithm.HS256)) {
            return "HMACSHA256";
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.HS384)) {
            return "HMACSHA384";
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.HS512)) {
            return "HMACSHA512";
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, SUPPORTED_ALGORITHMS));
    }

    public byte[] getSecret() {
        return this.f62612c;
    }

    public SecretKey getSecretKey() {
        return new SecretKeySpec(this.f62612c, ReplenishLogic.MAC_PARAM_KEY);
    }

    public String getSecretString() {
        return new String(this.f62612c, StandardCharset.UTF_8);
    }
}
