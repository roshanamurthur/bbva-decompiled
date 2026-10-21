package mx.openpay.library.core.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/core/model/OpenPayProductType;", "", "TAP_ON_PHONE", "MPOS", "PAYMENT_LINK", "library_release"}, k = 1, mv = {1, 8, 0})
public final class OpenPayProductType {
    private static final /* synthetic */ OpenPayProductType[] $VALUES;
    public static final OpenPayProductType MPOS;
    public static final OpenPayProductType PAYMENT_LINK;
    public static final OpenPayProductType TAP_ON_PHONE;

    static {
        OpenPayProductType openPayProductType = new OpenPayProductType("TAP_ON_PHONE", 0);
        TAP_ON_PHONE = openPayProductType;
        OpenPayProductType openPayProductType2 = new OpenPayProductType("MPOS", 1);
        MPOS = openPayProductType2;
        OpenPayProductType openPayProductType3 = new OpenPayProductType("PAYMENT_LINK", 2);
        PAYMENT_LINK = openPayProductType3;
        $VALUES = new OpenPayProductType[]{openPayProductType, openPayProductType2, openPayProductType3};
    }

    public OpenPayProductType() {
        throw null;
    }

    public static OpenPayProductType valueOf(String str) {
        return (OpenPayProductType) Enum.valueOf(OpenPayProductType.class, str);
    }

    public static OpenPayProductType[] values() {
        return (OpenPayProductType[]) $VALUES.clone();
    }
}
