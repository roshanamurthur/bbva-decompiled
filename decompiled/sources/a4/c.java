package a4;

import com.google.android.material.internal.ViewUtils;
import com.google.android.play.core.splitinstall.internal.zzar;
import java.io.File;
import org.bouncycastle.util.Arrays;

/* JADX INFO: compiled from: JsonScope.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements zzar {
    public static int a(int i10, int i11, int i12, int[] iArr) {
        int i13 = (i12 * 2730) >> 25;
        int i14 = i13 - ((12288 - (i12 - (i13 * 12289))) >> 31);
        iArr[i10] = (i14 >> 1) + (i14 & 1);
        int i15 = i14 - 1;
        iArr[i11] = (i15 >> 1) + (i15 & 1);
        int i16 = i12 - (iArr[i10] * 24578);
        int i17 = i16 >> 31;
        return (i16 ^ i17) - i17;
    }

    public static int b(int i10) {
        int i11 = (i10 * 2730) >> 27;
        int i12 = i11 - ((49155 - (i10 - (49156 * i11))) >> 31);
        int i13 = (((i12 >> 1) + (i12 & 1)) * 98312) - i10;
        int i14 = i13 >> 31;
        return (i13 ^ i14) - i14;
    }

    public static void c(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = (sArr[i10] * 8) + 196624;
            int i12 = sArr2[i10] * 2;
            int i13 = i10 + ViewUtils.EDGE_TO_EDGE_FLAGS;
            short s4 = sArr2[i13];
            int i14 = i11 - ((i12 + s4) * 12289);
            int i15 = i10 + 256;
            int i16 = ((sArr[i15] * 8) + 196624) - (((sArr2[i15] * 2) + s4) * 12289);
            int i17 = i10 + 512;
            int i18 = ((sArr[i17] * 8) + 196624) - (((sArr2[i17] * 2) + s4) * 12289);
            int i19 = ((sArr[i13] * 8) + 196624) - (s4 * 12289);
            int i20 = i10 >>> 3;
            bArr[i20] = (byte) ((((short) (((b(i19) + (b(i18) + (b(i16) + b(i14)))) - 98312) >>> 31)) << (i10 & 7)) | bArr[i20]);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzar
    public boolean zza(Object obj, File file, File file2) {
        return true;
    }
}
