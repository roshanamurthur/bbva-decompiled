package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

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
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
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
public class BCECGOST3410PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f89880p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f89881q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient ECPublicKeyParameters f89882r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient ECParameterSpec f89883s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient ASN1Encodable f89884t0;

    public BCECGOST3410PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters) {
        this.f89880p0 = str;
        this.f89882r0 = eCPublicKeyParameters;
        this.f89883s0 = null;
    }

    public static void b(int i10, BigInteger bigInteger, byte[] bArr) {
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

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        d(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final org.bouncycastle.jce.spec.ECParameterSpec a() {
        ECParameterSpec eCParameterSpec = this.f89883s0;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public final ASN1Encodable c() {
        if (this.f89884t0 == null) {
            ECParameterSpec eCParameterSpec = this.f89883s0;
            if (eCParameterSpec instanceof ECNamedCurveSpec) {
                this.f89884t0 = new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) eCParameterSpec).getName()), CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
            }
        }
        return this.f89884t0;
    }

    public final void d(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1ObjectIdentifier publicKeyParamSet;
        DERBitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
        this.f89880p0 = "ECGOST3410";
        try {
            byte[] octets = ((ASN1OctetString) ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            for (int i10 = 1; i10 <= 32; i10++) {
                bArr[i10] = octets[32 - i10];
                bArr[i10 + 32] = octets[64 - i10];
            }
            boolean z10 = subjectPublicKeyInfo.getAlgorithm().getParameters() instanceof ASN1ObjectIdentifier;
            ASN1Encodable parameters = subjectPublicKeyInfo.getAlgorithm().getParameters();
            if (z10) {
                publicKeyParamSet = ASN1ObjectIdentifier.getInstance(parameters);
                this.f89884t0 = publicKeyParamSet;
            } else {
                GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(parameters);
                this.f89884t0 = gOST3410PublicKeyAlgParameters;
                publicKeyParamSet = gOST3410PublicKeyAlgParameters.getPublicKeyParamSet();
            }
            ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(publicKeyParamSet));
            ECCurve curve = parameterSpec.getCurve();
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(curve, parameterSpec.getSeed());
            this.f89882r0 = new ECPublicKeyParameters(curve.decodePoint(bArr), ECUtil.getDomainParameters((ProviderConfiguration) null, parameterSpec));
            this.f89883s0 = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(publicKeyParamSet), ellipticCurveConvertCurve, EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        return this.f89882r0.getQ().equals(bCECGOST3410PublicKey.f89882r0.getQ()) && a().equals(bCECGOST3410PublicKey.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89880p0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ASN1Encodable x962Parameters;
        ASN1Encodable aSN1EncodableC = c();
        if (aSN1EncodableC == null) {
            ECParameterSpec eCParameterSpec = this.f89883s0;
            if (eCParameterSpec instanceof ECNamedCurveSpec) {
                x962Parameters = new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) eCParameterSpec).getName()), CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
            } else {
                ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.f89883s0.getGenerator()), this.f89881q0), this.f89883s0.getOrder(), BigInteger.valueOf(this.f89883s0.getCofactor()), this.f89883s0.getCurve().getSeed()));
            }
            aSN1EncodableC = x962Parameters;
        }
        BigInteger bigInteger = this.f89882r0.getQ().getAffineXCoord().toBigInteger();
        BigInteger bigInteger2 = this.f89882r0.getQ().getAffineYCoord().toBigInteger();
        byte[] bArr = new byte[64];
        b(0, bigInteger, bArr);
        b(32, bigInteger2, bArr);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, aSN1EncodableC), new DEROctetString(bArr)));
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
        ECParameterSpec eCParameterSpec = this.f89883s0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f89883s0;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public ECPoint getQ() {
        return this.f89883s0 == null ? this.f89882r0.getQ().getDetachedPoint() : this.f89882r0.getQ();
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return EC5Util.convertPoint(this.f89882r0.getQ());
    }

    public int hashCode() {
        return this.f89882r0.getQ().hashCode() ^ a().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.f89881q0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.f89880p0, this.f89882r0.getQ(), a());
    }

    public BCECGOST3410PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec) {
        this.f89880p0 = "ECGOST3410";
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        if (parameters instanceof ECGOST3410Parameters) {
            ECGOST3410Parameters eCGOST3410Parameters = (ECGOST3410Parameters) parameters;
            this.f89884t0 = new GOST3410PublicKeyAlgParameters(eCGOST3410Parameters.getPublicKeyParamSet(), eCGOST3410Parameters.getDigestParamSet(), eCGOST3410Parameters.getEncryptionParamSet());
        }
        this.f89880p0 = str;
        this.f89882r0 = eCPublicKeyParameters;
        if (eCParameterSpec == null) {
            this.f89883s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89883s0 = eCParameterSpec;
        }
    }

    public BCECGOST3410PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.f89880p0 = "ECGOST3410";
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f89880p0 = str;
        this.f89882r0 = eCPublicKeyParameters;
        if (eCParameterSpec == null) {
            this.f89883s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89883s0 = EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        }
    }

    public BCECGOST3410PublicKey(ECPublicKey eCPublicKey) {
        this.f89880p0 = "ECGOST3410";
        this.f89880p0 = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.f89883s0 = params;
        this.f89882r0 = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.f89880p0 = "ECGOST3410";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f89883s0 = params;
        this.f89882r0 = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.f89880p0 = "ECGOST3410";
        d(subjectPublicKeyInfo);
    }

    public BCECGOST3410PublicKey(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        this.f89880p0 = "ECGOST3410";
        this.f89882r0 = bCECGOST3410PublicKey.f89882r0;
        this.f89883s0 = bCECGOST3410PublicKey.f89883s0;
        this.f89881q0 = bCECGOST3410PublicKey.f89881q0;
        this.f89884t0 = bCECGOST3410PublicKey.f89884t0;
    }

    public BCECGOST3410PublicKey(org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.f89880p0 = "ECGOST3410";
        if (eCPublicKeySpec.getParams() == null) {
            this.f89882r0 = new ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.f89883s0 = null;
        } else {
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.f89882r0 = new ECPublicKeyParameters(eCPublicKeySpec.getQ(), ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.f89883s0 = EC5Util.convertSpec(ellipticCurveConvertCurve, eCPublicKeySpec.getParams());
        }
    }
}
