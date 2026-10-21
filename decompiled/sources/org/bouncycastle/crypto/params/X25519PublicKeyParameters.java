package org.bouncycastle.crypto.params;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public final class X25519PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89388q0;

    public X25519PublicKeyParameters(InputStream inputStream) throws IOException {
        super(false);
        byte[] bArr = new byte[32];
        this.f89388q0 = bArr;
        if (32 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException("EOF encountered in middle of X25519 public key");
        }
    }

    public void encode(byte[] bArr, int i10) {
        System.arraycopy(this.f89388q0, 0, bArr, i10, 32);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f89388q0);
    }

    public X25519PublicKeyParameters(byte[] bArr, int i10) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.f89388q0 = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 32);
    }
}
