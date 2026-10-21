package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.security.SecureRandom;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class amd implements akg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53188h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53189i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f53190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final akg f53191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53193d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f53196g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53195f = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f53194e = ((Boolean) setOnFocusChangeListener(new Object[0], 417920049, -417920040, (int) System.currentTimeMillis())).booleanValue();

    public amd(akg akgVar) {
        this.f53191b = akgVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:28:0x0113  */
    /* JADX WARN: Code duplicated, block: B:31:0x0129  */
    /* JADX WARN: Code duplicated, block: B:32:0x014a  */
    public static /* synthetic */ Integer a(Object[] objArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        byte bByteValue = ((Byte) objArr[0]).byteValue();
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f53189i;
        int i11 = i10 & 33;
        int i12 = (i10 ^ 33) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f53188h = i14;
        int i15 = i13 % 2;
        int i16 = i14 & 77;
        int i17 = ((i14 ^ 77) | i16) << 1;
        int i18 = -((i14 | 77) & (~i16));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        f53189i = i19 % 128;
        int i20 = i19 % 2;
        boolean z15 = false;
        int i21 = 1;
        int i22 = -1;
        while (i21 != bArr.length) {
            int i23 = f53188h;
            int i24 = ((i23 ^ 103) - (~((i23 & 103) << 1))) - 1;
            int i25 = i24 % 128;
            f53189i = i25;
            if (i24 % 2 == 0) {
                byte b10 = bArr[i21];
                throw null;
            }
            byte b11 = bArr[i21];
            if (b11 == 0) {
                int i26 = ((i25 ^ 23) - (~((i25 & 23) << 1))) - 1;
                f53188h = i26 % 128;
                int i27 = i26 % 2;
                z10 = true;
            } else {
                int i28 = i23 & 125;
                int i29 = ((i23 ^ 125) | i28) << 1;
                int i30 = -((i23 | 125) & (~i28));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f53189i = i31 % 128;
                int i32 = i31 % 2;
                z10 = false;
            }
            int i33 = f53188h;
            if (i22 < 0) {
                int i34 = (-2) - ((i33 + 82) ^ (-1));
                int i35 = i34 % 128;
                f53189i = i35;
                int i36 = i34 % 2;
                int i37 = (i35 ^ 111) + ((i35 & 111) << 1);
                f53188h = i37 % 128;
                int i38 = i37 % 2;
                z11 = true;
            } else {
                int i39 = (i33 & 125) + (i33 | 125);
                f53189i = i39 % 128;
                int i40 = i39 % 2;
                z11 = false;
            }
            if (z10 & z11) {
                int i41 = f53188h;
                int i42 = ((i41 | 65) << 1) - (i41 ^ 65);
                int i43 = i42 % 128;
                f53189i = i43;
                int i44 = i42 % 2;
                int i45 = i43 & 105;
                int i46 = (i43 | 105) & (~i45);
                int i47 = -(-(i45 << 1));
                int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                f53188h = i48 % 128;
                int i49 = i48 % 2;
                i22 = i21;
            }
            if (bByteValue == 1) {
                int i50 = f53188h + 3;
                f53189i = i50 % 128;
                if (i50 % 2 != 0) {
                    z12 = true;
                }
                if (i22 < 0) {
                    int i51 = f53188h;
                    int i52 = (i51 ^ 55) + ((i51 & 55) << 1);
                    f53189i = i52 % 128;
                    int i53 = i52 % 2;
                    int i54 = (i51 & (-104)) | ((~i51) & 103);
                    int i55 = -(-((i51 & 103) << 1));
                    int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                    f53189i = i56 % 128;
                    int i57 = i56 % 2;
                    z13 = true;
                } else {
                    int i58 = f53189i;
                    int i59 = i58 & 69;
                    int i60 = (i58 ^ 69) | i59;
                    int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                    f53188h = i61 % 128;
                    int i62 = i61 % 2;
                    z13 = false;
                }
                boolean z16 = z12 & z13;
                if (b11 != -1) {
                    int i63 = f53188h;
                    int i64 = ((i63 ^ 62) + ((i63 & 62) << 1)) - 1;
                    int i65 = i64 % 128;
                    f53189i = i65;
                    int i66 = i64 % 2;
                    int i67 = ((i65 | 73) << 1) - (((~i65) & 73) | (i65 & (-74)));
                    f53188h = i67 % 128;
                    int i68 = i67 % 2;
                    z14 = true;
                } else {
                    int i69 = f53189i;
                    int i70 = (((i69 ^ 53) | (i69 & 53)) << 1) - (((~i69) & 53) | (i69 & (-54)));
                    f53188h = i70 % 128;
                    int i71 = i70 % 2;
                    z14 = false;
                }
                boolean z17 = z16 & z14;
                z15 = (z15 & z17) | (z15 ^ z17);
                int i72 = i21 & (-54);
                int i73 = ((i21 ^ (-54)) | i72) << 1;
                int i74 = -((i21 | (-54)) & (~i72));
                int i75 = (i73 & i74) + (i74 | i73);
                i21 = (((i75 ^ 55) | (i75 & 55)) << 1) - ((i75 & (-56)) | ((~i75) & 55));
                int i76 = f53188h + 19;
                f53189i = i76 % 128;
                int i77 = i76 % 2;
            } else {
                int i78 = (-2) - ((f53189i + 94) ^ (-1));
                f53188h = i78 % 128;
                int i79 = i78 % 2;
            }
            z12 = false;
            if (i22 < 0) {
                int i510 = f53188h;
                int i511 = (i510 ^ 55) + ((i510 & 55) << 1);
                f53189i = i511 % 128;
                int i512 = i511 % 2;
                int i513 = (i510 & (-104)) | ((~i510) & 103);
                int i514 = -(-((i510 & 103) << 1));
                int i515 = (i513 ^ i514) + ((i514 & i513) << 1);
                f53189i = i515 % 128;
                int i516 = i515 % 2;
                z13 = true;
            } else {
                int i517 = f53189i;
                int i518 = i517 & 69;
                int i610 = (i517 ^ 69) | i518;
                int i611 = (i518 ^ i610) + ((i610 & i518) << 1);
                f53188h = i611 % 128;
                int i612 = i611 % 2;
                z13 = false;
            }
            boolean z18 = z12 & z13;
            if (b11 != -1) {
                int i613 = f53188h;
                int i614 = ((i613 ^ 62) + ((i613 & 62) << 1)) - 1;
                int i615 = i614 % 128;
                f53189i = i615;
                int i616 = i614 % 2;
                int i617 = ((i615 | 73) << 1) - (((~i615) & 73) | (i615 & (-74)));
                f53188h = i617 % 128;
                int i618 = i617 % 2;
                z14 = true;
            } else {
                int i619 = f53189i;
                int i710 = (((i619 ^ 53) | (i619 & 53)) << 1) - (((~i619) & 53) | (i619 & (-54)));
                f53188h = i710 % 128;
                int i711 = i710 % 2;
                z14 = false;
            }
            boolean z19 = z18 & z14;
            z15 = (z15 & z19) | (z15 ^ z19);
            int i712 = i21 & (-54);
            int i713 = ((i21 ^ (-54)) | i712) << 1;
            int i714 = -((i21 | (-54)) & (~i712));
            int i715 = (i713 & i714) + (i714 | i713);
            i21 = (((i715 ^ 55) | (i715 & 55)) << 1) - ((i715 & (-56)) | ((~i715) & 55));
            int i716 = f53188h + 19;
            f53189i = i716 % 128;
            int i717 = i716 % 2;
        }
        int i80 = f53188h;
        if (!z15) {
            int i81 = i80 - (-1);
            f53189i = i81 % 128;
            if (i81 % 2 != 0) {
                return Integer.valueOf(i22);
            }
            throw null;
        }
        int i82 = (((i80 | 78) << 1) - (i80 ^ 78)) - 1;
        f53189i = i82 % 128;
        if (i82 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ Object b(Object[] objArr) throws akx {
        boolean z10;
        int i10;
        int i11;
        amd amdVar = (amd) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i12 = f53188h;
        int i13 = (((i12 & (-6)) | ((~i12) & 5)) - (~((i12 & 5) << 1))) - 1;
        int i14 = i13 % 128;
        f53189i = i14;
        int i15 = i13 % 2;
        if (amdVar.f53195f != -1) {
            int i16 = i14 + 63;
            f53188h = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            byte[] bArr2 = (byte[]) setOnFocusChangeListener(new Object[]{amdVar, bArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 1245967577, -1245967574, iIntValue);
            int i17 = f53189i;
            int i18 = i17 & 105;
            int i19 = (i18 - (~(-(-((i17 ^ 105) | i18))))) - 1;
            f53188h = i19 % 128;
            int i20 = i19 % 2;
            return bArr2;
        }
        akg akgVar = amdVar.f53191b;
        byte[] onFocusChangeListener = akgVar.setOnFocusChangeListener(bArr, iIntValue, iIntValue2);
        if (onFocusChangeListener.length != akgVar.setOnFocusChangeListener()) {
            int i21 = f53189i;
            int i22 = ((i21 & (-4)) | (3 & (~i21))) + ((i21 & 3) << 1);
            f53188h = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i21 & 105;
            int i25 = (((i21 | 105) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
            f53188h = i25 % 128;
            int i26 = i25 % 2;
            z10 = true;
        } else {
            int i27 = f53188h;
            int i28 = (i27 | 83) << 1;
            int i29 = -(((~i27) & 83) | (i27 & (-84)));
            int i30 = (i28 & i29) + (i29 | i28);
            f53189i = i30 % 128;
            int i31 = i30 % 2;
            z10 = false;
        }
        boolean z11 = z10 & amdVar.f53194e;
        if (onFocusChangeListener.length < ((Integer) setOnFocusChangeListener(new Object[]{amdVar}, 1841444133, -1841444133, System.identityHashCode(amdVar))).intValue()) {
            int i32 = f53189i;
            int i33 = (i32 & 45) + (i32 | 45);
            f53188h = i33 % 128;
            int i34 = i33 % 2;
            byte[] bArr3 = amdVar.f53196g;
            int i35 = i32 & 55;
            int i36 = (i32 ^ 55) | i35;
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            f53188h = i37 % 128;
            int i38 = i37 % 2;
            onFocusChangeListener = bArr3;
        }
        byte b10 = onFocusChangeListener[0];
        if (!amdVar.f53193d) {
            int i39 = f53188h;
            if (b10 != 1) {
                int i40 = i39 & 91;
                int i41 = -(-((i39 ^ 91) | i40));
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                f53189i = i42 % 128;
                int i43 = i42 % 2;
                i10 = 1;
            } else {
                int i44 = i39 & 13;
                int i45 = ((i39 | 13) & (~i44)) + (i44 << 1);
                f53189i = i45 % 128;
                int i46 = i45 % 2;
                i10 = 0;
            }
            int i47 = f53188h;
            int i48 = i47 & 75;
            int i49 = i48 + ((i47 ^ 75) | i48);
            f53189i = i49 % 128;
            int i50 = i49 % 2;
        } else {
            int i51 = f53188h;
            int i52 = (i51 & (-124)) | ((~i51) & 123);
            int i53 = (i51 & 123) << 1;
            int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
            int i55 = i54 % 128;
            f53189i = i55;
            if (i54 % 2 != 0 ? b10 == 2 : b10 == 4) {
                int i56 = (((i55 | 104) << 1) - (i55 ^ 104)) - 1;
                f53188h = i56 % 128;
                int i57 = i56 % 2;
                i10 = 0;
            } else {
                int i58 = i55 & 25;
                int i59 = i58 + ((i55 ^ 25) | i58);
                int i60 = i59 % 128;
                f53188h = i60;
                int i61 = i59 % 2;
                int i62 = i60 & 53;
                int i63 = -(-((i60 ^ 53) | i62));
                int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                f53189i = i64 % 128;
                int i65 = i64 % 2;
                i10 = 1;
            }
            int i66 = f53188h + 19;
            f53189i = i66 % 128;
            int i67 = i66 % 2;
        }
        int iIntValue3 = ((Integer) setOnFocusChangeListener(new Object[]{Byte.valueOf(b10), onFocusChangeListener}, -1243399975, 1243399980, (int) System.currentTimeMillis())).intValue();
        int i68 = ((iIntValue3 & (-25)) + (iIntValue3 | (-25))) - 1;
        int i69 = ((i68 ^ 27) | (i68 & 27)) << 1;
        int i70 = -(((~i68) & 27) | (i68 & (-28)));
        int i71 = (i69 ^ i70) + ((i69 & i70) << 1);
        if (i71 < 10) {
            int i72 = f53188h;
            int i73 = i72 ^ 27;
            int i74 = ((i72 & 27) | i73) << 1;
            int i75 = -i73;
            int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
            f53189i = i76 % 128;
            int i77 = i76 % 2;
            int i78 = i72 + 121;
            f53189i = i78 % 128;
            int i79 = i78 % 2;
            i11 = 1;
        } else {
            int i80 = f53189i;
            int i81 = (i80 ^ 119) + ((i80 & 119) << 1);
            f53188h = i81 % 128;
            int i82 = i81 % 2;
            i11 = 0;
        }
        int i83 = i10 & i11;
        int i84 = (i10 | i11) & (~i83);
        if (((i84 & i83) | (i84 ^ i83)) != 0) {
            bek.setOnFocusChangeListener(new Object[]{onFocusChangeListener}, -949833373, 949833375, (int) System.currentTimeMillis());
            throw new akx("block incorrect");
        }
        if (z11) {
            bek.setOnFocusChangeListener(new Object[]{onFocusChangeListener}, -949833373, 949833375, (int) System.currentTimeMillis());
            throw new akx("block incorrect size");
        }
        int length = (onFocusChangeListener.length - (~(-i71))) - 1;
        byte[] bArr4 = new byte[length];
        System.arraycopy(onFocusChangeListener, i71, bArr4, 0, length);
        int i85 = f53189i;
        int i86 = ((i85 | 54) << 1) - (i85 ^ 54);
        int i87 = (i86 ^ (-1)) + (i86 << 1);
        f53188h = i87 % 128;
        int i88 = i87 % 2;
        return bArr4;
    }

    public static /* synthetic */ Object c(Object[] objArr) throws akx {
        boolean z10;
        amd amdVar = (amd) objArr[0];
        int i10 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int i11 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i12 = f53189i;
        int i13 = i12 & 5;
        int i14 = i13 + ((i12 ^ 5) | i13);
        f53188h = i14 % 128;
        if (i14 % 2 != 0) {
            boolean z11 = amdVar.f53193d;
            throw null;
        }
        if (!amdVar.f53193d) {
            throw new akx("sorry, this method is only for decryption, not for signing");
        }
        byte[] onFocusChangeListener = amdVar.f53191b.setOnFocusChangeListener(bArr, iIntValue, iIntValue2);
        int i15 = amdVar.f53195f;
        byte[] bArr2 = new byte[i15];
        amdVar.f53190a.nextBytes(bArr2);
        if (onFocusChangeListener.length != amdVar.f53191b.setOnFocusChangeListener()) {
            int i16 = f53188h;
            int i17 = (i16 ^ 49) + ((i16 & 49) << 1);
            f53189i = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i16 & 35;
            int i20 = (i16 ^ 35) | i19;
            int i21 = (i19 & i20) + (i20 | i19);
            f53189i = i21 % 128;
            int i22 = i21 % 2;
            z10 = true;
        } else {
            int i23 = f53189i;
            int i24 = ((i23 ^ 5) | (i23 & 5)) << 1;
            int i25 = -(((~i23) & 5) | (i23 & (-6)));
            int i26 = (i24 & i25) + (i25 | i24);
            f53188h = i26 % 128;
            int i27 = i26 % 2;
            z10 = false;
        }
        if (z10 && amdVar.f53194e) {
            int i28 = f53189i;
            int i29 = ((i28 ^ 37) | (i28 & 37)) << 1;
            int i30 = -(((~i28) & 37) | (i28 & (-38)));
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            int i32 = i31 % 128;
            f53188h = i32;
            int i33 = i31 % 2;
            byte[] bArr3 = amdVar.f53196g;
            int i34 = ((i32 ^ 54) + ((i32 & 54) << 1)) - 1;
            f53189i = i34 % 128;
            int i35 = i34 % 2;
            onFocusChangeListener = bArr3;
        } else {
            int i36 = f53188h;
            int i37 = (i36 & 19) + (i36 | 19);
            f53189i = i37 % 128;
            int i38 = i37 % 2;
        }
        int iIntValue3 = ((Integer) setOnFocusChangeListener(new Object[]{onFocusChangeListener, Integer.valueOf(i15)}, -2101618356, 2101618362, i15)).intValue();
        byte[] bArr4 = new byte[i15];
        int i39 = f53188h;
        int i40 = i39 & 75;
        int i41 = (i40 - (~((i39 ^ 75) | i40))) - 1;
        f53189i = i41 % 128;
        int i42 = i41 % 2;
        int i43 = 0;
        while (i43 < i15) {
            int i44 = f53189i;
            int i45 = ((i44 ^ 80) + ((i44 & 80) << i10)) - i10;
            f53188h = i45 % 128;
            int i46 = i45 % i11;
            int length = onFocusChangeListener.length;
            int i47 = -i15;
            int i48 = i47 * 934;
            int i49 = -(-(length * (-932)));
            int i50 = (i48 ^ i49) + ((i48 & i49) << i10);
            int i51 = ~length;
            int i52 = ~i47;
            int i53 = ~iIntValue;
            int i54 = i52 ^ i53;
            int i55 = ~i53;
            int i56 = i52 & i53;
            int i57 = ~((i54 ^ i56) | (i54 & i56));
            int i58 = iIntValue;
            int i59 = ((~i57) & i51) | ((~i51) & i57);
            int i60 = i51 & i57;
            int i61 = -(-(((i59 & i60) | (i59 ^ i60)) * (-933)));
            int i62 = ((~i61) & i50) | ((~i50) & i61);
            int i63 = -(-((i61 & i50) << 1));
            int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
            int i65 = (i51 & i55) | ((~i51) & i53);
            int i66 = i53 & i51;
            int i67 = (i66 & i65) | (i65 ^ i66);
            int i68 = (i67 | (~i67)) & (~i67);
            int i69 = ~((i51 ^ i47) | (i51 & i47));
            int i70 = i68 & i69;
            int i71 = (i68 | i69) & (~i70);
            int i72 = -(-(((i71 & i70) | (i71 ^ i70)) * 933));
            int i73 = i64 & i72;
            int i74 = -(-(i72 | i64));
            int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
            int i76 = i47 & length;
            int i77 = (~i76) & (i47 | length);
            int i78 = (i76 & i77) | (i77 ^ i76);
            int i79 = ((i78 | (~i78)) & (~i78)) * 933;
            int i80 = ((i75 ^ i79) | (i75 & i79)) << 1;
            int i81 = -((i79 & (~i75)) | ((~i79) & i75));
            int i82 = onFocusChangeListener[(i43 - (~(-(-((i80 & i81) + (i81 | i80)))))) - 1] & (~iIntValue3);
            int i83 = bArr2[i43] & iIntValue3;
            int i84 = ((~i83) & i82) | ((~i82) & i83);
            int i85 = i82 & i83;
            bArr4[i43] = (byte) ((i85 & i84) | (i84 ^ i85));
            int i86 = i43 + 2;
            i10 = 1;
            i43 = (i86 ^ (-1)) + (i86 << 1);
            int i87 = (i44 ^ 1) + ((i44 & 1) << 1);
            f53188h = i87 % 128;
            int i88 = i87 % 2;
            iIntValue = i58;
            i11 = 2;
        }
        Object[] objArr2 = new Object[i10];
        objArr2[0] = onFocusChangeListener;
        bek.setOnFocusChangeListener(objArr2, -949833373, 949833375, (int) System.currentTimeMillis());
        int i89 = f53188h;
        int i90 = (i89 ^ 105) + ((i89 & 105) << 1);
        f53189i = i90 % 128;
        if (i90 % 2 != 0) {
            return bArr4;
        }
        throw null;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        amw amwVar;
        amd amdVar = (amd) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        akk akkVar = (akk) objArr[2];
        int i10 = f53188h + 32;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        f53189i = i12;
        int i13 = i11 % 2;
        if (akkVar instanceof ant) {
            int i14 = ((i12 | 55) << 1) - (((~i12) & 55) | (i12 & (-56)));
            f53188h = i14 % 128;
            int i15 = i14 % 2;
            ant antVar = (ant) akkVar;
            amdVar.f53190a = (SecureRandom) ant.setOnFocusChangeListener(new Object[]{antVar}, 1149346033, -1149346032, System.identityHashCode(antVar));
            amwVar = (amw) ((akk) ant.setOnFocusChangeListener(new Object[]{antVar}, -310755770, 310755770, System.identityHashCode(antVar)));
            int i16 = f53189i;
            int i17 = i16 & 113;
            int i18 = -(-((i16 ^ 113) | i17));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f53188h = i19 % 128;
            int i20 = i19 % 2;
        } else {
            amwVar = (amw) akkVar;
            if (!((Boolean) amw.setOnFocusChangeListener(new Object[]{amwVar}, 1283892343, -1283892343, System.identityHashCode(amwVar))).booleanValue()) {
                int i21 = f53189i;
                int i22 = (i21 ^ 19) + ((i21 & 19) << 1);
                int i23 = i22 % 128;
                f53188h = i23;
                int i24 = i22 % 2;
                if (zBooleanValue) {
                    int i25 = i23 & 13;
                    int i26 = i25 + ((i23 ^ 13) | i25);
                    f53189i = i26 % 128;
                    int i27 = i26 % 2;
                    amdVar.f53190a = (SecureRandom) aku.setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis());
                    int i28 = f53188h;
                    int i29 = (((i28 | 42) << 1) - (i28 ^ 42)) - 1;
                    f53189i = i29 % 128;
                    int i30 = i29 % 2;
                }
            }
        }
        amdVar.f53191b.setX(zBooleanValue, akkVar);
        amdVar.f53193d = ((Boolean) amw.setOnFocusChangeListener(new Object[]{amwVar}, 1283892343, -1283892343, System.identityHashCode(amwVar))).booleanValue();
        amdVar.f53192c = zBooleanValue;
        amdVar.f53196g = new byte[amdVar.f53191b.setOnFocusChangeListener()];
        if (amdVar.f53195f > 0) {
            int i31 = f53188h;
            int i32 = (i31 & 125) + (i31 | 125);
            f53189i = i32 % 128;
            int i33 = i32 % 2;
            if (amdVar.f53190a == null) {
                throw new IllegalArgumentException("encoder requires random");
            }
        }
        int i34 = f53189i;
        int i35 = i34 & 121;
        int i36 = (i34 | 121) & (~i35);
        int i37 = -(-(i35 << 1));
        int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
        f53188h = i38 % 128;
        if (i38 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean e() {
        int i10 = f53189i + 39;
        f53188h = i10 % 128;
        if (i10 % 2 == 0 ? !(!((Boolean) bet.setCompoundDrawableTintBlendMode(new Object[]{PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY, Boolean.TRUE}, -1393729344, 1393729344, (int) System.currentTimeMillis())).booleanValue()) : ((Boolean) bet.setCompoundDrawableTintBlendMode(new Object[]{PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY, Boolean.FALSE}, -1393729344, 1393729344, (int) System.currentTimeMillis())).booleanValue()) {
            int i11 = f53188h;
            int i12 = ((i11 & 73) - (~(i11 | 73))) - 1;
            f53189i = i12 % 128;
            int i13 = i12 % 2;
            int i14 = (i11 ^ 51) + ((i11 & 51) << 1);
            f53189i = i14 % 128;
            if (i14 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        Boolean bool = Boolean.FALSE;
        if (((Boolean) bet.setCompoundDrawableTintBlendMode(new Object[]{PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY, bool}, -1393729344, 1393729344, (int) System.currentTimeMillis())).booleanValue()) {
            int i15 = f53189i;
            int i16 = (((i15 | 51) << 1) - (~(-(((~i15) & 51) | (i15 & (-52)))))) - 1;
            f53188h = i16 % 128;
            if (i16 % 2 == 0) {
                return bool;
            }
            throw null;
        }
        int i17 = f53188h;
        int i18 = ((i17 ^ 49) | (i17 & 49)) << 1;
        int i19 = -((i17 & (-50)) | ((~i17) & 49));
        int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
        f53189i = i20 % 128;
        int i21 = i20 % 2;
        int i22 = i17 & 21;
        int i23 = i22 + ((i17 ^ 21) | i22);
        f53189i = i23 % 128;
        if (i23 % 2 != 0) {
            return Boolean.TRUE;
        }
        int i24 = 58 / 0;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d3, code lost:
    
        return java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d4, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.amd.f53189i;
        r0 = r11 | 21;
        r2 = ((r0 << 1) - (~(-((~(r11 & 21)) & r0)))) - 1;
        com.mypinpad.tsdk.isolation.amd.f53188h = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e9, code lost:
    
        if ((r2 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
    
        return java.lang.Integer.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r11.f53192c != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r11.f53192c != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r11 = java.lang.System.identityHashCode(r11);
        r0 = -(-(r1 * (-271)));
        r4 = (-2730) & r0;
        r3 = (((((-2730) ^ r0) | r4) << 1) - (~(-((r0 | (-2730)) & (~r4))))) - 1;
        r0 = ~r1;
        r2 = (((r0 | r1) & r0) | 9) | (~r11);
        r5 = ~r2;
        r2 = (r2 | r5) & r5;
        r7 = r1 & 9;
        r6 = ((-10) & r0) | r7;
        r8 = (-10) & r1;
        r6 = (r6 & r8) | (r6 ^ r8);
        r9 = r6 & r11;
        r6 = (r6 | r11) & (~r9);
        r6 = ~((r6 & r9) | (r6 ^ r9));
        r9 = r2 ^ r6;
        r2 = r2 & r6;
        r2 = -(~(-(-(((r2 & r9) | (r9 ^ r2)) * (-272)))));
        r6 = ((r3 & r2) + (r2 | r3)) - 1;
        r0 = (r0 & 9) | r8;
        r0 = ~((r0 & r7) | (r0 ^ r7));
        r2 = ~((9 ^ r11) | (9 & r11));
        r3 = ((~r2) & r0) | ((~r0) & r2);
        r0 = r0 & r2;
        r6 = (r6 - (~(((r0 & r3) | (r3 ^ r0)) * (-272)))) - 1;
        r0 = (-10) & r11;
        r11 = (r11 | (-10)) & (~r0);
        r11 = ~((r11 & r0) | (r11 ^ r0));
        r0 = r1 & r11;
        r11 = (r11 | r1) & (~r0);
        r11 = (((r11 & r0) | (r11 ^ r0)) * 272) + r6;
        r0 = com.mypinpad.tsdk.isolation.amd.f53188h;
        r1 = r0 | 111;
        r2 = (r1 << 1) - ((~(r0 & 111)) & r1);
        com.mypinpad.tsdk.isolation.amd.f53189i = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer f(java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.amd.f(java.lang.Object[]):java.lang.Integer");
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        amd amdVar = (amd) objArr[0];
        int i10 = f53189i;
        int i11 = ((i10 & (-78)) | ((~i10) & 77)) + ((i10 & 77) << 1);
        f53188h = i11 % 128;
        int i12 = i11 % 2;
        int onFocusChangeListener = amdVar.f53191b.setOnFocusChangeListener();
        if (amdVar.f53192c) {
            int i13 = f53189i;
            int i14 = (i13 | 91) << 1;
            int i15 = -((i13 & (-92)) | ((~i13) & 91));
            int i16 = (i14 & i15) + (i14 | i15);
            f53188h = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i13 & 87;
            int i19 = i13 | 87;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f53188h = i20 % 128;
            if (i20 % 2 == 0) {
                return Integer.valueOf(onFocusChangeListener);
            }
            throw null;
        }
        int iIdentityHashCode = System.identityHashCode(amdVar);
        int i21 = onFocusChangeListener * 253;
        int i22 = (-2530) ^ i21;
        int i23 = (((i21 & (-2530)) | i22) << 1) - i22;
        int i24 = ~onFocusChangeListener;
        int i25 = i24 & (-10);
        int i26 = ((~i24) & 9) | i25 | (9 & i24);
        int i27 = ~i26;
        int i28 = (i26 | i27) & i27;
        int i29 = (i24 | onFocusChangeListener) & i24;
        int i30 = ~iIdentityHashCode;
        int i31 = (i30 | iIdentityHashCode) & i30;
        int i32 = ((~i31) & i29) | ((~i29) & i31);
        int i33 = i29 & i31;
        int i34 = (i33 & i32) | (i32 ^ i33);
        int i35 = ~i34;
        int i36 = (i34 | i35) & i35;
        int i37 = ((~i36) & i28) | ((~i28) & i36);
        int i38 = i28 & i36;
        int i39 = (i38 & i37) | (i37 ^ i38);
        int i40 = (-10) | onFocusChangeListener;
        int i41 = i40 & iIdentityHashCode;
        int i42 = (~i41) & (i40 | iIdentityHashCode);
        int i43 = ~((i41 & i42) | (i42 ^ i41));
        int i44 = (((i39 & i43) | (i39 ^ i43)) * (-252)) + i23;
        int i45 = (onFocusChangeListener & 9) | i25;
        int i46 = onFocusChangeListener & (-10);
        int i47 = -(-(((i45 & i46) | (i45 ^ i46)) * (-252)));
        int i48 = i44 & i47;
        int i49 = (i47 ^ i44) | i48;
        int i50 = (i48 & i49) + (i49 | i48);
        int i51 = i24 ^ i30;
        int i52 = i24 & i30;
        int i53 = (i51 & i52) | (i51 ^ i52);
        int i54 = i53 & (-10);
        int i55 = ~(((i53 | (-10)) & (~i54)) | i54);
        int i56 = (~i46) & i40;
        int i57 = (i46 & i56) | (i56 ^ i46);
        int i58 = ~((iIdentityHashCode & i57) | (i57 ^ iIdentityHashCode));
        int i59 = i55 & i58;
        int i60 = (i58 | i55) & (~i59);
        int i61 = -(-(((i60 & i59) | (i60 ^ i59)) * 252));
        int i62 = i50 & i61;
        int i63 = (i61 ^ i50) | i62;
        int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
        int i65 = f53189i;
        int i66 = i65 & 85;
        int i67 = (((i65 ^ 85) | i66) << 1) - ((i65 | 85) & (~i66));
        f53188h = i67 % 128;
        if (i67 % 2 == 0) {
            return Integer.valueOf(i64);
        }
        throw null;
    }

    public static /* synthetic */ Object h(Object[] objArr) throws akx {
        amd amdVar = (amd) objArr[0];
        int i10 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i11 = f53189i + 65;
        f53188h = i11 % 128;
        if (i11 % 2 != 0) {
            ((Integer) setOnFocusChangeListener(new Object[]{amdVar}, -1787140013, 1787140015, System.identityHashCode(amdVar))).intValue();
            throw null;
        }
        if (iIntValue2 > ((Integer) setOnFocusChangeListener(new Object[]{amdVar}, -1787140013, 1787140015, System.identityHashCode(amdVar))).intValue()) {
            throw new IllegalArgumentException("input data too large");
        }
        int compoundDrawableTintBlendMode = amdVar.f53191b.setCompoundDrawableTintBlendMode();
        byte[] bArr2 = new byte[compoundDrawableTintBlendMode];
        if (!(!amdVar.f53193d)) {
            int i12 = (~iIntValue) & ((~iIntValue) | iIntValue);
            bArr2[0] = 1;
            int i13 = f53189i;
            int i14 = (i13 ^ 123) + ((i13 & 123) << 1);
            f53188h = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 1;
            while (true) {
                int i17 = -iIntValue2;
                int i18 = i17 * 303;
                int i19 = -(-(compoundDrawableTintBlendMode * (-301)));
                int i20 = i18 & i19;
                int i21 = i18 | i19;
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = ~i17;
                int i24 = ((~i17) | i17) & i23;
                int i25 = (i24 ^ i12) | (i24 & i12);
                int i26 = ~(((~compoundDrawableTintBlendMode) & i25) | ((~i25) & compoundDrawableTintBlendMode) | (i25 & compoundDrawableTintBlendMode));
                int i27 = i17 & compoundDrawableTintBlendMode;
                int i28 = (~i27) & (i17 | compoundDrawableTintBlendMode);
                int i29 = (i28 ^ i27) | (i27 & i28);
                int i30 = (i29 & iIntValue) | (i29 ^ iIntValue);
                int i31 = ((~i30) | i30) & (~i30);
                int i32 = -(-(((i26 & i31) | (i26 ^ i31)) * (-302)));
                int i33 = (i22 ^ i32) + ((i32 & i22) << 1);
                int i34 = (i23 ^ compoundDrawableTintBlendMode) | (i23 & compoundDrawableTintBlendMode);
                int i35 = i34 & iIntValue;
                int i36 = (i34 | iIntValue) & (~i35);
                int i37 = -(-((~((i36 & i35) | (i36 ^ i35))) * (-604)));
                int i38 = (i33 & i37) + (i37 | i33);
                int i39 = ~((~compoundDrawableTintBlendMode) | i17);
                int i40 = ~((compoundDrawableTintBlendMode ^ iIntValue) | (compoundDrawableTintBlendMode & iIntValue));
                int i41 = ((~i40) & i39) | ((~i39) & i40);
                int i42 = i39 & i40;
                int i43 = -(~(((i42 & i41) | (i41 ^ i42)) * 302));
                if (i16 == ((i38 & i43) + (i43 | i38)) - 2) {
                    break;
                }
                int i44 = f53189i;
                int i45 = ((i44 | 69) << 1) - (i44 ^ 69);
                f53188h = i45 % 128;
                int i46 = i45 % 2;
                bArr2[i16] = -1;
                int i47 = i16 & 29;
                int i48 = i47 + ((i16 ^ 29) | i47);
                int i49 = i48 & (-28);
                int i50 = ((i48 ^ (-28)) | i49) << 1;
                int i51 = -((i48 | (-28)) & (~i49));
                i16 = (i50 ^ i51) + ((i51 & i50) << 1);
                int i52 = i44 & 73;
                int i53 = ((i44 | 73) & (~i52)) + (i52 << 1);
                f53188h = i53 % 128;
                int i54 = i53 % 2;
            }
            int i55 = f53188h;
            int i56 = i55 & 23;
            int i57 = (i55 | 23) & (~i56);
            int i58 = i56 << 1;
            int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
            f53189i = i59 % 128;
            int i60 = i59 % 2;
        } else {
            amdVar.f53190a.nextBytes(bArr2);
            bArr2[0] = 2;
            int i61 = f53188h;
            int i62 = ((i61 ^ 48) + ((i61 & 48) << 1)) - 1;
            f53189i = i62 % 128;
            int i63 = i62 % 2;
            int i64 = 1;
            while (true) {
                int i65 = -iIntValue2;
                int i66 = i65 * (-755);
                int i67 = compoundDrawableTintBlendMode * (-755);
                int i68 = i66 & i67;
                int i69 = i68 + ((i66 ^ i67) | i68);
                int i70 = ~i65;
                int i71 = ~i65;
                int i72 = i70 & (i71 | i65);
                int i73 = ~compoundDrawableTintBlendMode;
                int i74 = ~compoundDrawableTintBlendMode;
                int i75 = i73 & (i74 | compoundDrawableTintBlendMode);
                int i76 = -(-((~((i72 & i75) | (i72 ^ i75))) * 1512));
                int i77 = i69 & i76;
                int i78 = ((i69 ^ i76) | i77) << i10;
                int i79 = -((i76 | i69) & (~i77));
                int i80 = (i78 & i79) + (i79 | i78);
                int i81 = i71 & i74;
                int i82 = (~i81) & (i71 | i74);
                int i83 = ~((i81 & i82) | (i82 ^ i81));
                int i84 = (i71 & compoundDrawableTintBlendMode) | (i65 & i74);
                int i85 = i65 & compoundDrawableTintBlendMode;
                int i86 = (i84 & i85) | (i84 ^ i85);
                int i87 = ~iIntValue;
                int i88 = (i86 & iIntValue) | (i86 ^ iIntValue);
                int i89 = ((((~i88) | i88) & (~i88)) | i83) * (-756);
                int i90 = i80 ^ i89;
                int i91 = (i89 & i80) << i10;
                int i92 = ((i90 | i91) << i10) - (i91 ^ i90);
                int i93 = (i65 | compoundDrawableTintBlendMode) & (~i85);
                int i94 = (~iIntValue) & (i87 | iIntValue);
                int i95 = -(-(((i93 & i85) | (i93 ^ i85) | i94) * 756));
                if (i64 != ((i92 & i95) + (i95 | i92)) - i10) {
                    while (bArr2[i64] == 0) {
                        int i96 = (-537407637) ^ iIntValue;
                        int i97 = (-537407637) & iIntValue;
                        int i98 = (i96 & i97) | (i96 ^ i97);
                        int i99 = (i98 | (~i98)) & (~i98);
                        int i100 = -(-(((i99 & (-736066752)) | ((-736066752) ^ i99)) * (-476)));
                        int i101 = (-703927302) & i100;
                        int i102 = (i101 - (~(-(-((i100 ^ (-703927302)) | i101))))) - i10;
                        int i103 = ((-537407637) & i87) | (537407636 & iIntValue);
                        int i104 = (-537407637) & iIntValue;
                        int i105 = (i104 & i103) | (i103 ^ i104);
                        int i106 = ((i105 | (~i105)) & (~i105)) * 952;
                        int i107 = ((i102 | i106) << i10) - (i106 ^ i102);
                        int i108 = (-576483520) & i94;
                        int i109 = ((-576483520) | i94) & (~i108);
                        int i110 = (i109 & i108) | (i109 ^ i108);
                        int i111 = i110 ^ (-696990869);
                        int i112 = i110 & (-696990869);
                        int i113 = (i107 - (~((~((i112 & i111) | (i111 ^ i112))) * 476))) - i10;
                        int i114 = ((-1946328273) & i87) | (iIntValue & 1946328272);
                        int i115 = (-1946328273) & iIntValue;
                        int i116 = (i114 & i115) | (i114 ^ i115);
                        int i117 = (i116 | (~i116)) & (~i116);
                        int i118 = 335681680 & i117;
                        int i119 = (~i118) & (i117 | 335681680);
                        int i120 = -(~(-(-(((i119 & i118) | (i119 ^ i118)) * (-280)))));
                        int i121 = ((-742697052) & i120) + (i120 | (-742697052));
                        int i122 = (i121 ^ (-1)) + (i121 << 1);
                        int i123 = (~i115) & ((-1946328273) | iIntValue);
                        int i124 = ~((i123 & i115) | (i123 ^ i115));
                        int i125 = (492247483 & i87) | (iIntValue & (-492247484));
                        int i126 = 492247483 & iIntValue;
                        int i127 = (i125 ^ i126) | (i125 & i126);
                        int i128 = (~i127) & (i127 | (~i127));
                        int i129 = i124 & i128;
                        int i130 = -(~((((i124 | i128) & (~i129)) | i129) * 140));
                        int i131 = ((i122 | i130) << i10) - (i122 ^ i130);
                        int i132 = (i131 ^ (-1)) + (i131 << 1);
                        int i133 = ((-1610646593) & iIntValue) | ((-1610646593) & i87) | (1610646592 & iIntValue);
                        int i134 = (i133 | (~i133)) & (~i133);
                        int i135 = (-1946328273) & i94;
                        int i136 = ((-1946328273) | i94) & (~i135);
                        int i137 = (i136 & i135) | (i136 ^ i135);
                        int i138 = i137 & (-492247484);
                        int i139 = ~(((~i138) & (i137 | (-492247484))) | i138);
                        int i140 = (i139 & i134) | (i134 ^ i139);
                        int i141 = ~iIntValue;
                        int i142 = (i141 & 492247483) | (492247483 ^ i141);
                        int i143 = ~((i142 & 1946328272) | (i142 ^ 1946328272));
                        int i144 = i140 & i143;
                        int i145 = -(-((((i140 | i143) & (~i144)) | i144) * 140));
                        int i146 = i132 & i145;
                        int i147 = -(-((i145 ^ i132) | i146));
                        if (i113 > (i146 ^ i147) + ((i147 & i146) << 1)) {
                            bArr2[i64] = (byte) amdVar.f53190a.nextInt();
                            throw null;
                        }
                        bArr2[i64] = (byte) amdVar.f53190a.nextInt();
                        int i148 = f53188h;
                        int i149 = ((i148 | 121) << 1) - (i148 ^ 121);
                        f53189i = i149 % 128;
                        int i150 = i149 % 2;
                        i10 = 1;
                    }
                    int i151 = (((i64 | 58) << 1) - (i64 ^ 58)) - 1;
                    int i152 = i151 & (-56);
                    int i153 = -(-(i151 | (-56)));
                    int i154 = f53188h;
                    int i155 = ((i154 | 83) << 1) - (i154 ^ 83);
                    f53189i = i155 % 128;
                    int i156 = i155 % 2;
                    i64 = ((i153 & i152) << 1) + (i152 ^ i153);
                    i10 = 1;
                }
            }
        }
        int i157 = -iIntValue2;
        int i158 = i157 * (-949);
        int i159 = -(-(compoundDrawableTintBlendMode * (-949)));
        int i160 = ((~i159) & i158) | ((~i158) & i159);
        int i161 = (i158 & i159) << 1;
        int i162 = ((i160 | i161) << 1) - (i161 ^ i160);
        int i163 = ~compoundDrawableTintBlendMode;
        int i164 = ~iIntValue;
        int i165 = i163 & i164;
        int i166 = (i163 | i164) & (~i165);
        int i167 = ~((i166 & i165) | (i166 ^ i165));
        int i168 = ~i157;
        int i169 = i168 ^ iIntValue;
        int i170 = i168 & iIntValue;
        int i171 = (i169 & i170) | (i169 ^ i170);
        int i172 = (i171 | (~i171)) & (~i171);
        int i173 = i167 ^ i172;
        int i174 = i167 & i172;
        int i175 = -(-(((i174 & i173) | (i173 ^ i174)) * ReturnCode.ERR_REPOSITORY));
        int i176 = (i162 | i175) << 1;
        int i177 = -((i175 & (~i162)) | ((~i175) & i162));
        int i178 = (i176 & i177) + (i177 | i176);
        int i179 = ~iIntValue;
        int i180 = i179 & i157;
        int i181 = ((i179 | i157) & (~i180)) | i180;
        int i182 = ~i181;
        int i183 = compoundDrawableTintBlendMode & iIntValue;
        int i184 = (~i183) & (compoundDrawableTintBlendMode | iIntValue);
        int i185 = ~((i184 & i183) | (i184 ^ i183));
        int i186 = i182 ^ i185;
        int i187 = i182 & i185;
        int i188 = ((i187 & i186) | (i186 ^ i187)) * (-950);
        int i189 = (i178 ^ i188) + ((i178 & i188) << 1);
        int i190 = ~((i164 ^ compoundDrawableTintBlendMode) | (i164 & compoundDrawableTintBlendMode));
        int i191 = (i157 & i164) | (iIntValue & i168);
        int i192 = i157 & iIntValue;
        int i193 = (i191 & i192) | (i191 ^ i192);
        int i194 = (i193 | (~i193)) & (~i193);
        int i195 = i190 & i194;
        int i196 = (i190 | i194) & (~i195);
        int i197 = (i189 - (~(-(-(((i196 & i195) | (i196 ^ i195)) * 950))))) - 1;
        int i198 = i197 * 702;
        int i199 = ((700 | i198) << 1) - (i198 ^ 700);
        int i200 = ~i197;
        int i201 = (~i200) * 701;
        int i202 = ((i199 ^ i201) | (i199 & i201)) << 1;
        int i203 = -(((~i201) & i199) | (i201 & (~i199)));
        int i204 = (i202 & i203) + (i202 | i203);
        int i205 = i197 * (-701);
        int i206 = i204 & i205;
        int i207 = (i205 | i204) & (~i206);
        int i208 = i206 << 1;
        bArr2[(i200 * 701) + (i207 & i208) + (i208 | i207)] = 0;
        int i209 = i157 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY;
        int i210 = compoundDrawableTintBlendMode * (-520);
        int i211 = i209 & i210;
        int i212 = ((i209 ^ i210) | i211) << 1;
        int i213 = -((i209 | i210) & (~i211));
        int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
        int i215 = i164 | compoundDrawableTintBlendMode;
        int i216 = (i215 | (~i215)) & (~i215);
        int i217 = i157 ^ i216;
        int i218 = i216 & i157;
        int i219 = -(~(((i218 & i217) | (i217 ^ i218)) * (-1042)));
        int i220 = ((i214 | i219) << 1) - (i219 ^ i214);
        int i221 = (i220 ^ (-1)) + (i220 << 1);
        int i222 = compoundDrawableTintBlendMode ^ iIntValue;
        int i223 = ((i222 & i183) | (i222 ^ i183)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
        int i224 = i221 ^ i223;
        int i225 = (((i221 & i223) | i224) << 1) - i224;
        int i226 = ~i157;
        int i227 = ~compoundDrawableTintBlendMode;
        int i228 = i226 & i227;
        int i229 = (i227 | i226) & (~i228);
        int i230 = (i229 & i228) | (i229 ^ i228);
        int i231 = (i230 | (~i230)) & (~i230);
        int i232 = (i157 | i168) & i226;
        int i233 = ~((i232 & iIntValue) | (i232 ^ iIntValue));
        int i234 = ((~i233) & i231) | ((~i231) & i233);
        int i235 = i233 & i231;
        int i236 = (i235 & i234) | (i234 ^ i235);
        int i237 = ~((i181 & compoundDrawableTintBlendMode) | (i181 ^ compoundDrawableTintBlendMode));
        int i238 = ((~i237) & i236) | ((~i236) & i237);
        int i239 = i236 & i237;
        int i240 = ((i239 & i238) | (i238 ^ i239)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
        System.arraycopy(bArr, iIntValue, bArr2, ((((~i240) & i225) | ((~i225) & i240)) - (~((i240 & i225) << 1))) - 1, iIntValue2);
        byte[] onFocusChangeListener = amdVar.f53191b.setOnFocusChangeListener(bArr2, 0, compoundDrawableTintBlendMode);
        int i241 = f53188h;
        int i242 = i241 & 119;
        int i243 = (i241 ^ 119) | i242;
        int i244 = (i242 ^ i243) + ((i243 & i242) << 1);
        f53189i = i244 % 128;
        int i245 = i244 % 2;
        return onFocusChangeListener;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
        int i14 = (~i11) | i10;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | i11) * 216) + ((i14 | i15) * (-216)) + i13;
        int i17 = 2;
        switch (i16) {
            case 1:
                return h(objArr);
            case 2:
                return f(objArr);
            case 3:
                return c(objArr);
            case 4:
                return b(objArr);
            case 5:
                return a(objArr);
            case 6:
                byte[] bArr2 = (byte[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i18 = f53189i;
                int i19 = ((i18 ^ 84) + ((i18 & 84) << 1)) - 1;
                int i20 = i19 % 128;
                f53188h = i20;
                int i21 = i19 % 2;
                byte b10 = bArr2[0];
                int i22 = b10 & (-3);
                int i23 = (~b10) & 2;
                int i24 = (i23 & i22) | (i22 ^ i23);
                int length = bArr2.length;
                int i25 = iIntValue * (-756);
                int i26 = 758 & i25;
                int i27 = ((758 ^ i25) | i26) << 1;
                int i28 = -((i25 | 758) & (~i26));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                int i30 = ~iIntValue;
                int i31 = i30 & 1;
                int i32 = ((i30 ^ 1) | i31) * (-757);
                int i33 = ((~i32) & i29) | ((~i29) & i32);
                int i34 = -(-((i29 & i32) << 1));
                int i35 = (i33 & i34) + (i34 | i33);
                int i36 = ~i30;
                int i37 = (i30 & (-2)) | (i36 & 1);
                int i38 = (i37 & i31) | (i37 ^ i31);
                int i39 = (i38 & i30) | ((~i38) & iIntValue);
                int i40 = i38 & iIntValue;
                int i41 = -(-((~((i40 & i39) | (i39 ^ i40))) * 1514));
                int i42 = ((i35 ^ i41) - (~((i41 & i35) << 1))) - 1;
                int i43 = (i30 | iIntValue) & i30;
                int i44 = ~(((-2) & i43) | ((-2) ^ i43));
                int i45 = i36 & i30;
                int i46 = i45 | i45 | (i30 & i30);
                int i47 = ~i46;
                int i48 = (i46 | i47) & i47;
                int i49 = i44 ^ i48;
                int i50 = i44 & i48;
                int i51 = (i50 & i49) | (i49 ^ i50);
                int i52 = i31 | (iIntValue & (-2));
                int i53 = iIntValue & 1;
                int i54 = (i52 & i53) | (i52 ^ i53);
                int i55 = (i54 & i30) | ((~i54) & iIntValue);
                int i56 = i54 & iIntValue;
                int i57 = ~((i56 & i55) | (i55 ^ i56));
                int i58 = i51 ^ i57;
                int i59 = i51 & i57;
                int i60 = ((i59 & i58) | (i58 ^ i59)) * 757;
                int i61 = i42 & i60;
                int i62 = -(-((i60 ^ i42) | i61));
                int i63 = -((i61 ^ i62) + ((i62 & i61) << 1));
                int i64 = (length | i63) << 1;
                int i65 = -(((~length) & i63) | ((~i63) & length));
                int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
                int i67 = i20 & 85;
                int i68 = i67 + ((i20 ^ 85) | i67);
                f53189i = i68 % 128;
                int i69 = i68 % 2;
                int i70 = 1;
                while (i70 < i66) {
                    int i71 = f53188h;
                    int i72 = (i71 & 121) + (i71 | 121);
                    f53189i = i72 % 128;
                    int i73 = i72 % i17;
                    byte b11 = bArr2[i70];
                    int i74 = b11 >> 1;
                    int i75 = (b11 & i74) | ((~i74) & b11) | ((~b11) & i74);
                    int i76 = i75 >> 2;
                    int i77 = ((~i76) & i75) | ((~i75) & i76);
                    int i78 = i75 & i76;
                    int i79 = (i78 & i77) | (i77 ^ i78);
                    int i80 = i79 >> 4;
                    int i81 = i79 & i80;
                    int i82 = (i79 | i80) & (~i81);
                    int i83 = ((i82 & i81) | (i82 ^ i81)) & 1;
                    int i84 = i83 * (-112);
                    int i85 = 112 ^ i84;
                    int i86 = (((i84 & 112) | i85) << 1) - i85;
                    int i87 = ~i83;
                    int i88 = i87 & i30;
                    int i89 = (~i88) & (i87 | i30);
                    int i90 = ~(i89 | i88);
                    int i91 = -(~((((-1) ^ i90) | i90) * 226));
                    int i92 = (((i86 | i91) << 1) - (i91 ^ i86)) - 1;
                    int i93 = (i89 ^ i88) | (i88 & i89);
                    int i94 = (~i93) | i93;
                    int i95 = ~i94;
                    int i96 = (i93 | ((i94 | i95) & i95)) * (-113);
                    int i97 = ((((~i96) & i92) | ((~i92) & i96)) - (~((i92 & i96) << 1))) - 1;
                    int i98 = (i87 | i83) & i87;
                    int i99 = (i98 & i30) | ((~i98) & iIntValue);
                    int i100 = i98 & iIntValue;
                    int i101 = -(~((~((i100 & i99) | (i99 ^ i100))) * 113));
                    int i102 = (i97 ^ i101) + ((i101 & i97) << 1);
                    int i103 = (i102 ^ (-1)) + (i102 << 1);
                    int i104 = ((~i103) & i24) | ((~i24) & i103);
                    int i105 = i24 & i103;
                    i24 = (i105 & i104) | (i104 ^ i105);
                    int i106 = i70 ^ 1;
                    int i107 = (i70 & 1) << 1;
                    i70 = (i106 & i107) + (i106 | i107);
                    int i108 = i71 & 101;
                    int i109 = (i71 ^ 101) | i108;
                    int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
                    f53189i = i110 % 128;
                    int i111 = i110 % 2;
                    i17 = 2;
                }
                int length2 = bArr2.length;
                int i112 = -(-(iIntValue | 1));
                int i113 = -((i53 ^ i112) + ((i112 & i53) << 1));
                int i114 = i113 * 934;
                int i115 = -(-(length2 * (-932)));
                int i116 = i114 & i115;
                int i117 = -(-((i114 ^ i115) | i116));
                int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                int i119 = ~length2;
                int i120 = ~i113;
                int i121 = i120 & (i120 | i113);
                int i122 = ~((i43 & i121) | (i121 ^ i43));
                int i123 = ((~i122) & i119) | ((~i119) & i122);
                int i124 = i122 & i119;
                int i125 = -(-(((i124 & i123) | (i123 ^ i124)) * (-933)));
                int i126 = i118 & i125;
                int i127 = -(-(i118 | i125));
                int i128 = (i126 & i127) + (i127 | i126);
                int i129 = ~(i119 | i30);
                int i130 = ~((i119 & i113) | (i119 ^ i113));
                int i131 = i129 & i130;
                int i132 = -(-((((i130 | i129) & (~i131)) | i131) * 933));
                int i133 = ((i128 | i132) << 1) - (i132 ^ i128);
                int i134 = i113 & length2;
                int i135 = (i113 | length2) & (~i134);
                int i136 = (i135 & i134) | (i135 ^ i134);
                int i137 = ~i136;
                int i138 = -(-(((i136 | i137) & i137) * 933));
                byte b12 = bArr2[(i133 ^ i138) + ((i138 & i133) << 1)];
                int i139 = (b12 & i24) | ((~b12) & i24) | ((~i24) & b12);
                int i140 = i139 >> 1;
                int i141 = i139 ^ i140;
                int i142 = i139 & i140;
                int i143 = (i142 & i141) | (i141 ^ i142);
                int i144 = i143 >> 2;
                int i145 = (i143 & i144) | (i143 ^ i144);
                int i146 = i145 >> 4;
                int i147 = i145 ^ i146;
                int i148 = i145 & i146;
                int i149 = ((i148 & i147) | (i147 ^ i148)) & 1;
                int i150 = -(-((i149 ^ (-1)) | i149));
                int i151 = ~((i149 ^ i150) + ((i149 & i150) << 1));
                int i152 = f53189i;
                int i153 = i152 & 21;
                int i154 = (i152 ^ 21) | i153;
                int i155 = (i153 & i154) + (i154 | i153);
                f53188h = i155 % 128;
                int i156 = i155 % 2;
                return Integer.valueOf(i151);
            case 7:
                amd amdVar = (amd) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int i157 = f53189i;
                int i158 = (((i157 | 14) << 1) - (i157 ^ 14)) - 1;
                f53188h = i158 % 128;
                int i159 = i158 % 2;
                if (!(!amdVar.f53192c)) {
                    int i160 = i157 + 114;
                    int i161 = (i160 ^ (-1)) + (i160 << 1);
                    f53188h = i161 % 128;
                    int i162 = i161 % 2;
                    bArr = (byte[]) setOnFocusChangeListener(new Object[]{amdVar, bArr3, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, 1936234848, -1936234847, iIntValue2);
                    int i163 = f53188h;
                    int i164 = i163 & 99;
                    int i165 = (i163 | 99) & (~i164);
                    int i166 = -(-(i164 << 1));
                    int i167 = (i165 & i166) + (i165 | i166);
                    f53189i = i167 % 128;
                    int i168 = i167 % 2;
                } else {
                    bArr = (byte[]) setOnFocusChangeListener(new Object[]{amdVar, bArr3, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, 611628059, -611628055, iIntValue2);
                    int i169 = f53189i;
                    int i170 = i169 ^ 17;
                    int i171 = ((i169 & 17) | i170) << 1;
                    int i172 = -i170;
                    int i173 = (i171 & i172) + (i171 | i172);
                    f53188h = i173 % 128;
                    if (i173 % 2 != 0) {
                        throw null;
                    }
                }
                return bArr;
            case 8:
                d(objArr);
                return null;
            case 9:
                return e();
            default:
                return g(objArr);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1787140013, 1787140015, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final void setX(boolean z10, akk akkVar) {
        setOnFocusChangeListener(new Object[]{this, Boolean.valueOf(z10), akkVar}, 1259002355, -1259002347, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final byte[] setOnFocusChangeListener(byte[] bArr, int i10, int i11) throws akx {
        return (byte[]) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1554540088, 1554540095, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1841444133, -1841444133, System.identityHashCode(this))).intValue();
    }
}
