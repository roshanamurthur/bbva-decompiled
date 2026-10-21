package com.bbva.valkyria.sdk.services;

import android.annotation.SuppressLint;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.camera.core.imagecapture.a;
import com.bbva.gp2.android.trustdevice.sdk.export.TrustDevice;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.BroadcastActions;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.ContextValidatorException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.LoadPropertiesException;
import com.bbva.tohu.android.product.valkyria.sdk.logic.LogicFactory;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.BroadcastManagerDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.BaseHceLogic;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(api = 23)
@SuppressLint({"ObsoleteSdkInt"})
public class AndroidHceService extends HostApduService {
    public static final byte[] EMV_COMMAND_ABORTED = {105, 1};
    public static final String TAG = "AndroidHceService";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BaseHceLogic f37775p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f37776q0 = false;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.nfc.cardemulation.HostApduService
    public void onDeactivated(int i10) {
        byte[] bArrOnDeactivated;
        if (this.f37776q0 && (bArrOnDeactivated = this.f37775p0.onDeactivated(i10)) != null) {
            sendResponseApdu(bArrOnDeactivated);
        }
        if (i10 == 1) {
            LogTohu.d(TAG, "onDeactivated: DEACTIVATION_DESELECTED", new Object[0]);
        } else if (i10 == 0) {
            LogTohu.d(TAG, "onDeactivated: DEACTIVATION_LINK_LOSS", new Object[0]);
        }
        LogTohu.d(TAG, "AndroidHceService onDeactivated()", new Object[0]);
    }

    @Override // android.nfc.cardemulation.HostApduService
    public byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        if (!this.f37776q0) {
            if (MobilePayment.getInstance().getContext() == null) {
                try {
                    TrustDevice.INSTANCE.init(super.getApplicationContext());
                    MobilePayment.getInstance().init(super.getApplicationContext());
                } catch (ContextValidatorException | LoadPropertiesException e5) {
                    LogTohu.e(TAG, "Error initializing MobilePayment in AndroidHceService", e5);
                }
            }
            if (MobilePayment.getInstance().getContext() == null) {
                LogTohu.d(TAG, "Context not present, mobile payment not initialized", new Object[0]);
            } else {
                this.f37775p0 = LogicFactory.getBaseHceService(new a(), BroadcastManagerDefaultImpl.create(BroadcastActions.TOHU_PAYMENT_ACTION), super.getApplicationContext());
                this.f37776q0 = true;
            }
        }
        return this.f37776q0 ? this.f37775p0.processCommandApdu(bArr) : EMV_COMMAND_ABORTED;
    }
}
