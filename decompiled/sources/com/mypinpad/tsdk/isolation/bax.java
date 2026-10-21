package com.mypinpad.tsdk.isolation;

import androidx.emoji2.text.flatbuffer.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bax {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<Integer, bax> f54362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54363f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f54364g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bah f54365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bbb f54366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54368d;

    static {
        HashMap map = new HashMap();
        Integer num = (Integer) beq.setY(new Object[]{1}, 843618426, -843618423, 1);
        adu aduVar = ahp.setDividerPadding;
        map.put(num, new bax(20, 2, aduVar));
        a.e(20, 4, aduVar, map, (Integer) beq.setY(new Object[]{2}, 843618426, -843618423, 2));
        a.e(40, 2, aduVar, map, (Integer) beq.setY(new Object[]{3}, 843618426, -843618423, 3));
        a.e(40, 4, aduVar, map, (Integer) beq.setY(new Object[]{4}, 843618426, -843618423, 4));
        a.e(40, 8, aduVar, map, (Integer) beq.setY(new Object[]{5}, 843618426, -843618423, 5));
        a.e(60, 3, aduVar, map, (Integer) beq.setY(new Object[]{6}, 843618426, -843618423, 6));
        a.e(60, 6, aduVar, map, (Integer) beq.setY(new Object[]{7}, 843618426, -843618423, 7));
        a.e(60, 12, aduVar, map, (Integer) beq.setY(new Object[]{8}, 843618426, -843618423, 8));
        Integer num2 = (Integer) beq.setY(new Object[]{9}, 843618426, -843618423, 9);
        adu aduVar2 = ahp.setOnFocusChangeListener;
        map.put(num2, new bax(20, 2, aduVar2));
        a.e(20, 4, aduVar2, map, (Integer) beq.setY(new Object[]{10}, 843618426, -843618423, 10));
        a.e(40, 2, aduVar2, map, (Integer) beq.setY(new Object[]{11}, 843618426, -843618423, 11));
        a.e(40, 4, aduVar2, map, (Integer) beq.setY(new Object[]{12}, 843618426, -843618423, 12));
        a.e(40, 8, aduVar2, map, (Integer) beq.setY(new Object[]{13}, 843618426, -843618423, 13));
        a.e(60, 3, aduVar2, map, (Integer) beq.setY(new Object[]{14}, 843618426, -843618423, 14));
        a.e(60, 6, aduVar2, map, (Integer) beq.setY(new Object[]{15}, 843618426, -843618423, 15));
        a.e(60, 12, aduVar2, map, (Integer) beq.setY(new Object[]{16}, 843618426, -843618423, 16));
        Integer num3 = (Integer) beq.setY(new Object[]{17}, 843618426, -843618423, 17);
        adu aduVar3 = ahp.setIncludeFontPadding;
        map.put(num3, new bax(20, 2, aduVar3));
        a.e(20, 4, aduVar3, map, (Integer) beq.setY(new Object[]{18}, 843618426, -843618423, 18));
        a.e(40, 2, aduVar3, map, (Integer) beq.setY(new Object[]{19}, 843618426, -843618423, 19));
        a.e(40, 4, aduVar3, map, (Integer) beq.setY(new Object[]{20}, 843618426, -843618423, 20));
        a.e(40, 8, aduVar3, map, (Integer) beq.setY(new Object[]{21}, 843618426, -843618423, 21));
        a.e(60, 3, aduVar3, map, (Integer) beq.setY(new Object[]{22}, 843618426, -843618423, 22));
        a.e(60, 6, aduVar3, map, (Integer) beq.setY(new Object[]{23}, 843618426, -843618423, 23));
        a.e(60, 12, aduVar3, map, (Integer) beq.setY(new Object[]{24}, 843618426, -843618423, 24));
        Integer num4 = (Integer) beq.setY(new Object[]{25}, 843618426, -843618423, 25);
        adu aduVar4 = ahp.setZ;
        map.put(num4, new bax(20, 2, aduVar4));
        a.e(20, 4, aduVar4, map, (Integer) beq.setY(new Object[]{26}, 843618426, -843618423, 26));
        a.e(40, 2, aduVar4, map, (Integer) beq.setY(new Object[]{27}, 843618426, -843618423, 27));
        a.e(40, 4, aduVar4, map, (Integer) beq.setY(new Object[]{28}, 843618426, -843618423, 28));
        a.e(40, 8, aduVar4, map, (Integer) beq.setY(new Object[]{29}, 843618426, -843618423, 29));
        a.e(60, 3, aduVar4, map, (Integer) beq.setY(new Object[]{30}, 843618426, -843618423, 30));
        a.e(60, 6, aduVar4, map, (Integer) beq.setY(new Object[]{31}, 843618426, -843618423, 31));
        a.e(60, 12, aduVar4, map, (Integer) beq.setY(new Object[]{32}, 843618426, -843618423, 32));
        f54362e = Collections.unmodifiableMap(map);
        int i10 = f54363f;
        int i11 = (i10 & (-68)) | ((~i10) & 67);
        int i12 = (i10 & 67) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f54364g = i13 % 128;
        int i14 = i13 % 2;
    }

    public bax(int i10, int i11, adu aduVar) {
        this.f54367c = i10;
        this.f54368d = i11;
        this.f54366b = new bbb(((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 1708929753, -1708929749, i10)).intValue(), aduVar);
        String str = (String) setOnFocusChangeListener(new Object[]{this}, 1062868062, -1062868055, System.identityHashCode(this));
        int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{this}, -1645560145, 1645560148, System.identityHashCode(this))).intValue();
        this.f54365a = (bah) bah.setDividerPadding(new Object[]{str, Integer.valueOf(iIntValue), Integer.valueOf(((Integer) setOnFocusChangeListener(new Object[]{this}, 2063827991, -2063827991, System.identityHashCode(this))).intValue()), Integer.valueOf(((Integer) setOnFocusChangeListener(new Object[]{this}, -650969752, 650969754, System.identityHashCode(this))).intValue()), Integer.valueOf(((Integer) setOnFocusChangeListener(new Object[]{this}, -1235800220, 1235800228, System.identityHashCode(this))).intValue()), Integer.valueOf(i11)}, 2020304888, -2020304887, iIntValue);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-448)) + (i10 * 450);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        switch ((((~(i10 | i15 | (~i12))) | i14) * 449) + (i14 * (-1347)) + (((~(i15 | i10 | i12)) | i14) * 449) + i13) {
            case 1:
                bax baxVar = (bax) objArr[0];
                int i16 = f54363f;
                int i17 = ((i16 | 75) << 1) - (i16 ^ 75);
                f54364g = i17 % 128;
                int i18 = i17 % 2;
                bah bahVar = baxVar.f54365a;
                if (i18 != 0) {
                    return bahVar;
                }
                throw null;
            case 2:
                bax baxVar2 = (bax) objArr[0];
                int i19 = f54363f;
                int i20 = ((i19 ^ 5) | (i19 & 5)) << 1;
                int i21 = -(((~i19) & 5) | (i19 & (-6)));
                int i22 = (i20 & i21) + (i21 | i20);
                f54364g = i22 % 128;
                int i23 = i22 % 2;
                bbb bbbVar = baxVar2.f54366b;
                int iIntValue = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1129379032, -1129379023, System.identityHashCode(bbbVar))).intValue();
                int i24 = f54363f + 119;
                f54364g = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 9 / 0;
                }
                return Integer.valueOf(iIntValue);
            case 3:
                bax baxVar3 = (bax) objArr[0];
                int i26 = f54363f + 78;
                int i27 = (i26 ^ (-1)) + (i26 << 1);
                f54364g = i27 % 128;
                int i28 = i27 % 2;
                bbb bbbVar2 = baxVar3.f54366b;
                int iIntValue2 = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, 862961959, -862961952, System.identityHashCode(bbbVar2))).intValue();
                int i29 = f54363f;
                int i30 = ((i29 ^ 9) | (i29 & 9)) << 1;
                int i31 = -(((~i29) & 9) | (i29 & (-10)));
                int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                f54364g = i32 % 128;
                int i33 = i32 % 2;
                return Integer.valueOf(iIntValue2);
            case 4:
                int iIntValue3 = ((Number) objArr[0]).intValue();
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int i34 = f54363f;
                int i35 = i34 & 51;
                int i36 = (i34 ^ 51) | i35;
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                int i38 = i37 % 128;
                f54364g = i38;
                if (i37 % 2 != 0 ? iIntValue3 < 2 : iIntValue3 < 5) {
                    throw new IllegalArgumentException("totalHeight must be > 1");
                }
                if (iIntValue3 % iIntValue4 != 0) {
                    throw new IllegalArgumentException("layers must divide totalHeight without remainder");
                }
                int i39 = iIntValue3 / iIntValue4;
                if (i39 == 1) {
                    throw new IllegalArgumentException("height / layers must be greater than 1");
                }
                int i40 = ((i38 ^ 71) | (i38 & 71)) << 1;
                int i41 = -(((~i38) & 71) | (i38 & (-72)));
                int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                f54363f = i42 % 128;
                if (i42 % 2 == 0) {
                    return Integer.valueOf(i39);
                }
                throw null;
            case 5:
                bax baxVar4 = (bax) objArr[0];
                int i43 = f54364g;
                int i44 = i43 & 35;
                int i45 = ((i43 ^ 35) | i44) << 1;
                int i46 = -((i43 | 35) & (~i44));
                int i47 = (i45 & i46) + (i46 | i45);
                int i48 = i47 % 128;
                f54363f = i48;
                int i49 = i47 % 2;
                bbb bbbVar3 = baxVar4.f54366b;
                int i50 = i48 ^ 63;
                int i51 = ((i48 & 63) | i50) << 1;
                int i52 = -i50;
                int i53 = (i51 & i52) + (i51 | i52);
                f54364g = i53 % 128;
                int i54 = i53 % 2;
                return bbbVar3;
            case 6:
                bax baxVar5 = (bax) objArr[0];
                int i55 = f54363f;
                int i56 = (i55 ^ 3) + ((i55 & 3) << 1);
                f54364g = i56 % 128;
                int i57 = i56 % 2;
                int i58 = baxVar5.f54368d;
                if (i57 == 0) {
                    int i59 = 79 / 0;
                }
                return Integer.valueOf(i58);
            case 7:
                bax baxVar6 = (bax) objArr[0];
                int i60 = f54363f;
                int i61 = ((i60 | 86) << 1) - (i60 ^ 86);
                int i62 = (i61 ^ (-1)) + (i61 << 1);
                f54364g = i62 % 128;
                int i63 = i62 % 2;
                bbb bbbVar4 = baxVar6.f54366b;
                if (i63 == 0) {
                    throw null;
                }
                String str = (String) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar4}, 1692396741, -1692396740, System.identityHashCode(bbbVar4));
                int i64 = f54364g;
                int i65 = (-2) - ((((i64 | 24) << 1) - (i64 ^ 24)) ^ (-1));
                f54363f = i65 % 128;
                int i66 = i65 % 2;
                return str;
            case 8:
                bax baxVar7 = (bax) objArr[0];
                int i67 = f54364g;
                int i68 = ((i67 & (-8)) | ((~i67) & 7)) + ((i67 & 7) << 1);
                int i69 = i68 % 128;
                f54363f = i69;
                int i70 = i68 % 2;
                int i71 = baxVar7.f54367c;
                int i72 = (i69 | 13) << 1;
                int i73 = -(((~i69) & 13) | (i69 & (-14)));
                int i74 = (i72 & i73) + (i73 | i72);
                f54364g = i74 % 128;
                int i75 = i74 % 2;
                return Integer.valueOf(i71);
            case 9:
                int iIntValue5 = ((Number) objArr[0]).intValue();
                int i76 = f54364g;
                int i77 = ((i76 ^ 61) | (i76 & 61)) << 1;
                int i78 = -(((~i76) & 61) | (i76 & (-62)));
                int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                f54363f = i79 % 128;
                int i80 = i79 % 2;
                Map<Integer, bax> map = f54362e;
                if (i80 != 0) {
                    map.get((Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue5)}, 843618426, -843618423, iIntValue5));
                    throw null;
                }
                bax baxVar8 = map.get((Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue5)}, 843618426, -843618423, iIntValue5));
                int i81 = f54363f;
                int i82 = i81 & 95;
                int i83 = (i81 | 95) & (~i82);
                int i84 = i82 << 1;
                int i85 = ((i83 | i84) << 1) - (i83 ^ i84);
                f54364g = i85 % 128;
                int i86 = i85 % 2;
                return baxVar8;
            default:
                bax baxVar9 = (bax) objArr[0];
                int i87 = f54364g + 37;
                f54363f = i87 % 128;
                int i88 = i87 % 2;
                bbb bbbVar5 = baxVar9.f54366b;
                int iIntValue6 = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar5}, 1756018622, -1756018612, System.identityHashCode(bbbVar5))).intValue();
                int i89 = f54363f;
                int i90 = i89 & 23;
                int i91 = ((i89 | 23) & (~i90)) + (i90 << 1);
                f54364g = i91 % 128;
                int i92 = i91 % 2;
                return Integer.valueOf(iIntValue6);
        }
    }

    public static bax setX(int i10) {
        return (bax) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, 881387543, -881387534, i10);
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1235800220, 1235800228, System.identityHashCode(this))).intValue();
    }

    public final String setDividerPadding() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 1062868062, -1062868055, System.identityHashCode(this));
    }

    public final bbd setOnLongClickListener() {
        return (bbd) setOnFocusChangeListener(new Object[]{this}, 2012589847, -2012589846, System.identityHashCode(this));
    }

    public final int setY() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1153829548, 1153829554, System.identityHashCode(this))).intValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bax(int i10, int i11, aky akyVar) {
        String x4 = akyVar.setX();
        HashMap map = z2.f62263a;
        this(i10, i11, (adu) z2.a(new Object[]{x4}, 163333772, -163333772, (int) System.currentTimeMillis()));
    }

    public final bbb setX() {
        return (bbb) setOnFocusChangeListener(new Object[]{this}, 982865709, -982865704, System.identityHashCode(this));
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1645560145, 1645560148, System.identityHashCode(this))).intValue();
    }
}
