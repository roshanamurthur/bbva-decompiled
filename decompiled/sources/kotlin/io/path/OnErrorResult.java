package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: OnErrorResult.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.8")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/io/path/OnErrorResult;", "", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
@ExperimentalPathApi
public final class OnErrorResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnErrorResult[] $VALUES;
    public static final OnErrorResult SKIP_SUBTREE;
    public static final OnErrorResult TERMINATE;

    static {
        OnErrorResult onErrorResult = new OnErrorResult("SKIP_SUBTREE", 0);
        SKIP_SUBTREE = onErrorResult;
        OnErrorResult onErrorResult2 = new OnErrorResult("TERMINATE", 1);
        TERMINATE = onErrorResult2;
        OnErrorResult[] onErrorResultArr = {onErrorResult, onErrorResult2};
        $VALUES = onErrorResultArr;
        $ENTRIES = EnumEntriesKt.enumEntries(onErrorResultArr);
    }

    public OnErrorResult() {
        throw null;
    }

    @NotNull
    public static EnumEntries<OnErrorResult> getEntries() {
        return $ENTRIES;
    }

    public static OnErrorResult valueOf(String str) {
        return (OnErrorResult) Enum.valueOf(OnErrorResult.class, str);
    }

    public static OnErrorResult[] values() {
        return (OnErrorResult[]) $VALUES.clone();
    }
}
