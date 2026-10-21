package org.bouncycastle.jcajce.provider.asymmetric.edec;

import androidx.appcompat.widget.z;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class BCXDHPublicKey implements XDHPublicKey {
    protected transient AsymmetricKeyParameter xdhPublicKey;

    public BCXDHPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        a(subjectPublicKeyInfo);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a(SubjectPublicKeyInfo.getInstance((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final void a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.xdhPublicKey = EdECObjectIdentifiers.id_X448.equals((ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm()) ? new X448PublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getOctets(), 0) : new X25519PublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getOctets(), 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXDHPublicKey) {
            return Arrays.areEqual(((BCXDHPublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.xdhPublicKey instanceof X448PublicKeyParameters ? XDHParameterSpec.X448 : XDHParameterSpec.X25519;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.xdhPublicKey instanceof X448PublicKeyParameters) {
            byte[] bArr = KeyFactorySpi.f89933c;
            byte[] bArr2 = new byte[bArr.length + 56];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((X448PublicKeyParameters) this.xdhPublicKey).encode(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.f89934d;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((X25519PublicKeyParameters) this.xdhPublicKey).encode(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    public int hashCode() {
        return Arrays.hashCode(getEncoded());
    }

    public String toString() {
        return z.e("Public Key", getAlgorithm(), this.xdhPublicKey);
    }

    public BCXDHPublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.xdhPublicKey = asymmetricKeyParameter;
    }

    public BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        AsymmetricKeyParameter x25519PublicKeyParameters;
        int length = bArr.length;
        if (!z.d(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 56) {
            x25519PublicKeyParameters = new X448PublicKeyParameters(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            x25519PublicKeyParameters = new X25519PublicKeyParameters(bArr2, length);
        }
        this.xdhPublicKey = x25519PublicKeyParameters;
    }
}
