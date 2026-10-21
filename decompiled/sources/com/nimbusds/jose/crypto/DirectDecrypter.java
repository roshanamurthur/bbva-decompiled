package com.nimbusds.jose.crypto;

import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class DirectDecrypter extends DirectCryptoProvider implements JWEDecrypter, CriticalHeaderParamsAware {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CriticalHeaderParamsDeferral f62562c;

    public DirectDecrypter(SecretKey secretKey) throws KeyLengthException {
        this(secretKey, false);
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        if (!this.f62561b) {
            JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
            if (!algorithm.equals(JWEAlgorithm.DIR)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, DirectCryptoProvider.SUPPORTED_ALGORITHMS));
            }
            if (base64URL != null) {
                throw new JOSEException("Unexpected present JWE encrypted key");
            }
        }
        if (base64URL2 == null) {
            throw new JOSEException("Unexpected present JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        }
        this.f62562c.ensureHeaderPasses(jWEHeader);
        return ContentCryptoProvider.decrypt(jWEHeader, null, base64URL2, base64URL3, base64URL4, getKey(), getJCAContext());
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.f62562c.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.f62562c.getProcessedCriticalHeaderParams();
    }

    public DirectDecrypter(SecretKey secretKey, boolean z10) throws KeyLengthException {
        super(secretKey);
        this.f62562c = new CriticalHeaderParamsDeferral();
        this.f62561b = z10;
    }

    public DirectDecrypter(byte[] bArr) throws KeyLengthException {
        this((SecretKey) new SecretKeySpec(bArr, "AES"), false);
    }

    public DirectDecrypter(OctetSequenceKey octetSequenceKey) throws KeyLengthException {
        this(octetSequenceKey.toSecretKey("AES"));
    }

    public DirectDecrypter(SecretKey secretKey, Set<String> set) throws KeyLengthException {
        this(secretKey, set, false);
    }

    public DirectDecrypter(SecretKey secretKey, Set<String> set, boolean z10) throws KeyLengthException {
        super(secretKey);
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.f62562c = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
        this.f62561b = z10;
    }
}
