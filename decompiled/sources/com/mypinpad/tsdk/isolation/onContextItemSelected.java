package com.mypinpad.tsdk.isolation;

import kotlin.random.Random;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class onContextItemSelected extends getException {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f57518x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f57519y0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public byte[] f57520t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public getDynamicButtonBackgroundColor f57521u0;

    @Nullable
    public setShowDividers v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public setTextIsSelectable f57522w0;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        switch (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19) {
            case 1:
                onContextItemSelected oncontextitemselected = (onContextItemSelected) objArr[0];
                setTextIsSelectable settextisselectable = (setTextIsSelectable) objArr[1];
                int i22 = f57519y0;
                int i23 = i22 + 27;
                f57518x0 = i23 % 128;
                int i24 = i23 % 2;
                oncontextitemselected.f57522w0 = settextisselectable;
                if (i24 != 0) {
                    throw null;
                }
                int i25 = i22 & 69;
                int i26 = ((i22 ^ 69) | i25) << 1;
                int i27 = -((69 | i22) & (~i25));
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                f57518x0 = i28 % 128;
                if (i28 % 2 == 0) {
                    return null;
                }
                int i29 = 28 / 0;
                return null;
            case 2:
                onContextItemSelected oncontextitemselected2 = (onContextItemSelected) objArr[0];
                int i30 = f57518x0;
                int i31 = i30 & 61;
                int i32 = (~i31) & (i30 | 61);
                int i33 = -(-(i31 << 1));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                f57519y0 = i34 % 128;
                if (i34 % 2 == 0) {
                    setTextIsSelectable settextisselectable2 = oncontextitemselected2.f57522w0;
                    throw null;
                }
                setTextIsSelectable settextisselectable3 = oncontextitemselected2.f57522w0;
                int i35 = i30 ^ 73;
                int i36 = ((i30 & 73) | i35) << 1;
                int i37 = -i35;
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f57519y0 = i38 % 128;
                int i39 = i38 % 2;
                return settextisselectable3;
            case 3:
                onContextItemSelected oncontextitemselected3 = (onContextItemSelected) objArr[0];
                setShowDividers setshowdividers = (setShowDividers) objArr[1];
                int i40 = f57519y0;
                int i41 = ((i40 & 117) - (~(-(-(i40 | 117))))) - 1;
                f57518x0 = i41 % 128;
                int i42 = i41 % 2;
                oncontextitemselected3.v0 = setshowdividers;
                int i43 = (i40 ^ 41) + ((i40 & 41) << 1);
                f57518x0 = i43 % 128;
                int i44 = i43 % 2;
                return null;
            case 4:
                onContextItemSelected oncontextitemselected4 = (onContextItemSelected) objArr[0];
                int i45 = f57519y0;
                int i46 = ((i45 ^ 69) | (i45 & 69)) << 1;
                int i47 = -((69 & (~i45)) | (i45 & (-70)));
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                f57518x0 = i48 % 128;
                if (i48 % 2 != 0) {
                    super.close();
                    throw null;
                }
                super.close();
                byte[] bArr = oncontextitemselected4.f57520t0;
                if (bArr != null) {
                    int i49 = f57519y0;
                    int i50 = ((i49 ^ 33) | (i49 & 33)) << 1;
                    int i51 = -(((~i49) & 33) | (i49 & (-34)));
                    int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                    f57518x0 = i52 % 128;
                    int i53 = i52 % 2;
                    Random.INSTANCE.nextBytes(bArr);
                    int i54 = f57519y0;
                    int i55 = i54 & 103;
                    int i56 = ((((i54 ^ 103) | i55) << 1) - (~(-((i54 | 103) & (~i55))))) - 1;
                    f57518x0 = i56 % 128;
                    int i57 = i56 % 2;
                }
                oncontextitemselected4.f57520t0 = null;
                getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor = oncontextitemselected4.f57521u0;
                if (getdynamicbuttonbackgroundcolor != null) {
                    int i58 = f57519y0;
                    int i59 = i58 & 43;
                    int i60 = (i58 ^ 43) | i59;
                    int i61 = (i59 & i60) + (i60 | i59);
                    f57518x0 = i61 % 128;
                    int i62 = i61 % 2;
                    getdynamicbuttonbackgroundcolor.close();
                    int i63 = f57519y0;
                    int i64 = ((i63 ^ 53) | (i63 & 53)) << 1;
                    int i65 = -(((~i63) & 53) | (i63 & (-54)));
                    int i66 = (i64 & i65) + (i65 | i64);
                    f57518x0 = i66 % 128;
                    int i67 = i66 % 2;
                }
                oncontextitemselected4.f57521u0 = null;
                setTextIsSelectable settextisselectable4 = oncontextitemselected4.f57522w0;
                if (settextisselectable4 != null) {
                    int i68 = f57518x0;
                    int i69 = (i68 ^ 59) + ((i68 & 59) << 1);
                    f57519y0 = i69 % 128;
                    if (i69 % 2 == 0) {
                        settextisselectable4.close();
                        int i70 = 81 / 0;
                    } else {
                        settextisselectable4.close();
                    }
                }
                oncontextitemselected4.f57522w0 = null;
                int i71 = f57519y0;
                int i72 = (i71 & (-62)) | ((~i71) & 61);
                int i73 = (i71 & 61) << 1;
                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                f57518x0 = i74 % 128;
                if (i74 % 2 == 0) {
                    return null;
                }
                throw null;
            case 5:
                onContextItemSelected oncontextitemselected5 = (onContextItemSelected) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i75 = f57519y0;
                int i76 = ((i75 & 105) - (~(i75 | 105))) - 1;
                f57518x0 = i76 % 128;
                int i77 = i76 % 2;
                oncontextitemselected5.f57520t0 = bArr2;
                if (i77 == 0) {
                    return null;
                }
                throw null;
            case 6:
                onContextItemSelected oncontextitemselected6 = (onContextItemSelected) objArr[0];
                int i78 = f57518x0;
                int i79 = i78 + 105;
                f57519y0 = i79 % 128;
                int i80 = i79 % 2;
                byte[] bArr3 = oncontextitemselected6.f57520t0;
                int i81 = i78 + 103;
                f57519y0 = i81 % 128;
                if (i81 % 2 != 0) {
                    return bArr3;
                }
                throw null;
            case 7:
                onContextItemSelected oncontextitemselected7 = (onContextItemSelected) objArr[0];
                int i82 = f57519y0;
                int i83 = (i82 & 73) + (i82 | 73);
                int i84 = i83 % 128;
                f57518x0 = i84;
                if (i83 % 2 != 0) {
                    setShowDividers setshowdividers2 = oncontextitemselected7.v0;
                    throw null;
                }
                setShowDividers setshowdividers3 = oncontextitemselected7.v0;
                int i85 = i84 & 53;
                int i86 = i85 + ((i84 ^ 53) | i85);
                f57519y0 = i86 % 128;
                if (i86 % 2 != 0) {
                    return setshowdividers3;
                }
                int i87 = 14 / 0;
                return setshowdividers3;
            case 8:
                onContextItemSelected oncontextitemselected8 = (onContextItemSelected) objArr[0];
                getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor2 = (getDynamicButtonBackgroundColor) objArr[1];
                int i88 = f57519y0 + 25;
                f57518x0 = i88 % 128;
                int i89 = i88 % 2;
                oncontextitemselected8.f57521u0 = getdynamicbuttonbackgroundcolor2;
                if (i89 == 0) {
                    return null;
                }
                int i90 = 36 / 0;
                return null;
            default:
                onContextItemSelected oncontextitemselected9 = (onContextItemSelected) objArr[0];
                int i91 = f57519y0;
                int i92 = ((i91 | 57) << 1) - (i91 ^ 57);
                f57518x0 = i92 % 128;
                if (i92 % 2 != 0) {
                    getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor3 = oncontextitemselected9.f57521u0;
                    throw null;
                }
                getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor4 = oncontextitemselected9.f57521u0;
                int iIdentityHashCode = System.identityHashCode(oncontextitemselected9);
                int i93 = ((-1964350944) ^ iIdentityHashCode) | ((-1964350944) & iIdentityHashCode);
                int i94 = ~i93;
                int i95 = (i93 | i94) & i94;
                int i96 = 336596443 & i95;
                int i97 = (i95 | 336596443) & (~i96);
                int i98 = (i97 & i96) | (i97 ^ i96);
                int i99 = ~iIdentityHashCode;
                int i100 = (1631956996 & i99) | (iIdentityHashCode & (-1631956997));
                int i101 = 1631956996 & iIdentityHashCode;
                int i102 = ~((i101 & i100) | (i100 ^ i101));
                int i103 = (((i98 & i102) | ((~i102) & i98) | ((~i98) & i102)) * (-880)) + 781290298;
                int i104 = ((~i99) & (-1964350944)) | (i99 & 1964350943);
                int i105 = (-1964350944) & i99;
                int i106 = ~((i105 & i104) | (i104 ^ i105));
                int i107 = (-1631956997) & i106;
                int i108 = (i106 | (-1631956997)) & (~i107);
                int i109 = (i108 & i107) | (i108 ^ i107);
                int i110 = 1964350943 ^ iIdentityHashCode;
                int i111 = 1964350943 & iIdentityHashCode;
                int i112 = ~((i110 & i111) | (i110 ^ i111));
                int i113 = i109 & i112;
                int i114 = (i109 | i112) & (~i113);
                int i115 = (((i114 & i113) | (i114 ^ i113)) * (-880)) + i103;
                int i116 = (~(iIdentityHashCode | 1964350943)) * 880;
                int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
                int iIdentityHashCode2 = System.identityHashCode(oncontextitemselected9);
                int i118 = ~iIdentityHashCode2;
                int i119 = ~i118;
                int i120 = (((-772849424) & i118) | ((-772849424) & i119) | (772849423 & i118)) * (-757);
                int i121 = ((((443432784 ^ i120) | (443432784 & i120)) << 1) - (~(-((i120 & (-443432785)) | (443432784 & (~i120)))))) - 1;
                int i122 = (-101718021) ^ iIdentityHashCode2;
                int i123 = (-101718021) & iIdentityHashCode2;
                int i124 = -(-((~((i123 & i122) | (i122 ^ i123))) * 1514));
                int i125 = i121 & i124;
                int i126 = (i124 | i121) & (~i125);
                int i127 = i125 << 1;
                int i128 = (i126 & i127) + (i126 | i127);
                int i129 = (i119 & (-116463717)) | (116463716 & i118);
                int i130 = i118 & (-116463717);
                int i131 = (~((i130 & i129) | (i129 ^ i130))) | 14745696;
                int i132 = ~((iIdentityHashCode2 & (-671131404)) | ((-671131404) ^ iIdentityHashCode2));
                int i133 = ((~i132) & i131) | ((~i131) & i132);
                int i134 = i132 & i131;
                int i135 = ((i134 & i133) | (i133 ^ i134)) * 757;
                int i136 = i128 & i135;
                if (i117 > ((((i128 ^ i135) | i136) << 1) - (~(-((i135 | i128) & (~i136))))) - 1) {
                    return getdynamicbuttonbackgroundcolor4;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.getException, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 1289434444, -1289434440, System.identityHashCode(this));
    }

    @Nullable
    public final setTextIsSelectable setDividerPadding() {
        return (setTextIsSelectable) setCompoundDrawableTintBlendMode(new Object[]{this}, -1094228599, 1094228601, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@Nullable byte[] bArr) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -1669177641, 1669177646, System.identityHashCode(this));
    }

    @Nullable
    public final getDynamicButtonBackgroundColor setX() {
        return (getDynamicButtonBackgroundColor) setCompoundDrawableTintBlendMode(new Object[]{this}, 1646547801, -1646547801, System.identityHashCode(this));
    }

    @Nullable
    public final setShowDividers setY() {
        return (setShowDividers) setCompoundDrawableTintBlendMode(new Object[]{this}, 688398571, -688398564, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable setTextIsSelectable settextisselectable) {
        setCompoundDrawableTintBlendMode(new Object[]{this, settextisselectable}, 1266596466, -1266596465, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable setShowDividers setshowdividers) {
        setCompoundDrawableTintBlendMode(new Object[]{this, setshowdividers}, 898138497, -898138494, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable getDynamicButtonBackgroundColor getdynamicbuttonbackgroundcolor) {
        setCompoundDrawableTintBlendMode(new Object[]{this, getdynamicbuttonbackgroundcolor}, 1571906280, -1571906272, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 596532494, -596532488, System.identityHashCode(this));
    }
}
