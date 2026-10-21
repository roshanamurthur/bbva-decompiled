package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class vk extends vr {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61559r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61560s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ri f61561p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final qw f61562q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(@NotNull ri riVar, @Nullable qw qwVar) {
        super(null);
        Intrinsics.checkNotNullParameter(riVar, "");
        this.f61561p0 = riVar;
        this.f61562q0 = qwVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167)) != 1) {
            vk vkVar = (vk) objArr[0];
            int i18 = f61559r0 + 113;
            int i19 = i18 % 128;
            f61560s0 = i19;
            int i20 = i18 % 2;
            ri riVar = vkVar.f61561p0;
            int i21 = i19 + 49;
            f61559r0 = i21 % 128;
            int i22 = i21 % 2;
            return riVar;
        }
        vk vkVar2 = (vk) objArr[0];
        int i23 = f61560s0;
        int i24 = i23 + 51;
        f61559r0 = i24 % 128;
        int i25 = i24 % 2;
        qw qwVar = vkVar2.f61562q0;
        int i26 = (i23 & 17) + (i23 | 17);
        f61559r0 = i26 % 128;
        if (i26 % 2 == 0) {
            return qwVar;
        }
        throw null;
    }

    @Nullable
    public final qw setOnFocusChangeListener() {
        return (qw) setY(new Object[]{this}, 805179712, -805179711, System.identityHashCode(this));
    }

    @NotNull
    public final ri setX() {
        return (ri) setY(new Object[]{this}, -404755490, 404755490, System.identityHashCode(this));
    }
}
