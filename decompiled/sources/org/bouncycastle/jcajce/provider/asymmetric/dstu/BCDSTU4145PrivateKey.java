package org.bouncycastle.jcajce.provider.asymmetric.dstu;

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
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
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
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes8.dex */
public class BCDSTU4145PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f89805p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f89806q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient BigInteger f89807r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient ECParameterSpec f89808s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient DERBitString f89809t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public transient PKCS12BagAttributeCarrierImpl f89810u0;

    public BCDSTU4145PrivateKey() {
        this.f89805p0 = "DSTU4145";
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
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
        b(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final org.bouncycastle.jce.spec.ECParameterSpec a() {
        ECParameterSpec eCParameterSpec = this.f89808s0;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0180  */
    /* JADX WARN: Code duplicated, block: B:29:0x018b  */
    public final void b(PrivateKeyInfo privateKeyInfo) throws IOException {
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec;
        ECParameterSpec eCParameterSpec2;
        ASN1Encodable privateKey;
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (!x962Parameters.isNamedCurve()) {
            if (x962Parameters.isImplicitlyCA()) {
                this.f89808s0 = null;
            } else {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x962Parameters.getParameters());
                if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
                    X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
                    eCParameterSpec2 = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
                } else {
                    DSTU4145Params dSTU4145Params = DSTU4145Params.getInstance(aSN1Sequence);
                    if (dSTU4145Params.isNamedCurve()) {
                        ASN1ObjectIdentifier namedCurve = dSTU4145Params.getNamedCurve();
                        ECDomainParameters byOID = DSTU4145NamedCurves.getByOID(namedCurve);
                        eCParameterSpec = new ECNamedCurveParameterSpec(namedCurve.getId(), byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
                    } else {
                        DSTU4145ECBinary eCBinary = dSTU4145Params.getECBinary();
                        byte[] b10 = eCBinary.getB();
                        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu4145le;
                        if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                            c(b10);
                        }
                        DSTU4145BinaryField field = eCBinary.getField();
                        ECCurve.F2m f2m = new ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), new BigInteger(1, b10));
                        byte[] g6 = eCBinary.getG();
                        if (privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                            c(g6);
                        }
                        eCParameterSpec = new org.bouncycastle.jce.spec.ECParameterSpec(f2m, DSTU4145PointEncoder.decodePoint(f2m, g6), eCBinary.getN());
                    }
                    this.f89808s0 = new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
                }
            }
            privateKey = privateKeyInfo.parsePrivateKey();
            if (privateKey instanceof ASN1Integer) {
                this.f89807r0 = ASN1Integer.getInstance(privateKey).getValue();
                return;
            }
            org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
            this.f89807r0 = eCPrivateKey.getKey();
            this.f89809t0 = eCPrivateKey.getPublicKey();
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
        X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier2);
        if (namedCurveByOid == null) {
            ECDomainParameters byOID2 = DSTU4145NamedCurves.getByOID(aSN1ObjectIdentifier2);
            eCParameterSpec2 = new ECNamedCurveSpec(aSN1ObjectIdentifier2.getId(), EC5Util.convertCurve(byOID2.getCurve(), byOID2.getSeed()), EC5Util.convertPoint(byOID2.getG()), byOID2.getN(), byOID2.getH());
        } else {
            eCParameterSpec2 = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier2), EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
        }
        this.f89808s0 = eCParameterSpec2;
        privateKey = privateKeyInfo.parsePrivateKey();
        if (privateKey instanceof ASN1Integer) {
            this.f89807r0 = ASN1Integer.getInstance(privateKey).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey2 = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
        this.f89807r0 = eCPrivateKey2.getKey();
        this.f89809t0 = eCPrivateKey2.getPublicKey();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return getD().equals(bCDSTU4145PrivateKey.getD()) && a().equals(bCDSTU4145PrivateKey.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89805p0;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.f89810u0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.f89810u0.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.f89807r0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x008e  */
    /* JADX WARN: Code duplicated, block: B:15:0x009a  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ad A[Catch: IOException -> 0x00dd, TryCatch #0 {IOException -> 0x00dd, blocks: (B:16:0x00a3, B:18:0x00ad, B:20:0x00d6, B:19:0x00c2), top: B:23:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c2 A[Catch: IOException -> 0x00dd, TryCatch #0 {IOException -> 0x00dd, blocks: (B:16:0x00a3, B:18:0x00ad, B:20:0x00d6, B:19:0x00c2), top: B:23:0x00a3 }] */
    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        int orderBitLength;
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey;
        PrivateKeyInfo privateKeyInfo;
        ECParameterSpec eCParameterSpec = this.f89808s0;
        try {
            if (!(eCParameterSpec instanceof ECNamedCurveSpec)) {
                if (eCParameterSpec == null) {
                    x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
                    orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, null, getS());
                } else {
                    ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.f89808s0.getGenerator()), this.f89806q0), this.f89808s0.getOrder(), BigInteger.valueOf(this.f89808s0.getCofactor()), this.f89808s0.getCurve().getSeed()));
                }
                if (this.f89809t0 != null) {
                    eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.f89809t0, x962Parameters);
                } else {
                    eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters);
                }
                if (this.f89805p0.equals("DSTU4145")) {
                    privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(UAObjectIdentifiers.dstu4145be, x962Parameters.toASN1Primitive()), eCPrivateKey.toASN1Primitive());
                } else {
                    privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters.toASN1Primitive()), eCPrivateKey.toASN1Primitive());
                }
                return privateKeyInfo.getEncoded(ASN1Encoding.DER);
            }
            ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.f89808s0).getName());
            }
            x962Parameters = new X962Parameters(namedCurveOid);
            if (this.f89805p0.equals("DSTU4145")) {
                privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(UAObjectIdentifiers.dstu4145be, x962Parameters.toASN1Primitive()), eCPrivateKey.toASN1Primitive());
            } else {
                privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters.toASN1Primitive()), eCPrivateKey.toASN1Primitive());
            }
            return privateKeyInfo.getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
        orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.f89808s0.getOrder(), getS());
        if (this.f89809t0 != null) {
            eCPrivateKey = new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.f89809t0, x962Parameters);
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
        ECParameterSpec eCParameterSpec = this.f89808s0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f89808s0;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f89807r0;
    }

    public int hashCode() {
        return getD().hashCode() ^ a().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f89810u0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.f89806q0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.f89805p0, this.f89807r0, a());
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.f89805p0 = "DSTU4145";
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
        this.f89805p0 = str;
        this.f89807r0 = eCPrivateKeyParameters.getD();
        this.f89808s0 = null;
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        DERBitString publicKeyData;
        this.f89805p0 = "DSTU4145";
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.f89805p0 = str;
        this.f89807r0 = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            this.f89808s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89808s0 = eCParameterSpec;
        }
        try {
            publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCDSTU4145PublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            publicKeyData = null;
        }
        this.f89809t0 = publicKeyData;
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCDSTU4145PublicKey bCDSTU4145PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        DERBitString publicKeyData;
        this.f89805p0 = "DSTU4145";
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.f89805p0 = str;
        this.f89807r0 = eCPrivateKeyParameters.getD();
        this.f89808s0 = eCParameterSpec == null ? new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        try {
            publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCDSTU4145PublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            publicKeyData = null;
        }
        this.f89809t0 = publicKeyData;
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.f89805p0 = "DSTU4145";
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
        this.f89807r0 = eCPrivateKey.getS();
        this.f89805p0 = eCPrivateKey.getAlgorithm();
        this.f89808s0 = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.f89805p0 = "DSTU4145";
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
        this.f89807r0 = eCPrivateKeySpec.getS();
        this.f89808s0 = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.f89805p0 = "DSTU4145";
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
        this.f89807r0 = bCDSTU4145PrivateKey.f89807r0;
        this.f89808s0 = bCDSTU4145PrivateKey.f89808s0;
        this.f89806q0 = bCDSTU4145PrivateKey.f89806q0;
        this.f89810u0 = bCDSTU4145PrivateKey.f89810u0;
        this.f89809t0 = bCDSTU4145PrivateKey.f89809t0;
    }

    public BCDSTU4145PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.f89805p0 = "DSTU4145";
        this.f89810u0 = new PKCS12BagAttributeCarrierImpl();
        this.f89807r0 = eCPrivateKeySpec.getD();
        this.f89808s0 = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }
}
