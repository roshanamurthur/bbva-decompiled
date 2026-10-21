package com.vasco.digipass.sdk.utils.utilities;

/* JADX INFO: loaded from: classes9.dex */
public final class UtilitiesSDKConstants {
    public static final byte CIPHER_MECHANISM_AES = 3;
    public static final byte CIPHER_MECHANISM_DES = 1;
    public static final byte CIPHER_MECHANISM_DES3 = 2;
    public static final byte CIPHER_MODE_CBC = 2;
    public static final byte CIPHER_MODE_CFB = 3;
    public static final byte CIPHER_MODE_CTR = 4;
    public static final byte CIPHER_MODE_ECB = 1;
    public static final int FINAL_DECODING_LENGTH = 131120;
    public static final byte HASH_MD5 = 1;
    public static final byte HASH_SHA_1 = 2;
    public static final byte HASH_SHA_256 = 3;
    public static final byte HASH_SM3 = 4;
    public static final int INITIAL_ENCODING_LENGTH = 131120;
    public static final int LENGTH_SECURE_CHANNEL_MESSAGE_BODY_MAX = 512;
    public static final byte LENGTH_SECURE_CHANNEL_MESSAGE_FOOTER = 8;
    public static final byte LENGTH_SECURE_CHANNEL_MESSAGE_HEADER = 15;
    public static final byte LENGTH_SECURE_CHANNEL_MESSAGE_NONCE = 8;
    public static final byte LENGTH_SECURE_CHANNEL_MESSAGE_SERIAL_NUMBER = 10;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_DEACTIVATION = 2;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_INSTANCE_ACTIVATION = 1;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_LICENSE_ACTIVATION = 0;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_REQUEST = 3;
    public static final byte SECURE_CHANNEL_MESSAGE_TYPE_RESPONSE = 4;
    public static final int SRP_ENCRYPTION_COUNTER_LENGTH = 16;
    public static final int SRP_EPHEMERAL_KEY_MAX_LENGTH = 512;
    public static final int SRP_EVIDENCE_MESSAGE_LENGTH = 64;
    public static final byte SRP_LABEL_ENC = -80;
    public static final byte SRP_LABEL_MAC = -78;
    public static final int SRP_PASSWORD_MAX_LENGTH = 64;
    public static final int SRP_PASSWORD_MIN_LENGTH = 4;
    public static final int SRP_PASSWORD_VERIFIER_MAX_LENGTH = 512;
    public static final int SRP_SALT_LENGTH = 32;
    public static final int SRP_SESSION_KEY_LENGTH = 64;
    public static final int SRP_USER_ID_MAX_LENGTH = 64;
    public static final int SRP_USER_ID_MIN_LENGTH = 4;
    public static final int TYPE_IAS_LENGTH = 65536;
    public static final int TYPE_IA_INPUT_SBOX_LENGTH = 512;
    public static final int TYPE_IBS_LENGTH = 65536;
    public static final int TYPE_IB_OUTPUT_SBOX_INV_LENGTH = 512;
    public static final int TYPE_IIIS_LENGTH = 147456;
    public static final int TYPE_IIS_LENGTH = 147456;
    public static final int TYPE_IV_IAS_LENGTH = 61440;
    public static final int TYPE_IV_IBS_LENGTH = 61440;
    public static final int TYPE_IV_IIIS_LENGTH = 110592;
    public static final int TYPE_IV_IIS_LENGTH = 110592;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_MESSAGE_TYPE_MAX = 63;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_MESSAGE_TYPE_MIN = 0;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_PROTECTION_HMAC = 17;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_PROTECTION_HMAC_AESCTR = 1;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_PROTECTION_NONE = 0;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_PROTECTION_TYPE_MAX = 63;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_PROTECTION_TYPE_MIN = 0;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_PROTOCOL_VERSION_MAX = 15;
    public static final byte VALUES_SECURE_CHANNEL_MESSAGE_PROTOCOL_VERSION_MIN = 0;

    private UtilitiesSDKConstants() {
    }
}
