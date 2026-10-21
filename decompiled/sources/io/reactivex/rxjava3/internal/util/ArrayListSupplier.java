package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ArrayListSupplier implements Supplier<List<Object>>, Function<Object, List<Object>> {
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

    public static <T, O> Function<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static <T> Supplier<List<T>> asSupplier() {
        return INSTANCE;
    }

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public List<Object> get() {
        return new ArrayList();
    }
}
