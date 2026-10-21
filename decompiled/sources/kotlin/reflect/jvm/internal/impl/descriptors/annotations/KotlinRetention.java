package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: KotlinRetention.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class KotlinRetention {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KotlinRetention[] $VALUES;
    public static final KotlinRetention BINARY;
    public static final KotlinRetention RUNTIME;
    public static final KotlinRetention SOURCE;

    static {
        KotlinRetention kotlinRetention = new KotlinRetention("RUNTIME", 0);
        RUNTIME = kotlinRetention;
        KotlinRetention kotlinRetention2 = new KotlinRetention("BINARY", 1);
        BINARY = kotlinRetention2;
        KotlinRetention kotlinRetention3 = new KotlinRetention("SOURCE", 2);
        SOURCE = kotlinRetention3;
        KotlinRetention[] kotlinRetentionArr = {kotlinRetention, kotlinRetention2, kotlinRetention3};
        $VALUES = kotlinRetentionArr;
        $ENTRIES = EnumEntriesKt.enumEntries(kotlinRetentionArr);
    }

    public KotlinRetention() {
        throw null;
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) $VALUES.clone();
    }
}
