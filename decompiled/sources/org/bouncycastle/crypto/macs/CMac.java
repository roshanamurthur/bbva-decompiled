package org.bouncycastle.crypto.macs;

import androidx.appcompat.widget.g0;
import com.google.android.material.internal.ViewUtils;
import com.vierge.bluetoothlibrary.BluetoothState;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes4.dex */
public class CMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f88839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f88840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CBCBlockCipher f88842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f88843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f88844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f88845i;

    public CMac(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            length--;
            if (length < 0) {
                int i11 = (-i10) & 255;
                int length2 = bArr.length - 3;
                byte b10 = bArr2[length2];
                byte[] bArr3 = this.f88837a;
                bArr2[length2] = (byte) (b10 ^ (bArr3[1] & i11));
                int length3 = bArr.length - 2;
                bArr2[length3] = (byte) ((bArr3[2] & i11) ^ bArr2[length3]);
                int length4 = bArr.length - 1;
                bArr2[length4] = (byte) ((i11 & bArr3[3]) ^ bArr2[length4]);
                return bArr2;
            }
            int i12 = bArr[length] & 255;
            bArr2[length] = (byte) (i10 | (i12 << 1));
            i10 = (i12 >>> 7) & 1;
        }
    }

    public void b(CipherParameters cipherParameters) {
        if (cipherParameters != null && !(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2;
        CBCBlockCipher cBCBlockCipher = this.f88842f;
        int blockSize = cBCBlockCipher.getBlockSize();
        int i11 = this.f88841e;
        byte[] bArr3 = this.f88840d;
        if (i11 == blockSize) {
            bArr2 = this.f88844h;
        } else {
            new ISO7816d4Padding().addPadding(bArr3, this.f88841e);
            bArr2 = this.f88845i;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr4 = this.f88839c;
            if (i12 >= bArr4.length) {
                cBCBlockCipher.processBlock(bArr3, 0, bArr4, 0);
                int i13 = this.f88843g;
                System.arraycopy(bArr4, 0, bArr, i10, i13);
                reset();
                return i13;
            }
            bArr3[i12] = (byte) (bArr3[i12] ^ bArr2[i12]);
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.f88842f.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88843g;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        b(cipherParameters);
        CBCBlockCipher cBCBlockCipher = this.f88842f;
        cBCBlockCipher.init(true, cipherParameters);
        byte[] bArr = this.f88838b;
        byte[] bArr2 = new byte[bArr.length];
        cBCBlockCipher.processBlock(bArr, 0, bArr2, 0);
        byte[] bArrA = a(bArr2);
        this.f88844h = bArrA;
        this.f88845i = a(bArrA);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f88840d;
            if (i10 >= bArr.length) {
                this.f88841e = 0;
                this.f88842f.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        int i10 = this.f88841e;
        byte[] bArr = this.f88840d;
        if (i10 == bArr.length) {
            this.f88842f.processBlock(bArr, 0, this.f88839c, 0);
            this.f88841e = 0;
        }
        int i11 = this.f88841e;
        this.f88841e = i11 + 1;
        bArr[i11] = b10;
    }

    public CMac(BlockCipher blockCipher, int i10) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i10 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (blockCipher.getBlockSize() * 8));
        }
        this.f88842f = new CBCBlockCipher(blockCipher);
        this.f88843g = i10 / 8;
        int blockSize = blockCipher.getBlockSize() * 8;
        int i11 = 135;
        switch (blockSize) {
            case 64:
            case 320:
                i11 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i11 = 45;
                break;
            case 224:
                i11 = 777;
                break;
            case 256:
                i11 = 1061;
                break;
            case BluetoothState.REQUEST_CONNECT_DEVICE /* 384 */:
                i11 = 4109;
                break;
            case 448:
                i11 = 2129;
                break;
            case 512:
                i11 = 293;
                break;
            case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                i11 = 655377;
                break;
            case 1024:
                i11 = 524355;
                break;
            case 2048:
                i11 = 548865;
                break;
            default:
                throw new IllegalArgumentException(g0.c("Unknown block size for CMAC: ", blockSize));
        }
        this.f88837a = Pack.intToBigEndian(i11);
        this.f88839c = new byte[blockCipher.getBlockSize()];
        this.f88840d = new byte[blockCipher.getBlockSize()];
        this.f88838b = new byte[blockCipher.getBlockSize()];
        this.f88841e = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        CBCBlockCipher cBCBlockCipher = this.f88842f;
        int blockSize = cBCBlockCipher.getBlockSize();
        int i12 = this.f88841e;
        int i13 = blockSize - i12;
        byte[] bArr2 = this.f88840d;
        if (i11 > i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i13);
            byte[] bArr3 = this.f88839c;
            cBCBlockCipher.processBlock(bArr2, 0, bArr3, 0);
            this.f88841e = 0;
            i11 -= i13;
            i10 += i13;
            while (i11 > blockSize) {
                cBCBlockCipher.processBlock(bArr, i10, bArr3, 0);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, bArr2, this.f88841e, i11);
        this.f88841e += i11;
    }
}
