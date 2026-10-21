package com.bbva.tohu.android.core.managers;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CallbackManagerDefaultImpl implements CallbackManager {
    private static final String TAG = "CallbackManagerDefaultImpl";
    protected final ResultReceiver resultReceiver;

    public CallbackManagerDefaultImpl(ResultReceiver resultReceiver) {
        this.resultReceiver = resultReceiver;
    }

    public Bundle createBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                bundle.putString(str, map.get(str));
            }
        }
        return bundle;
    }

    public Bundle createBundleWithArrayList(Map<String, ArrayList<String>> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                bundle.putStringArrayList(str, map.get(str));
            }
        }
        return bundle;
    }

    public void send(int i10, Map<String, String> map) {
        if (this.resultReceiver != null) {
            this.resultReceiver.send(i10, createBundle(map));
        }
    }

    @Override // com.bbva.tohu.android.core.managers.CallbackManager
    public void sendErrorWithCode(int i10) {
        send(i10, null);
    }

    @Override // com.bbva.tohu.android.core.managers.CallbackManager
    public void sendErrorWithCodeAndData(int i10, Map<String, ArrayList<String>> map) {
        if (this.resultReceiver != null) {
            this.resultReceiver.send(i10, createBundleWithArrayList(map));
        }
    }

    @Override // com.bbva.tohu.android.core.managers.CallbackManager
    public void sendResultOk() {
        LogTohu.d(TAG, "Callback Success", new Object[0]);
        send(4, null);
    }

    @Override // com.bbva.tohu.android.core.managers.CallbackManager
    public void sendTohuException(TohuSdkException tohuSdkException, Map<String, String> map) {
        send(tohuSdkException.getCallbackCode(), map);
    }
}
