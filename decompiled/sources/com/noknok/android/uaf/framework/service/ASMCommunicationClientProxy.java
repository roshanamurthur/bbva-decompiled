package com.noknok.android.uaf.framework.service;

import android.content.Context;
import com.fido.android.framework.service.Mfac;
import com.google.gson.JsonElement;
import com.noknok.android.client.appsdk.commlib.UafAidlCommClient;
import com.noknok.android.client.appsdk.commlib.UafIntentCommClient;
import com.noknok.android.client.commlib.ICommunicationClient;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.utils.AppSDKConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ASMCommunicationClientProxy implements ICommunicationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f63555a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, ICommunicationClient> f63557c;

    public interface ASMDestinationType {
        public static final String ASM_INTENT = "INTENT";
        public static final String ASM_LOCAL = "LOCAL";
        public static final String ASM_SERVICE = "SERVICE";
    }

    public ASMCommunicationClientProxy(Map<String, ICommunicationClient> map) {
        this.f63556b = Mfac.Instance().getConfig().get(AppSDKConfig.Key.useRemoteASM).getAsBoolean();
        this.f63557c = map;
        Iterator<JsonElement> it = Mfac.Instance().getConfig().get(AppSDKConfig.Key.clientOrder).getAsJsonArray().iterator();
        while (it.hasNext()) {
            if (it.next().getAsString().equalsIgnoreCase("REMOTE")) {
                Context context = Mfac.Instance().getContext();
                String[] serviceModuleList = new UafIntentCommClient(context, null).getServiceModuleList(null);
                String[] serviceModuleList2 = new UafAidlCommClient(context).getServiceModuleList(null);
                if (serviceModuleList.length > 0 || serviceModuleList2.length > 0) {
                    this.f63556b = false;
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public String[] getServiceModuleList(String str) {
        ArrayList arrayList = new ArrayList();
        this.f63555a.clear();
        Iterator<Map.Entry<String, ICommunicationClient>> it = this.f63557c.entrySet().iterator();
        String[] strArr = null;
        String[] strArr2 = null;
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                if (strArr != null && strArr2 != null) {
                    for (String str2 : strArr) {
                        String str3 = str2.split(",")[0];
                        for (String str4 : strArr2) {
                            String str5 = str4.split(",")[0];
                            if (str3.equals(str5)) {
                                this.f63555a.put(str5, str2);
                                arrayList.add("SERVICE/".concat(str4));
                            }
                        }
                    }
                }
                return (String[]) arrayList.toArray(new String[0]);
            }
            Map.Entry<String, ICommunicationClient> next = it.next();
            String key = next.getKey();
            ICommunicationClient value = next.getValue();
            if (key.equals(ASMDestinationType.ASM_LOCAL) || this.f63556b) {
                String[] serviceModuleList = value.getServiceModuleList("ASM");
                if (serviceModuleList != null && serviceModuleList.length != 0) {
                    switch (key) {
                        case "INTENT":
                            int length = serviceModuleList.length;
                            while (i10 < length) {
                                arrayList.add("INTENT/" + serviceModuleList[i10]);
                                i10++;
                            }
                            strArr = serviceModuleList;
                            break;
                        case "SERVICE":
                            strArr2 = serviceModuleList;
                            break;
                        case "LOCAL":
                            int length2 = serviceModuleList.length;
                            while (i10 < length2) {
                                arrayList.add("LOCAL/" + serviceModuleList[i10]);
                                i10++;
                            }
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public long sendRequest(String str, String str2, Object obj, ICommunicationClientResponse iCommunicationClientResponse) {
        String str3;
        String str4;
        String[] strArrSplit = str.split("/");
        if (!strArrSplit[0].equals(ASMDestinationType.ASM_SERVICE) || (str2.contains("GetInfo") && str2.contains("Dereg"))) {
            str3 = strArrSplit[0];
            str4 = strArrSplit[1];
        } else {
            str4 = (String) this.f63555a.get(strArrSplit[1].split(",")[0]);
            str3 = ASMDestinationType.ASM_INTENT;
        }
        return this.f63557c.get(str3).sendRequest(str4, str2, obj, iCommunicationClientResponse);
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void removeRequest(long j10) {
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void waitForResponse(long j10) {
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void postRequest(String str, String str2, Object obj) {
    }
}
