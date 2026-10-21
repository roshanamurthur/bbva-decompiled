package org.bouncycastle.crypto.params;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public final class Ed448PrivateKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89286q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Ed448PublicKeyParameters f89287r0;

    public Ed448PrivateKeyParameters(InputStream inputStream) throws IOException {
        super(true);
        byte[] bArr = new byte[57];
        this.f89286q0 = bArr;
        if (57 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException("EOF encountered in middle of Ed448 private key");
        }
    }

    public void encode(byte[] bArr, int i10) {
        System.arraycopy(this.f89286q0, 0, bArr, i10, 57);
    }

    public Ed448PublicKeyParameters generatePublicKey() {
        Ed448PublicKeyParameters ed448PublicKeyParameters;
        synchronized (this.f89286q0) {
            try {
                if (this.f89287r0 == null) {
                    byte[] bArr = new byte[57];
                    Ed448.generatePublicKey(this.f89286q0, 0, bArr, 0);
                    this.f89287r0 = new Ed448PublicKeyParameters(bArr, 0);
                }
                ed448PublicKeyParameters = this.f89287r0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ed448PublicKeyParameters;
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f89286q0);
    }

    public void sign(int i10, Ed448PublicKeyParameters ed448PublicKeyParameters, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        sign(i10, bArr, bArr2, i11, i12, bArr3, i13);
    }

    public Ed448PrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.f89286q0 = bArr;
        Ed448.generatePrivateKey(secureRandom, bArr);
    }

    public void sign(int i10, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        byte[] bArr4 = new byte[57];
        generatePublicKey().encode(bArr4, 0);
        if (i10 == 0) {
            Ed448.sign(this.f89286q0, 0, bArr4, 0, bArr, bArr2, i11, i12, bArr3, i13);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("algorithm");
            }
            if (64 != i12) {
                throw new IllegalArgumentException("msgLen");
            }
            Ed448.signPrehash(this.f89286q0, 0, bArr4, 0, bArr, bArr2, i11, bArr3, i13);
        }
    }

    public Ed448PrivateKeyParameters(byte[] bArr, int i10) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.f89286q0 = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 57);
    }
}
