package com.bbva.glomoconfig.constants;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GlobalAnalyticsConstants.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomoconfig/constants/GlobalAnalyticsConstants;", "", "()V", "ENTERPRISE_PROFILE", "", "getENTERPRISE_PROFILE", "()Ljava/lang/String;", "ENTERPRISE_SITE_APP", "getENTERPRISE_SITE_APP", "GLOBAL_POSITION", "getGLOBAL_POSITION", "INTERACTION_LEVEL_CHANGE_USER", "getINTERACTION_LEVEL_CHANGE_USER", "INTERACTION_LEVEL_ENTERPRISE", "getINTERACTION_LEVEL_ENTERPRISE", "INTERACTION_LEVEL_PERSONAL", "getINTERACTION_LEVEL_PERSONAL", "LOGIN_POSITION", "getLOGIN_POSITION", "PERSONAL_PROFILE", "getPERSONAL_PROFILE", "PROJECT_NAME", "getPROJECT_NAME", "SITE_APP", "getSITE_APP", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GlobalAnalyticsConstants {

    @NotNull
    public static final GlobalAnalyticsConstants INSTANCE = new GlobalAnalyticsConstants();

    @NotNull
    public final String getENTERPRISE_PROFILE() {
        return CountryAnalyticsConstants.ENTERPRISE_PROFILE;
    }

    @NotNull
    public final String getENTERPRISE_SITE_APP() {
        return "App BBVA PNN Mexico";
    }

    @NotNull
    public final String getGLOBAL_POSITION() {
        return CountryAnalyticsConstants.GLOBAL_POSITION;
    }

    @NotNull
    public final String getINTERACTION_LEVEL_CHANGE_USER() {
        return "";
    }

    @NotNull
    public final String getINTERACTION_LEVEL_ENTERPRISE() {
        return CountryAnalyticsConstants.INTERACTION_LEVEL_ENTERPRISE;
    }

    @NotNull
    public final String getINTERACTION_LEVEL_PERSONAL() {
        return CountryAnalyticsConstants.INTERACTION_LEVEL_PERSONAL;
    }

    @NotNull
    public final String getLOGIN_POSITION() {
        return "";
    }

    @NotNull
    public final String getPERSONAL_PROFILE() {
        return CountryAnalyticsConstants.PERSONAL_PROFILE;
    }

    @NotNull
    public final String getPROJECT_NAME() {
        return CountryAnalyticsConstants.NAME;
    }

    @NotNull
    public final String getSITE_APP() {
        return CountryAnalyticsConstants.SITE_APP;
    }
}
