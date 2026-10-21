package com.bbva.tohu.android.product.valkyria.sdk.logic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.exceptions.DeviceSecurityDisabledException;
import com.bbva.tohu.android.core.exceptions.InternalErrorException;
import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.Tohu429Exception;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.core.response.Response;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.Integrity;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.BulletStatus;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.ReplenishRejectedException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.model.TransactionCredential;
import com.bbva.tohu.android.product.valkyria.sdk.request.ProvisionResult;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.BulletActiveRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.BulletUsedRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.BulletsRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.ReplenishRequest;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.BulletsResponse;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.Keys;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.ReplenishResponseData;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.ValuesResponse;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.services.ConfirmReplenishService;
import com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ReplenishLogic {
    public static final String API_PARAM_KEY = "API";
    public static final String DKI_PARAM_KEY = "DKI";
    public static final String ID_SEPARATOR = ";";
    public static final String MAC_PARAM_KEY = "MAC";
    public static final String SC_PARAM_KEY = "SC";
    private static final String TAG = "ReplenishLogic";
    public static final String TVL_PARAM_KEY = "TVL";
    private BackendService backendService;
    private ConfirmReplenishService confirmReplenishService;
    private DatabaseManager databaseManager;
    private DeviceInfo deviceInfo;
    private Integrity integrity;
    private CryptoKeyManager mCryptoKeyManager;
    private EncoderService mEncoderService;
    private final NotifyProvisionResultLogic notifyProvisionResultLogic;
    private UserSharedPreferencesManager userPreferencesManager;

    public static class BulletTypeClassLists {
        protected List<Bullet> activeBullets;
        protected Token token;
        protected List<Bullet> usedBullets;

        private BulletTypeClassLists() {
        }

        public /* synthetic */ BulletTypeClassLists(int i10) {
            this();
        }
    }

    public ReplenishLogic(BackendService backendService, DatabaseManager databaseManager, CryptoKeyManager cryptoKeyManager, UserSharedPreferencesManager userSharedPreferencesManager, EncoderService encoderService, NotifyProvisionResultLogic notifyProvisionResultLogic, Integrity integrity, ConfirmReplenishService confirmReplenishService, DeviceInfo deviceInfo) {
        this.backendService = backendService;
        this.databaseManager = databaseManager;
        this.mCryptoKeyManager = cryptoKeyManager;
        this.userPreferencesManager = userSharedPreferencesManager;
        this.mEncoderService = encoderService;
        this.notifyProvisionResultLogic = notifyProvisionResultLogic;
        this.integrity = integrity;
        this.confirmReplenishService = confirmReplenishService;
        this.deviceInfo = deviceInfo;
    }

    private BulletActiveRequest buildActiveBulletRequest(Bullet bullet) {
        BulletUsedRequest bulletUsedRequest = new BulletUsedRequest();
        bulletUsedRequest.setAtc(bullet.getAtc().toString());
        bulletUsedRequest.setTimestamp(bullet.getTimestamp());
        return bulletUsedRequest;
    }

    private Bullet buildBullet(Token token, BulletsResponse bulletsResponse) {
        Bullet bullet = new Bullet();
        bullet.setStatus("INACTIVE");
        bullet.setToken(token);
        bullet.setAtc(Integer.valueOf(Integer.parseInt(bulletsResponse.getAtc())));
        bullet.setTimestamp(Long.toString(Long.valueOf(System.currentTimeMillis() / 1000).longValue()));
        return bullet;
    }

    @NonNull
    private BulletsRequest buildBulletsRequest(BulletTypeClassLists bulletTypeClassLists, boolean z10) {
        BulletsRequest bulletsRequest = new BulletsRequest();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z10 && !bulletTypeClassLists.activeBullets.isEmpty()) {
            for (int i10 = 0; i10 < bulletTypeClassLists.activeBullets.size(); i10++) {
                arrayList.add(buildActiveBulletRequest(bulletTypeClassLists.activeBullets.get(i10)));
            }
            LogTohu.d(TAG, "Added active bullets to request.", new Object[0]);
        }
        if (!bulletTypeClassLists.usedBullets.isEmpty()) {
            for (int i11 = 0; i11 < bulletTypeClassLists.usedBullets.size(); i11++) {
                arrayList2.add(buildUsedBulletRequest(bulletTypeClassLists.usedBullets.get(i11)));
            }
            LogTohu.d(TAG, "Added used bullets to request.", new Object[0]);
        }
        bulletsRequest.setActivated(arrayList);
        bulletsRequest.setUsedBulletList(arrayList2);
        return bulletsRequest;
    }

    private String buildMAC(Token token, String str) throws InternalErrorException, CryptoInitException {
        List<TransactionCredential> transactionCredentialsByCardUniqueReference = this.databaseManager.getTransactionCredentialsByCardUniqueReference(token.getCardUniqueReference());
        if (!checkExistTokenCredential(transactionCredentialsByCardUniqueReference)) {
            return "";
        }
        return this.mEncoderService.hexStringFromBytes(this.mCryptoKeyManager.createVisaCryptogram(buildVisaRepelenishDataForMac(token, str), transactionCredentialsByCardUniqueReference.get(0).getTransactionCredentialId()));
    }

    private String buildTVL(List<BulletUsedRequest> list) {
        StringBuilder sb2 = new StringBuilder();
        for (BulletUsedRequest bulletUsedRequest : list) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append(String.format("%s|%s|%s|%s", bulletUsedRequest.getTimestamp(), bulletUsedRequest.getUnpredictableNumber(), bulletUsedRequest.getAtc(), bulletUsedRequest.getTransactionTypeCode()));
        }
        LogTohu.d(TAG, "TVL: %s", sb2.toString());
        return sb2.toString();
    }

    private BulletUsedRequest buildUsedBulletRequest(Bullet bullet) {
        BulletUsedRequest bulletUsedRequest = new BulletUsedRequest();
        bulletUsedRequest.setAtc(bullet.getAtc().toString());
        bulletUsedRequest.setTimestamp(bullet.getTimestamp());
        bulletUsedRequest.setUnpredictableNumber(bullet.getUnpredictableNumber());
        bulletUsedRequest.setTransactionType(bullet.getTransactionType());
        return bulletUsedRequest;
    }

    private Map<String, String> buildVisaExtraParams(Token token, ReplenishRequest replenishRequest) throws InternalErrorException, CryptoInitException {
        HashMap map = new HashMap();
        String strBuildTVL = buildTVL(replenishRequest.getBullets().getUsedBulletList());
        map.put(TVL_PARAM_KEY, strBuildTVL);
        map.put(MAC_PARAM_KEY, buildMAC(token, strBuildTVL));
        return map;
    }

    private byte[] buildVisaRepelenishDataForMac(Token token, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(token.getApi());
        sb2.append(token.getSc());
        String str2 = TAG;
        LogTohu.d(str2, "API para MAC de replenish: %s", token.getApi());
        if (!str.isEmpty()) {
            String[] strArrSplit = str.split(",");
            sb2.append(strArrSplit[strArrSplit.length - 1]);
        }
        LogTohu.d(str2, "Replenish data for mac: %s", sb2);
        return sb2.toString().getBytes(StandardCharsets.UTF_8);
    }

    private void callReplenishAndConfirmReplenish(BulletTypeClassLists bulletTypeClassLists, String str, boolean z10, boolean z11) throws TohuBackendException, NetworkNotPresentException, NotFoundEntityException, InternalErrorException, CryptoInitException {
        ReplenishResponseData replenishResponseDataCallReplenishHub = callReplenishHub(bulletTypeClassLists, z11, str);
        if (replenishResponseDataCallReplenishHub.getBullets().isEmpty()) {
            return;
        }
        renewBulletsOnDatabase(replenishResponseDataCallReplenishHub, bulletTypeClassLists);
        updateTokenWithExtraParams(bulletTypeClassLists.token, replenishResponseDataCallReplenishHub);
        confirmReplenish(bulletTypeClassLists.token, z10);
    }

    private ReplenishResponseData callReplenishHub(BulletTypeClassLists bulletTypeClassLists, boolean z10, String str) throws TohuBackendException, NetworkNotPresentException, InternalErrorException, CryptoInitException {
        ReplenishRequest replenishRequestCreateReplenishRequest = createReplenishRequest(bulletTypeClassLists, z10);
        replenishLog("Call Replenish Backend");
        Response<ReplenishResponseData> responseReplenish = this.backendService.replenish(replenishRequestCreateReplenishRequest, str);
        replenishLog("Received Replenish OK from backend");
        return responseReplenish.getData();
    }

    private boolean checkExistTokenCredential(List<TransactionCredential> list) {
        return (list == null || list.isEmpty() || list.get(0) == null) ? false : true;
    }

    private boolean confirmReplenish(Token token, boolean z10) throws TohuBackendException, NotFoundEntityException, NetworkNotPresentException, InternalErrorException, CryptoInitException {
        replenishLog("Call confirm replenish backend");
        boolean zConfirmReplenish = this.confirmReplenishService.confirmReplenish(token, z10);
        replenishLog("Confirm replenish Ok backend");
        if (!zConfirmReplenish) {
            replenishLog("Problem in confirmReplenish, delete all bullets");
            deleteAllBullets(token.getCardUniqueReference());
        }
        return zConfirmReplenish;
    }

    private BulletTypeClassLists createBulletsTypeClass(Token token, List<Bullet> list) {
        BulletTypeClassLists bulletTypeClassLists = new BulletTypeClassLists(0);
        bulletTypeClassLists.token = token;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Bullet bullet : list) {
            if ("ACTIVE".equals(bullet.getStatus())) {
                arrayList.add(bullet);
            } else if (BulletStatus.USED.equals(bullet.getStatus())) {
                arrayList2.add(bullet);
            }
        }
        bulletTypeClassLists.activeBullets = arrayList;
        bulletTypeClassLists.usedBullets = arrayList2;
        return bulletTypeClassLists;
    }

    private ReplenishRequest createReplenishRequest(BulletTypeClassLists bulletTypeClassLists, boolean z10) throws InternalErrorException, CryptoInitException {
        ReplenishRequest replenishRequest = new ReplenishRequest();
        replenishRequest.setCardUniqueReference(bulletTypeClassLists.token.getCardUniqueReference());
        replenishRequest.setBullets(buildBulletsRequest(bulletTypeClassLists, z10));
        if (ProviderType.PROVIDER_ID_VISA.equals(bulletTypeClassLists.token.getProvider())) {
            replenishRequest.setExtraParams(buildVisaExtraParams(bulletTypeClassLists.token, replenishRequest));
            LogTohu.d(TAG, "Added extra params for visa provider.", new Object[0]);
        }
        return replenishRequest;
    }

    private void deleteAllBullets(String str) throws InternalErrorException, CryptoInitException {
        replenishLog("Delete All TransactionCredentials");
        List<String> listDeleteTransactionCredentialsByCardUniqueReference = this.databaseManager.deleteTransactionCredentialsByCardUniqueReference(str);
        replenishLog("Delete All bullets in DDBB");
        this.databaseManager.deleteBulletsByCardUniqueReference(str);
        replenishLog("Delete cardProfile");
        this.mCryptoKeyManager.removeEntryInPaymentStorage(listDeleteTransactionCredentialsByCardUniqueReference);
        LogTohu.d(TAG, "Deleted all token's bullets for cardUniqueReference %s", str);
    }

    private void deleteBulletAndCredentials(Bullet bullet) throws InternalErrorException, CryptoInitException {
        List<TransactionCredential> transactionCredentialsByBulletId = this.databaseManager.getTransactionCredentialsByBulletId(bullet.getBulletId());
        replenishLog("Get Transactions Credentials from DDBB");
        replenishLog("Delete bullet and transactionCredentials by BulletId:" + bullet.getBulletId());
        this.databaseManager.deleteBulletAndTransactionCredentialsByBulletId(bullet.getBulletId());
        for (TransactionCredential transactionCredential : transactionCredentialsByBulletId) {
            if (transactionCredential != null) {
                replenishLog("Delete transactionCredentials in secure store by id: " + transactionCredential.getTransactionCredentialId());
                this.mCryptoKeyManager.removeEntryInPaymentStorage(transactionCredential.getTransactionCredentialId());
            }
        }
    }

    private void deleteUsedBullets(List<Bullet> list) throws InternalErrorException, CryptoInitException {
        replenishLog("Delete Used bullets");
        for (int i10 = 0; i10 < list.size(); i10++) {
            deleteBulletAndCredentials(list.get(i10));
        }
        LogTohu.d(TAG, "All used bullets deleted.", new Object[0]);
    }

    private Map<String, List<ValuesResponse>> getKeysMap(ReplenishResponseData replenishResponseData) {
        List<Keys> keys = replenishResponseData.getKeys();
        HashMap map = new HashMap(keys.size());
        for (int i10 = 0; i10 < keys.size(); i10++) {
            Keys keys2 = keys.get(i10);
            map.put(keys2.getKeyLocator(), keys2.getValues());
        }
        return map;
    }

    private void logToken(Token token, boolean z10, boolean z11) {
        token.getCardUniqueReference();
    }

    private boolean needReplenishWithBulletsResponse(List<BulletsResponse> list) {
        return needReplenish(list.size());
    }

    private List<String> registerKeys(List<ValuesResponse> list, String str, Map<String, byte[]> map) {
        ArrayList arrayList = new ArrayList();
        LogTohu.d(TAG, "******* Bullet *******", new Object[0]);
        for (int i10 = 0; i10 < list.size(); i10++) {
            ValuesResponse valuesResponse = list.get(i10);
            String strConcat = str.concat(ID_SEPARATOR).concat(valuesResponse.getType());
            arrayList.add(strConcat);
            if (!map.containsKey(strConcat)) {
                map.put(strConcat, this.mEncoderService.base64urlToBytes(valuesResponse.getKey()));
                LogTohu.d(TAG, "***************tohu, replenish, storage credential id: %s", strConcat);
            }
        }
        return arrayList;
    }

    private void renewBulletsOnDatabase(ReplenishResponseData replenishResponseData, BulletTypeClassLists bulletTypeClassLists) throws InternalErrorException, CryptoInitException {
        if (replenishResponseData.getDiscardAll().booleanValue()) {
            replenishLog("Replenish with discardAll: true");
            deleteAllBullets(bulletTypeClassLists.token.getCardUniqueReference());
        } else {
            replenishLog("Replenish with discardAll: false");
            deleteUsedBullets(bulletTypeClassLists.usedBullets);
        }
        updateThresholdBullets(replenishResponseData.getThreshold());
        replenishLog("Trying to save bullets");
        saveBullets(replenishResponseData, bulletTypeClassLists.token);
    }

    private void saveBullets(ReplenishResponseData replenishResponseData, Token token) throws InternalErrorException, CryptoInitException {
        Map<String, List<ValuesResponse>> keysMap = getKeysMap(replenishResponseData);
        HashMap map = new HashMap();
        int size = replenishResponseData.getBullets().size();
        HashMap map2 = new HashMap(size);
        for (int i10 = 0; i10 < size; i10++) {
            BulletsResponse bulletsResponse = replenishResponseData.getBullets().get(i10);
            Bullet bulletBuildBullet = buildBullet(token, bulletsResponse);
            String keyLocator = bulletsResponse.getKeyLocator();
            bulletBuildBullet.setKeyLocator(keyLocator);
            map2.put(bulletBuildBullet, registerKeys(keysMap.get(keyLocator), keyLocator, map));
        }
        replenishLog(g0.c("Save bullet and transactionCredentials: ", size));
        this.databaseManager.saveBulletsAndTransactionCredentials(map2);
        String str = TAG;
        LogTohu.d(str, "Bullets save: %s", String.valueOf(size));
        try {
            replenishLog("Save bullet in secure storage");
            this.mCryptoKeyManager.putEntryInPaymentStorage(map);
            LogTohu.d(str, "Bullets save on secureStorage", new Object[0]);
        } catch (CryptoInitException | InternalErrorException e5) {
            LogTohu.e(TAG, "ReplenishResponseData failed saving into the secure storage.", e5);
            throw e5;
        }
    }

    private void updateThresholdBullets(int i10) {
        replenishLog(g0.c("Trying to update newThresholdValue to:", i10));
        if (this.userPreferencesManager.getThresholdBullets() != i10) {
            replenishLog(g0.c("Set new thresholdValue :", i10));
            this.userPreferencesManager.setThresholdBullets(Integer.valueOf(i10));
        }
    }

    private void updateTokenWithExtraParams(Token token, ReplenishResponseData replenishResponseData) throws NotFoundEntityException {
        replenishLog("Update Token with extra param");
        Map<String, String> extraParams = replenishResponseData.getExtraParams();
        if (extraParams == null || extraParams.isEmpty()) {
            return;
        }
        String str = extraParams.get("API");
        if (str != null) {
            token.setApi(str);
        }
        String str2 = extraParams.get(SC_PARAM_KEY);
        if (str2 != null) {
            try {
                token.setSc(Integer.valueOf(Integer.parseInt(str2)));
            } catch (NumberFormatException unused) {
                LogTohu.w(TAG, "Bad SC value recived ".concat(str2), new Object[0]);
            }
        }
        String str3 = extraParams.get(DKI_PARAM_KEY);
        if (str3 != null) {
            token.setDki(str3);
        }
        this.databaseManager.updateToken(token);
        LogTohu.d(TAG, "Token with cardUniqueReference %s updated with extra params", token.getCardUniqueReference());
    }

    public void doReplenish(String str, String str2, boolean z10, boolean z11, Context context) throws TohuBackendException, NetworkNotPresentException, InternalErrorException, CryptoInitException, ReplenishRejectedException, DeviceSecurityDisabledException {
        try {
            doReplenish(z10, z11, this.databaseManager.getTokenByCardUniqueReference(str), str2, context);
        } catch (Tohu429Exception e5) {
            throw new ReplenishRejectedException(e5);
        } catch (NotFoundEntityException e7) {
            e7.getMessage();
        }
    }

    public boolean needReplenish(List<Bullet> list) {
        return needReplenish(list.size());
    }

    private boolean needReplenish(int i10) {
        return i10 <= this.userPreferencesManager.getThresholdBullets();
    }

    private synchronized void doReplenish(boolean z10, boolean z11, Token token, String str, Context context) throws TohuBackendException, NetworkNotPresentException, NotFoundEntityException, InternalErrorException, CryptoInitException, DeviceSecurityDisabledException {
        try {
            this.mCryptoKeyManager.checkTransportKeysValidity();
            logToken(token, z10, z11);
            replenishLog("Check device Rooted");
            replenishLog("Check update keys is needed");
            if (token.getState().equals("ACTIVE")) {
                replenishLog("The token is ACTIVE");
                List<Bullet> usableBulletsByCardUniqueReference = this.databaseManager.getUsableBulletsByCardUniqueReference(token.getCardUniqueReference());
                if (z10 || needReplenish(usableBulletsByCardUniqueReference)) {
                    BulletTypeClassLists bulletTypeClassListsCreateBulletsTypeClass = createBulletsTypeClass(token, this.databaseManager.getBulletsByCardUniqueReference(token.getCardUniqueReference()));
                    if (!this.integrity.isRooted()) {
                        replenishLog("It is need to replenish");
                        callReplenishAndConfirmReplenish(bulletTypeClassListsCreateBulletsTypeClass, str, z11, z10);
                    } else {
                        throw new DeviceSecurityDisabledException();
                    }
                }
            } else if (token.getState().equals("INACTIVE")) {
                ProvisionResult provisionResultBuildSuccessProvisionResult = this.notifyProvisionResultLogic.buildSuccessProvisionResult(token.getCardUniqueReference());
                replenishLog("The token is INACTIVE, call notifyProvisionResult logic with: " + provisionResultBuildSuccessProvisionResult);
                this.notifyProvisionResultLogic.doNotifyProvisionResult(provisionResultBuildSuccessProvisionResult, token, context);
            }
            this.mCryptoKeyManager.renewKeysIfNeeded();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void replenishLog(String str) {
    }
}
