package org.bouncycastle.pqc.crypto.sphincs;

import com.google.android.play.core.splitinstall.internal.i;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f91264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f91265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f91266c;
    }

    public static void a(xm.a aVar, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int i13;
        int i14 = 67;
        for (int i15 = 0; i15 < 7; i15++) {
            int i16 = 0;
            while (true) {
                i13 = i14 >>> 1;
                if (i16 >= i13) {
                    break;
                }
                aVar.a(bArr2, (i16 * 32) + i11, bArr2, (i16 * 64) + i11, bArr3, (i15 * 64) + i12);
                i16++;
            }
            if ((i14 & 1) != 0) {
                System.arraycopy(bArr2, ((i14 - 1) * 32) + i11, bArr2, (i13 * 32) + i11, 32);
                i13++;
            }
            i14 = i13;
        }
        System.arraycopy(bArr2, i11, bArr, i10, 32);
    }

    public static void b(xm.a aVar, byte[] bArr, int i10, byte[] bArr2, a aVar2, byte[] bArr3, int i11) {
        int i12 = aVar2.f91264a;
        long j10 = aVar2.f91265b;
        long j11 = aVar2.f91266c;
        byte[] bArr4 = new byte[192];
        int[] iArr = new int[6];
        int i13 = (int) (((long) 32) + j11);
        int i14 = 0;
        int i15 = 0;
        while (j11 < i13) {
            int i16 = i15 * 32;
            byte[] bArr5 = new byte[32];
            byte[] bArr6 = new byte[2144];
            byte[] bArr7 = new byte[40];
            for (int i17 = i14; i17 < 32; i17++) {
                bArr7[i17] = bArr2[i17];
            }
            Pack.longToLittleEndian(((long) i12) | (j10 << 4) | (j11 << 59), bArr7, 32);
            Digest digest = aVar.f94683a;
            digest.update(bArr7, i14, 40);
            digest.doFinal(bArr5, i14);
            i.a(bArr6, i14, i14, bArr5);
            for (int i18 = i14; i18 < 67; i18++) {
                int i19 = i18 * 32;
                i.b(aVar, bArr6, i19, bArr6, i19, bArr3, i11, 15);
            }
            int i20 = i14;
            a(aVar, bArr4, i16, bArr6, 0, bArr3, i11);
            iArr[i15] = i20;
            int i21 = i15 + 1;
            while (i21 > 1) {
                int i22 = iArr[i21 - 1];
                int i23 = i21 - 2;
                if (i22 != iArr[i23]) {
                    break;
                }
                int i24 = i23 * 32;
                aVar.a(bArr4, i24, bArr4, i24, bArr3, i11 + ((i22 + 7) * 64));
                iArr[i23] = iArr[i23] + 1;
                i21--;
            }
            int i25 = i21;
            j11++;
            i14 = i20;
            i15 = i25;
        }
        while (i14 < 32) {
            bArr[i10 + i14] = bArr4[i14];
            i14++;
        }
    }
}
