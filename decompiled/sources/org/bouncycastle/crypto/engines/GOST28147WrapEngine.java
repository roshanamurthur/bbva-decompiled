package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GOST28147WrapEngine implements Wrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GOST28147Engine f88430a = new GOST28147Engine();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GOST28147Mac f88431b = new GOST28147Mac();

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "GOST28147Wrap";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        ParametersWithUKM parametersWithUKM = (ParametersWithUKM) cipherParameters;
        this.f88430a.init(z10, parametersWithUKM.getParameters());
        this.f88431b.init(new ParametersWithIV(parametersWithUKM.getParameters(), parametersWithUKM.getUKM()));
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        GOST28147Mac gOST28147Mac = this.f88431b;
        int macSize = i11 - gOST28147Mac.getMacSize();
        byte[] bArr2 = new byte[macSize];
        GOST28147Engine gOST28147Engine = this.f88430a;
        gOST28147Engine.processBlock(bArr, i10, bArr2, 0);
        gOST28147Engine.processBlock(bArr, i10 + 8, bArr2, 8);
        gOST28147Engine.processBlock(bArr, i10 + 16, bArr2, 16);
        gOST28147Engine.processBlock(bArr, i10 + 24, bArr2, 24);
        byte[] bArr3 = new byte[gOST28147Mac.getMacSize()];
        gOST28147Mac.update(bArr2, 0, macSize);
        gOST28147Mac.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[gOST28147Mac.getMacSize()];
        System.arraycopy(bArr, (i10 + i11) - 4, bArr4, 0, gOST28147Mac.getMacSize());
        if (Arrays.constantTimeAreEqual(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        GOST28147Mac gOST28147Mac = this.f88431b;
        gOST28147Mac.update(bArr, i10, i11);
        byte[] bArr2 = new byte[gOST28147Mac.getMacSize() + i11];
        GOST28147Engine gOST28147Engine = this.f88430a;
        gOST28147Engine.processBlock(bArr, i10, bArr2, 0);
        gOST28147Engine.processBlock(bArr, i10 + 8, bArr2, 8);
        gOST28147Engine.processBlock(bArr, i10 + 16, bArr2, 16);
        gOST28147Engine.processBlock(bArr, i10 + 24, bArr2, 24);
        gOST28147Mac.doFinal(bArr2, i11);
        return bArr2;
    }
}
