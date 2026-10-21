package com.mypinpad.tsdk.isolation;

import androidx.databinding.f;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aqp extends apk.setDividerPadding {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53608c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53609d = 1;
    public static final BigInteger setLayoutAnimation = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"}, -666540625, 666540626, (int) System.currentTimeMillis()));
    protected int[] setOnDragListener;

    static {
        int i10 = f53608c;
        int i11 = (i10 & 55) + (i10 | 55);
        f53609d = i11 % 128;
        int i12 = i11 % 2;
    }

    public aqp(int[] iArr) {
        this.setOnDragListener = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0853  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        aqp aqpVar;
        int i13 = ~i11;
        int i14 = ~i12;
        switch ((((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46)) {
            case 1:
                aqp aqpVar2 = (aqp) objArr[0];
                int i15 = f53609d + 77;
                f53608c = i15 % 128;
                if (i15 % 2 != 0) {
                    ((Boolean) auz.setDividerPadding(new Object[]{aqpVar2.setOnDragListener}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                int[] iArr = aqpVar2.setOnDragListener;
                if (((Boolean) auz.setDividerPadding(new Object[]{iArr}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue()) {
                    int i16 = f53608c;
                    int i17 = i16 & 47;
                    int i18 = (i17 - (~(-(-((i16 ^ 47) | i17))))) - 1;
                    f53609d = i18 % 128;
                    int i19 = i18 % 2;
                    aqpVar = aqpVar2;
                } else {
                    int i20 = f53608c;
                    int i21 = i20 ^ 109;
                    int i22 = (i20 & 109) << 1;
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    f53609d = i23 % 128;
                    if (i23 % 2 == 0) {
                        ((Boolean) auz.setDividerPadding(new Object[]{iArr}, -1357517306, 1357517307, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) auz.setDividerPadding(new Object[]{iArr}, -1357517306, 1357517307, (int) System.currentTimeMillis())).booleanValue()) {
                        int i110 = f53608c;
                        int i111 = i110 & 47;
                        int i112 = (i111 - (~(-(-((i110 ^ 47) | i111))))) - 1;
                        f53609d = i112 % 128;
                        int i113 = i112 % 2;
                    } else {
                        int[] iArr2 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr2, iArr, iArr2}, -257166289, 257166290, (int) System.currentTimeMillis());
                        int[] iArr3 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr2, iArr3}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr3, iArr, iArr3}, -257166289, 257166290, (int) System.currentTimeMillis());
                        int[] iArr4 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr3, iArr4}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        int[] iArr5 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, 3, iArr5}, 901392631, -901392616, 3);
                        aql.setOnFocusChangeListener(new Object[]{iArr5, iArr3, iArr5}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr5, 7, iArr4}, 901392631, -901392616, 7);
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr5, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, 3, iArr5}, 901392631, -901392616, 3);
                        aql.setOnFocusChangeListener(new Object[]{iArr5, iArr3, iArr5}, -257166289, 257166290, (int) System.currentTimeMillis());
                        int[] iArr6 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr5, 14, iArr6}, 901392631, -901392616, 14);
                        aql.setOnFocusChangeListener(new Object[]{iArr6, iArr4, iArr6}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr6, 31, iArr4}, 901392631, -901392616, 31);
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr6, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, 62, iArr6}, 901392631, -901392616, 62);
                        aql.setOnFocusChangeListener(new Object[]{iArr6, iArr4, iArr6}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr6, 3, iArr4}, 901392631, -901392616, 3);
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr3, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, 18, iArr4}, 901392631, -901392616, 18);
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr5, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, 2, iArr4}, 901392631, -901392616, 2);
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, 3, iArr4}, 901392631, -901392616, 3);
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr2, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, 6, iArr4}, 901392631, -901392616, 6);
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr3, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, 2, iArr4}, 901392631, -901392616, 2);
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr, iArr4}, -257166289, 257166290, (int) System.currentTimeMillis());
                        aql.setOnFocusChangeListener(new Object[]{iArr4, iArr2}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                        if (((Boolean) auz.setDividerPadding(new Object[]{iArr, iArr2}, -1508801311, 1508801320, (int) System.currentTimeMillis())).booleanValue()) {
                            aqpVar2 = new aqp(iArr4);
                            int i24 = f53608c;
                            int i25 = (i24 | 47) << 1;
                            int i26 = -(((~i24) & 47) | (i24 & (-48)));
                            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                            f53609d = i27 % 128;
                            if (i27 % 2 == 0) {
                                int i28 = 64 / 0;
                            }
                        } else {
                            int i29 = f53609d;
                            int i30 = (((i29 | 102) << 1) - (i29 ^ 102)) - 1;
                            f53608c = i30 % 128;
                            if (i30 % 2 != 0) {
                                int i31 = 78 / 0;
                            }
                            aqpVar = null;
                        }
                    }
                    aqpVar = aqpVar2;
                }
                return aqpVar;
            case 2:
                aqp aqpVar3 = (aqp) objArr[0];
                int i32 = f53609d;
                int i33 = (i32 & 36) + (i32 | 36);
                int i34 = (i33 ^ (-1)) + (i33 << 1);
                f53608c = i34 % 128;
                int i35 = i34 % 2;
                int[] iArr7 = aqpVar3.setOnDragListener;
                if (i35 != 0) {
                    ((Boolean) auz.setDividerPadding(new Object[]{iArr7}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                boolean zBooleanValue = ((Boolean) auz.setDividerPadding(new Object[]{iArr7}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue();
                int i36 = f53609d + 37;
                f53608c = i36 % 128;
                int i37 = i36 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 3:
                aqp aqpVar4 = (aqp) objArr[0];
                int i38 = f53608c;
                int i39 = (i38 & (-108)) | ((~i38) & 107);
                int i40 = -(-((i38 & 107) << 1));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                f53609d = i41 % 128;
                int i42 = i41 % 2;
                int[] iArr8 = aqpVar4.setOnDragListener;
                if (i42 != 0) {
                    return Boolean.valueOf(((Boolean) auz.setDividerPadding(new Object[]{iArr8}, -1357517306, 1357517307, (int) System.currentTimeMillis())).booleanValue());
                }
                ((Boolean) auz.setDividerPadding(new Object[]{iArr8}, -1357517306, 1357517307, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            case 4:
                int i43 = f53609d;
                int i44 = (i43 & (-96)) | ((~i43) & 95);
                int i45 = (i43 & 95) << 1;
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                f53608c = i46 % 128;
                int i47 = i46 % 2;
                int iBitLength = setLayoutAnimation.bitLength();
                int i48 = f53609d;
                int i49 = ((i48 | 81) << 1) - (i48 ^ 81);
                f53608c = i49 % 128;
                int i50 = i49 % 2;
                return Integer.valueOf(iBitLength);
            case 5:
                aqp aqpVar5 = (aqp) objArr[0];
                apk apkVar = (apk) objArr[1];
                int[] iArr9 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqp aqpVarE = f.e(new Object[]{aqpVar5.setOnDragListener, ((aqp) apkVar).setOnDragListener, iArr9}, -491159146, 491159155, (int) System.currentTimeMillis(), iArr9);
                int i51 = f53609d;
                int i52 = ((i51 & 38) + (i51 | 38)) - 1;
                f53608c = i52 % 128;
                if (i52 % 2 == 0) {
                    return aqpVarE;
                }
                int i53 = 25 / 0;
                return aqpVarE;
            case 6:
                aqp aqpVar6 = (aqp) objArr[0];
                apk apkVar2 = (apk) objArr[1];
                int[] iArr10 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqp aqpVarE2 = f.e(new Object[]{aqpVar6.setOnDragListener, ((aqp) apkVar2).setOnDragListener, iArr10}, -257166289, 257166290, (int) System.currentTimeMillis(), iArr10);
                int i54 = f53608c;
                int i55 = ((i54 | 59) << 1) - (i54 ^ 59);
                f53609d = i55 % 128;
                int i56 = i55 % 2;
                return aqpVarE2;
            case 7:
                aqp aqpVar7 = (aqp) objArr[0];
                int i57 = f53609d + 11;
                f53608c = i57 % 128;
                int i58 = i57 % 2;
                int iHashCode = setLayoutAnimation.hashCode();
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{aqpVar7.setOnDragListener, 5}, 1613127163, -1613127143, 5)).intValue();
                int i59 = (iIntValue | iHashCode) & (~(iHashCode & iIntValue));
                int i60 = f53608c;
                int i61 = (i60 & 109) + (i60 | 109);
                f53609d = i61 % 128;
                if (i61 % 2 != 0) {
                    return Integer.valueOf(i59);
                }
                throw null;
            case 8:
                aqp aqpVar8 = (aqp) objArr[0];
                int[] iArr11 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqp aqpVarE3 = f.e(new Object[]{aqpVar8.setOnDragListener, iArr11}, -2117483957, 2117483969, (int) System.currentTimeMillis(), iArr11);
                int i62 = f53609d;
                int i63 = (i62 & (-68)) | ((~i62) & 67);
                int i64 = -(-((i62 & 67) << 1));
                int i65 = (i63 & i64) + (i64 | i63);
                f53608c = i65 % 128;
                if (i65 % 2 == 0) {
                    return aqpVarE3;
                }
                int i66 = 58 / 0;
                return aqpVarE3;
            case 9:
                aqp aqpVar9 = (aqp) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                int[] iArr12 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqp aqpVarE4 = f.e(new Object[]{aqpVar9.setOnDragListener, ((aqp) apkVar3).setOnDragListener, iArr12}, 123777680, -123777669, (int) System.currentTimeMillis(), iArr12);
                int i67 = f53608c;
                int i68 = (i67 & 67) + (i67 | 67);
                f53609d = i68 % 128;
                int i69 = i68 % 2;
                return aqpVarE4;
            case 10:
                aqp aqpVar10 = (aqp) objArr[0];
                apk apkVar4 = (apk) objArr[1];
                int[] iArr13 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aql.setOnFocusChangeListener(new Object[]{((aqp) apkVar4).setOnDragListener, iArr13}, -172458355, 172458365, (int) System.currentTimeMillis());
                aqp aqpVarE5 = f.e(new Object[]{iArr13, aqpVar10.setOnDragListener, iArr13}, -257166289, 257166290, (int) System.currentTimeMillis(), iArr13);
                int i70 = f53608c;
                int i71 = (-2) - (((i70 & 68) + (i70 | 68)) ^ (-1));
                f53609d = i71 % 128;
                if (i71 % 2 != 0) {
                    return aqpVarE5;
                }
                int i72 = 31 / 0;
                return aqpVarE5;
            case 11:
                aqp aqpVar11 = (aqp) objArr[0];
                int i73 = f53608c;
                int i74 = (i73 ^ 3) + ((i73 & 3) << 1);
                f53609d = i74 % 128;
                int i75 = i74 % 2;
                int[] iArr14 = aqpVar11.setOnDragListener;
                if (i75 != 0 ? ((Integer) auz.setDividerPadding(new Object[]{iArr14}, 1594439211, -1594439208, (int) System.currentTimeMillis())).intValue() != 1 : ((Integer) auz.setDividerPadding(new Object[]{iArr14}, 1594439211, -1594439208, (int) System.currentTimeMillis())).intValue() != 0) {
                    int i76 = (-2) - ((f53608c + 12) ^ (-1));
                    f53609d = i76 % 128;
                    int i77 = i76 % 2;
                    return Boolean.FALSE;
                }
                int i78 = f53608c + 117;
                f53609d = i78 % 128;
                if (i78 % 2 == 0) {
                    int i79 = 70 / 0;
                }
                return Boolean.TRUE;
            case 12:
                aqp aqpVar12 = (aqp) objArr[0];
                int[] iArr15 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqp aqpVarE6 = f.e(new Object[]{aqpVar12.setOnDragListener, iArr15}, -172458355, 172458365, (int) System.currentTimeMillis(), iArr15);
                int i80 = f53608c;
                int i81 = (i80 & (-14)) | ((~i80) & 13);
                int i82 = (i80 & 13) << 1;
                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                f53609d = i83 % 128;
                int i84 = i83 % 2;
                return aqpVarE6;
            case 13:
                aqp aqpVar13 = (aqp) objArr[0];
                Object obj = objArr[1];
                int i85 = f53608c;
                int i86 = (i85 ^ 95) + ((i85 & 95) << 1);
                int i87 = i86 % 128;
                f53609d = i87;
                int i88 = i86 % 2;
                if (obj == aqpVar13) {
                    int i89 = ((((i87 ^ 25) | (i87 & 25)) << 1) - (~(-((i87 & (-26)) | ((~i87) & 25))))) - 1;
                    f53608c = i89 % 128;
                    return Boolean.valueOf(i89 % 2 == 0);
                }
                if (obj instanceof aqp) {
                    boolean zBooleanValue2 = ((Boolean) auz.setDividerPadding(new Object[]{aqpVar13.setOnDragListener, ((aqp) obj).setOnDragListener}, -1508801311, 1508801320, (int) System.currentTimeMillis())).booleanValue();
                    int i90 = f53608c;
                    int i91 = i90 & 9;
                    int i92 = ((i90 ^ 9) | i91) << 1;
                    int i93 = -((i90 | 9) & (~i91));
                    int i94 = (i92 & i93) + (i93 | i92);
                    f53609d = i94 % 128;
                    if (i94 % 2 != 0) {
                        return Boolean.valueOf(zBooleanValue2);
                    }
                    throw null;
                }
                int i95 = ((i87 ^ 113) | (i87 & 113)) << 1;
                int i96 = -((i87 & (-114)) | ((~i87) & 113));
                int i97 = (i95 & i96) + (i95 | i96);
                int i98 = i97 % 128;
                f53608c = i98;
                int i99 = i97 % 2;
                int i100 = i98 & 43;
                int i101 = (i98 ^ 43) | i100;
                int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
                f53609d = i102 % 128;
                int i103 = i102 % 2;
                return Boolean.FALSE;
            case 14:
                aqp aqpVar14 = (aqp) objArr[0];
                int[] iArr16 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqp aqpVarE7 = f.e(new Object[]{aqpVar14.setOnDragListener, iArr16}, -1629487094, 1629487098, (int) System.currentTimeMillis(), iArr16);
                int i104 = f53609d;
                int i105 = ((i104 ^ 102) + ((i104 & 102) << 1)) - 1;
                f53608c = i105 % 128;
                int i106 = i105 % 2;
                return aqpVarE7;
            case 15:
                aqp aqpVar15 = (aqp) objArr[0];
                int[] iArr17 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqp aqpVarE8 = f.e(new Object[]{aqpVar15.setOnDragListener, iArr17}, -1319149099, 1319149099, (int) System.currentTimeMillis(), iArr17);
                int i107 = f53609d;
                int i108 = (((i107 ^ 95) | (i107 & 95)) << 1) - (((~i107) & 95) | (i107 & (-96)));
                f53608c = i108 % 128;
                if (i108 % 2 == 0) {
                    return aqpVarE8;
                }
                int i109 = 28 / 0;
                return aqpVarE8;
            default:
                aqp aqpVar16 = (aqp) objArr[0];
                int i114 = f53609d;
                int i115 = ((i114 | 15) << 1) - (i114 ^ 15);
                f53608c = i115 % 128;
                int i116 = i115 % 2;
                BigInteger bigInteger = (BigInteger) auz.setDividerPadding(new Object[]{aqpVar16.setOnDragListener}, -1221353937, 1221353950, (int) System.currentTimeMillis());
                int i117 = f53608c;
                int i118 = i117 & 79;
                int i119 = ((i117 ^ 79) | i118) << 1;
                int i120 = -((i117 | 79) & (~i118));
                int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
                f53609d = i121 % 128;
                if (i121 % 2 != 0) {
                    return bigInteger;
                }
                throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 207182750, -207182737, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setX(new Object[]{this}, 873111222, -873111219, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -918821689, 918821696, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setX(new Object[]{this}, 222596967, -222596956, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, -1065408970, 1065408976, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, -730605973, 730605983, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setX(new Object[]{this}, 1988268727, -1988268715, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, -1329507220, 1329507222, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, 861974927, -861974918, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setX(new Object[]{this}, 1112651401, -1112651400, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setX(new Object[]{this}, -1940401352, 1940401360, System.identityHashCode(this));
    }

    public aqp() {
        this.setOnDragListener = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setX(new Object[]{this}, 810948484, -810948484, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setX(new Object[]{this}, -1298928226, 1298928241, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -1676403468, 1676403472, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, -1244927786, 1244927791, System.identityHashCode(this));
    }

    public aqp(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setLayoutAnimation) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.setOnDragListener = (int[]) aql.setOnFocusChangeListener(new Object[]{bigInteger}, 229114002, -229114000, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setX(new Object[]{this}, -390482857, 390482871, System.identityHashCode(this));
    }
}
