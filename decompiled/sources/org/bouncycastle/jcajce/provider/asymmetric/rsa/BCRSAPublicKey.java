package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BCRSAPublicKey implements RSAPublicKey {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final AlgorithmIdentifier f89984t0 = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f89985p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f89986q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient AlgorithmIdentifier f89987r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient RSAKeyParameters f89988s0;

    public BCRSAPublicKey(AlgorithmIdentifier algorithmIdentifier, RSAKeyParameters rSAKeyParameters) {
        this.f89987r0 = algorithmIdentifier;
        this.f89985p0 = rSAKeyParameters.getModulus();
        this.f89986q0 = rSAKeyParameters.getExponent();
        this.f89988s0 = rSAKeyParameters;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            this.f89987r0 = AlgorithmIdentifier.getInstance(objectInputStream.readObject());
        } catch (Exception unused) {
            this.f89987r0 = f89984t0;
        }
        this.f89988s0 = new RSAKeyParameters(false, this.f89985p0, this.f89986q0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.f89987r0.equals(f89984t0)) {
            return;
        }
        objectOutputStream.writeObject(this.f89987r0.getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89987r0.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS) ? "RSASSA-PSS" : "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(this.f89987r0, new org.bouncycastle.asn1.pkcs.RSAPublicKey(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.f89985p0;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return this.f89986q0;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RSA Public Key [");
        String strLineSeparator = Strings.lineSeparator();
        BigInteger modulus = getModulus();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = RSAUtil.rsaOids;
        stringBuffer.append(new Fingerprint(modulus.toByteArray()).toString());
        stringBuffer.append("],[");
        stringBuffer.append(new Fingerprint(getPublicExponent().toByteArray(), 32).toString());
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("        modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }
}
