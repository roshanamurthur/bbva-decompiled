package com.mypinpad.tsdk.isolation;

import c2.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0011\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0019X\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0019X\u0007¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b"}, d2 = {"Lcom/mypinpad/tsdk/i/setTitleMarginTop;", "Lcom/mypinpad/tsdk/i/getDetailsFieldTextSizeSp;", "", "setCompoundDrawableTintBlendMode", "()Ljava/lang/String;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mypinpad/tsdk/i/Terminal;", "a", "Lcom/mypinpad/tsdk/i/Terminal;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/Terminal;", "setNavigationOnClickListener", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "b", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "setY", "()Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "c", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "setX", "d", "e", "setOnDragListener", "getNavBarTitleString", "f", "setOnLongClickListener"}, k = 1, mv = {1, 5, 1})
public final /* data */ class setTitleMarginTop implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60723g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60724h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Terminal setNavigationOnClickListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setBackgroundTintList setOnFocusChangeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final getBeepOnFailure setX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final getBeepOnFailure setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final getBeepOnFailure getNavBarTitleString;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final getBeepOnFailure setOnLongClickListener;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @Nullable
    public getBeepOnFailure setY;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @Nullable
    public getBeepOnFailure setDividerPadding;

    public setTitleMarginTop(Terminal terminal, setBackgroundTintList setbackgroundtintlist, getBeepOnFailure getbeeponfailure, getBeepOnFailure getbeeponfailure2, getBeepOnFailure getbeeponfailure3, getBeepOnFailure getbeeponfailure4, getBeepOnFailure getbeeponfailure5, getBeepOnFailure getbeeponfailure6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        getbeeponfailure3 = (i10 & 16) != 0 ? null : getbeeponfailure3;
        getbeeponfailure4 = (i10 & 32) != 0 ? null : getbeeponfailure4;
        getbeeponfailure5 = (i10 & 64) != 0 ? null : getbeeponfailure5;
        getbeeponfailure6 = (i10 & 128) != 0 ? null : getbeeponfailure6;
        Intrinsics.checkNotNullParameter(terminal, "");
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        Intrinsics.checkNotNullParameter(getbeeponfailure2, "");
        this.setNavigationOnClickListener = terminal;
        this.setOnFocusChangeListener = setbackgroundtintlist;
        this.setX = getbeeponfailure;
        this.setCompoundDrawableTintBlendMode = getbeeponfailure2;
        this.getNavBarTitleString = getbeeponfailure3;
        this.setOnLongClickListener = getbeeponfailure4;
        this.setDividerPadding = getbeeponfailure5;
        this.setY = getbeeponfailure6;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x011d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0130  */
    /* JADX WARN: Code duplicated, block: B:24:0x0134  */
    /* JADX WARN: Code duplicated, block: B:25:0x014a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0152  */
    /* JADX WARN: Code duplicated, block: B:30:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x01db  */
    /* JADX WARN: Code duplicated, block: B:41:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x0207  */
    /* JADX WARN: Code duplicated, block: B:44:0x0211  */
    /* JADX WARN: Code duplicated, block: B:46:0x022a  */
    /* JADX WARN: Code duplicated, block: B:48:0x022f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0239  */
    /* JADX WARN: Code duplicated, block: B:52:0x0243  */
    /* JADX WARN: Code duplicated, block: B:55:0x0264  */
    /* JADX WARN: Code duplicated, block: B:56:0x0265  */
    /* JADX WARN: Code duplicated, block: B:58:0x0270  */
    /* JADX WARN: Code duplicated, block: B:60:0x028b  */
    /* JADX WARN: Code duplicated, block: B:61:0x028e  */
    /* JADX WARN: Code duplicated, block: B:64:0x029b  */
    /* JADX WARN: Code duplicated, block: B:65:0x029c  */
    /* JADX WARN: Code duplicated, block: B:66:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x02e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        Terminal terminal;
        setTitleMarginTop settitlemargintop;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = ~i10;
        int i21 = i20 | i11;
        int i22 = (((~i21) | (~(i20 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i23 = ~(i21 | i12);
        int i24 = ~i12;
        int i25 = ((i20 | i24) * 754) + (((~(i10 | i24 | i11)) | i23) * (-754)) + i22;
        String str = null;
        Object[] objArr2 = 0;
        int i26 = 2;
        switch (i25) {
            case 1:
                setTitleMarginTop settitlemargintop2 = (setTitleMarginTop) objArr[0];
                int i27 = f60724h + 83;
                f60723g = i27 % 128;
                int i28 = i27 % 2;
                int iHashCode5 = settitlemargintop2.setNavigationOnClickListener.hashCode() * 31;
                int i29 = -(-settitlemargintop2.setOnFocusChangeListener.hashCode());
                int i30 = iHashCode5 ^ i29;
                int i31 = (iHashCode5 & i29) << 1;
                int i32 = (((i30 | i31) << 1) - (i31 ^ i30)) * 31;
                int i33 = -(-settitlemargintop2.setX.hashCode());
                int i34 = ((((i32 ^ i33) | (i32 & i33)) << 1) - (~(-((i33 & (~i32)) | ((~i33) & i32))))) - 1;
                int i35 = i34 * 31;
                int iHashCode6 = settitlemargintop2.setCompoundDrawableTintBlendMode.hashCode();
                int iIdentityHashCode = System.identityHashCode(settitlemargintop2);
                int i36 = iHashCode6 * (-344);
                int i37 = -(-(i34 * (-10664)));
                int i38 = ((~i37) & i36) | ((~i36) & i37);
                int i39 = (i37 & i36) << 1;
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                int i41 = ~iHashCode6;
                int i42 = ~i35;
                int i43 = (i35 | i42) & i42;
                int i44 = i41 & i43;
                int i45 = ~(((~i43) & i41) | ((~i41) & i43) | i44);
                int i46 = (i41 | iHashCode6) & i41;
                int i47 = i46 & iIdentityHashCode;
                int i48 = (~i47) & (i46 | iIdentityHashCode);
                int i49 = ~iIdentityHashCode;
                int i50 = ~((i48 ^ i47) | (i48 & i47));
                int i51 = ((~i45) & i50) | ((~i50) & i45);
                int i52 = i50 & i45;
                int i53 = ((i51 & i52) | (i51 ^ i52)) * 345;
                int i54 = ((~i53) & i40) | ((~i40) & i53);
                int i55 = -(-((i53 & i40) << 1));
                int i56 = (i54 & i55) + (i55 | i54);
                int i57 = i41 & i49;
                int i58 = (~i57) & (i41 | i49);
                int i59 = ~((i57 & i58) | (i58 ^ i57));
                int i60 = (iHashCode6 & i42) | (i42 ^ iHashCode6);
                int i61 = ~i60;
                int i62 = (i60 | i61) & i61;
                int i63 = ((~i62) & i59) | ((~i59) & i62);
                int i64 = i59 & i62;
                int i65 = -(~(-(-(((i64 & i63) | (i63 ^ i64)) * 345))));
                int i66 = (((i56 | i65) << 1) - (i65 ^ i56)) - 1;
                int i67 = ((i43 | i41) & (~i44)) | i44;
                int i68 = (i67 & iIdentityHashCode) | (i67 & i49) | ((~i67) & iIdentityHashCode);
                int i69 = ~i68;
                int i70 = -(-(((i68 | i69) & i69) * 345));
                int i71 = i66 & i70;
                int i72 = ((i66 ^ i70) | i71) << 1;
                int i73 = -((i70 | i66) & (~i71));
                int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                int i75 = i74 * 31;
                getBeepOnFailure getbeeponfailure = settitlemargintop2.getNavBarTitleString;
                if (getbeeponfailure == null) {
                    int i76 = f60723g;
                    int i77 = i76 & 41;
                    int i78 = (~i77) & (i76 | 41);
                    int i79 = i77 << 1;
                    int i80 = (i78 - (~i79)) - 1;
                    f60724h = i80 % 128;
                    int i81 = i80 % 2;
                    int i82 = (i76 ^ 41) + i79;
                    f60724h = i82 % 128;
                    int i83 = i82 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = getbeeponfailure.hashCode();
                    int i84 = f60724h;
                    int i85 = (i84 & 45) + (i84 | 45);
                    f60723g = i85 % 128;
                    int i86 = i85 % 2;
                }
                int iIdentityHashCode2 = System.identityHashCode(settitlemargintop2);
                int i87 = ((iHashCode * (-209)) - (~(-(-(i74 * (-6479)))))) - 1;
                int i88 = ~iHashCode;
                int i89 = (i88 | iHashCode) & i88;
                int i90 = ~i75;
                int i91 = ~i90;
                int i92 = (i89 & i90) | (i89 & i91) | ((~i89) & i90);
                int i93 = ~i92;
                int i94 = -(-(((i92 | i93) & i93) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                int i95 = i87 & i94;
                int i96 = (((i87 ^ i94) | i95) << 1) - ((i94 | i87) & (~i95));
                int i97 = (i90 | i75) & i90;
                int i98 = ~iIdentityHashCode2;
                int i99 = (i98 | iIdentityHashCode2) & i98;
                int i100 = i97 ^ i99;
                int i101 = i97 & i99;
                int i102 = ~((i101 & i100) | (i100 ^ i101));
                int i103 = (i88 ^ iIdentityHashCode2) | (i88 & iIdentityHashCode2);
                int i104 = ~i103;
                int i105 = (i103 | i104) & i104;
                int i106 = ((i102 & i105) | (i102 ^ i105)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
                int i107 = i96 & i106;
                int i108 = ((i96 ^ i106) | i107) << 1;
                int i109 = -((i106 | i96) & (~i107));
                int i110 = (i108 & i109) + (i109 | i108);
                int i111 = i88 & i98;
                int i112 = (i98 | i88) & (~i111);
                int i113 = (i111 & i112) | (i112 ^ i111);
                int i114 = (i75 & i113) | (i113 ^ i75);
                int i115 = ~i114;
                int i116 = (i114 | i115) & i115;
                int i117 = (i88 & i90) | (iHashCode & i91);
                int i118 = iHashCode & i90;
                int i119 = (i118 & i117) | (i117 ^ i118);
                int i120 = (i119 & iIdentityHashCode2) | (i119 ^ iIdentityHashCode2);
                int i121 = ~i120;
                int i122 = (i120 | i121) & i121;
                int i123 = -(-(((i116 & i122) | (i116 ^ i122)) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                int i124 = ((i110 ^ i123) | (i110 & i123)) << 1;
                int i125 = -((i123 & (~i110)) | ((~i123) & i110));
                int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                int i127 = i126 * 31;
                getBeepOnFailure getbeeponfailure2 = settitlemargintop2.setOnLongClickListener;
                if (getbeeponfailure2 == null) {
                    int i128 = f60724h;
                    int i129 = i128 & 27;
                    int i130 = i129 + ((i128 ^ 27) | i129);
                    f60723g = i130 % 128;
                    int i131 = i130 % 2;
                    System.identityHashCode(settitlemargintop2);
                    System.identityHashCode(settitlemargintop2);
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = getbeeponfailure2.hashCode();
                    int i132 = f60723g + 117;
                    f60724h = i132 % 128;
                    int i133 = i132 % 2;
                }
                int iIdentityHashCode3 = System.identityHashCode(settitlemargintop2);
                int i134 = iHashCode2 * (-380);
                int i135 = i126 * 11842;
                int i136 = i134 & i135;
                int i137 = (i136 - (~((i135 ^ i134) | i136))) - 1;
                int i138 = i127 & iIdentityHashCode3;
                int i139 = (~i138) & (i127 | iIdentityHashCode3);
                int i140 = (i138 & i139) | (i139 ^ i138);
                int i141 = ~iHashCode2;
                int i142 = ((~i141) & i140) | ((~i140) & i141);
                int i143 = i140 & i141;
                int i144 = -(~(-(-(((i143 & i142) | (i142 ^ i143)) * (-381)))));
                int i145 = (((i137 | i144) << 1) - (i144 ^ i137)) - 1;
                int i146 = (i141 | iHashCode2) & i141;
                int i147 = ~i127;
                int i148 = i147 & (i147 | i127);
                int i149 = ((~i148) & i146) | ((~i146) & i148);
                int i150 = i146 & i148;
                int i151 = (i150 & i149) | (i149 ^ i150);
                int i152 = ~i151;
                int i153 = (i151 | i152) & i152;
                int i154 = ~iIdentityHashCode3;
                int i155 = (i154 & i127) | (i154 ^ i127);
                int i156 = ~i155;
                int i157 = (i155 | i156) & i156;
                int i158 = ((~i157) & i153) | ((~i153) & i157);
                int i159 = i153 & i157;
                int i160 = (i159 & i158) | (i158 ^ i159);
                int i161 = iHashCode2 & i127;
                int i162 = (iHashCode2 | i127) & (~i161);
                int i163 = ~((i162 & i161) | (i162 ^ i161));
                int i164 = ((i163 & i160) | (i160 ^ i163)) * 381;
                int i165 = (i145 ^ i164) + ((i164 & i145) << 1);
                int i166 = i141 & i127;
                int i167 = -(~(-(-((~(((i127 | i141) & (~i166)) | i166)) * 381))));
                int i168 = ((i165 | i167) << 1) - (i167 ^ i165);
                int i169 = ((i168 ^ (-1)) + (i168 << 1)) * 31;
                getBeepOnFailure getbeeponfailure3 = settitlemargintop2.setDividerPadding;
                if (getbeeponfailure3 == null) {
                    int i170 = f60723g;
                    int i171 = i170 & 115;
                    int i172 = (i170 ^ 115) | i171;
                    int i173 = (i171 & i172) + (i172 | i171);
                    f60724h = i173 % 128;
                    iHashCode3 = i173 % 2 == 0 ? 1 : 0;
                } else {
                    iHashCode3 = getbeeponfailure3.hashCode();
                    int i174 = f60724h;
                    int i175 = i174 ^ 105;
                    int i176 = ((((i174 & 105) | i175) << 1) - (~(-i175))) - 1;
                    f60723g = i176 % 128;
                    int i177 = i176 % 2;
                }
                int iE = b.e(i169, ~(-(-iHashCode3)), 1, 31);
                getBeepOnFailure getbeeponfailure4 = settitlemargintop2.setY;
                if (getbeeponfailure4 == null) {
                    int i178 = f60723g;
                    int i179 = i178 & 41;
                    int i180 = (i178 ^ 41) | i179;
                    int i181 = (i179 ^ i180) + ((i180 & i179) << 1);
                    f60724h = i181 % 128;
                    int i182 = i181 % 2;
                    iHashCode4 = 0;
                } else {
                    iHashCode4 = getbeeponfailure4.hashCode();
                    int i183 = f60723g;
                    int i184 = (i183 & 83) + (i183 | 83);
                    f60724h = i184 % 128;
                    int i185 = i184 % 2;
                }
                int i186 = -(-iHashCode4);
                int i187 = iE ^ i186;
                int i188 = (((iE & i186) | i187) << 1) - i187;
                int iIdentityHashCode4 = System.identityHashCode(settitlemargintop2);
                int i189 = ~iIdentityHashCode4;
                int i190 = (i189 ^ 1524231585) | (i189 & 1524231585);
                int i191 = i190 & 1766776413;
                int i192 = ~(((i190 | 1766776413) & (~i191)) | i191);
                int i193 = ((~i192) & 1212730369) | ((-1212730370) & i192);
                int i194 = i192 & 1212730369;
                int i195 = ((i194 & i193) | (i193 ^ i194)) * 220;
                int i196 = (((1470753390 | i195) << 1) - (~(-((i195 & (-1470753391)) | (1470753390 & (~i195)))))) - 1;
                int i197 = i189 & (i189 | iIdentityHashCode4);
                int i198 = ~((i197 & 1766776413) | (i197 ^ 1766776413));
                int i199 = 1524231585 & i198;
                int i200 = (i198 | 1524231585) & (~i199);
                int i201 = (((((i200 & i199) | (i200 ^ i199)) * (-440)) + i196) - (~(-(-(((iIdentityHashCode4 & 2078277629) | (2078277629 ^ iIdentityHashCode4)) * 220))))) - 1;
                int iIdentityHashCode5 = System.identityHashCode(settitlemargintop2);
                int i202 = ~iIdentityHashCode5;
                int i203 = (i202 | iIdentityHashCode5) & i202;
                int i204 = (-200319450) & i203;
                int i205 = (i203 | (-200319450)) & (~i204);
                int i206 = ~((i205 & i204) | (i205 ^ i204));
                int i207 = 1542527211 & i206;
                int i208 = -(-((((i206 | 1542527211) & (~i207)) | i207) * (-90)));
                int i209 = (-1433432264) & i208;
                int i210 = i209 + ((i208 ^ (-1433432264)) | i209);
                int i211 = (-200319450) & iIdentityHashCode5;
                int i212 = (~i211) & ((-200319450) | iIdentityHashCode5);
                int i213 = (i211 & i212) | (i212 ^ i211);
                int i214 = ~i213;
                int i215 = (i213 | i214) & i214;
                int i216 = ((i215 & (-1542568444)) | (i215 ^ (-1542568444))) * (-45);
                int i217 = (i210 ^ i216) + ((i216 & i210) << 1);
                int i218 = ~((iIdentityHashCode5 & (-1542527212)) | ((-1542527212) ^ iIdentityHashCode5));
                int i219 = (i218 & (-200319450)) | ((~i218) & (-200319450)) | (200319449 & i218);
                int i220 = ~((i202 & 1542527211) | (i202 ^ 1542527211));
                int i221 = ((~i220) & i219) | ((~i219) & i220);
                int i222 = i219 & i220;
                int i223 = ((i222 & i221) | (i221 ^ i222)) * 45;
                int i224 = i217 & i223;
                int i225 = ((i217 ^ i223) | i224) << 1;
                int i226 = -((i223 | i217) & (~i224));
                if (i201 > (i225 ^ i226) + ((i226 & i225) << 1)) {
                    int i227 = 54 / 0;
                }
                return Integer.valueOf(i188);
            case 2:
                setTitleMarginTop settitlemargintop3 = (setTitleMarginTop) objArr[0];
                int i228 = f60723g;
                int i229 = i228 + 75;
                f60724h = i229 % 128;
                int i230 = i229 % 2;
                getBeepOnFailure getbeeponfailure5 = settitlemargintop3.setCompoundDrawableTintBlendMode;
                int i231 = i228 + 13;
                f60724h = i231 % 128;
                if (i231 % 2 != 0) {
                    return getbeeponfailure5;
                }
                throw null;
            case 3:
                setTitleMarginTop settitlemargintop4 = (setTitleMarginTop) objArr[0];
                int i232 = f60724h;
                int i233 = i232 & 83;
                int i234 = (i232 | 83) & (~i233);
                int i235 = i233 << 1;
                int i236 = ((i234 | i235) << 1) - (i234 ^ i235);
                int i237 = i236 % 128;
                f60723g = i237;
                if (i236 % 2 != 0) {
                    int i238 = 69 / 0;
                    terminal = settitlemargintop4.setNavigationOnClickListener;
                } else {
                    terminal = settitlemargintop4.setNavigationOnClickListener;
                }
                int i239 = i237 & 19;
                int i240 = ((i237 ^ 19) | i239) << 1;
                int i241 = -((i237 | 19) & (~i239));
                int i242 = (i240 ^ i241) + ((i240 & i241) << 1);
                f60724h = i242 % 128;
                if (i242 % 2 != 0) {
                    return terminal;
                }
                throw null;
            case 4:
                setTitleMarginTop settitlemargintop5 = (setTitleMarginTop) objArr[0];
                int i243 = f60723g;
                int i244 = ((i243 ^ 19) | (i243 & 19)) << 1;
                int i245 = -(((~i243) & 19) | (i243 & (-20)));
                int i246 = (i244 ^ i245) + ((i245 & i244) << 1);
                int i247 = i246 % 128;
                f60724h = i247;
                int i248 = i246 % 2;
                setBackgroundTintList setbackgroundtintlist = settitlemargintop5.setOnFocusChangeListener;
                if (i248 == 0) {
                    int i249 = 55 / 0;
                }
                int i250 = (((i247 | 30) << 1) - (i247 ^ 30)) - 1;
                f60723g = i250 % 128;
                int i251 = i250 % 2;
                return setbackgroundtintlist;
            case 5:
                Boolean bool = Boolean.FALSE;
                setTitleMarginTop settitlemargintop6 = (setTitleMarginTop) objArr[0];
                Object obj = objArr[1];
                int i252 = f60724h;
                int i253 = (i252 & 91) + (i252 | 91);
                int i254 = i253 % 128;
                f60723g = i254;
                if (i253 % 2 != 0) {
                    int i255 = 5 / 0;
                    if (settitlemargintop6 != obj) {
                        if (!(obj instanceof setTitleMarginTop)) {
                            int i256 = i254 & 23;
                            int i257 = (i256 - (~((i254 ^ 23) | i256))) - 1;
                            f60724h = i257 % 128;
                            int i258 = i257 % 2;
                            int i259 = i254 + 81;
                            f60724h = i259 % 128;
                            int i260 = i259 % 2;
                            return bool;
                        }
                        settitlemargintop = (setTitleMarginTop) obj;
                        if (settitlemargintop6.setNavigationOnClickListener != settitlemargintop.setNavigationOnClickListener) {
                            int iIdentityHashCode6 = System.identityHashCode(settitlemargintop6);
                            int i261 = ~iIdentityHashCode6;
                            int i262 = (iIdentityHashCode6 | i261) & i261;
                            int i263 = ((~i262) & (-771887129)) | (771887128 & i262);
                            int i264 = (-771887129) & i262;
                            int i265 = ((i263 & i264) | (i263 ^ i264)) * 184;
                            int i266 = (((~i265) & (-470430290)) | (470430289 & i265)) + ((i265 & (-470430290)) << 1);
                            int i267 = ~((i262 & 1374479877) | (i262 ^ 1374479877));
                            int i268 = 271344129 ^ i267;
                            int i269 = i267 & 271344129;
                            int i270 = (i269 & i268) | (i268 ^ i269);
                            int i271 = i270 & (-2146367006);
                            int i272 = (i270 | (-2146367006)) & (~i271);
                            int i273 = -(-(((i272 & i271) | (i272 ^ i271)) * 184));
                            int i274 = (i266 ^ i273) + ((i273 & i266) << 1);
                            System.identityHashCode(settitlemargintop6);
                            return Boolean.valueOf(!(i274 <= 1451533086));
                        }
                        if (Intrinsics.areEqual(settitlemargintop6.setOnFocusChangeListener, settitlemargintop.setOnFocusChangeListener)) {
                            int i275 = f60723g;
                            int i276 = (i275 ^ 115) + ((i275 & 115) << 1);
                            f60724h = i276 % 128;
                            z10 = i276 % 2 == 0;
                            int i277 = i275 & 23;
                            int i278 = -(-(i275 | 23));
                            i13 = (i277 ^ i278) + ((i278 & i277) << 1);
                            f60724h = i13 % 128;
                            if (i13 % 2 != 0) {
                                return Boolean.valueOf(z10);
                            }
                            throw null;
                        }
                        if (!Intrinsics.areEqual(settitlemargintop6.setX, settitlemargintop.setX)) {
                            if (!Intrinsics.areEqual(settitlemargintop6.setCompoundDrawableTintBlendMode, settitlemargintop.setCompoundDrawableTintBlendMode)) {
                                if (!Intrinsics.areEqual(settitlemargintop6.getNavBarTitleString, settitlemargintop.getNavBarTitleString)) {
                                    int i279 = f60723g;
                                    int i280 = (-2) - ((i279 + 80) ^ (-1));
                                    f60724h = i280 % 128;
                                    int i281 = i280 % 2;
                                    i19 = ((i279 | 117) << 1) - (i279 ^ 117);
                                    f60724h = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        return bool;
                                    }
                                    i17 = 87;
                                } else if (Intrinsics.areEqual(settitlemargintop6.setOnLongClickListener, settitlemargintop.setOnLongClickListener)) {
                                    int i282 = f60724h;
                                    int i283 = i282 & 97;
                                    int i284 = (i283 - (~(-(-((i282 ^ 97) | i283))))) - 1;
                                    f60723g = i284 % 128;
                                    int i285 = i284 % 2;
                                    int i286 = i282 & 95;
                                    int i287 = (i282 | 95) & (~i286);
                                    int i288 = i286 << 1;
                                    i14 = ((i287 | i288) << 1) - (i287 ^ i288);
                                } else {
                                    if (!Intrinsics.areEqual(settitlemargintop6.setDividerPadding, settitlemargintop.setDividerPadding)) {
                                        int i289 = f60724h;
                                        int i290 = i289 & 89;
                                        int i291 = i290 + ((i289 ^ 89) | i290);
                                        f60723g = i291 % 128;
                                        int i292 = i291 % 2;
                                        int i293 = i289 | 1;
                                        i18 = ((i293 << 1) - (~(-((~(i289 & 1)) & i293)))) - 1;
                                        f60723g = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            return bool;
                                        }
                                        throw null;
                                    }
                                    if (!Intrinsics.areEqual(settitlemargintop6.setY, settitlemargintop.setY)) {
                                        int i294 = f60724h;
                                        int i295 = i294 ^ 59;
                                        int i296 = ((i294 & 59) | i295) << 1;
                                        int i297 = -i295;
                                        int i298 = (i296 & i297) + (i296 | i297);
                                        int i299 = i298 % 128;
                                        f60723g = i299;
                                        int i300 = i298 % 2;
                                        i16 = i299 + 53;
                                        f60724h = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            return bool;
                                        }
                                        i17 = 56;
                                    } else {
                                        i15 = f60724h + 37;
                                        f60723g = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            throw null;
                                        }
                                    }
                                }
                                int i301 = i17 / 0;
                                return bool;
                            }
                            int i302 = f60724h;
                            int i303 = ((i302 ^ 10) + ((i302 & 10) << 1)) - 1;
                            int i304 = i303 % 128;
                            f60723g = i304;
                            int i305 = i303 % 2;
                            int i306 = (i304 & (-74)) | ((~i304) & 73);
                            int i307 = -(-((i304 & 73) << 1));
                            i14 = (i306 & i307) + (i307 | i306);
                            f60724h = i14 % 128;
                            int i308 = i14 % 2;
                            return bool;
                        }
                        int i309 = f60724h;
                        int i310 = (i309 | 83) << 1;
                        int i311 = -(((~i309) & 83) | (i309 & (-84)));
                        i14 = (i310 & i311) + (i311 | i310);
                        f60723g = i14 % 128;
                        int i3010 = i14 % 2;
                        return bool;
                    }
                    int i312 = ((i254 & (-102)) | ((~i254) & 101)) + ((i254 & 101) << 1);
                    f60724h = i312 % 128;
                    int i313 = i312 % 2;
                } else {
                    if (settitlemargintop6 != obj) {
                        if (!(obj instanceof setTitleMarginTop)) {
                            int i2510 = i254 & 23;
                            int i2511 = (i2510 - (~((i254 ^ 23) | i2510))) - 1;
                            f60724h = i2511 % 128;
                            int i2512 = i2511 % 2;
                            int i2513 = i254 + 81;
                            f60724h = i2513 % 128;
                            int i2610 = i2513 % 2;
                            return bool;
                        }
                        settitlemargintop = (setTitleMarginTop) obj;
                        if (settitlemargintop6.setNavigationOnClickListener != settitlemargintop.setNavigationOnClickListener) {
                            int iIdentityHashCode7 = System.identityHashCode(settitlemargintop6);
                            int i2611 = ~iIdentityHashCode7;
                            int i2612 = (iIdentityHashCode7 | i2611) & i2611;
                            int i2613 = ((~i2612) & (-771887129)) | (771887128 & i2612);
                            int i2614 = (-771887129) & i2612;
                            int i2615 = ((i2613 & i2614) | (i2613 ^ i2614)) * 184;
                            int i2616 = (((~i2615) & (-470430290)) | (470430289 & i2615)) + ((i2615 & (-470430290)) << 1);
                            int i2617 = ~((i2612 & 1374479877) | (i2612 ^ 1374479877));
                            int i2618 = 271344129 ^ i2617;
                            int i2619 = i2617 & 271344129;
                            int i2710 = (i2619 & i2618) | (i2618 ^ i2619);
                            int i2711 = i2710 & (-2146367006);
                            int i2712 = (i2710 | (-2146367006)) & (~i2711);
                            int i2713 = -(-(((i2712 & i2711) | (i2712 ^ i2711)) * 184));
                            int i2714 = (i2616 ^ i2713) + ((i2713 & i2616) << 1);
                            System.identityHashCode(settitlemargintop6);
                            return Boolean.valueOf(!(i2714 <= 1451533086));
                        }
                        if (Intrinsics.areEqual(settitlemargintop6.setOnFocusChangeListener, settitlemargintop.setOnFocusChangeListener)) {
                            int i2715 = f60723g;
                            int i2716 = (i2715 ^ 115) + ((i2715 & 115) << 1);
                            f60724h = i2716 % 128;
                            if (i2716 % 2 == 0) {
                            }
                            int i2717 = i2715 & 23;
                            int i2718 = -(-(i2715 | 23));
                            i13 = (i2717 ^ i2718) + ((i2718 & i2717) << 1);
                            f60724h = i13 % 128;
                            if (i13 % 2 != 0) {
                                return Boolean.valueOf(z10);
                            }
                            throw null;
                        }
                        if (!Intrinsics.areEqual(settitlemargintop6.setX, settitlemargintop.setX)) {
                            if (!Intrinsics.areEqual(settitlemargintop6.setCompoundDrawableTintBlendMode, settitlemargintop.setCompoundDrawableTintBlendMode)) {
                                if (!Intrinsics.areEqual(settitlemargintop6.getNavBarTitleString, settitlemargintop.getNavBarTitleString)) {
                                    int i2719 = f60723g;
                                    int i2810 = (-2) - ((i2719 + 80) ^ (-1));
                                    f60724h = i2810 % 128;
                                    int i2811 = i2810 % 2;
                                    i19 = ((i2719 | 117) << 1) - (i2719 ^ 117);
                                    f60724h = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        return bool;
                                    }
                                    i17 = 87;
                                } else if (Intrinsics.areEqual(settitlemargintop6.setOnLongClickListener, settitlemargintop.setOnLongClickListener)) {
                                    int i2812 = f60724h;
                                    int i2813 = i2812 & 97;
                                    int i2814 = (i2813 - (~(-(-((i2812 ^ 97) | i2813))))) - 1;
                                    f60723g = i2814 % 128;
                                    int i2815 = i2814 % 2;
                                    int i2816 = i2812 & 95;
                                    int i2817 = (i2812 | 95) & (~i2816);
                                    int i2818 = i2816 << 1;
                                    i14 = ((i2817 | i2818) << 1) - (i2817 ^ i2818);
                                } else {
                                    if (!Intrinsics.areEqual(settitlemargintop6.setDividerPadding, settitlemargintop.setDividerPadding)) {
                                        int i2819 = f60724h;
                                        int i2910 = i2819 & 89;
                                        int i2911 = i2910 + ((i2819 ^ 89) | i2910);
                                        f60723g = i2911 % 128;
                                        int i2912 = i2911 % 2;
                                        int i2913 = i2819 | 1;
                                        i18 = ((i2913 << 1) - (~(-((~(i2819 & 1)) & i2913)))) - 1;
                                        f60723g = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            return bool;
                                        }
                                        throw null;
                                    }
                                    if (!Intrinsics.areEqual(settitlemargintop6.setY, settitlemargintop.setY)) {
                                        int i2914 = f60724h;
                                        int i2915 = i2914 ^ 59;
                                        int i2916 = ((i2914 & 59) | i2915) << 1;
                                        int i2917 = -i2915;
                                        int i2918 = (i2916 & i2917) + (i2916 | i2917);
                                        int i2919 = i2918 % 128;
                                        f60723g = i2919;
                                        int i3011 = i2918 % 2;
                                        i16 = i2919 + 53;
                                        f60724h = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            return bool;
                                        }
                                        i17 = 56;
                                    } else {
                                        i15 = f60724h + 37;
                                        f60723g = i15 % 128;
                                        if (i15 % 2 != 0) {
                                            throw null;
                                        }
                                    }
                                }
                                int i3012 = i17 / 0;
                                return bool;
                            }
                            int i3013 = f60724h;
                            int i3014 = ((i3013 ^ 10) + ((i3013 & 10) << 1)) - 1;
                            int i3015 = i3014 % 128;
                            f60723g = i3015;
                            int i3016 = i3014 % 2;
                            int i3017 = (i3015 & (-74)) | ((~i3015) & 73);
                            int i3018 = -(-((i3015 & 73) << 1));
                            i14 = (i3017 & i3018) + (i3018 | i3017);
                            f60724h = i14 % 128;
                            int i3019 = i14 % 2;
                            return bool;
                        }
                        int i3020 = f60724h;
                        int i314 = (i3020 | 83) << 1;
                        int i315 = -(((~i3020) & 83) | (i3020 & (-84)));
                        i14 = (i314 & i315) + (i315 | i314);
                        f60723g = i14 % 128;
                        int i30110 = i14 % 2;
                        return bool;
                    }
                    int i316 = ((i254 & (-102)) | ((~i254) & 101)) + ((i254 & 101) << 1);
                    f60724h = i316 % 128;
                    int i317 = i316 % 2;
                }
                return Boolean.TRUE;
            case 6:
                int i318 = f60723g;
                int i319 = ((((i318 ^ 21) | (i318 & 21)) << 1) - (~(-(((~i318) & 21) | (i318 & (-22)))))) - 1;
                f60724h = i319 % 128;
                if (i319 % 2 == 0) {
                    int i320 = 30 / 0;
                }
                return "KAD";
            case 7:
                setTitleMarginTop settitlemargintop7 = (setTitleMarginTop) objArr[0];
                TerminalLogger terminalLogger = new TerminalLogger(new getDetailsFieldTextSizeSp[]{setInputExtras.setNavigationOnClickListener(settitlemargintop7.setOnFocusChangeListener.setY()), setInputExtras.setNavigationOnClickListener(settitlemargintop7.setCompoundDrawableTintBlendMode.setOnFocusChangeListener())}, str, i26, objArr2 == true ? 1 : 0);
                String str2 = (String) TerminalLogger.setOnFocusChangeListener(new Object[]{terminalLogger}, -1352067446, 1352067446, System.identityHashCode(terminalLogger));
                int i321 = f60724h;
                int i322 = i321 & 71;
                int i323 = (((i321 | 71) & (~i322)) - (~(i322 << 1))) - 1;
                f60723g = i323 % 128;
                int i324 = i323 % 2;
                return str2;
            case 8:
                setTitleMarginTop settitlemargintop8 = (setTitleMarginTop) objArr[0];
                int i325 = f60723g;
                int i326 = i325 & 69;
                int i327 = (69 ^ i325) | i326;
                int i328 = ((i326 | i327) << 1) - (i327 ^ i326);
                int i329 = i328 % 128;
                f60724h = i329;
                int i330 = i328 % 2;
                getBeepOnFailure getbeeponfailure6 = settitlemargintop8.getNavBarTitleString;
                int i331 = ((-1) << 1) - ((i329 + 94) ^ (-1));
                f60723g = i331 % 128;
                int i332 = i331 % 2;
                return getbeeponfailure6;
            case 9:
                setTitleMarginTop settitlemargintop9 = (setTitleMarginTop) objArr[0];
                int i333 = f60724h + 53;
                int i334 = i333 % 128;
                f60723g = i334;
                int i335 = i333 % 2;
                getBeepOnFailure getbeeponfailure7 = settitlemargintop9.setX;
                int i336 = ((-1) << 1) - (((i334 ^ 94) + ((i334 & 94) << 1)) ^ (-1));
                f60724h = i336 % 128;
                int i337 = i336 % 2;
                return getbeeponfailure7;
            default:
                setTitleMarginTop settitlemargintop10 = (setTitleMarginTop) objArr[0];
                int i338 = f60724h;
                int i339 = i338 & 79;
                int i340 = i339 + ((i338 ^ 79) | i339);
                f60723g = i340 % 128;
                int i341 = i340 % 2;
                getBeepOnFailure getbeeponfailure8 = settitlemargintop10.setOnLongClickListener;
                if (i341 == 0) {
                    return getbeeponfailure8;
                }
                int i342 = 36 / 0;
                return getbeeponfailure8;
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setDividerPadding(new Object[]{this, p4}, -1658641480, 1658641485, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "getNavBarTitleString")
    @Nullable
    public final getBeepOnFailure getNavBarTitleString() {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this}, -1710162922, 1710162922, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 647382339, -647382338, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setDividerPadding(new Object[]{this}, 1847513699, -1847513692, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    @Nullable
    public final getBeepOnFailure setOnDragListener() {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this}, -1426887016, 1426887024, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final Terminal setOnFocusChangeListener() {
        return (Terminal) setDividerPadding(new Object[]{this}, 2113948533, -2113948530, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final getBeepOnFailure setX() {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this}, -876128602, 876128604, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final setBackgroundTintList setY() {
        return (setBackgroundTintList) setDividerPadding(new Object[]{this}, 423062029, -423062025, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, -419046243, 419046249, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final getBeepOnFailure setDividerPadding() {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this}, 19241490, -19241481, System.identityHashCode(this));
    }
}
