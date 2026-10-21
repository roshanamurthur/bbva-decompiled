package com.bbva.ethermobilesdk.token.constant;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Constant.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\b\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0005\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0014\u0010\f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0014\u0010\r\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0002\"\u0014\u0010\u000e\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0002\"\u0014\u0010\u0016\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0002¨\u0006\u0017"}, d2 = {"", "KEYPAIR_ALGORITHM", "Ljava/lang/String;", "", "KEYPAIR_SIZE_BITS", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "PWD_SALT_LENGTH", "PWD_KEYFACTORY_ALGORITHM", "PWD_KEYSPEC_ALGORITHM", "PWD_KEY_LENGTH", "PWD_ITERATIONS", "AUTHCODE_HASH_ALGORITHM", "DEVICEINFO_HASH_ALGORITHM", "CIPHER_BYTE_ALGORITHM", "SEED_DECRYPT_ALGORITHM", "", "a", "[B", "getCIPHER_BYTE_IV", "()[B", "CIPHER_BYTE_IV", "ISO_DATE_FORMAT", "DEFAULT_PROTOCOL_VERSION", "ethertoken_release"}, k = 2, mv = {1, 8, 0})
public final class ConstantKt {

    @NotNull
    public static final String AUTHCODE_HASH_ALGORITHM = "SHA-256";

    @NotNull
    public static final String CIPHER_BYTE_ALGORITHM = "AES/CBC/PKCS5Padding";

    @NotNull
    public static final String DEFAULT_PROTOCOL_VERSION = "1.0";

    @NotNull
    public static final String DEVICEINFO_HASH_ALGORITHM = "SHA-256";

    @NotNull
    public static final String ISO_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    @NotNull
    public static final String KEYPAIR_ALGORITHM = "RSA";
    public static final int KEYPAIR_SIZE_BITS = 2048;
    public static final int PWD_ITERATIONS = 1000;

    @NotNull
    public static final String PWD_KEYFACTORY_ALGORITHM = "PBKDF2WithHmacSHA1";

    @NotNull
    public static final String PWD_KEYSPEC_ALGORITHM = "AES";
    public static final int PWD_KEY_LENGTH = 256;
    public static final int PWD_SALT_LENGTH = 8;

    @NotNull
    public static final String SEED_DECRYPT_ALGORITHM = "RSA/ECB/PKCS1Padding";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f30095a = new byte[16];

    @NotNull
    public static final byte[] getCIPHER_BYTE_IV() {
        return f30095a;
    }
}
