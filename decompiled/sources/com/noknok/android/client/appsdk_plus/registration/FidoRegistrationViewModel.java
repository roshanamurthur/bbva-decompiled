package com.noknok.android.client.appsdk_plus.registration;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.noknok.android.client.appsdk.ResultType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FidoRegistrationViewModel extends ViewModel implements IFidoRegistrationLiveData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData<RegResultParam> f63092a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MutableLiveData<Pair<ResultType, String>> f63093b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableLiveData<Pair<String, String>> f63094c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FidoRegistrationController f63095d = null;

    public static class RegResultParam {
        public final List<FidoMethod> fidoMethods;
        public final String message;
        public final ResultType resultType;

        public RegResultParam(List<FidoMethod> list, ResultType resultType, String str) {
            this.fidoMethods = list;
            this.resultType = resultType;
            this.message = str;
        }
    }

    @Override // com.noknok.android.client.appsdk_plus.registration.IFidoRegistrationLiveData
    public void askCredentialName(String str, String str2) {
        this.f63094c.postValue(new Pair<>(str, str2));
    }

    public MutableLiveData<Pair<String, String>> getAskNameData() {
        return this.f63094c;
    }

    public FidoRegistrationController getController() {
        return this.f63095d;
    }

    public MutableLiveData<RegResultParam> getFidoMethodsLiveData() {
        return this.f63092a;
    }

    public MutableLiveData<Pair<ResultType, String>> getOperationResult() {
        return this.f63093b;
    }

    @Override // com.noknok.android.client.appsdk_plus.registration.IFidoRegistrationLiveData
    public void onOperationCompleted(ResultType resultType, String str) {
        this.f63093b.postValue(new Pair<>(resultType, str));
    }

    public void setController(FidoRegistrationController fidoRegistrationController) {
        this.f63095d = fidoRegistrationController;
    }

    @Override // com.noknok.android.client.appsdk_plus.registration.IFidoRegistrationLiveData
    public void setMethods(List<FidoMethod> list, ResultType resultType, String str) {
        this.f63092a.postValue(new RegResultParam(list, resultType, str));
    }
}
