package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setForegroundTintBlendMode {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59744c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59745d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f59746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UUID f59747b;

    public setForegroundTintBlendMode(@NotNull byte[] bArr, @NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        this.f59746a = bArr;
        this.f59747b = uuid;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-712)) + (i10 * 714);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = (~(i14 | i11)) | (~(i14 | i15));
        int i17 = ~i11;
        int i18 = ~(i10 | i17 | i12);
        int i19 = ((i16 | i18) * (-713)) + i13;
        if (((~(i17 | i15)) * 713) + (i18 * 1426) + i19 == 1) {
            setForegroundTintBlendMode setforegroundtintblendmode = (setForegroundTintBlendMode) objArr[0];
            int i20 = f59744c;
            int i21 = (i20 & (-80)) | ((~i20) & 79);
            int i22 = -(-((i20 & 79) << 1));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            int i24 = i23 % 128;
            f59745d = i24;
            int i25 = i23 % 2;
            UUID uuid = setforegroundtintblendmode.f59747b;
            int i26 = ((i24 & 76) + (i24 | 76)) - 1;
            f59744c = i26 % 128;
            if (i26 % 2 == 0) {
                return uuid;
            }
            throw null;
        }
        setForegroundTintBlendMode setforegroundtintblendmode2 = (setForegroundTintBlendMode) objArr[0];
        int i27 = f59745d;
        int i28 = (i27 & 43) + (i27 | 43);
        int i29 = i28 % 128;
        f59744c = i29;
        int i30 = i28 % 2;
        byte[] bArr = setforegroundtintblendmode2.f59746a;
        int i31 = i29 & 15;
        int i32 = ((i29 ^ 15) | i31) << 1;
        int i33 = -((i29 | 15) & (~i31));
        int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
        f59745d = i34 % 128;
        int i35 = i34 % 2;
        return bArr;
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 555968326, -555968326, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setY() {
        return (UUID) setCompoundDrawableTintBlendMode(new Object[]{this}, -428723424, 428723425, System.identityHashCode(this));
    }
}
