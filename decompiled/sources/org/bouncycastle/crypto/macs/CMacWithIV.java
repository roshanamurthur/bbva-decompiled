package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes4.dex */
public class CMacWithIV extends CMac {
    public CMacWithIV(BlockCipher blockCipher) {
        super(blockCipher);
    }

    public CMacWithIV(BlockCipher blockCipher, int i10) {
        super(blockCipher, i10);
    }

    @Override // org.bouncycastle.crypto.macs.CMac
    public final void b(CipherParameters cipherParameters) {
    }
}
