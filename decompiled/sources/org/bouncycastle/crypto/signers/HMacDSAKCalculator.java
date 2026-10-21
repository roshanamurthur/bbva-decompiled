package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class HMacDSAKCalculator implements DSAKCalculator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f89544e = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HMac f89545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BigInteger f89548d;

    public HMacDSAKCalculator(Digest digest) {
        HMac hMac = new HMac(digest);
        this.f89545a = hMac;
        this.f89547c = new byte[hMac.getMacSize()];
        this.f89546b = new byte[hMac.getMacSize()];
    }

    public final BigInteger a(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.f89548d.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.f89548d.bitLength()) : bigInteger;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f89548d = bigInteger;
        byte[] bArr2 = this.f89547c;
        Arrays.fill(bArr2, (byte) 1);
        byte[] bArr3 = this.f89546b;
        Arrays.fill(bArr3, (byte) 0);
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(bigInteger);
        byte[] bArr4 = new byte[unsignedByteLength];
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(bigInteger2);
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr4, unsignedByteLength - bArrAsUnsignedByteArray.length, bArrAsUnsignedByteArray.length);
        byte[] bArr5 = new byte[unsignedByteLength];
        BigInteger bigIntegerA = a(bArr);
        if (bigIntegerA.compareTo(bigInteger) >= 0) {
            bigIntegerA = bigIntegerA.subtract(bigInteger);
        }
        byte[] bArrAsUnsignedByteArray2 = BigIntegers.asUnsignedByteArray(bigIntegerA);
        System.arraycopy(bArrAsUnsignedByteArray2, 0, bArr5, unsignedByteLength - bArrAsUnsignedByteArray2.length, bArrAsUnsignedByteArray2.length);
        KeyParameter keyParameter = new KeyParameter(bArr3);
        HMac hMac = this.f89545a;
        hMac.init(keyParameter);
        hMac.update(bArr2, 0, bArr2.length);
        hMac.update((byte) 0);
        hMac.update(bArr4, 0, unsignedByteLength);
        hMac.update(bArr5, 0, unsignedByteLength);
        hMac.doFinal(bArr3, 0);
        hMac.init(new KeyParameter(bArr3));
        hMac.update(bArr2, 0, bArr2.length);
        hMac.doFinal(bArr2, 0);
        hMac.update(bArr2, 0, bArr2.length);
        hMac.update((byte) 1);
        hMac.update(bArr4, 0, unsignedByteLength);
        hMac.update(bArr5, 0, unsignedByteLength);
        hMac.doFinal(bArr3, 0);
        hMac.init(new KeyParameter(bArr3));
        hMac.update(bArr2, 0, bArr2.length);
        hMac.doFinal(bArr2, 0);
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public boolean isDeterministic() {
        return true;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public BigInteger nextK() {
        byte[] bArr;
        HMac hMac;
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(this.f89548d);
        byte[] bArr2 = new byte[unsignedByteLength];
        while (true) {
            int i10 = 0;
            while (true) {
                bArr = this.f89547c;
                hMac = this.f89545a;
                if (i10 >= unsignedByteLength) {
                    break;
                }
                hMac.update(bArr, 0, bArr.length);
                hMac.doFinal(bArr, 0);
                int iMin = Math.min(unsignedByteLength - i10, bArr.length);
                System.arraycopy(bArr, 0, bArr2, i10, iMin);
                i10 += iMin;
            }
            BigInteger bigIntegerA = a(bArr2);
            if (bigIntegerA.compareTo(f89544e) > 0 && bigIntegerA.compareTo(this.f89548d) < 0) {
                return bigIntegerA;
            }
            hMac.update(bArr, 0, bArr.length);
            hMac.update((byte) 0);
            byte[] bArr3 = this.f89546b;
            hMac.doFinal(bArr3, 0);
            hMac.init(new KeyParameter(bArr3));
            hMac.update(bArr, 0, bArr.length);
            hMac.doFinal(bArr, 0);
        }
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }
}
