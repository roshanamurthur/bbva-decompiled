package org.bouncycastle.crypto.params;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public final class X448PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 56;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89390q0;

    public X448PublicKeyParameters(InputStream inputStream) throws IOException {
        super(false);
        byte[] bArr = new byte[56];
        this.f89390q0 = bArr;
        if (56 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException("EOF encountered in middle of X448 public key");
        }
    }

    public void encode(byte[] bArr, int i10) {
        System.arraycopy(this.f89390q0, 0, bArr, i10, 56);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f89390q0);
    }

    public X448PublicKeyParameters(byte[] bArr, int i10) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.f89390q0 = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 56);
    }
}
