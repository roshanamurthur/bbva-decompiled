package com.google.crypto.tink;

import androidx.camera.camera2.internal.h0;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.google.crypto.tink.subtle.Base64;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.annotation.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RSA_PSS_2048_SHA256' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
public final class PemKeyType {
    private static final /* synthetic */ PemKeyType[] $VALUES;
    private static final String BEGIN = "-----BEGIN ";
    public static final PemKeyType ECDSA_P256_SHA256;
    public static final PemKeyType ECDSA_P384_SHA384;
    public static final PemKeyType ECDSA_P521_SHA512;
    private static final String END = "-----END ";
    private static final String MARKER = "-----";
    private static final String PRIVATE_KEY = "PRIVATE KEY";
    private static final String PUBLIC_KEY = "PUBLIC KEY";
    public static final PemKeyType RSA_PSS_2048_SHA256;
    public static final PemKeyType RSA_PSS_3072_SHA256;
    public static final PemKeyType RSA_PSS_4096_SHA256;
    public static final PemKeyType RSA_PSS_4096_SHA512;
    public static final PemKeyType RSA_SIGN_PKCS1_2048_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_3072_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_4096_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_4096_SHA512;
    public final String algorithm;
    public final Enums.HashType hash;
    public final int keySizeInBits;
    public final String keyType;

    static {
        Enums.HashType hashType = Enums.HashType.SHA256;
        PemKeyType pemKeyType = new PemKeyType("RSA_PSS_2048_SHA256", 0, "RSA", "RSASSA-PSS", 2048, hashType);
        RSA_PSS_2048_SHA256 = pemKeyType;
        PemKeyType pemKeyType2 = new PemKeyType("RSA_PSS_3072_SHA256", 1, "RSA", "RSASSA-PSS", 3072, hashType);
        RSA_PSS_3072_SHA256 = pemKeyType2;
        PemKeyType pemKeyType3 = new PemKeyType("RSA_PSS_4096_SHA256", 2, "RSA", "RSASSA-PSS", 4096, hashType);
        RSA_PSS_4096_SHA256 = pemKeyType3;
        Enums.HashType hashType2 = Enums.HashType.SHA512;
        PemKeyType pemKeyType4 = new PemKeyType("RSA_PSS_4096_SHA512", 3, "RSA", "RSASSA-PSS", 4096, hashType2);
        RSA_PSS_4096_SHA512 = pemKeyType4;
        PemKeyType pemKeyType5 = new PemKeyType("RSA_SIGN_PKCS1_2048_SHA256", 4, "RSA", "RSASSA-PKCS1-v1_5", 2048, hashType);
        RSA_SIGN_PKCS1_2048_SHA256 = pemKeyType5;
        PemKeyType pemKeyType6 = new PemKeyType("RSA_SIGN_PKCS1_3072_SHA256", 5, "RSA", "RSASSA-PKCS1-v1_5", 3072, hashType);
        RSA_SIGN_PKCS1_3072_SHA256 = pemKeyType6;
        PemKeyType pemKeyType7 = new PemKeyType("RSA_SIGN_PKCS1_4096_SHA256", 6, "RSA", "RSASSA-PKCS1-v1_5", 4096, hashType);
        RSA_SIGN_PKCS1_4096_SHA256 = pemKeyType7;
        PemKeyType pemKeyType8 = new PemKeyType("RSA_SIGN_PKCS1_4096_SHA512", 7, "RSA", "RSASSA-PKCS1-v1_5", 4096, hashType2);
        RSA_SIGN_PKCS1_4096_SHA512 = pemKeyType8;
        PemKeyType pemKeyType9 = new PemKeyType("ECDSA_P256_SHA256", 8, LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, "ECDSA", 256, hashType);
        ECDSA_P256_SHA256 = pemKeyType9;
        PemKeyType pemKeyType10 = new PemKeyType("ECDSA_P384_SHA384", 9, LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, "ECDSA", BluetoothState.REQUEST_CONNECT_DEVICE, Enums.HashType.SHA384);
        ECDSA_P384_SHA384 = pemKeyType10;
        PemKeyType pemKeyType11 = new PemKeyType("ECDSA_P521_SHA512", 10, LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, "ECDSA", ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY, hashType2);
        ECDSA_P521_SHA512 = pemKeyType11;
        $VALUES = new PemKeyType[]{pemKeyType, pemKeyType2, pemKeyType3, pemKeyType4, pemKeyType5, pemKeyType6, pemKeyType7, pemKeyType8, pemKeyType9, pemKeyType10, pemKeyType11};
    }

