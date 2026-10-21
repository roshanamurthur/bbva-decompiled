package com.mypinpad.tsdk.isolation;

import c2.b;
import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00198\u0007X\u0087\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c"}, d2 = {"Lcom/mypinpad/tsdk/i/setNextFocusRightId;", "", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "p0", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "setX", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setDividerPadding", "c", "setOnFocusChangeListener", "d", "setY", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "e", "Lcom/mypinpad/tsdk/i/setMaxWidth;", "()Lcom/mypinpad/tsdk/i/setMaxWidth;", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/mypinpad/tsdk/i/setMaxWidth;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class setNextFocusRightId {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60170f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60171g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long setDividerPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long setOnFocusChangeListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long setY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setMaxWidth setCompoundDrawableTintBlendMode;

    public setNextFocusRightId(@NotNull String str, @Nullable Long l6, @Nullable Long l7, @Nullable Long l10, @NotNull setMaxWidth setmaxwidth) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        this.setX = str;
        this.setDividerPadding = l6;
        this.setOnFocusChangeListener = l7;
        this.setY = l10;
        this.setCompoundDrawableTintBlendMode = setmaxwidth;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int iHashCode;
        int iHashCode2;
        int i16 = (i11 * (-657)) + (i10 * 659);
        int i17 = ~((~i10) | i11);
        int i18 = ~((~i11) | i10);
        int i19 = ~(i10 | i12);
        int i20 = ((i17 | i18 | i19) * (-658)) + i16;
        int iHashCode3 = 0;
        switch (((i19 | i18) * 658) + (i18 * 658) + i20) {
            case 1:
                Boolean bool = Boolean.FALSE;
                setNextFocusRightId setnextfocusrightid = (setNextFocusRightId) objArr[0];
                Object obj = objArr[1];
                int i21 = f60171g;
                int i22 = i21 & 105;
                int i23 = i21 | 105;
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                f60170f = i24 % 128;
                int i25 = i24 % 2;
                if (setnextfocusrightid != obj) {
                    if (!(obj instanceof setNextFocusRightId)) {
                        int i26 = ((i21 | 39) << 1) - (i21 ^ 39);
                        int i27 = i26 % 128;
                        f60170f = i27;
                        boolean z10 = i26 % 2 != 0;
                        int i28 = (i27 & 123) + (i27 | 123);
                        f60171g = i28 % 128;
                        int i29 = i28 % 2;
                        return Boolean.valueOf(z10);
                    }
                    setNextFocusRightId setnextfocusrightid2 = (setNextFocusRightId) obj;
                    if (!Intrinsics.areEqual(setnextfocusrightid.setX, setnextfocusrightid2.setX)) {
                        int i30 = f60170f;
                        int i31 = i30 & 59;
                        int i32 = -(-(i30 | 59));
                        int i33 = (i31 & i32) + (i32 | i31);
                        int i34 = i33 % 128;
                        f60171g = i34;
                        int i35 = i33 % 2;
                        int i36 = (i34 & (-52)) | ((~i34) & 51);
                        int i37 = (i34 & 51) << 1;
                        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                        f60170f = i38 % 128;
                        if (i38 % 2 != 0) {
                            int i39 = 77 / 0;
                        }
                    } else if (Intrinsics.areEqual(setnextfocusrightid.setDividerPadding, setnextfocusrightid2.setDividerPadding)) {
                        if (!Intrinsics.areEqual(setnextfocusrightid.setOnFocusChangeListener, setnextfocusrightid2.setOnFocusChangeListener)) {
                            int i40 = f60170f;
                            int i41 = i40 & 25;
                            int i42 = ((i40 ^ 25) | i41) << 1;
                            int i43 = -((i40 | 25) & (~i41));
                            i14 = i42 ^ i43;
                            i15 = (i43 & i42) << 1;
                        } else {
                            if (!Intrinsics.areEqual(setnextfocusrightid.setY, setnextfocusrightid2.setY)) {
                                int i44 = f60171g;
                                int i45 = i44 & 101;
                                int i46 = ((i44 ^ 101) | i45) << 1;
                                int i47 = -((i44 | 101) & (~i45));
                                i13 = ((i46 | i47) << 1) - (i47 ^ i46);
                                f60170f = i13 % 128;
                            } else if (Intrinsics.areEqual(setnextfocusrightid.setCompoundDrawableTintBlendMode, setnextfocusrightid2.setCompoundDrawableTintBlendMode)) {
                                int i48 = f60170f;
                                int i49 = i48 & 61;
                                int i50 = ((i48 ^ 61) | i49) << 1;
                                int i51 = -((i48 | 61) & (~i49));
                                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                                f60171g = i52 % 128;
                                int i53 = i52 % 2;
                            } else {
                                int i54 = f60171g;
                                int i55 = (((i54 & (-104)) | ((~i54) & 103)) - (~(-(-((i54 & 103) << 1))))) - 1;
                                int i56 = i55 % 128;
                                f60170f = i56;
                                int i57 = i55 % 2;
                                int i58 = i56 & 3;
                                int i59 = (i56 | 3) & (~i58);
                                int i60 = -(-(i58 << 1));
                                i14 = i59 & i60;
                                i15 = i59 | i60;
                            }
                            int i61 = i13 % 2;
                        }
                        i13 = i14 + i15;
                        f60171g = i13 % 128;
                        int i62 = i13 % 2;
                    } else {
                        int i63 = f60171g;
                        int i64 = (i63 & 45) + (i63 | 45);
                        f60170f = i64 % 128;
                        int i65 = i64 % 2;
                    }
                    return bool;
                }
                int i66 = i21 & 73;
                int i67 = (((i21 ^ 73) | i66) << 1) - ((~i66) & (i21 | 73));
                int i68 = i67 % 128;
                f60170f = i68;
                int i69 = i67 % 2;
                int i70 = (-2) - (((i68 ^ 82) + ((i68 & 82) << 1)) ^ (-1));
                f60171g = i70 % 128;
                if (i70 % 2 == 0) {
                    int i71 = 96 / 0;
                }
                return Boolean.TRUE;
            case 2:
                setNextFocusRightId setnextfocusrightid3 = (setNextFocusRightId) objArr[0];
                int i72 = f60170f;
                int i73 = (i72 | 69) << 1;
                int i74 = -((i72 & (-70)) | ((~i72) & 69));
                int i75 = (i73 & i74) + (i73 | i74);
                f60171g = i75 % 128;
                int i76 = i75 % 2;
                Long l6 = setnextfocusrightid3.setY;
                if (i76 == 0) {
                    int i77 = 98 / 0;
                }
                int i78 = i72 & 107;
                int i79 = (i72 | 107) & (~i78);
                int i80 = i78 << 1;
                int i81 = ((i79 | i80) << 1) - (i79 ^ i80);
                f60171g = i81 % 128;
                int i82 = i81 % 2;
                return l6;
            case 3:
                int i83 = f60170f;
                int i84 = ((i83 | 109) << 1) - (i83 ^ 109);
                f60171g = i84 % 128;
                int i85 = i84 % 2;
                int i86 = (i83 & 120) + (i83 | 120);
                int i87 = (i86 ^ (-1)) + (i86 << 1);
                f60171g = i87 % 128;
                int i88 = i87 % 2;
                return ComponentDTO.CROSS_COMPONENT;
            case 4:
                setNextFocusRightId setnextfocusrightid4 = (setNextFocusRightId) objArr[0];
                int i89 = f60171g;
                int i90 = i89 ^ 41;
                int i91 = ((i89 & 41) | i90) << 1;
                int i92 = -i90;
                int i93 = ((i91 | i92) << 1) - (i91 ^ i92);
                int i94 = i93 % 128;
                f60170f = i94;
                int i95 = i93 % 2;
                String str = setnextfocusrightid4.setX;
                if (i95 != 0) {
                    throw null;
                }
                int i96 = ((i94 | 99) << 1) - (i94 ^ 99);
                f60171g = i96 % 128;
                if (i96 % 2 != 0) {
                    return str;
                }
                int i97 = 8 / 0;
                return str;
            case 5:
                setNextFocusRightId setnextfocusrightid5 = (setNextFocusRightId) objArr[0];
                int i98 = f60171g;
                int i99 = i98 & 15;
                int i100 = (i99 - (~(-(-((i98 ^ 15) | i99))))) - 1;
                f60170f = i100 % 128;
                int i101 = i100 % 2;
                int iHashCode4 = setnextfocusrightid5.setX.hashCode() * 31;
                Long l7 = setnextfocusrightid5.setDividerPadding;
                if (l7 == null) {
                    int i102 = f60170f;
                    int i103 = ((i102 | 33) << 1) - (i102 ^ 33);
                    int i104 = i103 % 128;
                    f60171g = i104;
                    iHashCode = i103 % 2 == 0 ? 1 : 0;
                    int i105 = (((i104 ^ 9) | (i104 & 9)) << 1) - (((~i104) & 9) | (i104 & (-10)));
                    f60170f = i105 % 128;
                    int i106 = i105 % 2;
                } else {
                    iHashCode = l7.hashCode();
                    int i107 = f60170f;
                    int i108 = (-2) - ((((i107 | 78) << 1) - (i107 ^ 78)) ^ (-1));
                    f60171g = i108 % 128;
                    int i109 = i108 % 2;
                }
                int i110 = -(~iHashCode);
                int i111 = ((((iHashCode4 | i110) << 1) - (iHashCode4 ^ i110)) - 1) * 31;
                Long l10 = setnextfocusrightid5.setOnFocusChangeListener;
                if (l10 == null) {
                    int i112 = f60170f;
                    int i113 = (i112 ^ 61) + ((i112 & 61) << 1);
                    f60171g = i113 % 128;
                    iHashCode2 = i113 % 2 == 0 ? 1 : 0;
                    int i114 = (i112 & 77) + (i112 | 77);
                    f60171g = i114 % 128;
                    int i115 = i114 % 2;
                } else {
                    iHashCode2 = l10.hashCode();
                    int i116 = f60170f + 95;
                    f60171g = i116 % 128;
                    int i117 = i116 % 2;
                }
                int i118 = -(-iHashCode2);
                int i119 = i111 & i118;
                int iE = b.e(((i111 ^ i118) | i119) << 1, ~(-((i118 | i111) & (~i119))), 1, 31);
                Long l11 = setnextfocusrightid5.setY;
                if (l11 == null) {
                    int i120 = f60171g;
                    int i121 = (i120 ^ 125) + ((i120 & 125) << 1);
                    f60170f = i121 % 128;
                    int i122 = i121 % 2;
                } else {
                    iHashCode3 = l11.hashCode();
                    System.identityHashCode(setnextfocusrightid5);
                    System.identityHashCode(setnextfocusrightid5);
                }
                int i123 = -(-iHashCode3);
                int i124 = ((iE & i123) + (iE | i123)) * 31;
                int i125 = -(~setnextfocusrightid5.setCompoundDrawableTintBlendMode.hashCode());
                int i126 = (((i124 | i125) << 1) - (i125 ^ i124)) - 1;
                int i127 = f60171g;
                int i128 = ((i127 & 85) - (~(-(-(i127 | 85))))) - 1;
                f60170f = i128 % 128;
                if (i128 % 2 == 0) {
                    return Integer.valueOf(i126);
                }
                throw null;
            case 6:
                setNextFocusRightId setnextfocusrightid6 = (setNextFocusRightId) objArr[0];
                int i129 = f60171g;
                int i130 = i129 & 57;
                int i131 = i130 + ((i129 ^ 57) | i130);
                int i132 = i131 % 128;
                f60170f = i132;
                int i133 = i131 % 2;
                setMaxWidth setmaxwidth = setnextfocusrightid6.setCompoundDrawableTintBlendMode;
                int i134 = (i132 & 113) + (i132 | 113);
                f60171g = i134 % 128;
                int i135 = i134 % 2;
                return setmaxwidth;
            case 7:
                setNextFocusRightId setnextfocusrightid7 = (setNextFocusRightId) objArr[0];
                int i136 = f60170f;
                int i137 = i136 + 11;
                f60171g = i137 % 128;
                int i138 = i137 % 2;
                Long l12 = setnextfocusrightid7.setOnFocusChangeListener;
                int i139 = i136 + 125;
                f60171g = i139 % 128;
                if (i139 % 2 != 0) {
                    return l12;
                }
                throw null;
            default:
                setNextFocusRightId setnextfocusrightid8 = (setNextFocusRightId) objArr[0];
                int i140 = f60171g;
                int i141 = i140 & 99;
                int i142 = (i140 ^ 99) | i141;
                int i143 = (i141 ^ i142) + ((i141 & i142) << 1);
                f60170f = i143 % 128;
                int i144 = i143 % 2;
                Long l13 = setnextfocusrightid8.setDividerPadding;
                int i145 = ((i140 & (-100)) | ((~i140) & 99)) + ((i140 & 99) << 1);
                f60170f = i145 % 128;
                int i146 = i145 % 2;
                return l13;
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4}, 1249204224, -1249204223, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -685419820, 685419825, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 1937295720, -1937295716, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final Long setDividerPadding() {
        return (Long) setOnFocusChangeListener(new Object[]{this}, -1378069820, 1378069827, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @Nullable
    public final Long setX() {
        return (Long) setOnFocusChangeListener(new Object[]{this}, -530442036, 530442036, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @Nullable
    public final Long setY() {
        return (Long) setOnFocusChangeListener(new Object[]{this}, -2040215454, 2040215456, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 367901243, -367901240, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final setMaxWidth setOnFocusChangeListener() {
        return (setMaxWidth) setOnFocusChangeListener(new Object[]{this}, -1587359231, 1587359237, System.identityHashCode(this));
    }
}
