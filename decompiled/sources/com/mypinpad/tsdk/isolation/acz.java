package com.mypinpad.tsdk.isolation;

import c2.b;
import com.bbva.cellswidgets.MaskTextWatcher;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public abstract class acz extends ady implements adc, aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f52437u0 = new a(acz.class, 3);
    public static final char[] v0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52438w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52439x0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f52440t0;

    public static class a extends j0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52441f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f52442g = 1;

        public static /* synthetic */ acz e(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            int i15 = ~(i13 | i14);
            int i16 = ~i10;
            int i17 = ((i15 | (~(i16 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
            int i18 = (~(i12 | i13)) | (~(i16 | i14));
            int i19 = ~(i10 | i11);
            if ((i19 * 370) + ((i18 | i19) * (-370)) + i17 == 1) {
                aed aedVar = (aed) objArr[1];
                int i20 = f52441f;
                int i21 = ((i20 ^ 39) | (i20 & 39)) << 1;
                int i22 = -(((~i20) & 39) | (i20 & (-40)));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f52442g = i23 % 128;
                int i24 = i23 % 2;
                acz onFocusChangeListener = aedVar.setOnFocusChangeListener();
                int i25 = f52442g;
                int i26 = ((i25 | 106) << 1) - (i25 ^ 106);
                int i27 = (i26 ^ (-1)) + (i26 << 1);
                f52441f = i27 % 128;
                int i28 = i27 % 2;
                return onFocusChangeListener;
            }
            aft aftVar = (aft) objArr[1];
            int i29 = f52442g;
            int i30 = i29 & 43;
            int i31 = (i29 ^ 43) | i30;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f52441f = i32 % 128;
            int i33 = i32 % 2;
            acz aczVar = (acz) acz.setDividerPadding(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{aftVar}, -952512304, 952512305, System.identityHashCode(aftVar))}, -1839471968, 1839471976, (int) System.currentTimeMillis());
            int i34 = f52441f;
            int i35 = (i34 & 47) + (i34 | 47);
            f52442g = i35 % 128;
            if (i35 % 2 != 0) {
                return aczVar;
            }
            int i36 = 39 / 0;
            return aczVar;
        }

        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady b(aft aftVar) {
            return e(new Object[]{this, aftVar}, 38884404, -38884404, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady d(aed aedVar) {
            return e(new Object[]{this, aedVar}, -1000918375, 1000918376, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f52439x0;
        int i11 = (i10 ^ 15) + ((i10 & 15) << 1);
        f52438w0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public acz(byte[] bArr) {
        this.f52440t0 = bArr;
    }

    public static /* synthetic */ Object f(Object[] objArr) {
        acz aczVar = (acz) objArr[0];
        int i10 = f52438w0;
        int i11 = ((i10 & (-54)) | ((~i10) & 53)) + ((i10 & 53) << 1);
        int i12 = i11 % 128;
        f52439x0 = i12;
        if (i11 % 2 != 0 ? aczVar.f52440t0.length == 1 : aczVar.f52440t0.length == 0) {
            int i13 = (i12 & 51) + (i12 | 51);
            f52438w0 = i13 % 128;
            if (i13 % 2 == 0) {
                return ads.v0;
            }
            ads.a aVar = ads.f52500u0;
            throw null;
        }
        byte[] bArr = aczVar.f52440t0;
        int i14 = bArr[0] & 255;
        byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 1, Integer.valueOf(bArr.length)}, 525237936, -525237917, 1);
        int length = bArr2.length;
        int iIdentityHashCode = System.identityHashCode(aczVar);
        int i15 = -(~(-(-(length * 503))));
        int i16 = (((-503) & i15) + (i15 | (-503))) - 1;
        int i17 = -(-((((-1) ^ length) | length) * (-502)));
        int i18 = (((~i17) & i16) | ((~i16) & i17)) + ((i17 & i16) << 1);
        int i19 = ~length;
        int i20 = (i19 | (~i19)) & (~i19);
        int i21 = ~(~iIdentityHashCode);
        int i22 = i20 & i21;
        int i23 = ((i20 | i21) & (~i22)) | i22;
        int i24 = ~length;
        int i25 = (i24 & length) | (i24 ^ length);
        int i26 = i25 & iIdentityHashCode;
        int i27 = (~i26) & (i25 | iIdentityHashCode);
        int i28 = ~iIdentityHashCode;
        int i29 = (i27 & i26) | (i27 ^ i26);
        int i30 = (i29 | (~i29)) & (~i29);
        int i31 = i23 ^ i30;
        int i32 = i23 & i30;
        int i33 = ((i32 & i31) | (i31 ^ i32)) * (-502);
        int i34 = ((i18 ^ i33) - (~(-(-((i33 & i18) << 1))))) - 1;
        int i35 = i28 ^ length;
        int i36 = length & i28;
        int i37 = ~((i36 & i35) | (i35 ^ i36));
        int i38 = (iIdentityHashCode ^ i25) | i26;
        int i39 = (i38 | (~i38)) & (~i38);
        int i40 = ((~i39) & i37) | ((~i37) & i39);
        int i41 = i39 & i37;
        int i42 = ((i41 & i40) | (i40 ^ i41)) * 502;
        int i43 = i34 & i42;
        int i44 = (i42 ^ i34) | i43;
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        bArr2[i45] = (byte) (bArr2[i45] & ((byte) (255 << i14)));
        int i46 = f52439x0;
        int i47 = i46 ^ 117;
        int i48 = ((i46 & 117) | i47) << 1;
        int i49 = -i47;
        int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
        f52438w0 = i50 % 128;
        int i51 = i50 % 2;
        return bArr2;
    }

    public static /* synthetic */ String g(Object[] objArr) {
        int i10 = 0;
        acz aczVar = (acz) objArr[0];
        int i11 = f52439x0;
        int i12 = (i11 & (-46)) | ((~i11) & 45);
        int i13 = (i11 & 45) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f52438w0 = i14 % 128;
        int i15 = i14 % 2;
        try {
            byte[] alwaysDrawnWithCacheEnabled = aczVar.setAlwaysDrawnWithCacheEnabled();
            int i16 = f52438w0;
            int i17 = (((i16 | 85) << 1) - (~(-(((~i16) & 85) | (i16 & (-86)))))) - 1;
            f52439x0 = i17 % 128;
            int i18 = i17 % 2;
            int length = alwaysDrawnWithCacheEnabled.length << 1;
            int iIdentityHashCode = System.identityHashCode(aczVar);
            int i19 = length * (-589);
            int i20 = (i19 ^ 591) + ((i19 & 591) << 1);
            int i21 = ~iIdentityHashCode;
            int i22 = (i21 | iIdentityHashCode) & i21;
            int i23 = ((-2) ^ i22) | ((-2) & i22);
            int i24 = ~i23;
            int i25 = (i23 | i24) & i24;
            int i26 = ~length;
            int i27 = ((-2) & i26) | (length & 1);
            int i28 = (-2) & length;
            int i29 = ~((i27 & i28) | (i27 ^ i28));
            int i30 = i25 ^ i29;
            int i31 = i25 & i29;
            int i32 = (i31 & i30) | (i30 ^ i31);
            int i33 = i21 & length;
            int i34 = (~i33) & (i21 | length);
            int i35 = (i33 & i34) | (i34 ^ i33);
            int i36 = ~i35;
            int i37 = (i35 | i36) & i36;
            int i38 = ((~i37) & i32) | ((~i32) & i37);
            int i39 = i32 & i37;
            int i40 = (i39 & i38) | (i38 ^ i39);
            int i41 = i26 | 1;
            int i42 = (i41 & i21) | ((~i41) & iIdentityHashCode);
            int i43 = iIdentityHashCode & i41;
            int i44 = (i43 & i42) | (i42 ^ i43);
            int i45 = ~i44;
            int i46 = (i44 | i45) & i45;
            int i47 = i40 ^ i46;
            int i48 = i46 & i40;
            int i49 = ((i48 & i47) | (i47 ^ i48)) * 590;
            int i50 = i20 & i49;
            int i51 = -(-(i49 | i20));
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            int i53 = (-2) & i21;
            int i54 = ~(i53 | ((~i53) & ((-2) | i21)));
            int i55 = ~((-2) | length);
            int i56 = (i54 & i55) | (i54 ^ i55);
            int i57 = (i22 & i26) | ((~i22) & length);
            int i58 = length & i22;
            int i59 = (i58 & i57) | (i57 ^ i58);
            int i60 = ~i59;
            int i61 = (i59 | i60) & i60;
            int i62 = i56 ^ i61;
            int i63 = i56 & i61;
            int i64 = (i52 - (~(-(-(((i63 & i62) | (i62 ^ i63)) * (-1180)))))) - 1;
            int i65 = i26 & i21;
            int i66 = (~i65) & (i26 | i21);
            int i67 = ~((i65 & i66) | (i66 ^ i65));
            int i68 = i21 & 1;
            int i69 = (i21 | 1) & (~i68);
            int i70 = (i68 & i69) | (i69 ^ i68);
            int i71 = ~i70;
            int i72 = (i70 | i71) & i71;
            int i73 = -(-(((i67 & i72) | (i67 ^ i72)) * 590));
            int i74 = i64 & i73;
            int i75 = -(-(i73 | i64));
            StringBuffer stringBuffer = new StringBuffer(((i74 | i75) << 1) - (i75 ^ i74));
            stringBuffer.append(MaskTextWatcher.WILDCARD);
            int i76 = f52439x0;
            int i77 = i76 & 123;
            int i78 = (i76 | 123) & (~i77);
            int i79 = i77 << 1;
            int i80 = (i78 & i79) + (i78 | i79);
            f52438w0 = i80 % 128;
            while (true) {
                int i81 = i80 % 2;
                if (i10 == alwaysDrawnWithCacheEnabled.length) {
                    break;
                }
                int i82 = f52438w0;
                int i83 = (((i82 & (-82)) | ((~i82) & 81)) - (~((i82 & 81) << 1))) - 1;
                f52439x0 = i83 % 128;
                int i84 = i83 % 2;
                byte b10 = alwaysDrawnWithCacheEnabled[i10];
                char[] cArr = v0;
                stringBuffer.append(cArr[(b10 >>> 4) & 15]);
                stringBuffer.append(cArr[b10 & 15]);
                i10 = ((i10 & 1) << 1) + (i10 ^ 1);
                int i85 = f52438w0;
                int i86 = i85 & 5;
                int i87 = (i85 ^ 5) | i86;
                i80 = (i86 ^ i87) + ((i87 & i86) << 1);
                f52439x0 = i80 % 128;
            }
            String string = stringBuffer.toString();
            int i88 = f52438w0 + 77;
            f52439x0 = i88 % 128;
            if (i88 % 2 != 0) {
                return string;
            }
            throw null;
        } catch (IOException e5) {
            StringBuilder sb2 = new StringBuilder("Internal error encoding BitString: ");
            sb2.append(e5.getMessage());
            throw new adx(sb2.toString(), e5);
        }
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = ~i11;
        int i17 = ~i12;
        int i18 = ~(i16 | i17);
        int i19 = ~i10;
        int i20 = (((~(i10 | i12)) | (~(i16 | i12)) | (~(i19 | i17))) * 959) + ((~(i11 | i10)) * (-959)) + ((i18 | (~(i19 | i12)) | (~(i17 | i10))) * 959) + (i11 * (-958)) + (i10 * (-958));
        a aVar = f52437u0;
        byte b10 = 255;
        switch (i20) {
            case 1:
                return f(objArr);
            case 2:
                return g(objArr);
            case 3:
                Object obj = objArr[0];
                int i21 = f52439x0;
                int i22 = (i21 & 79) + (i21 | 79);
                int i23 = i22 % 128;
                f52438w0 = i23;
                if (i22 % 2 != 0) {
                    throw null;
                }
                if (obj == null || (obj instanceof acz)) {
                    acz aczVar = (acz) obj;
                    int i24 = (i21 | 117) << 1;
                    int i25 = -(((~i21) & 117) | (i21 & (-118)));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    f52438w0 = i26 % 128;
                    if (i26 % 2 == 0) {
                        return aczVar;
                    }
                    throw null;
                }
                if (obj instanceof add) {
                    int i27 = i23 & 57;
                    int i28 = -(-((i23 ^ 57) | i27));
                    int i29 = (i27 & i28) + (i27 | i28);
                    f52439x0 = i29 % 128;
                    int i30 = i29 % 2;
                    ady adyVarUiMessageCallbackKtWhenMappings = ((add) obj).UiMessageCallbackKtWhenMappings();
                    if (adyVarUiMessageCallbackKtWhenMappings instanceof acz) {
                        int i31 = f52439x0;
                        int i32 = (i31 & (-90)) | ((~i31) & 89);
                        int i33 = -(-((i31 & 89) << 1));
                        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                        int i35 = i34 % 128;
                        f52438w0 = i35;
                        acz aczVar2 = (acz) adyVarUiMessageCallbackKtWhenMappings;
                        if (i34 % 2 != 0) {
                            int i36 = 54 / 0;
                        }
                        int i37 = i35 & 61;
                        int i38 = i35 | 61;
                        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                        f52439x0 = i39 % 128;
                        int i40 = i39 % 2;
                        return aczVar2;
                    }
                    int i41 = f52439x0;
                    int i42 = i41 & 69;
                    int i43 = (i41 ^ 69) | i42;
                    int i44 = (i42 & i43) + (i43 | i42);
                    f52438w0 = i44 % 128;
                    int i45 = i44 % 2;
                } else if (obj instanceof byte[]) {
                    int i46 = ((i21 & 80) + (i21 | 80)) - 1;
                    f52438w0 = i46 % 128;
                    try {
                        if (i46 % 2 == 0) {
                            return (acz) j0.c(-1221427223, 1221427224, System.identityHashCode(aVar), new Object[]{aVar, (byte[]) obj});
                        }
                        throw null;
                    } catch (IOException e5) {
                        StringBuilder sb2 = new StringBuilder("failed to construct BIT STRING from byte[]: ");
                        sb2.append(e5.getMessage());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
            case 4:
                aeh aehVar = (aeh) objArr[0];
                int i47 = f52438w0;
                int i48 = i47 & 35;
                int i49 = (i48 - (~(-(-((i47 ^ 35) | i48))))) - 1;
                f52439x0 = i49 % 128;
                acz aczVar3 = (acz) (i49 % 2 == 0 ? j0.c(-1072042084, 1072042084, System.identityHashCode(aVar), new Object[]{aVar, aehVar, Boolean.TRUE}) : j0.c(-1072042084, 1072042084, System.identityHashCode(aVar), new Object[]{aVar, aehVar, Boolean.FALSE}));
                int i50 = f52439x0;
                int i51 = i50 & 21;
                int i52 = ((i50 | 21) & (~i51)) + (i51 << 1);
                f52438w0 = i52 % 128;
                int i53 = i52 % 2;
                return aczVar3;
            case 5:
                acz aczVar4 = (acz) objArr[0];
                int i54 = f52439x0;
                int i55 = (i54 & (-40)) | ((~i54) & 39);
                int i56 = -(-((i54 & 39) << 1));
                int i57 = (i55 & i56) + (i56 | i55);
                f52438w0 = i57 % 128;
                int i58 = i57 % 2;
                byte[] bArr = aczVar4.f52440t0;
                if (bArr[0] != 0) {
                    throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
                }
                byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 1, Integer.valueOf(bArr.length)}, 525237936, -525237917, 1);
                int i59 = f52439x0;
                int i60 = ((i59 & 8) + (i59 | 8)) - 1;
                f52438w0 = i60 % 128;
                if (i60 % 2 == 0) {
                    return bArr2;
                }
                throw null;
            case 6:
                acz aczVar5 = (acz) objArr[0];
                int i61 = f52438w0;
                int i62 = i61 ^ 101;
                int i63 = ((i61 & 101) | i62) << 1;
                int i64 = -i62;
                int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                f52439x0 = i65 % 128;
                int i66 = i65 % 2;
                ady adyVarUiMessageCallbackKtWhenMappings2 = aczVar5.UiMessageCallbackKtWhenMappings();
                int i67 = f52438w0 + 31;
                f52439x0 = i67 % 128;
                int i68 = i67 % 2;
                return adyVarUiMessageCallbackKtWhenMappings2;
            case 7:
                acz aczVar6 = (acz) objArr[0];
                int i69 = f52439x0;
                int i70 = i69 ^ 37;
                int i71 = ((i69 & 37) | i70) << 1;
                int i72 = -i70;
                int i73 = ((i71 | i72) << 1) - (i71 ^ i72);
                f52438w0 = i73 % 128;
                int i74 = i73 % 2;
                byte[] bArr3 = aczVar6.f52440t0;
                return Integer.valueOf(i74 != 0 ? bArr3[1] & 31652 : bArr3[0] & 255);
            case 8:
                byte[] bArr4 = (byte[]) objArr[0];
                int i75 = f52439x0;
                int i76 = (-2) - ((i75 + 64) ^ (-1));
                f52438w0 = i76 % 128;
                int i77 = i76 % 2;
                int length = bArr4.length;
                if (length <= 0) {
                    throw new IllegalArgumentException("truncated BIT STRING detected");
                }
                int i78 = bArr4[0] & 255;
                if (i78 > 0) {
                    int i79 = i75 & 109;
                    int i80 = (i75 | 109) & (~i79);
                    int i81 = -(-(i79 << 1));
                    int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                    f52438w0 = i82 % 128;
                    if (i82 % 2 == 0 ? i78 <= 7 : i78 <= 82) {
                        if (length >= 2) {
                            byte b11 = bArr4[(-2) - (length ^ (-1))];
                            if (b11 != ((byte) ((255 << i78) & b11))) {
                                agd agdVar = new agd(bArr4);
                                int i83 = f52438w0;
                                int i84 = i83 | 73;
                                int i85 = i84 << 1;
                                int i86 = -((~(i83 & 73)) & i84);
                                int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                                f52439x0 = i87 % 128;
                                int i88 = i87 % 2;
                                return agdVar;
                            }
                        }
                    }
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
                afk afkVar = new afk(bArr4);
                int i89 = f52438w0;
                int i90 = (((i89 | 84) << 1) - (i89 ^ 84)) - 1;
                f52439x0 = i90 % 128;
                if (i90 % 2 != 0) {
                    return afkVar;
                }
                throw null;
            case 9:
                byte[] bArr5 = ((acz) objArr[0]).f52440t0;
                int length2 = bArr5.length;
                int i91 = ~length2;
                int i92 = -(-(length2 << 1));
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr5, 1, (i91 ^ i92) + ((i92 & i91) << 1));
                int i93 = f52438w0;
                int i94 = (i93 ^ 15) + ((i93 & 15) << 1);
                f52439x0 = i94 % 128;
                int i95 = i94 % 2;
                return byteArrayInputStream;
            case 10:
                acz aczVar7 = (acz) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i96 = f52439x0;
                int i97 = ((i96 ^ 93) | (i96 & 93)) << 1;
                int i98 = -((i96 & (-94)) | ((~i96) & 93));
                int i99 = (i97 & i98) + (i97 | i98);
                int i100 = i99 % 128;
                f52438w0 = i100;
                if (i99 % 2 != 0) {
                    boolean z10 = adyVar instanceof acz;
                    throw null;
                }
                if (adyVar instanceof acz) {
                    byte[] bArr6 = aczVar7.f52440t0;
                    byte[] bArr7 = ((acz) adyVar).f52440t0;
                    int length3 = bArr6.length;
                    if (bArr7.length == length3) {
                        if (length3 == 1) {
                            int i101 = ((i100 & 79) - (~(i100 | 79))) - 1;
                            int i102 = i101 % 128;
                            f52439x0 = i102;
                            int i103 = i101 % 2;
                            int i104 = (-2) - ((i102 + 114) ^ (-1));
                            f52438w0 = i104 % 128;
                            int i105 = i104 % 2;
                        } else {
                            int i106 = length3 - 1;
                            int i107 = i96 - (-1);
                            f52438w0 = i107 % 128;
                            int i108 = i107 % 2;
                            int i109 = 0;
                            while (true) {
                                if (i109 < i106) {
                                    i13 = f52438w0;
                                    int i110 = i13 & 69;
                                    int i111 = i110 + ((i13 ^ 69) | i110);
                                    f52439x0 = i111 % 128;
                                    if (i111 % 2 == 0) {
                                        int i112 = 14 / 0;
                                        if (bArr6[i109] == bArr7[i109]) {
                                            int i113 = i109 - 14;
                                            i109 = (i113 | 15) + (i113 & 15);
                                            int i114 = ((i13 ^ 37) | (i13 & 37)) << 1;
                                            int i115 = -(((~i13) & 37) | (i13 & (-38)));
                                            int i116 = (i114 & i115) + (i115 | i114);
                                            f52439x0 = i116 % 128;
                                            int i117 = i116 % 2;
                                        }
                                    } else if (bArr6[i109] == bArr7[i109]) {
                                        int i118 = i109 - 14;
                                        i109 = (i118 | 15) + (i118 & 15);
                                        int i119 = ((i13 ^ 37) | (i13 & 37)) << 1;
                                        int i1110 = -(((~i13) & 37) | (i13 & (-38)));
                                        int i1111 = (i119 & i1110) + (i1110 | i119);
                                        f52439x0 = i1111 % 128;
                                        int i1112 = i1111 % 2;
                                    }
                                } else {
                                    int i120 = 255 << (bArr6[0] & 255);
                                    if (((byte) (bArr6[i106] & i120)) == ((byte) (bArr7[i106] & i120))) {
                                        int i121 = f52439x0;
                                        int i122 = i121 & 97;
                                        int i123 = -(-(i121 | 97));
                                        int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
                                        int i125 = i124 % 128;
                                        f52438w0 = i125;
                                        int i126 = i124 % 2;
                                        int i127 = i125 + 120;
                                        int i128 = (i127 ^ (-1)) + (i127 << 1);
                                        f52439x0 = i128 % 128;
                                        int i129 = i128 % 2;
                                    } else {
                                        int i130 = f52439x0;
                                        int i131 = i130 & 111;
                                        int i132 = (i130 | 111) & (~i131);
                                        int i133 = i131 << 1;
                                        int i134 = ((i132 | i133) << 1) - (i132 ^ i133);
                                        f52438w0 = i134 % 128;
                                        int i135 = i134 % 2;
                                    }
                                }
                            }
                            i14 = i13 ^ 13;
                            i15 = ~(-(-((i13 & 13) << 1)));
                        }
                        return Boolean.TRUE;
                    }
                    int i136 = i96 & 19;
                    int i137 = (((i96 ^ 19) | i136) << 1) - ((~i136) & (i96 | 19));
                    int i138 = i137 % 128;
                    f52438w0 = i138;
                    int i139 = i137 % 2;
                    i14 = (i138 | 36) << 1;
                    i15 = i138 ^ 36;
                    int i140 = (i14 - i15) - 1;
                    f52439x0 = i140 % 128;
                    int i141 = i140 % 2;
                } else {
                    int i142 = i96 & 111;
                    int i143 = (~i142) & (i96 | 111);
                    int i144 = i142 << 1;
                    int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                    f52438w0 = i145 % 128;
                    if (i145 % 2 != 0) {
                        throw null;
                    }
                }
                return Boolean.FALSE;
            default:
                acz aczVar8 = (acz) objArr[0];
                int i146 = f52438w0;
                int i147 = (((i146 | 58) << 1) - (i146 ^ 58)) - 1;
                f52439x0 = i147 % 128;
                int i148 = i147 % 2;
                int length4 = aczVar8.f52440t0.length;
                int iIdentityHashCode = System.identityHashCode(aczVar8);
                int i149 = -(-(length4 * (-107)));
                int i150 = ((~i149) & (-55)) | (i149 & 54);
                int i151 = (i149 & (-55)) << 1;
                int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
                int i153 = ~length4;
                int i154 = ~iIdentityHashCode;
                int i155 = ~((length4 & i154) | (i154 ^ length4));
                int i156 = i153 ^ i155;
                int i157 = i155 & i153;
                int i158 = ((i157 & i156) | (i156 ^ i157)) * (-108);
                int i159 = (i152 & i158) + (i158 | i152);
                int i160 = ~((~i153) | i153);
                int i161 = ~i160;
                int i162 = (i154 & i161) | ((~i154) & i160);
                int i163 = i154 & i160;
                int i164 = ((i162 & i163) | (i162 ^ i163)) * 54;
                int i165 = i159 & i164;
                int i166 = (((~i165) & (i164 | i159)) - (~(i165 << 1))) - 1;
                int i167 = ((i160 & iIdentityHashCode) | (i161 & iIdentityHashCode) | i163) * 54;
                int iMin = Math.min(5, ((i166 | i167) << 1) - (i167 ^ i166));
                int i168 = f52438w0;
                int i169 = (i168 & (-74)) | ((~i168) & 73);
                int i170 = -(-((i168 & 73) << 1));
                int i171 = (i169 & i170) + (i170 | i169);
                f52439x0 = i171 % 128;
                int i172 = i171 % 2;
                int i173 = 0;
                int i174 = 1;
                while (true) {
                    byte[] bArr8 = aczVar8.f52440t0;
                    if (i174 >= iMin) {
                        if (iMin > 0) {
                            int i175 = f52438w0;
                            int i176 = i175 + 65;
                            f52439x0 = i176 % 128;
                            if (i176 % 2 != 0 ? iMin < 5 : iMin < 2) {
                                int i177 = ((i175 | 107) << 1) - (i175 ^ 107);
                                f52439x0 = i177 % 128;
                                int i178 = i177 % 2;
                                int i179 = ((byte) ((255 << (bArr8[0] & 255)) & bArr8[iMin])) & 255;
                                int iIdentityHashCode2 = System.identityHashCode(aczVar8);
                                int i180 = iMin * (-764);
                                int i181 = 1529 & i180;
                                int i182 = i180 | 1529;
                                int i183 = (i181 ^ i182) + ((i182 & i181) << 1);
                                int i184 = ~iMin;
                                int i185 = ~iIdentityHashCode2;
                                int i186 = i184 ^ i185;
                                int i187 = i184 & i185;
                                int i188 = ~((i186 ^ i187) | (i186 & i187));
                                int i189 = iMin & iIdentityHashCode2;
                                int i190 = (iMin | iIdentityHashCode2) & (~i189);
                                int i191 = ~((i190 & i189) | (i190 ^ i189));
                                int i192 = (i191 & i188) | (i188 ^ i191);
                                int i193 = ~i184;
                                int i194 = (i184 & i193) | (i193 ^ i184);
                                int i195 = -(~(-(-((i192 | (~((i194 & iIdentityHashCode2) | (i194 & i185) | ((~i194) & iIdentityHashCode2)))) * 765))));
                                int i196 = (((i183 | i195) << 1) - (i195 ^ i183)) - 1;
                                int i197 = ~i185;
                                int i198 = i193 & i197;
                                int i199 = (i197 | i193) & (~i198);
                                int i200 = (i196 - (~(-(-(((i199 & i198) | (i199 ^ i198)) * 1530))))) - 1;
                                int i201 = (iIdentityHashCode2 | i185) & i185;
                                int i202 = i186 | i187;
                                int i203 = i202 | (i202 ^ (-1));
                                int i204 = ~i203;
                                int i205 = (i203 | i204) & i204;
                                int i206 = -(-(((i201 & i205) | (i201 ^ i205)) * 765));
                                int i207 = i200 & i206;
                                int i208 = (i206 ^ i200) | i207;
                                int i209 = i179 << (((i207 ^ i208) + ((i208 & i207) << 1)) * 8);
                                i173 = (i173 ^ i209) | (i209 & i173);
                                int i210 = f52439x0;
                                int i211 = (((i210 & (-114)) | ((~i210) & 113)) - (~((i210 & 113) << 1))) - 1;
                                f52438w0 = i211 % 128;
                                int i212 = i211 % 2;
                            }
                        }
                        int i213 = f52438w0;
                        int i214 = i213 & 63;
                        int i215 = (i214 - (~(-(-((i213 ^ 63) | i214))))) - 1;
                        f52439x0 = i215 % 128;
                        if (i215 % 2 != 0) {
                            return Integer.valueOf(i173);
                        }
                        throw null;
                    }
                    int i216 = f52438w0;
                    int i217 = (((i216 ^ 91) | (i216 & 91)) << 1) - (((~i216) & 91) | (i216 & (-92)));
                    f52439x0 = i217 % 128;
                    int i218 = i217 % 2;
                    int i219 = bArr8[i174] & b10;
                    int iIdentityHashCode3 = System.identityHashCode(aczVar8);
                    int i220 = (-2) - ((-(-(i174 * 965))) ^ (-1));
                    int i221 = ~i174;
                    int i222 = (i221 | i174) & i221;
                    int i223 = i222 & iIdentityHashCode3;
                    int i224 = (~i223) & (i222 | iIdentityHashCode3);
                    int i225 = ~iIdentityHashCode3;
                    int i226 = i223 | i224;
                    int i227 = ~i226;
                    int i228 = -(~(((i226 | i227) & i227) * (-964)));
                    int i229 = (((i220 | i228) << 1) - (i228 ^ i220)) - 1;
                    int i230 = ((~i225) & i222) | ((~i222) & i225);
                    int i231 = i225 & i222;
                    int i232 = ~((i230 & i231) | (i230 ^ i231));
                    int i233 = ~i221;
                    int i234 = (i233 & i221) | (i233 ^ i221);
                    int i235 = ~i234;
                    int i236 = (i234 | i235) & i235;
                    int iE = i219 << b.e(i229, ~(-(-(((i232 & i236) | (i232 ^ i236)) * (-964)))), 1, 8);
                    int i237 = i173 ^ iE;
                    int i238 = iE & i173;
                    i173 = (i237 ^ i238) | (i238 & i237);
                    i174++;
                    int i239 = f52438w0 + 97;
                    f52439x0 = i239 % 128;
                    int i240 = i239 % 2;
                    b10 = 255;
                }
                break;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady a() {
        agd agdVar = new agd(this.f52440t0);
        int i10 = f52438w0;
        int i11 = (i10 & 97) + (i10 | 97);
        f52439x0 = i11 % 128;
        if (i11 % 2 != 0) {
            return agdVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, -2019985297, 2019985307, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady e() {
        afk afkVar = new afk(this.f52440t0);
        int i10 = f52438w0 + 47;
        f52439x0 = i10 % 128;
        if (i10 % 2 != 0) {
            return afkVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52439x0;
        int i11 = i10 | 65;
        int i12 = (i11 << 1) - ((~(i10 & 65)) & i11);
        int i13 = i12 % 128;
        f52438w0 = i13;
        int i14 = i12 % 2;
        byte[] bArr = this.f52440t0;
        if (i14 == 0 ? bArr.length < 2 : bArr.length < 3) {
            int i15 = i13 ^ 65;
            int i16 = ((i13 & 65) | i15) << 1;
            int i17 = -i15;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            int i19 = i18 % 128;
            f52439x0 = i19;
            int i20 = i18 % 2;
            int i21 = (i19 ^ 67) + ((i19 & 67) << 1);
            f52438w0 = i21 % 128;
            int i22 = i21 % 2;
            return 1;
        }
        int i23 = bArr[0] & 255;
        int length = bArr.length;
        int iIdentityHashCode = System.identityHashCode(this);
        int i24 = (length * (-929)) + 464;
        int i25 = length & iIdentityHashCode;
        int i26 = -(-(((~((length ^ iIdentityHashCode) | i25)) & (~0)) * (-465)));
        int i27 = (((~i26) & i24) | ((~i24) & i26)) + ((i24 & i26) << 1);
        int i28 = ~iIdentityHashCode;
        int i29 = ~iIdentityHashCode;
        int i30 = length & i29;
        int i31 = -(~((((i29 | length) & (~i30)) | i30) * 930));
        int i32 = ((i27 & i31) + (i31 | i27)) - 1;
        int i33 = ((~length) & iIdentityHashCode) | (i28 & length);
        int i34 = -(-(((i33 & i25) | (i33 ^ i25)) * 465));
        int i35 = ((i32 | i34) << 1) - ((i34 & (~i32)) | ((~i34) & i32));
        byte b10 = (byte) ((255 << i23) & bArr[i35]);
        int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i35)}, 1594133518, -1594133506, i35)).intValue() * 257;
        int i36 = (~b10) & iIntValue;
        int i37 = (~iIntValue) & b10;
        int i38 = (i37 & i36) | (i36 ^ i37);
        int i39 = f52439x0;
        int i40 = (i39 & (-102)) | ((~i39) & 101);
        int i41 = (i39 & 101) << 1;
        int i42 = (i40 & i41) + (i41 | i40);
        f52438w0 = i42 % 128;
        int i43 = i42 % 2;
        return i38;
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1670651961, 1670651961, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() {
        return (ady) setDividerPadding(new Object[]{this}, -1459320409, 1459320415, System.identityHashCode(this));
    }

    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -2004692391, 2004692392, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adc
    public final int setOnDragListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 2120330947, -2120330940, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setDividerPadding(new Object[]{this}, 485540948, -485540946, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adc
    public final InputStream setX() throws IOException {
        return (InputStream) setDividerPadding(new Object[]{this}, 769856274, -769856265, System.identityHashCode(this));
    }

    public String toString() {
        int i10 = f52439x0;
        int i11 = ((i10 | 69) << 1) - (i10 ^ 69);
        f52438w0 = i11 % 128;
        int i12 = i11 % 2;
        String str = (String) setDividerPadding(new Object[]{this}, 485540948, -485540946, System.identityHashCode(this));
        int i13 = f52439x0 + 3;
        f52438w0 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    public acz(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f52440t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, Byte.valueOf((byte) i10)}, -503467610, 503467616, (int) System.currentTimeMillis());
    }

    public static acz setX(Object obj) {
        return (acz) setDividerPadding(new Object[]{obj}, 1095238957, -1095238954, (int) System.currentTimeMillis());
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 541981427, -541981422, System.identityHashCode(this));
    }

    public static acz setDividerPadding(aeh aehVar) {
        return (acz) setDividerPadding(new Object[]{aehVar}, -2033199183, 2033199187, (int) System.currentTimeMillis());
    }
}
