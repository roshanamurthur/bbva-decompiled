package com.bbva.plugin.naturalauthentication.command;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.bbva.plugin.naturalauthentication.command.OobAuthenticateAction[], still in use, count: 1, list:
  (r1v1 com.bbva.plugin.naturalauthentication.command.OobAuthenticateAction[]) from 0x000f: INVOKE (r1v1 com.bbva.plugin.naturalauthentication.command.OobAuthenticateAction[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:16)
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
/* JADX INFO: compiled from: OobAuthenticateCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/OobAuthenticateAction;", "", "", "action", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "OOB_AUTHENTICATE", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class OobAuthenticateAction {
    OOB_AUTHENTICATE;

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String action;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(oobAuthenticateActionArr);
    }

    public OobAuthenticateAction() {
        super("OOB_AUTHENTICATE", 0);
        this.action = "oob_authenticate";
    }

    @NotNull
    public static EnumEntries<OobAuthenticateAction> getEntries() {
        return $ENTRIES;
    }

    public static OobAuthenticateAction valueOf(String str) {
        return (OobAuthenticateAction) Enum.valueOf(OobAuthenticateAction.class, str);
    }

    public static OobAuthenticateAction[] values() {
        return (OobAuthenticateAction[]) $VALUES.clone();
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }
}
