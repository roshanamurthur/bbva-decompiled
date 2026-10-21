package io.reactivex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class BackpressureOverflowStrategy {
    private static final /* synthetic */ BackpressureOverflowStrategy[] $VALUES;
    public static final BackpressureOverflowStrategy DROP_LATEST;
    public static final BackpressureOverflowStrategy DROP_OLDEST;
    public static final BackpressureOverflowStrategy ERROR;

    static {
        BackpressureOverflowStrategy backpressureOverflowStrategy = new BackpressureOverflowStrategy("ERROR", 0);
        ERROR = backpressureOverflowStrategy;
        BackpressureOverflowStrategy backpressureOverflowStrategy2 = new BackpressureOverflowStrategy("DROP_OLDEST", 1);
        DROP_OLDEST = backpressureOverflowStrategy2;
        BackpressureOverflowStrategy backpressureOverflowStrategy3 = new BackpressureOverflowStrategy("DROP_LATEST", 2);
        DROP_LATEST = backpressureOverflowStrategy3;
        $VALUES = new BackpressureOverflowStrategy[]{backpressureOverflowStrategy, backpressureOverflowStrategy2, backpressureOverflowStrategy3};
    }

    public BackpressureOverflowStrategy() {
        throw null;
    }

    public static BackpressureOverflowStrategy valueOf(String str) {
        return (BackpressureOverflowStrategy) Enum.valueOf(BackpressureOverflowStrategy.class, str);
    }

    public static BackpressureOverflowStrategy[] values() {
        return (BackpressureOverflowStrategy[]) $VALUES.clone();
    }
}
