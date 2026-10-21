package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class axr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54101b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54102c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f54103a = new ByteArrayOutputStream();

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException {
        axr axrVar;
        int i13;
        ByteArrayOutputStream byteArrayOutputStream;
        axr axrVar2;
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = (((~((~i12) | i15)) | i14 | i16) * 398) + ((i10 | i11) * (-1194)) + ((i14 | i16 | (~(i15 | i12))) * 398) + (i11 * 399) + (i10 * 399);
        int i18 = 0;
        switch (i17) {
            case 1:
                axrVar = (axr) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i19 = f54102c;
                int i20 = i19 ^ 103;
                int i21 = -(-((i19 & 103) << 1));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f54101b = i22 % 128;
                int i23 = i22 % 2;
                try {
                    axrVar.f54103a.write(bArr);
                    int i24 = f54102c;
                    int i25 = i24 + 85;
                    f54101b = i25 % 128;
                    int i26 = i25 % 2;
                    int i27 = i24 & 101;
                    int i28 = -(-((i24 ^ 101) | i27));
                    int i29 = (i27 & i28) + (i27 | i28);
                    f54101b = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = (((i24 | 2) << 1) - (i24 ^ 2)) - 1;
                    f54101b = i31 % 128;
                    if (i31 % 2 != 0) {
                        throw null;
                    }
                    return axrVar;
                } catch (Exception e5) {
                    throw new RuntimeException(e5.getMessage(), e5);
                }
            case 2:
                axrVar = (axr) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i32 = f54101b;
                int i33 = i32 & 59;
                int i34 = (i32 ^ 59) | i33;
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                f54102c = i35 % 128;
                int i36 = i35 % 2;
                axrVar.f54103a.write((byte) (iIntValue >>> 24));
                ByteArrayOutputStream byteArrayOutputStream2 = axrVar.f54103a;
                byteArrayOutputStream2.write((byte) (iIntValue >>> 16));
                byteArrayOutputStream2.write((byte) (iIntValue >>> 8));
                byteArrayOutputStream2.write((byte) iIntValue);
                int i37 = f54102c;
                int i38 = i37 & 59;
                int i39 = -(-((i37 ^ 59) | i38));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                f54101b = i40 % 128;
                if (i40 % 2 != 0) {
                    int i41 = 21 / 0;
                }
                return axrVar;
            case 3:
                axrVar = (axr) objArr[0];
                byte[][] bArr2 = (byte[][]) objArr[1];
                int i42 = f54101b;
                int i43 = (-2) - ((i42 + 80) ^ (-1));
                f54102c = i43 % 128;
                int i44 = i43 % 2;
                try {
                    int length = bArr2.length;
                    int i45 = (((i42 | 110) << 1) - (i42 ^ 110)) - 1;
                    while (true) {
                        f54102c = i45 % 128;
                        int i46 = i45 % 2;
                        if (i18 >= length) {
                            int i47 = f54102c;
                            int i48 = i47 & 121;
                            int i49 = -(-((i47 ^ 121) | i48));
                            int i50 = (i48 & i49) + (i48 | i49);
                            f54101b = i50 % 128;
                            int i51 = i50 % 2;
                            int i52 = i47 & 103;
                            int i53 = (((i47 | 103) & (~i52)) - (~(-(-(i52 << 1))))) - 1;
                            f54101b = i53 % 128;
                            int i54 = i53 % 2;
                            return axrVar;
                        }
                        int i55 = f54101b;
                        int i56 = (i55 ^ 25) + ((i55 & 25) << 1);
                        f54102c = i56 % 128;
                        int i57 = i56 % 2;
                        axrVar.f54103a.write(bArr2[i18]);
                        int i58 = i18 & 1;
                        int i59 = -(-(i18 | 1));
                        i18 = (i58 & i59) + (i58 | i59);
                        int i60 = f54101b;
                        i45 = (((i60 ^ 59) | (i60 & 59)) << 1) - (((~i60) & 59) | (i60 & (-60)));
                    }
                } catch (Exception e7) {
                    throw new RuntimeException(e7.getMessage(), e7);
                }
                break;
            case 4:
                axr axrVar3 = (axr) objArr[0];
                int i61 = f54102c;
                int i62 = i61 & 61;
                int i63 = ((i61 ^ 61) | i62) << 1;
                int i64 = -((i61 | 61) & (~i62));
                int i65 = (i63 & i64) + (i64 | i63);
                f54101b = i65 % 128;
                int i66 = i65 % 2;
                ByteArrayOutputStream byteArrayOutputStream3 = axrVar3.f54103a;
                if (i66 != 0) {
                    byteArrayOutputStream3.write(19);
                    byteArrayOutputStream = axrVar3.f54103a;
                    i13 = 85;
                } else {
                    i13 = -128;
                    byteArrayOutputStream3.write(-128);
                    byteArrayOutputStream = axrVar3.f54103a;
                }
                byteArrayOutputStream.write(i13);
                int i67 = f54102c;
                int i68 = i67 & 71;
                int i69 = i68 + ((i67 ^ 71) | i68);
                f54101b = i69 % 128;
                int i70 = i69 % 2;
                return axrVar3;
            case 5:
                axrVar2 = (axr) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i71 = f54101b;
                int i72 = i71 & 123;
                int i73 = (i72 - (~((i71 ^ 123) | i72))) - 1;
                f54102c = i73 % 128;
                int i74 = i73 % 2;
                int i75 = (int) (jLongValue >>> 32);
                int i76 = (int) jLongValue;
                int i77 = f54102c + 41;
                f54101b = i77 % 128;
                int i78 = i77 % 2;
                return axrVar2;
            case 6:
                axrVar2 = (axr) objArr[0];
                ben benVar = (ben) objArr[1];
                int i79 = f54102c;
                int i80 = i79 ^ 21;
                int i81 = ((i79 & 21) | i80) << 1;
                int i82 = -i80;
                int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
                f54101b = i83 % 128;
                try {
                    if (i83 % 2 != 0) {
                        axrVar2.f54103a.write(benVar.setAlwaysDrawnWithCacheEnabled());
                        int i84 = 41 / 0;
                        break;
                    } else {
                        axrVar2.f54103a.write(benVar.setAlwaysDrawnWithCacheEnabled());
                    }
                    int i85 = f54102c;
                    int i86 = ((i85 & (-26)) | ((~i85) & 25)) + ((i85 & 25) << 1);
                    int i87 = i86 % 128;
                    f54101b = i87;
                    int i88 = i86 % 2;
                    int i89 = i87 & 75;
                    int i90 = (i89 - (~((i87 ^ 75) | i89))) - 1;
                    f54102c = i90 % 128;
                    if (i90 % 2 == 0) {
                        throw null;
                    }
                    return axrVar2;
                } catch (Exception e10) {
                    throw new RuntimeException(e10.getMessage(), e10);
                }
            case 7:
                axrVar = (axr) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                while (axrVar.f54103a.size() < iIntValue2) {
                    int i91 = f54102c;
                    int i92 = ((-1) << 1) - ((((i91 | 100) << 1) - (i91 ^ 100)) ^ (-1));
                    f54101b = i92 % 128;
                    int i93 = i92 % 2;
                    axrVar.f54103a.write(0);
                    int i94 = f54102c;
                    int i95 = i94 & 1;
                    int i96 = (i94 ^ 1) | i95;
                    int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                    f54101b = i97 % 128;
                    int i98 = i97 % 2;
                }
                int i99 = f54101b;
                int i100 = i99 & 21;
                int i101 = (i99 | 21) & (~i100);
                int i102 = i100 << 1;
                int i103 = (i101 & i102) + (i101 | i102);
                f54102c = i103 % 128;
                int i104 = i103 % 2;
                return axrVar;
            case 8:
                axr axrVar4 = (axr) objArr[0];
                int i105 = f54102c;
                int i106 = (((i105 | 33) << 1) - (~(-(((~i105) & 33) | (i105 & (-34)))))) - 1;
                f54101b = i106 % 128;
                int i107 = i106 % 2;
                ByteArrayOutputStream byteArrayOutputStream4 = axrVar4.f54103a;
                if (i107 == 0) {
                    return byteArrayOutputStream4.toByteArray();
                }
                byteArrayOutputStream4.toByteArray();
                throw null;
            case 9:
                axrVar = (axr) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i108 = f54101b;
                int i109 = i108 & 125;
                int i110 = (i108 | 125) & (~i109);
                int i111 = i109 << 1;
                int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                int i113 = i112 % 128;
                f54102c = i113;
                int i114 = i112 % 2;
                ByteArrayOutputStream byteArrayOutputStream5 = axrVar.f54103a;
                if (zBooleanValue) {
                    int i115 = i113 | 119;
                    int i116 = ((i115 << 1) - (~(-(i115 & (~(i113 & 119)))))) - 1;
                    f54101b = i116 % 128;
                    int i117 = i116 % 2;
                    int i118 = i113 ^ 37;
                    int i119 = ((i113 & 37) | i118) << 1;
                    int i120 = -i118;
                    int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                    f54101b = i121 % 128;
                    int i122 = i121 % 2;
                    i18 = 1;
                } else {
                    int i123 = i113 & 7;
                    int i124 = -(-(i113 | 7));
                    int i125 = (i123 & i124) + (i123 | i124);
                    f54101b = i125 % 128;
                    int i126 = i125 % 2;
                }
                byteArrayOutputStream5.write(i18);
                int i127 = f54101b;
                int i128 = (i127 & (-34)) | ((~i127) & 33);
                int i129 = -(-((i127 & 33) << 1));
                int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
                f54102c = i130 % 128;
                if (i130 % 2 == 0) {
                    throw null;
                }
                return axrVar;
            default:
                axr axrVar5 = new axr();
                int i131 = f54102c;
                int i132 = (i131 & (-10)) | ((~i131) & 9);
                int i133 = -(-((i131 & 9) << 1));
                int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                f54101b = i134 % 128;
                int i135 = i134 % 2;
                return axrVar5;
        }
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1746305515, -1746305507, System.identityHashCode(this));
    }

    public final axr setX(byte[] bArr) {
        return (axr) setDividerPadding(new Object[]{this, bArr}, 195178378, -195178377, System.identityHashCode(this));
    }

    public final axr setY(boolean z10) {
        return (axr) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -1747446463, 1747446472, System.identityHashCode(this));
    }

    public final axr setX(int i10) {
        return (axr) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 1810000667, -1810000665, i10);
    }

    public final axr setY() {
        return (axr) setDividerPadding(new Object[]{this}, 1477622592, -1477622588, System.identityHashCode(this));
    }

    public final axr setY(long j10) {
        return (axr) setDividerPadding(new Object[]{this, Long.valueOf(j10)}, -1219503627, 1219503632, System.identityHashCode(this));
    }

    public final axr setDividerPadding(int i10) {
        return (axr) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -140131631, 140131638, i10);
    }

    public final axr setDividerPadding(byte[][] bArr) {
        return (axr) setDividerPadding(new Object[]{this, bArr}, -1560552200, 1560552203, System.identityHashCode(this));
    }

    public final axr setDividerPadding(ben benVar) {
        return (axr) setDividerPadding(new Object[]{this, benVar}, -1986608045, 1986608051, System.identityHashCode(this));
    }

    public static axr setDividerPadding() {
        return (axr) setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis());
    }
}
