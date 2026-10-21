package com.adobe.marketing.mobile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class DataMarshaller {
    private static final String ADOBE_QUERY_KEYS_DEEPLINK_ID = "a.deeplink.id";
    private static final String ADOBE_QUERY_KEYS_PREVIEW_TOKEN = "at_preview_token";
    private static final String ADOBE_QUERY_KEYS_PREVIEW_URL = "at_preview_endpoint";
    static final String DEEPLINK_KEY = "deeplink";
    static final String LEGACY_PUSH_MESSAGE_ID = "adb_m_id";
    static final String LOCAL_NOTIFICATION_ID_KEY = "notificationid";
    static final String PUSH_MESSAGE_ID_KEY = "pushmessageid";
    private static final String TAG = "DataMarshaller";
    private List<String> adobeQueryKeys;
    private Map<String, Object> launchData = new HashMap();

    public DataMarshaller() {
        ArrayList arrayList = new ArrayList();
        this.adobeQueryKeys = arrayList;
        arrayList.add(ADOBE_QUERY_KEYS_DEEPLINK_ID);
        this.adobeQueryKeys.add(ADOBE_QUERY_KEYS_PREVIEW_TOKEN);
        this.adobeQueryKeys.add(ADOBE_QUERY_KEYS_PREVIEW_URL);
    }

    private Uri cleanUpUri(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri;
        }
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.clearQuery();
                for (String str : queryParameterNames) {
                    if (!this.adobeQueryKeys.contains(str)) {
                        Iterator<String> it = uri.getQueryParameters(str).iterator();
                        while (it.hasNext()) {
                            builderBuildUpon.appendQueryParameter(str, it.next());
                        }
                    }
                }
                return builderBuildUpon.build();
            }
            return uri;
        } catch (UnsupportedOperationException unused) {
            return uri;
        }
    }

    private boolean containAdobeQueryKeys(Uri uri) {
        if (!uri.isHierarchical()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(uri.getQueryParameterNames());
        if (arrayList.isEmpty()) {
            return false;
        }
        arrayList.retainAll(this.adobeQueryKeys);
        return arrayList.size() != 0;
    }

    private void marshalIntentExtras(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String str2 = LEGACY_PUSH_MESSAGE_ID.equals(str) ? "pushmessageid" : str;
                if (com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_IDENTIFIER_KEY.equals(str)) {
                    str2 = "notificationid";
                }
                Object obj = bundle.get(str);
                if (obj != null && obj.toString() != null && obj.toString().length() > 0) {
                    this.launchData.put(str2, obj);
                }
            }
            bundle.remove(LEGACY_PUSH_MESSAGE_ID);
            bundle.remove(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_IDENTIFIER_KEY);
        }
    }

    public Map<String, Object> getData() {
        return this.launchData;
    }

    public DataMarshaller marshal(Activity activity) {
        if (activity != null) {
            try {
                if (activity.getIntent() != null) {
                    Intent intent = activity.getIntent();
                    marshalIntentExtras(intent.getExtras());
                    Uri data = intent.getData();
                    if (data != null && !data.toString().isEmpty()) {
                        Log.trace(TAG, "Receiving the Activity Uri (%s)", data.toString());
                        this.launchData.put("deeplink", data.toString());
                        if (containAdobeQueryKeys(data)) {
                            intent.setData(cleanUpUri(data));
                        }
                    }
                }
            } catch (Exception e5) {
                Log.error(TAG, "Failed to extract the launch data from Activity. Errors: ", e5.getLocalizedMessage());
            }
        }
        return this;
    }
}
