package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ArrayListSupplier implements Callable<List<Object>>, Function<Object, List<Object>> {
    private static final /* synthetic */ ArrayListSupplier[] $VALUES;
    public static final ArrayListSupplier INSTANCE;

    static {
        ArrayListSupplier arrayListSupplier = new ArrayListSupplier("INSTANCE", 0);
        INSTANCE = arrayListSupplier;
        $VALUES = new ArrayListSupplier[]{arrayListSupplier};
    }

    public ArrayListSupplier() {
        throw null;
    }

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> Function<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) $VALUES.clone();
    }

    @Override // io.reactivex.functions.Function
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
