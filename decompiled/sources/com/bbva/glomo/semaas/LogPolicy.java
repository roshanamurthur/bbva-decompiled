package com.bbva.glomo.semaas;

import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LogPolicy.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/semaas/LogPolicy;", "", "Lcom/bbva/glomo/semaas/FilterLogLevel;", "filterLogLevel", "", "filterLogLevels", "", "allowsLog", "Scale", "Fixed", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class LogPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogPolicy[] $VALUES;
    public static final LogPolicy Fixed;
    public static final LogPolicy Scale;

    /* JADX INFO: compiled from: LogPolicy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogPolicy.values().length];
            try {
                iArr[LogPolicy.Scale.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogPolicy.Fixed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LogPolicy logPolicy = new LogPolicy("Scale", 0);
        Scale = logPolicy;
        LogPolicy logPolicy2 = new LogPolicy("Fixed", 1);
        Fixed = logPolicy2;
        LogPolicy[] logPolicyArr = {logPolicy, logPolicy2};
        $VALUES = logPolicyArr;
        $ENTRIES = EnumEntriesKt.enumEntries(logPolicyArr);
    }

    public LogPolicy() {
        throw null;
    }

    @NotNull
    public static EnumEntries<LogPolicy> getEntries() {
        return $ENTRIES;
    }

    public static LogPolicy valueOf(String str) {
        return (LogPolicy) Enum.valueOf(LogPolicy.class, str);
    }

    public static LogPolicy[] values() {
        return (LogPolicy[]) $VALUES.clone();
    }

    public final boolean allowsLog(@NotNull FilterLogLevel filterLogLevel, @NotNull Set<? extends FilterLogLevel> filterLogLevels) {
        Intrinsics.checkNotNullParameter(filterLogLevel, "filterLogLevel");
        Intrinsics.checkNotNullParameter(filterLogLevels, "filterLogLevels");
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return filterLogLevels.contains(filterLogLevel);
            }
            throw new NoWhenBranchMatchedException();
        }
        int value = filterLogLevel.getValue();
        FilterLogLevel filterLogLevel2 = (FilterLogLevel) CollectionsKt___CollectionsKt.firstOrNull(filterLogLevels);
        return value > (filterLogLevel2 != null ? filterLogLevel2.getValue() : FilterLogLevel.Off.getValue());
    }
}
