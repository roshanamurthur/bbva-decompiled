package mx.openpay.library.domain.model.transaction;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TransactionFilter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lmx/openpay/library/domain/model/transaction/StatusFilter;", "", "COMPLETED", "FAILED", "CHARGE_PENDING", "CANCELLED", "ERROR", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class StatusFilter {
    private static final /* synthetic */ StatusFilter[] $VALUES;
    public static final StatusFilter CANCELLED;
    public static final StatusFilter CHARGE_PENDING;
    public static final StatusFilter COMPLETED;
    public static final StatusFilter ERROR;
    public static final StatusFilter FAILED;

    static {
        StatusFilter statusFilter = new StatusFilter("COMPLETED", 0);
        COMPLETED = statusFilter;
        StatusFilter statusFilter2 = new StatusFilter("FAILED", 1);
        FAILED = statusFilter2;
        StatusFilter statusFilter3 = new StatusFilter("CHARGE_PENDING", 2);
        CHARGE_PENDING = statusFilter3;
        StatusFilter statusFilter4 = new StatusFilter("CANCELLED", 3);
        CANCELLED = statusFilter4;
        StatusFilter statusFilter5 = new StatusFilter("ERROR", 4);
        ERROR = statusFilter5;
        $VALUES = new StatusFilter[]{statusFilter, statusFilter2, statusFilter3, statusFilter4, statusFilter5};
    }

    public StatusFilter() {
        throw null;
    }

    public static StatusFilter valueOf(String str) {
        return (StatusFilter) Enum.valueOf(StatusFilter.class, str);
    }

    public static StatusFilter[] values() {
        return (StatusFilter[]) $VALUES.clone();
    }
}
