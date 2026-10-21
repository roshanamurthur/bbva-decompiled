package com.vasco.digipass.sdk;

/* JADX INFO: loaded from: classes9.dex */
public interface DigipassSDKConstants {
    public static final byte CIPHER_MECHANISM_AES = 3;
    public static final byte CIPHER_MECHANISM_DES = 1;
    public static final byte CIPHER_MECHANISM_DES3 = 2;
    public static final byte CIPHER_MODE_CBC = 2;
    public static final byte CIPHER_MODE_CFB = 3;
    public static final byte CIPHER_MODE_CTR = 4;
    public static final byte CIPHER_MODE_ECB = 1;
    public static final int CRYPTO_APPLICATION_INDEX_APP_1 = 1;
    public static final int CRYPTO_APPLICATION_INDEX_APP_2 = 2;
    public static final int CRYPTO_APPLICATION_INDEX_APP_3 = 3;
    public static final int CRYPTO_APPLICATION_INDEX_APP_4 = 4;
    public static final int CRYPTO_APPLICATION_INDEX_APP_5 = 5;
    public static final int CRYPTO_APPLICATION_INDEX_APP_6 = 6;
    public static final int CRYPTO_APPLICATION_INDEX_APP_7 = 7;
    public static final int CRYPTO_APPLICATION_INDEX_APP_8 = 8;
    public static final byte HASH_MD5 = 1;
    public static final byte HASH_SHA_1 = 2;
    public static final byte HASH_SHA_256 = 3;
    public static final byte HASH_SM3 = 4;
    public static final byte JAILBREAK_STATUS_NA = 0;
    public static final byte JAILBREAK_STATUS_SAFE = 1;
    public static final byte JAILBREAK_STATUS_UNSAFE = 2;
    public static final int LENGTH_DATA_FIELD_MAX = 16;
    public static final int LENGTH_DATA_FIELD_MAX_ENHANCED_SECURITY = 32000;
    public static final int LENGTH_ENCRYPTION_KEY = 16;
    public static final int LENGTH_SERVER_PUBLIC_KEY_MAX = 1024;
    public static final int LENGTH_SHARED_SECRET_MAX = 512;
    public static final byte SCORE_MAX = 7;
    public static final byte SCORE_MIN = 0;
    public static final byte SECURE_CHANNEL_MESSAGE_PROTECTION_HMAC = 17;
    public static final byte SECURE_CHANNEL_MESSAGE_PROTECTION_HMAC_AESCTR = 1;
    public static final byte SECURE_CHANNEL_MESSAGE_PROTECTION_NONE = 0;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_DEACTIVATION = 2;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE = 36;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_INSTANCE_ACTIVATION = 1;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_LICENSE_ACTIVATION = 0;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_REQUEST = 3;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_RESPONSE = 4;
    public static final byte STATUS_ACTIVATED = 1;
    public static final byte STATUS_GENERATE_INVALID_OTP = 3;
    public static final byte STATUS_LOCKED = 2;
    public static final byte STATUS_NOT_ACTIVATED = 0;
    public static final byte STATUS_PRE_ACTIVATED = 4;
}
