package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.DomainParameters;
import org.bouncycastle.asn1.x9.ValidationParams;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BCDHPrivateKey implements DHPrivateKey, PKCS12BagAttributeCarrier {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f89750p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient DHParameterSpec f89751q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient PrivateKeyInfo f89752r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final transient DHPrivateKeyParameters f89753s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient PKCS12BagAttributeCarrierImpl f89754t0 = new PKCS12BagAttributeCarrierImpl();

    public BCDHPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f89751q0 = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.f89752r0 = null;
        this.f89754t0 = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f89751q0.getP());
        objectOutputStream.writeObject(this.f89751q0.getG());
        objectOutputStream.writeInt(this.f89751q0.getL());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.f89754t0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.f89754t0.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        PrivateKeyInfo privateKeyInfo;
        try {
            PrivateKeyInfo privateKeyInfo2 = this.f89752r0;
            if (privateKeyInfo2 != null) {
                return privateKeyInfo2.getEncoded(ASN1Encoding.DER);
            }
            DHParameterSpec dHParameterSpec = this.f89751q0;
            if (!(dHParameterSpec instanceof DHDomainParameterSpec) || ((DHDomainParameterSpec) dHParameterSpec).getQ() == null) {
                privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.dhKeyAgreement, new DHParameter(this.f89751q0.getP(), this.f89751q0.getG(), this.f89751q0.getL()).toASN1Primitive()), new ASN1Integer(getX()));
            } else {
                DHParameters domainParameters = ((DHDomainParameterSpec) this.f89751q0).getDomainParameters();
                DHValidationParameters validationParameters = domainParameters.getValidationParameters();
                privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.dhpublicnumber, new DomainParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), validationParameters != null ? new ValidationParams(validationParameters.getSeed(), validationParameters.getCounter()) : null).toASN1Primitive()), new ASN1Integer(getX()));
            }
            return privateKeyInfo.getEncoded(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.f89751q0;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f89750p0;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f89754t0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public String toString() {
        DHParameters dHParameters = new DHParameters(this.f89751q0.getP(), this.f89751q0.getG());
        StringBuffer stringBuffer = new StringBuffer("DH Private Key [");
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = dHParameters.getG().modPow(this.f89750p0, dHParameters.getP());
        stringBuffer.append(new Fingerprint(Arrays.concatenate(bigIntegerModPow.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString());
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("              Y: ");
        stringBuffer.append(bigIntegerModPow.toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public BCDHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        DHPrivateKeyParameters dHPrivateKeyParameters;
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        ASN1Integer aSN1Integer = (ASN1Integer) privateKeyInfo.parsePrivateKey();
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        this.f89752r0 = privateKeyInfo;
        BigInteger value = aSN1Integer.getValue();
        this.f89750p0 = value;
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.dhKeyAgreement)) {
            DHParameter dHParameter = DHParameter.getInstance(aSN1Sequence);
            if (dHParameter.getL() != null) {
                this.f89751q0 = new DHParameterSpec(dHParameter.getP(), dHParameter.getG(), dHParameter.getL().intValue());
                dHPrivateKeyParameters = new DHPrivateKeyParameters(value, new DHParameters(dHParameter.getP(), dHParameter.getG(), null, dHParameter.getL().intValue()));
            } else {
                this.f89751q0 = new DHParameterSpec(dHParameter.getP(), dHParameter.getG());
                dHPrivateKeyParameters = new DHPrivateKeyParameters(value, new DHParameters(dHParameter.getP(), dHParameter.getG()));
            }
        } else {
            if (!algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.dhpublicnumber)) {
                throw new IllegalArgumentException("unknown algorithm type: " + algorithm);
            }
            DomainParameters domainParameters = DomainParameters.getInstance(aSN1Sequence);
            this.f89751q0 = new DHDomainParameterSpec(domainParameters.getP(), domainParameters.getQ(), domainParameters.getG(), domainParameters.getJ(), 0);
            dHPrivateKeyParameters = new DHPrivateKeyParameters(value, new DHParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), (DHValidationParameters) null));
        }
        this.f89753s0 = dHPrivateKeyParameters;
    }
}
