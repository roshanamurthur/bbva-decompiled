package com.bbva.glomohybrid.shortcuts.model;

import com.bbva.glomoconfig.constants.CountryShortcutConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 com.bbva.glomohybrid.shortcuts.model.AppShortcutsIds[], still in use, count: 1, list:
  (r10v3 com.bbva.glomohybrid.shortcuts.model.AppShortcutsIds[]) from 0x0059: INVOKE (r10v3 com.bbva.glomohybrid.shortcuts.model.AppShortcutsIds[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:90)
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
/* JADX INFO: compiled from: AppShortcutsIds.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/shortcuts/model/AppShortcutsIds;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", CountryShortcutConstants.TRANSFER, CountryShortcutConstants.CARDLESS_WITHDRAWAL, "BILL_PAY", "CREDIT_CARD", CountryShortcutConstants.TOP_UP, "CREDIT_CARD_PAYMENT", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class AppShortcutsIds {
    TRANSFER("extra_shortcut_transfer"),
    CARDLESS_WITHDRAWAL("extra_shortcut_cardless_withdrawal"),
    BILL_PAY("extra_shortcut_bill_pay"),
    CREDIT_CARD("extra_shortcut_credit_card"),
    TOP_UP("extra_shortcut_top_up"),
    CREDIT_CARD_PAYMENT("extra_shortcut_credit_card_payment");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String value;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(appShortcutsIdsArr);
    }

    public AppShortcutsIds(String str) {
        super(str, i);
        this.value = str;
    }

    @NotNull
    public static EnumEntries<AppShortcutsIds> getEntries() {
        return $ENTRIES;
    }

    public static AppShortcutsIds valueOf(String str) {
        return (AppShortcutsIds) Enum.valueOf(AppShortcutsIds.class, str);
    }

    public static AppShortcutsIds[] values() {
        return (AppShortcutsIds[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
