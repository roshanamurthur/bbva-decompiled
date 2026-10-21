package com.bbva.component.ui.modal.halfmodal.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: HalfModalType.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalType;", "", "DEFAULT", "GENDER", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class HalfModalType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HalfModalType[] $VALUES;
    public static final HalfModalType DEFAULT;
    public static final HalfModalType GENDER;

    static {
        HalfModalType halfModalType = new HalfModalType("DEFAULT", 0);
        DEFAULT = halfModalType;
        HalfModalType halfModalType2 = new HalfModalType("GENDER", 1);
        GENDER = halfModalType2;
        HalfModalType[] halfModalTypeArr = {halfModalType, halfModalType2};
        $VALUES = halfModalTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(halfModalTypeArr);
    }

    public HalfModalType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<HalfModalType> getEntries() {
        return $ENTRIES;
    }

    public static HalfModalType valueOf(String str) {
        return (HalfModalType) Enum.valueOf(HalfModalType.class, str);
    }

    public static HalfModalType[] values() {
        return (HalfModalType[]) $VALUES.clone();
    }
}
