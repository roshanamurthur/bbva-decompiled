package a3;

/* JADX INFO: compiled from: FileSectionType.java */
/* JADX INFO: loaded from: classes2.dex */
public enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    e(long j10) {
        this.mValue = j10;
    }

    public final long a() {
        return this.mValue;
    }
}
