package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.digests.GOST3411_2012_256Digest;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.ECGOST3410_2012Signer;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes8.dex */
public class ECGOST2012SignatureSpi256 extends SignatureSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f89909r0 = 64;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f89910s0 = 32;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GOST3411_2012_256Digest f89907p0 = new GOST3411_2012_256Digest();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ECGOST3410_2012Signer f89908q0 = new ECGOST3410_2012Signer();

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof ECKey)) {
            throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
        }
        ECKeyParameters eCKeyParameters = (ECKeyParameters) ECUtil.generatePrivateKeyParameter(privateKey);
        if (eCKeyParameters.getParameters().getN().bitLength() > 256) {
            throw new InvalidKeyException("key out of range for ECGOST-2012-256");
        }
        this.f89907p0.reset();
        SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
        ECGOST3410_2012Signer eCGOST3410_2012Signer = this.f89908q0;
        if (secureRandom != null) {
            eCGOST3410_2012Signer.init(true, new ParametersWithRandom(eCKeyParameters, secureRandom));
        } else {
            eCGOST3410_2012Signer.init(true, eCKeyParameters);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        ECKeyParameters eCKeyParameters;
        if (publicKey instanceof ECPublicKey) {
            eCKeyParameters = (ECKeyParameters) (publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).f89904r0 : ECUtil.generatePublicKeyParameter(publicKey));
        } else {
            try {
                eCKeyParameters = (ECKeyParameters) ECUtil.generatePublicKeyParameter(BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-256 signer");
            }
        }
        if (eCKeyParameters.getParameters().getN().bitLength() > 256) {
            throw new InvalidKeyException("key out of range for ECGOST-2012-256");
        }
        this.f89907p0.reset();
        this.f89908q0.init(false, eCKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        int i10 = this.f89909r0;
        GOST3411_2012_256Digest gOST3411_2012_256Digest = this.f89907p0;
        byte[] bArr = new byte[gOST3411_2012_256Digest.getDigestSize()];
        gOST3411_2012_256Digest.doFinal(bArr, 0);
        try {
            byte[] bArr2 = new byte[i10];
            BigInteger[] bigIntegerArrGenerateSignature = this.f89908q0.generateSignature(bArr);
            byte[] byteArray = bigIntegerArrGenerateSignature[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrGenerateSignature[1].toByteArray();
            byte b10 = byteArray2[0];
            int i11 = this.f89910s0;
            if (b10 != 0) {
                System.arraycopy(byteArray2, 0, bArr2, i11 - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, i11 - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, i10 - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, i10 - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
        } catch (Exception e5) {
            throw new SignatureException(e5.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f89907p0.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        int i10 = this.f89910s0;
        GOST3411_2012_256Digest gOST3411_2012_256Digest = this.f89907p0;
        byte[] bArr2 = new byte[gOST3411_2012_256Digest.getDigestSize()];
        gOST3411_2012_256Digest.doFinal(bArr2, 0);
        try {
            byte[] bArr3 = new byte[i10];
            byte[] bArr4 = new byte[i10];
            System.arraycopy(bArr, 0, bArr4, 0, i10);
            System.arraycopy(bArr, i10, bArr3, 0, i10);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.f89908q0.verifySignature(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f89907p0.update(bArr, i10, i11);
    }
}
