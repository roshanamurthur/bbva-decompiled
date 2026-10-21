package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.BiFunction;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ListAddBiConsumer implements BiFunction<List, Object, List> {
    private static final /* synthetic */ ListAddBiConsumer[] $VALUES;
    public static final ListAddBiConsumer INSTANCE;

    static {
        ListAddBiConsumer listAddBiConsumer = new ListAddBiConsumer("INSTANCE", 0);
        INSTANCE = listAddBiConsumer;
        $VALUES = new ListAddBiConsumer[]{listAddBiConsumer};
    }

    public ListAddBiConsumer() {
        throw null;
    }

    public static <T> BiFunction<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    public static ListAddBiConsumer valueOf(String str) {
        return (ListAddBiConsumer) Enum.valueOf(ListAddBiConsumer.class, str);
    }

    public static ListAddBiConsumer[] values() {
        return (ListAddBiConsumer[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public List apply(List list, Object obj) {
        list.add(obj);
        return list;
    }
}
