package io.reactivex.rxjava3.parallel;

import io.reactivex.rxjava3.functions.BiFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ParallelFailureHandling implements BiFunction<Long, Throwable, ParallelFailureHandling> {
    private static final /* synthetic */ ParallelFailureHandling[] $VALUES;
    public static final ParallelFailureHandling ERROR;
    public static final ParallelFailureHandling RETRY;
    public static final ParallelFailureHandling SKIP;
    public static final ParallelFailureHandling STOP;

    static {
        ParallelFailureHandling parallelFailureHandling = new ParallelFailureHandling("STOP", 0);
        STOP = parallelFailureHandling;
        ParallelFailureHandling parallelFailureHandling2 = new ParallelFailureHandling("ERROR", 1);
        ERROR = parallelFailureHandling2;
        ParallelFailureHandling parallelFailureHandling3 = new ParallelFailureHandling("SKIP", 2);
        SKIP = parallelFailureHandling3;
        ParallelFailureHandling parallelFailureHandling4 = new ParallelFailureHandling("RETRY", 3);
        RETRY = parallelFailureHandling4;
        $VALUES = new ParallelFailureHandling[]{parallelFailureHandling, parallelFailureHandling2, parallelFailureHandling3, parallelFailureHandling4};
    }

    public ParallelFailureHandling() {
        throw null;
    }

    public static ParallelFailureHandling valueOf(String str) {
        return (ParallelFailureHandling) Enum.valueOf(ParallelFailureHandling.class, str);
    }

    public static ParallelFailureHandling[] values() {
        return (ParallelFailureHandling[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public ParallelFailureHandling apply(Long l6, Throwable th2) {
        return this;
    }
}
