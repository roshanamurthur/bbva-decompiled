package kotlin.annotation;

import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", ConstantsKt.TYPE, "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class AnnotationTarget {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationTarget[] $VALUES;
    public static final AnnotationTarget ANNOTATION_CLASS;
    public static final AnnotationTarget CLASS;
    public static final AnnotationTarget CONSTRUCTOR;
    public static final AnnotationTarget EXPRESSION;
    public static final AnnotationTarget FIELD;
    public static final AnnotationTarget FILE;
    public static final AnnotationTarget FUNCTION;
    public static final AnnotationTarget LOCAL_VARIABLE;
    public static final AnnotationTarget PROPERTY;
    public static final AnnotationTarget PROPERTY_GETTER;
    public static final AnnotationTarget PROPERTY_SETTER;
    public static final AnnotationTarget TYPE;

    @SinceKotlin(version = "1.1")
    public static final AnnotationTarget TYPEALIAS;
    public static final AnnotationTarget TYPE_PARAMETER;
    public static final AnnotationTarget VALUE_PARAMETER;

    static {
        AnnotationTarget annotationTarget = new AnnotationTarget("CLASS", 0);
        CLASS = annotationTarget;
        AnnotationTarget annotationTarget2 = new AnnotationTarget("ANNOTATION_CLASS", 1);
        ANNOTATION_CLASS = annotationTarget2;
        AnnotationTarget annotationTarget3 = new AnnotationTarget("TYPE_PARAMETER", 2);
        TYPE_PARAMETER = annotationTarget3;
        AnnotationTarget annotationTarget4 = new AnnotationTarget("PROPERTY", 3);
        PROPERTY = annotationTarget4;
        AnnotationTarget annotationTarget5 = new AnnotationTarget("FIELD", 4);
        FIELD = annotationTarget5;
        AnnotationTarget annotationTarget6 = new AnnotationTarget("LOCAL_VARIABLE", 5);
        LOCAL_VARIABLE = annotationTarget6;
        AnnotationTarget annotationTarget7 = new AnnotationTarget("VALUE_PARAMETER", 6);
        VALUE_PARAMETER = annotationTarget7;
        AnnotationTarget annotationTarget8 = new AnnotationTarget("CONSTRUCTOR", 7);
        CONSTRUCTOR = annotationTarget8;
        AnnotationTarget annotationTarget9 = new AnnotationTarget("FUNCTION", 8);
        FUNCTION = annotationTarget9;
        AnnotationTarget annotationTarget10 = new AnnotationTarget("PROPERTY_GETTER", 9);
        PROPERTY_GETTER = annotationTarget10;
        AnnotationTarget annotationTarget11 = new AnnotationTarget("PROPERTY_SETTER", 10);
        PROPERTY_SETTER = annotationTarget11;
        AnnotationTarget annotationTarget12 = new AnnotationTarget(ConstantsKt.TYPE, 11);
        TYPE = annotationTarget12;
        AnnotationTarget annotationTarget13 = new AnnotationTarget("EXPRESSION", 12);
        EXPRESSION = annotationTarget13;
        AnnotationTarget annotationTarget14 = new AnnotationTarget("FILE", 13);
        FILE = annotationTarget14;
        AnnotationTarget annotationTarget15 = new AnnotationTarget("TYPEALIAS", 14);
        TYPEALIAS = annotationTarget15;
        AnnotationTarget[] annotationTargetArr = {annotationTarget, annotationTarget2, annotationTarget3, annotationTarget4, annotationTarget5, annotationTarget6, annotationTarget7, annotationTarget8, annotationTarget9, annotationTarget10, annotationTarget11, annotationTarget12, annotationTarget13, annotationTarget14, annotationTarget15};
        $VALUES = annotationTargetArr;
        $ENTRIES = EnumEntriesKt.enumEntries(annotationTargetArr);
    }

    public AnnotationTarget() {
        throw null;
    }

    @NotNull
    public static EnumEntries<AnnotationTarget> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationTarget valueOf(String str) {
        return (AnnotationTarget) Enum.valueOf(AnnotationTarget.class, str);
    }

    public static AnnotationTarget[] values() {
        return (AnnotationTarget[]) $VALUES.clone();
    }
}
