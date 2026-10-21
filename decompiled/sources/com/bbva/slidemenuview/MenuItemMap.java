package com.bbva.slidemenuview;

import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.nativesettings.common.Constants;
import com.bbva.slidemenuview.decorator.SustainabilityDecorator;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 com.bbva.slidemenuview.MenuItemMap[], still in use, count: 1, list:
  (r3v5 com.bbva.slidemenuview.MenuItemMap[]) from 0x010c: INVOKE (r3v5 com.bbva.slidemenuview.MenuItemMap[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:269)
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
/* JADX INFO: compiled from: MenuItemMap.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/bbva/slidemenuview/MenuItemMap;", "", "", "id", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "", "identifier", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "Configuration", "Security", "SmartToken", "Sustainability", "Emergencies", "CashZonePayments", "RewardsLanding", "MobilePayment", "OperationsQr", "CardLessWithdrawalHistoric", "AtmBranches", "Clarifications", "Help", "Apps", "About", "DynamicsAndRewards", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MenuItemMap {
    Configuration(1, "configuration"),
    Security(2, Constants.SECURITY),
    SmartToken(3, "token"),
    Sustainability(4, SustainabilityDecorator.SUSTAINABILITY),
    Emergencies(5, "emergencyReports"),
    CashZonePayments(6, "cashZonePayments"),
    RewardsLanding(7, "rewardsLanding"),
    MobilePayment(8, "mobilePayment"),
    OperationsQr(9, "operationsQr"),
    CardLessWithdrawalHistoric(10, "cardLessWithdrawalHistoric"),
    AtmBranches(11, "atmBranches"),
    Clarifications(12, "clarifications"),
    Help(13, "help"),
    Apps(14, "apps"),
    About(15, "about"),
    DynamicsAndRewards(16, RouteConstants.DYNAMICS_AND_REWARDS);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int id;

    @NotNull
    private final String identifier;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(menuItemMapArr);
    }

    public MenuItemMap(int i10, String str) {
        super(str, i);
        this.id = i10;
        this.identifier = str;
    }

    @NotNull
    public static EnumEntries<MenuItemMap> getEntries() {
        return $ENTRIES;
    }

    public static MenuItemMap valueOf(String str) {
        return (MenuItemMap) Enum.valueOf(MenuItemMap.class, str);
    }

    public static MenuItemMap[] values() {
        return (MenuItemMap[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }
}
