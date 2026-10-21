package org.bouncycastle.crypto.encodings;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS1Encoding implements AsymmetricBlockCipher {
    public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.not_strict";
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f88256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsymmetricBlockCipher f88257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f88260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f88262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f88263h;

    public class a implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return System.getProperty(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY);
        }
    }

    public class b implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return System.getProperty(PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY);
        }
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.f88261f = -1;
        this.f88262g = null;
        this.f88257b = asymmetricBlockCipher;
        this.f88260e = a();
    }

    public static boolean a() {
        String str = (String) AccessController.doPrivileged(new a());
        String str2 = (String) AccessController.doPrivileged(new b());
        if (str2 != null) {
            return !str2.equals("true");
        }
        return str == null || str.equals("true");
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.f88257b.getInputBlockSize();
        return this.f88258c ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.f88257b.getOutputBlockSize();
        return this.f88258c ? outputBlockSize : outputBlockSize - 10;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.f88257b;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f88256a = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z10) {
                this.f88256a = CryptoServicesRegistrar.getSecureRandom();
            }
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.f88257b;
        asymmetricBlockCipher.init(z10, cipherParameters);
        this.f88259d = asymmetricKeyParameter.isPrivate();
        this.f88258c = z10;
        this.f88263h = new byte[asymmetricBlockCipher.getOutputBlockSize()];
        if (this.f88261f > 0 && this.f88262g == null && this.f88256a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        boolean z10 = this.f88258c;
        AsymmetricBlockCipher asymmetricBlockCipher = this.f88257b;
        if (z10) {
            if (i11 > getInputBlockSize()) {
                throw new IllegalArgumentException("input data too large");
            }
            int inputBlockSize = asymmetricBlockCipher.getInputBlockSize();
            byte[] bArr2 = new byte[inputBlockSize];
            if (this.f88259d) {
                bArr2[0] = 1;
                for (int i12 = 1; i12 != (inputBlockSize - i11) - 1; i12++) {
                    bArr2[i12] = -1;
                }
            } else {
                this.f88256a.nextBytes(bArr2);
                bArr2[0] = 2;
                for (int i13 = 1; i13 != (inputBlockSize - i11) - 1; i13++) {
                    while (bArr2[i13] == 0) {
                        bArr2[i13] = (byte) this.f88256a.nextInt();
                    }
                }
            }
            int i14 = inputBlockSize - i11;
            bArr2[i14 - 1] = 0;
            System.arraycopy(bArr, i10, bArr2, i14, i11);
            return asymmetricBlockCipher.processBlock(bArr2, 0, inputBlockSize);
        }
        boolean z11 = this.f88260e;
        int i15 = this.f88261f;
        if (i15 == -1) {
            byte[] bArrProcessBlock = asymmetricBlockCipher.processBlock(bArr, i10, i11);
            boolean z12 = (bArrProcessBlock.length != asymmetricBlockCipher.getOutputBlockSize()) & z11;
            if (bArrProcessBlock.length < getOutputBlockSize()) {
                bArrProcessBlock = this.f88263h;
            }
            byte b10 = bArrProcessBlock[0];
            boolean z13 = !this.f88259d ? b10 == 1 : b10 == 2;
            int i16 = -1;
            boolean z14 = false;
            for (int i17 = 1; i17 != bArrProcessBlock.length; i17++) {
                byte b11 = bArrProcessBlock[i17];
                if ((b11 == 0) & (i16 < 0)) {
                    i16 = i17;
                }
                z14 |= (b11 != -1) & (b10 == 1) & (i16 < 0);
            }
            int i18 = (z14 ? -1 : i16) + 1;
            if (z13 || (i18 < 10)) {
                Arrays.fill(bArrProcessBlock, (byte) 0);
                throw new InvalidCipherTextException("block incorrect");
            }
            if (z12) {
                Arrays.fill(bArrProcessBlock, (byte) 0);
                throw new InvalidCipherTextException("block incorrect size");
            }
            int length = bArrProcessBlock.length - i18;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArrProcessBlock, i18, bArr3, 0, length);
            return bArr3;
        }
        if (!this.f88259d) {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
        byte[] bArrProcessBlock2 = asymmetricBlockCipher.processBlock(bArr, i10, i11);
        byte[] bArr4 = this.f88262g;
        if (bArr4 == null) {
            bArr4 = new byte[i15];
            this.f88256a.nextBytes(bArr4);
        }
        if ((bArrProcessBlock2.length != asymmetricBlockCipher.getOutputBlockSize()) & z11) {
            bArrProcessBlock2 = this.f88263h;
        }
        int i19 = bArrProcessBlock2[0] ^ 2;
        int i20 = i15 + 1;
        int length2 = bArrProcessBlock2.length - i20;
        for (int i21 = 1; i21 < length2; i21++) {
            byte b12 = bArrProcessBlock2[i21];
            int i22 = b12 | (b12 >> 1);
            int i23 = i22 | (i22 >> 2);
            i19 |= ((i23 | (i23 >> 4)) & 1) - 1;
        }
        int i24 = i19 | bArrProcessBlock2[bArrProcessBlock2.length - i20];
        int i25 = i24 | (i24 >> 1);
        int i26 = i25 | (i25 >> 2);
        int i27 = ~(((i26 | (i26 >> 4)) & 1) - 1);
        byte[] bArr5 = new byte[i15];
        for (int i28 = 0; i28 < i15; i28++) {
            bArr5[i28] = (byte) ((bArrProcessBlock2[(bArrProcessBlock2.length - i15) + i28] & (~i27)) | (bArr4[i28] & i27));
        }
        Arrays.fill(bArrProcessBlock2, (byte) 0);
        return bArr5;
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, int i10) {
        this.f88261f = -1;
        this.f88262g = null;
        this.f88257b = asymmetricBlockCipher;
        this.f88260e = a();
        this.f88261f = i10;
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, byte[] bArr) {
        this.f88261f = -1;
        this.f88262g = null;
        this.f88257b = asymmetricBlockCipher;
        this.f88260e = a();
        this.f88262g = bArr;
        this.f88261f = bArr.length;
    }
}
