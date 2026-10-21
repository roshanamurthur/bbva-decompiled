package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 kotlin.reflect.jvm.internal.impl.types.Variance[], still in use, count: 1, list:
  (r2v2 kotlin.reflect.jvm.internal.impl.types.Variance[]) from 0x0042: INVOKE (r2v2 kotlin.reflect.jvm.internal.impl.types.Variance[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:67)
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
/* JADX INFO: compiled from: Variance.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Variance {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @NotNull
    private final String label;
    private final int superpositionFactor;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(varianceArr);
    }

    public Variance(String str, boolean z10, boolean z11, int i10) {
        super(str, i);
        this.label = str;
        this.allowsInPosition = z10;
        this.allowsOutPosition = z11;
        this.superpositionFactor = i10;
    }

    public static Variance valueOf(String str) {
        return (Variance) Enum.valueOf(Variance.class, str);
    }

    public static Variance[] values() {
        return (Variance[]) $VALUES.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.label;
    }
}
