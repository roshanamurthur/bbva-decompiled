package org.bouncycastle.jcajce.provider.asymmetric.edec;

import androidx.appcompat.widget.z;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.jcajce.interfaces.XDHPrivateKey;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class BCXDHPrivateKey implements XDHPrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f89928p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89929q0;
    protected transient AsymmetricKeyParameter xdhPrivateKey;

    public BCXDHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.f89928p0 = privateKeyInfo.hasPublicKey();
        this.f89929q0 = privateKeyInfo.getAttributes() != null ? privateKeyInfo.getAttributes().getEncoded() : null;
        a(privateKeyInfo);
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
        ASN1Encodable privateKey = privateKeyInfo.parsePrivateKey();
        this.xdhPrivateKey = EdECObjectIdentifiers.id_X448.equals((ASN1Primitive) privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()) ? new X448PrivateKeyParameters(ASN1OctetString.getInstance(privateKey).getOctets(), 0) : new X25519PrivateKeyParameters(ASN1OctetString.getInstance(privateKey).getOctets(), 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXDHPrivateKey) {
            return Arrays.areEqual(((BCXDHPrivateKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.xdhPrivateKey instanceof X448PrivateKeyParameters ? XDHParameterSpec.X448 : XDHParameterSpec.X25519;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            ASN1Set aSN1Set = ASN1Set.getInstance(this.f89929q0);
            PrivateKeyInfo privateKeyInfoCreatePrivateKeyInfo = PrivateKeyInfoFactory.createPrivateKeyInfo(this.xdhPrivateKey, aSN1Set);
            return this.f89928p0 ? privateKeyInfoCreatePrivateKeyInfo.getEncoded() : new PrivateKeyInfo(privateKeyInfoCreatePrivateKeyInfo.getPrivateKeyAlgorithm(), privateKeyInfoCreatePrivateKeyInfo.parsePrivateKey(), aSN1Set).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jcajce.interfaces.XDHPrivateKey
    public XDHPublicKey getPublicKey() {
        AsymmetricKeyParameter asymmetricKeyParameter = this.xdhPrivateKey;
        return asymmetricKeyParameter instanceof X448PrivateKeyParameters ? new BCXDHPublicKey(((X448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey()) : new BCXDHPublicKey(((X25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public String toString() {
        AsymmetricKeyParameter asymmetricKeyParameter = this.xdhPrivateKey;
        return z.e("Private Key", getAlgorithm(), asymmetricKeyParameter instanceof X448PrivateKeyParameters ? ((X448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey() : ((X25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    public BCXDHPrivateKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.f89928p0 = true;
        this.f89929q0 = null;
        this.xdhPrivateKey = asymmetricKeyParameter;
    }
}
