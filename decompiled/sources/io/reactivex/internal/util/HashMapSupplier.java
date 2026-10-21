package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class HashMapSupplier implements Callable<Map<Object, Object>> {
    private static final /* synthetic */ HashMapSupplier[] $VALUES;
    public static final HashMapSupplier INSTANCE;

    static {
        HashMapSupplier hashMapSupplier = new HashMapSupplier("INSTANCE", 0);
        INSTANCE = hashMapSupplier;
        $VALUES = new HashMapSupplier[]{hashMapSupplier};
    }

    public HashMapSupplier() {
        throw null;
    }

    public static <K, V> Callable<Map<K, V>> asCallable() {
        return INSTANCE;
    }

    public static HashMapSupplier valueOf(String str) {
        return (HashMapSupplier) Enum.valueOf(HashMapSupplier.class, str);
    }

    public static HashMapSupplier[] values() {
        return (HashMapSupplier[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Callable
    public Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}
