package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import com.bbva.tohu.android.product.valkyria.sdk.payments.BaseHceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.ContactlessTransactionResponseLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.InitPaymentCallback;
import com.bbva.tohu.android.product.valkyria.sdk.services.impl.ServiceFactory;

/* JADX INFO: loaded from: classes6.dex */
public class LogicFactory {
    private static BaseHceLogic baseHceService;
    private static DeleteCardControllerLogic deleteCardControllerLogic;
    private static DeleteCardLogic deleteCardLogic;
    private static DeleteDeviceControllerLogic deleteDeviceControllerLogic;
    private static DeleteDeviceLogic deleteDeviceLogic;
    private static DigitizeLogic digitizeLogic;
    private static EnablePaymentControllerLogic enablePaymentControllerLogic;
    private static EnablePaymentLogic enablePaymentLogic;
    private static ForceReplenishControllerLogic forceReplenishControllerLogic;
    private static GetTransactionHistoryControllerLogic getTransactionHistoryControllerLogic;
    private static GetTransactionHistoryLogic getTransactionHistoryLogic;
    private static InitControllerLogic initControllerLogic;
    private static NotifyProvisionResultLogic notifyProvisionResultLogic;
    private static ReplenishControllerLogic replenishControllerLogic;
    private static ReplenishLogic replenishLogic;
    private static SuspendTokenControllerLogic suspendTokenControllerLogic;
    private static SuspendTokenLogic suspendTokenLogic;
    private static TokenLogic tokenLogic;
    private static ContactlessTransactionResponseLogic transactionResponseLogic;

    private LogicFactory() {
    }

    public static BaseHceLogic getBaseHceService(InitPaymentCallback initPaymentCallback, BroadcastManager broadcastManager, Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (baseHceService == null) {
            baseHceService = new BaseHceLogic(ManagerFactory.getIntentManager(), ManagerFactory.getDatabaseManager(), ManagerFactory.getUserPreferencesManager(context), ServiceFactory.getProviderService(context), ManagerFactory.getCryptoKeyManager(), initPaymentCallback, broadcastManager, ServiceFactory.getDeviceInfo(), ManagerFactory.getPlatformPreferencesManager(), context);
        }
        return baseHceService;
    }

    public static DeleteCardControllerLogic getDeleteCardControllerLogic(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (deleteCardControllerLogic == null) {
            deleteCardControllerLogic = new DeleteCardControllerLogic(getDeleteCardLogic(context), ManagerFactory.getBroadCastStatusUpdated());
        }
        return deleteCardControllerLogic;
    }

