package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class ajn extends adw {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52903y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adp f52904r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aiw f52905s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ain f52906t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ajo f52907u0;
    public ajo v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public aed f52908w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public aje f52909x0;

    public static class a implements Enumeration {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52910b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f52911c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Enumeration f52912a;

        public a(Enumeration enumeration) {
            this.f52912a = enumeration;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
            int i14 = ~i12;
            int i15 = ~i10;
            int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
            int i17 = ~i11;
            int i18 = i15 | i17;
            int i19 = i14 | i17;
            if ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16 == 1) {
                a aVar = (a) objArr[0];
                int i20 = f52910b;
                int i21 = i20 | 71;
                int i22 = ((i21 << 1) - (~(-((~(i20 & 71)) & i21)))) - 1;
                f52911c = i22 % 128;
                int i23 = i22 % 2;
                Object objNextElement = aVar.f52912a.nextElement();
                if (i23 == 0) {
                    throw null;
                }
                setDividerPadding setdividerpadding = (setDividerPadding) setDividerPadding.setOnFocusChangeListener(new Object[]{objNextElement}, 411722105, -411722101, (int) System.currentTimeMillis());
                int i24 = f52911c;
                int i25 = ((i24 & (-116)) | ((~i24) & 115)) + ((i24 & 115) << 1);
                f52910b = i25 % 128;
                if (i25 % 2 == 0) {
                    return setdividerpadding;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            int i26 = f52910b;
            int i27 = i26 | 61;
            int i28 = ((i27 << 1) - (~(-((~(i26 & 61)) & i27)))) - 1;
            f52911c = i28 % 128;
            if (i28 % 2 == 0) {
                aVar2.f52912a.hasMoreElements();
                throw null;
            }
            boolean zHasMoreElements = aVar2.f52912a.hasMoreElements();
            int iIdentityHashCode = System.identityHashCode(aVar2);
            int i29 = ~iIdentityHashCode;
            int i30 = 2002142785 & i29;
            int i31 = (iIdentityHashCode & (-2002142786)) | i30;
            int i32 = iIdentityHashCode & 2002142785;
            int i33 = (i32 & i31) | (i31 ^ i32);
            int i34 = ~i33;
            int i35 = -(-(((i33 | i34) & i34) * 216));
            int i36 = 246370705 & i35;
            int i37 = (i35 ^ 246370705) | i36;
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            int i39 = ((2002255431 & i29) | (2002255431 ^ i29)) * (-216);
            int i40 = i38 & i39;
            int i41 = (i39 ^ i38) | i40;
            int i42 = (i40 & i41) + (i41 | i40);
            int i43 = ~((i29 & (-2002142786)) | ((~i29) & 2002142785) | i30);
            int i44 = (-876984392) & i43;
            int i45 = (i43 | (-876984392)) & (~i44);
            int i46 = -(-(((i45 & i44) | (i45 ^ i44)) * 216));
            int i47 = i42 & i46;
            int i48 = (i46 ^ i42) | i47;
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            int iIdentityHashCode2 = System.identityHashCode(aVar2);
            int i50 = ~iIdentityHashCode2;
            int i51 = (-1946302663) ^ i50;
            int i52 = (-1946302663) & i50;
            int i53 = (i51 & i52) | (i51 ^ i52);
            int i54 = ~i53;
            int i55 = (i53 | i54) & i54;
            int i56 = ~(((-725813735) ^ iIdentityHashCode2) | ((-725813735) & iIdentityHashCode2));
            int i57 = i55 & i56;
            int i58 = (i55 | i56) & (~i57);
            int i59 = (((i58 & i57) | (i58 ^ i57)) * 959) - 1538626421;
            int i60 = (iIdentityHashCode2 & (-1946302663)) | ((-1946302663) ^ iIdentityHashCode2);
            int i61 = ~i60;
            int i62 = (i60 | i61) & i61;
            int i63 = i50 & (-725813735);
            int i64 = (i50 | (-725813735)) & (~i63);
            if (i49 > (i59 - (~(-(~(-(-((i62 | (~((i64 & i63) | (i64 ^ i63)))) * 959))))))) - 2) {
                int i65 = 61 / 0;
            }
            return Boolean.valueOf(zHasMoreElements);
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return ((Boolean) a(new Object[]{this}, -761304000, 761304000, System.identityHashCode(this))).booleanValue();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return a(new Object[]{this}, 1341528021, -1341528020, System.identityHashCode(this));
        }
    }

    public static class b implements Enumeration {
        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ~i12;
            if ((((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529)) == 1) {
                return Boolean.FALSE;
            }
            throw new NoSuchElementException("Empty Enumeration");
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return a(new Object[]{this}, 975110117, -975110116, System.identityHashCode(this)).booleanValue();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return a(new Object[]{this}, -1422198623, 1422198623, System.identityHashCode(this));
        }
    }

    public static class setDividerPadding extends adw {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f52913t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f52914u0 = 1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public aed f52915r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public aje f52916s0;

        /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:26:0x00d2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:37:0x0114  */
        public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setDividerPadding setdividerpadding;
            int i13;
            aed compoundDrawableTintBlendMode;
            int i14 = ~i10;
            int i15 = ((i10 | i11) * 624) + ((i14 | i11) * 624) + (i14 * (-624)) + (i11 * (-623)) + (i10 * (-623));
            setDividerPadding setdividerpadding2 = null;
            if (i15 == 1) {
                setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
                int i16 = f52913t0;
                int i17 = i16 & 69;
                int i18 = i16 | 69;
                int i19 = (i17 & i18) + (i18 | i17);
                f52914u0 = i19 % 128;
                int i20 = i19 % 2;
                if (setdividerpadding3.f52915r0.setCompoundDrawableTintBlendMode() != 3) {
                    int i21 = f52914u0;
                    int i22 = (i21 & 89) + (i21 | 89);
                    f52913t0 = i22 % 128;
                    if (i22 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                int i23 = f52914u0;
                int i24 = (-2) - (((i23 ^ 42) + ((i23 & 42) << 1)) ^ (-1));
                int i25 = i24 % 128;
                f52913t0 = i25;
                boolean z10 = i24 % 2 == 0;
                int i26 = i25 ^ 103;
                int i27 = (i25 & 103) << 1;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f52914u0 = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = 64 / 0;
                }
                return Boolean.valueOf(z10);
            }
            if (i15 == 2) {
                setDividerPadding setdividerpadding4 = (setDividerPadding) objArr[0];
                int i30 = f52914u0;
                int i31 = ((i30 ^ 123) - (~((i30 & 123) << 1))) - 1;
                int i32 = i31 % 128;
                f52913t0 = i32;
                int i33 = i31 % 2;
                aed aedVar = setdividerpadding4.f52915r0;
                if (i33 != 0) {
                    throw null;
                }
                int i34 = i32 & 105;
                int i35 = (i32 ^ 105) | i34;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f52914u0 = i36 % 128;
                if (i36 % 2 != 0) {
                    return aedVar;
                }
                throw null;
            }
            if (i15 == 3) {
                setDividerPadding setdividerpadding5 = (setDividerPadding) objArr[0];
                int i37 = f52914u0;
                int i38 = i37 & 31;
                int i39 = i38 + ((i37 ^ 31) | i38);
                int i40 = i39 % 128;
                f52913t0 = i40;
                int i41 = i39 % 2;
                if (setdividerpadding5.f52916s0 == null) {
                    int i42 = i40 & 73;
                    int i43 = ((i40 ^ 73) | i42) << 1;
                    int i44 = -((i40 | 73) & (~i42));
                    int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                    f52914u0 = i45 % 128;
                    int i46 = i45 % 2;
                    aed aedVar2 = setdividerpadding5.f52915r0;
                    int compoundDrawableTintBlendMode2 = aedVar2.setCompoundDrawableTintBlendMode();
                    if (i46 != 0 ? compoundDrawableTintBlendMode2 == 3 : compoundDrawableTintBlendMode2 == 2) {
                        setdividerpadding5.f52916s0 = (aje) aje.setY(new Object[]{aedVar2.setX(2)}, -779582673, 779582673, (int) System.currentTimeMillis());
                        int i47 = f52914u0;
                        int i48 = (i47 & 63) + (i47 | 63);
                        f52913t0 = i48 % 128;
                        int i49 = i48 % 2;
                    }
                }
                aje ajeVar = setdividerpadding5.f52916s0;
                int i50 = f52914u0;
                int i51 = ((i50 | 101) << 1) - (i50 ^ 101);
                f52913t0 = i51 % 128;
                int i52 = i51 % 2;
                return ajeVar;
            }
            if (i15 != 4) {
                if (i15 != 5) {
                    setDividerPadding setdividerpadding6 = (setDividerPadding) objArr[0];
                    int i53 = f52913t0 + 83;
                    f52914u0 = i53 % 128;
                    int i54 = i53 % 2;
                    ajo ajoVar = (ajo) ajo.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding6.f52915r0.setX(1)}, 149911214, -149911213, (int) System.currentTimeMillis());
                    int i55 = f52913t0;
                    int i56 = ((i55 & 30) + (i55 | 30)) - 1;
                    f52914u0 = i56 % 128;
                    if (i56 % 2 != 0) {
                        return ajoVar;
                    }
                    throw null;
                }
                setDividerPadding setdividerpadding7 = (setDividerPadding) objArr[0];
                int i57 = f52913t0;
                int i58 = i57 & 97;
                int i59 = (i57 ^ 97) | i58;
                int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
                f52914u0 = i60 % 128;
                int i61 = i60 % 2;
                adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{setdividerpadding7.f52915r0.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
                int i62 = f52914u0 + 103;
                f52913t0 = i62 % 128;
                int i63 = i62 % 2;
                return adpVar;
            }
            Object obj = objArr[0];
            int i64 = f52913t0;
            int i65 = i64 + 107;
            f52914u0 = i65 % 128;
            if (i65 % 2 == 0) {
                int i66 = 94 / 0;
                if (obj instanceof setDividerPadding) {
                    int i67 = ((i64 ^ 96) + ((i64 & 96) << 1)) - 1;
                    int i68 = i67 % 128;
                    f52914u0 = i68;
                    int i69 = i67 % 2;
                    setdividerpadding = (setDividerPadding) obj;
                    int i70 = i68 ^ 7;
                    int i71 = (i68 & 7) << 1;
                    i13 = (i70 ^ i71) + ((i71 & i70) << 1);
                    f52913t0 = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    setdividerpadding2 = setdividerpadding;
                } else if (obj != null) {
                    compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                    setDividerPadding setdividerpadding8 = new setDividerPadding();
                    if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() >= 2 || compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() > 3) {
                        StringBuilder sb2 = new StringBuilder("Bad sequence size: ");
                        sb2.append(compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    setdividerpadding8.f52915r0 = compoundDrawableTintBlendMode;
                    int i72 = f52913t0;
                    int i73 = (i72 & 41) + (i72 | 41);
                    f52914u0 = i73 % 128;
                    if (i73 % 2 == 0) {
                        throw null;
                    }
                    setdividerpadding2 = setdividerpadding8;
                } else {
                    int i74 = (i64 & (-4)) | ((~i64) & 3);
                    int i75 = -(-((i64 & 3) << 1));
                    int i76 = (i74 & i75) + (i74 | i75);
                    f52914u0 = i76 % 128;
                    int i77 = i76 % 2;
                }
            } else if (obj instanceof setDividerPadding) {
                int i610 = ((i64 ^ 96) + ((i64 & 96) << 1)) - 1;
                int i611 = i610 % 128;
                f52914u0 = i611;
                int i612 = i610 % 2;
                setdividerpadding = (setDividerPadding) obj;
                int i78 = i611 ^ 7;
                int i79 = (i611 & 7) << 1;
                i13 = (i78 ^ i79) + ((i79 & i78) << 1);
                f52913t0 = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                setdividerpadding2 = setdividerpadding;
            } else {
                if (obj != null) {
                    compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                    setDividerPadding setdividerpadding9 = new setDividerPadding();
                    if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() >= 2) {
                    }
                    StringBuilder sb3 = new StringBuilder("Bad sequence size: ");
                    sb3.append(compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode());
                    throw new IllegalArgumentException(sb3.toString());
                }
                int i710 = (i64 & (-4)) | ((~i64) & 3);
                int i711 = -(-((i64 & 3) << 1));
                int i712 = (i710 & i711) + (i710 | i711);
                f52914u0 = i712 % 128;
                int i713 = i712 % 2;
            }
            return setdividerpadding2;
        }

        @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
        public final ady UiMessageCallbackKtWhenMappings() {
            return (ady) setOnFocusChangeListener(new Object[]{this}, -561716906, 561716908, System.identityHashCode(this));
        }

        public final adp setDividerPadding() {
            return (adp) setOnFocusChangeListener(new Object[]{this}, 376058552, -376058547, System.identityHashCode(this));
        }

        public final boolean setX() {
            return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1915526143, -1915526142, System.identityHashCode(this))).booleanValue();
        }

        public final ajo setY() {
            return (ajo) setOnFocusChangeListener(new Object[]{this}, -1558676154, 1558676154, System.identityHashCode(this));
        }

        public static setDividerPadding setY(Object obj) {
            return (setDividerPadding) setOnFocusChangeListener(new Object[]{obj}, 411722105, -411722101, (int) System.currentTimeMillis());
        }

        public final aje setOnFocusChangeListener() {
            return (aje) setOnFocusChangeListener(new Object[]{this}, 654586412, -654586409, System.identityHashCode(this));
        }
    }

    public static /* synthetic */ ajo a(Object[] objArr) {
        ajn ajnVar = (ajn) objArr[0];
        int i10 = f52903y0;
        int i11 = i10 & 25;
        int i12 = (i10 | 25) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        E0 = i14 % 128;
        int i15 = i14 % 2;
        ajo ajoVar = ajnVar.f52907u0;
        if (i15 != 0) {
            return ajoVar;
        }
        throw null;
    }

    public static /* synthetic */ ajo b(Object[] objArr) {
        ajn ajnVar = (ajn) objArr[0];
        int i10 = E0;
        int i11 = (i10 ^ 45) + ((i10 & 45) << 1);
        int i12 = i11 % 128;
        f52903y0 = i12;
        int i13 = i11 % 2;
        ajo ajoVar = ajnVar.v0;
        if (i13 != 0) {
            throw null;
        }
        int i14 = i12 & 113;
        int i15 = i14 + ((i12 ^ 113) | i14);
        E0 = i15 % 128;
        int i16 = i15 % 2;
        return ajoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.aed.setCompoundDrawableTintBlendMode(r11);
        r1 = new com.mypinpad.tsdk.isolation.ajn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r11.setCompoundDrawableTintBlendMode() < 3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r11.setCompoundDrawableTintBlendMode() > 7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if ((r11.setX(0) instanceof com.mypinpad.tsdk.isolation.adp) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r1.f52904r0 = (com.mypinpad.tsdk.isolation.adp) com.mypinpad.tsdk.isolation.adp.setOnFocusChangeListener(new java.lang.Object[]{r11.setX(0)}, -837021952, 837021958, (int) java.lang.System.currentTimeMillis());
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r1.f52904r0 = null;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r5 = (-44) - ((r2 + 44) ^ (-1));
        r1.f52905s0 = (com.mypinpad.tsdk.isolation.aiw) com.mypinpad.tsdk.isolation.aiw.setOnFocusChangeListener(new java.lang.Object[]{r11.setX(r2)}, 866360717, -866360713, (int) java.lang.System.currentTimeMillis());
        r2 = ((r5 & 46) | ((~r5) & (-47))) + ((r5 & (-47)) << 1);
        r6 = r2 & 48;
        r6 = (r6 - (~(-(-((r2 ^ 48) | r6))))) - 1;
        r1.f52906t0 = com.mypinpad.tsdk.isolation.ain.setCompoundDrawableTintBlendMode(r11.setX(r5));
        r2 = ((r6 ^ 100) - (~((r6 & 100) << 1))) - 1;
        r5 = r2 ^ (-99);
        r2 = (r2 & (-99)) << 1;
        r7 = ((r5 | r2) << 1) - (r2 ^ r5);
        r1.f52907u0 = (com.mypinpad.tsdk.isolation.ajo) com.mypinpad.tsdk.isolation.ajo.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r11.setX(r6)}, 149911214, -149911213, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        if (r7 >= r11.setCompoundDrawableTintBlendMode()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e8, code lost:
    
        if ((r11.setX(r7) instanceof com.mypinpad.tsdk.isolation.aeq) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f0, code lost:
    
        if ((r11.setX(r7) instanceof com.mypinpad.tsdk.isolation.adm) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
    
        if ((r11.setX(r7) instanceof com.mypinpad.tsdk.isolation.ajo) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        r1.v0 = (com.mypinpad.tsdk.isolation.ajo) com.mypinpad.tsdk.isolation.ajo.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r11.setX(r7)}, 149911214, -149911213, (int) java.lang.System.currentTimeMillis());
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        if (r7 >= r11.setCompoundDrawableTintBlendMode()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011e, code lost:
    
        if ((r11.setX(r7) instanceof com.mypinpad.tsdk.isolation.aeh) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0120, code lost:
    
        r2 = (r7 ^ 20) + ((r7 & 20) << 1);
        r5 = (r2 ^ (-1)) + (r2 << 1);
        r2 = (r5 & (-17)) + (r5 | (-17));
        r1.f52908w0 = (com.mypinpad.tsdk.isolation.aed) com.mypinpad.tsdk.isolation.aed.setY(new java.lang.Object[]{r11.setX(r7)}, 691787085, -691787084, (int) java.lang.System.currentTimeMillis());
        r7 = (r2 ^ (-1)) + (r2 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0153, code lost:
    
        if (r7 >= r11.setCompoundDrawableTintBlendMode()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015b, code lost:
    
        if ((r11.setX(r7) instanceof com.mypinpad.tsdk.isolation.aeh) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015d, code lost:
    
        r1.f52909x0 = (com.mypinpad.tsdk.isolation.aje) com.mypinpad.tsdk.isolation.aje.setY(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.aed) com.mypinpad.tsdk.isolation.aed.setY(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.aeh) r11.setX(r7), java.lang.Boolean.TRUE}, 113370947, -113370947, (int) java.lang.System.currentTimeMillis())}, -779582673, 779582673, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0193, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.ajn.f52903y0;
        r0 = (r11 & 123) + (r11 | 123);
        com.mypinpad.tsdk.isolation.ajn.E0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a0, code lost:
    
        r1 = new java.lang.StringBuilder("Bad sequence size: ");
        r1.append(r11.setCompoundDrawableTintBlendMode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b7, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b8, code lost:
    
        r0 = r1 & 71;
        r11 = ((((r1 ^ 71) | r0) << 1) - (~(-((~r0) & (r1 | 71))))) - 1;
        com.mypinpad.tsdk.isolation.ajn.f52903y0 = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01cb, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((!(r11 instanceof com.mypinpad.tsdk.isolation.ajn)) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ((r11 instanceof com.mypinpad.tsdk.isolation.ajn) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r11 = (com.mypinpad.tsdk.isolation.ajn) r11;
        r0 = (-2) - ((r1 + 2) ^ (-1));
        com.mypinpad.tsdk.isolation.ajn.f52903y0 = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mypinpad.tsdk.isolation.ajn c(java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ajn.c(java.lang.Object[]):com.mypinpad.tsdk.i.ajn");
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object aVar;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
        int i17 = ~(i13 | i12);
        int i18 = ~((~i11) | i10);
        switch (((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16) {
            case 1:
                ajn ajnVar = (ajn) objArr[0];
                int i19 = E0;
                int i20 = i19 ^ 19;
                int i21 = -(-((i19 & 19) << 1));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                int i23 = i22 % 128;
                f52903y0 = i23;
                int i24 = i22 % 2;
                aje ajeVar = ajnVar.f52909x0;
                int i25 = ((i23 ^ 63) - (~((i23 & 63) << 1))) - 1;
                E0 = i25 % 128;
                int i26 = i25 % 2;
                return ajeVar;
            case 2:
                return a(objArr);
            case 3:
                return b(objArr);
            case 4:
                ajn ajnVar2 = (ajn) objArr[0];
                int i27 = f52903y0;
                int i28 = i27 & 95;
                int i29 = (i28 - (~(-(-((i27 ^ 95) | i28))))) - 1;
                E0 = i29 % 128;
                int i30 = i29 % 2;
                aVar = ajnVar2.f52905s0;
                System.identityHashCode(ajnVar2);
                System.identityHashCode(ajnVar2);
                break;
            case 5:
                return c(objArr);
            case 6:
                ajn ajnVar3 = (ajn) objArr[0];
                int iIdentityHashCode = System.identityHashCode(ajnVar3);
                int i31 = (-983160200) ^ iIdentityHashCode;
                int i32 = iIdentityHashCode & (-983160200);
                int i33 = (i32 & i31) | (i31 ^ i32);
                int i34 = ~i33;
                int i35 = (i33 | i34) & i34;
                int i36 = 236664455 & i35;
                int i37 = (i35 | 236664455) & (~i36);
                int i38 = ((i37 & i36) | (i37 ^ i36)) * (-658);
                int i39 = ((~i38) & (-370677639)) | (370677638 & i38);
                int i40 = -(-((i38 & (-370677639)) << 1));
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                int i42 = ((i41 ^ (-193543426)) | (i41 & (-193543426))) << 1;
                int i43 = -(((-193543426) & (~i41)) | (193543425 & i41));
                int i44 = (i42 & i43) + (i43 | i42);
                int i45 = 169415815 & i34;
                int i46 = (169415815 | i34) & (~i45);
                int i47 = i44 - (~(-(-(((i46 & i45) | (i46 ^ i45)) * 658))));
                int i48 = (i47 ^ (-1)) + (i47 << 1);
                int iIdentityHashCode2 = System.identityHashCode(ajnVar3);
                int i49 = ~iIdentityHashCode2;
                int i50 = i49 & (i49 | iIdentityHashCode2);
                int i51 = (-750813708) & i50;
                int i52 = (i50 | (-750813708)) & (~i51);
                int i53 = ~((i52 & i51) | (i52 ^ i51));
                int i54 = (((i53 & 1091595600) | (i53 ^ 1091595600)) * (-591)) + 1896393246;
                int i55 = iIdentityHashCode2 ^ 1360096724;
                int i56 = iIdentityHashCode2 & 1360096724;
                int i57 = (i56 & i55) | (i55 ^ i56);
                int i58 = i57 ^ (-1019314832);
                int i59 = i57 & (-1019314832);
                int i60 = ((i59 & i58) | (i58 ^ i59)) * 591;
                int i61 = i54 | i60;
                int i62 = (i61 << 1) - ((~(i60 & i54)) & i61);
                aed aedVar = ajnVar3.f52908w0;
                if (i48 > i62) {
                    throw null;
                }
                if (aedVar == null) {
                    b bVar = new b();
                    int i63 = E0;
                    int i64 = i63 & 7;
                    int i65 = (i63 | 7) & (~i64);
                    int i66 = i64 << 1;
                    int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
                    f52903y0 = i67 % 128;
                    if (i67 % 2 == 0) {
                        return bVar;
                    }
                    int i68 = 84 / 0;
                    return bVar;
                }
                aVar = new a(aedVar.setDividerPadding());
                int i69 = E0;
                int i70 = (((i69 | 44) << 1) - (i69 ^ 44)) - 1;
                f52903y0 = i70 % 128;
                if (i70 % 2 != 0) {
                    int i71 = 3 / 0;
                }
                break;
                break;
            case 7:
                ajn ajnVar4 = (ajn) objArr[0];
                int i72 = E0;
                int i73 = i72 & 65;
                int i74 = (~i73) & (i72 | 65);
                int i75 = i73 << 1;
                int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                f52903y0 = i76 % 128;
                int i77 = i76 % 2;
                ain ainVar = ajnVar4.f52906t0;
                int i78 = (i72 ^ 53) + ((i72 & 53) << 1);
                f52903y0 = i78 % 128;
                if (i78 % 2 == 0) {
                    return ainVar;
                }
                throw null;
            case 8:
                ajn ajnVar5 = (ajn) objArr[0];
                int i79 = E0;
                int i80 = (i79 & (-98)) | ((~i79) & 97);
                int i81 = (i79 & 97) << 1;
                int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                int i83 = i82 % 128;
                f52903y0 = i83;
                int i84 = i82 % 2;
                adp adpVar = ajnVar5.f52904r0;
                if (adpVar == null) {
                    int i85 = (-2) - ((i83 + 86) ^ (-1));
                    int i86 = i85 % 128;
                    E0 = i86;
                    int i87 = i85 % 2;
                    int i88 = (-2) - (((i86 & 52) + (i86 | 52)) ^ (-1));
                    f52903y0 = i88 % 128;
                    int i89 = i88 % 2;
                    return 1;
                }
                int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
                int iIdentityHashCode3 = System.identityHashCode(ajnVar5);
                int i90 = (-2) - ((979 - (~(-(~(iIntValue * (-978)))))) ^ (-1));
                int i91 = ~iIntValue;
                int i92 = ~i91;
                int i93 = ~iIdentityHashCode3;
                int i94 = (i93 | iIdentityHashCode3) & i93;
                int i95 = (i94 & i91) | (i91 ^ i94);
                int i96 = ~i95;
                int i97 = ((i95 | i96) & i96) * 979;
                int i98 = i90 & i97;
                int i99 = (i90 ^ i97) | i98;
                int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
                int i101 = i93 & 1;
                int i102 = (iIdentityHashCode3 & (-2)) | i101;
                int i103 = iIdentityHashCode3 & 1;
                int i104 = -(~(-(-(((i102 & i103) | (i102 ^ i103)) * (-979)))));
                int i105 = (-2) - (((i100 ^ i104) + ((i100 & i104) << 1)) ^ (-1));
                int i106 = (i92 & iIdentityHashCode3) | (i91 & i93);
                int i107 = iIdentityHashCode3 & i91;
                int i108 = ~((i107 & i106) | (i106 ^ i107));
                int i109 = ~((i93 ^ 1) | i101);
                int i110 = ((~i109) & i108) | ((~i108) & i109);
                int i111 = i108 & i109;
                int i112 = ((i111 & i110) | (i110 ^ i111)) * 979;
                int i113 = (i105 ^ i112) + ((i112 & i105) << 1);
                int i114 = f52903y0;
                int i115 = i114 & 75;
                int i116 = (i114 ^ 75) | i115;
                int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                E0 = i117 % 128;
                int i118 = i117 % 2;
                return Integer.valueOf(i113);
            default:
                ajn ajnVar6 = (ajn) objArr[0];
                adh adhVar = new adh(7);
                adp adpVar2 = ajnVar6.f52904r0;
                if (adpVar2 != null) {
                    int i119 = f52903y0;
                    int i120 = ((i119 ^ 77) | (i119 & 77)) << 1;
                    int i121 = -(((~i119) & 77) | (i119 & (-78)));
                    int i122 = ((i120 | i121) << 1) - (i121 ^ i120);
                    E0 = i122 % 128;
                    int i123 = i122 % 2;
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, adpVar2}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i124 = f52903y0;
                    int i125 = i124 & 67;
                    int i126 = (i124 ^ 67) | i125;
                    int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                    E0 = i127 % 128;
                    int i128 = i127 % 2;
                }
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajnVar6.f52905s0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajnVar6.f52906t0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajnVar6.f52907u0}, 240298319, -240298315, System.identityHashCode(adhVar));
                ajo ajoVar = ajnVar6.v0;
                if (ajoVar != null) {
                    int i129 = f52903y0;
                    int i130 = (-2) - ((((i129 | 28) << 1) - (i129 ^ 28)) ^ (-1));
                    E0 = i130 % 128;
                    int i131 = i130 % 2;
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ajoVar}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i132 = f52903y0;
                    int i133 = i132 ^ 111;
                    int i134 = (i132 & 111) << 1;
                    int i135 = ((i133 | i134) << 1) - (i134 ^ i133);
                    E0 = i135 % 128;
                    int i136 = i135 % 2;
                }
                aed aedVar2 = ajnVar6.f52908w0;
                if (aedVar2 != null) {
                    int i137 = f52903y0;
                    int i138 = ((i137 | 71) << 1) - (i137 ^ 71);
                    E0 = i138 % 128;
                    if (i138 % 2 == 0) {
                        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aedVar2}, 240298319, -240298315, System.identityHashCode(adhVar));
                        throw null;
                    }
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aedVar2}, 240298319, -240298315, System.identityHashCode(adhVar));
                }
                aje ajeVar2 = ajnVar6.f52909x0;
                if (ajeVar2 != null) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(ajeVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i139 = f52903y0;
                    int i140 = ((i139 ^ 105) - (~(-(-((i139 & 105) << 1))))) - 1;
                    E0 = i140 % 128;
                    int i141 = i140 % 2;
                }
                afv afvVar = new afv(adhVar);
                int i142 = E0;
                int i143 = i142 & 107;
                int i144 = -(-(i142 | 107));
                int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                f52903y0 = i145 % 128;
                int i146 = i145 % 2;
                return afvVar;
        }
        return aVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, -1484599052, 1484599052, System.identityHashCode(this));
    }

    public final aje getNavBarTitleString() {
        return (aje) setY(new Object[]{this}, -345970549, 345970550, System.identityHashCode(this));
    }

    public final ajo setCompoundDrawableTintBlendMode() {
        return (ajo) setY(new Object[]{this}, -1274873801, 1274873804, System.identityHashCode(this));
    }

    public final aiw setDividerPadding() {
        return (aiw) setY(new Object[]{this}, -2060024391, 2060024395, System.identityHashCode(this));
    }

    public final Enumeration setLayoutAnimation() {
        return (Enumeration) setY(new Object[]{this}, 679046201, -679046195, System.identityHashCode(this));
    }

    public final ajo setOnFocusChangeListener() {
        return (ajo) setY(new Object[]{this}, 1323607819, -1323607817, System.identityHashCode(this));
    }

    public final ain setX() {
        return (ain) setY(new Object[]{this}, -604046175, 604046182, System.identityHashCode(this));
    }

    public final int setY() {
        return ((Integer) setY(new Object[]{this}, -531092194, 531092202, System.identityHashCode(this))).intValue();
    }

    public static ajn setY(Object obj) {
        return (ajn) setY(new Object[]{obj}, 1825094650, -1825094645, (int) System.currentTimeMillis());
    }
}
