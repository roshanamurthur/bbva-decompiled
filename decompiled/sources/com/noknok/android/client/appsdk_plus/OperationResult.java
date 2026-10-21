package com.noknok.android.client.appsdk_plus;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class OperationResult {
    public final RuntimeException exception;
    public final HashMap<String, String> extras;
    public final Boolean isSucceeded;
    public final IOperationResultListener.OperationData result;
    public final SessionData sessionData;
    public final OperationResultListener.ListenerOperationType type;

    public OperationResult(Boolean bool, OperationResultListener.ListenerOperationType listenerOperationType, IOperationResultListener.OperationData operationData, RuntimeException runtimeException, HashMap<String, String> map, SessionData sessionData) {
        this.isSucceeded = bool;
        this.type = listenerOperationType;
        this.result = operationData;
        this.exception = runtimeException;
        this.extras = map;
        this.sessionData = sessionData;
    }
}
