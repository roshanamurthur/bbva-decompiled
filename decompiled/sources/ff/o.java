package ff;

import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.X25519;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: X25519HpkeKem.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f68443a;

    public o(c cVar) {
        this.f68443a = cVar;
    }

    @Override // ff.h
    public final byte[] a(byte[] bArr, k kVar) throws GeneralSecurityException {
        return d(X25519.computeSharedSecret(kVar.b().toByteArray(), bArr), bArr, kVar.a().toByteArray());
    }

    @Override // ff.h
    public final i b(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrGeneratePrivateKey = X25519.generatePrivateKey();
        byte[] bArrComputeSharedSecret = X25519.computeSharedSecret(bArrGeneratePrivateKey, bArr);
        byte[] bArrPublicFromPrivate = X25519.publicFromPrivate(bArrGeneratePrivateKey);
        return new i(d(bArrComputeSharedSecret, bArrPublicFromPrivate, bArr), bArrPublicFromPrivate);
    }

    @Override // ff.h
    public final byte[] c() throws GeneralSecurityException {
        if (Arrays.equals(this.f68443a.c(), HpkeUtil.HKDF_SHA256_KDF_ID)) {
            return HpkeUtil.X25519_HKDF_SHA256_KEM_ID;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrConcat = Bytes.concat(bArr2, bArr3);
        byte[] bArrConcat2 = Bytes.concat(HpkeUtil.f46585a, HpkeUtil.X25519_HKDF_SHA256_KEM_ID);
        c cVar = this.f68443a;
        int macLength = Mac.getInstance(cVar.f68415a).getMacLength();
        return cVar.a(macLength, cVar.b(Bytes.concat(HpkeUtil.f46587c, bArrConcat2, "eae_prk".getBytes(Util.UTF_8), bArr), null), HpkeUtil.a("shared_secret", bArrConcat, bArrConcat2, macLength));
    }
}
