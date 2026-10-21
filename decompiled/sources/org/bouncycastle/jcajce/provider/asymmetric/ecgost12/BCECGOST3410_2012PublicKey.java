package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECGOST3410Parameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes8.dex */
public class BCECGOST3410_2012PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f89902p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f89903q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient ECPublicKeyParameters f89904r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient ECParameterSpec f89905s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient GOST3410PublicKeyAlgParameters f89906t0;

    public BCECGOST3410_2012PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters) {
        this.f89902p0 = str;
        this.f89904r0 = eCPublicKeyParameters;
        this.f89905s0 = null;
    }

    public static void b(BigInteger bigInteger, byte[] bArr, int i10, int i11) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(byteArray, 0, bArr2, i10 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i12 = 0; i12 != i10; i12++) {
            bArr[i11 + i12] = byteArray[(byteArray.length - 1) - i12];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        c(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final org.bouncycastle.jce.spec.ECParameterSpec a() {
        ECParameterSpec eCParameterSpec = this.f89905s0;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public final void c(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        DERBitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
        this.f89902p0 = "ECGOST3410-2012";
        try {
            byte[] octets = ((ASN1OctetString) ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
            int i10 = algorithm.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512) ? 64 : 32;
            int i11 = i10 * 2;
            byte[] bArr = new byte[i11 + 1];
            bArr[0] = 4;
            for (int i12 = 1; i12 <= i10; i12++) {
                bArr[i12] = octets[i10 - i12];
                bArr[i12 + i10] = octets[i11 - i12];
            }
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            this.f89906t0 = gOST3410PublicKeyAlgParameters;
            ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            ECCurve curve = parameterSpec.getCurve();
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(curve, parameterSpec.getSeed());
            this.f89904r0 = new ECPublicKeyParameters(curve.decodePoint(bArr), ECUtil.getDomainParameters((ProviderConfiguration) null, parameterSpec));
            this.f89905s0 = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(this.f89906t0.getPublicKeyParamSet()), ellipticCurveConvertCurve, EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        return this.f89904r0.getQ().equals(bCECGOST3410_2012PublicKey.f89904r0.getQ()) && a().equals(bCECGOST3410_2012PublicKey.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89902p0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        int i10;
        ASN1Encodable x962Parameters;
        GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters;
        BigInteger bigInteger = this.f89904r0.getQ().getAffineXCoord().toBigInteger();
        BigInteger bigInteger2 = this.f89904r0.getQ().getAffineYCoord().toBigInteger();
        boolean z10 = bigInteger.bitLength() > 256;
        GOST3410PublicKeyAlgParameters gostParams = getGostParams();
        ASN1Encodable aSN1Encodable = gostParams;
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.f89905s0;
            if (eCParameterSpec instanceof ECNamedCurveSpec) {
                ASN1ObjectIdentifier oid = ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) eCParameterSpec).getName());
                if (z10) {
                    x962Parameters = gOST3410PublicKeyAlgParameters;
                    gOST3410PublicKeyAlgParameters = new GOST3410PublicKeyAlgParameters(oid, RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512);
                } else {
                    x962Parameters = gOST3410PublicKeyAlgParameters;
                    gOST3410PublicKeyAlgParameters = new GOST3410PublicKeyAlgParameters(oid, RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
                }
            } else {
                ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.f89905s0.getGenerator()), this.f89903q0), this.f89905s0.getOrder(), BigInteger.valueOf(this.f89905s0.getCofactor()), this.f89905s0.getCurve().getSeed()));
            }
            aSN1Encodable = x962Parameters;
        }
        int i11 = 64;
        if (z10) {
            aSN1ObjectIdentifier = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512;
            i10 = 64;
            i11 = 128;
        } else {
            aSN1ObjectIdentifier = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
            i10 = 32;
        }
        byte[] bArr = new byte[i11];
        int i12 = i11 / 2;
        b(bigInteger, bArr, i12, 0);
        b(bigInteger2, bArr, i12, i10);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, aSN1Encodable), new DEROctetString(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    public GOST3410PublicKeyAlgParameters getGostParams() {
        if (this.f89906t0 == null && (this.f89905s0 instanceof ECNamedCurveSpec)) {
            this.f89906t0 = this.f89904r0.getQ().getAffineXCoord().toBigInteger().bitLength() > 256 ? new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) this.f89905s0).getName()), RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512) : new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) this.f89905s0).getName()), RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
        }
        return this.f89906t0;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.f89905s0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f89905s0;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public ECPoint getQ() {
        return this.f89905s0 == null ? this.f89904r0.getQ().getDetachedPoint() : this.f89904r0.getQ();
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return EC5Util.convertPoint(this.f89904r0.getQ());
    }

    public int hashCode() {
        return this.f89904r0.getQ().hashCode() ^ a().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.f89903q0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.f89902p0, this.f89904r0.getQ(), a());
    }

    public BCECGOST3410_2012PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec) {
        this.f89902p0 = "ECGOST3410-2012";
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f89902p0 = str;
        this.f89904r0 = eCPublicKeyParameters;
        if (parameters instanceof ECGOST3410Parameters) {
            ECGOST3410Parameters eCGOST3410Parameters = (ECGOST3410Parameters) parameters;
            this.f89906t0 = new GOST3410PublicKeyAlgParameters(eCGOST3410Parameters.getPublicKeyParamSet(), eCGOST3410Parameters.getDigestParamSet(), eCGOST3410Parameters.getEncryptionParamSet());
        }
        if (eCParameterSpec == null) {
            this.f89905s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89905s0 = eCParameterSpec;
        }
    }

    public BCECGOST3410_2012PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.f89902p0 = "ECGOST3410-2012";
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f89902p0 = str;
        this.f89904r0 = eCPublicKeyParameters;
        if (eCParameterSpec == null) {
            this.f89905s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89905s0 = EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        }
    }

    public BCECGOST3410_2012PublicKey(ECPublicKey eCPublicKey) {
        this.f89902p0 = "ECGOST3410-2012";
        this.f89902p0 = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.f89905s0 = params;
        this.f89904r0 = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f89902p0 = "ECGOST3410-2012";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f89905s0 = params;
        this.f89904r0 = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        this.f89902p0 = "ECGOST3410-2012";
        this.f89904r0 = bCECGOST3410_2012PublicKey.f89904r0;
        this.f89905s0 = bCECGOST3410_2012PublicKey.f89905s0;
        this.f89903q0 = bCECGOST3410_2012PublicKey.f89903q0;
        this.f89906t0 = bCECGOST3410_2012PublicKey.f89906t0;
    }

    public BCECGOST3410_2012PublicKey(org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.f89902p0 = "ECGOST3410-2012";
        if (eCPublicKeySpec.getParams() == null) {
            this.f89904r0 = new ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.f89905s0 = null;
        } else {
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.f89904r0 = new ECPublicKeyParameters(eCPublicKeySpec.getQ(), ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.f89905s0 = EC5Util.convertSpec(ellipticCurveConvertCurve, eCPublicKeySpec.getParams());
        }
    }
}
