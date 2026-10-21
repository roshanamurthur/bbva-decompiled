package ff;

import com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305;
import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: ChaCha20Poly1305HpkeAead.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class b implements d {
    @Override // ff.d
    public final int a() {
        return 32;
    }

    @Override // ff.d
    public final byte[] b() {
        return HpkeUtil.CHACHA20_POLY1305_AEAD_ID;
    }

    @Override // ff.d
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new InsecureNonceChaCha20Poly1305(bArr).decrypt(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // ff.d
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new InsecureNonceChaCha20Poly1305(bArr).encrypt(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // ff.d
    public final void e() {
    }
}
