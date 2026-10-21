package com.mypinpad.tsdk.isolation;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class o2 {
    public static int A = 0;
    public static int B = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aze f57389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f57390b = new n2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f57394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f57395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public short[][] f57396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public short[][] f57397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[][] f57398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public short[][] f57399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[][] f57400l;
    public short[][][] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[][][] f57401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public short[][][] f57402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public short[][][] f57403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public short[][][] f57404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public short[][][] f57405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public short[][][] f57406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public short[][][] f57407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public short[][][] f57408u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public short[][][] f57409v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public short[][][] f57410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public short[][][] f57411x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public short[][][] f57412y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public short[][][] f57413z;

    public o2(aze azeVar, byte[] bArr, byte[] bArr2) {
        this.f57389a = azeVar;
        this.f57395g = bArr;
        this.f57394f = bArr2;
        this.f57391c = ((Integer) aze.setX(new Object[]{azeVar}, 495303548, -495303545, System.identityHashCode(azeVar))).intValue();
        this.f57392d = ((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue();
        this.f57393e = ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue();
    }

    public static /* synthetic */ azd a(Object[] objArr) {
        o2 o2Var = (o2) objArr[0];
        o2Var.f57394f = (byte[]) bek.setOnFocusChangeListener(new Object[]{o2Var.f57394f}, -150521869, 150521882, (int) System.currentTimeMillis());
        o2Var.f57395g = (byte[]) bek.setOnFocusChangeListener(new Object[]{o2Var.f57395g}, -150521869, 150521882, (int) System.currentTimeMillis());
        b(new Object[]{o2Var}, 606065713, -606065711, System.identityHashCode(o2Var));
        azd azdVar = new azd(o2Var.f57389a, o2Var.f57394f, o2Var.f57396h, o2Var.f57397i, o2Var.f57399k, o2Var.f57400l, o2Var.m, o2Var.f57401n, o2Var.f57402o, o2Var.f57403p, o2Var.f57404q, o2Var.f57405r, o2Var.f57406s);
        int i10 = B;
        int i11 = ((i10 ^ 12) + ((i10 & 12) << 1)) - 1;
        A = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 57 / 0;
        }
        return azdVar;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = ~((~i10) | i11);
        int i17 = ~((~i11) | i10);
        int i18 = ~(i10 | i12);
        int i19 = ((i18 | i17) * 658) + (i17 * 658) + ((i16 | i17 | i18) * (-658)) + (i11 * (-657)) + (i10 * 659);
        if (i19 == 1) {
            o2 o2Var = (o2) objArr[0];
            SecureRandom secureRandom = (SecureRandom) objArr[1];
            int i20 = A;
            int i21 = i20 & 59;
            int i22 = ((i20 ^ 59) | i21) << 1;
            int i23 = -((i20 | 59) & (~i21));
            int i24 = (i22 & i23) + (i23 | i22);
            B = i24 % 128;
            int i25 = i24 % 2;
            int i26 = o2Var.f57392d;
            int i27 = o2Var.f57391c;
            Boolean bool = Boolean.TRUE;
            o2Var.f57407t = (short[][][]) p2.d(new Object[]{secureRandom, Integer.valueOf(i26), Integer.valueOf(i27), Integer.valueOf(i27), bool}, -275480750, 275480757, i26);
            int i28 = o2Var.f57392d;
            Boolean bool2 = Boolean.FALSE;
            o2Var.f57408u = (short[][][]) p2.d(new Object[]{secureRandom, Integer.valueOf(i28), Integer.valueOf(i27), Integer.valueOf(i28), bool2}, -275480750, 275480757, i28);
            int i29 = o2Var.f57393e;
            o2Var.f57409v = (short[][][]) p2.d(new Object[]{secureRandom, Integer.valueOf(i29), Integer.valueOf(i27), Integer.valueOf(i27), bool}, -275480750, 275480757, i29);
            o2Var.f57410w = (short[][][]) p2.d(new Object[]{secureRandom, Integer.valueOf(i29), Integer.valueOf(i27), Integer.valueOf(i28), bool2}, -275480750, 275480757, i29);
            o2Var.f57411x = (short[][][]) p2.d(new Object[]{secureRandom, Integer.valueOf(i29), Integer.valueOf(i27), Integer.valueOf(i29), bool2}, -275480750, 275480757, i29);
            o2Var.f57412y = (short[][][]) p2.d(new Object[]{secureRandom, Integer.valueOf(i29), Integer.valueOf(i28), Integer.valueOf(i28), bool}, -275480750, 275480757, i29);
            o2Var.f57413z = (short[][][]) p2.d(new Object[]{secureRandom, Integer.valueOf(i29), Integer.valueOf(i28), Integer.valueOf(i29), bool2}, -275480750, 275480757, i29);
            int i30 = B;
            int i31 = i30 & 47;
            int i32 = i31 + ((i30 ^ 47) | i31);
            A = i32 % 128;
            int i33 = i32 % 2;
        } else {
            if (i19 == 2) {
                o2 o2Var2 = (o2) objArr[0];
                byte[] bArr = o2Var2.f57394f;
                aze azeVar = o2Var2.f57389a;
                m2 m2Var = new m2(bArr, (aky) aze.setX(new Object[]{azeVar}, 1652262091, -1652262085, System.identityHashCode(azeVar)));
                byte[] bArr2 = o2Var2.f57395g;
                aze azeVar2 = o2Var2.f57389a;
                m2 m2Var2 = new m2(bArr2, (aky) aze.setX(new Object[]{azeVar2}, 1652262091, -1652262085, System.identityHashCode(azeVar2)));
                b(new Object[]{o2Var2, m2Var}, 292177589, -292177589, System.identityHashCode(o2Var2));
                b(new Object[]{o2Var2}, -1610499654, 1610499657, System.identityHashCode(o2Var2));
                b(new Object[]{o2Var2, m2Var2}, -1539066045, 1539066046, System.identityHashCode(o2Var2));
                o2Var2.f57407t = (short[][][]) n2.a(new Object[]{o2Var2.f57396h, o2Var2.f57409v, o2Var2.f57407t}, -1055089478, 1055089481, (int) System.currentTimeMillis());
                o2Var2.f57408u = (short[][][]) n2.a(new Object[]{o2Var2.f57396h, o2Var2.f57410w, o2Var2.f57408u}, -1055089478, 1055089481, (int) System.currentTimeMillis());
                b(new Object[]{o2Var2}, 935389646, -935389641, System.identityHashCode(o2Var2));
                int i34 = A;
                int i35 = (i34 & 61) + (i34 | 61);
                B = i35 % 128;
                int i36 = i35 % 2;
                return null;
            }
            int i37 = 680821026;
            int i38 = -680821025;
            if (i19 == 3) {
                o2 o2Var3 = (o2) objArr[0];
                int i39 = A;
                int i40 = (((i39 ^ 79) | (i39 & 79)) << 1) - (((~i39) & 79) | (i39 & (-80)));
                B = i40 % 128;
                int i41 = i40 % 2;
                n2 n2Var = o2Var3.f57390b;
                short[][] sArr = o2Var3.f57397i;
                if (i41 == 0) {
                    o2Var3.f57400l = (short[][]) n2.a(new Object[]{(short[][]) n2.a(new Object[]{sArr, o2Var3.f57399k}, -680821025, 680821026, (int) System.currentTimeMillis()), o2Var3.f57398j}, 768921800, -768921796, (int) System.currentTimeMillis());
                    throw null;
                }
                o2Var3.f57400l = (short[][]) n2.a(new Object[]{(short[][]) n2.a(new Object[]{sArr, o2Var3.f57399k}, -680821025, 680821026, (int) System.currentTimeMillis()), o2Var3.f57398j}, 768921800, -768921796, (int) System.currentTimeMillis());
            } else {
                if (i19 == 4) {
                    return a(objArr);
                }
                if (i19 != 5) {
                    o2 o2Var4 = (o2) objArr[0];
                    SecureRandom secureRandom2 = (SecureRandom) objArr[1];
                    int i42 = B;
                    int i43 = i42 & 93;
                    int i44 = ((i42 ^ 93) | i43) << 1;
                    int i45 = -((i42 | 93) & (~i43));
                    int i46 = (i44 & i45) + (i45 | i44);
                    A = i46 % 128;
                    int i47 = i46 % 2;
                    int i48 = o2Var4.f57392d;
                    int i49 = o2Var4.f57393e;
                    o2Var4.f57396h = (short[][]) p2.d(new Object[]{secureRandom2, Integer.valueOf(i48), Integer.valueOf(i49)}, -796240405, 796240411, i48);
                    int i50 = o2Var4.f57391c;
                    o2Var4.f57397i = (short[][]) p2.d(new Object[]{secureRandom2, Integer.valueOf(i50), Integer.valueOf(o2Var4.f57392d)}, -796240405, 796240411, i50);
                    int i51 = o2Var4.f57391c;
                    o2Var4.f57398j = (short[][]) p2.d(new Object[]{secureRandom2, Integer.valueOf(i51), Integer.valueOf(i49)}, -796240405, 796240411, i51);
                    int i52 = o2Var4.f57392d;
                    o2Var4.f57399k = (short[][]) p2.d(new Object[]{secureRandom2, Integer.valueOf(i52), Integer.valueOf(i49)}, -796240405, 796240411, i52);
                    int i53 = B;
                    int i54 = ((i53 & 22) + (i53 | 22)) - 1;
                    A = i54 % 128;
                    int i55 = i54 % 2;
                } else {
                    o2 o2Var5 = (o2) objArr[0];
                    int i56 = B;
                    int i57 = i56 & 55;
                    int i58 = (i56 ^ 55) | i57;
                    int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                    A = i59 % 128;
                    if (i59 % 2 != 0) {
                        o2Var5.m = (short[][][]) p2.d(new Object[]{o2Var5.f57407t}, 135398520, -135398515, (int) System.currentTimeMillis());
                        o2Var5.f57401n = new short[o2Var5.f57392d][][];
                        i13 = 1;
                    } else {
                        o2Var5.m = (short[][][]) p2.d(new Object[]{o2Var5.f57407t}, 135398520, -135398515, (int) System.currentTimeMillis());
                        o2Var5.f57401n = new short[o2Var5.f57392d][][];
                        i13 = 0;
                    }
                    while (true) {
                        i14 = -1976354233;
                        i15 = 1976354233;
                        if (i13 >= o2Var5.f57392d) {
                            break;
                        }
                        int i60 = B;
                        int i61 = ((i60 | 111) << 1) - (i60 ^ 111);
                        A = i61 % 128;
                        int i62 = i61 % 2;
                        o2Var5.f57401n[i13] = (short[][]) n2.a(new Object[]{o2Var5.f57407t[i13]}, 1976354233, -1976354233, (int) System.currentTimeMillis());
                        short[][][] sArr2 = o2Var5.f57401n;
                        sArr2[i13] = (short[][]) n2.a(new Object[]{sArr2[i13], o2Var5.f57397i}, -680821025, 680821026, (int) System.currentTimeMillis());
                        short[][][] sArr3 = o2Var5.f57401n;
                        sArr3[i13] = (short[][]) n2.a(new Object[]{sArr3[i13], o2Var5.f57408u[i13]}, 768921800, -768921796, (int) System.currentTimeMillis());
                        int i63 = i13 + 72;
                        int i64 = i63 ^ (-71);
                        i13 = (((i63 & (-71)) | i64) << 1) - i64;
                        int i65 = A;
                        int i66 = ((i65 & (-88)) | ((~i65) & 87)) + ((i65 & 87) << 1);
                        B = i66 % 128;
                        int i67 = i66 % 2;
                    }
                    int i68 = o2Var5.f57393e;
                    o2Var5.f57403p = new short[i68][][];
                    o2Var5.f57404q = new short[i68][][];
                    o2Var5.f57405r = new short[i68][][];
                    o2Var5.f57406s = new short[i68][][];
                    o2Var5.f57402o = (short[][][]) p2.d(new Object[]{o2Var5.f57409v}, 135398520, -135398515, (int) System.currentTimeMillis());
                    int i69 = A;
                    int i70 = ((i69 ^ 111) | (i69 & 111)) << 1;
                    int i71 = -(((~i69) & 111) | (i69 & (-112)));
                    int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                    B = i72 % 128;
                    int i73 = i72 % 2;
                    int i74 = 0;
                    while (i74 < i68) {
                        int i75 = B;
                        int i76 = i75 & 43;
                        int i77 = (i75 | 43) & (~i76);
                        int i78 = -(-(i76 << 1));
                        int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                        A = i79 % 128;
                        int i80 = i79 % 2;
                        short[][] sArr4 = (short[][]) n2.a(new Object[]{o2Var5.f57409v[i74]}, i15, i14, (int) System.currentTimeMillis());
                        o2Var5.f57403p[i74] = (short[][]) n2.a(new Object[]{sArr4, o2Var5.f57397i}, i38, i37, (int) System.currentTimeMillis());
                        short[][][] sArr5 = o2Var5.f57403p;
                        sArr5[i74] = (short[][]) n2.a(new Object[]{sArr5[i74], o2Var5.f57410w[i74]}, 768921800, -768921796, (int) System.currentTimeMillis());
                        o2Var5.f57404q[i74] = (short[][]) n2.a(new Object[]{sArr4, o2Var5.f57400l}, i38, i37, (int) System.currentTimeMillis());
                        short[][] sArr6 = (short[][]) n2.a(new Object[]{o2Var5.f57410w[i74], o2Var5.f57399k}, i38, i37, (int) System.currentTimeMillis());
                        short[][][] sArr7 = o2Var5.f57404q;
                        sArr7[i74] = (short[][]) n2.a(new Object[]{sArr7[i74], sArr6}, 768921800, -768921796, (int) System.currentTimeMillis());
                        short[][][] sArr8 = o2Var5.f57404q;
                        sArr8[i74] = (short[][]) n2.a(new Object[]{sArr8[i74], o2Var5.f57411x[i74]}, 768921800, -768921796, (int) System.currentTimeMillis());
                        short[][] sArr9 = (short[][]) n2.a(new Object[]{(short[][]) n2.a(new Object[]{o2Var5.f57409v[i74], o2Var5.f57397i}, i38, i37, (int) System.currentTimeMillis()), o2Var5.f57410w[i74]}, 768921800, -768921796, (int) System.currentTimeMillis());
                        short[][] sArr10 = (short[][]) n2.a(new Object[]{o2Var5.f57397i}, -1612271514, 1612271516, (int) System.currentTimeMillis());
                        o2Var5.f57405r[i74] = (short[][]) n2.a(new Object[]{sArr10, sArr9}, i38, i37, (int) System.currentTimeMillis());
                        short[][][] sArr11 = o2Var5.f57405r;
                        sArr11[i74] = (short[][]) n2.a(new Object[]{sArr11[i74], o2Var5.f57412y[i74]}, 768921800, -768921796, (int) System.currentTimeMillis());
                        short[][][] sArr12 = o2Var5.f57405r;
                        sArr12[i74] = (short[][]) n2.a(new Object[]{sArr12[i74]}, -508218991, 508218996, (int) System.currentTimeMillis());
                        o2Var5.f57406s[i74] = (short[][]) n2.a(new Object[]{sArr10, o2Var5.f57404q[i74]}, -680821025, 680821026, (int) System.currentTimeMillis());
                        short[][] sArr13 = (short[][]) n2.a(new Object[]{(short[][]) n2.a(new Object[]{o2Var5.f57410w[i74]}, -1612271514, 1612271516, (int) System.currentTimeMillis()), o2Var5.f57400l}, -680821025, 680821026, (int) System.currentTimeMillis());
                        short[][][] sArr14 = o2Var5.f57406s;
                        sArr14[i74] = (short[][]) n2.a(new Object[]{sArr14[i74], sArr13}, 768921800, -768921796, (int) System.currentTimeMillis());
                        short[][] sArr15 = (short[][]) n2.a(new Object[]{(short[][]) n2.a(new Object[]{o2Var5.f57412y[i74]}, 1976354233, -1976354233, (int) System.currentTimeMillis()), o2Var5.f57399k}, -680821025, 680821026, (int) System.currentTimeMillis());
                        short[][][] sArr16 = o2Var5.f57406s;
                        sArr16[i74] = (short[][]) n2.a(new Object[]{sArr16[i74], sArr15}, 768921800, -768921796, (int) System.currentTimeMillis());
                        short[][][] sArr17 = o2Var5.f57406s;
                        sArr17[i74] = (short[][]) n2.a(new Object[]{sArr17[i74], o2Var5.f57413z[i74]}, 768921800, -768921796, (int) System.currentTimeMillis());
                        int i81 = i74 & 1;
                        int i82 = (i74 ^ 1) | i81;
                        i74 = (i82 | i81) + (i81 & i82);
                        int i83 = (-2) - ((B + 96) ^ (-1));
                        A = i83 % 128;
                        int i84 = i83 % 2;
                        i37 = 680821026;
                        i38 = -680821025;
                        i14 = -1976354233;
                        i15 = 1976354233;
                    }
                    int i85 = A;
                    int i86 = i85 & 71;
                    int i87 = -(-((i85 ^ 71) | i86));
                    int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                    B = i88 % 128;
                    int i89 = i88 % 2;
                }
            }
        }
        return null;
    }
}
