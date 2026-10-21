package com.mypinpad.tsdk.isolation;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.mypinpad.tsdk.i.do, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f55230a;

    /* JADX WARN: Multi-variable type inference failed */
    public Cdo(@Nullable byte[] bArr) {
        if (bArr != null) {
            this.f55230a = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(1, bArr[0]));
        } else {
            throw new fh(39, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((Cdo) objArr[0]).f55230a;
    }

    @Nullable
    public byte[] setOnFocusChangeListener() {
        return null;
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 2022768723, -2022768723, System.identityHashCode(this));
    }
}
