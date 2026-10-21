package com.adobe.marketing.mobile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
class AndroidDeepLinkService implements DeepLinkService {
    private static final String LOG_TAG = "AndroidDeepLinkService";

    @Override // com.adobe.marketing.mobile.DeepLinkService
    public void triggerDeepLink(String str) {
        if (str == null || str.isEmpty()) {
            Log.debug(LOG_TAG, "Unable to trigger deep link, link url is empty or null", new Object[0]);
            return;
        }
        Activity currentActivity = App.getCurrentActivity();
        if (currentActivity == null) {
            Log.debug(LOG_TAG, "%s (current activity), unable to trigger deep link", "Unexpected Null Value");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            currentActivity.startActivity(intent);
        } catch (Exception e5) {
            Log.warning(LOG_TAG, "Could not load deep link intent for Acquisition (%s)", e5.toString());
        }
    }
}
