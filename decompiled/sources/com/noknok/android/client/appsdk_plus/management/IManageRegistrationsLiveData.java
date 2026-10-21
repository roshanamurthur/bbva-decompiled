package com.noknok.android.client.appsdk_plus.management;

import com.noknok.android.client.appsdk.ResultType;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public interface IManageRegistrationsLiveData {
    void onRemoveCompleted(ResultType resultType, String str);

    void onRenameCompleted(ResultType resultType, String str);

    void setMethods(JSONArray jSONArray, ResultType resultType, String str);
}
