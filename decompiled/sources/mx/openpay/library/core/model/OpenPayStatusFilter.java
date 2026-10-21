package mx.openpay.library.core.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lmx/openpay/library/core/model/OpenPayStatusFilter;", "", "COMPLETED", "FAILED", "CHARGE_PENDING", "CANCELLED", "ERROR", "library_release"}, k = 1, mv = {1, 8, 0})
public final class OpenPayStatusFilter {
    private static final /* synthetic */ OpenPayStatusFilter[] $VALUES;
    public static final OpenPayStatusFilter CANCELLED;
    public static final OpenPayStatusFilter CHARGE_PENDING;
    public static final OpenPayStatusFilter COMPLETED;
    public static final OpenPayStatusFilter ERROR;
    public static final OpenPayStatusFilter FAILED;

    static {
        OpenPayStatusFilter openPayStatusFilter = new OpenPayStatusFilter("COMPLETED", 0);
        COMPLETED = openPayStatusFilter;
        OpenPayStatusFilter openPayStatusFilter2 = new OpenPayStatusFilter("FAILED", 1);
        FAILED = openPayStatusFilter2;
        OpenPayStatusFilter openPayStatusFilter3 = new OpenPayStatusFilter("CHARGE_PENDING", 2);
        CHARGE_PENDING = openPayStatusFilter3;
        OpenPayStatusFilter openPayStatusFilter4 = new OpenPayStatusFilter("CANCELLED", 3);
        CANCELLED = openPayStatusFilter4;
        OpenPayStatusFilter openPayStatusFilter5 = new OpenPayStatusFilter("ERROR", 4);
        ERROR = openPayStatusFilter5;
        $VALUES = new OpenPayStatusFilter[]{openPayStatusFilter, openPayStatusFilter2, openPayStatusFilter3, openPayStatusFilter4, openPayStatusFilter5};
    }

    public OpenPayStatusFilter() {
        throw null;
    }

    public static OpenPayStatusFilter valueOf(String str) {
        return (OpenPayStatusFilter) Enum.valueOf(OpenPayStatusFilter.class, str);
    }

    public static OpenPayStatusFilter[] values() {
        return (OpenPayStatusFilter[]) $VALUES.clone();
    }
}
