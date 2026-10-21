package org.bouncycastle.crypto.modes;

import androidx.appcompat.widget.g0;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.Vector;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class OCBBlockCipher implements AEADBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f89115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockCipher f89116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Vector f89120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f89121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f89122h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f89126l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f89127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f89128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f89129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f89130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f89131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f89132s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f89134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f89135v;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f89123i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f89124j = new byte[24];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f89125k = new byte[16];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f89133t = new byte[16];

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (blockCipher2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (blockCipher2.getBlockSize() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.f89115a = blockCipher;
        this.f89116b = blockCipher2;
    }

    public static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - shiftLeft(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void OCB_extend(byte[] bArr, int i10) {
        bArr[i10] = -128;
        while (true) {
            i10++;
            if (i10 >= 16) {
                return;
            } else {
                bArr[i10] = 0;
            }
        }
    }

    public static int OCB_ntz(long j10) {
        if (j10 == 0) {
            return 64;
        }
        int i10 = 0;
        while ((1 & j10) == 0) {
            i10++;
            j10 >>>= 1;
        }
        return i10;
    }

    public static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i10 = 16;
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            int i12 = bArr[i10] & 255;
            bArr2[i10] = (byte) (i11 | (i12 << 1));
            i11 = (i12 >>> 7) & 1;
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        for (int i10 = 15; i10 >= 0; i10--) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    public void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        byte[] bArr2;
        if (this.f89117c) {
            bArr2 = null;
        } else {
            int i11 = this.f89128o;
            int i12 = this.f89118d;
            if (i11 < i12) {
                throw new InvalidCipherTextException("data too short");
            }
            int i13 = i11 - i12;
            this.f89128o = i13;
            bArr2 = new byte[i12];
            System.arraycopy(this.m, i13, bArr2, 0, i12);
        }
        int i14 = this.f89127n;
        if (i14 > 0) {
            OCB_extend(this.f89126l, i14);
            updateHASH(this.f89121g);
        }
        int i15 = this.f89128o;
        BlockCipher blockCipher = this.f89115a;
        byte[] bArr3 = this.f89133t;
        if (i15 > 0) {
            if (this.f89117c) {
                OCB_extend(this.m, i15);
                xor(this.f89134u, this.m);
            }
            xor(bArr3, this.f89121g);
            byte[] bArr4 = new byte[16];
            blockCipher.processBlock(bArr3, 0, bArr4, 0);
            xor(this.m, bArr4);
            int length = bArr.length;
            int i16 = this.f89128o;
            if (length < i10 + i16) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.m, 0, bArr, i10, i16);
            if (!this.f89117c) {
                OCB_extend(this.m, this.f89128o);
                xor(this.f89134u, this.m);
            }
        }
        xor(this.f89134u, bArr3);
        xor(this.f89134u, this.f89122h);
        byte[] bArr5 = this.f89134u;
        blockCipher.processBlock(bArr5, 0, bArr5, 0);
        xor(this.f89134u, this.f89132s);
        int i17 = this.f89118d;
        byte[] bArr6 = new byte[i17];
        this.f89135v = bArr6;
        System.arraycopy(this.f89134u, 0, bArr6, 0, i17);
        int i18 = this.f89128o;
        if (this.f89117c) {
            int length2 = bArr.length;
            int i19 = i10 + i18;
            int i20 = this.f89118d;
            if (length2 < i19 + i20) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.f89135v, 0, bArr, i19, i20);
            i18 += this.f89118d;
        } else if (!Arrays.constantTimeAreEqual(this.f89135v, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        reset(false);
        return i18;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.f89116b.getAlgorithmName() + "/OCB";
    }

    public byte[] getLSub(int i10) {
        while (i10 >= this.f89120f.size()) {
            Vector vector = this.f89120f;
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
        return (byte[]) this.f89120f.elementAt(i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.f89135v;
        return bArr == null ? new byte[this.f89118d] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f89128o;
        if (this.f89117c) {
            return i11 + this.f89118d;
        }
        int i12 = this.f89118d;
        if (i11 < i12) {
            return 0;
        }
        return i11 - i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.f89116b;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f89128o;
        if (!this.f89117c) {
            int i12 = this.f89118d;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        KeyParameter key;
        boolean z11 = this.f89117c;
        this.f89117c = z10;
        this.f89135v = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.f89119e = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException(g0.c("Invalid value for MAC size: ", macSize));
            }
            this.f89118d = macSize / 8;
            key = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to OCB");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.f89119e = null;
            this.f89118d = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.f89126l = new byte[16];
        this.m = new byte[z10 ? 16 : this.f89118d + 16];
        if (iv == null) {
            iv = new byte[0];
        }
        if (iv.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        BlockCipher blockCipher = this.f89115a;
        if (key != null) {
            blockCipher.init(true, key);
            this.f89116b.init(z10, key);
            this.f89123i = null;
        } else if (z11 != z10) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        byte[] bArr = new byte[16];
        this.f89121g = bArr;
        blockCipher.processBlock(bArr, 0, bArr, 0);
        this.f89122h = OCB_double(this.f89121g);
        Vector vector = new Vector();
        this.f89120f = vector;
        vector.addElement(OCB_double(this.f89122h));
        int iProcessNonce = processNonce(iv);
        int i10 = iProcessNonce % 8;
        int i11 = iProcessNonce / 8;
        byte[] bArr2 = this.f89124j;
        byte[] bArr3 = this.f89125k;
        if (i10 == 0) {
            System.arraycopy(bArr2, i11, bArr3, 0, 16);
        } else {
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = bArr2[i11] & 255;
                i11++;
                bArr3[i12] = (byte) ((i13 << i10) | ((bArr2[i11] & 255) >>> (8 - i10)));
            }
        }
        this.f89127n = 0;
        this.f89128o = 0;
        this.f89129p = 0L;
        this.f89130q = 0L;
        this.f89131r = new byte[16];
        this.f89132s = new byte[16];
        System.arraycopy(bArr3, 0, this.f89133t, 0, 16);
        this.f89134u = new byte[16];
        byte[] bArr4 = this.f89119e;
        if (bArr4 != null) {
            processAADBytes(bArr4, 0, bArr4.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        byte[] bArr = this.f89126l;
        int i10 = this.f89127n;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.f89127n = i11;
        if (i11 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f89126l;
            int i13 = this.f89127n;
            bArr2[i13] = bArr[i10 + i12];
            int i14 = i13 + 1;
            this.f89127n = i14;
            if (i14 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException {
        byte[] bArr2 = this.m;
        int i11 = this.f89128o;
        bArr2[i11] = b10;
        int i12 = i11 + 1;
        this.f89128o = i12;
        if (i12 != bArr2.length) {
            return 0;
        }
        processMainBlock(bArr, i10);
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("Input buffer too short");
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            byte[] bArr3 = this.m;
            int i15 = this.f89128o;
            bArr3[i15] = bArr[i10 + i14];
            int i16 = i15 + 1;
            this.f89128o = i16;
            if (i16 == bArr3.length) {
                processMainBlock(bArr2, i12 + i13);
                i13 += 16;
            }
        }
        return i13;
    }

    public void processHashBlock() {
        long j10 = this.f89129p + 1;
        this.f89129p = j10;
        updateHASH(getLSub(OCB_ntz(j10)));
        this.f89127n = 0;
    }

    public void processMainBlock(byte[] bArr, int i10) {
        if (bArr.length < i10 + 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.f89117c) {
            xor(this.f89134u, this.m);
            this.f89128o = 0;
        }
        long j10 = this.f89130q + 1;
        this.f89130q = j10;
        byte[] lSub = getLSub(OCB_ntz(j10));
        byte[] bArr2 = this.f89133t;
        xor(bArr2, lSub);
        xor(this.m, bArr2);
        BlockCipher blockCipher = this.f89116b;
        byte[] bArr3 = this.m;
        blockCipher.processBlock(bArr3, 0, bArr3, 0);
        xor(this.m, bArr2);
        System.arraycopy(this.m, 0, bArr, i10, 16);
        if (this.f89117c) {
            return;
        }
        xor(this.f89134u, this.m);
        byte[] bArr4 = this.m;
        System.arraycopy(bArr4, 16, bArr4, 0, this.f89118d);
        this.f89128o = this.f89118d;
    }

    public int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.f89118d << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b10 = bArr2[15];
        int i11 = b10 & 63;
        bArr2[15] = (byte) (b10 & Constants.CVR_B2b87_11_RFU);
        byte[] bArr3 = this.f89123i;
        if (bArr3 == null || !Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.f89123i = bArr2;
            this.f89115a.processBlock(bArr2, 0, bArr4, 0);
            byte[] bArr5 = this.f89124j;
            System.arraycopy(bArr4, 0, bArr5, 0, 16);
            while (i10 < 8) {
                int i12 = i10 + 16;
                byte b11 = bArr4[i10];
                i10++;
                bArr5[i12] = (byte) (b11 ^ bArr4[i10]);
            }
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    public void updateHASH(byte[] bArr) {
        xor(this.f89131r, bArr);
        xor(this.f89126l, this.f89131r);
        byte[] bArr2 = this.f89126l;
        this.f89115a.processBlock(bArr2, 0, bArr2, 0);
        xor(this.f89132s, this.f89126l);
    }

    public void reset(boolean z10) {
        this.f89115a.reset();
        this.f89116b.reset();
        clear(this.f89126l);
        clear(this.m);
        this.f89127n = 0;
        this.f89128o = 0;
        this.f89129p = 0L;
        this.f89130q = 0L;
        clear(this.f89131r);
        clear(this.f89132s);
        System.arraycopy(this.f89125k, 0, this.f89133t, 0, 16);
        clear(this.f89134u);
        if (z10) {
            this.f89135v = null;
        }
        byte[] bArr = this.f89119e;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
