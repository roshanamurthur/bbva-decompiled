package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setImeOptions extends getMetadata {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59854c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f59855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setImeOptions(char c10, @NotNull mv mvVar) {
        super(mvVar, null);
        Intrinsics.checkNotNullParameter(mvVar, "");
        this.f59855b = c10;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        setImeOptions setimeoptions = (setImeOptions) objArr[0];
        int i13 = f59854c;
        int i14 = ((i13 ^ 95) - (~(-(-((i13 & 95) << 1))))) - 1;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        char c10 = setimeoptions.f59855b;
        if (i16 == 0) {
            throw null;
        }
        int i17 = (-2) - (((i15 ^ 108) + ((i15 & 108) << 1)) ^ (-1));
        f59854c = i17 % 128;
        if (i17 % 2 == 0) {
            return Character.valueOf(c10);
        }
        throw null;
    }

    public final char setCompoundDrawableTintBlendMode() {
        return ((Character) setY(new Object[]{this}, -1113749997, 1113749997, System.identityHashCode(this))).charValue();
    }
}
