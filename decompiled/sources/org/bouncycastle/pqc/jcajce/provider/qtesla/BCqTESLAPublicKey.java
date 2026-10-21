package org.bouncycastle.pqc.jcajce.provider.qtesla;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.QTESLAKey;
import org.bouncycastle.pqc.jcajce.spec.QTESLAParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCqTESLAPublicKey implements PublicKey, QTESLAKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient QTESLAPublicKeyParameters f91479p0;

    public BCqTESLAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        this.f91479p0 = (QTESLAPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f91479p0 = (QTESLAPublicKeyParameters) PublicKeyFactory.createKey(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCqTESLAPublicKey)) {
            return false;
        }
        BCqTESLAPublicKey bCqTESLAPublicKey = (BCqTESLAPublicKey) obj;
        return this.f91479p0.getSecurityCategory() == bCqTESLAPublicKey.f91479p0.getSecurityCategory() && Arrays.areEqual(this.f91479p0.getPublicData(), bCqTESLAPublicKey.f91479p0.getPublicData());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return QTESLASecurityCategory.getName(this.f91479p0.getSecurityCategory());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.f91479p0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.QTESLAKey
    public QTESLAParameterSpec getParams() {
        return new QTESLAParameterSpec(getAlgorithm());
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f91479p0.getPublicData()) * 37) + this.f91479p0.getSecurityCategory();
    }

    public BCqTESLAPublicKey(QTESLAPublicKeyParameters qTESLAPublicKeyParameters) {
        this.f91479p0 = qTESLAPublicKeyParameters;
    }
}
