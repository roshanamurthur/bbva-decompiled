package jf;

import com.google.crypto.tink.mac.ChunkedMacVerification;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.util.Bytes;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: ChunkedHmacVerification.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements ChunkedMacVerification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bytes f79083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f79084b;

    public d(HmacKey hmacKey, byte[] bArr) throws GeneralSecurityException {
        this.f79084b = new c(hmacKey);
        this.f79083a = Bytes.copyFrom(bArr);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public final void update(ByteBuffer byteBuffer) {
        this.f79084b.update(byteBuffer);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public final void verifyMac() throws GeneralSecurityException {
        if (!this.f79083a.equals(Bytes.copyFrom(this.f79084b.computeMac()))) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
