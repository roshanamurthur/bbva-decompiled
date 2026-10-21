package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class BackoffPolicy {
    private static final /* synthetic */ BackoffPolicy[] $VALUES;
    public static final BackoffPolicy EXPONENTIAL;
    public static final BackoffPolicy LINEAR;

    static {
        BackoffPolicy backoffPolicy = new BackoffPolicy("EXPONENTIAL", 0);
        EXPONENTIAL = backoffPolicy;
        BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
        LINEAR = backoffPolicy2;
        $VALUES = new BackoffPolicy[]{backoffPolicy, backoffPolicy2};
    }

    public BackoffPolicy() {
        throw null;
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) $VALUES.clone();
    }
}
