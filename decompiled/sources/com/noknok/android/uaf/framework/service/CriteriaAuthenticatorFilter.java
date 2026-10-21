package com.noknok.android.uaf.framework.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.utils.AuthenticatorFilterInParams;
import com.noknok.android.client.utils.AuthenticatorFilterOutParams;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class CriteriaAuthenticatorFilter implements IAuthenticatorFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsonArray f63580a;

    public CriteriaAuthenticatorFilter(JsonArray jsonArray) {
        this.f63580a = jsonArray;
    }

    @Override // com.noknok.android.client.utils.IAuthenticatorFilter
    public AuthenticatorFilterOutParams process(AuthenticatorFilterInParams authenticatorFilterInParams) {
        ArrayList arrayList = new ArrayList();
        for (List<AuthenticatorInfo> list : authenticatorFilterInParams.authenticators) {
            JsonArray jsonArray = this.f63580a;
            Iterator<AuthenticatorInfo> it = list.iterator();
            boolean zEqualsIgnoreCase = true;
            do {
                if (!it.hasNext()) {
                    arrayList.add(list);
                    break;
                }
                AuthenticatorInfo next = it.next();
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        long asInt = jsonElement.getAsInt();
                        zEqualsIgnoreCase = (next.userVerification & asInt) == asInt;
                    } catch (NumberFormatException unused) {
                        zEqualsIgnoreCase = next.aaid.equalsIgnoreCase(jsonElement.getAsString());
                    }
                    if (zEqualsIgnoreCase) {
                        break;
                    }
                }
            } while (zEqualsIgnoreCase);
        }
        return new AuthenticatorFilterOutParams().setAuthenticators(arrayList);
    }
}
