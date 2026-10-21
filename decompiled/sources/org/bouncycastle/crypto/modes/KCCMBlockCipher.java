package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class KCCMBlockCipher implements AEADBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f89077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f89080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f89082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f89083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f89084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f89085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f89086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f89087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f89088l;
    public final a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f89089n;

    public class a extends ByteArrayOutputStream {
        public final byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, 4);
    }

    public static void c(int i10, byte[] bArr) {
        bArr[3] = (byte) (i10 >> 24);
        bArr[2] = (byte) (i10 >> 16);
        bArr[1] = (byte) (i10 >> 8);
        bArr[0] = (byte) i10;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        BlockCipher blockCipher;
        byte[] bArr2;
        while (i11 > 0) {
            int i12 = 0;
            while (true) {
                blockCipher = this.f89077a;
                int blockSize = blockCipher.getBlockSize();
                bArr2 = this.f89082f;
                if (i12 < blockSize) {
                    bArr2[i12] = (byte) (bArr2[i12] ^ bArr[i10 + i12]);
                    i12++;
                }
            }
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
            i11 -= blockCipher.getBlockSize();
            i10 += blockCipher.getBlockSize();
        }
    }

    public final void b(int i10, byte[] bArr, int i11, byte[] bArr2) {
        byte[] bArr3;
        int i12 = 0;
        while (true) {
            byte[] bArr4 = this.f89087k;
            int length = bArr4.length;
            bArr3 = this.f89086j;
            if (i12 >= length) {
                break;
            }
            bArr3[i12] = (byte) (bArr3[i12] + bArr4[i12]);
            i12++;
        }
        BlockCipher blockCipher = this.f89077a;
        byte[] bArr5 = this.f89085i;
        blockCipher.processBlock(bArr3, 0, bArr5, 0);
        for (int i13 = 0; i13 < blockCipher.getBlockSize(); i13++) {
            bArr2[i11 + i13] = (byte) (bArr5[i13] ^ bArr[i10 + i13]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070 A[LOOP:0: B:24:0x006a->B:26:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[LOOP:1: B:30:0x00a1->B:31:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8 A[LOOP:2: B:33:0x00b2->B:35:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[LOOP:3: B:39:0x00c8->B:41:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6 A[LOOP:5: B:45:0x00e0->B:47:0x00e6, LOOP_END] */
    public final void d(int i10, byte[] bArr, int i11) {
        String str;
        String binaryString;
        byte[] bArr2;
        int i12;
        int blockSize;
        int i13;
        int i14;
        int i15;
        BlockCipher blockCipher = this.f89077a;
        if (i10 < blockCipher.getBlockSize()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i10 % blockCipher.getBlockSize() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        byte[] bArr3 = this.f89083g;
        int length = (bArr3.length - this.f89089n) - 1;
        byte[] bArr4 = this.f89084h;
        System.arraycopy(bArr3, 0, bArr4, 0, length);
        byte[] bArr5 = this.f89085i;
        c(i11, bArr5);
        System.arraycopy(bArr5, 0, bArr4, (this.f89083g.length - this.f89089n) - 1, 4);
        int length2 = bArr4.length - 1;
        int i16 = this.f89078b;
        StringBuffer stringBuffer = new StringBuffer("1");
        if (i16 == 8) {
            str = "010";
        } else if (i16 == 16) {
            str = "011";
        } else if (i16 == 32) {
            str = "100";
        } else {
            if (i16 != 48) {
                if (i16 == 64) {
                    str = "110";
                }
                binaryString = Integer.toBinaryString(this.f89089n - 1);
                while (binaryString.length() < 4) {
                    binaryString = new StringBuffer(binaryString).insert(0, "0").toString();
                }
                stringBuffer.append(binaryString);
                bArr4[length2] = (byte) Integer.parseInt(stringBuffer.toString(), 2);
                bArr2 = this.f89082f;
                blockCipher.processBlock(bArr4, 0, bArr2, 0);
                c(i10, bArr5);
                if (i10 <= blockCipher.getBlockSize() - this.f89089n) {
                    for (i14 = 0; i14 < i10; i14++) {
                        int i17 = this.f89089n + i14;
                        bArr5[i17] = (byte) (bArr5[i17] ^ bArr[i14]);
                    }
                    for (i15 = 0; i15 < blockCipher.getBlockSize(); i15++) {
                        bArr2[i15] = (byte) (bArr2[i15] ^ bArr5[i15]);
                    }
                    blockCipher.processBlock(bArr2, 0, bArr2, 0);
                    return;
                }
                for (i12 = 0; i12 < blockCipher.getBlockSize(); i12++) {
                    bArr2[i12] = (byte) (bArr2[i12] ^ bArr5[i12]);
                }
                blockCipher.processBlock(bArr2, 0, bArr2, 0);
                blockSize = 0;
                while (i10 != 0) {
                    for (i13 = 0; i13 < blockCipher.getBlockSize(); i13++) {
                        bArr2[i13] = (byte) (bArr2[i13] ^ bArr[i13 + blockSize]);
                    }
                    blockCipher.processBlock(bArr2, 0, bArr2, 0);
                    blockSize += blockCipher.getBlockSize();
                    i10 -= blockCipher.getBlockSize();
                }
            }
            str = "101";
        }
        stringBuffer.append(str);
        binaryString = Integer.toBinaryString(this.f89089n - 1);
        while (binaryString.length() < 4) {
            binaryString = new StringBuffer(binaryString).insert(0, "0").toString();
        }
        stringBuffer.append(binaryString);
        bArr4[length2] = (byte) Integer.parseInt(stringBuffer.toString(), 2);
        bArr2 = this.f89082f;
        blockCipher.processBlock(bArr4, 0, bArr2, 0);
        c(i10, bArr5);
        if (i10 <= blockCipher.getBlockSize() - this.f89089n) {
            while (i14 < i10) {
                int i18 = this.f89089n + i14;
                bArr5[i18] = (byte) (bArr5[i18] ^ bArr[i14]);
            }
            while (i15 < blockCipher.getBlockSize()) {
                bArr2[i15] = (byte) (bArr2[i15] ^ bArr5[i15]);
            }
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
            return;
        }
        while (i12 < blockCipher.getBlockSize()) {
            bArr2[i12] = (byte) (bArr2[i12] ^ bArr5[i12]);
        }
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        blockSize = 0;
        while (i10 != 0) {
            while (i13 < blockCipher.getBlockSize()) {
                bArr2[i13] = (byte) (bArr2[i13] ^ bArr[i13 + blockSize]);
            }
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
            blockSize += blockCipher.getBlockSize();
            i10 -= blockCipher.getBlockSize();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, IOException {
        a aVar = this.m;
        int iProcessPacket = processPacket(aVar.b(), 0, aVar.size(), bArr, i10);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.f89077a.getAlgorithmName() + "/KCCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.f89081e);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        return i10 + this.f89078b;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.f89077a;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IOException, IllegalArgumentException {
        CipherParameters parameters;
        boolean z11 = cipherParameters instanceof AEADParameters;
        BlockCipher blockCipher = this.f89077a;
        if (z11) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            if (aEADParameters.getMacSize() > 512 || aEADParameters.getMacSize() < 64 || aEADParameters.getMacSize() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.f89083g = aEADParameters.getNonce();
            this.f89078b = aEADParameters.getMacSize() / 8;
            this.f89080d = aEADParameters.getAssociatedText();
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f89083g = parametersWithIV.getIV();
            this.f89078b = blockCipher.getBlockSize();
            this.f89080d = null;
            parameters = parametersWithIV.getParameters();
        }
        this.f89081e = new byte[this.f89078b];
        this.f89079c = z10;
        blockCipher.init(true, parameters);
        this.f89087k[0] = 1;
        byte[] bArr = this.f89080d;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) throws IOException {
        this.f89088l.write(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) throws IOException {
        this.f89088l.write(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException, IOException {
        this.m.write(b10);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException, IOException {
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("input buffer too short");
        }
        this.m.write(bArr, i10, i11);
        return 0;
    }

    public int processPacket(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws InvalidCipherTextException, IllegalStateException, IOException {
        int i13;
        if (bArr.length - i10 < i11) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length - i12 < i11) {
            throw new OutputLengthException("output buffer too short");
        }
        a aVar = this.f89088l;
        if (aVar.size() > 0) {
            boolean z10 = this.f89079c;
            a aVar2 = this.m;
            if (z10) {
                d(aVar.size(), aVar.b(), aVar2.size());
            } else {
                d(aVar.size(), aVar.b(), aVar2.size() - this.f89078b);
            }
        }
        boolean z11 = this.f89079c;
        byte[] bArr3 = this.f89082f;
        byte[] bArr4 = this.f89087k;
        byte[] bArr5 = this.f89085i;
        byte[] bArr6 = this.f89086j;
        BlockCipher blockCipher = this.f89077a;
        if (!z11) {
            if ((i11 - this.f89078b) % blockCipher.getBlockSize() != 0) {
                throw new DataLengthException("partial blocks not supported");
            }
            blockCipher.processBlock(this.f89083g, 0, bArr6, 0);
            int blockSize = i11 / blockCipher.getBlockSize();
            for (int i14 = 0; i14 < blockSize; i14++) {
                b(i10, bArr, i12, bArr2);
                i10 += blockCipher.getBlockSize();
                i12 += blockCipher.getBlockSize();
            }
            if (i11 > i10) {
                for (int i15 = 0; i15 < bArr4.length; i15++) {
                    bArr6[i15] = (byte) (bArr6[i15] + bArr4[i15]);
                }
                blockCipher.processBlock(bArr6, 0, bArr5, 0);
                int i16 = 0;
                while (true) {
                    i13 = this.f89078b;
                    if (i16 >= i13) {
                        break;
                    }
                    bArr2[i12 + i16] = (byte) (bArr5[i16] ^ bArr[i10 + i16]);
                    i16++;
                }
                i12 += i13;
            }
            for (int i17 = 0; i17 < bArr4.length; i17++) {
                bArr6[i17] = (byte) (bArr6[i17] + bArr4[i17]);
            }
            blockCipher.processBlock(bArr6, 0, bArr5, 0);
            int i18 = this.f89078b;
            System.arraycopy(bArr2, i12 - i18, bArr5, 0, i18);
            a(0, i12 - this.f89078b, bArr2);
            System.arraycopy(bArr3, 0, this.f89081e, 0, this.f89078b);
            int i19 = this.f89078b;
            byte[] bArr7 = new byte[i19];
            System.arraycopy(bArr5, 0, bArr7, 0, i19);
            if (!Arrays.constantTimeAreEqual(this.f89081e, bArr7)) {
                throw new InvalidCipherTextException("mac check failed");
            }
            reset();
            return i11 - this.f89078b;
        }
        if (i11 % blockCipher.getBlockSize() != 0) {
            throw new DataLengthException("partial blocks not supported");
        }
        a(i10, i11, bArr);
        blockCipher.processBlock(this.f89083g, 0, bArr6, 0);
        int blockSize2 = i11;
        while (blockSize2 > 0) {
            b(i10, bArr, i12, bArr2);
            blockSize2 -= blockCipher.getBlockSize();
            i10 += blockCipher.getBlockSize();
            i12 += blockCipher.getBlockSize();
        }
        for (int i20 = 0; i20 < bArr4.length; i20++) {
            bArr6[i20] = (byte) (bArr6[i20] + bArr4[i20]);
        }
        blockCipher.processBlock(bArr6, 0, bArr5, 0);
        int i21 = 0;
        while (true) {
            int i22 = this.f89078b;
            if (i21 >= i22) {
                System.arraycopy(bArr3, 0, this.f89081e, 0, i22);
                reset();
                return i11 + this.f89078b;
            }
            bArr2[i12 + i21] = (byte) (bArr5[i21] ^ bArr3[i21]);
            i21++;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.f89084h, (byte) 0);
        Arrays.fill(this.f89085i, (byte) 0);
        byte[] bArr = this.f89087k;
        Arrays.fill(bArr, (byte) 0);
        Arrays.fill(this.f89082f, (byte) 0);
        bArr[0] = 1;
        this.m.reset();
        this.f89088l.reset();
        byte[] bArr2 = this.f89080d;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher, int i10) {
        this.f89088l = new a();
        this.m = new a();
        this.f89089n = 4;
        this.f89077a = blockCipher;
        this.f89078b = blockCipher.getBlockSize();
        this.f89083g = new byte[blockCipher.getBlockSize()];
        this.f89080d = new byte[blockCipher.getBlockSize()];
        this.f89081e = new byte[blockCipher.getBlockSize()];
        this.f89082f = new byte[blockCipher.getBlockSize()];
        this.f89084h = new byte[blockCipher.getBlockSize()];
        this.f89085i = new byte[blockCipher.getBlockSize()];
        this.f89086j = new byte[blockCipher.getBlockSize()];
        this.f89087k = new byte[blockCipher.getBlockSize()];
        if (i10 != 4 && i10 != 6 && i10 != 8) {
            throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
        }
        this.f89089n = i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return i10;
    }
}
