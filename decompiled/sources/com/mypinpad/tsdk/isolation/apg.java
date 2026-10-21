package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public abstract class apg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f53459a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f53460b = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53461c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53462d = 1;

    public static class setX {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53463b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f53464c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f53465a;

        public setX(boolean z10) {
            this.f53465a = z10;
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = (~(i13 | i12)) | (~((~i11) | i13));
            switch (((i11 | i12) * 496) + (((~(i10 | (~i12) | i11)) | i14) * (-496)) + (i14 * 992) + (i11 * (-495)) + (i10 * (-495))) {
                case 1:
                    setX setx = new setX(true);
                    int i15 = f53464c;
                    int i16 = (i15 & (-118)) | ((~i15) & 117);
                    int i17 = (i15 & 117) << 1;
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    f53463b = i18 % 128;
                    if (i18 % 2 == 0) {
                        return setx;
                    }
                    throw null;
                case 2:
                    BigInteger bigInteger = (BigInteger) objArr[0];
                    int i19 = f53463b;
                    int i20 = i19 & 85;
                    int i21 = -(-((i19 ^ 85) | i20));
                    int i22 = (i20 & i21) + (i21 | i20);
                    f53464c = i22 % 128;
                    int i23 = i22 % 2;
                    setX setx2 = (setX) setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, -1325088473, 1325088478, (int) System.currentTimeMillis());
                    int i24 = f53464c + 71;
                    f53463b = i24 % 128;
                    int i25 = i24 % 2;
                    return setx2;
                case 3:
                    setX setx3 = new setX(false);
                    int i26 = f53464c;
                    int i27 = i26 & 53;
                    int i28 = i26 | 53;
                    int i29 = (i27 & i28) + (i28 | i27);
                    f53463b = i29 % 128;
                    int i30 = i29 % 2;
                    return setx3;
                case 4:
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i31 = ~iCurrentTimeMillis;
                    int i32 = (-1508704066) & i31;
                    int i33 = ~(((~i32) & ((-1508704066) | i31)) | i32);
                    int i34 = ((~i33) & (-40378032)) | (i33 & 40378031);
                    int i35 = i33 & (-40378032);
                    int i36 = -(-(((i35 & i34) | (i34 ^ i35)) * 226));
                    int i37 = ((((~i36) & (-1243758448)) | (1243758447 & i36)) - (~(-(-((i36 & (-1243758448)) << 1))))) - 1;
                    int i38 = ~((40378031 ^ iCurrentTimeMillis) | (40378031 & iCurrentTimeMillis));
                    int i39 = (i38 & (-1542258672)) | ((~i38) & (-1542258672)) | (1542258671 & i38);
                    int i40 = i31 ^ (-1508704066);
                    int i41 = (i40 & i32) | (i40 ^ i32);
                    int i42 = (40378031 & i41) | ((~i41) & (-40378032));
                    int i43 = i41 & (-40378032);
                    int i44 = (i43 & i42) | (i42 ^ i43);
                    int i45 = ~i44;
                    int i46 = (i44 | i45) & i45;
                    int i47 = ((~i46) & i39) | ((~i39) & i46);
                    int i48 = i46 & i39;
                    int i49 = ((i48 & i47) | (i47 ^ i48)) * (-113);
                    int i50 = (((i37 ^ i49) | (i37 & i49)) << 1) - ((i49 & (~i37)) | ((~i49) & i37));
                    int i51 = (1508704065 & iCurrentTimeMillis) | i32;
                    int i52 = iCurrentTimeMillis & (-1508704066);
                    int i53 = (~((i52 & i51) | (i51 ^ i52))) * 113;
                    int i54 = i50 ^ i53;
                    int i55 = ((i53 & i50) | i54) << 1;
                    int i56 = -i54;
                    int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
                    System.currentTimeMillis();
                    if (i57 <= -1355645021) {
                        throw null;
                    }
                    setX setx4 = (setX) setCompoundDrawableTintBlendMode(new Object[0], 79413051, -79413048, (int) System.currentTimeMillis());
                    int i58 = f53463b;
                    int i59 = i58 & 33;
                    int i60 = -(-((i58 ^ 33) | i59));
                    int i61 = (i59 & i60) + (i60 | i59);
                    f53464c = i61 % 128;
                    int i62 = i61 % 2;
                    return setx4;
                case 5:
                    setX setx5 = new setX(true);
                    int i63 = f53463b;
                    int i64 = i63 & 75;
                    int i65 = (i63 | 75) & (~i64);
                    int i66 = i64 << 1;
                    int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
                    f53464c = i67 % 128;
                    if (i67 % 2 != 0) {
                        return setx5;
                    }
                    throw null;
                case 6:
                    int i68 = (-2) - ((f53463b + 84) ^ (-1));
                    f53464c = i68 % 128;
                    int i69 = i68 % 2;
                    setX setx6 = (setX) setCompoundDrawableTintBlendMode(new Object[0], -403370632, 403370633, (int) System.currentTimeMillis());
                    int i70 = f53463b;
                    int i71 = i70 & 25;
                    int i72 = (i70 | 25) & (~i71);
                    int i73 = i71 << 1;
                    int i74 = ((i72 | i73) << 1) - (i72 ^ i73);
                    f53464c = i74 % 128;
                    if (i74 % 2 != 0) {
                        return setx6;
                    }
                    int i75 = 13 / 0;
                    return setx6;
                default:
                    setX setx7 = (setX) objArr[0];
                    int i76 = f53464c + 49;
                    int i77 = i76 % 128;
                    f53463b = i77;
                    int i78 = i76 % 2;
                    boolean z10 = setx7.f53465a;
                    int i79 = i77 + 81;
                    f53464c = i79 % 128;
                    if (i79 % 2 != 0) {
                        return Boolean.valueOf(z10);
                    }
                    throw null;
            }
        }

        public final boolean setOnFocusChangeListener() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -2000342845, 2000342845, System.identityHashCode(this))).booleanValue();
        }
    }

    static {
        BigInteger.valueOf(3L);
        int i10 = f53461c;
        int i11 = ((i10 ^ 81) | (i10 & 81)) << 1;
        int i12 = -(((~i10) & 81) | (i10 & (-82)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53462d = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x023a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0250  */
    /* JADX WARN: Code duplicated, block: B:114:0x0255  */
    /* JADX WARN: Code duplicated, block: B:118:0x0268  */
    /* JADX WARN: Code duplicated, block: B:121:0x0286  */
    /* JADX WARN: Code duplicated, block: B:123:0x0299  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02de  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:142:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:144:0x0315  */
    /* JADX WARN: Code duplicated, block: B:146:0x032b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0339  */
    /* JADX WARN: Code duplicated, block: B:151:0x034c  */
    /* JADX WARN: Code duplicated, block: B:153:0x035a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0376  */
    /* JADX WARN: Code duplicated, block: B:158:0x038d  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:162:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:172:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:177:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:179:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:181:0x040c  */
    /* JADX WARN: Code duplicated, block: B:183:0x041b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0438  */
    /* JADX WARN: Code duplicated, block: B:188:0x043d  */
    /* JADX WARN: Code duplicated, block: B:199:0x049b  */
    /* JADX WARN: Code duplicated, block: B:201:0x049f  */
    /* JADX WARN: Code duplicated, block: B:207:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:209:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:215:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:217:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:221:0x0513  */
    /* JADX WARN: Code duplicated, block: B:223:0x0519  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:165:0x03b9
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r8) {
        /*
            Method dump skipped, instruction units count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.apg.a(java.lang.Object[]):java.lang.Boolean");
    }

    public static boolean setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{bigInteger}, -34119832, 34119834, (int) System.currentTimeMillis())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x044b  */
    /* JADX WARN: Code duplicated, block: B:102:0x045f  */
    /* JADX WARN: Code duplicated, block: B:105:0x048a  */
    /* JADX WARN: Code duplicated, block: B:108:0x04a2 A[LOOP:2: B:99:0x0449->B:108:0x04a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:115:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:166:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:168:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:174:0x0713  */
    /* JADX WARN: Code duplicated, block: B:189:0x04c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x04b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0160  */
    /* JADX WARN: Code duplicated, block: B:95:0x0415 A[PHI: r3
      0x0415: PHI (r3v35 java.math.BigInteger) = (r3v34 java.math.BigInteger), (r3v45 java.math.BigInteger) binds: [B:93:0x0412, B:90:0x0405] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x043e  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Object objValueOf;
        BigInteger bigIntegerModPow;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        BigInteger bigIntegerModPow2;
        int i20 = ~i11;
        int i21 = ~(i20 | i10);
        int i22 = ~i12;
        int i23 = ~(i22 | i10);
        int i24 = ((i20 | i23) * 712) + (((~(i10 | i11 | i12)) | (~(i20 | i22 | i10))) * (-712)) + ((i21 | i23) * (-712)) + (i11 * 713) + (i10 * (-711));
        int i25 = 1;
        int i26 = 0;
        int i27 = 2;
        if (i24 == 1) {
            BigInteger bigInteger = (BigInteger) objArr[0];
            String str = (String) objArr[1];
            int i28 = f53462d;
            int i29 = ((i28 | 75) << 1) - (i28 ^ 75);
            int i30 = i29 % 128;
            f53461c = i30;
            if (i29 % 2 != 0) {
                int i31 = 28 / 0;
                if (bigInteger != null) {
                    i13 = (-2) - (((i30 ^ 32) + ((i30 & 32) << 1)) ^ (-1));
                    f53462d = i13 % 128;
                    if (i13 % 2 != 0) {
                        bigInteger.signum();
                        throw null;
                    }
                    if (bigInteger.signum() > 0 && bigInteger.bitLength() >= 2) {
                        int i32 = f53461c;
                        int i33 = ((i32 & (-76)) | ((~i32) & 75)) + ((75 & i32) << 1);
                        f53462d = i33 % 128;
                        int i34 = i33 % 2;
                        return null;
                    }
                }
            } else if (bigInteger != null) {
                i13 = (-2) - (((i30 ^ 32) + ((i30 & 32) << 1)) ^ (-1));
                f53462d = i13 % 128;
                if (i13 % 2 != 0) {
                    bigInteger.signum();
                    throw null;
                }
                if (bigInteger.signum() > 0) {
                    int i35 = f53461c;
                    int i36 = ((i35 & (-76)) | ((~i35) & 75)) + ((75 & i35) << 1);
                    f53462d = i36 % 128;
                    int i37 = i36 % 2;
                    return null;
                }
            }
            StringBuilder sb2 = new StringBuilder("'");
            sb2.append(str);
            sb2.append("' must be non-null and >= 2");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i24 == 2) {
            BigInteger bigInteger2 = (BigInteger) objArr[0];
            int i38 = f53462d;
            int i39 = i38 & 27;
            int i40 = (i39 - (~(-(-((i38 ^ 27) | i39))))) - 1;
            f53461c = i40 % 128;
            int i41 = i40 % 2;
            setOnFocusChangeListener(new Object[]{bigInteger2, "candidate"}, 847563362, -847563361, (int) System.currentTimeMillis());
            boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{bigInteger2}, -564148246, 564148251, (int) System.currentTimeMillis())).booleanValue();
            int i42 = f53462d;
            int i43 = i42 & 41;
            int i44 = i42 | 41;
            int i45 = (i43 & i44) + (i44 | i43);
            f53461c = i45 % 128;
            if (i45 % 2 == 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        BigInteger bigInteger3 = f53459a;
        BigInteger bigInteger4 = f53460b;
        int i46 = 3;
        if (i24 == 3) {
            BigInteger bigInteger5 = (BigInteger) objArr[0];
            SecureRandom secureRandom = (SecureRandom) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i47 = f53462d;
            int i48 = i47 & 55;
            int i49 = i48 + ((i47 ^ 55) | i48);
            f53461c = i49 % 128;
            int i50 = i49 % 2;
            setOnFocusChangeListener(new Object[]{bigInteger5, "candidate"}, 847563362, -847563361, (int) System.currentTimeMillis());
            if (secureRandom == null) {
                throw new IllegalArgumentException("'random' cannot be null");
            }
            if (iIntValue <= 0) {
                throw new IllegalArgumentException("'iterations' must be > 0");
            }
            if (bigInteger5.bitLength() != 2) {
                if (bigInteger5.testBit(0)) {
                    BigInteger bigIntegerSubtract = bigInteger5.subtract(bigInteger3);
                    BigInteger bigIntegerSubtract2 = bigInteger5.subtract(bigInteger4);
                    int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
                    BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
                    int i51 = f53461c;
                    int i52 = ((i51 | 93) << 1) - (i51 ^ 93);
                    f53462d = i52 % 128;
                    int i53 = i52 % 2;
                    int i54 = 0;
                    while (true) {
                        if (i54 >= iIntValue) {
                            int i55 = f53461c;
                            int i56 = (i55 | 27) << 1;
                            int i57 = -(((~i55) & 27) | (i55 & (-28)));
                            int i58 = (i56 & i57) + (i57 | i56);
                            f53462d = i58 % 128;
                            if (i58 % 2 == 0) {
                                int i59 = 2 / 0;
                            }
                            objValueOf = Boolean.TRUE;
                            break;
                        }
                        int i60 = f53461c;
                        int i61 = ((i60 & (-30)) | ((~i60) & 29)) + ((i60 & 29) << 1);
                        f53462d = i61 % 128;
                        int i62 = i61 % 2;
                        if (!((Boolean) setOnFocusChangeListener(new Object[]{bigInteger5, bigIntegerSubtract, bigIntegerShiftRight, Integer.valueOf(lowestSetBit), (BigInteger) bep.setDividerPadding(new Object[]{bigInteger4, bigIntegerSubtract2, secureRandom}, -1670582261, 1670582264, (int) System.currentTimeMillis())}, -1295366185, 1295366189, lowestSetBit)).booleanValue()) {
                            int i63 = f53461c;
                            int i64 = i63 & 5;
                            int i65 = ((i63 ^ 5) | i64) << 1;
                            int i66 = -((~i64) & (i63 | 5));
                            int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                            f53462d = i67 % 128;
                            int i68 = i67 % 2;
                            int i69 = i63 & 93;
                            int i70 = (i63 | 93) & (~i69);
                            int i71 = -(-(i69 << 1));
                            int i72 = (i70 & i71) + (i70 | i71);
                            f53462d = i72 % 128;
                            if (i72 % 2 == 0) {
                                int i73 = 15 / 0;
                            }
                        } else {
                            int i74 = i54 & 1;
                            i54 = ((i54 ^ 1) | i74) + i74;
                            int i75 = f53462d + 73;
                            f53461c = i75 % 128;
                            int i76 = i75 % 2;
                        }
                    }
                } else {
                    int i77 = f53461c + 77;
                    int i78 = i77 % 128;
                    f53462d = i78;
                    int i79 = i77 % 2;
                    int i80 = (i78 & 111) + (i78 | 111);
                    f53461c = i80 % 128;
                    if (i80 % 2 != 0) {
                        throw null;
                    }
                }
                objValueOf = Boolean.FALSE;
                break;
            } else {
                int i81 = f53462d;
                int i82 = i81 & 15;
                int i83 = ((i81 ^ 15) | i82) << 1;
                int i84 = -((~i82) & (i81 | 15));
                int i85 = (i83 ^ i84) + ((i83 & i84) << 1);
                f53461c = i85 % 128;
                boolean z11 = i85 % 2 == 0;
                int i86 = (i81 & 5) + (i81 | 5);
                f53461c = i86 % 128;
                int i87 = i86 % 2;
                objValueOf = Boolean.valueOf(z11);
            }
        } else if (i24 == 4) {
            BigInteger bigInteger6 = (BigInteger) objArr[0];
            BigInteger bigInteger7 = (BigInteger) objArr[1];
            BigInteger bigInteger8 = (BigInteger) objArr[2];
            int iIntValue2 = ((Number) objArr[3]).intValue();
            BigInteger bigInteger9 = (BigInteger) objArr[4];
            int i88 = f53462d;
            int i89 = (i88 ^ 95) + ((i88 & 95) << 1);
            f53461c = i89 % 128;
            if (i89 % 2 != 0) {
                bigIntegerModPow = bigInteger9.modPow(bigInteger8, bigInteger6);
                int i90 = 23 / 0;
                if (!bigIntegerModPow.equals(bigInteger3)) {
                    int i91 = f53461c + 103;
                    f53462d = i91 % 128;
                    int i92 = i91 % 2;
                    if (bigIntegerModPow.equals(bigInteger7)) {
                        int i93 = f53462d + 23;
                        f53461c = i93 % 128;
                        int i94 = i93 % 2;
                        i14 = 1;
                        while (true) {
                            if (i14 < iIntValue2) {
                                z10 = false;
                                break;
                            }
                            int i95 = f53461c;
                            int i96 = (i95 & 30) + (i95 | 30);
                            i16 = (i96 ^ (-1)) + (i96 << 1);
                            f53462d = i16 % 128;
                            if (i16 % 2 != 0) {
                                bigIntegerModPow.modPow(bigInteger4, bigInteger6).equals(bigInteger7);
                                throw null;
                            }
                            bigIntegerModPow = bigIntegerModPow.modPow(bigInteger4, bigInteger6);
                            if (bigIntegerModPow.equals(bigInteger7)) {
                                int i97 = f53462d;
                                int i98 = (i97 ^ 125) + ((i97 & 125) << 1);
                                f53461c = i98 % 128;
                                int i99 = i98 % 2;
                                int i100 = (i97 ^ 120) + ((i97 & 120) << 1);
                                int i101 = (i100 ^ (-1)) + (i100 << 1);
                                f53461c = i101 % 128;
                                int i102 = i101 % 2;
                                z10 = true;
                                break;
                            }
                            if (bigIntegerModPow.equals(bigInteger3)) {
                                int i103 = (-2) - ((f53461c + 76) ^ (-1));
                                f53462d = i103 % 128;
                                int i104 = i103 % 2;
                                objValueOf = Boolean.FALSE;
                            } else {
                                i14 = ((i14 & 1) << 1) + (i14 ^ 1);
                                int i105 = f53462d;
                                int i106 = ((i105 | 51) << 1) - (i105 ^ 51);
                                f53461c = i106 % 128;
                                int i107 = i106 % 2;
                            }
                        }
                        int i108 = f53462d;
                        int i109 = i108 & 17;
                        int i110 = (i108 | 17) & (~i109);
                        int i111 = -(-(i109 << 1));
                        i15 = ((i110 | i111) << 1) - (i110 ^ i111);
                        f53461c = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        objValueOf = Boolean.valueOf(z10);
                    }
                }
            } else {
                bigIntegerModPow = bigInteger9.modPow(bigInteger8, bigInteger6);
                if (!bigIntegerModPow.equals(bigInteger3)) {
                    int i910 = f53461c + 103;
                    f53462d = i910 % 128;
                    int i911 = i910 % 2;
                    if (bigIntegerModPow.equals(bigInteger7)) {
                        int i912 = f53462d + 23;
                        f53461c = i912 % 128;
                        int i913 = i912 % 2;
                        i14 = 1;
                        while (true) {
                            if (i14 < iIntValue2) {
                                z10 = false;
                                break;
                            }
                            int i914 = f53461c;
                            int i915 = (i914 & 30) + (i914 | 30);
                            i16 = (i915 ^ (-1)) + (i915 << 1);
                            f53462d = i16 % 128;
                            if (i16 % 2 != 0) {
                                bigIntegerModPow.modPow(bigInteger4, bigInteger6).equals(bigInteger7);
                                throw null;
                            }
                            bigIntegerModPow = bigIntegerModPow.modPow(bigInteger4, bigInteger6);
                            if (bigIntegerModPow.equals(bigInteger7)) {
                                int i916 = f53462d;
                                int i917 = (i916 ^ 125) + ((i916 & 125) << 1);
                                f53461c = i917 % 128;
                                int i918 = i917 % 2;
                                int i1010 = (i916 ^ 120) + ((i916 & 120) << 1);
                                int i1011 = (i1010 ^ (-1)) + (i1010 << 1);
                                f53461c = i1011 % 128;
                                int i1012 = i1011 % 2;
                                z10 = true;
                                break;
                            }
                            if (bigIntegerModPow.equals(bigInteger3)) {
                                int i1013 = (-2) - ((f53461c + 76) ^ (-1));
                                f53462d = i1013 % 128;
                                int i1014 = i1013 % 2;
                                objValueOf = Boolean.FALSE;
                            } else {
                                i14 = ((i14 & 1) << 1) + (i14 ^ 1);
                                int i1015 = f53462d;
                                int i1016 = ((i1015 | 51) << 1) - (i1015 ^ 51);
                                f53461c = i1016 % 128;
                                int i1017 = i1016 % 2;
                            }
                        }
                        int i1018 = f53462d;
                        int i1019 = i1018 & 17;
                        int i112 = (i1018 | 17) & (~i1019);
                        int i113 = -(-(i1019 << 1));
                        i15 = ((i112 | i113) << 1) - (i112 ^ i113);
                        f53461c = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        objValueOf = Boolean.valueOf(z10);
                    }
                }
            }
            int i114 = f53462d;
            int i115 = i114 & 7;
            int i116 = (i114 | 7) & (~i115);
            int i117 = i115 << 1;
            int i118 = (i116 ^ i117) + ((i116 & i117) << 1);
            f53461c = i118 % 128;
            int i119 = i118 % 2;
            objValueOf = Boolean.TRUE;
        } else {
            if (i24 == 5) {
                return a(objArr);
            }
            BigInteger bigInteger10 = (BigInteger) objArr[0];
            SecureRandom secureRandom2 = (SecureRandom) objArr[1];
            int iIntValue3 = ((Number) objArr[2]).intValue();
            int i120 = f53461c;
            int i121 = i120 & 97;
            int i122 = ((i120 ^ 97) | i121) << 1;
            int i123 = -((~i121) & (i120 | 97));
            int i124 = (i122 ^ i123) + ((i122 & i123) << 1);
            f53462d = i124 % 128;
            int i125 = i124 % 2;
            setOnFocusChangeListener(new Object[]{bigInteger10, "candidate"}, 847563362, -847563361, (int) System.currentTimeMillis());
            if (secureRandom2 == null) {
                throw new IllegalArgumentException("'random' cannot be null");
            }
            if (iIntValue3 <= 0) {
                throw new IllegalArgumentException("'iterations' must be > 0");
            }
            if (bigInteger10.bitLength() != 2) {
                if (!(!bigInteger10.testBit(0))) {
                    BigInteger bigIntegerSubtract3 = bigInteger10.subtract(bigInteger3);
                    BigInteger bigIntegerSubtract4 = bigInteger10.subtract(bigInteger4);
                    int lowestSetBit2 = bigIntegerSubtract3.getLowestSetBit();
                    BigInteger bigIntegerShiftRight2 = bigIntegerSubtract3.shiftRight(lowestSetBit2);
                    int i126 = f53462d + 5;
                    f53461c = i126 % 128;
                    int i127 = i126 % 2;
                    int i128 = 0;
                    while (true) {
                        if (i128 >= iIntValue3) {
                            objValueOf = (setX) setX.setCompoundDrawableTintBlendMode(new Object[i26], -1306393708, 1306393712, (int) System.currentTimeMillis());
                            int i129 = f53462d;
                            int i130 = i129 & 125;
                            int i131 = (i129 ^ 125) | i130;
                            int i132 = (i130 & i131) + (i131 | i130);
                            f53461c = i132 % 128;
                            if (i132 % 2 == 0) {
                                break;
                            }
                            throw null;
                        }
                        int i133 = f53462d;
                        int i134 = (i133 ^ 26) + ((i133 & 26) << i25);
                        int i135 = (i134 ^ (-1)) + (i134 << 1);
                        f53461c = i135 % 128;
                        if (i135 % i27 != 0) {
                            Object[] objArr2 = new Object[i46];
                            objArr2[0] = bigInteger4;
                            objArr2[1] = bigIntegerSubtract4;
                            objArr2[i27] = secureRandom2;
                            ((BigInteger) bep.setDividerPadding(objArr2, -1670582261, 1670582264, (int) System.currentTimeMillis())).gcd(bigInteger10).compareTo(bigInteger3);
                            throw null;
                        }
                        Object[] objArr3 = new Object[i46];
                        objArr3[i26] = bigInteger4;
                        objArr3[i25] = bigIntegerSubtract4;
                        objArr3[i27] = secureRandom2;
                        BigInteger bigInteger11 = (BigInteger) bep.setDividerPadding(objArr3, -1670582261, 1670582264, (int) System.currentTimeMillis());
                        BigInteger bigIntegerGcd = bigInteger11.gcd(bigInteger10);
                        if (bigIntegerGcd.compareTo(bigInteger3) > 0) {
                            Object[] objArr4 = new Object[i25];
                            objArr4[i26] = bigIntegerGcd;
                            objValueOf = (setX) setX.setCompoundDrawableTintBlendMode(objArr4, -609533072, 609533074, (int) System.currentTimeMillis());
                            int i136 = f53462d;
                            int i137 = i136 & 105;
                            i17 = (i137 - (~((i136 ^ 105) | i137))) - i25;
                        } else {
                            BigInteger bigIntegerModPow3 = bigInteger11.modPow(bigIntegerShiftRight2, bigInteger10);
                            if (((bigIntegerModPow3.equals(bigInteger3) ? 1 : 0) ^ i25) != i25) {
                                bigIntegerSubtract3 = bigIntegerSubtract3;
                            } else {
                                int i138 = f53461c;
                                int i139 = i138 & 119;
                                int i140 = (~i139) & (i138 | 119);
                                int i141 = -(-(i139 << 1));
                                int i142 = (i140 & i141) + (i140 | i141);
                                f53462d = i142 % 128;
                                int i143 = i142 % 2;
                                if (((bigIntegerModPow3.equals(bigIntegerSubtract3) ? 1 : 0) ^ i25) != 0) {
                                    int i144 = f53461c + 115;
                                    int i145 = i144 % 128;
                                    f53462d = i145;
                                    if (i144 % 2 == 0) {
                                        i19 = i25;
                                        i18 = i26;
                                    } else {
                                        i18 = i25;
                                        i19 = i26;
                                    }
                                    int i146 = i145 & 59;
                                    int i147 = (i145 ^ 59) | i146;
                                    int i148 = ((i146 | i147) << 1) - (i146 ^ i147);
                                    f53461c = i148 % 128;
                                    int i149 = i148 % 2;
                                    while (true) {
                                        if (i18 >= lowestSetBit2) {
                                            bigIntegerModPow2 = bigIntegerModPow3;
                                            break;
                                        }
                                        int i150 = f53461c;
                                        int i151 = i150 & 9;
                                        int i152 = (i151 - (~(-(-((i150 ^ 9) | i151))))) - i25;
                                        f53462d = i152 % 128;
                                        int i153 = i152 % 2;
                                        bigIntegerModPow2 = bigIntegerModPow3.modPow(bigInteger4, bigInteger10);
                                        if (((bigIntegerModPow2.equals(bigIntegerSubtract3) ? 1 : 0) ^ i25) != i25) {
                                            int i154 = f53461c;
                                            int i155 = (i154 & (-22)) | ((~i154) & 21);
                                            int i156 = (i154 & 21) << i25;
                                            int i157 = (i155 ^ i156) + ((i156 & i155) << i25);
                                            f53462d = i157 % 128;
                                            i19 = i157 % 2 == 0 ? 0 : i25;
                                        } else if (((bigIntegerModPow2.equals(bigInteger3) ? 1 : 0) ^ i25) != 0) {
                                            int i158 = f53462d;
                                            int i159 = ((i158 | 71) << i25) - (i158 ^ 71);
                                            f53461c = i159 % 128;
                                            if (i159 % 2 != 0) {
                                                int i160 = (((i18 ^ 59) | (i18 & 59)) << 1) - ((i18 & (-60)) | ((~i18) & 59));
                                                int i161 = (i160 & (-16)) | (15 & (~i160));
                                                int i162 = (i160 & 15) << 1;
                                                int i163 = (i161 & i162) + (i162 | i161);
                                                i25 = 1;
                                                i18 = i163;
                                            } else {
                                                i25 = 1;
                                                int i164 = i18 & 1;
                                                i18 = ((((i18 ^ 1) | i164) << 1) - (~(-((~i164) & (i18 | 1))))) - 1;
                                            }
                                            int i165 = ((((i158 ^ 33) | (i158 & 33)) << i25) - (~(-(((~i158) & 33) | (i158 & (-34)))))) - i25;
                                            f53461c = i165 % 128;
                                            int i166 = i165 % 2;
                                            bigIntegerModPow3 = bigIntegerModPow2;
                                            bigIntegerSubtract3 = bigIntegerSubtract3;
                                        }
                                        break;
                                    }
                                    if (i19 != i25) {
                                        int i167 = f53462d;
                                        int i168 = ((i167 ^ 28) + ((i167 & 28) << i25)) - i25;
                                        f53461c = i168 % 128;
                                        int i169 = i168 % 2;
                                        if (((bigIntegerModPow2.equals(bigInteger3) ? 1 : 0) ^ i25) != 0) {
                                            int i170 = f53461c + 57;
                                            f53462d = i170 % 128;
                                            int i171 = i170 % 2;
                                            bigIntegerModPow3 = bigIntegerModPow2.modPow(bigInteger4, bigInteger10);
                                            if (bigIntegerModPow3.equals(bigInteger3)) {
                                                bigIntegerModPow3 = bigIntegerModPow2;
                                            } else {
                                                int i172 = f53462d;
                                                int i173 = i172 & 5;
                                                int i174 = i173 + ((i172 ^ 5) | i173);
                                                int i175 = i174 % 128;
                                                f53461c = i175;
                                                int i176 = i174 % 2;
                                                int i177 = i175 + 59;
                                                f53462d = i177 % 128;
                                                int i178 = i177 % 2;
                                            }
                                        }
                                        BigInteger bigIntegerGcd2 = bigIntegerModPow3.subtract(bigInteger3).gcd(bigInteger10);
                                        if (bigIntegerGcd2.compareTo(bigInteger3) > 0) {
                                            int i179 = f53461c;
                                            int i180 = i179 ^ 115;
                                            int i181 = -(-((i179 & 115) << 1));
                                            int i182 = ((i180 | i181) << 1) - (i181 ^ i180);
                                            f53462d = i182 % 128;
                                            if (i182 % 2 == 0) {
                                                throw null;
                                            }
                                            objValueOf = (setX) setX.setCompoundDrawableTintBlendMode(new Object[]{bigIntegerGcd2}, -609533072, 609533074, (int) System.currentTimeMillis());
                                            int i183 = f53462d;
                                            int i184 = ((i183 ^ 59) | (i183 & 59)) << 1;
                                            int i185 = -(((~i183) & 59) | (i183 & (-60)));
                                            int i186 = (i184 ^ i185) + ((i185 & i184) << 1);
                                            f53461c = i186 % 128;
                                            if (i186 % 2 == 0) {
                                                break;
                                            }
                                            throw null;
                                        }
                                        objValueOf = (setX) setX.setCompoundDrawableTintBlendMode(new Object[0], -157423913, 157423919, (int) System.currentTimeMillis());
                                        int i187 = f53462d;
                                        int i188 = ((i187 ^ 105) | (i187 & 105)) << 1;
                                        int i189 = -(((~i187) & 105) | (i187 & (-106)));
                                        i17 = (i188 & i189) + (i189 | i188);
                                    }
                                } else {
                                    bigIntegerSubtract3 = bigIntegerSubtract3;
                                }
                            }
                            int i190 = i128 & 11;
                            i128 = (i190 + ((i128 ^ 11) | i190)) - 10;
                            int i191 = f53461c;
                            int i192 = ((i191 ^ 13) | (i191 & 13)) << 1;
                            int i193 = -(((~i191) & 13) | (i191 & (-14)));
                            int i194 = (i192 & i193) + (i193 | i192);
                            f53462d = i194 % 128;
                            int i195 = i194 % 2;
                            i27 = 2;
                            bigIntegerSubtract3 = bigIntegerSubtract3;
                            i25 = 1;
                            i26 = 0;
                            i46 = 3;
                        }
                        f53461c = i17 % 128;
                        int i196 = i17 % 2;
                        break;
                    }
                }
                objValueOf = (setX) setX.setCompoundDrawableTintBlendMode(new Object[]{bigInteger4}, -609533072, 609533074, (int) System.currentTimeMillis());
            } else {
                int i197 = f53461c;
                int i198 = i197 ^ 117;
                int i199 = (((i197 & 117) | i198) << 1) - i198;
                f53462d = i199 % 128;
                int i200 = i199 % 2;
                objValueOf = (setX) setX.setCompoundDrawableTintBlendMode(new Object[0], -1306393708, 1306393712, (int) System.currentTimeMillis());
                int i201 = f53462d;
                int i202 = i201 & 23;
                int i203 = (i201 ^ 23) | i202;
                int i204 = (i202 ^ i203) + ((i203 & i202) << 1);
                f53461c = i204 % 128;
                int i205 = i204 % 2;
            }
        }
        return objValueOf;
    }

    public static setX setY(BigInteger bigInteger, SecureRandom secureRandom, int i10) {
        return (setX) setOnFocusChangeListener(new Object[]{bigInteger, secureRandom, Integer.valueOf(i10)}, 1367544983, -1367544983, i10);
    }

    public static boolean setOnFocusChangeListener(BigInteger bigInteger, SecureRandom secureRandom, int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{bigInteger, secureRandom, Integer.valueOf(i10)}, -1579951707, 1579951710, i10)).booleanValue();
    }
}
