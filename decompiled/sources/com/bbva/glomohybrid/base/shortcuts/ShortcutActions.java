package com.bbva.glomohybrid.base.shortcuts;

import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 com.bbva.glomohybrid.base.shortcuts.ShortcutActions[], still in use, count: 1, list:
  (r6v3 com.bbva.glomohybrid.base.shortcuts.ShortcutActions[]) from 0x003d: INVOKE (r6v3 com.bbva.glomohybrid.base.shortcuts.ShortcutActions[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:62)
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
/* JADX INFO: compiled from: ShortcutActions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", "", "", "route", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "", "isNone", "()Z", "Companion", "BANRED", "TRANSFERS", "ATMLOCATOR", ExpectedUserActionOnPoiTypes.NONE, "Base_release"}, k = 1, mv = {1, 9, 0})
public final class ShortcutActions {
    BANRED("banred"),
    TRANSFERS("transfer"),
    ATMLOCATOR(RouteConstants.ATM),
    NONE("none");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    public static final String ACTION_ATMLOCATOR = "com.bbva.glomohybrid.ShortcutActions.ATM_LOCATOR";

    @NotNull
    public static final String ACTION_BANRED = "com.bbva.glomohybrid.ShortcutActions.BANRED";

    @NotNull
    public static final String ACTION_TRANSFERS = "com.bbva.glomohybrid.ShortcutActions.TRANSFERS";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String route;

    /* JADX INFO: compiled from: ShortcutActions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions$Companion;", "", "()V", "ACTION_ATMLOCATOR", "", "ACTION_BANRED", "ACTION_TRANSFERS", "create", "Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", "action", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ShortcutActions create(@Nullable String action) {
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1309721323) {
                    if (iHashCode != 209441269) {
                        if (iHashCode == 780015774 && action.equals(ShortcutActions.ACTION_ATMLOCATOR)) {
                            return ShortcutActions.ATMLOCATOR;
                        }
                    } else if (action.equals(ShortcutActions.ACTION_TRANSFERS)) {
                        return ShortcutActions.TRANSFERS;
                    }
                } else if (action.equals(ShortcutActions.ACTION_BANRED)) {
                    return ShortcutActions.BANRED;
                }
            }
            return ShortcutActions.NONE;
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new ShortcutActions[]{r0, r1, r2, r4});
    }

    public ShortcutActions(String str) {
        super(str, i);
        this.route = str;
    }

    @NotNull
    public static EnumEntries<ShortcutActions> getEntries() {
        return $ENTRIES;
    }

    public static ShortcutActions valueOf(String str) {
        return (ShortcutActions) Enum.valueOf(ShortcutActions.class, str);
    }

    public static ShortcutActions[] values() {
        return (ShortcutActions[]) $VALUES.clone();
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    public final boolean isNone() {
        return this == NONE;
    }
}
