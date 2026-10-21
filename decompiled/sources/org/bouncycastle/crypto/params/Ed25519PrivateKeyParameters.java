package org.bouncycastle.crypto.params;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public final class Ed25519PrivateKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89283q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Ed25519PublicKeyParameters f89284r0;

    public Ed25519PrivateKeyParameters(InputStream inputStream) throws IOException {
        super(true);
        byte[] bArr = new byte[32];
        this.f89283q0 = bArr;
        if (32 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException("EOF encountered in middle of Ed25519 private key");
        }
    }

    public void encode(byte[] bArr, int i10) {
        System.arraycopy(this.f89283q0, 0, bArr, i10, 32);
    }

    public Ed25519PublicKeyParameters generatePublicKey() {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        synchronized (this.f89283q0) {
            try {
                if (this.f89284r0 == null) {
                    byte[] bArr = new byte[32];
                    Ed25519.generatePublicKey(this.f89283q0, 0, bArr, 0);
                    this.f89284r0 = new Ed25519PublicKeyParameters(bArr, 0);
                }
                ed25519PublicKeyParameters = this.f89284r0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ed25519PublicKeyParameters;
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f89283q0);
    }

    public void sign(int i10, Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        sign(i10, bArr, bArr2, i11, i12, bArr3, i13);
    }

    public Ed25519PrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.f89283q0 = bArr;
        Ed25519.generatePrivateKey(secureRandom, bArr);
    }

    public void sign(int i10, byte[] bArr, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        byte[] bArr4 = new byte[32];
        generatePublicKey().encode(bArr4, 0);
        if (i10 == 0) {
            if (bArr != null) {
                throw new IllegalArgumentException("ctx");
            }
            Ed25519.sign(this.f89283q0, 0, bArr4, 0, bArr2, i11, i12, bArr3, i13);
        } else if (i10 == 1) {
            Ed25519.sign(this.f89283q0, 0, bArr4, 0, bArr, bArr2, i11, i12, bArr3, i13);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("algorithm");
            }
            if (64 != i12) {
                throw new IllegalArgumentException("msgLen");
            }
            Ed25519.signPrehash(this.f89283q0, 0, bArr4, 0, bArr, bArr2, i11, bArr3, i13);
        }
    }

    public Ed25519PrivateKeyParameters(byte[] bArr, int i10) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.f89283q0 = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 32);
    }
}
