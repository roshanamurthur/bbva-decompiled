package com.mypinpad.tsdk.isolation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class bah implements bbd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, bah> f54308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54309d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54310e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54312b;

    static {
        HashMap map = new HashMap();
        y2.c(1, "XMSSMT_SHA2_20/2_256", map, (String) setDividerPadding(new Object[]{"SHA-256", 32, 16, 67, 20, 2}, 1072793284, -1072793282, 32));
        y2.c(2, "XMSSMT_SHA2_20/4_256", map, (String) setDividerPadding(new Object[]{"SHA-256", 32, 16, 67, 20, 4}, 1072793284, -1072793282, 32));
        y2.c(3, "XMSSMT_SHA2_40/2_256", map, (String) setDividerPadding(new Object[]{"SHA-256", 32, 16, 67, 40, 2}, 1072793284, -1072793282, 32));
        y2.c(4, "XMSSMT_SHA2_40/4_256", map, (String) setDividerPadding(new Object[]{"SHA-256", 32, 16, 67, 40, 4}, 1072793284, -1072793282, 32));
        y2.c(5, "XMSSMT_SHA2_40/8_256", map, (String) setDividerPadding(new Object[]{"SHA-256", 32, 16, 67, 40, 8}, 1072793284, -1072793282, 32));
        y2.c(6, "XMSSMT_SHA2_60/3_256", map, (String) setDividerPadding(new Object[]{"SHA-256", 32, 16, 67, 60, 3}, 1072793284, -1072793282, 32));
        y2.c(7, "XMSSMT_SHA2_60/6_256", map, (String) setDividerPadding(new Object[]{"SHA-256", 32, 16, 67, 60, 6}, 1072793284, -1072793282, 32));
        y2.c(8, "XMSSMT_SHA2_60/12_256", map, (String) setDividerPadding(new Object[]{"SHA-256", 32, 16, 67, 60, 12}, 1072793284, -1072793282, 32));
        y2.c(9, "XMSSMT_SHA2_20/2_512", map, (String) setDividerPadding(new Object[]{"SHA-512", 64, 16, 131, 20, 2}, 1072793284, -1072793282, 64));
        y2.c(10, "XMSSMT_SHA2_20/4_512", map, (String) setDividerPadding(new Object[]{"SHA-512", 64, 16, 131, 20, 4}, 1072793284, -1072793282, 64));
        y2.c(11, "XMSSMT_SHA2_40/2_512", map, (String) setDividerPadding(new Object[]{"SHA-512", 64, 16, 131, 40, 2}, 1072793284, -1072793282, 64));
        y2.c(12, "XMSSMT_SHA2_40/4_512", map, (String) setDividerPadding(new Object[]{"SHA-512", 64, 16, 131, 40, 4}, 1072793284, -1072793282, 64));
        y2.c(13, "XMSSMT_SHA2_40/8_512", map, (String) setDividerPadding(new Object[]{"SHA-512", 64, 16, 131, 40, 8}, 1072793284, -1072793282, 64));
        y2.c(14, "XMSSMT_SHA2_60/3_512", map, (String) setDividerPadding(new Object[]{"SHA-512", 64, 16, 131, 60, 3}, 1072793284, -1072793282, 64));
        y2.c(15, "XMSSMT_SHA2_60/6_512", map, (String) setDividerPadding(new Object[]{"SHA-512", 64, 16, 131, 60, 6}, 1072793284, -1072793282, 64));
        y2.c(16, "XMSSMT_SHA2_60/12_512", map, (String) setDividerPadding(new Object[]{"SHA-512", 64, 16, 131, 60, 12}, 1072793284, -1072793282, 64));
        y2.c(17, "XMSSMT_SHAKE_20/2_256", map, (String) setDividerPadding(new Object[]{"SHAKE128", 32, 16, 67, 20, 2}, 1072793284, -1072793282, 32));
        y2.c(18, "XMSSMT_SHAKE_20/4_256", map, (String) setDividerPadding(new Object[]{"SHAKE128", 32, 16, 67, 20, 4}, 1072793284, -1072793282, 32));
        y2.c(19, "XMSSMT_SHAKE_40/2_256", map, (String) setDividerPadding(new Object[]{"SHAKE128", 32, 16, 67, 40, 2}, 1072793284, -1072793282, 32));
        y2.c(20, "XMSSMT_SHAKE_40/4_256", map, (String) setDividerPadding(new Object[]{"SHAKE128", 32, 16, 67, 40, 4}, 1072793284, -1072793282, 32));
        y2.c(21, "XMSSMT_SHAKE_40/8_256", map, (String) setDividerPadding(new Object[]{"SHAKE128", 32, 16, 67, 40, 8}, 1072793284, -1072793282, 32));
        y2.c(22, "XMSSMT_SHAKE_60/3_256", map, (String) setDividerPadding(new Object[]{"SHAKE128", 32, 16, 67, 60, 3}, 1072793284, -1072793282, 32));
        y2.c(23, "XMSSMT_SHAKE_60/6_256", map, (String) setDividerPadding(new Object[]{"SHAKE128", 32, 16, 67, 60, 6}, 1072793284, -1072793282, 32));
        y2.c(24, "XMSSMT_SHAKE_60/12_256", map, (String) setDividerPadding(new Object[]{"SHAKE128", 32, 16, 67, 60, 12}, 1072793284, -1072793282, 32));
        y2.c(25, "XMSSMT_SHAKE_20/2_512", map, (String) setDividerPadding(new Object[]{"SHAKE256", 64, 16, 131, 20, 2}, 1072793284, -1072793282, 64));
        y2.c(26, "XMSSMT_SHAKE_20/4_512", map, (String) setDividerPadding(new Object[]{"SHAKE256", 64, 16, 131, 20, 4}, 1072793284, -1072793282, 64));
        y2.c(27, "XMSSMT_SHAKE_40/2_512", map, (String) setDividerPadding(new Object[]{"SHAKE256", 64, 16, 131, 40, 2}, 1072793284, -1072793282, 64));
        y2.c(28, "XMSSMT_SHAKE_40/4_512", map, (String) setDividerPadding(new Object[]{"SHAKE256", 64, 16, 131, 40, 4}, 1072793284, -1072793282, 64));
        y2.c(29, "XMSSMT_SHAKE_40/8_512", map, (String) setDividerPadding(new Object[]{"SHAKE256", 64, 16, 131, 40, 8}, 1072793284, -1072793282, 64));
        y2.c(30, "XMSSMT_SHAKE_60/3_512", map, (String) setDividerPadding(new Object[]{"SHAKE256", 64, 16, 131, 60, 3}, 1072793284, -1072793282, 64));
        y2.c(31, "XMSSMT_SHAKE_60/6_512", map, (String) setDividerPadding(new Object[]{"SHAKE256", 64, 16, 131, 60, 6}, 1072793284, -1072793282, 64));
        map.put((String) setDividerPadding(new Object[]{"SHAKE256", 64, 16, 131, 60, 12}, 1072793284, -1072793282, 64), new bah(32, "XMSSMT_SHAKE_60/12_512"));
        f54308c = Collections.unmodifiableMap(map);
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public bah(int i10, String str) {
        this.f54311a = i10;
        this.f54312b = str;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 263) + (i10 * (-523));
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i10 | i15);
        int i17 = ((i16 | (~(i15 | (~i12))) | i14) * 262) + (i16 * (-786)) + ((i14 | i16 | (~(i15 | i12))) * 262) + i13;
        if (i17 == 1) {
            String str = (String) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int iIntValue3 = ((Number) objArr[3]).intValue();
            int iIntValue4 = ((Number) objArr[4]).intValue();
            int iIntValue5 = ((Number) objArr[5]).intValue();
            int i18 = f54309d;
            int i19 = (i18 ^ 111) + ((i18 & 111) << 1);
            f54310e = i19 % 128;
            int i20 = i19 % 2;
            if (str == null) {
                throw new NullPointerException("algorithmName == null");
            }
            bah bahVar = f54308c.get((String) setDividerPadding(new Object[]{str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5)}, 1072793284, -1072793282, iIntValue));
            int i21 = f54309d;
            int i22 = (((i21 ^ 109) | (i21 & 109)) << 1) - (((~i21) & 109) | (i21 & (-110)));
            f54310e = i22 % 128;
            if (i22 % 2 != 0) {
                return bahVar;
            }
            int i23 = 13 / 0;
            return bahVar;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                bah bahVar2 = (bah) objArr[0];
                int i24 = f54309d;
                int i25 = (i24 ^ 80) + ((i24 & 80) << 1);
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                f54310e = i26 % 128;
                int i27 = i26 % 2;
                String str2 = bahVar2.f54312b;
                if (i27 == 0) {
                    throw null;
                }
                int i28 = i24 + 43;
                f54310e = i28 % 128;
                if (i28 % 2 != 0) {
                    return str2;
                }
                throw null;
            }
            bah bahVar3 = (bah) objArr[0];
            int i29 = f54310e;
            int i30 = i29 ^ 125;
            int i31 = (((i29 & 125) | i30) << 1) - i30;
            f54309d = i31 % 128;
            int i32 = i31 % 2;
            int i33 = bahVar3.f54311a;
            if (i32 != 0) {
                throw null;
            }
            int i34 = ((i29 ^ 51) | (i29 & 51)) << 1;
            int i35 = -(((~i29) & 51) | (i29 & (-52)));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            f54309d = i36 % 128;
            int i37 = i36 % 2;
            return Integer.valueOf(i33);
        }
        String str3 = (String) objArr[0];
        int iIntValue6 = ((Number) objArr[1]).intValue();
        int iIntValue7 = ((Number) objArr[2]).intValue();
        int iIntValue8 = ((Number) objArr[3]).intValue();
        int iIntValue9 = ((Number) objArr[4]).intValue();
        int iIntValue10 = ((Number) objArr[5]).intValue();
        int i38 = f54309d;
        int i39 = ((i38 ^ 85) | (i38 & 85)) << 1;
        int i40 = -(((~i38) & 85) | (i38 & (-86)));
        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
        f54310e = i41 % 128;
        int i42 = i41 % 2;
        if (str3 == null) {
            throw new NullPointerException("algorithmName == null");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(Constant.DASH_STRING);
        sb2.append(iIntValue6);
        sb2.append(Constant.DASH_STRING);
        sb2.append(iIntValue7);
        sb2.append(Constant.DASH_STRING);
        sb2.append(iIntValue8);
        sb2.append(Constant.DASH_STRING);
        sb2.append(iIntValue9);
        sb2.append(Constant.DASH_STRING);
        sb2.append(iIntValue10);
        String string = sb2.toString();
        int i43 = f54310e + 91;
        f54309d = i43 % 128;
        int i44 = i43 % 2;
        return string;
    }

    public static bah setY(String str, int i10, int i11, int i12, int i13, int i14) {
        return (bah) setDividerPadding(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)}, 2020304888, -2020304887, i10);
    }

    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 1026475768, -1026475765, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.bbd
    public final int setDividerPadding() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1075281574, 1075281574, System.identityHashCode(this))).intValue();
    }
}
