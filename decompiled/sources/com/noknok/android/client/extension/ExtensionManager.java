package com.noknok.android.client.extension;

import com.noknok.android.client.utils.ActivityProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ExtensionManager {
    public static final String AUTHENTICATOR_INFO_EXT_ID = "noknok.AuthenticatorInfo";
    public static final String BIOMETRIC_OPTIONS_EXT_ID = "noknok.auth.biometric_options";
    public static final String EXCEPTION_EXT_ID = "noknok.exception";
    public static final String FILTER_CHAIN_EXT_ID = "noknok.AuthenticatorFilterChain";
    public static final String FILTER_CHAIN_FIDO2_EXT_ID = "noknok.webauthnAuthenticatorFilter";
    public static final String LOCATION_SIGNAL_EXT_ID = "noknok.uaf.location";
    public static final String MANAGE_EXT_ID = "noknok.manageAuthenticator";
    public static final String METRICS_EXT_ID = "noknok.metrics";
    public static final String OOB_DOMAIN_EXT_ID = "noknok.oobdomain";
    public static final String PLAY_INTEGRITY_EXT_ID = "noknok.play.integrity";
    public static final String PROMPT_EXT_ID = "noknok.prompt";
    public static final String SHOW_TRANSACTION_EXT_ID = "noknok.showTransaction";
    public static final String WIFI_SSID_EXT_ID = "noknok.wifi.ssid";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<IExtensionProcessor> f63308a;

    public ExtensionManager(List<IExtensionProcessor> list) {
        if (list == null) {
            throw new RuntimeException("Empty extension processor list.");
        }
        this.f63308a = list;
    }

    public void finish(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map) {
        Iterator<IExtensionProcessor> it = this.f63308a.iterator();
        while (it.hasNext()) {
            it.next().finish(iExtensionList, map);
        }
    }

    public void start(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map, ActivityProxy activityProxy) {
        Iterator<IExtensionProcessor> it = this.f63308a.iterator();
        while (it.hasNext()) {
            it.next().start(iExtensionList, map, activityProxy);
        }
    }
}
