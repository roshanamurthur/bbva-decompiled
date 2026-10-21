package com.bbva.ethermobilesdk.securesharing.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ProviderStatus.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/model/ProviderStatus;", "", "UNINSTALLED", "DISABLED", "UNSAFE", "OK", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class ProviderStatus {
    private static final /* synthetic */ ProviderStatus[] $VALUES;
    public static final ProviderStatus DISABLED;
    public static final ProviderStatus OK;
    public static final ProviderStatus UNINSTALLED;
    public static final ProviderStatus UNSAFE;

    static {
        ProviderStatus providerStatus = new ProviderStatus("UNINSTALLED", 0);
        UNINSTALLED = providerStatus;
        ProviderStatus providerStatus2 = new ProviderStatus("DISABLED", 1);
        DISABLED = providerStatus2;
        ProviderStatus providerStatus3 = new ProviderStatus("UNSAFE", 2);
        UNSAFE = providerStatus3;
        ProviderStatus providerStatus4 = new ProviderStatus("OK", 3);
        OK = providerStatus4;
        $VALUES = new ProviderStatus[]{providerStatus, providerStatus2, providerStatus3, providerStatus4};
    }

    public ProviderStatus() {
        throw null;
    }

    public static ProviderStatus valueOf(String str) {
        return (ProviderStatus) Enum.valueOf(ProviderStatus.class, str);
    }

    public static ProviderStatus[] values() {
        return (ProviderStatus[]) $VALUES.clone();
    }
}
