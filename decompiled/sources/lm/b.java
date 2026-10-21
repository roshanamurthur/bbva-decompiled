package lm;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f83223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83224b = 0;

    public b(byte[] bArr) {
        this.f83223a = bArr;
    }

    public final BigInteger a() {
        int iC = c();
        int i10 = this.f83224b;
        int i11 = i10 + iC;
        byte[] bArr = this.f83223a;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        int i12 = iC + i10;
        this.f83224b = i12;
        return new BigInteger(1, Arrays.copyOfRange(bArr, i10, i12));
    }

    public final byte[] b() {
        int iC = c();
        if (iC == 0) {
            return new byte[0];
        }
        int i10 = this.f83224b;
        byte[] bArr = this.f83223a;
        if (i10 > bArr.length - iC) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i11 = iC + i10;
        this.f83224b = i11;
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public final int c() {
        int i10 = this.f83224b;
        byte[] bArr = this.f83223a;
        if (i10 > bArr.length - 4) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        int i11 = i10 + 3;
        int i12 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        this.f83224b = i10 + 4;
        return (bArr[i11] & 255) | i12;
    }

    public final void d() {
        int iC = c();
        int i10 = this.f83224b;
        if (i10 > this.f83223a.length - iC) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.f83224b = i10 + iC;
    }

    public b(byte[] bArr, byte[] bArr2) {
        this.f83223a = bArr2;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.f83224b += bArr.length;
    }
}
