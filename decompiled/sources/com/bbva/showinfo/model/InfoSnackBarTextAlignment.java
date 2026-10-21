package com.bbva.showinfo.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/showinfo/model/InfoSnackBarTextAlignment;", "", "START", "CENTER", "END", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class InfoSnackBarTextAlignment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InfoSnackBarTextAlignment[] $VALUES;
    public static final InfoSnackBarTextAlignment CENTER;
    public static final InfoSnackBarTextAlignment END;
    public static final InfoSnackBarTextAlignment START;

    static {
        InfoSnackBarTextAlignment infoSnackBarTextAlignment = new InfoSnackBarTextAlignment("START", 0);
        START = infoSnackBarTextAlignment;
        InfoSnackBarTextAlignment infoSnackBarTextAlignment2 = new InfoSnackBarTextAlignment("CENTER", 1);
        CENTER = infoSnackBarTextAlignment2;
        InfoSnackBarTextAlignment infoSnackBarTextAlignment3 = new InfoSnackBarTextAlignment("END", 2);
        END = infoSnackBarTextAlignment3;
        InfoSnackBarTextAlignment[] infoSnackBarTextAlignmentArr = {infoSnackBarTextAlignment, infoSnackBarTextAlignment2, infoSnackBarTextAlignment3};
        $VALUES = infoSnackBarTextAlignmentArr;
        $ENTRIES = EnumEntriesKt.enumEntries(infoSnackBarTextAlignmentArr);
    }

    public InfoSnackBarTextAlignment() {
        throw null;
    }

    @NotNull
    public static EnumEntries<InfoSnackBarTextAlignment> getEntries() {
        return $ENTRIES;
    }

    public static InfoSnackBarTextAlignment valueOf(String str) {
        return (InfoSnackBarTextAlignment) Enum.valueOf(InfoSnackBarTextAlignment.class, str);
    }

    public static InfoSnackBarTextAlignment[] values() {
        return (InfoSnackBarTextAlignment[]) $VALUES.clone();
    }
}
