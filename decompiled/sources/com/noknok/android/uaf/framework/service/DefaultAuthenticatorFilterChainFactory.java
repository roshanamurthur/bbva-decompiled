package com.noknok.android.uaf.framework.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.noknok.android.client.utils.AuthenticatorFilterChainFactory;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultAuthenticatorFilterChainFactory extends AuthenticatorFilterChainFactory {
    public void addCriteriaAuthenticatorFilter(List<IAuthenticatorFilter> list, JsonObject jsonObject) {
        if (jsonObject.has("criteria")) {
            list.add(new CriteriaAuthenticatorFilter(jsonObject.get("criteria").getAsJsonArray()));
        }
    }

    public void addDisallowedAuthenticatorFilterAuth(List<IAuthenticatorFilter> list, JsonObject jsonObject) {
        list.add(new DisallowedAuthenticatorFilter(IAuthenticatorFilter.OperationType.Auth));
    }

    public void addDisallowedAuthenticatorFilterReg(List<IAuthenticatorFilter> list, JsonObject jsonObject) {
        list.add(new DisallowedAuthenticatorFilter(IAuthenticatorFilter.OperationType.Reg));
    }

    public void addDuplicateAuthenticatorFilter(List<IAuthenticatorFilter> list, JsonObject jsonObject) {
        list.add(new DuplicateAuthenticatorFilter());
    }

    public void addRetryAuthenticatorFilter(List<IAuthenticatorFilter> list, JsonObject jsonObject) {
        if (jsonObject.has("selectAndRemember")) {
            list.add(new RetryAuthenticatorFilter());
        }
    }

    public void addSelectAndRemember(List<IAuthenticatorFilter> list, JsonObject jsonObject) {
        if (jsonObject.has("selectAndRemember")) {
            list.add(new SelectAndRemember());
        }
    }

    public void addTitleBasedAuthenticatorFilter(List<IAuthenticatorFilter> list, JsonObject jsonObject) {
        list.add(new TitleBasedAuthenticatorFilter());
    }

    public void addUIAuthenticatorFilter(List<IAuthenticatorFilter> list, JsonObject jsonObject) {
        list.add(new UIAuthenticatorFilter());
    }

    @Override // com.noknok.android.client.utils.AuthenticatorFilterChainFactory
    public List<IAuthenticatorFilter> createFilterChain(String str) {
        ArrayList arrayList = new ArrayList();
        JsonObject asJsonObject = str != null ? JsonParser.parseString(str).getAsJsonObject() : new JsonObject();
        addDisallowedAuthenticatorFilterAuth(arrayList, asJsonObject);
        addDuplicateAuthenticatorFilter(arrayList, asJsonObject);
        addTitleBasedAuthenticatorFilter(arrayList, asJsonObject);
        addDisallowedAuthenticatorFilterReg(arrayList, asJsonObject);
        addCriteriaAuthenticatorFilter(arrayList, asJsonObject);
        addRetryAuthenticatorFilter(arrayList, asJsonObject);
        addSelectAndRemember(arrayList, asJsonObject);
        addUIAuthenticatorFilter(arrayList, asJsonObject);
        return arrayList;
    }
}
