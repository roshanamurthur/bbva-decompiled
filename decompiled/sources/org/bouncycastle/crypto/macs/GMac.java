package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes4.dex */
public class GMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMBlockCipher f88860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88861b;

    public GMac(GCMBlockCipher gCMBlockCipher) {
        this.f88860a = gCMBlockCipher;
        this.f88861b = 128;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        try {
            return this.f88860a.doFinal(bArr, i10);
        } catch (InvalidCipherTextException e5) {
            throw new IllegalStateException(e5.toString());
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.f88860a.getUnderlyingCipher().getAlgorithmName() + "-GMAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88861b / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("GMAC requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.f88860a.init(true, new AEADParameters((KeyParameter) parametersWithIV.getParameters(), this.f88861b, parametersWithIV.getIV()));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.f88860a.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        this.f88860a.processAADByte(b10);
    }

    public GMac(GCMBlockCipher gCMBlockCipher, int i10) {
        this.f88860a = gCMBlockCipher;
        this.f88861b = i10;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        this.f88860a.processAADBytes(bArr, i10, i11);
    }
}
