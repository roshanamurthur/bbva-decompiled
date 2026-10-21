package com.bbva.tohu.android.product.valkyria.sdk.export;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import com.bbva.tohu.android.core.exceptions.CryptoException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.export.beans.PushMessage;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.ContextValidatorException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.InitNeededException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.LoadPropertiesException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.NfcNeededException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.managers.impl.ManagerFactory;
import com.bbva.tohu.android.product.valkyria.sdk.services.impl.ServiceFactory;
import com.bbva.valkyria.sdk.services.AndroidHceService;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MobilePayment {
    private static MobilePayment INSTANCE = null;
    public static String ORIGEN = null;
    public static final String PRODUCT_ID = "TOHU_MOBILE_PAYMENT";
    public static final String TAG = "MobilePayment";

    @SuppressLint({"StaticFieldLeak"})
    private Context context;

    private MobilePayment() {
    }

    private void checkInitCalled() {
        if (this.context == null || !ManagerFactory.getSdkPreferencesManager().isInitCalled()) {
            InitNeededException initNeededException = new InitNeededException();
            LogTohu.e(TAG, "Throw new exception:", initNeededException);
            throw initNeededException;
        }
    }

    public static MobilePayment getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MobilePayment();
        }
        return INSTANCE;
    }

    private Map<String, String> protectMap(Map<String, String> map) {
        return map == null ? Collections.emptyMap() : map;
    }

    public void deleteCard(String str, String str2, TohuCallbackErrors tohuCallbackErrors) {
        LogTohu.i(TAG, "Delete card", new Object[0]);
        checkInitCalled();
        ManagerFactory.getIntentManager().deleteCard(str, str2, tohuCallbackErrors);
    }

    public void deleteDevice(String str, TohuCallback tohuCallback) {
        LogTohu.i(TAG, "Delete device", new Object[0]);
        checkInitCalled();
        ManagerFactory.getIntentManager().deleteDevice(str, tohuCallback);
    }

    public void deleteDeviceLocal() throws TohuSdkException {
        LogTohu.i(TAG, "I am not", new Object[0]);
        checkInitCalled();
        try {
            ServiceFactory.getIAmNotService(this.context).doIAmNot();
        } catch (CryptoException e5) {
            throw new InternalErrorException(e5);
        } catch (TohuSdkException e7) {
            LogTohu.e(TAG, e7.getMessage(), e7);
            throw e7;
        }
    }

    public void disableCard(String str, String str2, TohuCallbackErrors tohuCallbackErrors) {
        LogTohu.i(TAG, "Suspend token", new Object[0]);
        checkInitCalled();
        ManagerFactory.getIntentManager().suspendToken(str, str2, tohuCallbackErrors);
    }

    public void disableDevice() {
        LogTohu.i(TAG, "Disable device for payment", new Object[0]);
        checkInitCalled();
        ServiceFactory.getActivePaymentService(this.context).active(false);
    }

    public void enableCards(List<Card> list, String str, TohuCallback tohuCallback) {
        LogTohu.i(TAG, "Enable Payment", new Object[0]);
        checkInitCalled();
        ManagerFactory.getIntentManager().enablePayment(list, str, tohuCallback);
    }

    public void enableDevice() {
        LogTohu.i(TAG, "Enable device for payment", new Object[0]);
        checkInitCalled();
        ServiceFactory.getActivePaymentService(this.context).active(true);
    }

    public String getCardStatus(String str) {
        LogTohu.i(TAG, "Get Payment Status", new Object[0]);
        checkInitCalled();
        return ServiceFactory.getPaymentStatusService().getPaymentStatus(str);
    }

    public Context getContext() {
        return this.context;
    }

    public boolean getDeviceStatus() {
        LogTohu.i(TAG, "Get device status", new Object[0]);
        try {
            checkInitCalled();
            return ServiceFactory.getActivePaymentService(this.context).getState();
        } catch (InitNeededException unused) {
            LogTohu.w(TAG, "Tohu don't init", new Object[0]);
            return false;
        }
    }

    public String getFavouriteCard() {
        LogTohu.i(TAG, "Get Favourite ", new Object[0]);
        checkInitCalled();
        return ServiceFactory.getFavoriteService(this.context).getFavourite();
    }

    public void getTransactionHistory(String str, String str2, TohuCallback tohuCallback) throws InitNeededException {
        LogTohu.i(TAG, "Get Transaction History", new Object[0]);
        checkInitCalled();
        ManagerFactory.getIntentManager().getTransactionHistory(str, str2, tohuCallback);
    }

    public void init(Context context) throws ContextValidatorException, NfcNeededException, LoadPropertiesException {
        if (context == null) {
            throw new ContextValidatorException();
        }
        LogTohu.d(TAG, "Do init", new Object[0]);
        setContext(context);
        if (isNfcCapable()) {
            ManagerFactory.getPropertiesManager(context).loadProperties(context);
            ORIGEN = ManagerFactory.getPropertiesManager(context).getKmConfig();
            ManagerFactory.getSdkPreferencesManager().setInitIsCalled(true);
        }
    }

    public boolean isCdcvmForLvt() {
        checkInitCalled();
        return ManagerFactory.getUserPreferencesManager(this.context).isCdcvmForLvt();
    }

    public boolean isNfcCapable() throws NfcNeededException {
        return ServiceFactory.getDeviceInfo().isNfcCapable();
    }

    public boolean isNfcPaymentApp() {
        checkInitCalled();
        return CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(getContext())).isDefaultServiceForCategory(new ComponentName(getContext(), AndroidHceService.class.getCanonicalName()), "payment");
    }

    public void paymentAuthenticated(Context context) {
        ManagerFactory.getAuthenticationManager(context).userAuthenticated();
    }

    public void processMessage(PushMessage pushMessage) {
        LogTohu.i(TAG, "processMessages", new Object[0]);
        checkInitCalled();
        ManagerFactory.getIntentManager().processMessage(pushMessage);
    }

    public void setCdcvmForLvt(boolean z10) {
        checkInitCalled();
        ManagerFactory.getUserPreferencesManager(this.context).setCdcvmForLvt(z10);
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setFavouriteCard(String str) throws TohuSdkException {
        LogTohu.i(TAG, "Set Favourite the cardUniqueReference: %s", str);
        checkInitCalled();
        try {
            ServiceFactory.getFavoriteService(this.context).setFavourite(str);
        } catch (TohuSdkException e5) {
            LogTohu.e(TAG, e5.getMessage(), e5);
            throw e5;
        }
    }

    public void setNfcPaymentApp(Activity activity, int i10) {
        if (isNfcPaymentApp()) {
            return;
        }
        ManagerFactory.getIntentManager().tohuPaymentApp(activity, i10);
    }
}
