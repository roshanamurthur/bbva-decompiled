package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

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
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
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

/* JADX INFO: loaded from: classes8.dex */
public class BCECGOST3410PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f89874p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f89875q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient ASN1Encodable f89876r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient BigInteger f89877s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient ECParameterSpec f89878t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public transient DERBitString f89879u0;
    public transient PKCS12BagAttributeCarrierImpl v0;

    public BCECGOST3410PrivateKey() {
        this.f89874p0 = "ECGOST3410";
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
        ECParameterSpec eCParameterSpec = this.f89878t0;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0142  */
    /* JADX WARN: Code duplicated, block: B:32:0x014d  */
    public final void b(PrivateKeyInfo privateKeyInfo) throws IOException {
        ECNamedCurveSpec eCNamedCurveSpec;
        ASN1Encodable privateKey;
        BigInteger value;
        String curveName;
        ASN1Encodable parameters = privateKeyInfo.getPrivateKeyAlgorithm().getParameters();
        ASN1Primitive aSN1Primitive = parameters.toASN1Primitive();
        if ((aSN1Primitive instanceof ASN1Sequence) && (ASN1Sequence.getInstance(aSN1Primitive).size() == 2 || ASN1Sequence.getInstance(aSN1Primitive).size() == 3)) {
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(parameters);
            this.f89876r0 = gOST3410PublicKeyAlgParameters;
            ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            this.f89878t0 = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()), EC5Util.convertCurve(parameterSpec.getCurve(), parameterSpec.getSeed()), EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
            ASN1Encodable privateKey2 = privateKeyInfo.parsePrivateKey();
            if (privateKey2 instanceof ASN1Integer) {
                value = ASN1Integer.getInstance(privateKey2).getPositiveValue();
            } else {
                byte[] octets = ASN1OctetString.getInstance(privateKey2).getOctets();
                byte[] bArr = new byte[octets.length];
                for (int i10 = 0; i10 != octets.length; i10++) {
                    bArr[i10] = octets[(octets.length - 1) - i10];
                }
                value = new BigInteger(1, bArr);
            }
        } else {
            X962Parameters x962Parameters = X962Parameters.getInstance(parameters);
            if (x962Parameters.isNamedCurve()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
                X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
                if (namedCurveByOid == null) {
                    ECDomainParameters byOID = ECGOST3410NamedCurves.getByOID(aSN1ObjectIdentifier);
                    X9ECParameters x9ECParameters = new X9ECParameters(byOID.getCurve(), new X9ECPoint(byOID.getG(), false), byOID.getN(), byOID.getH(), byOID.getSeed());
                    curveName = ECGOST3410NamedCurves.getName(aSN1ObjectIdentifier);
                    namedCurveByOid = x9ECParameters;
                } else {
                    curveName = ECUtil.getCurveName(aSN1ObjectIdentifier);
                }
                eCNamedCurveSpec = new ECNamedCurveSpec(curveName, EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            } else {
                if (x962Parameters.isImplicitlyCA()) {
                    eCNamedCurveSpec = null;
                } else {
                    X9ECParameters x9ECParameters2 = X9ECParameters.getInstance(x962Parameters.getParameters());
                    this.f89878t0 = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters2.getCurve(), x9ECParameters2.getSeed()), EC5Util.convertPoint(x9ECParameters2.getG()), x9ECParameters2.getN(), x9ECParameters2.getH().intValue());
                }
                privateKey = privateKeyInfo.parsePrivateKey();
                if (privateKey instanceof ASN1Integer) {
                    org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
                    this.f89877s0 = eCPrivateKey.getKey();
                    this.f89879u0 = eCPrivateKey.getPublicKey();
                    return;
                }
                value = ASN1Integer.getInstance(privateKey).getValue();
            }
            this.f89878t0 = eCNamedCurveSpec;
            privateKey = privateKeyInfo.parsePrivateKey();
            if (privateKey instanceof ASN1Integer) {
                org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey2 = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
                this.f89877s0 = eCPrivateKey2.getKey();
                this.f89879u0 = eCPrivateKey2.getPublicKey();
                return;
            }
            value = ASN1Integer.getInstance(privateKey).getValue();
        }
        this.f89877s0 = value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return getD().equals(bCECGOST3410PrivateKey.getD()) && a().equals(bCECGOST3410PrivateKey.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89874p0;
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
        return this.f89877s0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        int orderBitLength;
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey;
        if (this.f89876r0 != null) {
            byte[] bArr = new byte[32];
            byte[] byteArray = getS().toByteArray();
            if (byteArray.length < 32) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
                byteArray = bArr2;
            }
            for (int i10 = 0; i10 != 32; i10++) {
                bArr[i10] = byteArray[(byteArray.length - 1) - i10];
            }
            try {
                return new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, this.f89876r0), new DEROctetString(bArr)).getEncoded(ASN1Encoding.DER);
            } catch (IOException unused) {
                return null;
            }
        }
        ECParameterSpec eCParameterSpec = this.f89878t0;
        try {
            if (!(eCParameterSpec instanceof ECNamedCurveSpec)) {
                if (eCParameterSpec == null) {
                    x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
                    orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, null, getS());
                } else {
                    ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.f89878t0.getGenerator()), this.f89875q0), this.f89878t0.getOrder(), BigInteger.valueOf(this.f89878t0.getCofactor()), this.f89878t0.getCurve().getSeed()));
                }
                if (this.f89879u0 != null) {
                    eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.f89879u0, x962Parameters);
                } else {
                    eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters);
                }
                return new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters.toASN1Primitive()), eCPrivateKey.toASN1Primitive()).getEncoded(ASN1Encoding.DER);
            }
            ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.f89878t0).getName());
            }
            x962Parameters = new X962Parameters(namedCurveOid);
            return new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters.toASN1Primitive()), eCPrivateKey.toASN1Primitive()).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused2) {
            return null;
        }
        orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.f89878t0.getOrder(), getS());
        if (this.f89879u0 != null) {
            eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.f89879u0, x962Parameters);
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
        ECParameterSpec eCParameterSpec = this.f89878t0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f89878t0;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f89877s0;
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
        this.f89875q0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.f89874p0, this.f89877s0, a());
    }

    public BCECGOST3410PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.f89874p0 = "ECGOST3410";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89874p0 = str;
        this.f89877s0 = eCPrivateKeyParameters.getD();
        this.f89878t0 = null;
    }

    public BCECGOST3410PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        DERBitString publicKeyData;
        this.f89874p0 = "ECGOST3410";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89874p0 = str;
        this.f89877s0 = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.f89878t0 = eCParameterSpec;
        this.f89876r0 = bCECGOST3410PublicKey.c();
        try {
            publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCECGOST3410PublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            publicKeyData = null;
        }
        this.f89879u0 = publicKeyData;
    }

    public BCECGOST3410PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECGOST3410PublicKey bCECGOST3410PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        DERBitString publicKeyData;
        this.f89874p0 = "ECGOST3410";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89874p0 = str;
        this.f89877s0 = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.f89878t0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89878t0 = new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        }
        this.f89876r0 = bCECGOST3410PublicKey.c();
        try {
            publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCECGOST3410PublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            publicKeyData = null;
        }
        this.f89879u0 = publicKeyData;
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.f89874p0 = "ECGOST3410";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89877s0 = eCPrivateKey.getS();
        this.f89874p0 = eCPrivateKey.getAlgorithm();
        this.f89878t0 = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.f89874p0 = "ECGOST3410";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89877s0 = eCPrivateKeySpec.getS();
        this.f89878t0 = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.f89874p0 = "ECGOST3410";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        b(privateKeyInfo);
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.f89874p0 = "ECGOST3410";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89877s0 = bCECGOST3410PrivateKey.f89877s0;
        this.f89878t0 = bCECGOST3410PrivateKey.f89878t0;
        this.f89875q0 = bCECGOST3410PrivateKey.f89875q0;
        this.v0 = bCECGOST3410PrivateKey.v0;
        this.f89879u0 = bCECGOST3410PrivateKey.f89879u0;
        this.f89876r0 = bCECGOST3410PrivateKey.f89876r0;
    }

    public BCECGOST3410PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.f89874p0 = "ECGOST3410";
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89877s0 = eCPrivateKeySpec.getD();
        this.f89878t0 = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }
}
