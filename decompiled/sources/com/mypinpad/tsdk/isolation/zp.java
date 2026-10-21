package com.mypinpad.tsdk.isolation;

import ak.b;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class zp extends RuntimeException {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f62431r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final IOException f62432p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public IOException f62433q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(@NotNull IOException iOException) {
        super(iOException);
        Intrinsics.checkNotNullParameter(iOException, "");
        this.f62432p0 = iOException;
        this.f62433q0 = iOException;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-657)) + (i10 * 659);
        int i14 = ~((~i10) | i11);
        int i15 = ~((~i11) | i10);
        int i16 = ~(i10 | i12);
        int i17 = ((i14 | i15 | i16) * (-658)) + i13;
        int i18 = ((i16 | i15) * 658) + (i15 * 658) + i17;
        if (i18 == 1) {
            zp zpVar = (zp) objArr[0];
            int i19 = f62431r0;
            int i20 = (((i19 | 96) << 1) - (i19 ^ 96)) - 1;
            int i21 = i20 % 128;
            int i22 = i20 % 2;
            IOException iOException = zpVar.f62433q0;
            if (i22 == 0) {
                int i23 = 38 / 0;
            }
            int i24 = ((i21 | 101) << 1) - (i21 ^ 101);
            f62431r0 = i24 % 128;
            if (i24 % 2 == 0) {
                return iOException;
            }
            throw null;
        }
        if (i18 != 2) {
            zp zpVar2 = (zp) objArr[0];
            int i25 = f62431r0;
            int i26 = ((i25 & (-6)) | ((~i25) & 5)) + ((i25 & 5) << 1);
            int i27 = i26 % 128;
            if (i26 % 2 != 0) {
                return zpVar2.f62432p0;
            }
            IOException iOException2 = zpVar2.f62432p0;
            throw null;
        }
        zp zpVar3 = (zp) objArr[0];
        IOException iOException3 = (IOException) objArr[1];
        int i28 = f62431r0 + 55;
        int i29 = i28 % 128;
        if (i28 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iOException3, "");
            b.addSuppressed(zpVar3.f62432p0, iOException3);
            zpVar3.f62433q0 = iOException3;
            int i30 = 79 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iOException3, "");
            b.addSuppressed(zpVar3.f62432p0, iOException3);
            zpVar3.f62433q0 = iOException3;
        }
        int i31 = f62431r0;
        int i32 = i31 & 73;
        int i33 = -(-(i31 | 73));
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        int i35 = i34 % 128;
        if (i34 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void setDividerPadding(@NotNull IOException iOException) {
        setY(new Object[]{this, iOException}, -1858279822, 1858279824, System.identityHashCode(this));
    }

    @NotNull
    public final IOException setOnFocusChangeListener() {
        return (IOException) setY(new Object[]{this}, -1143255038, 1143255039, System.identityHashCode(this));
    }

    @NotNull
    public final IOException setDividerPadding() {
        return (IOException) setY(new Object[]{this}, 1666256193, -1666256193, System.identityHashCode(this));
    }
}
