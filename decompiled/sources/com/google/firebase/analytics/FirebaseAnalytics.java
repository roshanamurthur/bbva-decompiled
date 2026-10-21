package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzhx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import pf.a;
import pf.b;
import pf.c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f47576c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzee f47577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f47578b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
    public static final class ConsentStatus {

        @NonNull
        public static final ConsentStatus DENIED;

        @NonNull
        public static final ConsentStatus GRANTED;
        private static final /* synthetic */ ConsentStatus[] zza;

        static {
            ConsentStatus consentStatus = new ConsentStatus("GRANTED", 0);
            GRANTED = consentStatus;
            ConsentStatus consentStatus2 = new ConsentStatus("DENIED", 1);
            DENIED = consentStatus2;
            zza = new ConsentStatus[]{consentStatus, consentStatus2};
        }

        @NonNull
        public static ConsentStatus valueOf(@NonNull String str) {
            return (ConsentStatus) Enum.valueOf(ConsentStatus.class, str);
        }

        @NonNull
        public static ConsentStatus[] values() {
            return (ConsentStatus[]) zza.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
    public static final class ConsentType {

        @NonNull
        public static final ConsentType AD_STORAGE;

        @NonNull
        public static final ConsentType ANALYTICS_STORAGE;
        private static final /* synthetic */ ConsentType[] zza;

        static {
            ConsentType consentType = new ConsentType("AD_STORAGE", 0);
            AD_STORAGE = consentType;
            ConsentType consentType2 = new ConsentType("ANALYTICS_STORAGE", 1);
            ANALYTICS_STORAGE = consentType2;
            zza = new ConsentType[]{consentType, consentType2};
        }

        @NonNull
        public static ConsentType valueOf(@NonNull String str) {
            return (ConsentType) Enum.valueOf(ConsentType.class, str);
        }

        @NonNull
        public static ConsentType[] values() {
            return (ConsentType[]) zza.clone();
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
    public static class Event {

        @NonNull
        public static final String ADD_PAYMENT_INFO = "add_payment_info";

        @NonNull
        public static final String ADD_SHIPPING_INFO = "add_shipping_info";

        @NonNull
        public static final String ADD_TO_CART = "add_to_cart";

        @NonNull
        public static final String ADD_TO_WISHLIST = "add_to_wishlist";

        @NonNull
        public static final String AD_IMPRESSION = "ad_impression";

        @NonNull
        public static final String APP_OPEN = "app_open";

        @NonNull
        public static final String BEGIN_CHECKOUT = "begin_checkout";

        @NonNull
        public static final String CAMPAIGN_DETAILS = "campaign_details";

        @NonNull
        @Deprecated
        public static final String CHECKOUT_PROGRESS = "checkout_progress";

        @NonNull
        public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";

        @NonNull
        @Deprecated
        public static final String ECOMMERCE_PURCHASE = "ecommerce_purchase";

        @NonNull
        public static final String GENERATE_LEAD = "generate_lead";

        @NonNull
        public static final String JOIN_GROUP = "join_group";

        @NonNull
        public static final String LEVEL_END = "level_end";

        @NonNull
        public static final String LEVEL_START = "level_start";

        @NonNull
        public static final String LEVEL_UP = "level_up";

        @NonNull
        public static final String LOGIN = "login";

        @NonNull
        public static final String POST_SCORE = "post_score";

        @NonNull
        @Deprecated
        public static final String PRESENT_OFFER = "present_offer";

        @NonNull
        public static final String PURCHASE = "purchase";

        @NonNull
        @Deprecated
        public static final String PURCHASE_REFUND = "purchase_refund";

        @NonNull
        public static final String REFUND = "refund";

        @NonNull
        public static final String REMOVE_FROM_CART = "remove_from_cart";

        @NonNull
        public static final String SCREEN_VIEW = "screen_view";

        @NonNull
        public static final String SEARCH = "search";

        @NonNull
        public static final String SELECT_CONTENT = "select_content";

        @NonNull
        public static final String SELECT_ITEM = "select_item";

        @NonNull
        public static final String SELECT_PROMOTION = "select_promotion";

        @NonNull
        @Deprecated
        public static final String SET_CHECKOUT_OPTION = "set_checkout_option";

        @NonNull
        public static final String SHARE = "share";

        @NonNull
        public static final String SIGN_UP = "sign_up";

        @NonNull
        public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";

        @NonNull
        public static final String TUTORIAL_BEGIN = "tutorial_begin";

        @NonNull
        public static final String TUTORIAL_COMPLETE = "tutorial_complete";

        @NonNull
        public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";

        @NonNull
        public static final String VIEW_CART = "view_cart";

        @NonNull
        public static final String VIEW_ITEM = "view_item";

        @NonNull
        public static final String VIEW_ITEM_LIST = "view_item_list";

        @NonNull
        public static final String VIEW_PROMOTION = "view_promotion";

        @NonNull
        public static final String VIEW_SEARCH_RESULTS = "view_search_results";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
    public static class Param {

        @NonNull
        public static final String ACHIEVEMENT_ID = "achievement_id";

        @NonNull
        public static final String ACLID = "aclid";

        @NonNull
        public static final String AD_FORMAT = "ad_format";

        @NonNull
        public static final String AD_PLATFORM = "ad_platform";

        @NonNull
        public static final String AD_SOURCE = "ad_source";

        @NonNull
        public static final String AD_UNIT_NAME = "ad_unit_name";

        @NonNull
        public static final String AFFILIATION = "affiliation";

        @NonNull
        public static final String CAMPAIGN = "campaign";

        @NonNull
        public static final String CHARACTER = "character";

        @NonNull
        @Deprecated
        public static final String CHECKOUT_OPTION = "checkout_option";

        @NonNull
        @Deprecated
        public static final String CHECKOUT_STEP = "checkout_step";

        @NonNull
        public static final String CONTENT = "content";

        @NonNull
        public static final String CONTENT_TYPE = "content_type";

        @NonNull
        public static final String COUPON = "coupon";

        @NonNull
        public static final String CP1 = "cp1";

        @NonNull
        public static final String CREATIVE_NAME = "creative_name";

        @NonNull
        public static final String CREATIVE_SLOT = "creative_slot";

        @NonNull
        public static final String CURRENCY = "currency";

        @NonNull
        public static final String DESTINATION = "destination";

        @NonNull
        public static final String DISCOUNT = "discount";

        @NonNull
        public static final String END_DATE = "end_date";

        @NonNull
        public static final String EXTEND_SESSION = "extend_session";

        @NonNull
        public static final String FLIGHT_NUMBER = "flight_number";

        @NonNull
        public static final String GROUP_ID = "group_id";

        @NonNull
        public static final String INDEX = "index";

        @NonNull
        public static final String ITEMS = "items";

        @NonNull
        public static final String ITEM_BRAND = "item_brand";

        @NonNull
        public static final String ITEM_CATEGORY = "item_category";

        @NonNull
        public static final String ITEM_CATEGORY2 = "item_category2";

        @NonNull
        public static final String ITEM_CATEGORY3 = "item_category3";

        @NonNull
        public static final String ITEM_CATEGORY4 = "item_category4";

        @NonNull
        public static final String ITEM_CATEGORY5 = "item_category5";

        @NonNull
        public static final String ITEM_ID = "item_id";

        @NonNull
        @Deprecated
        public static final String ITEM_LIST = "item_list";

        @NonNull
        public static final String ITEM_LIST_ID = "item_list_id";

        @NonNull
        public static final String ITEM_LIST_NAME = "item_list_name";

        @NonNull
        @Deprecated
        public static final String ITEM_LOCATION_ID = "item_location_id";

        @NonNull
        public static final String ITEM_NAME = "item_name";

        @NonNull
        public static final String ITEM_VARIANT = "item_variant";

        @NonNull
        public static final String LEVEL = "level";

        @NonNull
        public static final String LEVEL_NAME = "level_name";

        @NonNull
        public static final String LOCATION = "location";

        @NonNull
        public static final String LOCATION_ID = "location_id";

        @NonNull
        public static final String MEDIUM = "medium";

        @NonNull
        public static final String METHOD = "method";

        @NonNull
        public static final String NUMBER_OF_NIGHTS = "number_of_nights";

        @NonNull
        public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";

        @NonNull
        public static final String NUMBER_OF_ROOMS = "number_of_rooms";

        @NonNull
        public static final String ORIGIN = "origin";

        @NonNull
        public static final String PAYMENT_TYPE = "payment_type";

        @NonNull
        public static final String PRICE = "price";

        @NonNull
        public static final String PROMOTION_ID = "promotion_id";

        @NonNull
        public static final String PROMOTION_NAME = "promotion_name";

        @NonNull
        public static final String QUANTITY = "quantity";

        @NonNull
        public static final String SCORE = "score";

        @NonNull
        public static final String SCREEN_CLASS = "screen_class";

        @NonNull
        public static final String SCREEN_NAME = "screen_name";

        @NonNull
        public static final String SEARCH_TERM = "search_term";

        @NonNull
        public static final String SHIPPING = "shipping";

        @NonNull
        public static final String SHIPPING_TIER = "shipping_tier";

        @NonNull
        @Deprecated
        public static final String SIGN_UP_METHOD = "sign_up_method";

        @NonNull
        public static final String SOURCE = "source";

        @NonNull
        public static final String START_DATE = "start_date";

        @NonNull
        public static final String SUCCESS = "success";

        @NonNull
        public static final String TAX = "tax";

        @NonNull
        public static final String TERM = "term";

        @NonNull
        public static final String TRANSACTION_ID = "transaction_id";

        @NonNull
        public static final String TRAVEL_CLASS = "travel_class";

        @NonNull
        public static final String VALUE = "value";

        @NonNull
        public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
    public static class UserProperty {

        @NonNull
        public static final String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";

        @NonNull
        public static final String SIGN_UP_METHOD = "sign_up_method";
    }

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.checkNotNull(zzeeVar);
        this.f47577a = zzeeVar;
    }

    @NonNull
    @RequiresPermission(allOf = {MagiskApp.INTERNET, MagiskApp.ACCESS_NETWORK_STATE, MagiskApp.WAKE_LOCK})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f47576c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f47576c == null) {
                        f47576c = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47576c;
    }

    @Nullable
    @Keep
    public static zzhx getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzee zzeeVarZzg = zzee.zzg(context, null, null, null, bundle);
        if (zzeeVarZzg == null) {
            return null;
        }
        return new c(zzeeVarZzg);
    }

    @NonNull
    public Task<String> getAppInstanceId() {
        a aVar;
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (this.f47578b == null) {
                        this.f47578b = new a(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    }
                    aVar = this.f47578b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return Tasks.call(aVar, new b(this));
        } catch (RuntimeException e5) {
            this.f47577a.zzA(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e5);
        }
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            throw new IllegalStateException(e5);
        } catch (ExecutionException e7) {
            throw new IllegalStateException(e7.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void logEvent(@NonNull @Size(max = 40, min = 1) String str, @Nullable Bundle bundle) {
        this.f47577a.zzx(str, bundle);
    }

    public void resetAnalyticsData() {
        this.f47577a.zzC();
    }

    public void setAnalyticsCollectionEnabled(boolean z10) {
        this.f47577a.zzK(Boolean.valueOf(z10));
    }

    public void setConsent(@NonNull Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int iOrdinal = consentStatus.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int iOrdinal2 = consentStatus2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.f47577a.zzF(bundle);
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f47577a.zzG(activity, str, str2);
    }

    public void setDefaultEventParameters(@Nullable Bundle bundle) {
        this.f47577a.zzI(bundle);
    }

    public void setSessionTimeoutDuration(long j10) {
        this.f47577a.zzL(j10);
    }

    public void setUserId(@Nullable String str) {
        this.f47577a.zzM(str);
    }

    public void setUserProperty(@NonNull @Size(max = 24, min = 1) String str, @Nullable @Size(max = 36) String str2) {
        this.f47577a.zzN(null, str, str2, false);
    }
}
