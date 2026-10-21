package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Priority {
    private static final /* synthetic */ Priority[] $VALUES;
    public static final Priority HIGH;
    public static final Priority IMMEDIATE;
    public static final Priority LOW;
    public static final Priority NORMAL;

    static {
        Priority priority = new Priority("IMMEDIATE", 0);
        IMMEDIATE = priority;
        Priority priority2 = new Priority("HIGH", 1);
        HIGH = priority2;
        Priority priority3 = new Priority("NORMAL", 2);
        NORMAL = priority3;
        Priority priority4 = new Priority("LOW", 3);
        LOW = priority4;
        $VALUES = new Priority[]{priority, priority2, priority3, priority4};
    }

    public Priority() {
        throw null;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }
}
