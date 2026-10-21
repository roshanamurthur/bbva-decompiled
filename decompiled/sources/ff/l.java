package ff;

import com.google.crypto.tink.proto.HpkeAead;
import com.google.crypto.tink.proto.HpkeKdf;
import com.google.crypto.tink.proto.HpkeKem;
import com.google.crypto.tink.proto.HpkeParams;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: HpkePrimitiveFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l {
    public static d a(HpkeParams hpkeParams) throws GeneralSecurityException {
        if (hpkeParams.getAead() == HpkeAead.AES_128_GCM) {
            return new a(16);
        }
        if (hpkeParams.getAead() == HpkeAead.AES_256_GCM) {
            return new a(32);
        }
        if (hpkeParams.getAead() == HpkeAead.CHACHA20_POLY1305) {
            return new b();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static c b(HpkeParams hpkeParams) {
        if (hpkeParams.getKdf() == HpkeKdf.HKDF_SHA256) {
            return new c("HmacSha256");
        }
        if (hpkeParams.getKdf() == HpkeKdf.HKDF_SHA384) {
            return new c("HmacSha384");
        }
        if (hpkeParams.getKdf() == HpkeKdf.HKDF_SHA512) {
            return new c("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static h c(HpkeParams hpkeParams) throws GeneralSecurityException {
        if (hpkeParams.getKem() == HpkeKem.DHKEM_X25519_HKDF_SHA256) {
            return new o(new c("HmacSha256"));
        }
        if (hpkeParams.getKem() == HpkeKem.DHKEM_P256_HKDF_SHA256) {
            return m.e(EllipticCurves.CurveType.NIST_P256);
        }
        if (hpkeParams.getKem() == HpkeKem.DHKEM_P384_HKDF_SHA384) {
            return m.e(EllipticCurves.CurveType.NIST_P384);
        }
        if (hpkeParams.getKem() == HpkeKem.DHKEM_P521_HKDF_SHA512) {
            return m.e(EllipticCurves.CurveType.NIST_P521);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
