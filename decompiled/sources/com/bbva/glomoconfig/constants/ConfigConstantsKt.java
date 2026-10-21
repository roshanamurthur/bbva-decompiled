package com.bbva.glomoconfig.constants;

import com.bbva.library.darkmode.DarkMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConfigConstants.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\b\"\u0014\u0010\u0010\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\b\"\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\b\"\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\b\"\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\b\"\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/library/darkmode/DarkMode;", "a", "Lcom/bbva/library/darkmode/DarkMode;", "getDEFAULT_DARK_MODE", "()Lcom/bbva/library/darkmode/DarkMode;", "DEFAULT_DARK_MODE", "", "CUSTOMERS_API_VERSION", "Ljava/lang/String;", "CUSTOMERS_EXPAND", "CUSTOMERS_SERVICE_PHONE", "GLOMO_CONSUMER_ID", "GLOMO_CONSUMER_ID_ANONYMOUS", "GLOMO_CONSUMER_ID_LOWCOST_DISABLED", "GLOMO_CONSUMER_ID_STAND_IN", "FIDO_CONSUMER_ID", "LANDING_LABEL_ECOMMERCE_CARD_PARAMS_ID", "GLOBAL_CONFIGURATORS", "GEMA_CONFIGURATORS", "DEFAULT_GEMA_CONSUMER_ID", "LOCAL_STORAGE_CLIENT_ID", "gl-config_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class ConfigConstantsKt {

    @NotNull
    public static final String CUSTOMERS_API_VERSION = "v1";

    @NotNull
    public static final String CUSTOMERS_EXPAND = "avatars,indicators,classifications";

    @NotNull
    public static final String CUSTOMERS_SERVICE_PHONE = "1929";

    @NotNull
    public static final String DEFAULT_GEMA_CONSUMER_ID = "10000133";

    @NotNull
    public static final String FIDO_CONSUMER_ID = "BBVAFIDOMXI";

    @NotNull
    public static final String GEMA_CONFIGURATORS = "globalGemaConfigurators";

    @NotNull
    public static final String GLOBAL_CONFIGURATORS = "globalConfigurators";

    @NotNull
    public static final String GLOMO_CONSUMER_ID = "10000187";

    @NotNull
    public static final String GLOMO_CONSUMER_ID_ANONYMOUS = "10000088";

    @NotNull
    public static final String GLOMO_CONSUMER_ID_LOWCOST_DISABLED = "10000033";

    @NotNull
    public static final String GLOMO_CONSUMER_ID_STAND_IN = "10000094";

    @NotNull
    public static final String LANDING_LABEL_ECOMMERCE_CARD_PARAMS_ID = "cardId";

    @NotNull
    public static final String LOCAL_STORAGE_CLIENT_ID = "localStorageClientId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DarkMode f30918a = DarkMode.FORCE_AUTO;

    @NotNull
    public static final DarkMode getDEFAULT_DARK_MODE() {
        return f30918a;
    }
}
