package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getVersion {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55985d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55986e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f55987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final byte[] f55988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final byte[] f55989c;

    public getVersion(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull byte[] bArr, @Nullable byte[] bArr2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f55987a = str2;
        this.f55988b = bArr;
        this.f55989c = bArr2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        int i22 = ((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19;
        if (i22 == 1) {
            getVersion getversion = (getVersion) objArr[0];
            int i23 = f55985d;
            int i24 = i23 & 47;
            int i25 = (i23 ^ 47) | i24;
            int i26 = (i24 & i25) + (i24 | i25);
            f55986e = i26 % 128;
            int i27 = i26 % 2;
            String str = getversion.f55987a;
            int i28 = i23 & 39;
            int i29 = ((((i23 ^ 39) | i28) << 1) - (~(-((i23 | 39) & (~i28))))) - 1;
            f55986e = i29 % 128;
            int i30 = i29 % 2;
            return str;
        }
        if (i22 != 2) {
            getVersion getversion2 = (getVersion) objArr[0];
            int i31 = f55985d;
            int i32 = i31 + 43;
            f55986e = i32 % 128;
            int i33 = i32 % 2;
            byte[] bArr = getversion2.f55989c;
            int i34 = i31 ^ 7;
            int i35 = ((i31 & 7) | i34) << 1;
            int i36 = -i34;
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            f55986e = i37 % 128;
            if (i37 % 2 != 0) {
                return bArr;
            }
            throw null;
        }
        getVersion getversion3 = (getVersion) objArr[0];
        int i38 = f55986e;
        int i39 = (-2) - (((i38 & 20) + (i38 | 20)) ^ (-1));
        int i40 = i39 % 128;
        f55985d = i40;
        int i41 = i39 % 2;
        byte[] bArr2 = getversion3.f55988b;
        if (i41 != 0) {
            throw null;
        }
        int i42 = (i40 & (-78)) | ((~i40) & 77);
        int i43 = (i40 & 77) << 1;
        int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
        f55986e = i44 % 128;
        int i45 = i44 % 2;
        return bArr2;
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setY(new Object[]{this}, 2113315019, -2113315018, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setY(new Object[]{this}, -439025673, 439025673, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setX() {
        return (byte[]) setY(new Object[]{this}, 1968945348, -1968945346, System.identityHashCode(this));
    }
}
