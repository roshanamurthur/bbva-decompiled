package org.bouncycastle.crypto.engines;

import androidx.core.view.InputDeviceCompat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class EthereumIESEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicAgreement f88409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DerivationFunction f88410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mac f88411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedBlockCipher f88412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CipherParameters f88415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CipherParameters f88416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IESParameters f88417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f88418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EphemeralKeyPairGenerator f88419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public KeyParser f88420l;
    public byte[] m;

    public static class HandshakeKDFFunction implements DigestDerivationFunction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Digest f88422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f88423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f88424d;

        public HandshakeKDFFunction(int i10, Digest digest) {
            this.f88421a = i10;
            this.f88422b = digest;
        }

        @Override // org.bouncycastle.crypto.DerivationFunction
        public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
            int i12 = i11;
            int i13 = i10;
            if (bArr.length - i12 < i13) {
                throw new OutputLengthException("output buffer too small");
            }
            long j10 = i12;
            Digest digest = this.f88422b;
            int digestSize = digest.getDigestSize();
            if (j10 > 8589934591L) {
                throw new IllegalArgumentException("output length too large");
            }
            long j11 = digestSize;
            int i14 = (int) (((j10 + j11) - 1) / j11);
            byte[] bArr2 = new byte[digest.getDigestSize()];
            int i15 = 4;
            byte[] bArr3 = new byte[4];
            int i16 = this.f88421a;
            Pack.intToBigEndian(i16, bArr3, 0);
            int i17 = i16 & InputDeviceCompat.SOURCE_ANY;
            int i18 = 0;
            while (i18 < i14) {
                digest.update(bArr3, 0, i15);
                byte[] bArr4 = this.f88423c;
                digest.update(bArr4, 0, bArr4.length);
                byte[] bArr5 = this.f88424d;
                if (bArr5 != null) {
                    digest.update(bArr5, 0, bArr5.length);
                }
                digest.doFinal(bArr2, 0);
                if (i12 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                    i13 += digestSize;
                    i12 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i13, i12);
                }
                byte b10 = (byte) (bArr3[3] + 1);
                bArr3[3] = b10;
                if (b10 == 0) {
                    i17 += 256;
                    Pack.intToBigEndian(i17, bArr3, 0);
                }
                i18++;
                i15 = 4;
            }
            digest.reset();
            return (int) j10;
        }

        @Override // org.bouncycastle.crypto.DigestDerivationFunction
        public Digest getDigest() {
            return this.f88422b;
        }

        @Override // org.bouncycastle.crypto.DerivationFunction
        public void init(DerivationParameters derivationParameters) {
            if (derivationParameters instanceof KDFParameters) {
                KDFParameters kDFParameters = (KDFParameters) derivationParameters;
                this.f88423c = kDFParameters.getSharedSecret();
                this.f88424d = kDFParameters.getIV();
            } else {
                if (!(derivationParameters instanceof ISO18033KDFParameters)) {
                    throw new IllegalArgumentException("KDF parameters required for generator");
                }
                this.f88423c = ((ISO18033KDFParameters) derivationParameters).getSeed();
                this.f88424d = null;
            }
        }
    }

    public EthereumIESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, byte[] bArr) {
        this.f88409a = basicAgreement;
        this.f88410b = derivationFunction;
        this.f88411c = mac;
        byte[] bArr2 = new byte[mac.getMacSize()];
        this.f88413e = bArr;
        this.f88412d = null;
    }

    public final byte[] a(int i10, int i11, byte[] bArr) throws InvalidCipherTextException {
        byte[] bArr2;
        int iProcessBytes;
        byte[] bArr3;
        int length = this.f88418j.length;
        Mac mac = this.f88411c;
        if (i11 < mac.getMacSize() + length) {
            throw new InvalidCipherTextException("length of input must be greater than the MAC and V combined");
        }
        DerivationFunction derivationFunction = this.f88410b;
        BufferedBlockCipher bufferedBlockCipher = this.f88412d;
        if (bufferedBlockCipher == null) {
            int length2 = (i11 - this.f88418j.length) - mac.getMacSize();
            byte[] bArr4 = new byte[length2];
            int macKeySize = this.f88417i.getMacKeySize() / 8;
            bArr3 = new byte[macKeySize];
            int i12 = length2 + macKeySize;
            byte[] bArr5 = new byte[i12];
            derivationFunction.generateBytes(bArr5, 0, i12);
            if (this.f88418j.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, length2);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, length2);
                System.arraycopy(bArr5, length2, bArr3, 0, macKeySize);
            }
            byte[] bArr6 = new byte[length2];
            for (int i13 = 0; i13 != length2; i13++) {
                bArr6[i13] = (byte) (bArr[(i10 + this.f88418j.length) + i13] ^ bArr4[i13]);
            }
            bArr2 = bArr6;
            iProcessBytes = 0;
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.f88417i).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.f88417i.getMacKeySize() / 8;
            byte[] bArr8 = new byte[macKeySize2];
            int i14 = cipherKeySize + macKeySize2;
            byte[] bArr9 = new byte[i14];
            derivationFunction.generateBytes(bArr9, 0, i14);
            System.arraycopy(bArr9, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr9, cipherKeySize, bArr8, 0, macKeySize2);
            CipherParameters keyParameter = new KeyParameter(bArr7);
            byte[] bArr10 = this.m;
            if (bArr10 != null) {
                keyParameter = new ParametersWithIV(keyParameter, bArr10);
            }
            bufferedBlockCipher.init(false, keyParameter);
            bArr2 = new byte[bufferedBlockCipher.getOutputSize((i11 - this.f88418j.length) - mac.getMacSize())];
            BufferedBlockCipher bufferedBlockCipher2 = this.f88412d;
            byte[] bArr11 = this.f88418j;
            iProcessBytes = bufferedBlockCipher2.processBytes(bArr, i10 + bArr11.length, (i11 - bArr11.length) - mac.getMacSize(), bArr2, 0);
            bArr3 = bArr8;
        }
        byte[] encodingV = this.f88417i.getEncodingV();
        byte[] lengthTag = this.f88418j.length != 0 ? getLengthTag(encodingV) : null;
        int i15 = i10 + i11;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i15 - mac.getMacSize(), i15);
        int length3 = bArrCopyOfRange.length;
        byte[] bArr12 = new byte[length3];
        SHA256Digest sHA256Digest = new SHA256Digest();
        byte[] bArr13 = new byte[sHA256Digest.getDigestSize()];
        sHA256Digest.reset();
        int i16 = iProcessBytes;
        sHA256Digest.update(bArr3, 0, bArr3.length);
        sHA256Digest.doFinal(bArr13, 0);
        mac.init(new KeyParameter(bArr13));
        byte[] bArr14 = this.m;
        mac.update(bArr14, 0, bArr14.length);
        byte[] bArr15 = this.f88418j;
        mac.update(bArr, i10 + bArr15.length, (i11 - bArr15.length) - length3);
        if (encodingV != null) {
            mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f88418j.length != 0) {
            mac.update(lengthTag, 0, lengthTag.length);
        }
        byte[] bArr16 = this.f88413e;
        mac.update(bArr16, 0, bArr16.length);
        mac.doFinal(bArr12, 0);
        if (Arrays.constantTimeAreEqual(bArrCopyOfRange, bArr12)) {
            return bufferedBlockCipher == null ? bArr2 : Arrays.copyOfRange(bArr2, 0, bufferedBlockCipher.doFinal(bArr2, i16) + i16);
        }
        throw new InvalidCipherTextException("invalid MAC");
    }

    public final byte[] b(int i10, int i11, byte[] bArr) throws InvalidCipherTextException {
        byte[] bArr2;
        int iDoFinal;
        byte[] bArr3;
        DerivationFunction derivationFunction = this.f88410b;
        BufferedBlockCipher bufferedBlockCipher = this.f88412d;
        if (bufferedBlockCipher == null) {
            byte[] bArr4 = new byte[i11];
            int macKeySize = this.f88417i.getMacKeySize() / 8;
            bArr3 = new byte[macKeySize];
            int i12 = i11 + macKeySize;
            byte[] bArr5 = new byte[i12];
            derivationFunction.generateBytes(bArr5, 0, i12);
            if (this.f88418j.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, i11);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i11);
                System.arraycopy(bArr5, i11, bArr3, 0, macKeySize);
            }
            byte[] bArr6 = new byte[i11];
            for (int i13 = 0; i13 != i11; i13++) {
                bArr6[i13] = (byte) (bArr[i10 + i13] ^ bArr4[i13]);
            }
            bArr2 = bArr6;
            iDoFinal = i11;
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.f88417i).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.f88417i.getMacKeySize() / 8;
            byte[] bArr8 = new byte[macKeySize2];
            int i14 = cipherKeySize + macKeySize2;
            byte[] bArr9 = new byte[i14];
            derivationFunction.generateBytes(bArr9, 0, i14);
            System.arraycopy(bArr9, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr9, cipherKeySize, bArr8, 0, macKeySize2);
            bufferedBlockCipher.init(true, this.m != null ? new ParametersWithIV(new KeyParameter(bArr7), this.m) : new KeyParameter(bArr7));
            bArr2 = new byte[bufferedBlockCipher.getOutputSize(i11)];
            int iProcessBytes = this.f88412d.processBytes(bArr, i10, i11, bArr2, 0);
            iDoFinal = iProcessBytes + bufferedBlockCipher.doFinal(bArr2, iProcessBytes);
            bArr3 = bArr8;
        }
        byte[] encodingV = this.f88417i.getEncodingV();
        byte[] lengthTag = this.f88418j.length != 0 ? getLengthTag(encodingV) : null;
        Mac mac = this.f88411c;
        int macSize = mac.getMacSize();
        byte[] bArr10 = new byte[macSize];
        SHA256Digest sHA256Digest = new SHA256Digest();
        byte[] bArr11 = new byte[sHA256Digest.getDigestSize()];
        sHA256Digest.reset();
        sHA256Digest.update(bArr3, 0, bArr3.length);
        sHA256Digest.doFinal(bArr11, 0);
        mac.init(new KeyParameter(bArr11));
        byte[] bArr12 = this.m;
        mac.update(bArr12, 0, bArr12.length);
        mac.update(bArr2, 0, bArr2.length);
        if (encodingV != null) {
            mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f88418j.length != 0) {
            mac.update(lengthTag, 0, lengthTag.length);
        }
        byte[] bArr13 = this.f88413e;
        mac.update(bArr13, 0, bArr13.length);
        mac.doFinal(bArr10, 0);
        byte[] bArr14 = this.f88418j;
        byte[] bArr15 = new byte[bArr14.length + iDoFinal + macSize];
        System.arraycopy(bArr14, 0, bArr15, 0, bArr14.length);
        System.arraycopy(bArr2, 0, bArr15, this.f88418j.length, iDoFinal);
        System.arraycopy(bArr10, 0, bArr15, this.f88418j.length + iDoFinal, macSize);
        return bArr15;
    }

    public final void c(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.m = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            this.m = null;
        }
        this.f88417i = (IESParameters) cipherParameters;
    }

    public BufferedBlockCipher getCipher() {
        return this.f88412d;
    }

    public byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            Pack.longToBigEndian(((long) bArr.length) * 8, bArr2, 0);
        }
        return bArr2;
    }

    public Mac getMac() {
        return this.f88411c;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, KeyParser keyParser) {
        this.f88414f = false;
        this.f88415g = asymmetricKeyParameter;
        this.f88420l = keyParser;
        c(cipherParameters);
    }

    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, CloneNotSupportedException {
        if (this.f88414f) {
            EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.f88419k;
            if (ephemeralKeyPairGenerator != null) {
                EphemeralKeyPair ephemeralKeyPairGenerate = ephemeralKeyPairGenerator.generate();
                this.f88415g = ephemeralKeyPairGenerate.getKeyPair().getPrivate();
                this.f88418j = ephemeralKeyPairGenerate.getEncodedPublicKey();
            }
        } else if (this.f88420l != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i10, i11);
            try {
                this.f88416h = this.f88420l.readKey(byteArrayInputStream);
                this.f88418j = Arrays.copyOfRange(bArr, i10, (i11 - byteArrayInputStream.available()) + i10);
            } catch (IOException e5) {
                throw new InvalidCipherTextException(androidx.camera.core.impl.a.d(e5, new StringBuilder("unable to recover ephemeral public key: ")), e5);
            } catch (IllegalArgumentException e7) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e7.getMessage(), e7);
            }
        }
        CipherParameters cipherParameters = this.f88415g;
        BasicAgreement basicAgreement = this.f88409a;
        basicAgreement.init(cipherParameters);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(basicAgreement.getFieldSize(), basicAgreement.calculateAgreement(this.f88416h));
        byte[] bArr2 = this.f88418j;
        if (bArr2.length != 0) {
            byte[] bArrConcatenate = Arrays.concatenate(bArr2, bArrAsUnsignedByteArray);
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            bArrAsUnsignedByteArray = bArrConcatenate;
        }
        try {
            this.f88410b.init(new KDFParameters(bArrAsUnsignedByteArray, this.f88417i.getDerivationV()));
            return this.f88414f ? b(i10, i11, bArr) : a(i10, i11, bArr);
        } finally {
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
        }
    }

    public EthereumIESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, byte[] bArr, BufferedBlockCipher bufferedBlockCipher) {
        this.f88409a = basicAgreement;
        this.f88410b = derivationFunction;
        this.f88411c = mac;
        byte[] bArr2 = new byte[mac.getMacSize()];
        this.f88413e = bArr;
        this.f88412d = bufferedBlockCipher;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.f88414f = true;
        this.f88416h = asymmetricKeyParameter;
        this.f88419k = ephemeralKeyPairGenerator;
        c(cipherParameters);
    }

    public void init(boolean z10, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
        this.f88414f = z10;
        this.f88415g = cipherParameters;
        this.f88416h = cipherParameters2;
        this.f88418j = new byte[0];
        c(cipherParameters3);
    }
}
