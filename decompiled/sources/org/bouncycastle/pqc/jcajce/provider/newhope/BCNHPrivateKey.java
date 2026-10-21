package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCNHPrivateKey implements NHPrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient NHPrivateKeyParameters f91468p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient ASN1Set f91469q0;

    public BCNHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.f91469q0 = privateKeyInfo.getAttributes();
        this.f91468p0 = (NHPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject());
        this.f91469q0 = privateKeyInfo.getAttributes();
        this.f91468p0 = (NHPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCNHPrivateKey) {
            return Arrays.areEqual(this.f91468p0.getSecData(), ((BCNHPrivateKey) obj).f91468p0.getSecData());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(this.f91468p0, this.f91469q0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.NHPrivateKey
    public short[] getSecretData() {
        return this.f91468p0.getSecData();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91468p0.getSecData());
    }

    public BCNHPrivateKey(NHPrivateKeyParameters nHPrivateKeyParameters) {
        this.f91468p0 = nHPrivateKeyParameters;
    }
}
