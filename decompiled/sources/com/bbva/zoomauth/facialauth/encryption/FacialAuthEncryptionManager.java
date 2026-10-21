package com.bbva.zoomauth.facialauth.encryption;

import android.util.Base64;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacialAuthEncryptionManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bbva/zoomauth/facialauth/encryption/FacialAuthEncryptionManager;", "", "", "isAuth", "", "facialEncryptionBigInt", "telephoneNumber", "", "faceMap", AuthConstants.SESSION_ID, AuthConstants.IMAGE, "createJSONForUpdateOrEnroll", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;[B)Ljava/lang/String;", "<init>", "()V", "zoomauth_release"}, k = 1, mv = {1, 5, 1})
public final class FacialAuthEncryptionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f37792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f37793b;

    public final String a(byte[] bArr, SecretKey secretKey) throws Exception {
        IvParameterSpec ivParameterSpec;
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] bArr2 = new byte[16];
        try {
            SecureRandom secureRandom = SecureRandom.getInstance(AuthConstants.SHA1PRNG);
            Intrinsics.checkNotNull(secureRandom);
            secureRandom.nextBytes(bArr2);
            ivParameterSpec = new IvParameterSpec(bArr2);
            this.f37792a = Base64.encodeToString(ivParameterSpec.getIV(), 2);
        } catch (NoSuchAlgorithmException unused) {
            ivParameterSpec = null;
        }
        if (ivParameterSpec == null) {
            return null;
        }
        cipher.init(1, secretKey, ivParameterSpec);
        return Base64.encodeToString(cipher.doFinal(bArr), 2);
    }

    public final byte[] b(SecretKey secretKey) {
        PublicKey publicKeyGeneratePublic;
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            String str = this.f37793b;
            if (str == null) {
                publicKeyGeneratePublic = null;
            } else {
                try {
                    Intrinsics.checkNotNull(str);
                    publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(str, 16), new BigInteger(AuthConstants.EXPONENTIAL, 10)));
                } catch (GeneralSecurityException unused) {
                    publicKeyGeneratePublic = null;
                }
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            cipher.init(3, publicKeyGeneratePublic);
            return cipher.wrap(secretKey);
        } catch (Exception unused2) {
            return null;
        }
    }

    @Nullable
    public final String createJSONForUpdateOrEnroll(@Nullable Boolean isAuth, @Nullable String facialEncryptionBigInt, @Nullable String telephoneNumber, @Nullable byte[] faceMap, @Nullable String sessionId, @Nullable byte[] image) {
        SecretKey secretKeyGenerateKey;
        this.f37793b = facialEncryptionBigInt;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            Intrinsics.checkNotNull(keyGenerator);
            keyGenerator.init(128);
            secretKeyGenerateKey = keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException unused) {
            secretKeyGenerateKey = null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Intrinsics.checkNotNull(image);
            Intrinsics.checkNotNull(secretKeyGenerateKey);
            String strA = a(image, secretKeyGenerateKey);
            String strEncodeToString = Base64.encodeToString(b(secretKeyGenerateKey), 2);
            if (isAuth != null && isAuth.booleanValue()) {
                jSONObject.put("channel", AuthConstants.FACIAL_AUTH_CHANNEL);
                jSONObject.put(AuthConstants.CELLPHONE, telephoneNumber);
                jSONObject.put("provider", AuthConstants.FACIAL_AUTH_PROVIDER);
            }
            jSONObject.put("key", strEncodeToString);
            jSONObject.put(AuthConstants.IMAGE, strA);
            jSONObject.put(AuthConstants.INITIALIZATION_VECTOR, this.f37792a);
            Intrinsics.checkNotNull(faceMap);
            jSONObject.put(AuthConstants.FACE_MAP, Base64.encodeToString(faceMap, 2));
            jSONObject.put(AuthConstants.SESSION_ID, sessionId);
            return jSONObject.toString();
        } catch (Exception unused2) {
            return null;
        }
    }
}
