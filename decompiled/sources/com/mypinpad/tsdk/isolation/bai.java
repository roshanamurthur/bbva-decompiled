package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class bai implements Serializable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54313r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54314s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TreeMap f54315p0 = new TreeMap();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient long f54316q0;

    public bai(bax baxVar, long j10, byte[] bArr, byte[] bArr2) {
        this.f54316q0 = (1 << ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1235800220, 1235800228, System.identityHashCode(baxVar))).intValue()) - 1;
        for (long j11 = 0; j11 < j10; j11++) {
            setOnFocusChangeListener(new Object[]{this, baxVar, Long.valueOf(j11), bArr, bArr2}, -1297278001, 1297278004, System.identityHashCode(this));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54314s0;
        int i11 = ((i10 | 79) << 1) - (i10 ^ 79);
        f54313r0 = i11 % 128;
        int i12 = i11 % 2;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() == 0) {
            this.f54316q0 = 0L;
            int i13 = f54313r0;
            int i14 = i13 | 79;
            int i15 = ((i14 << 1) - (~(-((~(i13 & 79)) & i14)))) - 1;
            f54314s0 = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        int i17 = f54313r0;
        int i18 = (i17 ^ 41) + ((i17 & 41) << 1);
        f54314s0 = i18 % 128;
        int i19 = i18 % 2;
        this.f54316q0 = objectInputStream.readLong();
        int i20 = f54313r0;
        int i21 = (((i20 | 12) << 1) - (i20 ^ 12)) - 1;
        f54314s0 = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0451  */
    /* JADX WARN: Code duplicated, block: B:60:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0508  */
    /* JADX WARN: Code duplicated, block: B:67:0x0534  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        bae baeVar;
        TreeMap treeMap;
        Object y7;
        int i13;
        byte b10;
        char c10;
        int i14;
        int i15;
        int i16;
        int i17;
        char c11;
        Object y10;
        int i18 = ~i10;
        int i19 = ~i12;
        int i20 = ~(i18 | i19);
        int i21 = ~((~i11) | i12);
        int i22 = (((~(i10 | i19)) | (~(i12 | i18))) * 575) + (((~(i11 | i19)) | i21) * (-575)) + ((i20 | i21) * 1150) + (i11 * (-574)) + (i10 * (-574));
        if (i22 == 1) {
            bai baiVar = (bai) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            byte[] bArr = (byte[]) objArr[2];
            byte[] bArr2 = (byte[]) objArr[3];
            ban banVar = (ban) objArr[4];
            int i23 = f54314s0;
            int i24 = i23 ^ 71;
            int i25 = (i23 & 71) << 1;
            int i26 = (i24 & i25) + (i25 | i24);
            f54313r0 = i26 % 128;
            int i27 = i26 % 2;
            TreeMap treeMap2 = baiVar.f54315p0;
            Integer num = (Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue)}, 843618426, -843618423, iIntValue);
            bae baeVar2 = (bae) baiVar.f54315p0.get((Integer) beq.setY(new Object[]{Integer.valueOf(iIntValue)}, 843618426, -843618423, iIntValue));
            baeVar = (bae) treeMap2.put(num, (bae) bae.setCompoundDrawableTintBlendMode(new Object[]{baeVar2, bArr, bArr2, banVar}, -538498371, 538498376, System.identityHashCode(baeVar2)));
            int i28 = f54313r0 + 82;
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            f54314s0 = i29 % 128;
            if (i29 % 2 == 0) {
                throw null;
            }
        } else {
            if (i22 != 2) {
                if (i22 != 3) {
                    if (i22 == 4) {
                        bai baiVar2 = (bai) objArr[0];
                        bae baeVar3 = (bae) objArr[1];
                        int i30 = f54313r0;
                        int i31 = i30 & 101;
                        int i32 = (i30 ^ 101) | i31;
                        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                        f54314s0 = i33 % 128;
                        int i34 = i33 % 2;
                        TreeMap treeMap3 = baiVar2.f54315p0;
                        Object[] objArr2 = new Object[1];
                        if (i34 == 0) {
                            objArr2[0] = 1;
                            y10 = beq.setY(objArr2, 843618426, -843618423, 1);
                        } else {
                            objArr2[0] = 0;
                            y10 = beq.setY(objArr2, 843618426, -843618423, 0);
                        }
                        treeMap3.put((Integer) y10, baeVar3);
                        int i35 = f54314s0;
                        int i36 = ((i35 ^ 14) + ((i35 & 14) << 1)) - 1;
                        f54313r0 = i36 % 128;
                        if (i36 % 2 == 0) {
                            return null;
                        }
                        int i37 = 74 / 0;
                        return null;
                    }
                    if (i22 != 5) {
                        bai baiVar3 = (bai) objArr[0];
                        int i38 = f54314s0 + 29;
                        int i39 = i38 % 128;
                        f54313r0 = i39;
                        int i40 = i38 % 2;
                        long j10 = baiVar3.f54316q0;
                        int i41 = i39 & 25;
                        int i42 = i39 | 25;
                        int i43 = (i41 & i42) + (i42 | i41);
                        f54314s0 = i43 % 128;
                        if (i43 % 2 != 0) {
                            return Long.valueOf(j10);
                        }
                        throw null;
                    }
                    bai baiVar4 = (bai) objArr[0];
                    adu aduVar = (adu) objArr[1];
                    bai baiVar5 = new bai(baiVar4.f54316q0);
                    TreeMap treeMap4 = baiVar4.f54315p0;
                    int i44 = f54313r0;
                    int i45 = i44 & 35;
                    int i46 = -(-(i44 | 35));
                    int i47 = (i45 & i46) + (i46 | i45);
                    f54314s0 = i47 % 128;
                    int i48 = i47 % 2;
                    for (Integer num2 : treeMap4.keySet()) {
                        int i49 = f54314s0;
                        int i50 = (((i49 | 26) << 1) - (i49 ^ 26)) - 1;
                        f54313r0 = i50 % 128;
                        int i51 = i50 % 2;
                        bae baeVar4 = (bae) treeMap4.get(num2);
                        baiVar5.f54315p0.put(num2, (bae) bae.setCompoundDrawableTintBlendMode(new Object[]{baeVar4, aduVar}, 1636934983, -1636934981, System.identityHashCode(baeVar4)));
                        int i52 = f54313r0;
                        int i53 = (i52 & 123) + (i52 | 123);
                        f54314s0 = i53 % 128;
                        int i54 = i53 % 2;
                    }
                    int i55 = f54313r0;
                    int i56 = (i55 ^ 99) + ((i55 & 99) << 1);
                    f54314s0 = i56 % 128;
                    int i57 = i56 % 2;
                    return baiVar5;
                }
                bai baiVar6 = (bai) objArr[0];
                bax baxVar = (bax) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                byte[] bArr3 = (byte[]) objArr[3];
                byte[] bArr4 = (byte[]) objArr[4];
                bbb bbbVar = (bbb) bax.setOnFocusChangeListener(new Object[]{baxVar}, 982865709, -982865704, System.identityHashCode(baxVar));
                int iIntValue2 = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1335966603, -1335966598, System.identityHashCode(bbbVar))).intValue();
                long jLongValue2 = ((Long) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(jLongValue), Integer.valueOf(iIntValue2)}, -1482845641, 1482845646, iIntValue2)).longValue();
                int iIntValue3 = ((Integer) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(jLongValue), Integer.valueOf(iIntValue2)}, 281444677, -281444671, iIntValue2)).intValue();
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new ban.setCompoundDrawableTintBlendMode();
                ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{(ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode, Long.valueOf(jLongValue2)}, -1011452391, 1011452396, System.identityHashCode(setcompounddrawabletintblendmode))), Integer.valueOf(iIntValue3)}, 391211609, -391211603, iIntValue3);
                ban banVar2 = (ban) ((bar) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode2}, 1084061586, -1084061582, System.identityHashCode(setcompounddrawabletintblendmode2)));
                int i58 = 1 << iIntValue2;
                int iIdentityHashCode = System.identityHashCode(baiVar6);
                int i59 = (-504) - (~(i58 * 503));
                int i60 = ~i58;
                int i61 = -(-(((i60 ^ i58) | (i60 & i58)) * (-502)));
                int i62 = i59 | i61;
                int i63 = i62 << 1;
                int i64 = -((~(i61 & i59)) & i62);
                int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                int i66 = ~(i60 & (i60 | i58));
                int i67 = ~iIdentityHashCode;
                int i68 = i67 & (i67 | iIdentityHashCode);
                int i69 = ~i68;
                int i70 = i66 ^ i69;
                int i71 = i69 & i66;
                int i72 = (i70 & i71) | (i70 ^ i71);
                int i73 = (-1) ^ i58;
                int i74 = (i73 ^ i58) | (i73 & i58);
                int i75 = i74 ^ iIdentityHashCode;
                int i76 = i74 & iIdentityHashCode;
                int i77 = ~(i75 | i76);
                int i78 = i72 & i77;
                int i79 = (i72 | i77) & (~i78);
                int i80 = ((i79 & i78) | (i79 ^ i78)) * (-502);
                int i81 = ((((~i80) & i65) | ((~i65) & i80)) - (~(-(-((i80 & i65) << 1))))) - 1;
                int i82 = ~((i68 ^ i58) | (i68 & i58));
                int i83 = ~((i75 & i76) | (i75 ^ i76));
                int i84 = i82 & i83;
                int i85 = (i82 | i83) & (~i84);
                int i86 = (i81 - (~(-(~(((i85 & i84) | (i85 ^ i84)) * 502))))) - 1;
                if (iIntValue3 < (i86 ^ (-1)) + (i86 << 1)) {
                    int i87 = f54314s0;
                    int i88 = i87 ^ 83;
                    int i89 = ((((i87 & 83) | i88) << 1) - (~(-i88))) - 1;
                    f54313r0 = i89 % 128;
                    int i90 = i89 % 2;
                    if (((bae) setOnFocusChangeListener(new Object[]{baiVar6}, -1896207877, 1896207879, System.identityHashCode(baiVar6))) != null) {
                        int i91 = f54314s0 + 83;
                        f54313r0 = i91 % 128;
                        i16 = 2;
                        int i92 = i91 % 2;
                        if (iIntValue3 != 0) {
                            c11 = 2;
                            i17 = 1;
                        }
                        Object[] objArr3 = new Object[5];
                        objArr3[0] = baiVar6;
                        objArr3[i17] = 0;
                        objArr3[c11] = bArr3;
                        objArr3[3] = bArr4;
                        objArr3[4] = banVar2;
                        int i93 = f54314s0;
                        int i94 = (((i93 | 28) << i17) - (i93 ^ 28)) - i17;
                        f54313r0 = i94 % 128;
                        i13 = 2;
                        int i95 = i94 % 2;
                    } else {
                        i16 = 2;
                    }
                    bae baeVar5 = new bae(bbbVar, bArr3, bArr4, banVar2);
                    Object[] objArr4 = new Object[i16];
                    objArr4[0] = baiVar6;
                    i17 = 1;
                    objArr4[1] = baeVar5;
                    setOnFocusChangeListener(objArr4, 1973674575, -1973674571, System.identityHashCode(baiVar6));
                    int i96 = f54314s0 + 60;
                    int i97 = (i96 ^ (-1)) + (i96 << 1);
                    f54313r0 = i97 % 128;
                    c11 = 2;
                    int i98 = i97 % 2;
                    Object[] objArr5 = new Object[5];
                    objArr5[0] = baiVar6;
                    objArr5[i17] = 0;
                    objArr5[c11] = bArr3;
                    objArr5[3] = bArr4;
                    objArr5[4] = banVar2;
                    int i99 = f54314s0;
                    int i910 = (((i99 | 28) << i17) - (i99 ^ 28)) - i17;
                    f54313r0 = i910 % 128;
                    i13 = 2;
                    int i911 = i910 % 2;
                } else {
                    i13 = 2;
                }
                int i100 = f54313r0 + 43;
                f54314s0 = i100 % 128;
                int i101 = i100 % i13;
                int i102 = 1;
                while (i102 < ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1153829548, 1153829554, System.identityHashCode(baxVar))).intValue()) {
                    int iIntValue4 = ((Integer) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(jLongValue2), Integer.valueOf(iIntValue2)}, 281444677, -281444671, iIntValue2)).intValue();
                    jLongValue2 = ((Long) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(jLongValue2), Integer.valueOf(iIntValue2)}, -1482845641, 1482845646, iIntValue2)).longValue();
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{new ban.setCompoundDrawableTintBlendMode(), Integer.valueOf(i102)}, 575278009, -575278009, i102));
                    ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{(ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode3, Long.valueOf(jLongValue2)}, -1011452391, 1011452396, System.identityHashCode(setcompounddrawabletintblendmode3))), Integer.valueOf(iIntValue4)}, 391211609, -391211603, iIntValue4);
                    ban banVar3 = (ban) ((bar) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode4}, 1084061586, -1084061582, System.identityHashCode(setcompounddrawabletintblendmode4)));
                    if (baiVar6.f54315p0.get(Integer.valueOf(i102)) != null) {
                        int i103 = f54313r0;
                        int i104 = (i103 ^ 122) + ((i103 & 122) << 1);
                        int i105 = (i104 ^ (-1)) + (i104 << 1);
                        f54314s0 = i105 % 128;
                        if (i105 % 2 == 0) {
                            ((Boolean) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(jLongValue), Integer.valueOf(iIntValue2), Integer.valueOf(i102)}, -1485478524, 1485478535, iIntValue2)).booleanValue();
                            throw null;
                        }
                        if (((Boolean) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(jLongValue), Integer.valueOf(iIntValue2), Integer.valueOf(i102)}, -1485478524, 1485478535, iIntValue2)).booleanValue()) {
                            baiVar6.f54315p0.put(Integer.valueOf(i102), new bae(bbbVar, bArr3, bArr4, banVar3));
                            int i106 = f54314s0;
                            int i107 = ((i106 ^ 81) | (i106 & 81)) << 1;
                            int i108 = -(((~i106) & 81) | (i106 & (-82)));
                            int i109 = (i107 & i108) + (i108 | i107);
                            f54313r0 = i109 % 128;
                            int i110 = i109 % 2;
                        }
                    } else {
                        baiVar6.f54315p0.put(Integer.valueOf(i102), new bae(bbbVar, bArr3, bArr4, banVar3));
                        int i1010 = f54314s0;
                        int i1011 = ((i1010 ^ 81) | (i1010 & 81)) << 1;
                        int i1012 = -(((~i1010) & 81) | (i1010 & (-82)));
                        int i1013 = (i1011 & i1012) + (i1012 | i1011);
                        f54313r0 = i1013 % 128;
                        int i111 = i1013 % 2;
                    }
                    if (iIntValue4 < i58 - 1) {
                        int i112 = f54314s0;
                        int i113 = (i112 & (-102)) | ((~i112) & 101);
                        int i114 = -(-((i112 & 101) << 1));
                        int i115 = (i113 & i114) + (i114 | i113);
                        f54313r0 = i115 % 128;
                        if (i115 % 2 != 0) {
                            int i116 = 37 / 0;
                            if (((Boolean) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(jLongValue), Integer.valueOf(iIntValue2), Integer.valueOf(i102)}, 1596777573, -1596777559, iIntValue2)).booleanValue()) {
                                i14 = 1;
                                int i117 = f54314s0;
                                int i118 = i117 ^ 87;
                                int i119 = (i117 & 87) << i14;
                                i15 = (i118 & i119) + (i119 | i118);
                                f54313r0 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i120 = 43 / 0;
                                    b10 = -1410157047;
                                    c10 = 18936;
                                } else {
                                    Object[] objArr6 = {baiVar6, Integer.valueOf(i102), bArr3, bArr4, banVar3};
                                    b10 = -1410157047;
                                    c10 = 18936;
                                }
                                int i121 = f54314s0 + 41;
                                f54313r0 = i121 % 128;
                                int i122 = i121 % 2;
                            } else {
                                b10 = -1410157047;
                                c10 = 18936;
                            }
                        } else {
                            i14 = 1;
                            if (!((Boolean) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(jLongValue), Integer.valueOf(iIntValue2), Integer.valueOf(i102)}, 1596777573, -1596777559, iIntValue2)).booleanValue()) {
                                b10 = -1410157047;
                                c10 = 18936;
                            } else {
                                int i1110 = f54314s0;
                                int i1111 = i1110 ^ 87;
                                int i1112 = (i1110 & 87) << i14;
                                i15 = (i1111 & i1112) + (i1112 | i1111);
                                f54313r0 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i123 = 43 / 0;
                                    b10 = -1410157047;
                                    c10 = 18936;
                                } else {
                                    Object[] objArr7 = {baiVar6, Integer.valueOf(i102), bArr3, bArr4, banVar3};
                                    b10 = -1410157047;
                                    c10 = 18936;
                                }
                                int i124 = f54314s0 + 41;
                                f54313r0 = i124 % 128;
                                int i125 = i124 % 2;
                            }
                        }
                    } else {
                        b10 = -1410157047;
                        c10 = 18936;
                    }
                    i102 = (i102 | 1) + (i102 & 1);
                    int i126 = f54314s0;
                    int i127 = ((i126 | 35) << 1) - (i126 ^ 35);
                    f54313r0 = i127 % 128;
                    int i128 = i127 % 2;
                }
                int i129 = f54314s0;
                int i130 = (i129 & (-68)) | ((~i129) & 67);
                int i131 = (i129 & 67) << 1;
                int i132 = (i130 & i131) + (i131 | i130);
                f54313r0 = i132 % 128;
                if (i132 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            bai baiVar7 = (bai) objArr[0];
            int i133 = f54314s0;
            int i134 = i133 ^ 73;
            int i135 = (i133 & 73) << 1;
            int i136 = (i134 ^ i135) + ((i135 & i134) << 1);
            f54313r0 = i136 % 128;
            if (i136 % 2 != 0) {
                treeMap = baiVar7.f54315p0;
                y7 = beq.setY(new Object[]{1}, 843618426, -843618423, 1);
            } else {
                treeMap = baiVar7.f54315p0;
                y7 = beq.setY(new Object[]{0}, 843618426, -843618423, 0);
            }
            baeVar = (bae) treeMap.get((Integer) y7);
        }
        return baeVar;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54313r0;
        int i11 = i10 & 21;
        int i12 = i11 + ((i10 ^ 21) | i11);
        f54314s0 = i12 % 128;
        int i13 = i12 % 2;
        objectOutputStream.defaultWriteObject();
        if (i13 != 0) {
            objectOutputStream.writeLong(this.f54316q0);
        } else {
            objectOutputStream.writeLong(this.f54316q0);
            throw null;
        }
    }

    public final long setDividerPadding() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, -1728564895, 1728564895, System.identityHashCode(this))).longValue();
    }

    public final bai setX(adu aduVar) {
        return (bai) setOnFocusChangeListener(new Object[]{this, aduVar}, -881598749, 881598754, System.identityHashCode(this));
    }

    public bai(bai baiVar, long j10) {
        for (Integer num : baiVar.f54315p0.keySet()) {
            this.f54315p0.put(num, new bae((bae) baiVar.f54315p0.get(num)));
        }
        this.f54316q0 = j10;
    }

    public bai(long j10) {
        this.f54316q0 = j10;
    }
}
