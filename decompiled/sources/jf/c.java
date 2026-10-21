package jf;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.InsecureSecretKeyAccess;
import com.google.crypto.tink.mac.ChunkedMacComputation;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EngineFactory;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: ChunkedHmacComputation.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class c implements ChunkedMacComputation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f79079d = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mac f79080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HmacKey f79081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79082c = false;

    public c(HmacKey hmacKey) throws GeneralSecurityException {
        Mac engineFactory = EngineFactory.MAC.getInstance("HMAC" + hmacKey.getParameters().getHashType());
        this.f79080a = engineFactory;
        engineFactory.init(new SecretKeySpec(hmacKey.getKeyBytes().toByteArray(InsecureSecretKeyAccess.get()), "HMAC"));
        this.f79081b = hmacKey;
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public final byte[] computeMac() throws GeneralSecurityException {
        if (this.f79082c) {
            throw new IllegalStateException("Cannot compute after already computing the MAC tag. Please create a new object.");
        }
        HmacKey hmacKey = this.f79081b;
        if (hmacKey.getParameters().getVariant() == HmacParameters.Variant.LEGACY) {
            update(ByteBuffer.wrap(f79079d));
        }
        this.f79082c = true;
        return Bytes.concat(hmacKey.getOutputPrefix().toByteArray(), Arrays.copyOf(this.f79080a.doFinal(), hmacKey.getParameters().getCryptographicTagSizeBytes()));
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public final void update(ByteBuffer byteBuffer) {
        if (this.f79082c) {
            throw new IllegalStateException("Cannot update after computing the MAC tag. Please create a new object.");
        }
        this.f79080a.update(byteBuffer);
    }
}
