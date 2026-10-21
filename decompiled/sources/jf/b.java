package jf;

import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.ChunkedMacVerification;
import com.google.crypto.tink.util.Bytes;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: ChunkedAesCmacVerification.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements ChunkedMacVerification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bytes f79077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f79078b;

    public b(AesCmacKey aesCmacKey, byte[] bArr) throws GeneralSecurityException {
        this.f79078b = new a(aesCmacKey);
        this.f79077a = Bytes.copyFrom(bArr);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public final void update(ByteBuffer byteBuffer) throws GeneralSecurityException {
        this.f79078b.update(byteBuffer);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public final void verifyMac() throws GeneralSecurityException {
        if (!this.f79077a.equals(Bytes.copyFrom(this.f79078b.computeMac()))) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
