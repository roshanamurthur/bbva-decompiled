package org.bouncycastle.crypto.prng.drbg;

import androidx.camera.core.impl.utils.b;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.math.BigInteger;
import java.util.Hashtable;
import km.a;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class DualECSP800DRBG implements SP80090DRBG {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final DualECPoints[] f89468l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f89469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f89470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EntropySource f89471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ECPoint f89475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ECPoint f89476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f89477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f89478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FixedPointCombMultiplier f89479k;

    static {
        f89468l = new DualECPoints[]{new DualECPoints(128, fp.createPoint(new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16), new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16)), fp.createPoint(new BigInteger("c97445f45cdef9f0d3e05e1e585fc297235b82b5be8ff3efca67c59852018192", 16), new BigInteger("b28ef557ba31dfcbdd21ac46e2a91e3c304f44cb87058ada2cb815151e610046", 16)), 1), new DualECPoints(192, fp.createPoint(new BigInteger("aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", 16), new BigInteger("3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f", 16)), fp.createPoint(new BigInteger("8e722de3125bddb05580164bfe20b8b432216a62926c57502ceede31c47816edd1e89769124179d0b695106428815065", 16), new BigInteger("023b1660dd701d0839fd45eec36f9ee7b32e13b315dc02610aa1b636e346df671f790f84c5e09b05674dbb7e45c803dd", 16)), 1), new DualECPoints(256, fp.createPoint(new BigInteger("c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", 16), new BigInteger("11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650", 16)), fp.createPoint(new BigInteger("1b9fa3e518d683c6b65763694ac8efbaec6fab44f2276171a42726507dd08add4c3b3f4c1ebc5b1222ddba077f722943b24c3edfa0f85fe24d0c8c01591f0be6f63", 16), new BigInteger("1f3bdba585295d9a1110d1df1f9430ef8442c5018976ff3437ef91b81dc0b8132c8d5c39c32d0e004a3092b7d327c0e7a4d26d2c7b69b58f9066652911e457779de", 16)), 1)};
        ECCurve.Fp fp = (ECCurve.Fp) NISTNamedCurves.getByName("P-256").getCurve();
        ECCurve.Fp fp2 = (ECCurve.Fp) NISTNamedCurves.getByName("P-384").getCurve();
        ECCurve.Fp fp3 = (ECCurve.Fp) NISTNamedCurves.getByName("P-521").getCurve();
    }

    public DualECSP800DRBG(Digest digest, int i10, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this(f89468l, digest, i10, entropySource, bArr, bArr2);
    }

    public final BigInteger a(ECPoint eCPoint, BigInteger bigInteger) {
        return this.f89479k.multiply(eCPoint, bigInteger).normalize().getAffineXCoord().toBigInteger();
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z10) {
        BigInteger bigInteger;
        ECPoint eCPoint;
        ECPoint eCPoint2;
        int length = bArr.length * 8;
        int length2 = bArr.length;
        int i10 = this.f89474f;
        int i11 = length2 / i10;
        Hashtable hashtable = a.f79375a;
        if (bArr2 != null && bArr2.length > 512) {
            throw new IllegalArgumentException("Additional input too large");
        }
        if (this.f89470b + ((long) i11) > SvgConstantsKt.SPECIFIED_SOLID_COLOR) {
            return -1;
        }
        if (z10) {
            reseed(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            byte[] bArrA = a.a(this.f89469a, this.f89473e, bArr2);
            byte[] bArr3 = this.f89477i;
            int length3 = bArr3.length;
            byte[] bArr4 = new byte[length3];
            for (int i12 = 0; i12 != length3; i12++) {
                bArr4[i12] = (byte) (bArr3[i12] ^ bArrA[i12]);
            }
            bigInteger = new BigInteger(1, bArr4);
        } else {
            bigInteger = new BigInteger(1, this.f89477i);
        }
        Arrays.fill(bArr, (byte) 0);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            eCPoint = this.f89476h;
            eCPoint2 = this.f89475g;
            if (i13 >= i11) {
                break;
            }
            bigInteger = a(eCPoint2, bigInteger);
            byte[] byteArray = a(eCPoint, bigInteger).toByteArray();
            if (byteArray.length > i10) {
                System.arraycopy(byteArray, byteArray.length - i10, bArr, i14, i10);
            } else {
                System.arraycopy(byteArray, 0, bArr, (i10 - byteArray.length) + i14, byteArray.length);
            }
            i14 += i10;
            this.f89470b++;
            i13++;
        }
        if (i14 < bArr.length) {
            bigInteger = a(eCPoint2, bigInteger);
            byte[] byteArray2 = a(eCPoint, bigInteger).toByteArray();
            int length4 = bArr.length - i14;
            if (byteArray2.length > i10) {
                System.arraycopy(byteArray2, byteArray2.length - i10, bArr, i14, length4);
            } else {
                System.arraycopy(byteArray2, 0, bArr, (i10 - byteArray2.length) + i14, length4);
            }
            this.f89470b++;
        }
        this.f89477i = BigIntegers.asUnsignedByteArray(this.f89478j, a(eCPoint2, bigInteger));
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this.f89474f * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        Hashtable hashtable = a.f79375a;
        if (bArr != null && bArr.length > 512) {
            throw new IllegalArgumentException("Additional input string too large");
        }
        byte[] entropy = this.f89471c.getEntropy();
        if (entropy.length < (this.f89472d + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] bArr2 = this.f89477i;
        int i10 = this.f89473e;
        int i11 = i10 % 8;
        if (i11 != 0) {
            int i12 = 8 - i11;
            int length = bArr2.length - 1;
            int i13 = 0;
            while (length >= 0) {
                int i14 = bArr2[length] & 255;
                bArr2[length] = (byte) ((i13 >> (8 - i12)) | (i14 << i12));
                length--;
                i13 = i14;
            }
        }
        this.f89477i = a.a(this.f89469a, i10, Arrays.concatenate(bArr2, entropy, bArr));
        this.f89470b = 0L;
    }

    public DualECSP800DRBG(DualECPoints[] dualECPointsArr, Digest digest, int i10, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this.f89479k = new FixedPointCombMultiplier();
        this.f89469a = digest;
        this.f89471c = entropySource;
        this.f89472d = i10;
        Hashtable hashtable = a.f79375a;
        if (bArr != null && bArr.length > 512) {
            throw new IllegalArgumentException("Personalization string too large");
        }
        if (entropySource.entropySize() < i10 || entropySource.entropySize() > 4096) {
            throw new IllegalArgumentException(b.a("EntropySource must provide between ", i10, " and 4096 bits"));
        }
        byte[] entropy = this.f89471c.getEntropy();
        if (entropy.length < (this.f89472d + 7) / 8) {
            throw new IllegalStateException("Insufficient entropy provided by entropy source");
        }
        byte[] bArrConcatenate = Arrays.concatenate(entropy, bArr2, bArr);
        for (int i11 = 0; i11 != dualECPointsArr.length; i11++) {
            if (i10 <= dualECPointsArr[i11].getSecurityStrength()) {
                if (((Integer) a.f79375a.get(digest.getAlgorithmName())).intValue() < dualECPointsArr[i11].getSecurityStrength()) {
                    throw new IllegalArgumentException("Requested security strength is not supported by digest");
                }
                this.f89473e = dualECPointsArr[i11].getSeedLen();
                this.f89474f = dualECPointsArr[i11].getMaxOutlen() / 8;
                this.f89475g = dualECPointsArr[i11].getP();
                this.f89476h = dualECPointsArr[i11].getQ();
                break;
            }
        }
        if (this.f89475g == null) {
            throw new IllegalArgumentException("security strength cannot be greater than 256 bits");
        }
        byte[] bArrA = a.a(this.f89469a, this.f89473e, bArrConcatenate);
        this.f89477i = bArrA;
        this.f89478j = bArrA.length;
        this.f89470b = 0L;
    }
}
