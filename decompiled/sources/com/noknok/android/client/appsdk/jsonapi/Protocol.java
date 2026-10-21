package com.noknok.android.client.appsdk.jsonapi;

import com.bbva.notifications.constants.PushConstants;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.appsdk.ProtocolType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class Protocol {

    @Expose
    public DiscoveryInfo discoveryInfo;

    @Expose
    public String protocolVersion;

    public Protocol(ProtocolType protocolType, String str) {
        this.protocolVersion = a(protocolType, str);
    }

    private static String a(ProtocolType protocolType, String str) {
        return protocolType.protocolName() + PushConstants.GE_PARAMS_SEPARATOR + str;
    }

    public Protocol setDiscoveryInfo(DiscoveryInfo discoveryInfo) {
        DiscoveryInfo discoveryInfo2 = new DiscoveryInfo();
        this.discoveryInfo = discoveryInfo2;
        discoveryInfo2.availableAuthenticators.addAll(discoveryInfo.availableAuthenticators);
        return this;
    }

    public Protocol(ProtocolType protocolType, List<DiscoveryInfo.Version> list) {
        StringBuilder sb2 = new StringBuilder();
        for (DiscoveryInfo.Version version : list) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(a(protocolType, version.toString()));
        }
        this.protocolVersion = sb2.toString();
    }
}
