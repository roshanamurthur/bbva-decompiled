package com.noknok.android.uaf.framework.service;

import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.utils.AuthenticatorFilterInParams;
import com.noknok.android.client.utils.AuthenticatorFilterOutParams;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DisallowedAuthenticatorFilter implements IAuthenticatorFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IAuthenticatorFilter.OperationType f63581a;

    public DisallowedAuthenticatorFilter(IAuthenticatorFilter.OperationType operationType) {
        this.f63581a = operationType;
    }

    @Override // com.noknok.android.client.utils.IAuthenticatorFilter
    public AuthenticatorFilterOutParams process(AuthenticatorFilterInParams authenticatorFilterInParams) {
        List<List<AuthenticatorInfo>> list = authenticatorFilterInParams.authenticators;
        if (authenticatorFilterInParams.operationType.equals(this.f63581a)) {
            List<String> list2 = authenticatorFilterInParams.disallowedAAIDs;
            ArrayList arrayList = new ArrayList();
            for (List<AuthenticatorInfo> list3 : list) {
                Iterator<AuthenticatorInfo> it = list3.iterator();
                while (it.hasNext()) {
                    if (list2.contains(it.next().aaid)) {
                        it.remove();
                    }
                }
                if (!list3.isEmpty()) {
                    arrayList.add(list3);
                }
            }
            list = arrayList;
        }
        return new AuthenticatorFilterOutParams().setAuthenticators(list);
    }
}
