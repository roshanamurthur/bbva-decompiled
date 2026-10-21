package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class zs implements yl.setCompoundDrawableTintBlendMode {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f62441j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f62442k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final zj f62443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<yl> f62444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final zg f62446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final yk f62447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f62448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f62449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f62450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62451i;

    /* JADX WARN: Multi-variable type inference failed */
    public zs(@NotNull zj zjVar, @NotNull List<? extends yl> list, int i10, @Nullable zg zgVar, @NotNull yk ykVar, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(zjVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(ykVar, "");
        this.f62443a = zjVar;
        this.f62444b = list;
        this.f62445c = i10;
        this.f62446d = zgVar;
        this.f62447e = ykVar;
        this.f62448f = i11;
        this.f62449g = i12;
        this.f62450h = i13;
    }

    public static /* synthetic */ zs a(Object[] objArr) throws Throwable {
        zs zsVar = (zs) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        zg zgVar = (zg) objArr[2];
        yk ykVar = (yk) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int iIntValue4 = ((Number) objArr[6]).intValue();
        int iIntValue5 = ((Number) objArr[7]).intValue();
        int i10 = f62441j;
        int i11 = i10 + 25;
        f62442k = i11 % 128;
        if (i11 % 2 != 0 ? (iIntValue5 & 1) != 0 : (iIntValue5 & 1) != 0) {
            int i12 = (i10 & (-104)) | (103 & (~i10));
            int i13 = -(-((i10 & 103) << 1));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            f62442k = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = zsVar.f62445c;
                throw null;
            }
            iIntValue = zsVar.f62445c;
        }
        if ((iIntValue5 & 2) != 0) {
            int i16 = i10 + 107;
            f62442k = i16 % 128;
            if (i16 % 2 == 0) {
                zg zgVar2 = zsVar.f62446d;
                throw null;
            }
            zgVar = zsVar.f62446d;
        }
        if ((iIntValue5 & 4) != 0) {
            int i17 = f62442k;
            int i18 = i17 ^ 107;
            int i19 = -(-((i17 & 107) << 1));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = i20 % 128;
            f62441j = i21;
            int i22 = i20 % 2;
            yk ykVar2 = zsVar.f62447e;
            if (i22 != 0) {
                int i23 = 73 / 0;
            }
            int i24 = i21 + 103;
            f62442k = i24 % 128;
            int i25 = i24 % 2;
            ykVar = ykVar2;
        }
        if ((iIntValue5 & 8) != 0) {
            int i26 = f62441j + 19;
            int i27 = i26 % 128;
            f62442k = i27;
            int i28 = i26 % 2;
            iIntValue2 = zsVar.f62448f;
            int i29 = i27 & 63;
            int i30 = i29 + ((i27 ^ 63) | i29);
            f62441j = i30 % 128;
            int i31 = i30 % 2;
        }
        if ((iIntValue5 & 16) != 0) {
            int i32 = f62442k;
            int i33 = ((i32 | 15) << 1) - (((~i32) & 15) | (i32 & (-16)));
            int i34 = i33 % 128;
            f62441j = i34;
            if (i33 % 2 != 0) {
                iIntValue3 = zsVar.f62449g;
                int i35 = 47 / 0;
            } else {
                iIntValue3 = zsVar.f62449g;
            }
            int i36 = ((i34 | 37) << 1) - (i34 ^ 37);
            f62442k = i36 % 128;
            int i37 = i36 % 2;
        }
        if ((iIntValue5 & 32) != 0) {
            int i38 = f62441j;
            int i39 = (i38 & (-30)) | ((~i38) & 29);
            int i40 = (i38 & 29) << 1;
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            f62442k = i41 % 128;
            int i42 = i41 % 2;
            int i43 = zsVar.f62450h;
            if (i42 == 0) {
                int i44 = 99 / 0;
            }
            iIntValue4 = i43;
        }
        zs zsVar2 = (zs) setCompoundDrawableTintBlendMode(new Object[]{zsVar, Integer.valueOf(iIntValue), zgVar, ykVar, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)}, -1627844969, 1627844972, iIntValue);
        int i45 = f62442k;
        int i46 = i45 & 115;
        int i47 = -(-(i45 | 115));
        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
        f62441j = i48 % 128;
        if (i48 % 2 == 0) {
            return zsVar2;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:30:0x01be  */
    /* JADX WARN: Code duplicated, block: B:31:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:36:0x0266  */
    /* JADX WARN: Code duplicated, block: B:38:0x02be  */
    /* JADX WARN: Code duplicated, block: B:40:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x035f  */
    /* JADX WARN: Code duplicated, block: B:47:0x04c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0548  */
    /* JADX WARN: Code duplicated, block: B:53:0x0560  */
    /* JADX WARN: Code duplicated, block: B:56:0x0591  */
    /* JADX WARN: Code duplicated, block: B:59:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x05be  */
    /* JADX WARN: Code duplicated, block: B:62:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0619  */
    /* JADX WARN: Code duplicated, block: B:71:0x0630  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        zi ziVar;
        int i13;
        boolean z10;
        boolean z11;
        zg zgVar;
        List<yl> list;
        int i14;
        int i15;
        zs zsVar;
        yl ylVar;
        yr x4;
        int i16;
        Object[] objArr2;
        int i17;
        boolean z12;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zk zkVar;
        switch ((((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628)) {
            case 1:
                return a(objArr);
            case 2:
                zs zsVar2 = (zs) objArr[0];
                int i23 = f62441j;
                int i24 = i23 ^ 71;
                int i25 = (i23 & 71) << 1;
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f62442k = i26 % 128;
                int i27 = i26 % 2;
                zj zjVar = zsVar2.f62443a;
                if (i27 != 0) {
                    return zjVar;
                }
                int i28 = 38 / 0;
                return zjVar;
            case 3:
                zs zsVar3 = (zs) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                zg zgVar2 = (zg) objArr[2];
                yk ykVar = (yk) objArr[3];
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int iIntValue3 = ((Number) objArr[5]).intValue();
                int iIntValue4 = ((Number) objArr[6]).intValue();
                Intrinsics.checkNotNullParameter(ykVar, "");
                zs zsVar4 = new zs(zsVar3.f62443a, zsVar3.f62444b, iIntValue, zgVar2, ykVar, iIntValue2, iIntValue3, iIntValue4);
                int i29 = f62442k;
                int i30 = ((i29 | 121) << 1) - (i29 ^ 121);
                f62441j = i30 % 128;
                if (i30 % 2 == 0) {
                    return zsVar4;
                }
                throw null;
            case 4:
                zs zsVar5 = (zs) objArr[0];
                int i31 = f62442k;
                int i32 = (i31 & (-10)) | ((~i31) & 9);
                int i33 = (i31 & 9) << 1;
                int i34 = (i32 & i33) + (i33 | i32);
                f62441j = i34 % 128;
                int i35 = i34 % 2;
                zg zgVar3 = zsVar5.f62446d;
                if (i35 == 0) {
                    return zgVar3;
                }
                int i36 = 37 / 0;
                return zgVar3;
            case 5:
                zs zsVar6 = (zs) objArr[0];
                int i37 = f62442k;
                int i38 = i37 & 57;
                int i39 = -(-((i37 ^ 57) | i38));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                int i41 = i40 % 128;
                f62441j = i41;
                if (i40 % 2 != 0) {
                    int i42 = zsVar6.f62448f;
                    throw null;
                }
                int i43 = zsVar6.f62448f;
                int i44 = i41 & 105;
                int i45 = ((i41 ^ 105) | i44) << 1;
                int i46 = -((i41 | 105) & (~i44));
                int i47 = (i45 & i46) + (i46 | i45);
                f62442k = i47 % 128;
                if (i47 % 2 != 0) {
                    return Integer.valueOf(i43);
                }
                throw null;
            case 6:
                zs zsVar7 = (zs) objArr[0];
                int i48 = f62442k;
                int i49 = (i48 & 89) + (i48 | 89);
                int i50 = i49 % 128;
                f62441j = i50;
                int i51 = i49 % 2;
                zj zjVar2 = zsVar7.f62443a;
                if (i51 != 0) {
                    throw null;
                }
                int i52 = i50 & 13;
                int i53 = i52 + ((i50 ^ 13) | i52);
                f62442k = i53 % 128;
                int i54 = i53 % 2;
                return zjVar2;
            case 7:
                zs zsVar8 = (zs) objArr[0];
                int i55 = f62442k;
                int i56 = i55 & 3;
                int i57 = (i55 | 3) & (~i56);
                int i58 = i56 << 1;
                int i59 = (i57 & i58) + (i57 | i58);
                int i60 = i59 % 128;
                f62441j = i60;
                if (i59 % 2 != 0) {
                    zg zgVar4 = zsVar8.f62446d;
                    throw null;
                }
                zg zgVar5 = zsVar8.f62446d;
                if (zgVar5 == null) {
                    int i61 = i60 & 93;
                    int i62 = (i60 ^ 93) | i61;
                    int i63 = (i61 & i62) + (i62 | i61);
                    f62442k = i63 % 128;
                    int i64 = i63 % 2;
                    ziVar = null;
                } else {
                    ziVar = (zi) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar5}, 207615740, -207615736, System.identityHashCode(zgVar5));
                    int i65 = f62441j;
                    int i66 = i65 & 61;
                    int i67 = (i66 - (~((i65 ^ 61) | i66))) - 1;
                    f62442k = i67 % 128;
                    int i68 = i67 % 2;
                }
                int i69 = f62442k;
                int i70 = i69 & 103;
                int i71 = -(-((i69 ^ 103) | i70));
                int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                f62441j = i72 % 128;
                int i73 = i72 % 2;
                return ziVar;
            case 8:
                zs zsVar9 = (zs) objArr[0];
                yk ykVar2 = (yk) objArr[1];
                int i74 = f62441j;
                int i75 = i74 ^ 63;
                int i76 = (i74 & 63) << 1;
                int i77 = (i75 & i76) + (i76 | i75);
                f62442k = i77 % 128;
                if (i77 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(ykVar2, "");
                    int i78 = 31 / 0;
                    if (zsVar9.f62445c < zsVar9.f62444b.size()) {
                        int i79 = f62441j;
                        int i80 = i79 & 61;
                        int i81 = (i79 ^ 61) | i80;
                        i13 = (i80 ^ i81) + ((i81 & i80) << 1);
                        int i82 = i13 % 128;
                        f62442k = i82;
                        if (i13 % 2 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = !z10;
                        int i83 = i82 & 21;
                        int i84 = (i82 ^ 21) | i83;
                        int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                        f62441j = i85 % 128;
                        int i86 = i85 % 2;
                        if (z11) {
                            int i87 = zsVar9.f62451i;
                            int iIdentityHashCode = System.identityHashCode(zsVar9);
                            int i88 = i87 * (-574);
                            int i89 = (-574) & i88;
                            int i90 = (i89 - (~((i88 ^ (-574)) | i89))) - 1;
                            int i91 = ~iIdentityHashCode;
                            int i92 = (-2) ^ i91;
                            int i93 = (-2) & i91;
                            int i94 = ~((i92 ^ i93) | (i92 & i93));
                            int i95 = ~i87;
                            int i96 = i95 & iIdentityHashCode;
                            int i97 = (~i96) & (i95 | iIdentityHashCode);
                            int i98 = ~((i97 ^ i96) | (i97 & i96));
                            int i99 = i94 & i98;
                            int i100 = (i98 | i94) & (~i99);
                            int i101 = ((i99 & i100) | (i100 ^ i99)) * 1150;
                            int i102 = i90 & i101;
                            int i103 = -(-((i101 ^ i90) | i102));
                            int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                            int i105 = i95 ^ iIdentityHashCode;
                            int i106 = (i96 & i105) | (i105 ^ i96);
                            int i107 = ~i106;
                            int i108 = (i106 | i107) & i107;
                            int i109 = (i95 & i91) | ((~i91) & i87);
                            int i110 = i87 & i91;
                            int i111 = ~((i110 & i109) | (i109 ^ i110));
                            int i112 = ((i111 & i108) | ((~i111) & i108) | ((~i108) & i111)) * (-575);
                            int i113 = ((i104 | i112) << 1) - (i112 ^ i104);
                            int i114 = (-2) & iIdentityHashCode;
                            int i115 = (~i114) & ((-2) | iIdentityHashCode);
                            int i116 = ~((i114 & i115) | (i115 ^ i114));
                            int i117 = ~(i91 | 1);
                            int i118 = i116 ^ i117;
                            int i119 = i116 & i117;
                            int i120 = -(-(((i119 & i118) | (i118 ^ i119)) * 575));
                            int i121 = i113 & i120;
                            zsVar9.f62451i = (((i113 ^ i120) | i121) << 1) - ((i120 | i113) & (~i121));
                            zgVar = zsVar9.f62446d;
                            list = zsVar9.f62444b;
                            i14 = zsVar9.f62445c;
                            if (zgVar != null) {
                                int i122 = f62441j;
                                int i123 = i122 & 101;
                                int i124 = (((i122 | 101) & (~i123)) - (~(-(-(i123 << 1))))) - 1;
                                f62442k = i124 % 128;
                                int i125 = i124 % 2;
                                zkVar = (zk) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, -1050463494, 1050463506, System.identityHashCode(zgVar));
                                if (((Boolean) zk.setCompoundDrawableTintBlendMode(new Object[]{zkVar, (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2}, -534472234, 534472239, System.identityHashCode(ykVar2))}, 720874772, -720874765, System.identityHashCode(zkVar))).booleanValue()) {
                                    StringBuilder sb2 = new StringBuilder("network interceptor ");
                                    int iIdentityHashCode2 = System.identityHashCode(zsVar9);
                                    int i126 = -(-(i14 * 561));
                                    int i127 = 559 & i126;
                                    int i128 = ((i126 | 559) & (~i127)) + (i127 << 1);
                                    int i129 = ~iIdentityHashCode2;
                                    int i130 = i129 & (i129 | iIdentityHashCode2);
                                    int i131 = ~i130;
                                    int i132 = -(-((~((i131 & i130) | (i131 ^ i130))) * (-560)));
                                    int i133 = i128 & i132;
                                    int i134 = (((i128 | i132) & (~i133)) - (~(-(-(i133 << 1))))) - 1;
                                    int i135 = ~i14;
                                    int i136 = ~i135;
                                    int i137 = (i136 ^ i135) | (i136 & i135);
                                    int i138 = i137 ^ iIdentityHashCode2;
                                    int i139 = iIdentityHashCode2 & i137;
                                    int i140 = -(-((~((i139 & i138) | (i138 ^ i139))) * (-560)));
                                    int i141 = (i134 ^ i140) + ((i140 & i134) << 1);
                                    int i142 = i130 ^ i14;
                                    int i143 = i130 & i14;
                                    int i144 = ~((i142 & i143) | (i142 ^ i143));
                                    int i145 = ((~i144) & i135) | (i144 & i136);
                                    int i146 = i144 & i135;
                                    int i147 = -(-(((i146 & i145) | (i145 ^ i146)) * 560));
                                    int i148 = i141 ^ i147;
                                    int i149 = ((i147 & i141) | i148) << 1;
                                    int i150 = -i148;
                                    sb2.append(list.get((i149 ^ i150) + ((i149 & i150) << 1)));
                                    sb2.append(" must retain the same host and port");
                                    throw new IllegalStateException(sb2.toString().toString());
                                }
                                if (zsVar9.f62451i == 1) {
                                    int i151 = f62441j;
                                    int i152 = (((i151 & (-16)) | ((~i151) & 15)) - (~((i151 & 15) << 1))) - 1;
                                    f62442k = i152 % 128;
                                    int i153 = i152 % 2;
                                    StringBuilder sb3 = new StringBuilder("network interceptor ");
                                    int iIdentityHashCode3 = System.identityHashCode(zsVar9);
                                    int i154 = (-936) - (~(-(~(-(-(i14 * (-932)))))));
                                    int i155 = ~i14;
                                    int i156 = ~iIdentityHashCode3;
                                    int i157 = (iIdentityHashCode3 | i156) & i156;
                                    int i158 = ~i157;
                                    int i159 = (i158 | i157) & i158;
                                    int i160 = (~i159) & i155;
                                    int i161 = ~i155;
                                    int i162 = i160 | (i159 & i161);
                                    int i163 = i159 & i155;
                                    int i164 = ((i163 & i162) | (i162 ^ i163)) * (-933);
                                    int i165 = i154 ^ i164;
                                    int i166 = (((i154 & i164) | i165) << 1) - i165;
                                    int i167 = (i157 & i155) | (i158 & i155) | (i157 & i161);
                                    int i168 = ~i167;
                                    int i169 = (i167 | i168) & i168;
                                    int i170 = (i155 | i14) & i155;
                                    int i171 = ~i170;
                                    int i172 = ~((i170 & i171) | (i171 ^ i170));
                                    int i173 = (((i169 & i172) | ((~i172) & i169) | ((~i169) & i172)) * 933) + i166;
                                    int i174 = (i155 ^ i14) | (i155 & i14);
                                    int i175 = ~i174;
                                    int i176 = ((i174 | i175) & i175) * 933;
                                    sb3.append(list.get(((i173 | i176) << 1) - (i173 ^ i176)));
                                    sb3.append(" must call proceed() exactly once");
                                    throw new IllegalStateException(sb3.toString().toString());
                                }
                                int i177 = f62441j + 51;
                                int i178 = i177 % 128;
                                f62442k = i178;
                                int i179 = i177 % 2;
                                int i180 = i178 & 61;
                                int i181 = (i178 | 61) & (~i180);
                                int i182 = i180 << 1;
                                int i183 = (i181 & i182) + (i182 | i181);
                                f62441j = i183 % 128;
                                int i184 = i183 % 2;
                            }
                            int iIdentityHashCode4 = System.identityHashCode(zsVar9);
                            int i185 = i14 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                            int i186 = ((~i185) & (-519)) | (i185 & 518);
                            int i187 = -(-((i185 & (-519)) << 1));
                            int i188 = (i186 & i187) + (i187 | i186);
                            i15 = ~i14;
                            int i189 = (-2) & i15;
                            int i190 = (~i189) & ((-2) | i15);
                            int i191 = (i190 & i189) | (i190 ^ i189);
                            int i192 = ~iIdentityHashCode4;
                            int i193 = ~(i191 | i192);
                            int i194 = ~((i14 ^ iIdentityHashCode4) | (i14 & iIdentityHashCode4));
                            int i195 = (((i193 ^ i194) | (i193 & i194)) * 520) + i188;
                            int i196 = i15 & i192;
                            int i197 = (~i196) & (i15 | i192);
                            int i198 = ~((i197 ^ i196) | (i196 & i197));
                            int i199 = iIdentityHashCode4 & 1;
                            int i200 = (iIdentityHashCode4 ^ 1) | i199;
                            int i201 = ~i200;
                            int i202 = i201 & (i200 | i201);
                            int i203 = i198 ^ i202;
                            int i204 = i202 & i198;
                            int i205 = ((i204 & i203) | (i203 ^ i204)) * (-1040);
                            int i206 = i195 & i205;
                            int i207 = i205 | i195;
                            int i208 = (i206 & i207) + (i207 | i206);
                            int i209 = (i192 | iIdentityHashCode4) & i192;
                            int i210 = ~((i209 & (-2)) | ((-2) ^ i209));
                            int i211 = i15 & 1;
                            int i212 = (~i211) & (i15 | 1);
                            int i213 = (i212 ^ i211) | (i211 & i212);
                            int i214 = ~i213;
                            int i215 = (i213 | i214) & i214;
                            int i216 = i210 & i215;
                            int i217 = (i210 | i215) & (~i216);
                            int i218 = (i217 & i216) | (i217 ^ i216);
                            int i219 = (iIdentityHashCode4 & (-2)) | (i192 & 1);
                            int i220 = ~((i219 & i199) | (i219 ^ i199));
                            int i221 = ((~i220) & i218) | ((~i218) & i220);
                            int i222 = i220 & i218;
                            int i223 = -(-(((i222 & i221) | (i221 ^ i222)) * 520));
                            int i224 = ((~i223) & i208) | ((~i208) & i223);
                            int i225 = -(-((i223 & i208) << 1));
                            int i226 = (i224 & i225) + (i225 | i224);
                            zsVar = (zs) setCompoundDrawableTintBlendMode(new Object[]{zsVar9, Integer.valueOf(i226), null, ykVar2, 0, 0, 0, 58}, -711435087, 711435088, i226);
                            ylVar = list.get(i14);
                            x4 = ylVar.setX(zsVar);
                            if (x4 != null) {
                                StringBuilder sb4 = new StringBuilder("interceptor ");
                                sb4.append(ylVar);
                                sb4.append(" returned null");
                                throw new NullPointerException(sb4.toString());
                            }
                            if (zgVar != null) {
                                int i227 = f62441j;
                                int i228 = (i227 ^ 45) + ((i227 & 45) << 1);
                                f62442k = i228 % 128;
                                int i229 = i228 % 2;
                                int iIdentityHashCode5 = System.identityHashCode(zsVar9);
                                int i230 = i14 * (-864);
                                int i231 = 866 ^ i230;
                                int i232 = ((i230 & 866) | i231) << 1;
                                int i233 = -i231;
                                int i234 = (i232 & i233) + (i232 | i233);
                                int i235 = (i14 | i15) & i15;
                                int i236 = ~iIdentityHashCode5;
                                int i237 = (-2) & i236;
                                int i238 = ((-2) | i236) & (~i237);
                                int i239 = ~((i238 & i237) | (i238 ^ i237));
                                int i240 = i235 ^ i239;
                                int i241 = i235 & i239;
                                int i242 = -(~(-(-(((i241 & i240) | (i240 ^ i241)) * (-865)))));
                                int i243 = ((i234 & i242) + (i242 | i234)) - 1;
                                int i244 = -(-((~((iIdentityHashCode5 & 1) | (iIdentityHashCode5 ^ 1))) * 865));
                                int i245 = i243 & i244;
                                int i246 = -(-((i244 ^ i243) | i245));
                                i19 = ((i245 | i246) << 1) - (i246 ^ i245);
                                int i247 = i15 & i236;
                                int i248 = (~i247) & (i15 | i236);
                                int i249 = ~((i247 & i248) | (i248 ^ i247));
                                int i250 = ((~i236) & 1) | i237;
                                int i251 = i236 & 1;
                                int i252 = (i250 & i251) | (i250 ^ i251);
                                int i253 = ~i252;
                                int i254 = (i252 | i253) & i253;
                                i20 = i249 ^ i254;
                                i21 = i249 & i254;
                                if ((((i21 & i20) | (i20 ^ i21)) * 865) + i19 < list.size()) {
                                    i22 = f62441j;
                                    int i255 = i22 & 89;
                                    int i256 = (i255 - (~(-(-((i22 ^ 89) | i255))))) - 1;
                                    f62442k = i256 % 128;
                                    int i257 = i256 % 2;
                                    if (zsVar.f62451i != 1) {
                                        int i258 = i22 + 13;
                                        f62442k = i258 % 128;
                                        int i259 = i258 % 2;
                                        StringBuilder sb5 = new StringBuilder("network interceptor ");
                                        sb5.append(ylVar);
                                        sb5.append(" must call proceed() exactly once");
                                        throw new IllegalStateException(sb5.toString().toString());
                                    }
                                }
                                int i260 = f62442k;
                                i16 = 1;
                                int i261 = (i260 ^ 15) + ((i260 & 15) << 1);
                                f62441j = i261 % 128;
                                int i262 = i261 % 2;
                            } else {
                                i16 = 1;
                            }
                            objArr2 = new Object[i16];
                            objArr2[0] = x4;
                            if (((yn) yr.setX(objArr2, -428621868, 428621887, System.identityHashCode(x4))) != null) {
                                int i263 = f62441j;
                                int i264 = i263 ^ 107;
                                i17 = ((((i263 & 107) | i264) << 1) - (~(-i264))) - 1;
                                f62442k = i17 % 128;
                                if (i17 % 2 == 0) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                int i265 = (i263 ^ 95) + ((i263 & 95) << 1);
                                i18 = i265 % 128;
                                f62442k = i18;
                                int i266 = i265 % 2;
                                if (z12) {
                                    int i267 = (i18 & (-30)) | ((~i18) & 29);
                                    int i268 = (i18 & 29) << 1;
                                    int i269 = (i267 & i268) + (i268 | i267);
                                    f62441j = i269 % 128;
                                    int i270 = i269 % 2;
                                    return x4;
                                }
                            } else {
                                int i271 = f62441j;
                                int i272 = i271 ^ 15;
                                int i273 = -(-((i271 & 15) << 1));
                                int i274 = ((i272 | i273) << 1) - (i273 ^ i272);
                                f62442k = i274 % 128;
                                int i275 = i274 % 2;
                            }
                            StringBuilder sb6 = new StringBuilder("interceptor ");
                            sb6.append(ylVar);
                            sb6.append(" returned a response with no body");
                            throw new IllegalStateException(sb6.toString().toString());
                        }
                    } else {
                        int i276 = f62441j;
                        int i277 = (i276 | 69) << 1;
                        int i278 = -(i276 ^ 69);
                        int i279 = (i277 ^ i278) + ((i278 & i277) << 1);
                        f62442k = i279 % 128;
                        int i280 = i279 % 2;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(ykVar2, "");
                    if (zsVar9.f62445c < zsVar9.f62444b.size()) {
                        int i710 = f62441j;
                        int i810 = i710 & 61;
                        int i811 = (i710 ^ 61) | i810;
                        i13 = (i810 ^ i811) + ((i811 & i810) << 1);
                        int i812 = i13 % 128;
                        f62442k = i812;
                        if (i13 % 2 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = !z10;
                        int i813 = i812 & 21;
                        int i814 = (i812 ^ 21) | i813;
                        int i815 = ((i813 | i814) << 1) - (i814 ^ i813);
                        f62441j = i815 % 128;
                        int i816 = i815 % 2;
                        if (z11) {
                            int i817 = zsVar9.f62451i;
                            int iIdentityHashCode6 = System.identityHashCode(zsVar9);
                            int i818 = i817 * (-574);
                            int i819 = (-574) & i818;
                            int i910 = (i819 - (~((i818 ^ (-574)) | i819))) - 1;
                            int i911 = ~iIdentityHashCode6;
                            int i912 = (-2) ^ i911;
                            int i913 = (-2) & i911;
                            int i914 = ~((i912 ^ i913) | (i912 & i913));
                            int i915 = ~i817;
                            int i916 = i915 & iIdentityHashCode6;
                            int i917 = (~i916) & (i915 | iIdentityHashCode6);
                            int i918 = ~((i917 ^ i916) | (i917 & i916));
                            int i919 = i914 & i918;
                            int i1010 = (i918 | i914) & (~i919);
                            int i1011 = ((i919 & i1010) | (i1010 ^ i919)) * 1150;
                            int i1012 = i910 & i1011;
                            int i1013 = -(-((i1011 ^ i910) | i1012));
                            int i1014 = ((i1012 | i1013) << 1) - (i1013 ^ i1012);
                            int i1015 = i915 ^ iIdentityHashCode6;
                            int i1016 = (i916 & i1015) | (i1015 ^ i916);
                            int i1017 = ~i1016;
                            int i1018 = (i1016 | i1017) & i1017;
                            int i1019 = (i915 & i911) | ((~i911) & i817);
                            int i1110 = i817 & i911;
                            int i1111 = ~((i1110 & i1019) | (i1019 ^ i1110));
                            int i1112 = ((i1111 & i1018) | ((~i1111) & i1018) | ((~i1018) & i1111)) * (-575);
                            int i1113 = ((i1014 | i1112) << 1) - (i1112 ^ i1014);
                            int i1114 = (-2) & iIdentityHashCode6;
                            int i1115 = (~i1114) & ((-2) | iIdentityHashCode6);
                            int i1116 = ~((i1114 & i1115) | (i1115 ^ i1114));
                            int i1117 = ~(i911 | 1);
                            int i1118 = i1116 ^ i1117;
                            int i1119 = i1116 & i1117;
                            int i1210 = -(-(((i1119 & i1118) | (i1118 ^ i1119)) * 575));
                            int i1211 = i1113 & i1210;
                            zsVar9.f62451i = (((i1113 ^ i1210) | i1211) << 1) - ((i1210 | i1113) & (~i1211));
                            zgVar = zsVar9.f62446d;
                            list = zsVar9.f62444b;
                            i14 = zsVar9.f62445c;
                            if (zgVar != null) {
                                int i1212 = f62441j;
                                int i1213 = i1212 & 101;
                                int i1214 = (((i1212 | 101) & (~i1213)) - (~(-(-(i1213 << 1))))) - 1;
                                f62442k = i1214 % 128;
                                int i1215 = i1214 % 2;
                                zkVar = (zk) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, -1050463494, 1050463506, System.identityHashCode(zgVar));
                                if (((Boolean) zk.setCompoundDrawableTintBlendMode(new Object[]{zkVar, (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2}, -534472234, 534472239, System.identityHashCode(ykVar2))}, 720874772, -720874765, System.identityHashCode(zkVar))).booleanValue()) {
                                    StringBuilder sb7 = new StringBuilder("network interceptor ");
                                    int iIdentityHashCode7 = System.identityHashCode(zsVar9);
                                    int i1216 = -(-(i14 * 561));
                                    int i1217 = 559 & i1216;
                                    int i1218 = ((i1216 | 559) & (~i1217)) + (i1217 << 1);
                                    int i1219 = ~iIdentityHashCode7;
                                    int i1310 = i1219 & (i1219 | iIdentityHashCode7);
                                    int i1311 = ~i1310;
                                    int i1312 = -(-((~((i1311 & i1310) | (i1311 ^ i1310))) * (-560)));
                                    int i1313 = i1218 & i1312;
                                    int i1314 = (((i1218 | i1312) & (~i1313)) - (~(-(-(i1313 << 1))))) - 1;
                                    int i1315 = ~i14;
                                    int i1316 = ~i1315;
                                    int i1317 = (i1316 ^ i1315) | (i1316 & i1315);
                                    int i1318 = i1317 ^ iIdentityHashCode7;
                                    int i1319 = iIdentityHashCode7 & i1317;
                                    int i1410 = -(-((~((i1319 & i1318) | (i1318 ^ i1319))) * (-560)));
                                    int i1411 = (i1314 ^ i1410) + ((i1410 & i1314) << 1);
                                    int i1412 = i1310 ^ i14;
                                    int i1413 = i1310 & i14;
                                    int i1414 = ~((i1412 & i1413) | (i1412 ^ i1413));
                                    int i1415 = ((~i1414) & i1315) | (i1414 & i1316);
                                    int i1416 = i1414 & i1315;
                                    int i1417 = -(-(((i1416 & i1415) | (i1415 ^ i1416)) * 560));
                                    int i1418 = i1411 ^ i1417;
                                    int i1419 = ((i1417 & i1411) | i1418) << 1;
                                    int i1510 = -i1418;
                                    sb7.append(list.get((i1419 ^ i1510) + ((i1419 & i1510) << 1)));
                                    sb7.append(" must retain the same host and port");
                                    throw new IllegalStateException(sb7.toString().toString());
                                }
                                if (zsVar9.f62451i == 1) {
                                    int i1511 = f62441j;
                                    int i1512 = (((i1511 & (-16)) | ((~i1511) & 15)) - (~((i1511 & 15) << 1))) - 1;
                                    f62442k = i1512 % 128;
                                    int i1513 = i1512 % 2;
                                    StringBuilder sb8 = new StringBuilder("network interceptor ");
                                    int iIdentityHashCode8 = System.identityHashCode(zsVar9);
                                    int i1514 = (-936) - (~(-(~(-(-(i14 * (-932)))))));
                                    int i1515 = ~i14;
                                    int i1516 = ~iIdentityHashCode8;
                                    int i1517 = (iIdentityHashCode8 | i1516) & i1516;
                                    int i1518 = ~i1517;
                                    int i1519 = (i1518 | i1517) & i1518;
                                    int i1610 = (~i1519) & i1515;
                                    int i1611 = ~i1515;
                                    int i1612 = i1610 | (i1519 & i1611);
                                    int i1613 = i1519 & i1515;
                                    int i1614 = ((i1613 & i1612) | (i1612 ^ i1613)) * (-933);
                                    int i1615 = i1514 ^ i1614;
                                    int i1616 = (((i1514 & i1614) | i1615) << 1) - i1615;
                                    int i1617 = (i1517 & i1515) | (i1518 & i1515) | (i1517 & i1611);
                                    int i1618 = ~i1617;
                                    int i1619 = (i1617 | i1618) & i1618;
                                    int i1710 = (i1515 | i14) & i1515;
                                    int i1711 = ~i1710;
                                    int i1712 = ~((i1710 & i1711) | (i1711 ^ i1710));
                                    int i1713 = (((i1619 & i1712) | ((~i1712) & i1619) | ((~i1619) & i1712)) * 933) + i1616;
                                    int i1714 = (i1515 ^ i14) | (i1515 & i14);
                                    int i1715 = ~i1714;
                                    int i1716 = ((i1714 | i1715) & i1715) * 933;
                                    sb8.append(list.get(((i1713 | i1716) << 1) - (i1713 ^ i1716)));
                                    sb8.append(" must call proceed() exactly once");
                                    throw new IllegalStateException(sb8.toString().toString());
                                }
                                int i1717 = f62441j + 51;
                                int i1718 = i1717 % 128;
                                f62442k = i1718;
                                int i1719 = i1717 % 2;
                                int i1810 = i1718 & 61;
                                int i1811 = (i1718 | 61) & (~i1810);
                                int i1812 = i1810 << 1;
                                int i1813 = (i1811 & i1812) + (i1812 | i1811);
                                f62441j = i1813 % 128;
                                int i1814 = i1813 % 2;
                            }
                            int iIdentityHashCode9 = System.identityHashCode(zsVar9);
                            int i1815 = i14 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                            int i1816 = ((~i1815) & (-519)) | (i1815 & 518);
                            int i1817 = -(-((i1815 & (-519)) << 1));
                            int i1818 = (i1816 & i1817) + (i1817 | i1816);
                            i15 = ~i14;
                            int i1819 = (-2) & i15;
                            int i1910 = (~i1819) & ((-2) | i15);
                            int i1911 = (i1910 & i1819) | (i1910 ^ i1819);
                            int i1912 = ~iIdentityHashCode9;
                            int i1913 = ~(i1911 | i1912);
                            int i1914 = ~((i14 ^ iIdentityHashCode9) | (i14 & iIdentityHashCode9));
                            int i1915 = (((i1913 ^ i1914) | (i1913 & i1914)) * 520) + i1818;
                            int i1916 = i15 & i1912;
                            int i1917 = (~i1916) & (i15 | i1912);
                            int i1918 = ~((i1917 ^ i1916) | (i1916 & i1917));
                            int i1919 = iIdentityHashCode9 & 1;
                            int i2010 = (iIdentityHashCode9 ^ 1) | i1919;
                            int i2011 = ~i2010;
                            int i2012 = i2011 & (i2010 | i2011);
                            int i2013 = i1918 ^ i2012;
                            int i2014 = i2012 & i1918;
                            int i2015 = ((i2014 & i2013) | (i2013 ^ i2014)) * (-1040);
                            int i2016 = i1915 & i2015;
                            int i2017 = i2015 | i1915;
                            int i2018 = (i2016 & i2017) + (i2017 | i2016);
                            int i2019 = (i1912 | iIdentityHashCode9) & i1912;
                            int i2110 = ~((i2019 & (-2)) | ((-2) ^ i2019));
                            int i2111 = i15 & 1;
                            int i2112 = (~i2111) & (i15 | 1);
                            int i2113 = (i2112 ^ i2111) | (i2111 & i2112);
                            int i2114 = ~i2113;
                            int i2115 = (i2113 | i2114) & i2114;
                            int i2116 = i2110 & i2115;
                            int i2117 = (i2110 | i2115) & (~i2116);
                            int i2118 = (i2117 & i2116) | (i2117 ^ i2116);
                            int i2119 = (iIdentityHashCode9 & (-2)) | (i1912 & 1);
                            int i2210 = ~((i2119 & i1919) | (i2119 ^ i1919));
                            int i2211 = ((~i2210) & i2118) | ((~i2118) & i2210);
                            int i2212 = i2210 & i2118;
                            int i2213 = -(-(((i2212 & i2211) | (i2211 ^ i2212)) * 520));
                            int i2214 = ((~i2213) & i2018) | ((~i2018) & i2213);
                            int i2215 = -(-((i2213 & i2018) << 1));
                            int i2216 = (i2214 & i2215) + (i2215 | i2214);
                            zsVar = (zs) setCompoundDrawableTintBlendMode(new Object[]{zsVar9, Integer.valueOf(i2216), null, ykVar2, 0, 0, 0, 58}, -711435087, 711435088, i2216);
                            ylVar = list.get(i14);
                            x4 = ylVar.setX(zsVar);
                            if (x4 != null) {
                                StringBuilder sb9 = new StringBuilder("interceptor ");
                                sb9.append(ylVar);
                                sb9.append(" returned null");
                                throw new NullPointerException(sb9.toString());
                            }
                            if (zgVar != null) {
                                int i2217 = f62441j;
                                int i2218 = (i2217 ^ 45) + ((i2217 & 45) << 1);
                                f62442k = i2218 % 128;
                                int i2219 = i2218 % 2;
                                int iIdentityHashCode10 = System.identityHashCode(zsVar9);
                                int i2310 = i14 * (-864);
                                int i2311 = 866 ^ i2310;
                                int i2312 = ((i2310 & 866) | i2311) << 1;
                                int i2313 = -i2311;
                                int i2314 = (i2312 & i2313) + (i2312 | i2313);
                                int i2315 = (i14 | i15) & i15;
                                int i2316 = ~iIdentityHashCode10;
                                int i2317 = (-2) & i2316;
                                int i2318 = ((-2) | i2316) & (~i2317);
                                int i2319 = ~((i2318 & i2317) | (i2318 ^ i2317));
                                int i2410 = i2315 ^ i2319;
                                int i2411 = i2315 & i2319;
                                int i2412 = -(~(-(-(((i2411 & i2410) | (i2410 ^ i2411)) * (-865)))));
                                int i2413 = ((i2314 & i2412) + (i2412 | i2314)) - 1;
                                int i2414 = -(-((~((iIdentityHashCode10 & 1) | (iIdentityHashCode10 ^ 1))) * 865));
                                int i2415 = i2413 & i2414;
                                int i2416 = -(-((i2414 ^ i2413) | i2415));
                                i19 = ((i2415 | i2416) << 1) - (i2416 ^ i2415);
                                int i2417 = i15 & i2316;
                                int i2418 = (~i2417) & (i15 | i2316);
                                int i2419 = ~((i2417 & i2418) | (i2418 ^ i2417));
                                int i2510 = ((~i2316) & 1) | i2317;
                                int i2511 = i2316 & 1;
                                int i2512 = (i2510 & i2511) | (i2510 ^ i2511);
                                int i2513 = ~i2512;
                                int i2514 = (i2512 | i2513) & i2513;
                                i20 = i2419 ^ i2514;
                                i21 = i2419 & i2514;
                                if ((((i21 & i20) | (i20 ^ i21)) * 865) + i19 < list.size()) {
                                    i22 = f62441j;
                                    int i2515 = i22 & 89;
                                    int i2516 = (i2515 - (~(-(-((i22 ^ 89) | i2515))))) - 1;
                                    f62442k = i2516 % 128;
                                    int i2517 = i2516 % 2;
                                    if (zsVar.f62451i != 1) {
                                        int i2518 = i22 + 13;
                                        f62442k = i2518 % 128;
                                        int i2519 = i2518 % 2;
                                        StringBuilder sb10 = new StringBuilder("network interceptor ");
                                        sb10.append(ylVar);
                                        sb10.append(" must call proceed() exactly once");
                                        throw new IllegalStateException(sb10.toString().toString());
                                    }
                                }
                                int i2610 = f62442k;
                                i16 = 1;
                                int i2611 = (i2610 ^ 15) + ((i2610 & 15) << 1);
                                f62441j = i2611 % 128;
                                int i2612 = i2611 % 2;
                            } else {
                                i16 = 1;
                            }
                            objArr2 = new Object[i16];
                            objArr2[0] = x4;
                            if (((yn) yr.setX(objArr2, -428621868, 428621887, System.identityHashCode(x4))) != null) {
                                int i2613 = f62441j;
                                int i2614 = i2613 ^ 107;
                                i17 = ((((i2613 & 107) | i2614) << 1) - (~(-i2614))) - 1;
                                f62442k = i17 % 128;
                                if (i17 % 2 == 0) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                int i2615 = (i2613 ^ 95) + ((i2613 & 95) << 1);
                                i18 = i2615 % 128;
                                f62442k = i18;
                                int i2616 = i2615 % 2;
                                if (z12) {
                                    int i2617 = (i18 & (-30)) | ((~i18) & 29);
                                    int i2618 = (i18 & 29) << 1;
                                    int i2619 = (i2617 & i2618) + (i2618 | i2617);
                                    f62441j = i2619 % 128;
                                    int i2710 = i2619 % 2;
                                    return x4;
                                }
                            } else {
                                int i2711 = f62441j;
                                int i2712 = i2711 ^ 15;
                                int i2713 = -(-((i2711 & 15) << 1));
                                int i2714 = ((i2712 | i2713) << 1) - (i2713 ^ i2712);
                                f62442k = i2714 % 128;
                                int i2715 = i2714 % 2;
                            }
                            StringBuilder sb11 = new StringBuilder("interceptor ");
                            sb11.append(ylVar);
                            sb11.append(" returned a response with no body");
                            throw new IllegalStateException(sb11.toString().toString());
                        }
                    } else {
                        int i2716 = f62441j;
                        int i2717 = (i2716 | 69) << 1;
                        int i2718 = -(i2716 ^ 69);
                        int i2719 = (i2717 ^ i2718) + ((i2718 & i2717) << 1);
                        f62442k = i2719 % 128;
                        int i281 = i2719 % 2;
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            case 9:
                zs zsVar10 = (zs) objArr[0];
                int iIdentityHashCode11 = System.identityHashCode(zsVar10);
                int i282 = (-1028680497) & iIdentityHashCode11;
                int i283 = ((~(i282 | ((~i282) & ((-1028680497) | iIdentityHashCode11)))) * 216) + 1054282072;
                int i284 = ~iIdentityHashCode11;
                int i285 = (-139469617) & i284;
                int i286 = ((-139469617) | i284) & (~i285);
                int i287 = (-2) - (((i283 - (~(-(~(-(-(((i286 & i285) | (i286 ^ i285)) * (-216)))))))) - 1) ^ (-1));
                int i288 = (1028680496 & i284) | ((~i284) & (-1028680497));
                int i289 = i284 & (-1028680497);
                int i290 = ~((i289 & i288) | (i288 ^ i289));
                int i291 = (i287 - (~(((i290 & (-923293703)) | (((~i290) & (-923293703)) | (923293702 & i290))) * 216))) - 1;
                System.identityHashCode(zsVar10);
                yk ykVar3 = zsVar10.f62447e;
                if (i291 > 1272217127) {
                    throw null;
                }
                int i292 = f62442k;
                int i293 = i292 ^ 11;
                int i294 = ((i292 & 11) | i293) << 1;
                int i295 = -i293;
                int i296 = (i294 & i295) + (i294 | i295);
                f62441j = i296 % 128;
                int i297 = i296 % 2;
                return ykVar3;
            case 10:
                zs zsVar11 = (zs) objArr[0];
                int i298 = f62441j;
                int i299 = i298 + 59;
                f62442k = i299 % 128;
                int i300 = i299 % 2;
                int i301 = zsVar11.f62449g;
                int i302 = ((i298 ^ 29) | (i298 & 29)) << 1;
                int i303 = -(((~i298) & 29) | (i298 & (-30)));
                int i304 = ((i302 | i303) << 1) - (i303 ^ i302);
                f62442k = i304 % 128;
                if (i304 % 2 != 0) {
                    return Integer.valueOf(i301);
                }
                throw null;
            case 11:
                zs zsVar12 = (zs) objArr[0];
                int i305 = f62442k;
                int i306 = ((i305 ^ 75) | (i305 & 75)) << 1;
                int i307 = ~i305;
                int i308 = -((i305 & (-76)) | (75 & i307));
                int i309 = (i306 & i308) + (i306 | i308);
                f62441j = i309 % 128;
                int i310 = i309 % 2;
                yk ykVar4 = zsVar12.f62447e;
                int i311 = ((i305 ^ 103) | (i305 & 103)) << 1;
                int i312 = -((i305 & (-104)) | (i307 & 103));
                int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                f62441j = i313 % 128;
                if (i313 % 2 == 0) {
                    return ykVar4;
                }
                throw null;
            case 12:
                zs zsVar13 = (zs) objArr[0];
                int i314 = f62442k;
                int i315 = ((i314 ^ 103) | (i314 & 103)) << 1;
                int i316 = -(((~i314) & 103) | (i314 & (-104)));
                int i317 = (i315 ^ i316) + ((i316 & i315) << 1);
                int i318 = i317 % 128;
                f62441j = i318;
                int i319 = i317 % 2;
                int i320 = zsVar13.f62450h;
                int i321 = ((i318 | 90) << 1) - (i318 ^ 90);
                int i322 = (i321 ^ (-1)) + (i321 << 1);
                f62442k = i322 % 128;
                int i323 = i322 % 2;
                return Integer.valueOf(i320);
            default:
                zs zsVar14 = (zs) objArr[0];
                int i324 = f62441j;
                int i325 = (-2) - (((i324 ^ 74) + ((i324 & 74) << 1)) ^ (-1));
                f62442k = i325 % 128;
                int i326 = i325 % 2;
                int i327 = zsVar14.f62449g;
                int i328 = ((i324 ^ 15) | (i324 & 15)) << 1;
                int i329 = -(((~i324) & 15) | (i324 & (-16)));
                int i330 = (i328 & i329) + (i329 | i328);
                f62442k = i330 % 128;
                if (i330 % 2 != 0) {
                    return Integer.valueOf(i327);
                }
                throw null;
        }
    }

    public final int getNavBarTitleString() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -71337801, 71337801, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.i.yl.setCompoundDrawableTintBlendMode
    @NotNull
    public final yr setDividerPadding(@NotNull yk ykVar) throws IOException {
        return (yr) setCompoundDrawableTintBlendMode(new Object[]{this, ykVar}, -173228024, 173228032, System.identityHashCode(this));
    }

    public final int setLayoutAnimation() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1387657808, -1387657796, System.identityHashCode(this))).intValue();
    }

    public final int setNavigationOnClickListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1546537127, 1546537132, System.identityHashCode(this))).intValue();
    }

    public final int setOnDragListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -579721864, 579721874, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.i.yl.setCompoundDrawableTintBlendMode
    @NotNull
    public final xp setOnFocusChangeListener() {
        return (xp) setCompoundDrawableTintBlendMode(new Object[]{this}, 2021019107, -2021019101, System.identityHashCode(this));
    }

    @NotNull
    public final yk setOnLongClickListener() {
        return (yk) setCompoundDrawableTintBlendMode(new Object[]{this}, 541338608, -541338597, System.identityHashCode(this));
    }

    @NotNull
    public final zj setX() {
        return (zj) setCompoundDrawableTintBlendMode(new Object[]{this}, 155528025, -155528023, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.yl.setCompoundDrawableTintBlendMode
    @Nullable
    public final xx setY() {
        return (xx) setCompoundDrawableTintBlendMode(new Object[]{this}, 705957687, -705957680, System.identityHashCode(this));
    }

    public static /* synthetic */ zs setOnFocusChangeListener(zs zsVar, int i10, zg zgVar, yk ykVar, int i11, int i12, int i13, int i14) {
        return (zs) setCompoundDrawableTintBlendMode(new Object[]{zsVar, Integer.valueOf(i10), zgVar, ykVar, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)}, -711435087, 711435088, i10);
    }

    @Nullable
    public final zg setDividerPadding() {
        return (zg) setCompoundDrawableTintBlendMode(new Object[]{this}, -263191743, 263191747, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.yl.setCompoundDrawableTintBlendMode
    @NotNull
    public final yk setCompoundDrawableTintBlendMode() {
        return (yk) setCompoundDrawableTintBlendMode(new Object[]{this}, -796678128, 796678137, System.identityHashCode(this));
    }
}
