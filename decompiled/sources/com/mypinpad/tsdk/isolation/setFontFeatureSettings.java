package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0010\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0017\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\u0014\u001a\u0004\u0018\u00010\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\u0014\u0010 R\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/setFontFeatureSettings;", "", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "p0", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "setX", "()Z", "setCompoundDrawableTintBlendMode", "()V", "setOnFocusChangeListener", "b", "setY", "getNavBarTitleString", "c", "setDividerPadding", "d", "setOnDragListener", "setLayoutAnimation", "Lcom/mypinpad/tsdk/i/cs;", "e", "Lcom/mypinpad/tsdk/i/cs;", "setNavigationOnClickListener", "()Lcom/mypinpad/tsdk/i/cs;", "(Lcom/mypinpad/tsdk/i/cs;)V", "setOnLongClickListener"}, k = 1, mv = {1, 5, 1})
public final /* data */ class setFontFeatureSettings {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f59730f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59731g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean setOnFocusChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean getNavBarTitleString;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean setDividerPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public cs setY;

    public setFontFeatureSettings(boolean z10, boolean z11, boolean z12, boolean z13, cs csVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i10 & 1) != 0 ? false : z10;
        z11 = (i10 & 2) != 0 ? false : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        csVar = (i10 & 16) != 0 ? null : csVar;
        this.setOnFocusChangeListener = z10;
        this.getNavBarTitleString = z11;
        this.setCompoundDrawableTintBlendMode = z12;
        this.setDividerPadding = z13;
        this.setY = csVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r13v116, types: [int] */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r14v116 */
    /* JADX WARN: Type inference failed for: r14v136 */
    /* JADX WARN: Type inference failed for: r14v167 */
    /* JADX WARN: Type inference failed for: r14v189 */
    /* JADX WARN: Type inference failed for: r14v96, types: [int] */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v50, types: [int] */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13;
        int i14;
        ?? r14;
        int iHashCode;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | (~(i15 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i17 = ~i11;
        switch (((~(i17 | i15 | i12)) * 566) + ((~(i10 | i17)) * 566) + i16) {
            case 1:
                int i18 = f59730f;
                int i19 = (((i18 | 22) << 1) - (i18 ^ 22)) - 1;
                int i20 = i19 % 128;
                f59731g = i20;
                if (i19 % 2 == 0) {
                    throw null;
                }
                int i21 = (i20 ^ 3) + ((i20 & 3) << 1);
                f59730f = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 0 / 0;
                }
                return "EPPPI";
            case 2:
                setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) objArr[0];
                int i23 = f59731g;
                int i24 = (i23 ^ 125) + ((i23 & 125) << 1);
                f59730f = i24 % 128;
                int i25 = i24 % 2;
                boolean z10 = setfontfeaturesettings.getNavBarTitleString;
                int i26 = i23 + 121;
                f59730f = i26 % 128;
                int i27 = i26 % 2;
                return Boolean.valueOf(z10);
            case 3:
                setFontFeatureSettings setfontfeaturesettings2 = (setFontFeatureSettings) objArr[0];
                int i28 = f59730f;
                int i29 = (i28 & (-26)) | ((~i28) & 25);
                int i30 = (i28 & 25) << 1;
                int i31 = (i29 & i30) + (i30 | i29);
                f59731g = i31 % 128;
                int i32 = i31 % 2;
                setfontfeaturesettings2.getClass();
                if (i32 == 0) {
                    throw null;
                }
                int i33 = f59731g;
                int i34 = (((i33 ^ 123) | (i33 & 123)) << 1) - (((~i33) & 123) | (i33 & (-124)));
                f59730f = i34 % 128;
                int i35 = i34 % 2;
                return Boolean.FALSE;
            case 4:
                setFontFeatureSettings setfontfeaturesettings3 = (setFontFeatureSettings) objArr[0];
                cs csVar = (cs) objArr[1];
                int i36 = f59730f;
                int i37 = i36 & 101;
                int i38 = i36 | 101;
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                f59731g = i39 % 128;
                int i40 = i39 % 2;
                setfontfeaturesettings3.setY = csVar;
                if (i40 != 0) {
                    return null;
                }
                throw null;
            case 5:
                setFontFeatureSettings setfontfeaturesettings4 = (setFontFeatureSettings) objArr[0];
                int i41 = f59731g;
                int i42 = i41 | 121;
                int i43 = i42 << 1;
                int i44 = -((~(i41 & 121)) & i42);
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                int i46 = i45 % 128;
                f59730f = i46;
                int i47 = i45 % 2;
                setfontfeaturesettings4.getNavBarTitleString = true;
                int i48 = i46 & 89;
                int i49 = (i48 - (~(-(-((i46 ^ 89) | i48))))) - 1;
                f59731g = i49 % 128;
                if (i49 % 2 != 0) {
                    return null;
                }
                int i50 = 42 / 0;
                return null;
            case 6:
                setFontFeatureSettings setfontfeaturesettings5 = (setFontFeatureSettings) objArr[0];
                int i51 = f59730f;
                int i52 = (i51 & 57) + (i51 | 57);
                f59731g = i52 % 128;
                if (i52 % 2 == 0) {
                    setfontfeaturesettings5.setOnFocusChangeListener = false;
                } else {
                    setfontfeaturesettings5.setOnFocusChangeListener = true;
                }
                int i53 = i51 + 75;
                f59731g = i53 % 128;
                int i54 = i53 % 2;
                return null;
            case 7:
                setFontFeatureSettings setfontfeaturesettings6 = (setFontFeatureSettings) objArr[0];
                int i55 = f59731g;
                int i56 = (i55 ^ 57) + ((i55 & 57) << 1);
                int i57 = i56 % 128;
                f59730f = i57;
                int i58 = i56 % 2;
                setfontfeaturesettings6.setDividerPadding = true;
                int i59 = i57 & 37;
                int i60 = (i57 ^ 37) | i59;
                int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
                f59731g = i61 % 128;
                int i62 = i61 % 2;
                return null;
            case 8:
                setFontFeatureSettings setfontfeaturesettings7 = (setFontFeatureSettings) objArr[0];
                int i63 = f59731g;
                int i64 = (i63 & 60) + (i63 | 60);
                int i65 = (i64 ^ (-1)) + (i64 << 1);
                int i66 = i65 % 128;
                f59730f = i66;
                int i67 = i65 % 2;
                boolean z11 = setfontfeaturesettings7.setCompoundDrawableTintBlendMode;
                if (i67 != 0) {
                    throw null;
                }
                int i68 = (((i66 ^ 57) | (i66 & 57)) << 1) - (((~i66) & 57) | (i66 & (-58)));
                f59731g = i68 % 128;
                if (i68 % 2 != 0) {
                    return Boolean.valueOf(z11);
                }
                throw null;
            case 9:
                Boolean bool = Boolean.FALSE;
                setFontFeatureSettings setfontfeaturesettings8 = (setFontFeatureSettings) objArr[0];
                Object obj = objArr[1];
                int i69 = f59730f;
                int i70 = i69 & 59;
                int i71 = (i69 ^ 59) | i70;
                int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
                int i73 = i72 % 128;
                f59731g = i73;
                if (i72 % 2 == 0) {
                    throw null;
                }
                if (setfontfeaturesettings8 != obj) {
                    if (obj instanceof setFontFeatureSettings) {
                        setFontFeatureSettings setfontfeaturesettings9 = (setFontFeatureSettings) obj;
                        if (setfontfeaturesettings8.setOnFocusChangeListener != setfontfeaturesettings9.setOnFocusChangeListener) {
                            int i74 = i69 & 99;
                            int i75 = ((i69 ^ 99) | i74) << 1;
                            int i76 = -((~i74) & (i69 | 99));
                            i14 = (i75 & i76) + (i75 | i76);
                            f59731g = i14 % 128;
                        } else {
                            if (setfontfeaturesettings8.getNavBarTitleString != setfontfeaturesettings9.getNavBarTitleString) {
                                int i77 = (i73 ^ 39) + ((i73 & 39) << 1);
                                f59730f = i77 % 128;
                                int i78 = i77 % 2;
                                i13 = (((i73 | 70) << 1) - (i73 ^ 70)) - 1;
                                f59730f = i13 % 128;
                            } else if (setfontfeaturesettings8.setCompoundDrawableTintBlendMode != setfontfeaturesettings9.setCompoundDrawableTintBlendMode) {
                                int i79 = i73 + 121;
                                f59730f = i79 % 128;
                                int i80 = i79 % 2;
                                int i81 = i73 & 53;
                                int i82 = (~i81) & (i73 | 53);
                                int i83 = -(-(i81 << 1));
                                i14 = ((i82 | i83) << 1) - (i83 ^ i82);
                                f59730f = i14 % 128;
                            } else if (setfontfeaturesettings8.setDividerPadding != setfontfeaturesettings9.setDividerPadding) {
                                int i84 = i69 & 57;
                                int i85 = (((i69 ^ 57) | i84) << 1) - ((~i84) & (i69 | 57));
                                f59731g = i85 % 128;
                                int i86 = i85 % 2;
                                i13 = (((i69 ^ 9) | (i69 & 9)) << 1) - ((i69 & (-10)) | ((~i69) & 9));
                                f59731g = i13 % 128;
                            } else if (Intrinsics.areEqual(setfontfeaturesettings8.setY, setfontfeaturesettings9.setY)) {
                                int i87 = f59730f;
                                int i88 = ((i87 ^ 117) | (i87 & 117)) << 1;
                                int i89 = -(((~i87) & 117) | (i87 & (-118)));
                                int i90 = (i88 & i89) + (i89 | i88);
                                f59731g = i90 % 128;
                                if (i90 % 2 == 0) {
                                    throw null;
                                }
                                objValueOf = Boolean.TRUE;
                            } else {
                                int i91 = f59730f + 77;
                                int i92 = i91 % 128;
                                f59731g = i92;
                                int i93 = i91 % 2;
                                int i94 = i92 & 23;
                                int i95 = ((i92 | 23) & (~i94)) + (i94 << 1);
                                f59730f = i95 % 128;
                                if (i95 % 2 != 0) {
                                    int i96 = 22 / 0;
                                }
                            }
                            int i97 = i13 % 2;
                        }
                        int i98 = i14 % 2;
                        break;
                    } else {
                        int i99 = (i73 ^ 71) + ((i73 & 71) << 1);
                        int i100 = i99 % 128;
                        f59730f = i100;
                        int i101 = i99 % 2;
                        int i102 = ((i100 & 74) + (i100 | 74)) - 1;
                        f59731g = i102 % 128;
                        if (i102 % 2 == 0) {
                            int i103 = 1 / 0;
                        }
                    }
                    return bool;
                }
                int i104 = i69 & 97;
                int i105 = -(-((i69 ^ 97) | i104));
                int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
                f59731g = i106 % 128;
                objValueOf = Boolean.valueOf(i106 % 2 != 0);
                break;
                break;
            case 10:
                setFontFeatureSettings setfontfeaturesettings10 = (setFontFeatureSettings) objArr[0];
                int i107 = f59731g;
                int i108 = (i107 & (-26)) | (25 & (~i107));
                int i109 = (i107 & 25) << 1;
                int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
                f59730f = i110 % 128;
                int i111 = i110 % 2;
                cs csVar2 = setfontfeaturesettings10.setY;
                int i112 = (i107 ^ 84) + ((i107 & 84) << 1);
                int i113 = (i112 ^ (-1)) + (i112 << 1);
                f59730f = i113 % 128;
                if (i113 % 2 == 0) {
                    return csVar2;
                }
                int i114 = 51 / 0;
                return csVar2;
            case 11:
                setFontFeatureSettings setfontfeaturesettings11 = (setFontFeatureSettings) objArr[0];
                int i115 = f59731g;
                int i116 = i115 & 109;
                int i117 = ((i115 ^ 109) | i116) << 1;
                int i118 = -((i115 | 109) & (~i116));
                int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                int i120 = i119 % 128;
                f59730f = i120;
                int i121 = i119 % 2;
                boolean z12 = setfontfeaturesettings11.setDividerPadding;
                int i122 = i120 + 59;
                f59731g = i122 % 128;
                if (i122 % 2 != 0) {
                    return Boolean.valueOf(z12);
                }
                throw null;
            case 12:
                setFontFeatureSettings setfontfeaturesettings12 = (setFontFeatureSettings) objArr[0];
                int i123 = f59731g;
                int i124 = i123 & 111;
                int i125 = ((i123 ^ 111) | i124) << 1;
                int i126 = -((i123 | 111) & (~i124));
                int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                int i128 = i127 % 128;
                f59730f = i128;
                if (i127 % 2 != 0) {
                    boolean z13 = setfontfeaturesettings12.setOnFocusChangeListener;
                    throw null;
                }
                boolean z14 = setfontfeaturesettings12.setOnFocusChangeListener;
                if (z14) {
                    r14 = z14;
                    int i129 = i128 + 69;
                    f59731g = i129 % 128;
                    int i130 = i129 % 2;
                    r14 = 1;
                }
                r14 = z14;
                int i131 = r14 * 31;
                boolean z15 = setfontfeaturesettings12.getNavBarTitleString;
                ?? r1 = z15;
                if (z15) {
                    int i132 = i128 + 55;
                    int i133 = i132 % 128;
                    f59731g = i133;
                    int i134 = i132 % 2;
                    int i135 = i133 + 125;
                    f59730f = i135 % 128;
                    int i136 = i135 % 2;
                    r1 = 1;
                }
                int iIdentityHashCode = System.identityHashCode(setfontfeaturesettings12);
                int i137 = r1 * 141;
                int i138 = r14 * (-4309);
                int i139 = i137 | i138;
                int i140 = i139 << 1;
                int i141 = -((~(i138 & i137)) & i139);
                int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
                int i143 = ~r1;
                int i144 = ~i131;
                int i145 = i143 & i144;
                int i146 = ((~i143) & i131) | i145;
                int i147 = i143 & i131;
                int i148 = ~((i146 & i147) | (i146 ^ i147));
                int i149 = ~iIdentityHashCode;
                int i150 = (i143 ^ iIdentityHashCode) | (i143 & iIdentityHashCode);
                int i151 = ~i150;
                int i152 = (i150 | i151) & i151;
                int i153 = ((~i152) & i148) | ((~i148) & i152);
                int i154 = i148 & i152;
                int i155 = (i142 - (~(-(-(((i154 & i153) | (i153 ^ i154)) * (-280)))))) - 1;
                int i156 = i144 & iIdentityHashCode;
                int i157 = (~i156) & (i144 | iIdentityHashCode);
                int i158 = ~((i156 & i157) | (i157 ^ i156));
                int i159 = i151 & i158;
                int i160 = -(-((((i158 | i151) & (~i159)) | i159) * 140));
                int i161 = (i155 & i160) + (i155 | i160);
                int i162 = (~i145) & (i143 | i144);
                int i163 = ~(iIdentityHashCode | (i162 & i145) | (i162 ^ i145));
                int i164 = (i143 & i149) | (i143 ^ i149);
                int i165 = ~((i164 & i131) | (i164 ^ i131));
                int i166 = (i163 & i165) | (i163 ^ i165);
                int i167 = (i144 | i131) & i144;
                int i168 = i167 & i149;
                int i169 = (i167 | i149) & (~i168);
                int i170 = (i169 & i168) | (i169 ^ i168);
                int i171 = ~(((i170 & r1) == true ? 1 : 0) | ((i170 ^ r1) == true ? 1 : 0));
                int i172 = i166 ^ i171;
                int i173 = i166 & i171;
                int i174 = ((i173 & i172) | (i172 ^ i173)) * 140;
                int i175 = i161 | i174;
                int i176 = i175 << 1;
                int i177 = -((~(i174 & i161)) & i175);
                int i178 = ((i176 | i177) << 1) - (i177 ^ i176);
                int i179 = i178 * 31;
                boolean z16 = setfontfeaturesettings12.setCompoundDrawableTintBlendMode;
                ?? r15 = z16;
                if (z16) {
                    int i180 = f59730f;
                    int i181 = (((i180 | 90) << 1) - (i180 ^ 90)) - 1;
                    f59731g = i181 % 128;
                    int i182 = i181 % 2;
                    int i183 = (i180 & 109) + (i180 | 109);
                    f59731g = i183 % 128;
                    int i184 = i183 % 2;
                    r15 = 1;
                }
                int iIdentityHashCode2 = System.identityHashCode(setfontfeaturesettings12);
                int i185 = r15 * (-949);
                int i186 = -(~(-(-(i178 * (-29419)))));
                int i187 = (-2) - (((i185 ^ i186) + ((i186 & i185) << 1)) ^ (-1));
                int i188 = ~i179;
                int i189 = ~iIdentityHashCode2;
                int i190 = (i189 | iIdentityHashCode2) & i189;
                int i191 = i188 & i190;
                int i192 = (i188 | i190) & (~i191);
                int i193 = ~((i192 & i191) | (i192 ^ i191));
                int i194 = ~r15;
                int i195 = ~((i194 & ((i194 | r15) == true ? 1 : 0)) | iIdentityHashCode2);
                int i196 = ((i193 & i195) | ((~i195) & i193) | ((~i193) & i195)) * ReturnCode.ERR_REPOSITORY;
                int i197 = i187 & i196;
                int i198 = (i187 ^ i196) | i197;
                int i199 = ((i197 | i198) << 1) - (i198 ^ i197);
                int i200 = ~(((i190 ^ r15) == true ? 1 : 0) | ((i190 & r15) == true ? 1 : 0));
                int i201 = i179 ^ iIdentityHashCode2;
                int i202 = i179 & iIdentityHashCode2;
                int i203 = (i201 & i202) | (i201 ^ i202);
                int i204 = ~i203;
                int i205 = (i203 | i204) & i204;
                int i206 = i200 & i205;
                int i207 = (i200 | i205) & (~i206);
                int i208 = -(-(((i207 & i206) | (i207 ^ i206)) * (-950)));
                int i209 = i199 & i208;
                int i210 = (i208 | i199) & (~i209);
                int i211 = i209 << 1;
                int i212 = (i210 & i211) + (i210 | i211);
                int i213 = ~((i179 & i189) | (i189 ^ i179));
                int i214 = ~((r15 ^ iIdentityHashCode2) | (r15 & iIdentityHashCode2));
                int i215 = i213 & i214;
                int i216 = (i213 | i214) & (~i215);
                int i217 = -(-(((i216 & i215) | (i216 ^ i215)) * 950));
                int i218 = ((i212 ^ i217) | (i212 & i217)) << 1;
                int i219 = -((i217 & (~i212)) | ((~i217) & i212));
                int i220 = ((i218 & i219) + (i219 | i218)) * 31;
                boolean z17 = setfontfeaturesettings12.setDividerPadding;
                ?? r13 = z17;
                if (z17) {
                    int i221 = f59731g;
                    int i222 = (i221 ^ 19) + ((i221 & 19) << 1);
                    f59730f = i222 % 128;
                    r13 = i222 % 2 != 0 ? 0 : 1;
                }
                int i223 = -(-r13);
                int i224 = i220 & i223;
                int i225 = -(-(i223 | i220));
                int i226 = ((i224 ^ i225) + ((i225 & i224) << 1)) * 31;
                cs csVar3 = setfontfeaturesettings12.setY;
                if (csVar3 == null) {
                    int i227 = f59730f + 85;
                    int i228 = i227 % 128;
                    f59731g = i228;
                    int i229 = i227 % 2;
                    int i230 = i228 & 87;
                    int i231 = (i230 - (~(-(-((i228 ^ 87) | i230))))) - 1;
                    f59730f = i231 % 128;
                    int i232 = i231 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = csVar3.hashCode();
                    int i233 = f59730f;
                    int i234 = (i233 & 41) + (i233 | 41);
                    f59731g = i234 % 128;
                    int i235 = i234 % 2;
                }
                int i236 = -(-iHashCode);
                int i237 = (i226 ^ i236) + ((i236 & i226) << 1);
                int i238 = f59731g + 31;
                f59730f = i238 % 128;
                if (i238 % 2 != 0) {
                    int i239 = 17 / 0;
                }
                objValueOf = Integer.valueOf(i237);
                break;
                break;
            case 13:
                setFontFeatureSettings setfontfeaturesettings13 = (setFontFeatureSettings) objArr[0];
                int i240 = f59731g;
                int i241 = (i240 & 98) + (i240 | 98);
                int i242 = (i241 ^ (-1)) + (i241 << 1);
                f59730f = i242 % 128;
                int i243 = i242 % 2;
                setfontfeaturesettings13.setCompoundDrawableTintBlendMode = true;
                int iIdentityHashCode3 = System.identityHashCode(setfontfeaturesettings13);
                int i244 = ~iIdentityHashCode3;
                int i245 = ((-2097677393) & i244) | (2097677392 & iIdentityHashCode3);
                int i246 = (-2097677393) & iIdentityHashCode3;
                int i247 = ~((i246 & i245) | (i245 ^ i246));
                int i248 = i244 ^ (-14154406);
                int i249 = i244 & (-14154406);
                int i250 = (i248 & i249) | (i248 ^ i249);
                int i251 = i250 & 2098951409;
                int i252 = (i250 | 2098951409) & (~i251);
                int i253 = ~((i252 & i251) | (i252 ^ i251));
                int i254 = -(~(-(-(((i247 & i253) | ((~i253) & i247) | ((~i247) & i253)) * (-318)))));
                int i255 = iIdentityHashCode3 & 14154405;
                int i256 = i249 | i255;
                int i257 = iIdentityHashCode3 & (-14154406);
                int i258 = ~((i256 ^ i257) | (i256 & i257));
                int i259 = (((i258 & 1274017) | (1274017 ^ i258)) * (-318)) + ((((-257419299) ^ i254) + ((i254 & (-257419299)) << 1)) - 1);
                int i260 = i257 | (i244 & 14154405);
                int i261 = (i260 & i255) | (i260 ^ i255);
                int i262 = ~i261;
                int i263 = (i261 | i262) & i262;
                int i264 = (-2098951410) ^ i263;
                int i265 = i263 & (-2098951410);
                int i266 = ((i265 & i264) | (i264 ^ i265)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                int i267 = (i259 & i266) + (i266 | i259);
                int iIdentityHashCode4 = System.identityHashCode(setfontfeaturesettings13);
                int i268 = 1991637637 & iIdentityHashCode4;
                int i269 = (~i268) & (1991637637 | iIdentityHashCode4);
                int i270 = ~((i269 & i268) | (i269 ^ i268));
                int i271 = ((~i270) & 34888192) | ((-34888193) & i270);
                int i272 = i270 & 34888192;
                int i273 = ((i272 & i271) | (i271 ^ i272)) * (-196);
                int i274 = (-1572967608) & i273;
                int i275 = (i273 ^ (-1572967608)) | i274;
                int i276 = ((i274 & i275) + (i275 | i274)) - 1644612872;
                int i277 = (iIdentityHashCode4 ^ 1991637637) | i268;
                int i278 = ~i277;
                int i279 = (i277 | i278) & i278;
                int i280 = 1956749445 & i279;
                int i281 = (i279 | 1956749445) & (~i280);
                if (i267 > (((i281 & i280) | (i281 ^ i280)) * 196) + i276) {
                    return null;
                }
                throw null;
            default:
                setFontFeatureSettings setfontfeaturesettings14 = (setFontFeatureSettings) objArr[0];
                int i282 = f59731g;
                int i283 = (((i282 ^ 83) | (i282 & 83)) << 1) - (((~i282) & 83) | (i282 & (-84)));
                int i284 = i283 % 128;
                f59730f = i284;
                int i285 = i283 % 2;
                boolean z18 = setfontfeaturesettings14.setOnFocusChangeListener;
                int i286 = i284 + 51;
                f59731g = i286 % 128;
                if (i286 % 2 == 0) {
                    int i287 = 50 / 0;
                }
                objValueOf = Boolean.valueOf(z18);
                break;
        }
        return objValueOf;
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 1700899917, -1700899908, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "getNavBarTitleString")
    public final void getNavBarTitleString() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1486503178, 1486503191, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1250574018, -1250574006, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setDividerPadding")
    public final boolean setDividerPadding() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1612421959, -1612421951, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setLayoutAnimation")
    public final void setLayoutAnimation() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -607042329, 607042336, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    @Nullable
    public final cs setNavigationOnClickListener() {
        return (cs) setCompoundDrawableTintBlendMode(new Object[]{this}, -1608275827, 1608275837, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    public final boolean setOnDragListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -2133249192, 2133249203, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1570467641, 1570467643, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setOnLongClickListener")
    public final boolean setOnLongClickListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 173483714, -173483711, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setX")
    public final boolean setX() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1512289586, 1512289586, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setY")
    public final void setY(@Nullable cs csVar) {
        setCompoundDrawableTintBlendMode(new Object[]{this, csVar}, -1309573751, 1309573755, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1376059985, -1376059984, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    public final void setY() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1116953809, 1116953814, System.identityHashCode(this));
    }

    public setFontFeatureSettings() {
        this(false, false, false, false, null, 31, null);
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 797149146, -797149140, System.identityHashCode(this));
    }
}
