package com.bbva.ethermobilesdk.sharedstorage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: StoreChain.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/StorageLevel;", "", "Internal", "All", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final class StorageLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StorageLevel[] $VALUES;
    public static final StorageLevel All;
    public static final StorageLevel Internal;

    static {
        StorageLevel storageLevel = new StorageLevel("Internal", 0);
        Internal = storageLevel;
        StorageLevel storageLevel2 = new StorageLevel("All", 1);
        All = storageLevel2;
        StorageLevel[] storageLevelArr = {storageLevel, storageLevel2};
        $VALUES = storageLevelArr;
        $ENTRIES = EnumEntriesKt.enumEntries(storageLevelArr);
    }

    public StorageLevel() {
        throw null;
    }

    @NotNull
    public static EnumEntries<StorageLevel> getEntries() {
        return $ENTRIES;
    }

    public static StorageLevel valueOf(String str) {
        return (StorageLevel) Enum.valueOf(StorageLevel.class, str);
    }

    public static StorageLevel[] values() {
        return (StorageLevel[]) $VALUES.clone();
    }
}
