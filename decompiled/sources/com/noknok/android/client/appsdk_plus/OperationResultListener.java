package com.noknok.android.client.appsdk_plus;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.bbva.component.dm.naturalauth.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class OperationResultListener implements IOperationResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile OperationResultListener f62934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ArrayList<IOperationResultListener> f62935b = new ArrayList<>();

    public enum ListenerOperationType {
        REG,
        AUTH,
        LIST_REG,
        DELETE_REG,
        RENAME_REG
    }

    public enum OperationMapKeys {
        AUTH_METHOD("authMethod"),
        USER_NAME(HintConstants.AUTOFILL_HINT_USERNAME),
        ADDITIONAL_INFO("additionalInfo"),
        REGISTRATIONS("registrations"),
        AUTHENTICATION_DATA(Constants.authenticationData),
        PROTOCOL_TYPE("protocolType");

        public final String value;

        OperationMapKeys(String str) {
            this.value = str;
        }
    }

    private OperationResultListener(Context context) {
        addInstance(UserDataCache.getInstance(context));
    }

    public static void addInstance(IOperationResultListener iOperationResultListener) {
        ArrayList<IOperationResultListener> arrayList = f62935b;
        synchronized (arrayList) {
            arrayList.add(iOperationResultListener);
        }
    }

    public static HashMap<String, Object> createHashMapWithResultData(OperationMapKeys operationMapKeys, Object obj) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(operationMapKeys.value, obj);
        return map;
    }

    public static OperationResultListener getInstance(Context context) {
        if (f62934a == null) {
            synchronized (OperationResultListener.class) {
                try {
                    if (f62934a == null) {
                        f62934a = new OperationResultListener(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f62934a;
    }

    public static void removeInstance(IOperationResultListener iOperationResultListener) {
        ArrayList<IOperationResultListener> arrayList = f62935b;
        synchronized (arrayList) {
            arrayList.remove(iOperationResultListener);
        }
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public void onComplete(ListenerOperationType listenerOperationType, IOperationResultListener.OperationData operationData, HashMap<String, String> map) {
        ArrayList<IOperationResultListener> arrayList = f62935b;
        synchronized (arrayList) {
            try {
                Iterator<IOperationResultListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onComplete(listenerOperationType, operationData, map);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public void onFailure(ListenerOperationType listenerOperationType, RuntimeException runtimeException, HashMap<String, String> map) {
        ArrayList<IOperationResultListener> arrayList = f62935b;
        synchronized (arrayList) {
            try {
                Iterator<IOperationResultListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFailure(listenerOperationType, runtimeException, map);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.noknok.android.client.appsdk_plus.IOperationResultListener
    public void onSessionDataUpdated(SessionData sessionData) {
        ArrayList<IOperationResultListener> arrayList = f62935b;
        synchronized (arrayList) {
            try {
                Iterator<IOperationResultListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onSessionDataUpdated(sessionData);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
