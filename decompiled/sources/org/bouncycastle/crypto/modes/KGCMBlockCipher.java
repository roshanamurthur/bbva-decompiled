package org.bouncycastle.crypto.modes;

import androidx.appcompat.widget.g0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier;
import org.bouncycastle.crypto.modes.kgcm.Tables16kKGCMMultiplier_512;
import org.bouncycastle.crypto.modes.kgcm.Tables4kKGCMMultiplier_128;
import org.bouncycastle.crypto.modes.kgcm.Tables8kKGCMMultiplier_256;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class KGCMBlockCipher implements AEADBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f89096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedBlockCipher f89097b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f89101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f89102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final KGCMMultiplier f89103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f89104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f89105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f89106k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f89107l = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89098c = -1;

    public class a extends ByteArrayOutputStream {
        public final byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KGCMBlockCipher(BlockCipher blockCipher) {
        KGCMMultiplier tables4kKGCMMultiplier_128;
        this.f89096a = blockCipher;
        this.f89097b = new BufferedBlockCipher(new KCTRBlockCipher(blockCipher));
        int blockSize = blockCipher.getBlockSize();
        this.f89105j = blockSize;
        this.f89100e = new byte[blockSize];
        this.f89102g = new byte[blockSize];
        if (blockSize == 16) {
            tables4kKGCMMultiplier_128 = new Tables4kKGCMMultiplier_128();
        } else if (blockSize == 32) {
            tables4kKGCMMultiplier_128 = new Tables8kKGCMMultiplier_256();
        } else {
            if (blockSize != 64) {
                throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
            }
            tables4kKGCMMultiplier_128 = new Tables16kKGCMMultiplier_512();
        }
        this.f89103h = tables4kKGCMMultiplier_128;
        this.f89104i = new long[blockSize >>> 3];
        this.f89101f = null;
    }

    public final void a(int i10, int i11, byte[] bArr, int i12) {
        int i13 = i10 + i11;
        while (true) {
            long[] jArr = this.f89104i;
            int i14 = this.f89105j;
            if (i10 >= i13) {
                jArr[0] = ((((long) i12) & 4294967295L) << 3) ^ jArr[0];
                int i15 = i14 >>> 4;
                jArr[i15] = ((4294967295L & ((long) i11)) << 3) ^ jArr[i15];
                byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr);
                this.f89101f = bArrLongToLittleEndian;
                this.f89096a.processBlock(bArrLongToLittleEndian, 0, bArrLongToLittleEndian, 0);
                return;
            }
            int i16 = i10;
            for (int i17 = 0; i17 < jArr.length; i17++) {
                jArr[i17] = jArr[i17] ^ Pack.littleEndianToLong(bArr, i16);
                i16 += 8;
            }
            this.f89103h.multiplyH(jArr);
            i10 += i14;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, IOException {
        int iDoFinal;
        a aVar = this.f89107l;
        int size = aVar.size();
        if (!this.f89099d && size < this.f89098c) {
            throw new InvalidCipherTextException("data too short");
        }
        int i11 = this.f89105j;
        byte[] bArr2 = new byte[i11];
        this.f89096a.processBlock(bArr2, 0, bArr2, 0);
        long[] jArr = new long[i11 >>> 3];
        Pack.littleEndianToLong(bArr2, 0, jArr);
        KGCMMultiplier kGCMMultiplier = this.f89103h;
        kGCMMultiplier.init(jArr);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(jArr, 0L);
        a aVar2 = this.f89106k;
        int size2 = aVar2.size();
        if (size2 > 0) {
            byte[] bArrB = aVar2.b();
            for (int i12 = 0; i12 < size2; i12 += i11) {
                long[] jArr2 = this.f89104i;
                int i13 = i12;
                for (int i14 = 0; i14 < jArr2.length; i14++) {
                    jArr2[i14] = jArr2[i14] ^ Pack.littleEndianToLong(bArrB, i13);
                    i13 += 8;
                }
                kGCMMultiplier.multiplyH(jArr2);
            }
        }
        boolean z10 = this.f89099d;
        BufferedBlockCipher bufferedBlockCipher = this.f89097b;
        if (!z10) {
            int i15 = size - this.f89098c;
            if (bArr.length - i10 < i15) {
                throw new OutputLengthException("Output buffer too short");
            }
            a(0, i15, aVar.b(), size2);
            int iProcessBytes = bufferedBlockCipher.processBytes(aVar.b(), 0, i15, bArr, i10);
            iDoFinal = bufferedBlockCipher.doFinal(bArr, i10 + iProcessBytes) + iProcessBytes;
        } else {
            if ((bArr.length - i10) - this.f89098c < size) {
                throw new OutputLengthException("Output buffer too short");
            }
            int iProcessBytes2 = bufferedBlockCipher.processBytes(aVar.b(), 0, size, bArr, i10);
            iDoFinal = bufferedBlockCipher.doFinal(bArr, i10 + iProcessBytes2) + iProcessBytes2;
            a(i10, size, bArr, size2);
        }
        byte[] bArr3 = this.f89101f;
        if (bArr3 == null) {
            throw new IllegalStateException("mac is not calculated");
        }
        if (this.f89099d) {
            System.arraycopy(bArr3, 0, bArr, i10 + iDoFinal, this.f89098c);
            reset();
            return iDoFinal + this.f89098c;
        }
        byte[] bArr4 = new byte[this.f89098c];
        byte[] bArrB2 = aVar.b();
        int i16 = this.f89098c;
        System.arraycopy(bArrB2, size - i16, bArr4, 0, i16);
        int i17 = this.f89098c;
        byte[] bArr5 = new byte[i17];
        System.arraycopy(this.f89101f, 0, bArr5, 0, i17);
        if (!Arrays.constantTimeAreEqual(bArr4, bArr5)) {
            throw new InvalidCipherTextException("mac verification failed");
        }
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.f89096a.getAlgorithmName() + "/KGCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i10 = this.f89098c;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f89101f, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int size = this.f89107l.size() + i10;
        if (this.f89099d) {
            return size + this.f89098c;
        }
        int i11 = this.f89098c;
        if (size < i11) {
            return 0;
        }
        return size - i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.f89096a;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IOException, IllegalArgumentException {
        KeyParameter key;
        this.f89099d = z10;
        boolean z11 = cipherParameters instanceof AEADParameters;
        int i10 = this.f89105j;
        byte[] bArr = this.f89102g;
        if (z11) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            byte[] nonce = aEADParameters.getNonce();
            int length = bArr.length - nonce.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(nonce, 0, bArr, length, nonce.length);
            this.f89100e = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > (i10 << 3) || (macSize & 7) != 0) {
                throw new IllegalArgumentException(g0.c("Invalid value for MAC size: ", macSize));
            }
            this.f89098c = macSize >>> 3;
            key = aEADParameters.getKey();
            byte[] bArr2 = this.f89100e;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameter passed");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length2 = bArr.length - iv.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(iv, 0, bArr, length2, iv.length);
            this.f89100e = null;
            this.f89098c = i10;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.f89101f = new byte[i10];
        this.f89097b.init(true, new ParametersWithIV(key, bArr));
        this.f89096a.init(true, key);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) throws IOException {
        this.f89106k.write(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) throws IOException {
        this.f89106k.write(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException, IOException {
        this.f89107l.write(b10);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException, IOException {
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("input buffer too short");
        }
        this.f89107l.write(bArr, i10, i11);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.f89104i, 0L);
        this.f89096a.reset();
        this.f89107l.reset();
        this.f89106k.reset();
        byte[] bArr = this.f89100e;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
