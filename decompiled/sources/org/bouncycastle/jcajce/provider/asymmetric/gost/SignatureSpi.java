package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.GOST3410Signer;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.GOST3410Key;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes8.dex */
public class SignatureSpi extends java.security.SignatureSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GOST3411Digest f89972p0 = new GOST3411Digest();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GOST3410Signer f89973q0 = new GOST3410Signer();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SecureRandom f89974r0;

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePrivateKeyParameter = privateKey instanceof ECKey ? ECUtil.generatePrivateKeyParameter(privateKey) : GOST3410Util.generatePrivateKeyParameter(privateKey);
        this.f89972p0.reset();
        SecureRandom secureRandom = this.f89974r0;
        GOST3410Signer gOST3410Signer = this.f89973q0;
        if (secureRandom != null) {
            gOST3410Signer.init(true, new ParametersWithRandom(asymmetricKeyParameterGeneratePrivateKeyParameter, secureRandom));
        } else {
            gOST3410Signer.init(true, asymmetricKeyParameterGeneratePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePublicKeyParameter;
        if (publicKey instanceof ECPublicKey) {
            asymmetricKeyParameterGeneratePublicKeyParameter = ECUtil.generatePublicKeyParameter(publicKey);
        } else if (publicKey instanceof GOST3410Key) {
            asymmetricKeyParameterGeneratePublicKeyParameter = GOST3410Util.generatePublicKeyParameter(publicKey);
        } else {
            try {
                PublicKey publicKey2 = BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
                if (!(publicKey2 instanceof ECPublicKey)) {
                    throw new InvalidKeyException("can't recognise key type in DSA based signer");
                }
                asymmetricKeyParameterGeneratePublicKeyParameter = ECUtil.generatePublicKeyParameter(publicKey2);
            } catch (Exception unused) {
                throw new InvalidKeyException("can't recognise key type in DSA based signer");
            }
        }
        this.f89972p0.reset();
        this.f89973q0.init(false, asymmetricKeyParameterGeneratePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        GOST3411Digest gOST3411Digest = this.f89972p0;
        byte[] bArr = new byte[gOST3411Digest.getDigestSize()];
        gOST3411Digest.doFinal(bArr, 0);
        try {
            byte[] bArr2 = new byte[64];
            BigInteger[] bigIntegerArrGenerateSignature = this.f89973q0.generateSignature(bArr);
            byte[] byteArray = bigIntegerArrGenerateSignature[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrGenerateSignature[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, 32 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, 32 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, 64 - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, 64 - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
        } catch (Exception e5) {
            throw new SignatureException(e5.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f89972p0.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        GOST3411Digest gOST3411Digest = this.f89972p0;
        byte[] bArr2 = new byte[gOST3411Digest.getDigestSize()];
        gOST3411Digest.doFinal(bArr2, 0);
        try {
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 0, bArr4, 0, 32);
            System.arraycopy(bArr, 32, bArr3, 0, 32);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.f89973q0.verifySignature(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f89974r0 = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f89972p0.update(bArr, i10, i11);
    }
}
