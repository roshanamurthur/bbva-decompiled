package com.mypinpad.tsdk.isolation;

import c2.b;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getDynamicButtonTextSizeSp {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f55822l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f55823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Boolean f55825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f55827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Long f55829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Long f55830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Long f55831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<setFilters> f55832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<getAmount> f55833k;

    public getDynamicButtonTextSizeSp(byte b10, boolean z10, @Nullable Boolean bool, boolean z11, boolean z12, boolean z13, @Nullable Long l6, @Nullable Long l7, @Nullable Long l10, @NotNull List<setFilters> list, @NotNull List<getAmount> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f55823a = b10;
        this.f55824b = z10;
        this.f55825c = bool;
        this.f55826d = z11;
        this.f55827e = z12;
        this.f55828f = z13;
        this.f55829g = l6;
        this.f55830h = l7;
        this.f55831i = l10;
        this.f55832j = list;
        this.f55833k = list2;
        component2.setX(new Object[]{Byte.valueOf(b10)}, 1216155261, -1216155240, (int) System.currentTimeMillis());
        component2.setX(new Object[]{l6}, -51788065, 51788072, (int) System.currentTimeMillis());
        component2.setX(new Object[]{l7}, -51788065, 51788072, (int) System.currentTimeMillis());
        component2.setX(new Object[]{l10}, -51788065, 51788072, (int) System.currentTimeMillis());
        component2.setX(new Object[]{list}, -1772313540, 1772313548, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v120 */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v122 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v117 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v26 */
    public static /* synthetic */ Integer a(Object[] objArr) {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4 = 0;
        getDynamicButtonTextSizeSp getdynamicbuttontextsizesp = (getDynamicButtonTextSizeSp) objArr[0];
        int i10 = m;
        int i11 = i10 + 65;
        f55822l = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = getdynamicbuttontextsizesp.f55823a;
        int i13 = b10 * 31;
        boolean z10 = getdynamicbuttontextsizesp.f55824b;
        boolean z11 = !z10 ? 1 : 0;
        ?? r4 = z10;
        if (z11 != 1) {
            int i14 = i10 + 109;
            f55822l = i14 % 128;
            int i15 = i14 % 2;
            r4 = 1;
        }
        int iIdentityHashCode = System.identityHashCode(getdynamicbuttontextsizesp);
        int i16 = r4 * 471;
        int i17 = -(~(b10 * 14601));
        int i18 = (i16 & i17) + (i17 | i16);
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        int i20 = r4 & i13;
        int i21 = (~i20) & (r4 | i13);
        int i22 = ((i20 & i21) | (i21 ^ i20)) * (-470);
        int i23 = (((i19 ^ i22) | (i19 & i22)) << 1) - (((~i19) & i22) | ((~i22) & i19));
        int i24 = ~r4;
        int i25 = ~i13;
        int i26 = i24 & i25;
        int i27 = (i24 | i25) & (~i26);
        int i28 = ~i25;
        int i29 = (i27 & i26) | (i27 ^ i26);
        int i30 = ~i29;
        int i31 = (i29 | i30) & i30;
        int i32 = i25 ^ iIdentityHashCode;
        int i33 = ~iIdentityHashCode;
        int i34 = i25 & iIdentityHashCode;
        int i35 = (i32 & i34) | (i32 ^ i34);
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = ((~i37) & i31) | ((~i31) & i37);
        int i39 = i31 & i37;
        int i40 = (i39 & i38) | (i38 ^ i39);
        ?? r10 = i33 & r4;
        int i41 = (~(r10 == true ? 1 : 0)) & ((i33 | r4) == true ? 1 : 0);
        int i42 = (i41 & (r10 == true ? 1 : 0)) | (i41 ^ (r10 == true ? 1 : 0));
        int i43 = i42 & i13;
        int i44 = ~(((i42 | i13) & (~i43)) | i43);
        int i45 = ((i40 & i44) | (i40 ^ i44)) * (-470);
        int i46 = (i23 ^ i45) + ((i45 & i23) << 1);
        int i47 = (r4 & i28) | i26;
        ?? r11 = i25 & r4;
        int i48 = (i47 & (r11 == true ? 1 : 0)) | (i47 ^ (r11 == true ? 1 : 0));
        int i49 = i48 ^ iIdentityHashCode;
        int i50 = iIdentityHashCode & i48;
        int i51 = ~((i50 & i49) | (i49 ^ i50));
        int i52 = ((i33 ^ r4) == true ? 1 : 0) | (r10 == true ? 1 : 0);
        int i53 = i52 ^ i13;
        int i54 = i52 & i13;
        int i55 = ~((i54 & i53) | (i53 ^ i54));
        int i56 = -(-(((i51 & i55) | (i51 ^ i55)) * 470));
        int i57 = ((((~i56) & i46) | ((~i46) & i56)) + ((i56 & i46) << 1)) * 31;
        Boolean bool = getdynamicbuttontextsizesp.f55825c;
        if (bool == null) {
            System.identityHashCode(getdynamicbuttontextsizesp);
            System.identityHashCode(getdynamicbuttontextsizesp);
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
            int i58 = m;
            int i59 = i58 ^ 97;
            int i60 = ((i58 & 97) | i59) << 1;
            int i61 = -i59;
            int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
            f55822l = i62 % 128;
            int i63 = i62 % 2;
        }
        int i64 = (i57 + iHashCode) * 31;
        boolean z12 = getdynamicbuttontextsizesp.f55826d;
        boolean z13 = !z12 ? 1 : 0;
        ?? r3 = z12;
        if (z13 != 1) {
            int i65 = m + 125;
            f55822l = i65 % 128;
            r3 = i65 % 2 != 0 ? 0 : 1;
        }
        int i66 = -(~r3);
        int i67 = ((i64 & i66) + (i64 | i66)) - 1;
        int i68 = i67 * 31;
        boolean z14 = getdynamicbuttontextsizesp.f55827e;
        ?? r12 = z14;
        if (z14) {
            System.identityHashCode(getdynamicbuttontextsizesp);
            System.identityHashCode(getdynamicbuttontextsizesp);
            int i69 = f55822l;
            int i70 = (i69 | 7) << 1;
            int i71 = -(i69 ^ 7);
            int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
            m = i72 % 128;
            int i73 = i72 % 2;
            r12 = 1;
        }
        int iIdentityHashCode2 = System.identityHashCode(getdynamicbuttontextsizesp);
        int i74 = r12 * 595;
        int i75 = -(-(i67 * (-36797)));
        int i76 = ((i74 ^ i75) | (i74 & i75)) << 1;
        int i77 = -((i75 & (~i74)) | ((~i75) & i74));
        int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
        int i79 = ~r12;
        int i80 = (i79 ^ i68) | (i79 & i68);
        int i81 = ~i80;
        int i82 = (i80 | i81) & i81;
        int i83 = ~iIdentityHashCode2;
        int i84 = ~i83;
        int i85 = i83 ^ i68;
        int i86 = ~i68;
        int i87 = i83 & i68;
        int i88 = ~((i85 & i87) | (i85 ^ i87));
        int i89 = i82 & i88;
        int i90 = -(-((((i82 | i88) & (~i89)) | i89) * (-1188)));
        int i91 = i78 & i90;
        int i92 = -(-((i78 ^ i90) | i91));
        int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
        int i94 = ((i79 | r12) == true ? 1 : 0) & i79;
        int i95 = (i94 & i86) | ((~i94) & i68);
        int i96 = i68 & i94;
        int i97 = (i96 & i95) | (i95 ^ i96);
        int i98 = ~i97;
        int i99 = (i97 | i98) & i98;
        int i100 = i86 & i83;
        int i101 = ~i86;
        int i102 = (iIdentityHashCode2 & i101) | i100;
        int i103 = iIdentityHashCode2 & i86;
        int i104 = ~((i103 & i102) | (i102 ^ i103));
        int i105 = (i99 & i104) | (i99 ^ i104);
        int i106 = (i79 & i83) | (r12 & i84);
        ?? r13 = i83 & r12;
        int i107 = ~((i106 & (r13 == true ? 1 : 0)) | (i106 ^ (r13 == true ? 1 : 0)));
        int i108 = ((~i107) & i105) | ((~i105) & i107);
        int i109 = i105 & i107;
        int i110 = (-2) - ((i93 - (~(((i109 & i108) | (i108 ^ i109)) * 594))) ^ (-1));
        int i111 = (i86 & i84) | (i83 & i101);
        int i112 = ~((i111 & i100) | (i111 ^ i100));
        int i113 = (r12 & i86) | ((i86 ^ r12) == true ? 1 : 0);
        int i114 = ~i113;
        int i115 = (i113 | i114) & i114;
        int i116 = (i115 & i112) | (i112 ^ i115);
        int i117 = i116 & i107;
        int i118 = (i116 | i107) & (~i117);
        int i119 = ((i118 & i117) | (i118 ^ i117)) * 594;
        int i120 = i110 & i119;
        int iE = b.e((i110 | i119) & (~i120), ~(i120 << 1), 1, 31);
        boolean z15 = getdynamicbuttontextsizesp.f55828f;
        ?? r14 = z15;
        if (z15) {
            int i121 = f55822l;
            int i122 = i121 & 3;
            int i123 = (i121 | 3) & (~i122);
            int i124 = i122 << 1;
            int i125 = (i123 ^ i124) + ((i123 & i124) << 1);
            int i126 = i125 % 128;
            m = i126;
            int i127 = i125 % 2;
            int i128 = (i126 & (-110)) | ((~i126) & 109);
            int i129 = (i126 & 109) << 1;
            int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
            f55822l = i130 % 128;
            int i131 = i130 % 2;
            r14 = 1;
        }
        int i132 = -(-r14);
        int i133 = (((iE | i132) << 1) - (iE ^ i132)) * 31;
        Long l6 = getdynamicbuttontextsizesp.f55829g;
        if (l6 == null) {
            int i134 = f55822l;
            int i135 = ((i134 & (-6)) | ((~i134) & 5)) + ((i134 & 5) << 1);
            m = i135 % 128;
            int i136 = i135 % 2;
            int i137 = ((i134 ^ 68) + ((i134 & 68) << 1)) - 1;
            m = i137 % 128;
            int i138 = i137 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l6.hashCode();
            int i139 = f55822l;
            int i140 = (i139 & 55) + (i139 | 55);
            m = i140 % 128;
            int i141 = i140 % 2;
        }
        int i142 = -(-iHashCode2);
        int i143 = ((i133 ^ i142) | (i133 & i142)) << 1;
        int i144 = -((i142 & (~i133)) | ((~i142) & i133));
        int i145 = (((i143 | i144) << 1) - (i144 ^ i143)) * 31;
        Long l7 = getdynamicbuttontextsizesp.f55830h;
        if (l7 == null) {
            int i146 = f55822l;
            int i147 = (((i146 | 70) << 1) - (i146 ^ 70)) - 1;
            m = i147 % 128;
            int i148 = i147 % 2;
            int i149 = i146 & 27;
            int i150 = i149 + ((i146 ^ 27) | i149);
            m = i150 % 128;
            int i151 = i150 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = l7.hashCode();
            int i152 = f55822l;
            int i153 = i152 ^ 5;
            int i154 = (i152 & 5) << 1;
            int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
            m = i155 % 128;
            int i156 = i155 % 2;
        }
        int i157 = (i145 - (~iHashCode3)) - 1;
        int i158 = i157 * 31;
        Long l10 = getdynamicbuttontextsizesp.f55831i;
        if (l10 == null) {
            int i159 = f55822l;
            int i160 = i159 ^ 99;
            int i161 = ((i159 & 99) | i160) << 1;
            int i162 = -i160;
            int i163 = ((i161 | i162) << 1) - (i162 ^ i161);
            m = i163 % 128;
            int i164 = i163 % 2;
            int i165 = i159 & 59;
            int i166 = -(-((i159 ^ 59) | i165));
            int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
            m = i167 % 128;
            int i168 = i167 % 2;
        } else {
            iHashCode4 = l10.hashCode();
            int i169 = f55822l;
            int i170 = (((i169 | 54) << 1) - (i169 ^ 54)) - 1;
            m = i170 % 128;
            int i171 = i170 % 2;
        }
        int iIdentityHashCode3 = System.identityHashCode(getdynamicbuttontextsizesp);
        int i172 = iHashCode4 * (-496);
        int i173 = -(-(i157 * (-15376)));
        int i174 = i172 & i173;
        int i175 = i174 + ((i172 ^ i173) | i174);
        int i176 = ~iHashCode4;
        int i177 = (i176 | iHashCode4) & i176;
        int i178 = ~i158;
        int i179 = (~((i177 & i178) | (i177 ^ i178))) * 497;
        int i180 = i175 & i179;
        int i181 = (((i175 ^ i179) | i180) << 1) - ((i179 | i175) & (~i180));
        int i182 = i176 & i178;
        int i183 = (~i182) & (i176 | i178);
        int i184 = (i182 & i183) | (i183 ^ i182);
        int i185 = i184 & iIdentityHashCode3;
        int i186 = ~(((i184 | iIdentityHashCode3) & (~i185)) | i185);
        int i187 = ~iIdentityHashCode3;
        int i188 = (i178 ^ i187) | (i178 & i187);
        int i189 = (i188 & iHashCode4) | (i188 ^ iHashCode4);
        int i190 = ~i189;
        int i191 = (i189 | i190) & i190;
        int i192 = ((~i191) & i186) | ((~i186) & i191);
        int i193 = i186 & i191;
        int i194 = -(-(((i193 & i192) | (i192 ^ i193)) * 497));
        int i195 = ((i181 ^ i194) - (~(-(-((i194 & i181) << 1))))) - 1;
        int i196 = i176 & i187;
        int i197 = (i187 | i176) & (~i196);
        int i198 = (i196 & i197) | (i197 ^ i196);
        int i199 = ~i198;
        int i200 = (i198 | i199) & i199;
        int i201 = ~((i176 & i158) | (i176 ^ i158));
        int i202 = (i201 & i200) | ((~i201) & i200) | ((~i200) & i201);
        int i203 = (i158 | i178) & i178;
        int i204 = i203 & iHashCode4;
        int i205 = (iHashCode4 | i203) & (~i204);
        int i206 = (i205 & i204) | (i205 ^ i204);
        int i207 = ~((i206 & iIdentityHashCode3) | (i206 ^ iIdentityHashCode3));
        int i208 = i195 - (~(-(-(((i207 & i202) | (i202 ^ i207)) * 497))));
        int i209 = (i208 ^ (-1)) + (i208 << 1);
        int i210 = i209 * 31;
        int iHashCode5 = getdynamicbuttontextsizesp.f55832j.hashCode();
        int iIdentityHashCode4 = System.identityHashCode(getdynamicbuttontextsizesp);
        int i211 = iHashCode5 * 860;
        int i212 = -(-(i209 * (-26598)));
        int i213 = i211 | i212;
        int i214 = i213 << 1;
        int i215 = -((~(i212 & i211)) & i213);
        int i216 = (i214 & i215) + (i215 | i214);
        int i217 = ~iIdentityHashCode4;
        int i218 = iHashCode5 & i217;
        int i219 = ~iHashCode5;
        int i220 = (iIdentityHashCode4 & i219) | i218;
        int i221 = iHashCode5 & iIdentityHashCode4;
        int i222 = ((i220 & i221) | (i220 ^ i221)) * (-859);
        int i223 = ((~i222) & i216) | ((~i216) & i222);
        int i224 = -(-((i216 & i222) << 1));
        int i225 = (i223 & i224) + (i224 | i223);
        int i226 = i217 ^ iHashCode5;
        int i227 = (i226 & i218) | (i226 ^ i218);
        int i228 = ~i227;
        int i229 = (i227 | i228) & i228;
        int i230 = ~i210;
        int i231 = i219 & i230;
        int i232 = i231 | ((~i231) & (i219 | i230));
        int i233 = i232 & iIdentityHashCode4;
        int i234 = ~(((iIdentityHashCode4 | i232) & (~i233)) | i233);
        int i235 = ((~i234) & i229) | ((~i229) & i234);
        int i236 = i234 & i229;
        int i237 = ((i236 & i235) | (i235 ^ i236)) * 859;
        int i238 = i225 & i237;
        int i239 = -(-((i237 ^ i225) | i238));
        int i240 = (i238 ^ i239) + ((i239 & i238) << 1);
        int i241 = (i210 | i230) & i230;
        int i242 = i241 ^ i217;
        int i243 = i217 & i241;
        int i244 = ~((i243 & i242) | (i242 ^ i243));
        int i245 = (i241 & i219) | ((~i241) & iHashCode5);
        int i246 = i241 & iHashCode5;
        int i247 = (i246 & i245) | (i245 ^ i246);
        int i248 = ~i247;
        int i249 = (i247 | i248) & i248;
        int i250 = i244 & i249;
        int i251 = (i244 | i249) & (~i250);
        int i252 = -(-(((i251 & i250) | (i251 ^ i250)) * 859));
        int i253 = ((((~i252) & i240) | ((~i240) & i252)) - (~(-(-((i252 & i240) << 1))))) - 1;
        int i254 = i253 * 31;
        int iHashCode6 = getdynamicbuttontextsizesp.f55833k.hashCode();
        int iIdentityHashCode5 = System.identityHashCode(getdynamicbuttontextsizesp);
        int i255 = ((iHashCode6 * (-159)) - (~(-(-(i253 * (-4929)))))) - 1;
        int i256 = ~iHashCode6;
        int i257 = i254 & i256;
        int i258 = (~i257) & (i254 | i256);
        int i259 = -(-(((i258 & i257) | (i258 ^ i257)) * 160));
        int i260 = ((i255 | i259) << 1) - (i255 ^ i259);
        int i261 = ~iIdentityHashCode5;
        int i262 = i261 & iHashCode6;
        int i263 = (~i262) & (i261 | iHashCode6);
        int i264 = ~((i262 & i263) | (i263 ^ i262));
        int i265 = ~i254;
        int i266 = i257 | (iHashCode6 & i265);
        int i267 = iHashCode6 & i254;
        int i268 = ~((i266 & i267) | (i266 ^ i267));
        int i269 = i264 & i268;
        int i270 = (i268 | i264) & (~i269);
        int i271 = ((i270 & i269) | (i270 ^ i269)) * (-160);
        int i272 = i260 & i271;
        int i273 = ((i260 ^ i271) | i272) << 1;
        int i274 = -((i271 | i260) & (~i272));
        int i275 = (i273 & i274) + (i274 | i273);
        int i276 = (i254 | i265) & i265;
        int i277 = (iIdentityHashCode5 | i261) & i261;
        int i278 = ((~i277) & i276) | ((~i276) & i277);
        int i279 = i277 & i276;
        int i280 = ~((i279 & i278) | (i278 ^ i279));
        int i281 = ((i280 & iHashCode6) | ((~i280) & iHashCode6) | (i256 & i280)) * 160;
        int i282 = i275 & i281;
        int i283 = (i281 ^ i275) | i282;
        int i284 = ((i282 | i283) << 1) - (i283 ^ i282);
        int i285 = f55822l;
        int i286 = (i285 & 93) + (i285 | 93);
        m = i286 % 128;
        if (i286 % 2 != 0) {
            return Integer.valueOf(i284);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0199  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13;
        int i14 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ~i12;
        int i18 = (((~(i11 | i12)) | (~(i15 | i16 | i17))) * 520) + i14;
        int i19 = ~(i16 | i17);
        int i20 = ~(i12 | i10);
        int i21 = ((i19 | i20) * (-1040)) + i18;
        int i22 = ~(i15 | i17);
        boolean z10 = false;
        switch ((((~(i10 | i16)) | i22 | i20) * 520) + i21) {
            case 1:
                return a(objArr);
            case 2:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp = (getDynamicButtonTextSizeSp) objArr[0];
                int i23 = f55822l + 63;
                m = i23 % 128;
                int i24 = i23 % 2;
                List<getAmount> list = getdynamicbuttontextsizesp.f55833k;
                if (i24 != 0) {
                    return list;
                }
                throw null;
            case 3:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp2 = (getDynamicButtonTextSizeSp) objArr[0];
                int i25 = f55822l;
                int i26 = i25 ^ 73;
                int i27 = ((i25 & 73) | i26) << 1;
                int i28 = -i26;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                m = i29 % 128;
                int i30 = i29 % 2;
                Boolean bool = getdynamicbuttontextsizesp2.f55825c;
                if (i30 == 0) {
                    int i31 = 17 / 0;
                }
                int i32 = (i25 & 65) + (i25 | 65);
                m = i32 % 128;
                if (i32 % 2 != 0) {
                    return bool;
                }
                int i33 = 95 / 0;
                return bool;
            case 4:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp3 = (getDynamicButtonTextSizeSp) objArr[0];
                int i34 = f55822l;
                int i35 = i34 & 21;
                int i36 = (i34 | 21) & (~i35);
                int i37 = i35 << 1;
                int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                m = i38 % 128;
                int i39 = i38 % 2;
                obj = getdynamicbuttontextsizesp3.f55832j;
                int iIdentityHashCode = System.identityHashCode(getdynamicbuttontextsizesp3);
                int i40 = ~iIdentityHashCode;
                int i41 = (i40 | iIdentityHashCode) & i40;
                int i42 = (936103949 & i41) | ((~i41) & (-936103950));
                int i43 = i41 & (-936103950);
                int i44 = ~((i42 & i43) | (i42 ^ i43));
                int i45 = 831164420 & i44;
                int i46 = (i44 | 831164420) & (~i45);
                int i47 = 1909997236 - (~(-(~(((i46 & i45) | (i46 ^ i45)) * (-712)))));
                int i48 = (-966696757) ^ i40;
                int i49 = (-966696757) & i40;
                int i50 = ~((i48 & i49) | (i48 ^ i49) | (-936103950));
                int i51 = (i40 & (-104939530)) | (104939529 & iIdentityHashCode);
                int i52 = iIdentityHashCode & (-104939530);
                int i53 = ~((i52 & i51) | (i51 ^ i52));
                int i54 = ((i53 & i50) | (i50 ^ i53)) * (-712);
                int i55 = (((i47 ^ i54) | (i47 & i54)) << 1) - ((i54 & (~i47)) | ((~i54) & i47));
                int i56 = i41 ^ (-936103950);
                int i57 = (i56 & i43) | (i56 ^ i43);
                int i58 = ~i57;
                int i59 = (i57 | i58) & i58;
                int i60 = ((~i59) & (-966696757)) | (966696756 & i59);
                int i61 = i59 & (-966696757);
                int i62 = -(-(((i61 & i60) | (i60 ^ i61)) * 712));
                int i63 = i55 & i62;
                int i64 = (i62 | i55) & (~i63);
                int i65 = i63 << 1;
                int i66 = ((i64 | i65) << 1) - (i64 ^ i65);
                int iIdentityHashCode2 = System.identityHashCode(getdynamicbuttontextsizesp3);
                int i67 = ~iIdentityHashCode2;
                int i68 = (i67 | iIdentityHashCode2) & i67;
                int i69 = ((-11474799) ^ i68) | ((-11474799) & i68);
                int i70 = ~i69;
                int i71 = (i69 | i70) & i70;
                int i72 = iIdentityHashCode2 & 204863229;
                int i73 = ((-204863230) & i67) | i72;
                int i74 = (-204863230) & iIdentityHashCode2;
                int i75 = ~((i74 & i73) | (i73 ^ i74));
                int i76 = i71 & i75;
                int i77 = 853642583 - (~(-(~(-(-((((i71 | i75) & (~i76)) | i76) * ReturnCode.ERR_REPOSITORY))))));
                int i78 = i68 & 204863229;
                int i79 = (i68 | 204863229) & (~i78);
                int i80 = ~((i79 & i78) | (i79 ^ i78));
                int i81 = 11474798 & i67;
                int i82 = ((-11474799) & iIdentityHashCode2) | i81 | (11474798 & iIdentityHashCode2);
                int i83 = ~i82;
                int i84 = (i82 | i83) & i83;
                int i85 = i80 & i84;
                int i86 = (i80 | i84) & (~i85);
                int i87 = -(-(((i86 & i85) | (i86 ^ i85)) * (-950)));
                int i88 = ((~i87) & i77) | ((~i77) & i87);
                int i89 = -(-((i87 & i77) << 1));
                int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                int i91 = ~(((i67 | 11474798) & (~i81)) | i81);
                int i92 = (iIdentityHashCode2 ^ 204863229) | i72;
                int i93 = ~i92;
                int i94 = (i92 | i93) & i93;
                int i95 = ((~i94) & i91) | ((~i91) & i94);
                int i96 = i94 & i91;
                int i97 = -(-(((i96 & i95) | (i95 ^ i96)) * 950));
                int i98 = (i90 | i97) << 1;
                int i99 = -(i97 ^ i90);
                if (i66 > ((i98 | i99) << 1) - (i99 ^ i98)) {
                    throw null;
                }
                break;
            case 5:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp4 = (getDynamicButtonTextSizeSp) objArr[0];
                int i100 = f55822l + 57;
                int i101 = i100 % 128;
                m = i101;
                int i102 = i100 % 2;
                boolean z11 = getdynamicbuttontextsizesp4.f55824b;
                int i103 = (i101 & 123) + (i101 | 123);
                f55822l = i103 % 128;
                int i104 = i103 % 2;
                return Boolean.valueOf(z11);
            case 6:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp5 = (getDynamicButtonTextSizeSp) objArr[0];
                int i105 = f55822l;
                int i106 = i105 & 73;
                int i107 = ((i105 ^ 73) | i106) << 1;
                int i108 = -((~i106) & (i105 | 73));
                int i109 = (i107 & i108) + (i107 | i108);
                m = i109 % 128;
                int i110 = i109 % 2;
                Long l6 = getdynamicbuttontextsizesp5.f55829g;
                if (i110 == 0) {
                    throw null;
                }
                int i111 = i105 & 93;
                int i112 = (i111 - (~((i105 ^ 93) | i111))) - 1;
                m = i112 % 128;
                if (i112 % 2 != 0) {
                    return l6;
                }
                throw null;
            case 7:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp6 = (getDynamicButtonTextSizeSp) objArr[0];
                int i113 = m;
                int i114 = ((i113 | 54) << 1) - (i113 ^ 54);
                int i115 = (i114 ^ (-1)) + (i114 << 1);
                f55822l = i115 % 128;
                int i116 = i115 % 2;
                Long l7 = getdynamicbuttontextsizesp6.f55830h;
                if (i116 != 0) {
                    throw null;
                }
                int i117 = (i113 & 113) + (i113 | 113);
                f55822l = i117 % 128;
                int i118 = i117 % 2;
                return l7;
            case 8:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp7 = (getDynamicButtonTextSizeSp) objArr[0];
                int i119 = m;
                int i120 = i119 & 33;
                int i121 = (i119 ^ 33) | i120;
                int i122 = (i120 ^ i121) + ((i120 & i121) << 1);
                f55822l = i122 % 128;
                int i123 = i122 % 2;
                boolean z12 = getdynamicbuttontextsizesp7.f55827e;
                if (i123 != 0) {
                    int i124 = 34 / 0;
                }
                int i125 = i119 + 46;
                int i126 = (i125 ^ (-1)) + (i125 << 1);
                f55822l = i126 % 128;
                int i127 = i126 % 2;
                return Boolean.valueOf(z12);
            case 9:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp8 = (getDynamicButtonTextSizeSp) objArr[0];
                int i128 = f55822l;
                int i129 = i128 ^ 47;
                int i130 = ((((i128 & 47) | i129) << 1) - (~(-i129))) - 1;
                int i131 = i130 % 128;
                m = i131;
                int i132 = i130 % 2;
                Long l10 = getdynamicbuttontextsizesp8.f55831i;
                int i133 = ((i131 & 46) + (i131 | 46)) - 1;
                f55822l = i133 % 128;
                int i134 = i133 % 2;
                return l10;
            case 10:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp9 = (getDynamicButtonTextSizeSp) objArr[0];
                int i135 = m;
                int i136 = (((i135 & (-94)) | ((~i135) & 93)) - (~(-(-((i135 & 93) << 1))))) - 1;
                f55822l = i136 % 128;
                int i137 = i136 % 2;
                byte b10 = getdynamicbuttontextsizesp9.f55823a;
                if (i137 == 0) {
                    return Byte.valueOf(b10);
                }
                throw null;
            case 11:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp10 = (getDynamicButtonTextSizeSp) objArr[0];
                int i138 = m;
                int i139 = (i138 ^ 71) + ((i138 & 71) << 1);
                f55822l = i139 % 128;
                int i140 = i139 % 2;
                boolean z13 = getdynamicbuttontextsizesp10.f55828f;
                int i141 = i138 ^ 75;
                int i142 = -(-((i138 & 75) << 1));
                int i143 = (i141 & i142) + (i142 | i141);
                f55822l = i143 % 128;
                if (i143 % 2 == 0) {
                    return Boolean.valueOf(z13);
                }
                throw null;
            case 12:
                int i144 = m;
                int i145 = (i144 ^ 101) + ((i144 & 101) << 1);
                f55822l = i145 % 128;
                int i146 = i145 % 2;
                int i147 = i144 & 51;
                int i148 = (i144 ^ 51) | i147;
                int i149 = (i147 & i148) + (i148 | i147);
                f55822l = i149 % 128;
                int i150 = i149 % 2;
                return "TCD";
            case 13:
                obj = Boolean.FALSE;
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp11 = (getDynamicButtonTextSizeSp) objArr[0];
                Object obj2 = objArr[1];
                int i151 = m;
                int i152 = i151 & 63;
                int i153 = (i151 ^ 63) | i152;
                int i154 = (i152 & i153) + (i152 | i153);
                int i155 = i154 % 128;
                f55822l = i155;
                int i156 = i154 % 2;
                if (getdynamicbuttontextsizesp11 != obj2) {
                    if (!(obj2 instanceof getDynamicButtonTextSizeSp)) {
                        System.identityHashCode(getdynamicbuttontextsizesp11);
                        System.identityHashCode(getdynamicbuttontextsizesp11);
                        System.identityHashCode(getdynamicbuttontextsizesp11);
                        System.identityHashCode(getdynamicbuttontextsizesp11);
                    } else {
                        getDynamicButtonTextSizeSp getdynamicbuttontextsizesp12 = (getDynamicButtonTextSizeSp) obj2;
                        if (getdynamicbuttontextsizesp11.f55823a == getdynamicbuttontextsizesp12.f55823a) {
                            if (getdynamicbuttontextsizesp11.f55824b != getdynamicbuttontextsizesp12.f55824b) {
                                int i157 = i155 & 43;
                                int i158 = ((i155 ^ 43) | i157) << 1;
                                int i159 = -((~i157) & (i155 | 43));
                                int i160 = ((i158 | i159) << 1) - (i158 ^ i159);
                                m = i160 % 128;
                                z10 = i160 % 2 == 0;
                                int i161 = i155 | 61;
                                int i162 = i161 << 1;
                                int i163 = -(i161 & (~(i155 & 61)));
                                int i164 = (i162 & i163) + (i163 | i162);
                                m = i164 % 128;
                                if (i164 % 2 == 0) {
                                    throw null;
                                }
                            } else {
                                if (!Intrinsics.areEqual(getdynamicbuttontextsizesp11.f55825c, getdynamicbuttontextsizesp12.f55825c)) {
                                    int i165 = f55822l;
                                    int i166 = i165 | 49;
                                    int i167 = i166 << 1;
                                    int i168 = -((~(i165 & 49)) & i166);
                                    int i169 = (i167 & i168) + (i168 | i167);
                                    int i170 = i169 % 128;
                                    m = i170;
                                    int i171 = i169 % 2;
                                    i13 = i170 + 57;
                                } else if (getdynamicbuttontextsizesp11.f55826d != getdynamicbuttontextsizesp12.f55826d) {
                                    int i172 = f55822l;
                                    int i173 = i172 ^ 51;
                                    int i174 = (i172 & 51) << 1;
                                    int i175 = (i173 ^ i174) + ((i174 & i173) << 1);
                                    int i176 = i175 % 128;
                                    m = i176;
                                    int i177 = i175 % 2;
                                    int i178 = i176 & 105;
                                    int i179 = (i176 | 105) & (~i178);
                                    int i180 = i178 << 1;
                                    int i181 = (i179 ^ i180) + ((i179 & i180) << 1);
                                    f55822l = i181 % 128;
                                    if (i181 % 2 != 0) {
                                        throw null;
                                    }
                                } else if (getdynamicbuttontextsizesp11.f55827e != getdynamicbuttontextsizesp12.f55827e) {
                                    int i182 = m;
                                    int i183 = i182 + 55;
                                    f55822l = i183 % 128;
                                    int i184 = i183 % 2;
                                    int i185 = i182 & 35;
                                    int i186 = -(-((i182 ^ 35) | i185));
                                    int i187 = ((i185 | i186) << 1) - (i186 ^ i185);
                                    f55822l = i187 % 128;
                                    if (i187 % 2 != 0) {
                                        throw null;
                                    }
                                } else if (getdynamicbuttontextsizesp11.f55828f != getdynamicbuttontextsizesp12.f55828f) {
                                    int i188 = m;
                                    int i189 = i188 & 17;
                                    int i190 = (i188 | 17) & (~i189);
                                    int i191 = i189 << 1;
                                    int i192 = ((i190 | i191) << 1) - (i190 ^ i191);
                                    f55822l = i192 % 128;
                                    if (i192 % 2 != 0) {
                                        z10 = true;
                                    }
                                } else if (!Intrinsics.areEqual(getdynamicbuttontextsizesp11.f55829g, getdynamicbuttontextsizesp12.f55829g)) {
                                    int i193 = f55822l;
                                    int i194 = (i193 & 103) + (i193 | 103);
                                    m = i194 % 128;
                                    if (i194 % 2 == 0) {
                                        z10 = true;
                                    }
                                } else if (!Intrinsics.areEqual(getdynamicbuttontextsizesp11.f55830h, getdynamicbuttontextsizesp12.f55830h)) {
                                    int i195 = f55822l;
                                    int i196 = i195 & 47;
                                    int i197 = (i196 - (~((i195 ^ 47) | i196))) - 1;
                                    int i198 = i197 % 128;
                                    m = i198;
                                    int i199 = i197 % 2;
                                    int i200 = i198 & 37;
                                    int i201 = (i198 ^ 37) | i200;
                                    int i202 = ((i200 | i201) << 1) - (i201 ^ i200);
                                    f55822l = i202 % 128;
                                    if (i202 % 2 != 0) {
                                        throw null;
                                    }
                                } else if (!Intrinsics.areEqual(getdynamicbuttontextsizesp11.f55831i, getdynamicbuttontextsizesp12.f55831i)) {
                                    int i203 = m;
                                    int i204 = i203 & 103;
                                    int i205 = (i203 ^ 103) | i204;
                                    int i206 = ((i204 | i205) << 1) - (i205 ^ i204);
                                    f55822l = i206 % 128;
                                    int i207 = i206 % 2;
                                    break;
                                } else if (!Intrinsics.areEqual(getdynamicbuttontextsizesp11.f55832j, getdynamicbuttontextsizesp12.f55832j)) {
                                    int i208 = f55822l;
                                    int i209 = (i208 & (-112)) | ((~i208) & 111);
                                    int i210 = -(-((i208 & 111) << 1));
                                    int i211 = (i209 ^ i210) + ((i210 & i209) << 1);
                                    int i212 = i211 % 128;
                                    m = i212;
                                    int i213 = i211 % 2;
                                    int i214 = i212 + 5;
                                    f55822l = i214 % 128;
                                    if (i214 % 2 != 0) {
                                        throw null;
                                    }
                                } else if (!Intrinsics.areEqual(getdynamicbuttontextsizesp11.f55833k, getdynamicbuttontextsizesp12.f55833k)) {
                                    int i215 = f55822l;
                                    int i216 = i215 & 73;
                                    int i217 = i215 | 73;
                                    int i218 = (i216 & i217) + (i217 | i216);
                                    int i219 = i218 % 128;
                                    m = i219;
                                    int i220 = i218 % 2;
                                    i13 = (-2) - ((((i219 | 108) << 1) - (i219 ^ 108)) ^ (-1));
                                } else {
                                    int i221 = m;
                                    int i222 = i221 & 65;
                                    int i223 = -(-((i221 ^ 65) | i222));
                                    int i224 = (i222 ^ i223) + ((i223 & i222) << 1);
                                    f55822l = i224 % 128;
                                    int i225 = i224 % 2;
                                }
                                f55822l = i13 % 128;
                            }
                            return Boolean.valueOf(z10);
                        }
                        int i226 = i151 & 71;
                        int i227 = (((~i226) & (i151 | 71)) - (~(-(-(i226 << 1))))) - 1;
                        int i228 = i227 % 128;
                        f55822l = i228;
                        int i229 = i227 % 2;
                        int i230 = i228 & 17;
                        i13 = ((i228 | 17) & (~i230)) + (i230 << 1);
                        m = i13 % 128;
                        int i231 = i13 % 2;
                    }
                    break;
                } else {
                    int i232 = i151 | 105;
                    int i233 = ((i232 << 1) - (~(-(i232 & (~(i151 & 105)))))) - 1;
                    f55822l = i233 % 128;
                    int i234 = i233 % 2;
                    int i235 = ((i151 & 20) + (i151 | 20)) - 1;
                    f55822l = i235 % 128;
                    if (i235 % 2 != 0) {
                        throw null;
                    }
                }
                return Boolean.TRUE;
            default:
                getDynamicButtonTextSizeSp getdynamicbuttontextsizesp13 = (getDynamicButtonTextSizeSp) objArr[0];
                int i236 = m;
                int i237 = (i236 ^ 109) + ((i236 & 109) << 1);
                f55822l = i237 % 128;
                int i238 = i237 % 2;
                boolean z14 = getdynamicbuttontextsizesp13.f55826d;
                if (i238 == 0) {
                    return Boolean.valueOf(z14);
                }
                throw null;
        }
        return obj;
    }

    @NotNull
    public final List<getAmount> UiMessageCallbackKtWhenMappings() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -1205018466, 1205018468, System.identityHashCode(this));
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, -341945228, 341945241, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final Long getNavBarTitleString() {
        return (Long) setOnFocusChangeListener(new Object[]{this}, 1682879148, -1682879141, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -479675983, 479675984, System.identityHashCode(this))).intValue();
    }

    public final byte setCompoundDrawableTintBlendMode() {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, -1033718513, 1033718523, System.identityHashCode(this))).byteValue();
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 453271493, -453271488, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final Long setLayoutAnimation() {
        return (Long) setOnFocusChangeListener(new Object[]{this}, 427014427, -427014421, System.identityHashCode(this));
    }

    @NotNull
    public final List<setFilters> setNavigationOnClickListener() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -1313532706, 1313532710, System.identityHashCode(this));
    }

    @Nullable
    public final Long setOnDragListener() {
        return (Long) setOnFocusChangeListener(new Object[]{this}, 6084722, -6084713, System.identityHashCode(this));
    }

    public final boolean setOnLongClickListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 471676015, -471676004, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final Boolean setX() {
        return (Boolean) setOnFocusChangeListener(new Object[]{this}, 1208707323, -1208707320, System.identityHashCode(this));
    }

    public final boolean setY() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -225684549, 225684549, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1004210290, 1004210302, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 49057765, -49057757, System.identityHashCode(this))).booleanValue();
    }
}
