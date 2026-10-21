package net.lingala.zip4j.model.enums;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class EncryptionMethod {
    private static final /* synthetic */ EncryptionMethod[] $VALUES;
    public static final EncryptionMethod AES;
    public static final EncryptionMethod NONE;
    public static final EncryptionMethod ZIP_STANDARD;
    public static final EncryptionMethod ZIP_STANDARD_VARIANT_STRONG;

    static {
        EncryptionMethod encryptionMethod = new EncryptionMethod(ExpectedUserActionOnPoiTypes.NONE, 0);
        NONE = encryptionMethod;
        EncryptionMethod encryptionMethod2 = new EncryptionMethod("ZIP_STANDARD", 1);
        ZIP_STANDARD = encryptionMethod2;
        EncryptionMethod encryptionMethod3 = new EncryptionMethod("ZIP_STANDARD_VARIANT_STRONG", 2);
        ZIP_STANDARD_VARIANT_STRONG = encryptionMethod3;
        EncryptionMethod encryptionMethod4 = new EncryptionMethod("AES", 3);
        AES = encryptionMethod4;
        $VALUES = new EncryptionMethod[]{encryptionMethod, encryptionMethod2, encryptionMethod3, encryptionMethod4};
    }

    public EncryptionMethod() {
        throw null;
    }

    public static EncryptionMethod valueOf(String str) {
        return (EncryptionMethod) Enum.valueOf(EncryptionMethod.class, str);
    }

    public static EncryptionMethod[] values() {
        return (EncryptionMethod[]) $VALUES.clone();
    }
}
