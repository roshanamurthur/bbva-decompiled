package org.bouncycastle.crypto.modes.gcm;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Tables8kGCMMultiplier implements GCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f89172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[][][] f89173b;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f89173b == null) {
            this.f89173b = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, 32, 16, 2);
        } else if (Arrays.areEqual(this.f89172a, bArr)) {
            return;
        }
        this.f89172a = Arrays.clone(bArr);
        for (int i10 = 0; i10 < 32; i10++) {
            long[][][] jArr = this.f89173b;
            long[][] jArr2 = jArr[i10];
            if (i10 == 0) {
                GCMUtil.asLongs(this.f89172a, jArr2[1]);
                long[] jArr3 = jArr2[1];
                GCMUtil.multiplyP3(jArr3, jArr3);
            } else {
                GCMUtil.multiplyP4(jArr[i10 - 1][1], jArr2[1]);
            }
            for (int i11 = 2; i11 < 16; i11 += 2) {
                GCMUtil.divideP(jArr2[i11 >> 1], jArr2[i11]);
                GCMUtil.xor(jArr2[i11], jArr2[1], jArr2[i11 + 1]);
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 15; i10 >= 0; i10--) {
            long[][][] jArr = this.f89173b;
            int i11 = i10 + i10;
            long[][] jArr2 = jArr[i11 + 1];
            byte b10 = bArr[i10];
            long[] jArr3 = jArr2[b10 & 15];
            long[] jArr4 = jArr[i11][(b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 4];
            j10 ^= jArr3[0] ^ jArr4[0];
            j11 ^= jArr4[1] ^ jArr3[1];
        }
        Pack.longToBigEndian(j10, bArr, 0);
        Pack.longToBigEndian(j11, bArr, 8);
    }
}
