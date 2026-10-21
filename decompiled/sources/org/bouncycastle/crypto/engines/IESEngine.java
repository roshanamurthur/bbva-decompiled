package org.bouncycastle.crypto.engines;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class IESEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicAgreement f88473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DerivationFunction f88474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mac f88475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedBlockCipher f88476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CipherParameters f88478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CipherParameters f88479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IESParameters f88480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f88481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EphemeralKeyPairGenerator f88482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public KeyParser f88483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f88484l;

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac) {
        this.f88473a = basicAgreement;
        this.f88474b = derivationFunction;
        this.f88475c = mac;
        byte[] bArr = new byte[mac.getMacSize()];
        this.f88476d = null;
    }

    public final byte[] a(int i10, int i11, byte[] bArr) throws InvalidCipherTextException {
        byte[] bArr2;
        int iProcessBytes;
        byte[] bArr3;
        int length = this.f88481i.length;
        Mac mac = this.f88475c;
        if (i11 < mac.getMacSize() + length) {
            throw new InvalidCipherTextException("Length of input must be greater than the MAC and V combined");
        }
        DerivationFunction derivationFunction = this.f88474b;
        BufferedBlockCipher bufferedBlockCipher = this.f88476d;
        if (bufferedBlockCipher == null) {
            int length2 = (i11 - this.f88481i.length) - mac.getMacSize();
            byte[] bArr4 = new byte[length2];
            int macKeySize = this.f88480h.getMacKeySize() / 8;
            bArr3 = new byte[macKeySize];
            int i12 = length2 + macKeySize;
            byte[] bArr5 = new byte[i12];
            derivationFunction.generateBytes(bArr5, 0, i12);
            if (this.f88481i.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, length2);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, length2);
                System.arraycopy(bArr5, length2, bArr3, 0, macKeySize);
            }
            byte[] bArr6 = new byte[length2];
            for (int i13 = 0; i13 != length2; i13++) {
                bArr6[i13] = (byte) (bArr[(i10 + this.f88481i.length) + i13] ^ bArr4[i13]);
            }
            bArr2 = bArr6;
            iProcessBytes = 0;
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.f88480h).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.f88480h.getMacKeySize() / 8;
            byte[] bArr8 = new byte[macKeySize2];
            int i14 = cipherKeySize + macKeySize2;
            byte[] bArr9 = new byte[i14];
            derivationFunction.generateBytes(bArr9, 0, i14);
            System.arraycopy(bArr9, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr9, cipherKeySize, bArr8, 0, macKeySize2);
            CipherParameters keyParameter = new KeyParameter(bArr7);
            byte[] bArr10 = this.f88484l;
            if (bArr10 != null) {
                keyParameter = new ParametersWithIV(keyParameter, bArr10);
            }
            bufferedBlockCipher.init(false, keyParameter);
            bArr2 = new byte[bufferedBlockCipher.getOutputSize((i11 - this.f88481i.length) - mac.getMacSize())];
            BufferedBlockCipher bufferedBlockCipher2 = this.f88476d;
            byte[] bArr11 = this.f88481i;
            iProcessBytes = bufferedBlockCipher2.processBytes(bArr, i10 + bArr11.length, (i11 - bArr11.length) - mac.getMacSize(), bArr2, 0);
            bArr3 = bArr8;
        }
        byte[] encodingV = this.f88480h.getEncodingV();
        byte[] lengthTag = this.f88481i.length != 0 ? getLengthTag(encodingV) : null;
        int i15 = i10 + i11;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i15 - mac.getMacSize(), i15);
        int length3 = bArrCopyOfRange.length;
        byte[] bArr12 = new byte[length3];
        mac.init(new KeyParameter(bArr3));
        byte[] bArr13 = this.f88481i;
        mac.update(bArr, i10 + bArr13.length, (i11 - bArr13.length) - length3);
        if (encodingV != null) {
            mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f88481i.length != 0) {
            mac.update(lengthTag, 0, lengthTag.length);
        }
        mac.doFinal(bArr12, 0);
        if (Arrays.constantTimeAreEqual(bArrCopyOfRange, bArr12)) {
            return bufferedBlockCipher == null ? bArr2 : Arrays.copyOfRange(bArr2, 0, bufferedBlockCipher.doFinal(bArr2, iProcessBytes) + iProcessBytes);
        }
        throw new InvalidCipherTextException("invalid MAC");
    }

    public final byte[] b(int i10, int i11, byte[] bArr) throws InvalidCipherTextException {
        byte[] bArr2;
        int iDoFinal;
        byte[] bArr3;
        DerivationFunction derivationFunction = this.f88474b;
        BufferedBlockCipher bufferedBlockCipher = this.f88476d;
        if (bufferedBlockCipher == null) {
            byte[] bArr4 = new byte[i11];
            int macKeySize = this.f88480h.getMacKeySize() / 8;
            bArr3 = new byte[macKeySize];
            int i12 = i11 + macKeySize;
            byte[] bArr5 = new byte[i12];
            derivationFunction.generateBytes(bArr5, 0, i12);
            if (this.f88481i.length != 0) {
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
            int cipherKeySize = ((IESWithCipherParameters) this.f88480h).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.f88480h.getMacKeySize() / 8;
            byte[] bArr8 = new byte[macKeySize2];
            int i14 = cipherKeySize + macKeySize2;
            byte[] bArr9 = new byte[i14];
            derivationFunction.generateBytes(bArr9, 0, i14);
            System.arraycopy(bArr9, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr9, cipherKeySize, bArr8, 0, macKeySize2);
            bufferedBlockCipher.init(true, this.f88484l != null ? new ParametersWithIV(new KeyParameter(bArr7), this.f88484l) : new KeyParameter(bArr7));
            bArr2 = new byte[bufferedBlockCipher.getOutputSize(i11)];
            int iProcessBytes = this.f88476d.processBytes(bArr, i10, i11, bArr2, 0);
            iDoFinal = iProcessBytes + bufferedBlockCipher.doFinal(bArr2, iProcessBytes);
            bArr3 = bArr8;
        }
        byte[] encodingV = this.f88480h.getEncodingV();
        byte[] lengthTag = this.f88481i.length != 0 ? getLengthTag(encodingV) : null;
        Mac mac = this.f88475c;
        int macSize = mac.getMacSize();
        byte[] bArr10 = new byte[macSize];
        mac.init(new KeyParameter(bArr3));
        mac.update(bArr2, 0, bArr2.length);
        if (encodingV != null) {
            mac.update(encodingV, 0, encodingV.length);
        }
        if (this.f88481i.length != 0) {
            mac.update(lengthTag, 0, lengthTag.length);
        }
        mac.doFinal(bArr10, 0);
        byte[] bArr11 = this.f88481i;
        byte[] bArr12 = new byte[bArr11.length + iDoFinal + macSize];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr2, 0, bArr12, this.f88481i.length, iDoFinal);
        System.arraycopy(bArr10, 0, bArr12, this.f88481i.length + iDoFinal, macSize);
        return bArr12;
    }

    public final void c(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f88484l = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            this.f88484l = null;
        }
        this.f88480h = (IESParameters) cipherParameters;
    }

    public BufferedBlockCipher getCipher() {
        return this.f88476d;
    }

    public byte[] getLengthTag(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            Pack.longToBigEndian(((long) bArr.length) * 8, bArr2, 0);
        }
        return bArr2;
    }

    public Mac getMac() {
        return this.f88475c;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, KeyParser keyParser) {
        this.f88477e = false;
        this.f88478f = asymmetricKeyParameter;
        this.f88483k = keyParser;
        c(cipherParameters);
    }

    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, CloneNotSupportedException {
        if (this.f88477e) {
            EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.f88482j;
            if (ephemeralKeyPairGenerator != null) {
                EphemeralKeyPair ephemeralKeyPairGenerate = ephemeralKeyPairGenerator.generate();
                this.f88478f = ephemeralKeyPairGenerate.getKeyPair().getPrivate();
                this.f88481i = ephemeralKeyPairGenerate.getEncodedPublicKey();
            }
        } else if (this.f88483k != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i10, i11);
            try {
                this.f88479g = this.f88483k.readKey(byteArrayInputStream);
                this.f88481i = Arrays.copyOfRange(bArr, i10, (i11 - byteArrayInputStream.available()) + i10);
            } catch (IOException e5) {
                throw new InvalidCipherTextException(androidx.camera.core.impl.a.d(e5, new StringBuilder("unable to recover ephemeral public key: ")), e5);
            } catch (IllegalArgumentException e7) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e7.getMessage(), e7);
            }
        }
        CipherParameters cipherParameters = this.f88478f;
        BasicAgreement basicAgreement = this.f88473a;
        basicAgreement.init(cipherParameters);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(basicAgreement.getFieldSize(), basicAgreement.calculateAgreement(this.f88479g));
        byte[] bArr2 = this.f88481i;
        if (bArr2.length != 0) {
            byte[] bArrConcatenate = Arrays.concatenate(bArr2, bArrAsUnsignedByteArray);
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
            bArrAsUnsignedByteArray = bArrConcatenate;
        }
        try {
            this.f88474b.init(new KDFParameters(bArrAsUnsignedByteArray, this.f88480h.getDerivationV()));
            return this.f88477e ? b(i10, i11, bArr) : a(i10, i11, bArr);
        } finally {
            Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
        }
    }

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, BufferedBlockCipher bufferedBlockCipher) {
        this.f88473a = basicAgreement;
        this.f88474b = derivationFunction;
        this.f88475c = mac;
        byte[] bArr = new byte[mac.getMacSize()];
        this.f88476d = bufferedBlockCipher;
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.f88477e = true;
        this.f88479g = asymmetricKeyParameter;
        this.f88482j = ephemeralKeyPairGenerator;
        c(cipherParameters);
    }

    public void init(boolean z10, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
        this.f88477e = z10;
        this.f88478f = cipherParameters;
        this.f88479g = cipherParameters2;
        this.f88481i = new byte[0];
        c(cipherParameters3);
    }
}
