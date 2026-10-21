package org.bouncycastle.jcajce.provider.asymmetric.gost;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* JADX INFO: loaded from: classes8.dex */
public class BCGOST3410PublicKey implements GOST3410PublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f89967p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient GOST3410Params f89968q0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.f89968q0 = new GOST3410ParameterSpec(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.f89968q0 = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object a10;
        objectOutputStream.defaultWriteObject();
        if (this.f89968q0.getPublicKeyParamSetOID() != null) {
            a10 = this.f89968q0.getPublicKeyParamSetOID();
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.f89968q0.getPublicKeyParameters().getP());
            objectOutputStream.writeObject(this.f89968q0.getPublicKeyParameters().getQ());
            a10 = this.f89968q0.getPublicKeyParameters().getA();
        }
        objectOutputStream.writeObject(a10);
        objectOutputStream.writeObject(this.f89968q0.getDigestParamSetOID());
        objectOutputStream.writeObject(this.f89968q0.getEncryptionParamSetOID());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCGOST3410PublicKey)) {
            return false;
        }
        BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
        return this.f89967p0.equals(bCGOST3410PublicKey.f89967p0) && this.f89968q0.equals(bCGOST3410PublicKey.f89968q0);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = getY().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = byteArray[(byteArray.length - 1) - i10];
        }
        try {
            GOST3410Params gOST3410Params = this.f89968q0;
            return KeyUtil.getEncodedSubjectPublicKeyInfo(gOST3410Params instanceof GOST3410ParameterSpec ? gOST3410Params.getEncryptionParamSetOID() != null ? new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(this.f89968q0.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(this.f89968q0.getDigestParamSetOID()), new ASN1ObjectIdentifier(this.f89968q0.getEncryptionParamSetOID()))), new DEROctetString(bArr)) : new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(this.f89968q0.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(this.f89968q0.getDigestParamSetOID()))), new DEROctetString(bArr)) : new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94), new DEROctetString(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Key
    public GOST3410Params getParameters() {
        return this.f89968q0;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PublicKey
    public BigInteger getY() {
        return this.f89967p0;
    }

    public int hashCode() {
        return this.f89967p0.hashCode() ^ this.f89968q0.hashCode();
    }

    public String toString() {
        try {
            return a.b(this.f89967p0, ((GOST3410PublicKeyParameters) GOST3410Util.generatePublicKeyParameter(this)).getParameters());
        } catch (InvalidKeyException e5) {
            throw new IllegalStateException(e5.getMessage());
        }
    }
}
