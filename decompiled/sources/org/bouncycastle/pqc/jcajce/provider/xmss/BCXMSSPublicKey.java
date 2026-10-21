package org.bouncycastle.pqc.jcajce.provider.xmss;

import cn.a;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCXMSSPublicKey implements PublicKey, XMSSKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient XMSSPublicKeyParameters f91524p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient ASN1ObjectIdentifier f91525q0;

    public BCXMSSPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, XMSSPublicKeyParameters xMSSPublicKeyParameters) {
        this.f91525q0 = aSN1ObjectIdentifier;
        this.f91524p0 = xMSSPublicKeyParameters;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        XMSSPublicKeyParameters xMSSPublicKeyParameters = (XMSSPublicKeyParameters) PublicKeyFactory.createKey(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
        this.f91524p0 = xMSSPublicKeyParameters;
        this.f91525q0 = a.a(xMSSPublicKeyParameters.getTreeDigest());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXMSSPublicKey) {
            BCXMSSPublicKey bCXMSSPublicKey = (BCXMSSPublicKey) obj;
            try {
                return this.f91525q0.equals((ASN1Primitive) bCXMSSPublicKey.f91525q0) && Arrays.areEqual(this.f91524p0.getEncoded(), bCXMSSPublicKey.f91524p0.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.f91524p0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public int getHeight() {
        return this.f91524p0.getParameters().getHeight();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSKey
    public String getTreeDigest() {
        return a.c(this.f91525q0);
    }

    public int hashCode() {
        try {
            return (Arrays.hashCode(this.f91524p0.getEncoded()) * 37) + this.f91525q0.hashCode();
        } catch (IOException unused) {
            return this.f91525q0.hashCode();
        }
    }

    public BCXMSSPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        XMSSPublicKeyParameters xMSSPublicKeyParameters = (XMSSPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
        this.f91524p0 = xMSSPublicKeyParameters;
        this.f91525q0 = a.a(xMSSPublicKeyParameters.getTreeDigest());
    }
}
