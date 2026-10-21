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
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.jcajce.interfaces.EdDSAPrivateKey;
import org.bouncycastle.jcajce.interfaces.EdDSAPublicKey;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class BCEdDSAPrivateKey implements EdDSAPrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient AsymmetricKeyParameter f89924p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f89925q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f89926r0;

    public BCEdDSAPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.f89925q0 = privateKeyInfo.hasPublicKey();
        this.f89926r0 = privateKeyInfo.getAttributes() != null ? privateKeyInfo.getAttributes().getEncoded() : null;
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
        this.f89924p0 = EdECObjectIdentifiers.id_Ed448.equals((ASN1Primitive) privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()) ? new Ed448PrivateKeyParameters(ASN1OctetString.getInstance(privateKey).getOctets(), 0) : new Ed25519PrivateKeyParameters(ASN1OctetString.getInstance(privateKey).getOctets(), 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCEdDSAPrivateKey) {
            return Arrays.areEqual(((BCEdDSAPrivateKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89924p0 instanceof Ed448PrivateKeyParameters ? EdDSAParameterSpec.Ed448 : EdDSAParameterSpec.Ed25519;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            ASN1Set aSN1Set = ASN1Set.getInstance(this.f89926r0);
            PrivateKeyInfo privateKeyInfoCreatePrivateKeyInfo = PrivateKeyInfoFactory.createPrivateKeyInfo(this.f89924p0, aSN1Set);
            return this.f89925q0 ? privateKeyInfoCreatePrivateKeyInfo.getEncoded() : new PrivateKeyInfo(privateKeyInfoCreatePrivateKeyInfo.getPrivateKeyAlgorithm(), privateKeyInfoCreatePrivateKeyInfo.parsePrivateKey(), aSN1Set).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jcajce.interfaces.EdDSAPrivateKey
    public EdDSAPublicKey getPublicKey() {
        AsymmetricKeyParameter asymmetricKeyParameter = this.f89924p0;
        return asymmetricKeyParameter instanceof Ed448PrivateKeyParameters ? new BCEdDSAPublicKey(((Ed448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey()) : new BCEdDSAPublicKey(((Ed25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public String toString() {
        AsymmetricKeyParameter asymmetricKeyParameter = this.f89924p0;
        return z.e("Private Key", getAlgorithm(), asymmetricKeyParameter instanceof Ed448PrivateKeyParameters ? ((Ed448PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey() : ((Ed25519PrivateKeyParameters) asymmetricKeyParameter).generatePublicKey());
    }

    public BCEdDSAPrivateKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.f89925q0 = true;
        this.f89926r0 = null;
        this.f89924p0 = asymmetricKeyParameter;
    }
}
