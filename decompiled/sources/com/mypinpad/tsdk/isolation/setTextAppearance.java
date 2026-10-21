package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setTextAppearance extends c implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60629j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f60630k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final j f60631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final f f60632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final l f60633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final getBeepOnFailure f60634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final byte[] f60635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public getINVALID_MERCHANT_IDannotations f60636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final setMaxWidth f60637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public String f60638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final b f60639i;

    public setTextAppearance(@Nullable j jVar, @Nullable f fVar, @Nullable l lVar, @Nullable getBeepOnFailure getbeeponfailure, @NotNull byte[] bArr, @Nullable getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations, @Nullable setMaxWidth setmaxwidth, @NotNull String str) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f60631a = jVar;
        this.f60632b = fVar;
        this.f60633c = lVar;
        this.f60634d = getbeeponfailure;
        this.f60635e = bArr;
        this.f60636f = getinvalid_merchant_idannotations;
        this.f60637g = setmaxwidth;
        this.f60638h = str;
        this.f60639i = b.setX;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object obj;
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        switch ((((~(i10 | i11)) | (~(i15 | i11)) | (~(i13 | i14))) * 494) + ((i11 | i14 | i15) * 494) + ((i10 | i13) * (-988)) + (i11 * (-493)) + (i10 * 495)) {
            case 1:
                setTextAppearance settextappearance = (setTextAppearance) objArr[0];
                int i16 = f60629j;
                int i17 = i16 & 33;
                int i18 = ((i16 ^ 33) | i17) << 1;
                int i19 = -((~i17) & (i16 | 33));
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                f60630k = i20 % 128;
                int i21 = i20 % 2;
                byte[] bArr = settextappearance.f60635e;
                int i22 = i16 + 19;
                f60630k = i22 % 128;
                if (i22 % 2 != 0) {
                    return bArr;
                }
                int i23 = 78 / 0;
                return bArr;
            case 2:
                setTextAppearance settextappearance2 = (setTextAppearance) objArr[0];
                getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr = new getDetailsFieldTextSizeSp[5];
                getINVALID_MERCHANT_IDannotations getinvalid_merchant_idannotations = settextappearance2.f60636f;
                getdetailsfieldtextsizespArr[0] = getinvalid_merchant_idannotations != null ? getCause.setDividerPadding(getinvalid_merchant_idannotations) : null;
                getdetailsfieldtextsizespArr[1] = setInputExtras.setNavigationOnClickListener(settextappearance2.f60635e);
                getdetailsfieldtextsizespArr[2] = settextappearance2.f60633c;
                getdetailsfieldtextsizespArr[3] = settextappearance2.f60631a;
                getdetailsfieldtextsizespArr[4] = settextappearance2.f60632b;
                TerminalLogger terminalLogger = new TerminalLogger(getdetailsfieldtextsizespArr, "|");
                return (String) TerminalLogger.setOnFocusChangeListener(new Object[]{terminalLogger}, -1352067446, 1352067446, System.identityHashCode(terminalLogger));
            case 3:
                setTextAppearance settextappearance3 = (setTextAppearance) objArr[0];
                int i24 = f60630k;
                int i25 = i24 & 5;
                int i26 = i24 | 5;
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                int i28 = i27 % 128;
                f60629j = i28;
                int i29 = i27 % 2;
                obj = settextappearance3.f60636f;
                int i30 = i28 ^ 21;
                int i31 = ((i28 & 21) | i30) << 1;
                int i32 = -i30;
                int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                f60630k = i33 % 128;
                if (i33 % 2 == 0) {
                    throw null;
                }
                break;
            case 4:
                setTextAppearance settextappearance4 = (setTextAppearance) objArr[0];
                int i34 = f60629j;
                int i35 = i34 + 56;
                int i36 = (i35 ^ (-1)) + (i35 << 1);
                f60630k = i36 % 128;
                int i37 = i36 % 2;
                obj = settextappearance4.f60639i;
                if (i37 == 0) {
                    throw null;
                }
                int i38 = i34 ^ 45;
                int i39 = (i34 & 45) << 1;
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                f60630k = i40 % 128;
                if (i40 % 2 == 0) {
                    throw null;
                }
                break;
            case 5:
                setTextAppearance settextappearance5 = (setTextAppearance) objArr[0];
                int i41 = f60630k;
                int i42 = ((i41 & 1) - (~(i41 | 1))) - 1;
                f60629j = i42 % 128;
                int i43 = i42 % 2;
                String str = settextappearance5.f60638h;
                int i44 = ((i41 & 57) - (~(-(-(i41 | 57))))) - 1;
                f60629j = i44 % 128;
                int i45 = i44 % 2;
                return str;
            case 6:
                setTextAppearance settextappearance6 = (setTextAppearance) objArr[0];
                int i46 = f60629j;
                int i47 = i46 & 89;
                int i48 = (i46 | 89) & (~i47);
                int i49 = -(-(i47 << 1));
                int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
                int i51 = i50 % 128;
                f60630k = i51;
                if (i50 % 2 == 0) {
                    l lVar = settextappearance6.f60633c;
                    throw null;
                }
                l lVar2 = settextappearance6.f60633c;
                if (lVar2 != null) {
                    int i52 = i51 & 121;
                    int i53 = (i51 | 121) & (~i52);
                    int i54 = -(-(i52 << 1));
                    int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
                    f60629j = i55 % 128;
                    if (i55 % 2 != 0) {
                        l.setX(new Object[]{lVar2}, 1961577412, -1961577406, System.identityHashCode(lVar2));
                        int i56 = 66 / 0;
                    } else {
                        l.setX(new Object[]{lVar2}, 1961577412, -1961577406, System.identityHashCode(lVar2));
                    }
                }
                f fVar = settextappearance6.f60632b;
                if (fVar != null) {
                    int i57 = f60630k;
                    int i58 = i57 & 121;
                    int i59 = ((i57 ^ 121) | i58) << 1;
                    int i60 = -((i57 | 121) & (~i58));
                    int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                    f60629j = i61 % 128;
                    int i62 = i61 % 2;
                    f.setOnFocusChangeListener(new Object[]{fVar}, 1929394231, -1929394230, System.identityHashCode(fVar));
                    int i63 = f60630k;
                    int i64 = ((i63 ^ 85) | (i63 & 85)) << 1;
                    int i65 = -(((~i63) & 85) | (i63 & (-86)));
                    int i66 = (i64 & i65) + (i65 | i64);
                    f60629j = i66 % 128;
                    int i67 = i66 % 2;
                }
                j jVar = settextappearance6.f60631a;
                if (jVar != null) {
                    int i68 = f60629j;
                    int i69 = i68 & 17;
                    int i70 = (i68 | 17) & (~i69);
                    int i71 = i69 << 1;
                    int i72 = (i70 & i71) + (i70 | i71);
                    f60630k = i72 % 128;
                    if (i72 % 2 == 0) {
                        j.setDividerPadding(new Object[]{jVar}, 449840060, -449840059, System.identityHashCode(jVar));
                        throw null;
                    }
                    j.setDividerPadding(new Object[]{jVar}, 449840060, -449840059, System.identityHashCode(jVar));
                }
                getBeepOnFailure getbeeponfailure = settextappearance6.f60634d;
                if (getbeeponfailure != null) {
                    int i73 = (-2) - ((f60630k + 92) ^ (-1));
                    f60629j = i73 % 128;
                    int i74 = i73 % 2;
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure));
                    int i75 = f60630k;
                    int i76 = ((((i75 ^ 71) | (i75 & 71)) << 1) - (~(-(((~i75) & 71) | (i75 & (-72)))))) - 1;
                    f60629j = i76 % 128;
                    int i77 = i76 % 2;
                }
                setRemoteViewsAdapter.setX(new Object[]{settextappearance6.f60635e}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                settextappearance6.f60636f = null;
                setMaxWidth setmaxwidth = settextappearance6.f60637g;
                if (setmaxwidth != null) {
                    int iIdentityHashCode = System.identityHashCode(settextappearance6);
                    int i78 = ~iIdentityHashCode;
                    int i79 = (729804280 & i78) | ((~i78) & (-729804281));
                    int i80 = i78 & (-729804281);
                    int i81 = (i79 & i80) | (i79 ^ i80);
                    int i82 = ((-4737161) & i81) | ((~i81) & 4737160);
                    int i83 = i81 & 4737160;
                    int i84 = -(-(((i83 & i82) | (i82 ^ i83)) * 1444));
                    int i85 = 1323402274 & i84;
                    int i86 = (i84 | 1323402274) & (~i85);
                    int i87 = -(-(i85 << 1));
                    int i88 = (i86 ^ i87) + ((i86 & i87) << 1);
                    int i89 = ~(((-559933593) & iIdentityHashCode) | ((-559933593) ^ iIdentityHashCode));
                    int i90 = (i89 & 4737160) | (4737160 ^ i89);
                    int i91 = (i78 & (-174607849)) | (174607848 & iIdentityHashCode);
                    int i92 = iIdentityHashCode & (-174607849);
                    int i93 = (i92 & i91) | (i91 ^ i92);
                    int i94 = ~i93;
                    int i95 = (i93 | i94) & i94;
                    int i96 = (i88 - (~(((i95 & i90) | (i90 ^ i95)) * (-1444)))) - 1;
                    int i97 = ((i96 & (-487549472)) - (~(-(-((-487549472) | i96))))) - 1;
                    int iIdentityHashCode2 = System.identityHashCode(settextappearance6);
                    int i98 = (-348900301) & iIdentityHashCode2;
                    int i99 = ((-348900301) | iIdentityHashCode2) & (~i98);
                    int i100 = (i99 & i98) | (i99 ^ i98);
                    int i101 = ~i100;
                    int i102 = (i100 | i101) & i101;
                    int i103 = ((~i102) & 277006668) | ((-277006669) & i102);
                    int i104 = i102 & 277006668;
                    int i105 = -(-(((i104 & i103) | (i103 ^ i104)) * (-140)));
                    int i106 = (((-1987486669) ^ i105) | ((-1987486669) & i105)) << 1;
                    int i107 = -((i105 & 1987486668) | ((-1987486669) & (~i105)));
                    int i108 = (i106 & i107) + (i107 | i106);
                    int i109 = (-71893633) ^ iIdentityHashCode2;
                    int i110 = (-71893633) & iIdentityHashCode2;
                    int i111 = (i110 & i109) | (i109 ^ i110);
                    int i112 = ~i111;
                    int i113 = ((i111 | i112) & i112) * 70;
                    int i114 = ((~i113) & i108) | ((~i108) & i113);
                    int i115 = (i113 & i108) << 1;
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    int i117 = ~((iIdentityHashCode2 & (-609034882)) | ((-609034882) ^ iIdentityHashCode2));
                    int i118 = ((i117 & 814147917) | (814147917 ^ i117)) * 70;
                    int i119 = ((~i118) & i116) | ((~i116) & i118);
                    int i120 = (i118 & i116) << 1;
                    if (i97 <= ((i119 | i120) << 1) - (i120 ^ i119)) {
                        setMaxWidth.setX(new Object[]{setmaxwidth}, 1900601062, -1900601058, System.identityHashCode(setmaxwidth));
                        throw null;
                    }
                    setMaxWidth.setX(new Object[]{setmaxwidth}, 1900601062, -1900601058, System.identityHashCode(setmaxwidth));
                    int i121 = f60629j + 103;
                    f60630k = i121 % 128;
                    int i122 = i121 % 2;
                }
                settextappearance6.f60638h = "";
                int i123 = f60629j;
                int i124 = (i123 ^ 51) + ((i123 & 51) << 1);
                f60630k = i124 % 128;
                if (i124 % 2 != 0) {
                    return null;
                }
                throw null;
            case 7:
                setTextAppearance settextappearance7 = (setTextAppearance) objArr[0];
                int i125 = f60630k;
                int i126 = i125 & 61;
                int i127 = (i125 ^ 61) | i126;
                int i128 = (i126 & i127) + (i126 | i127);
                f60629j = i128 % 128;
                int i129 = i128 % 2;
                getBeepOnFailure getbeeponfailure2 = settextappearance7.f60634d;
                int i130 = (i125 & (-72)) | ((~i125) & 71);
                int i131 = -(-((i125 & 71) << 1));
                int i132 = (i130 ^ i131) + ((i130 & i131) << 1);
                f60629j = i132 % 128;
                int i133 = i132 % 2;
                return getbeeponfailure2;
            case 8:
                setTextAppearance settextappearance8 = (setTextAppearance) objArr[0];
                int i134 = f60629j;
                int i135 = ((i134 & 62) + (i134 | 62)) - 1;
                int i136 = i135 % 128;
                f60630k = i136;
                int i137 = i135 % 2;
                l lVar3 = settextappearance8.f60633c;
                int i138 = i136 + 120;
                int i139 = (i138 ^ (-1)) + (i138 << 1);
                f60629j = i139 % 128;
                int i140 = i139 % 2;
                return lVar3;
            case 9:
                setTextAppearance settextappearance9 = (setTextAppearance) objArr[0];
                int i141 = f60629j;
                int i142 = i141 + 75;
                f60630k = i142 % 128;
                int i143 = i142 % 2;
                obj = settextappearance9.f60637g;
                int i144 = ((i141 & 56) + (i141 | 56)) - 1;
                f60630k = i144 % 128;
                if (i144 % 2 == 0) {
                    throw null;
                }
                break;
            case 10:
                setTextAppearance settextappearance10 = (setTextAppearance) objArr[0];
                int i145 = f60629j;
                int i146 = i145 ^ 51;
                int i147 = ((i145 & 51) | i146) << 1;
                int i148 = -i146;
                int i149 = ((i147 | i148) << 1) - (i147 ^ i148);
                f60630k = i149 % 128;
                int i150 = i149 % 2;
                obj = settextappearance10.f60631a;
                if (i150 == 0) {
                    int i151 = 49 / 0;
                }
                break;
            default:
                setTextAppearance settextappearance11 = (setTextAppearance) objArr[0];
                int iIdentityHashCode3 = System.identityHashCode(settextappearance11);
                int i152 = ~iIdentityHashCode3;
                int i153 = (iIdentityHashCode3 | i152) & i152;
                int i154 = i153 & (-1727898744);
                int i155 = (i153 | (-1727898744)) & (~i154);
                int i156 = ~((i155 & i154) | (i155 ^ i154));
                int i157 = 151014144 & i156;
                int i158 = (i156 | 151014144) & (~i157);
                int i159 = ((i158 & i157) | (i158 ^ i157)) * (-970);
                int i160 = ((917010548 ^ i159) | (917010548 & i159)) << 1;
                int i161 = -((i159 & (-917010549)) | (917010548 & (~i159)));
                int i162 = (i160 ^ i161) + ((i161 & i160) << 1);
                int i163 = i162 & (-2012832176);
                int i164 = i163 + (((-2012832176) ^ i162) | i163);
                int i165 = i152 ^ (-1727898744);
                int i166 = i152 & (-1727898744);
                int i167 = ~((i165 & i166) | (i165 ^ i166));
                int i168 = -(-(((i167 & (-1878912888)) | ((-1878912888) ^ i167)) * 970));
                int i169 = ((((i164 ^ i168) | (i164 & i168)) << 1) - (~(-((i168 & (~i164)) | ((~i168) & i164))))) - 1;
                int iIdentityHashCode4 = System.identityHashCode(settextappearance11);
                int i170 = ((~iIdentityHashCode4) & (-1643164406)) | (1643164405 & iIdentityHashCode4);
                int i171 = (-1643164406) & iIdentityHashCode4;
                int i172 = (i170 & i171) | (i170 ^ i171);
                int i173 = ~i172;
                int i174 = (i172 | i173) & i173;
                int i175 = -(-(((i174 & (-387884169)) | ((-387884169) ^ i174)) * (-366)));
                int i176 = (-886279758) | i175;
                int i177 = ((i176 << 1) - (~(-((~(i175 & (-886279758))) & i176)))) - 1;
                int i178 = (-17866881) ^ iIdentityHashCode4;
                int i179 = iIdentityHashCode4 & (-17866881);
                int i180 = -(-(((~((i179 & i178) | (i178 ^ i179))) | (-2013181694)) * 366));
                int i181 = i177 & i180;
                if (i169 > i181 + ((i180 ^ i177) | i181)) {
                    return settextappearance11.f60632b;
                }
                f fVar2 = settextappearance11.f60632b;
                throw null;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.c
    @NotNull
    public final b UiMessageCallbackKtWhenMappings() {
        return (b) setY(new Object[]{this}, 1817789977, -1817789973, System.identityHashCode(this));
    }

    @Nullable
    public final setMaxWidth getNavBarTitleString() {
        return (setMaxWidth) setY(new Object[]{this}, 1411396419, -1411396410, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setY(new Object[]{this}, -126605932, 126605934, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setDividerPadding() {
        return (getBeepOnFailure) setY(new Object[]{this}, -1762606256, 1762606263, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getRrn
    public final void setLayoutAnimation() throws Exception {
        setY(new Object[]{this}, 1234718885, -1234718879, System.identityHashCode(this));
    }

    @Nullable
    public final getINVALID_MERCHANT_IDannotations setNavigationOnClickListener() {
        return (getINVALID_MERCHANT_IDannotations) setY(new Object[]{this}, -638298177, 638298180, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnDragListener() {
        return (byte[]) setY(new Object[]{this}, 1154949342, -1154949341, System.identityHashCode(this));
    }

    @Nullable
    public final j setOnFocusChangeListener() {
        return (j) setY(new Object[]{this}, 1069213621, -1069213611, System.identityHashCode(this));
    }

    @NotNull
    public final String setOnLongClickListener() {
        return (String) setY(new Object[]{this}, 2103420954, -2103420949, System.identityHashCode(this));
    }

    @Nullable
    public final f setX() {
        return (f) setY(new Object[]{this}, -1677040788, 1677040788, System.identityHashCode(this));
    }

    @Nullable
    public final l setY() {
        return (l) setY(new Object[]{this}, 1819649031, -1819649023, System.identityHashCode(this));
    }
}
