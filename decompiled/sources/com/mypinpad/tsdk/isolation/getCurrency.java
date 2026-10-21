package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.esotericsoftware.asm.Opcodes;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010!¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0018\u0010$"}, d2 = {"Lcom/mypinpad/tsdk/i/getCurrency;", "", "Lcom/mypinpad/tsdk/i/Terminal;", "p0", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "p1", "", "setY", "(Lcom/mypinpad/tsdk/i/Terminal;Lcom/mypinpad/tsdk/i/setMaxWidth;)Z", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/mypinpad/tsdk/i/Terminal;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/Terminal;", "b", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "()Lcom/mypinpad/tsdk/i/setMaxWidth;", "setOnFocusChangeListener", "", "Lcom/mypinpad/tsdk/i/setBackgroundTintList;", "Lcom/mypinpad/tsdk/i/create;", "c", "Ljava/util/Map;", "setX", "()Ljava/util/Map;", "setDividerPadding", "Lcom/mypinpad/tsdk/i/getInstallationId;", "d", "Lcom/mypinpad/tsdk/i/getInstallationId;", "()Lcom/mypinpad/tsdk/i/getInstallationId;", "p2", "p3", "<init>", "(Lcom/mypinpad/tsdk/i/Terminal;Lcom/mypinpad/tsdk/i/setMaxWidth;Ljava/util/Map;Lcom/mypinpad/tsdk/i/getInstallationId;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class getCurrency {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55738e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55739f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Terminal setY;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setMaxWidth setOnFocusChangeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<setBackgroundTintList, create> setDividerPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final getInstallationId setCompoundDrawableTintBlendMode;

    public getCurrency(@NotNull Terminal terminal, @NotNull setMaxWidth setmaxwidth, @NotNull Map<setBackgroundTintList, create> map, @Nullable getInstallationId getinstallationid) {
        Intrinsics.checkNotNullParameter(terminal, "");
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.setY = terminal;
        this.setOnFocusChangeListener = setmaxwidth;
        this.setDividerPadding = map;
        this.setCompoundDrawableTintBlendMode = getinstallationid;
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        getCurrency getcurrency = (getCurrency) objArr[0];
        Object obj = objArr[1];
        int i10 = f55738e;
        int i11 = i10 & 25;
        int i12 = (i10 ^ 25) | i11;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        int i14 = i13 % 128;
        f55739f = i14;
        int i15 = i13 % 2;
        if (getcurrency == obj) {
            int i16 = i14 + 3;
            f55738e = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i14 ^ 109;
            int i19 = -(-((i14 & 109) << 1));
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            f55738e = i20 % 128;
            if (i20 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (!(obj instanceof getCurrency)) {
            int i21 = i10 + 105;
            f55739f = i21 % 128;
            return Boolean.valueOf(i21 % 2 == 0);
        }
        getCurrency getcurrency2 = (getCurrency) obj;
        if (getcurrency.setY != getcurrency2.setY) {
            int i22 = i10 + 61;
            f55739f = i22 % 128;
            int i23 = i22 % 2;
            return Boolean.FALSE;
        }
        if (!Intrinsics.areEqual(getcurrency.setOnFocusChangeListener, getcurrency2.setOnFocusChangeListener)) {
            int i24 = f55738e;
            int i25 = ((i24 & 28) + (i24 | 28)) - 1;
            f55739f = i25 % 128;
            int i26 = i25 % 2;
            int i27 = i24 & 15;
            int i28 = ((i24 ^ 15) | i27) << 1;
            int i29 = -((i24 | 15) & (~i27));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f55739f = i30 % 128;
            int i31 = i30 % 2;
            return Boolean.FALSE;
        }
        if (!Intrinsics.areEqual(getcurrency.setDividerPadding, getcurrency2.setDividerPadding)) {
            int i32 = f55739f;
            int i33 = ((i32 | 19) << 1) - (i32 ^ 19);
            f55738e = i33 % 128;
            int i34 = i33 % 2;
            int i35 = i32 & 7;
            int i36 = (i32 | 7) & (~i35);
            int i37 = i35 << 1;
            int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
            f55738e = i38 % 128;
            int i39 = i38 % 2;
            return Boolean.FALSE;
        }
        if (!(!Intrinsics.areEqual(getcurrency.setCompoundDrawableTintBlendMode, getcurrency2.setCompoundDrawableTintBlendMode))) {
            int i40 = f55738e + 33;
            f55739f = i40 % 128;
            int i41 = i40 % 2;
            return Boolean.TRUE;
        }
        int i42 = f55738e;
        int i43 = i42 & 23;
        int i44 = (i43 - (~(-(-((i42 ^ 23) | i43))))) - 1;
        int i45 = i44 % 128;
        f55739f = i45;
        int i46 = i44 % 2;
        int i47 = i45 & 47;
        int i48 = (i45 | 47) & (~i47);
        int i49 = i47 << 1;
        int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
        f55738e = i50 % 128;
        int i51 = i50 % 2;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x01b5  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object objValueOf;
        int iHashCode;
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        switch ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16) {
            case 1:
                getCurrency getcurrency = (getCurrency) objArr[0];
                int i20 = f55738e;
                int i21 = i20 + 85;
                f55739f = i21 % 128;
                int i22 = i21 % 2;
                objValueOf = getcurrency.setDividerPadding;
                int i23 = (i20 & 47) + (i20 | 47);
                f55739f = i23 % 128;
                int i24 = i23 % 2;
                break;
            case 2:
                return a(objArr);
            case 3:
                getCurrency getcurrency2 = (getCurrency) objArr[0];
                int i25 = f55738e;
                int i26 = i25 & 45;
                int i27 = -(-((i25 ^ 45) | i26));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                f55739f = i28 % 128;
                int i29 = i28 % 2;
                setMaxWidth setmaxwidth = getcurrency2.setOnFocusChangeListener;
                int iIdentityHashCode = System.identityHashCode(getcurrency2);
                int i30 = (-143262725) ^ iIdentityHashCode;
                int i31 = (-143262725) & iIdentityHashCode;
                int i32 = ~((i30 & i31) | (i30 ^ i31));
                int i33 = 142738432 & i32;
                int i34 = (i32 | 142738432) & (~i33);
                int i35 = (-347784269) - (~(((i34 & i33) | (i34 ^ i33)) * 305));
                int i36 = ~iIdentityHashCode;
                int i37 = (i36 & (-143262725)) | (i36 ^ (-143262725));
                int i38 = ~i37;
                int i39 = (i37 | i38) & i38;
                int i40 = 1050920297 ^ i39;
                int i41 = i39 & 1050920297;
                int i42 = ((i41 & i40) | (i40 ^ i41)) * 305;
                int i43 = i35 ^ i42;
                int i44 = (i42 & i35) << 1;
                int i45 = (i43 & i44) + (i44 | i43);
                int iIdentityHashCode2 = System.identityHashCode(getcurrency2);
                int i46 = (-711704141) & iIdentityHashCode2;
                int i47 = (~i46) & ((-711704141) | iIdentityHashCode2);
                int i48 = (i47 & i46) | (i47 ^ i46);
                int i49 = ~i48;
                int i50 = (i48 | i49) & i49;
                int i51 = (-632177397) ^ i50;
                int i52 = i50 & (-632177397);
                int i53 = -(~(-(-(((i52 & i51) | (i51 ^ i52)) * (-668)))));
                int i54 = (-2) - (((181727695 & i53) + (i53 | 181727695)) ^ (-1));
                int i55 = ~(((-632177397) ^ iIdentityHashCode2) | ((-632177397) & iIdentityHashCode2));
                int i56 = ((~i55) & (-711704141)) | (711704140 & i55);
                int i57 = i55 & (-711704141);
                int i58 = -(-(((i57 & i56) | (i56 ^ i57)) * 1336));
                int i59 = i54 & i58;
                int i60 = (i54 ^ i58) | i59;
                int i61 = (i59 & i60) + (i60 | i59);
                int i62 = (iIdentityHashCode2 ^ (-711704141)) | i46;
                int i63 = (632177396 & i62) | ((~i62) & (-632177397));
                int i64 = i62 & (-632177397);
                int i65 = -(~(-(-(((i64 & i63) | (i63 ^ i64)) * 668))));
                int i66 = (i61 & i65) + (i65 | i61);
                if (i45 <= (i66 ^ (-1)) + (i66 << 1)) {
                    return setmaxwidth;
                }
                throw null;
            case 4:
                getCurrency getcurrency3 = (getCurrency) objArr[0];
                int i67 = f55739f;
                int i68 = i67 & 33;
                int i69 = (((i67 | 33) & (~i68)) - (~(i68 << 1))) - 1;
                int i70 = i69 % 128;
                f55738e = i70;
                int i71 = i69 % 2;
                Terminal terminal = getcurrency3.setY;
                int i72 = (-2) - ((i70 + 38) ^ (-1));
                f55739f = i72 % 128;
                int i73 = i72 % 2;
                return terminal;
            case 5:
                getCurrency getcurrency4 = (getCurrency) objArr[0];
                int i74 = f55738e;
                int i75 = i74 & 113;
                int i76 = (i74 | 113) & (~i75);
                int i77 = i75 << 1;
                int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
                f55739f = i78 % 128;
                int i79 = i78 % 2;
                int iHashCode2 = getcurrency4.setY.hashCode() * 31;
                int i80 = -(-getcurrency4.setOnFocusChangeListener.hashCode());
                int i81 = iHashCode2 & i80;
                int i82 = (iHashCode2 | i80) & (~i81);
                int i83 = -(-(i81 << 1));
                int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
                int i85 = i84 * 31;
                int iHashCode3 = getcurrency4.setDividerPadding.hashCode();
                int iIdentityHashCode3 = System.identityHashCode(getcurrency4);
                int i86 = iHashCode3 * 55;
                int i87 = i84 * (-3317);
                int i88 = i86 & i87;
                int i89 = (i87 ^ i86) | i88;
                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                int i91 = ~iHashCode3;
                int i92 = ~i85;
                int i93 = ~((i91 ^ i85) | (i91 & i85));
                int i94 = ~iIdentityHashCode3;
                int i95 = i94 & i85;
                int i96 = ~(i95 | ((~i95) & (i94 | i85)));
                int i97 = i93 ^ i96;
                int i98 = i93 & i96;
                int i99 = ((i98 & i97) | (i97 ^ i98)) * (-108);
                int i100 = i90 & i99;
                int i101 = (i90 ^ i99) | i100;
                int i102 = (i100 & i101) + (i101 | i100);
                int i103 = i91 | iIdentityHashCode3;
                int i104 = ~i103;
                int i105 = (i103 | i104) & i104;
                int i106 = i92 | iHashCode3;
                int i107 = ~i106;
                int i108 = (i106 | i107) & i107;
                int i109 = i105 & i108;
                int i110 = ((i105 | i108) & (~i109)) | i109;
                int i111 = i94 & (i94 | iIdentityHashCode3);
                int i112 = (i111 & i91) | ((~i111) & iHashCode3);
                int i113 = i111 & iHashCode3;
                int i114 = ~((i113 & i112) | (i112 ^ i113));
                int i115 = ((i110 & i114) | (i110 ^ i114)) * 54;
                int i116 = ((i102 & i115) - (~(-(-(i115 | i102))))) - 1;
                int i117 = (i85 | i92) & i92;
                int i118 = (i91 & i117) | ((~i117) & iHashCode3);
                int i119 = i117 & iHashCode3;
                int i120 = ~((i119 & i118) | (i118 ^ i119));
                int i121 = -(-(((i120 & iIdentityHashCode3) | (iIdentityHashCode3 ^ i120)) * 54));
                int i122 = ((~i121) & i116) | ((~i116) & i121);
                int i123 = (i121 & i116) << 1;
                int i124 = ((i122 & i123) + (i123 | i122)) * 31;
                getInstallationId getinstallationid = getcurrency4.setCompoundDrawableTintBlendMode;
                if (getinstallationid == null) {
                    int i125 = f55738e;
                    int i126 = (((i125 & (-72)) | ((~i125) & 71)) - (~(-(-((i125 & 71) << 1))))) - 1;
                    int i127 = i126 % 128;
                    f55739f = i127;
                    int i128 = i126 % 2;
                    int i129 = i127 + 123;
                    f55738e = i129 % 128;
                    int i130 = i129 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = getinstallationid.hashCode();
                    int i131 = f55739f;
                    int i132 = i131 & 123;
                    int i133 = i131 | 123;
                    int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                    f55738e = i134 % 128;
                    int i135 = i134 % 2;
                }
                int i136 = -(~(-(-iHashCode)));
                int i137 = (-2) - ((((i124 | i136) << 1) - (i136 ^ i124)) ^ (-1));
                int i138 = f55739f;
                int i139 = ((i138 | 49) << 1) - (i138 ^ 49);
                f55738e = i139 % 128;
                if (i139 % 2 != 0) {
                    int i140 = 78 / 0;
                }
                objValueOf = Integer.valueOf(i137);
                break;
            case 6:
                getCurrency getcurrency5 = (getCurrency) objArr[0];
                Terminal terminal2 = (Terminal) objArr[1];
                setMaxWidth setmaxwidth2 = (setMaxWidth) objArr[2];
                Intrinsics.checkNotNullParameter(terminal2, "");
                Intrinsics.checkNotNullParameter(setmaxwidth2, "");
                setMaxWidth setmaxwidth3 = new setMaxWidth();
                setMaxWidth.setX(new Object[]{setmaxwidth3, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth3));
                setMaxWidth.setX(new Object[]{setmaxwidth3, (setMaxWidth) setX(new Object[]{getcurrency5}, -614599099, 614599102, System.identityHashCode(getcurrency5))}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth3));
                if (getcurrency5.setY == Terminal.OTHER) {
                    int i141 = f55738e;
                    int i142 = (((i141 & (-38)) | ((~i141) & 37)) - (~((i141 & 37) << 1))) - 1;
                    f55739f = i142 % 128;
                    int i143 = i142 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i144 = f55738e;
                    int i145 = i144 & 111;
                    int i146 = (i144 ^ 111) | i145;
                    int i147 = (i145 ^ i146) + ((i146 & i145) << 1);
                    f55739f = i147 % 128;
                    int i148 = i147 % 2;
                    Map<setBackgroundTintList, create> map = getcurrency5.setDividerPadding;
                    if (i148 == 0) {
                        map.isEmpty();
                        throw null;
                    }
                    if (!map.isEmpty()) {
                        Iterator<Map.Entry<setBackgroundTintList, create>> it = map.entrySet().iterator();
                        int i149 = f55739f;
                        int i150 = i149 & 97;
                        int i151 = ((i149 | 97) & (~i150)) + (i150 << 1);
                        f55738e = i151 % 128;
                        int i152 = i151 % 2;
                        while (it.hasNext()) {
                            int i153 = f55739f;
                            int i154 = i153 & 101;
                            int i155 = i153 | 101;
                            int i156 = ((i154 | i155) << 1) - (i155 ^ i154);
                            f55738e = i156 % 128;
                            int i157 = i156 % 2;
                            create value = it.next().getValue();
                            ((Boolean) create.setDividerPadding(new Object[]{value, terminal2, setmaxwidth3}, 1343966852, -1343966851, System.identityHashCode(value))).booleanValue();
                            int i158 = f55739f;
                            int i159 = i158 & 117;
                            int i160 = (((i158 ^ 117) | i159) << 1) - ((i158 | 117) & (~i159));
                            f55738e = i160 % 128;
                            int i161 = i160 % 2;
                        }
                    }
                    getInstallationId getinstallationid2 = getcurrency5.setCompoundDrawableTintBlendMode;
                    if (getinstallationid2 != null) {
                        boolean zBooleanValue = ((Boolean) getInstallationId.setX(new Object[]{getinstallationid2, terminal2}, -823358435, 823358435, System.identityHashCode(getinstallationid2))).booleanValue();
                        int i162 = f55739f;
                        int i163 = (i162 ^ 62) + ((i162 & 62) << 1);
                        int i164 = (i163 ^ (-1)) + (i163 << 1);
                        f55738e = i164 % 128;
                        int i165 = i164 % 2;
                        if (!zBooleanValue) {
                            int i1410 = f55738e;
                            int i1411 = (((i1410 & (-38)) | ((~i1410) & 37)) - (~((i1410 & 37) << 1))) - 1;
                            f55739f = i1411 % 128;
                            int i1412 = i1411 % 2;
                            objValueOf = Boolean.FALSE;
                            break;
                        }
                    } else {
                        int i166 = f55739f;
                        int i167 = (((i166 & (-116)) | ((~i166) & 115)) - (~(-(-((i166 & 115) << 1))))) - 1;
                        f55738e = i167 % 128;
                        int i168 = i167 % 2;
                        int i169 = i166 & 17;
                        int i170 = -(-((i166 ^ 17) | i169));
                        int i171 = (i169 ^ i170) + ((i170 & i169) << 1);
                        f55738e = i171 % 128;
                        int i172 = i171 % 2;
                    }
                    int i173 = f55739f;
                    int i174 = i173 & 33;
                    int i175 = i173 | 33;
                    int i176 = (i174 & i175) + (i175 | i174);
                    f55738e = i176 % 128;
                    objValueOf = Boolean.valueOf(!(i176 % 2 != 0));
                }
                break;
            case 7:
                int i177 = f55739f;
                int i178 = i177 + 21;
                f55738e = i178 % 128;
                int i179 = i178 % 2;
                int i180 = i177 + 61;
                f55738e = i180 % 128;
                if (i180 % 2 == 0) {
                    return "KC";
                }
                throw null;
            default:
                getCurrency getcurrency6 = (getCurrency) objArr[0];
                int i181 = f55738e;
                int i182 = (i181 & (-22)) | ((~i181) & 21);
                int i183 = (i181 & 21) << 1;
                int i184 = (i182 ^ i183) + ((i183 & i182) << 1);
                f55739f = i184 % 128;
                int i185 = i184 % 2;
                getInstallationId getinstallationid3 = getcurrency6.setCompoundDrawableTintBlendMode;
                System.identityHashCode(getcurrency6);
                System.identityHashCode(getcurrency6);
                return getinstallationid3;
        }
        return objValueOf;
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 1267329805, -1267329803, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 959725059, -959725054, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final Terminal setCompoundDrawableTintBlendMode() {
        return (Terminal) setX(new Object[]{this}, 1627963721, -1627963717, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final getInstallationId setOnFocusChangeListener() {
        return (getInstallationId) setX(new Object[]{this}, 420009329, -420009329, System.identityHashCode(this));
    }

    public final boolean setY(@NotNull Terminal p4, @NotNull setMaxWidth p10) {
        return ((Boolean) setX(new Object[]{this, p4, p10}, -893217322, 893217328, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -281263518, 281263525, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final setMaxWidth setY() {
        return (setMaxWidth) setX(new Object[]{this}, -614599099, 614599102, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final Map<setBackgroundTintList, create> setX() {
        return (Map) setX(new Object[]{this}, -1971128226, 1971128227, System.identityHashCode(this));
    }
}
