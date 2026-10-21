package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotatedCallableKind {
    private static final /* synthetic */ AnnotatedCallableKind[] $VALUES;
    public static final AnnotatedCallableKind FUNCTION;
    public static final AnnotatedCallableKind PROPERTY;
    public static final AnnotatedCallableKind PROPERTY_GETTER;
    public static final AnnotatedCallableKind PROPERTY_SETTER;

    static {
        AnnotatedCallableKind annotatedCallableKind = new AnnotatedCallableKind("FUNCTION", 0);
        FUNCTION = annotatedCallableKind;
        AnnotatedCallableKind annotatedCallableKind2 = new AnnotatedCallableKind("PROPERTY", 1);
        PROPERTY = annotatedCallableKind2;
        AnnotatedCallableKind annotatedCallableKind3 = new AnnotatedCallableKind("PROPERTY_GETTER", 2);
        PROPERTY_GETTER = annotatedCallableKind3;
        AnnotatedCallableKind annotatedCallableKind4 = new AnnotatedCallableKind("PROPERTY_SETTER", 3);
        PROPERTY_SETTER = annotatedCallableKind4;
        $VALUES = new AnnotatedCallableKind[]{annotatedCallableKind, annotatedCallableKind2, annotatedCallableKind3, annotatedCallableKind4};
    }

    public AnnotatedCallableKind() {
        throw null;
    }

    public static AnnotatedCallableKind valueOf(String str) {
        return (AnnotatedCallableKind) Enum.valueOf(AnnotatedCallableKind.class, str);
    }

    public static AnnotatedCallableKind[] values() {
        return (AnnotatedCallableKind[]) $VALUES.clone();
    }
}
