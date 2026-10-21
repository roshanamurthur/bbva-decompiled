package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class axv extends ayc {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f54111x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f54112y0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f54113r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f54114s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final List<ayb> f54115t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final List<h2> f54116u0;
    public final long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final long f54117w0;

    public axv(int i10, ArrayList arrayList, ArrayList arrayList2, long j10, long j11, boolean z10) {
        super(true);
        this.f54117w0 = 0L;
        this.f54113r0 = i10;
        this.f54115t0 = Collections.unmodifiableList(arrayList);
        this.f54116u0 = Collections.unmodifiableList(arrayList2);
        this.f54117w0 = j10;
        this.v0 = j11;
        this.f54114s0 = z10;
    }

    public static axv setCompoundDrawableTintBlendMode(Object obj) throws IOException {
        return (axv) setDividerPadding(new Object[]{obj}, -1579804495, 1579804499, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:34:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x0121  */
    /* JADX WARN: Code duplicated, block: B:38:0x0136  */
    /* JADX WARN: Code duplicated, block: B:40:0x0149  */
    /* JADX WARN: Code duplicated, block: B:42:0x0151  */
    /* JADX WARN: Code duplicated, block: B:45:0x016f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0170  */
    /* JADX WARN: Code duplicated, block: B:48:0x017a  */
    /* JADX WARN: Code duplicated, block: B:49:0x018c  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ad  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13;
        int i14;
        axv axvVar;
        int i15;
        int i16;
        int i17 = ~i10;
        int i18 = i11 | i12;
        DataInputStream dataInputStream = null;
        int i19 = 0;
        int i20 = 1;
        switch (((i17 | i18) * 465) + ((i11 | (~(i17 | i12))) * 930) + (((~i18) | i17) * (-465)) + (i11 * (-929)) + (i10 * (-464))) {
            case 1:
                byte[] bArr = (byte[]) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i21 = f54112y0;
                int i22 = i21 & 111;
                int i23 = ((i21 ^ 111) | i22) << 1;
                int i24 = -((i21 | 111) & (~i22));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                f54111x0 = i25 % 128;
                int i26 = i25 % 2;
                axv axvVar2 = (axv) setDividerPadding(new Object[]{bArr}, -1579804495, 1579804499, (int) System.currentTimeMillis());
                axvVar2.getClass();
                int i27 = f54112y0;
                int i28 = i27 ^ 5;
                int i29 = ((i27 & 5) | i28) << 1;
                int i30 = -i28;
                int i31 = (i29 & i30) + (i29 | i30);
                f54111x0 = i31 % 128;
                int i32 = i31 % 2;
                return axvVar2;
            case 2:
                axv axvVar3 = (axv) objArr[0];
                int i33 = f54111x0;
                int i34 = (((i33 & (-72)) | ((~i33) & 71)) - (~((i33 & 71) << 1))) - 1;
                f54112y0 = i34 % 128;
                int i35 = i34 % 2;
                ayb aybVar = axvVar3.f54115t0.get(0);
                int i36 = f54111x0;
                int i37 = i36 ^ 45;
                int i38 = ((i36 & 45) | i37) << 1;
                int i39 = -i37;
                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                f54112y0 = i40 % 128;
                if (i40 % 2 != 0) {
                    return aybVar;
                }
                throw null;
            case 3:
                axv axvVar4 = (axv) objArr[0];
                int i41 = f54111x0;
                int i42 = i41 + 97;
                f54112y0 = i42 % 128;
                int i43 = i42 % 2;
                int i44 = axvVar4.f54113r0 * 31;
                if (axvVar4.f54114s0) {
                    int i45 = i41 + 101;
                    f54112y0 = i45 % 128;
                    int i46 = i45 % 2;
                    int i47 = i41 & 85;
                    int i48 = -(-((i41 ^ 85) | i47));
                    int i49 = (i47 & i48) + (i48 | i47);
                    f54112y0 = i49 % 128;
                    int i50 = i49 % 2;
                    i13 = 1;
                } else {
                    System.identityHashCode(axvVar4);
                    System.identityHashCode(axvVar4);
                    i13 = 0;
                }
                int i51 = -(-i13);
                int i52 = ((i44 ^ i51) + ((i51 & i44) << 1)) * 31;
                int i53 = -(-axvVar4.f54115t0.hashCode());
                int i54 = (i52 & i53) + (i53 | i52);
                int i55 = i54 * 31;
                int iHashCode = axvVar4.f54116u0.hashCode();
                int iIdentityHashCode = System.identityHashCode(axvVar4);
                int i56 = ((iHashCode * 371) - (~(i54 * 11501))) - 1;
                int i57 = ~i55;
                int i58 = ~iIdentityHashCode;
                int i59 = (i58 | iIdentityHashCode) & i58;
                int i60 = i57 & i59;
                int i61 = ((i59 | i57) & (~i60)) | i60;
                int i62 = ~i61;
                int i63 = (i61 | i62) & i62;
                int i64 = ~iHashCode;
                int i65 = i64 & iIdentityHashCode;
                int i66 = (~i65) & (i64 | iIdentityHashCode);
                int i67 = ~((i65 & i66) | (i66 ^ i65));
                int i68 = ((i63 & i67) | ((~i67) & i63) | ((~i63) & i67)) * (-370);
                int i69 = i56 & i68;
                int i70 = (i56 | i68) & (~i69);
                int i71 = i69 << 1;
                int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
                int i73 = (i64 ^ i58) | (i58 & i64);
                int i74 = ~i73;
                int i75 = (i73 | i74) & i74;
                int i76 = ~((iIdentityHashCode & i57) | (i57 ^ iIdentityHashCode));
                int i77 = i75 & i76;
                int i78 = ((i76 | i75) & (~i77)) | i77;
                int i79 = (i55 & iHashCode) | (i57 & iHashCode) | (i55 & i64);
                int i80 = ~i79;
                int i81 = i78 & i80;
                int i82 = (i78 | i80) & (~i81);
                int i83 = ((i81 & i82) | (i82 ^ i81)) * (-370);
                int i84 = ((i72 ^ i83) | (i72 & i83)) << 1;
                int i85 = -((i83 & (~i72)) | ((~i83) & i72));
                int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                int i87 = -(~(-(-(((i79 | i80) & i80) * 370))));
                int i88 = ((i86 ^ i87) + ((i87 & i86) << 1)) - 1;
                int i89 = i88 * 31;
                long j10 = axvVar4.v0;
                int i90 = (int) (j10 ^ (j10 >>> 32));
                int iIdentityHashCode2 = System.identityHashCode(axvVar4);
                int i91 = i90 * (-183);
                int i92 = i88 * (-5673);
                int i93 = ((~i92) & i91) | ((~i91) & i92);
                int i94 = (i92 & i91) << 1;
                int i95 = (i93 & i94) + (i94 | i93);
                int i96 = ~i90;
                int i97 = ~iIdentityHashCode2;
                int i98 = i96 & i97;
                int i99 = (~i98) & (i96 | i97);
                int i100 = (i99 & i98) | (i99 ^ i98);
                int i101 = i100 ^ i89;
                int i102 = ~i89;
                int i103 = i100 & i89;
                int i104 = ~((i103 & i101) | (i101 ^ i103));
                int i105 = (iIdentityHashCode2 | i97) & i97;
                int i106 = i102 ^ i105;
                int i107 = i105 & i102;
                int i108 = (i107 & i106) | (i106 ^ i107);
                int i109 = (i108 & i90) | (i108 ^ i90);
                int i110 = ~i109;
                int i111 = -(-((((i109 | i110) & i110) | i104) * (-184)));
                int i112 = ((i95 ^ i111) | (i95 & i111)) << 1;
                int i113 = -((i111 & (~i95)) | ((~i111) & i95));
                int i114 = (i112 & i113) + (i113 | i112);
                int i115 = (i96 | i90) & i96;
                int i116 = (i102 | i89) & i102;
                int i117 = i115 & i116;
                int i118 = (i115 | i116) & (~i117);
                int i119 = (i118 & i117) | (i118 ^ i117);
                int i120 = ~i119;
                int i121 = (i119 | i120) & i120;
                int i122 = ((~i97) & i96) | ((~i96) & i97);
                int i123 = ~((i98 & i122) | (i122 ^ i98));
                int i124 = ((~i123) & i121) | ((~i121) & i123);
                int i125 = i121 & i123;
                int i126 = (i125 & i124) | (i124 ^ i125);
                int i127 = i102 ^ i97;
                int i128 = i97 & i102;
                int i129 = ~((i128 & i127) | (i127 ^ i128));
                int i130 = (((i126 & i129) | (i126 ^ i129)) * 184) + i114;
                int i131 = -(-(((i89 & i90) | (i96 & i89) | (i90 & i102)) * 184));
                int i132 = i130 ^ i131;
                int i133 = -(-((i131 & i130) << 1));
                int i134 = ((i132 & i133) + (i133 | i132)) * 31;
                long j11 = axvVar4.f54117w0;
                int i135 = -(~(-(-((int) (j11 ^ (j11 >>> 32))))));
                int i136 = (-2) - (((i134 ^ i135) + ((i135 & i134) << 1)) ^ (-1));
                int i137 = f54111x0 + 23;
                f54112y0 = i137 % 128;
                if (i137 % 2 != 0) {
                    return Integer.valueOf(i136);
                }
                throw null;
            case 4:
                Object obj = objArr[0];
                while (((obj instanceof axv ? 1 : 0) ^ i20) != 0) {
                    if (obj instanceof DataInputStream) {
                        int i138 = f54111x0;
                        int i139 = ((i138 ^ 78) + ((i138 & 78) << i20)) - i20;
                        f54112y0 = i139 % 128;
                        if (i139 % 2 == 0) {
                            ((DataInputStream) obj).readInt();
                            throw null;
                        }
                        DataInputStream dataInputStream2 = (DataInputStream) obj;
                        if (dataInputStream2.readInt() != 0) {
                            throw new IllegalStateException("unknown version for hss private key");
                        }
                        int i140 = dataInputStream2.readInt();
                        long j12 = dataInputStream2.readLong();
                        long j13 = dataInputStream2.readLong();
                        boolean z10 = dataInputStream2.readBoolean();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i141 = f54112y0;
                        int i142 = i141 & 33;
                        int i143 = i142 + ((i141 ^ 33) | i142);
                        f54111x0 = i143 % 128;
                        int i144 = i143 % 2;
                        int i145 = i19;
                        while (i145 < i140) {
                            int i146 = f54112y0;
                            int i147 = i146 & 75;
                            int i148 = -(-((i146 ^ 75) | i147));
                            int i149 = ((i147 | i148) << i20) - (i148 ^ i147);
                            f54111x0 = i149 % 128;
                            if (i149 % 2 != 0) {
                                Object[] objArr2 = new Object[i20];
                                objArr2[i19] = obj;
                                arrayList.add((ayb) ayb.setCompoundDrawableTintBlendMode(objArr2, 1988863407, -1988863402, (int) System.currentTimeMillis()));
                                int i150 = (i145 ^ 203) + ((i145 & 203) << 1);
                                i145 = (i150 ^ (-103)) + ((i150 & (-103)) << 1);
                            } else {
                                Object[] objArr3 = new Object[i20];
                                objArr3[0] = obj;
                                arrayList.add((ayb) ayb.setCompoundDrawableTintBlendMode(objArr3, 1988863407, -1988863402, (int) System.currentTimeMillis()));
                                i145 = (i145 & 1) + (i145 | 1);
                            }
                            int i151 = f54111x0;
                            int i152 = (((i151 | 68) << 1) - (i151 ^ 68)) - 1;
                            f54112y0 = i152 % 128;
                            int i153 = i152 % 2;
                            i19 = 0;
                            z10 = z10;
                            i20 = 1;
                        }
                        boolean z11 = z10;
                        int i154 = f54112y0;
                        int i155 = i154 & 109;
                        int i156 = -(-((i154 ^ 109) | i155));
                        int i157 = (i155 & i156) + (i156 | i155);
                        f54111x0 = i157 % 128;
                        int i158 = i157 % 2;
                        int i159 = 0;
                        while (i159 < ((~i140) - (~(-(-(i140 << 1))))) - 1) {
                            int i160 = f54111x0;
                            int i161 = i160 & 73;
                            int i162 = (((i160 ^ 73) | i161) << 1) - ((i160 | 73) & (~i161));
                            f54112y0 = i162 % 128;
                            if (i162 % 2 == 0) {
                                arrayList2.add((h2) h2.a(new Object[]{obj}, -644382524, 644382524, (int) System.currentTimeMillis()));
                                int i163 = i159 + 94;
                                int i164 = i163 | (-71);
                                i159 = ((i164 << 1) - (~(-((~(i163 & (-71))) & i164)))) - 1;
                            } else {
                                arrayList2.add((h2) h2.a(new Object[]{obj}, -644382524, 644382524, (int) System.currentTimeMillis()));
                                int i165 = i159 & 15;
                                int i166 = (((i159 ^ 15) | i165) << 1) - ((i159 | 15) & (~i165));
                                int i167 = i166 & (-14);
                                i159 = (((i166 ^ (-14)) | i167) << 1) - ((i166 | (-14)) & (~i167));
                            }
                        }
                        axv axvVar5 = new axv(i140, arrayList, arrayList2, j12, j13, z11);
                        int i168 = f54111x0;
                        int i169 = (i168 ^ 13) + ((i168 & 13) << 1);
                        f54112y0 = i169 % 128;
                        int i170 = i169 % 2;
                        return axvVar5;
                    }
                    if (obj instanceof byte[]) {
                        try {
                            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                            try {
                                axv axvVar6 = (axv) setDividerPadding(new Object[]{dataInputStream3}, -1579804495, 1579804499, (int) System.currentTimeMillis());
                                dataInputStream3.close();
                                int i171 = f54111x0 + 57;
                                f54112y0 = i171 % 128;
                                int i172 = i171 % 2;
                                return axvVar6;
                            } catch (Throwable th2) {
                                th = th2;
                                dataInputStream = dataInputStream3;
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                    int i173 = (-2) - ((f54112y0 + 122) ^ (-1));
                                    f54111x0 = i173 % 128;
                                    int i174 = i173 % 2;
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        if (!(obj instanceof InputStream)) {
                            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(obj)));
                        }
                        int i175 = f54111x0;
                        int i176 = (i175 | 33) << 1;
                        int i177 = -(i175 ^ 33);
                        int i178 = (i176 & i177) + (i177 | i176);
                        f54112y0 = i178 % 128;
                        if (i178 % 2 == 0) {
                            throw null;
                        }
                        obj = (byte[]) bfc.setOnFocusChangeListener(new Object[]{(InputStream) obj}, 1574614765, -1574614762, (int) System.currentTimeMillis());
                        i20 = 1;
                        i19 = 0;
                    }
                }
                int i179 = f54112y0;
                int i180 = i179 ^ 67;
                int i181 = ((i179 & 67) | i180) << 1;
                int i182 = -i180;
                int i183 = (i181 ^ i182) + ((i181 & i182) << 1);
                int i184 = i183 % 128;
                f54111x0 = i184;
                int i185 = i183 % 2;
                axv axvVar7 = (axv) obj;
                int i186 = (i184 & (-66)) | ((~i184) & 65);
                int i187 = (i184 & 65) << 1;
                int i188 = ((i186 | i187) << 1) - (i187 ^ i186);
                f54112y0 = i188 % 128;
                int i189 = i188 % 2;
                return axvVar7;
            case 5:
                axv axvVar8 = (axv) objArr[0];
                int i190 = f54112y0;
                int i191 = i190 ^ 125;
                int i192 = ((i190 & 125) | i191) << 1;
                int i193 = -i191;
                int i194 = (i192 ^ i193) + ((i192 & i193) << 1);
                int i195 = i194 % 128;
                f54111x0 = i195;
                int i196 = i194 % 2;
                int i197 = axvVar8.f54113r0;
                int i198 = i195 & 103;
                int i199 = i195 | 103;
                int i200 = (i198 ^ i199) + ((i199 & i198) << 1);
                f54112y0 = i200 % 128;
                if (i200 % 2 == 0) {
                    int i201 = 25 / 0;
                }
                return Integer.valueOf(i197);
            case 6:
                axv axvVar9 = (axv) objArr[0];
                int i202 = f54111x0;
                int i203 = i202 & 45;
                int i204 = ((i202 | 45) & (~i203)) + (i203 << 1);
                f54112y0 = i204 % 128;
                int i205 = i204 % 2;
                axv axvVar10 = (axv) setDividerPadding(new Object[]{axvVar9}, 1460995111, -1460995111, (int) System.currentTimeMillis());
                int i206 = f54111x0;
                int i207 = ((i206 | 47) << 1) - (i206 ^ 47);
                f54112y0 = i207 % 128;
                if (i207 % 2 != 0) {
                    return axvVar10;
                }
                int i208 = 87 / 0;
                return axvVar10;
            case 7:
                Boolean bool = Boolean.FALSE;
                axv axvVar11 = (axv) objArr[0];
                Object obj2 = objArr[1];
                int i209 = f54112y0;
                int i210 = ((i209 | 118) << 1) - (i209 ^ 118);
                int i211 = (i210 ^ (-1)) + (i210 << 1);
                int i212 = i211 % 128;
                f54111x0 = i212;
                if (i211 % 2 != 0) {
                    throw null;
                }
                if (axvVar11 == obj2) {
                    int i213 = i212 ^ 63;
                    int i214 = -(-((i212 & 63) << 1));
                    int i215 = (i213 ^ i214) + ((i213 & i214) << 1);
                    f54112y0 = i215 % 128;
                    int i216 = i215 % 2;
                    return Boolean.TRUE;
                }
                if (obj2 != null) {
                    int i217 = i209 & 7;
                    int i218 = ((i209 | 7) & (~i217)) + (i217 << 1);
                    f54111x0 = i218 % 128;
                    if (i218 % 2 != 0) {
                        int i219 = 15 / 0;
                        if (axvVar11.getClass() != obj2.getClass()) {
                            int i220 = f54112y0;
                            i14 = ((i220 | 57) << 1) - (i220 ^ 57);
                        } else {
                            axvVar = (axv) obj2;
                            if (axvVar11.f54113r0 != axvVar.f54113r0) {
                                int i221 = f54112y0;
                                int i222 = ((i221 | 98) << 1) - (i221 ^ 98);
                                int i223 = (i222 ^ (-1)) + (i222 << 1);
                                f54111x0 = i223 % 128;
                                int i224 = i223 % 2;
                                i14 = ((i221 & 35) - (~(-(-(i221 | 35))))) - 1;
                            } else if (axvVar11.f54114s0 != axvVar.f54114s0) {
                                int i225 = f54111x0;
                                int i226 = (i225 ^ 54) + ((i225 & 54) << 1);
                                int i227 = (i226 ^ (-1)) + (i226 << 1);
                                int i228 = i227 % 128;
                                f54112y0 = i228;
                                int i229 = i227 % 2;
                                i14 = i228 + 61;
                            } else {
                                if (axvVar11.v0 != axvVar.v0) {
                                    int i230 = f54112y0;
                                    int i231 = i230 ^ 29;
                                    int i232 = ((i230 & 29) | i231) << 1;
                                    int i233 = -i231;
                                    int i234 = (i232 & i233) + (i233 | i232);
                                    f54111x0 = i234 % 128;
                                    boolean z12 = i234 % 2 != 0;
                                    int i235 = (i230 ^ 75) + ((i230 & 75) << 1);
                                    f54111x0 = i235 % 128;
                                    int i236 = i235 % 2;
                                    return Boolean.valueOf(z12);
                                }
                                if (axvVar11.f54117w0 != axvVar.f54117w0) {
                                    int i237 = f54112y0;
                                    int i238 = (((i237 | 36) << 1) - (i237 ^ 36)) - 1;
                                    f54111x0 = i238 % 128;
                                    int i239 = i238 % 2;
                                    i16 = (i237 & 57) + (i237 | 57);
                                    f54111x0 = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        return bool;
                                    }
                                    throw null;
                                }
                                if (!axvVar11.f54115t0.equals(axvVar.f54115t0)) {
                                    boolean zEquals = axvVar11.f54116u0.equals(axvVar.f54116u0);
                                    int i240 = f54112y0;
                                    int i241 = i240 & 47;
                                    i15 = i241 + ((i240 ^ 47) | i241);
                                    f54111x0 = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        int i242 = 55 / 0;
                                    }
                                    return Boolean.valueOf(zEquals);
                                }
                                int i243 = f54111x0;
                                i14 = ((i243 ^ 43) - (~(-(-((i243 & 43) << 1))))) - 1;
                                f54112y0 = i14 % 128;
                            }
                        }
                        f54111x0 = i14 % 128;
                    } else {
                        if (axvVar11.getClass() != obj2.getClass()) {
                            int i2210 = f54112y0;
                            i14 = ((i2210 | 57) << 1) - (i2210 ^ 57);
                        } else {
                            axvVar = (axv) obj2;
                            if (axvVar11.f54113r0 != axvVar.f54113r0) {
                                int i2211 = f54112y0;
                                int i2212 = ((i2211 | 98) << 1) - (i2211 ^ 98);
                                int i2213 = (i2212 ^ (-1)) + (i2212 << 1);
                                f54111x0 = i2213 % 128;
                                int i2214 = i2213 % 2;
                                i14 = ((i2211 & 35) - (~(-(-(i2211 | 35))))) - 1;
                            } else if (axvVar11.f54114s0 != axvVar.f54114s0) {
                                int i2215 = f54111x0;
                                int i2216 = (i2215 ^ 54) + ((i2215 & 54) << 1);
                                int i2217 = (i2216 ^ (-1)) + (i2216 << 1);
                                int i2218 = i2217 % 128;
                                f54112y0 = i2218;
                                int i2219 = i2217 % 2;
                                i14 = i2218 + 61;
                            } else {
                                if (axvVar11.v0 != axvVar.v0) {
                                    int i2310 = f54112y0;
                                    int i2311 = i2310 ^ 29;
                                    int i2312 = ((i2310 & 29) | i2311) << 1;
                                    int i2313 = -i2311;
                                    int i2314 = (i2312 & i2313) + (i2313 | i2312);
                                    f54111x0 = i2314 % 128;
                                    if (i2314 % 2 != 0) {
                                    }
                                    int i2315 = (i2310 ^ 75) + ((i2310 & 75) << 1);
                                    f54111x0 = i2315 % 128;
                                    int i2316 = i2315 % 2;
                                    return Boolean.valueOf(z12);
                                }
                                if (axvVar11.f54117w0 != axvVar.f54117w0) {
                                    int i2317 = f54112y0;
                                    int i2318 = (((i2317 | 36) << 1) - (i2317 ^ 36)) - 1;
                                    f54111x0 = i2318 % 128;
                                    int i2319 = i2318 % 2;
                                    i16 = (i2317 & 57) + (i2317 | 57);
                                    f54111x0 = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        return bool;
                                    }
                                    throw null;
                                }
                                if (!axvVar11.f54115t0.equals(axvVar.f54115t0)) {
                                    boolean zEquals2 = axvVar11.f54116u0.equals(axvVar.f54116u0);
                                    int i244 = f54112y0;
                                    int i245 = i244 & 47;
                                    i15 = i245 + ((i244 ^ 47) | i245);
                                    f54111x0 = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        int i246 = 55 / 0;
                                    }
                                    return Boolean.valueOf(zEquals2);
                                }
                                int i247 = f54111x0;
                                i14 = ((i247 ^ 43) - (~(-(-((i247 & 43) << 1))))) - 1;
                                f54112y0 = i14 % 128;
                            }
                        }
                        f54111x0 = i14 % 128;
                    }
                } else {
                    int i22110 = f54112y0;
                    i14 = ((i22110 | 57) << 1) - (i22110 ^ 57);
                    f54111x0 = i14 % 128;
                }
                int i248 = i14 % 2;
                return bool;
            default:
                axv axvVar12 = (axv) objArr[0];
                int i249 = f54112y0;
                int i250 = ((i249 & 48) + (i249 | 48)) - 1;
                f54111x0 = i250 % 128;
                int i251 = i250 % 2;
                try {
                    axv axvVar13 = (axv) setDividerPadding(new Object[]{axvVar12.setAlwaysDrawnWithCacheEnabled()}, -1579804495, 1579804499, (int) System.currentTimeMillis());
                    int i252 = f54111x0;
                    int i253 = i252 & 43;
                    int i254 = (i252 | 43) & (~i253);
                    int i255 = -(-(i253 << 1));
                    int i256 = (i254 & i255) + (i254 | i255);
                    f54112y0 = i256 % 128;
                    if (i256 % 2 != 0) {
                        return axvVar13;
                    }
                    throw null;
                } catch (Exception e5) {
                    throw new RuntimeException(e5.getMessage(), e5);
                }
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return setDividerPadding(new Object[]{this}, -973027322, 973027328, System.identityHashCode(this));
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 859045716, -859045709, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -765737212, 765737215, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ayc, com.mypinpad.tsdk.isolation.ben
    public final synchronized byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        axr axrVar;
        List<ayb> list;
        byte[] bArr;
        try {
            int i10 = f54111x0;
            int i11 = i10 & 1;
            int i12 = -(-((i10 ^ 1) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            f54112y0 = i13 % 128;
            if (i13 % 2 == 0) {
                axr axrVar2 = (axr) axr.setDividerPadding(new Object[]{(axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis()), 1}, 1810000667, -1810000665, 1);
                int i14 = this.f54113r0;
                axr axrVar3 = (axr) axr.setDividerPadding(new Object[]{axrVar2, Integer.valueOf(i14)}, 1810000667, -1810000665, i14);
                axr axrVar4 = (axr) axr.setDividerPadding(new Object[]{axrVar3, Long.valueOf(this.f54117w0)}, -1219503627, 1219503632, System.identityHashCode(axrVar3));
                axr axrVar5 = (axr) axr.setDividerPadding(new Object[]{axrVar4, Long.valueOf(this.v0)}, -1219503627, 1219503632, System.identityHashCode(axrVar4));
                axrVar = (axr) axr.setDividerPadding(new Object[]{axrVar5, Boolean.valueOf(this.f54114s0)}, -1747446463, 1747446472, System.identityHashCode(axrVar5));
                list = this.f54115t0;
            } else {
                axr axrVar6 = (axr) axr.setDividerPadding(new Object[]{(axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis()), 0}, 1810000667, -1810000665, 0);
                int i15 = this.f54113r0;
                axr axrVar7 = (axr) axr.setDividerPadding(new Object[]{axrVar6, Integer.valueOf(i15)}, 1810000667, -1810000665, i15);
                axr axrVar8 = (axr) axr.setDividerPadding(new Object[]{axrVar7, Long.valueOf(this.f54117w0)}, -1219503627, 1219503632, System.identityHashCode(axrVar7));
                axr axrVar9 = (axr) axr.setDividerPadding(new Object[]{axrVar8, Long.valueOf(this.v0)}, -1219503627, 1219503632, System.identityHashCode(axrVar8));
                axrVar = (axr) axr.setDividerPadding(new Object[]{axrVar9, Boolean.valueOf(this.f54114s0)}, -1747446463, 1747446472, System.identityHashCode(axrVar9));
                list = this.f54115t0;
            }
            Iterator<ayb> it = list.iterator();
            while (it.hasNext()) {
                int i16 = f54111x0;
                int i17 = i16 ^ 71;
                int i18 = ((i16 & 71) | i17) << 1;
                int i19 = -i17;
                int i20 = (i18 & i19) + (i18 | i19);
                f54112y0 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = f54111x0;
                int i23 = ((i22 & (-10)) | ((~i22) & 9)) + ((i22 & 9) << 1);
                f54112y0 = i23 % 128;
                int i24 = i23 % 2;
            }
            Iterator<h2> it2 = this.f54116u0.iterator();
            int i25 = f54111x0;
            int i26 = i25 & 79;
            int i27 = i26 + ((i25 ^ 79) | i26);
            f54112y0 = i27 % 128;
            int i28 = i27 % 2;
            while (!(!it2.hasNext())) {
                int i29 = f54111x0;
                int i30 = ((i29 & (-36)) | ((~i29) & 35)) + ((i29 & 35) << 1);
                f54112y0 = i30 % 128;
                int i31 = i30 % 2;
                int i32 = f54111x0;
                int i33 = ((i32 & 54) + (i32 | 54)) - 1;
                f54112y0 = i33 % 128;
                int i34 = i33 % 2;
            }
            bArr = (byte[]) axr.setDividerPadding(new Object[]{axrVar}, 1746305515, -1746305507, System.identityHashCode(axrVar));
            int i35 = f54111x0 + 1;
            f54112y0 = i35 % 128;
            if (i35 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bArr;
    }

    public final synchronized axu setOnFocusChangeListener() {
        axu axuVar;
        int i10 = this.f54113r0;
        ayb aybVar = (ayb) setDividerPadding(new Object[]{this}, 1196938577, -1196938575, System.identityHashCode(this));
        axuVar = new axu(i10, (aya) ayb.setCompoundDrawableTintBlendMode(new Object[]{aybVar}, 1007144611, -1007144607, System.identityHashCode(aybVar)));
        int i11 = f54112y0;
        int i12 = (i11 & 105) + (i11 | 105);
        f54111x0 = i12 % 128;
        int i13 = i12 % 2;
        return axuVar;
    }

    public static axv setCompoundDrawableTintBlendMode(byte[] bArr, byte[] bArr2) throws IOException {
        return (axv) setDividerPadding(new Object[]{bArr, bArr2}, -1496876846, 1496876847, (int) System.currentTimeMillis());
    }

    public final int setDividerPadding() {
        return ((Integer) setDividerPadding(new Object[]{this}, 220120912, -220120907, System.identityHashCode(this))).intValue();
    }
}
