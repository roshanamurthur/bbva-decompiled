package com.bbva.glomohybrid.profiling.domain.model;

import com.noknok.android.uaf.framework.service.ASMCommunicationClientProxy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ProfilingStorePolicy.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/profiling/domain/model/ProfilingStorePolicy;", "", ASMCommunicationClientProxy.ASMDestinationType.ASM_LOCAL, "REMOTE", "CHECK_LOCAL_FIRST", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
public final class ProfilingStorePolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfilingStorePolicy[] $VALUES;
    public static final ProfilingStorePolicy CHECK_LOCAL_FIRST;
    public static final ProfilingStorePolicy LOCAL;
    public static final ProfilingStorePolicy REMOTE;

    static {
        ProfilingStorePolicy profilingStorePolicy = new ProfilingStorePolicy(ASMCommunicationClientProxy.ASMDestinationType.ASM_LOCAL, 0);
        LOCAL = profilingStorePolicy;
        ProfilingStorePolicy profilingStorePolicy2 = new ProfilingStorePolicy("REMOTE", 1);
        REMOTE = profilingStorePolicy2;
        ProfilingStorePolicy profilingStorePolicy3 = new ProfilingStorePolicy("CHECK_LOCAL_FIRST", 2);
        CHECK_LOCAL_FIRST = profilingStorePolicy3;
        ProfilingStorePolicy[] profilingStorePolicyArr = {profilingStorePolicy, profilingStorePolicy2, profilingStorePolicy3};
        $VALUES = profilingStorePolicyArr;
        $ENTRIES = EnumEntriesKt.enumEntries(profilingStorePolicyArr);
    }

    public ProfilingStorePolicy() {
        throw null;
    }

    @NotNull
    public static EnumEntries<ProfilingStorePolicy> getEntries() {
        return $ENTRIES;
    }

    public static ProfilingStorePolicy valueOf(String str) {
        return (ProfilingStorePolicy) Enum.valueOf(ProfilingStorePolicy.class, str);
    }

    public static ProfilingStorePolicy[] values() {
        return (ProfilingStorePolicy[]) $VALUES.clone();
    }
}
