package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import android.nfc.NfcManager;
import android.os.PowerManager;
import android.os.ResultReceiver;
import com.bbva.tohu.android.core.managers.NetworkManagerUtil;
import com.bbva.tohu.android.core.utils.PlatformPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.auth.DeviceAuth;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.BroadcastActions;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.LoadPropertiesException;
import com.bbva.tohu.android.product.valkyria.sdk.logic.LogicFactory;
import com.bbva.tohu.android.product.valkyria.sdk.managers.ArmadilloManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CallbackManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.GetTokenRetryStrategy;
import com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.OperationLockManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.RetryStrategy;
import com.bbva.tohu.android.product.valkyria.sdk.managers.SdkSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManager;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationManagerDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationTokenBuilder;
import com.bbva.tohu.android.product.valkyria.sdk.payments.auth.AuthenticationTokenBuilderDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.services.impl.ServiceFactory;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes6.dex */
public class ManagerFactory {
    private static ArmadilloManager armadilloManager;
    private static AuthenticationManager authenticationManager;
    private static AuthenticationTokenBuilder authenticationTokenBuilder;
    private static BroadcastManager broadCastStatusUpdated;
    private static BroadcastManager broadCastSystemNotification;
    private static CryptoKeyManager cryptoKeyManager;
    private static MessageManager deleteMessageManager;
    private static DeviceAuth deviceAuth;
    private static MessageManager digitizeMessageManager;
    private static MessageManager forceDigitizeMessageManager;
    private static IntentManager intentManager;
    private static MessagesManagerImpl messagesManager;
    private static NetworkManagerUtil networkManager;
    private static NfcManager nfcManager;
    private static OperationLockManager operationLockManager;
    private static PlatformPreferencesManager platformPreferencesManager;
    private static PowerManager powerManager;
    private static PropertiesManager propertiesManager;
    private static MessageManager replenishNeededMessageManager;
    private static SdkSharedPreferencesManager sdkPreferencesManager;
    private static MessageManager statusRequestMessageManager;
    private static MessageManager updateTokenMessageManager;
    private static UserSharedPreferencesManager userPreferencesManager;

    public static ArmadilloManager getArmadilloManager(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (armadilloManager == null) {
            armadilloManager = new ArmadilloManagerDefaultImpl(getPropertiesManager(context));
        }
        return armadilloManager;
    }

