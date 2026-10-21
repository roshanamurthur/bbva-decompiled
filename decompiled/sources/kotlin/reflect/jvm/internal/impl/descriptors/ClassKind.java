package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[], still in use, count: 1, list:
  (r10v3 kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[]) from 0x0058: INVOKE (r10v3 kotlin.reflect.jvm.internal.impl.descriptors.ClassKind[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:89)
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
/* JADX INFO: compiled from: ClassKind.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ClassKind {
    CLASS(Name.LABEL),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @Nullable
    private final String codeRepresentation;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(classKindArr);
    }

    public ClassKind(String str) {
        super(str, i);
        this.codeRepresentation = str;
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
