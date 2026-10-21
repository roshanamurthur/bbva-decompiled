package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.PlatformPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.SdkSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.model.TransactionCredential;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.DeviceStatusRequest;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto.BulletDto;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto.SharedPreferencesDto;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto.TokenDto;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto.TransactionCredentialDto;
import com.bbva.tohu.android.product.valkyria.sdk.services.BackendService;
import com.bbva.tohu.android.product.valkyria.sdk.utils.StatusRequestMessage;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class StatusRequestMessageManagerDefaultImpl implements MessageManager {
    public static final String SDK_VERSION = "2.0.0";
    private final BackendService backendService;
    private final CryptoKeyManager cryptoKeyManager;
    private final DatabaseManager databaseManager;
    private final DeviceInfo deviceInfo;
    private final PlatformPreferencesManager platformPreferencesManager;
    private final SdkSharedPreferencesManager sdkSharedPreferencesManager;
    private final UserSharedPreferencesManager userSharedPreferencesManager;

    public StatusRequestMessageManagerDefaultImpl(BackendService backendService, DatabaseManager databaseManager, UserSharedPreferencesManager userSharedPreferencesManager, SdkSharedPreferencesManager sdkSharedPreferencesManager, PlatformPreferencesManager platformPreferencesManager, DeviceInfo deviceInfo, CryptoKeyManager cryptoKeyManager) {
        this.backendService = backendService;
        this.databaseManager = databaseManager;
        this.userSharedPreferencesManager = userSharedPreferencesManager;
        this.sdkSharedPreferencesManager = sdkSharedPreferencesManager;
        this.platformPreferencesManager = platformPreferencesManager;
        this.deviceInfo = deviceInfo;
        this.cryptoKeyManager = cryptoKeyManager;
    }

    private List<BulletDto> getBullets() {
        ArrayList arrayList = new ArrayList();
        Iterator<Bullet> it = this.databaseManager.getBullets().iterator();
        while (it.hasNext()) {
            arrayList.add(new BulletDto(it.next()));
        }
        return arrayList;
    }

    private List<TokenDto> getTokens() {
        ArrayList arrayList = new ArrayList();
        Iterator<Token> it = this.databaseManager.getTokens().iterator();
        while (it.hasNext()) {
            arrayList.add(new TokenDto(it.next()));
        }
        return arrayList;
    }

    private List<TransactionCredentialDto> getTransactionCredentialsDto(List<BulletDto> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return getTransactionCredentialsDto();
        }
        if (list.isEmpty()) {
            return arrayList;
        }
        Iterator<TransactionCredential> it = this.databaseManager.getTransactionCredentials(getWhereCondition(list)).iterator();
        while (it.hasNext()) {
            arrayList.add(new TransactionCredentialDto(it.next()));
        }
        return arrayList;
    }

    @NonNull
    private String getWhereCondition(List<BulletDto> list) {
        String string = "";
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                string = u.f(string, ",");
            }
            StringBuilder sbD = c.d(string);
            sbD.append("'".concat(list.get(i10).getId()).concat("'"));
            string = sbD.toString();
        }
        return string;
    }

    private void setPlatformSharedPreferencesInfo(SharedPreferencesDto sharedPreferencesDto) {
        sharedPreferencesDto.setDid(this.platformPreferencesManager.getDid());
        sharedPreferencesDto.setPush(this.platformPreferencesManager.getPushToken());
    }

    private void setSdkSharedPreferencesInfo(SharedPreferencesDto sharedPreferencesDto) {
        sharedPreferencesDto.setMpInit(this.sdkSharedPreferencesManager.isInitCalled());
    }

    private void setUserSharedPreferencesInfo(SharedPreferencesDto sharedPreferencesDto) {
        sharedPreferencesDto.setFavorite(this.userSharedPreferencesManager.getFavouriteCard());
        sharedPreferencesDto.setThreshold(this.userSharedPreferencesManager.getThresholdBullets());
        sharedPreferencesDto.setActivePayment(Boolean.valueOf(this.userSharedPreferencesManager.isActivePayment()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.MessageManager
    public void processMessage(String str, Context context) throws TohuSdkException {
        Integer limitBullets;
        StatusRequestMessage statusRequestMessage = (StatusRequestMessage) new Gson().fromJson(str, StatusRequestMessage.class);
        DeviceStatusRequest deviceStatusRequest = new DeviceStatusRequest();
        if (statusRequestMessage != null) {
            deviceStatusRequest.setRequestId(statusRequestMessage.getRequestId());
            if (statusRequestMessage.getLimitBullets() == null || statusRequestMessage.getLimitBullets().intValue() < 0) {
                limitBullets = null;
            } else {
                limitBullets = statusRequestMessage.getLimitBullets();
            }
        } else {
            limitBullets = null;
        }
        deviceStatusRequest.setSdkVer("2.0.0");
        deviceStatusRequest.setDeviceCode(this.deviceInfo.getDeviceCode());
        deviceStatusRequest.setDbTokens(getTokens());
        if (limitBullets == null) {
            deviceStatusRequest.setDbBullets(getBullets());
            deviceStatusRequest.setDbTrxCredentials(getTransactionCredentialsDto());
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<TokenDto> it = deviceStatusRequest.getDbTokens().iterator();
            while (it.hasNext()) {
                arrayList.addAll(getBullets(it.next().getCardUniqueRef(), limitBullets));
            }
            deviceStatusRequest.setDbBullets(arrayList);
            deviceStatusRequest.setDbTrxCredentials(getTransactionCredentialsDto(arrayList));
        }
        SharedPreferencesDto sharedPreferencesDto = new SharedPreferencesDto();
        setUserSharedPreferencesInfo(sharedPreferencesDto);
        setSdkSharedPreferencesInfo(sharedPreferencesDto);
        setPlatformSharedPreferencesInfo(sharedPreferencesDto);
        deviceStatusRequest.setSharedPreferences(sharedPreferencesDto);
        deviceStatusRequest.setSecureStorageKeys(this.cryptoKeyManager.getSecureStorageEntryKeys());
        deviceStatusRequest.setPaymentStorageKeys(this.cryptoKeyManager.getPaymentStorageEntryKeys());
        this.backendService.sendStatus(deviceStatusRequest);
    }

    private List<BulletDto> getBullets(String str, Integer num) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bullet> it = this.databaseManager.getBulletsByCardUniqueReference(str, num).iterator();
        while (it.hasNext()) {
            arrayList.add(new BulletDto(it.next()));
        }
        return arrayList;
    }

    private List<TransactionCredentialDto> getTransactionCredentialsDto() {
        ArrayList arrayList = new ArrayList();
        Iterator<TransactionCredential> it = this.databaseManager.getAllTransactionCredentials().iterator();
        while (it.hasNext()) {
            arrayList.add(new TransactionCredentialDto(it.next()));
        }
        return arrayList;
    }
}
