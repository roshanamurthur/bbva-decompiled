package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class qm implements setLabelFor {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57886r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57887s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f57888p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final UUID f57889q0;

    public qm(@NotNull String str, @NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        this.f57888p0 = str;
        this.f57889q0 = uuid;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-667)) + (i10 * (-1335));
        int i14 = ~i11;
        int i15 = i10 | i12;
        if (((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13 == 1) {
            qm qmVar = (qm) objArr[0];
            int i16 = f57886r0;
            int i17 = i16 + 3;
            f57887s0 = i17 % 128;
            int i18 = i17 % 2;
            String str = qmVar.f57888p0;
            int i19 = i16 & 79;
            int i20 = (i16 | 79) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            f57887s0 = i22 % 128;
            int i23 = i22 % 2;
            return str;
        }
        qm qmVar2 = (qm) objArr[0];
        int i24 = f57887s0;
        int i25 = i24 & 111;
        int i26 = ((~i25) & (i24 | 111)) + (i25 << 1);
        f57886r0 = i26 % 128;
        int i27 = i26 % 2;
        UUID uuid = qmVar2.f57889q0;
        if (i27 != 0) {
            throw null;
        }
        int i28 = ((((i24 ^ 9) | (i24 & 9)) << 1) - (~(-(((~i24) & 9) | (i24 & (-10)))))) - 1;
        f57886r0 = i28 % 128;
        if (i28 % 2 == 0) {
            return uuid;
        }
        int i29 = 91 / 0;
        return uuid;
    }

    @NotNull
    public final String setDividerPadding() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 909734442, -909734441, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setOnFocusChangeListener() {
        return (UUID) setCompoundDrawableTintBlendMode(new Object[]{this}, -572824441, 572824441, System.identityHashCode(this));
    }
}
