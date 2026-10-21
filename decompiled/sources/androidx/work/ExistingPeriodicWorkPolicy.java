package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ExistingPeriodicWorkPolicy {
    private static final /* synthetic */ ExistingPeriodicWorkPolicy[] $VALUES;
    public static final ExistingPeriodicWorkPolicy KEEP;
    public static final ExistingPeriodicWorkPolicy REPLACE;

    static {
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = new ExistingPeriodicWorkPolicy("REPLACE", 0);
        REPLACE = existingPeriodicWorkPolicy;
        ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy2 = new ExistingPeriodicWorkPolicy("KEEP", 1);
        KEEP = existingPeriodicWorkPolicy2;
        $VALUES = new ExistingPeriodicWorkPolicy[]{existingPeriodicWorkPolicy, existingPeriodicWorkPolicy2};
    }

    public ExistingPeriodicWorkPolicy() {
        throw null;
    }

    public static ExistingPeriodicWorkPolicy valueOf(String str) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, str);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) $VALUES.clone();
    }
}
