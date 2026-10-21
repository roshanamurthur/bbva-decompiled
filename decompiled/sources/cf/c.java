package cf;

import com.google.crypto.tink.aead.internal.Poly1305;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: compiled from: InsecureNonceChaCha20Poly1305Base.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25435b;

    public c(byte[] bArr) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f25434a = b(1, bArr);
        this.f25435b = b(0, bArr);
    }

    public static byte[] a(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining % 16;
        int i11 = (i10 == 0 ? iRemaining : (iRemaining + 16) - i10) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i11);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public abstract b b(int i10, byte[] bArr) throws InvalidKeyException;

    public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return decrypt(ByteBuffer.wrap(bArr2), bArr, bArr3);
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr2.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr2.length + 16);
        encrypt(byteBufferAllocate, bArr, bArr2, bArr3);
        return byteBufferAllocate.array();
    }

    public byte[] decrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f25435b.a(0, bArr).get(bArr4);
            Poly1305.verifyMac(bArr4, a(byteBuffer, bArr2), bArr3);
            byteBuffer.position(iPosition);
            return this.f25434a.decrypt(bArr, byteBuffer);
        } catch (GeneralSecurityException e5) {
            throw new AEADBadTagException(e5.toString());
        }
    }

    public void encrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int iPosition = byteBuffer.position();
            this.f25434a.encrypt(byteBuffer, bArr, bArr2);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            byte[] bArr4 = new byte[32];
            this.f25435b.a(0, bArr).get(bArr4);
            byte[] bArrComputeMac = Poly1305.computeMac(bArr4, a(byteBuffer, bArr3));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(bArrComputeMac);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
