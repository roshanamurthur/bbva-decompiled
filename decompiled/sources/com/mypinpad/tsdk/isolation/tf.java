package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class tf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61050c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final sw f61051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final rl f61052b;

    public tf(@Nullable sw swVar, @Nullable rl rlVar) {
        this.f61051a = swVar;
        this.f61052b = rlVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~i12;
        if ((((~(i11 | i17)) | (~(i12 | i15)) | i13) * 988) + (((~(i10 | i17)) | i16) * (-1976)) + i14 != 1) {
            tf tfVar = (tf) objArr[0];
            int i18 = f61050c;
            int i19 = i18 + 69;
            int i20 = i19 % 128;
            int i21 = i19 % 2;
            rl rlVar = tfVar.f61052b;
            int i22 = i18 + 22;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            int i24 = i23 % 128;
            if (i23 % 2 == 0) {
                return rlVar;
            }
            throw null;
        }
        tf tfVar2 = (tf) objArr[0];
        int i25 = f61050c;
        int i26 = i25 | 77;
        int i27 = ((i26 << 1) - (~(-((~(i25 & 77)) & i26)))) - 1;
        int i28 = i27 % 128;
        int i29 = i27 % 2;
        sw swVar = tfVar2.f61051a;
        int i30 = (i28 & (-92)) | ((~i28) & 91);
        int i31 = -(-((i28 & 91) << 1));
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        f61050c = i32 % 128;
        int i33 = i32 % 2;
        return swVar;
    }

    @Nullable
    public final sw setY() {
        return (sw) setCompoundDrawableTintBlendMode(new Object[]{this}, -1108495435, 1108495436, System.identityHashCode(this));
    }

    @Nullable
    public final rl setCompoundDrawableTintBlendMode() {
        return (rl) setCompoundDrawableTintBlendMode(new Object[]{this}, 2138050046, -2138050046, System.identityHashCode(this));
    }
}
