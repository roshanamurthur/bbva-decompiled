package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.Mac;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class EncryptThenAuthenticate implements Aead {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndCpaCipher f47461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mac f47462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47463c;

    public EncryptThenAuthenticate(IndCpaCipher indCpaCipher, Mac mac, int i10) {
        this.f47461a = indCpaCipher;
        this.f47462b = mac;
        this.f47463c = i10;
    }

    public static Aead newAesCtrHmac(byte[] bArr, int i10, String str, byte[] bArr2, int i11) throws GeneralSecurityException {
        return new EncryptThenAuthenticate(new AesCtrJceCipher(bArr, i10), new PrfMac(new PrfHmacJce(str, new SecretKeySpec(bArr2, "HMAC")), i11), i11);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f47463c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i10, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f47462b.verifyMac(bArrCopyOfRange2, Bytes.concat(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f47461a.decrypt(bArrCopyOfRange);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrEncrypt = this.f47461a.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return Bytes.concat(bArrEncrypt, this.f47462b.computeMac(Bytes.concat(bArr2, bArrEncrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }
}
