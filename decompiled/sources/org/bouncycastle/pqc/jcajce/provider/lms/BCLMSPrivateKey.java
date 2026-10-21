package org.bouncycastle.pqc.jcajce.provider.lms;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCLMSPrivateKey implements PrivateKey, LMSPrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient LMSKeyParameters f91443p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient ASN1Set f91444q0;

    public BCLMSPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.f91444q0 = privateKeyInfo.getAttributes();
        this.f91443p0 = (LMSKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject());
        this.f91444q0 = privateKeyInfo.getAttributes();
        this.f91443p0 = (LMSKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCLMSPrivateKey)) {
            return false;
        }
        try {
            return Arrays.areEqual(this.f91443p0.getEncoded(), ((BCLMSPrivateKey) obj).f91443p0.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public LMSPrivateKey extractKeyShard(int i10) {
        LMSKeyParameters lMSKeyParameters = this.f91443p0;
        return lMSKeyParameters instanceof LMSPrivateKeyParameters ? new BCLMSPrivateKey(((LMSPrivateKeyParameters) lMSKeyParameters).extractKeyShard(i10)) : new BCLMSPrivateKey(((HSSPrivateKeyParameters) lMSKeyParameters).extractKeyShard(i10));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(this.f91443p0, this.f91444q0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() == 0) {
            throw new IllegalStateException("key exhausted");
        }
        LMSKeyParameters lMSKeyParameters = this.f91443p0;
        return lMSKeyParameters instanceof LMSPrivateKeyParameters ? ((LMSPrivateKeyParameters) lMSKeyParameters).getIndex() : ((HSSPrivateKeyParameters) lMSKeyParameters).getIndex();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSKey
    public int getLevels() {
        LMSKeyParameters lMSKeyParameters = this.f91443p0;
        if (lMSKeyParameters instanceof LMSPrivateKeyParameters) {
            return 1;
        }
        return ((HSSPrivateKeyParameters) lMSKeyParameters).getL();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSPrivateKey
    public long getUsagesRemaining() {
        LMSKeyParameters lMSKeyParameters = this.f91443p0;
        return lMSKeyParameters instanceof LMSPrivateKeyParameters ? ((LMSPrivateKeyParameters) lMSKeyParameters).getUsagesRemaining() : ((HSSPrivateKeyParameters) lMSKeyParameters).getUsagesRemaining();
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(this.f91443p0.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }

    public BCLMSPrivateKey(LMSKeyParameters lMSKeyParameters) {
        this.f91443p0 = lMSKeyParameters;
    }
}
