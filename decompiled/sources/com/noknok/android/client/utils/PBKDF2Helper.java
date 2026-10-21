package com.noknok.android.client.utils;

import android.util.Base64;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.cipher.token.utils.HMACUtilsKt;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class PBKDF2Helper {
    private static byte[] a(Mac mac, byte[] bArr, int i10, int i11) throws ShortBufferException {
        int macLength = mac.getMacLength();
        int iA = c2.b.a(i11, macLength, 1, macLength);
        int i12 = i11 - ((iA - 1) * macLength);
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[macLength];
        byte[] bArr4 = new byte[macLength];
        byte[] bArr5 = new byte[4];
        for (int i13 = 1; i13 <= iA; i13++) {
            mac.update(bArr);
            bArr5[3] = (byte) i13;
            bArr5[2] = (byte) ((i13 >> 8) & 255);
            bArr5[1] = (byte) ((i13 >> 16) & 255);
            bArr5[0] = (byte) ((i13 >> 24) & 255);
            mac.update(bArr5);
            mac.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr4, 0, macLength);
            for (int i14 = 2; i14 <= i10; i14++) {
                mac.update(bArr3);
                mac.doFinal(bArr3, 0);
                for (int i15 = 0; i15 < macLength; i15++) {
                    bArr4[i15] = (byte) (bArr4[i15] ^ bArr3[i15]);
                }
            }
            if (i13 == iA) {
                System.arraycopy(bArr4, 0, bArr2, (i13 - 1) * macLength, i12);
            } else {
                System.arraycopy(bArr4, 0, bArr2, (i13 - 1) * macLength, macLength);
            }
        }
        return bArr2;
    }

    public static String generateChallenge(long j10, String str, String str2, String str3, int i10, int i11) {
        String strF = u.f(str, str2);
        byte[] bArrDecode = Base64.decode(str3, 9);
        byte[] bArr = new byte[strF.getBytes().length + bArrDecode.length];
        System.arraycopy(strF.getBytes(), 0, bArr, 0, strF.getBytes().length);
        System.arraycopy(bArrDecode, 0, bArr, strF.getBytes().length, bArrDecode.length);
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(String.valueOf(j10).toCharArray(), CryptoProviderHelper.getMessageDigestInstance("SHA-256").digest(bArr), i10, i11);
            return Base64.encodeToString(a(getHmacSHA256(pBEKeySpec, "HmacSHA256"), pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount(), pBEKeySpec.getKeyLength() / 8), 11);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | ShortBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static Mac getHmacSHA256(PBEKeySpec pBEKeySpec, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        final Mac mac = Mac.getInstance(str);
        ByteBuffer byteBufferEncode = StandardCharsets.UTF_8.encode(CharBuffer.wrap(pBEKeySpec.getPassword()));
        int iLimit = byteBufferEncode.limit();
        final byte[] bArr = new byte[iLimit];
        byteBufferEncode.get(bArr, 0, iLimit);
        mac.init(new SecretKey() { // from class: com.noknok.android.client.utils.PBKDF2Helper.1
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                SecretKey secretKey = (SecretKey) obj;
                return mac.getAlgorithm().equalsIgnoreCase(secretKey.getAlgorithm()) && Arrays.equals(bArr, secretKey.getEncoded());
            }

            @Override // java.security.Key
            public String getAlgorithm() {
                return mac.getAlgorithm();
            }

            @Override // java.security.Key
            public byte[] getEncoded() {
                return bArr;
            }

            @Override // java.security.Key
            public String getFormat() {
                return HMACUtilsKt.DEFAULT_SECRET_KEYSPEC_ALGORITHM;
            }

            public int hashCode() {
                return mac.getAlgorithm().toLowerCase(Locale.ENGLISH).hashCode() + (Arrays.hashCode(bArr) * 41);
            }
        });
        return mac;
    }
}
