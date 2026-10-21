package org.bouncycastle.crypto.engines;

import androidx.appcompat.widget.c;
import androidx.camera.camera2.internal.compat.u;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SM2Engine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f88582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mode f88583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ECKeyParameters f88585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ECDomainParameters f88586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SecureRandom f88588g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode C1C2C3;
        public static final Mode C1C3C2;

        static {
            Mode mode = new Mode("C1C2C3", 0);
            C1C2C3 = mode;
            Mode mode2 = new Mode("C1C3C2", 1);
            C1C3C2 = mode2;
            $VALUES = new Mode[]{mode, mode2};
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88589a;

        static {
            int[] iArr = new int[Mode.values().length];
            f88589a = iArr;
            try {
                iArr[Mode.C1C3C2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SM2Engine() {
        this(new SM3Digest());
    }

    public final void a(Digest digest, ECFieldElement eCFieldElement) {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.f88587f, eCFieldElement.toBigInteger());
        digest.update(bArrAsUnsignedByteArray, 0, bArrAsUnsignedByteArray.length);
    }

    public final void b(Digest digest, ECPoint eCPoint, byte[] bArr) {
        Memoable memoable;
        Memoable memoableCopy;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        if (digest instanceof Memoable) {
            a(digest, eCPoint.getAffineXCoord());
            a(digest, eCPoint.getAffineYCoord());
            memoable = (Memoable) digest;
            memoableCopy = memoable.copy();
        } else {
            memoable = null;
            memoableCopy = null;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            if (memoable != null) {
                memoable.reset(memoableCopy);
            } else {
                a(digest, eCPoint.getAffineXCoord());
                a(digest, eCPoint.getAffineYCoord());
            }
            i11++;
            Pack.intToBigEndian(i11, bArr2, 0);
            digest.update(bArr2, 0, 4);
            digest.doFinal(bArr2, 0);
            int iMin = Math.min(digestSize, bArr.length - i10);
            for (int i12 = 0; i12 != iMin; i12++) {
                int i13 = i10 + i12;
                bArr[i13] = (byte) (bArr[i13] ^ bArr2[i12]);
            }
            i10 += iMin;
        }
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public int getOutputSize(int i10) {
        return this.f88582a.getDigestSize() + u.b(this.f88587f, 2, 1, i10);
    }

    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f88584c = z10;
        if (z10) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            ECKeyParameters eCKeyParameters = (ECKeyParameters) parametersWithRandom.getParameters();
            this.f88585d = eCKeyParameters;
            this.f88586e = eCKeyParameters.getParameters();
            if (((ECPublicKeyParameters) this.f88585d).getQ().multiply(this.f88586e.getH()).isInfinity()) {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.f88588g = parametersWithRandom.getRandom();
        } else {
            ECKeyParameters eCKeyParameters2 = (ECKeyParameters) cipherParameters;
            this.f88585d = eCKeyParameters2;
            this.f88586e = eCKeyParameters2.getParameters();
        }
        this.f88587f = (this.f88586e.getCurve().getFieldSize() + 7) / 8;
    }

    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        int i12;
        BigInteger bigIntegerCreateRandomBigInteger;
        byte[] encoded;
        ECPoint eCPointNormalize;
        boolean z10 = this.f88584c;
        Mode mode = this.f88583b;
        Digest digest = this.f88582a;
        if (z10) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
            loop0: while (true) {
                int iBitLength = this.f88586e.getN().bitLength();
                while (true) {
                    bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.f88588g);
                    if (!bigIntegerCreateRandomBigInteger.equals(BigIntegers.ZERO) && bigIntegerCreateRandomBigInteger.compareTo(this.f88586e.getN()) < 0) {
                        break;
                    }
                }
                encoded = eCMultiplierCreateBasePointMultiplier.multiply(this.f88586e.getG(), bigIntegerCreateRandomBigInteger).normalize().getEncoded(false);
                eCPointNormalize = ((ECPublicKeyParameters) this.f88585d).getQ().multiply(bigIntegerCreateRandomBigInteger).normalize();
                b(digest, eCPointNormalize, bArr2);
                for (int i13 = 0; i13 != i11; i13++) {
                    if (bArr2[i13] != bArr[i10 + i13]) {
                        break loop0;
                    }
                }
            }
            byte[] bArr3 = new byte[digest.getDigestSize()];
            a(digest, eCPointNormalize.getAffineXCoord());
            digest.update(bArr, i10, i11);
            a(digest, eCPointNormalize.getAffineYCoord());
            digest.doFinal(bArr3, 0);
            return a.f88589a[mode.ordinal()] != 1 ? Arrays.concatenate(encoded, bArr2, bArr3) : Arrays.concatenate(encoded, bArr3, bArr2);
        }
        int i14 = (this.f88587f * 2) + 1;
        byte[] bArr4 = new byte[i14];
        System.arraycopy(bArr, i10, bArr4, 0, i14);
        ECPoint eCPointDecodePoint = this.f88586e.getCurve().decodePoint(bArr4);
        if (eCPointDecodePoint.multiply(this.f88586e.getH()).isInfinity()) {
            throw new InvalidCipherTextException("[h]C1 at infinity");
        }
        ECPoint eCPointNormalize2 = eCPointDecodePoint.multiply(((ECPrivateKeyParameters) this.f88585d).getD()).normalize();
        int digestSize = digest.getDigestSize();
        int i15 = (i11 - i14) - digestSize;
        byte[] bArr5 = new byte[i15];
        Mode mode2 = Mode.C1C3C2;
        if (mode == mode2) {
            System.arraycopy(bArr, i10 + i14 + digestSize, bArr5, 0, i15);
        } else {
            System.arraycopy(bArr, i10 + i14, bArr5, 0, i15);
        }
        b(digest, eCPointNormalize2, bArr5);
        int digestSize2 = digest.getDigestSize();
        byte[] bArr6 = new byte[digestSize2];
        a(digest, eCPointNormalize2.getAffineXCoord());
        digest.update(bArr5, 0, i15);
        a(digest, eCPointNormalize2.getAffineYCoord());
        digest.doFinal(bArr6, 0);
        if (mode == mode2) {
            i12 = 0;
            for (int i16 = 0; i16 != digestSize2; i16++) {
                i12 |= bArr6[i16] ^ bArr[(i10 + i14) + i16];
            }
        } else {
            i12 = 0;
            for (int i17 = 0; i17 != digestSize2; i17++) {
                i12 |= bArr6[i17] ^ bArr[c.a(i10, i14, i15, i17)];
            }
        }
        Arrays.fill(bArr4, (byte) 0);
        Arrays.fill(bArr6, (byte) 0);
        if (i12 == 0) {
            return bArr5;
        }
        Arrays.fill(bArr5, (byte) 0);
        throw new InvalidCipherTextException("invalid cipher text");
    }

    public SM2Engine(Digest digest) {
        this(digest, Mode.C1C2C3);
    }

    public SM2Engine(Digest digest, Mode mode) {
        if (mode == null) {
            throw new IllegalArgumentException("mode cannot be NULL");
        }
        this.f88582a = digest;
        this.f88583b = mode;
    }

    public SM2Engine(Mode mode) {
        this(new SM3Digest(), mode);
    }
}
