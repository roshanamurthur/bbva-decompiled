package com.adobe.marketing.mobile;

import androidx.webkit.ProxyConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class SignalTemplate {
    private static final String ADB_TEMPLATE_CALLBACK_BODY = "templatebody";
    private static final String ADB_TEMPLATE_CALLBACK_CONTENT_TYPE = "contenttype";
    private static final String ADB_TEMPLATE_CALLBACK_TIMEOUT = "timeout";
    private static final String ADB_TEMPLATE_CALLBACK_URL = "templateurl";
    private static final int ADB_TEMPLATE_TIMEOUT_DEFAULT = 2;
    private static final String LOGTAG = "SignalTemplate";
    private String bodyTemplate;
    private String contentType;
    private String signalId;
    private int timeout;
    private String urlTemplate;

    public static SignalTemplate createSignalTemplateFromConsequence(Map<String, Variant> map) {
        if (map != null && !map.isEmpty()) {
            String strOptString = Variant.optVariantFromMap(map, "id").optString(null);
            if (StringUtils.isNullOrEmpty(strOptString)) {
                Log.debug(LOGTAG, "Triggered rule does not have ID. Return.", new Object[0]);
                return null;
            }
            Map<String, Variant> mapOptVariantMap = Variant.optVariantFromMap(map, "detail").optVariantMap(null);
            if (mapOptVariantMap != null && !mapOptVariantMap.isEmpty()) {
                String strOptString2 = Variant.optVariantFromMap(mapOptVariantMap, ADB_TEMPLATE_CALLBACK_URL).optString(null);
                String strOptString3 = Variant.optVariantFromMap(map, "type").optString(null);
                if (StringUtils.isNullOrEmpty(strOptString2) || !isValidTemplateUrl(strOptString2, strOptString3)) {
                    Log.warning(LOGTAG, "Unable to create signal template, \"templateUrl\" is invalid \n", new Object[0]);
                    return null;
                }
                SignalTemplate signalTemplate = new SignalTemplate();
                signalTemplate.signalId = strOptString;
                signalTemplate.urlTemplate = strOptString2;
                signalTemplate.timeout = Variant.optVariantFromMap(mapOptVariantMap, "timeout").optInteger(2);
                String strOptString4 = Variant.optVariantFromMap(mapOptVariantMap, ADB_TEMPLATE_CALLBACK_BODY).optString("");
                signalTemplate.bodyTemplate = strOptString4;
                if (!StringUtils.isNullOrEmpty(strOptString4)) {
                    signalTemplate.contentType = Variant.optVariantFromMap(mapOptVariantMap, ADB_TEMPLATE_CALLBACK_CONTENT_TYPE).optString("");
                }
                return signalTemplate;
            }
            Log.debug(LOGTAG, "No detail found for the consequence with id %s", strOptString);
        }
        return null;
    }

    public static boolean isValidTemplateUrl(String str, String str2) {
        try {
            return !EventDataKeys.RuleEngine.RULES_RESPONSE_CONSEQUENCE_TYPE_PII.equals(str2) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(new URL(str).getProtocol());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public SignalHit getSignalHit() {
        SignalHit signalHit = new SignalHit();
        signalHit.url = this.urlTemplate;
        signalHit.body = this.bodyTemplate;
        signalHit.contentType = this.contentType;
        signalHit.timeout = this.timeout;
        return signalHit;
    }

    public String getSignalTemplateId() {
        return this.signalId;
    }
}
