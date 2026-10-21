package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[], still in use, count: 1, list:
  (r3v1 kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[]) from 0x0029: INVOKE (r3v1 kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
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
/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS((boolean) (0 == true ? 1 : 0), 3),
    UNLESS_EMPTY((boolean) (1 == true ? 1 : 0), 2),
    ALWAYS_PARENTHESIZED(true, true);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        $ENTRIES = EnumEntriesKt.enumEntries(annotationArgumentsRenderingPolicyArr);
    }

    public /* synthetic */ AnnotationArgumentsRenderingPolicy(boolean z10, int i10) {
        this((i10 & 1) != 0 ? false : z10, false);
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    public AnnotationArgumentsRenderingPolicy(boolean z10, boolean z11) {
        super(str, i);
        this.includeAnnotationArguments = z10;
        this.includeEmptyAnnotationArguments = z11;
    }
}
