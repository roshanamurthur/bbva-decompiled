package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.os.ResultReceiver;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import com.bbva.tohu.android.product.valkyria.sdk.response.DeviceDeleteResponse;

/* JADX INFO: loaded from: classes6.dex */
public class DeleteDeviceControllerLogic {
    private static final String DEVICE_NOT_FOUND_CODE = "404";
    private static final String TAG = "DeleteDeviceControllerLogic";
    private DeleteDeviceLogic deleteDeviceLogic;

    public DeleteDeviceControllerLogic(DeleteDeviceLogic deleteDeviceLogic) {
        this.deleteDeviceLogic = deleteDeviceLogic;
    }

    public void deleteDevice(String str, ResultReceiver resultReceiver) {
        CallbackManager callbackManager = ManagerFactory.getCallbackManager(resultReceiver);
        try {
            DeviceDeleteResponse deviceDeleteResponseDoDeleteDevice = this.deleteDeviceLogic.doDeleteDevice(str);
            String str2 = TAG;
            LogTohu.d(str2, "Delete device response : %s %s", deviceDeleteResponseDoDeleteDevice.getResult().getCode(), deviceDeleteResponseDoDeleteDevice.getResult().getInfo());
            if ("404".equals(deviceDeleteResponseDoDeleteDevice.getResult().getCode())) {
                LogTohu.e(str2, "Device to delete don't found.", new Object[0]);
                callbackManager.sendTohuException(new NotFoundEntityException(), null);
            } else {
                callbackManager.sendResultOk();
            }
        } catch (CryptoInitException e5) {
            LogTohu.e(TAG, "Error CryptoInitException: ", e5);
            callbackManager.sendTohuException(e5, null);
        } catch (TohuSdkException e7) {
            LogTohu.e(TAG, "Error DeleteDeviceControllerLogic: ", e7);
            callbackManager.sendTohuException(e7, null);
        }
    }
}
