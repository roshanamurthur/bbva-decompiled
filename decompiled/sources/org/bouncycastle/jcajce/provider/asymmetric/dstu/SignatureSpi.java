package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSTU4145Signer;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.interfaces.ECKey;

/* JADX INFO: loaded from: classes8.dex */
public class SignatureSpi extends java.security.SignatureSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GOST3411Digest f89821p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DSTU4145Signer f89822q0 = new DSTU4145Signer();

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            bArr2[i11] = (byte) ((bArr[i10] >> 4) & 15);
            bArr2[i11 + 1] = (byte) (bArr[i10] & 15);
        }
        return bArr2;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        AsymmetricKeyParameter asymmetricKeyParameterGeneratePrivateKeyParameter;
        if ((privateKey instanceof BCDSTU4145PrivateKey) || (privateKey instanceof ECKey)) {
            asymmetricKeyParameterGeneratePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
            GOST3411Digest gOST3411Digest = new GOST3411Digest(a(DSTU4145Params.getDefaultDKE()));
            this.f89821p0 = gOST3411Digest;
        } else {
            asymmetricKeyParameterGeneratePrivateKeyParameter = null;
        }
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        DSTU4145Signer dSTU4145Signer = this.f89822q0;
        if (secureRandom != null) {
            dSTU4145Signer.init(true, new ParametersWithRandom(asymmetricKeyParameterGeneratePrivateKeyParameter, secureRandom));
        } else {
            dSTU4145Signer.init(true, asymmetricKeyParameterGeneratePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        CipherParameters cipherParametersGeneratePublicKeyParameter;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) publicKey;
            cipherParametersGeneratePublicKeyParameter = bCDSTU4145PublicKey.f89813r0;
            this.f89821p0 = new GOST3411Digest(a(bCDSTU4145PublicKey.getSbox()));
        } else {
            cipherParametersGeneratePublicKeyParameter = ECUtil.generatePublicKeyParameter(publicKey);
            this.f89821p0 = new GOST3411Digest(a(DSTU4145Params.getDefaultDKE()));
        }
        this.f89822q0.init(false, cipherParametersGeneratePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.f89821p0.getDigestSize()];
        this.f89821p0.doFinal(bArr, 0);
        try {
            BigInteger[] bigIntegerArrGenerateSignature = this.f89822q0.generateSignature(bArr);
            byte[] byteArray = bigIntegerArrGenerateSignature[0].toByteArray();
            byte[] byteArray2 = bigIntegerArrGenerateSignature[1].toByteArray();
            int length = (byteArray.length > byteArray2.length ? byteArray.length : byteArray2.length) * 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(byteArray2, 0, bArr2, (length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, length - byteArray.length, byteArray.length);
            return new DEROctetString(bArr2).getEncoded();
        } catch (Exception e5) {
            throw new SignatureException(e5.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f89821p0.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f89821p0.getDigestSize()];
        this.f89821p0.doFinal(bArr2, 0);
        try {
            byte[] octets = ((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets();
            byte[] bArr3 = new byte[octets.length / 2];
            byte[] bArr4 = new byte[octets.length / 2];
            System.arraycopy(octets, 0, bArr4, 0, octets.length / 2);
            System.arraycopy(octets, octets.length / 2, bArr3, 0, octets.length / 2);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.f89822q0.verifySignature(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
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
        this.f89821p0.update(bArr, i10, i11);
    }
}
