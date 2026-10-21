package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[], still in use, count: 1, list:
  (r4v3 kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[]) from 0x002f: INVOKE (r4v3 kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:48)
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
/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String presentation;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(typeVarianceArr);
    }

    public TypeVariance(String str) {
        super(str, i);
        this.presentation = str;
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.presentation;
    }
}
