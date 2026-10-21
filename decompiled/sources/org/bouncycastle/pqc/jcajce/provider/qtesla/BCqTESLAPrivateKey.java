package org.bouncycastle.pqc.jcajce.provider.qtesla;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.QTESLAKey;
import org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCqTESLAPrivateKey implements PrivateKey, QTESLAKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient QTESLAPrivateKeyParameters f91477p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient ASN1Set f91478q0;

    public BCqTESLAPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.f91478q0 = privateKeyInfo.getAttributes();
        this.f91477p0 = (QTESLAPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject());
        this.f91478q0 = privateKeyInfo.getAttributes();
        this.f91477p0 = (QTESLAPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCqTESLAPrivateKey)) {
            return false;
        }
        BCqTESLAPrivateKey bCqTESLAPrivateKey = (BCqTESLAPrivateKey) obj;
        return this.f91477p0.getSecurityCategory() == bCqTESLAPrivateKey.f91477p0.getSecurityCategory() && Arrays.areEqual(this.f91477p0.getSecret(), bCqTESLAPrivateKey.f91477p0.getSecret());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return QTESLASecurityCategory.getName(this.f91477p0.getSecurityCategory());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(this.f91477p0, this.f91478q0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.QTESLAKey
    public QTESLAParameterSpec getParams() {
        return new QTESLAParameterSpec(getAlgorithm());
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f91477p0.getSecret()) * 37) + this.f91477p0.getSecurityCategory();
    }

    public BCqTESLAPrivateKey(QTESLAPrivateKeyParameters qTESLAPrivateKeyParameters) {
        this.f91477p0 = qTESLAPrivateKeyParameters;
    }
}
