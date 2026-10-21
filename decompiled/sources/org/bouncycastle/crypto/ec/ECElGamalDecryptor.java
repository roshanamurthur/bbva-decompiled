package org.bouncycastle.crypto.ec;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECElGamalDecryptor implements ECDecryptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECPrivateKeyParameters f88230a;

    @Override // org.bouncycastle.crypto.ec.ECDecryptor
    public ECPoint decrypt(ECPair eCPair) {
        ECPrivateKeyParameters eCPrivateKeyParameters = this.f88230a;
        if (eCPrivateKeyParameters == null) {
            throw new IllegalStateException("ECElGamalDecryptor not initialised");
        }
        ECCurve curve = eCPrivateKeyParameters.getParameters().getCurve();
        return ECAlgorithms.cleanPoint(curve, eCPair.getY()).subtract(ECAlgorithms.cleanPoint(curve, eCPair.getX()).multiply(this.f88230a.getD())).normalize();
    }

    @Override // org.bouncycastle.crypto.ec.ECDecryptor
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ECPrivateKeyParameters)) {
            throw new IllegalArgumentException("ECPrivateKeyParameters are required for decryption.");
        }
        this.f88230a = (ECPrivateKeyParameters) cipherParameters;
    }
}
