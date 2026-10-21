package com.nimbusds.jose.crypto;

import androidx.emoji2.text.flatbuffer.a;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class ECDHEncrypter extends ECDHCryptoProvider implements JWEEncrypter {
    public static final Set<Curve> SUPPORTED_ELLIPTIC_CURVES;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ECPublicKey f62565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecretKey f62566d;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Curve.P_256);
        linkedHashSet.add(Curve.P_384);
        linkedHashSet.add(Curve.P_521);
        SUPPORTED_ELLIPTIC_CURVES = Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDHEncrypter(ECPublicKey eCPublicKey) throws JOSEException {
        this(eCPublicKey, null);
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        ECPublicKey eCPublicKey = this.f62565c;
        ECParameterSpec params = eCPublicKey.getParams();
        Provider keyEncryptionProvider = getJCAContext().getKeyEncryptionProvider();
        try {
            KeyPairGenerator keyPairGenerator = keyEncryptionProvider != null ? KeyPairGenerator.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, keyEncryptionProvider) : KeyPairGenerator.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC);
            keyPairGenerator.initialize(params);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            return encryptWithZ(new JWEHeader.Builder(jWEHeader).ephemeralPublicKey(new ECKey.Builder(getCurve(), (ECPublicKey) keyPairGenerateKeyPair.getPublic()).build()).build(), ECDH.deriveSharedSecret(eCPublicKey, (ECPrivateKey) keyPairGenerateKeyPair.getPrivate(), getJCAContext().getKeyEncryptionProvider()), bArr, this.f62566d);
        } catch (InvalidAlgorithmParameterException e5) {
            e = e5;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't generate ephemeral EC key pair: ")), e);
        } catch (NoSuchAlgorithmException e7) {
            e = e7;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't generate ephemeral EC key pair: ")), e);
        }
    }

    public ECPublicKey getPublicKey() {
        return this.f62565c;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDHCryptoProvider
    public Set<Curve> supportedEllipticCurves() {
        return SUPPORTED_ELLIPTIC_CURVES;
    }

    public ECDHEncrypter(ECKey eCKey) throws JOSEException {
        super(eCKey.getCurve());
        this.f62565c = eCKey.toECPublicKey();
        this.f62566d = null;
    }

    public ECDHEncrypter(ECPublicKey eCPublicKey, SecretKey secretKey) throws JOSEException {
        super(Curve.forECParameterSpec(eCPublicKey.getParams()));
        this.f62565c = eCPublicKey;
        if (secretKey != null) {
            if (secretKey.getAlgorithm() != null && secretKey.getAlgorithm().equals("AES")) {
                this.f62566d = secretKey;
                return;
            }
            throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES");
        }
        this.f62566d = null;
    }
}
