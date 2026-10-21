package com.noknok.android.client.appsdk_plus.management;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.noknok.android.client.appsdk.ResultType;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public class ManageRegistrationViewModel extends ViewModel implements IManageRegistrationsLiveData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final MutableLiveData<ManageRegResultParam> f63001a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final MutableLiveData<Pair<ResultType, String>> f63002b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final MutableLiveData<Pair<ResultType, String>> f63003c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ManageRegistrationController f63004d = null;

    public static class ManageRegResultParam {
        public final JSONArray jsonRegList;
        public final String message;
        public final ResultType resultType;

        public ManageRegResultParam(JSONArray jSONArray, ResultType resultType, String str) {
            this.jsonRegList = jSONArray;
            this.resultType = resultType;
            this.message = str;
        }
    }

    public ManageRegistrationController getController() {
        return this.f63004d;
    }

    public MutableLiveData<ManageRegResultParam> getFidoMethodsLiveData() {
        return this.f63001a;
    }

    public MutableLiveData<Pair<ResultType, String>> getRemoveResult() {
        return this.f63002b;
    }

    public MutableLiveData<Pair<ResultType, String>> getRenameResult() {
        return this.f63003c;
    }

    @Override // com.noknok.android.client.appsdk_plus.management.IManageRegistrationsLiveData
    public void onRemoveCompleted(ResultType resultType, String str) {
        this.f63002b.postValue(new Pair<>(resultType, str));
    }

    @Override // com.noknok.android.client.appsdk_plus.management.IManageRegistrationsLiveData
    public void onRenameCompleted(ResultType resultType, String str) {
        this.f63003c.postValue(new Pair<>(resultType, str));
    }

    public void setController(ManageRegistrationController manageRegistrationController) {
        this.f63004d = manageRegistrationController;
    }

    @Override // com.noknok.android.client.appsdk_plus.management.IManageRegistrationsLiveData
    public void setMethods(JSONArray jSONArray, ResultType resultType, String str) {
        this.f63001a.postValue(new ManageRegResultParam(jSONArray, resultType, str));
    }
}
