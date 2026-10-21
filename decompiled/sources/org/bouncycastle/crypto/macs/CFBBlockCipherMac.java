package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes4.dex */
public class CFBBlockCipherMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f88834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockCipherPadding f88835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88836f;

    public CFBBlockCipherMac(BlockCipher blockCipher) {
        this(blockCipher, 8, (blockCipher.getBlockSize() * 8) / 2, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        a aVar = this.f88834d;
        int i11 = aVar.f88955d;
        byte[] bArr2 = this.f88832b;
        BlockCipherPadding blockCipherPadding = this.f88835e;
        if (blockCipherPadding == null) {
            while (true) {
                int i12 = this.f88833c;
                if (i12 >= i11) {
                    break;
                }
                bArr2[i12] = 0;
                this.f88833c = i12 + 1;
            }
        } else {
            blockCipherPadding.addPadding(bArr2, this.f88833c);
        }
        byte[] bArr3 = this.f88831a;
        aVar.a(bArr2, 0, bArr3);
        aVar.f88956e.processBlock(aVar.f88953b, 0, bArr3, 0);
        int i13 = this.f88836f;
        System.arraycopy(bArr3, 0, bArr, i10, i13);
        reset();
        return i13;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        StringBuilder sb2 = new StringBuilder();
        a aVar = this.f88834d;
        sb2.append(aVar.f88956e.getAlgorithmName());
        sb2.append("/CFB");
        sb2.append(aVar.f88955d * 8);
        return sb2.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88836f;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        a aVar = this.f88834d;
        aVar.getClass();
        boolean z10 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = aVar.f88956e;
        if (z10) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = aVar.f88952a;
            if (length < bArr.length) {
                System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            } else {
                System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            byte[] bArr2 = aVar.f88953b;
            byte[] bArr3 = aVar.f88952a;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            aVar.f88956e.reset();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            byte[] bArr4 = aVar.f88953b;
            byte[] bArr5 = aVar.f88952a;
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            aVar.f88956e.reset();
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f88832b;
            if (i10 >= bArr.length) {
                this.f88833c = 0;
                a aVar = this.f88834d;
                byte[] bArr2 = aVar.f88953b;
                byte[] bArr3 = aVar.f88952a;
                System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                aVar.f88956e.reset();
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        int i10 = this.f88833c;
        byte[] bArr = this.f88832b;
        if (i10 == bArr.length) {
            this.f88834d.a(bArr, 0, this.f88831a);
            this.f88833c = 0;
        }
        int i11 = this.f88833c;
        this.f88833c = i11 + 1;
        bArr[i11] = b10;
    }

    public CFBBlockCipherMac(BlockCipher blockCipher, int i10, int i11) {
        this(blockCipher, i10, i11, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        a aVar = this.f88834d;
        int i12 = aVar.f88955d;
        int i13 = this.f88833c;
        int i14 = i12 - i13;
        byte[] bArr2 = this.f88832b;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr2, i13, i14);
            byte[] bArr3 = this.f88831a;
            aVar.a(bArr2, 0, bArr3);
            this.f88833c = 0;
            i11 -= i14;
            i10 += i14;
            while (i11 > i12) {
                aVar.a(bArr, i10, bArr3);
                i11 -= i12;
                i10 += i12;
            }
        }
        System.arraycopy(bArr, i10, bArr2, this.f88833c, i11);
        this.f88833c += i11;
    }

    public CFBBlockCipherMac(BlockCipher blockCipher, int i10, int i11, BlockCipherPadding blockCipherPadding) {
        this.f88835e = null;
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f88831a = new byte[blockCipher.getBlockSize()];
        a aVar = new a();
        aVar.f88956e = blockCipher;
        int i12 = i10 / 8;
        aVar.f88955d = i12;
        aVar.f88952a = new byte[blockCipher.getBlockSize()];
        aVar.f88953b = new byte[blockCipher.getBlockSize()];
        aVar.f88954c = new byte[blockCipher.getBlockSize()];
        this.f88834d = aVar;
        this.f88835e = blockCipherPadding;
        this.f88836f = i11 / 8;
        this.f88832b = new byte[i12];
        this.f88833c = 0;
    }

    public CFBBlockCipherMac(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this(blockCipher, 8, (blockCipher.getBlockSize() * 8) / 2, blockCipherPadding);
    }
}
