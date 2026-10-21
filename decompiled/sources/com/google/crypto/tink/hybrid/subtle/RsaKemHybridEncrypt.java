package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.aead.subtle.AeadFactory;
import com.google.crypto.tink.subtle.Hkdf;
import gf.a;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes10.dex */
public final class RsaKemHybridEncrypt implements HybridEncrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f46595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AeadFactory f46598d;

    public RsaKemHybridEncrypt(RSAPublicKey rSAPublicKey, String str, byte[] bArr, AeadFactory aeadFactory) throws GeneralSecurityException {
        a.a(rSAPublicKey.getModulus());
        this.f46595a = rSAPublicKey;
        this.f46596b = str;
        this.f46597c = bArr;
        this.f46598d = aeadFactory;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        BigInteger bigInteger;
        RSAPublicKey rSAPublicKey = this.f46595a;
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        SecureRandom secureRandom = new SecureRandom();
        while (true) {
            bigInteger = new BigInteger(modulus.bitLength(), secureRandom);
            if (bigInteger.signum() > 0 && bigInteger.compareTo(modulus) < 0) {
                break;
            }
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length != iBitLength) {
            byte[] bArr3 = new byte[iBitLength];
            if (byteArray.length == iBitLength + 1) {
                if (byteArray[0] != 0) {
                    throw new IllegalArgumentException("Value is one-byte longer than the expected size, but its first byte is not 0");
                }
                System.arraycopy(byteArray, 1, bArr3, 0, iBitLength);
            } else {
                if (byteArray.length >= iBitLength) {
                    throw new IllegalArgumentException(String.format("Value has invalid length, must be of length at most (%d + 1), but got %d", Integer.valueOf(iBitLength), Integer.valueOf(byteArray.length)));
                }
                System.arraycopy(byteArray, 0, bArr3, iBitLength - byteArray.length, byteArray.length);
            }
            byteArray = bArr3;
        }
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(1, rSAPublicKey);
        byte[] bArrDoFinal = cipher.doFinal(byteArray);
        AeadFactory aeadFactory = this.f46598d;
        byte[] bArrEncrypt = aeadFactory.createAead(Hkdf.computeHkdf(this.f46596b, byteArray, this.f46597c, bArr2, aeadFactory.getKeySizeInBytes())).encrypt(bArr, a.f68603a);
        return ByteBuffer.allocate(bArrDoFinal.length + bArrEncrypt.length).put(bArrDoFinal).put(bArrEncrypt).array();
    }
}
