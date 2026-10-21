package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aph {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53466b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53467c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aul f53468a;
    protected apk setCompoundDrawableTintBlendMode;
    protected int setDividerPadding = 0;
    protected atz setLayoutAnimation = null;
    protected apn setOnDragListener = null;
    protected BigInteger setOnFocusChangeListener;
    protected apk setX;
    protected BigInteger setY;

    public static class setCompoundDrawableTintBlendMode extends setDividerPadding {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f53469k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f53470l = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f53471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53472g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f53473h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f53474i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public apl.setOnFocusChangeListener f53475j;

        public setCompoundDrawableTintBlendMode(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i10, i11, i12, i13);
            this.f53471f = i10;
            this.f53472g = i11;
            this.f53473h = i12;
            this.f53474i = i13;
            this.setY = bigInteger3;
            this.setOnFocusChangeListener = bigInteger4;
            this.f53475j = new apl.setOnFocusChangeListener(this, null, null);
            this.setX = setOnFocusChangeListener(bigInteger);
            this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(bigInteger2);
            this.setDividerPadding = 6;
        }

        public static Object setY(Object[] objArr, int i10, int i11, int i12) {
            int[] iArr;
            Object setcompounddrawabletintblendmode;
            int i13;
            int i14 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
            int i15 = ~i11;
            int i16 = (((~((~i10) | i12)) | i15) * 301) + (((~(i15 | i12)) | (~((~i12) | i10))) * (-301)) + i14;
            if (i16 == 1) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (setCompoundDrawableTintBlendMode) objArr[0];
                int i17 = f53469k;
                int i18 = ((i17 | 33) << 1) - (i17 ^ 33);
                f53470l = i18 % 128;
                if (i18 % 2 != 0) {
                    return setcompounddrawabletintblendmode2.f53475j;
                }
                apl.setOnFocusChangeListener setonfocuschangelistener = setcompounddrawabletintblendmode2.f53475j;
                throw null;
            }
            if (i16 == 2) {
                apl.setOnFocusChangeListener setonfocuschangelistener2 = new apl.setOnFocusChangeListener((setCompoundDrawableTintBlendMode) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i19 = f53469k + 105;
                f53470l = i19 % 128;
                int i20 = i19 % 2;
                return setonfocuschangelistener2;
            }
            if (i16 == 3) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (setCompoundDrawableTintBlendMode) objArr[0];
                int i21 = f53469k;
                int i22 = (((i21 | 84) << 1) - (i21 ^ 84)) - 1;
                f53470l = i22 % 128;
                int i23 = i22 % 2;
                int i24 = setcompounddrawabletintblendmode3.f53471f;
                int i25 = i21 & 43;
                int i26 = (i21 | 43) & (~i25);
                int i27 = i25 << 1;
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                f53470l = i28 % 128;
                int i29 = i28 % 2;
                return Integer.valueOf(i24);
            }
            if (i16 == 4) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (setCompoundDrawableTintBlendMode) objArr[0];
                BigInteger bigInteger = (BigInteger) objArr[1];
                int i30 = f53469k;
                int i31 = i30 & 93;
                int i32 = (i30 ^ 93) | i31;
                int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                f53470l = i33 % 128;
                int i34 = i33 % 2;
                if (bigInteger != null) {
                    int i35 = (i30 & 13) + (i30 | 13);
                    f53470l = i35 % 128;
                    if (i35 % 2 == 0) {
                        bigInteger.signum();
                        throw null;
                    }
                    if (bigInteger.signum() >= 0) {
                        int i36 = f53469k;
                        int i37 = (i36 | 71) << 1;
                        int i38 = -(i36 ^ 71);
                        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                        f53470l = i39 % 128;
                        int i40 = i39 % 2;
                        int iBitLength = bigInteger.bitLength();
                        int i41 = setcompounddrawabletintblendmode4.f53471f;
                        if (iBitLength <= i41) {
                            int i42 = setcompounddrawabletintblendmode4.f53474i;
                            int i43 = ~i42;
                            int i44 = setcompounddrawabletintblendmode4.f53473h;
                            int i45 = (i43 & i44) | ((~i44) & i42) | (i44 & i42);
                            int i46 = setcompounddrawabletintblendmode4.f53472g;
                            if (i45 == 0) {
                                int i47 = f53470l;
                                int i48 = i47 & 47;
                                int i49 = ((i47 | 47) & (~i48)) + (i48 << 1);
                                f53469k = i49 % 128;
                                if (i49 % 2 != 0) {
                                    iArr = new int[0];
                                    iArr[0] = i46;
                                } else {
                                    iArr = new int[]{i46};
                                }
                            } else {
                                iArr = new int[]{i46, i44, i42};
                                int i50 = f53469k;
                                int i51 = (i50 & 63) + (i50 | 63);
                                f53470l = i51 % 128;
                                int i52 = i51 % 2;
                            }
                            p1 p1Var = new p1();
                            if (bigInteger.signum() < 0) {
                                throw new IllegalArgumentException("invalid F2m field value");
                            }
                            if (bigInteger.signum() == 0) {
                                p1Var.f57621p0 = new long[]{0};
                            } else {
                                byte[] byteArray = bigInteger.toByteArray();
                                int length = byteArray.length;
                                if (byteArray[0] == 0) {
                                    int i53 = ~length;
                                    int i54 = -(-(length << 1));
                                    length = ((i54 & i53) << 1) + (i53 ^ i54);
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                int i55 = length & 7;
                                int i56 = ((length ^ 7) | i55) << 1;
                                int i57 = -((~i55) & (length | 7));
                                int i58 = ((i56 & i57) + (i56 | i57)) / 8;
                                p1Var.f57621p0 = new long[i58];
                                int i59 = ((~i58) & 53) | (i58 & (-54));
                                int i60 = -(-((i58 & 53) << 1));
                                int i61 = (i59 & i60) + (i59 | i60);
                                int i62 = (((i61 | (-53)) << 1) - (i61 ^ (-53))) - 1;
                                int i63 = length % 8;
                                int i64 = -(-i13);
                                int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
                                if (i13 < i65) {
                                    long j10 = 0;
                                    while (i13 < i65) {
                                        j10 = (j10 << 8) | ((long) (byteArray[i13] & 255));
                                        int i66 = i13 & 1;
                                        int i67 = (~i66) & (i13 | 1);
                                        int i68 = i66 << 1;
                                        i13 = (i67 ^ i68) + ((i68 & i67) << 1);
                                    }
                                    long[] jArr = p1Var.f57621p0;
                                    int i69 = ((i62 & (-124)) + (i62 | (-124))) - 1;
                                    int i70 = i69 & 124;
                                    int i71 = ((i69 | 124) & (~i70)) + (i70 << 1);
                                    jArr[i62] = j10;
                                    i62 = i71;
                                }
                                while (i62 >= 0) {
                                    int i72 = 0;
                                    long j11 = 0;
                                    while (i72 < 8) {
                                        j11 = (j11 << 8) | ((long) (byteArray[i13] & 255));
                                        int i73 = ((i72 ^ 128) + ((i72 & 128) << 1)) - 1;
                                        int i74 = i73 & (-126);
                                        int i75 = -(-((i73 ^ (-126)) | i74));
                                        i72 = ((i74 | i75) << 1) - (i74 ^ i75);
                                        i13++;
                                    }
                                    p1Var.f57621p0[i62] = j11;
                                    i62 = (((i62 | 75) << 1) - (i62 ^ 75)) - 76;
                                }
                            }
                            setcompounddrawabletintblendmode = new apk.setCompoundDrawableTintBlendMode(i41, iArr, p1Var);
                            int i76 = f53470l;
                            int i77 = i76 & 69;
                            int i78 = (i76 | 69) & (~i77);
                            int i79 = i77 << 1;
                            int i80 = (i78 ^ i79) + ((i78 & i79) << 1);
                            f53469k = i80 % 128;
                            if (i80 % 2 != 0) {
                                throw null;
                            }
                        }
                    }
                }
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i16 != 5) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (setCompoundDrawableTintBlendMode) objArr[0];
                int i81 = setcompounddrawabletintblendmode5.f53471f;
                apk apkVar = setcompounddrawabletintblendmode5.setX;
                apk apkVar2 = setcompounddrawabletintblendmode5.setCompoundDrawableTintBlendMode;
                BigInteger bigInteger2 = setcompounddrawabletintblendmode5.setY;
                BigInteger bigInteger3 = setcompounddrawabletintblendmode5.setOnFocusChangeListener;
                int i82 = setcompounddrawabletintblendmode5.f53472g;
                int i83 = setcompounddrawabletintblendmode5.f53473h;
                int i84 = setcompounddrawabletintblendmode5.f53474i;
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = new setCompoundDrawableTintBlendMode(i81, i82, i83, i84);
                setcompounddrawabletintblendmode6.f53471f = i81;
                setcompounddrawabletintblendmode6.f53472g = i82;
                setcompounddrawabletintblendmode6.f53473h = i83;
                setcompounddrawabletintblendmode6.f53474i = i84;
                setcompounddrawabletintblendmode6.setY = bigInteger2;
                setcompounddrawabletintblendmode6.setOnFocusChangeListener = bigInteger3;
                setcompounddrawabletintblendmode6.f53475j = new apl.setOnFocusChangeListener(setcompounddrawabletintblendmode6, null, null);
                setcompounddrawabletintblendmode6.setX = apkVar;
                setcompounddrawabletintblendmode6.setCompoundDrawableTintBlendMode = apkVar2;
                setcompounddrawabletintblendmode6.setDividerPadding = 6;
                int i85 = f53470l;
                int i86 = i85 & 45;
                int i87 = i86 + ((i85 ^ 45) | i86);
                f53469k = i87 % 128;
                int i88 = i87 % 2;
                return setcompounddrawabletintblendmode6;
            }
            int iIntValue = ((Number) objArr[1]).intValue();
            int i89 = f53469k;
            int i90 = i89 + 101;
            int i91 = i90 % 128;
            f53470l = i91;
            if (i90 % 2 == 0) {
                throw null;
            }
            if (iIntValue == 0 || iIntValue == 1 || iIntValue == 6) {
                int i92 = i91 & 115;
                int i93 = -(-((i91 ^ 115) | i92));
                int i94 = (i92 & i93) + (i92 | i93);
                f53469k = i94 % 128;
                int i95 = i94 % 2;
                setcompounddrawabletintblendmode = Boolean.TRUE;
            } else {
                int i96 = i89 & 57;
                int i97 = ((i89 ^ 57) | i96) << 1;
                int i98 = -((~i96) & (i89 | 57));
                int i99 = (i97 & i98) + (i97 | i98);
                f53470l = i99 % 128;
                int i100 = i99 % 2;
                setcompounddrawabletintblendmode = Boolean.FALSE;
            }
            return setcompounddrawabletintblendmode;
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final aph setCompoundDrawableTintBlendMode() {
            return (aph) setY(new Object[]{this}, -436701338, 436701338, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apl setDividerPadding(apk apkVar, apk apkVar2) {
            return (apl) setY(new Object[]{this, apkVar, apkVar2}, -7286060, 7286062, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apk setOnFocusChangeListener(BigInteger bigInteger) {
            return (apk) setY(new Object[]{this, bigInteger}, 1572478557, -1572478553, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final boolean setDividerPadding(int i10) {
            return ((Boolean) setY(new Object[]{this, Integer.valueOf(i10)}, 1945715216, -1945715211, i10)).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final int setOnFocusChangeListener() {
            return ((Integer) setY(new Object[]{this}, 176887072, -176887069, System.identityHashCode(this))).intValue();
        }

        public setCompoundDrawableTintBlendMode(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apl setY() {
            return (apl) setY(new Object[]{this}, 1142557115, -1142557114, System.identityHashCode(this));
        }
    }

    public static abstract class setDividerPadding extends aph {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f53476d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f53477e = 1;

        public setDividerPadding(int i10, int i11, int i12, int i13) {
            super((aul) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)}, -441588180, 441588185, i10));
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0405  */
        /* JADX WARN: Code duplicated, block: B:101:0x0406  */
        /* JADX WARN: Code duplicated, block: B:104:0x0441 A[LOOP:1: B:103:0x043f->B:104:0x0441, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:107:0x0486  */
        /* JADX WARN: Code duplicated, block: B:112:0x04c7  */
        /* JADX WARN: Code duplicated, block: B:125:0x04b5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x0163  */
        /* JADX WARN: Code duplicated, block: B:35:0x0169  */
        /* JADX WARN: Code duplicated, block: B:38:0x0187  */
        /* JADX WARN: Code duplicated, block: B:40:0x018d  */
        /* JADX WARN: Code duplicated, block: B:83:0x037a  */
        /* JADX WARN: Code duplicated, block: B:85:0x0382  */
        /* JADX WARN: Code duplicated, block: B:87:0x0391  */
        /* JADX WARN: Code duplicated, block: B:90:0x03b4  */
        /* JADX WARN: Code duplicated, block: B:91:0x03c3  */
        /* JADX WARN: Code duplicated, block: B:92:0x03df  */
        /* JADX WARN: Code duplicated, block: B:94:0x03e5  */
        /* JADX WARN: Code duplicated, block: B:96:0x03f3  */
        /* JADX WARN: Code duplicated, block: B:98:0x0401  */
        /* JADX WARN: Code duplicated, block: B:99:0x0404  */
        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            BigInteger bigInteger;
            int onFocusChangeListener;
            apk onFocusChangeListener2;
            Random random;
            apk onFocusChangeListener3;
            apk onFocusChangeListener4;
            int i13;
            apk onFocusChangeListener5;
            int i14;
            int i15;
            int i16;
            int i17;
            apk includeFontPadding;
            int[] iArr;
            int i18;
            int i19 = ~i12;
            int i20 = ~i10;
            int i21 = ~i11;
            int i22 = i19 | (~(i20 | i21));
            int i23 = ~(i10 | i11);
            int i24 = (((~(i10 | i21)) | (~(i11 | i20))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i23) * (-1444)) + ((i22 | i23) * 1444) + (i11 * (-721)) + (i10 * (-721));
            apk onFocusChangeListener6 = null;
            boolean z10 = false;
            if (i24 == 1) {
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                do {
                    bigInteger = (BigInteger) bep.setDividerPadding(new Object[]{Integer.valueOf(iIntValue), secureRandom}, 948832868, -948832867, iIntValue);
                } while (bigInteger.signum() <= 0);
                int i25 = f53477e;
                int i26 = i25 + 91;
                f53476d = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
                int i27 = (i25 & (-94)) | ((~i25) & 93);
                int i28 = -(-((i25 & 93) << 1));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f53476d = i29 % 128;
                if (i29 % 2 == 0) {
                    return bigInteger;
                }
                throw null;
            }
            if (i24 != 2) {
                if (i24 == 3) {
                    setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    BigInteger bigInteger2 = (BigInteger) objArr[2];
                    int i30 = f53476d;
                    int i31 = i30 & 49;
                    int i32 = (i30 | 49) & (~i31);
                    int i33 = -(-(i31 << 1));
                    int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                    f53477e = i34 % 128;
                    int i35 = i34 % 2;
                    apk onFocusChangeListener7 = setdividerpadding.setOnFocusChangeListener(bigInteger2);
                    if (onFocusChangeListener7.setOnDragListener()) {
                        int i36 = f53477e;
                        int i37 = i36 & 105;
                        int i38 = (i36 ^ 105) | i37;
                        int i39 = (i37 & i38) + (i38 | i37);
                        f53476d = i39 % 128;
                        if (i39 % 2 != 0) {
                            setdividerpadding.setOnLongClickListener().setOnLongClickListener();
                            throw null;
                        }
                        onFocusChangeListener6 = setdividerpadding.setOnLongClickListener().setOnLongClickListener();
                        int i40 = f53477e + 39;
                        f53476d = i40 % 128;
                        int i41 = i40 % 2;
                    } else {
                        apk dividerPadding = (apk) setOnFocusChangeListener(new Object[]{setdividerpadding, onFocusChangeListener7.setX().setNavigationOnClickListener().setCompoundDrawableTintBlendMode(setdividerpadding.setOnLongClickListener()).setOnFocusChangeListener(setdividerpadding.getNavBarTitleString()).setOnFocusChangeListener(onFocusChangeListener7)}, -451405860, 451405862, System.identityHashCode(setdividerpadding));
                        if (dividerPadding != null) {
                            int i42 = f53477e;
                            int i43 = ((i42 ^ 5) | (i42 & 5)) << 1;
                            int i44 = -(((~i42) & 5) | (i42 & (-6)));
                            int i45 = (i43 & i44) + (i44 | i43);
                            f53476d = i45 % 128;
                            int i46 = i45 % 2;
                            boolean alwaysDrawnWithCacheEnabled = dividerPadding.setAlwaysDrawnWithCacheEnabled();
                            if (iIntValue2 == 1) {
                                int i47 = f53476d;
                                int i48 = i47 & 53;
                                int i49 = (~i48) & (i47 | 53);
                                int i50 = -(-(i48 << 1));
                                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                                f53477e = i51 % 128;
                                int i52 = i51 % 2;
                                int i53 = i47 & 95;
                                int i54 = -(-((i47 ^ 95) | i53));
                                int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                                f53477e = i55 % 128;
                                int i56 = i55 % 2;
                                z10 = true;
                            } else {
                                int i57 = f53477e;
                                int i58 = i57 & 105;
                                int i59 = (i57 | 105) & (~i58);
                                int i60 = -(-(i58 << 1));
                                int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                                f53476d = i61 % 128;
                                int i62 = i61 % 2;
                            }
                            if (alwaysDrawnWithCacheEnabled != z10) {
                                int i63 = f53477e;
                                int i64 = i63 & 71;
                                int i65 = -(-((i63 ^ 71) | i64));
                                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                                f53476d = i66 % 128;
                                if (i66 % 2 != 0) {
                                    dividerPadding.setDividerPadding();
                                    throw null;
                                }
                                dividerPadding = dividerPadding.setDividerPadding();
                                int i67 = f53476d;
                                int i68 = i67 & 23;
                                int i69 = i67 | 23;
                                int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                                f53477e = i70 % 128;
                                int i71 = i70 % 2;
                            }
                            int layoutAnimation = setdividerpadding.setLayoutAnimation();
                            if (layoutAnimation == 5 || layoutAnimation == 6) {
                                onFocusChangeListener6 = dividerPadding.setOnFocusChangeListener(onFocusChangeListener7);
                                int i72 = f53477e;
                                int i73 = (i72 ^ 51) + ((i72 & 51) << 1);
                                f53476d = i73 % 128;
                                int i74 = i73 % 2;
                            } else {
                                onFocusChangeListener6 = dividerPadding.setCompoundDrawableTintBlendMode(onFocusChangeListener7);
                                int i75 = f53476d;
                                int i76 = i75 & 79;
                                int i77 = -(-(i75 | 79));
                                int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
                                f53477e = i78 % 128;
                                int i79 = i78 % 2;
                            }
                        }
                    }
                    if (onFocusChangeListener6 == null) {
                        throw new IllegalArgumentException("Invalid point compression");
                    }
                    apl dividerPadding2 = setdividerpadding.setDividerPadding(onFocusChangeListener7, onFocusChangeListener6);
                    int i80 = f53477e;
                    int i81 = (((i80 ^ 57) | (i80 & 57)) << 1) - (((~i80) & 57) | (i80 & (-58)));
                    f53476d = i81 % 128;
                    int i82 = i81 % 2;
                    return dividerPadding2;
                }
                if (i24 == 4) {
                    setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                    BigInteger bigInteger3 = (BigInteger) objArr[1];
                    BigInteger bigInteger4 = (BigInteger) objArr[2];
                    int i83 = f53477e;
                    int i84 = i83 & 125;
                    int i85 = i84 + ((i83 ^ 125) | i84);
                    f53476d = i85 % 128;
                    int i86 = i85 % 2;
                    apk onFocusChangeListener8 = setdividerpadding2.setOnFocusChangeListener(bigInteger3);
                    apk onFocusChangeListener9 = setdividerpadding2.setOnFocusChangeListener(bigInteger4);
                    int layoutAnimation2 = setdividerpadding2.setLayoutAnimation();
                    if (i86 != 0) {
                        int i87 = 54 / 0;
                        if (layoutAnimation2 == 5 || layoutAnimation2 == 6) {
                            if (onFocusChangeListener8.setOnDragListener()) {
                                int i88 = f53477e;
                                int i89 = ((i88 ^ 119) - (~((i88 & 119) << 1))) - 1;
                                f53476d = i89 % 128;
                                int i90 = i89 % 2;
                                if (!onFocusChangeListener9.setX().equals(setdividerpadding2.setOnLongClickListener())) {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                onFocusChangeListener9 = onFocusChangeListener9.setDividerPadding(onFocusChangeListener8).setOnFocusChangeListener(onFocusChangeListener8);
                                int i91 = f53477e;
                                int i92 = ((((i91 ^ 93) | (i91 & 93)) << 1) - (~(-(((~i91) & 93) | (i91 & (-94)))))) - 1;
                                f53476d = i92 % 128;
                                int i93 = i92 % 2;
                            }
                        }
                    } else if (layoutAnimation2 == 5 || layoutAnimation2 == 6) {
                        if (onFocusChangeListener8.setOnDragListener()) {
                            int i810 = f53477e;
                            int i811 = ((i810 ^ 119) - (~((i810 & 119) << 1))) - 1;
                            f53476d = i811 % 128;
                            int i94 = i811 % 2;
                            if (!onFocusChangeListener9.setX().equals(setdividerpadding2.setOnLongClickListener())) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            onFocusChangeListener9 = onFocusChangeListener9.setDividerPadding(onFocusChangeListener8).setOnFocusChangeListener(onFocusChangeListener8);
                            int i95 = f53477e;
                            int i96 = ((((i95 ^ 93) | (i95 & 93)) << 1) - (~(-(((~i95) & 93) | (i95 & (-94)))))) - 1;
                            f53476d = i96 % 128;
                            int i97 = i96 % 2;
                        }
                    }
                    apl dividerPadding3 = setdividerpadding2.setDividerPadding(onFocusChangeListener8, onFocusChangeListener9);
                    int i98 = f53477e;
                    int i99 = (i98 ^ 31) + ((i98 & 31) << 1);
                    f53476d = i99 % 128;
                    if (i99 % 2 == 0) {
                        return dividerPadding3;
                    }
                    int i100 = 65 / 0;
                    return dividerPadding3;
                }
                if (i24 != 5) {
                    setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
                    SecureRandom secureRandom2 = (SecureRandom) objArr[1];
                    int i101 = f53477e;
                    int i102 = i101 & 13;
                    int i103 = (i101 | 13) & (~i102);
                    int i104 = i102 << 1;
                    int i105 = (i103 ^ i104) + ((i103 & i104) << 1);
                    f53476d = i105 % 128;
                    int i106 = i105 % 2;
                    int onFocusChangeListener10 = setdividerpadding3.setOnFocusChangeListener();
                    apk compoundDrawableTintBlendMode = setdividerpadding3.setOnFocusChangeListener((BigInteger) setOnFocusChangeListener(new Object[]{secureRandom2, Integer.valueOf(onFocusChangeListener10)}, -75634659, 75634660, onFocusChangeListener10)).setCompoundDrawableTintBlendMode(setdividerpadding3.setOnFocusChangeListener((BigInteger) setOnFocusChangeListener(new Object[]{secureRandom2, Integer.valueOf(onFocusChangeListener10)}, -75634659, 75634660, onFocusChangeListener10)));
                    int i107 = f53477e;
                    int i108 = (i107 ^ 101) + ((i107 & 101) << 1);
                    f53476d = i108 % 128;
                    int i109 = i108 % 2;
                    return compoundDrawableTintBlendMode;
                }
                int iIntValue3 = ((Number) objArr[0]).intValue();
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int iIntValue6 = ((Number) objArr[3]).intValue();
                int i110 = f53476d;
                int i111 = i110 + 48;
                int i112 = (i111 ^ (-1)) + (i111 << 1);
                int i113 = i112 % 128;
                f53477e = i113;
                if (i112 % 2 == 0) {
                    throw null;
                }
                int i114 = iIntValue5 & iIntValue6;
                int i115 = (~i114) & (iIntValue5 | iIntValue6);
                if (((i114 & i115) | (i115 ^ i114)) == 0) {
                    iArr = new int[]{0, iIntValue4, iIntValue3};
                    int i116 = i113 & 27;
                    int i117 = -(-(i113 | 27));
                    i18 = (i116 & i117) + (i116 | i117);
                    f53476d = i18 % 128;
                } else {
                    iArr = new int[]{0, iIntValue4, iIntValue5, iIntValue6, iIntValue3};
                    int i118 = ((i110 ^ 109) | (i110 & 109)) << 1;
                    int i119 = -((i110 & (-110)) | ((~i110) & 109));
                    i18 = ((i118 | i119) << 1) - (i118 ^ i119);
                    f53477e = i18 % 128;
                }
                int i120 = i18 % 2;
                auq auqVar = (auq) aup.setOnFocusChangeListener(new Object[]{iArr}, 1285721114, -1285721113, (int) System.currentTimeMillis());
                int i121 = f53477e;
                int i122 = i121 & 49;
                int i123 = (((i121 | 49) & (~i122)) - (~(-(-(i122 << 1))))) - 1;
                f53476d = i123 % 128;
                if (i123 % 2 == 0) {
                    return auqVar;
                }
                throw null;
            }
            setDividerPadding setdividerpadding4 = (setDividerPadding) objArr[0];
            apk apkVar = (apk) objArr[1];
            System.identityHashCode(setdividerpadding4);
            System.identityHashCode(setdividerpadding4);
            apk.setOnFocusChangeListener setonfocuschangelistener = (apk.setOnFocusChangeListener) apkVar;
            boolean z11 = setonfocuschangelistener.setZ();
            if (z11) {
                int i124 = f53476d;
                int i125 = i124 | 5;
                int i126 = i125 << 1;
                int i127 = -((~(5 & i124)) & i125);
                int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                f53477e = i128 % 128;
                int i129 = i128 % 2;
                int iUiMessageCallbackKtWhenMappings = setonfocuschangelistener.UiMessageCallbackKtWhenMappings();
                if (i129 != 0 ? iUiMessageCallbackKtWhenMappings == 0 : 1 == iUiMessageCallbackKtWhenMappings) {
                    onFocusChangeListener = setdividerpadding4.setOnFocusChangeListener();
                    if ((onFocusChangeListener & 1) != 0) {
                        int i130 = f53476d + 79;
                        f53477e = i130 % 128;
                        int i131 = i130 % 2;
                        includeFontPadding = setonfocuschangelistener.setIncludeFontPadding();
                        if (z11) {
                            int i132 = f53477e;
                            int i133 = ((i132 ^ 43) | (i132 & 43)) << 1;
                            int i134 = -(((~i132) & 43) | (i132 & (-44)));
                            int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                            f53476d = i135 % 128;
                            int i136 = i135 % 2;
                            onFocusChangeListener6 = includeFontPadding;
                        } else {
                            int i137 = f53477e;
                            int i138 = i137 & 51;
                            int i139 = (i137 ^ 51) | i138;
                            int i140 = (i138 & i139) + (i139 | i138);
                            f53476d = i140 % 128;
                            int i141 = i140 % 2;
                            if (includeFontPadding.setX().setOnFocusChangeListener(includeFontPadding).setOnFocusChangeListener(apkVar).setOnDragListener()) {
                                int i1310 = f53477e;
                                int i1311 = ((i1310 ^ 43) | (i1310 & 43)) << 1;
                                int i1312 = -(((~i1310) & 43) | (i1310 & (-44)));
                                int i1313 = (i1311 ^ i1312) + ((i1312 & i1311) << 1);
                                f53476d = i1313 % 128;
                                int i1314 = i1313 % 2;
                                onFocusChangeListener6 = includeFontPadding;
                            } else {
                                int i142 = f53476d;
                                int i143 = i142 & 37;
                                int i144 = i143 + ((i142 ^ 37) | i143);
                                f53477e = i144 % 128;
                                int i145 = i144 % 2;
                            }
                        }
                    } else if (apkVar.setOnDragListener()) {
                        int i146 = f53477e;
                        i15 = (i146 & 57) + (i146 | 57);
                        i16 = i15 % 128;
                        f53476d = i16;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        i17 = ((i16 & 60) + (i16 | 60)) - 1;
                        f53477e = i17 % 128;
                        if (i17 % 2 != 0) {
                            throw null;
                        }
                        onFocusChangeListener6 = apkVar;
                    } else {
                        onFocusChangeListener2 = setdividerpadding4.setOnFocusChangeListener(apj.setY);
                        random = new Random();
                        int i147 = f53476d;
                        int i148 = ((i147 & 96) + (i147 | 96)) - 1;
                        f53477e = i148 % 128;
                        int i149 = i148 % 2;
                        do {
                            onFocusChangeListener3 = setdividerpadding4.setOnFocusChangeListener(new BigInteger(onFocusChangeListener, random));
                            int i150 = f53476d;
                            int i151 = (i150 & (-26)) | ((~i150) & 25);
                            int i152 = (i150 & 25) << 1;
                            int i153 = (i151 ^ i152) + ((i152 & i151) << 1);
                            f53477e = i153 % 128;
                            int i154 = i153 % 2;
                            onFocusChangeListener4 = apkVar;
                            i13 = 1;
                            onFocusChangeListener5 = onFocusChangeListener2;
                            while (i13 < onFocusChangeListener) {
                                int i155 = f53477e;
                                int i156 = (-2) - ((((i155 | 110) << 1) - (i155 ^ 110)) ^ (-1));
                                f53476d = i156 % 128;
                                int i157 = i156 % 2;
                                apk x4 = onFocusChangeListener4.setX();
                                onFocusChangeListener5 = onFocusChangeListener5.setX().setOnFocusChangeListener(x4.setCompoundDrawableTintBlendMode(onFocusChangeListener3));
                                onFocusChangeListener4 = x4.setOnFocusChangeListener(apkVar);
                                int i158 = (i13 ^ 41) + ((i13 & 41) << 1);
                                int i159 = ((i158 | (-39)) << 1) - (i158 ^ (-39));
                                i13 = (i159 << 1) + (i159 ^ (-1));
                                int i160 = f53477e + 69;
                                f53476d = i160 % 128;
                                int i161 = i160 % 2;
                            }
                            if (onFocusChangeListener4.setOnDragListener()) {
                                int i162 = f53476d;
                                int i163 = (i162 & 106) + (i162 | 106);
                                i14 = (i163 ^ (-1)) + (i163 << 1);
                                f53477e = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i164 = 33 / 0;
                                }
                            }
                        } while (onFocusChangeListener5.setX().setOnFocusChangeListener(onFocusChangeListener5).setOnDragListener());
                        int i165 = f53477e;
                        int i166 = i165 & 111;
                        int i167 = (~i166) & (i165 | 111);
                        int i168 = i166 << 1;
                        int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
                        f53476d = i169 % 128;
                        int i170 = i169 % 2;
                        int i171 = i165 ^ 109;
                        int i172 = (((i165 & 109) | i171) << 1) - i171;
                        f53476d = i172 % 128;
                        int i173 = i172 % 2;
                        onFocusChangeListener6 = onFocusChangeListener5;
                    }
                } else {
                    int i174 = f53476d;
                    int i175 = (i174 ^ 41) + ((i174 & 41) << 1);
                    f53477e = i175 % 128;
                    if (i175 % 2 == 0) {
                        throw null;
                    }
                }
            } else {
                onFocusChangeListener = setdividerpadding4.setOnFocusChangeListener();
                if ((onFocusChangeListener & 1) != 0) {
                    int i1315 = f53476d + 79;
                    f53477e = i1315 % 128;
                    int i1316 = i1315 % 2;
                    includeFontPadding = setonfocuschangelistener.setIncludeFontPadding();
                    if (z11) {
                        int i1317 = f53477e;
                        int i1318 = i1317 & 51;
                        int i1319 = (i1317 ^ 51) | i1318;
                        int i1410 = (i1318 & i1319) + (i1319 | i1318);
                        f53476d = i1410 % 128;
                        int i1411 = i1410 % 2;
                        if (includeFontPadding.setX().setOnFocusChangeListener(includeFontPadding).setOnFocusChangeListener(apkVar).setOnDragListener()) {
                            int i13110 = f53477e;
                            int i13111 = ((i13110 ^ 43) | (i13110 & 43)) << 1;
                            int i13112 = -(((~i13110) & 43) | (i13110 & (-44)));
                            int i13113 = (i13111 ^ i13112) + ((i13112 & i13111) << 1);
                            f53476d = i13113 % 128;
                            int i13114 = i13113 % 2;
                            onFocusChangeListener6 = includeFontPadding;
                        } else {
                            int i1412 = f53476d;
                            int i1413 = i1412 & 37;
                            int i1414 = i1413 + ((i1412 ^ 37) | i1413);
                            f53477e = i1414 % 128;
                            int i1415 = i1414 % 2;
                        }
                    } else {
                        int i13115 = f53477e;
                        int i13116 = ((i13115 ^ 43) | (i13115 & 43)) << 1;
                        int i13117 = -(((~i13115) & 43) | (i13115 & (-44)));
                        int i13118 = (i13116 ^ i13117) + ((i13117 & i13116) << 1);
                        f53476d = i13118 % 128;
                        int i13119 = i13118 % 2;
                        onFocusChangeListener6 = includeFontPadding;
                    }
                } else if (apkVar.setOnDragListener()) {
                    int i1416 = f53477e;
                    i15 = (i1416 & 57) + (i1416 | 57);
                    i16 = i15 % 128;
                    f53476d = i16;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    i17 = ((i16 & 60) + (i16 | 60)) - 1;
                    f53477e = i17 % 128;
                    if (i17 % 2 != 0) {
                        throw null;
                    }
                    onFocusChangeListener6 = apkVar;
                } else {
                    onFocusChangeListener2 = setdividerpadding4.setOnFocusChangeListener(apj.setY);
                    random = new Random();
                    int i1417 = f53476d;
                    int i1418 = ((i1417 & 96) + (i1417 | 96)) - 1;
                    f53477e = i1418 % 128;
                    int i1419 = i1418 % 2;
                    do {
                        onFocusChangeListener3 = setdividerpadding4.setOnFocusChangeListener(new BigInteger(onFocusChangeListener, random));
                        int i1510 = f53476d;
                        int i1511 = (i1510 & (-26)) | ((~i1510) & 25);
                        int i1512 = (i1510 & 25) << 1;
                        int i1513 = (i1511 ^ i1512) + ((i1512 & i1511) << 1);
                        f53477e = i1513 % 128;
                        int i1514 = i1513 % 2;
                        onFocusChangeListener4 = apkVar;
                        i13 = 1;
                        onFocusChangeListener5 = onFocusChangeListener2;
                        while (i13 < onFocusChangeListener) {
                            int i1515 = f53477e;
                            int i1516 = (-2) - ((((i1515 | 110) << 1) - (i1515 ^ 110)) ^ (-1));
                            f53476d = i1516 % 128;
                            int i1517 = i1516 % 2;
                            apk x6 = onFocusChangeListener4.setX();
                            onFocusChangeListener5 = onFocusChangeListener5.setX().setOnFocusChangeListener(x6.setCompoundDrawableTintBlendMode(onFocusChangeListener3));
                            onFocusChangeListener4 = x6.setOnFocusChangeListener(apkVar);
                            int i1518 = (i13 ^ 41) + ((i13 & 41) << 1);
                            int i1519 = ((i1518 | (-39)) << 1) - (i1518 ^ (-39));
                            i13 = (i1519 << 1) + (i1519 ^ (-1));
                            int i1610 = f53477e + 69;
                            f53476d = i1610 % 128;
                            int i1611 = i1610 % 2;
                        }
                        if (onFocusChangeListener4.setOnDragListener()) {
                            int i1612 = f53476d;
                            int i1613 = (i1612 & 106) + (i1612 | 106);
                            i14 = (i1613 ^ (-1)) + (i1613 << 1);
                            f53477e = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i1614 = 33 / 0;
                            }
                        }
                    } while (onFocusChangeListener5.setX().setOnFocusChangeListener(onFocusChangeListener5).setOnDragListener());
                    int i1615 = f53477e;
                    int i1616 = i1615 & 111;
                    int i1617 = (~i1616) & (i1615 | 111);
                    int i1618 = i1616 << 1;
                    int i1619 = (i1617 ^ i1618) + ((i1618 & i1617) << 1);
                    f53476d = i1619 % 128;
                    int i176 = i1619 % 2;
                    int i177 = i1615 ^ 109;
                    int i178 = (((i1615 & 109) | i177) << 1) - i177;
                    f53476d = i178 % 128;
                    int i179 = i178 % 2;
                    onFocusChangeListener6 = onFocusChangeListener5;
                }
            }
            return onFocusChangeListener6;
        }

        public final apk setX(apk apkVar) {
            return (apk) setOnFocusChangeListener(new Object[]{this, apkVar}, -451405860, 451405862, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apl setY(int i10, BigInteger bigInteger) {
            return (apl) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10), bigInteger}, -1982762907, 1982762910, i10);
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apk setY(SecureRandom secureRandom) {
            return (apk) setOnFocusChangeListener(new Object[]{this, secureRandom}, 1801827753, -1801827753, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apl setY(BigInteger bigInteger, BigInteger bigInteger2) {
            return (apl) setOnFocusChangeListener(new Object[]{this, bigInteger, bigInteger2}, -817705798, 817705802, System.identityHashCode(this));
        }
    }

    public static class setX extends setOnFocusChangeListener {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Set<BigInteger> f53480i = Collections.synchronizedSet(new HashSet());

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final bep.setX f53481j = new bep.setX();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f53482k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f53483l = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public BigInteger f53484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public BigInteger f53485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public apl.setCompoundDrawableTintBlendMode f53486h;

        static {
            int i10 = f53482k;
            int i11 = (i10 ^ 61) + ((i10 & 61) << 1);
            f53483l = i11 % 128;
            int i12 = i11 % 2;
        }

        public setX(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, boolean z10) {
            super(bigInteger);
            Set<BigInteger> set = f53480i;
            if (z10) {
                this.f53484f = bigInteger;
                set.add(bigInteger);
            } else {
                if (!set.contains(bigInteger)) {
                    bep.setX setx = f53481j;
                    if (!setx.setX(bigInteger)) {
                        int iIntValue = ((Integer) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.ec.fp_max_size", 1042}, 1567609481, -1567609476, 1042)).intValue();
                        int iIntValue2 = ((Integer) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.ec.fp_certainty", 100}, 1567609481, -1567609476, 100)).intValue();
                        int iBitLength = bigInteger.bitLength();
                        if (iIntValue < iBitLength) {
                            throw new IllegalArgumentException("Fp q value out of range");
                        }
                        if (!((Boolean) apg.setOnFocusChangeListener(new Object[]{bigInteger}, -34119832, 34119834, (int) System.currentTimeMillis())).booleanValue()) {
                            SecureRandom secureRandom = (SecureRandom) aku.setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis());
                            int iIntValue3 = ((Integer) aph.setX(new Object[]{Integer.valueOf(iBitLength), Integer.valueOf(iIntValue2)}, -628380523, 628380524, iBitLength)).intValue();
                            if (((Boolean) apg.setOnFocusChangeListener(new Object[]{bigInteger, secureRandom, Integer.valueOf(iIntValue3)}, -1579951707, 1579951710, iIntValue3)).booleanValue()) {
                                setx.setY(bigInteger);
                            }
                        }
                        throw new IllegalArgumentException("Fp q value not prime");
                    }
                }
                this.f53484f = bigInteger;
            }
            this.f53485g = (BigInteger) apk.setY.setX(new Object[]{bigInteger}, -2013972580, 2013972589, (int) System.currentTimeMillis());
            this.f53486h = new apl.setCompoundDrawableTintBlendMode(this, null, null);
            this.setX = setOnFocusChangeListener(bigInteger2);
            this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(bigInteger3);
            this.setY = bigInteger4;
            this.setOnFocusChangeListener = bigInteger5;
            this.setDividerPadding = 4;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0174  */
        /* JADX WARN: Code duplicated, block: B:38:0x0241  */
        /* JADX WARN: Code duplicated, block: B:40:0x024f  */
        /* JADX WARN: Code duplicated, block: B:42:0x0263  */
        /* JADX WARN: Code duplicated, block: B:47:0x029d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0300  */
        /* JADX WARN: Code duplicated, block: B:62:0x0311  */
        /* JADX WARN: Code duplicated, block: B:64:0x032f  */
        public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            Object sety;
            int i13;
            int i14;
            int i15;
            int i16;
            int layoutAnimation;
            Object onFocusChangeListener;
            int i17 = ~i10;
            int i18 = ~i11;
            int i19 = i17 | i18;
            int i20 = ~i12;
            switch ((((~(i10 | i18 | i20)) | (~(i17 | i12))) * 765) + (((~i19) | (~(i17 | i20))) * 1530) + (((~(i11 | i17 | i12)) | (~(i19 | i20)) | (~(i18 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529))) {
                case 1:
                    setX setx = (setX) objArr[0];
                    BigInteger bigInteger = (BigInteger) objArr[1];
                    int i21 = f53482k;
                    int i22 = (((i21 | 80) << 1) - (i21 ^ 80)) - 1;
                    f53483l = i22 % 128;
                    int i23 = i22 % 2;
                    if (bigInteger != null) {
                        int i24 = (i21 & 109) + (i21 | 109);
                        f53483l = i24 % 128;
                        int i25 = i24 % 2;
                        int iSignum = bigInteger.signum();
                        if (i25 == 0) {
                            int i26 = 38 / 0;
                            if (iSignum >= 0) {
                                int i27 = f53483l + 67;
                                f53482k = i27 % 128;
                                int i28 = i27 % 2;
                                if (bigInteger.compareTo(setx.f53484f) < 0) {
                                    sety = new apk.setY(setx.f53484f, setx.f53485g, bigInteger);
                                    int i29 = f53482k;
                                    int i30 = (i29 | 11) << 1;
                                    int i31 = -(i29 ^ 11);
                                    i13 = (i30 ^ i31) + ((i31 & i30) << 1);
                                    f53483l = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        int i32 = 11 / 0;
                                    }
                                    return sety;
                                }
                            }
                        } else if (iSignum >= 0) {
                            int i210 = f53483l + 67;
                            f53482k = i210 % 128;
                            int i211 = i210 % 2;
                            if (bigInteger.compareTo(setx.f53484f) < 0) {
                                sety = new apk.setY(setx.f53484f, setx.f53485g, bigInteger);
                                int i212 = f53482k;
                                int i33 = (i212 | 11) << 1;
                                int i34 = -(i212 ^ 11);
                                i13 = (i33 ^ i34) + ((i34 & i33) << 1);
                                f53483l = i13 % 128;
                                if (i13 % 2 == 0) {
                                    int i35 = 11 / 0;
                                }
                                return sety;
                            }
                        }
                    }
                    throw new IllegalArgumentException("x value invalid for Fp field element");
                case 2:
                    setX setx2 = (setX) objArr[0];
                    apl aplVar = (apl) objArr[1];
                    int i36 = f53483l;
                    int i37 = (i36 ^ 1) + ((i36 & 1) << 1);
                    f53482k = i37 % 128;
                    if (i37 % 2 != 0) {
                        int i38 = 81 / 0;
                        if (setx2 != ((aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar)))) {
                            int iIdentityHashCode = System.identityHashCode(setx2);
                            int i39 = (-420966441) & iIdentityHashCode;
                            int i40 = ((~i39) & ((-420966441) | iIdentityHashCode)) | i39;
                            int i41 = ~i40;
                            int i42 = (i40 | i41) & i41;
                            int i43 = ((~i42) & (-1423212196)) | (1423212195 & i42);
                            int i44 = i42 & (-1423212196);
                            int i45 = -(~(((i44 & i43) | (i43 ^ i44)) * (-658)));
                            int i46 = (((-686689350) | i45) << 1) - (i45 ^ (-686689350));
                            int i47 = ((i46 ^ (-1)) + (i46 << 1)) - (-699798673);
                            int i48 = (i47 ^ (-1)) + (i47 << 1);
                            int i49 = -(-(((~((iIdentityHashCode ^ (-420966441)) | i39)) | 151191560) * 658));
                            int i50 = ((~i49) & i48) | ((~i48) & i49);
                            int i51 = (i49 & i48) << 1;
                            i14 = ((i50 | i51) << 1) - (i51 ^ i50);
                            int i52 = ~System.identityHashCode(setx2);
                            int i53 = ~i52;
                            int i54 = ((-564187651) & i53) | (564187650 & i52);
                            int i55 = (-564187651) & i52;
                            int i56 = ((i55 & i54) | (i54 ^ i55)) * 494;
                            int i57 = (((-1749712119) ^ i56) - (~(-(-((i56 & (-1749712119)) << 1))))) - 1;
                            int i58 = (i53 & (-2041632291)) | (2041632290 & i52);
                            int i59 = i52 & (-2041632291);
                            int i60 = (i59 & i58) | (i58 ^ i59);
                            int i61 = ~i60;
                            int i62 = (i60 | i61) & i61;
                            int i63 = ((~i62) & (-2046162796)) | (2046162795 & i62);
                            int i64 = i62 & (-2046162796);
                            int i65 = (i64 & i63) | (i63 ^ i64);
                            int i66 = ((-1477444641) & i65) | ((~i65) & 1477444640);
                            int i67 = i65 & 1477444640;
                            int i68 = ((i67 & i66) | (i66 ^ i67)) * 494;
                            i15 = (i57 & i68) + (i68 | i57);
                            int layoutAnimation2 = setx2.setLayoutAnimation();
                            if (i14 <= i15 ? layoutAnimation2 == 2 : layoutAnimation2 == 4) {
                                if (!((Boolean) apl.setOnFocusChangeListener(new Object[]{aplVar}, 2114769082, -2114769081, System.identityHashCode(aplVar))).booleanValue()) {
                                    int i69 = f53483l;
                                    i16 = (i69 & 53) + (i69 | 53);
                                    f53482k = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        ((aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar))).setLayoutAnimation();
                                        throw null;
                                    }
                                    layoutAnimation = ((aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar))).setLayoutAnimation();
                                    if (layoutAnimation != 2 || layoutAnimation == 3 || layoutAnimation == 4) {
                                        sety = new apl.setCompoundDrawableTintBlendMode(setx2, setx2.setOnFocusChangeListener(aplVar.setX.setCompoundDrawableTintBlendMode()), setx2.setOnFocusChangeListener(aplVar.setOnFocusChangeListener.setCompoundDrawableTintBlendMode()), new apk[]{setx2.setOnFocusChangeListener(aplVar.setY[0].setCompoundDrawableTintBlendMode())});
                                        int i70 = f53482k + 89;
                                        f53483l = i70 % 128;
                                        int i71 = i70 % 2;
                                        return sety;
                                    }
                                }
                            }
                        }
                    } else if (setx2 != ((aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar)))) {
                        int iIdentityHashCode2 = System.identityHashCode(setx2);
                        int i310 = (-420966441) & iIdentityHashCode2;
                        int i410 = ((~i310) & ((-420966441) | iIdentityHashCode2)) | i310;
                        int i411 = ~i410;
                        int i412 = (i410 | i411) & i411;
                        int i413 = ((~i412) & (-1423212196)) | (1423212195 & i412);
                        int i414 = i412 & (-1423212196);
                        int i415 = -(~(((i414 & i413) | (i413 ^ i414)) * (-658)));
                        int i416 = (((-686689350) | i415) << 1) - (i415 ^ (-686689350));
                        int i417 = ((i416 ^ (-1)) + (i416 << 1)) - (-699798673);
                        int i418 = (i417 ^ (-1)) + (i417 << 1);
                        int i419 = -(-(((~((iIdentityHashCode2 ^ (-420966441)) | i310)) | 151191560) * 658));
                        int i510 = ((~i419) & i418) | ((~i418) & i419);
                        int i511 = (i419 & i418) << 1;
                        i14 = ((i510 | i511) << 1) - (i511 ^ i510);
                        int i512 = ~System.identityHashCode(setx2);
                        int i513 = ~i512;
                        int i514 = ((-564187651) & i513) | (564187650 & i512);
                        int i515 = (-564187651) & i512;
                        int i516 = ((i515 & i514) | (i514 ^ i515)) * 494;
                        int i517 = (((-1749712119) ^ i516) - (~(-(-((i516 & (-1749712119)) << 1))))) - 1;
                        int i518 = (i513 & (-2041632291)) | (2041632290 & i512);
                        int i519 = i512 & (-2041632291);
                        int i610 = (i519 & i518) | (i518 ^ i519);
                        int i611 = ~i610;
                        int i612 = (i610 | i611) & i611;
                        int i613 = ((~i612) & (-2046162796)) | (2046162795 & i612);
                        int i614 = i612 & (-2046162796);
                        int i615 = (i614 & i613) | (i613 ^ i614);
                        int i616 = ((-1477444641) & i615) | ((~i615) & 1477444640);
                        int i617 = i615 & 1477444640;
                        int i618 = ((i617 & i616) | (i616 ^ i617)) * 494;
                        i15 = (i517 & i618) + (i618 | i517);
                        int layoutAnimation3 = setx2.setLayoutAnimation();
                        if (i14 <= i15) {
                            if (!((Boolean) apl.setOnFocusChangeListener(new Object[]{aplVar}, 2114769082, -2114769081, System.identityHashCode(aplVar))).booleanValue()) {
                                int i619 = f53483l;
                                i16 = (i619 & 53) + (i619 | 53);
                                f53482k = i16 % 128;
                                if (i16 % 2 != 0) {
                                    ((aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar))).setLayoutAnimation();
                                    throw null;
                                }
                                layoutAnimation = ((aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar))).setLayoutAnimation();
                                if (layoutAnimation != 2) {
                                }
                                sety = new apl.setCompoundDrawableTintBlendMode(setx2, setx2.setOnFocusChangeListener(aplVar.setX.setCompoundDrawableTintBlendMode()), setx2.setOnFocusChangeListener(aplVar.setOnFocusChangeListener.setCompoundDrawableTintBlendMode()), new apk[]{setx2.setOnFocusChangeListener(aplVar.setY[0].setCompoundDrawableTintBlendMode())});
                                int i72 = f53482k + 89;
                                f53483l = i72 % 128;
                                int i73 = i72 % 2;
                                return sety;
                            }
                        } else if (!((Boolean) apl.setOnFocusChangeListener(new Object[]{aplVar}, 2114769082, -2114769081, System.identityHashCode(aplVar))).booleanValue()) {
                            int i6110 = f53483l;
                            i16 = (i6110 & 53) + (i6110 | 53);
                            f53482k = i16 % 128;
                            if (i16 % 2 != 0) {
                                ((aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar))).setLayoutAnimation();
                                throw null;
                            }
                            layoutAnimation = ((aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar))).setLayoutAnimation();
                            if (layoutAnimation != 2) {
                            }
                            sety = new apl.setCompoundDrawableTintBlendMode(setx2, setx2.setOnFocusChangeListener(aplVar.setX.setCompoundDrawableTintBlendMode()), setx2.setOnFocusChangeListener(aplVar.setOnFocusChangeListener.setCompoundDrawableTintBlendMode()), new apk[]{setx2.setOnFocusChangeListener(aplVar.setY[0].setCompoundDrawableTintBlendMode())});
                            int i74 = f53482k + 89;
                            f53483l = i74 % 128;
                            int i75 = i74 % 2;
                            return sety;
                        }
                    }
                    onFocusChangeListener = super.setOnFocusChangeListener(aplVar);
                    int i76 = f53483l;
                    int i77 = (i76 & (-106)) | ((~i76) & 105);
                    int i78 = -(-((i76 & 105) << 1));
                    int i79 = (i77 & i78) + (i78 | i77);
                    f53482k = i79 % 128;
                    if (i79 % 2 != 0) {
                        int i80 = 91 / 0;
                    }
                    break;
                case 3:
                    setX setx3 = (setX) objArr[0];
                    int i81 = f53483l;
                    int i82 = ((i81 ^ 19) - (~(-(-((i81 & 19) << 1))))) - 1;
                    f53482k = i82 % 128;
                    int i83 = i82 % 2;
                    BigInteger bigInteger2 = setx3.f53484f;
                    if (i83 != 0) {
                        bigInteger2.bitLength();
                        throw null;
                    }
                    int iBitLength = bigInteger2.bitLength();
                    int i84 = f53483l + 77;
                    f53482k = i84 % 128;
                    int i85 = i84 % 2;
                    return Integer.valueOf(iBitLength);
                case 4:
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i86 = f53483l;
                    int i87 = (i86 | 49) << 1;
                    int i88 = -(((~i86) & 49) | (i86 & (-50)));
                    int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                    int i90 = i89 % 128;
                    f53482k = i90;
                    int i91 = i89 % 2;
                    if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2 || iIntValue == 4) {
                        int i92 = ((-1) << 1) - (((i90 & 46) + (i90 | 46)) ^ (-1));
                        f53483l = i92 % 128;
                        int i93 = i92 % 2;
                        onFocusChangeListener = Boolean.TRUE;
                    } else {
                        int i94 = i90 & 73;
                        int i95 = ((i90 ^ 73) | i94) << 1;
                        int i96 = -((i90 | 73) & (~i94));
                        int i97 = (i95 & i96) + (i95 | i96);
                        f53483l = i97 % 128;
                        int i98 = i97 % 2;
                        onFocusChangeListener = Boolean.FALSE;
                    }
                    break;
                case 5:
                    setX setx4 = (setX) objArr[0];
                    int i99 = (-2) - ((f53482k + 42) ^ (-1));
                    f53483l = i99 % 128;
                    int i100 = i99 % 2;
                    onFocusChangeListener = setx4.f53486h;
                    if (i100 == 0) {
                        int i101 = 75 / 0;
                    }
                    break;
                case 6:
                    apl.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new apl.setCompoundDrawableTintBlendMode((setX) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                    int i102 = f53482k;
                    int i103 = i102 & 123;
                    int i104 = (i102 | 123) & (~i103);
                    int i105 = -(-(i103 << 1));
                    int i106 = (i104 & i105) + (i104 | i105);
                    f53483l = i106 % 128;
                    int i107 = i106 % 2;
                    return setcompounddrawabletintblendmode;
                default:
                    setX setx5 = (setX) objArr[0];
                    BigInteger bigInteger3 = setx5.f53484f;
                    apk apkVar = setx5.setX;
                    apk apkVar2 = setx5.setCompoundDrawableTintBlendMode;
                    BigInteger bigInteger4 = setx5.setY;
                    BigInteger bigInteger5 = setx5.setOnFocusChangeListener;
                    setX setx6 = new setX(bigInteger3);
                    setx6.f53484f = bigInteger3;
                    setx6.f53485g = setx5.f53485g;
                    setx6.f53486h = new apl.setCompoundDrawableTintBlendMode(setx6, null, null);
                    setx6.setX = apkVar;
                    setx6.setCompoundDrawableTintBlendMode = apkVar2;
                    setx6.setY = bigInteger4;
                    setx6.setOnFocusChangeListener = bigInteger5;
                    setx6.setDividerPadding = 4;
                    int i108 = f53483l + 17;
                    f53482k = i108 % 128;
                    if (i108 % 2 == 0) {
                        return setx6;
                    }
                    int i109 = 12 / 0;
                    return setx6;
            }
            return onFocusChangeListener;
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final aph setCompoundDrawableTintBlendMode() {
            return (aph) setOnFocusChangeListener(new Object[]{this}, -894469171, 894469171, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apl setDividerPadding(apk apkVar, apk apkVar2) {
            return (apl) setOnFocusChangeListener(new Object[]{this, apkVar, apkVar2}, 267491456, -267491450, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apl setY() {
            return (apl) setOnFocusChangeListener(new Object[]{this}, -561223607, 561223612, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final boolean setDividerPadding(int i10) {
            return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -274575847, 274575851, i10)).booleanValue();
        }

        public setX(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, false);
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apl setOnFocusChangeListener(apl aplVar) {
            return (apl) setOnFocusChangeListener(new Object[]{this, aplVar}, 1226343287, -1226343285, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apk setOnFocusChangeListener(BigInteger bigInteger) {
            return (apk) setOnFocusChangeListener(new Object[]{this, bigInteger}, -1700604640, 1700604641, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final int setOnFocusChangeListener() {
            return ((Integer) setOnFocusChangeListener(new Object[]{this}, 2071828585, -2071828582, System.identityHashCode(this))).intValue();
        }
    }

    public class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f53487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public atz f53488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public apn f53489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ aph f53490d;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i13 | i11);
            int i15 = ~i11;
            int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
            int i17 = ~i12;
            if ((((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614) + (((~(i13 | i17)) | i14 | (~(i17 | i11))) * (-1228)) + i16 != 1) {
                setY sety = (setY) objArr[0];
                sety.f53488b = (atz) objArr[1];
                return sety;
            }
            setY sety2 = (setY) objArr[0];
            if (!sety2.f53490d.setDividerPadding(sety2.f53487a)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            aph compoundDrawableTintBlendMode = sety2.f53490d.setCompoundDrawableTintBlendMode();
            if (compoundDrawableTintBlendMode == sety2.f53490d) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (compoundDrawableTintBlendMode) {
                compoundDrawableTintBlendMode.setDividerPadding = sety2.f53487a;
                compoundDrawableTintBlendMode.setLayoutAnimation = sety2.f53488b;
                compoundDrawableTintBlendMode.setOnDragListener = sety2.f53489c;
            }
            return compoundDrawableTintBlendMode;
        }

        public final aph setCompoundDrawableTintBlendMode() {
            return (aph) setY(new Object[]{this}, 893459798, -893459797, System.identityHashCode(this));
        }

        public final setY setCompoundDrawableTintBlendMode(atz atzVar) {
            return (setY) setY(new Object[]{this, atzVar}, 2005997918, -2005997918, System.identityHashCode(this));
        }
    }

    public aph(aul aulVar) {
        this.f53468a = aulVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x010e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0155  */
    /* JADX WARN: Code duplicated, block: B:27:0x0178  */
    /* JADX WARN: Code duplicated, block: B:29:0x0194  */
    /* JADX WARN: Code duplicated, block: B:30:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x024b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0328  */
    /* JADX WARN: Code duplicated, block: B:40:0x0330 A[PHI: r5 r9
      0x0330: PHI (r5v10 int) = (r5v9 int), (r5v9 int), (r5v33 int), (r5v33 int) binds: [B:14:0x0050, B:15:0x0052, B:6:0x0031, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0330: PHI (r9v5 byte) = (r9v3 byte), (r9v3 byte), (r9v11 byte), (r9v11 byte) binds: [B:14:0x0050, B:15:0x0052, B:6:0x0031, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x037e  */
    /* JADX WARN: Code duplicated, block: B:45:0x03be  */
    /* JADX WARN: Code duplicated, block: B:47:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x03ce A[PHI: r9
      0x03ce: PHI (r9v4 byte) = (r9v3 byte), (r9v11 byte) binds: [B:13:0x004e, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x0438  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r9 != 7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r9 != 7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r1 = new java.lang.StringBuilder("Invalid point encoding 0x");
        r1.append(java.lang.Integer.toString(r9, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.apl a(java.lang.Object[] r20) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aph.a(java.lang.Object[]):com.mypinpad.tsdk.i.apl");
    }

    public static /* synthetic */ void b(Object[] objArr) {
        aph aphVar = (aph) objArr[0];
        apl[] aplVarArr = (apl[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i10 = f53466b;
        int i11 = (-2) - (((i10 & 122) + (i10 | 122)) ^ (-1));
        f53467c = i11 % 128;
        int i12 = i11 % 2;
        setX(new Object[]{aphVar, aplVarArr, 0, Integer.valueOf(iIntValue)}, 1847895516, -1847895510, 0);
        int iIntValue2 = ((Integer) setX(new Object[]{aphVar}, -1790871024, 1790871036, System.identityHashCode(aphVar))).intValue();
        if (iIntValue2 == 0 || iIntValue2 == 5) {
            int i13 = f53467c;
            int i14 = i13 & 85;
            int i15 = ((i13 ^ 85) | i14) << 1;
            int i16 = -((i13 | 85) & (~i14));
            int i17 = (i15 & i16) + (i16 | i15);
            f53466b = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
            return;
        }
        apk[] apkVarArr = new apk[iIntValue];
        int[] iArr = new int[iIntValue];
        int i18 = f53467c;
        int i19 = ((i18 ^ 109) - (~(-(-((i18 & 109) << 1))))) - 1;
        f53466b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 0;
        int i22 = 0;
        while (i21 < iIntValue) {
            int i23 = f53466b;
            int i24 = ((i23 ^ 36) + ((i23 & 36) << 1)) - 1;
            int i25 = i24 % 128;
            f53467c = i25;
            if (i24 % 2 == 0) {
                apl aplVar = aplVarArr[i21];
                throw null;
            }
            apl aplVar2 = aplVarArr[i21];
            if (aplVar2 != null) {
                int i26 = i25 & 67;
                int i27 = (i25 | 67) & (~i26);
                int i28 = i26 << 1;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                f53466b = i29 % 128;
                int i30 = i29 % 2;
                if (!((Boolean) apl.setOnFocusChangeListener(new Object[]{aplVar2}, 985929864, -985929852, System.identityHashCode(aplVar2))).booleanValue()) {
                    apkVarArr[i22] = aplVar2.setY(0);
                    int i31 = i22 & 29;
                    int i32 = -(-(i22 | 29));
                    int i33 = (i31 & i32) + (i31 | i32);
                    int i34 = i33 ^ (-28);
                    int i35 = (i33 & (-28)) << 1;
                    int i36 = (i34 & i35) + (i34 | i35);
                    iArr[i22] = i21;
                    int i37 = f53466b;
                    int i38 = (i37 | 91) << 1;
                    int i39 = -(i37 ^ 91);
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    f53467c = i40 % 128;
                    int i41 = i40 % 2;
                    i22 = i36;
                }
            }
            i21++;
            int i42 = f53467c;
            int i43 = (-2) - ((((i42 | 52) << 1) - (i42 ^ 52)) ^ (-1));
            f53466b = i43 % 128;
            int i44 = i43 % 2;
        }
        if (i22 == 0) {
            int i45 = f53466b;
            int i46 = i45 & 91;
            int i47 = ((i45 | 91) & (~i46)) + (i46 << 1);
            f53467c = i47 % 128;
            if (i47 % 2 == 0) {
                throw null;
            }
            return;
        }
        api.setX(new Object[]{apkVarArr, Integer.valueOf(i22), null}, -360518298, 360518299, i22);
        int i48 = f53467c;
        int i49 = ((i48 | 65) << 1) - (i48 ^ 65);
        f53466b = i49 % 128;
        int i50 = i49 % 2;
        int i51 = 0;
        while (i51 < i22) {
            int i52 = f53467c;
            int i53 = i52 & 9;
            int i54 = (i53 - (~((i52 ^ 9) | i53))) - 1;
            f53466b = i54 % 128;
            if (i54 % 2 != 0) {
                int i55 = iArr[i51];
                apl aplVar3 = aplVarArr[i55];
                aplVarArr[i55] = (apl) apl.setOnFocusChangeListener(new Object[]{aplVar3, apkVarArr[i51]}, -660392021, 660392031, System.identityHashCode(aplVar3));
                int i56 = i51 & 22;
                i51 = ((i51 | 22) & (~i56)) + (i56 << 1);
            } else {
                int i57 = iArr[i51];
                apl aplVar4 = aplVarArr[i57];
                aplVarArr[i57] = (apl) apl.setOnFocusChangeListener(new Object[]{aplVar4, apkVarArr[i51]}, -660392021, 660392031, System.identityHashCode(aplVar4));
                int i58 = i51 ^ (-91);
                int i59 = -(-((i51 & (-91)) << 1));
                int i60 = (i58 & i59) + (i59 | i58);
                i51 = (((i60 ^ 92) | (i60 & 92)) << 1) - ((i60 & (-93)) | ((~i60) & 92));
            }
            int i61 = f53467c;
            int i62 = ((i61 ^ 62) + ((i61 & 62) << 1)) - 1;
            f53466b = i62 % 128;
            int i63 = i62 % 2;
        }
        int i64 = f53466b;
        int i65 = i64 & 111;
        int i66 = ((((i64 ^ 111) | i65) << 1) - (~(-((i64 | 111) & (~i65))))) - 1;
        f53467c = i66 % 128;
        int i67 = i66 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00d7  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0105, code lost:
    
        if (((com.mypinpad.tsdk.isolation.apk) setX(new java.lang.Object[]{r1}, -1036175453, 1036175463, java.lang.System.identityHashCode(r1))).setCompoundDrawableTintBlendMode().equals(((com.mypinpad.tsdk.isolation.apk) setX(new java.lang.Object[]{r8}, -1036175453, 1036175463, java.lang.System.identityHashCode(r8))).setCompoundDrawableTintBlendMode()) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean c(java.lang.Object[] r8) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aph.c(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i10 = f53467c;
        int i11 = i10 & 57;
        int i12 = (~i11) & (i10 | 57);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f53466b = i14 % 128;
        int i15 = i14 % 2;
        if (iIntValue >= 1536) {
            int i16 = ((i10 | 71) << 1) - (i10 ^ 71);
            int i17 = i16 % 128;
            f53466b = i17;
            if (i16 % 2 == 0 ? iIntValue2 <= 100 : iIntValue2 <= 48) {
                int i18 = (((i17 | 68) << 1) - (i17 ^ 68)) - 1;
                f53467c = i18 % 128;
                int i19 = i18 % 2;
                return 3;
            }
            if (iIntValue2 <= 128) {
                int i20 = ((i10 ^ 2) + ((i10 & 2) << 1)) - 1;
                f53466b = i20 % 128;
                int i21 = i20 % 2 != 0 ? 5 : 4;
                int i22 = (((i10 ^ 5) | (i10 & 5)) << 1) - ((i10 & (-6)) | ((~i10) & 5));
                f53466b = i22 % 128;
                if (i22 % 2 == 0) {
                    return Integer.valueOf(i21);
                }
                throw null;
            }
            int i23 = iIntValue2 ^ (-128);
            int i24 = (((iIntValue2 & (-128)) | i23) << 1) - i23;
            int i25 = -(-(i24 * (-676)));
            int i26 = (((678 | i25) << 1) - (i25 ^ 678)) - 1354;
            int i27 = ~i24;
            int i28 = (i24 | i27) & i27;
            int i29 = ((i28 & (-2)) | ((-2) ^ i28)) * (-677);
            int i30 = ((i26 ^ i29) | (i26 & i29)) << 1;
            int i31 = -((i29 & (~i26)) | ((~i29) & i26));
            int i32 = (i30 & i31) + (i31 | i30);
            int i33 = (i27 ^ 1) | (i27 & 1);
            int i34 = ~i33;
            int i35 = -(-(((i33 | i34) & i34) * 677));
            int i36 = ((i32 ^ i35) + ((i35 & i32) << 1)) / 2;
            int i37 = ((~i36) & 4) | (i36 & (-5));
            int i38 = (i36 & 4) << 1;
            int i39 = (i37 & i38) + (i37 | i38);
            int i40 = (i17 & (-78)) | ((~i17) & 77);
            int i41 = (i17 & 77) << 1;
            int i42 = (i40 & i41) + (i40 | i41);
            f53467c = i42 % 128;
            if (i42 % 2 != 0) {
                return Integer.valueOf(i39);
            }
            throw null;
        }
        if (iIntValue >= 1024) {
            int i43 = (i10 & (-126)) | ((~i10) & 125);
            int i44 = (i10 & 125) << 1;
            int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
            int i46 = i45 % 128;
            f53466b = i46;
            int i47 = i45 % 2;
            if (iIntValue2 <= 100) {
                int i48 = (i46 ^ 45) + ((i46 & 45) << 1);
                f53467c = i48 % 128;
                int i49 = i48 % 2;
                int i50 = i46 & 85;
                int i51 = -(-((i46 ^ 85) | i50));
                int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                f53467c = i52 % 128;
                if (i52 % 2 != 0) {
                    return 4;
                }
                throw null;
            }
            if (iIntValue2 <= 112) {
                int i53 = i10 + 59;
                f53466b = i53 % 128;
                int i54 = i53 % 2;
                return 5;
            }
            int i55 = -(~(iIntValue2 * (-55)));
            int i56 = (-2) - (((6160 & i55) + (i55 | 6160)) ^ (-1));
            int i57 = (-112) & iIntValue;
            int i58 = (~i57) & ((-112) | iIntValue);
            int i59 = ~iIntValue;
            int i60 = ~((i57 & i58) | (i58 ^ i57));
            int i61 = iIntValue2 & i60;
            int i62 = (i60 | iIntValue2) & (~i61);
            int i63 = ((i62 & i61) | (i62 ^ i61)) * 56;
            int i64 = (i56 & i63) + (i56 | i63);
            int i65 = ((~iIntValue2) & (-112)) | (iIntValue2 & 111);
            int i66 = (-112) & iIntValue2;
            int i67 = -(~(-(-((~((i65 & i66) | (i65 ^ i66))) * (-56)))));
            int i68 = ((i64 & i67) + (i67 | i64)) - 1;
            int i69 = ~((iIntValue2 & i59) | (i59 ^ iIntValue2));
            int i70 = -(-(((i69 & (-112)) | ((~i69) & (-112)) | (i69 & 111)) * 56));
            int i71 = i68 & i70;
            int i72 = i71 + ((i70 ^ i68) | i71);
            int i73 = i72 & 1;
            int i74 = (i73 + ((i72 ^ 1) | i73)) / 2;
            int i75 = i74 * (-159);
            int i76 = ((i75 ^ (-795)) | (i75 & (-795))) << 1;
            int i77 = -(((~i75) & (-795)) | (i75 & 794));
            int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
            int i79 = ~i74;
            int i80 = (i79 | i74) & i79;
            int i81 = i80 ^ 5;
            int i82 = 5 & i80;
            int i83 = -(~(-(-(((i82 & i81) | (i81 ^ i82)) * 160))));
            int i84 = ((i78 ^ i83) + ((i83 & i78) << 1)) - 1;
            int i85 = (iIntValue | i59) & i59;
            int i86 = (i85 & i79) | ((~i85) & i74);
            int i87 = i85 & i74;
            int i88 = ~((i86 & i87) | (i86 ^ i87));
            int i89 = i74 & 5;
            int i90 = (~i89) & (i74 | 5);
            int i91 = ~((i89 & i90) | (i90 ^ i89));
            int i92 = ((i88 & i91) | (i88 ^ i91)) * (-160);
            int i93 = i84 & i92;
            int i94 = ((i84 ^ i92) | i93) << 1;
            int i95 = -((i92 | i84) & (~i93));
            int i96 = (-6) ^ i85;
            int i97 = i85 & (-6);
            int i98 = ~((i97 & i96) | (i96 ^ i97));
            int i99 = (i79 & i98) | ((~i98) & i74);
            int i100 = i74 & i98;
            int i101 = (((i100 & i99) | (i99 ^ i100)) * 160) + (((i94 | i95) << 1) - (i95 ^ i94));
            int i102 = i10 + 119;
            f53466b = i102 % 128;
            int i103 = i102 % 2;
            return Integer.valueOf(i101);
        }
        if (iIntValue < 512) {
            if (iIntValue2 <= 80) {
                int i104 = i10 & 65;
                int i105 = (i104 - (~((i10 ^ 65) | i104))) - 1;
                f53466b = i105 % 128;
                return Integer.valueOf(i105 % 2 == 0 ? 40 : 56);
            }
            int i106 = ((((iIntValue2 ^ (-80)) | (iIntValue2 & (-80))) << 1) - (~(-(((~iIntValue2) & (-80)) | (iIntValue2 & 79))))) - 1;
            int i107 = -(-(i106 * 517));
            int i108 = ((-515) & i107) + (i107 | (-515));
            int i109 = ~i106;
            int i110 = ~((i109 ^ iIntValue) | (i109 & iIntValue));
            int i111 = ~iIntValue;
            int i112 = ~((i111 ^ 1) | (i111 & 1));
            int i113 = i110 ^ i112;
            int i114 = i110 & i112;
            int i115 = (i114 & i113) | (i113 ^ i114);
            int i116 = ~(((i111 | iIntValue) & i111) | i106);
            int i117 = -(-(((i115 & i116) | ((~i116) & i115) | ((~i115) & i116)) * (-516)));
            int i118 = i108 & i117;
            int i119 = (((i108 ^ i117) | i118) << 1) - ((i117 | i108) & (~i118));
            int i120 = ((-2) ^ i109) | ((-2) & i109);
            int i121 = (i120 & i111) | ((~i120) & iIntValue);
            int i122 = iIntValue & i120;
            int i123 = (i122 & i121) | (i121 ^ i122);
            int i124 = ~i123;
            int i125 = (i123 | i124) & i124;
            int i126 = ((-2) ^ i111) | ((-2) & i111);
            int i127 = (i109 & i126) | ((~i126) & i106);
            int i128 = i126 & i106;
            int i129 = ~((i127 & i128) | (i127 ^ i128));
            int i130 = i125 & i129;
            int i131 = ((((i129 | i125) & (~i130)) | i130) * LibMCryptConstants.IND_HEX_SEGMENTO2) + i119;
            int i132 = (-2) ^ i106;
            int i133 = (-2) & i106;
            int i134 = ~((i132 & i133) | (i132 ^ i133));
            int i135 = i111 ^ i106;
            int i136 = i106 & i111;
            int i137 = ~((i135 & i136) | (i135 ^ i136));
            int i138 = i134 & i137;
            int i139 = (i134 | i137) & (~i138);
            int i140 = ((i139 & i138) | (i139 ^ i138)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
            int i141 = -(-((((i131 | i140) << 1) - (i131 ^ i140)) / 2));
            int i142 = (i141 ^ 40) + ((i141 & 40) << 1);
            int i143 = i10 + 9;
            f53466b = i143 % 128;
            int i144 = i143 % 2;
            return Integer.valueOf(i142);
        }
        int i145 = i10 & 91;
        int i146 = (~i145) & (i10 | 91);
        int i147 = i145 << 1;
        int i148 = (i146 & i147) + (i147 | i146);
        int i149 = i148 % 128;
        f53466b = i149;
        if (i148 % 2 == 0 ? iIntValue2 <= 80 : iIntValue2 <= 27) {
            int i150 = (i149 & 99) + (i149 | 99);
            f53467c = i150 % 128;
            int i151 = i150 % 2;
            int i152 = (-2) - ((i149 + 94) ^ (-1));
            f53467c = i152 % 128;
            if (i152 % 2 != 0) {
                return 5;
            }
            throw null;
        }
        if (iIntValue2 <= 100) {
            int i153 = i10 & 5;
            int i154 = (~i153) & (i10 | 5);
            int i155 = i153 << 1;
            int i156 = ((i154 | i155) << 1) - (i155 ^ i154);
            f53466b = i156 % 128;
            return Integer.valueOf(i156 % 2 != 0 ? 118 : 7);
        }
        int i157 = iIntValue2 - 100;
        int i158 = 594 - (~(i157 * (-1187)));
        int i159 = (-2) ^ i157;
        int i160 = ~i157;
        int i161 = (-2) & i157;
        int i162 = (i159 & i161) | (i159 ^ i161);
        int i163 = ~i162;
        int i164 = (i162 | i163) & i163;
        int i165 = ~iIntValue;
        int i166 = (i165 ^ i157) | (i165 & i157);
        int i167 = ~i166;
        int i168 = (i166 | i167) & i167;
        int i169 = i164 ^ i168;
        int i170 = i164 & i168;
        int i171 = (((i170 & i169) | (i169 ^ i170)) * (-1188)) + i158;
        int i172 = ((-2) & i160) | (i157 & 1);
        int i173 = ~((i172 & i161) | (i172 ^ i161));
        int i174 = (i157 | i160) & i160;
        int i175 = i174 ^ iIntValue;
        int i176 = i174 & iIntValue;
        int i177 = (i176 & i175) | (i175 ^ i176);
        int i178 = ~i177;
        int i179 = (i177 | i178) & i178;
        int i180 = i173 ^ i179;
        int i181 = i179 & i173;
        int i182 = (i181 & i180) | (i180 ^ i181);
        int i183 = (iIntValue | i165) & i165;
        int i184 = i183 & 1;
        int i185 = ((i183 | 1) & (~i184)) | i184;
        int i186 = ~i185;
        int i187 = (i185 | i186) & i186;
        int i188 = ((i182 & i187) | ((~i187) & i182) | ((~i182) & i187)) * 594;
        int i189 = ((i171 | i188) << 1) - (i188 ^ i171);
        int i190 = i160 ^ i165;
        int i191 = i160 & i165;
        int i192 = ~((i190 & i191) | (i190 ^ i191));
        int i193 = ~((i160 ^ 1) | (i160 & 1));
        int i194 = i192 & i193;
        int i195 = (i192 | i193) & (~i194);
        int i196 = (i195 & i194) | (i195 ^ i194);
        int i197 = (i165 ^ 1) | (i165 & 1);
        int i198 = ~i197;
        int i199 = (i197 | i198) & i198;
        int i200 = ((~i199) & i196) | ((~i196) & i199);
        int i201 = i196 & i199;
        int i202 = ((i201 & i200) | (i200 ^ i201)) * 594;
        int i203 = i189 ^ i202;
        int i204 = ((i202 & i189) | i203) << 1;
        int i205 = -i203;
        int i206 = -(-(((i204 ^ i205) + ((i204 & i205) << 1)) / 2));
        int i207 = i206 ^ 7;
        int i208 = (i206 & 7) << 1;
        int i209 = (i207 ^ i208) + ((i208 & i207) << 1);
        int i210 = (i10 & 19) + (i10 | 19);
        f53466b = i210 % 128;
        int i211 = i210 % 2;
        return Integer.valueOf(i209);
    }

    public static /* synthetic */ Integer e(Object[] objArr) {
        int iIntValue;
        int iIntValue2 = ((Number) objArr[0]).intValue();
        int iIntValue3 = ((Number) objArr[1]).intValue();
        int i10 = f53467c;
        int i11 = (i10 & 90) + (i10 | 90);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53466b = i12 % 128;
        if (i12 % 2 != 0) {
            iIntValue = ((Integer) setX(new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, -61314055, 61314055, iIntValue2)).intValue();
            int i13 = 77 / 0;
        } else {
            iIntValue = ((Integer) setX(new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, -61314055, 61314055, iIntValue2)).intValue();
        }
        int i14 = f53467c;
        int i15 = i14 ^ 7;
        int i16 = -(-((i14 & 7) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f53466b = i17 % 128;
        int i18 = i17 % 2;
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0144, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.apl.setOnFocusChangeListener(r1, -1076104209, 1076104209, java.lang.System.identityHashCode(r0))).booleanValue() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0158, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.apl.setOnFocusChangeListener(r1, -1076104209, 1076104209, java.lang.System.identityHashCode(r0))).booleanValue() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015b, code lost:
    
        r0 = (-2) - ((com.mypinpad.tsdk.isolation.aph.f53467c + 104) ^ (-1));
        com.mypinpad.tsdk.isolation.aph.f53466b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0170, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid point coordinates");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aph.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if ((!((java.lang.Boolean) setX(new java.lang.Object[]{r7, r8}, 349213807, -349213802, java.lang.System.identityHashCode(r7))).booleanValue()) != true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = com.mypinpad.tsdk.isolation.aph.f53467c
            r1 = r0 & 113(0x71, float:1.58E-43)
            int r2 = ~r1
            r3 = r0 | 113(0x71, float:1.58E-43)
            r2 = r2 & r3
            r3 = 1
            int r1 = r1 << r3
            int r2 = r2 + r1
            int r1 = r2 % 128
            com.mypinpad.tsdk.isolation.aph.f53466b = r1
            r1 = 2
            int r2 = r2 % r1
            if (r7 == r8) goto L77
            r2 = r0 & 35
            r0 = r0 | 35
            int r0 = -r0
            int r0 = -r0
            r4 = r2 ^ r0
            r0 = r0 & r2
            int r0 = r0 << r3
            int r4 = r4 + r0
            int r0 = r4 % 128
            com.mypinpad.tsdk.isolation.aph.f53466b = r0
            int r4 = r4 % r1
            boolean r2 = r8 instanceof com.mypinpad.tsdk.isolation.aph
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L6a
            int r0 = r0 + 60
            r2 = r0 ^ (-1)
            int r0 = r0 << r3
            int r2 = r2 + r0
            int r0 = r2 % 128
            com.mypinpad.tsdk.isolation.aph.f53467c = r0
            int r2 = r2 % r1
            r0 = -349213802(0xffffffffeb2f6b96, float:-2.1207008E26)
            r6 = 349213807(0x14d0946f, float:2.106118E-26)
            com.mypinpad.tsdk.i.aph r8 = (com.mypinpad.tsdk.isolation.aph) r8
            if (r2 == 0) goto L56
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r5] = r7
            r2[r3] = r8
            int r8 = java.lang.System.identityHashCode(r7)
            java.lang.Object r8 = setX(r2, r6, r0, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r3
            if (r8 == r3) goto L6a
            goto L77
        L56:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r7
            r1[r3] = r8
            int r8 = java.lang.System.identityHashCode(r7)
            java.lang.Object r8 = setX(r1, r6, r0, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.booleanValue()
            throw r4
        L6a:
            int r8 = com.mypinpad.tsdk.isolation.aph.f53467c
            int r8 = r8 + 99
            int r0 = r8 % 128
            com.mypinpad.tsdk.isolation.aph.f53466b = r0
            int r8 = r8 % r1
            if (r8 != 0) goto L76
            return r5
        L76:
            throw r4
        L77:
            int r8 = com.mypinpad.tsdk.isolation.aph.f53467c
            int r8 = r8 + 25
            int r0 = r8 % 128
            com.mypinpad.tsdk.isolation.aph.f53466b = r0
            int r8 = r8 % r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aph.equals(java.lang.Object):boolean");
    }

    public final apk getNavBarTitleString() {
        return (apk) setX(new Object[]{this}, -277774148, 277774152, System.identityHashCode(this));
    }

    public int hashCode() {
        int i10 = f53466b + 56;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f53467c = i11 % 128;
        int i12 = i11 % 2;
        int iHashCode = ((aul) setX(new Object[]{this}, 444393625, -444393611, System.identityHashCode(this))).hashCode();
        int iHashCode2 = ((apk) setX(new Object[]{this}, -277774148, 277774152, System.identityHashCode(this))).setCompoundDrawableTintBlendMode().hashCode();
        int iIntValue = ((Integer) beq.setY(new Object[]{Integer.valueOf(iHashCode2), 8}, 582008537, -582008536, iHashCode2)).intValue();
        int i13 = iHashCode & iIntValue;
        int i14 = ((iHashCode ^ iIntValue) | i13) & (~i13);
        int iHashCode3 = ((apk) setX(new Object[]{this}, -1036175453, 1036175463, System.identityHashCode(this))).setCompoundDrawableTintBlendMode().hashCode();
        int iIntValue2 = ((Integer) beq.setY(new Object[]{Integer.valueOf(iHashCode3), 16}, 582008537, -582008536, iHashCode3)).intValue();
        int i15 = ((~i14) & iIntValue2) | ((~iIntValue2) & i14);
        int i16 = f53466b + 27;
        f53467c = i16 % 128;
        int i17 = i16 % 2;
        return i15;
    }

    public abstract aph setCompoundDrawableTintBlendMode();

    public final boolean setCompoundDrawableTintBlendMode(aph aphVar) {
        return ((Boolean) setX(new Object[]{this, aphVar}, 349213807, -349213802, System.identityHashCode(this))).booleanValue();
    }

    public abstract apl setDividerPadding(apk apkVar, apk apkVar2);

    public boolean setDividerPadding(int i10) {
        int i11 = f53467c;
        int i12 = i11 & 51;
        int i13 = i12 + ((i11 ^ 51) | i12);
        f53466b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (i10 != 0) {
            int i14 = i11 + 103;
            f53466b = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 85 / 0;
            }
            return false;
        }
        int i16 = (i11 & 17) + (i11 | 17);
        f53466b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((i11 & 30) + (i11 | 30)) - 1;
        f53466b = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 0 / 0;
        }
        return true;
    }

    public final int setLayoutAnimation() {
        return ((Integer) setX(new Object[]{this}, -1790871024, 1790871036, System.identityHashCode(this))).intValue();
    }

    public final BigInteger setNavigationOnClickListener() {
        return (BigInteger) setX(new Object[]{this}, 162865573, -162865565, System.identityHashCode(this));
    }

    public final BigInteger setOnDragListener() {
        return (BigInteger) setX(new Object[]{this}, -1899125725, 1899125734, System.identityHashCode(this));
    }

    public abstract int setOnFocusChangeListener();

    public abstract apk setOnFocusChangeListener(BigInteger bigInteger);

    public final void setOnFocusChangeListener(apl[] aplVarArr) {
        setX(new Object[]{this, aplVarArr}, 1136673334, -1136673321, System.identityHashCode(this));
    }

    public final apk setOnLongClickListener() {
        return (apk) setX(new Object[]{this}, -1036175453, 1036175463, System.identityHashCode(this));
    }

    public abstract apk setY(SecureRandom secureRandom);

    public abstract apl setY();

    public abstract apl setY(int i10, BigInteger bigInteger);

    public final apl setY(byte[] bArr) {
        return (apl) setX(new Object[]{this, bArr}, 390612441, -390612434, System.identityHashCode(this));
    }

    public static abstract class setOnFocusChangeListener extends aph {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f53478d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f53479e = 1;

        public setOnFocusChangeListener(BigInteger bigInteger) {
            super((aul) aup.setOnFocusChangeListener(new Object[]{bigInteger}, -276420764, 276420764, (int) System.currentTimeMillis()));
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00c2, code lost:
        
            if (r3 != null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c5, code lost:
        
            if (r3 != null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
        
            r4 = r3.setAlwaysDrawnWithCacheEnabled();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00cb, code lost:
        
            if (r2 != 1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
        
            r2 = com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53478d;
            r5 = ((r2 & 2) + (r2 | 2)) - 1;
            r2 = r5 % 128;
            com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53479e = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
        
            if ((r5 % 2) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00dc, code lost:
        
            r9 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
        
            r1 = r2 & 79;
            r2 = -(-((r2 ^ 79) | r1));
            r5 = (r1 & r2) + (r1 | r2);
            com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53478d = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ec, code lost:
        
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ee, code lost:
        
            r2 = com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53478d;
            r5 = ((r2 ^ 39) - (~(-(-((r2 & 39) << 1))))) - 1;
            com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53479e = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ff, code lost:
        
            if (r4 == r9) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0101, code lost:
        
            r9 = com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53478d + 79;
            com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53479e = r9 % 128;
            r9 = r9 % 2;
            r3 = r3.setY();
            r9 = com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53479e + 109;
            com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53478d = r9 % 128;
            r9 = r9 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0117, code lost:
        
            r6 = r7.setDividerPadding(r6, r3);
            r7 = com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53478d + 5;
            com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.f53479e = r7 % 128;
            r6 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0124, code lost:
        
            if ((r7 % 2) == 0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0127, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x012f, code lost:
        
            throw new java.lang.IllegalArgumentException("Invalid point compression");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r6, int r7, int r8, int r9) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.aph.setOnFocusChangeListener.setY(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public final apl setY(int i10, BigInteger bigInteger) {
            return (apl) setY(new Object[]{this, Integer.valueOf(i10), bigInteger}, 1588314370, -1588314369, i10);
        }

        @Override // com.mypinpad.tsdk.isolation.aph
        public apk setY(SecureRandom secureRandom) {
            int i10 = f53478d;
            int i11 = (i10 & 41) + (i10 | 41);
            f53479e = i11 % 128;
            int i12 = i11 % 2;
            BigInteger y7 = setX().setY();
            apk compoundDrawableTintBlendMode = setOnFocusChangeListener((BigInteger) setY(new Object[]{secureRandom, y7}, 1583046124, -1583046124, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode(setOnFocusChangeListener((BigInteger) setY(new Object[]{secureRandom, y7}, 1583046124, -1583046124, (int) System.currentTimeMillis())));
            int i13 = f53478d;
            int i14 = ((i13 | 84) << 1) - (i13 ^ 84);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            f53479e = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 60 / 0;
            }
            return compoundDrawableTintBlendMode;
        }
    }

    public final apu setCompoundDrawableTintBlendMode(apl aplVar, String str, apo apoVar) {
        return (apu) setX(new Object[]{this, aplVar, str, apoVar}, 1974843125, -1974843110, System.identityHashCode(this));
    }

    public final synchronized setY setDividerPadding() {
        setY sety;
        int i10 = this.setDividerPadding;
        atz atzVar = this.setLayoutAnimation;
        apn apnVar = this.setOnDragListener;
        sety = new setY();
        sety.f53490d = this;
        sety.f53487a = i10;
        sety.f53488b = atzVar;
        sety.f53489c = apnVar;
        int i11 = f53466b;
        int i12 = i11 & 77;
        int i13 = (i11 ^ 77) | i12;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f53467c = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
        return sety;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.apl.setOnFocusChangeListener(new java.lang.Object[]{r7}, 2114769082, -2114769081, java.lang.System.identityHashCode(r7))).booleanValue() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.aph.f53466b;
        r0 = ((r7 ^ 121) | (r7 & 121)) << 1;
        r7 = -(((~r7) & 121) | (r7 & (-122)));
        r1 = (r0 & r7) + (r7 | r0);
        com.mypinpad.tsdk.isolation.aph.f53467c = r1 % 128;
        r1 = r1 % 2;
        r7 = setY();
        r0 = com.mypinpad.tsdk.isolation.aph.f53466b;
        r1 = r0 & 119;
        r1 = (r1 - (~((r0 ^ 119) | r1))) - 1;
        com.mypinpad.tsdk.isolation.aph.f53467c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b1, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        r7 = (com.mypinpad.tsdk.isolation.apl) com.mypinpad.tsdk.isolation.apl.setOnFocusChangeListener(new java.lang.Object[]{r7}, 1013204546, -1013204533, java.lang.System.identityHashCode(r7));
        r7 = setY(((com.mypinpad.tsdk.isolation.apk) com.mypinpad.tsdk.isolation.apl.setOnFocusChangeListener(new java.lang.Object[]{r7}, -696079921, 696079929, java.lang.System.identityHashCode(r7))).setCompoundDrawableTintBlendMode(), r7.setNavigationOnClickListener().setCompoundDrawableTintBlendMode());
        r0 = com.mypinpad.tsdk.isolation.aph.f53466b;
        r2 = ((-1) << 1) - ((-1) ^ ((r0 ^ 66) + ((r0 & 66) << 1)));
        com.mypinpad.tsdk.isolation.aph.f53467c = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fd, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        if (r6 == ((com.mypinpad.tsdk.isolation.aph) com.mypinpad.tsdk.isolation.apl.setOnFocusChangeListener(new java.lang.Object[]{r7}, 498238248, -498238246, java.lang.System.identityHashCode(r7)))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r6 == ((com.mypinpad.tsdk.isolation.aph) com.mypinpad.tsdk.isolation.apl.setOnFocusChangeListener(new java.lang.Object[]{r7}, 498238248, -498238246, java.lang.System.identityHashCode(r7)))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.aph.f53466b;
        r1 = r0 & 53;
        r0 = (r0 ^ 53) | r1;
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        r0 = r2 % 128;
        com.mypinpad.tsdk.isolation.aph.f53467c = r0;
        r2 = r2 % 2;
        r1 = r0 ^ 73;
        r0 = ((r0 & 73) | r1) << 1;
        r1 = -r1;
        r2 = (r0 ^ r1) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.aph.f53466b = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mypinpad.tsdk.isolation.apl setOnFocusChangeListener(com.mypinpad.tsdk.isolation.apl r7) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aph.setOnFocusChangeListener(com.mypinpad.tsdk.i.apl):com.mypinpad.tsdk.i.apl");
    }

    public apl setY(BigInteger bigInteger, BigInteger bigInteger2) {
        int i10 = f53466b;
        int i11 = (i10 & (-72)) | ((~i10) & 71);
        int i12 = -(-((i10 & 71) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f53467c = i13 % 128;
        int i14 = i13 % 2;
        apl dividerPadding = setDividerPadding(setOnFocusChangeListener(bigInteger), setOnFocusChangeListener(bigInteger2));
        if (i14 == 0) {
            int i15 = 16 / 0;
        }
        int i16 = f53467c;
        int i17 = i16 ^ 95;
        int i18 = (((i16 & 95) | i17) << 1) - i17;
        f53466b = i18 % 128;
        int i19 = i18 % 2;
        return dividerPadding;
    }

    public final apl setCompoundDrawableTintBlendMode(BigInteger bigInteger, BigInteger bigInteger2) {
        return (apl) setX(new Object[]{this, bigInteger, bigInteger2}, 408674527, -408674516, System.identityHashCode(this));
    }

    public final aul setX() {
        return (aul) setX(new Object[]{this}, 444393625, -444393611, System.identityHashCode(this));
    }
}
