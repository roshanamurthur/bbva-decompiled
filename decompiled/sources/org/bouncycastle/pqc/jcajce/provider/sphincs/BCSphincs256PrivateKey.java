package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCSphincs256PrivateKey implements PrivateKey, SPHINCSKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ASN1ObjectIdentifier f91503p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient SPHINCSPrivateKeyParameters f91504q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient ASN1Set f91505r0;

    public BCSphincs256PrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, SPHINCSPrivateKeyParameters sPHINCSPrivateKeyParameters) {
        this.f91503p0 = aSN1ObjectIdentifier;
        this.f91504q0 = sPHINCSPrivateKeyParameters;
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
        this.f91505r0 = privateKeyInfo.getAttributes();
        this.f91503p0 = SPHINCS256KeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.f91504q0 = (SPHINCSPrivateKeyParameters) PrivateKeyFactory.createKey(privateKeyInfo);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PrivateKey)) {
            return false;
        }
        BCSphincs256PrivateKey bCSphincs256PrivateKey = (BCSphincs256PrivateKey) obj;
        return this.f91503p0.equals((ASN1Primitive) bCSphincs256PrivateKey.f91503p0) && Arrays.areEqual(this.f91504q0.getKeyData(), bCSphincs256PrivateKey.f91504q0.getKeyData());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.f91504q0.getTreeDigest() != null ? PrivateKeyInfoFactory.createPrivateKeyInfo(this.f91504q0, this.f91505r0) : new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.sphincs256, new SPHINCS256KeyParams(new AlgorithmIdentifier(this.f91503p0))), new DEROctetString(this.f91504q0.getKeyData()), this.f91505r0)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.f91504q0.getKeyData();
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f91504q0.getKeyData()) * 37) + this.f91503p0.hashCode();
    }

    public BCSphincs256PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        a(privateKeyInfo);
    }
}
