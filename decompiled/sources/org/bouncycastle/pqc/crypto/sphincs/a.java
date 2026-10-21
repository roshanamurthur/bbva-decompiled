package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static void a(xm.a aVar, byte[] bArr, byte[] bArr2, b.a aVar2) {
        byte[] bArr3 = new byte[40];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr3[i10] = bArr2[i10];
        }
        Pack.longToLittleEndian((aVar2.f91266c << 59) | ((long) aVar2.f91264a) | (aVar2.f91265b << 4), bArr3, 32);
        Digest digest = aVar.f94683a;
        digest.update(bArr3, 0, 40);
        digest.doFinal(bArr, 0);
    }

    public static void b(byte[] bArr, int i10, long j10, byte[] bArr2, int i11) {
        ChaChaEngine chaChaEngine = new ChaChaEngine(12);
        chaChaEngine.init(true, new ParametersWithIV(new KeyParameter(bArr2, i11, 32), new byte[8]));
        chaChaEngine.processBytes(bArr, i10, (int) j10, bArr, i10);
    }
}
