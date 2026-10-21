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
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCXMSSMTPrivateKey implements PrivateKey, XMSSMTPrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ASN1ObjectIdentifier f91516p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient XMSSMTPrivateKeyParameters f91517q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient ASN1Set f91518r0;

    public BCXMSSMTPrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters) {
        this.f91516p0 = aSN1ObjectIdentifier;
        this.f91517q0 = xMSSMTPrivateKeyParameters;
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
        this.f91518r0 = privateKeyInfo.getAttributes();
        this.f91516p0 = XMSSMTKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.f91517q0 = (XMSSMTPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPrivateKey)) {
            return false;
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) obj;
        return this.f91516p0.equals((ASN1Primitive) bCXMSSMTPrivateKey.f91516p0) && Arrays.areEqual(this.f91517q0.toByteArray(), bCXMSSMTPrivateKey.f91517q0.toByteArray());
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey
    public XMSSMTPrivateKey extractKeyShard(int i10) {
        return new BCXMSSMTPrivateKey(this.f91516p0, this.f91517q0.extractKeyShard(i10));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return PrivateKeyInfoFactory.createPrivateKeyInfo(this.f91517q0, this.f91518r0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public int getHeight() {
        return this.f91517q0.getParameters().getHeight();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey
    public long getIndex() {
        if (getUsagesRemaining() != 0) {
            return this.f91517q0.getIndex();
        }
        throw new IllegalStateException("key exhausted");
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public int getLayers() {
        return this.f91517q0.getParameters().getLayers();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public String getTreeDigest() {
        return a.c(this.f91516p0);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey
    public long getUsagesRemaining() {
        return this.f91517q0.getUsagesRemaining();
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f91517q0.toByteArray()) * 37) + this.f91516p0.hashCode();
    }

    public BCXMSSMTPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        a(privateKeyInfo);
    }
}
