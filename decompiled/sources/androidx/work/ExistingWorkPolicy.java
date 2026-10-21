package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ExistingWorkPolicy {
    private static final /* synthetic */ ExistingWorkPolicy[] $VALUES;
    public static final ExistingWorkPolicy APPEND;
    public static final ExistingWorkPolicy APPEND_OR_REPLACE;
    public static final ExistingWorkPolicy KEEP;
    public static final ExistingWorkPolicy REPLACE;

    static {
        ExistingWorkPolicy existingWorkPolicy = new ExistingWorkPolicy("REPLACE", 0);
        REPLACE = existingWorkPolicy;
        ExistingWorkPolicy existingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
        KEEP = existingWorkPolicy2;
        ExistingWorkPolicy existingWorkPolicy3 = new ExistingWorkPolicy("APPEND", 2);
        APPEND = existingWorkPolicy3;
        ExistingWorkPolicy existingWorkPolicy4 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
        APPEND_OR_REPLACE = existingWorkPolicy4;
        $VALUES = new ExistingWorkPolicy[]{existingWorkPolicy, existingWorkPolicy2, existingWorkPolicy3, existingWorkPolicy4};
    }

    public ExistingWorkPolicy() {
        throw null;
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) $VALUES.clone();
    }
}
