package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 extends OutputStream {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54242q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54243r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Signature f54244p0;

    public static /* synthetic */ void a(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13 = ~((~i10) | (~i11));
        int i14 = ~i12;
        int i15 = ((i13 | (~(i14 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829);
        int i16 = i10 | i11;
        int i17 = ((~i16) * 828) + ((i16 | i14) * (-828)) + i15;
        if (i17 == 1) {
            b1 b1Var = (b1) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            int i18 = f54242q0;
            int i19 = i18 & 17;
            int i20 = (i19 - (~((i18 ^ 17) | i19))) - 1;
            f54243r0 = i20 % 128;
            try {
                if (i20 % 2 != 0) {
                    b1Var.f54244p0.update(bArr, iIntValue, iIntValue2);
                    return;
                } else {
                    b1Var.f54244p0.update(bArr, iIntValue, iIntValue2);
                    throw null;
                }
            } catch (SignatureException e5) {
                throw ((IOException) beo.setCompoundDrawableTintBlendMode(new Object[]{e5.getMessage(), e5}, -175138791, 175138791, (int) System.currentTimeMillis()));
            }
        }
        if (i17 == 2) {
            b1 b1Var2 = (b1) objArr[0];
            int iIntValue3 = ((Number) objArr[1]).intValue();
            int i21 = f54243r0;
            int i22 = i21 & 85;
            int i23 = (i22 - (~((i21 ^ 85) | i22))) - 1;
            f54242q0 = i23 % 128;
            try {
                if (i23 % 2 == 0) {
                    b1Var2.f54244p0.update((byte) iIntValue3);
                    return;
                } else {
                    b1Var2.f54244p0.update((byte) iIntValue3);
                    throw null;
                }
            } catch (SignatureException e7) {
                throw ((IOException) beo.setCompoundDrawableTintBlendMode(new Object[]{e7.getMessage(), e7}, -175138791, 175138791, (int) System.currentTimeMillis()));
            }
        }
        b1 b1Var3 = (b1) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int i24 = f54243r0;
        int i25 = (i24 ^ 61) + ((i24 & 61) << 1);
        f54242q0 = i25 % 128;
        try {
            if (i25 % 2 != 0) {
                b1Var3.f54244p0.update(bArr2);
                throw null;
            }
            b1Var3.f54244p0.update(bArr2);
            int i26 = f54242q0;
            int i27 = (i26 ^ 93) + ((i26 & 93) << 1);
            f54243r0 = i27 % 128;
            int i28 = i27 % 2;
        } catch (SignatureException e10) {
            throw ((IOException) beo.setCompoundDrawableTintBlendMode(new Object[]{e10.getMessage(), e10}, -175138791, 175138791, (int) System.currentTimeMillis()));
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        a(new Object[]{this, Integer.valueOf(i10)}, 1898028257, -1898028255, i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        a(new Object[]{this, bArr}, 2109967418, -2109967418, System.identityHashCode(this));
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        a(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 228351912, -228351911, i10);
    }
}
