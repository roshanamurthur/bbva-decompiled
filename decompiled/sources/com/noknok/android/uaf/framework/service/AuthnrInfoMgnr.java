package com.noknok.android.uaf.framework.service;

import com.google.gson.JsonElement;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.json.ASMRequest;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.asm.api.uaf.json.GetInfoOut;
import com.noknok.android.client.asm.api.uaf.json.Version;
import com.noknok.android.client.utils.JsonObjectAdapter;
import com.noknok.android.client.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class AuthnrInfoMgnr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f63578a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, ArrayList<AuthenticatorInfo>> f63579b = new ConcurrentHashMap();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void a(String str) {
        ASMRequest aSMRequest = new ASMRequest();
        aSMRequest.requestType = ASMRequest.RequestType.GetInfo;
        aSMRequest.asmVersion = new Version((short) 1, (short) 0);
        ArrayList<AuthenticatorInfo> arrayList = (ArrayList) ((GetInfoOut) JsonObjectAdapter.GsonBuilder().create().fromJson((JsonElement) AuthenticatorManager.executeAsmRequest(aSMRequest, str).responseData, GetInfoOut.class)).Authenticators;
        if (arrayList == null || arrayList.size() <= 0) {
            Logger.e("AuthnrInfoMgnr", "getAuthenticatorsInfo failed to getInfo ");
        } else {
            this.f63579b.put(str, arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.util.ArrayList<com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Map<java.lang.String, java.util.ArrayList<com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.util.ArrayList<com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.util.ArrayList<com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map<java.lang.String, java.util.ArrayList<com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo>>, java.util.concurrent.ConcurrentHashMap] */
    public ArrayList<AuthenticatorInfo> getAuthenticatorsInfo(String str) {
        try {
            if (this.f63579b.containsKey(str) && System.currentTimeMillis() - this.f63578a < 2000) {
                return (ArrayList) this.f63579b.get(str);
            }
            if (System.currentTimeMillis() - this.f63578a >= 2000) {
                Iterator it = this.f63579b.keySet().iterator();
                while (it.hasNext()) {
                    a((String) it.next());
                }
                this.f63578a = System.currentTimeMillis();
            }
            if (!this.f63579b.containsKey(str)) {
                a(str);
            }
            return (ArrayList) this.f63579b.get(str);
        } catch (AsmException e5) {
            Logger.w("AuthnrInfoMgnr", "getAuthenticatorsInfo failed", e5);
        }
    }
}
