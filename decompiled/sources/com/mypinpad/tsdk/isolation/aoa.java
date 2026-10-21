package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class aoa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Hashtable f53394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53395e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53396f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amd f53397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aiw f53398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aky f53399c;

    static {
        Hashtable hashtable = new Hashtable();
        f53394d = hashtable;
        hashtable.put("RIPEMD128", aid.setOnFocusChangeListener);
        hashtable.put("RIPEMD160", aid.setY);
        hashtable.put("RIPEMD256", aid.setDividerPadding);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, ajr.setCompoundDrawableTintBlendMode);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, ahp.getNavBarTitleString);
        hashtable.put("SHA-256", ahp.setDividerPadding);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, ahp.setCompoundDrawableTintBlendMode);
        hashtable.put("SHA-512", ahp.setOnFocusChangeListener);
        hashtable.put("SHA-512/224", ahp.setOnLongClickListener);
        hashtable.put(SPHINCSKeyParameters.SHA512_256, ahp.setLayoutAnimation);
        hashtable.put("SHA3-224", ahp.setOnDragListener);
        hashtable.put("SHA3-256", ahp.setNavigationOnClickListener);
        hashtable.put("SHA3-384", ahp.setTextAlignment);
        hashtable.put("SHA3-512", ahp.UiMessageCallbackKtWhenMappings);
        hashtable.put("MD2", ahv.setLayoutAnimation);
        hashtable.put("MD4", ahv.setOnLongClickListener);
        hashtable.put("MD5", ahv.setTextAlignment);
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public aoa(aky akyVar) {
        adu aduVar = (adu) f53394d.get(akyVar.setX());
        this.f53397a = new amd(new amb());
        this.f53399c = akyVar;
        this.f53398b = aduVar != null ? new aiw(aduVar, afq.setY) : null;
    }

    public static /* synthetic */ void a(Object[] objArr) throws IOException {
        amw amwVar;
        aoa aoaVar = (aoa) objArr[0];
        akk akkVar = (akk) objArr[1];
        int i10 = f53395e;
        int i11 = (i10 ^ 93) + ((i10 & 93) << 1);
        int i12 = i11 % 128;
        f53396f = i12;
        int i13 = i11 % 2;
        aoaVar.getClass();
        if (akkVar instanceof ant) {
            int i14 = i12 & 99;
            int i15 = (i14 - (~((i12 ^ 99) | i14))) - 1;
            f53395e = i15 % 128;
            if (i15 % 2 != 0) {
                ant antVar = (ant) akkVar;
                throw null;
            }
            ant antVar2 = (ant) akkVar;
            amwVar = (amw) ((akk) ant.setOnFocusChangeListener(new Object[]{antVar2}, -310755770, 310755770, System.identityHashCode(antVar2)));
        } else {
            int i16 = ((i10 & (-44)) | ((~i10) & 43)) + ((i10 & 43) << 1);
            f53396f = i16 % 128;
            int i17 = i16 % 2;
            amwVar = (amw) akkVar;
        }
        if (((Boolean) amw.setOnFocusChangeListener(new Object[]{amwVar}, 1283892343, -1283892343, System.identityHashCode(amwVar))).booleanValue()) {
            throw new IllegalArgumentException("verification requires public key");
        }
        setY(new Object[]{aoaVar}, -1112831130, 1112831134, System.identityHashCode(aoaVar));
        aoaVar.f53397a.setX(false, akkVar);
        int i18 = f53395e + 11;
        f53396f = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0127  */
    /* JADX WARN: Code duplicated, block: B:29:0x0154  */
    /* JADX WARN: Code duplicated, block: B:31:0x01df  */
    /* JADX WARN: Code duplicated, block: B:33:0x04e2 A[LOOP:0: B:32:0x04e0->B:33:0x04e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0612 A[LOOP:1: B:35:0x0610->B:36:0x0612, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0655  */
    /* JADX WARN: Code duplicated, block: B:41:0x0662  */
    /* JADX WARN: Code duplicated, block: B:42:0x0664  */
    /* JADX WARN: Code duplicated, block: B:45:0x0672  */
    /* JADX WARN: Code duplicated, block: B:47:0x067c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0698  */
    /* JADX WARN: Code duplicated, block: B:52:0x06c2  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object objValueOf;
        int length;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z10;
        int i24;
        int i25 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i26 = ~i12;
        int i27 = ((i10 | (~((~i11) | i26))) * 160) + (((~(i26 | i10)) | (~(i10 | i11))) * (-160)) + i25;
        if (i27 == 1) {
            a(objArr);
            return null;
        }
        if (i27 == 2) {
            aoa aoaVar = (aoa) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i28 = f53396f;
            int i29 = i28 & 33;
            int i30 = (i28 ^ 33) | i29;
            int i31 = (i29 & i30) + (i29 | i30);
            f53395e = i31 % 128;
            if (i31 % 2 != 0) {
                aiw aiwVar = aoaVar.f53398b;
                throw null;
            }
            aiw aiwVar2 = aoaVar.f53398b;
            if (aiwVar2 == null) {
                int i32 = i28 + 75;
                f53395e = i32 % 128;
                try {
                    if (i32 % 2 != 0) {
                        throw null;
                    }
                    int i33 = f53396f + 3;
                    f53395e = i33 % 128;
                    if (i33 % 2 == 0) {
                        return bArr;
                    }
                    throw null;
                } catch (IllegalArgumentException e5) {
                    StringBuilder sb2 = new StringBuilder("malformed DigestInfo for NONEwithRSA hash: ");
                    sb2.append(e5.getMessage());
                    throw new IOException(sb2.toString());
                }
            }
            aja ajaVar = new aja(aiwVar2, bArr);
            objValueOf = (byte[]) adw.setOnLongClickListener(new Object[]{ajaVar, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(ajaVar));
            int i34 = f53395e;
            int i35 = i34 & 15;
            int i36 = -(-((i34 ^ 15) | i35));
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            f53396f = i37 % 128;
            if (i37 % 2 == 0) {
                throw null;
            }
        } else {
            if (i27 != 3) {
                if (i27 != 4) {
                    aoa aoaVar2 = (aoa) objArr[0];
                    byte[] bArr2 = (byte[]) objArr[1];
                    int iIntValue = ((Number) objArr[2]).intValue();
                    int i38 = f53396f;
                    int i39 = i38 ^ 121;
                    int i40 = ((((i38 & 121) | i39) << 1) - (~(-i39))) - 1;
                    f53395e = i40 % 128;
                    int i41 = i40 % 2;
                    aoaVar2.f53399c.setCompoundDrawableTintBlendMode(bArr2, 0, iIntValue);
                    int i42 = f53396f;
                    int i43 = i42 ^ 107;
                    int i44 = ((i42 & 107) | i43) << 1;
                    int i45 = -i43;
                    int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                    f53395e = i46 % 128;
                    int i47 = i46 % 2;
                    return null;
                }
                aoa aoaVar3 = (aoa) objArr[0];
                int i48 = f53396f;
                int i49 = i48 & 111;
                int i50 = ((i48 ^ 111) | i49) << 1;
                int i51 = -((i48 | 111) & (~i49));
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                f53395e = i52 % 128;
                int i53 = i52 % 2;
                aoaVar3.f53399c.setOnFocusChangeListener();
                if (i53 != 0) {
                    int i54 = 98 / 0;
                }
                int i55 = f53395e;
                int i56 = (i55 ^ 34) + ((i55 & 34) << 1);
                int i57 = (i56 ^ (-1)) + (i56 << 1);
                f53396f = i57 % 128;
                if (i57 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            aoa aoaVar4 = (aoa) objArr[0];
            byte[] bArr3 = (byte[]) objArr[1];
            int i58 = f53396f;
            int i59 = (i58 & (-42)) | ((~i58) & 41);
            int i60 = -(-((i58 & 41) << 1));
            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
            f53395e = i61 % 128;
            int i62 = i61 % 2;
            aoaVar4.getClass();
            aky akyVar = aoaVar4.f53399c;
            int y7 = akyVar.setY();
            byte[] bArr4 = new byte[y7];
            akyVar.setCompoundDrawableTintBlendMode(bArr4, 0);
            try {
                byte[] onFocusChangeListener = aoaVar4.f53397a.setOnFocusChangeListener(bArr3, 0, bArr3.length);
                byte[] bArr5 = (byte[]) setY(new Object[]{aoaVar4, bArr4}, 1564076661, -1564076659, System.identityHashCode(aoaVar4));
                int i63 = f53395e;
                int i64 = (i63 ^ 83) + ((i63 & 83) << 1);
                f53396f = i64 % 128;
                int i65 = i64 % 2;
                int i66 = i63 & 1;
                int i67 = ((i63 ^ 1) | i66) << 1;
                int i68 = -((i63 | 1) & (~i66));
                int i69 = (i67 & i68) + (i68 | i67);
                f53396f = i69 % 128;
                if (i69 % 2 == 0) {
                    int i70 = 90 / 0;
                    if (onFocusChangeListener.length == bArr5.length) {
                        boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{onFocusChangeListener, bArr5}, 1295906124, -1295906099, (int) System.currentTimeMillis())).booleanValue();
                        int i71 = f53396f;
                        int i72 = (-2) - ((((i71 | 34) << 1) - (i71 ^ 34)) ^ (-1));
                        f53395e = i72 % 128;
                        int i73 = i72 % 2;
                        objValueOf = Boolean.valueOf(zBooleanValue);
                    } else {
                        length = onFocusChangeListener.length;
                        int length2 = bArr5.length;
                        int iIdentityHashCode = System.identityHashCode(aoaVar4);
                        int i74 = -(-(length2 * 185));
                        int i75 = (((~i74) & 366) | (i74 & (-367))) + ((366 & i74) << 1);
                        int i76 = length2 & 1;
                        int i77 = (~i76) & (length2 | 1);
                        int i78 = ((i77 ^ i76) | (i77 & i76)) * (-368);
                        int i79 = ((i75 ^ i78) | (i75 & i78)) << 1;
                        int i80 = -(((~i75) & i78) | ((~i78) & i75));
                        int i81 = ((i79 | i80) << 1) - (i79 ^ i80);
                        int i82 = ~length2;
                        int i83 = (-2) & i82;
                        int i84 = (~i83) & ((-2) | i82);
                        int i85 = (i84 ^ i83) | (i84 & i83);
                        int i86 = ~iIdentityHashCode;
                        int i87 = i85 & i86;
                        int i88 = -(-((((~i87) & (i85 | i86)) | i87) * 184));
                        int i89 = ((i81 | i88) << 1) - (i81 ^ i88);
                        int i90 = 1 ^ i82;
                        int i91 = i82 & 1;
                        int i92 = (i91 & i90) | (i90 ^ i91);
                        int i93 = ~i92;
                        int i94 = (i92 | i93) & i93;
                        int i95 = i86 & (-2);
                        int i96 = ~(i95 | ((~i95) & (i86 | (-2))));
                        int i97 = ((~i96) & i94) | ((~i94) & i96);
                        int i98 = i94 & i96;
                        int i99 = (i98 & i97) | (i97 ^ i98);
                        int i100 = ~(i83 | i76 | ((-2) & length2));
                        int i101 = i99 & i100;
                        int i102 = (i99 | i100) & (~i101);
                        int i103 = ((i102 & i101) | (i102 ^ i101)) * 184;
                        i13 = i89 & i103;
                        i14 = i103 | i89;
                        if (length == (i13 ^ i14) + ((i14 & i13) << 1)) {
                            int i104 = f53395e;
                            int i105 = ((i104 | 13) << 1) - (i104 ^ 13);
                            f53396f = i105 % 128;
                            int i106 = i105 % 2;
                            int length3 = onFocusChangeListener.length;
                            int i107 = -y7;
                            int iIdentityHashCode2 = System.identityHashCode(aoaVar4);
                            int i108 = i107 * 236;
                            int i109 = length3 * 471;
                            int i110 = i108 ^ i109;
                            int i111 = ((i108 & i109) | i110) << 1;
                            int i112 = -i110;
                            int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
                            int i114 = ~i107;
                            int i115 = ~iIdentityHashCode2;
                            int i116 = (i115 | iIdentityHashCode2) & i115;
                            int i117 = (i116 & i114) | (i114 ^ i116);
                            int i118 = ~i117;
                            int i119 = (i117 | i118) & i118;
                            int i120 = (~i119) & length3;
                            int i121 = ~length3;
                            int i122 = i120 | (i119 & i121);
                            int i123 = i119 & length3;
                            int i124 = -(~(((i123 & i122) | (i122 ^ i123)) * (-235)));
                            int i125 = ((i113 ^ i124) + ((i113 & i124) << 1)) - 1;
                            int i126 = ~i114;
                            int i127 = (i114 & i115) | (iIdentityHashCode2 & i126);
                            int i128 = i114 & iIdentityHashCode2;
                            int i129 = (i127 ^ i128) | (i127 & i128);
                            int i130 = ~i129;
                            int i131 = (i129 | i130) & i130;
                            int i132 = length3 & i131;
                            int i133 = (((~i132) & (i131 | length3)) | i132) * (-470);
                            int i134 = i125 & i133;
                            int i135 = (((i125 ^ i133) | i134) << 1) - ((i133 | i125) & (~i134));
                            int i136 = i121 & i114;
                            int i137 = ~(((~i121) & i107) | i136 | (i121 & i107));
                            int i138 = i136 | (i126 & length3);
                            int i139 = length3 & i114;
                            int i140 = (i139 & i138) | (i138 ^ i139);
                            int i141 = (i140 & i115) | ((~i140) & iIdentityHashCode2);
                            int i142 = i140 & iIdentityHashCode2;
                            int i143 = -(~(-(-(((~((i142 & i141) | (i141 ^ i142))) | i137) * 235))));
                            int i144 = (((i135 | i143) << 1) - (i143 ^ i135)) - 1;
                            int iIdentityHashCode3 = System.identityHashCode(aoaVar4);
                            int i145 = -(~(i144 * (-317)));
                            int i146 = (((-638) ^ i145) + ((i145 & (-638)) << 1)) - 1;
                            int i147 = ~i144;
                            int i148 = 1 ^ iIdentityHashCode3;
                            int i149 = ~iIdentityHashCode3;
                            int i150 = 1 & iIdentityHashCode3;
                            int i151 = (i148 & i150) | (i148 ^ i150);
                            int i152 = ~i151;
                            int i153 = (i151 | i152) & i152;
                            int i154 = i147 ^ i153;
                            int i155 = i153 & i147;
                            int i156 = (i146 - (~(-(~(-(-(((i155 & i154) | (i154 ^ i155)) * (-318)))))))) - 2;
                            int i157 = (i147 | i144) & i147;
                            int i158 = i157 & iIdentityHashCode3;
                            int i159 = (i157 | iIdentityHashCode3) & (~i158);
                            int i160 = (i159 & i158) | (i159 ^ i158);
                            int i161 = ~i160;
                            int i162 = (i160 | i161) & i161;
                            int i163 = (i149 ^ (-2)) | (i149 & (-2));
                            int i164 = i163 & i144;
                            int i165 = (~i164) & (i163 | i144);
                            int i166 = ~((i165 & i164) | (i165 ^ i164));
                            int i167 = -(-(((i166 & i162) | ((~i166) & i162) | ((~i162) & i166)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                            int i168 = i156 & i167;
                            int i169 = ((i156 ^ i167) | i168) << 1;
                            int i170 = -((i167 | i156) & (~i168));
                            int i171 = ((i169 | i170) << 1) - (i170 ^ i169);
                            int i172 = (i149 | iIdentityHashCode3) & i149;
                            int i173 = (i147 & i172) | ((~i172) & i147) | ((~i147) & i172);
                            int i174 = ~((i173 & (-2)) | (i173 ^ (-2)));
                            int i175 = (-2) & i144;
                            int i176 = (i144 | (-2)) & (~i175);
                            int i177 = iIdentityHashCode3 | (i176 & i175) | (i176 ^ i175);
                            int i178 = ~i177;
                            int i179 = (i177 | i178) & i178;
                            int i180 = ((~i179) & i174) | ((~i174) & i179);
                            int i181 = i179 & i174;
                            int i182 = -(-(((i181 & i180) | (i180 ^ i181)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                            int i183 = i171 & i182;
                            int i184 = -(-((i182 ^ i171) | i183));
                            i16 = ((i183 | i184) << 1) - (i184 ^ i183);
                            int length4 = bArr5.length;
                            int iIdentityHashCode4 = System.identityHashCode(aoaVar4);
                            int i185 = i107 * 592;
                            int i186 = -(~(length4 * (-590)));
                            int i187 = ((i185 ^ i186) + ((i185 & i186) << 1)) - 1;
                            int i188 = (i114 | i107) & i114;
                            int i189 = i188 & length4;
                            int i190 = (i188 | length4) & (~i189);
                            int i191 = ((~((i190 & i189) | (i190 ^ i189))) * (-1182)) + i187;
                            int i192 = ~length4;
                            int i193 = i114 & i192;
                            int i194 = (~i193) & (i114 | i192);
                            int i195 = (i193 & i194) | (i194 ^ i193);
                            int i196 = ~iIdentityHashCode4;
                            int i197 = ((~i196) & i195) | ((~i195) & i196);
                            int i198 = i195 & i196;
                            int i199 = (i198 & i197) | (i197 ^ i198);
                            int i200 = ~i199;
                            int i201 = (i199 | i200) & i200;
                            int i202 = ~((length4 & i107) | (i107 ^ length4));
                            int i203 = i201 & i202;
                            int i204 = (i191 - (~((((i202 | i201) & (~i203)) | i203) * (-591)))) - 1;
                            int i205 = iIdentityHashCode4 & i114;
                            int i206 = (~i205) & (iIdentityHashCode4 | i114);
                            int i207 = (i205 & i206) | (i206 ^ i205);
                            int i208 = i207 & i192;
                            int i209 = (i207 | i192) & (~i208);
                            int i210 = -(-(((i209 & i208) | (i209 ^ i208)) * 591));
                            int i211 = i204 & i210;
                            int i212 = i211 + ((i210 ^ i204) | i211);
                            System.identityHashCode(aoaVar4);
                            int i213 = i212 * 825;
                            int i214 = ((-3298) | i213) << 1;
                            int i215 = -(i213 ^ (-3298));
                            int i216 = (i214 & i215) + (i215 | i214);
                            int i217 = ~i212;
                            int i218 = (-2) & i217;
                            int i219 = -(-((((-2) ^ i217) | i218) * (-824)));
                            int i220 = (i216 & i219) + (i216 | i219);
                            int i221 = (i212 & 1) | i218;
                            int i222 = i212 & (-2);
                            int i223 = (i220 - (~(-(-(((i222 & i221) | (i221 ^ i222)) * (-1648)))))) - 1;
                            int i224 = 1 ^ i217;
                            int i225 = i217 & 1;
                            int i226 = -(~(((i225 & i224) | (i224 ^ i225)) * 824));
                            i17 = (-2) - (((i223 ^ i226) + ((i226 & i223) << 1)) ^ (-1));
                            byte b10 = bArr5[1];
                            int iIdentityHashCode5 = System.identityHashCode(aoaVar4);
                            int i227 = b10 * (-317);
                            int i228 = (-638) & i227;
                            int i229 = (i227 ^ (-638)) | i228;
                            int i230 = (i228 & i229) + (i229 | i228);
                            int i231 = ~b10;
                            int i232 = ~iIdentityHashCode5;
                            int i233 = ~((1 & i232) | (iIdentityHashCode5 & (-2)) | (1 & iIdentityHashCode5));
                            int i234 = i231 & i233;
                            int i235 = (i233 | i231) & (~i234);
                            int i236 = -(-(((i235 & i234) | (i235 ^ i234)) * (-318)));
                            int i237 = ((i230 | i236) << 1) - (i230 ^ i236);
                            int i238 = i231 ^ iIdentityHashCode5;
                            int i239 = i231 & iIdentityHashCode5;
                            int i240 = ~((i238 & i239) | (i238 ^ i239));
                            int i241 = i232 ^ (-2);
                            int i242 = i232 & (-2);
                            int i243 = (i241 & i242) | (i241 ^ i242);
                            int i244 = i243 & b10;
                            int i245 = (i243 | b10) & (~i244);
                            int i246 = (i245 & i244) | (i245 ^ i244);
                            int i247 = ~i246;
                            int i248 = (i246 | i247) & i247;
                            int i249 = i240 & i248;
                            int i250 = (i240 | i248) & (~i249);
                            int i251 = ((i250 & i249) | (i250 ^ i249)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                            int i252 = i237 & i251;
                            int i253 = (((i237 ^ i251) | i252) << 1) - ((i251 | i237) & (~i252));
                            int i254 = (i231 & i232) | (i231 ^ i232);
                            int i255 = i254 & (-2);
                            int i256 = ~(((i254 | (-2)) & (~i255)) | i255);
                            int i257 = (-2) ^ b10;
                            int i258 = b10 & (-2);
                            int i259 = (i258 & i257) | (i257 ^ i258);
                            int i260 = ~((i259 & iIdentityHashCode5) | (i259 ^ iIdentityHashCode5));
                            int i261 = i256 & i260;
                            int i262 = (i260 | i256) & (~i261);
                            int i263 = -(-(((i262 & i261) | (i262 ^ i261)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                            int i264 = i253 & i263;
                            int i265 = ((i253 ^ i263) | i264) << 1;
                            int i266 = -((i263 | i253) & (~i264));
                            bArr5[1] = (byte) ((i265 & i266) + (i266 | i265));
                            byte b11 = bArr5[3];
                            int iIdentityHashCode6 = System.identityHashCode(aoaVar4);
                            int i267 = b11 * Constants.FCI_TEMPLATE;
                            int i268 = (-734) ^ i267;
                            int i269 = -(-((i267 & (-734)) << 1));
                            int i270 = (i268 & i269) + (i269 | i268);
                            int i271 = (-2) & b11;
                            int i272 = (~i271) & ((-2) | b11);
                            int i273 = ((i272 & i271) | (i272 ^ i271)) * (-366);
                            int i274 = i270 & i273;
                            int i275 = ((((i270 ^ i273) | i274) << 1) - (~(-((i273 | i270) & (~i274))))) - 1;
                            int i276 = ~b11;
                            int i277 = ~i276;
                            int i278 = i276 ^ iIdentityHashCode6;
                            int i279 = i276 & iIdentityHashCode6;
                            int i280 = ~((i278 & i279) | (i278 ^ i279));
                            int i281 = (-2) & i280;
                            int i282 = (~i281) & (i280 | (-2));
                            int i283 = -(-(((i282 & i281) | (i282 ^ i281)) * (-366)));
                            int i284 = ((~i283) & i275) | ((~i275) & i283);
                            int i285 = (i283 & i275) << 1;
                            int i286 = (i284 ^ i285) + ((i285 & i284) << 1);
                            int i287 = 1 & i276;
                            int i288 = ~((b11 & 1) | i271 | i287);
                            int i289 = i287 | (i277 & (-2));
                            int i290 = i276 & (-2);
                            int i291 = (i289 & i290) | (i289 ^ i290);
                            int i292 = i291 ^ iIdentityHashCode6;
                            int i293 = i291 & iIdentityHashCode6;
                            int i294 = ~((i293 & i292) | (i292 ^ i293));
                            int i295 = ((~i294) & i288) | ((~i288) & i294);
                            int i296 = i294 & i288;
                            int i297 = ((i296 & i295) | (i295 ^ i296)) * 366;
                            bArr5[3] = (byte) ((((~i297) & i286) | ((~i286) & i297)) + ((i297 & i286) << 1));
                            int i298 = f53396f;
                            int i299 = (i298 & 57) + (i298 | 57);
                            f53395e = i299 % 128;
                            int i300 = i299 % 2;
                            i18 = 0;
                            i19 = 0;
                            while (i18 < y7) {
                                int i301 = f53396f;
                                int i302 = i301 & 115;
                                int i303 = (i301 ^ 115) | i302;
                                int i304 = (i302 ^ i303) + ((i303 & i302) << 1);
                                f53395e = i304 % 128;
                                int i305 = i304 % 2;
                                int iIdentityHashCode7 = System.identityHashCode(aoaVar4);
                                int i306 = i18 * (-1975);
                                int i307 = i16 * 989;
                                int i308 = i306 & i307;
                                int i309 = -(-((i306 ^ i307) | i308));
                                int i310 = (i308 ^ i309) + ((i309 & i308) << 1);
                                int i311 = ~i18;
                                int i312 = (i311 | i18) & i311;
                                int i313 = ~(i312 | i16);
                                int i314 = (~i313) & iIdentityHashCode7;
                                int i315 = ~iIdentityHashCode7;
                                int i316 = i314 | (i313 & i315);
                                int i317 = i313 & iIdentityHashCode7;
                                int i318 = -(~(-(-(((i317 & i316) | (i316 ^ i317)) * 988))));
                                int i319 = (((i310 | i318) << 1) - (i310 ^ i318)) - 1;
                                int i320 = ~i16;
                                int i321 = (i320 | i16) & i320;
                                int i322 = ~((i321 ^ i18) | (i321 & i18));
                                int i323 = i315 & (i315 | iIdentityHashCode7);
                                aoa aoaVar5 = aoaVar4;
                                int i324 = i323 & i18;
                                int i325 = y7;
                                int i326 = (~i324) & (i323 | i18);
                                int i327 = ~((i326 ^ i324) | (i324 & i326));
                                int i328 = i322 & i327;
                                int i329 = i19;
                                int i330 = (i327 | i322) & (~i328);
                                int i331 = -(-(((i330 & i328) | (i330 ^ i328)) * (-1976)));
                                int i332 = (i319 ^ i331) + ((i331 & i319) << 1);
                                int i333 = ~((i312 & i320) | ((~i312) & i16) | (i312 & i16));
                                int i334 = (i321 & i315) | ((~i321) & iIdentityHashCode7);
                                int i335 = iIdentityHashCode7 & i321;
                                int i336 = (i335 & i334) | (i334 ^ i335);
                                int i337 = ~i336;
                                int i338 = (i336 | i337) & i337;
                                int i339 = i333 & i338;
                                int i340 = (i333 | i338) & (~i339);
                                int i341 = (i340 & i339) | (i340 ^ i339);
                                int i342 = (i315 & i320) | ((~i315) & i16);
                                int i343 = i315 & i16;
                                int i344 = ~((i342 & i343) | (i342 ^ i343));
                                int i345 = ((~i344) & i341) | ((~i341) & i344);
                                int i346 = i341 & i344;
                                int i347 = ((i346 & i345) | (i345 ^ i346)) * 988;
                                int i348 = i332 & i347;
                                int i349 = ((i332 ^ i347) | i348) << 1;
                                int i350 = -((i347 | i332) & (~i348));
                                byte b12 = onFocusChangeListener[(i349 & i350) + (i350 | i349)];
                                int i351 = ((i17 ^ i18) | (i17 & i18)) << 1;
                                int i352 = -((i311 & i17) | ((~i17) & i18));
                                byte b13 = bArr5[(i351 ^ i352) + ((i351 & i352) << 1)];
                                int i353 = b12 & b13;
                                int i354 = ((b12 ^ b13) | i353) & (~i353);
                                i19 = (i329 & (~i354)) | ((~i329) & i354) | (i354 & i329);
                                int i355 = i18 - 32;
                                int i356 = (i355 ^ (-1)) + (i355 << 1);
                                int i357 = i356 & 34;
                                int i358 = ((i356 ^ 34) | i357) << 1;
                                int i359 = -((i356 | 34) & (~i357));
                                i18 = (i358 ^ i359) + ((i359 & i358) << 1);
                                int i360 = f53395e;
                                int i361 = ((i360 & (-64)) | ((~i360) & 63)) + ((i360 & 63) << 1);
                                f53396f = i361 % 128;
                                int i362 = i361 % 2;
                                aoaVar4 = aoaVar5;
                                y7 = i325;
                            }
                            int i363 = i19;
                            int i364 = f53395e;
                            int i365 = i364 & 13;
                            int i366 = (i364 | 13) & (~i365);
                            int i367 = i365 << 1;
                            int i368 = (i366 ^ i367) + ((i366 & i367) << 1);
                            f53396f = i368 % 128;
                            int i369 = i368 % 2;
                            i20 = i363;
                            i21 = 0;
                            while (i21 < i16) {
                                int i370 = f53396f;
                                int i371 = i370 ^ 69;
                                int i372 = ((i370 & 69) | i371) << 1;
                                int i373 = -i371;
                                int i374 = ((i372 | i373) << 1) - (i373 ^ i372);
                                f53395e = i374 % 128;
                                int i375 = i374 % 2;
                                byte b14 = onFocusChangeListener[i21];
                                byte b15 = bArr5[i21];
                                int i376 = (~b15) & b14;
                                int i377 = (~b14) & b15;
                                int i378 = (i377 & i376) | (i376 ^ i377);
                                int i379 = ((~i378) & i20) | ((~i20) & i378);
                                int i380 = i378 & i20;
                                i20 = (i379 ^ i380) | (i380 & i379);
                                i21++;
                                int i381 = i370 & 35;
                                int i382 = -(-((i370 ^ 35) | i381));
                                int i383 = (i381 & i382) + (i382 | i381);
                                f53395e = i383 % 128;
                                int i384 = i383 % 2;
                            }
                            i22 = f53395e;
                            if (i20 == 0) {
                                i23 = (i22 & 31) + (i22 | 31);
                                int i385 = i23 % 128;
                                f53396f = i385;
                                if (i23 % 2 == 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                i24 = (i385 & 103) + (i385 | 103);
                                f53395e = i24 % 128;
                                if (i24 % 2 != 0) {
                                    int i386 = 50 / 0;
                                }
                                objValueOf = Boolean.valueOf(z10);
                            } else {
                                int i387 = (i22 | 29) << 1;
                                int i388 = -(((~i22) & 29) | (i22 & (-30)));
                                int i389 = ((i387 | i388) << 1) - (i388 ^ i387);
                                f53396f = i389 % 128;
                                int i390 = i389 % 2;
                            }
                        } else {
                            ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr5, bArr5}, 1295906124, -1295906099, (int) System.currentTimeMillis())).booleanValue();
                            i15 = f53395e + 33;
                            f53396f = i15 % 128;
                            if (i15 % 2 == 0) {
                                throw null;
                            }
                        }
                        objValueOf = Boolean.FALSE;
                    }
                } else if (onFocusChangeListener.length == bArr5.length) {
                    boolean zBooleanValue2 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{onFocusChangeListener, bArr5}, 1295906124, -1295906099, (int) System.currentTimeMillis())).booleanValue();
                    int i710 = f53396f;
                    int i711 = (-2) - ((((i710 | 34) << 1) - (i710 ^ 34)) ^ (-1));
                    f53395e = i711 % 128;
                    int i712 = i711 % 2;
                    objValueOf = Boolean.valueOf(zBooleanValue2);
                } else {
                    length = onFocusChangeListener.length;
                    int length5 = bArr5.length;
                    int iIdentityHashCode8 = System.identityHashCode(aoaVar4);
                    int i713 = -(-(length5 * 185));
                    int i714 = (((~i713) & 366) | (i713 & (-367))) + ((366 & i713) << 1);
                    int i715 = length5 & 1;
                    int i716 = (~i715) & (length5 | 1);
                    int i717 = ((i716 ^ i715) | (i716 & i715)) * (-368);
                    int i718 = ((i714 ^ i717) | (i714 & i717)) << 1;
                    int i810 = -(((~i714) & i717) | ((~i717) & i714));
                    int i811 = ((i718 | i810) << 1) - (i718 ^ i810);
                    int i812 = ~length5;
                    int i813 = (-2) & i812;
                    int i814 = (~i813) & ((-2) | i812);
                    int i815 = (i814 ^ i813) | (i814 & i813);
                    int i816 = ~iIdentityHashCode8;
                    int i817 = i815 & i816;
                    int i818 = -(-((((~i817) & (i815 | i816)) | i817) * 184));
                    int i819 = ((i811 | i818) << 1) - (i811 ^ i818);
                    int i910 = 1 ^ i812;
                    int i911 = i812 & 1;
                    int i912 = (i911 & i910) | (i910 ^ i911);
                    int i913 = ~i912;
                    int i914 = (i912 | i913) & i913;
                    int i915 = i816 & (-2);
                    int i916 = ~(i915 | ((~i915) & (i816 | (-2))));
                    int i917 = ((~i916) & i914) | ((~i914) & i916);
                    int i918 = i914 & i916;
                    int i919 = (i918 & i917) | (i917 ^ i918);
                    int i1010 = ~(i813 | i715 | ((-2) & length5));
                    int i1011 = i919 & i1010;
                    int i1012 = (i919 | i1010) & (~i1011);
                    int i1013 = ((i1012 & i1011) | (i1012 ^ i1011)) * 184;
                    i13 = i819 & i1013;
                    i14 = i1013 | i819;
                    if (length == (i13 ^ i14) + ((i14 & i13) << 1)) {
                        int i1014 = f53395e;
                        int i1015 = ((i1014 | 13) << 1) - (i1014 ^ 13);
                        f53396f = i1015 % 128;
                        int i1016 = i1015 % 2;
                        int length6 = onFocusChangeListener.length;
                        int i1017 = -y7;
                        int iIdentityHashCode9 = System.identityHashCode(aoaVar4);
                        int i1018 = i1017 * 236;
                        int i1019 = length6 * 471;
                        int i1110 = i1018 ^ i1019;
                        int i1111 = ((i1018 & i1019) | i1110) << 1;
                        int i1112 = -i1110;
                        int i1113 = (i1111 ^ i1112) + ((i1111 & i1112) << 1);
                        int i1114 = ~i1017;
                        int i1115 = ~iIdentityHashCode9;
                        int i1116 = (i1115 | iIdentityHashCode9) & i1115;
                        int i1117 = (i1116 & i1114) | (i1114 ^ i1116);
                        int i1118 = ~i1117;
                        int i1119 = (i1117 | i1118) & i1118;
                        int i1210 = (~i1119) & length6;
                        int i1211 = ~length6;
                        int i1212 = i1210 | (i1119 & i1211);
                        int i1213 = i1119 & length6;
                        int i1214 = -(~(((i1213 & i1212) | (i1212 ^ i1213)) * (-235)));
                        int i1215 = ((i1113 ^ i1214) + ((i1113 & i1214) << 1)) - 1;
                        int i1216 = ~i1114;
                        int i1217 = (i1114 & i1115) | (iIdentityHashCode9 & i1216);
                        int i1218 = i1114 & iIdentityHashCode9;
                        int i1219 = (i1217 ^ i1218) | (i1217 & i1218);
                        int i1310 = ~i1219;
                        int i1311 = (i1219 | i1310) & i1310;
                        int i1312 = length6 & i1311;
                        int i1313 = (((~i1312) & (i1311 | length6)) | i1312) * (-470);
                        int i1314 = i1215 & i1313;
                        int i1315 = (((i1215 ^ i1313) | i1314) << 1) - ((i1313 | i1215) & (~i1314));
                        int i1316 = i1211 & i1114;
                        int i1317 = ~(((~i1211) & i1017) | i1316 | (i1211 & i1017));
                        int i1318 = i1316 | (i1216 & length6);
                        int i1319 = length6 & i1114;
                        int i1410 = (i1319 & i1318) | (i1318 ^ i1319);
                        int i1411 = (i1410 & i1115) | ((~i1410) & iIdentityHashCode9);
                        int i1412 = i1410 & iIdentityHashCode9;
                        int i1413 = -(~(-(-(((~((i1412 & i1411) | (i1411 ^ i1412))) | i1317) * 235))));
                        int i1414 = (((i1315 | i1413) << 1) - (i1413 ^ i1315)) - 1;
                        int iIdentityHashCode10 = System.identityHashCode(aoaVar4);
                        int i1415 = -(~(i1414 * (-317)));
                        int i1416 = (((-638) ^ i1415) + ((i1415 & (-638)) << 1)) - 1;
                        int i1417 = ~i1414;
                        int i1418 = 1 ^ iIdentityHashCode10;
                        int i1419 = ~iIdentityHashCode10;
                        int i1510 = 1 & iIdentityHashCode10;
                        int i1511 = (i1418 & i1510) | (i1418 ^ i1510);
                        int i1512 = ~i1511;
                        int i1513 = (i1511 | i1512) & i1512;
                        int i1514 = i1417 ^ i1513;
                        int i1515 = i1513 & i1417;
                        int i1516 = (i1416 - (~(-(~(-(-(((i1515 & i1514) | (i1514 ^ i1515)) * (-318)))))))) - 2;
                        int i1517 = (i1417 | i1414) & i1417;
                        int i1518 = i1517 & iIdentityHashCode10;
                        int i1519 = (i1517 | iIdentityHashCode10) & (~i1518);
                        int i1610 = (i1519 & i1518) | (i1519 ^ i1518);
                        int i1611 = ~i1610;
                        int i1612 = (i1610 | i1611) & i1611;
                        int i1613 = (i1419 ^ (-2)) | (i1419 & (-2));
                        int i1614 = i1613 & i1414;
                        int i1615 = (~i1614) & (i1613 | i1414);
                        int i1616 = ~((i1615 & i1614) | (i1615 ^ i1614));
                        int i1617 = -(-(((i1616 & i1612) | ((~i1616) & i1612) | ((~i1612) & i1616)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                        int i1618 = i1516 & i1617;
                        int i1619 = ((i1516 ^ i1617) | i1618) << 1;
                        int i1710 = -((i1617 | i1516) & (~i1618));
                        int i1711 = ((i1619 | i1710) << 1) - (i1710 ^ i1619);
                        int i1712 = (i1419 | iIdentityHashCode10) & i1419;
                        int i1713 = (i1417 & i1712) | ((~i1712) & i1417) | ((~i1417) & i1712);
                        int i1714 = ~((i1713 & (-2)) | (i1713 ^ (-2)));
                        int i1715 = (-2) & i1414;
                        int i1716 = (i1414 | (-2)) & (~i1715);
                        int i1717 = iIdentityHashCode10 | (i1716 & i1715) | (i1716 ^ i1715);
                        int i1718 = ~i1717;
                        int i1719 = (i1717 | i1718) & i1718;
                        int i1810 = ((~i1719) & i1714) | ((~i1714) & i1719);
                        int i1811 = i1719 & i1714;
                        int i1812 = -(-(((i1811 & i1810) | (i1810 ^ i1811)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                        int i1813 = i1711 & i1812;
                        int i1814 = -(-((i1812 ^ i1711) | i1813));
                        i16 = ((i1813 | i1814) << 1) - (i1814 ^ i1813);
                        int length7 = bArr5.length;
                        int iIdentityHashCode11 = System.identityHashCode(aoaVar4);
                        int i1815 = i1017 * 592;
                        int i1816 = -(~(length7 * (-590)));
                        int i1817 = ((i1815 ^ i1816) + ((i1815 & i1816) << 1)) - 1;
                        int i1818 = (i1114 | i1017) & i1114;
                        int i1819 = i1818 & length7;
                        int i1910 = (i1818 | length7) & (~i1819);
                        int i1911 = ((~((i1910 & i1819) | (i1910 ^ i1819))) * (-1182)) + i1817;
                        int i1912 = ~length7;
                        int i1913 = i1114 & i1912;
                        int i1914 = (~i1913) & (i1114 | i1912);
                        int i1915 = (i1913 & i1914) | (i1914 ^ i1913);
                        int i1916 = ~iIdentityHashCode11;
                        int i1917 = ((~i1916) & i1915) | ((~i1915) & i1916);
                        int i1918 = i1915 & i1916;
                        int i1919 = (i1918 & i1917) | (i1917 ^ i1918);
                        int i2010 = ~i1919;
                        int i2011 = (i1919 | i2010) & i2010;
                        int i2012 = ~((length7 & i1017) | (i1017 ^ length7));
                        int i2013 = i2011 & i2012;
                        int i2014 = (i1911 - (~((((i2012 | i2011) & (~i2013)) | i2013) * (-591)))) - 1;
                        int i2015 = iIdentityHashCode11 & i1114;
                        int i2016 = (~i2015) & (iIdentityHashCode11 | i1114);
                        int i2017 = (i2015 & i2016) | (i2016 ^ i2015);
                        int i2018 = i2017 & i1912;
                        int i2019 = (i2017 | i1912) & (~i2018);
                        int i2110 = -(-(((i2019 & i2018) | (i2019 ^ i2018)) * 591));
                        int i2111 = i2014 & i2110;
                        int i2112 = i2111 + ((i2110 ^ i2014) | i2111);
                        System.identityHashCode(aoaVar4);
                        int i2113 = i2112 * 825;
                        int i2114 = ((-3298) | i2113) << 1;
                        int i2115 = -(i2113 ^ (-3298));
                        int i2116 = (i2114 & i2115) + (i2115 | i2114);
                        int i2117 = ~i2112;
                        int i2118 = (-2) & i2117;
                        int i2119 = -(-((((-2) ^ i2117) | i2118) * (-824)));
                        int i2210 = (i2116 & i2119) + (i2116 | i2119);
                        int i2211 = (i2112 & 1) | i2118;
                        int i2212 = i2112 & (-2);
                        int i2213 = (i2210 - (~(-(-(((i2212 & i2211) | (i2211 ^ i2212)) * (-1648)))))) - 1;
                        int i2214 = 1 ^ i2117;
                        int i2215 = i2117 & 1;
                        int i2216 = -(~(((i2215 & i2214) | (i2214 ^ i2215)) * 824));
                        i17 = (-2) - (((i2213 ^ i2216) + ((i2216 & i2213) << 1)) ^ (-1));
                        byte b16 = bArr5[1];
                        int iIdentityHashCode12 = System.identityHashCode(aoaVar4);
                        int i2217 = b16 * (-317);
                        int i2218 = (-638) & i2217;
                        int i2219 = (i2217 ^ (-638)) | i2218;
                        int i2310 = (i2218 & i2219) + (i2219 | i2218);
                        int i2311 = ~b16;
                        int i2312 = ~iIdentityHashCode12;
                        int i2313 = ~((1 & i2312) | (iIdentityHashCode12 & (-2)) | (1 & iIdentityHashCode12));
                        int i2314 = i2311 & i2313;
                        int i2315 = (i2313 | i2311) & (~i2314);
                        int i2316 = -(-(((i2315 & i2314) | (i2315 ^ i2314)) * (-318)));
                        int i2317 = ((i2310 | i2316) << 1) - (i2310 ^ i2316);
                        int i2318 = i2311 ^ iIdentityHashCode12;
                        int i2319 = i2311 & iIdentityHashCode12;
                        int i2410 = ~((i2318 & i2319) | (i2318 ^ i2319));
                        int i2411 = i2312 ^ (-2);
                        int i2412 = i2312 & (-2);
                        int i2413 = (i2411 & i2412) | (i2411 ^ i2412);
                        int i2414 = i2413 & b16;
                        int i2415 = (i2413 | b16) & (~i2414);
                        int i2416 = (i2415 & i2414) | (i2415 ^ i2414);
                        int i2417 = ~i2416;
                        int i2418 = (i2416 | i2417) & i2417;
                        int i2419 = i2410 & i2418;
                        int i2510 = (i2410 | i2418) & (~i2419);
                        int i2511 = ((i2510 & i2419) | (i2510 ^ i2419)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                        int i2512 = i2317 & i2511;
                        int i2513 = (((i2317 ^ i2511) | i2512) << 1) - ((i2511 | i2317) & (~i2512));
                        int i2514 = (i2311 & i2312) | (i2311 ^ i2312);
                        int i2515 = i2514 & (-2);
                        int i2516 = ~(((i2514 | (-2)) & (~i2515)) | i2515);
                        int i2517 = (-2) ^ b16;
                        int i2518 = b16 & (-2);
                        int i2519 = (i2518 & i2517) | (i2517 ^ i2518);
                        int i2610 = ~((i2519 & iIdentityHashCode12) | (i2519 ^ iIdentityHashCode12));
                        int i2611 = i2516 & i2610;
                        int i2612 = (i2610 | i2516) & (~i2611);
                        int i2613 = -(-(((i2612 & i2611) | (i2612 ^ i2611)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                        int i2614 = i2513 & i2613;
                        int i2615 = ((i2513 ^ i2613) | i2614) << 1;
                        int i2616 = -((i2613 | i2513) & (~i2614));
                        bArr5[1] = (byte) ((i2615 & i2616) + (i2616 | i2615));
                        byte b17 = bArr5[3];
                        int iIdentityHashCode13 = System.identityHashCode(aoaVar4);
                        int i2617 = b17 * Constants.FCI_TEMPLATE;
                        int i2618 = (-734) ^ i2617;
                        int i2619 = -(-((i2617 & (-734)) << 1));
                        int i2710 = (i2618 & i2619) + (i2619 | i2618);
                        int i2711 = (-2) & b17;
                        int i2712 = (~i2711) & ((-2) | b17);
                        int i2713 = ((i2712 & i2711) | (i2712 ^ i2711)) * (-366);
                        int i2714 = i2710 & i2713;
                        int i2715 = ((((i2710 ^ i2713) | i2714) << 1) - (~(-((i2713 | i2710) & (~i2714))))) - 1;
                        int i2716 = ~b17;
                        int i2717 = ~i2716;
                        int i2718 = i2716 ^ iIdentityHashCode13;
                        int i2719 = i2716 & iIdentityHashCode13;
                        int i2810 = ~((i2718 & i2719) | (i2718 ^ i2719));
                        int i2811 = (-2) & i2810;
                        int i2812 = (~i2811) & (i2810 | (-2));
                        int i2813 = -(-(((i2812 & i2811) | (i2812 ^ i2811)) * (-366)));
                        int i2814 = ((~i2813) & i2715) | ((~i2715) & i2813);
                        int i2815 = (i2813 & i2715) << 1;
                        int i2816 = (i2814 ^ i2815) + ((i2815 & i2814) << 1);
                        int i2817 = 1 & i2716;
                        int i2818 = ~((b17 & 1) | i2711 | i2817);
                        int i2819 = i2817 | (i2717 & (-2));
                        int i2910 = i2716 & (-2);
                        int i2911 = (i2819 & i2910) | (i2819 ^ i2910);
                        int i2912 = i2911 ^ iIdentityHashCode13;
                        int i2913 = i2911 & iIdentityHashCode13;
                        int i2914 = ~((i2913 & i2912) | (i2912 ^ i2913));
                        int i2915 = ((~i2914) & i2818) | ((~i2818) & i2914);
                        int i2916 = i2914 & i2818;
                        int i2917 = ((i2916 & i2915) | (i2915 ^ i2916)) * 366;
                        bArr5[3] = (byte) ((((~i2917) & i2816) | ((~i2816) & i2917)) + ((i2917 & i2816) << 1));
                        int i2918 = f53396f;
                        int i2919 = (i2918 & 57) + (i2918 | 57);
                        f53395e = i2919 % 128;
                        int i3010 = i2919 % 2;
                        i18 = 0;
                        i19 = 0;
                        while (i18 < y7) {
                            int i3011 = f53396f;
                            int i3012 = i3011 & 115;
                            int i3013 = (i3011 ^ 115) | i3012;
                            int i3014 = (i3012 ^ i3013) + ((i3013 & i3012) << 1);
                            f53395e = i3014 % 128;
                            int i3015 = i3014 % 2;
                            int iIdentityHashCode14 = System.identityHashCode(aoaVar4);
                            int i3016 = i18 * (-1975);
                            int i3017 = i16 * 989;
                            int i3018 = i3016 & i3017;
                            int i3019 = -(-((i3016 ^ i3017) | i3018));
                            int i3110 = (i3018 ^ i3019) + ((i3019 & i3018) << 1);
                            int i3111 = ~i18;
                            int i3112 = (i3111 | i18) & i3111;
                            int i3113 = ~(i3112 | i16);
                            int i3114 = (~i3113) & iIdentityHashCode14;
                            int i3115 = ~iIdentityHashCode14;
                            int i3116 = i3114 | (i3113 & i3115);
                            int i3117 = i3113 & iIdentityHashCode14;
                            int i3118 = -(~(-(-(((i3117 & i3116) | (i3116 ^ i3117)) * 988))));
                            int i3119 = (((i3110 | i3118) << 1) - (i3110 ^ i3118)) - 1;
                            int i3210 = ~i16;
                            int i3211 = (i3210 | i16) & i3210;
                            int i3212 = ~((i3211 ^ i18) | (i3211 & i18));
                            int i3213 = i3115 & (i3115 | iIdentityHashCode14);
                            aoa aoaVar6 = aoaVar4;
                            int i3214 = i3213 & i18;
                            int i3215 = y7;
                            int i3216 = (~i3214) & (i3213 | i18);
                            int i3217 = ~((i3216 ^ i3214) | (i3214 & i3216));
                            int i3218 = i3212 & i3217;
                            int i3219 = i19;
                            int i3310 = (i3217 | i3212) & (~i3218);
                            int i3311 = -(-(((i3310 & i3218) | (i3310 ^ i3218)) * (-1976)));
                            int i3312 = (i3119 ^ i3311) + ((i3311 & i3119) << 1);
                            int i3313 = ~((i3112 & i3210) | ((~i3112) & i16) | (i3112 & i16));
                            int i3314 = (i3211 & i3115) | ((~i3211) & iIdentityHashCode14);
                            int i3315 = iIdentityHashCode14 & i3211;
                            int i3316 = (i3315 & i3314) | (i3314 ^ i3315);
                            int i3317 = ~i3316;
                            int i3318 = (i3316 | i3317) & i3317;
                            int i3319 = i3313 & i3318;
                            int i3410 = (i3313 | i3318) & (~i3319);
                            int i3411 = (i3410 & i3319) | (i3410 ^ i3319);
                            int i3412 = (i3115 & i3210) | ((~i3115) & i16);
                            int i3413 = i3115 & i16;
                            int i3414 = ~((i3412 & i3413) | (i3412 ^ i3413));
                            int i3415 = ((~i3414) & i3411) | ((~i3411) & i3414);
                            int i3416 = i3411 & i3414;
                            int i3417 = ((i3416 & i3415) | (i3415 ^ i3416)) * 988;
                            int i3418 = i3312 & i3417;
                            int i3419 = ((i3312 ^ i3417) | i3418) << 1;
                            int i3510 = -((i3417 | i3312) & (~i3418));
                            byte b18 = onFocusChangeListener[(i3419 & i3510) + (i3510 | i3419)];
                            int i3511 = ((i17 ^ i18) | (i17 & i18)) << 1;
                            int i3512 = -((i3111 & i17) | ((~i17) & i18));
                            byte b19 = bArr5[(i3511 ^ i3512) + ((i3511 & i3512) << 1)];
                            int i3513 = b18 & b19;
                            int i3514 = ((b18 ^ b19) | i3513) & (~i3513);
                            i19 = (i3219 & (~i3514)) | ((~i3219) & i3514) | (i3514 & i3219);
                            int i3515 = i18 - 32;
                            int i3516 = (i3515 ^ (-1)) + (i3515 << 1);
                            int i3517 = i3516 & 34;
                            int i3518 = ((i3516 ^ 34) | i3517) << 1;
                            int i3519 = -((i3516 | 34) & (~i3517));
                            i18 = (i3518 ^ i3519) + ((i3519 & i3518) << 1);
                            int i3610 = f53395e;
                            int i3611 = ((i3610 & (-64)) | ((~i3610) & 63)) + ((i3610 & 63) << 1);
                            f53396f = i3611 % 128;
                            int i3612 = i3611 % 2;
                            aoaVar4 = aoaVar6;
                            y7 = i3215;
                        }
                        int i3613 = i19;
                        int i3614 = f53395e;
                        int i3615 = i3614 & 13;
                        int i3616 = (i3614 | 13) & (~i3615);
                        int i3617 = i3615 << 1;
                        int i3618 = (i3616 ^ i3617) + ((i3616 & i3617) << 1);
                        f53396f = i3618 % 128;
                        int i3619 = i3618 % 2;
                        i20 = i3613;
                        i21 = 0;
                        while (i21 < i16) {
                            int i3710 = f53396f;
                            int i3711 = i3710 ^ 69;
                            int i3712 = ((i3710 & 69) | i3711) << 1;
                            int i3713 = -i3711;
                            int i3714 = ((i3712 | i3713) << 1) - (i3713 ^ i3712);
                            f53395e = i3714 % 128;
                            int i3715 = i3714 % 2;
                            byte b110 = onFocusChangeListener[i21];
                            byte b111 = bArr5[i21];
                            int i3716 = (~b111) & b110;
                            int i3717 = (~b110) & b111;
                            int i3718 = (i3717 & i3716) | (i3716 ^ i3717);
                            int i3719 = ((~i3718) & i20) | ((~i20) & i3718);
                            int i3810 = i3718 & i20;
                            i20 = (i3719 ^ i3810) | (i3810 & i3719);
                            i21++;
                            int i3811 = i3710 & 35;
                            int i3812 = -(-((i3710 ^ 35) | i3811));
                            int i3813 = (i3811 & i3812) + (i3812 | i3811);
                            f53395e = i3813 % 128;
                            int i3814 = i3813 % 2;
                        }
                        i22 = f53395e;
                        if (i20 == 0) {
                            i23 = (i22 & 31) + (i22 | 31);
                            int i3815 = i23 % 128;
                            f53396f = i3815;
                            if (i23 % 2 == 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            i24 = (i3815 & 103) + (i3815 | 103);
                            f53395e = i24 % 128;
                            if (i24 % 2 != 0) {
                                int i3816 = 50 / 0;
                            }
                            objValueOf = Boolean.valueOf(z10);
                        } else {
                            int i3817 = (i22 | 29) << 1;
                            int i3818 = -(((~i22) & 29) | (i22 & (-30)));
                            int i3819 = ((i3817 | i3818) << 1) - (i3818 ^ i3817);
                            f53396f = i3819 % 128;
                            int i391 = i3819 % 2;
                        }
                    } else {
                        ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr5, bArr5}, 1295906124, -1295906099, (int) System.currentTimeMillis())).booleanValue();
                        i15 = f53395e + 33;
                        f53396f = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                    }
                    objValueOf = Boolean.FALSE;
                }
            } catch (Exception unused) {
            }
        }
        return objValueOf;
    }

    public final void setOnFocusChangeListener(byte[] bArr, int i10) throws IOException {
        setY(new Object[]{this, bArr, Integer.valueOf(i10)}, 275575237, -275575237, i10);
    }

    public final void setX(akk akkVar) throws IOException {
        setY(new Object[]{this, akkVar}, 1468000524, -1468000523, System.identityHashCode(this));
    }

    public final boolean setY(byte[] bArr) {
        return ((Boolean) setY(new Object[]{this, bArr}, -609292746, 609292749, System.identityHashCode(this))).booleanValue();
    }
}
