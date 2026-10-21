package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.HMAC;
import com.nimbusds.jose.crypto.impl.MACProvider;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.StandardCharset;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class MACSigner extends MACProvider implements JWSSigner {
    public MACSigner(byte[] bArr) throws KeyLengthException {
        super(bArr, getCompatibleAlgorithms(ByteUtils.bitLength(bArr.length)));
    }

    public static Set<JWSAlgorithm> getCompatibleAlgorithms(int i10) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i10 >= 256) {
            linkedHashSet.add(JWSAlgorithm.HS256);
        }
        if (i10 >= 384) {
            linkedHashSet.add(JWSAlgorithm.HS384);
        }
        if (i10 >= 512) {
            linkedHashSet.add(JWSAlgorithm.HS512);
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static int getMinRequiredSecretLength(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (JWSAlgorithm.HS256.equals(jWSAlgorithm)) {
            return 256;
        }
        if (JWSAlgorithm.HS384.equals(jWSAlgorithm)) {
            return BluetoothState.REQUEST_CONNECT_DEVICE;
        }
        if (JWSAlgorithm.HS512.equals(jWSAlgorithm)) {
            return 512;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, MACProvider.SUPPORTED_ALGORITHMS));
    }

    @Override // com.nimbusds.jose.JWSSigner
    public Base64URL sign(JWSHeader jWSHeader, byte[] bArr) throws JOSEException {
        int minRequiredSecretLength = getMinRequiredSecretLength(jWSHeader.getAlgorithm());
        if (getSecret().length >= ByteUtils.byteLength(minRequiredSecretLength)) {
            return Base64URL.encode(HMAC.compute(MACProvider.getJCAAlgorithmName(jWSHeader.getAlgorithm()), getSecret(), bArr, getJCAContext().getProvider()));
        }
        throw new KeyLengthException("The secret length for " + jWSHeader.getAlgorithm() + " must be at least " + minRequiredSecretLength + " bits");
    }

    public MACSigner(String str) throws KeyLengthException {
        this(str.getBytes(StandardCharset.UTF_8));
    }

    public MACSigner(SecretKey secretKey) throws KeyLengthException {
        this(secretKey.getEncoded());
    }

    public MACSigner(OctetSequenceKey octetSequenceKey) throws KeyLengthException {
        this(octetSequenceKey.toByteArray());
    }
}
