package org.bouncycastle.jce.provider;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes8.dex */
public class JCEDHPublicKey implements DHPublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f90398p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DHParameterSpec f90399q0;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f90398p0 = (BigInteger) objectInputStream.readObject();
        this.f90399q0 = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.f90399q0.getP());
        objectOutputStream.writeObject(this.f90399q0.getG());
        objectOutputStream.writeInt(this.f90399q0.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.dhKeyAgreement, new DHParameter(this.f90399q0.getP(), this.f90399q0.getG(), this.f90399q0.getL())), new ASN1Integer(this.f90398p0));
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.f90399q0;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f90398p0;
    }
}
