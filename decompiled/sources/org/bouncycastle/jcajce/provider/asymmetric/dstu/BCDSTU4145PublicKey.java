package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.ua.DSTU4145BinaryField;
import org.bouncycastle.asn1.ua.DSTU4145ECBinary;
import org.bouncycastle.asn1.ua.DSTU4145NamedCurves;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.asn1.ua.DSTU4145PointEncoder;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes8.dex */
public class BCDSTU4145PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f89811p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f89812q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient ECPublicKeyParameters f89813r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient ECParameterSpec f89814s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient DSTU4145Params f89815t0;

    public BCDSTU4145PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters) {
        this.f89811p0 = str;
        this.f89813r0 = eCPublicKeyParameters;
        this.f89814s0 = null;
    }

    public static void c(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - 1) - i10];
            bArr[(bArr.length - 1) - i10] = b10;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        b(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final org.bouncycastle.jce.spec.ECParameterSpec a() {
        ECParameterSpec eCParameterSpec = this.f89814s0;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public final void b(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec;
        X9ECParameters x9ECParameters;
        ECParameterSpec eCParameterSpecConvertToSpec;
        DERBitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
        this.f89811p0 = "DSTU4145";
        try {
            byte[] octets = ((ASN1OctetString) ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
            ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu4145le;
            if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                c(octets);
            }
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
                x9ECParameters = X9ECParameters.getInstance(aSN1Sequence);
                eCParameterSpec = new org.bouncycastle.jce.spec.ECParameterSpec(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
            } else {
                DSTU4145Params dSTU4145Params = DSTU4145Params.getInstance(aSN1Sequence);
                this.f89815t0 = dSTU4145Params;
                if (dSTU4145Params.isNamedCurve()) {
                    ASN1ObjectIdentifier namedCurve = this.f89815t0.getNamedCurve();
                    ECDomainParameters byOID = DSTU4145NamedCurves.getByOID(namedCurve);
                    eCParameterSpec = new ECNamedCurveParameterSpec(namedCurve.getId(), byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
                } else {
                    DSTU4145ECBinary eCBinary = this.f89815t0.getECBinary();
                    byte[] b10 = eCBinary.getB();
                    if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                        c(b10);
                    }
                    DSTU4145BinaryField field = eCBinary.getField();
                    ECCurve.F2m f2m = new ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), new BigInteger(1, b10));
                    byte[] g6 = eCBinary.getG();
                    if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                        c(g6);
                    }
                    eCParameterSpec = new org.bouncycastle.jce.spec.ECParameterSpec(f2m, DSTU4145PointEncoder.decodePoint(f2m, g6), eCBinary.getN());
                }
                x9ECParameters = null;
            }
            ECCurve curve = eCParameterSpec.getCurve();
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(curve, eCParameterSpec.getSeed());
            if (this.f89815t0 != null) {
                ECPoint eCPointConvertPoint = EC5Util.convertPoint(eCParameterSpec.getG());
                eCParameterSpecConvertToSpec = this.f89815t0.isNamedCurve() ? new ECNamedCurveSpec(this.f89815t0.getNamedCurve().getId(), ellipticCurveConvertCurve, eCPointConvertPoint, eCParameterSpec.getN(), eCParameterSpec.getH()) : new ECParameterSpec(ellipticCurveConvertCurve, eCPointConvertPoint, eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
            } else {
                eCParameterSpecConvertToSpec = EC5Util.convertToSpec(x9ECParameters);
            }
            this.f89814s0 = eCParameterSpecConvertToSpec;
            this.f89813r0 = new ECPublicKeyParameters(DSTU4145PointEncoder.decodePoint(curve, octets), EC5Util.getDomainParameters(null, this.f89814s0));
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.f89813r0.getQ().equals(bCDSTU4145PublicKey.f89813r0.getQ()) && a().equals(bCDSTU4145PublicKey.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89811p0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ASN1Encodable x962Parameters = this.f89815t0;
        if (x962Parameters == null) {
            ECParameterSpec eCParameterSpec = this.f89814s0;
            if (eCParameterSpec instanceof ECNamedCurveSpec) {
                x962Parameters = new DSTU4145Params(new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.f89814s0).getName()));
            } else {
                ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.f89814s0.getGenerator()), this.f89812q0), this.f89814s0.getOrder(), BigInteger.valueOf(this.f89814s0.getCofactor()), this.f89814s0.getCurve().getSeed()));
            }
        }
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(new AlgorithmIdentifier(UAObjectIdentifiers.dstu4145be, x962Parameters), new DEROctetString(DSTU4145PointEncoder.encodePoint(this.f89813r0.getQ()))));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.f89814s0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f89814s0;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public org.bouncycastle.math.ec.ECPoint getQ() {
        org.bouncycastle.math.ec.ECPoint q10 = this.f89813r0.getQ();
        return this.f89814s0 == null ? q10.getDetachedPoint() : q10;
    }

    public byte[] getSbox() {
        DSTU4145Params dSTU4145Params = this.f89815t0;
        return dSTU4145Params != null ? dSTU4145Params.getDKE() : DSTU4145Params.getDefaultDKE();
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.f89813r0.getQ());
    }

    public int hashCode() {
        return this.f89813r0.getQ().hashCode() ^ a().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.f89812q0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.f89811p0, this.f89813r0.getQ(), a());
    }

    public BCDSTU4145PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec) {
        this.f89811p0 = "DSTU4145";
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f89811p0 = str;
        this.f89813r0 = eCPublicKeyParameters;
        if (eCParameterSpec == null) {
            this.f89814s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89814s0 = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.f89811p0 = "DSTU4145";
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f89811p0 = str;
        if (eCParameterSpec == null) {
            this.f89814s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89814s0 = EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        }
        this.f89813r0 = eCPublicKeyParameters;
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f89811p0 = "DSTU4145";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f89814s0 = params;
        this.f89813r0 = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, this.f89814s0));
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.f89811p0 = "DSTU4145";
        this.f89813r0 = bCDSTU4145PublicKey.f89813r0;
        this.f89814s0 = bCDSTU4145PublicKey.f89814s0;
        this.f89812q0 = bCDSTU4145PublicKey.f89812q0;
        this.f89815t0 = bCDSTU4145PublicKey.f89815t0;
    }

    public BCDSTU4145PublicKey(org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.f89811p0 = "DSTU4145";
        if (eCPublicKeySpec.getParams() == null) {
            this.f89813r0 = new ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.f89814s0 = null;
        } else {
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.f89813r0 = new ECPublicKeyParameters(eCPublicKeySpec.getQ(), ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.f89814s0 = EC5Util.convertSpec(ellipticCurveConvertCurve, eCPublicKeySpec.getParams());
        }
    }
}
