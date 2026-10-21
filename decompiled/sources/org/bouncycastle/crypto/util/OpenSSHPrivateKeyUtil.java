package org.bouncycastle.crypto.util;

import androidx.camera.core.processing.f;
import ci.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import lm.b;
import lm.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSSHPrivateKeyUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f89634a = Strings.toByteArray("openssh-key-v1\u0000");

    public static byte[] encodePrivateKey(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        if (asymmetricKeyParameter == null) {
            throw new IllegalArgumentException("param is null");
        }
        if ((asymmetricKeyParameter instanceof RSAPrivateCrtKeyParameters) || (asymmetricKeyParameter instanceof ECPrivateKeyParameters)) {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(asymmetricKeyParameter).parsePrivateKey().toASN1Primitive().getEncoded();
        }
        if (asymmetricKeyParameter instanceof DSAPrivateKeyParameters) {
            DSAPrivateKeyParameters dSAPrivateKeyParameters = (DSAPrivateKeyParameters) asymmetricKeyParameter;
            DSAParameters parameters = dSAPrivateKeyParameters.getParameters();
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new ASN1Integer(0L));
            aSN1EncodableVector.add(new ASN1Integer(parameters.getP()));
            aSN1EncodableVector.add(new ASN1Integer(parameters.getQ()));
            aSN1EncodableVector.add(new ASN1Integer(parameters.getG()));
            aSN1EncodableVector.add(new ASN1Integer(parameters.getG().modPow(dSAPrivateKeyParameters.getX(), parameters.getP())));
            aSN1EncodableVector.add(new ASN1Integer(dSAPrivateKeyParameters.getX()));
            try {
                return new DERSequence(aSN1EncodableVector).getEncoded();
            } catch (Exception e5) {
                throw new IllegalStateException(a.b(e5, new StringBuilder("unable to encode DSAPrivateKeyParameters ")));
            }
        }
        if (!(asymmetricKeyParameter instanceof Ed25519PrivateKeyParameters)) {
            throw new IllegalArgumentException("unable to convert " + asymmetricKeyParameter.getClass().getName() + " to openssh private key");
        }
        Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = (Ed25519PrivateKeyParameters) asymmetricKeyParameter;
        Ed25519PublicKeyParameters ed25519PublicKeyParametersGeneratePublicKey = ed25519PrivateKeyParameters.generatePublicKey();
        c cVar = new c();
        byte[] bArr = f89634a;
        ByteArrayOutputStream byteArrayOutputStream = cVar.f83225a;
        try {
            byteArrayOutputStream.write(bArr);
            cVar.d("none");
            cVar.d("none");
            cVar.d("");
            cVar.a(1);
            cVar.c(OpenSSHPublicKeyUtil.encodePublicKey(ed25519PublicKeyParametersGeneratePublicKey));
            c cVar2 = new c();
            int iNextInt = CryptoServicesRegistrar.getSecureRandom().nextInt();
            cVar2.a(iNextInt);
            cVar2.a(iNextInt);
            cVar2.d("ssh-ed25519");
            byte[] encoded = ed25519PublicKeyParametersGeneratePublicKey.getEncoded();
            cVar2.c(encoded);
            cVar2.c(Arrays.concatenate(ed25519PrivateKeyParameters.getEncoded(), encoded));
            cVar2.d("");
            ByteArrayOutputStream byteArrayOutputStream2 = cVar2.f83225a;
            int size = byteArrayOutputStream2.size() % 8;
            if (size != 0) {
                int i10 = 8 - size;
                for (int i11 = 1; i11 <= i10; i11++) {
                    byteArrayOutputStream2.write(i11);
                }
            }
            cVar.c(byteArrayOutputStream2.toByteArray());
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new IllegalStateException(e7.getMessage(), e7);
        }
    }

    public static AsymmetricKeyParameter parsePrivateKeyBlob(byte[] bArr) {
        byte[] bArrCopyOfRange;
        int i10;
        AsymmetricKeyParameter eCPrivateKeyParameters;
        int i11 = 1;
        if (bArr[0] == 48) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
            if (aSN1Sequence.size() == 6) {
                int i12 = 0;
                while (true) {
                    if (i12 < aSN1Sequence.size()) {
                        if (!(aSN1Sequence.getObjectAt(i12) instanceof ASN1Integer)) {
                            break;
                        }
                        i12++;
                    } else if (((ASN1Integer) aSN1Sequence.getObjectAt(0)).getPositiveValue().equals(BigIntegers.ZERO)) {
                        eCPrivateKeyParameters = new DSAPrivateKeyParameters(((ASN1Integer) aSN1Sequence.getObjectAt(5)).getPositiveValue(), new DSAParameters(((ASN1Integer) aSN1Sequence.getObjectAt(1)).getPositiveValue(), ((ASN1Integer) aSN1Sequence.getObjectAt(2)).getPositiveValue(), ((ASN1Integer) aSN1Sequence.getObjectAt(3)).getPositiveValue()));
                    }
                }
                eCPrivateKeyParameters = null;
            } else if (aSN1Sequence.size() == 9) {
                int i13 = 0;
                while (true) {
                    if (i13 < aSN1Sequence.size()) {
                        if (!(aSN1Sequence.getObjectAt(i13) instanceof ASN1Integer)) {
                            break;
                        }
                        i13++;
                    } else if (((ASN1Integer) aSN1Sequence.getObjectAt(0)).getPositiveValue().equals(BigIntegers.ZERO)) {
                        RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(aSN1Sequence);
                        eCPrivateKeyParameters = new RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient());
                    }
                }
                eCPrivateKeyParameters = null;
            } else if (aSN1Sequence.size() == 4 && (aSN1Sequence.getObjectAt(3) instanceof ASN1TaggedObject) && (aSN1Sequence.getObjectAt(2) instanceof ASN1TaggedObject)) {
                ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(aSN1Sequence);
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) eCPrivateKey.getParameters();
                X9ECParameters byOID = ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
                eCPrivateKeyParameters = new ECPrivateKeyParameters(eCPrivateKey.getKey(), new ECNamedDomainParameters(aSN1ObjectIdentifier, byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed()));
            } else {
                eCPrivateKeyParameters = null;
            }
        } else {
            b bVar = new b(f89634a, bArr);
            if (!"none".equals(Strings.fromByteArray(bVar.b()))) {
                throw new IllegalStateException("encrypted keys not supported");
            }
            bVar.d();
            bVar.d();
            if (bVar.c() != 1) {
                throw new IllegalStateException("multiple keys not supported");
            }
            OpenSSHPublicKeyUtil.parsePublicKey(bVar.b());
            int iC = bVar.c();
            if (iC == 0) {
                bArrCopyOfRange = new byte[0];
            } else {
                int i14 = bVar.f83224b;
                if (i14 > bArr.length - iC) {
                    throw new IllegalArgumentException("not enough data for block");
                }
                if (iC % 8 != 0) {
                    throw new IllegalArgumentException("missing padding");
                }
                int i15 = i14 + iC;
                bVar.f83224b = i15;
                if (iC > 0 && (i10 = bArr[i15 - 1] & 255) > 0 && i10 < 8) {
                    i15 -= i10;
                    int i16 = i15;
                    while (i11 <= i10) {
                        if (i11 != (bArr[i16] & 255)) {
                            throw new IllegalArgumentException("incorrect padding");
                        }
                        i11++;
                        i16++;
                    }
                }
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i14, i15);
            }
            if (bVar.f83224b < bVar.f83223a.length) {
                throw new IllegalArgumentException("decoded key has trailing data");
            }
            b bVar2 = new b(bArrCopyOfRange);
            if (bVar2.c() != bVar2.c()) {
                throw new IllegalStateException("private key check values are not the same");
            }
            String strFromByteArray = Strings.fromByteArray(bVar2.b());
            if (!"ssh-ed25519".equals(strFromByteArray)) {
                throw new IllegalStateException(f.d("can not parse private key of type ", strFromByteArray));
            }
            bVar2.d();
            byte[] bArrB = bVar2.b();
            if (bArrB.length != 64) {
                throw new IllegalStateException("private key value of wrong length");
            }
            Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = new Ed25519PrivateKeyParameters(bArrB, 0);
            bVar2.d();
            if (bVar2.f83224b < bArrCopyOfRange.length) {
                throw new IllegalArgumentException("private key block has trailing data");
            }
            eCPrivateKeyParameters = ed25519PrivateKeyParameters;
        }
        if (eCPrivateKeyParameters != null) {
            return eCPrivateKeyParameters;
        }
        throw new IllegalArgumentException("unable to parse key");
    }
}
