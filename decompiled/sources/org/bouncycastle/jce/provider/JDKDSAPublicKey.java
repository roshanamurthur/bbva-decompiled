package org.bouncycastle.jce.provider;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class JDKDSAPublicKey implements DSAPublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f90421p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DSAParameterSpec f90422q0;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f90421p0 = (BigInteger) objectInputStream.readObject();
        this.f90422q0 = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f90421p0);
        objectOutputStream.writeObject(this.f90422q0.getP());
        objectOutputStream.writeObject(this.f90422q0.getQ());
        objectOutputStream.writeObject(this.f90422q0.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            DSAParameterSpec dSAParameterSpec = this.f90422q0;
            return dSAParameterSpec == null ? new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa), new ASN1Integer(this.f90421p0)).getEncoded(ASN1Encoding.DER) : new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, new DSAParameter(dSAParameterSpec.getP(), this.f90422q0.getQ(), this.f90422q0.getG())), new ASN1Integer(this.f90421p0)).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.f90422q0;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.f90421p0;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DSA Public Key");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }
}
