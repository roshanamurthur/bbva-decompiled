package com.bbva.glomo.storage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TargetStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomo/storage/TargetStorage;", "", "Local", "Shared", "All", "gl-local-storage_release"}, k = 1, mv = {1, 9, 0})
public final class TargetStorage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TargetStorage[] $VALUES;
    public static final TargetStorage All;
    public static final TargetStorage Local;
    public static final TargetStorage Shared;

    static {
        TargetStorage targetStorage = new TargetStorage("Local", 0);
        Local = targetStorage;
        TargetStorage targetStorage2 = new TargetStorage("Shared", 1);
        Shared = targetStorage2;
        TargetStorage targetStorage3 = new TargetStorage("All", 2);
        All = targetStorage3;
        TargetStorage[] targetStorageArr = {targetStorage, targetStorage2, targetStorage3};
        $VALUES = targetStorageArr;
        $ENTRIES = EnumEntriesKt.enumEntries(targetStorageArr);
    }

    public TargetStorage() {
        throw null;
    }

    @NotNull
    public static EnumEntries<TargetStorage> getEntries() {
        return $ENTRIES;
    }

    public static TargetStorage valueOf(String str) {
        return (TargetStorage) Enum.valueOf(TargetStorage.class, str);
    }

    public static TargetStorage[] values() {
        return (TargetStorage[]) $VALUES.clone();
    }
}
