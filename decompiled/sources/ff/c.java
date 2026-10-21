package ff;

import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: HkdfHpkeKdf.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68415a;

    public c(String str) {
        this.f68415a = str;
    }

    public final byte[] a(int i10, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        EngineFactory<EngineWrapper.TMac, Mac> engineFactory = EngineFactory.MAC;
        String str = this.f68415a;
        Mac engineFactory2 = engineFactory.getInstance(str);
        if (i10 > engineFactory2.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i10];
        engineFactory2.init(new SecretKeySpec(bArr, str));
        byte[] bArrDoFinal = new byte[0];
        int i11 = 1;
        int length = 0;
        while (true) {
            engineFactory2.update(bArrDoFinal);
            engineFactory2.update(bArr2);
            engineFactory2.update((byte) i11);
            bArrDoFinal = engineFactory2.doFinal();
            if (bArrDoFinal.length + length >= i10) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i10 - length);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i11++;
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        EngineFactory<EngineWrapper.TMac, Mac> engineFactory = EngineFactory.MAC;
        String str = this.f68415a;
        Mac engineFactory2 = engineFactory.getInstance(str);
        if (bArr2 == null || bArr2.length == 0) {
            engineFactory2.init(new SecretKeySpec(new byte[engineFactory2.getMacLength()], str));
        } else {
            engineFactory2.init(new SecretKeySpec(bArr2, str));
        }
        return engineFactory2.doFinal(bArr);
    }

    public final byte[] c() throws GeneralSecurityException {
        String str = this.f68415a;
        str.getClass();
        switch (str) {
            case "HmacSha256":
                return HpkeUtil.HKDF_SHA256_KDF_ID;
            case "HmacSha384":
                return HpkeUtil.HKDF_SHA384_KDF_ID;
            case "HmacSha512":
                return HpkeUtil.HKDF_SHA512_KDF_ID;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }
}
