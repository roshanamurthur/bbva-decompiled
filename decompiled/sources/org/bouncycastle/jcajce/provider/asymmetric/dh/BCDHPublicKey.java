package org.bouncycastle.jcajce.provider.asymmetric.dh;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.DomainParameters;
import org.bouncycastle.asn1.x9.ValidationParams;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BCDHPublicKey implements DHPublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f89755p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient DHPublicKeyParameters f89756q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient DHParameterSpec f89757r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient SubjectPublicKeyInfo f89758s0;

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        BigInteger y7 = dHPublicKeySpec.getY();
        this.f89755p0 = y7;
        this.f89757r0 = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.f89756q0 = new DHPublicKeyParameters(y7, new DHParameters(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f89757r0 = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.f89758s0 = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f89757r0.getP());
        objectOutputStream.writeObject(this.f89757r0.getG());
        objectOutputStream.writeInt(this.f89757r0.getL());
    }

    public DHPublicKeyParameters engineGetKeyParameters() {
        return this.f89756q0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.f89758s0;
        if (subjectPublicKeyInfo != null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo);
        }
        DHParameterSpec dHParameterSpec = this.f89757r0;
        boolean z10 = dHParameterSpec instanceof DHDomainParameterSpec;
        BigInteger bigInteger = this.f89755p0;
        if (!z10 || ((DHDomainParameterSpec) dHParameterSpec).getQ() == null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.dhKeyAgreement, new DHParameter(this.f89757r0.getP(), this.f89757r0.getG(), this.f89757r0.getL()).toASN1Primitive()), new ASN1Integer(bigInteger));
        }
        DHParameters domainParameters = ((DHDomainParameterSpec) this.f89757r0).getDomainParameters();
        DHValidationParameters validationParameters = domainParameters.getValidationParameters();
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.dhpublicnumber, new DomainParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), validationParameters != null ? new ValidationParams(validationParameters.getSeed(), validationParameters.getCounter()) : null).toASN1Primitive()), new ASN1Integer(bigInteger));
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.f89757r0;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f89755p0;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        DHParameters dHParameters = new DHParameters(this.f89757r0.getP(), this.f89757r0.getG());
        StringBuffer stringBuffer = new StringBuffer("DH Public Key [");
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigInteger = this.f89755p0;
        stringBuffer.append(new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString());
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (org.bouncycastle.asn1.ASN1Integer.getInstance(r1.getObjectAt(2)).getValue().compareTo(java.math.BigInteger.valueOf(org.bouncycastle.asn1.ASN1Integer.getInstance(r1.getObjectAt(0)).getValue().bitLength())) > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BCDHPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r11) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey.<init>(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }
}
