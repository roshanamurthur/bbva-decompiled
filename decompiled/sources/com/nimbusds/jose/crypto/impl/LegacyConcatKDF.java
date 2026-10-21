package com.nimbusds.jose.crypto.impl;

import androidx.appcompat.widget.g0;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.IntegerUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class LegacyConcatKDF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f62608a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f62609b = {0, 0, 0, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f62610c = {69, 110, 99, 114, 121, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 116, 105, Constants.FCI_TEMPLATE, 110};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f62611d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey generateCEK(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f62608a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(IntegerUtils.toBytes(length / 2));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes(StandardCharset.UTF_8));
            byte[] bArr3 = f62609b;
            if (bArr != null) {
                byteArrayOutputStream.write(IntegerUtils.toBytes(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(IntegerUtils.toBytes(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            byteArrayOutputStream.write(f62610c);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray());
                int length2 = bArrDigest.length / 2;
                byte[] bArr4 = new byte[length2];
                System.arraycopy(bArrDigest, 0, bArr4, 0, length2);
                return new SecretKeySpec(bArr4, "AES");
            } catch (NoSuchAlgorithmException e5) {
                throw new JOSEException(e5.getMessage(), e5);
            }
        } catch (IOException e7) {
            throw new JOSEException(e7.getMessage(), e7);
        }
    }

    public static SecretKey generateCIK(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f62608a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(IntegerUtils.toBytes(length));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes(StandardCharset.UTF_8));
            byte[] bArr3 = f62609b;
            if (bArr != null) {
                byteArrayOutputStream.write(IntegerUtils.toBytes(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(IntegerUtils.toBytes(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(bArr3);
            }
            byteArrayOutputStream.write(f62611d);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), g0.c("HMACSHA", length));
            } catch (NoSuchAlgorithmException e5) {
                throw new JOSEException(e5.getMessage(), e5);
            }
        } catch (IOException e7) {
            throw new JOSEException(e7.getMessage(), e7);
        }
    }
}
