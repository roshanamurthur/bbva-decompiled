package com.mypinpad.tsdk.isolation;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setSubtitle implements setDivider {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60591g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60592h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setTextSelectHandleLeft f60593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getApplicationFilteringSelectors f60594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f60595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final getDiscoveryTimeout f60596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final getGatewayId f60597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final setLayoutMode f60598f;

    public setSubtitle(@NotNull setTextSelectHandleLeft settextselecthandleleft, @NotNull getApplicationFilteringSelectors getapplicationfilteringselectors, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(settextselecthandleleft, "");
        Intrinsics.checkNotNullParameter(getapplicationfilteringselectors, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f60593a = settextselecthandleleft;
        this.f60594b = getapplicationfilteringselectors;
        getDiscoveryTimeout.Companion companion = getDiscoveryTimeout.INSTANCE;
        getDiscoveryTimeout getdiscoverytimeout = (getDiscoveryTimeout) getDiscoveryTimeout.Companion.setCompoundDrawableTintBlendMode(new Object[]{settextselecthandleleft}, 423056054, -423056054, (int) System.currentTimeMillis());
        this.f60596d = getdiscoverytimeout;
        this.f60597e = new getGatewayId(getdiscoverytimeout, setcolorfilter);
        this.f60598f = new setLayoutMode();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        byte[] compoundDrawableTintBlendMode;
        byte[] bArr;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
        int i17 = ~(i13 | i12);
        int i18 = ~((~i11) | i10);
        switch (((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16) {
            case 1:
                setSubtitle setsubtitle = (setSubtitle) objArr[0];
                int i19 = f60591g;
                int i20 = (i19 | 9) << 1;
                int i21 = -((i19 & (-10)) | ((~i19) & 9));
                int i22 = (i20 & i21) + (i20 | i21);
                f60592h = i22 % 128;
                int i23 = i22 % 2;
                boolean z10 = setsubtitle.f60595c;
                if (i23 == 0) {
                    throw null;
                }
                int i24 = i19 + 117;
                f60592h = i24 % 128;
                int i25 = i24 % 2;
                return Boolean.valueOf(z10);
            case 2:
                setSubtitle setsubtitle2 = (setSubtitle) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i26 = f60592h + 115;
                f60591g = i26 % 128;
                int i27 = i26 % 2;
                Intrinsics.checkNotNullParameter(bArr2, "");
                setsubtitle2.f60594b.setY(bArr2);
                setsubtitle2.f60595c = true;
                int i28 = f60591g;
                int i29 = ((i28 ^ 55) | (i28 & 55)) << 1;
                int i30 = -(((~i28) & 55) | (i28 & (-56)));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f60592h = i31 % 128;
                int i32 = i31 % 2;
                return null;
            case 3:
                setSubtitle setsubtitle3 = (setSubtitle) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i33 = f60591g;
                int i34 = (((i33 ^ 121) | (i33 & 121)) << 1) - (((~i33) & 121) | (i33 & (-122)));
                f60592h = i34 % 128;
                if (i34 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bArr3, "");
                    compoundDrawableTintBlendMode = setsubtitle3.f60597e.setCompoundDrawableTintBlendMode(bArr3);
                    int i35 = 69 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(bArr3, "");
                    compoundDrawableTintBlendMode = setsubtitle3.f60597e.setCompoundDrawableTintBlendMode(bArr3);
                }
                byte[] bArr4 = compoundDrawableTintBlendMode;
                int i36 = f60592h;
                int i37 = ((i36 & 62) + (i36 | 62)) - 1;
                f60591g = i37 % 128;
                int i38 = i37 % 2;
                return bArr4;
            case 4:
                setSubtitle setsubtitle4 = (setSubtitle) objArr[0];
                byte[] bArr5 = (byte[]) objArr[1];
                byte[] bArr6 = (byte[]) objArr[2];
                int i39 = (-2) - ((f60591g + 50) ^ (-1));
                f60592h = i39 % 128;
                int i40 = i39 % 2;
                Intrinsics.checkNotNullParameter(bArr5, "");
                Intrinsics.checkNotNullParameter(bArr6, "");
                setCompoundDrawablesRelative setcompounddrawablesrelative = (setCompoundDrawablesRelative) setDividerPadding(new Object[]{setsubtitle4, bArr6}, -526668266, 526668271, System.identityHashCode(setsubtitle4));
                try {
                    setLayoutMode setlayoutmode = setsubtitle4.f60598f;
                    bArr = (byte[]) setLayoutMode.setDividerPadding(new Object[]{bArr5, (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setcompounddrawablesrelative}, -1034568962, 1034568962, System.identityHashCode(setcompounddrawablesrelative))}, 1661851573, -1661851571, (int) System.currentTimeMillis());
                    CloseableKt.closeFinally(setcompounddrawablesrelative, null);
                    int i41 = f60592h + 19;
                    f60591g = i41 % 128;
                    if (i41 % 2 != 0) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(setcompounddrawablesrelative, th2);
                        throw th3;
                    }
                }
                break;
            case 5:
                setSubtitle setsubtitle5 = (setSubtitle) objArr[0];
                byte[] bArr7 = (byte[]) objArr[1];
                Intrinsics.checkNotNullParameter(bArr7, "");
                setCompoundDrawablesRelative setcompounddrawablesrelative2 = new setCompoundDrawablesRelative(setsubtitle5.f60594b.setX(bArr7));
                int i42 = f60591g;
                int i43 = i42 ^ 41;
                int i44 = ((((i42 & 41) | i43) << 1) - (~(-i43))) - 1;
                f60592h = i44 % 128;
                int i45 = i44 % 2;
                return setcompounddrawablesrelative2;
            case 6:
                byte[] bArr8 = (byte[]) objArr[1];
                byte[] bArr9 = (byte[]) objArr[2];
                byte[] bArr10 = (byte[]) objArr[3];
                Intrinsics.checkNotNullParameter(bArr8, "");
                Intrinsics.checkNotNullParameter(bArr9, "");
                Intrinsics.checkNotNullParameter(bArr10, "");
                amw amwVar = (amw) anz.setX(new Object[]{bArr9}, -2118765618, 2118765621, (int) System.currentTimeMillis());
                aoa aoaVar = new aoa(new alp());
                aoa.setY(new Object[]{aoaVar, amwVar}, 1468000524, -1468000523, System.identityHashCode(aoaVar));
                int length = bArr8.length;
                aoa.setY(new Object[]{aoaVar, bArr8, Integer.valueOf(length)}, 275575237, -275575237, length);
                if (!((Boolean) aoa.setY(new Object[]{aoaVar, bArr10}, -609292746, 609292749, System.identityHashCode(aoaVar))).booleanValue()) {
                    throw new setAutoLinkMask();
                }
                int i46 = f60591g;
                int i47 = ((i46 & 87) - (~(i46 | 87))) - 1;
                f60592h = i47 % 128;
                if (i47 % 2 != 0) {
                    return null;
                }
                throw null;
            case 7:
                setSubtitle setsubtitle6 = (setSubtitle) objArr[0];
                byte[] bArr11 = (byte[]) objArr[1];
                byte[] bArr12 = (byte[]) objArr[2];
                int i48 = f60591g + 97;
                f60592h = i48 % 128;
                int i49 = i48 % 2;
                Intrinsics.checkNotNullParameter(bArr11, "");
                Intrinsics.checkNotNullParameter(bArr12, "");
                setCompoundDrawablesRelative setcompounddrawablesrelative3 = (setCompoundDrawablesRelative) setDividerPadding(new Object[]{setsubtitle6, bArr12}, -526668266, 526668271, System.identityHashCode(setsubtitle6));
                try {
                    setLayoutMode setlayoutmode2 = setsubtitle6.f60598f;
                    bArr = (byte[]) setLayoutMode.setDividerPadding(new Object[]{bArr11, (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setcompounddrawablesrelative3}, -1034568962, 1034568962, System.identityHashCode(setcompounddrawablesrelative3))}, 803784313, -803784313, (int) System.currentTimeMillis());
                    CloseableKt.closeFinally(setcompounddrawablesrelative3, null);
                    int i50 = f60591g;
                    int i51 = i50 & 97;
                    int i52 = ((i50 ^ 97) | i51) << 1;
                    int i53 = -((i50 | 97) & (~i51));
                    int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                    f60592h = i54 % 128;
                    if (i54 % 2 == 0) {
                        throw null;
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(setcompounddrawablesrelative3, th4);
                        throw th5;
                    }
                }
                break;
            case 8:
                setSubtitle setsubtitle7 = (setSubtitle) objArr[0];
                int i55 = f60592h;
                int i56 = i55 & 99;
                int i57 = ((i55 ^ 99) | i56) << 1;
                int i58 = -((i55 | 99) & (~i56));
                int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                f60591g = i59 % 128;
                int i60 = i59 % 2;
                setsubtitle7.f60595c = false;
                setsubtitle7.f60594b.setDividerPadding();
                setsubtitle7.f60597e.setY();
                int i61 = f60592h;
                int i62 = ((i61 & 66) + (i61 | 66)) - 1;
                f60591g = i62 % 128;
                if (i62 % 2 == 0) {
                    return null;
                }
                throw null;
            case 9:
                setSubtitle setsubtitle8 = (setSubtitle) objArr[0];
                byte[] bArr13 = (byte[]) objArr[1];
                int i63 = f60591g + 9;
                f60592h = i63 % 128;
                int i64 = i63 % 2;
                Intrinsics.checkNotNullParameter(bArr13, "");
                int i65 = -bArr13.length;
                int iIdentityHashCode = System.identityHashCode(setsubtitle8);
                int i66 = i65 * (-575);
                int i67 = (36799 & i66) | ((~i66) & (-36800));
                int i68 = -(-((i66 & (-36800)) << 1));
                int i69 = (i67 & i68) + (i68 | i67);
                int i70 = ~i65;
                int i71 = (i70 | i65) & i70;
                int i72 = ~((i71 & (-65)) | (i71 ^ (-65)));
                int i73 = (-65) & iIdentityHashCode;
                int i74 = (~i73) & ((-65) | iIdentityHashCode);
                int i75 = ~iIdentityHashCode;
                int i76 = ~((i73 & i74) | (i74 ^ i73));
                int i77 = ((i72 & i76) | (i72 ^ i76)) * 576;
                int i78 = i69 & i77;
                int i79 = i77 | i69;
                int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                int i81 = i70 & 64;
                int i82 = (~i81) & (i70 | 64);
                int i83 = ~((i82 & i81) | (i82 ^ i81));
                int i84 = (iIdentityHashCode | i75) & i75;
                int i85 = (i84 & (-65)) | ((-65) ^ i84);
                int i86 = ~((i65 & i85) | (i85 ^ i65));
                int i87 = (i80 - (~(-(-(((i86 & i83) | (i83 ^ i86)) * 576))))) - 1;
                int i88 = ((~i70) & (-65)) | i81;
                int i89 = i70 & (-65);
                int i90 = (~((i88 & i89) | (i88 ^ i89))) * 576;
                int i91 = i87 & i90;
                int i92 = (i90 | i87) & (~i91);
                int i93 = i91 << 1;
                byte[] bArr14 = new byte[((i92 | i93) << 1) - (i92 ^ i93)];
                setsubtitle8.f60596d.nextBytes(bArr14);
                setsubtitle8.f60593a.setY(ArraysKt___ArraysJvmKt.plus(bArr13, bArr14));
                int i94 = f60591g;
                int i95 = (i94 & 109) + (i94 | 109);
                f60592h = i95 % 128;
                if (i95 % 2 != 0) {
                    return null;
                }
                throw null;
            default:
                setSubtitle setsubtitle9 = (setSubtitle) objArr[0];
                byte[] bArr15 = (byte[]) objArr[1];
                int i96 = f60592h;
                int i97 = i96 & 67;
                int i98 = (i96 ^ 67) | i97;
                int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                f60591g = i99 % 128;
                int i100 = i99 % 2;
                Intrinsics.checkNotNullParameter(bArr15, "");
                if (bArr15.length == 0) {
                    int i101 = f60591g;
                    int i102 = ((i101 & (-38)) | ((~i101) & 37)) + ((i101 & 37) << 1);
                    f60592h = i102 % 128;
                    int i103 = i102 % 2;
                    int i104 = i101 + 27;
                    int i105 = i104 % 128;
                    f60592h = i105;
                    int i106 = i104 % 2;
                    int i107 = i105 + 81;
                    f60591g = i107 % 128;
                    int i108 = i107 % 2;
                } else {
                    int i109 = f60591g;
                    int i110 = (-2) - (((i109 ^ 58) + ((i109 & 58) << 1)) ^ (-1));
                    f60592h = i110 % 128;
                    int i111 = i110 % 2;
                    int i112 = (((i109 | 66) << 1) - (i109 ^ 66)) - 1;
                    f60592h = i112 % 128;
                    int i113 = i112 % 2;
                    int i114 = (i109 ^ 121) + ((i109 & 121) << 1);
                    f60592h = i114 % 128;
                    int i115 = i114 % 2;
                    int i116 = i109 + 96;
                    int i117 = (i116 ^ (-1)) + (i116 << 1);
                    f60592h = i117 % 128;
                    if (i117 % 2 == 0) {
                        setsubtitle9.f60593a.setX(bArr15);
                        throw null;
                    }
                    setsubtitle9.f60593a.setX(bArr15);
                }
                byte[] x4 = setsubtitle9.f60597e.setX();
                int i118 = f60592h;
                int i119 = ((i118 | 37) << 1) - (i118 ^ 37);
                f60591g = i119 % 128;
                int i120 = i119 % 2;
                return x4;
        }
        return bArr;
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (byte[]) setDividerPadding(new Object[]{this, bArr, bArr2}, -884069764, 884069771, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    public final void setOnFocusChangeListener() throws Throwable {
        setDividerPadding(new Object[]{this}, -1784523452, 1784523460, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    public final boolean setX() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 815649411, -815649410, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    @NotNull
    public final byte[] setY(@NotNull byte[] bArr) {
        return (byte[]) setDividerPadding(new Object[]{this, bArr}, -627853275, 627853278, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    public final void setOnFocusChangeListener(@NotNull byte[] bArr) throws Throwable {
        setDividerPadding(new Object[]{this, bArr}, 1628739278, -1628739269, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    @NotNull
    public final byte[] setX(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (byte[]) setDividerPadding(new Object[]{this, bArr, bArr2}, -569441381, 569441385, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    public final void setOnFocusChangeListener(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3) throws Throwable {
        setDividerPadding(new Object[]{this, bArr, bArr2, bArr3}, 1765017362, -1765017356, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    public final void setX(@NotNull byte[] bArr) throws Throwable {
        setDividerPadding(new Object[]{this, bArr}, -362775963, 362775965, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setDivider
    @NotNull
    public final byte[] setDividerPadding(@NotNull byte[] bArr) {
        return (byte[]) setDividerPadding(new Object[]{this, bArr}, 1097168408, -1097168408, System.identityHashCode(this));
    }
}
