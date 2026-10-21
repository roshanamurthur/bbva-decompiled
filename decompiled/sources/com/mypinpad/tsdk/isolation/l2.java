package com.mypinpad.tsdk.isolation;

import androidx.collection.ScatterMapKt;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[][] f56888a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 256);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f56889b = new byte[256];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56890c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56891d = 1;

    static {
        int i10 = 256;
        int i11 = f56891d;
        int i12 = i11 & 79;
        int i13 = (i11 ^ 79) | i12;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f56890c = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 1;
        long j10 = ScatterMapKt.BitmaskLsb;
        while (i16 <= 255) {
            int i17 = f56890c;
            int i18 = i17 & 11;
            int i19 = (i18 - (~((i17 ^ 11) | i18))) - 1;
            f56891d = i19 % 128;
            int i20 = i19 % 2;
            int i21 = (i17 & (-124)) | (123 & (~i17));
            int i22 = -(-((i17 & 123) << 1));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f56891d = i23 % 128;
            int i24 = i23 % 2;
            int i25 = 0;
            long j11 = 506097522914230528L;
            while (i25 < i10) {
                int i26 = f56890c;
                int i27 = (i26 ^ 41) + ((i26 & 41) << 1);
                f56891d = i27 % 128;
                if (i27 % 2 == 0) {
                    ber.setDividerPadding(new Object[]{Long.valueOf(((Long) a(new Object[]{Long.valueOf(j10), Long.valueOf(j11)}, -479580216, 479580223, (int) System.currentTimeMillis())).longValue()), f56888a[i16], Integer.valueOf(i25)}, -703671889, 703671896, i25);
                    j11 |= 578721382704613384L;
                    int i28 = ((((i25 ^ (-103)) | (i25 & (-103))) << 1) - (~(-((i25 & 102) | ((~i25) & (-103)))))) - 1;
                    int i29 = (i28 & (-124)) | (123 & (~i28));
                    int i30 = (i28 & 123) << 1;
                    i25 = (i29 ^ i30) + ((i30 & i29) << 1);
                } else {
                    ber.setDividerPadding(new Object[]{Long.valueOf(((Long) a(new Object[]{Long.valueOf(j10), Long.valueOf(j11)}, -479580216, 479580223, (int) System.currentTimeMillis())).longValue()), f56888a[i16], Integer.valueOf(i25)}, -703671889, 703671896, i25);
                    j11 += 578721382704613384L;
                    int i31 = ((i25 ^ (-27)) + ((i25 & (-27)) << 1)) - 1;
                    i25 = ((((i31 ^ 36) | (i31 & 36)) << 1) - (~(-(((~i31) & 36) | (i31 & (-37)))))) - 1;
                }
                i10 = 256;
            }
            j10 += ScatterMapKt.BitmaskLsb;
            int i32 = i16 ^ 1;
            i16 = (((i16 & 1) | i32) << 1) - i32;
            System.currentTimeMillis();
            System.currentTimeMillis();
            i10 = 256;
        }
        int i33 = f56891d;
        int i34 = i33 ^ 15;
        int i35 = (i33 & 15) << 1;
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        f56890c = i36 % 128;
        int i37 = i36 % 2;
        int i38 = 0;
        long j12 = 506097522914230528L;
        while (i38 < 256) {
            int i39 = f56891d;
            int i40 = i39 | 47;
            int i41 = (i40 << 1) - ((~(i39 & 47)) & i40);
            f56890c = i41 % 128;
            int i42 = i41 % 2;
            ber.setDividerPadding(new Object[]{Long.valueOf(((Long) a(new Object[]{Long.valueOf(j12)}, -2046377571, 2046377580, (int) System.currentTimeMillis())).longValue()), f56889b, Integer.valueOf(i38)}, -703671889, 703671896, i38);
            j12 += 578721382704613384L;
            i38 = (-2) - ((((i38 ^ 96) + ((i38 & 96) << 1)) - 87) ^ (-1));
            int i43 = f56891d + 121;
            f56890c = i43 % 128;
            int i44 = i43 % 2;
        }
        int i45 = f56891d;
        int i46 = (((i45 & (-52)) | ((~i45) & 51)) - (~((i45 & 51) << 1))) - 1;
        f56890c = i46 % 128;
        int i47 = i46 % 2;
    }

    public static /* synthetic */ Number a(Object[] objArr, int i10, int i11, int i12) {
        long j10;
        long j11;
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183));
        int i15 = ~i11;
        int i16 = ~i12;
        switch ((((~(i10 | i11)) | (~(i13 | i15)) | (~(i16 | i10))) * 184) + ((i10 | i15 | i16) * 184) + i14) {
            case 1:
                long jLongValue = ((Number) objArr[0]).longValue();
                int i17 = f56891d;
                int i18 = (i17 ^ 71) + ((i17 & 71) << 1);
                f56890c = i18 % 128;
                int i19 = i18 % 2;
                long jLongValue2 = ((Long) a(new Object[]{Long.valueOf(jLongValue)}, -619281155, 619281161, (int) System.currentTimeMillis())).longValue();
                long jLongValue3 = jLongValue2 ^ (((Long) a(new Object[]{Long.valueOf(jLongValue2 & (-3689348814741910324L))}, -1113107968, 1113107973, (int) System.currentTimeMillis())).longValue() >>> 2);
                int i20 = f56891d;
                int i21 = i20 & 45;
                int i22 = ((((i20 ^ 45) | i21) << 1) - (~(-((i20 | 45) & (~i21))))) - 1;
                f56890c = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 80 / 0;
                }
                return Long.valueOf(jLongValue3);
            case 2:
                short sShortValue = ((Short) objArr[0]).shortValue();
                short sShortValue2 = ((Short) objArr[1]).shortValue();
                int i24 = f56890c;
                int i25 = (i24 & (-14)) | ((~i24) & 13);
                int i26 = (i24 & 13) << 1;
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                int i28 = i27 % 128;
                f56891d = i28;
                int i29 = i27 % 2;
                short s4 = (short) ((sShortValue | sShortValue2) & (~(sShortValue & sShortValue2)));
                if (i29 == 0) {
                    int i30 = 0 / 0;
                }
                int i31 = ((i28 ^ 7) - (~((i28 & 7) << 1))) - 1;
                f56890c = i31 % 128;
                int i32 = i31 % 2;
                return Short.valueOf(s4);
            case 3:
                long jLongValue4 = ((Number) objArr[0]).longValue();
                int i33 = f56890c;
                int i34 = i33 & 101;
                int i35 = -(-((i33 ^ 101) | i34));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                f56891d = i36 % 128;
                int i37 = i36 % 2;
                long jLongValue5 = ((Long) a(new Object[]{Long.valueOf(jLongValue4)}, 701861100, -701861099, (int) System.currentTimeMillis())).longValue();
                long jLongValue6 = (((Long) a(new Object[]{Long.valueOf((-1085102592571150096L) & jLongValue5)}, 889029719, -889029719, (int) System.currentTimeMillis())).longValue() >>> 4) ^ jLongValue5;
                int i38 = f56891d;
                int i39 = i38 & 69;
                int i40 = (i39 - (~(-(-((i38 ^ 69) | i39))))) - 1;
                f56890c = i40 % 128;
                int i41 = i40 % 2;
                return Long.valueOf(jLongValue6);
            case 4:
                long jLongValue7 = ((Number) objArr[0]).longValue();
                long jLongValue8 = ((Number) objArr[1]).longValue();
                int i42 = f56891d;
                int i43 = (i42 & (-56)) | ((~i42) & 55);
                int i44 = -(-((i42 & 55) << 1));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                f56890c = i45 % 128;
                int i46 = i45 % 2;
                long jLongValue9 = ((Long) a(new Object[]{Long.valueOf(jLongValue7), Long.valueOf(jLongValue8)}, -1006783648, 1006783656, (int) System.currentTimeMillis())).longValue();
                long j12 = jLongValue9 & 3689348814741910323L;
                long jLongValue10 = (((Long) a(new Object[]{Long.valueOf((((jLongValue7 << 2) ^ jLongValue7) & (-3689348814741910324L)) ^ ((jLongValue9 & (-3689348814741910324L)) >>> 2)), Long.valueOf((((jLongValue8 << 2) ^ jLongValue8) & (-3689348814741910324L)) ^ 2459565876494606882L)}, -1006783648, 1006783656, (int) System.currentTimeMillis())).longValue() ^ (j12 << 2)) ^ j12;
                int i47 = (-2) - ((f56890c + 66) ^ (-1));
                f56891d = i47 % 128;
                if (i47 % 2 != 0) {
                    return Long.valueOf(jLongValue10);
                }
                throw null;
            case 5:
                long jLongValue11 = ((Number) objArr[0]).longValue();
                int i48 = f56890c;
                int i49 = ((i48 | 85) << 1) - (i48 ^ 85);
                int i50 = i49 % 128;
                f56891d = i50;
                if (i49 % 2 == 0) {
                    long j13 = jLongValue11 - 6148914691236517205L;
                    j10 = jLongValue11 - (-6148914691236517206L);
                    j11 = j13 + j10;
                } else {
                    long j14 = jLongValue11 & 6148914691236517205L;
                    j10 = jLongValue11 & (-6148914691236517206L);
                    j11 = (j14 << 1) ^ j10;
                }
                long j15 = (j10 >>> 1) ^ j11;
                int i51 = i50 & 47;
                int i52 = (i50 | 47) & (~i51);
                int i53 = i51 << 1;
                int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                f56890c = i54 % 128;
                if (i54 % 2 != 0) {
                    int i55 = 93 / 0;
                }
                return Long.valueOf(j15);
            case 6:
                long jLongValue12 = ((Number) objArr[0]).longValue();
                int i56 = f56890c;
                int i57 = i56 & 97;
                int i58 = ((((i56 ^ 97) | i57) << 1) - (~(-((i56 | 97) & (~i57))))) - 1;
                int i59 = i58 % 128;
                f56891d = i59;
                long j16 = i58 % 2 == 0 ? jLongValue12 * (((-6148914691236517206L) * jLongValue12) << 1) : jLongValue12 ^ ((jLongValue12 & (-6148914691236517206L)) >>> 1);
                int i60 = ((i59 | 41) << 1) - (i59 ^ 41);
                f56890c = i60 % 128;
                int i61 = i60 % 2;
                return Long.valueOf(j16);
            case 7:
                long jLongValue13 = ((Number) objArr[0]).longValue();
                long jLongValue14 = ((Number) objArr[1]).longValue();
                int i62 = f56890c;
                int i63 = i62 ^ 117;
                int i64 = (i62 & 117) << 1;
                int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                f56891d = i65 % 128;
                int i66 = i65 % 2;
                long jLongValue15 = ((Long) a(new Object[]{Long.valueOf(jLongValue13), Long.valueOf(jLongValue14)}, -280249563, 280249567, (int) System.currentTimeMillis())).longValue();
                long j17 = jLongValue15 & 1085102592571150095L;
                long jLongValue16 = (((Long) a(new Object[]{Long.valueOf((((jLongValue13 << 4) ^ jLongValue13) & (-1085102592571150096L)) ^ ((jLongValue15 & (-1085102592571150096L)) >>> 4)), Long.valueOf(((-1085102592571150096L) & (jLongValue14 ^ (jLongValue14 << 4))) ^ 578721382704613384L)}, -280249563, 280249567, (int) System.currentTimeMillis())).longValue() ^ (j17 << 4)) ^ j17;
                int i67 = f56891d;
                int i68 = (i67 & (-60)) | ((~i67) & 59);
                int i69 = -(-((i67 & 59) << 1));
                int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                f56890c = i70 % 128;
                if (i70 % 2 == 0) {
                    return Long.valueOf(jLongValue16);
                }
                throw null;
            case 8:
                long jLongValue17 = ((Number) objArr[0]).longValue();
                long jLongValue18 = ((Number) objArr[1]).longValue();
                int i71 = f56890c;
                int i72 = (i71 & (-44)) | ((~i71) & 43);
                int i73 = -(-((i71 & 43) << 1));
                int i74 = (i72 ^ i73) + ((i72 & i73) << 1);
                f56891d = i74 % 128;
                int i75 = i74 % 2;
                long j18 = (((jLongValue17 << 1) & jLongValue18) ^ ((jLongValue18 << 1) & jLongValue17)) & (-6148914691236517206L);
                long j19 = jLongValue17 & jLongValue18;
                long j20 = ((j19 & (-6148914691236517206L)) >>> 1) ^ (j19 ^ j18);
                int i76 = i71 ^ 117;
                int i77 = -(-((i71 & 117) << 1));
                int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                f56891d = i78 % 128;
                if (i78 % 2 == 0) {
                    int i79 = 47 / 0;
                }
                return Long.valueOf(j20);
            case 9:
                long jLongValue19 = ((Number) objArr[0]).longValue();
                int i80 = f56891d;
                int i81 = (i80 & 41) + (i80 | 41);
                f56890c = i81 % 128;
                int i82 = i81 % 2;
                long jLongValue20 = ((Long) a(new Object[]{Long.valueOf(jLongValue19)}, -418254867, 418254870, (int) System.currentTimeMillis())).longValue();
                long jLongValue21 = ((Long) a(new Object[]{Long.valueOf(jLongValue20)}, -418254867, 418254870, (int) System.currentTimeMillis())).longValue();
                long jLongValue22 = ((Long) a(new Object[]{Long.valueOf(((Long) a(new Object[]{Long.valueOf(jLongValue21), Long.valueOf(jLongValue20)}, -479580216, 479580223, (int) System.currentTimeMillis())).longValue()), Long.valueOf(((Long) a(new Object[]{Long.valueOf(jLongValue21)}, -418254867, 418254870, (int) System.currentTimeMillis())).longValue())}, -479580216, 479580223, (int) System.currentTimeMillis())).longValue();
                long jLongValue23 = ((Long) a(new Object[]{Long.valueOf(jLongValue20), Long.valueOf(((Long) a(new Object[]{Long.valueOf(((Long) a(new Object[]{Long.valueOf(((Long) a(new Object[]{Long.valueOf(((Long) a(new Object[]{Long.valueOf(((Long) a(new Object[]{Long.valueOf(jLongValue22)}, -418254867, 418254870, (int) System.currentTimeMillis())).longValue())}, -418254867, 418254870, (int) System.currentTimeMillis())).longValue())}, -418254867, 418254870, (int) System.currentTimeMillis())).longValue()), Long.valueOf(jLongValue22)}, -479580216, 479580223, (int) System.currentTimeMillis())).longValue())}, -418254867, 418254870, (int) System.currentTimeMillis())).longValue())}, -479580216, 479580223, (int) System.currentTimeMillis())).longValue();
                int i83 = f56891d;
                int i84 = i83 & 121;
                int i85 = (((i83 ^ 121) | i84) << 1) - ((i83 | 121) & (~i84));
                f56890c = i85 % 128;
                int i86 = i85 % 2;
                return Long.valueOf(jLongValue23);
            case 10:
                short sShortValue3 = ((Short) objArr[0]).shortValue();
                short sShortValue4 = ((Short) objArr[1]).shortValue();
                int i87 = f56890c;
                int i88 = i87 & 105;
                int i89 = -(-((i87 ^ 105) | i88));
                int i90 = (i88 & i89) + (i89 | i88);
                f56891d = i90 % 128;
                int i91 = i90 % 2;
                byte[][] bArr = f56888a;
                return Short.valueOf((short) (i91 == 0 ? bArr[sShortValue3][sShortValue4] & 28716 : bArr[sShortValue3][sShortValue4] & 255));
            default:
                long jLongValue24 = ((Number) objArr[0]).longValue();
                int i92 = f56890c + 85;
                f56891d = i92 % 128;
                int i93 = i92 % 2;
                long j21 = 3689348814741910323L & jLongValue24;
                long j22 = jLongValue24 & (-3689348814741910324L);
                long j23 = (j21 << 2) ^ j22;
                long j24 = j22 >>> 2;
                long jLongValue25 = j24 ^ ((Long) a(new Object[]{Long.valueOf(j23 ^ j24)}, -1113107968, 1113107973, (int) System.currentTimeMillis())).longValue();
                int i94 = f56890c;
                int i95 = i94 & 3;
                int i96 = i94 | 3;
                int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                f56891d = i97 % 128;
                if (i97 % 2 == 0) {
                    int i98 = 33 / 0;
                }
                return Long.valueOf(jLongValue25);
        }
    }
}
