package com.bbva.tohu.android.product.valkyria.sdk.payments;

import android.content.Context;
import androidx.webkit.ProxyConfig;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.NotRegisteredException;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.core.utils.PlatformPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotActivePaymentException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotBulletActiveFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFavoriteCardException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotScreenOnException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.TokensNotFoundException;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.ResponseCodes;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.PaymentResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.BroadcastManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.IntentManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BaseHceLogic {
    public static final byte[] EMV_COMMAND_ABORTED = {105, 1};
    public static final String TAG = "BaseHceLogic";
    private final BroadcastManager broadcastManager;
    private Context context;
    private CryptoKeyManager cryptoKeyManager;
    private HceLogic currentHceLogic;
    private DatabaseManager databaseManager;
    private DeviceInfo deviceInfo;
    private InitPaymentCallback initCallback;
    private IntentManager intentManager;
    private boolean isInitialized;
    private PlatformPreferencesManager platformPreferencesManager;
    private ProviderService providerService;
    private UserSharedPreferencesManager userPreferencesManager;
    private Token token = null;
    private String lastBulletId = null;

    public BaseHceLogic(IntentManager intentManager, DatabaseManager databaseManager, UserSharedPreferencesManager userSharedPreferencesManager, ProviderService providerService, CryptoKeyManager cryptoKeyManager, InitPaymentCallback initPaymentCallback, BroadcastManager broadcastManager, DeviceInfo deviceInfo, PlatformPreferencesManager platformPreferencesManager, Context context) {
        this.intentManager = intentManager;
        this.databaseManager = databaseManager;
        this.userPreferencesManager = userSharedPreferencesManager;
        this.providerService = providerService;
        this.cryptoKeyManager = cryptoKeyManager;
        this.initCallback = initPaymentCallback;
        this.broadcastManager = broadcastManager;
        this.deviceInfo = deviceInfo;
        this.platformPreferencesManager = platformPreferencesManager;
        this.context = context;
    }

    private String censorPan(String str) {
        String panAsHex = this.currentHceLogic.getPanAsHex();
        if (panAsHex == null || panAsHex.length() < 6) {
            return str;
        }
        return str.replaceAll(panAsHex, String.format("%1$" + (panAsHex.length() - 6) + "s", "").replaceAll(" ", ProxyConfig.MATCH_ALL_SCHEMES).concat(panAsHex.substring(panAsHex.length() - 6)));
    }

    private void doReplenishIfKeysAreValid() {
        try {
            this.cryptoKeyManager.checkTransportKeysValidity();
            this.intentManager.replenish(this.token.getCardUniqueReference(), false);
        } catch (CryptoInitException e5) {
            LogTohu.d(TAG, "checkTransportKeysValidity", e5);
            this.broadcastManager.sendBroadcast("TOHU_LOGIN_NEEDED");
        }
    }

    private void init(Context context) throws TohuSdkException {
        if (this.platformPreferencesManager.getDid() == null || this.platformPreferencesManager.getDid().isEmpty()) {
            throw new NotRegisteredException();
        }
        if (!this.userPreferencesManager.isActivePayment()) {
            throw new NotActivePaymentException();
        }
        if (!this.deviceInfo.isScreenOn()) {
            throw new NotScreenOnException();
        }
        String favouriteCard = this.userPreferencesManager.getFavouriteCard();
        if (favouriteCard == null) {
            if (this.databaseManager.countTokens() != 0) {
                throw new NotFavoriteCardException();
            }
            throw new TokensNotFoundException();
        }
        Token activeTokenByCardUniqueReference = this.databaseManager.getActiveTokenByCardUniqueReference(favouriteCard);
        this.token = activeTokenByCardUniqueReference;
        List<Bullet> usableBulletsByCardUniqueReference = this.databaseManager.getUsableBulletsByCardUniqueReference(activeTokenByCardUniqueReference.getCardUniqueReference());
        if (usableBulletsByCardUniqueReference.isEmpty()) {
            throw new NotBulletActiveFoundException(this.token.getCardUniqueReference());
        }
        Bullet bullet = usableBulletsByCardUniqueReference.get(0);
        byte[] entryFromSecureStorage = this.cryptoKeyManager.getEntryFromSecureStorage(favouriteCard);
        HceLogic hceLogicByProvider = this.providerService.getHceLogicByProvider(this.token.getProvider());
        this.currentHceLogic = hceLogicByProvider;
        hceLogicByProvider.init(entryFromSecureStorage, this.token, bullet, context);
        if (bullet.getBulletId().equals(this.lastBulletId)) {
            LogTohu.d(TAG, "Duplicated init don't send start broadcast", new Object[0]);
        } else {
            this.broadcastManager.sendBroadcast(ResponseCodes.TOHU_PAYMENT_STARTED);
            this.lastBulletId = bullet.getBulletId();
        }
        InitPaymentCallback initPaymentCallback = this.initCallback;
        if (initPaymentCallback != null) {
            initPaymentCallback.init();
        }
        this.isInitialized = true;
    }

    public byte[] onDeactivated(int i10) {
        if (!this.isInitialized) {
            return null;
        }
        this.isInitialized = false;
        return this.currentHceLogic.responseApduOnDeactivate(i10);
    }

    public byte[] processCommandApdu(byte[] bArr) {
        if (bArr == null) {
            LogTohu.d(TAG, "Null input. Return Abort Code", new Object[0]);
            return EMV_COMMAND_ABORTED;
        }
        if (!this.isInitialized) {
            try {
                init(this.context);
            } catch (NotRegisteredException e5) {
                LogTohu.e(TAG, "Mobile payment is not registered: ", e5);
                this.broadcastManager.sendBroadcast(e5);
            } catch (NotActivePaymentException e7) {
                LogTohu.i(TAG, "No active payment on device", new Object[0]);
                this.broadcastManager.sendBroadcast(e7);
            } catch (NotBulletActiveFoundException e10) {
                LogTohu.i(TAG, "Not active bullets", new Object[0]);
                this.broadcastManager.sendBroadcast(e10, e10.getCardUniquereference());
                doReplenishIfKeysAreValid();
            } catch (NotFavoriteCardException e11) {
                LogTohu.i(TAG, "No favourite card", new Object[0]);
                this.broadcastManager.sendBroadcast(e11);
            } catch (NotScreenOnException e12) {
                LogTohu.i(TAG, "Screen is not On", new Object[0]);
                this.broadcastManager.sendBroadcast(e12);
            } catch (TokensNotFoundException e13) {
                LogTohu.i(TAG, "tokens not found", new Object[0]);
                this.broadcastManager.sendBroadcast(e13);
            } catch (TohuSdkException e14) {
                LogTohu.e(TAG, "Error on processCommandApdu, init()", e14);
                this.broadcastManager.sendBroadcast(e14, new PaymentResponse());
            }
        }
        if (!this.isInitialized) {
            String str = TAG;
            LogTohu.i(str, "Not initialized. Return Abort Code", new Object[0]);
            LogTohu.i(str, "Init HCE Payment error", new Object[0]);
            return EMV_COMMAND_ABORTED;
        }
        String str2 = TAG;
        LogTohu.d(str2, "APDU-C: " + McmLiteUtils.byteArrayToHexString(bArr), new Object[0]);
        try {
            byte[] bArrProcessApdu = this.currentHceLogic.processApdu(bArr);
            LogTohu.d(str2, "APDU-R: " + censorPan(McmLiteUtils.byteArrayToHexString(bArrProcessApdu)), new Object[0]);
            return bArrProcessApdu;
        } catch (Exception e15) {
            LogTohu.e(TAG, e15.getMessage(), new Object[0]);
            return EMV_COMMAND_ABORTED;
        }
    }
}
