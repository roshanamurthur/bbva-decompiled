package com.mypinpad.tsdk.isolation;

import java.util.Hashtable;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class amj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Hashtable f53208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53209i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f53210j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aky f53211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public beu f53214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public beu f53215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f53216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f53217g;

    static {
        Hashtable hashtable = new Hashtable();
        f53208h = hashtable;
        hashtable.put("GOST3411", (Integer) beq.setY(new Object[]{32}, 843618426, -843618423, 32));
        hashtable.put("MD2", (Integer) beq.setY(new Object[]{16}, 843618426, -843618423, 16));
        hashtable.put("MD4", (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        hashtable.put("MD5", (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        hashtable.put("RIPEMD128", (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        hashtable.put("RIPEMD160", (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        hashtable.put("SHA-256", (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, (Integer) beq.setY(new Object[]{128}, 843618426, -843618423, 128));
        hashtable.put("SHA-512", (Integer) beq.setY(new Object[]{128}, 843618426, -843618423, 128));
        hashtable.put("Tiger", (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        hashtable.put("Whirlpool", (Integer) beq.setY(new Object[]{64}, 843618426, -843618423, 64));
        int i10 = f53210j;
        int i11 = (i10 | 119) << 1;
        int i12 = -(i10 ^ 119);
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53209i = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public amj(aky akyVar) {
        int iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{akyVar}, 781600188, -781600184, (int) System.currentTimeMillis())).intValue();
        this.f53211a = akyVar;
        int y7 = akyVar.setY();
        this.f53212b = y7;
        this.f53213c = iIntValue;
        this.f53216f = new byte[iIntValue];
        int i10 = y7 * 284;
        int i11 = iIntValue * (-282);
        int i12 = ((((i10 ^ i11) | (i10 & i11)) << 1) - (~(-(((~i10) & i11) | ((~i11) & i10))))) - 1;
        int i13 = ~y7;
        int i14 = ~iIntValue;
        int i15 = (i13 & i14) | ((~i13) & iIntValue);
        int i16 = i13 & iIntValue;
        int i17 = ~((i15 & i16) | (i15 ^ i16));
        int i18 = i13 & (i13 | y7);
        int i19 = i18 & iIntValue;
        int i20 = (~i19) & (i18 | iIntValue);
        int i21 = ~((i19 & i20) | (i20 ^ i19));
        int i22 = i17 ^ i21;
        int i23 = i17 & i21;
        int i24 = ((i23 & i22) | (i22 ^ i23)) * (-283);
        int i25 = (i12 ^ i24) + ((i12 & i24) << 1);
        int i26 = (y7 & i14) | (i14 ^ y7);
        int i27 = ~i26;
        int i28 = -(-(((i26 | i27) & i27) * 283));
        int i29 = i25 ^ i28;
        int i30 = -(-((i28 & i25) << 1));
        int i31 = (i29 & i30) + (i30 | i29);
        int i32 = (i18 ^ i14) | (i18 & i14);
        int i33 = (i32 & iIntValue) | (i32 & i14) | ((~i32) & iIntValue);
        int i34 = ~i33;
        int i35 = -(~(((i33 | i34) & i34) * 283));
        this.f53217g = new byte[(-2) - (((i31 & i35) + (i35 | i31)) ^ (-1))];
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Integer numValueOf;
        int dividerPadding;
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = ((~(i15 | i11)) * (-1182)) + (i11 * (-590)) + (i10 * 592);
        int i17 = ~i11;
        int i18 = ((i12 | i15 | i17) * 591) + (((~(i10 | i11)) | (~(i15 | i17 | (~i12)))) * (-591)) + i16;
        int i19 = 0;
        switch (i18) {
            case 1:
                amj amjVar = (amj) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i20 = f53210j;
                int i21 = ((i20 ^ 57) | (i20 & 57)) << 1;
                int i22 = -(((~i20) & 57) | (i20 & (-58)));
                int i23 = (i21 & i22) + (i22 | i21);
                f53209i = i23 % 128;
                int i24 = i23 % 2;
                aky akyVar = amjVar.f53211a;
                byte[] bArr2 = amjVar.f53217g;
                int i25 = amjVar.f53213c;
                akyVar.setCompoundDrawableTintBlendMode(bArr2, i25);
                beu beuVar = amjVar.f53215e;
                aky akyVar2 = amjVar.f53211a;
                if (beuVar != null) {
                    int i26 = f53209i;
                    int i27 = i26 | 37;
                    int i28 = ((i27 << 1) - (~(-((~(i26 & 37)) & i27)))) - 1;
                    f53210j = i28 % 128;
                    int i29 = i28 % 2;
                    ((beu) akyVar2).setX(beuVar);
                    akyVar2.setCompoundDrawableTintBlendMode(bArr2, i25, akyVar2.setY());
                    if (i29 == 0) {
                        int i30 = 80 / 0;
                    }
                    int i31 = f53209i + 31;
                    f53210j = i31 % 128;
                    int i32 = i31 % 2;
                } else {
                    akyVar2.setCompoundDrawableTintBlendMode(bArr2, 0, bArr2.length);
                    int i33 = f53209i;
                    int i34 = i33 & 75;
                    int i35 = -(-((i33 ^ 75) | i34));
                    int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                    f53210j = i36 % 128;
                    int i37 = i36 % 2;
                }
                int compoundDrawableTintBlendMode = akyVar2.setCompoundDrawableTintBlendMode(bArr, 0);
                int i38 = f53210j;
                int i39 = i38 ^ 117;
                int i40 = -(-((i38 & 117) << 1));
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                f53209i = i41 % 128;
                int i42 = i41 % 2;
                while (i25 < bArr2.length) {
                    int i43 = f53209i;
                    int i44 = i43 + 58;
                    int i45 = (i44 ^ (-1)) + (i44 << 1);
                    f53210j = i45 % 128;
                    int i46 = i45 % 2;
                    bArr2[i25] = 0;
                    int i47 = i25 & 1;
                    i25 = ((i25 ^ 1) | i47) + i47;
                    int i48 = i43 + 15;
                    f53210j = i48 % 128;
                    int i49 = i48 % 2;
                }
                beu beuVar2 = amjVar.f53214d;
                if (beuVar2 != null) {
                    int i50 = f53210j;
                    int i51 = i50 & 7;
                    int i52 = (i51 - (~((i50 ^ 7) | i51))) - 1;
                    f53209i = i52 % 128;
                    int i53 = i52 % 2;
                    ((beu) akyVar2).setX(beuVar2);
                    int i54 = f53210j;
                    int i55 = (i54 & 25) + (i54 | 25);
                    f53209i = i55 % 128;
                    int i56 = i55 % 2;
                } else {
                    byte[] bArr3 = amjVar.f53216f;
                    akyVar2.setCompoundDrawableTintBlendMode(bArr3, 0, bArr3.length);
                    System.identityHashCode(amjVar);
                    System.identityHashCode(amjVar);
                }
                int i57 = f53210j;
                int i58 = i57 & 45;
                int i59 = i58 + ((i57 ^ 45) | i58);
                f53209i = i59 % 128;
                if (i59 % 2 != 0) {
                    int i60 = 2 / 0;
                }
                numValueOf = Integer.valueOf(compoundDrawableTintBlendMode);
                break;
            case 2:
                amj amjVar2 = (amj) objArr[0];
                int i61 = f53210j + 37;
                f53209i = i61 % 128;
                int i62 = i61 % 2;
                int i63 = amjVar2.f53212b;
                if (i62 != 0) {
                    int i64 = 94 / 0;
                }
                return Integer.valueOf(i63);
            case 3:
                amj amjVar3 = (amj) objArr[0];
                byte bByteValue = ((Byte) objArr[1]).byteValue();
                int i65 = f53210j;
                int i66 = i65 ^ 85;
                int i67 = (((85 & i65) | i66) << 1) - i66;
                f53209i = i67 % 128;
                if (i67 % 2 != 0) {
                    amjVar3.f53211a.setX(bByteValue);
                    throw null;
                }
                amjVar3.f53211a.setX(bByteValue);
                int i68 = f53209i;
                int i69 = i68 ^ 103;
                int i70 = -(-((i68 & 103) << 1));
                int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                f53210j = i71 % 128;
                if (i71 % 2 != 0) {
                    return null;
                }
                int i72 = 61 / 0;
                return null;
            case 4:
                aky akyVar3 = (aky) objArr[0];
                int i73 = f53209i;
                int i74 = i73 & 33;
                int i75 = -(-(i73 | 33));
                int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                f53210j = i76 % 128;
                if (i76 % 2 == 0) {
                    boolean z10 = akyVar3 instanceof akv;
                    throw null;
                }
                if (!(akyVar3 instanceof akv)) {
                    Integer num = (Integer) f53208h.get(akyVar3.setX());
                    if (num == null) {
                        StringBuilder sb2 = new StringBuilder("unknown digest passed: ");
                        sb2.append(akyVar3.setX());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    dividerPadding = num.intValue();
                    int i77 = f53210j + 51;
                    f53209i = i77 % 128;
                    int i78 = i77 % 2;
                } else {
                    int i79 = i73 | 41;
                    int i80 = (i79 << 1) - ((~(i73 & 41)) & i79);
                    f53210j = i80 % 128;
                    akv akvVar = (akv) akyVar3;
                    if (i80 % 2 == 0) {
                        akvVar.setDividerPadding();
                        throw null;
                    }
                    dividerPadding = akvVar.setDividerPadding();
                    int i81 = f53210j;
                    int i82 = (i81 ^ 81) + ((i81 & 81) << 1);
                    f53209i = i82 % 128;
                    int i83 = i82 % 2;
                }
                numValueOf = Integer.valueOf(dividerPadding);
                break;
                break;
            case 5:
                byte[] bArr4 = (byte[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                byte bByteValue2 = ((Byte) objArr[2]).byteValue();
                int i84 = f53209i;
                int i85 = i84 ^ 13;
                int i86 = (i84 & 13) << 1;
                int i87 = (i85 & i86) + (i86 | i85);
                f53210j = i87 % 128;
                int i88 = i87 % 2;
                while (i19 < iIntValue) {
                    int i89 = f53210j;
                    int i90 = i89 & 99;
                    int i91 = ((i89 ^ 99) | i90) << 1;
                    int i92 = -((~i90) & (i89 | 99));
                    int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                    f53209i = i93 % 128;
                    if (i93 % 2 != 0) {
                        byte b10 = bArr4[i19];
                        bArr4[i19] = (byte) ((b10 | bByteValue2) & (~(b10 & bByteValue2)));
                        int i94 = i19 & 61;
                        int i95 = -(-((i19 ^ 61) | i94));
                        i13 = i94 & i95;
                        i14 = i95 | i94;
                    } else {
                        byte b11 = bArr4[i19];
                        int i96 = b11 & bByteValue2;
                        bArr4[i19] = (byte) (((b11 ^ bByteValue2) | i96) & (~i96));
                        int i97 = i19 ^ 1;
                        int i98 = ((i19 & 1) | i97) << 1;
                        int i99 = -i97;
                        i13 = i98 ^ i99;
                        i14 = (i98 & i99) << 1;
                    }
                    i19 = i13 + i14;
                    int i100 = i89 + 59;
                    f53209i = i100 % 128;
                    int i101 = i100 % 2;
                }
                int i102 = f53209i + 81;
                f53210j = i102 % 128;
                if (i102 % 2 != 0) {
                    return null;
                }
                throw null;
            case 6:
                amj amjVar4 = (amj) objArr[0];
                akk akkVar = (akk) objArr[1];
                int i103 = f53209i;
                int i104 = i103 & 27;
                int i105 = (i103 | 27) & (~i104);
                int i106 = -(-(i104 << 1));
                int i107 = ((i105 | i106) << 1) - (i105 ^ i106);
                f53210j = i107 % 128;
                if (i107 % 2 == 0) {
                    amjVar4.f53211a.setOnFocusChangeListener();
                    ann annVar = (ann) akkVar;
                    int length = ((byte[]) ann.setCompoundDrawableTintBlendMode(new Object[]{annVar}, 1947371801, -1947371801, System.identityHashCode(annVar))).length;
                    throw null;
                }
                amjVar4.f53211a.setOnFocusChangeListener();
                ann annVar2 = (ann) akkVar;
                byte[] bArr5 = (byte[]) ann.setCompoundDrawableTintBlendMode(new Object[]{annVar2}, 1947371801, -1947371801, System.identityHashCode(annVar2));
                int length2 = bArr5.length;
                int i108 = amjVar4.f53213c;
                aky akyVar4 = amjVar4.f53211a;
                byte[] bArr6 = amjVar4.f53216f;
                if (length2 > i108) {
                    int i109 = f53209i + 61;
                    f53210j = i109 % 128;
                    int i110 = i109 % 2;
                    akyVar4.setCompoundDrawableTintBlendMode(bArr5, 0, length2);
                    akyVar4.setCompoundDrawableTintBlendMode(bArr6, 0);
                    int i111 = f53209i;
                    int i112 = (i111 & (-86)) | ((~i111) & 85);
                    int i113 = -(-((i111 & 85) << 1));
                    int i114 = (i112 & i113) + (i113 | i112);
                    f53210j = i114 % 128;
                    int i115 = i114 % 2;
                    length2 = amjVar4.f53212b;
                } else {
                    System.arraycopy(bArr5, 0, bArr6, 0, length2);
                    int i116 = f53209i + 95;
                    f53210j = i116 % 128;
                    int i117 = i116 % 2;
                }
                int i118 = f53209i + 109;
                f53210j = i118 % 128;
                int i119 = i118 % 2;
                while (length2 < bArr6.length) {
                    int i120 = f53209i;
                    int i121 = (-2) - (((i120 & 22) + (i120 | 22)) ^ (-1));
                    int i122 = i121 % 128;
                    f53210j = i122;
                    int i123 = i121 % 2;
                    bArr6[length2] = 0;
                    int i124 = length2 ^ 1;
                    length2 = (((length2 & 1) | i124) << 1) - i124;
                    int i125 = i122 + 83;
                    f53209i = i125 % 128;
                    int i126 = i125 % 2;
                }
                byte[] bArr7 = amjVar4.f53217g;
                System.arraycopy(bArr6, 0, bArr7, 0, i108);
                setCompoundDrawableTintBlendMode(new Object[]{bArr6, Integer.valueOf(i108), (byte) 54}, 1972808136, -1972808131, i108);
                setCompoundDrawableTintBlendMode(new Object[]{bArr7, Integer.valueOf(i108), (byte) 92}, 1972808136, -1972808131, i108);
                if (akyVar4 instanceof beu) {
                    int i127 = f53210j;
                    int i128 = ((i127 ^ 104) + ((i127 & 104) << 1)) - 1;
                    f53209i = i128 % 128;
                    int i129 = i128 % 2;
                    beu onLongClickListener = ((beu) akyVar4).setOnLongClickListener();
                    amjVar4.f53215e = onLongClickListener;
                    ((aky) onLongClickListener).setCompoundDrawableTintBlendMode(bArr7, 0, i108);
                    int i130 = f53210j;
                    int i131 = (i130 ^ 29) + ((i130 & 29) << 1);
                    f53209i = i131 % 128;
                    int i132 = i131 % 2;
                }
                akyVar4.setCompoundDrawableTintBlendMode(bArr6, 0, bArr6.length);
                if (akyVar4 instanceof beu) {
                    int i133 = f53210j + 119;
                    f53209i = i133 % 128;
                    beu beuVar3 = (beu) akyVar4;
                    if (i133 % 2 != 0) {
                        amjVar4.f53214d = beuVar3.setOnLongClickListener();
                        throw null;
                    }
                    amjVar4.f53214d = beuVar3.setOnLongClickListener();
                    int i134 = f53210j;
                    int i135 = (i134 & 105) + (i134 | 105);
                    f53209i = i135 % 128;
                    int i136 = i135 % 2;
                }
                int i137 = f53209i;
                int i138 = i137 & 115;
                int i139 = i138 + ((i137 ^ 115) | i138);
                f53210j = i139 % 128;
                if (i139 % 2 != 0) {
                    return null;
                }
                throw null;
            default:
                amj amjVar5 = (amj) objArr[0];
                byte[] bArr8 = (byte[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i140 = f53209i;
                int i141 = ((i140 ^ 9) | (i140 & 9)) << 1;
                int i142 = -(((~i140) & 9) | (i140 & (-10)));
                int i143 = ((i141 | i142) << 1) - (i142 ^ i141);
                f53210j = i143 % 128;
                int i144 = i143 % 2;
                amjVar5.f53211a.setCompoundDrawableTintBlendMode(bArr8, 0, iIntValue2);
                return null;
        }
        return numValueOf;
    }

    public final int setDividerPadding(byte[] bArr) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -2044201634, 2044201635, System.identityHashCode(this))).intValue();
    }

    public final void setY(byte b10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Byte.valueOf(b10)}, 1546790999, -1546790996, System.identityHashCode(this));
    }

    public final int setY() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 587204740, -587204738, System.identityHashCode(this))).intValue();
    }

    public final void setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10)}, 1913310697, -1913310697, i10);
    }

    public final void setCompoundDrawableTintBlendMode(akk akkVar) {
        setCompoundDrawableTintBlendMode(new Object[]{this, akkVar}, 156325013, -156325007, System.identityHashCode(this));
    }
}
