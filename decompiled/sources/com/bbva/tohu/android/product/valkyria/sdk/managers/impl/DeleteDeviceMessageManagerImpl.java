package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import com.bbva.tohu.android.core.constants.ResponseCodes;
import com.bbva.tohu.android.core.exceptions.CryptoException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.BroadcastActions;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager;
import com.bbva.tohu.android.product.valkyria.sdk.services.IAmNotService;

/* JADX INFO: loaded from: classes6.dex */
public class DeleteDeviceMessageManagerImpl implements MessageManager {
    private static final String MESSAGE_DELETE_DEVICE = "Message delete device";
    public static final String TAG = "DeleteDeviceMessageManagerImpl";
    private final BroadcastManager broadcastManager = BroadcastManagerDefaultImpl.create(BroadcastActions.TOHU_CARD_STATUS_UPDATED_ACTION);
    private final IAmNotService iAmNotService;

    public DeleteDeviceMessageManagerImpl(IAmNotService iAmNotService) {
        this.iAmNotService = iAmNotService;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager
    public void processMessage(String str, Context context) {
        LogTohu.d(TAG, MESSAGE_DELETE_DEVICE, new Object[0]);
        try {
            this.iAmNotService.doIAmNot();
            this.broadcastManager.sendBroadcast(PaymentStatus.NOT_ENABLED);
        } catch (CryptoException e5) {
            LogTohu.e(TAG, "Error processDeleteDeviceMessage in I Am Not service.", e5);
            BroadcastManagerDefaultImpl.create(BroadcastActions.TOHU_SYSTEM_NOTIFICATIONS).sendBroadcast(ResponseCodes.TOHU_INTERNAL_ERROR);
        } catch (TohuSdkException e7) {
            LogTohu.e(TAG, "Error processDeleteDeviceMessage in I Am Not service.", e7);
            BroadcastManagerDefaultImpl.create(BroadcastActions.TOHU_SYSTEM_NOTIFICATIONS).sendBroadcast(e7);
        }
    }
}
