package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f56592f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56593g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f56594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f56595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aky f56596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56598e;

    public j2(byte[] bArr, byte[] bArr2, aky akyVar) {
        this.f56594a = bArr;
        this.f56595b = bArr2;
        this.f56596c = akyVar;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
        int i14 = (~i12) | i10;
        int i15 = (((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13;
        if (i15 != 1) {
            bArr = null;
            if (i15 == 2) {
                j2 j2Var = (j2) objArr[0];
                int i16 = f56593g;
                int i17 = i16 ^ 75;
                int i18 = ((i16 & 75) | i17) << 1;
                int i19 = -i17;
                int i20 = (i18 & i19) + (i19 | i18);
                f56592f = i20 % 128;
                if (i20 % 2 != 0) {
                    j2Var.f56598e = 1;
                } else {
                    j2Var.f56598e = 0;
                }
                int i21 = i16 + 97;
                f56592f = i21 % 128;
                int i22 = i21 % 2;
            } else if (i15 != 3) {
                j2 j2Var2 = (j2) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i23 = f56593g + 93;
                f56592f = i23 % 128;
                int i24 = i23 % 2;
                a(new Object[]{j2Var2, bArr2, 23}, -616914097, 616914098, 23);
                if (!(!zBooleanValue)) {
                    int i25 = f56593g;
                    int i26 = (-2) - ((-1) ^ (((i25 | 96) << 1) - (i25 ^ 96)));
                    f56592f = i26 % 128;
                    if (i26 % 2 != 0) {
                        j2Var2.f56598e = j2Var2.f56598e;
                    } else {
                        int i27 = j2Var2.f56598e;
                        j2Var2.f56598e = (((i27 ^ 1) | (i27 & 1)) << 1) - (((~i27) & 1) | (i27 & (-2)));
                    }
                    int i28 = i25 + 37;
                    f56592f = i28 % 128;
                    int i29 = i28 % 2;
                }
                int i30 = f56593g;
                int i31 = ((i30 | 87) << 1) - (i30 ^ 87);
                f56592f = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 36 / 0;
                }
            } else {
                j2 j2Var3 = (j2) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i33 = f56593g;
                int i34 = (i33 | 63) << 1;
                int i35 = -(i33 ^ 63);
                int i36 = (i34 & i35) + (i34 | i35);
                f56592f = i36 % 128;
                int i37 = i36 % 2;
                j2Var3.f56597d = iIntValue;
                if (i37 != 0) {
                    int i38 = 10 / 0;
                }
            }
        } else {
            j2 j2Var4 = (j2) objArr[0];
            bArr = (byte[]) objArr[1];
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int i39 = f56592f;
            int i40 = i39 & 7;
            int i41 = ((((i39 ^ 7) | i40) << 1) - (~(-((i39 | 7) & (~i40))))) - 1;
            f56593g = i41 % 128;
            int i42 = i41 % 2;
            int length = bArr.length;
            int i43 = length * 503;
            int i44 = (((~i43) & 11523) | (i43 & (-11524))) + ((i43 & 11523) << 1);
            int i45 = ~length;
            int i46 = ~iIntValue2;
            int i47 = ~i45;
            int i48 = (i45 & i46) | (iIntValue2 & i47);
            int i49 = i45 & iIntValue2;
            int i50 = ~((i48 & i49) | (i48 ^ i49));
            int i51 = ~((-23) | length);
            int i52 = i50 & i51;
            int i53 = (~i52) & (i50 | i51);
            int i54 = -(-(((i53 & i52) | (i53 ^ i52)) * (-502)));
            int i55 = i44 & i54;
            int i56 = i54 | i44;
            int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
            int i58 = (i46 | iIntValue2) & i46;
            int i59 = ((~i58) & i45) | (i58 & i47);
            int i60 = i58 & i45;
            int i61 = (i60 & i59) | (i59 ^ i60);
            int i62 = (~((i61 & (-23)) | (i61 & 22) | ((~i61) & (-23)))) * (-502);
            int i63 = ((i57 | i62) << 1) - (i62 ^ i57);
            int i64 = (i45 | length) & i45;
            int i65 = 22 ^ iIntValue2;
            int i66 = iIntValue2 & 22;
            int i67 = ~((i66 & i65) | (i65 ^ i66));
            int i68 = i64 ^ i67;
            int i69 = i64 & i67;
            int i70 = -(-(((i69 & i68) | (i68 ^ i69)) * 502));
            int i71 = i63 & i70;
            int i72 = (i70 | i63) & (~i71);
            int i73 = -(-(i71 << 1));
            if (((i72 | i73) << 1) - (i72 ^ i73) < j2Var4.f56596c.setY()) {
                throw new IllegalArgumentException("target length is less than digest size.");
            }
            byte[] bArr3 = j2Var4.f56594a;
            int length2 = bArr3.length;
            aky akyVar = j2Var4.f56596c;
            akyVar.setCompoundDrawableTintBlendMode(bArr3, 0, length2);
            akyVar.setX((byte) (j2Var4.f56597d >>> 24));
            akyVar.setX((byte) (j2Var4.f56597d >>> 16));
            akyVar.setX((byte) (j2Var4.f56597d >>> 8));
            akyVar.setX((byte) j2Var4.f56597d);
            akyVar.setX((byte) (j2Var4.f56598e >>> 8));
            akyVar.setX((byte) j2Var4.f56598e);
            akyVar.setX((byte) -1);
            byte[] bArr4 = j2Var4.f56595b;
            akyVar.setCompoundDrawableTintBlendMode(bArr4, 0, bArr4.length);
            akyVar.setCompoundDrawableTintBlendMode(bArr, 23);
            int i74 = f56593g;
            int i75 = i74 & 51;
            int i76 = i75 + ((i74 ^ 51) | i75);
            f56592f = i76 % 128;
            int i77 = i76 % 2;
        }
        return bArr;
    }
}
