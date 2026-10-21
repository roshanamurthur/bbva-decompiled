package com.bbva.tohu.android.product.valkyria.sdk.logic;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.LoginNeededException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Armadillo401Exception;
import com.bbva.tohu.android.core.exceptions.backend.Tohu403Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.response.DeviceDeleteResponse;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.CredentialService;

/* JADX INFO: loaded from: classes6.dex */
public class DeleteDeviceLogic {
    private static final String TAG = "DeleteDeviceLogic";
    private CredentialService credentialService;
    private DeviceInfo deviceInfo;
    private BackendService mBackendService;

    public DeleteDeviceLogic(BackendService backendService, DeviceInfo deviceInfo, CredentialService credentialService) {
        this.mBackendService = backendService;
        this.deviceInfo = deviceInfo;
        this.credentialService = credentialService;
    }

    public DeviceDeleteResponse doDeleteDevice(String str) throws LoginNeededException, TohuBackendException, NetworkNotPresentException, CryptoInitException {
        try {
            String str2 = TAG;
            LogTohu.d(str2, "doDeleteDevice, deviceCode: " + this.deviceInfo.getDeviceCode(), new Object[0]);
            DeviceDeleteResponse deviceDeleteResponseDeleteDevice = this.mBackendService.deleteDevice(this.deviceInfo.getDeviceCode(), this.credentialService.getJwt(str));
            LogTohu.i(str2, "Delete Device response : \n%s", deviceDeleteResponseDeleteDevice);
            return deviceDeleteResponseDeleteDevice;
        } catch (Armadillo401Exception e5) {
            LogTohu.d(TAG, "Armadillo returns 401 - Access token expired : " + e5, new Object[0]);
            throw new LoginNeededException(e5);
        } catch (Tohu403Exception e7) {
            LogTohu.d(TAG, "Armadillo returns 403 : " + e7, new Object[0]);
            throw new LoginNeededException(e7);
        }
    }
}
