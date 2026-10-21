package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class av {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53935d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53936e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f53937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f53938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f53939c;

    public av(byte b10, byte b11, boolean z10) {
        this.f53937a = b10;
        this.f53938b = b11;
        this.f53939c = z10;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((~(i13 | i11)) * 2748) + (i11 * 917) + (i10 * (-1831));
        int i15 = i13 | (~i11);
        int i16 = (((~(i10 | i11)) | (~i15)) * 916) + (i15 * (-916)) + i14;
        if (i16 == 1) {
            av avVar = (av) objArr[0];
            int i17 = f53936e;
            int i18 = (i17 ^ 99) + ((i17 & 99) << 1);
            f53935d = i18 % 128;
            int i19 = i18 % 2;
            boolean z10 = avVar.f53939c;
            if (i19 != 0) {
                throw null;
            }
            int i20 = (i17 & (-62)) | ((~i17) & 61);
            int i21 = (i17 & 61) << 1;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f53935d = i22 % 128;
            if (i22 % 2 == 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        if (i16 == 2) {
            av avVar2 = (av) objArr[0];
            int i23 = f53935d + 71;
            f53936e = i23 % 128;
            int i24 = i23 % 2;
            byte b10 = avVar2.f53937a;
            if (i24 != 0) {
                return Byte.valueOf(b10);
            }
            throw null;
        }
        av avVar3 = (av) objArr[0];
        int i25 = f53935d;
        int i26 = i25 & 65;
        int i27 = i25 | 65;
        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
        f53936e = i28 % 128;
        int i29 = i28 % 2;
        byte b11 = avVar3.f53938b;
        if (i29 == 0) {
            throw null;
        }
        int i30 = i25 & 37;
        int i31 = (((i25 | 37) & (~i30)) - (~(-(-(i30 << 1))))) - 1;
        f53936e = i31 % 128;
        if (i31 % 2 != 0) {
            return Byte.valueOf(b11);
        }
        throw null;
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setY(new Object[]{this}, -1890498550, 1890498551, System.identityHashCode(this))).booleanValue();
    }

    public final byte setOnFocusChangeListener() {
        return ((Byte) setY(new Object[]{this}, 1262930435, -1262930433, System.identityHashCode(this))).byteValue();
    }

    public final byte setY() {
        return ((Byte) setY(new Object[]{this}, -888174800, 888174800, System.identityHashCode(this))).byteValue();
    }
}
