package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Intent;
import android.os.Parcelable;
import com.bbva.tohu.android.core.response.ActionResponse;
import com.bbva.tohu.android.core.response.ListValueWrapper;
import com.bbva.tohu.android.core.response.ValueWrapper;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.BroadcastActions;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BroadcastManagerDefaultImpl implements BroadcastManager {
    private static final String TAG = "BroadcastManager";
    private final String action;

    private BroadcastManagerDefaultImpl(String str) {
        this.action = str;
    }

    public static BroadcastManager create(String str) {
        return new BroadcastManagerDefaultImpl(str);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager
    public void sendBroadcast(String str, Parcelable parcelable) {
        sendBroadcast(new ActionResponse(str, parcelable));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager
    public void sendBroadcast(String str, String str2) {
        sendBroadcast(new ActionResponse(str, new ValueWrapper(str2)));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager
    public void sendBroadcast(String str, List<String> list) {
        sendBroadcast(new ActionResponse(str, new ListValueWrapper(list)));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager
    public void sendBroadcast(String str) {
        sendBroadcast(new ActionResponse(str));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager
    public void sendBroadcast(TohuSdkException tohuSdkException) {
        sendBroadcast(new ActionResponse(tohuSdkException.getBroadcastCode()));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager
    public void sendBroadcast(TohuSdkException tohuSdkException, Parcelable parcelable) {
        sendBroadcast(new ActionResponse(tohuSdkException.getBroadcastCode(), parcelable));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager
    public void sendBroadcast(TohuSdkException tohuSdkException, String str) {
        sendBroadcast(new ActionResponse(tohuSdkException.getBroadcastCode(), new ValueWrapper(str)));
    }

    private void sendBroadcast(ActionResponse actionResponse) {
        LogTohu.i(TAG, "Send broadcast to %s, response: %s", this.action, actionResponse);
        Intent intentPutExtra = new Intent(this.action).putExtra(BroadcastActions.TOHU_ACTION_RESPONSE, actionResponse);
        intentPutExtra.setClassName(ManagerFactory.getPropertiesManager(MobilePayment.getInstance().getContext()).getBroadcastReceiverPackage(), ManagerFactory.getPropertiesManager(MobilePayment.getInstance().getContext()).getBroadcastReceiverClass());
        LogTohu.i(TAG, "Intent to be sent: %s", intentPutExtra);
        MobilePayment.getInstance().getContext().sendBroadcast(intentPutExtra);
    }
}
