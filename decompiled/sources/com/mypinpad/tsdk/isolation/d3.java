package com.mypinpad.tsdk.isolation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class d3 implements bbd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, d3> f55098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55099d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55100e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55102b;

    static {
        HashMap map = new HashMap();
        map.put((String) a(new Object[]{"SHA-256", 32, 16, 67}, -1229192018, 1229192018, 32), new d3(16777217, "WOTSP_SHA2-256_W16"));
        map.put((String) a(new Object[]{"SHA-512", 64, 16, 131}, -1229192018, 1229192018, 64), new d3(33554434, "WOTSP_SHA2-512_W16"));
        map.put((String) a(new Object[]{"SHAKE128", 32, 16, 67}, -1229192018, 1229192018, 32), new d3(50331651, "WOTSP_SHAKE128_W16"));
        map.put((String) a(new Object[]{"SHAKE256", 64, 16, 131}, -1229192018, 1229192018, 64), new d3(67108868, "WOTSP_SHAKE256_W16"));
        f55098c = Collections.unmodifiableMap(map);
        int i10 = f55099d;
        int i11 = i10 & 117;
        int i12 = (i10 ^ 117) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f55100e = i13 % 128;
        int i14 = i13 % 2;
    }

    public d3(int i10, String str) {
        this.f55101a = i10;
        this.f55102b = str;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55));
        if (i13 == 1) {
            d3 d3Var = (d3) objArr[0];
            int i14 = f55099d;
            int i15 = i14 & 33;
            int i16 = (i14 | 33) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            f55100e = i18 % 128;
            int i19 = i18 % 2;
            String str = d3Var.f55102b;
            if (i19 != 0) {
                return str;
            }
            throw null;
        }
        if (i13 == 2) {
            String str2 = (String) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int iIntValue3 = ((Number) objArr[3]).intValue();
            int i20 = f55099d;
            int i21 = i20 & 27;
            int i22 = ((i20 ^ 27) | i21) << 1;
            int i23 = -((i20 | 27) & (~i21));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f55100e = i24 % 128;
            int i25 = i24 % 2;
            if (str2 == null) {
                throw new NullPointerException("algorithmName == null");
            }
            d3 d3Var2 = f55098c.get((String) a(new Object[]{str2, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, -1229192018, 1229192018, iIntValue));
            int i26 = f55099d + 55;
            f55100e = i26 % 128;
            if (i26 % 2 != 0) {
                return d3Var2;
            }
            throw null;
        }
        if (i13 == 3) {
            d3 d3Var3 = (d3) objArr[0];
            int i27 = f55099d;
            int i28 = i27 | 95;
            int i29 = (i28 << 1) - ((~(i27 & 95)) & i28);
            f55100e = i29 % 128;
            int i30 = i29 % 2;
            int i31 = d3Var3.f55101a;
            if (i30 == 0) {
                int i32 = 4 / 0;
            }
            return Integer.valueOf(i31);
        }
        String str3 = (String) objArr[0];
        int iIntValue4 = ((Number) objArr[1]).intValue();
        int iIntValue5 = ((Number) objArr[2]).intValue();
        int iIntValue6 = ((Number) objArr[3]).intValue();
        int i33 = f55100e;
        int i34 = i33 ^ 75;
        int i35 = -(-((i33 & 75) << 1));
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        f55099d = i36 % 128;
        int i37 = i36 % 2;
        if (str3 == null) {
            throw new NullPointerException("algorithmName == null");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(Constant.DASH_STRING);
        sb2.append(iIntValue4);
        sb2.append(Constant.DASH_STRING);
        sb2.append(iIntValue5);
        sb2.append(Constant.DASH_STRING);
        sb2.append(iIntValue6);
        String string = sb2.toString();
        int i38 = f55099d + 71;
        f55100e = i38 % 128;
        int i39 = i38 % 2;
        return string;
    }

    @Override // com.mypinpad.tsdk.isolation.bbd
    public final int setDividerPadding() {
        return ((Integer) a(new Object[]{this}, 853841963, -853841960, System.identityHashCode(this))).intValue();
    }

    public final String toString() {
        return (String) a(new Object[]{this}, -225280864, 225280865, System.identityHashCode(this));
    }
}
