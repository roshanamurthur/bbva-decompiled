package org.bouncycastle.crypto.params;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public final class X448PrivateKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 56;
    public static final int SECRET_SIZE = 56;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89389q0;

    public X448PrivateKeyParameters(InputStream inputStream) throws IOException {
        super(true);
        byte[] bArr = new byte[56];
        this.f89389q0 = bArr;
        if (56 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException("EOF encountered in middle of X448 private key");
        }
    }

    public void encode(byte[] bArr, int i10) {
        System.arraycopy(this.f89389q0, 0, bArr, i10, 56);
    }

    public X448PublicKeyParameters generatePublicKey() {
        byte[] bArr = new byte[56];
        X448.generatePublicKey(this.f89389q0, 0, bArr, 0);
        return new X448PublicKeyParameters(bArr, 0);
    }

    public void generateSecret(X448PublicKeyParameters x448PublicKeyParameters, byte[] bArr, int i10) {
        byte[] bArr2 = new byte[56];
        x448PublicKeyParameters.encode(bArr2, 0);
        if (!X448.calculateAgreement(this.f89389q0, 0, bArr2, 0, bArr, i10)) {
            throw new IllegalStateException("X448 agreement failed");
        }
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f89389q0);
    }

    public X448PrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.f89389q0 = bArr;
        X448.generatePrivateKey(secureRandom, bArr);
    }

    public X448PrivateKeyParameters(byte[] bArr, int i10) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.f89389q0 = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 56);
    }
}
