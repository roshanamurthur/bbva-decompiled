package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "IGNORED", "SCHEDULED", "DEFERRED", "IMMINENT", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class InvalidationResult {
    private static final /* synthetic */ InvalidationResult[] $VALUES;
    public static final InvalidationResult DEFERRED;
    public static final InvalidationResult IGNORED;
    public static final InvalidationResult IMMINENT;
    public static final InvalidationResult SCHEDULED;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        IGNORED = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        SCHEDULED = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        DEFERRED = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        IMMINENT = invalidationResult4;
        $VALUES = new InvalidationResult[]{invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
    }

    public InvalidationResult() {
        throw null;
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) $VALUES.clone();
    }
}
