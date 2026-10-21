package kotlin.annotation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class AnnotationRetention {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationRetention[] $VALUES;
    public static final AnnotationRetention BINARY;
    public static final AnnotationRetention RUNTIME;
    public static final AnnotationRetention SOURCE;

    static {
        AnnotationRetention annotationRetention = new AnnotationRetention("SOURCE", 0);
        SOURCE = annotationRetention;
        AnnotationRetention annotationRetention2 = new AnnotationRetention("BINARY", 1);
        BINARY = annotationRetention2;
        AnnotationRetention annotationRetention3 = new AnnotationRetention("RUNTIME", 2);
        RUNTIME = annotationRetention3;
        AnnotationRetention[] annotationRetentionArr = {annotationRetention, annotationRetention2, annotationRetention3};
        $VALUES = annotationRetentionArr;
        $ENTRIES = EnumEntriesKt.enumEntries(annotationRetentionArr);
    }

    public AnnotationRetention() {
        throw null;
    }

    @NotNull
    public static EnumEntries<AnnotationRetention> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) $VALUES.clone();
    }
}
