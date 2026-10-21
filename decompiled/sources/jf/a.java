package jf;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.InsecureSecretKeyAccess;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.mac.ChunkedMacComputation;
import com.google.crypto.tink.mac.internal.AesUtil;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EngineFactory;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: ChunkedAesCmacComputation.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class a implements ChunkedMacComputation {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f79068i = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cipher f79069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AesCmacKey f79070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f79071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f79072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f79073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteBuffer f79074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ByteBuffer f79075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f79076h = false;

    public a(AesCmacKey aesCmacKey) throws GeneralSecurityException {
        this.f79070b = aesCmacKey;
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        this.f79069a = engineFactory;
        engineFactory.init(1, new SecretKeySpec(aesCmacKey.getAesKey().toByteArray(InsecureSecretKeyAccess.get()), "AES"));
        byte[] bArrDbl = AesUtil.dbl(engineFactory.doFinal(new byte[16]));
        this.f79071c = bArrDbl;
        this.f79072d = AesUtil.dbl(bArrDbl);
        this.f79073e = ByteBuffer.allocate(16);
        this.f79074f = ByteBuffer.allocate(16);
        this.f79075g = ByteBuffer.allocate(16);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public final byte[] computeMac() throws GeneralSecurityException {
        if (this.f79076h) {
            throw new IllegalStateException("Can not compute after computing the MAC tag. Please create a new object.");
        }
        AesCmacKey aesCmacKey = this.f79070b;
        if (aesCmacKey.getParameters().getVariant() == AesCmacParameters.Variant.LEGACY) {
            update(ByteBuffer.wrap(f79068i));
        }
        this.f79076h = true;
        ByteBuffer byteBuffer = this.f79073e;
        return Bytes.concat(aesCmacKey.getOutputPrefix().toByteArray(), Arrays.copyOf(this.f79069a.doFinal(Bytes.xor(byteBuffer.remaining() > 0 ? Bytes.xor(AesUtil.cmacPad(Arrays.copyOf(byteBuffer.array(), byteBuffer.position())), this.f79072d) : Bytes.xor(byteBuffer.array(), 0, this.f79071c, 0, 16), this.f79074f.array())), aesCmacKey.getParameters().getCryptographicTagSizeBytes()));
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public final void update(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (this.f79076h) {
            throw new IllegalStateException("Can not update after computing the MAC tag. Please create a new object.");
        }
        ByteBuffer byteBuffer2 = this.f79073e;
        if (byteBuffer2.remaining() != 16) {
            int iMin = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
            for (int i10 = 0; i10 < iMin; i10++) {
                byteBuffer2.put(byteBuffer.get());
            }
        }
        int iRemaining = byteBuffer2.remaining();
        Cipher cipher = this.f79069a;
        ByteBuffer byteBuffer3 = this.f79074f;
        ByteBuffer byteBuffer4 = this.f79075g;
        if (iRemaining == 0 && byteBuffer.remaining() > 0) {
            byteBuffer2.rewind();
            byteBuffer4.rewind();
            byteBuffer3.rewind();
            Bytes.xor(byteBuffer4, byteBuffer3, byteBuffer2, 16);
            byteBuffer4.rewind();
            byteBuffer3.rewind();
            cipher.doFinal(byteBuffer4, byteBuffer3);
            byteBuffer2.rewind();
        }
        while (byteBuffer.remaining() > 16) {
            byteBuffer4.rewind();
            byteBuffer3.rewind();
            Bytes.xor(byteBuffer4, byteBuffer3, byteBuffer, 16);
            byteBuffer4.rewind();
            byteBuffer3.rewind();
            cipher.doFinal(byteBuffer4, byteBuffer3);
        }
        byteBuffer2.put(byteBuffer);
    }
}
