package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class BCECGOST3410_2012PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f89896p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f89897q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient GOST3410PublicKeyAlgParameters f89898r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient BigInteger f89899s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient ECParameterSpec f89900t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public transient DERBitString f89901u0;
    public transient PKCS12BagAttributeCarrierImpl v0;

    public BCECGOST3410_2012PrivateKey() {
        this.f89896p0 = "ECGOST3410-2012";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        b(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.v0 = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final org.bouncycastle.jce.spec.ECParameterSpec a() {
        ECParameterSpec eCParameterSpec = this.f89900t0;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x016f  */
    /* JADX WARN: Code duplicated, block: B:33:0x017a  */
    public final void b(PrivateKeyInfo privateKeyInfo) throws IOException {
        ECParameterSpec eCParameterSpec;
        ASN1Encodable privateKey;
        BigInteger value;
        ASN1Primitive aSN1Primitive = privateKeyInfo.getPrivateKeyAlgorithm().getParameters().toASN1Primitive();
        if ((aSN1Primitive instanceof ASN1Sequence) && (ASN1Sequence.getInstance(aSN1Primitive).size() == 2 || ASN1Sequence.getInstance(aSN1Primitive).size() == 3)) {
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            this.f89898r0 = gOST3410PublicKeyAlgParameters;
            ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            this.f89900t0 = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(this.f89898r0.getPublicKeyParamSet()), EC5Util.convertCurve(parameterSpec.getCurve(), parameterSpec.getSeed()), EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
            ASN1OctetString privateKey2 = privateKeyInfo.getPrivateKey();
            if (privateKey2.getOctets().length == 32 || privateKey2.getOctets().length == 64) {
                value = new BigInteger(1, Arrays.reverse(privateKey2.getOctets()));
            } else {
                ASN1Encodable privateKey3 = privateKeyInfo.parsePrivateKey();
                if (!(privateKey3 instanceof ASN1Integer)) {
                    this.f89899s0 = new BigInteger(1, Arrays.reverse(ASN1OctetString.getInstance(privateKey3).getOctets()));
                    return;
                }
                value = ASN1Integer.getInstance(privateKey3).getPositiveValue();
            }
        } else {
            X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
                X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
                if (namedCurveByOid == null) {
                    ECDomainParameters byOID = ECGOST3410NamedCurves.getByOID(aSN1ObjectIdentifier);
                    eCParameterSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(aSN1ObjectIdentifier), EC5Util.convertCurve(byOID.getCurve(), byOID.getSeed()), EC5Util.convertPoint(byOID.getG()), byOID.getN(), byOID.getH());
                } else {
                    eCParameterSpec = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
                }
            } else {
                if (x962Parameters.isImplicitlyCA()) {
                    this.f89900t0 = null;
                } else {
                    X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
                    eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
                }
                privateKey = privateKeyInfo.parsePrivateKey();
                if (privateKey instanceof ASN1Integer) {
                    org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
                    this.f89899s0 = eCPrivateKey.getKey();
                    this.f89901u0 = eCPrivateKey.getPublicKey();
                    return;
                }
                value = ASN1Integer.getInstance(privateKey).getValue();
            }
            this.f89900t0 = eCParameterSpec;
            privateKey = privateKeyInfo.parsePrivateKey();
            if (privateKey instanceof ASN1Integer) {
                org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey2 = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
                this.f89899s0 = eCPrivateKey2.getKey();
                this.f89901u0 = eCPrivateKey2.getPublicKey();
                return;
            }
            value = ASN1Integer.getInstance(privateKey).getValue();
        }
        this.f89899s0 = value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        return getD().equals(bCECGOST3410_2012PrivateKey.getD()) && a().equals(bCECGOST3410_2012PrivateKey.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89896p0;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.v0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.v0.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.f89899s0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        int orderBitLength;
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey;
        boolean z10 = this.f89899s0.bitLength() > 256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = z10 ? RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512 : RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
        int i10 = z10 ? 64 : 32;
        if (this.f89898r0 != null) {
            byte[] bArr = new byte[i10];
            byte[] byteArray = getS().toByteArray();
            if (byteArray.length < i10) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(byteArray, 0, bArr2, i10 - byteArray.length, byteArray.length);
                byteArray = bArr2;
            }
            for (int i11 = 0; i11 != i10; i11++) {
                bArr[i11] = byteArray[(byteArray.length - 1) - i11];
            }
            try {
                return new PrivateKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, this.f89898r0), new DEROctetString(bArr)).getEncoded(ASN1Encoding.DER);
            } catch (IOException unused) {
                return null;
            }
        }
        ECParameterSpec eCParameterSpec = this.f89900t0;
        try {
            if (!(eCParameterSpec instanceof ECNamedCurveSpec)) {
                if (eCParameterSpec == null) {
                    x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
                    orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, null, getS());
                } else {
                    ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.f89900t0.getGenerator()), this.f89897q0), this.f89900t0.getOrder(), BigInteger.valueOf(this.f89900t0.getCofactor()), this.f89900t0.getCurve().getSeed()));
                }
                if (this.f89901u0 != null) {
                    eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.f89901u0, x962Parameters);
                } else {
                    eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters);
                }
                return new PrivateKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, x962Parameters.toASN1Primitive()), eCPrivateKey.toASN1Primitive()).getEncoded(ASN1Encoding.DER);
            }
            ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.f89900t0).getName());
            }
            x962Parameters = new X962Parameters(namedCurveOid);
            return new PrivateKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, x962Parameters.toASN1Primitive()), eCPrivateKey.toASN1Primitive()).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused2) {
            return null;
        }
        orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.f89900t0.getOrder(), getS());
        if (this.f89901u0 != null) {
            eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.f89901u0, x962Parameters);
        } else {
            eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters);
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.f89900t0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f89900t0;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f89899s0;
    }

    public int hashCode() {
        return getD().hashCode() ^ a().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.v0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.f89897q0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.f89896p0, this.f89899s0, a());
    }

    public BCECGOST3410_2012PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.f89896p0 = "ECGOST3410-2012";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89896p0 = str;
        this.f89899s0 = eCPrivateKeyParameters.getD();
        this.f89900t0 = null;
    }

    public BCECGOST3410_2012PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        this.f89896p0 = "ECGOST3410-2012";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.f89896p0 = str;
        this.f89899s0 = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            this.f89900t0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89900t0 = eCParameterSpec;
        }
        this.f89898r0 = bCECGOST3410_2012PublicKey.getGostParams();
        this.f89901u0 = SubjectPublicKeyInfo.getInstance(bCECGOST3410_2012PublicKey.getEncoded()).getPublicKeyData();
    }

    public BCECGOST3410_2012PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.f89896p0 = "ECGOST3410-2012";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.f89896p0 = str;
        this.f89899s0 = eCPrivateKeyParameters.getD();
        this.f89900t0 = eCParameterSpec == null ? new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        this.f89898r0 = bCECGOST3410_2012PublicKey.getGostParams();
        this.f89901u0 = SubjectPublicKeyInfo.getInstance(bCECGOST3410_2012PublicKey.getEncoded()).getPublicKeyData();
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKey eCPrivateKey) {
        this.f89896p0 = "ECGOST3410-2012";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89899s0 = eCPrivateKey.getS();
        this.f89896p0 = eCPrivateKey.getAlgorithm();
        this.f89900t0 = eCPrivateKey.getParams();
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.f89896p0 = "ECGOST3410-2012";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89899s0 = eCPrivateKeySpec.getS();
        this.f89900t0 = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410_2012PrivateKey(BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey) {
        this.f89896p0 = "ECGOST3410-2012";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89899s0 = bCECGOST3410_2012PrivateKey.f89899s0;
        this.f89900t0 = bCECGOST3410_2012PrivateKey.f89900t0;
        this.f89897q0 = bCECGOST3410_2012PrivateKey.f89897q0;
        this.v0 = bCECGOST3410_2012PrivateKey.v0;
        this.f89901u0 = bCECGOST3410_2012PrivateKey.f89901u0;
        this.f89898r0 = bCECGOST3410_2012PrivateKey.f89898r0;
    }

    public BCECGOST3410_2012PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.f89896p0 = "ECGOST3410-2012";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89899s0 = eCPrivateKeySpec.getD();
        this.f89900t0 = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }
}
