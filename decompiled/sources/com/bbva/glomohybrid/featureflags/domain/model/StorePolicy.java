package com.bbva.glomohybrid.featureflags.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: StorePolicy.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/model/StorePolicy;", "", "Local", "Remote", "LocalFirst", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
public final class StorePolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StorePolicy[] $VALUES;
    public static final StorePolicy Local;
    public static final StorePolicy LocalFirst;
    public static final StorePolicy Remote;

    static {
        StorePolicy storePolicy = new StorePolicy("Local", 0);
        Local = storePolicy;
        StorePolicy storePolicy2 = new StorePolicy("Remote", 1);
        Remote = storePolicy2;
        StorePolicy storePolicy3 = new StorePolicy("LocalFirst", 2);
        LocalFirst = storePolicy3;
        StorePolicy[] storePolicyArr = {storePolicy, storePolicy2, storePolicy3};
        $VALUES = storePolicyArr;
        $ENTRIES = EnumEntriesKt.enumEntries(storePolicyArr);
    }

    public StorePolicy() {
        throw null;
    }

    @NotNull
    public static EnumEntries<StorePolicy> getEntries() {
        return $ENTRIES;
    }

    public static StorePolicy valueOf(String str) {
        return (StorePolicy) Enum.valueOf(StorePolicy.class, str);
    }

    public static StorePolicy[] values() {
        return (StorePolicy[]) $VALUES.clone();
    }
}
