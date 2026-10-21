package com.noknok.android.uaf.framework.service;

import android.content.SharedPreferences;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.utils.AuthenticatorFilterInParams;
import com.noknok.android.client.utils.AuthenticatorFilterOutParams;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class SelectAndRemember implements IAuthenticatorFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f63590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63591b = 0;

    @Override // com.noknok.android.client.utils.IAuthenticatorFilter
    public AuthenticatorFilterOutParams process(AuthenticatorFilterInParams authenticatorFilterInParams) {
        ArrayList arrayList;
        if (!authenticatorFilterInParams.operationType.equals(IAuthenticatorFilter.OperationType.Auth)) {
            return new UIAuthenticatorFilter().process(authenticatorFilterInParams);
        }
        this.f63591b++;
        SharedPreferences sharedPreferences = authenticatorFilterInParams.context.getSharedPreferences("SelectAndRemember", 0);
        this.f63590a = sharedPreferences;
        List<List<AuthenticatorInfo>> list = authenticatorFilterInParams.authenticators;
        Set<String> stringSet = sharedPreferences.getStringSet("aaid", new HashSet());
        Iterator<List<AuthenticatorInfo>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                arrayList = null;
                break;
            }
            List<AuthenticatorInfo> next = it.next();
            if (next.size() == stringSet.size()) {
                HashSet hashSet = new HashSet();
                Iterator<AuthenticatorInfo> it2 = next.iterator();
                while (it2.hasNext()) {
                    hashSet.add(it2.next().aaid);
                }
                if (stringSet.equals(hashSet)) {
                    arrayList = new ArrayList();
                    arrayList.add(next);
                    break;
                }
            }
        }
        if (arrayList != null && this.f63591b == 1) {
            return new AuthenticatorFilterOutParams().setAuthenticators(arrayList);
        }
        AuthenticatorFilterOutParams authenticatorFilterOutParamsProcess = new UIAuthenticatorFilter().process(authenticatorFilterInParams);
        List<AuthenticatorInfo> list2 = authenticatorFilterOutParamsProcess.mAuthenticators.get(0);
        HashSet hashSet2 = new HashSet();
        Iterator<AuthenticatorInfo> it3 = list2.iterator();
        while (it3.hasNext()) {
            hashSet2.add(it3.next().aaid);
        }
        SharedPreferences.Editor editorEdit = this.f63590a.edit();
        editorEdit.clear();
        editorEdit.putStringSet("aaid", hashSet2);
        editorEdit.apply();
        return authenticatorFilterOutParamsProcess;
    }
}
