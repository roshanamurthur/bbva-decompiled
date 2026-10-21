package com.noknok.android.client.extension;

import android.app.Activity;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public interface IExtensionProcessor {

    public enum ExtProcParamKey {
        FACET_ID_KEY,
        FC_PARAMS_KEY,
        KS_ATTESTATION_KEY,
        PACKAGE_NAME_KEY,
        FILTER_CHAIN_PARAMS_KEY,
        EXT_OP_TYPE
    }

    public enum ExtensionMode {
        always,
        never,
        requested,
        silently
    }

    public enum ExtensionOpType {
        init,
        finish,
        protocol
    }

    void finish(IExtensionList iExtensionList, HashMap<ExtProcParamKey, String> map);

    @Deprecated
    void start(IExtensionList iExtensionList, HashMap<ExtProcParamKey, String> map, Activity activity);

    void start(IExtensionList iExtensionList, HashMap<ExtProcParamKey, String> map, ActivityProxy activityProxy);
}
