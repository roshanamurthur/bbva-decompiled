package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class xj extends we {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61860r0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final sa f61861q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(@NotNull sa saVar) {
        super(wf.setY, null);
        Intrinsics.checkNotNullParameter(saVar, "");
        this.f61861q0 = saVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        xj xjVar = (xj) objArr[0];
        int i13 = f61860r0;
        int i14 = i13 & 31;
        int i15 = (i13 ^ 31) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        sa saVar = xjVar.f61861q0;
        if (i18 == 0) {
            throw null;
        }
        int i19 = i17 & 105;
        int i20 = i17 | 105;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        f61860r0 = i21 % 128;
        int i22 = i21 % 2;
        return saVar;
    }

    @NotNull
    public final sa setY() {
        return (sa) setX(new Object[]{this}, -449852101, 449852101, System.identityHashCode(this));
    }
}
