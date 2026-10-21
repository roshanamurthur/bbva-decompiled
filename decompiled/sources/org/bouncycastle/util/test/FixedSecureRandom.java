package org.bouncycastle.util.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Provider;
import java.security.SecureRandom;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class FixedSecureRandom extends SecureRandom {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final boolean f91667r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final boolean f91668s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f91669t0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f91670p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f91671q0;

    public static class BigInteger extends Source {
        public BigInteger(int i10, String str) {
            super(FixedSecureRandom.a(i10, Hex.decode(str)));
        }

        public BigInteger(int i10, byte[] bArr) {
            super(FixedSecureRandom.a(i10, bArr));
        }

        public BigInteger(String str) {
            this(Hex.decode(str));
        }

        public BigInteger(byte[] bArr) {
            super(bArr);
        }
    }

    public static class Data extends Source {
        public Data(byte[] bArr) {
            super(bArr);
        }
    }

    public static class Source {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f91672a;

        public Source(byte[] bArr) {
            this.f91672a = bArr;
        }
    }

    public static class a extends Provider {
        public a() {
            super("BCFIPS_FIXED_RNG", 1.0d, "BCFIPS Fixed Secure Random Provider");
        }
    }

    public static class b extends SecureRandom {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final byte[] f91673p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f91674q0;

        public b() {
            super(null, new a());
            this.f91673p0 = Hex.decode("01020304ffffffff0506070811111111");
            this.f91674q0 = 0;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public final void nextBytes(byte[] bArr) {
            System.arraycopy(this.f91673p0, this.f91674q0, bArr, 0, bArr.length);
            this.f91674q0 += bArr.length;
        }
    }

    static {
        java.math.BigInteger bigInteger = new java.math.BigInteger("01020304ffffffff0506070811111111", 16);
        java.math.BigInteger bigInteger2 = new java.math.BigInteger("1111111105060708ffffffff01020304", 16);
        java.math.BigInteger bigInteger3 = new java.math.BigInteger("3020104ffffffff05060708111111", 16);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger(128, new b());
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(120, new b());
        f91667r0 = bigInteger4.equals(bigInteger2);
        f91669t0 = bigInteger4.equals(bigInteger);
        f91668s0 = bigInteger5.equals(bigInteger3);
    }

    public FixedSecureRandom(byte[] bArr) {
        this(new Source[]{new Data(bArr)});
    }

    public static byte[] a(int i10, byte[] bArr) {
        int i11;
        int i12;
        int i13 = (i10 + 7) / 8;
        int length = bArr.length;
        boolean z10 = f91667r0;
        if (i13 > length) {
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, 0, bArr2, i13 - bArr.length, bArr.length);
            if (z10 && (i12 = i10 % 8) != 0) {
                Pack.intToBigEndian(Pack.bigEndianToInt(bArr2, 0) << (8 - i12), bArr2, 0);
            }
            return bArr2;
        }
        if (!z10 || i10 >= bArr.length * 8 || (i11 = i10 % 8) == 0) {
            return bArr;
        }
        Pack.intToBigEndian(Pack.bigEndianToInt(bArr, 0) << (8 - i11), bArr, 0);
        return bArr;
    }

    public final int b() {
        int i10 = this.f91671q0;
        this.f91671q0 = i10 + 1;
        return this.f91670p0[i10] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i10) {
        byte[] bArr = new byte[i10];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this.f91671q0 == this.f91670p0.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this.f91670p0, this.f91671q0, bArr, 0, bArr.length);
        this.f91671q0 += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        return (b() << 24) | (b() << 16) | (b() << 8) | b();
    }

    @Override // java.util.Random
    public long nextLong() {
        return (((long) b()) << 56) | (((long) b()) << 48) | (((long) b()) << 40) | (((long) b()) << 32) | (((long) b()) << 24) | (((long) b()) << 16) | (((long) b()) << 8) | ((long) b());
    }

    public FixedSecureRandom(Source[] sourceArr) {
        super(null, new a());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        if (!f91669t0) {
            if (!f91667r0) {
                throw new IllegalStateException("Unrecognized BigInteger implementation");
            }
            for (int i11 = 0; i11 != sourceArr.length; i11++) {
                try {
                    Source source = sourceArr[i11];
                    if (source instanceof BigInteger) {
                        byte[] bArr = source.f91672a;
                        int length = bArr.length - (bArr.length % 4);
                        int i12 = 0;
                        while (i12 < length) {
                            i12 += 4;
                            byteArrayOutputStream.write(bArr, bArr.length - i12, 4);
                        }
                        if (bArr.length - length != 0) {
                            for (int i13 = 0; i13 != 4 - (bArr.length - length); i13++) {
                                byteArrayOutputStream.write(0);
                            }
                        }
                        for (int i14 = 0; i14 != bArr.length - length; i14++) {
                            byteArrayOutputStream.write(bArr[length + i14]);
                        }
                    } else {
                        byteArrayOutputStream.write(source.f91672a);
                    }
                } catch (IOException unused) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else if (f91668s0) {
            while (i10 != sourceArr.length) {
                try {
                    Source source2 = sourceArr[i10];
                    if (source2 instanceof BigInteger) {
                        byte[] bArr2 = source2.f91672a;
                        int length2 = bArr2.length - (bArr2.length % 4);
                        for (int length3 = (bArr2.length - length2) - 1; length3 >= 0; length3--) {
                            byteArrayOutputStream.write(bArr2[length3]);
                        }
                        for (int length4 = bArr2.length - length2; length4 < bArr2.length; length4 += 4) {
                            byteArrayOutputStream.write(bArr2, length4, 4);
                        }
                    } else {
                        byteArrayOutputStream.write(source2.f91672a);
                    }
                    i10++;
                } catch (IOException unused2) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else {
            while (i10 != sourceArr.length) {
                try {
                    byteArrayOutputStream.write(sourceArr[i10].f91672a);
                    i10++;
                } catch (IOException unused3) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        }
        this.f91670p0 = byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FixedSecureRandom(byte[][] bArr) {
        Data[] dataArr = new Data[bArr.length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            dataArr[i10] = new Data(bArr[i10]);
        }
        this(dataArr);
    }
}
