package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto.BulletDto;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto.SharedPreferencesDto;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto.TokenDto;
import com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto.TransactionCredentialDto;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceStatusRequest {
    private List<BulletDto> dbBullets;
    private List<TokenDto> dbTokens;
    private List<TransactionCredentialDto> dbTrxCredentials;
    private String deviceCode;
    private List<String> paymentStorageKeys;
    private String requestId;
    private String sdkVer;
    private List<String> secureStorageKeys;
    private SharedPreferencesDto sharedPreferences;

    public List<BulletDto> getDbBullets() {
        return this.dbBullets;
    }

    public List<TokenDto> getDbTokens() {
        return this.dbTokens;
    }

    public List<TransactionCredentialDto> getDbTrxCredentials() {
        return this.dbTrxCredentials;
    }

    public String getDeviceCode() {
        return this.deviceCode;
    }

    public List<String> getPaymentStorageKeys() {
        return this.paymentStorageKeys;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSdkVer() {
        return this.sdkVer;
    }

    public List<String> getSecureStorageKeys() {
        return this.secureStorageKeys;
    }

    public SharedPreferencesDto getSharedPreferences() {
        return this.sharedPreferences;
    }

    public void setDbBullets(List<BulletDto> list) {
        this.dbBullets = list;
    }

    public void setDbTokens(List<TokenDto> list) {
        this.dbTokens = list;
    }

    public void setDbTrxCredentials(List<TransactionCredentialDto> list) {
        this.dbTrxCredentials = list;
    }

    public void setDeviceCode(String str) {
        this.deviceCode = str;
    }

    public void setPaymentStorageKeys(List<String> list) {
        this.paymentStorageKeys = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSdkVer(String str) {
        this.sdkVer = str;
    }

    public void setSecureStorageKeys(List<String> list) {
        this.secureStorageKeys = list;
    }

    public void setSharedPreferences(SharedPreferencesDto sharedPreferencesDto) {
        this.sharedPreferences = sharedPreferencesDto;
    }
}
