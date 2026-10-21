package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class op {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57526b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UUID f57527a;

    public op(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "");
        this.f57527a = uuid;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~i12;
        if ((((~(i11 | i17)) | (~(i12 | i15)) | i13) * 988) + (((~(i10 | i17)) | i16) * (-1976)) + i14 == 1) {
            op opVar = (op) objArr[0];
            int i18 = f57526b;
            int i19 = ((i18 | 35) << 1) - (i18 ^ 35);
            int i20 = i19 % 128;
            int i21 = i19 % 2;
            String string = opVar.f57527a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i22 = f57526b;
            int i23 = ((i22 ^ 8) + ((i22 & 8) << 1)) - 1;
            int i24 = i23 % 128;
            int i25 = i23 % 2;
            return string;
        }
        op opVar2 = (op) objArr[0];
        int i26 = f57526b + 89;
        int i27 = i26 % 128;
        int i28 = i26 % 2;
        UUID uuid = opVar2.f57527a;
        if (i28 != 0) {
            throw null;
        }
        int i29 = i27 & 25;
        int i30 = ((i27 | 25) & (~i29)) + (i29 << 1);
        f57526b = i30 % 128;
        int i31 = i30 % 2;
        return uuid;
    }

    @NotNull
    public final UUID setOnFocusChangeListener() {
        return (UUID) setX(new Object[]{this}, 917018311, -917018311, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -1172310448, 1172310449, System.identityHashCode(this));
    }
}
