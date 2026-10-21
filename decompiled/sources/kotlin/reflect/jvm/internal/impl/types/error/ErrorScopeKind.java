package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[], still in use, count: 1, list:
  (r11v4 kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[]) from 0x009b: INVOKE (r11v4 kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:156)
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
/* JADX INFO: compiled from: ErrorScopeKind.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ErrorScopeKind {
    CAPTURED_TYPE_SCOPE("No member resolution should be done on captured type, it used only during constraint system resolution"),
    INTEGER_LITERAL_TYPE_SCOPE("Scope for integer literal type (%s)"),
    ERASED_RECEIVER_TYPE_SCOPE("Error scope for erased receiver type"),
    SCOPE_FOR_ABBREVIATION_TYPE("Scope for abbreviation %s"),
    STUB_TYPE_SCOPE("Scope for stub type %s"),
    NON_CLASSIFIER_SUPER_TYPE_SCOPE("A scope for common supertype which is not a normal classifier"),
    ERROR_TYPE_SCOPE("Scope for error type %s"),
    UNSUPPORTED_TYPE_SCOPE("Scope for unsupported type %s"),
    SCOPE_FOR_ERROR_CLASS("Error scope for class %s with arguments: %s"),
    SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE("Error resolution candidate for call %s");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String debugMessage;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(errorScopeKindArr);
    }

    public ErrorScopeKind(String str) {
        super(str, i);
        this.debugMessage = str;
    }

    public static ErrorScopeKind valueOf(String str) {
        return (ErrorScopeKind) Enum.valueOf(ErrorScopeKind.class, str);
    }

    public static ErrorScopeKind[] values() {
        return (ErrorScopeKind[]) $VALUES.clone();
    }

    @NotNull
    public final String getDebugMessage() {
        return this.debugMessage;
    }
}
