package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicLinkUTMParams {

    @VisibleForTesting
    public static final String KEY_CAMPAIGN = "campaign";

    @VisibleForTesting
    public static final String KEY_CAMPAIGN_BUNDLE = "_cmp";

    @VisibleForTesting
    public static final String KEY_MEDIUM = "medium";

    @VisibleForTesting
    public static final String KEY_SCION_DATA_BUNDLE = "scionData";

    @VisibleForTesting
    public static final String KEY_SOURCE = "source";
    public static final String KEY_UTM_CAMPAIGN = "utm_campaign";
    public static final String KEY_UTM_MEDIUM = "utm_medium";
    public static final String KEY_UTM_SOURCE = "utm_source";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Bundle f48341a;

    public DynamicLinkUTMParams(DynamicLinkData dynamicLinkData) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (dynamicLinkData != null && dynamicLinkData.getExtensionBundle() != null && (bundle = dynamicLinkData.getExtensionBundle().getBundle("scionData")) != null && (bundle2 = bundle.getBundle("_cmp")) != null) {
            String string = bundle2.getString("medium");
            if (!TextUtils.isEmpty(string)) {
                bundle3.putString("utm_medium", string);
            }
            String string2 = bundle2.getString("source");
            if (!TextUtils.isEmpty(string2)) {
                bundle3.putString("utm_source", string2);
            }
            String string3 = bundle2.getString("campaign");
            if (!TextUtils.isEmpty(string3)) {
                bundle3.putString("utm_campaign", string3);
            }
        }
        this.f48341a = bundle3;
    }

    @NonNull
    public Bundle asBundle() {
        return new Bundle(this.f48341a);
    }
}
