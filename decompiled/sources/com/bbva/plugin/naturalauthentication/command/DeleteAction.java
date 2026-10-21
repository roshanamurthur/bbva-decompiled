package com.bbva.plugin.naturalauthentication.command;

import com.mastercard.sonic.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 com.bbva.plugin.naturalauthentication.command.DeleteAction[], still in use, count: 1, list:
  (r8v3 com.bbva.plugin.naturalauthentication.command.DeleteAction[]) from 0x004b: INVOKE (r8v3 com.bbva.plugin.naturalauthentication.command.DeleteAction[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:76)
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
/* JADX INFO: compiled from: DeleteCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/DeleteAction;", "", "", "action", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "ONE", "LOCALLY", "ALL", "ALL_LOCALLY", "ALL_FROM_DEVICE", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class DeleteAction {
    ONE("one"),
    LOCALLY("locally"),
    ALL(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL),
    ALL_LOCALLY("all_locally"),
    ALL_FROM_DEVICE("all_from_device");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String action;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(deleteActionArr);
    }

    public DeleteAction(String str) {
        super(str, i);
        this.action = str;
    }

    @NotNull
    public static EnumEntries<DeleteAction> getEntries() {
        return $ENTRIES;
    }

    public static DeleteAction valueOf(String str) {
        return (DeleteAction) Enum.valueOf(DeleteAction.class, str);
    }

    public static DeleteAction[] values() {
        return (DeleteAction[]) $VALUES.clone();
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }
}
