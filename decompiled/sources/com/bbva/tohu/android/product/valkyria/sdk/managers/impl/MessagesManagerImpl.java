package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.beans.PushMessage;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager;

/* JADX INFO: loaded from: classes6.dex */
public class MessagesManagerImpl {
    public static final String DELETE_DEVICE_TYPE = "DELETE_DEVICE";
    public static final String DIGITIZE_MESSAGE_TYPE = "DIGITIZE";
    public static final String FORCE_DIGITIZE_MESSAGE_TYPE = "FORCE_DIGITIZE_MESSAGE_TYPE";
    public static final String FORWARD_TO_DATA_KEY = "forwardTo";
    public static final String FOWARD_TO_MOBILE_PAYMENT_VALUE = "MOBILE_PAYMENT";
    public static final String MESSAGE_DATA_KEY = "message";
    public static final String REPLENISH_NEEDED_MESSAGE_TYPE = "REPLENISH_NEEDED";
    public static final String STATUS_REQUEST_MESSAGE_TYPE = "STATUS_REQUEST";
    public static final String TAG = "MessagesManagerImpl";
    public static final String TYPE_DATA_KEY = "type";
    public static final String UPDATE_TOKEN_STATUS_MESSAGE_TYPE = "UPDATE_TOKEN_STATUS";
    private MessageManager deleteMessageManager;
    private MessageManager digitizeMessageManager;
    private MessageManager forceDigitizeMessageManager;
    private MessageManager replenishNeededMessageManager = ManagerFactory.getReplenishNeededMessageManager();
    private MessageManager statusRequestMessageManager;
    private MessageManager updateTokenMessageManager;

    public MessagesManagerImpl(Context context) {
        this.deleteMessageManager = ManagerFactory.getDeleteDeviceMessageManager(context);
        this.updateTokenMessageManager = ManagerFactory.getUpdateTokenMessageManager(context);
        this.digitizeMessageManager = ManagerFactory.getDigitizeMessageManager(context);
        this.forceDigitizeMessageManager = ManagerFactory.getForceDigitizeMessageManager(context);
        this.statusRequestMessageManager = ManagerFactory.getStatusRequestMessageManager(context);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void processMessage(PushMessage pushMessage, Context context) {
        byte b10;
        LogTohu.i(TAG, "Received message: %s", pushMessage);
        if (pushMessage == null || !pushMessage.isToHUFoward()) {
            return;
        }
        String type = pushMessage.getType();
        String message = pushMessage.getMessage();
        if (type == null || (message == null && !type.equals(DELETE_DEVICE_TYPE))) {
            LogTohu.w(TAG, "Received a message with null type or invalid data -> type : %s rarMessage : %s", type, message);
            return;
        }
        try {
            switch (type.hashCode()) {
                case -153743786:
                    if (!type.equals(FORCE_DIGITIZE_MESSAGE_TYPE)) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 620164302:
                    if (!type.equals(UPDATE_TOKEN_STATUS_MESSAGE_TYPE)) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 717939975:
                    if (!type.equals(DIGITIZE_MESSAGE_TYPE)) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 955477866:
                    if (!type.equals(DELETE_DEVICE_TYPE)) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 1787708686:
                    if (!type.equals(REPLENISH_NEEDED_MESSAGE_TYPE)) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 1950930722:
                    if (!type.equals(STATUS_REQUEST_MESSAGE_TYPE)) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                LogTohu.d(TAG, "Digitize message type received", new Object[0]);
                this.digitizeMessageManager.processMessage(message, context);
                return;
            }
            if (b10 == 1) {
                LogTohu.d(TAG, "Update token status message type received", new Object[0]);
                this.updateTokenMessageManager.processMessage(message, context);
                return;
            }
            if (b10 == 2) {
                LogTohu.d(TAG, "Delete device message type received", new Object[0]);
                this.deleteMessageManager.processMessage(null, context);
                return;
            }
            if (b10 == 3) {
                LogTohu.d(TAG, "Replenish needed message type received", new Object[0]);
                this.replenishNeededMessageManager.processMessage(message, context);
                return;
            }
            if (b10 == 4) {
                LogTohu.d(TAG, "Force digitize message type received", new Object[0]);
                this.forceDigitizeMessageManager.processMessage(message, context);
            } else {
                if (b10 != 5) {
                    LogTohu.d(TAG, "processMessage Unknown value for type: ".concat(type), new Object[0]);
                    return;
                }
                LogTohu.d(TAG, "'Status Request' message type received", new Object[0]);
                try {
                    this.statusRequestMessageManager.processMessage(message, context);
                } catch (Exception e5) {
                    LogTohu.e(TAG, "Exception processing 'Status Reques' message", e5);
                }
            }
        } catch (TohuSdkException e7) {
            LogTohu.w(TAG, "Exception on processFirebaseMessage", e7);
        }
    }
}
