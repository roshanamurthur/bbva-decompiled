package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.InvalidCipherTextException;
import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import bc.org.bouncycastle.util.Arrays;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;

/* JADX INFO: loaded from: classes9.dex */
public class i4 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecureRandom f66074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c0 f66075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f66076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66077d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f66081h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66079f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f66080g = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f66078e = c();

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(PKCS1Encoding.STRICT_LENGTH_ENABLED_PROPERTY);
        }
    }

    public class b implements PrivilegedAction {
        public b() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(PKCS1Encoding.NOT_STRICT_LENGTH_ENABLED_PROPERTY);
        }
    }

    public i4(c0 c0Var) {
        this.f66075b = c0Var;
    }

    private boolean c() {
        String str = (String) AccessController.doPrivileged(new a());
        String str2 = (String) AccessController.doPrivileged(new b());
        if (str2 != null) {
            return !str2.equals("true");
        }
        return str == null || str.equals("true");
    }

    private byte[] d(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (i11 > a()) {
            throw new IllegalArgumentException("input data too large");
        }
        int iA = this.f66075b.a();
        byte[] bArr2 = new byte[iA];
        if (this.f66077d) {
            bArr2[0] = 1;
            for (int i12 = 1; i12 != (iA - i11) - 1; i12++) {
                bArr2[i12] = -1;
            }
        } else {
            this.f66074a.nextBytes(bArr2);
            bArr2[0] = 2;
            for (int i13 = 1; i13 != (iA - i11) - 1; i13++) {
                while (bArr2[i13] == 0) {
                    bArr2[i13] = (byte) this.f66074a.nextInt();
                }
            }
        }
        int i14 = iA - i11;
        bArr2[i14 - 1] = 0;
        System.arraycopy(bArr, i10, bArr2, i14, i11);
        return this.f66075b.a(bArr2, 0, iA);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c0
    public int a() {
        int iA = this.f66075b.a();
        return this.f66076c ? iA - 10 : iA;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c0
    public int b() {
        int iB = this.f66075b.b();
        return this.f66076c ? iB : iB - 10;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c0
    public void init(boolean z10, CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof l4) {
            l4 l4Var = (l4) cipherParameters;
            this.f66074a = l4Var.b();
            asymmetricKeyParameter = (AsymmetricKeyParameter) l4Var.a();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z10) {
                this.f66074a = new SecureRandom();
            }
        }
        this.f66075b.init(z10, cipherParameters);
        this.f66077d = asymmetricKeyParameter.isPrivate();
        this.f66076c = z10;
        this.f66081h = new byte[this.f66075b.b()];
        if (this.f66079f > 0 && this.f66080g == null && this.f66074a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    private byte[] b(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f66079f != -1) {
            return c(bArr, i10, i11);
        }
        byte[] bArrA = this.f66075b.a(bArr, i10, i11);
        boolean z10 = this.f66078e & (bArrA.length != this.f66075b.b());
        if (bArrA.length < b()) {
            bArrA = this.f66081h;
        }
        byte b10 = bArrA[0];
        boolean z11 = !this.f66077d ? b10 == 1 : b10 == 2;
        int iA = a(b10, bArrA) + 1;
        if (z11 || (iA < 10)) {
            Arrays.fill(bArrA, (byte) 0);
            throw new InvalidCipherTextException("block incorrect");
        }
        if (!z10) {
            int length = bArrA.length - iA;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArrA, iA, bArr2, 0, length);
            return bArr2;
        }
        Arrays.fill(bArrA, (byte) 0);
        throw new InvalidCipherTextException("block incorrect size");
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c0
    public byte[] a(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f66076c) {
            return d(bArr, i10, i11);
        }
        return b(bArr, i10, i11);
    }

    private static int a(byte[] bArr, int i10) {
        int i11 = bArr[0] ^ 2;
        int i12 = i10 + 1;
        int length = bArr.length - i12;
        for (int i13 = 1; i13 < length; i13++) {
            byte b10 = bArr[i13];
            int i14 = b10 | (b10 >> 1);
            int i15 = i14 | (i14 >> 2);
            i11 |= ((i15 | (i15 >> 4)) & 1) - 1;
        }
        int i16 = bArr[bArr.length - i12] | i11;
        int i17 = i16 | (i16 >> 1);
        int i18 = i17 | (i17 >> 2);
        return ~(((i18 | (i18 >> 4)) & 1) - 1);
    }

    private byte[] c(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f66077d) {
            byte[] bArrA = this.f66075b.a(bArr, i10, i11);
            byte[] bArr2 = this.f66080g;
            if (bArr2 == null) {
                bArr2 = new byte[this.f66079f];
                this.f66074a.nextBytes(bArr2);
            }
            if (this.f66078e & (bArrA.length != this.f66075b.b())) {
                bArrA = this.f66081h;
            }
            int iA = a(bArrA, this.f66079f);
            byte[] bArr3 = new byte[this.f66079f];
            int i12 = 0;
            while (true) {
                int i13 = this.f66079f;
                if (i12 < i13) {
                    bArr3[i12] = (byte) ((bArrA[(bArrA.length - i13) + i12] & (~iA)) | (bArr2[i12] & iA));
                    i12++;
                } else {
                    Arrays.fill(bArrA, (byte) 0);
                    return bArr3;
                }
            }
        } else {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
    }

    private int a(byte b10, byte[] bArr) throws InvalidCipherTextException {
        int i10 = -1;
        boolean z10 = false;
        for (int i11 = 1; i11 != bArr.length; i11++) {
            byte b11 = bArr[i11];
            if ((b11 == 0) & (i10 < 0)) {
                i10 = i11;
            }
            z10 |= (b11 != -1) & (b10 == 1) & (i10 < 0);
        }
        if (z10) {
            return -1;
        }
        return i10;
    }
}
