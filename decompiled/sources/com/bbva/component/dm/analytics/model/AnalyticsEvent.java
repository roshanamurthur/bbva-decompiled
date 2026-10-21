package com.bbva.component.dm.analytics.model;

import bk.q;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v61 com.bbva.component.dm.analytics.model.AnalyticsEvent[], still in use, count: 1, list:
  (r3v61 com.bbva.component.dm.analytics.model.AnalyticsEvent[]) from 0x0521: INVOKE (r3v61 com.bbva.component.dm.analytics.model.AnalyticsEvent[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED]
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
/* JADX INFO: compiled from: AnalyticsEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\bJ\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\bR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bV¨\u0006W"}, d2 = {"Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "", "", "", "", "convertToMap", "key", "value", "", "putData", "cleanData", "eventId", "Ljava/lang/String;", "", "data", "Ljava/util/Map;", "LANDING_LINK", "LANDING_INTERACTION_LINK", "LANDING_EXTERNAL_LINK", "LANDING_SCREEN", "LANDING_BLOCKED_SCREEN", "LANDING_CAMPAIGN_CLOSE", "LANDING_CAMPAIGN", "LANDING_CAMPAIGN_START", "LANDING_FORCE_UPDATE_SCREEN", "LANDING_SHORTCUT_LINK", "LANDING_EXTERNAL_SHORTCUT_LINK", "LANDING_ECOMMERCE_LINK", "LANDING_PUBLIC_LINK", "LANDING_PUBLIC_INTERACTION_LINK", "LANDING_PUBLIC_EXTERNAL_LINK", "LANDING_PUBLIC_SCREEN", "LANDING_PUBLIC_BLOCKED_SCREEN", "LANDING_PUBLIC_CAMPAIGN_CLOSE", "LANDING_PUBLIC_CAMPAIGN", "LANDING_PUBLIC_CAMPAIGN_START", "LANDING_PUBLIC_FORCE_UPDATE_SCREEN", "LANDING_PUBLIC_SHORTCUT_LINK", "LANDING_PUBLIC_EXTERNAL_SHORTCUT_LINK", "LOGIN_ACCESS_KEY_RECOVERY", "LOGIN_ACCESS_KEY_RECOVERY_REMEMBERED", "LOGIN_BIOMETRIC_ERROR", "LOGIN_BIOMETRIC_FRIENDLY_FRAUD_ERROR", "LOGIN_BIOMETRIC_UNCONFIGURED_ERROR", "LOGIN_BIOMETRIC_SUCCESS", "LOGIN_BIOMETRY_RETRIES_ERROR", "LOGIN_BIOMETRIC_DEFAULT_ERROR", "LOGIN_BLOCKED_USER_ERROR", "LOGIN_BLOCKED_USER_UNLOCK_BUTTON_PRESSED", "LOGIN_UNAVAILABLE_FIDO_SERVICE_ERROR", "LOGIN_SERVICE_ERROR", "LOGIN_CREDENTIALS_ERROR", "LOGIN_CREDENTIALS_MULTIOPTION_ERROR", "LOGIN_CACHE_PROFILE", "LOGIN_ERROR", "LOGIN_ERROR_INACTIVE_ACCOUNT", "LOGIN_ERROR_INACTIVE_ACCOUNT_BUTTON_PRESSED", "LOGIN_ERROR_EXPIRED_PASSWORD", "LOGIN_ERROR_EXPIRED_PASSWORD_BUTTON_PRESSED", "LOGIN_SCREEN", "LOGIN_PHONE_PAGE", "LOGIN_PASSWORD_PAGE", "LOGIN_PASSWORD_PAGE_REMEMBERED", "LOGIN_PROFILE", "LOGIN_STANDIN_ACTIVATION_ERROR", "LOGIN_SUCCESS", "LOGIN_NEEDS_DIGITAL_ACTIVATION_ERROR", "LOGIN_NEEDS_DIGITAL_ACTIVATION_BUTTON_PRESSED", "LOGIN_BLOCKED_USER_BY_FRAUD_ERROR", "MENU_ITEM_CLICKED", "NOTIFICATION_OOB_TIMEOUT", "NOTIFICATION_SCREEN", "REGISTER_USER_CLICKED", "ROOT_SCREEN", "WEB_USER_TYPE_OPTION_SELECTED", "WELCOME_SCREEN", "WELCOME_SCREEN_PAGER", "CHANGE_USER_SCREEN", "WELCOME_USER_DISTRIBUTION_NEW", "WELCOME_USER_DISTRIBUTION_CACHED", "WELCOME_USER_DISTRIBUTION_ACCESS", "WELCOME_USER_DISTRIBUTION_REGISTER", "SHORTCUT_LINK_TRANSFER", "SHORTCUT_LINK_REJECTED_CARD", "SHORTCUT_LINK_PAY_SERVICES", "SHORTCUT_LINK_TOP_UP", "SHORTCUT_LINK_WITHDRAWAL_WITHOUT_CARDS", "component-dm-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class AnalyticsEvent {
    LANDING_LINK(AnalyticsConstants.LANDING_LINK),
    LANDING_INTERACTION_LINK(AnalyticsConstants.LANDING_INTERACTION_LINK),
    LANDING_EXTERNAL_LINK(AnalyticsConstants.LANDING_EXTERNAL_LINK),
    LANDING_SCREEN(AnalyticsConstants.LANDING_SCREEN),
    LANDING_BLOCKED_SCREEN(AnalyticsConstants.LANDING_BLOCKED_SCREEN),
    LANDING_CAMPAIGN_CLOSE(AnalyticsConstants.LANDING_CAMPAIGN_CLOSE_LINK),
    LANDING_CAMPAIGN(AnalyticsConstants.LANDING_CAMPAIGN_LINK),
    LANDING_CAMPAIGN_START(AnalyticsConstants.LANDING_CAMPAIGN_START_LINK),
    LANDING_FORCE_UPDATE_SCREEN(AnalyticsConstants.LANDING_FORCE_UPDATE_SCREEN),
    LANDING_SHORTCUT_LINK(AnalyticsConstants.LANDING_SHORTCUT_LINK),
    LANDING_EXTERNAL_SHORTCUT_LINK(AnalyticsConstants.LANDING_EXTERNAL_SHORTCUT_LINK),
    LANDING_ECOMMERCE_LINK(AnalyticsConstants.LANDING_ECOMMERCE_LINK),
    LANDING_PUBLIC_LINK(AnalyticsConstants.LANDING_PUBLIC_LINK),
    LANDING_PUBLIC_INTERACTION_LINK(AnalyticsConstants.LANDING_PUBLIC_INTERACTION_LINK),
    LANDING_PUBLIC_EXTERNAL_LINK(AnalyticsConstants.LANDING_PUBLIC_EXTERNAL_LINK),
    LANDING_PUBLIC_SCREEN(AnalyticsConstants.LANDING_PUBLIC_SCREEN),
    LANDING_PUBLIC_BLOCKED_SCREEN(AnalyticsConstants.LANDING_PUBLIC_BLOCKED_SCREEN),
    LANDING_PUBLIC_CAMPAIGN_CLOSE(AnalyticsConstants.LANDING_PUBLIC_CAMPAIGN_CLOSE_LINK),
    LANDING_PUBLIC_CAMPAIGN(AnalyticsConstants.LANDING_PUBLIC_CAMPAIGN_LINK),
    LANDING_PUBLIC_CAMPAIGN_START(AnalyticsConstants.LANDING_PUBLIC_CAMPAIGN_START_LINK),
    LANDING_PUBLIC_FORCE_UPDATE_SCREEN(AnalyticsConstants.LANDING_PUBLIC_FORCE_UPDATE_SCREEN),
    LANDING_PUBLIC_SHORTCUT_LINK(AnalyticsConstants.LANDING_PUBLIC_SHORTCUT_LINK),
    LANDING_PUBLIC_EXTERNAL_SHORTCUT_LINK(AnalyticsConstants.LANDING_PUBLIC_EXTERNAL_SHORTCUT_LINK),
    LOGIN_ACCESS_KEY_RECOVERY(AnalyticsConstants.LOGIN_ACCESS_KEY_RECOVERY_CLICKED),
    LOGIN_ACCESS_KEY_RECOVERY_REMEMBERED(AnalyticsConstants.LOGIN_ACCESS_KEY_RECOVERY_CLICKED_REMEMBERED),
    LOGIN_BIOMETRIC_ERROR(AnalyticsConstants.LOGIN_BIOMETRIC_ERROR),
    LOGIN_BIOMETRIC_FRIENDLY_FRAUD_ERROR(AnalyticsConstants.LOGIN_BIOMETRIC_FRIENDLY_FRAUD_ERROR),
    LOGIN_BIOMETRIC_UNCONFIGURED_ERROR(AnalyticsConstants.LOGIN_BIOMETRIC_UNCONFIGURED_ERROR),
    LOGIN_BIOMETRIC_SUCCESS(AnalyticsConstants.LOGIN_BIOMETRIC_SUCCESS),
    LOGIN_BIOMETRY_RETRIES_ERROR(AnalyticsConstants.LOGIN_BIOMETRY_RETRIES_ERROR),
    LOGIN_BIOMETRIC_DEFAULT_ERROR(AnalyticsConstants.LOGIN_BIOMETRIC_DEFAULT_ERROR),
    LOGIN_BLOCKED_USER_ERROR(AnalyticsConstants.LOGIN_BLOCKED_USER_ERROR),
    LOGIN_BLOCKED_USER_UNLOCK_BUTTON_PRESSED(AnalyticsConstants.LOGIN_BLOCKED_USER_UNLOCK_BUTTON_PRESSED),
    LOGIN_UNAVAILABLE_FIDO_SERVICE_ERROR(AnalyticsConstants.LOGIN_UNAVAILABLE_FIDO_SERVICE_ERROR),
    LOGIN_SERVICE_ERROR(AnalyticsConstants.LOGIN_SERVICE_ERROR),
    LOGIN_CREDENTIALS_ERROR(AnalyticsConstants.LOGIN_CREDENTIALS_ERROR),
    LOGIN_CREDENTIALS_MULTIOPTION_ERROR(AnalyticsConstants.LOGIN_CREDENTIALS_MULTIOPTION_ERROR),
    LOGIN_CACHE_PROFILE(AnalyticsConstants.LOGIN_CACHE_PROFILE),
    LOGIN_ERROR(AnalyticsConstants.LOGIN_ERROR),
    LOGIN_ERROR_INACTIVE_ACCOUNT(AnalyticsConstants.LOGIN_ERROR_INACTIVE_ACCOUNT),
    LOGIN_ERROR_INACTIVE_ACCOUNT_BUTTON_PRESSED(AnalyticsConstants.LOGIN_ERROR_INACTIVE_ACCOUNT_BUTTON_PRESSED),
    LOGIN_ERROR_EXPIRED_PASSWORD(AnalyticsConstants.LOGIN_ERROR_EXPIRED_PASSWORD),
    LOGIN_ERROR_EXPIRED_PASSWORD_BUTTON_PRESSED(AnalyticsConstants.LOGIN_ERROR_EXPIRED_PASSWORD_BUTTON_PRESSED),
    LOGIN_SCREEN(AnalyticsConstants.LOGIN_SCREEN),
    LOGIN_PHONE_PAGE(AnalyticsConstants.LOGIN_PHONE),
    LOGIN_PASSWORD_PAGE(AnalyticsConstants.LOGIN_PASSWORD),
    LOGIN_PASSWORD_PAGE_REMEMBERED(AnalyticsConstants.LOGIN_PASSWORD_SCREEN_REMEMBERED),
    LOGIN_PROFILE(AnalyticsConstants.LOGIN_PROFILE),
    LOGIN_STANDIN_ACTIVATION_ERROR(AnalyticsConstants.LOGIN_STANDIN_ACTIVATION_ERROR),
    LOGIN_SUCCESS(AnalyticsConstants.LOGIN_SUCCESS),
    LOGIN_NEEDS_DIGITAL_ACTIVATION_ERROR(AnalyticsConstants.LOGIN_NEEDS_DIGITAL_ACTIVATION_ERROR),
    LOGIN_NEEDS_DIGITAL_ACTIVATION_BUTTON_PRESSED(AnalyticsConstants.LOGIN_NEEDS_DIGITAL_ACTIVATION_BUTTON_PRESSED),
    LOGIN_BLOCKED_USER_BY_FRAUD_ERROR(AnalyticsConstants.LOGIN_BLOCKED_USER_BY_FRAUD_ERROR),
    MENU_ITEM_CLICKED(AnalyticsConstants.MENU_ITEM_CLICKED),
    NOTIFICATION_OOB_TIMEOUT(AnalyticsConstants.NOTIFICATION_OOB_TIMEOUT),
    NOTIFICATION_SCREEN(AnalyticsConstants.NOTIFICATION_SCREEN),
    REGISTER_USER_CLICKED(AnalyticsConstants.REGISTER_USER_CLICKED),
    ROOT_SCREEN(AnalyticsConstants.ROOT_SCREEN),
    WEB_USER_TYPE_OPTION_SELECTED(AnalyticsConstants.WEB_USER_TYPE_OPTION_SELECTED),
    WELCOME_SCREEN(AnalyticsConstants.WELCOME_SCREEN),
    WELCOME_SCREEN_PAGER(AnalyticsConstants.WELCOME_PAGER_SCREEN),
    CHANGE_USER_SCREEN(AnalyticsConstants.CHANGE_USER_SCREEN),
    WELCOME_USER_DISTRIBUTION_NEW(AnalyticsConstants.WELCOME_USER_DISTRIBUTION_NEW),
    WELCOME_USER_DISTRIBUTION_CACHED(AnalyticsConstants.WELCOME_USER_DISTRIBUTION_CACHED),
    WELCOME_USER_DISTRIBUTION_ACCESS(AnalyticsConstants.WELCOME_USER_DISTRIBUTION_ACCESS),
    WELCOME_USER_DISTRIBUTION_REGISTER(AnalyticsConstants.WELCOME_USER_DISTRIBUTION_REGISTER),
    SHORTCUT_LINK_TRANSFER(AnalyticsConstants.EXTERNAL_SHORTCUT_LINK_TRANSFER),
    SHORTCUT_LINK_REJECTED_CARD(AnalyticsConstants.EXTERNAL_SHORTCUT_LINK_REJECTED_CARD),
    SHORTCUT_LINK_PAY_SERVICES(AnalyticsConstants.EXTERNAL_SHORTCUT_LINK_PAY_SERVICES),
    SHORTCUT_LINK_TOP_UP(AnalyticsConstants.EXTERNAL_SHORTCUT_TOP_UP),
    SHORTCUT_LINK_WITHDRAWAL_WITHOUT_CARDS(AnalyticsConstants.EXTERNAL_WITHDRAWAL_WITHOUT_CARDS);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final Map<String, String> data;

    @NotNull
    private final String eventId;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(analyticsEventArr);
    }

    public AnalyticsEvent(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        super(str, i);
        this.eventId = str;
        this.data = linkedHashMap;
    }

    @NotNull
    public static EnumEntries<AnalyticsEvent> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsEvent valueOf(String str) {
        return (AnalyticsEvent) Enum.valueOf(AnalyticsEvent.class, str);
    }

    public static AnalyticsEvent[] values() {
        return (AnalyticsEvent[]) $VALUES.clone();
    }

    public final void cleanData() {
        this.data.clear();
    }

    @NotNull
    public final Map<String, Object> convertToMap() {
        return q.mapOf(TuplesKt.to("id", this.eventId), TuplesKt.to("data", q.toMap(this.data)));
    }

    public final void putData(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.data.put(key, value);
    }
}
