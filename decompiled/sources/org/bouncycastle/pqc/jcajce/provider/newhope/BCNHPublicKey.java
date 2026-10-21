package org.bouncycastle.pqc.jcajce.provider.newhope;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCNHPublicKey implements NHPublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient NHPublicKeyParameters f91470p0;

    public BCNHPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        this.f91470p0 = (NHPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f91470p0 = (NHPublicKeyParameters) PublicKeyFactory.createKey(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCNHPublicKey)) {
            return false;
        }
        return Arrays.areEqual(this.f91470p0.getPubData(), ((BCNHPublicKey) obj).f91470p0.getPubData());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.f91470p0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPublicKey
    public byte[] getPublicData() {
        return this.f91470p0.getPubData();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91470p0.getPubData());
    }

    public BCNHPublicKey(NHPublicKeyParameters nHPublicKeyParameters) {
        this.f91470p0 = nHPublicKeyParameters;
    }
}
