package com.mypinpad.tsdk.isolation;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55610b = 1;

    public static class a implements aky {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f55611c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f55612d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final aky f55613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f55614b;

        public a(int i10, aky akyVar) {
            this.f55613a = akyVar;
            this.f55614b = i10;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~(i13 | i10);
            int i15 = ~i12;
            int i16 = ~(i15 | i10);
            int i17 = ((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711));
            if (i17 == 1) {
                a aVar = (a) objArr[0];
                int i18 = f55612d;
                int i19 = i18 & 123;
                int i20 = ((((i18 ^ 123) | i19) << 1) - (~(-((i18 | 123) & (~i19))))) - 1;
                int i21 = i20 % 128;
                f55611c = i21;
                int i22 = i20 % 2;
                int i23 = aVar.f55614b;
                if (i22 != 0) {
                    int i24 = 77 / 0;
                }
                int i25 = (i21 & (-30)) | ((~i21) & 29);
                int i26 = -(-((i21 & 29) << 1));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f55612d = i27 % 128;
                if (i27 % 2 != 0) {
                    return Integer.valueOf(i23);
                }
                throw null;
            }
            if (i17 == 2) {
                a aVar2 = (a) objArr[0];
                aVar2.f55613a.setCompoundDrawableTintBlendMode((byte[]) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                int i28 = f55611c;
                int i29 = i28 & 1;
                int i30 = i29 + ((i28 ^ 1) | i29);
                f55612d = i30 % 128;
                int i31 = i30 % 2;
                return null;
            }
            if (i17 == 3) {
                a aVar3 = (a) objArr[0];
                byte bByteValue = ((Byte) objArr[1]).byteValue();
                int i32 = f55611c;
                int i33 = ((i32 & (-16)) | ((~i32) & 15)) + ((i32 & 15) << 1);
                f55612d = i33 % 128;
                int i34 = i33 % 2;
                aVar3.f55613a.setX(bByteValue);
                int i35 = f55611c;
                int i36 = (((i35 | 40) << 1) - (i35 ^ 40)) - 1;
                f55612d = i36 % 128;
                int i37 = i36 % 2;
                return null;
            }
            if (i17 == 4) {
                a aVar4 = (a) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i38 = f55611c;
                int i39 = (i38 & 7) + (i38 | 7);
                f55612d = i39 % 128;
                int i40 = i39 % 2;
                byte[] bArr2 = new byte[aVar4.f55613a.setY()];
                aVar4.f55613a.setCompoundDrawableTintBlendMode(bArr2, 0);
                int i41 = aVar4.f55614b;
                System.arraycopy(bArr2, 0, bArr, iIntValue, i41);
                int i42 = f55611c;
                int i43 = i42 ^ 21;
                int i44 = (i42 & 21) << 1;
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                f55612d = i45 % 128;
                if (i45 % 2 != 0) {
                    return Integer.valueOf(i41);
                }
                throw null;
            }
            if (i17 == 5) {
                a aVar5 = (a) objArr[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aVar5.f55613a.setX());
                sb2.append("/");
                sb2.append(aVar5.f55614b << 3);
                String string = sb2.toString();
                int i46 = f55611c;
                int i47 = i46 & 107;
                int i48 = (i47 - (~(-(-((i46 ^ 107) | i47))))) - 1;
                f55612d = i48 % 128;
                int i49 = i48 % 2;
                return string;
            }
            a aVar6 = (a) objArr[0];
            int i50 = f55611c;
            int i51 = (((i50 ^ 19) | (i50 & 19)) << 1) - (((~i50) & 19) | (i50 & (-20)));
            f55612d = i51 % 128;
            int i52 = i51 % 2;
            aVar6.f55613a.setOnFocusChangeListener();
            int i53 = f55611c + 36;
            int i54 = (i53 ^ (-1)) + (i53 << 1);
            f55612d = i54 % 128;
            int i55 = i54 % 2;
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.aky
        public final int setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
            return ((Integer) a(new Object[]{this, bArr, Integer.valueOf(i10)}, 322386514, -322386510, i10)).intValue();
        }

        @Override // com.mypinpad.tsdk.isolation.aky
        public final void setOnFocusChangeListener() {
            a(new Object[]{this}, 1420771719, -1420771719, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aky
        public final void setX(byte b10) {
            a(new Object[]{this, Byte.valueOf(b10)}, -371643398, 371643401, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aky
        public final int setY() {
            return ((Integer) a(new Object[]{this}, 197544279, -197544278, System.identityHashCode(this))).intValue();
        }

        @Override // com.mypinpad.tsdk.isolation.aky
        public final void setCompoundDrawableTintBlendMode(byte[] bArr, int i10, int i11) {
            a(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1936086990, 1936086992, i10);
        }

        @Override // com.mypinpad.tsdk.isolation.aky
        public final String setX() {
            return (String) a(new Object[]{this}, 1336672460, -1336672455, System.identityHashCode(this));
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
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
        int i10 = f55610b;
        int i11 = i10 & 105;
        int i12 = (i11 - (~((i10 ^ 105) | i11))) - 1;
        f55609a = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ aky a(Object[] objArr) {
        adu aduVar = (adu) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f55610b + 81;
        f55609a = i10 % 128;
        if (i10 % 2 != 0) {
            b(new Object[]{aduVar}, -2108776791, 2108776794, (int) System.currentTimeMillis());
            ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ahp.setAlwaysDrawnWithCacheEnabled}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue();
            throw null;
        }
        aky akyVar = (aky) b(new Object[]{aduVar}, -2108776791, 2108776794, (int) System.currentTimeMillis());
        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, ahp.setAlwaysDrawnWithCacheEnabled}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
            a aVar = new a(iIntValue, akyVar);
            int i11 = f55609a;
            int i12 = ((i11 & (-108)) | ((~i11) & 107)) + ((i11 & 107) << 1);
            f55610b = i12 % 128;
            int i13 = i12 % 2;
            return aVar;
        }
        if (iIntValue != 24) {
            int i14 = f55609a + 11;
            f55610b = i14 % 128;
            int i15 = i14 % 2;
            return akyVar;
        }
        a aVar2 = new a(iIntValue, akyVar);
        int i16 = f55609a + 22;
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        f55610b = i17 % 128;
        int i18 = i17 % 2;
        return aVar2;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        int i17 = ((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13;
        if (i17 == 1) {
            axy axyVar = (axy) objArr[0];
            int i18 = f55610b + 71;
            f55609a = i18 % 128;
            int i19 = i18 % 2;
            adu aduVar = (adu) axy.setDividerPadding(new Object[]{axyVar}, 265814649, -265814646, System.identityHashCode(axyVar));
            int iIntValue = ((Integer) axy.setDividerPadding(new Object[]{axyVar}, -72431915, 72431919, System.identityHashCode(axyVar))).intValue();
            aky akyVar = (aky) b(new Object[]{aduVar, Integer.valueOf(iIntValue)}, 1034000925, -1034000923, iIntValue);
            int i20 = f55609a;
            int i21 = i20 & 83;
            int i22 = (i20 ^ 83) | i21;
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f55610b = i23 % 128;
            if (i23 % 2 != 0) {
                return akyVar;
            }
            throw null;
        }
        if (i17 == 2) {
            return a(objArr);
        }
        if (i17 != 3) {
            axw axwVar = (axw) objArr[0];
            int i24 = f55610b;
            int i25 = (i24 ^ 17) + ((i24 & 17) << 1);
            f55609a = i25 % 128;
            if (i25 % 2 != 0) {
                adu aduVar2 = (adu) axw.setOnFocusChangeListener(new Object[]{axwVar}, -97169922, 97169922, System.identityHashCode(axwVar));
                int iIntValue2 = ((Integer) axw.setOnFocusChangeListener(new Object[]{axwVar}, -2053068740, 2053068745, System.identityHashCode(axwVar))).intValue();
                throw null;
            }
            adu aduVar3 = (adu) axw.setOnFocusChangeListener(new Object[]{axwVar}, -97169922, 97169922, System.identityHashCode(axwVar));
            int iIntValue3 = ((Integer) axw.setOnFocusChangeListener(new Object[]{axwVar}, -2053068740, 2053068745, System.identityHashCode(axwVar))).intValue();
            aky akyVar2 = (aky) b(new Object[]{aduVar3, Integer.valueOf(iIntValue3)}, 1034000925, -1034000923, iIntValue3);
            int i26 = f55609a;
            int i27 = (i26 & (-42)) | ((~i26) & 41);
            int i28 = (i26 & 41) << 1;
            int i29 = (i27 & i28) + (i28 | i27);
            f55610b = i29 % 128;
            if (i29 % 2 != 0) {
                return akyVar2;
            }
            throw null;
        }
        adu aduVar4 = (adu) objArr[0];
        int i30 = f55609a;
        int i31 = ((i30 | 67) << 1) - (i30 ^ 67);
        f55610b = i31 % 128;
        if (i31 % 2 == 0) {
            ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar4, ahp.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar4))).booleanValue();
            throw null;
        }
        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar4, ahp.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar4))).booleanValue()) {
            alp alpVar = new alp();
            int i32 = f55610b + 99;
            f55609a = i32 % 128;
            int i33 = i32 % 2;
            return alpVar;
        }
        if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar4, ahp.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar4))).booleanValue()) {
            if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar4, ahp.setIncludeFontPadding}, -109201153, 109201153, System.identityHashCode(aduVar4))).booleanValue()) {
                alx alxVar = new alx(128);
                int i34 = f55610b;
                int i35 = ((i34 ^ 55) | (i34 & 55)) << 1;
                int i36 = -(((~i34) & 55) | (i34 & (-56)));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f55609a = i37 % 128;
                if (i37 % 2 == 0) {
                    return alxVar;
                }
                throw null;
            }
            if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar4, ahp.setZ}, -109201153, 109201153, System.identityHashCode(aduVar4))).booleanValue()) {
                alx alxVar2 = new alx(256);
                int i38 = f55609a;
                int i39 = i38 ^ 11;
                int i40 = -(-((i38 & 11) << 1));
                int i41 = (i39 & i40) + (i40 | i39);
                f55610b = i41 % 128;
                int i42 = i41 % 2;
                return alxVar2;
            }
            if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar4, ahp.setAlwaysDrawnWithCacheEnabled}, -109201153, 109201153, System.identityHashCode(aduVar4))).booleanValue()) {
                throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(aduVar4)));
            }
            alx alxVar3 = new alx(256);
            int i43 = f55609a;
            int i44 = i43 & 71;
            int i45 = -(-(i43 | 71));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            f55610b = i46 % 128;
            if (i46 % 2 != 0) {
                return alxVar3;
            }
            throw null;
        }
        alw alwVar = new alw();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i47 = ~(((-67150082) & iCurrentTimeMillis) | ((-67150082) ^ iCurrentTimeMillis));
        int i48 = ((~i47) & 1613517378) | ((-1613517379) & i47);
        int i49 = 1613517378 & i47;
        int i50 = (((((i48 & i49) | (i48 ^ i49)) * (-476)) - 336949161) - (~(-(~(-(-(i47 * 952))))))) - 2;
        int i51 = ~iCurrentTimeMillis;
        int i52 = (i51 & (-390112542)) | ((-390112542) ^ i51);
        int i53 = i52 & 1936479838;
        int i54 = (i52 | 1936479838) & (~i53);
        int i55 = -(-((~((i54 & i53) | (i54 ^ i53))) * 476));
        int i56 = ((((~i55) & i50) | ((~i50) & i55)) - (~(-(-((i55 & i50) << 1))))) - 1;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i57 = ~iCurrentTimeMillis2;
        int i58 = 143488133 ^ i57;
        int i59 = 143488133 & i57;
        int i60 = ~((i58 ^ i59) | (i58 & i59));
        int i61 = (i60 & 610274072) | (i60 ^ 610274072);
        int i62 = ~(((-753470238) & i57) | (i57 ^ (-753470238)));
        int i63 = ((~i62) & i61) | ((~i61) & i62);
        int i64 = i61 & i62;
        int i65 = (i64 & i63) | (i63 ^ i64);
        int i66 = ~(((-291969) & iCurrentTimeMillis2) | ((-291969) ^ iCurrentTimeMillis2));
        int i67 = i65 & i66;
        int i68 = (i65 | i66) & (~i67);
        int i69 = (((i68 & i67) | (i68 ^ i67)) * 590) - 1784769876;
        int i70 = i58 | i59;
        int i71 = ~i70;
        int i72 = (i70 | i71) & i71;
        int i73 = (i72 & 610274072) | (i72 ^ 610274072);
        int i74 = -(-(((i73 & i62) | (i73 ^ i62)) * (-1180)));
        int i75 = (((i69 ^ i74) | (i69 & i74)) << 1) - ((i74 & (~i69)) | ((~i74) & i69));
        int i76 = (iCurrentTimeMillis2 | i57) & i57;
        int i77 = 753470237 ^ i76;
        int i78 = i76 & 753470237;
        int i79 = (i78 & i77) | (i77 ^ i78);
        int i80 = ~i79;
        int i81 = (i79 | i80) & i80;
        int i82 = ~((i57 & (-143488134)) | i59 | ((~i57) & (-143488134)));
        if (i56 <= (i75 - (~(-(~(-(-(((i81 & i82) | (i81 ^ i82)) * 590))))))) - 2) {
            return alwVar;
        }
        int i83 = 36 / 0;
        return alwVar;
    }
}
