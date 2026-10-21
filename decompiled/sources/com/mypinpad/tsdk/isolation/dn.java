package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55225d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55226e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f55227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f55228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<String> f55229c;

    public dn(@NotNull byte[] bArr, byte b10, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f55227a = bArr;
        this.f55228b = b10;
        this.f55229c = list;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 591) + (i10 * (-589));
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (~(i14 | i10)) | (~(i14 | i15)) | (~(i15 | i10));
        int i17 = ~i10;
        int i18 = (((~(i17 | i15)) | (~(i11 | i15))) * 590) + (i16 * (-1180)) + (((~(i12 | i17 | i11)) | i16) * 590) + i13;
        if (i18 == 1) {
            dn dnVar = (dn) objArr[0];
            int i19 = (-2) - ((f55225d + 38) ^ (-1));
            int i20 = i19 % 128;
            f55226e = i20;
            int i21 = i19 % 2;
            byte b10 = dnVar.f55228b;
            if (i21 == 0) {
                int i22 = 14 / 0;
            }
            int i23 = i20 & 53;
            int i24 = (~i23) & (i20 | 53);
            int i25 = i23 << 1;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f55225d = i26 % 128;
            if (i26 % 2 == 0) {
                return Byte.valueOf(b10);
            }
            throw null;
        }
        if (i18 != 2) {
            dn dnVar2 = (dn) objArr[0];
            int i27 = f55226e;
            int i28 = (((i27 | 100) << 1) - (i27 ^ 100)) - 1;
            f55225d = i28 % 128;
            int i29 = i28 % 2;
            List<String> list = dnVar2.f55229c;
            if (i29 != 0) {
                throw null;
            }
            int i30 = i27 & 29;
            int i31 = ((i27 | 29) & (~i30)) + (i30 << 1);
            f55225d = i31 % 128;
            int i32 = i31 % 2;
            return list;
        }
        dn dnVar3 = (dn) objArr[0];
        int i33 = f55226e;
        int i34 = i33 | 125;
        int i35 = i34 << 1;
        int i36 = -((~(i33 & 125)) & i34);
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        int i38 = i37 % 128;
        f55225d = i38;
        int i39 = i37 % 2;
        byte[] bArr = dnVar3.f55227a;
        int i40 = i38 + 59;
        f55226e = i40 % 128;
        if (i40 % 2 != 0) {
            return bArr;
        }
        int i41 = 1 / 0;
        return bArr;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, -1393450637, 1393450639, System.identityHashCode(this));
    }

    public final byte setDividerPadding() {
        return ((Byte) setY(new Object[]{this}, -558820173, 558820174, System.identityHashCode(this))).byteValue();
    }

    @NotNull
    public final List<String> setX() {
        return (List) setY(new Object[]{this}, -858994576, 858994576, System.identityHashCode(this));
    }
}
