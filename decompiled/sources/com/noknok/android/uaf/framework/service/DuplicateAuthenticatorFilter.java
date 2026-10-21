package com.noknok.android.uaf.framework.service;

import com.fido.android.framework.service.Mfac;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.AuthenticatorFilterInParams;
import com.noknok.android.client.utils.AuthenticatorFilterOutParams;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DuplicateAuthenticatorFilter implements IAuthenticatorFilter {
    @Override // com.noknok.android.client.utils.IAuthenticatorFilter
    public AuthenticatorFilterOutParams process(AuthenticatorFilterInParams authenticatorFilterInParams) {
        List<List<AuthenticatorInfo>> list = authenticatorFilterInParams.authenticators;
        JsonElement jsonElement = Mfac.Instance().getConfig().get(AppSDKConfig.Key.duplicateAuthenticatorSets);
        if (jsonElement != null) {
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            for (int i10 = 0; i10 < asJsonArray.size(); i10++) {
                JsonObject asJsonObject = asJsonArray.get(i10).getAsJsonObject();
                if (asJsonObject.has("aaid")) {
                    JsonArray asJsonArray2 = asJsonObject.getAsJsonArray("aaid");
                    ArrayList arrayList = new ArrayList();
                    boolean z10 = true;
                    for (List<AuthenticatorInfo> list2 : list) {
                        int i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            if (i11 >= asJsonArray2.size()) {
                                arrayList.add(list2);
                                break;
                            }
                            JsonArray asJsonArray3 = asJsonArray2.get(i11).getAsJsonArray();
                            if (list2.size() == asJsonArray3.size()) {
                                Iterator<AuthenticatorInfo> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (!asJsonArray3.contains(new JsonPrimitive(it.next().aaid))) {
                                        z11 = false;
                                        break;
                                    }
                                    z11 = true;
                                }
                                if (z11) {
                                    if (!z10) {
                                        break;
                                    }
                                    arrayList.add(list2);
                                    z10 = false;
                                    break;
                                }
                            }
                            i11++;
                        }
                    }
                    list = arrayList;
                }
            }
        }
        return new AuthenticatorFilterOutParams().setAuthenticators(list);
    }
}
