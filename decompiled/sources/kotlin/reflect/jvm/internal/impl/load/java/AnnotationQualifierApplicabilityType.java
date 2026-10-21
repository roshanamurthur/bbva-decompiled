package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[], still in use, count: 1, list:
  (r10v3 kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[]) from 0x0051: INVOKE (r10v3 kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:82)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: AnnotationQualifierApplicabilityType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationQualifierApplicabilityType {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String javaTarget;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(annotationQualifierApplicabilityTypeArr);
    }

    public AnnotationQualifierApplicabilityType(String str) {
        super(str, i);
        this.javaTarget = str;
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) $VALUES.clone();
    }

    @NotNull
    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
