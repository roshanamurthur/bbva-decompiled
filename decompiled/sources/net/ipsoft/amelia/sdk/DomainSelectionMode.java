package net.ipsoft.amelia.sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class DomainSelectionMode {
    private static final /* synthetic */ DomainSelectionMode[] $VALUES;
    public static final DomainSelectionMode automatic;
    public static final DomainSelectionMode manual;
    public static final DomainSelectionMode predefined;

    static {
        DomainSelectionMode domainSelectionMode = new DomainSelectionMode("predefined", 0);
        predefined = domainSelectionMode;
        DomainSelectionMode domainSelectionMode2 = new DomainSelectionMode("automatic", 1);
        automatic = domainSelectionMode2;
        DomainSelectionMode domainSelectionMode3 = new DomainSelectionMode("manual", 2);
        manual = domainSelectionMode3;
        $VALUES = new DomainSelectionMode[]{domainSelectionMode, domainSelectionMode2, domainSelectionMode3};
    }

    public DomainSelectionMode() {
        throw null;
    }

    public static DomainSelectionMode valueOf(String str) {
        return (DomainSelectionMode) Enum.valueOf(DomainSelectionMode.class, str);
    }

    public static DomainSelectionMode[] values() {
        return (DomainSelectionMode[]) $VALUES.clone();
    }
}
