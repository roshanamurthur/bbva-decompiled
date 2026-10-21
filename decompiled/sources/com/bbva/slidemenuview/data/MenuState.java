package com.bbva.slidemenuview.data;

import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 com.bbva.slidemenuview.data.MenuState[], still in use, count: 1, list:
  (r4v3 com.bbva.slidemenuview.data.MenuState[]) from 0x002f: INVOKE (r4v3 com.bbva.slidemenuview.data.MenuState[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:48)
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
/* JADX INFO: compiled from: MenuState.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/slidemenuview/data/MenuState;", "", "", "state", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "HIDDEN", PaymentStatus.ENABLED, "DISABLED", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MenuState {
    HIDDEN(BaseMenuItem.STATE_HIDDEN),
    ENABLED("enabled"),
    DISABLED(BaseMenuItem.STATE_DISABLED);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String state;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(menuStateArr);
    }

    public MenuState(String str) {
        super(str, i);
        this.state = str;
    }

    @NotNull
    public static EnumEntries<MenuState> getEntries() {
        return $ENTRIES;
    }

    public static MenuState valueOf(String str) {
        return (MenuState) Enum.valueOf(MenuState.class, str);
    }

    public static MenuState[] values() {
        return (MenuState[]) $VALUES.clone();
    }

    @NotNull
    public final String getState() {
        return this.state;
    }
}
