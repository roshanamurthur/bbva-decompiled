package org.bouncycastle.pqc.jcajce.provider.sphincs;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BCSphincs256PublicKey implements PublicKey, SPHINCSKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ASN1ObjectIdentifier f91506p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient SPHINCSPublicKeyParameters f91507q0;

    public BCSphincs256PublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, SPHINCSPublicKeyParameters sPHINCSPublicKeyParameters) {
        this.f91506p0 = aSN1ObjectIdentifier;
        this.f91507q0 = sPHINCSPublicKeyParameters;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject());
        this.f91506p0 = SPHINCS256KeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.f91507q0 = (SPHINCSPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCSphincs256PublicKey)) {
            return false;
        }
        BCSphincs256PublicKey bCSphincs256PublicKey = (BCSphincs256PublicKey) obj;
        return this.f91506p0.equals((ASN1Primitive) bCSphincs256PublicKey.f91506p0) && Arrays.areEqual(this.f91507q0.getKeyData(), bCSphincs256PublicKey.f91507q0.getKeyData());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.f91507q0.getTreeDigest() != null ? SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(this.f91507q0) : new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.sphincs256, new SPHINCS256KeyParams(new AlgorithmIdentifier(this.f91506p0))), this.f91507q0.getKeyData())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.SPHINCSKey
    public byte[] getKeyData() {
        return this.f91507q0.getKeyData();
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f91507q0.getKeyData()) * 37) + this.f91506p0.hashCode();
    }

    public BCSphincs256PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        this.f91506p0 = SPHINCS256KeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters()).getTreeDigest().getAlgorithm();
        this.f91507q0 = (SPHINCSPublicKeyParameters) PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }
}
