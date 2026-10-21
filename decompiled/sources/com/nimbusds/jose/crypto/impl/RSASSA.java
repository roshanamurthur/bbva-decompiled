package com.nimbusds.jose.crypto.impl;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public class RSASSA {
    public static Signature getSignerAndVerifier(JWSAlgorithm jWSAlgorithm, Provider provider) throws JOSEException {
        PSSParameterSpec pSSParameterSpec;
        String str;
        PSSParameterSpec pSSParameterSpec2 = null;
        if (jWSAlgorithm.equals(JWSAlgorithm.RS256)) {
            str = ConstantKt.ALGORITHM_VERIFY_SIGNATURE;
        } else if (jWSAlgorithm.equals(JWSAlgorithm.RS384)) {
            str = "SHA384withRSA";
        } else if (jWSAlgorithm.equals(JWSAlgorithm.RS512)) {
            str = "SHA512withRSA";
        } else {
            if (jWSAlgorithm.equals(JWSAlgorithm.PS256)) {
                pSSParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
            } else if (jWSAlgorithm.equals(JWSAlgorithm.PS384)) {
                pSSParameterSpec = new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", MGF1ParameterSpec.SHA384, 48, 1);
            } else {
                if (!jWSAlgorithm.equals(JWSAlgorithm.PS512)) {
                    throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, RSASSAProvider.SUPPORTED_ALGORITHMS));
                }
                pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
            }
            pSSParameterSpec2 = pSSParameterSpec;
            str = "RSASSA-PSS";
        }
        try {
            Signature signature = provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
            if (pSSParameterSpec2 != null) {
                try {
                    signature.setParameter(pSSParameterSpec2);
                } catch (InvalidAlgorithmParameterException e5) {
                    throw new JOSEException("Invalid RSASSA-PSS salt length parameter: " + e5.getMessage(), e5);
                }
            }
            return signature;
        } catch (NoSuchAlgorithmException e7) {
            throw new JOSEException("Unsupported RSASSA algorithm: " + e7.getMessage(), e7);
        }
    }
}
