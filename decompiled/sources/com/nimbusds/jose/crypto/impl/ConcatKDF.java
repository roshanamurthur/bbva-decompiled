package com.nimbusds.jose.crypto.impl;

import androidx.camera.core.impl.a;
import c2.b;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jca.JCAAware;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class ConcatKDF implements JCAAware<JCAContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JCAContext f62603b = new JCAContext();

    public ConcatKDF(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The JCA hash algorithm must not be null");
        }
        this.f62602a = str;
    }

    public static byte[] composeOtherInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return ByteUtils.concat(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public static int computeDigestCycles(int i10, int i11) {
        return b.a(i11, i10, 1, i10);
    }

    public static byte[] encodeDataWithLength(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return ByteUtils.concat(IntegerUtils.toBytes(bArr.length), bArr);
    }

    public static byte[] encodeIntData(int i10) {
        return IntegerUtils.toBytes(i10);
    }

    public static byte[] encodeNoData() {
        return new byte[0];
    }

    public static byte[] encodeStringData(String str) {
        return encodeDataWithLength(str != null ? str.getBytes(StandardCharset.UTF_8) : null);
    }

    public SecretKey deriveKey(SecretKey secretKey, int i10, byte[] bArr) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Provider provider = getJCAContext().getProvider();
        String str = this.f62602a;
        try {
            MessageDigest messageDigest = provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            for (int i11 = 1; i11 <= computeDigestCycles(ByteUtils.safeBitLength(messageDigest.getDigestLength()), i10); i11++) {
                messageDigest.update(IntegerUtils.toBytes(i11));
                messageDigest.update(secretKey.getEncoded());
                if (bArr != null) {
                    messageDigest.update(bArr);
                }
                try {
                    byteArrayOutputStream.write(messageDigest.digest());
                } catch (IOException e5) {
                    throw new JOSEException(a.d(e5, new StringBuilder("Couldn't write derived key: ")), e5);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int iByteLength = ByteUtils.byteLength(i10);
            return byteArray.length == iByteLength ? new SecretKeySpec(byteArray, "AES") : new SecretKeySpec(ByteUtils.subArray(byteArray, 0, iByteLength), "AES");
        } catch (NoSuchAlgorithmException e7) {
            throw new JOSEException("Couldn't get message digest for KDF: " + e7.getMessage(), e7);
        }
    }

    public String getHashAlgorithm() {
        return this.f62602a;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public JCAContext getJCAContext() {
        return this.f62603b;
    }

    public static byte[] encodeDataWithLength(Base64URL base64URL) {
        return encodeDataWithLength(base64URL != null ? base64URL.decode() : null);
    }

    public SecretKey deriveKey(SecretKey secretKey, int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws JOSEException {
        return deriveKey(secretKey, i10, composeOtherInfo(bArr, bArr2, bArr3, bArr4, bArr5));
    }
}
