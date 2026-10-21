package com.dasnano.vddocumentcapture.other;

import com.bbva.notifications.model.constants.BanxicoConstants;
import com.veridas.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class MetadataUtils {
    public static String getValueMetaDataPayload(String str) {
        try {
            String string = new JSONObject(str).getString("artifact");
            return string.compareTo("Not Found") == 0 ? "" : new JSONObject(string).get(BanxicoConstants.KEY_HISTORICAL_PAYLOAD).toString();
        } catch (JSONException e5) {
            Log.e("MetadataUtils", e5);
            return "";
        }
    }
}
