package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class ams implements amo {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f53237y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f53238z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aki f53239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final amv f53240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public amp f53241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f53245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f53246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f53247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f53248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f53249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f53250l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f53251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f53252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f53253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f53254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f53255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f53256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f53257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f53258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f53259v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f53260w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f53261x;

    public ams(aki akiVar) {
        if (akiVar.setY() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        amv amvVar = new amv();
        this.f53239a = akiVar;
        this.f53240b = amvVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00c9 A[PHI: r7 r8
      0x00c9: PHI (r7v48 int) = (r7v47 int), (r7v57 int) binds: [B:10:0x00c7, B:7:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r8v36 byte[]) = (r8v35 byte[]), (r8v39 byte[]) binds: [B:10:0x00c7, B:7:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:15:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x02bd  */
    public static /* synthetic */ void a(Object[] objArr) throws akx {
        byte[] bArr;
        Object onFocusChangeListener;
        ann annVar;
        int i10;
        int i11;
        int i12;
        int iIntValue;
        ams amsVar = (ams) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        akk akkVar = (akk) objArr[2];
        int i13 = f53237y;
        int i14 = i13 ^ 95;
        int i15 = -(-((i13 & 95) << 1));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        f53238z = i16 % 128;
        int i17 = i16 % 2;
        amsVar.f53242d = zBooleanValue;
        amsVar.m = null;
        amsVar.f53243e = true;
        if (akkVar instanceof amt) {
            int i18 = (((i13 ^ 29) | (i13 & 29)) << 1) - (((~i13) & 29) | (i13 & (-30)));
            f53238z = i18 % 128;
            amt amtVar = (amt) akkVar;
            if (i18 % 2 == 0) {
                bArr = (byte[]) amt.setDividerPadding(new Object[]{amtVar}, 1384627484, -1384627484, System.identityHashCode(amtVar));
                amsVar.f53247i = (byte[]) amt.setDividerPadding(new Object[]{amtVar}, 484662606, -484662603, System.identityHashCode(amtVar));
                iIntValue = ((Integer) amt.setDividerPadding(new Object[]{amtVar}, -1668788111, 1668788113, System.identityHashCode(amtVar))).intValue();
                if (iIntValue >= 75) {
                    if (iIntValue <= 128) {
                        int i19 = f53238z;
                        int i20 = (i19 ^ 115) + ((i19 & 115) << 1);
                        f53237y = i20 % 128;
                        int i21 = i20 % 2;
                        if (iIntValue % 8 == 0) {
                            amsVar.f53244f = iIntValue / 8;
                            annVar = (ann) amt.setDividerPadding(new Object[]{amtVar}, -137294833, 137294834, System.identityHashCode(amtVar));
                            int i22 = f53238z;
                            i10 = ((i22 & 74) + (i22 | 74)) - 1;
                            f53237y = i10 % 128;
                        }
                    }
                }
            } else {
                bArr = (byte[]) amt.setDividerPadding(new Object[]{amtVar}, 1384627484, -1384627484, System.identityHashCode(amtVar));
                amsVar.f53247i = (byte[]) amt.setDividerPadding(new Object[]{amtVar}, 484662606, -484662603, System.identityHashCode(amtVar));
                iIntValue = ((Integer) amt.setDividerPadding(new Object[]{amtVar}, -1668788111, 1668788113, System.identityHashCode(amtVar))).intValue();
                if (iIntValue >= 32) {
                    if (iIntValue <= 128) {
                        int i110 = f53238z;
                        int i23 = (i110 ^ 115) + ((i110 & 115) << 1);
                        f53237y = i23 % 128;
                        int i24 = i23 % 2;
                        if (iIntValue % 8 == 0) {
                            amsVar.f53244f = iIntValue / 8;
                            annVar = (ann) amt.setDividerPadding(new Object[]{amtVar}, -137294833, 137294834, System.identityHashCode(amtVar));
                            int i25 = f53238z;
                            i10 = ((i25 & 74) + (i25 | 74)) - 1;
                            f53237y = i10 % 128;
                        }
                    }
                }
            }
            throw new IllegalArgumentException("Invalid value for MAC size: ".concat(String.valueOf(iIntValue)));
        }
        if (!(akkVar instanceof anv)) {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        int i26 = (((i13 ^ 111) | (i13 & 111)) << 1) - (((~i13) & 111) | (i13 & (-112)));
        f53238z = i26 % 128;
        anv anvVar = (anv) akkVar;
        if (i26 % 2 == 0) {
            bArr = (byte[]) anv.setOnFocusChangeListener(new Object[]{anvVar}, 67897191, -67897191, System.identityHashCode(anvVar));
            amsVar.f53247i = null;
            amsVar.f53244f = 22;
            onFocusChangeListener = anv.setOnFocusChangeListener(new Object[]{anvVar}, -169256387, 169256388, System.identityHashCode(anvVar));
        } else {
            bArr = (byte[]) anv.setOnFocusChangeListener(new Object[]{anvVar}, 67897191, -67897191, System.identityHashCode(anvVar));
            amsVar.f53247i = null;
            amsVar.f53244f = 16;
            onFocusChangeListener = anv.setOnFocusChangeListener(new Object[]{anvVar}, -169256387, 169256388, System.identityHashCode(anvVar));
        }
        annVar = (ann) ((akk) onFocusChangeListener);
        int i27 = f53237y;
        i10 = (i27 ^ 115) + ((i27 & 115) << 1);
        f53238z = i10 % 128;
        int i28 = i10 % 2;
        if (!zBooleanValue) {
            int i29 = -(-amsVar.f53244f);
            int i30 = ((~i29) & 16) | (i29 & (-17));
            int i31 = -(-((i29 & 16) << 1));
            i11 = ((i30 | i31) << 1) - (i31 ^ i30);
            int i32 = f53238z;
            int i33 = ((i32 ^ 117) | (i32 & 117)) << 1;
            int i34 = -(((~i32) & 117) | (i32 & (-118)));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f53237y = i35 % 128;
            int i36 = i35 % 2;
        } else {
            int i37 = f53237y;
            int i38 = ((i37 | 11) << 1) - (((~i37) & 11) | (i37 & (-12)));
            int i39 = i38 % 128;
            f53238z = i39;
            int i40 = i38 % 2;
            int i41 = i39 & 3;
            int i42 = i41 + ((i39 ^ 3) | i41);
            f53237y = i42 % 128;
            int i43 = i42 % 2;
            i11 = 16;
        }
        amsVar.f53250l = new byte[i11];
        if (bArr != null) {
            int i44 = f53238z;
            int i45 = i44 + 117;
            f53237y = i45 % 128;
            int i46 = i45 % 2;
            if (bArr.length > 0) {
                if (!(!zBooleanValue)) {
                    int i47 = ((i44 & (-106)) | ((~i44) & 105)) + ((i44 & 105) << 1);
                    int i48 = i47 % 128;
                    f53237y = i48;
                    int i49 = i47 % 2;
                    byte[] bArr2 = amsVar.f53246h;
                    if (bArr2 != null) {
                        int i50 = (i48 | 87) << 1;
                        int i51 = -(((~i48) & 87) | (i48 & (-88)));
                        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                        f53238z = i52 % 128;
                        int i53 = i52 % 2;
                        if (((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr2, bArr}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                            int i54 = f53237y;
                            int i55 = ((i54 ^ 20) + ((i54 & 20) << 1)) - 1;
                            f53238z = i55 % 128;
                            if (i55 % 2 == 0) {
                                throw null;
                            }
                            if (annVar == null) {
                                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                            }
                            byte[] bArr3 = amsVar.f53245g;
                            if (bArr3 != null) {
                                int i56 = (((i54 | 46) << 1) - (i54 ^ 46)) - 1;
                                f53238z = i56 % 128;
                                if (i56 % 2 == 0) {
                                    ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr3, (byte[]) ann.setCompoundDrawableTintBlendMode(new Object[]{annVar}, 1947371801, -1947371801, System.identityHashCode(annVar))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                                    throw null;
                                }
                                if (((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr3, (byte[]) ann.setCompoundDrawableTintBlendMode(new Object[]{annVar}, 1947371801, -1947371801, System.identityHashCode(annVar))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue()) {
                                    throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
                                }
                            }
                        }
                    }
                }
                amsVar.f53246h = bArr;
                if (annVar != null) {
                    int i57 = f53237y;
                    int i58 = i57 & 101;
                    int i59 = -(-((i57 ^ 101) | i58));
                    int i60 = (i58 & i59) + (i59 | i58);
                    f53238z = i60 % 128;
                    int i61 = i60 % 2;
                    amsVar.f53245g = (byte[]) ann.setCompoundDrawableTintBlendMode(new Object[]{annVar}, 1947371801, -1947371801, System.identityHashCode(annVar));
                    int i62 = f53238z;
                    int i63 = (((i62 | 42) << 1) - (i62 ^ 42)) - 1;
                    f53237y = i63 % 128;
                    int i64 = i63 % 2;
                }
                if (annVar != null) {
                    int i65 = f53237y;
                    int i66 = (i65 ^ 9) + ((i65 & 9) << 1);
                    f53238z = i66 % 128;
                    int i67 = i66 % 2;
                    amsVar.f53239a.setDividerPadding(annVar);
                    byte[] bArr4 = new byte[16];
                    amsVar.f53248j = bArr4;
                    amsVar.f53239a.setDividerPadding(bArr4, 0, bArr4, 0);
                    amsVar.f53240b.setY(amsVar.f53248j);
                    amsVar.f53241c = null;
                    int i68 = f53237y;
                    int i69 = ((i68 | 85) << 1) - (i68 ^ 85);
                    f53238z = i69 % 128;
                    int i70 = i69 % 2;
                } else if (amsVar.f53248j == null) {
                    throw new IllegalArgumentException("Key must be specified in initial init");
                }
                byte[] bArr5 = new byte[16];
                amsVar.f53249k = bArr5;
                byte[] bArr6 = amsVar.f53246h;
                if (bArr6.length == 12) {
                    int i71 = f53237y + 111;
                    f53238z = i71 % 128;
                    int i72 = i71 % 2;
                    System.arraycopy(bArr6, 0, bArr5, 0, bArr6.length);
                    amsVar.f53249k[15] = 1;
                    int i73 = f53238z;
                    i12 = (-2) - (((i73 ^ 16) + ((i73 & 16) << 1)) ^ (-1));
                } else {
                    int length = bArr6.length;
                    setOnFocusChangeListener(new Object[]{amsVar, bArr5, bArr6, Integer.valueOf(length)}, 645765407, -645765399, length);
                    byte[] bArr7 = new byte[16];
                    ber.setDividerPadding(new Object[]{Long.valueOf(((long) amsVar.f53246h.length) << 3), bArr7, 8}, 108647497, -108647488, 8);
                    setOnFocusChangeListener(new Object[]{amsVar, amsVar.f53249k, bArr7}, 1254940572, -1254940563, System.identityHashCode(amsVar));
                    int i74 = f53238z;
                    int i75 = ((i74 | 78) << 1) - (i74 ^ 78);
                    i12 = (i75 ^ (-1)) + (i75 << 1);
                }
                f53237y = i12 % 128;
                int i76 = i12 % 2;
                amsVar.f53251n = new byte[16];
                amsVar.f53252o = new byte[16];
                amsVar.f53253p = new byte[16];
                amsVar.f53258u = new byte[16];
                amsVar.f53259v = 0;
                amsVar.f53260w = 0L;
                amsVar.f53261x = 0L;
                amsVar.f53254q = (byte[]) bek.setOnFocusChangeListener(new Object[]{amsVar.f53249k}, -150521869, 150521882, (int) System.currentTimeMillis());
                amsVar.f53255r = -2;
                amsVar.f53256s = 0;
                amsVar.f53257t = 0L;
                byte[] bArr8 = amsVar.f53247i;
                if (bArr8 != null) {
                    int i77 = f53238z;
                    int i78 = i77 & 123;
                    int i79 = (i77 ^ 123) | i78;
                    int i80 = (i78 & i79) + (i79 | i78);
                    f53237y = i80 % 128;
                    if (i80 % 2 != 0) {
                        setOnFocusChangeListener(new Object[]{amsVar, bArr8, 0, Integer.valueOf(bArr8.length)}, 1267211149, -1267211143, 0);
                    } else {
                        setOnFocusChangeListener(new Object[]{amsVar, bArr8, 0, Integer.valueOf(bArr8.length)}, 1267211149, -1267211143, 0);
                    }
                    int i81 = f53237y + 71;
                    f53238z = i81 % 128;
                    int i82 = i81 % 2;
                }
                int i83 = f53238z + 41;
                f53237y = i83 % 128;
                int i84 = i83 % 2;
                return;
            }
        }
        throw new IllegalArgumentException("IV must be at least 1 byte");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:13:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0121  */
    /* JADX WARN: Code duplicated, block: B:16:0x0123  */
    /* JADX WARN: Code duplicated, block: B:17:0x01de  */
    /* JADX WARN: Code duplicated, block: B:9:0x005d  */
    public static /* synthetic */ void b(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        ams amsVar = (ams) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i14 = f53238z;
        int i15 = (((i14 & (-88)) | ((~i14) & 87)) - (~(-(-((i14 & 87) << 1))))) - 1;
        f53237y = i15 % 128;
        if (i15 % 2 != 0) {
            setOnFocusChangeListener(new Object[]{amsVar}, -1288354565, 1288354579, System.identityHashCode(amsVar));
            int i16 = 68 / 0;
            if (amsVar.f53259v > 0) {
                i10 = amsVar.f53259v;
                int i17 = -i10;
                int i18 = i17 * (-563);
                int i19 = (-2) - (((i18 ^ 9041) + ((i18 & 9041) << 1)) ^ (-1));
                int i20 = ~i17;
                int i21 = (i20 | i17) & i20;
                i11 = ~iIntValue;
                int i22 = (-17) & i11;
                int i23 = (~i22) & ((-17) | i11);
                int i24 = ~((i23 ^ i22) | (i23 & i22));
                int i25 = (i24 & i21) | (i21 ^ i24);
                int i26 = iIntValue ^ 16;
                int i27 = iIntValue & 16;
                int i28 = ~((i26 ^ i27) | (i26 & i27));
                int i29 = i25 & i28;
                int i30 = (~i29) & (i25 | i28);
                int i31 = -(-(((i30 & i29) | (i30 ^ i29)) * (-564)));
                int i32 = i19 & i31;
                int i33 = (i31 ^ i19) | i32;
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                int i35 = i20 & 16;
                int i36 = (~i35) & (i20 | 16);
                int i37 = (i35 & i36) | (i36 ^ i35);
                int i38 = (i37 & i11) | ((~i37) & iIntValue);
                int i39 = i37 & iIntValue;
                int i40 = ((~((i39 & i38) | (i38 ^ i39))) * 1128) + i34;
                int i41 = (i21 ^ i11) | (i21 & i11);
                int i42 = ~i41;
                int i43 = (i41 | i42) & i42;
                int i44 = i17 & 16;
                int i45 = (~i44) & (i17 | 16);
                int i46 = ~((i44 & i45) | (i45 ^ i44));
                int i47 = ((i43 & i46) | (i43 ^ i46)) * 564;
                i12 = ((((i40 ^ i47) | (i40 & i47)) << 1) - (~(-(((~i40) & i47) | ((~i47) & i40))))) - 1;
                if (iIntValue2 < i12) {
                    int i48 = f53238z;
                    int i49 = (-2) - (((i48 & 74) + (i48 | 74)) ^ (-1));
                    f53237y = i49 % 128;
                    int i50 = i49 % 2;
                    System.arraycopy(bArr, 0, amsVar.f53258u, i10, iIntValue2);
                    int i51 = amsVar.f53259v;
                    int i52 = -(-iIntValue2);
                    int i53 = i51 & i52;
                    amsVar.f53259v = (((i51 ^ i52) | i53) << 1) - ((i51 | i52) & (~i53));
                    int i54 = f53238z;
                    int i55 = i54 & 117;
                    i13 = (((i54 | 117) & (~i55)) - (~(-(-(i55 << 1))))) - 1;
                    f53237y = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                System.arraycopy(bArr, 0, amsVar.f53258u, i10, i12);
                setOnFocusChangeListener(new Object[]{amsVar, amsVar.f53252o, amsVar.f53258u}, 1254940572, -1254940563, System.identityHashCode(amsVar));
                amsVar.f53260w += 16;
                int i56 = -i12;
                int i57 = i56 * 236;
                int i58 = -(-(iIntValue2 * 471));
                int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                int i60 = ~i56;
                int i61 = i60 & i11;
                int i62 = (~i61) & (i60 | i11);
                int i63 = (i61 & i62) | (i62 ^ i61);
                int i64 = ~i63;
                int i65 = (i63 | i64) & i64;
                int i66 = iIntValue2 & i65;
                int i67 = (i65 | iIntValue2) & (~i66);
                int i68 = -(-(((i67 & i66) | (i67 ^ i66)) * (-235)));
                int i69 = i59 ^ i68;
                int i70 = ((i68 & i59) | i69) << 1;
                int i71 = -i69;
                int i72 = (i70 & i71) + (i70 | i71);
                int i73 = i60 & (i60 | i56);
                int i74 = i73 & iIntValue;
                int i75 = (~i74) & (i73 | iIntValue);
                int i76 = (i74 & i75) | (i75 ^ i74);
                int i77 = ~i76;
                int i78 = (i76 | i77) & i77;
                int i79 = (~i78) & iIntValue2;
                int i80 = ~iIntValue2;
                int i81 = i79 | (i78 & i80);
                int i82 = i78 & iIntValue2;
                int i83 = -(~(-(-(((i82 & i81) | (i81 ^ i82)) * (-470)))));
                int i84 = ((i72 ^ i83) + ((i83 & i72) << 1)) - 1;
                int i85 = i80 ^ i56;
                int i86 = i56 & i80;
                int i87 = ~((i86 & i85) | (i85 ^ i86));
                int i88 = (i73 & iIntValue2) | (i73 ^ iIntValue2);
                int i89 = (i88 & i11) | ((~i88) & iIntValue);
                int i90 = i88 & iIntValue;
                int i91 = (i90 & i89) | (i89 ^ i90);
                int i92 = ~i91;
                int i93 = (i91 | i92) & i92;
                int i94 = ((~i93) & i87) | ((~i87) & i93);
                int i95 = i87 & i93;
                int i96 = ((i95 & i94) | (i94 ^ i95)) * 235;
                int i97 = i84 & i96;
                int i98 = -(-((i96 ^ i84) | i97));
                iIntValue2 = (i97 & i98) + (i98 | i97);
                int i99 = f53237y;
                int i100 = (i99 & 109) + (i99 | 109);
                f53238z = i100 % 128;
                int i101 = i100 % 2;
            } else {
                i12 = iIntValue;
            }
        } else {
            setOnFocusChangeListener(new Object[]{amsVar}, -1288354565, 1288354579, System.identityHashCode(amsVar));
            if (amsVar.f53259v > 0) {
                i10 = amsVar.f53259v;
                int i110 = -i10;
                int i111 = i110 * (-563);
                int i112 = (-2) - (((i111 ^ 9041) + ((i111 & 9041) << 1)) ^ (-1));
                int i210 = ~i110;
                int i211 = (i210 | i110) & i210;
                i11 = ~iIntValue;
                int i212 = (-17) & i11;
                int i213 = (~i212) & ((-17) | i11);
                int i214 = ~((i213 ^ i212) | (i213 & i212));
                int i215 = (i214 & i211) | (i211 ^ i214);
                int i216 = iIntValue ^ 16;
                int i217 = iIntValue & 16;
                int i218 = ~((i216 ^ i217) | (i216 & i217));
                int i219 = i215 & i218;
                int i310 = (~i219) & (i215 | i218);
                int i311 = -(-(((i310 & i219) | (i310 ^ i219)) * (-564)));
                int i312 = i112 & i311;
                int i313 = (i311 ^ i112) | i312;
                int i314 = (i312 ^ i313) + ((i313 & i312) << 1);
                int i315 = i210 & 16;
                int i316 = (~i315) & (i210 | 16);
                int i317 = (i315 & i316) | (i316 ^ i315);
                int i318 = (i317 & i11) | ((~i317) & iIntValue);
                int i319 = i317 & iIntValue;
                int i410 = ((~((i319 & i318) | (i318 ^ i319))) * 1128) + i314;
                int i411 = (i211 ^ i11) | (i211 & i11);
                int i412 = ~i411;
                int i413 = (i411 | i412) & i412;
                int i414 = i110 & 16;
                int i415 = (~i414) & (i110 | 16);
                int i416 = ~((i414 & i415) | (i415 ^ i414));
                int i417 = ((i413 & i416) | (i413 ^ i416)) * 564;
                i12 = ((((i410 ^ i417) | (i410 & i417)) << 1) - (~(-(((~i410) & i417) | ((~i417) & i410))))) - 1;
                if (iIntValue2 < i12) {
                    int i418 = f53238z;
                    int i419 = (-2) - (((i418 & 74) + (i418 | 74)) ^ (-1));
                    f53237y = i419 % 128;
                    int i510 = i419 % 2;
                    System.arraycopy(bArr, 0, amsVar.f53258u, i10, iIntValue2);
                    int i511 = amsVar.f53259v;
                    int i512 = -(-iIntValue2);
                    int i513 = i511 & i512;
                    amsVar.f53259v = (((i511 ^ i512) | i513) << 1) - ((i511 | i512) & (~i513));
                    int i514 = f53238z;
                    int i515 = i514 & 117;
                    i13 = (((i514 | 117) & (~i515)) - (~(-(-(i515 << 1))))) - 1;
                    f53237y = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                System.arraycopy(bArr, 0, amsVar.f53258u, i10, i12);
                setOnFocusChangeListener(new Object[]{amsVar, amsVar.f53252o, amsVar.f53258u}, 1254940572, -1254940563, System.identityHashCode(amsVar));
                amsVar.f53260w += 16;
                int i516 = -i12;
                int i517 = i516 * 236;
                int i518 = -(-(iIntValue2 * 471));
                int i519 = ((i517 | i518) << 1) - (i517 ^ i518);
                int i610 = ~i516;
                int i611 = i610 & i11;
                int i612 = (~i611) & (i610 | i11);
                int i613 = (i611 & i612) | (i612 ^ i611);
                int i614 = ~i613;
                int i615 = (i613 | i614) & i614;
                int i616 = iIntValue2 & i615;
                int i617 = (i615 | iIntValue2) & (~i616);
                int i618 = -(-(((i617 & i616) | (i617 ^ i616)) * (-235)));
                int i619 = i519 ^ i618;
                int i710 = ((i618 & i519) | i619) << 1;
                int i711 = -i619;
                int i712 = (i710 & i711) + (i710 | i711);
                int i713 = i610 & (i610 | i516);
                int i714 = i713 & iIntValue;
                int i715 = (~i714) & (i713 | iIntValue);
                int i716 = (i714 & i715) | (i715 ^ i714);
                int i717 = ~i716;
                int i718 = (i716 | i717) & i717;
                int i719 = (~i718) & iIntValue2;
                int i810 = ~iIntValue2;
                int i811 = i719 | (i718 & i810);
                int i812 = i718 & iIntValue2;
                int i813 = -(~(-(-(((i812 & i811) | (i811 ^ i812)) * (-470)))));
                int i814 = ((i712 ^ i813) + ((i813 & i712) << 1)) - 1;
                int i815 = i810 ^ i516;
                int i816 = i516 & i810;
                int i817 = ~((i816 & i815) | (i815 ^ i816));
                int i818 = (i713 & iIntValue2) | (i713 ^ iIntValue2);
                int i819 = (i818 & i11) | ((~i818) & iIntValue);
                int i910 = i818 & iIntValue;
                int i911 = (i910 & i819) | (i819 ^ i910);
                int i912 = ~i911;
                int i913 = (i911 | i912) & i912;
                int i914 = ((~i913) & i817) | ((~i817) & i913);
                int i915 = i817 & i913;
                int i916 = ((i915 & i914) | (i914 ^ i915)) * 235;
                int i917 = i814 & i916;
                int i918 = -(-((i916 ^ i814) | i917));
                iIntValue2 = (i917 & i918) + (i918 | i917);
                int i919 = f53237y;
                int i102 = (i919 & 109) + (i919 | 109);
                f53238z = i102 % 128;
                int i103 = i102 % 2;
            } else {
                i12 = iIntValue;
            }
        }
        int i104 = -(-iIntValue2);
        int i105 = (i12 ^ i104) + ((i104 & i12) << 1);
        int i106 = i105 & (-16);
        int i107 = (i105 | (-16)) & (~i106);
        int i108 = -(-(i106 << 1));
        int i109 = (i107 ^ i108) + ((i108 & i107) << 1);
        int i113 = f53238z;
        int i114 = (i113 & 93) + (i113 | 93);
        f53237y = i114 % 128;
        int i115 = i114 % 2;
        while (i12 <= i109) {
            int i116 = (-2) - ((f53238z + 48) ^ (-1));
            f53237y = i116 % 128;
            int i117 = i116 % 2;
            setOnFocusChangeListener(new Object[]{amsVar, amsVar.f53252o, bArr, Integer.valueOf(i12)}, 227091991, -227091978, i12);
            amsVar.f53260w += 16;
            int i118 = i12 & 16;
            int i119 = ((i12 ^ 16) | i118) << 1;
            int i120 = -((~i118) & (i12 | 16));
            i12 = (i119 ^ i120) + ((i119 & i120) << 1);
            int i121 = f53237y;
            int i122 = (i121 | 33) << 1;
            int i123 = -(i121 ^ 33);
            int i124 = (i122 ^ i123) + ((i123 & i122) << 1);
            f53238z = i124 % 128;
            int i125 = i124 % 2;
        }
        int i126 = -(-(i109 * 965));
        int i127 = (-16372) & i126;
        int i128 = (((-16372) ^ i126) | i127) << 1;
        int i129 = -((i126 | (-16372)) & (~i127));
        int i130 = (i128 & i129) + (i129 | i128);
        int i131 = ~i109;
        int i132 = (i109 | i131) & i131;
        int i133 = i132 & iIntValue;
        int i134 = (i132 | iIntValue) & (~i133);
        int i135 = ~iIntValue;
        int i136 = ~(i134 | i133);
        int i137 = (-17) & i136;
        int i138 = (i136 | (-17)) & (~i137);
        int i139 = -(-(((i138 & i137) | (i138 ^ i137)) * (-964)));
        int i140 = (i130 & i139) + (i130 | i139);
        int i141 = (iIntValue | i135) & i135;
        int i142 = ((~i141) & i131) | ((~i131) & i141);
        int i143 = i141 & i131;
        int i144 = ~((i143 & i142) | (i142 ^ i143));
        int i145 = i131 & 16;
        int i146 = (i131 | 16) & (~i145);
        int i147 = ~((i146 & i145) | (i146 ^ i145));
        int i148 = i144 & i147;
        int i149 = (i147 | i144) & (~i148);
        int i150 = ((i149 & i148) | (i149 ^ i148)) * (-964);
        int i151 = i140 & i150;
        int i152 = (i150 | i140) & (~i151);
        int i153 = i151 << 1;
        int i154 = (i152 & i153) + (i152 | i153);
        int i155 = -i12;
        int i156 = (i154 & i155) + (i155 | i154);
        amsVar.f53259v = i156;
        System.arraycopy(bArr, i12, amsVar.f53258u, 0, i156);
        int i157 = (-2) - ((f53238z + 102) ^ (-1));
        f53237y = i157 % 128;
        int i158 = i157 % 2;
    }

    public static /* synthetic */ void c(Object[] objArr) throws akx {
        ams amsVar = (ams) objArr[0];
        int i10 = f53237y;
        int i11 = ((i10 & (-102)) | ((~i10) & 101)) + ((i10 & 101) << 1);
        f53238z = i11 % 128;
        int i12 = i11 % 2;
        amsVar.f53239a.setOnFocusChangeListener();
        amsVar.f53251n = new byte[16];
        amsVar.f53252o = new byte[16];
        amsVar.f53253p = new byte[16];
        amsVar.f53258u = new byte[16];
        amsVar.f53259v = 0;
        amsVar.f53260w = 0L;
        amsVar.f53261x = 0L;
        amsVar.f53254q = (byte[]) bek.setOnFocusChangeListener(new Object[]{amsVar.f53249k}, -150521869, 150521882, (int) System.currentTimeMillis());
        amsVar.f53255r = -2;
        amsVar.f53256s = 0;
        amsVar.f53257t = 0L;
        byte[] bArr = amsVar.f53250l;
        if (bArr != null) {
            int i13 = f53238z;
            int i14 = ((i13 & 94) + (i13 | 94)) - 1;
            f53237y = i14 % 128;
            if (i14 % 2 != 0) {
                bek.setOnFocusChangeListener(new Object[]{bArr}, -949833373, 949833375, (int) System.currentTimeMillis());
                throw null;
            }
            bek.setOnFocusChangeListener(new Object[]{bArr}, -949833373, 949833375, (int) System.currentTimeMillis());
            int i15 = f53237y;
            int i16 = (((i15 | 120) << 1) - (i15 ^ 120)) - 1;
            f53238z = i16 % 128;
            int i17 = i16 % 2;
        }
        if (amsVar.f53242d) {
            int i18 = f53237y;
            int i19 = i18 & 85;
            int i20 = i19 + ((i18 ^ 85) | i19);
            int i21 = i20 % 128;
            f53238z = i21;
            int i22 = i20 % 2;
            amsVar.f53243e = false;
            int i23 = (i21 | 55) << 1;
            int i24 = -(((~i21) & 55) | (i21 & (-56)));
            int i25 = (i23 & i24) + (i23 | i24);
            f53237y = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 39 / 0;
                return;
            }
            return;
        }
        byte[] bArr2 = amsVar.f53247i;
        if (bArr2 != null) {
            int i27 = f53237y;
            int i28 = (i27 ^ 65) + ((i27 & 65) << 1);
            f53238z = i28 % 128;
            int i29 = i28 % 2;
            setOnFocusChangeListener(new Object[]{amsVar, bArr2, 0, Integer.valueOf(bArr2.length)}, 1267211149, -1267211143, 0);
            int i30 = f53237y + 7;
            f53238z = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = f53238z;
        int i33 = (((i32 | 107) << 1) - (~(-(((~i32) & 107) | (i32 & (-108)))))) - 1;
        f53237y = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 34 / 0;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        ams amsVar = (ams) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        int i10 = f53237y;
        int i11 = i10 & 117;
        int i12 = i10 | 117;
        int i13 = (i11 & i12) + (i12 | i11);
        f53238z = i13 % 128;
        if (i13 % 2 == 0) {
            amu.setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2}, 1367451466, -1367451462, (int) System.currentTimeMillis());
            amsVar.f53240b.setCompoundDrawableTintBlendMode(bArr);
            throw null;
        }
        amu.setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2}, 1367451466, -1367451462, (int) System.currentTimeMillis());
        amsVar.f53240b.setCompoundDrawableTintBlendMode(bArr);
        int i14 = f53237y + 39;
        f53238z = i14 % 128;
        int i15 = i14 % 2;
    }

    public static /* synthetic */ void e(Object[] objArr) {
        int i10;
        ams amsVar = (ams) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        byte[] bArr2 = (byte[]) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i11 = f53238z;
        int i12 = i11 + 117;
        f53237y = i12 % 128;
        int i13 = i12 % 2;
        int length = bArr2.length;
        int i14 = -iIntValue2;
        int i15 = i14 * 55;
        int i16 = -(-(length * (-107)));
        int i17 = i15 & i16;
        int i18 = (i15 ^ i16) | i17;
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        int i20 = ~i14;
        int i21 = (i20 ^ length) | (i20 & length);
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = ~iIntValue;
        int i25 = ~length;
        int i26 = (i24 & i25) | ((~i24) & length);
        int i27 = i24 & length;
        int i28 = ~((i26 ^ i27) | (i26 & i27));
        int i29 = (((i23 ^ i28) | (i28 & i23)) * (-108)) + i19;
        int i30 = i20 & iIntValue;
        int i31 = (~i30) & (i20 | iIntValue);
        int i32 = ~((i31 ^ i30) | (i30 & i31));
        int i33 = (length | i25) & i25;
        int i34 = (i20 & i33) | ((~i33) & i14);
        int i35 = i33 & i14;
        int i36 = (i35 & i34) | (i34 ^ i35);
        int i37 = ~i36;
        int i38 = (i36 | i37) & i37;
        int i39 = i32 & i38;
        int i40 = (i38 | i32) & (~i39);
        int i41 = (i40 & i39) | (i40 ^ i39);
        int i42 = i24 ^ i14;
        int i43 = i24 & i14;
        int i44 = ~((i42 & i43) | (i42 ^ i43));
        int i45 = i41 & i44;
        int i46 = (((i41 | i44) & (~i45)) | i45) * 54;
        int i47 = i29 & i46;
        int i48 = (i47 - (~((i29 ^ i46) | i47))) - 1;
        int i49 = i25 & i14;
        int i50 = (i25 | i14) & (~i49);
        int i51 = ~((i49 & i50) | (i50 ^ i49));
        int i52 = iIntValue ^ i51;
        int i53 = i51 & iIntValue;
        int i54 = ((i53 & i52) | (i52 ^ i53)) * 54;
        int i55 = ((~i54) & i48) | ((~i48) & i54);
        int i56 = (i54 & i48) << 1;
        if ((i55 ^ i56) + ((i56 & i55) << 1) < 16) {
            throw new ald("Output buffer too short");
        }
        if (amsVar.f53257t == 0) {
            int i57 = i11 + 109;
            f53237y = i57 % 128;
            if (i57 % 2 != 0) {
                setOnFocusChangeListener(new Object[]{amsVar}, 503726356, -503726346, System.identityHashCode(amsVar));
                throw null;
            }
            i10 = 0;
            setOnFocusChangeListener(new Object[]{amsVar}, 503726356, -503726346, System.identityHashCode(amsVar));
        } else {
            i10 = 0;
        }
        byte[] bArr3 = new byte[16];
        Object[] objArr2 = new Object[2];
        objArr2[i10] = amsVar;
        objArr2[1] = bArr3;
        setOnFocusChangeListener(objArr2, 1338453980, -1338453969, System.identityHashCode(amsVar));
        Object[] objArr3 = new Object[3];
        objArr3[i10] = bArr3;
        objArr3[1] = bArr;
        objArr3[2] = Integer.valueOf(iIntValue);
        amu.setCompoundDrawableTintBlendMode(objArr3, -1690911169, 1690911187, iIntValue);
        byte[] bArr4 = amsVar.f53251n;
        Object[] objArr4 = new Object[3];
        objArr4[i10] = amsVar;
        objArr4[1] = bArr4;
        objArr4[2] = bArr3;
        setOnFocusChangeListener(objArr4, 1254940572, -1254940563, System.identityHashCode(amsVar));
        System.arraycopy(bArr3, i10, bArr2, iIntValue2, 16);
        amsVar.f53257t += 16;
        int i58 = f53238z;
        int i59 = (i58 ^ 111) + ((i58 & 111) << 1);
        f53237y = i59 % 128;
        int i60 = i59 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0196, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0198, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01a2, code lost:
    
        throw new java.lang.IllegalStateException("Attempt to process too many blocks");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1.f53255r != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1.f53255r != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r3 = r1.f53255r;
        r4 = r3 ^ (-1);
        r1.f53255r = (((r3 | r4) << 1) - (~(-r4))) - 1;
        r3 = r1.f53254q;
        r5 = r3[15];
        r6 = ((r5 & 255) ^ 1) + ((r5 & 1) << 1);
        r3[15] = (byte) r6;
        r4 = r6 >>> 8;
        r3 = r3[14] & 255;
        r6 = java.lang.System.identityHashCode(r1);
        r7 = r3 * 450;
        r8 = -(~(-(-(r4 * (-448)))));
        r9 = ((r7 & r8) + (r7 | r8)) - 1;
        r7 = ~r3;
        r8 = (r7 | r3) & r7;
        r10 = ~r4;
        r11 = (r8 & r10) | ((~r8) & r4);
        r8 = r8 & r4;
        r8 = ~((r8 & r11) | (r11 ^ r8));
        r11 = ((r10 & r7) | ((~r10) & r3)) | (r10 & r3);
        r11 = (r11 & r6) | (r11 ^ r6);
        r12 = ~r11;
        r11 = (r11 | r12) & r12;
        r12 = ((~r11) & r8) | ((~r8) & r11);
        r8 = r8 & r11;
        r8 = ((r8 & r12) | (r12 ^ r8)) * 449;
        r11 = (((~r8) & r9) | ((~r9) & r8)) + ((r8 & r9) << 1);
        r9 = r7 & r4;
        r8 = -(-((~((r7 ^ r4) | r9)) * (-1347)));
        r12 = r11 & r8;
        r8 = -(-((r8 ^ r11) | r12));
        r11 = (r12 ^ r8) + ((r8 & r12) << 1);
        r4 = (r4 | r7) & (~r9);
        r4 = (r4 & r9) | (r4 ^ r9);
        r7 = ~r4;
        r4 = (r4 | r7) & r7;
        r6 = ~r6;
        r7 = r10 & r6;
        r6 = (r6 | r10) & (~r7);
        r6 = (r6 & r7) | (r6 ^ r7);
        r7 = r6 & r3;
        r3 = ((r3 | r6) & (~r7)) | r7;
        r6 = ~r3;
        r3 = (r3 | r6) & r6;
        r6 = ((~r3) & r4) | ((~r4) & r3);
        r3 = r3 & r4;
        r3 = ((r3 & r6) | (r6 ^ r3)) * 449;
        r4 = (r11 ^ r3) + ((r3 & r11) << 1);
        r3 = r1.f53254q;
        r3[14] = (byte) r4;
        r4 = r4 >>> 8;
        r3 = r3[13] & 255;
        r6 = java.lang.System.identityHashCode(r1);
        r7 = (r3 * (-167)) - (~(-(-(r4 * (-167)))));
        r8 = (r7 ^ (-1)) + (r7 << 1);
        r7 = ~r3;
        r9 = ~r4;
        r10 = r7 ^ r9;
        r11 = r7 & r9;
        r10 = ~((r10 & r11) | (r10 ^ r11));
        r9 = r9 & (r9 | r4);
        r11 = ~r6;
        r12 = (r9 & r11) | ((~r9) & r6);
        r13 = r9 & r6;
        r12 = ~((r12 & r13) | (r12 ^ r13));
        r10 = -(-(((r10 & r12) | (((~r12) & r10) | ((~r10) & r12))) * 336));
        r12 = ((((r8 ^ r10) | (r8 & r10)) << 1) - (~(-(((~r8) & r10) | ((~r10) & r8))))) - 1;
        r8 = r3 & r4;
        r4 = (r4 | r3) & (~r8);
        r4 = ~((r4 & r8) | (r4 ^ r8));
        r6 = (r6 & r3) | (r3 ^ r6);
        r8 = ~r6;
        r6 = (r6 | r8) & r8;
        r4 = -(-(((r4 & r6) | (((~r6) & r4) | ((~r4) & r6))) * (-168)));
        r8 = r12 & r4;
        r6 = ((r12 ^ r4) | r8) << 1;
        r4 = -((r4 | r12) & (~r8));
        r8 = ((r6 | r4) << 1) - (r4 ^ r6);
        r4 = (r11 & r7) | ((~r11) & r3);
        r3 = r3 & r11;
        r3 = ~((r3 & r4) | (r4 ^ r3));
        r3 = -(-(((r3 & r9) | (r9 ^ r3)) * 168));
        r4 = ((~r3) & r8) | ((~r8) & r3);
        r3 = (r3 & r8) << 1;
        r6 = (r4 ^ r3) + ((r3 & r4) << 1);
        r3 = r1.f53254q;
        r3[13] = (byte) r6;
        r4 = r6 >>> 8;
        r6 = -(-(r3[12] & 255));
        r3[12] = (byte) (((r4 | r6) << 1) - (r4 ^ r6));
        r1.f53239a.setDividerPadding(r3, 0, r15, 0);
        r15 = com.mypinpad.tsdk.isolation.ams.f53238z;
        r0 = r15 ^ 107;
        r15 = -(-((r15 & 107) << 1));
        r1 = (r0 & r15) + (r15 | r0);
        com.mypinpad.tsdk.isolation.ams.f53237y = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void f(java.lang.Object[] r15) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ams.f(java.lang.Object[]):void");
    }

    public static /* synthetic */ void g(Object[] objArr) {
        char c10;
        ams amsVar = (ams) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        byte[] bArr2 = (byte[]) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i10 = f53237y;
        int i11 = (i10 ^ 23) + ((i10 & 23) << 1);
        int i12 = i11 % 128;
        f53238z = i12;
        int i13 = i11 % 2;
        int length = bArr2.length;
        int i14 = -iIntValue2;
        int i15 = i14 * (-317);
        int i16 = -(-(length * 319));
        int i17 = ((((i15 ^ i16) | (i15 & i16)) << 1) - (~(-(((~i16) & i15) | ((~i15) & i16))))) - 1;
        int i18 = ~i14;
        int i19 = ~length;
        int i20 = (i18 ^ i19) | (i18 & i19);
        int i21 = ~((i20 ^ iIntValue) | (i20 & iIntValue));
        int i22 = ~iIntValue;
        int i23 = (i22 & i18) | ((~i22) & i14);
        int i24 = i22 & i14;
        int i25 = (i23 ^ i24) | (i23 & i24);
        int i26 = ~((i25 & length) | (i25 & i19) | ((~i25) & length));
        int i27 = (i17 - (~(((i26 & i21) | (i21 ^ i26)) * (-318)))) - 1;
        int i28 = (i19 | length) & i19;
        int i29 = ~((i28 & i18) | ((~i28) & i14) | (i28 & i14));
        int i30 = iIntValue & i18;
        int i31 = i24 | i30;
        int i32 = i14 & iIntValue;
        int i33 = ~((i31 & i32) | (i31 ^ i32));
        int i34 = ((~i33) & i29) | ((~i29) & i33);
        int i35 = i29 & i33;
        int i36 = -(-(((i35 & i34) | (i34 ^ i35)) * (-318)));
        int i37 = i27 & i36;
        int i38 = ((i27 ^ i36) | i37) << 1;
        int i39 = -((i36 | i27) & (~i37));
        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
        int i41 = ~(((~i30) & (i18 | iIntValue)) | i30);
        int i42 = i28 ^ i41;
        int i43 = i28 & i41;
        int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        int i45 = i40 & i44;
        int i46 = -(-(i44 | i40));
        if (((i45 | i46) << 1) - (i46 ^ i45) < 16) {
            throw new ald("Output buffer too short");
        }
        if (amsVar.f53257t == 0) {
            int i47 = i12 + 108;
            int i48 = (i47 ^ (-1)) + (i47 << 1);
            f53237y = i48 % 128;
            if (i48 % 2 != 0) {
                c10 = 0;
                setOnFocusChangeListener(new Object[]{amsVar}, 503726356, -503726346, System.identityHashCode(amsVar));
                int i49 = 12 / 0;
            } else {
                c10 = 0;
                setOnFocusChangeListener(new Object[]{amsVar}, 503726356, -503726346, System.identityHashCode(amsVar));
            }
        } else {
            c10 = 0;
        }
        byte[] bArr3 = new byte[16];
        Object[] objArr2 = new Object[2];
        objArr2[c10] = amsVar;
        objArr2[1] = bArr3;
        setOnFocusChangeListener(objArr2, 1338453980, -1338453969, System.identityHashCode(amsVar));
        byte[] bArr4 = amsVar.f53251n;
        Object[] objArr3 = new Object[4];
        objArr3[c10] = amsVar;
        objArr3[1] = bArr4;
        objArr3[2] = bArr;
        objArr3[3] = Integer.valueOf(iIntValue);
        setOnFocusChangeListener(objArr3, 227091991, -227091978, iIntValue);
        Object[] objArr4 = new Object[5];
        objArr4[c10] = bArr3;
        objArr4[1] = bArr;
        objArr4[2] = Integer.valueOf(iIntValue);
        objArr4[3] = bArr2;
        objArr4[4] = Integer.valueOf(iIntValue2);
        amu.setCompoundDrawableTintBlendMode(objArr4, 108747681, -108747676, iIntValue);
        amsVar.f53257t += 16;
        int i50 = f53237y;
        int i51 = (i50 & 27) + (i50 | 27);
        f53238z = i51 % 128;
        int i52 = i51 % 2;
    }

    public static /* synthetic */ void h(Object[] objArr) {
        ams amsVar = (ams) objArr[0];
        int i10 = f53237y;
        int i11 = i10 + 3;
        f53238z = i11 % 128;
        if (i11 % 2 == 0) {
            boolean z10 = amsVar.f53243e;
            throw null;
        }
        if (!amsVar.f53243e) {
            if (!amsVar.f53242d) {
                throw new IllegalStateException("GCM cipher needs to be initialised");
            }
            throw new IllegalStateException("GCM cipher cannot be reused for encryption");
        }
        int i12 = i10 ^ 69;
        int i13 = ((((i10 & 69) | i12) << 1) - (~(-i12))) - 1;
        f53238z = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Integer i(Object[] objArr) {
        ams amsVar = (ams) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f53237y;
        int i11 = ((i10 | 107) << 1) - (i10 ^ 107);
        int i12 = i11 % 128;
        f53238z = i12;
        int i13 = i11 % 2;
        int i14 = amsVar.f53256s;
        int i15 = iIntValue & i14;
        int i16 = (i14 | iIntValue) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        if (!(!amsVar.f53242d)) {
            int i19 = i10 + 57;
            int i20 = i19 % 128;
            f53238z = i20;
            int i21 = i19 % 2;
            int i22 = amsVar.f53244f;
            int i23 = i22 * 881;
            int i24 = -(-(i18 * 881));
            int i25 = i23 & i24;
            int i26 = ((i23 ^ i24) | i25) << 1;
            int i27 = -((i23 | i24) & (~i25));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            int i29 = ~i22;
            int i30 = ~i18;
            int i31 = i29 ^ i30;
            int i32 = i29 & i30;
            int i33 = ~((i31 & i32) | (i31 ^ i32));
            int i34 = i29 & (i29 | i22);
            int i35 = ~((i34 ^ iIntValue) | (i34 & iIntValue));
            int i36 = ((~i35) & i33) | ((~i33) & i35);
            int i37 = i33 & i35;
            int i38 = (i37 & i36) | (i36 ^ i37);
            int i39 = i30 & (i30 | i18);
            int i40 = i39 & iIntValue;
            int i41 = (i39 | iIntValue) & (~i40);
            int i42 = ~((i41 & i40) | (i41 ^ i40));
            int i43 = (i28 - (~(-(-(((i42 & i38) | (((~i42) & i38) | ((~i38) & i42))) * (-880)))))) - 1;
            int i44 = ~iIntValue;
            int i45 = (i34 & i44) | (i34 ^ i44);
            int i46 = ~i45;
            int i47 = (i45 | i46) & i46;
            int i48 = (i47 & i18) | (i18 ^ i47);
            int i49 = ~(i22 | iIntValue);
            int i50 = i48 & i49;
            int i51 = (i48 | i49) & (~i50);
            int i52 = ((i51 & i50) | (i51 ^ i50)) * (-880);
            int i53 = ((i43 | i52) << 1) - (i52 ^ i43);
            int i54 = i22 ^ iIntValue;
            int i55 = iIntValue & i22;
            int i56 = -(-((~((i55 & i54) | (i54 ^ i55))) * 880));
            int i57 = i53 & i56;
            int i58 = (i57 - (~(-(-((i56 ^ i53) | i57))))) - 1;
            int i59 = i20 + 27;
            f53237y = i59 % 128;
            int i60 = i59 % 2;
            return Integer.valueOf(i58);
        }
        int i61 = amsVar.f53244f;
        if (i18 < i61) {
            int i62 = ((i10 | 57) << 1) - (i10 ^ 57);
            f53238z = i62 % 128;
            int i63 = i62 % 2;
            int i64 = ((i10 & 52) + (i10 | 52)) - 1;
            f53238z = i64 % 128;
            if (i64 % 2 != 0) {
                return 0;
            }
            throw null;
        }
        int i65 = -i61;
        int i66 = i65 * 868;
        int i67 = -(~(-(-(i18 * 868))));
        int i68 = ((i66 & i67) + (i66 | i67)) - 1;
        int i69 = ~i65;
        int i70 = ~iIntValue;
        int i71 = i69 ^ i70;
        int i72 = i69 & i70;
        int i73 = ~((i71 & i72) | (i71 ^ i72));
        int i74 = ~i18;
        int i75 = i74 & i70;
        int i76 = (~i75) & (i74 | i70);
        int i77 = (i75 & i76) | (i76 ^ i75);
        int i78 = ~i77;
        int i79 = (i77 | i78) & i78;
        int i80 = ((i73 & i79) | (i73 ^ i79)) * (-867);
        int i81 = i68 ^ i80;
        int i82 = (i68 & i80) << 1;
        int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
        int i84 = (i69 | i65) & i69;
        int i85 = ~((i84 ^ i74) | (i84 & i74));
        int i86 = (i84 & i70) | ((~i84) & iIntValue);
        int i87 = i84 & iIntValue;
        int i88 = (i87 & i86) | (i86 ^ i87);
        int i89 = ~i88;
        int i90 = (i88 | i89) & i89;
        int i91 = i85 & i90;
        int i92 = (i90 | i85) & (~i91);
        int i93 = (i92 & i91) | (i92 ^ i91);
        int i94 = (i74 | i18) & i74;
        int i95 = i94 & iIntValue;
        int i96 = (~i95) & (i94 | iIntValue);
        int i97 = (i95 & i96) | (i96 ^ i95);
        int i98 = ~i97;
        int i99 = (i97 | i98) & i98;
        int i100 = ((~i99) & i93) | ((~i93) & i99);
        int i101 = i93 & i99;
        int i102 = (i83 - (~(((i101 & i100) | (i100 ^ i101)) * (-1734)))) - 1;
        int i103 = (i69 ^ i74) | (i74 & i69);
        int i104 = i103 ^ i70;
        int i105 = i70 & i103;
        int i106 = (i105 & i104) | (i104 ^ i105);
        int i107 = ~i106;
        int i108 = (i106 | i107) & i107;
        int i109 = i69 ^ i18;
        int i110 = i18 & i69;
        int i111 = (i109 & i110) | (i109 ^ i110);
        int i112 = ~((i111 & iIntValue) | (i111 ^ iIntValue));
        int i113 = (i108 & i112) | (i108 ^ i112);
        int i114 = (i69 & i94) | ((~i94) & i65);
        int i115 = i65 & i94;
        int i116 = (i115 & i114) | (i114 ^ i115);
        int i117 = i116 ^ iIntValue;
        int i118 = iIntValue & i116;
        int i119 = ~((i118 & i117) | (i117 ^ i118));
        int i120 = -(-(((i119 & i113) | (i113 ^ i119)) * 867));
        int i121 = i102 & i120;
        int i122 = -(-((i120 ^ i102) | i121));
        int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
        int i124 = (i12 & 111) + (i12 | 111);
        f53237y = i124 % 128;
        int i125 = i124 % 2;
        return Integer.valueOf(i123);
    }

    public static /* synthetic */ Integer j(Object[] objArr) throws akx {
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        ams amsVar = (ams) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        byte[] bArr3 = (byte[]) objArr[4];
        int i16 = f53238z + 37;
        f53237y = i16 % 128;
        if (i16 % 2 != 0) {
            setOnFocusChangeListener(new Object[]{amsVar}, -1288354565, 1288354579, System.identityHashCode(amsVar));
            int length = bArr2.length;
            throw null;
        }
        setOnFocusChangeListener(new Object[]{amsVar}, -1288354565, 1288354579, System.identityHashCode(amsVar));
        if (bArr2.length < iIntValue2) {
            throw new akr("Input buffer too short");
        }
        if (amsVar.f53242d) {
            int i17 = f53238z + 62;
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            int i19 = i18 % 128;
            f53237y = i19;
            if (i18 % 2 != 0) {
                throw null;
            }
            int i20 = amsVar.f53256s;
            if (i20 > 0) {
                int i21 = ((i19 & 74) + (i19 | 74)) - 1;
                int i22 = i21 % 128;
                f53238z = i22;
                int i23 = i21 % 2;
                int i24 = -i20;
                int i25 = i24 * 868;
                int i26 = i25 ^ 13888;
                int i27 = (((i25 & 13888) | i26) << 1) - i26;
                int i28 = ~i24;
                int i29 = ~iIntValue;
                int i30 = (~i29) & i28;
                int i31 = ~i28;
                int i32 = i30 | (i29 & i31);
                int i33 = i28 & i29;
                int i34 = (i32 ^ i33) | (i32 & i33);
                int i35 = ~i34;
                int i36 = i35 & (i34 | i35);
                int i37 = (i29 | iIntValue) & i29;
                bArr = bArr3;
                int i38 = (-17) & i37;
                int i39 = (~i38) & ((-17) | i37);
                int i40 = (i39 ^ i38) | (i39 & i38);
                int i41 = ~i40;
                int i42 = (i40 | i41) & i41;
                int i43 = ((i42 & i36) | (i36 ^ i42)) * (-867);
                int i44 = i27 ^ i43;
                int i45 = ((i43 & i27) | i44) << 1;
                int i46 = -i44;
                int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                int i48 = (i28 | i24) & i28;
                int i49 = i48 ^ (-17);
                int i50 = i48 & (-17);
                int i51 = (i49 ^ i50) | (i49 & i50);
                int i52 = ~i51;
                int i53 = (i51 | i52) & i52;
                int i54 = i48 & iIntValue;
                int i55 = (i48 | iIntValue) & (~i54);
                int i56 = ~((i55 & i54) | (i55 ^ i54));
                int i57 = i53 & i56;
                int i58 = (i56 | i53) & (~i57);
                int i59 = (i58 & i57) | (i58 ^ i57);
                int i60 = ((-17) & i29) | (iIntValue & 16);
                int i61 = (-17) & iIntValue;
                int i62 = ~((i60 ^ i61) | (i60 & i61));
                int i63 = i59 & i62;
                int i64 = (i59 | i62) & (~i63);
                int i65 = -(-(((i64 & i63) | (i64 ^ i63)) * (-1734)));
                int i66 = ((((i47 ^ i65) | (i47 & i65)) << 1) - (~(-((i65 & (~i47)) | ((~i65) & i47))))) - 1;
                int i67 = i28 & (-17);
                int i68 = (i28 ^ (-17)) | i67;
                int i69 = i68 & i37;
                int i70 = (i68 | i37) & (~i69);
                int i71 = ~((i70 & i69) | (i70 ^ i69));
                int i72 = i67 | (i31 & 16);
                int i73 = i28 & 16;
                int i74 = (i72 & i73) | (i72 ^ i73);
                int i75 = (i74 & iIntValue) | (i74 ^ iIntValue);
                int i76 = ~i75;
                int i77 = (i75 | i76) & i76;
                int i78 = ((~i77) & i71) | ((~i71) & i77);
                int i79 = i71 & i77;
                int i80 = (i79 & i78) | (i78 ^ i79);
                int i81 = (-17) ^ i24;
                int i82 = i24 & (-17);
                int i83 = (i82 & i81) | (i81 ^ i82);
                int i84 = (i83 & i29) | ((~i83) & iIntValue);
                int i85 = i83 & iIntValue;
                int i86 = ~((i85 & i84) | (i84 ^ i85));
                int i87 = i80 & i86;
                int i88 = (i80 | i86) & (~i87);
                int i89 = -(-(((i88 & i87) | (i88 ^ i87)) * 867));
                i14 = (((i66 ^ i89) | (i66 & i89)) << 1) - ((i89 & (~i66)) | ((~i89) & i66));
                if (iIntValue2 < i14) {
                    int i90 = (-2) - ((((i22 | 118) << 1) - (i22 ^ 118)) ^ (-1));
                    f53237y = i90 % 128;
                    if (i90 % 2 != 0) {
                        System.arraycopy(bArr2, 1, amsVar.f53250l, i20, iIntValue2);
                        amsVar.f53256s <<= iIntValue2;
                        i15 = 1;
                    } else {
                        System.arraycopy(bArr2, 0, amsVar.f53250l, i20, iIntValue2);
                        int i91 = amsVar.f53256s;
                        amsVar.f53256s = (i91 & iIntValue2) + (i91 | iIntValue2);
                        i15 = 0;
                    }
                    int i92 = f53237y;
                    int i93 = ((i92 ^ 6) + ((i92 & 6) << 1)) - 1;
                    f53238z = i93 % 128;
                    if (i93 % 2 != 0) {
                        return Integer.valueOf(i15);
                    }
                    throw null;
                }
                System.arraycopy(bArr2, 0, amsVar.f53250l, i20, i14);
                setOnFocusChangeListener(new Object[]{amsVar, amsVar.f53250l, 0, bArr, 0}, 247124384, -247124377, 0);
                int i94 = -i14;
                int i95 = ((i94 * (-501)) - (~(iIntValue2 * 503))) - 1;
                int i96 = ~iIntValue2;
                int i97 = ~((i96 & i29) | ((~i96) & iIntValue) | (i96 & iIntValue));
                int i98 = i94 & iIntValue2;
                int i99 = (iIntValue2 | i94) & (~i98);
                int i100 = ~((i99 & i98) | (i99 ^ i98));
                int i101 = i97 ^ i100;
                int i102 = i100 & i97;
                int i103 = ((i102 & i101) | (i101 ^ i102)) * (-502);
                int i104 = (((i95 ^ i103) | (i95 & i103)) << 1) - (((~i95) & i103) | ((~i103) & i95));
                int i105 = i96 & i37;
                int i106 = i105 | ((i37 | i96) & (~i105));
                int i107 = i106 & i94;
                int i108 = (i106 | i94) & (~i107);
                int i109 = ~i94;
                int i110 = -(-((~((i108 & i107) | (i108 ^ i107))) * (-502)));
                int i111 = i104 & i110;
                int i112 = (i111 - (~(-(-((i110 ^ i104) | i111))))) - 1;
                int i113 = (i29 & i109) | ((~i109) & iIntValue) | (i109 & iIntValue);
                int i114 = ~i113;
                int i115 = (i113 | i114) & i114;
                int i116 = -(-(((i115 & i96) | (i96 ^ i115)) * 502));
                iIntValue2 = (i112 ^ i116) + ((i116 & i112) << 1);
                int i117 = f53237y;
                int i118 = ((i117 | 116) << 1) - (i117 ^ 116);
                int i119 = (i118 ^ (-1)) + (i118 << 1);
                f53238z = i119 % 128;
                int i120 = i119 % 2;
                i11 = 16;
            } else {
                bArr = bArr3;
                i14 = iIntValue;
                i11 = 0;
            }
            int i121 = iIntValue2 * 595;
            int i122 = i14 * (-1187);
            int i123 = (i121 & i122) + (i121 | i122);
            int i124 = ~iIntValue2;
            int i125 = (i124 | iIntValue2) & i124;
            int i126 = ~i14;
            int i127 = (i125 & i14) | (i125 & i126) | ((~i125) & i14);
            int i128 = ~i127;
            int i129 = (i127 | i128) & i128;
            int i130 = ~iIntValue;
            int i131 = i130 ^ i14;
            int i132 = i130 & i14;
            int i133 = ~((i131 & i132) | (i131 ^ i132));
            int i134 = ((~i133) & i129) | ((~i129) & i133);
            int i135 = i129 & i133;
            int i136 = ((i135 & i134) | (i134 ^ i135)) * (-1188);
            int i137 = i123 & i136;
            int i138 = (((i136 | i123) & (~i137)) - (~(i137 << 1))) - 1;
            int i139 = ~((i124 & i14) | (i124 ^ i14));
            int i140 = i126 & iIntValue;
            int i141 = (~i140) & (i126 | iIntValue);
            int i142 = (i140 & i141) | (i141 ^ i140);
            int i143 = ~i142;
            int i144 = (i142 | i143) & i143;
            int i145 = ((~i144) & i139) | ((~i139) & i144);
            int i146 = i139 & i144;
            int i147 = (i146 & i145) | (i145 ^ i146);
            int i148 = i130 ^ iIntValue2;
            int i149 = i130 & iIntValue2;
            int i150 = (i148 & i149) | (i148 ^ i149);
            int i151 = ~i150;
            int i152 = -(-((i147 | i151) * 594));
            int i153 = (i138 & i152) + (i152 | i138);
            int i154 = ~((i126 ^ i130) | (i126 & i130));
            int i155 = i126 & iIntValue2;
            int i156 = (i126 | iIntValue2) & (~i155);
            int i157 = (i155 & i156) | (i156 ^ i155);
            int i158 = ~i157;
            int i159 = (i157 | i158) & i158;
            int i160 = (i154 & i159) | (i154 ^ i159);
            int i161 = (i151 | i150) & i151;
            int i162 = ((~i161) & i160) | ((~i160) & i161);
            int i163 = i160 & i161;
            int i164 = -(~(-(-(((i163 & i162) | (i162 ^ i163)) * 594))));
            int i165 = (((i153 | i164) << 1) - (i164 ^ i153)) - 1;
            int i166 = ((i165 & 15) | ((~i165) & (-16))) + ((i165 & (-16)) << 1);
            int i167 = f53237y;
            int i168 = i167 & 21;
            int i169 = (i167 ^ 21) | i168;
            int i170 = (i168 & i169) + (i169 | i168);
            f53238z = i170 % 128;
            int i171 = i170 % 2;
            while (i14 <= i166) {
                int i172 = f53238z;
                int i173 = ((i172 & 90) + (i172 | 90)) - 1;
                f53237y = i173 % 128;
                if (i173 % 2 != 0) {
                    setOnFocusChangeListener(new Object[]{amsVar, bArr2, Integer.valueOf(i14), bArr, Integer.valueOf(i11)}, 247124384, -247124377, i14);
                    int i174 = i14 & (-83);
                    int i175 = ((((i14 ^ (-83)) | i174) << 1) - (~(-((~i174) & (i14 | (-83)))))) - 1;
                    int i176 = (((i175 | 88) << 1) - (~(-(((~i175) & 88) | (i175 & (-89)))))) - 1;
                    int i177 = (i11 & (-33)) | ((~i11) & 32);
                    int i178 = (i11 & 32) << 1;
                    int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
                    i11 = ((i179 & 80) + (i179 | 80)) - 1;
                    i14 = i176;
                } else {
                    setOnFocusChangeListener(new Object[]{amsVar, bArr2, Integer.valueOf(i14), bArr, Integer.valueOf(i11)}, 247124384, -247124377, i14);
                    int i180 = i14 & (-41);
                    int i181 = ((i14 ^ (-41)) | i180) << 1;
                    int i182 = -((~i180) & (i14 | (-41)));
                    int i183 = ((i181 | i182) << 1) - (i181 ^ i182);
                    int i184 = ((i183 | 58) << 1) - (i183 ^ 58);
                    int i185 = (i184 ^ (-1)) + (i184 << 1);
                    int i186 = i11 & 142;
                    int i187 = (i186 - (~((i11 ^ 142) | i186))) - 1;
                    i11 = (((i187 & 125) | ((~i187) & (-126))) - (~(-(-((i187 & (-126)) << 1))))) - 1;
                    i14 = i185;
                }
            }
            int i188 = (i166 ^ 16) + ((i166 & 16) << 1);
            int i189 = -i14;
            int i190 = i189 * 483;
            int i191 = -(-(i188 * 242));
            int i192 = i190 & i191;
            int i193 = (i190 ^ i191) | i192;
            int i194 = (i192 ^ i193) + ((i193 & i192) << 1);
            int i195 = ~i189;
            int i196 = ~i188;
            int i197 = (i196 | i188) & i196;
            int i198 = i195 & i197;
            int i199 = ~(((i197 | i195) & (~i198)) | i198);
            int i200 = i195 ^ i130;
            int i201 = i195 & i130;
            int i202 = (i200 & i201) | (i200 ^ i201);
            int i203 = ~i202;
            int i204 = (i202 | i203) & i203;
            int i205 = ((~i204) & i199) | ((~i199) & i204);
            int i206 = i199 & i204;
            int i207 = -(~(((i206 & i205) | (i205 ^ i206)) * (-241)));
            int i208 = (-2) - (((i194 & i207) + (i194 | i207)) ^ (-1));
            int i209 = i189 & i188;
            int i210 = (~i209) & (i189 | i188);
            int i211 = -(-(((i209 & i210) | (i210 ^ i209)) * (-482)));
            int i212 = i208 ^ i211;
            int i213 = -(-((i208 & i211) << 1));
            int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
            int i215 = i196 & i189;
            int i216 = (i189 | i196) & (~i215);
            int i217 = ~((i216 & i215) | (i216 ^ i215));
            int i218 = (iIntValue | i130) & i130;
            int i219 = i195 & i218;
            int i220 = (i195 | i218) & (~i219);
            int i221 = (i220 & i219) | (i220 ^ i219);
            int i222 = ~((i188 & i221) | (i221 ^ i188));
            int i223 = i217 ^ i222;
            int i224 = i217 & i222;
            int i225 = (i214 - (~(-(-(((i224 & i223) | (i223 ^ i224)) * 241))))) - 1;
            amsVar.f53256s = i225;
            System.arraycopy(bArr2, i14, amsVar.f53250l, 0, i225);
            int i226 = f53237y;
            i12 = i226 & 63;
            i13 = i226 | 63;
        } else {
            byte[] bArr4 = amsVar.f53250l;
            int length2 = bArr4.length;
            int i227 = amsVar.f53256s;
            int i228 = -i227;
            int i229 = length2 & i228;
            int i230 = i229 + ((length2 ^ i228) | i229);
            if (iIntValue2 < i230) {
                int i231 = f53238z;
                int i232 = ((((i231 ^ 95) | (i231 & 95)) << 1) - (~(-(((~i231) & 95) | (i231 & (-96)))))) - 1;
                f53237y = i232 % 128;
                if (i232 % 2 != 0) {
                    System.arraycopy(bArr2, 1, bArr4, i227, iIntValue2);
                    amsVar.f53256s *= iIntValue2;
                } else {
                    System.arraycopy(bArr2, 0, bArr4, i227, iIntValue2);
                    int i233 = amsVar.f53256s;
                    int i234 = -(-iIntValue2);
                    int i235 = i233 & i234;
                    amsVar.f53256s = i235 + ((i233 ^ i234) | i235);
                }
                int i236 = f53238z;
                int i237 = (i236 | 25) << 1;
                int i238 = -(i236 ^ 25);
                int i239 = (i237 ^ i238) + ((i238 & i237) << 1);
                f53237y = i239 % 128;
                if (i239 % 2 != 0) {
                    int i240 = 71 / 0;
                }
                return 0;
            }
            if (i227 >= 16) {
                int i241 = f53237y;
                int i242 = (i241 | 57) << 1;
                int i243 = -(i241 ^ 57);
                int i244 = (i242 & i243) + (i243 | i242);
                f53238z = i244 % 128;
                int i245 = i244 % 2;
                setOnFocusChangeListener(new Object[]{amsVar, bArr4, 0, bArr3, 0}, 1829976125, -1829976120, 0);
                byte[] bArr5 = amsVar.f53250l;
                int i246 = amsVar.f53256s;
                int i247 = i246 ^ (-16);
                int i248 = -(-((i246 & (-16)) << 1));
                int i249 = (i247 ^ i248) + ((i248 & i247) << 1);
                amsVar.f53256s = i249;
                System.arraycopy(bArr5, 16, bArr5, 0, i249);
                int i250 = (i230 & 38) | ((~i230) & (-39));
                int i251 = -(-((i230 & (-39)) << 1));
                if (iIntValue2 < (i250 ^ i251) + ((i250 & i251) << 1) + 55) {
                    int i252 = f53237y;
                    int i253 = ((i252 & 80) + (i252 | 80)) - 1;
                    f53238z = i253 % 128;
                    int i254 = i253 % 2;
                    System.arraycopy(bArr2, 0, amsVar.f53250l, amsVar.f53256s, iIntValue2);
                    int i255 = amsVar.f53256s;
                    int i256 = iIntValue2 * 678;
                    int i257 = -(-(i255 * (-676)));
                    int i258 = (i256 | i257) << 1;
                    int i259 = -(i256 ^ i257);
                    int i260 = (i258 ^ i259) + ((i259 & i258) << 1);
                    int i261 = ~iIntValue2;
                    int i262 = -(-(((i261 | iIntValue2) & i261) * 677));
                    int i263 = ((i260 | i262) << 1) - (i260 ^ i262);
                    int i264 = ~i255;
                    int i265 = (i255 | i264) & i264;
                    int i266 = i261 & i265;
                    int i267 = (i265 | i261) & (~i266);
                    int i268 = -(~(-(-(((i267 & i266) | (i267 ^ i266)) * (-677)))));
                    int i269 = (-2) - (((i263 & i268) + (i268 | i263)) ^ (-1));
                    int i270 = i264 & iIntValue2;
                    int i271 = (i264 | iIntValue2) & (~i270);
                    int i272 = -(-((~((i270 & i271) | (i271 ^ i270))) * 677));
                    int i273 = i269 & i272;
                    amsVar.f53256s = i273 + ((i269 ^ i272) | i273);
                    int i274 = f53238z;
                    int i275 = (-2) - ((((i274 | 104) << 1) - (i274 ^ 104)) ^ (-1));
                    f53237y = i275 % 128;
                    if (i275 % 2 == 0) {
                        return 16;
                    }
                    throw null;
                }
                i10 = 16;
            } else {
                i10 = 0;
            }
            byte[] bArr6 = amsVar.f53250l;
            int i276 = -bArr6.length;
            int i277 = i276 * 236;
            int i278 = iIntValue2 * 471;
            int i279 = ((i277 ^ i278) | (i277 & i278)) << 1;
            int i280 = -(((~i277) & i278) | ((~i278) & i277));
            int i281 = ((i279 | i280) << 1) - (i280 ^ i279);
            int i282 = ~i276;
            int i283 = (i282 | i276) & i282;
            int i284 = ~iIntValue;
            int i285 = ((~i284) & i283) | ((~i283) & i284);
            int i286 = i283 & i284;
            int i287 = ((~((i286 & i285) | (i285 ^ i286))) | iIntValue2) * (-235);
            int i288 = i281 & i287;
            int i289 = (i288 - (~((i281 ^ i287) | i288))) - 1;
            int i290 = ~i282;
            int i291 = (i282 & i284) | (iIntValue & i290);
            int i292 = i282 & iIntValue;
            int i293 = ~((i291 & i292) | (i291 ^ i292));
            int i294 = (~i293) & iIntValue2;
            int i295 = ~iIntValue2;
            int i296 = i294 | (i293 & i295);
            int i297 = i293 & iIntValue2;
            int i298 = ((i296 ^ i297) | (i297 & i296)) * (-470);
            int i299 = i289 & i298;
            int i300 = ((i289 ^ i298) | i299) << 1;
            int i301 = -((~i299) & (i298 | i289));
            int i302 = (i300 & i301) + (i301 | i300);
            int i303 = ~(((i295 | iIntValue2) & i295) | i276);
            int i304 = (i282 & i295) | (i290 & iIntValue2);
            int i305 = iIntValue2 & i282;
            int i306 = (i304 & i305) | (i304 ^ i305);
            int i307 = (i306 & i284) | ((~i306) & iIntValue);
            int i308 = i306 & iIntValue;
            int i309 = ~((i308 & i307) | (i307 ^ i308));
            int i310 = i303 & i309;
            int i311 = (((i303 | i309) & (~i310)) | i310) * 235;
            int i312 = (i302 & i311) + (i311 | i302);
            int i313 = amsVar.f53256s;
            int i314 = -i313;
            int i315 = i314 * (-496);
            int i316 = i315 ^ (-7936);
            int i317 = ((i315 & (-7936)) | i316) << 1;
            int i318 = -i316;
            int i319 = ((i317 | i318) << 1) - (i317 ^ i318);
            int i320 = ~i314;
            int i321 = i320 & 16;
            int i322 = ((~i320) & (-17)) | i321;
            int i323 = i320 & (-17);
            int i324 = i322 | i323;
            int i325 = ~i324;
            int i326 = -(-((i325 & (i324 | i325)) * 497));
            int i327 = i319 & i326;
            int i328 = -(-((i326 ^ i319) | i327));
            int i329 = ((i327 | i328) << 1) - (i328 ^ i327);
            int i330 = (i322 ^ i323) | (i322 & i323);
            int i331 = (i330 & iIntValue) | (i330 ^ iIntValue);
            int i332 = ~i331;
            int i333 = (i331 | i332) & i332;
            int i334 = (-17) ^ i284;
            int i335 = (-17) & i284;
            int i336 = (i334 ^ i335) | (i334 & i335);
            int i337 = i336 ^ i314;
            int i338 = i336 & i314;
            int i339 = ~((i338 & i337) | (i337 ^ i338));
            int i340 = ((~i339) & i333) | ((~i333) & i339);
            int i341 = i333 & i339;
            int i342 = ((i341 & i340) | (i340 ^ i341)) * 497;
            int i343 = (i329 & i342) + (i342 | i329);
            int i344 = (i320 | i314) & i320;
            int i345 = (i284 | iIntValue) & i284;
            int i346 = (i344 & i345) | (i344 ^ i345);
            int i347 = ~i346;
            int i348 = (i346 | i347) & i347;
            int i349 = (i320 | 16) & (~i321);
            int i350 = ~((i349 & i321) | (i349 ^ i321));
            int i351 = i348 & i350;
            int i352 = (i348 | i350) & (~i351);
            int i353 = (i352 & i351) | (i352 ^ i351);
            int i354 = (-17) & i314;
            int i355 = (i314 | (-17)) & (~i354);
            int i356 = (i355 & i354) | (i355 ^ i354);
            int i357 = (i356 & i284) | ((~i356) & iIntValue);
            int i358 = iIntValue & i356;
            int i359 = ~((i358 & i357) | (i357 ^ i358));
            int i360 = i353 & i359;
            int i361 = (i353 | i359) & (~i360);
            int i362 = -(-(((i361 & i360) | (i361 ^ i360)) * 497));
            int i363 = ((i343 ^ i362) - (~((i362 & i343) << 1))) - 1;
            System.arraycopy(bArr2, 0, bArr6, i313, i363);
            setOnFocusChangeListener(new Object[]{amsVar, amsVar.f53250l, 0, bArr3, Integer.valueOf(i10)}, 1829976125, -1829976120, 0);
            int i364 = (((i10 ^ 16) | (i10 & 16)) << 1) - (((~i10) & 16) | (i10 & (-17)));
            int i365 = f53238z + 121;
            f53237y = i365 % 128;
            int i366 = 2;
            int i367 = i365 % 2;
            i11 = i364;
            while (i363 <= i312) {
                int i368 = f53237y + 63;
                f53238z = i368 % 128;
                int i369 = i368 % i366;
                Object[] objArr2 = new Object[5];
                objArr2[0] = amsVar;
                objArr2[1] = bArr2;
                objArr2[i366] = Integer.valueOf(i363);
                objArr2[3] = bArr3;
                objArr2[4] = Integer.valueOf(i11);
                setOnFocusChangeListener(objArr2, 1829976125, -1829976120, i363);
                int i370 = i363 & (-59);
                int i371 = (((i363 | (-59)) & (~i370)) - (~(-(-(i370 << 1))))) - 1;
                int i372 = i371 & 75;
                int i373 = (i371 ^ 75) | i372;
                i363 = ((i372 | i373) << 1) - (i372 ^ i373);
                i11 += 16;
                int i374 = f53237y;
                int i375 = i374 & 11;
                int i376 = (i374 ^ 11) | i375;
                int i377 = ((i375 | i376) << 1) - (i376 ^ i375);
                f53238z = i377 % 128;
                int i378 = i377 % 2;
                i366 = 2;
            }
            byte[] bArr7 = amsVar.f53250l;
            int length3 = bArr7.length;
            int i379 = -(-i312);
            int i380 = ((length3 | i379) << 1) - (length3 ^ i379);
            int i381 = -i363;
            int i382 = i380 ^ i381;
            int i383 = (i381 & i380) << 1;
            int i384 = (i382 ^ i383) + ((i383 & i382) << 1);
            amsVar.f53256s = i384;
            System.arraycopy(bArr2, i363, bArr7, 0, i384);
            int i385 = f53237y;
            i12 = i385 ^ 101;
            i13 = (i385 & 101) << 1;
        }
        int i386 = i12 + i13;
        f53238z = i386 % 128;
        int i387 = i386 % 2;
        int i388 = f53237y;
        int i389 = (((i388 ^ 111) | (i388 & 111)) << 1) - (((~i388) & 111) | (i388 & (-112)));
        f53238z = i389 % 128;
        int i390 = i389 % 2;
        return Integer.valueOf(i11);
    }

    public static /* synthetic */ void k(Object[] objArr) {
        ams amsVar = (ams) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i10 = f53238z + 29;
        f53237y = i10 % 128;
        Object[] objArr2 = new Object[4];
        if (i10 % 2 == 0) {
            objArr2[0] = bArr;
            objArr2[1] = bArr2;
            objArr2[2] = Integer.valueOf(iIntValue);
            objArr2[3] = Integer.valueOf(iIntValue2);
            amu.setCompoundDrawableTintBlendMode(objArr2, -715499913, 715499920, iIntValue);
            amsVar.f53240b.setCompoundDrawableTintBlendMode(bArr);
            return;
        }
        objArr2[0] = bArr;
        objArr2[1] = bArr2;
        objArr2[2] = Integer.valueOf(iIntValue);
        objArr2[3] = Integer.valueOf(iIntValue2);
        amu.setCompoundDrawableTintBlendMode(objArr2, -715499913, 715499920, iIntValue);
        amsVar.f53240b.setCompoundDrawableTintBlendMode(bArr);
        throw null;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws akx {
        char c10;
        int i13;
        int i14;
        long j10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = 2;
        switch ((((~(i10 | i12)) | (~((~i10) | i16)) | (~(i11 | i12))) * 831) + ((~(i15 | i10 | i12)) * (-1662)) + (((~(i15 | i16)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830))) {
            case 1:
                ams amsVar = (ams) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                byte[] bArr2 = (byte[]) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                byte[] bArr3 = new byte[16];
                setOnFocusChangeListener(new Object[]{amsVar, bArr3}, 1338453980, -1338453969, System.identityHashCode(amsVar));
                if (amsVar.f53242d) {
                    int i18 = f53237y;
                    int i19 = (i18 ^ 53) + ((i18 & 53) << 1);
                    f53238z = i19 % 128;
                    int i20 = i19 % 2;
                    amu.setCompoundDrawableTintBlendMode(new Object[]{bArr, 0, bArr3, Integer.valueOf(iIntValue)}, -1548604082, 1548604098, 0);
                    setOnFocusChangeListener(new Object[]{amsVar, amsVar.f53251n, bArr, 0, Integer.valueOf(iIntValue)}, -1144250474, 1144250474, 0);
                    int i21 = f53237y;
                    int i22 = ((i21 & 110) + (i21 | 110)) - 1;
                    f53238z = i22 % 128;
                    int i23 = i22 % 2;
                } else {
                    setOnFocusChangeListener(new Object[]{amsVar, amsVar.f53251n, bArr, 0, Integer.valueOf(iIntValue)}, -1144250474, 1144250474, 0);
                    amu.setCompoundDrawableTintBlendMode(new Object[]{bArr, 0, bArr3, Integer.valueOf(iIntValue)}, -1548604082, 1548604098, 0);
                    int i24 = f53238z;
                    int i25 = (i24 & (-44)) | ((~i24) & 43);
                    int i26 = (i24 & 43) << 1;
                    int i27 = (i25 & i26) + (i26 | i25);
                    f53237y = i27 % 128;
                    int i28 = i27 % 2;
                }
                System.arraycopy(bArr, 0, bArr2, iIntValue2, iIntValue);
                amsVar.f53257t += (long) iIntValue;
                int i29 = f53238z + 13;
                f53237y = i29 % 128;
                int i30 = i29 % 2;
                return null;
            case 2:
                return j(objArr);
            case 3:
                c(objArr);
                return null;
            case 4:
                ams amsVar2 = (ams) objArr[0];
                byte[] bArr4 = (byte[]) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i31 = f53238z;
                int i32 = i31 & 31;
                int i33 = i32 + ((i31 ^ 31) | i32);
                f53237y = i33 % 128;
                int i34 = i33 % 2;
                setOnFocusChangeListener(new Object[]{amsVar2}, -1288354565, 1288354579, System.identityHashCode(amsVar2));
                if (amsVar2.f53257t == 0) {
                    int i35 = f53238z;
                    int i36 = (((i35 | 32) << 1) - (i35 ^ 32)) - 1;
                    f53237y = i36 % 128;
                    int i37 = i36 % 2;
                    setOnFocusChangeListener(new Object[]{amsVar2}, 503726356, -503726346, System.identityHashCode(amsVar2));
                    int i38 = f53237y;
                    int i39 = (i38 ^ 93) + ((i38 & 93) << 1);
                    f53238z = i39 % 128;
                    int i40 = i39 % 2;
                }
                int i41 = amsVar2.f53256s;
                if (amsVar2.f53242d) {
                    int i42 = f53238z;
                    int i43 = i42 | 99;
                    int i44 = i43 << 1;
                    int i45 = -((~(i42 & 99)) & i43);
                    int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                    f53237y = i46 % 128;
                    int i47 = i46 % 2;
                    int length = bArr4.length;
                    int i48 = -iIntValue3;
                    int i49 = ((length ^ i48) | (length & i48)) << 1;
                    int i50 = -(((~length) & i48) | ((~i48) & length));
                    int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                    int i52 = amsVar2.f53244f;
                    int i53 = i52 * 55;
                    int i54 = -(~(i41 * (-107)));
                    int i55 = ((i53 ^ i54) + ((i53 & i54) << 1)) - 1;
                    int i56 = ~i52;
                    int i57 = ~i41;
                    int i58 = ~i56;
                    int i59 = (i56 & i57) | (i41 & i58);
                    int i60 = i56 & i41;
                    int i61 = ~((i59 ^ i60) | (i59 & i60));
                    int i62 = ~iIntValue3;
                    int i63 = ~((i62 & (i62 | iIntValue3)) | i41);
                    int i64 = ((~i63) & i61) | ((~i61) & i63);
                    int i65 = i63 & i61;
                    int i66 = -(-(((i65 & i64) | (i64 ^ i65)) * (-108)));
                    int i67 = i55 & i66;
                    int i68 = ((i55 | i66) & (~i67)) + (i67 << 1);
                    int i69 = i56 & i62;
                    int i70 = (i58 & iIntValue3) | i69;
                    int i71 = i56 & iIntValue3;
                    int i72 = ~((i70 & i71) | (i70 ^ i71));
                    int i73 = i57 & i52;
                    int i74 = (~i73) & (i57 | i52);
                    int i75 = ~((i74 & i73) | (i74 ^ i73));
                    int i76 = ((~i72) & i75) | ((~i75) & i72) | (i72 & i75);
                    int i77 = i69 | ((~i62) & i52);
                    int i78 = i62 & i52;
                    int i79 = ~((i77 & i78) | (i77 ^ i78));
                    int i80 = -(-(((i76 & i79) | (i76 ^ i79)) * 54));
                    int i81 = i68 & i80;
                    int i82 = (i68 | i80) & (~i81);
                    int i83 = i81 << 1;
                    int i84 = (i82 & i83) + (i82 | i83);
                    int i85 = i57 ^ i52;
                    int i86 = ~((i85 & i73) | (i85 ^ i73));
                    int i87 = ((~i86) & iIntValue3) | (i62 & i86);
                    int i88 = i86 & iIntValue3;
                    int i89 = ((i88 & i87) | (i87 ^ i88)) * 54;
                    if (i51 < (((i84 | i89) << 1) - (~(-((i89 & (~i84)) | ((~i89) & i84))))) - 1) {
                        throw new ald("Output buffer too short");
                    }
                } else {
                    int i90 = amsVar2.f53244f;
                    if (i41 < i90) {
                        throw new akx("data too short");
                    }
                    int i91 = -i90;
                    int i92 = i91 * 141;
                    int i93 = -(-(i41 * (-279)));
                    int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
                    int i95 = i41 ^ iIntValue3;
                    int i96 = ~iIntValue3;
                    int i97 = i41 & iIntValue3;
                    int i98 = -(-(((i95 & i97) | (i95 ^ i97)) * 140));
                    int i99 = ((i94 | i98) << 1) - (i98 ^ i94);
                    int i100 = ~i91;
                    int i101 = i100 & i41;
                    int i102 = (~i101) & (i100 | i41);
                    int i103 = ~((i101 & i102) | (i102 ^ i101));
                    int i104 = ~((i96 ^ i41) | (i96 & i41));
                    int i105 = -(-(((i103 & i104) | ((~i104) & i103) | ((~i103) & i104)) * (-280)));
                    int i106 = i99 ^ i105;
                    int i107 = -(-((i105 & i99) << 1));
                    int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                    int i109 = ~i41;
                    int i110 = i109 & (i109 | i41);
                    int i111 = (i110 & i100) | ((~i110) & i91);
                    int i112 = i110 & i91;
                    int i113 = (i112 & i111) | (i111 ^ i112);
                    int i114 = ~i113;
                    int i115 = (i113 | i114) & i114;
                    int i116 = ~((i96 & (i96 | iIntValue3)) | i91);
                    int i117 = (i91 | i100) & i100;
                    int i118 = (i117 & i41) | (i117 ^ i41);
                    i41 = (i108 - (~(-(-(((~((i118 & iIntValue3) | (i118 ^ iIntValue3))) | ((i116 & i115) | (i115 ^ i116))) * 140))))) - 1;
                    int length2 = bArr4.length;
                    int i119 = -iIntValue3;
                    int i120 = length2 & i119;
                    int i121 = (length2 | i119) & (~i120);
                    int i122 = -(-(i120 << 1));
                    if (((i121 | i122) << 1) - (i121 ^ i122) < i41) {
                        throw new ald("Output buffer too short");
                    }
                }
                if (i41 > 0) {
                    int i123 = f53237y;
                    int i124 = i123 & 121;
                    int i125 = -(-((i123 ^ 121) | i124));
                    int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
                    f53238z = i126 % 128;
                    int i127 = i126 % 2;
                    setOnFocusChangeListener(new Object[]{amsVar2, amsVar2.f53250l, Integer.valueOf(i41), bArr4, Integer.valueOf(iIntValue3)}, 105655115, -105655114, i41);
                    int i128 = f53238z + 45;
                    f53237y = i128 % 128;
                    int i129 = i128 % 2;
                }
                long j11 = amsVar2.f53260w;
                int i130 = amsVar2.f53259v;
                long j12 = j11 + ((long) i130);
                amsVar2.f53260w = j12;
                if (j12 > amsVar2.f53261x) {
                    int i131 = f53238z;
                    int i132 = (i131 & 63) + (i131 | 63);
                    f53237y = i132 % 128;
                    int i133 = i132 % 2;
                    if (i130 > 0) {
                        int i134 = i131 & 121;
                        int i135 = (i134 - (~(-(-((i131 ^ 121) | i134))))) - 1;
                        f53237y = i135 % 128;
                        int i136 = i135 % 2;
                        setOnFocusChangeListener(new Object[]{amsVar2, amsVar2.f53252o, amsVar2.f53258u, 0, Integer.valueOf(i130)}, -1144250474, 1144250474, 0);
                        int i137 = f53237y + 19;
                        f53238z = i137 % 128;
                        int i138 = i137 % 2;
                    }
                    if (amsVar2.f53261x > 0) {
                        int i139 = f53238z;
                        int i140 = ((i139 ^ 77) | (i139 & 77)) << 1;
                        int i141 = -(((~i139) & 77) | (i139 & (-78)));
                        int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                        f53237y = i142 % 128;
                        int i143 = i142 % 2;
                        amu.setCompoundDrawableTintBlendMode(new Object[]{amsVar2.f53252o, amsVar2.f53253p}, 1367451466, -1367451462, (int) System.currentTimeMillis());
                        int i144 = f53238z + 111;
                        f53237y = i144 % 128;
                        int i145 = i144 % 2;
                    }
                    long j13 = ((amsVar2.f53257t << 3) + 127) >>> 7;
                    byte[] bArr5 = new byte[16];
                    if (amsVar2.f53241c == null) {
                        amp ampVar = new amp();
                        amsVar2.f53241c = ampVar;
                        ampVar.setY(amsVar2.f53248j);
                        int i146 = f53238z;
                        int i147 = ((i146 | 111) << 1) - (i146 ^ 111);
                        f53237y = i147 % 128;
                        i14 = 2;
                        int i148 = i147 % 2;
                    } else {
                        i14 = 2;
                    }
                    amsVar2.f53241c.setY(j13, bArr5);
                    Object[] objArr2 = new Object[i14];
                    objArr2[0] = amsVar2.f53252o;
                    objArr2[1] = bArr5;
                    amu.setCompoundDrawableTintBlendMode(objArr2, 808178728, -808178716, (int) System.currentTimeMillis());
                    byte[] bArr6 = amsVar2.f53251n;
                    byte[] bArr7 = amsVar2.f53252o;
                    Object[] objArr3 = new Object[i14];
                    objArr3[0] = bArr6;
                    objArr3[1] = bArr7;
                    amu.setCompoundDrawableTintBlendMode(objArr3, 1367451466, -1367451462, (int) System.currentTimeMillis());
                    int i149 = f53238z;
                    int i150 = ((i149 ^ 49) | (i149 & 49)) << 1;
                    int i151 = -(((~i149) & 49) | (i149 & (-50)));
                    int i152 = (i150 ^ i151) + ((i151 & i150) << 1);
                    f53237y = i152 % 128;
                    c10 = 2;
                    int i153 = i152 % 2;
                } else {
                    c10 = 2;
                }
                byte[] bArr8 = new byte[16];
                Object[] objArr4 = new Object[3];
                objArr4[0] = Long.valueOf(amsVar2.f53260w << 3);
                objArr4[1] = bArr8;
                objArr4[c10] = r2;
                ber.setDividerPadding(objArr4, 108647497, -108647488, 0);
                ber.setDividerPadding(new Object[]{Long.valueOf(amsVar2.f53257t << 3), bArr8, 8}, 108647497, -108647488, 8);
                setOnFocusChangeListener(new Object[]{amsVar2, amsVar2.f53251n, bArr8}, 1254940572, -1254940563, System.identityHashCode(amsVar2));
                byte[] bArr9 = new byte[16];
                amsVar2.f53239a.setDividerPadding(amsVar2.f53249k, 0, bArr9, 0);
                amu.setCompoundDrawableTintBlendMode(new Object[]{bArr9, amsVar2.f53251n}, 1367451466, -1367451462, (int) System.currentTimeMillis());
                int i154 = amsVar2.f53244f;
                byte[] bArr10 = new byte[i154];
                amsVar2.m = bArr10;
                System.arraycopy(bArr9, 0, bArr10, 0, i154);
                if (amsVar2.f53242d) {
                    int i155 = f53237y;
                    int i156 = ((i155 | 9) << 1) - (i155 ^ 9);
                    f53238z = i156 % 128;
                    int i157 = i156 % 2;
                    byte[] bArr11 = amsVar2.m;
                    if (i157 == 0) {
                        System.arraycopy(bArr11, 1, bArr4, iIntValue3 >>> amsVar2.f53256s, amsVar2.f53244f);
                        int i158 = -(-amsVar2.f53244f);
                        i41 = (i41 ^ i158) + ((i158 & i41) << 1);
                    } else {
                        int i159 = amsVar2.f53256s;
                        System.arraycopy(bArr11, 0, bArr4, (iIntValue3 & i159) + (i159 | iIntValue3), amsVar2.f53244f);
                        int i160 = amsVar2.f53244f;
                        int i161 = i41 ^ i160;
                        int i162 = -(-((i160 & i41) << 1));
                        i41 = ((i161 | i162) << 1) - (i162 ^ i161);
                    }
                    i13 = 1;
                } else {
                    int i163 = amsVar2.f53244f;
                    byte[] bArr12 = new byte[i163];
                    System.arraycopy(amsVar2.f53250l, i41, bArr12, 0, i163);
                    i13 = 1;
                    if (!((Boolean) bek.setOnFocusChangeListener(new Object[]{amsVar2.m, bArr12}, 1295906124, -1295906099, (int) System.currentTimeMillis())).booleanValue()) {
                        throw new akx("mac check in GCM failed");
                    }
                }
                Object[] objArr5 = new Object[i13];
                objArr5[0] = amsVar2;
                setOnFocusChangeListener(objArr5, -1771439078, 1771439081, System.identityHashCode(amsVar2));
                int i164 = f53237y;
                int i165 = i164 & 123;
                int i166 = (i165 - (~(-(-((i164 ^ 123) | i165))))) - 1;
                f53238z = i166 % 128;
                int i167 = i166 % 2;
                return Integer.valueOf(i41);
            case 5:
                g(objArr);
                return null;
            case 6:
                b(objArr);
                return null;
            case 7:
                e(objArr);
                return null;
            case 8:
                ams amsVar3 = (ams) objArr[0];
                byte[] bArr13 = (byte[]) objArr[1];
                byte[] bArr14 = (byte[]) objArr[2];
                int iIntValue4 = ((Number) objArr[3]).intValue();
                int i168 = f53238z;
                int i169 = i168 & 103;
                int i170 = i169 + ((i168 ^ 103) | i169);
                f53237y = i170 % 128;
                int i171 = i170 % 2;
                int i172 = 0;
                while (i172 < iIntValue4) {
                    int i173 = f53237y;
                    int i174 = i173 & 57;
                    int i175 = i174 + ((i173 ^ 57) | i174);
                    f53238z = i175 % 128;
                    int i176 = i175 % i17;
                    int i177 = -i172;
                    int i178 = i177 * (-665);
                    int i179 = -(~(iIntValue4 * 334));
                    int i180 = ~i177;
                    int i181 = (((-2) - (((i178 & i179) + (i179 | i178)) ^ (-1))) - (~(i180 * (-333)))) - 1;
                    int i182 = ~iIntValue4;
                    int i183 = i180 & i182;
                    int i184 = (~i183) & (i180 | i182);
                    int i185 = ~((i184 ^ i183) | (i184 & i183));
                    int i186 = iIntValue4 & iIntValue4;
                    int i187 = (~i186) & (iIntValue4 | iIntValue4);
                    int i188 = (i187 ^ i186) | (i186 & i187);
                    int i189 = ~i188;
                    int i190 = (i188 | i189) & i189;
                    int i191 = ((i185 & i190) | (i185 ^ i190)) * 333;
                    int i192 = i181 & i191;
                    int i193 = (i191 ^ i181) | i192;
                    int i194 = ((i192 | i193) << 1) - (i193 ^ i192);
                    int i195 = ~(i183 | ((~i180) & iIntValue4) | (i180 & iIntValue4));
                    int i196 = i182 & iIntValue4;
                    int i197 = (~i196) & (i182 | iIntValue4);
                    int i198 = (i196 & i197) | (i197 ^ i196);
                    int i199 = ~i198;
                    int i200 = (i198 | i199) & i199;
                    int i201 = -(-(((i195 & i200) | ((~i200) & i195) | ((~i195) & i200)) * 333));
                    setOnFocusChangeListener(new Object[]{amsVar3, bArr13, bArr14, Integer.valueOf(i172), Integer.valueOf(Math.min((i194 ^ i201) + ((i201 & i194) << 1), 16))}, -1144250474, 1144250474, i172);
                    int i202 = i172 - 96;
                    i172 = ((i202 & 112) << 1) + (i202 ^ 112);
                    int i203 = f53238z;
                    int i204 = (i203 & (-10)) | ((~i203) & 9);
                    int i205 = -(-((i203 & 9) << 1));
                    int i206 = (i204 ^ i205) + ((i205 & i204) << 1);
                    f53237y = i206 % 128;
                    int i207 = i206 % 2;
                    i17 = 2;
                }
                int i208 = f53237y;
                int i209 = ((i208 & 94) + (i208 | 94)) - 1;
                f53238z = i209 % 128;
                int i210 = i209 % 2;
                return null;
            case 9:
                d(objArr);
                return null;
            case 10:
                ams amsVar4 = (ams) objArr[0];
                int i211 = f53237y;
                int i212 = i211 & 85;
                int i213 = -(-((i211 ^ 85) | i212));
                int i214 = (i212 ^ i213) + ((i213 & i212) << 1);
                int i215 = i214 % 128;
                f53238z = i215;
                int i216 = i214 % 2;
                long j14 = amsVar4.f53260w;
                if (i216 != 0 ? j14 > 0 : j14 > 1) {
                    int i217 = i215 & 55;
                    int i218 = -(-(i215 | 55));
                    int i219 = (i217 & i218) + (i217 | i218);
                    f53237y = i219 % 128;
                    int i220 = i219 % 2;
                    System.arraycopy(amsVar4.f53252o, 0, amsVar4.f53253p, 0, 16);
                    amsVar4.f53261x = amsVar4.f53260w;
                    System.identityHashCode(amsVar4);
                    System.identityHashCode(amsVar4);
                }
                int i221 = amsVar4.f53259v;
                if (i221 > 0) {
                    int i222 = f53238z;
                    int i223 = ((i222 ^ 25) | (i222 & 25)) << 1;
                    int i224 = -((25 & (~i222)) | (i222 & (-26)));
                    int i225 = ((i223 | i224) << 1) - (i224 ^ i223);
                    f53237y = i225 % 128;
                    int i226 = i225 % 2;
                    byte[] bArr15 = amsVar4.f53253p;
                    byte[] bArr16 = amsVar4.f53258u;
                    if (i226 != 0) {
                        setOnFocusChangeListener(new Object[]{amsVar4, bArr15, bArr16, 0, Integer.valueOf(i221)}, -1144250474, 1144250474, 0);
                        j10 = amsVar4.f53261x * ((long) amsVar4.f53259v);
                    } else {
                        setOnFocusChangeListener(new Object[]{amsVar4, bArr15, bArr16, 0, Integer.valueOf(i221)}, -1144250474, 1144250474, 0);
                        j10 = amsVar4.f53261x + ((long) amsVar4.f53259v);
                    }
                    amsVar4.f53261x = j10;
                    int i227 = f53238z;
                    int i228 = i227 & 5;
                    int i229 = (i227 ^ 5) | i228;
                    int i230 = ((i228 | i229) << 1) - (i229 ^ i228);
                    f53237y = i230 % 128;
                    int i231 = i230 % 2;
                }
                if (amsVar4.f53261x > 0) {
                    int i232 = f53238z;
                    int i233 = i232 & 85;
                    int i234 = -(-((i232 ^ 85) | i233));
                    int i235 = (i233 ^ i234) + ((i234 & i233) << 1);
                    f53237y = i235 % 128;
                    int i236 = i235 % 2;
                    System.arraycopy(amsVar4.f53253p, 0, amsVar4.f53251n, 0, 16);
                    int i237 = f53237y + 83;
                    f53238z = i237 % 128;
                    int i238 = i237 % 2;
                }
                int i239 = f53238z;
                int i240 = (i239 ^ 24) + ((i239 & 24) << 1);
                int i241 = (i240 ^ (-1)) + (i240 << 1);
                f53237y = i241 % 128;
                int i242 = i241 % 2;
                return null;
            case 11:
                f(objArr);
                return null;
            case 12:
                a(objArr);
                return null;
            case 13:
                ams amsVar5 = (ams) objArr[0];
                byte[] bArr17 = (byte[]) objArr[1];
                byte[] bArr18 = (byte[]) objArr[2];
                int iIntValue5 = ((Number) objArr[3]).intValue();
                int i243 = f53237y;
                int i244 = (i243 & 105) + (i243 | 105);
                f53238z = i244 % 128;
                int i245 = i244 % 2;
                amu.setCompoundDrawableTintBlendMode(new Object[]{bArr17, bArr18, Integer.valueOf(iIntValue5)}, -1690911169, 1690911187, iIntValue5);
                amsVar5.f53240b.setCompoundDrawableTintBlendMode(bArr17);
                int i246 = f53238z;
                int i247 = ((i246 | 31) << 1) - (i246 ^ 31);
                f53237y = i247 % 128;
                int i248 = i247 % 2;
                return null;
            case 14:
                h(objArr);
                return null;
            case 15:
                return i(objArr);
            default:
                k(objArr);
                return null;
        }
    }

    public final int setDividerPadding(byte[] bArr, int i10, int i11, byte[] bArr2) throws akr {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11), bArr2}, -1548625384, 1548625386, i10)).intValue();
    }

    public final int setY(byte[] bArr, int i10) throws akx, IllegalStateException {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10)}, -2019112885, 2019112889, i10)).intValue();
    }

    public final int setY(int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -1079775388, 1079775403, i10)).intValue();
    }

    public final void setOnFocusChangeListener(boolean z10, akk akkVar) throws akx, IllegalArgumentException {
        setOnFocusChangeListener(new Object[]{this, Boolean.valueOf(z10), akkVar}, -178364514, 178364526, System.identityHashCode(this));
    }
}
