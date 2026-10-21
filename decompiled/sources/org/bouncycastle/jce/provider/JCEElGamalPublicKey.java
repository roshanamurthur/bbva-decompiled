package org.bouncycastle.jce.provider;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class JCEElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f90414p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ElGamalParameterSpec f90415q0;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f90414p0 = (BigInteger) objectInputStream.readObject();
        this.f90415q0 = new ElGamalParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.f90415q0.getP());
        objectOutputStream.writeObject(this.f90415q0.getG());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(OIWObjectIdentifiers.elGamalAlgorithm, new ElGamalParameter(this.f90415q0.getP(), this.f90415q0.getG())), new ASN1Integer(this.f90414p0));
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalKey
    public ElGamalParameterSpec getParameters() {
        return this.f90415q0;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.f90415q0.getP(), this.f90415q0.getG());
    }

    @Override // org.bouncycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f90414p0;
    }
}
