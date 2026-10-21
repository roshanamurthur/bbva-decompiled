package com.mypinpad.tsdk.isolation;

import android.graphics.Rect;
import android.os.SystemClock;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/setImageMatrix;", "Lcom/mypinpad/tsdk/i/setCollapseIcon;", "", "p0", "p1", "", "setY", "(FF)Z", "", HearingDisabilitiesConstants.CLOSE_MODAL, "()V", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "B_", "()Landroid/graphics/Rect;", "Lcom/mypinpad/tsdk/i/setCollapseIcon$setY;", "q0", "Lcom/mypinpad/tsdk/i/setCollapseIcon$setY;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/setCollapseIcon$setY;", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class setImageMatrix implements setCollapseIcon {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f59825u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Rect setY;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final setCollapseIcon.setY setDividerPadding;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f59828r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f59829s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f59830t0;

    static {
        int i10 = v0 + 23;
        f59825u0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public setImageMatrix(Rect rect, setCollapseIcon.setY sety, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        i10 = (i11 & 4) != 0 ? 0 : i10;
        z10 = (i11 & 8) != 0 ? true : z10;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(sety, "");
        this.setY = rect;
        this.setDividerPadding = sety;
        this.f59828r0 = i10;
        this.f59829s0 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:28:0x0105  */
    /* JADX WARN: Code duplicated, block: B:30:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x01df  */
    /* JADX WARN: Code duplicated, block: B:37:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:41:0x0208  */
    /* JADX WARN: Code duplicated, block: B:43:0x022a  */
    /* JADX WARN: Code duplicated, block: B:44:0x022e  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Rect rect;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = ~i10;
        int i28 = ~i11;
        int i29 = ~(i27 | i28);
        int i30 = (i29 * 446) + (((~(i10 | i28 | i12)) | (~(i11 | i27))) * 446) + (((~((~i12) | i28)) | i29) * 446) + (i11 * (-445)) + (i10 * (-445));
        if (i30 == 1) {
            setImageMatrix setimagematrix = (setImageMatrix) objArr[0];
            int i31 = f59825u0;
            int i32 = i31 & 91;
            int i33 = (i31 ^ 91) | i32;
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            v0 = i34 % 128;
            if (i34 % 2 != 0) {
                return setimagematrix.setDividerPadding;
            }
            setCollapseIcon.setY sety = setimagematrix.setDividerPadding;
            throw null;
        }
        if (i30 == 2) {
            setImageMatrix setimagematrix2 = (setImageMatrix) objArr[0];
            int i35 = f59825u0;
            int i36 = (i35 & 83) + (i35 | 83);
            v0 = i36 % 128;
            int i37 = i36 % 2;
            if (SystemClock.elapsedRealtime() - setimagematrix2.f59830t0 < 30) {
                int i38 = f59825u0;
                int i39 = i38 & 35;
                int i40 = (~i39) & (i38 | 35);
                int i41 = i39 << 1;
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                v0 = i42 % 128;
                int i43 = i42 % 2;
                int i44 = ((i38 ^ 27) | (i38 & 27)) << 1;
                int i45 = -(((~i38) & 27) | (i38 & (-28)));
                int i46 = (i44 & i45) + (i45 | i44);
                v0 = i46 % 128;
                if (i46 % 2 == 0) {
                    throw null;
                }
                objValueOf = Boolean.FALSE;
            } else {
                setimagematrix2.f59830t0 = SystemClock.elapsedRealtime();
                int i47 = f59825u0;
                int i48 = i47 & 99;
                int i49 = (i47 ^ 99) | i48;
                int i50 = (i48 & i49) + (i49 | i48);
                v0 = i50 % 128;
                int i51 = i50 % 2;
                objValueOf = Boolean.TRUE;
            }
        } else {
            if (i30 == 3) {
                ((setImageMatrix) objArr[0]).setY.set(new Rect());
                int i52 = v0 + 33;
                f59825u0 = i52 % 128;
                int i53 = i52 % 2;
                return null;
            }
            if (i30 == 4) {
                setImageMatrix setimagematrix3 = (setImageMatrix) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                float fFloatValue2 = ((Number) objArr[2]).floatValue();
                int i54 = v0;
                int i55 = (i54 ^ 67) + ((i54 & 67) << 1);
                f59825u0 = i55 % 128;
                if (i55 % 2 != 0) {
                    int i56 = 54 / 0;
                    if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setimagematrix3}, 165920961, -165920961, System.identityHashCode(setimagematrix3))).booleanValue()) {
                        int i57 = f59825u0;
                        int i58 = (((i57 ^ 21) | (i57 & 21)) << 1) - (((~i57) & 21) | (i57 & (-22)));
                        v0 = i58 % 128;
                        int i59 = i58 % 2;
                        if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setimagematrix3}, 10735384, -10735382, System.identityHashCode(setimagematrix3))).booleanValue()) {
                            int i60 = f59825u0;
                            int i61 = i60 ^ 21;
                            int i62 = ((i60 & 21) | i61) << 1;
                            int i63 = -i61;
                            int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                            v0 = i64 % 128;
                            int i65 = i64 % 2;
                            int i66 = setimagematrix3.setY.top;
                            int iIdentityHashCode = System.identityHashCode(setimagematrix3);
                            i13 = setimagematrix3.f59828r0;
                            int i67 = i13 * 165;
                            int i68 = -(-(i66 * (-163)));
                            int i69 = ((i67 ^ i68) | (i67 & i68)) << 1;
                            int i70 = -(((~i67) & i68) | ((~i68) & i67));
                            int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                            int i72 = ~iIdentityHashCode;
                            int i73 = ~((i72 ^ i66) | (i72 & i66));
                            int i74 = (~i73) & i13;
                            i14 = ~i13;
                            int i75 = i74 | (i73 & i14);
                            int i76 = i73 & i13;
                            int i77 = -(-(((i76 & i75) | (i75 ^ i76)) * (-328)));
                            int i78 = i71 & i77;
                            int i79 = (i78 - (~(-(-((i71 ^ i77) | i78))))) - 1;
                            int i80 = i13 ^ iIdentityHashCode;
                            int i81 = i13 & iIdentityHashCode;
                            int i82 = -(-(((i80 & i81) | (i80 ^ i81)) * 164));
                            int i83 = i79 & i82;
                            int i84 = (i82 | i79) & (~i83);
                            int i85 = -(-(i83 << 1));
                            i15 = (i84 ^ i85) + ((i84 & i85) << 1);
                            int i86 = ~i66;
                            int i87 = ~((i14 ^ i86) | (i14 & i86));
                            int i88 = ~((i86 & iIdentityHashCode) | (i86 & i72) | ((~i86) & iIdentityHashCode));
                            int i89 = (iIdentityHashCode | i72) & i72;
                            int i90 = i89 & i13;
                            int i91 = (i89 | i13) & (~i90);
                            int i92 = (i91 & i90) | (i91 ^ i90);
                            i16 = -(-(((~((i66 & i92) | (i92 ^ i66))) | (i88 & i87) | (i87 ^ i88)) * 164));
                            if (((((~i16) & i15) | ((~i15) & i16)) - (~(-(-((i16 & i15) << 1))))) - 1 < fFloatValue2) {
                                int i93 = f59825u0;
                                int i94 = i93 & 29;
                                int i95 = ((i93 ^ 29) | i94) << 1;
                                int i96 = -((i93 | 29) & (~i94));
                                int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                                i17 = i97 % 128;
                                v0 = i17;
                                int i98 = i97 % 2;
                                rect = setimagematrix3.setY;
                                i18 = rect.bottom;
                                i19 = -i13;
                                i20 = -(~i19);
                                if (((i18 ^ i20) + ((i18 & i20) << 1)) - 1 > fFloatValue2) {
                                    int i99 = i17 & 17;
                                    i21 = i99 + ((i17 ^ 17) | i99);
                                    i22 = i21 % 128;
                                    f59825u0 = i22;
                                    if (i21 % 2 != 0) {
                                        int i100 = rect.left;
                                        i23 = (i100 & i14) | ((~i100) & i13);
                                        i24 = -(-((i100 & i13) << 1));
                                        if (((i23 | i24) << 1) - (i24 ^ i23) < fFloatValue) {
                                            i25 = rect.right;
                                            if ((i25 & i19) + (i25 | i19) > fFloatValue) {
                                                int i101 = ((i22 | 79) << 1) - (((~i22) & 79) | (i22 & (-80)));
                                                int i102 = i101 % 128;
                                                v0 = i102;
                                                int i103 = i101 % 2;
                                                int i104 = (i102 & (-80)) | ((~i102) & 79);
                                                int i105 = (i102 & 79) << 1;
                                                i26 = (i104 & i105) + (i104 | i105);
                                                f59825u0 = i26 % 128;
                                                if (i26 % 2 == 0) {
                                                    throw null;
                                                }
                                                objValueOf = Boolean.TRUE;
                                            }
                                        }
                                    } else if (rect.left * i13 < fFloatValue) {
                                        i25 = rect.right;
                                        if ((i25 & i19) + (i25 | i19) > fFloatValue) {
                                            int i106 = ((i22 | 79) << 1) - (((~i22) & 79) | (i22 & (-80)));
                                            int i107 = i106 % 128;
                                            v0 = i107;
                                            int i108 = i106 % 2;
                                            int i109 = (i107 & (-80)) | ((~i107) & 79);
                                            int i1010 = (i107 & 79) << 1;
                                            i26 = (i109 & i1010) + (i109 | i1010);
                                            f59825u0 = i26 % 128;
                                            if (i26 % 2 == 0) {
                                                throw null;
                                            }
                                            objValueOf = Boolean.TRUE;
                                        }
                                    }
                                }
                            }
                            int i110 = (-2) - ((f59825u0 + 110) ^ (-1));
                            v0 = i110 % 128;
                            int i111 = i110 % 2;
                        }
                        objValueOf = Boolean.FALSE;
                    }
                } else if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setimagematrix3}, 165920961, -165920961, System.identityHashCode(setimagematrix3))).booleanValue()) {
                    int i510 = f59825u0;
                    int i511 = (((i510 ^ 21) | (i510 & 21)) << 1) - (((~i510) & 21) | (i510 & (-22)));
                    v0 = i511 % 128;
                    int i512 = i511 % 2;
                    if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setimagematrix3}, 10735384, -10735382, System.identityHashCode(setimagematrix3))).booleanValue()) {
                        int i610 = f59825u0;
                        int i611 = i610 ^ 21;
                        int i612 = ((i610 & 21) | i611) << 1;
                        int i613 = -i611;
                        int i614 = ((i612 | i613) << 1) - (i612 ^ i613);
                        v0 = i614 % 128;
                        int i615 = i614 % 2;
                        int i616 = setimagematrix3.setY.top;
                        int iIdentityHashCode2 = System.identityHashCode(setimagematrix3);
                        i13 = setimagematrix3.f59828r0;
                        int i617 = i13 * 165;
                        int i618 = -(-(i616 * (-163)));
                        int i619 = ((i617 ^ i618) | (i617 & i618)) << 1;
                        int i710 = -(((~i617) & i618) | ((~i618) & i617));
                        int i711 = (i619 ^ i710) + ((i710 & i619) << 1);
                        int i712 = ~iIdentityHashCode2;
                        int i713 = ~((i712 ^ i616) | (i712 & i616));
                        int i714 = (~i713) & i13;
                        i14 = ~i13;
                        int i715 = i714 | (i713 & i14);
                        int i716 = i713 & i13;
                        int i717 = -(-(((i716 & i715) | (i715 ^ i716)) * (-328)));
                        int i718 = i711 & i717;
                        int i719 = (i718 - (~(-(-((i711 ^ i717) | i718))))) - 1;
                        int i810 = i13 ^ iIdentityHashCode2;
                        int i811 = i13 & iIdentityHashCode2;
                        int i812 = -(-(((i810 & i811) | (i810 ^ i811)) * 164));
                        int i813 = i719 & i812;
                        int i814 = (i812 | i719) & (~i813);
                        int i815 = -(-(i813 << 1));
                        i15 = (i814 ^ i815) + ((i814 & i815) << 1);
                        int i816 = ~i616;
                        int i817 = ~((i14 ^ i816) | (i14 & i816));
                        int i818 = ~((i816 & iIdentityHashCode2) | (i816 & i712) | ((~i816) & iIdentityHashCode2));
                        int i819 = (iIdentityHashCode2 | i712) & i712;
                        int i910 = i819 & i13;
                        int i911 = (i819 | i13) & (~i910);
                        int i912 = (i911 & i910) | (i911 ^ i910);
                        i16 = -(-(((~((i616 & i912) | (i912 ^ i616))) | (i818 & i817) | (i817 ^ i818)) * 164));
                        if (((((~i16) & i15) | ((~i15) & i16)) - (~(-(-((i16 & i15) << 1))))) - 1 < fFloatValue2) {
                            int i913 = f59825u0;
                            int i914 = i913 & 29;
                            int i915 = ((i913 ^ 29) | i914) << 1;
                            int i916 = -((i913 | 29) & (~i914));
                            int i917 = ((i915 | i916) << 1) - (i916 ^ i915);
                            i17 = i917 % 128;
                            v0 = i17;
                            int i918 = i917 % 2;
                            rect = setimagematrix3.setY;
                            i18 = rect.bottom;
                            i19 = -i13;
                            i20 = -(~i19);
                            if (((i18 ^ i20) + ((i18 & i20) << 1)) - 1 > fFloatValue2) {
                                int i919 = i17 & 17;
                                i21 = i919 + ((i17 ^ 17) | i919);
                                i22 = i21 % 128;
                                f59825u0 = i22;
                                if (i21 % 2 != 0) {
                                    int i1011 = rect.left;
                                    i23 = (i1011 & i14) | ((~i1011) & i13);
                                    i24 = -(-((i1011 & i13) << 1));
                                    if (((i23 | i24) << 1) - (i24 ^ i23) < fFloatValue) {
                                        i25 = rect.right;
                                        if ((i25 & i19) + (i25 | i19) > fFloatValue) {
                                            int i1012 = ((i22 | 79) << 1) - (((~i22) & 79) | (i22 & (-80)));
                                            int i1013 = i1012 % 128;
                                            v0 = i1013;
                                            int i1014 = i1012 % 2;
                                            int i1015 = (i1013 & (-80)) | ((~i1013) & 79);
                                            int i1016 = (i1013 & 79) << 1;
                                            i26 = (i1015 & i1016) + (i1015 | i1016);
                                            f59825u0 = i26 % 128;
                                            if (i26 % 2 == 0) {
                                                throw null;
                                            }
                                            objValueOf = Boolean.TRUE;
                                        }
                                    }
                                } else if (rect.left * i13 < fFloatValue) {
                                    i25 = rect.right;
                                    if ((i25 & i19) + (i25 | i19) > fFloatValue) {
                                        int i1017 = ((i22 | 79) << 1) - (((~i22) & 79) | (i22 & (-80)));
                                        int i1018 = i1017 % 128;
                                        v0 = i1018;
                                        int i1019 = i1017 % 2;
                                        int i10110 = (i1018 & (-80)) | ((~i1018) & 79);
                                        int i10111 = (i1018 & 79) << 1;
                                        i26 = (i10110 & i10111) + (i10110 | i10111);
                                        f59825u0 = i26 % 128;
                                        if (i26 % 2 == 0) {
                                            throw null;
                                        }
                                        objValueOf = Boolean.TRUE;
                                    }
                                }
                            }
                        }
                        int i112 = (-2) - ((f59825u0 + 110) ^ (-1));
                        v0 = i112 % 128;
                        int i113 = i112 % 2;
                    }
                    objValueOf = Boolean.FALSE;
                }
                int i114 = f59825u0 + 57;
                v0 = i114 % 128;
                if (i114 % 2 == 0) {
                    throw null;
                }
                objValueOf = Boolean.FALSE;
            } else if (i30 != 5) {
                setImageMatrix setimagematrix4 = (setImageMatrix) objArr[0];
                int i115 = v0;
                int i116 = i115 & 79;
                int i117 = (~i116) & (i115 | 79);
                int i118 = i116 << 1;
                int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                f59825u0 = i119 % 128;
                int i120 = i119 % 2;
                boolean z10 = setimagematrix4.f59829s0;
                int i121 = i115 & 101;
                int i122 = -(-((i115 ^ 101) | i121));
                int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                f59825u0 = i123 % 128;
                if (i123 % 2 != 0) {
                    int i124 = 28 / 0;
                }
                objValueOf = Boolean.valueOf(z10);
            } else {
                setImageMatrix setimagematrix5 = (setImageMatrix) objArr[0];
                int i125 = f59825u0;
                int i126 = (i125 ^ 97) + ((i125 & 97) << 1);
                v0 = i126 % 128;
                int i127 = i126 % 2;
                objValueOf = setimagematrix5.setY;
                if (i127 == 0) {
                    int i128 = 48 / 0;
                }
            }
        }
        return objValueOf;
    }

    @JvmName(name = "B_")
    @NotNull
    public final Rect B_() {
        return (Rect) setCompoundDrawableTintBlendMode(new Object[]{this}, 178076079, -178076074, System.identityHashCode(this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1936351348, 1936351351, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setCollapseIcon
    @JvmName(name = "setDividerPadding")
    @NotNull
    public final setCollapseIcon.setY setDividerPadding() {
        return (setCollapseIcon.setY) setCompoundDrawableTintBlendMode(new Object[]{this}, -195129687, 195129688, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setCollapseIcon
    public final boolean setY(float p4, float p10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Float.valueOf(p4), Float.valueOf(p10)}, 552759156, -552759152, System.identityHashCode(this))).booleanValue();
    }
}
