package bc.org.bouncycastle.crypto.modes;

import bc.org.bouncycastle.crypto.BlockCipher;
import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.DataLengthException;
import bc.org.bouncycastle.crypto.params.ParametersWithIV;
import bc.org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class CBCBlockCipher implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f24979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f24980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockCipher f24982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24983f;

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.f24982e = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f24981d = blockSize;
        this.f24978a = new byte[blockSize];
        this.f24979b = new byte[blockSize];
        this.f24980c = new byte[blockSize];
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f24982e.getAlgorithmName() + "/CBC";
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f24982e.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.f24982e;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        boolean z11 = this.f24983f;
        this.f24983f = z10;
        boolean z12 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f24982e;
        if (!z12) {
            reset();
            if (cipherParameters != null) {
                blockCipher.init(z10, cipherParameters);
                return;
            } else {
                if (z11 != z10) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv.length != this.f24981d) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(iv, 0, this.f24978a, 0, iv.length);
        reset();
        if (parametersWithIV.getParameters() != null) {
            blockCipher.init(z10, parametersWithIV.getParameters());
        } else if (z11 != z10) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        boolean z10 = this.f24983f;
        BlockCipher blockCipher = this.f24982e;
        int i12 = this.f24981d;
        if (z10) {
            if (i10 + i12 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                byte[] bArr3 = this.f24979b;
                bArr3[i13] = (byte) (bArr3[i13] ^ bArr[i10 + i13]);
            }
            int iProcessBlock = blockCipher.processBlock(this.f24979b, 0, bArr2, i11);
            byte[] bArr4 = this.f24979b;
            System.arraycopy(bArr2, i11, bArr4, 0, bArr4.length);
            return iProcessBlock;
        }
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(bArr, i10, this.f24980c, 0, i12);
        int iProcessBlock2 = blockCipher.processBlock(bArr, i10, bArr2, i11);
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i11 + i14;
            bArr2[i15] = (byte) (bArr2[i15] ^ this.f24979b[i14]);
        }
        byte[] bArr5 = this.f24979b;
        this.f24979b = this.f24980c;
        this.f24980c = bArr5;
        return iProcessBlock2;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.f24979b;
        byte[] bArr2 = this.f24978a;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        Arrays.fill(this.f24980c, (byte) 0);
        this.f24982e.reset();
    }
}
