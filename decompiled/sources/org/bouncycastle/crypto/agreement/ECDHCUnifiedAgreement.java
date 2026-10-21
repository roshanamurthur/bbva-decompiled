package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDHUPrivateParameters;
import org.bouncycastle.crypto.params.ECDHUPublicParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes2.dex */
public class ECDHCUnifiedAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECDHUPrivateParameters f87885a;

    public byte[] calculateAgreement(CipherParameters cipherParameters) {
        ECDHUPublicParameters eCDHUPublicParameters = (ECDHUPublicParameters) cipherParameters;
        ECDHCBasicAgreement eCDHCBasicAgreement = new ECDHCBasicAgreement();
        ECDHCBasicAgreement eCDHCBasicAgreement2 = new ECDHCBasicAgreement();
        eCDHCBasicAgreement.init(this.f87885a.getStaticPrivateKey());
        BigInteger bigIntegerCalculateAgreement = eCDHCBasicAgreement.calculateAgreement(eCDHUPublicParameters.getStaticPublicKey());
        eCDHCBasicAgreement2.init(this.f87885a.getEphemeralPrivateKey());
        return Arrays.concatenate(BigIntegers.asUnsignedByteArray(getFieldSize(), eCDHCBasicAgreement2.calculateAgreement(eCDHUPublicParameters.getEphemeralPublicKey())), BigIntegers.asUnsignedByteArray(getFieldSize(), bigIntegerCalculateAgreement));
    }

    public int getFieldSize() {
        return (this.f87885a.getStaticPrivateKey().getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    public void init(CipherParameters cipherParameters) {
        this.f87885a = (ECDHUPrivateParameters) cipherParameters;
    }
}
