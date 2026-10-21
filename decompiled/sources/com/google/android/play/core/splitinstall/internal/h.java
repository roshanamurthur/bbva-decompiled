package com.google.android.play.core.splitinstall.internal;

import androidx.core.view.InputDeviceCompat;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.io.File;
import java.util.Set;
import org.bouncycastle.util.Pack;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements zzan, bh.c {
    public static int b(ByteMatrix byteMatrix, boolean z10) {
        int height = z10 ? byteMatrix.getHeight() : byteMatrix.getWidth();
        int width = z10 ? byteMatrix.getWidth() : byteMatrix.getHeight();
        byte[][] array = byteMatrix.getArray();
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11++) {
            byte b10 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < width; i13++) {
                byte b11 = z10 ? array[i11][i13] : array[i13][i11];
                if (b11 == b10) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += i12 - 2;
                    }
                    i12 = 1;
                    b10 = b11;
                }
            }
            if (i12 >= 5) {
                i10 = (i12 - 2) + i10;
            }
        }
        return i10;
    }

    public static void c(byte[] bArr, byte[] bArr2) {
        int i10 = 16;
        int[] iArr = new int[16];
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            iArr[i12] = Pack.littleEndianToInt(bArr2, i12 * 4);
        }
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        int iD = iArr[4];
        int i17 = iArr[5];
        int iD2 = iArr[6];
        int i18 = 7;
        int iD3 = iArr[7];
        int i19 = iArr[8];
        int i20 = iArr[9];
        int i21 = iArr[10];
        int i22 = iArr[11];
        int iD4 = iArr[12];
        int iD5 = iArr[13];
        int iD6 = iArr[14];
        int iD7 = iArr[15];
        int i23 = 12;
        while (i23 > 0) {
            int i24 = i13 + iD;
            int iD8 = d(iD4 ^ i24, i10);
            int i25 = i19 + iD8;
            int iD9 = d(iD ^ i25, 12);
            int i26 = i24 + iD9;
            int iD10 = d(iD8 ^ i26, 8);
            int i27 = i25 + iD10;
            int iD11 = d(iD9 ^ i27, i18);
            int i28 = i14 + i17;
            int iD12 = d(iD5 ^ i28, i10);
            int i29 = i20 + iD12;
            int iD13 = d(i17 ^ i29, 12);
            int i30 = i28 + iD13;
            int iD14 = d(iD12 ^ i30, 8);
            int i31 = i29 + iD14;
            int iD15 = d(iD13 ^ i31, i18);
            int i32 = i15 + iD2;
            int iD16 = d(iD6 ^ i32, i10);
            int i33 = i21 + iD16;
            int iD17 = d(iD2 ^ i33, 12);
            int i34 = i32 + iD17;
            int iD18 = d(iD16 ^ i34, 8);
            int i35 = i33 + iD18;
            int iD19 = d(iD17 ^ i35, i18);
            int i36 = i16 + iD3;
            int iD20 = d(iD7 ^ i36, i10);
            int i37 = i22 + iD20;
            int iD21 = d(iD3 ^ i37, 12);
            int i38 = i36 + iD21;
            int iD22 = d(iD20 ^ i38, 8);
            int i39 = i37 + iD22;
            int iD23 = d(iD21 ^ i39, i18);
            int i40 = i26 + iD15;
            int iD24 = d(iD22 ^ i40, 16);
            int i41 = i35 + iD24;
            int iD25 = d(iD15 ^ i41, 12);
            i13 = i40 + iD25;
            iD7 = d(iD24 ^ i13, 8);
            i21 = i41 + iD7;
            int iD26 = d(iD25 ^ i21, 7);
            int i42 = i30 + iD19;
            int iD27 = d(iD10 ^ i42, 16);
            int i43 = i39 + iD27;
            int iD28 = d(iD19 ^ i43, 12);
            i14 = i42 + iD28;
            iD4 = d(iD27 ^ i14, 8);
            i22 = i43 + iD4;
            iD2 = d(iD28 ^ i22, 7);
            int i44 = i34 + iD23;
            int iD29 = d(iD14 ^ i44, 16);
            int i45 = i27 + iD29;
            int iD30 = d(iD23 ^ i45, 12);
            i15 = i44 + iD30;
            iD5 = d(iD29 ^ i15, 8);
            i19 = i45 + iD5;
            iD3 = d(iD30 ^ i19, 7);
            int i46 = i38 + iD11;
            int iD31 = d(iD18 ^ i46, 16);
            int i47 = i31 + iD31;
            int iD32 = d(iD11 ^ i47, 12);
            i16 = i46 + iD32;
            iD6 = d(iD31 ^ i16, 8);
            i20 = i47 + iD6;
            iD = d(iD32 ^ i20, 7);
            i23 -= 2;
            i17 = iD26;
            i18 = 7;
            i10 = 16;
            i11 = 0;
        }
        int i48 = i11;
        iArr[i48] = i13;
        iArr[1] = i14;
        iArr[2] = i15;
        iArr[3] = i16;
        iArr[4] = iD;
        iArr[5] = i17;
        iArr[6] = iD2;
        iArr[i18] = iD3;
        iArr[8] = i19;
        iArr[9] = i20;
        iArr[10] = i21;
        iArr[11] = i22;
        iArr[12] = iD4;
        iArr[13] = iD5;
        iArr[14] = iD6;
        iArr[15] = iD7;
        for (int i49 = i48; i49 < 16; i49++) {
            Pack.intToLittleEndian(iArr[i49], bArr, i49 * 4);
        }
    }

    public static int d(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    @Override // bh.c
    public void a(bh.d dVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (dVar.b()) {
            sb2.append(dVar.a());
            int i10 = dVar.f25221f + 1;
            dVar.f25221f = i10;
            if (HighLevelEncoder.f(dVar.f25216a, i10, 5) != 5) {
                dVar.f25222g = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        StringBuilder sb3 = dVar.f25220e;
        int length2 = sb3.length() + length + 1;
        dVar.c(length2);
        boolean z10 = dVar.f25223h.getDataCapacity() - length2 > 0;
        if (dVar.b() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb2.length();
        for (int i11 = 0; i11 < length3; i11++) {
            int length4 = (((sb3.length() + 1) * 149) % 255) + 1 + sb2.charAt(i11);
            if (length4 > 255) {
                length4 += InputDeviceCompat.SOURCE_ANY;
            }
            dVar.d((char) length4);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public void zza(ClassLoader classLoader, Set set) {
        af.d.b(classLoader, set, new af.c());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public boolean zzb(ClassLoader classLoader, File file, File file2, boolean z10) {
        return f.a(classLoader, file, file2, z10, new af.b(), "zip", new af.a());
    }
}
