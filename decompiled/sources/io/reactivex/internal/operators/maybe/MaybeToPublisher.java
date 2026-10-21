package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class MaybeToPublisher implements Function<MaybeSource<Object>, Publisher<Object>> {
    private static final /* synthetic */ MaybeToPublisher[] $VALUES;
    public static final MaybeToPublisher INSTANCE;

    static {
        MaybeToPublisher maybeToPublisher = new MaybeToPublisher("INSTANCE", 0);
        INSTANCE = maybeToPublisher;
        $VALUES = new MaybeToPublisher[]{maybeToPublisher};
    }

    public MaybeToPublisher() {
        throw null;
    }

    public static <T> Function<MaybeSource<T>, Publisher<T>> instance() {
        return INSTANCE;
    }

    public static MaybeToPublisher valueOf(String str) {
        return (MaybeToPublisher) Enum.valueOf(MaybeToPublisher.class, str);
    }

    public static MaybeToPublisher[] values() {
        return (MaybeToPublisher[]) $VALUES.clone();
    }

    @Override // io.reactivex.functions.Function
    public Publisher<Object> apply(MaybeSource<Object> maybeSource) throws Exception {
        return new MaybeToFlowable(maybeSource);
    }
}
