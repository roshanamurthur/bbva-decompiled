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
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCXMSSMTPublicKey implements PublicKey, XMSSMTKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ASN1ObjectIdentifier f91519p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient XMSSMTPublicKeyParameters f91520q0;

    public BCXMSSMTPublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters) {
        this.f91519p0 = aSN1ObjectIdentifier;
        this.f91520q0 = xMSSMTPublicKeyParameters;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters) PublicKeyFactory.createKey(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
        this.f91520q0 = xMSSMTPublicKeyParameters;
        this.f91519p0 = a.a(xMSSMTPublicKeyParameters.getTreeDigest());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXMSSMTPublicKey)) {
            return false;
        }
        BCXMSSMTPublicKey bCXMSSMTPublicKey = (BCXMSSMTPublicKey) obj;
        return this.f91519p0.equals((ASN1Primitive) bCXMSSMTPublicKey.f91519p0) && Arrays.areEqual(this.f91520q0.toByteArray(), bCXMSSMTPublicKey.f91520q0.toByteArray());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.f91520q0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public int getHeight() {
        return this.f91520q0.getParameters().getHeight();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public int getLayers() {
        return this.f91520q0.getParameters().getLayers();
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.XMSSMTKey
    public String getTreeDigest() {
        return a.c(this.f91519p0);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f91520q0.toByteArray()) * 37) + this.f91519p0.hashCode();
    }

    public BCXMSSMTPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
        this.f91520q0 = xMSSMTPublicKeyParameters;
        this.f91519p0 = a.a(xMSSMTPublicKeyParameters.getTreeDigest());
    }
}