    public static synchronized DeleteCardLogic getDeleteCardLogic(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (deleteCardLogic == null) {
                deleteCardLogic = new DeleteCardLogic(ServiceFactory.getBackendService(context), ManagerFactory.getDatabaseManager(), ManagerFactory.getBroadCastStatusUpdated(), ManagerFactory.getCryptoKeyManager(), ManagerFactory.getUserPreferencesManager(context), ServiceFactory.getCredentialService(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return deleteCardLogic;
    }

    public static DeleteDeviceControllerLogic getDeleteDeviceControllerLogic(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (deleteDeviceControllerLogic == null) {
            deleteDeviceControllerLogic = new DeleteDeviceControllerLogic(getDeleteDeviceLogic(context));
        }
        return deleteDeviceControllerLogic;
    }

    public static synchronized DeleteDeviceLogic getDeleteDeviceLogic(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (deleteDeviceLogic == null) {
                deleteDeviceLogic = new DeleteDeviceLogic(ServiceFactory.getBackendService(context), ServiceFactory.getDeviceInfo(), ServiceFactory.getCredentialService(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return deleteDeviceLogic;
    }

    public static DigitizeLogic getDigitizeLogic(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (digitizeLogic == null) {
            digitizeLogic = new DigitizeLogic(ServiceFactory.getBackendService(context), ServiceFactory.getCredentialService(context));
        }
        return digitizeLogic;
    }

    public static EnablePaymentControllerLogic getEnablePaymentControllerLogic(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (enablePaymentControllerLogic == null) {
            enablePaymentControllerLogic = new EnablePaymentControllerLogic(getEnablePaymentLogic(context));
        }
        return enablePaymentControllerLogic;
    }

    public static synchronized EnablePaymentLogic getEnablePaymentLogic(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (enablePaymentLogic == null) {
                enablePaymentLogic = new EnablePaymentLogic(getDigitizeLogic(context), getReplenishLogic(context), getReplenishControllerLogic(context), getNotifyProvisionResultLogic(context), ManagerFactory.getDatabaseManager(), ManagerFactory.getBroadCastStatusUpdated(), ManagerFactory.getIntentManager());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return enablePaymentLogic;
    }

    public static ForceReplenishControllerLogic getForceReplenishControllerLogic() {
        if (forceReplenishControllerLogic == null) {
            forceReplenishControllerLogic = new ForceReplenishControllerLogic(ManagerFactory.getBroadCastSystemNotification(), ManagerFactory.getBroadCastStatusUpdated());
        }
        return forceReplenishControllerLogic;
    }

    public static InitControllerLogic getInitControllerLogic(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (initControllerLogic == null) {
            initControllerLogic = new InitControllerLogic(ManagerFactory.getSdkPreferencesManager(), ManagerFactory.getPropertiesManager(context));
        }
        return initControllerLogic;
    }

    public static synchronized NotifyProvisionResultLogic getNotifyProvisionResultLogic(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (notifyProvisionResultLogic == null) {
                notifyProvisionResultLogic = new NotifyProvisionResultLogic(ServiceFactory.getBackendService(context), ManagerFactory.getDatabaseManager(), getReplenishControllerLogic(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return notifyProvisionResultLogic;
    }

    public static ReplenishControllerLogic getReplenishControllerLogic(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (replenishControllerLogic == null) {
            replenishControllerLogic = new ReplenishControllerLogic(ManagerFactory.getUserPreferencesManager(context), ManagerFactory.getBroadCastSystemNotification());
        }
        return replenishControllerLogic;
    }

    public static synchronized ReplenishLogic getReplenishLogic(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (replenishLogic == null) {
                replenishLogic = new ReplenishLogic(ServiceFactory.getBackendService(context), ManagerFactory.getDatabaseManager(), ManagerFactory.getCryptoKeyManager(), ManagerFactory.getUserPreferencesManager(context), ServiceFactory.getEncoderService(), getNotifyProvisionResultLogic(context), ServiceFactory.getSafetyNet(), ServiceFactory.getConfirmReplenishService(ManagerFactory.getBroadCastStatusUpdated(), context), ServiceFactory.getDeviceInfo());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return replenishLogic;
    }

    public static synchronized SuspendTokenLogic getSuspendToken(BroadcastManager broadcastManager, Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (suspendTokenLogic == null) {
                suspendTokenLogic = new SuspendTokenLogic(ManagerFactory.getDatabaseManager(), ServiceFactory.getBackendService(context), broadcastManager, ManagerFactory.getUserPreferencesManager(context), ServiceFactory.getCredentialService(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return suspendTokenLogic;
    }

    public static SuspendTokenControllerLogic getSuspendTokenControllerLogic(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (suspendTokenControllerLogic == null) {
            suspendTokenControllerLogic = new SuspendTokenControllerLogic(getSuspendToken(ManagerFactory.getBroadCastStatusUpdated(), context), ManagerFactory.getBroadCastSystemNotification(), ManagerFactory.getBroadCastStatusUpdated());
        }
        return suspendTokenControllerLogic;
    }

    public static synchronized TokenLogic getTokenLogic(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (tokenLogic == null) {
                tokenLogic = new TokenLogic(ServiceFactory.getBackendService(context), ManagerFactory.getCryptoKeyManager(), ManagerFactory.getDatabaseManager(), ServiceFactory.getProviderService(context), getReplenishControllerLogic(context), getNotifyProvisionResultLogic(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return tokenLogic;
    }

    public static GetTransactionHistoryControllerLogic getTransactionHistoryControllerLogic(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (getTransactionHistoryControllerLogic == null) {
            getTransactionHistoryControllerLogic = new GetTransactionHistoryControllerLogic(getTransactionHistoryLogic(context));
        }
        return getTransactionHistoryControllerLogic;
    }

    public static synchronized GetTransactionHistoryLogic getTransactionHistoryLogic(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (getTransactionHistoryLogic == null) {
                getTransactionHistoryLogic = new GetTransactionHistoryLogic(ServiceFactory.getTransactionHistoryService(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return getTransactionHistoryLogic;
    }

    public static synchronized ContactlessTransactionResponseLogic getTransactionResponseLogic(BroadcastManager broadcastManager, Context context) {
        try {
            if (transactionResponseLogic == null) {
                transactionResponseLogic = new ContactlessTransactionResponseLogic(ManagerFactory.getUserPreferencesManager(context), ManagerFactory.getIntentManager(), ManagerFactory.getDatabaseManager(), broadcastManager, ManagerFactory.getBroadCastStatusUpdated(), ServiceFactory.getSerializerService());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return transactionResponseLogic;
    }

    public static void reset() {
        digitizeLogic = null;
        tokenLogic = null;
        replenishLogic = null;
        notifyProvisionResultLogic = null;
        deleteDeviceLogic = null;
        enablePaymentLogic = null;
        transactionResponseLogic = null;
        baseHceService = null;
        suspendTokenLogic = null;
        getTransactionHistoryLogic = null;
        deleteCardLogic = null;
        deleteCardControllerLogic = null;
        deleteDeviceControllerLogic = null;
        enablePaymentControllerLogic = null;
        initControllerLogic = null;
        suspendTokenControllerLogic = null;
        replenishControllerLogic = null;
        forceReplenishControllerLogic = null;
        getTransactionHistoryControllerLogic = null;
    }

    public static void setBaseHceService(BaseHceLogic baseHceLogic) {
        baseHceService = baseHceLogic;
    }
}
