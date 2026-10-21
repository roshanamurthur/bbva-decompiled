package org.bouncycastle.jce.provider;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
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
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKeyStructure;
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
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class JCEECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f90400p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f90401q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ECParameterSpec f90402r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f90403s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public DERBitString f90404t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PKCS12BagAttributeCarrierImpl f90405u0;

    public JCEECPrivateKey() {
        this.f90400p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90405u0 = new PKCS12BagAttributeCarrierImpl();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:16:0x00cc  */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ECParameterSpec eCParameterSpec;
        ASN1Encodable privateKey;
        PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject()));
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (!x962Parameters.isNamedCurve()) {
            if (x962Parameters.isImplicitlyCA()) {
                this.f90402r0 = null;
            } else {
                X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
                eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
            }
            privateKey = privateKeyInfo.parsePrivateKey();
            if (privateKey instanceof ASN1Integer) {
                this.f90401q0 = ASN1Integer.getInstance(privateKey).getValue();
            } else {
                ECPrivateKeyStructure eCPrivateKeyStructure = new ECPrivateKeyStructure((ASN1Sequence) privateKey);
                this.f90401q0 = eCPrivateKeyStructure.getKey();
                this.f90404t0 = eCPrivateKeyStructure.getPublicKey();
            }
            this.f90400p0 = (String) objectInputStream.readObject();
            this.f90403s0 = objectInputStream.readBoolean();
            PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new PKCS12BagAttributeCarrierImpl();
            this.f90405u0 = pKCS12BagAttributeCarrierImpl;
            pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
        X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
        if (namedCurveByOid == null) {
            ECDomainParameters byOID = ECGOST3410NamedCurves.getByOID(aSN1ObjectIdentifier);
            eCParameterSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(aSN1ObjectIdentifier), EC5Util.convertCurve(byOID.getCurve(), byOID.getSeed()), EC5Util.convertPoint(byOID.getG()), byOID.getN(), byOID.getH());
        } else {
            eCParameterSpec = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
        }
        this.f90402r0 = eCParameterSpec;
        privateKey = privateKeyInfo.parsePrivateKey();
        if (privateKey instanceof ASN1Integer) {
            this.f90401q0 = ASN1Integer.getInstance(privateKey).getValue();
        } else {
            ECPrivateKeyStructure eCPrivateKeyStructure2 = new ECPrivateKeyStructure((ASN1Sequence) privateKey);
            this.f90401q0 = eCPrivateKeyStructure2.getKey();
            this.f90404t0 = eCPrivateKeyStructure2.getPublicKey();
        }
        this.f90400p0 = (String) objectInputStream.readObject();
        this.f90403s0 = objectInputStream.readBoolean();
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl2 = new PKCS12BagAttributeCarrierImpl();
        this.f90405u0 = pKCS12BagAttributeCarrierImpl2;
        pKCS12BagAttributeCarrierImpl2.readObject(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.f90400p0);
        objectOutputStream.writeBoolean(this.f90403s0);
        this.f90405u0.writeObject(objectOutputStream);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPrivateKey)) {
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        if (!getD().equals(jCEECPrivateKey.getD())) {
            return false;
        }
        ECParameterSpec eCParameterSpec = this.f90402r0;
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpecConvertSpec = eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
        ECParameterSpec eCParameterSpec2 = jCEECPrivateKey.f90402r0;
        return eCParameterSpecConvertSpec.equals(eCParameterSpec2 != null ? EC5Util.convertSpec(eCParameterSpec2) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f90400p0;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.f90405u0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.f90405u0.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.f90401q0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        ECParameterSpec eCParameterSpec = this.f90402r0;
        if (eCParameterSpec instanceof ECNamedCurveSpec) {
            ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.f90402r0).getName());
            }
            x962Parameters = new X962Parameters(namedCurveOid);
        } else if (eCParameterSpec == null) {
            x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
        } else {
            ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            x962Parameters = new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, this.f90402r0.getGenerator()), this.f90403s0), this.f90402r0.getOrder(), BigInteger.valueOf(this.f90402r0.getCofactor()), this.f90402r0.getCurve().getSeed()));
        }
        ECPrivateKeyStructure eCPrivateKeyStructure = this.f90404t0 != null ? new ECPrivateKeyStructure(getS(), this.f90404t0, x962Parameters) : new ECPrivateKeyStructure(getS(), x962Parameters);
        try {
            return (this.f90400p0.equals("ECGOST3410") ? new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters.toASN1Primitive()), eCPrivateKeyStructure.toASN1Primitive()) : new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters.toASN1Primitive()), eCPrivateKeyStructure.toASN1Primitive())).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.f90402r0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f90402r0;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f90401q0;
    }

    public int hashCode() {
        int iHashCode = getD().hashCode();
        ECParameterSpec eCParameterSpec = this.f90402r0;
        return iHashCode ^ (eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa()).hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f90405u0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.f90403s0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("EC Private Key");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f90401q0.toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.f90400p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90405u0 = new PKCS12BagAttributeCarrierImpl();
        this.f90400p0 = str;
        this.f90401q0 = eCPrivateKeySpec.getS();
        this.f90402r0 = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.f90400p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90405u0 = new PKCS12BagAttributeCarrierImpl();
        this.f90400p0 = str;
        this.f90401q0 = eCPrivateKeyParameters.getD();
        this.f90402r0 = null;
    }

    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        DERBitString publicKeyData;
        this.f90400p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90405u0 = new PKCS12BagAttributeCarrierImpl();
        this.f90400p0 = str;
        this.f90401q0 = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.f90402r0 = eCParameterSpec;
        try {
            publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(jCEECPublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            publicKeyData = null;
        }
        this.f90404t0 = publicKeyData;
    }

    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, JCEECPublicKey jCEECPublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        DERBitString publicKeyData;
        this.f90400p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90405u0 = new PKCS12BagAttributeCarrierImpl();
        this.f90400p0 = str;
        this.f90401q0 = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.f90402r0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f90402r0 = new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        }
        try {
            publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(jCEECPublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            publicKeyData = null;
        }
        this.f90404t0 = publicKeyData;
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.f90400p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90405u0 = new PKCS12BagAttributeCarrierImpl();
        this.f90400p0 = str;
        this.f90401q0 = jCEECPrivateKey.f90401q0;
        this.f90402r0 = jCEECPrivateKey.f90402r0;
        this.f90403s0 = jCEECPrivateKey.f90403s0;
        this.f90405u0 = jCEECPrivateKey.f90405u0;
        this.f90404t0 = jCEECPrivateKey.f90404t0;
    }

    public JCEECPrivateKey(String str, org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.f90400p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90405u0 = new PKCS12BagAttributeCarrierImpl();
        this.f90400p0 = str;
        this.f90401q0 = eCPrivateKeySpec.getD();
        this.f90402r0 = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.f90400p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f90405u0 = new PKCS12BagAttributeCarrierImpl();
        this.f90401q0 = eCPrivateKey.getS();
        this.f90400p0 = eCPrivateKey.getAlgorithm();
        this.f90402r0 = eCPrivateKey.getParams();
    }
}
