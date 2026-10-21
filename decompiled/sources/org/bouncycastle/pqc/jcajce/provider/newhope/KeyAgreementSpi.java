package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.ShortBufferException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.pqc.crypto.ExchangePair;
import org.bouncycastle.pqc.crypto.newhope.NHAgreement;
import org.bouncycastle.pqc.crypto.newhope.NHExchangePairGenerator;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NHAgreement f91471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NHExchangePairGenerator f91472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f91473g;

    public KeyAgreementSpi() {
        super("NH", null);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return engineGenerateSecret();
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z10) throws IllegalStateException, InvalidKeyException {
        if (!z10) {
            throw new IllegalStateException("NewHope can only be between two parties.");
        }
        BCNHPublicKey bCNHPublicKey = (BCNHPublicKey) key;
        NHExchangePairGenerator nHExchangePairGenerator = this.f91472f;
        if (nHExchangePairGenerator == null) {
            this.f91473g = this.f91471e.calculateAgreement(bCNHPublicKey.f91470p0);
            return null;
        }
        ExchangePair exchangePairGenerateExchange = nHExchangePairGenerator.generateExchange(bCNHPublicKey.f91470p0);
        this.f91473g = exchangePairGenerateExchange.getSharedValue();
        return new BCNHPublicKey((NHPublicKeyParameters) exchangePairGenerateExchange.getPublicKey());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i10) throws IllegalStateException, ShortBufferException {
        byte[] bArr2 = this.f91473g;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        Arrays.fill(this.f91473g, (byte) 0);
        return this.f91473g.length;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key == null) {
            this.f91472f = new NHExchangePairGenerator(secureRandom);
            return;
        }
        NHAgreement nHAgreement = new NHAgreement();
        this.f91471e = nHAgreement;
        nHAgreement.init(((BCNHPrivateKey) key).f91468p0);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        byte[] bArrClone = Arrays.clone(this.f91473g);
        Arrays.fill(this.f91473g, (byte) 0);
        return bArrClone;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("NewHope does not require parameters");
    }
}
