package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class CCMBlockCipher implements AEADBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f88963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CipherParameters f88969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f88970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f88971i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f88972j = new a();

    public class a extends ByteArrayOutputStream {
        public final byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public CCMBlockCipher(BlockCipher blockCipher) {
        this.f88963a = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f88964b = blockSize;
        this.f88970h = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    public static int b(int i10, boolean z10) {
        if (!z10 || (i10 >= 32 && i10 <= 128 && (i10 & 15) == 0)) {
            return i10 >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    public final void a(byte[] bArr, int i10, int i11, byte[] bArr2) {
        CBCBlockCipherMac cBCBlockCipherMac = new CBCBlockCipherMac(this.f88963a, this.f88968f * 8);
        cBCBlockCipherMac.init(this.f88969g);
        byte[] bArr3 = new byte[16];
        int size = this.f88971i.size();
        byte[] bArr4 = this.f88967e;
        if (size + (bArr4 == null ? 0 : bArr4.length) > 0) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i12 = 2;
        byte macSize = (byte) (bArr3[0] | ((((cBCBlockCipherMac.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr5 = this.f88966d;
        bArr3[0] = (byte) (macSize | ((14 - bArr5.length) & 7));
        System.arraycopy(bArr5, 0, bArr3, 1, bArr5.length);
        int i13 = i11;
        int i14 = 1;
        while (i13 > 0) {
            bArr3[16 - i14] = (byte) (i13 & 255);
            i13 >>>= 8;
            i14++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        int size2 = this.f88971i.size();
        byte[] bArr6 = this.f88967e;
        if (size2 + (bArr6 == null ? 0 : bArr6.length) > 0) {
            int size3 = this.f88971i.size();
            byte[] bArr7 = this.f88967e;
            int length = size3 + (bArr7 == null ? 0 : bArr7.length);
            if (length < 65280) {
                cBCBlockCipherMac.update((byte) (length >> 8));
                cBCBlockCipherMac.update((byte) length);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (length >> 24));
                cBCBlockCipherMac.update((byte) (length >> 16));
                cBCBlockCipherMac.update((byte) (length >> 8));
                cBCBlockCipherMac.update((byte) length);
                i12 = 6;
            }
            byte[] bArr8 = this.f88967e;
            if (bArr8 != null) {
                cBCBlockCipherMac.update(bArr8, 0, bArr8.length);
            }
            a aVar = this.f88971i;
            if (aVar.size() > 0) {
                cBCBlockCipherMac.update(aVar.b(), 0, aVar.size());
            }
            int i15 = (i12 + length) % 16;
            if (i15 != 0) {
                while (i15 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i15++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i10, i11);
        cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        a aVar = this.f88972j;
        int iProcessPacket = processPacket(aVar.b(), 0, aVar.size(), bArr, i10);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.f88963a.getAlgorithmName() + "/CCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i10 = this.f88968f;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f88970h, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int size = this.f88972j.size() + i10;
        if (this.f88965c) {
            return size + this.f88968f;
        }
        int i11 = this.f88968f;
        if (size < i11) {
            return 0;
        }
        return size - i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.f88963a;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        this.f88965c = z10;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.f88966d = aEADParameters.getNonce();
            this.f88967e = aEADParameters.getAssociatedText();
            this.f88968f = b(aEADParameters.getMacSize(), z10);
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameters passed to CCM: "));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f88966d = parametersWithIV.getIV();
            this.f88967e = null;
            this.f88968f = b(64, z10);
            parameters = parametersWithIV.getParameters();
        }
        if (parameters != null) {
            this.f88969g = parameters;
        }
        byte[] bArr = this.f88966d;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) throws IOException {
        this.f88971i.write(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) throws IOException {
        this.f88971i.write(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException, IOException {
        this.f88972j.write(b10);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException, IOException {
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("Input buffer too short");
        }
        this.f88972j.write(bArr, i10, i11);
        return 0;
    }

    public int processPacket(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (this.f88969g == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.f88966d;
        int length = bArr3.length;
        int i13 = 15 - length;
        if (i13 < 4 && i11 >= (1 << (i13 * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        int i14 = this.f88964b;
        byte[] bArr4 = new byte[i14];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        SICBlockCipher sICBlockCipher = new SICBlockCipher(this.f88963a);
        sICBlockCipher.init(this.f88965c, new ParametersWithIV(this.f88969g, bArr4));
        boolean z10 = this.f88965c;
        byte[] bArr5 = this.f88970h;
        if (!z10) {
            int i15 = this.f88968f;
            if (i11 < i15) {
                throw new InvalidCipherTextException("data too short");
            }
            int i16 = i11 - i15;
            if (bArr2.length < i16 + i12) {
                throw new OutputLengthException("Output buffer too short.");
            }
            int i17 = i10 + i16;
            System.arraycopy(bArr, i17, bArr5, 0, i15);
            sICBlockCipher.processBlock(bArr5, 0, bArr5, 0);
            for (int i18 = this.f88968f; i18 != bArr5.length; i18++) {
                bArr5[i18] = 0;
            }
            int i19 = i10;
            int i20 = i12;
            while (i19 < i17 - i14) {
                sICBlockCipher.processBlock(bArr, i19, bArr2, i20);
                i20 += i14;
                i19 += i14;
            }
            byte[] bArr6 = new byte[i14];
            int i21 = i16 - (i19 - i10);
            System.arraycopy(bArr, i19, bArr6, 0, i21);
            sICBlockCipher.processBlock(bArr6, 0, bArr6, 0);
            System.arraycopy(bArr6, 0, bArr2, i20, i21);
            byte[] bArr7 = new byte[i14];
            a(bArr2, i12, i16, bArr7);
            if (Arrays.constantTimeAreEqual(bArr5, bArr7)) {
                return i16;
            }
            throw new InvalidCipherTextException("mac check in CCM failed");
        }
        int i22 = this.f88968f + i11;
        if (bArr2.length < i22 + i12) {
            throw new OutputLengthException("Output buffer too short.");
        }
        a(bArr, i10, i11, bArr5);
        byte[] bArr8 = new byte[i14];
        sICBlockCipher.processBlock(bArr5, 0, bArr8, 0);
        int i23 = i10;
        int i24 = i12;
        while (true) {
            int i25 = i10 + i11;
            if (i23 >= i25 - i14) {
                byte[] bArr9 = new byte[i14];
                int i26 = i25 - i23;
                System.arraycopy(bArr, i23, bArr9, 0, i26);
                sICBlockCipher.processBlock(bArr9, 0, bArr9, 0);
                System.arraycopy(bArr9, 0, bArr2, i24, i26);
                System.arraycopy(bArr8, 0, bArr2, i12 + i11, this.f88968f);
                return i22;
            }
            sICBlockCipher.processBlock(bArr, i23, bArr2, i24);
            i24 += i14;
            i23 += i14;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        this.f88963a.reset();
        this.f88971i.reset();
        this.f88972j.reset();
    }

    public byte[] processPacket(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, IllegalStateException {
        int i12;
        if (this.f88965c) {
            i12 = this.f88968f + i11;
        } else {
            int i13 = this.f88968f;
            if (i11 < i13) {
                throw new InvalidCipherTextException("data too short");
            }
            i12 = i11 - i13;
        }
        byte[] bArr2 = new byte[i12];
        processPacket(bArr, i10, i11, bArr2, 0);
        return bArr2;
    }
}
