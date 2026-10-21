package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import androidx.core.util.Pair;
import com.bbva.tohu.android.core.utils.SharedPreferencesManager;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class UserSharedPreferencesManagerDefaultImpl extends SharedPreferencesManager implements UserSharedPreferencesManager {
    public UserSharedPreferencesManagerDefaultImpl() {
        super(MobilePayment.getInstance().getContext().getSharedPreferences(UserSharedPreferencesManager.TOHU_USER_SHARED_PREFERENCES_ID, 0));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public void deleteEntry(String str) {
        removeEntryByKey(str);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public String getFavouriteCard() {
        return retrieveString(UserSharedPreferencesManager.FAVOURITE_CARD);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public String getJws() {
        return retrieveString(UserSharedPreferencesManager.JWS);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public int getThresholdBullets() {
        return retrieveInt(UserSharedPreferencesManager.THRESHOLD_BULLETS);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public String getTokenStatus(String str) {
        return retrieveString(UserSharedPreferencesManager.TOKEN_STATUS_CARD_UNIQUE_REF.concat(str));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public boolean isActivePayment() {
        return retrieveBoolean(UserSharedPreferencesManager.ACTIVE_PAYMENT).booleanValue();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public boolean isCdcvmForLvt() {
        return retrieveBoolean(UserSharedPreferencesManager.CDCVM_FOR_LVT).booleanValue();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public boolean isFavouriteCard(String str) {
        return retrieveString(UserSharedPreferencesManager.FAVOURITE_CARD, "").equals(str);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public boolean isTokenStored(String str) {
        return retrieveString(UserSharedPreferencesManager.TOKEN_CARD_UNIQUE_REF.concat(str)) != null;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public void setActivePayment(boolean z10) {
        store(buildTuple(UserSharedPreferencesManager.ACTIVE_PAYMENT, Boolean.valueOf(z10)));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public void setCdcvmForLvt(boolean z10) {
        store(buildTuple(UserSharedPreferencesManager.CDCVM_FOR_LVT, Boolean.valueOf(z10)));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public void setFavouriteCard(String str) {
        store(buildTuple(UserSharedPreferencesManager.FAVOURITE_CARD, str));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public void setJws(String str) {
        store(buildTuple(UserSharedPreferencesManager.JWS, str));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public void setThresholdBullets(Integer num) {
        store(Arrays.asList(new Pair(UserSharedPreferencesManager.THRESHOLD_BULLETS, num)));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.UserSharedPreferencesManager
    public void storeToken(String str, String str2) {
        store(buildTuple(str, str2));
    }
}
