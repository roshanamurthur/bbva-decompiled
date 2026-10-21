package org.koin.core.definition;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BeanDefinition.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lorg/koin/core/definition/Kind;", "", "Singleton", "Factory", "Scoped", "koin-core"}, k = 1, mv = {1, 8, 0})
public final class Kind {
    private static final /* synthetic */ Kind[] $VALUES;
    public static final Kind Factory;
    public static final Kind Scoped;
    public static final Kind Singleton;

    static {
        Kind kind = new Kind("Singleton", 0);
        Singleton = kind;
        Kind kind2 = new Kind("Factory", 1);
        Factory = kind2;
        Kind kind3 = new Kind("Scoped", 2);
        Scoped = kind3;
        $VALUES = new Kind[]{kind, kind2, kind3};
    }

    public Kind() {
        throw null;
    }

    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    public static Kind[] values() {
        return (Kind[]) $VALUES.clone();
    }
}
