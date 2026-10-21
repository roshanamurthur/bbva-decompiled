package cf;

import com.google.crypto.tink.subtle.Bytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: InsecureNonceChaCha20Base.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f25432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25433b;

    public b(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f25432a = a.c(bArr);
        this.f25433b = i10;
    }

    public final ByteBuffer a(int i10, byte[] bArr) {
        int[] iArrCreateInitialState = createInitialState(a.c(bArr), i10);
        int[] iArr = (int[]) iArrCreateInitialState.clone();
        a.b(iArr);
        for (int i11 = 0; i11 < iArrCreateInitialState.length; i11++) {
            iArrCreateInitialState[i11] = iArrCreateInitialState[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrCreateInitialState, 0, 16);
        return byteBufferOrder;
    }

    public final void b(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != nonceSizeInBytes()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + nonceSizeInBytes());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(this.f25433b + i12, bArr);
            if (i12 == i10) {
                Bytes.xor(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                Bytes.xor(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int[] createInitialState(int[] iArr, int i10);

    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return decrypt(bArr, ByteBuffer.wrap(bArr2));
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr2.length);
        encrypt(byteBufferAllocate, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    public abstract int nonceSizeInBytes();

    public byte[] decrypt(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        b(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void encrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            b(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
