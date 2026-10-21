package org.bouncycastle.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.ua.DSTU4145BinaryField;
import org.bouncycastle.asn1.ua.DSTU4145ECBinary;
import org.bouncycastle.asn1.ua.DSTU4145NamedCurves;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.asn1.ua.DSTU4145PointEncoder;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.DHPublicKey;
import org.bouncycastle.asn1.x9.DomainParameters;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.ValidationParams;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECGOST3410Parameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class PublicKeyFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f89644a;

    public static class a extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            DHParameter dHParameter = DHParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            ASN1Integer aSN1Integer = (ASN1Integer) subjectPublicKeyInfo.parsePublicKey();
            BigInteger l6 = dHParameter.getL();
            return new DHPublicKeyParameters(aSN1Integer.getValue(), new DHParameters(dHParameter.getP(), dHParameter.getG(), null, l6 == null ? 0 : l6.intValue()));
        }
    }

    public static class b extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            BigInteger y7 = DHPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey()).getY();
            DomainParameters domainParameters = DomainParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            BigInteger p4 = domainParameters.getP();
            BigInteger g6 = domainParameters.getG();
            BigInteger q10 = domainParameters.getQ();
            BigInteger j10 = domainParameters.getJ() != null ? domainParameters.getJ() : null;
            ValidationParams validationParams = domainParameters.getValidationParams();
            return new DHPublicKeyParameters(y7, new DHParameters(p4, g6, q10, j10, validationParams != null ? new DHValidationParameters(validationParams.getSeed(), validationParams.getPgenCounter().intValue()) : null));
        }
    }

    public static class c extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            DSAParameters dSAParameters;
            ASN1Integer aSN1Integer = (ASN1Integer) subjectPublicKeyInfo.parsePublicKey();
            ASN1Encodable parameters = subjectPublicKeyInfo.getAlgorithm().getParameters();
            if (parameters != null) {
                DSAParameter dSAParameter = DSAParameter.getInstance(parameters.toASN1Primitive());
                dSAParameters = new DSAParameters(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            } else {
                dSAParameters = null;
            }
            return new DSAPublicKeyParameters(aSN1Integer.getValue(), dSAParameters);
        }
    }

    public static class d extends l {
        public static void b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length / 2; i10++) {
                byte b10 = bArr[i10];
                bArr[i10] = bArr[(bArr.length - 1) - i10];
                bArr[(bArr.length - 1) - i10] = b10;
            }
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            ECDomainParameters eCDomainParameters;
            AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            ASN1ObjectIdentifier algorithm2 = algorithm.getAlgorithm();
            DSTU4145Params dSTU4145Params = DSTU4145Params.getInstance(algorithm.getParameters());
            try {
                byte[] bArrClone = Arrays.clone(((ASN1OctetString) subjectPublicKeyInfo.parsePublicKey()).getOctets());
                ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu4145le;
                if (algorithm2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    b(bArrClone);
                }
                if (dSTU4145Params.isNamedCurve()) {
                    eCDomainParameters = DSTU4145NamedCurves.getByOID(dSTU4145Params.getNamedCurve());
                } else {
                    DSTU4145ECBinary eCBinary = dSTU4145Params.getECBinary();
                    byte[] b10 = eCBinary.getB();
                    if (algorithm2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                        b(b10);
                    }
                    BigInteger bigInteger = new BigInteger(1, b10);
                    DSTU4145BinaryField field = eCBinary.getField();
                    ECCurve.F2m f2m = new ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), bigInteger);
                    byte[] g6 = eCBinary.getG();
                    if (algorithm2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                        b(g6);
                    }
                    eCDomainParameters = new ECDomainParameters(f2m, DSTU4145PointEncoder.decodePoint(f2m, g6), eCBinary.getN());
                }
                return new ECPublicKeyParameters(DSTU4145PointEncoder.decodePoint(eCDomainParameters.getCurve(), bArrClone), eCDomainParameters);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering DSTU public key");
            }
        }
    }

    public static class e extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            ECDomainParameters eCDomainParameters;
            byte b10;
            X962Parameters x962Parameters = X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
                X9ECParameters byOID = CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
                if (byOID == null) {
                    byOID = ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
                }
                eCDomainParameters = new ECNamedDomainParameters(aSN1ObjectIdentifier, byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
            } else if (x962Parameters.isImplicitlyCA()) {
                eCDomainParameters = (ECDomainParameters) obj;
            } else {
                X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
                eCDomainParameters = new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
            }
            byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
            ASN1OctetString dEROctetString = new DEROctetString(bytes);
            if (bytes[0] == 4 && bytes[1] == bytes.length - 2 && (((b10 = bytes[2]) == 2 || b10 == 3) && new X9IntegerConverter().getByteLength(eCDomainParameters.getCurve()) >= bytes.length - 3)) {
                try {
                    dEROctetString = (ASN1OctetString) ASN1Primitive.fromByteArray(bytes);
                } catch (IOException unused) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
            return new ECPublicKeyParameters(new X9ECPoint(eCDomainParameters.getCurve(), dEROctetString).getPoint(), eCDomainParameters);
        }
    }

    public static class f extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            return new Ed25519PublicKeyParameters(PublicKeyFactory.a(subjectPublicKeyInfo, 32), 0);
        }
    }

    public static class g extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            return new Ed448PublicKeyParameters(PublicKeyFactory.a(subjectPublicKeyInfo, 57), 0);
        }
    }

    public static class h extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            ElGamalParameter elGamalParameter = ElGamalParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            return new ElGamalPublicKeyParameters(((ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue(), new ElGamalParameters(elGamalParameter.getP(), elGamalParameter.getG()));
        }
    }

    public static class i extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            ASN1ObjectIdentifier publicKeyParamSet = gOST3410PublicKeyAlgParameters.getPublicKeyParamSet();
            ECGOST3410Parameters eCGOST3410Parameters = new ECGOST3410Parameters(new ECNamedDomainParameters(publicKeyParamSet, ECGOST3410NamedCurves.getByOID(publicKeyParamSet)), publicKeyParamSet, gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            try {
                byte[] octets = ((ASN1OctetString) subjectPublicKeyInfo.parsePublicKey()).getOctets();
                if (octets.length != 64) {
                    throw new IllegalArgumentException("invalid length for GOST3410_2001 public key");
                }
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i10 = 1; i10 <= 32; i10++) {
                    bArr[i10] = octets[32 - i10];
                    bArr[i10 + 32] = octets[64 - i10];
                }
                return new ECPublicKeyParameters(eCGOST3410Parameters.getCurve().decodePoint(bArr), eCGOST3410Parameters);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering GOST3410_2001 public key");
            }
        }
    }

    public static class j extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            ASN1ObjectIdentifier algorithm2 = algorithm.getAlgorithm();
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(algorithm.getParameters());
            ASN1ObjectIdentifier publicKeyParamSet = gOST3410PublicKeyAlgParameters.getPublicKeyParamSet();
            ECGOST3410Parameters eCGOST3410Parameters = new ECGOST3410Parameters(new ECNamedDomainParameters(publicKeyParamSet, ECGOST3410NamedCurves.getByOID(publicKeyParamSet)), publicKeyParamSet, gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            try {
                ASN1OctetString aSN1OctetString = (ASN1OctetString) subjectPublicKeyInfo.parsePublicKey();
                int i10 = algorithm2.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512) ? 64 : 32;
                int i11 = i10 * 2;
                byte[] octets = aSN1OctetString.getOctets();
                if (octets.length != i11) {
                    throw new IllegalArgumentException("invalid length for GOST3410_2012 public key");
                }
                byte[] bArr = new byte[i11 + 1];
                bArr[0] = 4;
                for (int i12 = 1; i12 <= i10; i12++) {
                    bArr[i12] = octets[i10 - i12];
                    bArr[i12 + i10] = octets[i11 - i12];
                }
                return new ECPublicKeyParameters(eCGOST3410Parameters.getCurve().decodePoint(bArr), eCGOST3410Parameters);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering GOST3410_2012 public key");
            }
        }
    }

    public static class k extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            RSAPublicKey rSAPublicKey = RSAPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            return new RSAKeyParameters(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
    }

    public static abstract class l {
        public abstract AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException;
    }

    public static class m extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            return new X25519PublicKeyParameters(PublicKeyFactory.a(subjectPublicKeyInfo, 32), 0);
        }
    }

    public static class n extends l {
        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.l
        public final AsymmetricKeyParameter a(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            return new X448PublicKeyParameters(PublicKeyFactory.a(subjectPublicKeyInfo, 56), 0);
        }
    }

    static {
        HashMap map = new HashMap();
        f89644a = map;
        map.put(PKCSObjectIdentifiers.rsaEncryption, new k());
        map.put(PKCSObjectIdentifiers.id_RSASSA_PSS, new k());
        map.put(X509ObjectIdentifiers.id_ea_rsa, new k());
        map.put(X9ObjectIdentifiers.dhpublicnumber, new b());
        map.put(PKCSObjectIdentifiers.dhKeyAgreement, new a());
        map.put(X9ObjectIdentifiers.id_dsa, new c());
        map.put(OIWObjectIdentifiers.dsaWithSHA1, new c());
        map.put(OIWObjectIdentifiers.elGamalAlgorithm, new h());
        map.put(X9ObjectIdentifiers.id_ecPublicKey, new e());
        map.put(CryptoProObjectIdentifiers.gostR3410_2001, new i());
        map.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, new j());
        map.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, new j());
        map.put(UAObjectIdentifiers.dstu4145be, new d());
        map.put(UAObjectIdentifiers.dstu4145le, new d());
        map.put(EdECObjectIdentifiers.id_X25519, new m());
        map.put(EdECObjectIdentifiers.id_X448, new n());
        map.put(EdECObjectIdentifiers.id_Ed25519, new f());
        map.put(EdECObjectIdentifiers.id_Ed448, new g());
    }

    public static byte[] a(SubjectPublicKeyInfo subjectPublicKeyInfo, int i10) {
        byte[] octets = subjectPublicKeyInfo.getPublicKeyData().getOctets();
        if (i10 == octets.length) {
            return octets;
        }
        throw new RuntimeException("public key encoding has incorrect length");
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return createKey(subjectPublicKeyInfo, null);
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        l lVar = (l) f89644a.get(algorithm.getAlgorithm());
        if (lVar != null) {
            return lVar.a(subjectPublicKeyInfo, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + algorithm.getAlgorithm());
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
