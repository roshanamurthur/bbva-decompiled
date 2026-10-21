package ff;

import androidx.appcompat.widget.g0;
import com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce;
import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: AesGcmHpkeAead.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68414a;

    public a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(g0.c("Unsupported key length: ", i10));
        }
        this.f68414a = i10;
    }

    @Override // ff.d
    public final int a() {
        return this.f68414a;
    }

    @Override // ff.d
    public final byte[] b() throws GeneralSecurityException {
        int i10 = this.f68414a;
        if (i10 == 16) {
            return HpkeUtil.AES_128_GCM_AEAD_ID;
        }
        if (i10 == 32) {
            return HpkeUtil.AES_256_GCM_AEAD_ID;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // ff.d
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.f68414a) {
            return new InsecureNonceAesGcmJce(bArr, false).decrypt(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }

    @Override // ff.d
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.f68414a) {
            return new InsecureNonceAesGcmJce(bArr, false).encrypt(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }

    @Override // ff.d
    public final void e() {
    }
}
