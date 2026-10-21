package com.noknok.android.client.appsdk_plus;

import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class OperationResultObserver implements IOperationResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData<OperationResult> f62938a = new MutableLiveData<>();

    public MutableLiveData<OperationResult> getLiveData() {
        return this.f62938a;
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public void onComplete(OperationResultListener.ListenerOperationType listenerOperationType, IOperationResultListener.OperationData operationData, HashMap<String, String> map) {
        this.f62938a.postValue(new OperationResult(Boolean.TRUE, listenerOperationType, operationData, null, map, null));
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public void onFailure(OperationResultListener.ListenerOperationType listenerOperationType, RuntimeException runtimeException, HashMap<String, String> map) {
        this.f62938a.postValue(new OperationResult(Boolean.FALSE, listenerOperationType, null, runtimeException, map, null));
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public void onSessionDataUpdated(SessionData sessionData) {
        this.f62938a.postValue(new OperationResult(Boolean.TRUE, null, null, null, null, sessionData));
    }
}
