package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Intrinsics.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@PublishedApi
public final class CoroutineSingletons {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoroutineSingletons[] $VALUES;
    public static final CoroutineSingletons COROUTINE_SUSPENDED;
    public static final CoroutineSingletons RESUMED;
    public static final CoroutineSingletons UNDECIDED;

    static {
        CoroutineSingletons coroutineSingletons = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        COROUTINE_SUSPENDED = coroutineSingletons;
        CoroutineSingletons coroutineSingletons2 = new CoroutineSingletons("UNDECIDED", 1);
        UNDECIDED = coroutineSingletons2;
        CoroutineSingletons coroutineSingletons3 = new CoroutineSingletons("RESUMED", 2);
        RESUMED = coroutineSingletons3;
        CoroutineSingletons[] coroutineSingletonsArr = {coroutineSingletons, coroutineSingletons2, coroutineSingletons3};
        $VALUES = coroutineSingletonsArr;
        $ENTRIES = EnumEntriesKt.enumEntries(coroutineSingletonsArr);
    }

    public CoroutineSingletons() {
        throw null;
    }

    @NotNull
    public static EnumEntries<CoroutineSingletons> getEntries() {
        return $ENTRIES;
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) $VALUES.clone();
    }
}
