package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BCDSAPublicKey implements DSAPublicKey {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final BigInteger f89789s0 = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f89790p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient DSAPublicKeyParameters f89791q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient DSAParams f89792r0;

    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        BigInteger y7 = dSAPublicKey.getY();
        this.f89790p0 = y7;
        this.f89792r0 = dSAPublicKey.getParams();
        this.f89791q0 = new DSAPublicKeyParameters(y7, DSAUtil.b(this.f89792r0));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(f89789s0)) {
            this.f89792r0 = null;
        } else {
            this.f89792r0 = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.f89791q0 = new DSAPublicKeyParameters(this.f89790p0, DSAUtil.b(this.f89792r0));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        BigInteger g6;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.f89792r0;
        if (dSAParams == null) {
            g6 = f89789s0;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.f89792r0.getQ());
            g6 = this.f89792r0.getG();
        }
        objectOutputStream.writeObject(g6);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        if (this.f89792r0 != null) {
            return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
        }
        return getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        DSAParams dSAParams = this.f89792r0;
        BigInteger bigInteger = this.f89790p0;
        return dSAParams == null ? KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa), new ASN1Integer(bigInteger)) : KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, new DSAParameter(dSAParams.getP(), this.f89792r0.getQ(), this.f89792r0.getG()).toASN1Primitive()), new ASN1Integer(bigInteger));
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.f89792r0;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.f89790p0;
    }

    public int hashCode() {
        return this.f89792r0 != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DSA Public Key [");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(DSAUtil.a(this.f89790p0, getParams()));
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            Y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            BigInteger value = ((ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue();
            this.f89790p0 = value;
            ASN1Encodable parameters = subjectPublicKeyInfo.getAlgorithm().getParameters();
            if (parameters == null || DERNull.INSTANCE.equals(parameters.toASN1Primitive())) {
                this.f89792r0 = null;
            } else {
                DSAParameter dSAParameter = DSAParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
                this.f89792r0 = new DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            }
            this.f89791q0 = new DSAPublicKeyParameters(value, DSAUtil.b(this.f89792r0));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
