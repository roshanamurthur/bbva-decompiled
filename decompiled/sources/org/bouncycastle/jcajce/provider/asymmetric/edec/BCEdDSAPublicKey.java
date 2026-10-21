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
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.jcajce.interfaces.EdDSAPublicKey;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class BCEdDSAPublicKey implements EdDSAPublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient AsymmetricKeyParameter f89927p0;

    public BCEdDSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
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
        this.f89927p0 = EdECObjectIdentifiers.id_Ed448.equals((ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm()) ? new Ed448PublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getOctets(), 0) : new Ed25519PublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getOctets(), 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCEdDSAPublicKey) {
            return Arrays.areEqual(((BCEdDSAPublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89927p0 instanceof Ed448PublicKeyParameters ? EdDSAParameterSpec.Ed448 : EdDSAParameterSpec.Ed25519;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f89927p0 instanceof Ed448PublicKeyParameters) {
            byte[] bArr = KeyFactorySpi.f89935e;
            byte[] bArr2 = new byte[bArr.length + 57];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((Ed448PublicKeyParameters) this.f89927p0).encode(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.f89936f;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((Ed25519PublicKeyParameters) this.f89927p0).encode(bArr4, bArr3.length);
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
        return z.e("Public Key", getAlgorithm(), this.f89927p0);
    }

    public BCEdDSAPublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        this.f89927p0 = asymmetricKeyParameter;
    }

    public BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        AsymmetricKeyParameter ed25519PublicKeyParameters;
        int length = bArr.length;
        if (!z.d(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 57) {
            ed25519PublicKeyParameters = new Ed448PublicKeyParameters(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            ed25519PublicKeyParameters = new Ed25519PublicKeyParameters(bArr2, length);
        }
        this.f89927p0 = ed25519PublicKeyParameters;
    }
}
