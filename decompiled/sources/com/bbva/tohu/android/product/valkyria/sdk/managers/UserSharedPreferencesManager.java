package com.bbva.tohu.android.product.valkyria.sdk.managers;

/* JADX INFO: loaded from: classes6.dex */
public interface UserSharedPreferencesManager {
    public static final String ACTIVE_PAYMENT = "ACTIVE_PAYMENT";
    public static final String CDCVM_FOR_LVT = "CDCVM_FOR_LVT";
    public static final String FAVOURITE_CARD = "TOHU_FAVOURITE_CARD";
    public static final String JWS = "DIGITIZE_JWS";
    public static final String THRESHOLD_BULLETS = "THRESHOLD_BULLETS";
    public static final String TOHU_USER_SHARED_PREFERENCES_ID = "tohuUserSharedPreferences";
    public static final String TOKEN_CARD_UNIQUE_REF = "TOKEN_CARD_UNIQUE_REF_";
    public static final String TOKEN_STATUS_CARD_UNIQUE_REF = "TOKEN_STATUS_CARD_UNIQUE_REF_";

    boolean deleteAll();

    void deleteEntry(String str);

    String getFavouriteCard();

    String getJws();

    int getThresholdBullets();

    String getTokenStatus(String str);

    boolean isActivePayment();

    boolean isCdcvmForLvt();

    boolean isFavouriteCard(String str);

    boolean isTokenStored(String str);

    void setActivePayment(boolean z10);

    void setCdcvmForLvt(boolean z10);

    void setFavouriteCard(String str);

    void setJws(String str);

    void setThresholdBullets(Integer num);

    void storeToken(String str, String str2);
}
