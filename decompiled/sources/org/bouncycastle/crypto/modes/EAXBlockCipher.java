package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class EAXBlockCipher implements AEADBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SICBlockCipher f88994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CMac f88997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f88999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f89000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f89001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f89002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f89003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f89004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f89005l;

    public EAXBlockCipher(BlockCipher blockCipher) {
        int blockSize = blockCipher.getBlockSize();
        this.f88996c = blockSize;
        CMac cMac = new CMac(blockCipher);
        this.f88997d = cMac;
        this.f89000g = new byte[blockSize];
        this.f88999f = new byte[cMac.getMacSize()];
        this.f88998e = new byte[cMac.getMacSize()];
        this.f88994a = new SICBlockCipher(blockCipher);
    }

    public final void a() {
        byte[] bArr = new byte[this.f88996c];
        int i10 = 0;
        this.f88997d.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.f89000g;
            if (i10 >= bArr2.length) {
                return;
            }
            bArr2[i10] = (byte) ((this.f88998e[i10] ^ this.f88999f[i10]) ^ bArr[i10]);
            i10++;
        }
    }

    public final void b() {
        if (this.f89004k) {
            return;
        }
        this.f89004k = true;
        CMac cMac = this.f88997d;
        cMac.doFinal(this.f88999f, 0);
        int i10 = this.f88996c;
        byte[] bArr = new byte[i10];
        bArr[i10 - 1] = 2;
        cMac.update(bArr, 0, i10);
    }

    public final int c(byte b10, byte[] bArr, int i10) {
        int iProcessBlock;
        byte[] bArr2 = this.f89002i;
        int i11 = this.f89003j;
        int i12 = i11 + 1;
        this.f89003j = i12;
        bArr2[i11] = b10;
        if (i12 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i13 = this.f88996c;
        if (length < i10 + i13) {
            throw new OutputLengthException("Output buffer is too short");
        }
        boolean z10 = this.f88995b;
        CMac cMac = this.f88997d;
        SICBlockCipher sICBlockCipher = this.f88994a;
        if (z10) {
            iProcessBlock = sICBlockCipher.processBlock(bArr2, 0, bArr, i10);
            cMac.update(bArr, i10, i13);
        } else {
            cMac.update(bArr2, 0, i13);
            iProcessBlock = sICBlockCipher.processBlock(this.f89002i, 0, bArr, i10);
        }
        this.f89003j = 0;
        if (!this.f88995b) {
            byte[] bArr3 = this.f89002i;
            System.arraycopy(bArr3, i13, bArr3, 0, this.f89001h);
            this.f89003j = this.f89001h;
        }
        return iProcessBlock;
    }

    public final void d(boolean z10) {
        this.f88994a.reset();
        CMac cMac = this.f88997d;
        cMac.reset();
        this.f89003j = 0;
        Arrays.fill(this.f89002i, (byte) 0);
        if (z10) {
            Arrays.fill(this.f89000g, (byte) 0);
        }
        int i10 = this.f88996c;
        byte[] bArr = new byte[i10];
        bArr[i10 - 1] = 1;
        cMac.update(bArr, 0, i10);
        this.f89004k = false;
        byte[] bArr2 = this.f89005l;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        b();
        int i11 = this.f89003j;
        byte[] bArr2 = this.f89002i;
        byte[] bArr3 = new byte[bArr2.length];
        this.f89003j = 0;
        boolean z10 = this.f88995b;
        byte[] bArr4 = this.f89000g;
        CMac cMac = this.f88997d;
        SICBlockCipher sICBlockCipher = this.f88994a;
        if (z10) {
            int i12 = i10 + i11;
            if (bArr.length < this.f89001h + i12) {
                throw new OutputLengthException("Output buffer too short");
            }
            sICBlockCipher.processBlock(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i10, i11);
            cMac.update(bArr3, 0, i11);
            a();
            System.arraycopy(bArr4, 0, bArr, i12, this.f89001h);
            d(false);
            return i11 + this.f89001h;
        }
        int i13 = this.f89001h;
        if (i11 < i13) {
            throw new InvalidCipherTextException("data too short");
        }
        if (bArr.length < (i10 + i11) - i13) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i11 > i13) {
            cMac.update(bArr2, 0, i11 - i13);
            sICBlockCipher.processBlock(this.f89002i, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i10, i11 - this.f89001h);
        }
        a();
        byte[] bArr5 = this.f89002i;
        int i14 = i11 - this.f89001h;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f89001h; i16++) {
            i15 |= bArr4[i16] ^ bArr5[i14 + i16];
        }
        if (i15 != 0) {
            throw new InvalidCipherTextException("mac check in EAX failed");
        }
        d(false);
        return i11 - this.f89001h;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.f88994a.getUnderlyingCipher().getAlgorithmName() + "/EAX";
    }

    public int getBlockSize() {
        return this.f88994a.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i10 = this.f89001h;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f89000g, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f89003j;
        if (this.f88995b) {
            return i11 + this.f89001h;
        }
        int i12 = this.f89001h;
        if (i11 < i12) {
            return 0;
        }
        return i11 - i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.f88994a.getUnderlyingCipher();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f89003j;
        if (!this.f88995b) {
            int i12 = this.f89001h;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % this.f88996c);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        CipherParameters parameters;
        this.f88995b = z10;
        boolean z11 = cipherParameters instanceof AEADParameters;
        CMac cMac = this.f88997d;
        if (z11) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.f89005l = aEADParameters.getAssociatedText();
            this.f89001h = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to EAX");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.f89005l = null;
            this.f89001h = cMac.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        }
        int i10 = this.f88996c;
        this.f89002i = new byte[z10 ? i10 : this.f89001h + i10];
        byte[] bArr = new byte[i10];
        cMac.init(parameters);
        bArr[i10 - 1] = 0;
        cMac.update(bArr, 0, i10);
        cMac.update(iv, 0, iv.length);
        byte[] bArr2 = this.f88998e;
        cMac.doFinal(bArr2, 0);
        this.f88994a.init(true, new ParametersWithIV(null, bArr2));
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        if (this.f89004k) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.f88997d.update(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        if (this.f89004k) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.f88997d.update(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException {
        b();
        return c(b10, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        b();
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("Input buffer too short");
        }
        int iC = 0;
        for (int i13 = 0; i13 != i11; i13++) {
            iC += c(bArr[i10 + i13], bArr2, i12 + iC);
        }
        return iC;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        d(true);
    }
}