    public static synchronized AuthenticationManager getAuthenticationManager(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (authenticationManager == null) {
                authenticationManager = new AuthenticationManagerDefaultImpl(getAuthenticationTokenBuilder(), getPropertiesManager(context).userAuthenticationTtlInSeconds().longValue());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return authenticationManager;
    }

    private static synchronized AuthenticationTokenBuilder getAuthenticationTokenBuilder() {
        try {
            if (authenticationTokenBuilder == null) {
                authenticationTokenBuilder = new AuthenticationTokenBuilderDefaultImpl(ServiceFactory.getClockService());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return authenticationTokenBuilder;
    }

    public static synchronized BroadcastManager getBroadCastStatusUpdated() {
        try {
            if (broadCastStatusUpdated == null) {
                broadCastStatusUpdated = BroadcastManagerDefaultImpl.create(BroadcastActions.TOHU_CARD_STATUS_UPDATED_ACTION);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return broadCastStatusUpdated;
    }

    public static synchronized BroadcastManager getBroadCastSystemNotification() {
        try {
            if (broadCastSystemNotification == null) {
                broadCastSystemNotification = BroadcastManagerDefaultImpl.create(BroadcastActions.TOHU_SYSTEM_NOTIFICATIONS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return broadCastSystemNotification;
    }

    public static synchronized CallbackManager getCallbackManager(ResultReceiver resultReceiver) {
        return new CallbackManagerDefaultImpl(resultReceiver);
    }

    public static synchronized CryptoKeyManager getCryptoKeyManager() {
        try {
            if (cryptoKeyManager == null) {
                cryptoKeyManager = new CryptoKeyManagerVintegrisImpl(getPlatformPreferencesManager());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cryptoKeyManager;
    }

    public static synchronized DatabaseManager getDatabaseManager() {
        return new DatabaseManagerDefaultImpl(MobilePayment.getInstance().getContext());
    }

    public static synchronized MessageManager getDeleteDeviceMessageManager(Context context) {
        try {
            if (deleteMessageManager == null) {
                deleteMessageManager = new DeleteDeviceMessageManagerImpl(ServiceFactory.getIAmNotService(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return deleteMessageManager;
    }

    public static DeviceAuth getDeviceAuth() {
        if (deviceAuth == null) {
            deviceAuth = new DeviceAuth(ServiceFactory.getDeviceInfo());
        }
        return deviceAuth;
    }

    public static synchronized MessageManager getDigitizeMessageManager(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (digitizeMessageManager == null) {
                digitizeMessageManager = new DigitizeMessageManagerImpl(LogicFactory.getTokenLogic(context), getBroadCastStatusUpdated(), getOperationLockManager(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return digitizeMessageManager;
    }

    public static synchronized MessageManager getForceDigitizeMessageManager(Context context) {
        try {
            if (forceDigitizeMessageManager == null) {
                forceDigitizeMessageManager = new ForceDigitizeMessageManagerImpl(LogicFactory.getDeleteCardLogic(context), getBroadCastSystemNotification(), new Gson());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return forceDigitizeMessageManager;
    }

    public static RetryStrategy getGetTokenRetryStrategy(Integer num, Context context) {
        return new GetTokenRetryStrategy(num, getPropertiesManager(context).schedulerGetTokenTaskInitialDelaySeconds(), getPropertiesManager(context).schedulerGetTokenTaskMaxTimeSeconds());
    }

    public static synchronized IntentManager getIntentManager() {
        try {
            if (intentManager == null) {
                intentManager = new IntentManagerDefaultImpl(MobilePayment.getInstance().getContext(), ServiceFactory.getSerializerService());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return intentManager;
    }

    public static synchronized MessagesManagerImpl getMessagesManager(Context context) {
        try {
            if (messagesManager == null) {
                messagesManager = new MessagesManagerImpl(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return messagesManager;
    }

    public static synchronized NetworkManagerUtil getNetworkManager() {
        try {
            if (networkManager == null) {
                networkManager = NetworkManagerUtil.getInstance(MobilePayment.getInstance().getContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return networkManager;
    }

    public static synchronized NfcManager getNfcManager() {
        try {
            if (nfcManager == null) {
                nfcManager = (NfcManager) MobilePayment.getInstance().getContext().getSystemService("nfc");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return nfcManager;
    }

    public static synchronized OperationLockManager getOperationLockManager(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (operationLockManager == null) {
                operationLockManager = new OperationLockManagerDefaultImpl(getPropertiesManager(context).lockMaxTimeMillis(), ServiceFactory.getDeviceInfo());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return operationLockManager;
    }

    public static synchronized PlatformPreferencesManager getPlatformPreferencesManager() {
        try {
            if (platformPreferencesManager == null) {
                platformPreferencesManager = new PlatformPreferencesManager(MobilePayment.getInstance().getContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return platformPreferencesManager;
    }

    public static synchronized PowerManager getPowerManager() {
        try {
            if (powerManager == null) {
                powerManager = (PowerManager) MobilePayment.getInstance().getContext().getSystemService("power");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return powerManager;
    }

    public static synchronized PropertiesManager getPropertiesManager(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (propertiesManager == null) {
                PropertiesManagerDefaultImpl propertiesManagerDefaultImpl = new PropertiesManagerDefaultImpl();
                propertiesManager = propertiesManagerDefaultImpl;
                try {
                    propertiesManagerDefaultImpl.loadProperties(context);
                } catch (LoadPropertiesException unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return propertiesManager;
    }

    public static synchronized MessageManager getReplenishNeededMessageManager() {
        try {
            if (replenishNeededMessageManager == null) {
                replenishNeededMessageManager = new ReplenishNeededMessageManagerImpl(LogicFactory.getForceReplenishControllerLogic());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return replenishNeededMessageManager;
    }

    public static synchronized SdkSharedPreferencesManager getSdkPreferencesManager() {
        try {
            if (sdkPreferencesManager == null) {
                sdkPreferencesManager = new SdkSharedPreferencesManagerDefaultImpl();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sdkPreferencesManager;
    }

    public static synchronized MessageManager getStatusRequestMessageManager(Context context) {
        try {
            if (statusRequestMessageManager == null) {
                statusRequestMessageManager = new StatusRequestMessageManagerDefaultImpl(ServiceFactory.getBackendService(context), getDatabaseManager(), getUserPreferencesManager(context), getSdkPreferencesManager(), getPlatformPreferencesManager(), ServiceFactory.getDeviceInfo(), getCryptoKeyManager());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return statusRequestMessageManager;
    }

    public static synchronized MessageManager getUpdateTokenMessageManager(Context context) {
        try {
            if (updateTokenMessageManager == null) {
                updateTokenMessageManager = new UpdateTokenMessageManagerImpl(getDatabaseManager(), ServiceFactory.getSerializerService(), LogicFactory.getDeleteCardLogic(context), LogicFactory.getSuspendToken(getBroadCastStatusUpdated(), context), LogicFactory.getReplenishControllerLogic(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return updateTokenMessageManager;
    }

    public static synchronized UserSharedPreferencesManager getUserPreferencesManager(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (userPreferencesManager == null) {
                userPreferencesManager = new UserSharedPreferencesManagerDefaultImpl();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return userPreferencesManager;
    }

    public static void reset() {
        propertiesManager = null;
        userPreferencesManager = null;
        sdkPreferencesManager = null;
        cryptoKeyManager = null;
        intentManager = null;
        networkManager = null;
        deleteMessageManager = null;
        digitizeMessageManager = null;
        updateTokenMessageManager = null;
        replenishNeededMessageManager = null;
        messagesManager = null;
        powerManager = null;
        nfcManager = null;
        broadCastStatusUpdated = null;
        broadCastSystemNotification = null;
        operationLockManager = null;
        forceDigitizeMessageManager = null;
        platformPreferencesManager = null;
        statusRequestMessageManager = null;
        deviceAuth = null;
        armadilloManager = null;
        authenticationManager = null;
    }
}
