package com.bbva.glomoutils.time;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DateComparison.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomoutils/time/DateComparison;", "", "LOWER", "EQUALS", "HIGHER", "gl-utils_release"}, k = 1, mv = {1, 9, 0})
public final class DateComparison {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DateComparison[] $VALUES;
    public static final DateComparison EQUALS;
    public static final DateComparison HIGHER;
    public static final DateComparison LOWER;

    static {
        DateComparison dateComparison = new DateComparison("LOWER", 0);
        LOWER = dateComparison;
        DateComparison dateComparison2 = new DateComparison("EQUALS", 1);
        EQUALS = dateComparison2;
        DateComparison dateComparison3 = new DateComparison("HIGHER", 2);
        HIGHER = dateComparison3;
        DateComparison[] dateComparisonArr = {dateComparison, dateComparison2, dateComparison3};
        $VALUES = dateComparisonArr;
        $ENTRIES = EnumEntriesKt.enumEntries(dateComparisonArr);
    }

    public DateComparison() {
        throw null;
    }

    @NotNull
    public static EnumEntries<DateComparison> getEntries() {
        return $ENTRIES;
    }

    public static DateComparison valueOf(String str) {
        return (DateComparison) Enum.valueOf(DateComparison.class, str);
    }

    public static DateComparison[] values() {
        return (DateComparison[]) $VALUES.clone();
    }
}
