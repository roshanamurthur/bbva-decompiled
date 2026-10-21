package com.bumptech.glide.load;

import com.noknok.android.uaf.framework.service.ASMCommunicationClientProxy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class DataSource {
    private static final /* synthetic */ DataSource[] $VALUES;
    public static final DataSource DATA_DISK_CACHE;
    public static final DataSource LOCAL;
    public static final DataSource MEMORY_CACHE;
    public static final DataSource REMOTE;
    public static final DataSource RESOURCE_DISK_CACHE;

    static {
        DataSource dataSource = new DataSource(ASMCommunicationClientProxy.ASMDestinationType.ASM_LOCAL, 0);
        LOCAL = dataSource;
        DataSource dataSource2 = new DataSource("REMOTE", 1);
        REMOTE = dataSource2;
        DataSource dataSource3 = new DataSource("DATA_DISK_CACHE", 2);
        DATA_DISK_CACHE = dataSource3;
        DataSource dataSource4 = new DataSource("RESOURCE_DISK_CACHE", 3);
        RESOURCE_DISK_CACHE = dataSource4;
        DataSource dataSource5 = new DataSource("MEMORY_CACHE", 4);
        MEMORY_CACHE = dataSource5;
        $VALUES = new DataSource[]{dataSource, dataSource2, dataSource3, dataSource4, dataSource5};
    }

    public DataSource() {
        throw null;
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) $VALUES.clone();
    }
}
