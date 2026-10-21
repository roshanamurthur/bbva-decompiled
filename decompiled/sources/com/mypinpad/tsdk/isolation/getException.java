package com.mypinpad.tsdk.isolation;

import java.io.Closeable;
import kotlin.random.Random;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class getException implements Closeable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55840r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55841s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public byte[] f55842p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public byte[] f55843q0;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i10 | i14)) * 69) + (((~(i11 | i12)) | (~(i13 | i12)) | (~(i13 | i11))) * (-69)) + (((~(i13 | i14 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70);
        if (i15 == 1) {
            getException getexception = (getException) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i16 = f55840r0 + 7;
            int i17 = i16 % 128;
            f55841s0 = i17;
            int i18 = i16 % 2;
            getexception.f55843q0 = bArr;
            if (i18 == 0) {
                int i19 = 22 / 0;
            }
            int i20 = i17 & 89;
            int i21 = ((i17 ^ 89) | i20) << 1;
            int i22 = -((~i20) & (i17 | 89));
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            f55840r0 = i23 % 128;
            if (i23 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i15 == 2) {
            getException getexception2 = (getException) objArr[0];
            byte[] bArr2 = (byte[]) objArr[1];
            int i24 = f55840r0;
            int i25 = ((i24 ^ 19) - (~(-(-((i24 & 19) << 1))))) - 1;
            f55841s0 = i25 % 128;
            int i26 = i25 % 2;
            getexception2.f55842p0 = bArr2;
            if (i26 == 0) {
                throw null;
            }
            int i27 = i24 & 111;
            int i28 = (~i27) & (i24 | 111);
            int i29 = -(-(i27 << 1));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            f55841s0 = i30 % 128;
            if (i30 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i15 != 3) {
            getException getexception3 = (getException) objArr[0];
            int i31 = f55841s0;
            int i32 = (i31 & (-16)) | ((~i31) & 15);
            int i33 = -(-((i31 & 15) << 1));
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            f55840r0 = i34 % 128;
            if (i34 % 2 == 0) {
                return getexception3.f55843q0;
            }
            byte[] bArr3 = getexception3.f55843q0;
            throw null;
        }
        getException getexception4 = (getException) objArr[0];
        int i35 = f55841s0;
        int i36 = i35 & 37;
        int i37 = (i35 | 37) & (~i36);
        int i38 = i36 << 1;
        int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
        int i40 = i39 % 128;
        f55840r0 = i40;
        if (i39 % 2 != 0) {
            byte[] bArr4 = getexception4.f55842p0;
            throw null;
        }
        byte[] bArr5 = getexception4.f55842p0;
        int i41 = i40 & 113;
        int i42 = (i40 | 113) & (~i41);
        int i43 = -(-(i41 << 1));
        int i44 = (i42 & i43) + (i43 | i42);
        f55841s0 = i44 % 128;
        if (i44 % 2 != 0) {
            return bArr5;
        }
        int i45 = 92 / 0;
        return bArr5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            System.identityHashCode(this);
            System.identityHashCode(this);
            byte[] bArr = this.f55842p0;
            if (bArr != null) {
                int i10 = f55841s0;
                int i11 = ((i10 ^ 13) | (i10 & 13)) << 1;
                int i12 = -(((~i10) & 13) | (i10 & (-14)));
                int i13 = (i11 & i12) + (i12 | i11);
                f55840r0 = i13 % 128;
                int i14 = i13 % 2;
                Random.INSTANCE.nextBytes(bArr);
                int i15 = f55841s0;
                int i16 = i15 & 119;
                int i17 = (i15 | 119) & (~i16);
                int i18 = i16 << 1;
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                f55840r0 = i19 % 128;
                int i20 = i19 % 2;
            }
            this.f55842p0 = null;
            byte[] bArr2 = this.f55843q0;
            if (bArr2 != null) {
                int i21 = f55841s0;
                int i22 = (((i21 | 21) << 1) - (~(-(((~i21) & 21) | (i21 & (-22)))))) - 1;
                f55840r0 = i22 % 128;
                if (i22 % 2 != 0) {
                    Random.INSTANCE.nextBytes(bArr2);
                    throw null;
                }
                Random.INSTANCE.nextBytes(bArr2);
                int i23 = f55841s0;
                int i24 = (i23 & (-18)) | ((~i23) & 17);
                int i25 = -(-((i23 & 17) << 1));
                int i26 = (i24 & i25) + (i25 | i24);
                f55840r0 = i26 % 128;
                int i27 = i26 % 2;
            }
            this.f55843q0 = null;
            int i28 = f55840r0 + 33;
            f55841s0 = i28 % 128;
            int i29 = i28 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setDividerPadding(@Nullable byte[] bArr) {
        setOnFocusChangeListener(new Object[]{this, bArr}, 261874175, -261874173, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setOnDragListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 885016662, -885016662, System.identityHashCode(this));
    }

    public final void setX(@Nullable byte[] bArr) {
        setOnFocusChangeListener(new Object[]{this, bArr}, -1064812153, 1064812154, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1066057972, -1066057969, System.identityHashCode(this));
    }
}
