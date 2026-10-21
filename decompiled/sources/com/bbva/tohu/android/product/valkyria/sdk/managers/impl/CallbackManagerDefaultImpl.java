package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.builders.CallbackDataBuilder;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CallbackManagerDefaultImpl implements CallbackManager {
    private static final String TAG = "CallbackManagerDefaultImpl";
    private final ResultReceiver resultReceiver;

    public CallbackManagerDefaultImpl(ResultReceiver resultReceiver) {
        this.resultReceiver = resultReceiver;
    }

    private Bundle createBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                bundle.putString(str, map.get(str));
            }
        }
        return bundle;
    }

    private Bundle createBundleWithArrayList(Map<String, ArrayList<String>> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                bundle.putStringArrayList(str, map.get(str));
            }
        }
        return bundle;
    }

    private void send(int i10, Map<String, String> map) {
        if (this.resultReceiver != null) {
            this.resultReceiver.send(i10, createBundle(map));
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager
    public void result(Map<String, String> map) {
        LogTohu.d(TAG, "Callback Success", new Object[0]);
        send(4, map);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager
    public void sendResultOk() {
        result(CallbackDataBuilder.aMap().withResult("ok").build());
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager
    public void sendTohuException(TohuSdkException tohuSdkException, Map<String, String> map) {
        send(tohuSdkException.getCallbackCode(), map);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager
    public void sendWithData(int i10, Map<String, ArrayList<String>> map) {
        if (this.resultReceiver != null) {
            this.resultReceiver.send(i10, createBundleWithArrayList(map));
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager
    public void sendWithResult(String str) {
        result(CallbackDataBuilder.aMap().withResult(str).build());
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager
    public void sendWithResult(Parcelable parcelable) {
        if (this.resultReceiver != null) {
            this.resultReceiver.send(4, createBundle("result", parcelable));
        }
    }

    private Bundle createBundle(String str, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        if (parcelable != null) {
            bundle.putParcelable(str, parcelable);
        }
        return bundle;
    }
}
