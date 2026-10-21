package org.bouncycastle.crypto.macs;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes4.dex */
public class KGMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KGCMBlockCipher f88887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88888b;

    public KGMac(KGCMBlockCipher kGCMBlockCipher) {
        this.f88887a = kGCMBlockCipher;
        this.f88888b = kGCMBlockCipher.getUnderlyingCipher().getBlockSize() * 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        try {
            return this.f88887a.doFinal(bArr, i10);
        } catch (InvalidCipherTextException e5) {
            throw new IllegalStateException(e5.toString());
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.f88887a.getUnderlyingCipher().getAlgorithmName() + "-KGMAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88888b / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IOException, IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("KGMAC requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.f88887a.init(true, new AEADParameters((KeyParameter) parametersWithIV.getParameters(), this.f88888b, parametersWithIV.getIV()));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() throws IOException {
        this.f88887a.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException, IOException {
        this.f88887a.processAADByte(b10);
    }

    public KGMac(KGCMBlockCipher kGCMBlockCipher, int i10) {
        this.f88887a = kGCMBlockCipher;
        this.f88888b = i10;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException, IOException {
        this.f88887a.processAADBytes(bArr, i10, i11);
    }
}
