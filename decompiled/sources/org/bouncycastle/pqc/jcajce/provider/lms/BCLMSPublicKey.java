package org.bouncycastle.pqc.jcajce.provider.lms;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.LMSKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCLMSPublicKey implements PublicKey, LMSKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient LMSKeyParameters f91445p0;

    public BCLMSPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        this.f91445p0 = (LMSKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f91445p0 = (LMSKeyParameters) PublicKeyFactory.createKey(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCLMSPublicKey) {
            try {
                return Arrays.areEqual(this.f91445p0.getEncoded(), ((BCLMSPublicKey) obj).f91445p0.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.f91445p0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSKey
    public int getLevels() {
        LMSKeyParameters lMSKeyParameters = this.f91445p0;
        if (lMSKeyParameters instanceof LMSPublicKeyParameters) {
            return 1;
        }
        return ((HSSPublicKeyParameters) lMSKeyParameters).getL();
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(this.f91445p0.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }

    public BCLMSPublicKey(LMSKeyParameters lMSKeyParameters) {
        this.f91445p0 = lMSKeyParameters;
    }
}
