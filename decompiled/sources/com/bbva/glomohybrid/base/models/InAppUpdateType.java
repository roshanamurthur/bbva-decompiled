package com.bbva.glomohybrid.base.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: InAppUpdateType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/base/models/InAppUpdateType;", "", "IMMEDIATE", "FLEXIBLE", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class InAppUpdateType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InAppUpdateType[] $VALUES;
    public static final InAppUpdateType FLEXIBLE;
    public static final InAppUpdateType IMMEDIATE;

    static {
        InAppUpdateType inAppUpdateType = new InAppUpdateType("IMMEDIATE", 0);
        IMMEDIATE = inAppUpdateType;
        InAppUpdateType inAppUpdateType2 = new InAppUpdateType("FLEXIBLE", 1);
        FLEXIBLE = inAppUpdateType2;
        InAppUpdateType[] inAppUpdateTypeArr = {inAppUpdateType, inAppUpdateType2};
        $VALUES = inAppUpdateTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(inAppUpdateTypeArr);
    }

    public InAppUpdateType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<InAppUpdateType> getEntries() {
        return $ENTRIES;
    }

    public static InAppUpdateType valueOf(String str) {
        return (InAppUpdateType) Enum.valueOf(InAppUpdateType.class, str);
    }

    public static InAppUpdateType[] values() {
        return (InAppUpdateType[]) $VALUES.clone();
    }
}
