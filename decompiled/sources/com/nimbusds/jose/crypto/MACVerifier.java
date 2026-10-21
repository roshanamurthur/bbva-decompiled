package com.nimbusds.jose.crypto;

import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.HMAC;
import com.nimbusds.jose.crypto.impl.MACProvider;
import com.nimbusds.jose.crypto.utils.ConstantTimeUtils;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class MACVerifier extends MACProvider implements JWSVerifier, CriticalHeaderParamsAware {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CriticalHeaderParamsDeferral f62575d;

    public MACVerifier(byte[] bArr) throws JOSEException {
        this(bArr, (Set<String>) null);
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.f62575d.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.f62575d.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException {
        if (this.f62575d.headerPasses(jWSHeader)) {
            return ConstantTimeUtils.areEqual(HMAC.compute(MACProvider.getJCAAlgorithmName(jWSHeader.getAlgorithm()), getSecret(), bArr, getJCAContext().getProvider()), base64URL.decode());
        }
        return false;
    }

    public MACVerifier(String str) throws JOSEException {
        this(str.getBytes(StandardCharset.UTF_8));
    }

    public MACVerifier(SecretKey secretKey) throws JOSEException {
        this(secretKey.getEncoded());
    }

    public MACVerifier(OctetSequenceKey octetSequenceKey) throws JOSEException {
        this(octetSequenceKey.toByteArray());
    }

    public MACVerifier(OctetSequenceKey octetSequenceKey, Set<String> set) throws JOSEException {
        this(octetSequenceKey.toByteArray(), set);
    }

    public MACVerifier(byte[] bArr, Set<String> set) throws JOSEException {
        super(bArr, MACProvider.SUPPORTED_ALGORITHMS);
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.f62575d = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }
}
