package com.bbva.glomohybrid.base.webApp;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebAppConstants.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/base/webApp/WebAppConstants;", "", "", "NETWORK_WORKER_WEB_APP", "Ljava/lang/String;", "KEY_SCOPE_WEB_APP_VIEW_MODEL", "KEY_SCOPE_AKAMAI_DM", "KEY_SCOPE_HEADERS_DM", "CUENTA_EN_LINEA_WEB_APP_BUNDLE", "getCUENTA_EN_LINEA_AKAMAI_CONFIG", "()Ljava/lang/String;", "CUENTA_EN_LINEA_AKAMAI_CONFIG", "getCUENTA_EN_LINEA_ENDPOINTS_SECURITY_CONFIG", "CUENTA_EN_LINEA_ENDPOINTS_SECURITY_CONFIG", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class WebAppConstants {

    @NotNull
    public static final String CUENTA_EN_LINEA_WEB_APP_BUNDLE = "cuenta_en_linea_web_app_bundle";

    @NotNull
    public static final WebAppConstants INSTANCE = new WebAppConstants();

    @NotNull
    public static final String KEY_SCOPE_AKAMAI_DM = "key_scope_akamai_dm";

    @NotNull
    public static final String KEY_SCOPE_HEADERS_DM = "key_scope_headers_dm";

    @NotNull
    public static final String KEY_SCOPE_WEB_APP_VIEW_MODEL = "key_scope_web_app_view_model";

    @NotNull
    public static final String NETWORK_WORKER_WEB_APP = "network_worker_web_app";

    @NotNull
    public final String getCUENTA_EN_LINEA_AKAMAI_CONFIG() {
        return "akamai_config_cuenta_en_linea_web_app_bundle";
    }

    @NotNull
    public final String getCUENTA_EN_LINEA_ENDPOINTS_SECURITY_CONFIG() {
        return "endpoints-security_cuenta_en_linea_web_app_bundle";
    }
}
