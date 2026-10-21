package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.bbva.plugin.localstorage.command.SetCommand;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v3 kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[], still in use, count: 1, list:
  (r11v3 kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[]) from 0x0082: INVOKE (r11v3 kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:131)
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
/* JADX INFO: compiled from: AnnotationUseSiteTarget.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationUseSiteTarget {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER(SetCommand.ID),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String renderName;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(annotationUseSiteTargetArr);
    }

    public AnnotationUseSiteTarget(String str) {
        super(str, i);
        this.renderName = str == null ? CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(name()) : str;
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) $VALUES.clone();
    }

    @NotNull
    public final String getRenderName() {
        return this.renderName;
    }
}
