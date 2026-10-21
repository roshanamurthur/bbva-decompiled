package io.reactivex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class BackpressureStrategy {
    private static final /* synthetic */ BackpressureStrategy[] $VALUES;
    public static final BackpressureStrategy BUFFER;
    public static final BackpressureStrategy DROP;
    public static final BackpressureStrategy ERROR;
    public static final BackpressureStrategy LATEST;
    public static final BackpressureStrategy MISSING;

    static {
        BackpressureStrategy backpressureStrategy = new BackpressureStrategy("MISSING", 0);
        MISSING = backpressureStrategy;
        BackpressureStrategy backpressureStrategy2 = new BackpressureStrategy("ERROR", 1);
        ERROR = backpressureStrategy2;
        BackpressureStrategy backpressureStrategy3 = new BackpressureStrategy("BUFFER", 2);
        BUFFER = backpressureStrategy3;
        BackpressureStrategy backpressureStrategy4 = new BackpressureStrategy("DROP", 3);
        DROP = backpressureStrategy4;
        BackpressureStrategy backpressureStrategy5 = new BackpressureStrategy("LATEST", 4);
        LATEST = backpressureStrategy5;
        $VALUES = new BackpressureStrategy[]{backpressureStrategy, backpressureStrategy2, backpressureStrategy3, backpressureStrategy4, backpressureStrategy5};
    }

    public BackpressureStrategy() {
        throw null;
    }

    public static BackpressureStrategy valueOf(String str) {
        return (BackpressureStrategy) Enum.valueOf(BackpressureStrategy.class, str);
    }

    public static BackpressureStrategy[] values() {
        return (BackpressureStrategy[]) $VALUES.clone();
    }
}
