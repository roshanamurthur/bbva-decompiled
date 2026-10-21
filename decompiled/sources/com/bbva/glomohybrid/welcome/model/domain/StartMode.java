package com.bbva.glomohybrid.welcome.model.domain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: StartMode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/StartMode;", "", "FIRST_START", "UPDATE_START", "REGULAR_START", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class StartMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StartMode[] $VALUES;
    public static final StartMode FIRST_START;
    public static final StartMode REGULAR_START;
    public static final StartMode UPDATE_START;

    static {
        StartMode startMode = new StartMode("FIRST_START", 0);
        FIRST_START = startMode;
        StartMode startMode2 = new StartMode("UPDATE_START", 1);
        UPDATE_START = startMode2;
        StartMode startMode3 = new StartMode("REGULAR_START", 2);
        REGULAR_START = startMode3;
        StartMode[] startModeArr = {startMode, startMode2, startMode3};
        $VALUES = startModeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(startModeArr);
    }

    public StartMode() {
        throw null;
    }

    @NotNull
    public static EnumEntries<StartMode> getEntries() {
        return $ENTRIES;
    }

    public static StartMode valueOf(String str) {
        return (StartMode) Enum.valueOf(StartMode.class, str);
    }

    public static StartMode[] values() {
        return (StartMode[]) $VALUES.clone();
    }
}
