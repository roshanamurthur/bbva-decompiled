package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bbva.gp2.android.libs.networking.http.ether.EtherGp2HttpClient;
import com.bbva.tohu.android.core.managers.NetworkManagerUtil;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.Integrity;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.apdu.PaypassHceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.CdCvmValidatorCdcvmNotSupportedImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl.CdCvmValidatorInformationDefaultImpl;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.services.ActivePaymentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ArmadilloHttpClient;
import com.bbva.tohu.android.product.valkyria.sdk.services.ArmadilloService;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ClockService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ConfirmReplenishService;
import com.bbva.tohu.android.product.valkyria.sdk.services.CredentialService;
import com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService;
import com.bbva.tohu.android.product.valkyria.sdk.services.FavouriteService;
import com.bbva.tohu.android.product.valkyria.sdk.services.GetPaymentStatusService;
import com.bbva.tohu.android.product.valkyria.sdk.services.GetTransactionHistoryService;
import com.bbva.tohu.android.product.valkyria.sdk.services.Gp2RestClient;
import com.bbva.tohu.android.product.valkyria.sdk.services.HubHttpClient;
import com.bbva.tohu.android.product.valkyria.sdk.services.IAmNotService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService;
import com.bbva.tohu.android.product.valkyria.sdk.services.SdkCryptoServiceCaas;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ValkyriaHttpClient;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;

/* JADX INFO: loaded from: classes6.dex */
public class ServiceFactory {
    private static ActivePaymentService activePaymentService;
    private static ArmadilloHttpClient armadilloHttpClient;
    private static ArmadilloService armadilloService;
    private static BackendService backendService;
    private static ClockService clockService;
    private static ConfirmReplenishService confirmReplenishService;
    private static CredentialService credentialService;

    @SuppressLint({"StaticFieldLeak"})
    private static DeviceInfo deviceInfo;
    private static EncoderService encoderService;
    private static FavouriteService favoriteService;
    private static GetPaymentStatusService getPaymentStatusService;
    private static GetTransactionHistoryService getTransactionHistoryService;
    private static Gp2RestClient gp2RestClient;
    private static HubHttpClient hubHttpClient;
    private static IAmNotService iAmNotService;
    private static Integrity integrity;
    private static ProviderService providerService;
    private static SdkCryptoServiceCaas sdkCryptoServiceCaas;
    private static SerializerService serializerService;
    private static ValkyriaHttpClient valkyriaHttpClient;

