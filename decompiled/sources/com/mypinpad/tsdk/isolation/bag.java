package com.mypinpad.tsdk.isolation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class bag implements bbd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, bag> f54303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54304d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54305e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54307b;

    static {
        HashMap map = new HashMap();
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHA-256", 32, 16, 67, 10}, 1827477732, -1827477731, 32), new bag(1, "XMSS_SHA2_10_256"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHA-256", 32, 16, 67, 16}, 1827477732, -1827477731, 32), new bag(2, "XMSS_SHA2_16_256"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHA-256", 32, 16, 67, 20}, 1827477732, -1827477731, 32), new bag(3, "XMSS_SHA2_20_256"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHA-512", 64, 16, 131, 10}, 1827477732, -1827477731, 64), new bag(4, "XMSS_SHA2_10_512"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHA-512", 64, 16, 131, 16}, 1827477732, -1827477731, 64), new bag(5, "XMSS_SHA2_16_512"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHA-512", 64, 16, 131, 20}, 1827477732, -1827477731, 64), new bag(6, "XMSS_SHA2_20_512"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHAKE128", 32, 16, 67, 10}, 1827477732, -1827477731, 32), new bag(7, "XMSS_SHAKE_10_256"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHAKE128", 32, 16, 67, 16}, 1827477732, -1827477731, 32), new bag(8, "XMSS_SHAKE_16_256"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHAKE128", 32, 16, 67, 20}, 1827477732, -1827477731, 32), new bag(9, "XMSS_SHAKE_20_256"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHAKE256", 64, 16, 131, 10}, 1827477732, -1827477731, 64), new bag(10, "XMSS_SHAKE_10_512"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHAKE256", 64, 16, 131, 16}, 1827477732, -1827477731, 64), new bag(11, "XMSS_SHAKE_16_512"));
        map.put((String) setCompoundDrawableTintBlendMode(new Object[]{"SHAKE256", 64, 16, 131, 20}, 1827477732, -1827477731, 64), new bag(12, "XMSS_SHAKE_20_512"));
        f54303c = Collections.unmodifiableMap(map);
        int i10 = f54305e;
        int i11 = ((i10 | 114) << 1) - (i10 ^ 114);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f54304d = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public bag(int i10, String str) {
        this.f54306a = i10;
        this.f54307b = str;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i11)) | (~(i15 | i10)) | (~(i13 | i14))) * 184) + ((i10 | i14 | i15) * 184) + ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183));
        if (i16 == 1) {
            String str = (String) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int iIntValue3 = ((Number) objArr[3]).intValue();
            int iIntValue4 = ((Number) objArr[4]).intValue();
            int i17 = f54305e;
            int i18 = i17 & 73;
            int i19 = ((i17 | 73) & (~i18)) + (i18 << 1);
            f54304d = i19 % 128;
            int i20 = i19 % 2;
            if (str == null) {
                throw new NullPointerException("algorithmName == null");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(Constant.DASH_STRING);
            sb2.append(iIntValue);
            sb2.append(Constant.DASH_STRING);
            sb2.append(iIntValue2);
            sb2.append(Constant.DASH_STRING);
            sb2.append(iIntValue3);
            sb2.append(Constant.DASH_STRING);
            sb2.append(iIntValue4);
            String string = sb2.toString();
            int i21 = f54304d;
            int i22 = i21 & 21;
            int i23 = i22 + ((i21 ^ 21) | i22);
            f54305e = i23 % 128;
            int i24 = i23 % 2;
            return string;
        }
        if (i16 == 2) {
            String str2 = (String) objArr[0];
            int iIntValue5 = ((Number) objArr[1]).intValue();
            int iIntValue6 = ((Number) objArr[2]).intValue();
            int iIntValue7 = ((Number) objArr[3]).intValue();
            int iIntValue8 = ((Number) objArr[4]).intValue();
            int i25 = f54304d;
            int i26 = i25 & 101;
            int i27 = (i25 | 101) & (~i26);
            int i28 = i26 << 1;
            int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
            f54305e = i29 % 128;
            if (i29 % 2 == 0) {
                throw null;
            }
            if (str2 == null) {
                throw new NullPointerException("algorithmName == null");
            }
            bag bagVar = f54303c.get((String) setCompoundDrawableTintBlendMode(new Object[]{str2, Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue6), Integer.valueOf(iIntValue7), Integer.valueOf(iIntValue8)}, 1827477732, -1827477731, iIntValue5));
            int i30 = (-2) - ((f54305e + 92) ^ (-1));
            f54304d = i30 % 128;
            int i31 = i30 % 2;
            return bagVar;
        }
        if (i16 == 3) {
            bag bagVar2 = (bag) objArr[0];
            int i32 = f54305e;
            int i33 = (i32 & 33) + (i32 | 33);
            f54304d = i33 % 128;
            int i34 = i33 % 2;
            String str3 = bagVar2.f54307b;
            if (i34 == 0) {
                return str3;
            }
            int i35 = 25 / 0;
            return str3;
        }
        bag bagVar3 = (bag) objArr[0];
        int i36 = f54305e;
        int i37 = i36 ^ 25;
        int i38 = ((i36 & 25) | i37) << 1;
        int i39 = -i37;
        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
        f54304d = i40 % 128;
        int i41 = i40 % 2;
        int i42 = bagVar3.f54306a;
        if (i41 != 0) {
            int i43 = 48 / 0;
        }
        int i44 = ((i36 & 40) + (i36 | 40)) - 1;
        f54304d = i44 % 128;
        if (i44 % 2 != 0) {
            int i45 = 52 / 0;
        }
        return Integer.valueOf(i42);
    }

    public static bag setY(String str, int i10, int i11, int i12, int i13) {
        return (bag) setCompoundDrawableTintBlendMode(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)}, 1275815534, -1275815532, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.bbd
    public final int setDividerPadding() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1736364685, -1736364685, System.identityHashCode(this))).intValue();
    }

    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 693544219, -693544216, System.identityHashCode(this));
    }
}
