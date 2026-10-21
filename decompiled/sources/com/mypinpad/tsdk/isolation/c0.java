package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements aco {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f54749p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54750q0 = 1;

    public static /* synthetic */ acq a(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
        int i13 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15 | i12);
        int i17 = ~i12;
        int i18 = i15 | i17;
        int i19 = (((~(i10 | i17)) | (~(i15 | i10)) | (~i18)) * 50) + ((i16 | (~(i18 | i10))) * 50) + i13;
        if (i19 == 1) {
            int i20 = f54749p0;
            int i21 = (i20 | 43) << 1;
            int i22 = -(i20 ^ 43);
            int i23 = (i21 & i22) + (i22 | i21);
            f54750q0 = i23 % 128;
            int i24 = i23 % 2;
            return null;
        }
        if (i19 == 2) {
            int i25 = f54750q0;
            int i26 = i25 & 1;
            int i27 = i26 + ((i25 ^ 1) | i26);
            f54749p0 = i27 % 128;
            int i28 = i27 % 2;
            return null;
        }
        if (i19 == 3) {
            abx abxVar = (abx) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            int i29 = f54750q0;
            int i30 = ((i29 | 119) << 1) - (i29 ^ 119);
            f54749p0 = i30 % 128;
            if (i30 % 2 != 0) {
                Intrinsics.checkNotNullParameter(abxVar, "");
                abx.setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(jLongValue)}, -1525846840, 1525846865, System.identityHashCode(abxVar));
                throw null;
            }
            Intrinsics.checkNotNullParameter(abxVar, "");
            abx.setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(jLongValue)}, -1525846840, 1525846865, System.identityHashCode(abxVar));
            int i31 = f54749p0 + 35;
            f54750q0 = i31 % 128;
            int i32 = i31 % 2;
            return null;
        }
        int i33 = f54750q0;
        int i34 = (i33 | 7) << 1;
        int i35 = -(i33 ^ 7);
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        f54749p0 = i36 % 128;
        int i37 = i36 % 2;
        acq acqVar = acq.setDividerPadding;
        if (i37 != 0) {
            int i38 = 56 / 0;
        }
        int i39 = f54750q0;
        int i40 = i39 & 5;
        int i41 = i39 | 5;
        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
        f54749p0 = i42 % 128;
        if (i42 % 2 == 0) {
            return acqVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws NoSuchAlgorithmException, IOException {
        a(new Object[]{this}, 898380852, -898380851, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Flushable
    public final void flush() throws NoSuchAlgorithmException, IOException {
        a(new Object[]{this}, 209201093, -209201091, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    public final void setDividerPadding(@NotNull abx abxVar, long j10) throws NoSuchAlgorithmException, IOException {
        a(new Object[]{this, abxVar, Long.valueOf(j10)}, -306363371, 306363374, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    @NotNull
    public final acq setY() {
        return a(new Object[]{this}, -68928609, 68928609, System.identityHashCode(this));
    }
}