    public static synchronized ActivePaymentService getActivePaymentService(Context context) {
        try {
            if (activePaymentService == null) {
                activePaymentService = new ActivePaymentServiceDefaultImpl(ManagerFactory.getUserPreferencesManager(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return activePaymentService;
    }

    public static ArmadilloHttpClient getArmadilloHttpClient(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (armadilloHttpClient == null) {
            armadilloHttpClient = new ArmadilloHttpClientGp2NetworkingImpl(ManagerFactory.getPropertiesManager(context), getGp2RestClient(context));
        }
        return armadilloHttpClient;
    }

    public static ArmadilloService getArmadilloService(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (armadilloService == null) {
            armadilloService = new ArmadilloServiceDefaultImpl(getArmadilloHttpClient(context));
        }
        return armadilloService;
    }

    public static synchronized BackendService getBackendService(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (backendService == null) {
                backendService = new BackendServiceDefaultImpl(getHubHttpClient(context), getSerializerService(), ManagerFactory.getCryptoKeyManager(), getSdkCryptoServiceCaas(), getEncoderService(), getProviderService(context), getSafetyNet(), getDeviceInfo(), ManagerFactory.getPlatformPreferencesManager());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return backendService;
    }

    private static CdCvmValidatorInformation getCdcvmValidator(Context context) {
        return ManagerFactory.getPropertiesManager(context).cdcvmSupported().booleanValue() ? new CdCvmValidatorInformationDefaultImpl(ManagerFactory.getAuthenticationManager(context), getDeviceInfo()) : new CdCvmValidatorCdcvmNotSupportedImpl();
    }

    public static synchronized ClockService getClockService() {
        try {
            if (clockService == null) {
                clockService = new ClockServiceDefaultImpl();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return clockService;
    }

    public static synchronized ConfirmReplenishService getConfirmReplenishService(BroadcastManager broadcastManager, Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (confirmReplenishService == null) {
                confirmReplenishService = new ConfirmReplenishServiceDefaultImpl(getProviderService(context), ManagerFactory.getDatabaseManager(), broadcastManager, getBackendService(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return confirmReplenishService;
    }

    public static CredentialService getCredentialService(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (credentialService == null) {
            credentialService = new CredentialServiceDefaultImpl(getArmadilloService(context), ManagerFactory.getArmadilloManager(context), ManagerFactory.getPropertiesManager(context));
        }
        return credentialService;
    }

    public static synchronized DeviceInfo getDeviceInfo() {
        try {
            if (deviceInfo == null) {
                deviceInfo = DeviceInfo.getInstance(MobilePayment.getInstance().getContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return deviceInfo;
    }

    public static synchronized EncoderService getEncoderService() {
        try {
            if (encoderService == null) {
                encoderService = new EncoderServiceDefaultImpl();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return encoderService;
    }

    public static synchronized FavouriteService getFavoriteService(Context context) {
        try {
            if (favoriteService == null) {
                favoriteService = new FavouriteServiceDefaultImpl(ManagerFactory.getDatabaseManager(), ManagerFactory.getUserPreferencesManager(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return favoriteService;
    }

    public static Gp2RestClient getGp2RestClient(Context context) {
        if (MobilePayment.getInstance().getContext() == null) {
            MobilePayment.getInstance().setContext(context);
        }
        if (gp2RestClient == null) {
            gp2RestClient = new Gp2RestClientDefaultImpl(new EtherGp2HttpClient(MobilePayment.getInstance().getContext()), ManagerFactory.getPropertiesManager(context), getSerializerService(), NetworkManagerUtil.getInstance(MobilePayment.getInstance().getContext()));
        }
        return gp2RestClient;
    }

    public static synchronized HubHttpClient getHubHttpClient(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (hubHttpClient == null) {
                hubHttpClient = new HubHttpClientGp2NetworkingImpl(getValkyriaHttpClient(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return hubHttpClient;
    }

    public static synchronized IAmNotService getIAmNotService(Context context) {
        try {
            if (iAmNotService == null) {
                iAmNotService = new IAmNotServiceDefaultImpl(ManagerFactory.getDatabaseManager(), ManagerFactory.getCryptoKeyManager(), ManagerFactory.getUserPreferencesManager(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iAmNotService;
    }

    public static synchronized GetPaymentStatusService getPaymentStatusService() {
        try {
            if (getPaymentStatusService == null) {
                getPaymentStatusService = new GetPaymentStatusDefaultImpl(ManagerFactory.getDatabaseManager());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return getPaymentStatusService;
    }

    public static synchronized ProviderService getProviderService(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (providerService == null) {
                providerService = new ProviderServiceDefaultImpl(getSdkCryptoServiceCaas(), new PaywaveHceLogic(context), new PaypassHceLogic(getCdcvmValidator(context), ManagerFactory.getPropertiesManager(context).cdcvmSupported().booleanValue(), ManagerFactory.getUserPreferencesManager(context), context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return providerService;
    }

    public static synchronized Integrity getSafetyNet() {
        try {
            if (integrity == null) {
                integrity = Integrity.getInstance(MobilePayment.getInstance().getContext(), ManagerFactory.getPlatformPreferencesManager());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return integrity;
    }

    public static synchronized SdkCryptoServiceCaas getSdkCryptoServiceCaas() {
        try {
            if (sdkCryptoServiceCaas == null) {
                sdkCryptoServiceCaas = new SdkCryptoServiceCaasImpl(ManagerFactory.getCryptoKeyManager(), getSerializerService(), getEncoderService());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sdkCryptoServiceCaas;
    }

    public static synchronized SerializerService getSerializerService() {
        try {
            if (serializerService == null) {
                serializerService = new SerializerServiceGsonImpl();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return serializerService;
    }

    public static synchronized GetTransactionHistoryService getTransactionHistoryService(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (getTransactionHistoryService == null) {
                getTransactionHistoryService = new GetTransactionHistoryServiceDefaultImpl(getBackendService(context), getCredentialService(context)) { // from class: com.bbva.tohu.android.product.valkyria.sdk.services.impl.ServiceFactory.1
                };
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return getTransactionHistoryService;
    }

    public static synchronized ValkyriaHttpClient getValkyriaHttpClient(Context context) {
        try {
            if (MobilePayment.getInstance().getContext() == null) {
                MobilePayment.getInstance().setContext(context);
            }
            if (valkyriaHttpClient == null) {
                valkyriaHttpClient = new ValkyriaHttpClientDefaultImpl(new EtherGp2HttpClient(MobilePayment.getInstance().getContext()), ManagerFactory.getPropertiesManager(context).tohuHost(), getSerializerService(), ManagerFactory.getNetworkManager(), ManagerFactory.getCryptoKeyManager());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return valkyriaHttpClient;
    }

    public static void reset() {
        backendService = null;
        hubHttpClient = null;
        serializerService = null;
        favoriteService = null;
        iAmNotService = null;
        encoderService = null;
        getPaymentStatusService = null;
        providerService = null;
        sdkCryptoServiceCaas = null;
        confirmReplenishService = null;
        activePaymentService = null;
        deviceInfo = null;
        valkyriaHttpClient = null;
        integrity = null;
        getTransactionHistoryService = null;
        credentialService = null;
        armadilloService = null;
        armadilloHttpClient = null;
        gp2RestClient = null;
        clockService = null;
    }
}
