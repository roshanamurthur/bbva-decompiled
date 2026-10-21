package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1sSDK extends AFd1nSDK<String> {
    private final UUID AFLogger$LogLevel;
    private final Map<String, String> AFVersionDeclaration;

    @Nullable
    private final LinkGenerator.ResponseListener afErrorLogForExcManagerOnly;
    private final AFb1cSDK afInfoLog;

    @Nullable
    private final String afWarnLog;
    private final String getLevel;

    public AFd1sSDK(@NonNull AFc1zSDK aFc1zSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener) {
        super(AFd1vSDK.ONELINK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, uuid.toString());
        this.afInfoLog = aFc1zSDK.AFInAppEventParameterName();
        this.AFLogger$LogLevel = uuid;
        this.getLevel = str;
        this.AFVersionDeclaration = new HashMap(map);
        this.afErrorLogForExcManagerOnly = responseListener;
        this.afWarnLog = str2;
    }

    private String getLevel() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        String packageName = this.afInfoLog.values.AFInAppEventParameterName.getPackageName();
        LinkGenerator linkGeneratorAddParameters = new LinkGenerator("af_app_invites").setBaseURL(this.getLevel, string, packageName).addParameter("af_siteid", packageName).addParameters(this.AFVersionDeclaration);
        AFa1dSDK.valueOf();
        String strValues = AFa1dSDK.values();
        if (strValues != null) {
            linkGeneratorAddParameters.setReferrerCustomerId(strValues);
        }
        return linkGeneratorAddParameters.generateLink();
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afWarnLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        ResponseNetwork responseNetwork;
        super.valueOf();
        LinkGenerator.ResponseListener responseListener = this.afErrorLogForExcManagerOnly;
        if (responseListener != null) {
            if (this.AFKeystoreWrapper == AFd1ySDK.SUCCESS && (responseNetwork = ((AFd1nSDK) this).AFLogger) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thAfInfoLog = afInfoLog();
            if (!(thAfInfoLog instanceof ParsingException)) {
                responseListener.onResponse(getLevel());
            } else if (((ParsingException) thAfInfoLog).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(getLevel());
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(@NonNull String str) {
        return ((AFd1nSDK) this).afErrorLog.valueOf(this.getLevel, this.AFVersionDeclaration, this.afWarnLog, this.AFLogger$LogLevel, str);
    }
}
