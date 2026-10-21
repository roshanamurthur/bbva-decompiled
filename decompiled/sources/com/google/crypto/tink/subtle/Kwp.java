package com.google.crypto.tink.subtle;

import com.google.crypto.tink.KeyWrap;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class Kwp implements KeyWrap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f47468b = {-90, 89, 89, -90};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f47469a;

    public Kwp(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != 16 && bArr.length != 32) {
            throw new GeneralSecurityException("Unsupported key length");
        }
        this.f47469a = new SecretKeySpec(bArr, "AES");
    }

    public static int a(int i10) {
        return (7 - ((i10 + 7) % 8)) + i10 + 8;
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(byte[] bArr) throws GeneralSecurityException {
        int i10;
        if (bArr.length < a(16)) {
            throw new GeneralSecurityException("Wrapped key size is too small");
        }
        if (bArr.length > a(4096)) {
            throw new GeneralSecurityException("Wrapped key size is too large");
        }
        if (bArr.length % 8 != 0) {
            throw new GeneralSecurityException("Wrapped key size must be a multiple of 8 bytes");
        }
        if (bArr.length < 24 || bArr.length % 8 != 0) {
            throw new GeneralSecurityException("Incorrect data size");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int length = bArrCopyOf.length / 8;
        int i11 = length - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(2, this.f47469a);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArrCopyOf, 0, bArr2, 0, 8);
        int i12 = 5;
        while (true) {
            int i13 = 1;
            if (i12 < 0) {
                break;
            }
            int i14 = length - 2;
            while (i14 >= 0) {
                int i15 = (i14 + 1) * 8;
                System.arraycopy(bArrCopyOf, i15, bArr2, 8, 8);
                int i16 = (i12 * i11) + i14 + i13;
                for (int i17 = 0; i17 < 4; i17++) {
                    int i18 = 7 - i17;
                    bArr2[i18] = (byte) (bArr2[i18] ^ ((byte) (i16 & 255)));
                    i16 >>>= 8;
                }
                engineFactory.doFinal(bArr2, 0, 16, bArr2);
                System.arraycopy(bArr2, 8, bArrCopyOf, i15, 8);
                i14--;
                i13 = 1;
            }
            i12--;
        }
        System.arraycopy(bArr2, 0, bArrCopyOf, 0, 8);
        boolean z10 = true;
        for (int i19 = 0; i19 < 4; i19++) {
            if (f47468b[i19] != bArrCopyOf[i19]) {
                z10 = false;
            }
        }
        int i20 = 0;
        for (i10 = 4; i10 < 8; i10++) {
            i20 = (i20 << 8) + (bArrCopyOf[i10] & 255);
        }
        if (a(i20) == bArrCopyOf.length) {
            int i21 = i20 + 8;
            for (int i22 = i21; i22 < bArrCopyOf.length; i22++) {
                if (bArrCopyOf[i22] != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return Arrays.copyOfRange(bArrCopyOf, 8, i21);
            }
        }
        throw new BadPaddingException("Invalid padding");
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Key size of key to wrap too small");
        }
        if (bArr.length > 4096) {
            throw new GeneralSecurityException("Key size of key to wrap too large");
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(f47468b, 0, bArr2, 0, 4);
        for (int i10 = 0; i10 < 4; i10++) {
            bArr2[i10 + 4] = (byte) ((bArr.length >> ((3 - i10) * 8)) & 255);
        }
        if (bArr.length <= 8 || bArr.length > 2147483631) {
            throw new GeneralSecurityException("computeW called with invalid parameters");
        }
        int iA = a(bArr.length);
        byte[] bArr3 = new byte[iA];
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        System.arraycopy(bArr, 0, bArr3, 8, bArr.length);
        int i11 = 1;
        int i12 = (iA / 8) - 1;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(1, this.f47469a);
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        int i13 = 0;
        while (i13 < 6) {
            int i14 = 0;
            while (i14 < i12) {
                int i15 = i14 + 1;
                int i16 = i15 * 8;
                System.arraycopy(bArr3, i16, bArr4, 8, 8);
                engineFactory.doFinal(bArr4, 0, 16, bArr4);
                int i17 = (i13 * i12) + i14 + i11;
                for (int i18 = 0; i18 < 4; i18++) {
                    int i19 = 7 - i18;
                    bArr4[i19] = (byte) (bArr4[i19] ^ ((byte) (i17 & 255)));
                    i17 >>>= 8;
                }
                System.arraycopy(bArr4, 8, bArr3, i16, 8);
                i14 = i15;
                i11 = 1;
            }
            i13++;
            i11 = 1;
        }
        System.arraycopy(bArr4, 0, bArr3, 0, 8);
        return bArr3;
    }
}
