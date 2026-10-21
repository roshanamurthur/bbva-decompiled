package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.DHUPrivateParameters;
import org.bouncycastle.crypto.params.DHUPublicParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes2.dex */
public class DHUnifiedAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DHUPrivateParameters f87881a;

    public byte[] calculateAgreement(CipherParameters cipherParameters) {
        DHUPublicParameters dHUPublicParameters = (DHUPublicParameters) cipherParameters;
        DHBasicAgreement dHBasicAgreement = new DHBasicAgreement();
        DHBasicAgreement dHBasicAgreement2 = new DHBasicAgreement();
        dHBasicAgreement.init(this.f87881a.getStaticPrivateKey());
        BigInteger bigIntegerCalculateAgreement = dHBasicAgreement.calculateAgreement(dHUPublicParameters.getStaticPublicKey());
        dHBasicAgreement2.init(this.f87881a.getEphemeralPrivateKey());
        return Arrays.concatenate(BigIntegers.asUnsignedByteArray(getFieldSize(), dHBasicAgreement2.calculateAgreement(dHUPublicParameters.getEphemeralPublicKey())), BigIntegers.asUnsignedByteArray(getFieldSize(), bigIntegerCalculateAgreement));
    }

    public int getFieldSize() {
        return (this.f87881a.getStaticPrivateKey().getParameters().getP().bitLength() + 7) / 8;
    }

    public void init(CipherParameters cipherParameters) {
        this.f87881a = (DHUPrivateParameters) cipherParameters;
    }
}
