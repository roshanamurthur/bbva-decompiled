package com.mypinpad.tsdk.isolation;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class vg extends wi {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final UUID f61551r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final byte[] f61552s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(@NotNull UUID uuid, @NotNull byte[] bArr) {
        super(wm.setCompoundDrawableTintBlendMode, null);
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f61551r0 = uuid;
        this.f61552s0 = bArr;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        return ((~(i16 | i12)) * 345) + ((((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + ((((~i16) | (~(i14 | i12))) * 345) + i13)) != 1 ? ((vg) objArr[0]).f61552s0 : ((vg) objArr[0]).f61551r0;
    }

    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setY(new Object[]{this}, 1982432842, -1982432842, System.identityHashCode(this));
    }

    @NotNull
    public final UUID setY() {
        return (UUID) setY(new Object[]{this}, -2092834334, 2092834335, System.identityHashCode(this));
    }
}
