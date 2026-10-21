package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.aead.subtle.AeadFactory;
import com.google.crypto.tink.subtle.Hkdf;
import gf.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateKey;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes10.dex */
public final class RsaKemHybridDecrypt implements HybridDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateKey f46591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AeadFactory f46594d;

    public RsaKemHybridDecrypt(RSAPrivateKey rSAPrivateKey, String str, byte[] bArr, AeadFactory aeadFactory) throws GeneralSecurityException {
        a.a(rSAPrivateKey.getModulus());
        this.f46591a = rSAPrivateKey;
        this.f46593c = bArr;
        this.f46592b = str;
        this.f46594d = aeadFactory;
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPrivateKey rSAPrivateKey = this.f46591a;
        int iBitLength = (rSAPrivateKey.getModulus().bitLength() + 7) / 8;
        if (bArr.length < iBitLength) {
            throw new GeneralSecurityException(String.format("Ciphertext must be of at least size %d bytes, but got %d", Integer.valueOf(iBitLength), Integer.valueOf(bArr.length)));
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr3 = new byte[iBitLength];
        byteBufferWrap.get(bArr3);
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(2, rSAPrivateKey);
        byte[] bArrDoFinal = cipher.doFinal(bArr3);
        AeadFactory aeadFactory = this.f46594d;
        Aead aeadCreateAead = aeadFactory.createAead(Hkdf.computeHkdf(this.f46592b, bArrDoFinal, this.f46593c, bArr2, aeadFactory.getKeySizeInBytes()));
        byte[] bArr4 = new byte[byteBufferWrap.remaining()];
        byteBufferWrap.get(bArr4);
        return aeadCreateAead.decrypt(bArr4, a.f68603a);
    }
}
