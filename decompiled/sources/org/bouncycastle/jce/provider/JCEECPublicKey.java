package org.bouncycastle.jce.provider;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class JCEECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f90406p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ECPoint f90407q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ECParameterSpec f90408r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f90409s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public GOST3410PublicKeyAlgParameters f90410t0;

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.f90406p0 = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f90408r0 = params;
        this.f90407q0 = EC5Util.convertPoint(params, eCPublicKeySpec.getW());
    }

    public static void a(int i10, BigInteger bigInteger, byte[] bArr) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i11 = 0; i11 != 32; i11++) {
            bArr[i10 + i11] = byteArray[(byteArray.length - 1) - i11];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ECCurve curve;
        ECParameterSpec eCParameterSpec;
        byte[] bytes;
        ASN1OctetString dEROctetString;
        byte b10;
        SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject()));
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        if (algorithm.getAlgorithm().equals((ASN1Primitive) CryptoProObjectIdentifiers.gostR3410_2001)) {
            DERBitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
            this.f90406p0 = "ECGOST3410";
            try {
                byte[] octets = ((ASN1OctetString) ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i10 = 1; i10 <= 32; i10++) {
                    bArr[i10] = octets[32 - i10];
                    bArr[i10 + 32] = octets[64 - i10];
                }
                GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(algorithm.getParameters());
                this.f90410t0 = gOST3410PublicKeyAlgParameters;
                ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
                ECCurve curve2 = parameterSpec.getCurve();
                EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(curve2, parameterSpec.getSeed());
                this.f90407q0 = curve2.decodePoint(bArr);
                this.f90408r0 = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(this.f90410t0.getPublicKeyParamSet()), ellipticCurveConvertCurve, EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        } else {
            X962Parameters x962Parameters = X962Parameters.getInstance(algorithm.getParameters());
            if (x962Parameters.isNamedCurve()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
                X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
                curve = namedCurveByOid.getCurve();
                eCParameterSpec = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), EC5Util.convertCurve(curve, namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            } else {
                if (x962Parameters.isImplicitlyCA()) {
                    this.f90408r0 = null;
                    curve = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve();
                } else {
                    X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
                    curve = x9ECParameters.getCurve();
                    eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(curve, x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
                }
                bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
                dEROctetString = new DEROctetString(bytes);
                if (bytes[0] == 4 && bytes[1] == bytes.length - 2 && (((b10 = bytes[2]) == 2 || b10 == 3) && new X9IntegerConverter().getByteLength(curve) >= bytes.length - 3)) {
                    try {
                        dEROctetString = (ASN1OctetString) ASN1Primitive.fromByteArray(bytes);
                    } catch (IOException unused2) {
                        throw new IllegalArgumentException("error recovering public key");
                    }
                }
                this.f90407q0 = new X9ECPoint(curve, dEROctetString).getPoint();
            }
            this.f90408r0 = eCParameterSpec;
            bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
            dEROctetString = new DEROctetString(bytes);
            if (bytes[0] == 4) {
                dEROctetString = (ASN1OctetString) ASN1Primitive.fromByteArray(bytes);
            }
            this.f90407q0 = new X9ECPoint(curve, dEROctetString).getPoint();
        }
        this.f90406p0 = (String) objectInputStream.readObject();
        this.f90409s0 = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.f90406p0);
        objectOutputStream.writeBoolean(this.f90409s0);
    }

    public ECPoint engineGetQ() {
        return this.f90407q0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPublicKey)) {
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        if (!engineGetQ().equals(jCEECPublicKey.engineGetQ())) {
            return false;
        }
        ECParameterSpec eCParameterSpec = this.f90408r0;
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpecConvertSpec = eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
        ECParameterSpec eCParameterSpec2 = jCEECPublicKey.f90408r0;
        return eCParameterSpecConvertSpec.equals(eCParameterSpec2 != null ? EC5Util.convertSpec(eCParameterSpec2) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f90406p0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        SubjectPublicKeyInfo subjectPublicKeyInfo;
        ASN1Encodable x962Parameters2;
        if (this.f90406p0.equals("ECGOST3410")) {
            ASN1Encodable aSN1Encodable = this.f90410t0;
            if (aSN1Encodable == null) {
                ECParameterSpec eCParameterSpec = this.f90408r0;
                if (eCParameterSpec instanceof ECNamedCurveSpec) {
                    x962Parameters2 = new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) eCParameterSpec).getName()), CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
                } else {
                    ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    x962Parameters2 = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.f90408r0.getGenerator()), this.f90409s0), this.f90408r0.getOrder(), BigInteger.valueOf(this.f90408r0.getCofactor()), this.f90408r0.getCurve().getSeed()));
                }
                aSN1Encodable = x962Parameters2;
            }
            BigInteger bigInteger = this.f90407q0.getAffineXCoord().toBigInteger();
            BigInteger bigInteger2 = this.f90407q0.getAffineYCoord().toBigInteger();
            byte[] bArr = new byte[64];
            a(0, bigInteger, bArr);
            a(32, bigInteger2, bArr);
            try {
                subjectPublicKeyInfo = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, aSN1Encodable), new DEROctetString(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.f90408r0;
            if (eCParameterSpec2 instanceof ECNamedCurveSpec) {
                ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec2).getName());
                if (namedCurveOid == null) {
                    namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.f90408r0).getName());
                }
                x962Parameters = new X962Parameters(namedCurveOid);
            } else if (eCParameterSpec2 == null) {
                x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
            } else {
                ECCurve eCCurveConvertCurve2 = EC5Util.convertCurve(eCParameterSpec2.getCurve());
                x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve2, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve2, this.f90408r0.getGenerator()), this.f90409s0), this.f90408r0.getOrder(), BigInteger.valueOf(this.f90408r0.getCofactor()), this.f90408r0.getCurve().getSeed()));
            }
            subjectPublicKeyInfo = new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters), getQ().getEncoded(this.f90409s0));
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo);
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.f90408r0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f90408r0;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public ECPoint getQ() {
        return this.f90408r0 == null ? this.f90407q0.getDetachedPoint() : this.f90407q0;
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return EC5Util.convertPoint(this.f90407q0);
    }

    public int hashCode() {
        int iHashCode = engineGetQ().hashCode();
        ECParameterSpec eCParameterSpec = this.f90408r0;
        return iHashCode ^ (eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.f90409s0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("EC Public Key");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.f90407q0.getAffineXCoord().toBigInteger().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.f90407q0.getAffineYCoord().toBigInteger().toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters) {
        this.f90406p0 = str;
        this.f90407q0 = eCPublicKeyParameters.getQ();
        this.f90408r0 = null;
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec) {
        this.f90406p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f90406p0 = str;
        this.f90407q0 = eCPublicKeyParameters.getQ();
        if (eCParameterSpec == null) {
            this.f90408r0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f90408r0 = eCParameterSpec;
        }
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.f90406p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f90406p0 = str;
        this.f90407q0 = eCPublicKeyParameters.getQ();
        if (eCParameterSpec == null) {
            this.f90408r0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f90408r0 = EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        }
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.f90406p0 = str;
        this.f90407q0 = jCEECPublicKey.f90407q0;
        this.f90408r0 = jCEECPublicKey.f90408r0;
        this.f90409s0 = jCEECPublicKey.f90409s0;
        this.f90410t0 = jCEECPublicKey.f90410t0;
    }

    public JCEECPublicKey(String str, org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec) {
        ECParameterSpec eCParameterSpecConvertSpec;
        this.f90406p0 = str;
        this.f90407q0 = eCPublicKeySpec.getQ();
        if (eCPublicKeySpec.getParams() != null) {
            eCParameterSpecConvertSpec = EC5Util.convertSpec(EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed()), eCPublicKeySpec.getParams());
        } else {
            if (this.f90407q0.getCurve() == null) {
                this.f90407q0 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve().createPoint(this.f90407q0.getAffineXCoord().toBigInteger(), this.f90407q0.getAffineYCoord().toBigInteger());
            }
            eCParameterSpecConvertSpec = null;
        }
        this.f90408r0 = eCParameterSpecConvertSpec;
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.f90406p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90406p0 = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.f90408r0 = params;
        this.f90407q0 = EC5Util.convertPoint(params, eCPublicKey.getW());
    }
}
