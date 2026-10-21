package com.mypinpad.tsdk.isolation;

import bk.q;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@JvmName(name = "HttpHeaders")
public final class zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final abw f62452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final abw f62453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62454c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62455d = 1;

    static {
        abw.Companion companion = abw.INSTANCE;
        f62452a = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"\"\\"}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        f62453b = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"\t ,="}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        int i10 = f62455d + 41;
        f62454c = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    public static /* synthetic */ Boolean a(Object[] objArr) {
        int i10;
        yr yrVar = (yr) objArr[0];
        int i11 = f62455d;
        int i12 = ((i11 | 23) << 1) - (i11 ^ 23);
        f62454c = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(yrVar, "");
        yk ykVar = (yk) yr.setX(new Object[]{yrVar}, -504719753, 504719763, System.identityHashCode(yrVar));
        if (Intrinsics.areEqual((String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -441618648, 441618657, System.identityHashCode(ykVar)), "HEAD")) {
            int i14 = f62455d;
            int i15 = i14 & 123;
            int i16 = i14 | 123;
            int i17 = (i15 & i16) + (i16 | i15);
            int i18 = i17 % 128;
            f62454c = i18;
            boolean z10 = i17 % 2 != 0;
            int i19 = i18 & 65;
            int i20 = -(-((i18 ^ 65) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f62455d = i21 % 128;
            if (i21 % 2 != 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        int iIntValue = ((Integer) yr.setX(new Object[]{yrVar}, 151122101, -151122100, System.identityHashCode(yrVar))).intValue();
        if (iIntValue >= 100) {
            int i22 = f62454c;
            int i23 = i22 & 47;
            int i24 = (i23 - (~((i22 ^ 47) | i23))) - 1;
            f62455d = i24 % 128;
            if (i24 % 2 != 0 ? iIntValue >= 200 : iIntValue >= 6156) {
                if (iIntValue != 204) {
                    int i25 = f62455d;
                    int i26 = i25 & 11;
                    int i27 = i26 + ((i25 ^ 11) | i26);
                    i10 = i27 % 128;
                    f62454c = i10;
                    int i28 = i27 % 2;
                    if (iIntValue != 304) {
                        int i29 = (((i10 ^ 51) | (i10 & 51)) << 1) - ((i10 & (-52)) | ((~i10) & 51));
                        int i30 = i29 % 128;
                        f62455d = i30;
                        int i31 = i29 % 2;
                        int i32 = i30 + 117;
                        f62454c = i32 % 128;
                        int i33 = i32 % 2;
                        return Boolean.TRUE;
                    }
                }
            }
        } else if (iIntValue != 204) {
            int i210 = f62455d;
            int i211 = i210 & 11;
            int i212 = i211 + ((i210 ^ 11) | i211);
            i10 = i212 % 128;
            f62454c = i10;
            int i213 = i212 % 2;
            if (iIntValue != 304) {
                int i214 = (((i10 ^ 51) | (i10 & 51)) << 1) - ((i10 & (-52)) | ((~i10) & 51));
                int i34 = i214 % 128;
                f62455d = i34;
                int i35 = i214 % 2;
                int i36 = i34 + 117;
                f62454c = i36 % 128;
                int i37 = i36 % 2;
                return Boolean.TRUE;
            }
        }
        if (yt.setX(yrVar) == -1) {
            int i38 = f62455d;
            int i39 = i38 & 61;
            int i40 = -(-((i38 ^ 61) | i39));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            f62454c = i41 % 128;
            int i42 = i41 % 2;
            if (!l.equals("chunked", (String) yr.setX(new Object[]{yrVar, "Transfer-Encoding"}, 401167373, -401167369, (int) System.currentTimeMillis()), true)) {
                int i43 = f62455d;
                int i44 = (((i43 | 32) << 1) - (i43 ^ 32)) - 1;
                f62454c = i44 % 128;
                if (i44 % 2 == 0) {
                    return Boolean.FALSE;
                }
                int i45 = 63 / 0;
                return Boolean.FALSE;
            }
        }
        int i46 = f62454c;
        int i47 = (-2) - (((i46 & 122) + (i46 | 122)) ^ (-1));
        f62455d = i47 % 128;
        if (i47 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        abx abxVar = (abx) objArr[0];
        int i10 = f62455d;
        int i11 = ((i10 & (-82)) | ((~i10) & 81)) + ((i10 & 81) << 1);
        f62454c = i11 % 128;
        if (i11 % 2 != 0) {
            ((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar}, -1474615858, 1474615886, System.identityHashCode(abxVar))).booleanValue();
            throw null;
        }
        if (!((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar}, -1474615858, 1474615886, System.identityHashCode(abxVar))).booleanValue()) {
            int i12 = f62455d;
            int i13 = (i12 | 3) << 1;
            int i14 = -(((~i12) & 3) | (i12 & (-4)));
            int i15 = (i13 & i14) + (i14 | i13);
            f62454c = i15 % 128;
            int i16 = i15 % 2;
            if (((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar, 0L}, 630256048, -630256030, System.identityHashCode(abxVar))).byteValue() == 34) {
                int i17 = f62455d;
                int i18 = i17 & 89;
                int i19 = i18 + ((i17 ^ 89) | i18);
                f62454c = i19 % 128;
                return Boolean.valueOf(i19 % 2 == 0);
            }
        }
        int i20 = f62455d;
        int i21 = i20 & 109;
        int i22 = ((i20 | 109) & (~i21)) + (i21 << 1);
        f62454c = i22 % 128;
        int i23 = i22 % 2;
        return Boolean.FALSE;
    }

    public static /* synthetic */ String c(Object[] objArr) {
        abx abxVar = (abx) objArr[0];
        int i10 = f62455d;
        int i11 = i10 | 59;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 59)) & i11);
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f62454c = i14 % 128;
        int i15 = i14 % 2;
        long jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar, f62453b}, 93173967, -93173931, System.identityHashCode(abxVar))).longValue();
        if (jLongValue == -1) {
            int i16 = f62454c;
            int i17 = ((i16 & 52) + (i16 | 52)) - 1;
            f62455d = i17 % 128;
            int i18 = i17 % 2;
            jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
            int i19 = f62455d;
            int i20 = (((i19 | 100) << 1) - (i19 ^ 100)) - 1;
            f62454c = i20 % 128;
            int i21 = i20 % 2;
        }
        if (jLongValue == 0) {
            int i22 = f62454c + 23;
            f62455d = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        int i24 = f62454c;
        int i25 = i24 ^ 43;
        int i26 = ((i24 & 43) | i25) << 1;
        int i27 = -i25;
        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
        f62455d = i28 % 128;
        if (i28 % 2 != 0) {
            return (String) abx.setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(jLongValue)}, -1247282902, 1247282923, System.identityHashCode(abxVar));
        }
        throw null;
    }

    public static final void setOnFocusChangeListener(@NotNull yc ycVar, @NotNull yg ygVar, @NotNull ye yeVar) throws Throwable {
        setX(new Object[]{ycVar, ygVar, yeVar}, 1081323009, -1081323003, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0527  */
    /* JADX WARN: Code duplicated, block: B:109:0x064b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0656  */
    /* JADX WARN: Code duplicated, block: B:113:0x068b  */
    /* JADX WARN: Code duplicated, block: B:120:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:122:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:125:0x0700  */
    /* JADX WARN: Code duplicated, block: B:128:0x070d A[PHI: r6
      0x070d: PHI (r6v18 int A[IMMUTABLE_TYPE]) = (r6v17 int), (r6v41 int) binds: [B:126:0x0701, B:123:0x06fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x073a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0757  */
    /* JADX WARN: Code duplicated, block: B:134:0x0781  */
    /* JADX WARN: Code duplicated, block: B:137:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:140:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:142:0x080e  */
    /* JADX WARN: Code duplicated, block: B:147:0x084c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0852  */
    /* JADX WARN: Code duplicated, block: B:178:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0729 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x07c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x07db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x083e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x06b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0703 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0703 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x054a A[EDGE_INSN: B:193:0x054a->B:104:0x054a BREAK  A[LOOP:3: B:80:0x0422->B:152:0x085c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x054a A[EDGE_INSN: B:194:0x054a->B:104:0x054a BREAK  A[LOOP:3: B:80:0x0422->B:152:0x085c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x06ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x06b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x031e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0375  */
    /* JADX WARN: Code duplicated, block: B:85:0x047d A[PHI: r2
      0x047d: PHI (r2v10 java.lang.String) = (r2v9 java.lang.String), (r2v43 java.lang.String) binds: [B:81:0x042e, B:83:0x0462] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:92:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x04df  */
    /* JADX WARN: Code duplicated, block: B:95:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0517  */
    /* JADX WARN: Code duplicated, block: B:99:0x0525 A[DONT_INVERT] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        boolean zBooleanValue;
        String str;
        Object[] objArr2;
        int i13;
        int onFocusChangeListener;
        String str2;
        boolean zBooleanValue2;
        LinkedHashMap linkedHashMap;
        String str3;
        int onFocusChangeListener2;
        int i14;
        String str4;
        int i15;
        int i16;
        int i17;
        Object[] objArr3;
        String str5;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Object[] objArr4;
        int i23;
        int i24;
        int i25 = ~i10;
        int i26 = ~i11;
        int i27 = ~(i25 | i26 | i12);
        int i28 = ~i12;
        int i29 = i26 | i28;
        int i30 = (((~(i10 | i28)) | (~(i26 | i10)) | (~i29)) * 50) + ((i27 | (~(i29 | i10))) * 50) + ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i31 = -630256030;
        int i32 = 630256048;
        String str6 = "";
        char c10 = 0;
        Throwable th2 = null;
        int i33 = 2;
        int i34 = 1;
        switch (i30) {
            case 1:
                return a(objArr);
            case 2:
                return b(objArr);
            case 3:
                return c(objArr);
            case 4:
                ye yeVar = (ye) objArr[0];
                String str7 = (String) objArr[1];
                Intrinsics.checkNotNullParameter(yeVar, "");
                Intrinsics.checkNotNullParameter(str7, "");
                ArrayList arrayList = new ArrayList();
                int iIntValue = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1558209065, 1558209065, System.identityHashCode(yeVar))).intValue();
                int i35 = f62455d + 119;
                f62454c = i35 % 128;
                int i36 = i35 % 2;
                int i37 = 0;
                while (i37 < iIntValue) {
                    int i38 = f62455d;
                    int i39 = (-2) - (((i38 ^ 8) + ((i38 & 8) << 1)) ^ (-1));
                    f62454c = i39 % 128;
                    int i40 = i39 % 2;
                    int i41 = (-3) - (~(-(~i37)));
                    int i42 = i41 & 2;
                    int i43 = (i41 ^ 2) | i42;
                    int i44 = (i42 & i43) + (i43 | i42);
                    if (l.equals(str7, (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i37)}, 611642845, -611642844, i37), true)) {
                        abx abxVar = new abx();
                        try {
                            setX(new Object[]{(abx) abx.setOnFocusChangeListener(new Object[]{abxVar, (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i37)}, -1668064352, 1668064356, i37)}, -2069576566, 2069576590, System.identityHashCode(abxVar)), arrayList}, 1669480412, -1669480407, (int) System.currentTimeMillis());
                            int i45 = f62454c;
                            int i46 = (i45 | 19) << 1;
                            int i47 = -(i45 ^ 19);
                            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                            f62455d = i48 % 128;
                            int i49 = i48 % 2;
                        } catch (EOFException e5) {
                            aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
                            aaw.setCompoundDrawableTintBlendMode(new Object[]{"Unable to parse challenge", 5, e5}, 1271727973, -1271727970, 5);
                        }
                    }
                    i37 = i44;
                }
                int i50 = f62454c + 69;
                f62455d = i50 % 128;
                int i51 = i50 % 2;
                return arrayList;
            case 5:
                abx abxVar2 = (abx) objArr[0];
                List list = (List) objArr[1];
                int i52 = f62454c;
                int i53 = ((i52 | 99) << 1) - (i52 ^ 99);
                f62455d = i53 % 128;
                int i54 = i53 % 2;
                int i55 = ((i52 | 77) << 1) - (i52 ^ 77);
                f62455d = i55 % 128;
                int i56 = i55 % 2;
                while (true) {
                    String str8 = null;
                    while (true) {
                        if (str8 != null) {
                            Object[] objArr5 = new Object[i34];
                            objArr5[c10] = abxVar2;
                            zBooleanValue = ((Boolean) setX(objArr5, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue();
                            Object[] objArr6 = new Object[i34];
                            objArr6[c10] = abxVar2;
                            str = (String) setX(objArr6, 1748171832, -1748171829, (int) System.currentTimeMillis());
                            if (str == null) {
                                onFocusChangeListener = yt.setOnFocusChangeListener(abxVar2);
                                Object[] objArr7 = new Object[i34];
                                objArr7[c10] = abxVar2;
                                str2 = str6;
                                zBooleanValue2 = ((Boolean) setX(objArr7, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue();
                                if (!zBooleanValue) {
                                    i21 = f62455d;
                                    i22 = (i21 & 39) + (i21 | 39);
                                    f62454c = i22 % 128;
                                    if (i22 % i33 == 0) {
                                        throw null;
                                    }
                                    if (zBooleanValue2) {
                                    }
                                    int i57 = i21 & 43;
                                    int i58 = i57 + ((i21 ^ 43) | i57);
                                    f62454c = i58 % 128;
                                    int i59 = i58 % i33;
                                    objArr4 = new Object[i34];
                                    objArr4[c10] = abxVar2;
                                    if (((Boolean) abx.setOnFocusChangeListener(objArr4, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                    }
                                }
                                linkedHashMap = new LinkedHashMap();
                                int onFocusChangeListener3 = yt.setOnFocusChangeListener(abxVar2);
                                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                                int i60 = onFocusChangeListener3 * (-183);
                                int i61 = -(-(onFocusChangeListener * (-183)));
                                int i62 = (i60 ^ i61) + ((i61 & i60) << i34);
                                int i63 = ~onFocusChangeListener3;
                                int i64 = ~iCurrentTimeMillis;
                                int i65 = ~i64;
                                int i66 = ~i63;
                                int i67 = i63 & i64;
                                int i68 = (i63 & i65) | (i64 & i66) | i67;
                                int i69 = ~onFocusChangeListener;
                                str3 = str;
                                int i70 = (i68 & i69) | ((~i68) & onFocusChangeListener);
                                int i71 = i68 & onFocusChangeListener;
                                int i72 = (i70 ^ i71) | (i71 & i70);
                                int i73 = ~i72;
                                int i74 = (i72 | i73) & i73;
                                int i75 = (i69 ^ i64) | (i69 & i64);
                                int i76 = i75 ^ onFocusChangeListener3;
                                int i77 = i75 & onFocusChangeListener3;
                                int i78 = (i76 ^ i77) | (i76 & i77);
                                int i79 = ~i78;
                                int i80 = i79 & (i78 | i79);
                                int i81 = i74 & i80;
                                List list2 = list;
                                int i82 = (~i81) & (i80 | i74);
                                int i83 = -(-(((i82 & i81) | (i82 ^ i81)) * (-184)));
                                int i84 = ((i62 ^ i83) | (i62 & i83)) << 1;
                                int i85 = -((i83 & (~i62)) | ((~i83) & i62));
                                int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                                int i87 = ~(((~i69) & i63) | (i69 & i66) | (i63 & i69));
                                int i88 = (~i67) & (i63 | i64);
                                int i89 = (i88 & i67) | (i88 ^ i67);
                                int i90 = ~i89;
                                int i91 = (i89 | i90) & i90;
                                int i92 = i87 ^ i91;
                                int i93 = i87 & i91;
                                int i94 = (i93 & i92) | (i92 ^ i93);
                                int i95 = (i69 | onFocusChangeListener) & i69;
                                int i96 = (i95 & i64) | (i65 & i95) | ((~i95) & i64);
                                int i97 = ~i96;
                                int i98 = (i96 | i97) & i97;
                                int i99 = (i86 - (~(((i94 & i98) | (i94 ^ i98)) * 184))) - 1;
                                int i100 = onFocusChangeListener3 & onFocusChangeListener;
                                int i101 = (onFocusChangeListener3 | onFocusChangeListener) & (~i100);
                                int i102 = -(-(((i100 & i101) | (i101 ^ i100)) * 184));
                                onFocusChangeListener2 = (((i99 ^ i102) | (i99 & i102)) << 1) - ((i102 & (~i99)) | ((~i102) & i99));
                                int i103 = f62454c;
                                int i104 = i103 & 93;
                                int i105 = (i103 ^ 93) | i104;
                                int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
                                f62455d = i106 % 128;
                                i14 = 2;
                                int i107 = i106 % 2;
                                while (true) {
                                    if (str3 == null) {
                                        i20 = f62454c + 47;
                                        f62455d = i20 % 128;
                                        if (i20 % i14 != 0) {
                                            ((Boolean) setX(new Object[]{abxVar2}, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue();
                                            throw null;
                                        }
                                        str3 = (String) setX(new Object[]{abxVar2}, 1748171832, -1748171829, (int) System.currentTimeMillis());
                                        if (!((Boolean) setX(new Object[]{abxVar2}, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                            int i108 = f62455d;
                                            int i109 = i108 ^ 39;
                                            int i110 = -(-((i108 & 39) << 1));
                                            int i111 = (i109 & i110) + (i110 | i109);
                                            f62454c = i111 % 128;
                                            int i112 = i111 % 2;
                                            onFocusChangeListener2 = yt.setOnFocusChangeListener(abxVar2);
                                            int i113 = f62455d + 47;
                                            f62454c = i113 % 128;
                                            int i114 = i113 % 2;
                                        } else {
                                            str4 = str3;
                                        }
                                    }
                                    str4 = str3;
                                    if (onFocusChangeListener2 != 0) {
                                        i15 = f62455d;
                                        int i115 = i15 & 61;
                                        int i116 = -(-((i15 ^ 61) | i115));
                                        i16 = (i115 & i116) + (i115 | i116);
                                        f62454c = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            i17 = 1;
                                            if (onFocusChangeListener2 > 1) {
                                                int i117 = i15 + 59;
                                                f62454c = i117 % 128;
                                                int i118 = i117 % 2;
                                            } else {
                                                objArr3 = new Object[i17];
                                                objArr3[0] = abxVar2;
                                                if (((Boolean) setX(objArr3, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                    int i119 = f62454c;
                                                    int i120 = (i119 ^ 27) + ((i119 & 27) << 1);
                                                    f62455d = i120 % 128;
                                                    int i121 = i120 % 2;
                                                } else {
                                                    if (!((Boolean) setX(new Object[]{abxVar2}, -214395101, 214395103, (int) System.currentTimeMillis())).booleanValue()) {
                                                        str5 = (String) setX(new Object[]{abxVar2}, 1748171832, -1748171829, (int) System.currentTimeMillis());
                                                        int i122 = f62454c;
                                                        int i123 = (i122 | 93) << 1;
                                                        int i124 = -(i122 ^ 93);
                                                        int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                                                        f62455d = i125 % 128;
                                                        int i126 = i125 % 2;
                                                        i18 = 2;
                                                    } else {
                                                        int i127 = f62455d;
                                                        int i128 = i127 & 53;
                                                        int i129 = (i127 | 53) & (~i128);
                                                        int i130 = -(-(i128 << 1));
                                                        int i131 = (i129 ^ i130) + ((i129 & i130) << 1);
                                                        f62454c = i131 % 128;
                                                        int i132 = i131 % 2;
                                                        str5 = (String) setX(new Object[]{abxVar2}, -1893501232, 1893501232, (int) System.currentTimeMillis());
                                                        int i133 = f62454c;
                                                        int i134 = (-2) - (((i133 & 56) + (i133 | 56)) ^ (-1));
                                                        f62455d = i134 % 128;
                                                        i18 = 2;
                                                        int i135 = i134 % 2;
                                                    }
                                                    if (str5 == null) {
                                                        int i136 = f62454c + 107;
                                                        f62455d = i136 % 128;
                                                        int i137 = i136 % i18;
                                                    } else if (((String) linkedHashMap.put(str4, str5)) != null) {
                                                        int i138 = f62454c;
                                                        int i139 = i138 & 101;
                                                        int i140 = -(-((i138 ^ 101) | i139));
                                                        int i141 = (i139 ^ i140) + ((i140 & i139) << 1);
                                                        f62455d = i141 % 128;
                                                        int i142 = i141 % 2;
                                                    } else {
                                                        if (!((Boolean) setX(new Object[]{abxVar2}, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                            int i143 = f62455d;
                                                            int i144 = i143 & 117;
                                                            int i145 = -(-((i143 ^ 117) | i144));
                                                            int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                                                            f62454c = i146 % 128;
                                                            int i147 = i146 % 2;
                                                            if (!((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar2}, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                                                i19 = f62454c + 125;
                                                                f62455d = i19 % 128;
                                                                if (i19 % 2 == 0) {
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        str3 = null;
                                                        i14 = 2;
                                                    }
                                                }
                                            }
                                        } else {
                                            i17 = 1;
                                            if (onFocusChangeListener2 > 1) {
                                                int i1110 = i15 + 59;
                                                f62454c = i1110 % 128;
                                                int i1111 = i1110 % 2;
                                            } else {
                                                objArr3 = new Object[i17];
                                                objArr3[0] = abxVar2;
                                                if (((Boolean) setX(objArr3, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                    int i1112 = f62454c;
                                                    int i1210 = (i1112 ^ 27) + ((i1112 & 27) << 1);
                                                    f62455d = i1210 % 128;
                                                    int i1211 = i1210 % 2;
                                                } else {
                                                    if (!((Boolean) setX(new Object[]{abxVar2}, -214395101, 214395103, (int) System.currentTimeMillis())).booleanValue()) {
                                                        str5 = (String) setX(new Object[]{abxVar2}, 1748171832, -1748171829, (int) System.currentTimeMillis());
                                                        int i1212 = f62454c;
                                                        int i1213 = (i1212 | 93) << 1;
                                                        int i1214 = -(i1212 ^ 93);
                                                        int i1215 = (i1213 ^ i1214) + ((i1214 & i1213) << 1);
                                                        f62455d = i1215 % 128;
                                                        int i1216 = i1215 % 2;
                                                        i18 = 2;
                                                    } else {
                                                        int i1217 = f62455d;
                                                        int i1218 = i1217 & 53;
                                                        int i1219 = (i1217 | 53) & (~i1218);
                                                        int i1310 = -(-(i1218 << 1));
                                                        int i1311 = (i1219 ^ i1310) + ((i1219 & i1310) << 1);
                                                        f62454c = i1311 % 128;
                                                        int i1312 = i1311 % 2;
                                                        str5 = (String) setX(new Object[]{abxVar2}, -1893501232, 1893501232, (int) System.currentTimeMillis());
                                                        int i1313 = f62454c;
                                                        int i1314 = (-2) - (((i1313 & 56) + (i1313 | 56)) ^ (-1));
                                                        f62455d = i1314 % 128;
                                                        i18 = 2;
                                                        int i1315 = i1314 % 2;
                                                    }
                                                    if (str5 == null) {
                                                        int i1316 = f62454c + 107;
                                                        f62455d = i1316 % 128;
                                                        int i1317 = i1316 % i18;
                                                    } else if (((String) linkedHashMap.put(str4, str5)) != null) {
                                                        int i1318 = f62454c;
                                                        int i1319 = i1318 & 101;
                                                        int i148 = -(-((i1318 ^ 101) | i1319));
                                                        int i149 = (i1319 ^ i148) + ((i148 & i1319) << 1);
                                                        f62455d = i149 % 128;
                                                        int i1410 = i149 % 2;
                                                    } else {
                                                        if (!((Boolean) setX(new Object[]{abxVar2}, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                            int i1411 = f62455d;
                                                            int i1412 = i1411 & 117;
                                                            int i1413 = -(-((i1411 ^ 117) | i1412));
                                                            int i1414 = ((i1412 | i1413) << 1) - (i1413 ^ i1412);
                                                            f62454c = i1414 % 128;
                                                            int i1415 = i1414 % 2;
                                                            if (!((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar2}, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                                                i19 = f62454c + 125;
                                                                f62455d = i19 % 128;
                                                                if (i19 % 2 == 0) {
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        str3 = null;
                                                        i14 = 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                list2.add(new xv(str8, linkedHashMap));
                                int i150 = f62455d;
                                int i151 = (((i150 & (-82)) | ((~i150) & 81)) - (~(-(-((i150 & 81) << 1))))) - 1;
                                f62454c = i151 % 128;
                                int i152 = i151 % 2;
                                i34 = 1;
                                str6 = str2;
                                c10 = 0;
                                i33 = 2;
                                str8 = str4;
                                list = list2;
                                break;
                            } else {
                                int i153 = f62454c;
                                int i154 = (((i153 | 16) << i34) - (i153 ^ 16)) - i34;
                                f62455d = i154 % 128;
                                int i155 = i154 % i33;
                                objArr2 = new Object[i34];
                                objArr2[c10] = abxVar2;
                                if (((Boolean) abx.setOnFocusChangeListener(objArr2, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                    int i156 = f62455d;
                                    int i157 = i156 & 91;
                                    int i158 = (i156 ^ 91) | i157;
                                    i13 = (i157 & i158) + (i158 | i157);
                                    f62454c = i13 % 128;
                                    if (i13 % i33 != 0) {
                                        throw null;
                                    }
                                } else {
                                    list.add(new xv(str8, q.emptyMap()));
                                    int i159 = f62454c;
                                    int i160 = i159 & 25;
                                    int i161 = (i160 - (~((i159 ^ 25) | i160))) - i34;
                                    f62455d = i161 % 128;
                                    int i162 = i161 % i33;
                                }
                            }
                        } else {
                            int i163 = f62454c;
                            int i164 = (i163 ^ 96) + ((i163 & 96) << i34);
                            int i165 = (i164 ^ (-1)) + (i164 << i34);
                            f62455d = i165 % 128;
                            int i166 = i165 % i33;
                            Object[] objArr8 = new Object[i34];
                            objArr8[c10] = abxVar2;
                            ((Boolean) setX(objArr8, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue();
                            Object[] objArr9 = new Object[i34];
                            objArr9[c10] = abxVar2;
                            str8 = (String) setX(objArr9, 1748171832, -1748171829, (int) System.currentTimeMillis());
                            if (str8 != null) {
                                Object[] objArr10 = new Object[i34];
                                objArr10[c10] = abxVar2;
                                zBooleanValue = ((Boolean) setX(objArr10, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue();
                                Object[] objArr11 = new Object[i34];
                                objArr11[c10] = abxVar2;
                                str = (String) setX(objArr11, 1748171832, -1748171829, (int) System.currentTimeMillis());
                                if (str == null) {
                                    onFocusChangeListener = yt.setOnFocusChangeListener(abxVar2);
                                    Object[] objArr12 = new Object[i34];
                                    objArr12[c10] = abxVar2;
                                    str2 = str6;
                                    zBooleanValue2 = ((Boolean) setX(objArr12, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue();
                                    if (!zBooleanValue) {
                                        i21 = f62455d;
                                        i22 = (i21 & 39) + (i21 | 39);
                                        f62454c = i22 % 128;
                                        if (i22 % i33 == 0) {
                                            throw null;
                                        }
                                        if (zBooleanValue2) {
                                            int i510 = i21 & 43;
                                            int i511 = i510 + ((i21 ^ 43) | i510);
                                            f62454c = i511 % 128;
                                            int i512 = i511 % i33;
                                            objArr4 = new Object[i34];
                                            objArr4[c10] = abxVar2;
                                            if (((Boolean) abx.setOnFocusChangeListener(objArr4, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                            }
                                        }
                                    }
                                    linkedHashMap = new LinkedHashMap();
                                    int onFocusChangeListener4 = yt.setOnFocusChangeListener(abxVar2);
                                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                                    int i610 = onFocusChangeListener4 * (-183);
                                    int i611 = -(-(onFocusChangeListener * (-183)));
                                    int i612 = (i610 ^ i611) + ((i611 & i610) << i34);
                                    int i613 = ~onFocusChangeListener4;
                                    int i614 = ~iCurrentTimeMillis2;
                                    int i615 = ~i614;
                                    int i616 = ~i613;
                                    int i617 = i613 & i614;
                                    int i618 = (i613 & i615) | (i614 & i616) | i617;
                                    int i619 = ~onFocusChangeListener;
                                    str3 = str;
                                    int i710 = (i618 & i619) | ((~i618) & onFocusChangeListener);
                                    int i711 = i618 & onFocusChangeListener;
                                    int i712 = (i710 ^ i711) | (i711 & i710);
                                    int i713 = ~i712;
                                    int i714 = (i712 | i713) & i713;
                                    int i715 = (i619 ^ i614) | (i619 & i614);
                                    int i716 = i715 ^ onFocusChangeListener4;
                                    int i717 = i715 & onFocusChangeListener4;
                                    int i718 = (i716 ^ i717) | (i716 & i717);
                                    int i719 = ~i718;
                                    int i810 = i719 & (i718 | i719);
                                    int i811 = i714 & i810;
                                    List list3 = list;
                                    int i812 = (~i811) & (i810 | i714);
                                    int i813 = -(-(((i812 & i811) | (i812 ^ i811)) * (-184)));
                                    int i814 = ((i612 ^ i813) | (i612 & i813)) << 1;
                                    int i815 = -((i813 & (~i612)) | ((~i813) & i612));
                                    int i816 = (i814 ^ i815) + ((i815 & i814) << 1);
                                    int i817 = ~(((~i619) & i613) | (i619 & i616) | (i613 & i619));
                                    int i818 = (~i617) & (i613 | i614);
                                    int i819 = (i818 & i617) | (i818 ^ i617);
                                    int i910 = ~i819;
                                    int i911 = (i819 | i910) & i910;
                                    int i912 = i817 ^ i911;
                                    int i913 = i817 & i911;
                                    int i914 = (i913 & i912) | (i912 ^ i913);
                                    int i915 = (i619 | onFocusChangeListener) & i619;
                                    int i916 = (i915 & i614) | (i615 & i915) | ((~i915) & i614);
                                    int i917 = ~i916;
                                    int i918 = (i916 | i917) & i917;
                                    int i919 = (i816 - (~(((i914 & i918) | (i914 ^ i918)) * 184))) - 1;
                                    int i1010 = onFocusChangeListener4 & onFocusChangeListener;
                                    int i1011 = (onFocusChangeListener4 | onFocusChangeListener) & (~i1010);
                                    int i1012 = -(-(((i1010 & i1011) | (i1011 ^ i1010)) * 184));
                                    onFocusChangeListener2 = (((i919 ^ i1012) | (i919 & i1012)) << 1) - ((i1012 & (~i919)) | ((~i1012) & i919));
                                    int i1013 = f62454c;
                                    int i1014 = i1013 & 93;
                                    int i1015 = (i1013 ^ 93) | i1014;
                                    int i1016 = (i1014 ^ i1015) + ((i1015 & i1014) << 1);
                                    f62455d = i1016 % 128;
                                    i14 = 2;
                                    int i1017 = i1016 % 2;
                                    while (true) {
                                        if (str3 == null) {
                                            i20 = f62454c + 47;
                                            f62455d = i20 % 128;
                                            if (i20 % i14 != 0) {
                                                ((Boolean) setX(new Object[]{abxVar2}, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue();
                                                throw null;
                                            }
                                            str3 = (String) setX(new Object[]{abxVar2}, 1748171832, -1748171829, (int) System.currentTimeMillis());
                                            if (!((Boolean) setX(new Object[]{abxVar2}, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                int i1018 = f62455d;
                                                int i1019 = i1018 ^ 39;
                                                int i1113 = -(-((i1018 & 39) << 1));
                                                int i1114 = (i1019 & i1113) + (i1113 | i1019);
                                                f62454c = i1114 % 128;
                                                int i1115 = i1114 % 2;
                                                onFocusChangeListener2 = yt.setOnFocusChangeListener(abxVar2);
                                                int i1116 = f62455d + 47;
                                                f62454c = i1116 % 128;
                                                int i1117 = i1116 % 2;
                                            } else {
                                                str4 = str3;
                                            }
                                        }
                                        str4 = str3;
                                        if (onFocusChangeListener2 != 0) {
                                            i15 = f62455d;
                                            int i1118 = i15 & 61;
                                            int i1119 = -(-((i15 ^ 61) | i1118));
                                            i16 = (i1118 & i1119) + (i1118 | i1119);
                                            f62454c = i16 % 128;
                                            if (i16 % 2 != 0) {
                                                i17 = 1;
                                                if (onFocusChangeListener2 > 1) {
                                                    int i11110 = i15 + 59;
                                                    f62454c = i11110 % 128;
                                                    int i11111 = i11110 % 2;
                                                } else {
                                                    objArr3 = new Object[i17];
                                                    objArr3[0] = abxVar2;
                                                    if (((Boolean) setX(objArr3, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                        int i11112 = f62454c;
                                                        int i12110 = (i11112 ^ 27) + ((i11112 & 27) << 1);
                                                        f62455d = i12110 % 128;
                                                        int i12111 = i12110 % 2;
                                                    } else {
                                                        if (!((Boolean) setX(new Object[]{abxVar2}, -214395101, 214395103, (int) System.currentTimeMillis())).booleanValue()) {
                                                            str5 = (String) setX(new Object[]{abxVar2}, 1748171832, -1748171829, (int) System.currentTimeMillis());
                                                            int i12112 = f62454c;
                                                            int i12113 = (i12112 | 93) << 1;
                                                            int i12114 = -(i12112 ^ 93);
                                                            int i12115 = (i12113 ^ i12114) + ((i12114 & i12113) << 1);
                                                            f62455d = i12115 % 128;
                                                            int i12116 = i12115 % 2;
                                                            i18 = 2;
                                                        } else {
                                                            int i12117 = f62455d;
                                                            int i12118 = i12117 & 53;
                                                            int i12119 = (i12117 | 53) & (~i12118);
                                                            int i13110 = -(-(i12118 << 1));
                                                            int i13111 = (i12119 ^ i13110) + ((i12119 & i13110) << 1);
                                                            f62454c = i13111 % 128;
                                                            int i13112 = i13111 % 2;
                                                            str5 = (String) setX(new Object[]{abxVar2}, -1893501232, 1893501232, (int) System.currentTimeMillis());
                                                            int i13113 = f62454c;
                                                            int i13114 = (-2) - (((i13113 & 56) + (i13113 | 56)) ^ (-1));
                                                            f62455d = i13114 % 128;
                                                            i18 = 2;
                                                            int i13115 = i13114 % 2;
                                                        }
                                                        if (str5 == null) {
                                                            int i13116 = f62454c + 107;
                                                            f62455d = i13116 % 128;
                                                            int i13117 = i13116 % i18;
                                                        } else if (((String) linkedHashMap.put(str4, str5)) != null) {
                                                            int i13118 = f62454c;
                                                            int i13119 = i13118 & 101;
                                                            int i1416 = -(-((i13118 ^ 101) | i13119));
                                                            int i1417 = (i13119 ^ i1416) + ((i1416 & i13119) << 1);
                                                            f62455d = i1417 % 128;
                                                            int i1418 = i1417 % 2;
                                                        } else {
                                                            if (!((Boolean) setX(new Object[]{abxVar2}, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                                int i1419 = f62455d;
                                                                int i14110 = i1419 & 117;
                                                                int i14111 = -(-((i1419 ^ 117) | i14110));
                                                                int i14112 = ((i14110 | i14111) << 1) - (i14111 ^ i14110);
                                                                f62454c = i14112 % 128;
                                                                int i14113 = i14112 % 2;
                                                                if (!((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar2}, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                                                    i19 = f62454c + 125;
                                                                    f62455d = i19 % 128;
                                                                    if (i19 % 2 == 0) {
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                            str3 = null;
                                                            i14 = 2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i17 = 1;
                                                if (onFocusChangeListener2 > 1) {
                                                    int i11113 = i15 + 59;
                                                    f62454c = i11113 % 128;
                                                    int i11114 = i11113 % 2;
                                                } else {
                                                    objArr3 = new Object[i17];
                                                    objArr3[0] = abxVar2;
                                                    if (((Boolean) setX(objArr3, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                        int i11115 = f62454c;
                                                        int i121110 = (i11115 ^ 27) + ((i11115 & 27) << 1);
                                                        f62455d = i121110 % 128;
                                                        int i121111 = i121110 % 2;
                                                    } else {
                                                        if (!((Boolean) setX(new Object[]{abxVar2}, -214395101, 214395103, (int) System.currentTimeMillis())).booleanValue()) {
                                                            str5 = (String) setX(new Object[]{abxVar2}, 1748171832, -1748171829, (int) System.currentTimeMillis());
                                                            int i121112 = f62454c;
                                                            int i121113 = (i121112 | 93) << 1;
                                                            int i121114 = -(i121112 ^ 93);
                                                            int i121115 = (i121113 ^ i121114) + ((i121114 & i121113) << 1);
                                                            f62455d = i121115 % 128;
                                                            int i121116 = i121115 % 2;
                                                            i18 = 2;
                                                        } else {
                                                            int i121117 = f62455d;
                                                            int i121118 = i121117 & 53;
                                                            int i121119 = (i121117 | 53) & (~i121118);
                                                            int i131110 = -(-(i121118 << 1));
                                                            int i131111 = (i121119 ^ i131110) + ((i121119 & i131110) << 1);
                                                            f62454c = i131111 % 128;
                                                            int i131112 = i131111 % 2;
                                                            str5 = (String) setX(new Object[]{abxVar2}, -1893501232, 1893501232, (int) System.currentTimeMillis());
                                                            int i131113 = f62454c;
                                                            int i131114 = (-2) - (((i131113 & 56) + (i131113 | 56)) ^ (-1));
                                                            f62455d = i131114 % 128;
                                                            i18 = 2;
                                                            int i131115 = i131114 % 2;
                                                        }
                                                        if (str5 == null) {
                                                            int i131116 = f62454c + 107;
                                                            f62455d = i131116 % 128;
                                                            int i131117 = i131116 % i18;
                                                        } else if (((String) linkedHashMap.put(str4, str5)) != null) {
                                                            int i131118 = f62454c;
                                                            int i131119 = i131118 & 101;
                                                            int i14114 = -(-((i131118 ^ 101) | i131119));
                                                            int i14115 = (i131119 ^ i14114) + ((i14114 & i131119) << 1);
                                                            f62455d = i14115 % 128;
                                                            int i14116 = i14115 % 2;
                                                        } else {
                                                            if (!((Boolean) setX(new Object[]{abxVar2}, 1900671006, -1900670999, (int) System.currentTimeMillis())).booleanValue()) {
                                                                int i14117 = f62455d;
                                                                int i14118 = i14117 & 117;
                                                                int i14119 = -(-((i14117 ^ 117) | i14118));
                                                                int i141110 = ((i14118 | i14119) << 1) - (i14119 ^ i14118);
                                                                f62454c = i141110 % 128;
                                                                int i141111 = i141110 % 2;
                                                                if (!((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar2}, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                                                    i19 = f62454c + 125;
                                                                    f62455d = i19 % 128;
                                                                    if (i19 % 2 == 0) {
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                            str3 = null;
                                                            i14 = 2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    list3.add(new xv(str8, linkedHashMap));
                                    int i1510 = f62455d;
                                    int i1511 = (((i1510 & (-82)) | ((~i1510) & 81)) - (~(-(-((i1510 & 81) << 1))))) - 1;
                                    f62454c = i1511 % 128;
                                    int i1512 = i1511 % 2;
                                    i34 = 1;
                                    str6 = str2;
                                    c10 = 0;
                                    i33 = 2;
                                    str8 = str4;
                                    list = list3;
                                    break;
                                } else {
                                    int i1513 = f62454c;
                                    int i1514 = (((i1513 | 16) << i34) - (i1513 ^ 16)) - i34;
                                    f62455d = i1514 % 128;
                                    int i1515 = i1514 % i33;
                                    objArr2 = new Object[i34];
                                    objArr2[c10] = abxVar2;
                                    if (((Boolean) abx.setOnFocusChangeListener(objArr2, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                        list.add(new xv(str8, q.emptyMap()));
                                        int i1516 = f62454c;
                                        int i167 = i1516 & 25;
                                        int i168 = (i167 - (~((i1516 ^ 25) | i167))) - i34;
                                        f62455d = i168 % 128;
                                        int i169 = i168 % i33;
                                    } else {
                                        int i1517 = f62455d;
                                        int i1518 = i1517 & 91;
                                        int i1519 = (i1517 ^ 91) | i1518;
                                        i13 = (i1518 & i1519) + (i1519 | i1518);
                                        f62454c = i13 % 128;
                                        if (i13 % i33 != 0) {
                                            throw null;
                                        }
                                    }
                                }
                            } else {
                                int i170 = f62454c;
                                int i171 = i170 & 93;
                                int i172 = ((i170 ^ 93) | i171) << i34;
                                int i173 = -((i170 | 93) & (~i171));
                                int i174 = (i172 ^ i173) + ((i173 & i172) << i34);
                                f62455d = i174 % 128;
                                int i175 = i174 % i33;
                            }
                        }
                    }
                    Map mapSingletonMap = Collections.singletonMap(null, Intrinsics.stringPlus(str, l.repeat("=", onFocusChangeListener)));
                    str6 = str2;
                    Intrinsics.checkNotNullExpressionValue(mapSingletonMap, str6);
                    list.add(new xv(str8, mapSingletonMap));
                    int i176 = f62455d;
                    int i177 = i176 & 43;
                    int i178 = -(-(i176 | 43));
                    int i179 = ((i177 | i178) << i34) - (i178 ^ i177);
                    f62454c = i179 % 128;
                    int i180 = i179 % i33;
                }
                return null;
            case 6:
                yc ycVar = (yc) objArr[0];
                yg ygVar = (yg) objArr[1];
                ye yeVar2 = (ye) objArr[2];
                int i181 = f62455d;
                int i182 = (i181 & 69) + (i181 | 69);
                f62454c = i182 % 128;
                int i183 = i182 % 2;
                Intrinsics.checkNotNullParameter(ycVar, "");
                Intrinsics.checkNotNullParameter(ygVar, "");
                Intrinsics.checkNotNullParameter(yeVar2, "");
                if (ycVar == yc.setOnFocusChangeListener) {
                    int i184 = f62454c;
                    int i185 = i184 & 95;
                    int i186 = i185 + ((i184 ^ 95) | i185);
                    f62455d = i186 % 128;
                    if (i186 % 2 == 0) {
                        throw null;
                    }
                } else {
                    yb.Companion companion = yb.INSTANCE;
                    List<yb> list4 = (List) yb.Companion.setY(new Object[]{companion, ygVar, yeVar2}, 1656972118, -1656972113, System.identityHashCode(companion));
                    if (list4.isEmpty()) {
                        int i187 = f62454c + 107;
                        f62455d = i187 % 128;
                        if (i187 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        ycVar.setY(ygVar, list4);
                        int i188 = f62455d;
                        int i189 = i188 | 91;
                        int i190 = (i189 << 1) - ((~(i188 & 91)) & i189);
                        f62454c = i190 % 128;
                        if (i190 % 2 != 0) {
                            int i191 = 44 / 0;
                        }
                    }
                }
                return null;
            case 7:
                abx abxVar3 = (abx) objArr[0];
                int i192 = f62454c;
                int i193 = i192 & 105;
                int i194 = ((i192 ^ 105) | i193) << 1;
                int i195 = -((i192 | 105) & (~i193));
                int i196 = (i194 ^ i195) + ((i195 & i194) << 1);
                int i197 = i196 % 128;
                f62455d = i197;
                int i198 = i196 % 2;
                int i199 = (i197 & (-56)) | ((~i197) & 55);
                int i200 = (i197 & 55) << 1;
                int i201 = (i199 ^ i200) + ((i200 & i199) << 1);
                f62454c = i201 % 128;
                int i202 = i201 % 2;
                boolean z10 = false;
                while (!((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar3}, -1474615858, 1474615886, System.identityHashCode(abxVar3))).booleanValue()) {
                    int i203 = f62455d;
                    int i204 = ((i203 | 51) << 1) - (i203 ^ 51);
                    f62454c = i204 % 128;
                    int i205 = i204 % 2;
                    byte bByteValue = ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar3, 0L}, 630256048, -630256030, System.identityHashCode(abxVar3))).byteValue();
                    if (bByteValue == 44) {
                        int i206 = f62455d;
                        int i207 = i206 & 115;
                        int i208 = ((i206 ^ 115) | i207) << 1;
                        int i209 = -((i206 | 115) & (~i207));
                        int i210 = ((i208 | i209) << 1) - (i209 ^ i208);
                        f62454c = i210 % 128;
                        if (i210 % 2 != 0) {
                            ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 33298663, -33298647, System.identityHashCode(abxVar3))).byteValue();
                            z10 = false;
                        } else {
                            ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 33298663, -33298647, System.identityHashCode(abxVar3))).byteValue();
                            z10 = true;
                        }
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    } else if (bByteValue == 32) {
                        int i211 = f62454c;
                        int i212 = i211 + 45;
                        f62455d = i212 % 128;
                        boolean z11 = i212 % 2 != 0;
                        int i213 = ((((i211 ^ 21) | (i211 & 21)) << 1) - (~(-(((~i211) & 21) | (i211 & (-22)))))) - 1;
                        f62455d = i213 % 128;
                        int i214 = i213 % 2;
                        if (!z11) {
                            int i215 = f62455d;
                            i23 = (i215 & 23) + (i215 | 23);
                            f62454c = i23 % 128;
                            if (i23 % 2 != 0) {
                                int i216 = 68 / 0;
                            }
                            return Boolean.valueOf(z10);
                        }
                        int i217 = f62454c + 10;
                        i24 = (i217 ^ (-1)) + (i217 << 1);
                        f62455d = i24 % 128;
                        if (i24 % 2 != 0) {
                            ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 33298663, -33298647, System.identityHashCode(abxVar3))).byteValue();
                            throw null;
                        }
                        ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 33298663, -33298647, System.identityHashCode(abxVar3))).byteValue();
                        int i218 = f62455d;
                        int i219 = i218 & 75;
                        int i220 = (((i218 | 75) & (~i219)) - (~(-(-(i219 << 1))))) - 1;
                        f62454c = i220 % 128;
                        int i221 = i220 % 2;
                    } else {
                        if (bByteValue != 9) {
                            int i222 = f62454c;
                            int i223 = i222 & 95;
                            int i224 = (i222 ^ 95) | i223;
                            int i225 = (i223 & i224) + (i224 | i223);
                            f62455d = i225 % 128;
                            int i226 = i225 % 2;
                            int i2110 = f62455d;
                            i23 = (i2110 & 23) + (i2110 | 23);
                            f62454c = i23 % 128;
                            if (i23 % 2 != 0) {
                                int i2111 = 68 / 0;
                            }
                            return Boolean.valueOf(z10);
                        }
                        int i227 = f62455d;
                        int i228 = (i227 ^ 115) + ((i227 & 115) << 1);
                        f62454c = i228 % 128;
                        int i229 = i228 % 2;
                        int i2112 = f62454c + 10;
                        i24 = (i2112 ^ (-1)) + (i2112 << 1);
                        f62455d = i24 % 128;
                        if (i24 % 2 != 0) {
                            ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 33298663, -33298647, System.identityHashCode(abxVar3))).byteValue();
                            throw null;
                        }
                        ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 33298663, -33298647, System.identityHashCode(abxVar3))).byteValue();
                        int i2113 = f62455d;
                        int i2114 = i2113 & 75;
                        int i2210 = (((i2113 | 75) & (~i2114)) - (~(-(-(i2114 << 1))))) - 1;
                        f62454c = i2210 % 128;
                        int i2211 = i2210 % 2;
                    }
                }
                int i2115 = f62455d;
                i23 = (i2115 & 23) + (i2115 | 23);
                f62454c = i23 % 128;
                if (i23 % 2 != 0) {
                    int i2116 = 68 / 0;
                }
                return Boolean.valueOf(z10);
            default:
                abx abxVar4 = (abx) objArr[0];
                int i230 = f62455d;
                int i231 = ((i230 ^ 93) | (i230 & 93)) << 1;
                int i232 = -(((~i230) & 93) | (i230 & (-94)));
                int i233 = (i231 ^ i232) + ((i232 & i231) << 1);
                f62454c = i233 % 128;
                int i234 = i233 % 2;
                byte b10 = 34;
                if (((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 33298663, -33298647, System.identityHashCode(abxVar4))).byteValue() != 34) {
                    int i235 = f62454c;
                    int i236 = i235 ^ 121;
                    int i237 = ((i235 & 121) | i236) << 1;
                    int i238 = -i236;
                    int i239 = ((i237 | i238) << 1) - (i237 ^ i238);
                    f62455d = i239 % 128;
                    int i240 = i239 % 2;
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i241 = f62455d;
                int i242 = (((i241 & (-4)) | ((~i241) & 3)) - (~(-(-((i241 & 3) << 1))))) - 1;
                f62454c = i242 % 128;
                int i243 = i242 % 2;
                abx abxVar5 = new abx();
                int i244 = f62454c;
                int i245 = (i244 & 64) + (i244 | 64);
                int i246 = (i245 ^ (-1)) + (i245 << 1);
                f62455d = i246 % 128;
                int i247 = i246 % 2;
                while (true) {
                    long jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar4, f62452a}, 93173967, -93173931, System.identityHashCode(abxVar4))).longValue();
                    if (jLongValue == -1) {
                        int i248 = f62454c;
                        int i249 = i248 ^ 23;
                        int i250 = -(-((i248 & 23) << 1));
                        int i251 = (i249 & i250) + (i250 | i249);
                        int i252 = i251 % 128;
                        f62455d = i252;
                        int i253 = i251 % 2;
                        int i254 = i252 & 107;
                        int i255 = ((i252 ^ 107) | i254) << 1;
                        int i256 = -((i252 | 107) & (~i254));
                        int i257 = (i255 ^ i256) + ((i256 & i255) << 1);
                        f62454c = i257 % 128;
                        if (i257 % 2 == 0) {
                            return th2;
                        }
                        throw th2;
                    }
                    if (((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar4, Long.valueOf(jLongValue)}, i32, i31, System.identityHashCode(abxVar4))).byteValue() == b10) {
                        int i258 = f62455d;
                        int i259 = (i258 ^ 15) + ((i258 & 15) << 1);
                        f62454c = i259 % 128;
                        if (i259 % 2 == 0) {
                            abx.setOnFocusChangeListener(new Object[]{abxVar5, abxVar4, Long.valueOf(jLongValue)}, -2065855263, 2065855285, System.identityHashCode(abxVar5));
                            ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 33298663, -33298647, System.identityHashCode(abxVar4))).byteValue();
                            return abxVar5.setTextAlignment();
                        }
                        abx.setOnFocusChangeListener(new Object[]{abxVar5, abxVar4, Long.valueOf(jLongValue)}, -2065855263, 2065855285, System.identityHashCode(abxVar5));
                        ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 33298663, -33298647, System.identityHashCode(abxVar4))).byteValue();
                        abxVar5.setTextAlignment();
                        throw th2;
                    }
                    if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 1395393434, -1395393402, System.identityHashCode(abxVar4))).longValue() == jLongValue + 1) {
                        int i260 = f62454c;
                        int i261 = (i260 ^ 21) + ((i260 & 21) << 1);
                        int i262 = i261 % 128;
                        f62455d = i262;
                        int i263 = i261 % 2;
                        int i264 = ((i262 ^ 96) + ((i262 & 96) << 1)) - 1;
                        f62454c = i264 % 128;
                        int i265 = i264 % 2;
                    } else {
                        abx.setOnFocusChangeListener(new Object[]{abxVar5, abxVar4, Long.valueOf(jLongValue)}, -2065855263, 2065855285, System.identityHashCode(abxVar5));
                        ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 33298663, -33298647, System.identityHashCode(abxVar4))).byteValue();
                        abx.setOnFocusChangeListener(new Object[]{abxVar5, abxVar4, 1L}, -2065855263, 2065855285, System.identityHashCode(abxVar5));
                        int i266 = f62455d + 33;
                        f62454c = i266 % 128;
                        int i267 = i266 % 2;
                        i31 = -630256030;
                        i32 = 630256048;
                        th2 = null;
                        b10 = 34;
                    }
                }
                return null;
        }
    }

    public static final boolean setY(@NotNull yr yrVar) {
        return ((Boolean) setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue();
    }

    @NotNull
    public static final List<xv> setX(@NotNull ye yeVar, @NotNull String str) {
        return (List) setX(new Object[]{yeVar, str}, -1009300189, 1009300193, (int) System.currentTimeMillis());
    }
}