    public PemKeyType(String str, int i10, String str2, String str3, int i11, Enums.HashType hashType) {
        super(str, i10);
        this.keyType = str2;
        this.algorithm = str3;
        this.keySizeInBits = i11;
        this.hash = hashType;
    }

    public static PemKeyType valueOf(String str) {
        return (PemKeyType) Enum.valueOf(PemKeyType.class, str);
    }

    public static PemKeyType[] values() {
        return (PemKeyType[]) $VALUES.clone();
    }

    public final java.security.PrivateKey a(byte[] bArr) throws GeneralSecurityException {
        java.security.PrivateKey privateKeyGeneratePrivate = EngineFactory.KEY_FACTORY.getInstance(this.keyType).generatePrivate(new PKCS8EncodedKeySpec(bArr));
        c(privateKeyGeneratePrivate);
        return privateKeyGeneratePrivate;
    }

    public final PublicKey b(byte[] bArr) throws GeneralSecurityException {
        PublicKey publicKeyGeneratePublic = EngineFactory.KEY_FACTORY.getInstance(this.keyType).generatePublic(new X509EncodedKeySpec(bArr));
        c(publicKeyGeneratePublic);
        return publicKeyGeneratePublic;
    }

    public final void c(java.security.Key key) throws GeneralSecurityException {
        if (this.keyType.equals("RSA")) {
            int iBitLength = ((RSAKey) key).getModulus().bitLength();
            if (iBitLength != this.keySizeInBits) {
                throw new GeneralSecurityException(String.format("invalid RSA key size, want %d got %d", Integer.valueOf(this.keySizeInBits), Integer.valueOf(iBitLength)));
            }
            return;
        }
        ECParameterSpec params = ((ECKey) key).getParams();
        if (!EllipticCurves.isNistEcParameterSpec(params)) {
            throw new GeneralSecurityException("unsupport EC spec: " + params.toString());
        }
        int iFieldSizeInBits = EllipticCurves.fieldSizeInBits(params.getCurve());
        if (iFieldSizeInBits != this.keySizeInBits) {
            throw new GeneralSecurityException(String.format("invalid EC key size, want %d got %d", Integer.valueOf(this.keySizeInBits), Integer.valueOf(iFieldSizeInBits)));
        }
    }

    @Nullable
    public java.security.Key readKey(BufferedReader bufferedReader) throws IOException {
        String strSubstring;
        int iIndexOf;
        String line = bufferedReader.readLine();
        while (line != null && !line.startsWith(BEGIN)) {
            line = bufferedReader.readLine();
        }
        if (line == null || (iIndexOf = (strSubstring = line.trim().substring(11)).indexOf(MARKER)) < 0) {
            return null;
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String strB = h0.b(END, strSubstring2, MARKER);
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line2 = bufferedReader.readLine();
            if (line2 == null) {
                break;
            }
            if (line2.indexOf(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER) <= 0) {
                if (line2.contains(strB)) {
                    break;
                }
                sb2.append(line2);
            }
        }
        try {
            byte[] bArrDecode = Base64.decode(sb2.toString(), 0);
            if (strSubstring2.contains(PUBLIC_KEY)) {
                return b(bArrDecode);
            }
            if (strSubstring2.contains(PRIVATE_KEY)) {
                return a(bArrDecode);
            }
            return null;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
    }
}
