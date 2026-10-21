package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class CryptoProWrapEngine extends GOST28147WrapEngine {
    @Override // org.bouncycastle.crypto.engines.GOST28147WrapEngine, org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        KeyParameter keyParameter;
        byte[] sBox;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        ParametersWithUKM parametersWithUKM = (ParametersWithUKM) cipherParameters;
        if (parametersWithUKM.getParameters() instanceof ParametersWithSBox) {
            keyParameter = (KeyParameter) ((ParametersWithSBox) parametersWithUKM.getParameters()).getParameters();
            sBox = ((ParametersWithSBox) parametersWithUKM.getParameters()).getSBox();
        } else {
            keyParameter = (KeyParameter) parametersWithUKM.getParameters();
            sBox = null;
        }
        byte[] key = keyParameter.getKey();
        byte[] ukm = parametersWithUKM.getUKM();
        for (int i10 = 0; i10 != 8; i10++) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 != 8; i13++) {
                int iLittleEndianToInt = Pack.littleEndianToInt(key, i13 * 4);
                if (((1 << i13) & ukm[i10]) != 0) {
                    i11 += iLittleEndianToInt;
                } else {
                    i12 += iLittleEndianToInt;
                }
            }
            byte[] bArr = new byte[8];
            Pack.intToLittleEndian(i11, bArr, 0);
            Pack.intToLittleEndian(i12, bArr, 4);
            GCFBBlockCipher gCFBBlockCipher = new GCFBBlockCipher(new GOST28147Engine());
            gCFBBlockCipher.init(true, new ParametersWithIV(new ParametersWithSBox(new KeyParameter(key), sBox), bArr));
            gCFBBlockCipher.processBlock(key, 0, key, 0);
            gCFBBlockCipher.processBlock(key, 8, key, 8);
            gCFBBlockCipher.processBlock(key, 16, key, 16);
            gCFBBlockCipher.processBlock(key, 24, key, 24);
        }
        KeyParameter keyParameter2 = new KeyParameter(key);
        super.init(z10, sBox != null ? new ParametersWithUKM(new ParametersWithSBox(keyParameter2, sBox), parametersWithUKM.getUKM()) : new ParametersWithUKM(keyParameter2, parametersWithUKM.getUKM()));
    }
}
