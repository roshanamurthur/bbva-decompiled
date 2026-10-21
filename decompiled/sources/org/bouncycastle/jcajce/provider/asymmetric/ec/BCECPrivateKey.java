package org.bouncycastle.jcajce.provider.asymmetric.ec;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import om.a;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes8.dex */
public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f89825p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f89826q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient BigInteger f89827r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient ECParameterSpec f89828s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient ProviderConfiguration f89829t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public transient DERBitString f89830u0;
    public transient PKCS12BagAttributeCarrierImpl v0;

    public BCECPrivateKey() {
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.f89829t0 = BouncyCastleProvider.CONFIGURATION;
        b(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
        this.v0 = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final org.bouncycastle.jce.spec.ECParameterSpec a() {
        ECParameterSpec eCParameterSpec = this.f89828s0;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : this.f89829t0.getEcImplicitlyCa();
    }

    public final void b(PrivateKeyInfo privateKeyInfo) throws IOException {
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        this.f89828s0 = EC5Util.convertToSpec(x962Parameters, EC5Util.getCurve(this.f89829t0, x962Parameters));
        ASN1Encodable privateKey = privateKeyInfo.parsePrivateKey();
        if (privateKey instanceof ASN1Integer) {
            this.f89827r0 = ASN1Integer.getInstance(privateKey).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(privateKey);
        this.f89827r0 = eCPrivateKey.getKey();
        this.f89830u0 = eCPrivateKey.getPublicKey();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return getD().equals(bCECPrivateKey.getD()) && a().equals(bCECPrivateKey.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89825p0;
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
        return this.f89827r0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962ParametersB = a.b(this.f89828s0, this.f89826q0);
        ECParameterSpec eCParameterSpec = this.f89828s0;
        int orderBitLength = eCParameterSpec == null ? ECUtil.getOrderBitLength(this.f89829t0, null, getS()) : ECUtil.getOrderBitLength(this.f89829t0, eCParameterSpec.getOrder(), getS());
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962ParametersB), this.f89830u0 != null ? new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.f89830u0, x962ParametersB) : new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962ParametersB)).getEncoded(ASN1Encoding.DER);
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
        ECParameterSpec eCParameterSpec = this.f89828s0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f89828s0;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f89827r0;
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
        this.f89826q0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, this.f89827r0, a());
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89825p0 = str;
        this.f89827r0 = eCPrivateKeySpec.getS();
        this.f89828s0 = eCPrivateKeySpec.getParams();
        this.f89829t0 = providerConfiguration;
    }

    public BCECPrivateKey(String str, PrivateKeyInfo privateKeyInfo, ProviderConfiguration providerConfiguration) throws IOException {
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89825p0 = str;
        this.f89829t0 = providerConfiguration;
        b(privateKeyInfo);
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        DERBitString publicKeyData;
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89825p0 = str;
        this.f89827r0 = eCPrivateKeyParameters.getD();
        this.f89829t0 = providerConfiguration;
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.f89828s0 = eCParameterSpec;
        try {
            publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCECPublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            publicKeyData = null;
        }
        this.f89830u0 = publicKeyData;
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECPublicKey bCECPublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        DERBitString publicKeyData;
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89825p0 = str;
        this.f89827r0 = eCPrivateKeyParameters.getD();
        this.f89829t0 = providerConfiguration;
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.f89828s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89828s0 = EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        }
        try {
            try {
                publicKeyData = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCECPublicKey.getEncoded())).getPublicKeyData();
            } catch (IOException unused) {
                publicKeyData = null;
            }
            this.f89830u0 = publicKeyData;
        } catch (Exception unused2) {
            this.f89830u0 = null;
        }
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, ProviderConfiguration providerConfiguration) {
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89825p0 = str;
        this.f89827r0 = eCPrivateKeyParameters.getD();
        this.f89828s0 = null;
        this.f89829t0 = providerConfiguration;
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89825p0 = str;
        this.f89827r0 = bCECPrivateKey.f89827r0;
        this.f89828s0 = bCECPrivateKey.f89828s0;
        this.f89826q0 = bCECPrivateKey.f89826q0;
        this.v0 = bCECPrivateKey.v0;
        this.f89830u0 = bCECPrivateKey.f89830u0;
        this.f89829t0 = bCECPrivateKey.f89829t0;
    }

    public BCECPrivateKey(String str, org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89825p0 = str;
        this.f89827r0 = eCPrivateKeySpec.getD();
        this.f89828s0 = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
        this.f89829t0 = providerConfiguration;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, ProviderConfiguration providerConfiguration) {
        this.f89825p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.v0 = new PKCS12BagAttributeCarrierImpl();
        this.f89827r0 = eCPrivateKey.getS();
        this.f89825p0 = eCPrivateKey.getAlgorithm();
        this.f89828s0 = eCPrivateKey.getParams();
        this.f89829t0 = providerConfiguration;
    }
}
