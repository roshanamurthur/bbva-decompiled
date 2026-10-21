package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class st extends sr {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f60917s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60918t0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f60919q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final String f60920r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.f60919q0 = str2;
        this.f60920r0 = str3;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (~i12) | i13;
        int i15 = (((~i14) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i16 = ~i10;
        if (((~(i13 | i12)) * 113) + (((~(i10 | i14)) | (~(i11 | i16)) | (~(i16 | i12))) * (-113)) + i15 == 1) {
            st stVar = (st) objArr[0];
            int i17 = f60918t0;
            int i18 = ((i17 | 67) << 1) - (i17 ^ 67);
            f60917s0 = i18 % 128;
            int i19 = i18 % 2;
            String str = stVar.f60919q0;
            System.identityHashCode(stVar);
            System.identityHashCode(stVar);
            return str;
        }
        st stVar2 = (st) objArr[0];
        int i20 = f60917s0;
        int i21 = i20 & 39;
        int i22 = i21 + ((i20 ^ 39) | i21);
        int i23 = i22 % 128;
        f60918t0 = i23;
        int i24 = i22 % 2;
        String str2 = stVar2.f60920r0;
        int i25 = i23 & 29;
        int i26 = (((i23 | 29) & (~i25)) - (~(i25 << 1))) - 1;
        f60917s0 = i26 % 128;
        if (i26 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1827932406, -1827932405, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1813715722, 1813715722, System.identityHashCode(this));
    }
}
