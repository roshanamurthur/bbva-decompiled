package org.bouncycastle.pqc.jcajce.provider.xmss;

import cn.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCXMSSPrivateKey implements PrivateKey, XMSSPrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient XMSSPrivateKeyParameters f91521p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient ASN1ObjectIdentifier f91522q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient ASN1Set f91523r0;

    public BCXMSSPrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, XMSSPrivateKeyParameters xMSSPrivateKeyParameters) {
        this.f91522q0 = aSN1ObjectIdentifier;
        this.f91521p0 = xMSSPrivateKeyParameters;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(PrivateKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final void a(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.f91523r0 = privateKeyInfo.getAttributes();
        this.f91522q0 = XMSSKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.f91521p0 = (XMSSPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSPrivateKey)) {
            return false;
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) obj;
        return this.f91522q0.equals((ASN1Primitive) bCXMSSPrivateKey.f91522q0) && Arrays.areEqual(this.f91521p0.toByteArray(), bCXMSSPrivateKey.f91521p0.toByteArray());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public XMSSPrivateKey extractKeyShard(int i10) {
        return new BCXMSSPrivateKey(this.f91522q0, this.f91521p0.extractKeyShard(i10));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(this.f91521p0, this.f91523r0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public int getHeight() {
        return this.f91521p0.getParameters().getHeight();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() != 0) {
            return this.f91521p0.getIndex();
        }
        throw new IllegalStateException("key exhausted");
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public String getTreeDigest() {
        return a.c(this.f91522q0);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSPrivateKey
    public long getUsagesRemaining() {
        return this.f91521p0.getUsagesRemaining();
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f91521p0.toByteArray()) * 37) + this.f91522q0.hashCode();
    }

    public BCXMSSPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        a(privateKeyInfo);
    }
}
