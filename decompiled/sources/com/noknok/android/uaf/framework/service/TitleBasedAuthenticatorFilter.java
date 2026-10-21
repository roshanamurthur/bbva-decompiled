package com.noknok.android.uaf.framework.service;

import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.utils.AuthenticatorFilterInParams;
import com.noknok.android.client.utils.AuthenticatorFilterOutParams;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class TitleBasedAuthenticatorFilter implements IAuthenticatorFilter {
    private boolean a(List<List<AuthenticatorInfo>> list, List<AuthenticatorInfo> list2) {
        boolean z10 = false;
        for (List<AuthenticatorInfo> list3 : list) {
            if (list3.size() == list2.size()) {
                for (AuthenticatorInfo authenticatorInfo : list3) {
                    Iterator<AuthenticatorInfo> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        AuthenticatorInfo next = it.next();
                        if (authenticatorInfo.title.equals(next.title) && authenticatorInfo.aaid.split("#")[0].equals(next.aaid.split("#")[0])) {
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    @Override // com.noknok.android.client.utils.IAuthenticatorFilter
    public AuthenticatorFilterOutParams process(AuthenticatorFilterInParams authenticatorFilterInParams) {
        ArrayList arrayList = new ArrayList();
        for (List<AuthenticatorInfo> list : authenticatorFilterInParams.authenticators) {
            if (!a(arrayList, list)) {
                arrayList.add(list);
            }
        }
        return new AuthenticatorFilterOutParams().setAuthenticators(arrayList);
    }
}
