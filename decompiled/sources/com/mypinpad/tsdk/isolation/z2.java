package com.mypinpad.tsdk.isolation;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f62263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f62264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62265c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62266d = 1;

    static {
        HashMap map = new HashMap();
        f62263a = map;
        HashMap map2 = new HashMap();
        f62264b = map2;
        adu aduVar = ahp.setDividerPadding;
        map.put("SHA-256", aduVar);
        adu aduVar2 = ahp.setOnFocusChangeListener;
        map.put("SHA-512", aduVar2);
        adu aduVar3 = ahp.setIncludeFontPadding;
        map.put("SHAKE128", aduVar3);
        adu aduVar4 = ahp.setZ;
        map.put("SHAKE256", aduVar4);
        map2.put(aduVar, "SHA-256");
        map2.put(aduVar2, "SHA-512");
        map2.put(aduVar3, "SHAKE128");
        map2.put(aduVar4, "SHAKE256");
        int i10 = f62265c;
        int i11 = i10 & 53;
        int i12 = (i10 | 53) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f62266d = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        Object alxVar;
        int i13 = ~i10;
        int i14 = ~(i12 | i11);
        int i15 = (((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109));
        if (i15 == 1) {
            adu aduVar = (adu) objArr[0];
            int i16 = f62265c;
            int i17 = i16 ^ 27;
            int i18 = -(-((i16 & 27) << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f62266d = i19 % 128;
            int i20 = i19 % 2;
            String str = (String) f62264b.get(aduVar);
            if (str == null) {
                throw new IllegalArgumentException("unrecognized digest oid: ".concat(String.valueOf(aduVar)));
            }
            int i21 = f62265c;
            int i22 = (i21 & 17) + (i21 | 17);
            int i23 = i22 % 128;
            f62266d = i23;
            int i24 = i22 % 2;
            int i25 = (((i23 ^ 35) | (i23 & 35)) << 1) - (((~i23) & 35) | (i23 & (-36)));
            f62265c = i25 % 128;
            int i26 = i25 % 2;
            return str;
        }
        if (i15 != 2) {
            String str2 = (String) objArr[0];
            int i27 = f62266d;
            int i28 = i27 & 97;
            int i29 = -(-((i27 ^ 97) | i28));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            f62265c = i30 % 128;
            int i31 = i30 % 2;
            adu aduVar2 = (adu) f62263a.get(str2);
            if (aduVar2 == null) {
                throw new IllegalArgumentException("unrecognized digest name: ".concat(String.valueOf(str2)));
            }
            int i32 = f62265c;
            int i33 = i32 ^ 99;
            int i34 = ((i32 & 99) | i33) << 1;
            int i35 = -i33;
            int i36 = (i34 & i35) + (i34 | i35);
            f62266d = i36 % 128;
            if (i36 % 2 != 0) {
                return aduVar2;
            }
            int i37 = 49 / 0;
            return aduVar2;
        }
        adu aduVar3 = (adu) objArr[0];
        int i38 = f62265c;
        int i39 = ((i38 | 77) << 1) - (i38 ^ 77);
        f62266d = i39 % 128;
        int i40 = i39 % 2;
        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar3, ahp.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar3))).booleanValue()) {
            alxVar = new alp();
            int i41 = f62266d;
            int i42 = i41 & 115;
            int i43 = ((i41 | 115) & (~i42)) + (i42 << 1);
            f62265c = i43 % 128;
            int i44 = i43 % 2;
        } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar3, ahp.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar3))).booleanValue()) {
            alxVar = new alw();
            int i45 = f62266d;
            int i46 = (((i45 | 64) << 1) - (i45 ^ 64)) - 1;
            f62265c = i46 % 128;
            int i47 = i46 % 2;
        } else if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar3, ahp.setIncludeFontPadding}, -109201153, 109201153, System.identityHashCode(aduVar3))).booleanValue()) {
            alxVar = new alx(128);
            int i48 = f62266d;
            int i49 = ((i48 & (-2)) | ((~i48) & 1)) + ((i48 & 1) << 1);
            f62265c = i49 % 128;
            if (i49 % 2 != 0) {
                throw null;
            }
        } else {
            if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar3, ahp.setZ}, -109201153, 109201153, System.identityHashCode(aduVar3))).booleanValue()) {
                throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(aduVar3)));
            }
            alxVar = new alx(256);
            int i50 = f62265c + 59;
            f62266d = i50 % 128;
            if (i50 % 2 == 0) {
                int i51 = 39 / 0;
            }
        }
        return alxVar;
    }
}
