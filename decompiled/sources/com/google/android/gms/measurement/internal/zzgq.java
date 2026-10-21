package com.google.android.gms.measurement.internal;

import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.ethermobilesdk.sharedstorage.extension.CustomCursor;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.model.b;
import com.salesforce.marketingcloud.notifications.NotificationMessage;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgq {
    public static final String[] zza = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", UserProfileKeyConstants.USER_ID, "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", b.f50436f};
    public static final String[] zzb = {Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, "_fot", "_fvt", "_ldl", CustomCursor.ID, "_lair", "_fi", "_lte", "_se", "_npa", "_sno", NotificationMessage.NOTIF_KEY_SID, "_lgclid", "_sno", NotificationMessage.NOTIF_KEY_SID};
}
