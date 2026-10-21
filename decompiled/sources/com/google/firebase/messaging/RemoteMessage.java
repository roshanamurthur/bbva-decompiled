package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final Bundle f48572p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayMap f48573q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Notification f48574r0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f48575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayMap f48576b;

        public Builder(@NonNull String str) {
            Bundle bundle = new Bundle();
            this.f48575a = bundle;
            this.f48576b = new ArrayMap();
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(androidx.camera.core.processing.f.d("Invalid to: ", str));
            }
            bundle.putString(Constants.MessagePayloadKeys.TO, str);
        }

        @NonNull
        public Builder addData(@NonNull String str, @Nullable String str2) {
            this.f48576b.put(str, str2);
            return this;
        }

        @NonNull
        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            Iterator it = this.f48576b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            Bundle bundle2 = this.f48575a;
            bundle.putAll(bundle2);
            bundle2.remove("from");
            return new RemoteMessage(bundle);
        }

        @NonNull
        public Builder clearData() {
            this.f48576b.clear();
            return this;
        }

        @Nullable
        public String getCollapseKey() {
            return this.f48575a.getString("message_type");
        }

        @NonNull
        public Map<String, String> getData() {
            return this.f48576b;
        }

        @NonNull
        public String getMessageId() {
            return this.f48575a.getString(Constants.MessagePayloadKeys.MSGID, "");
        }

        @Nullable
        public String getMessageType() {
            return this.f48575a.getString("message_type");
        }

        @IntRange(from = 0, to = 86400)
        public int getTtl() {
            return Integer.parseInt(this.f48575a.getString("message_type", "0"));
        }

        @NonNull
        public Builder setCollapseKey(@Nullable String str) {
            this.f48575a.putString(Constants.MessagePayloadKeys.COLLAPSE_KEY, str);
            return this;
        }

        @NonNull
        public Builder setData(@NonNull Map<String, String> map) {
            ArrayMap arrayMap = this.f48576b;
            arrayMap.clear();
            arrayMap.putAll(map);
            return this;
        }

        @NonNull
        public Builder setMessageId(@NonNull String str) {
            this.f48575a.putString(Constants.MessagePayloadKeys.MSGID, str);
            return this;
        }

        @NonNull
        public Builder setMessageType(@Nullable String str) {
            this.f48575a.putString("message_type", str);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public Builder setRawData(byte[] bArr) {
            this.f48575a.putByteArray(Constants.MessagePayloadKeys.RAW_DATA, bArr);
            return this;
        }

        @NonNull
        public Builder setTtl(@IntRange(from = 0, to = 86400) int i10) {
            this.f48575a.putString(Constants.MessagePayloadKeys.TTL, String.valueOf(i10));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public static class Notification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f48579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f48580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f48581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f48582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f48583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f48584h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f48585i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f48586j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f48587k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f48588l;
        public final String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Uri f48589n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f48590o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Integer f48591p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Integer f48592q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Integer f48593r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int[] f48594s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Long f48595t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f48596u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f48597v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f48598w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f48599x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f48600y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final long[] f48601z;

        public Notification(NotificationParams notificationParams) {
            String[] strArr;
            this.f48577a = notificationParams.getString(Constants.MessageNotificationKeys.TITLE);
            this.f48578b = notificationParams.getLocalizationResourceForKey(Constants.MessageNotificationKeys.TITLE);
            Object[] localizationArgsForKey = notificationParams.getLocalizationArgsForKey(Constants.MessageNotificationKeys.TITLE);
            String[] strArr2 = null;
            if (localizationArgsForKey == null) {
                strArr = null;
            } else {
                strArr = new String[localizationArgsForKey.length];
                for (int i10 = 0; i10 < localizationArgsForKey.length; i10++) {
                    strArr[i10] = String.valueOf(localizationArgsForKey[i10]);
                }
            }
            this.f48579c = strArr;
            this.f48580d = notificationParams.getString(Constants.MessageNotificationKeys.BODY);
            this.f48581e = notificationParams.getLocalizationResourceForKey(Constants.MessageNotificationKeys.BODY);
            Object[] localizationArgsForKey2 = notificationParams.getLocalizationArgsForKey(Constants.MessageNotificationKeys.BODY);
            if (localizationArgsForKey2 != null) {
                strArr2 = new String[localizationArgsForKey2.length];
                for (int i11 = 0; i11 < localizationArgsForKey2.length; i11++) {
                    strArr2[i11] = String.valueOf(localizationArgsForKey2[i11]);
                }
            }
            this.f48582f = strArr2;
            this.f48583g = notificationParams.getString(Constants.MessageNotificationKeys.ICON);
            this.f48585i = notificationParams.getSoundResourceName();
            this.f48586j = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
            this.f48587k = notificationParams.getString(Constants.MessageNotificationKeys.COLOR);
            this.f48588l = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
            this.m = notificationParams.getString(Constants.MessageNotificationKeys.CHANNEL);
            this.f48589n = notificationParams.getLink();
            this.f48584h = notificationParams.getString(Constants.MessageNotificationKeys.IMAGE_URL);
            this.f48590o = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
            this.f48591p = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
            this.f48592q = notificationParams.getInteger(Constants.MessageNotificationKeys.VISIBILITY);
            this.f48593r = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
            this.f48596u = notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY);
            this.f48597v = notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
            this.f48598w = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
            this.f48599x = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS);
            this.f48600y = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS);
            this.f48595t = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
            this.f48594s = notificationParams.a();
            this.f48601z = notificationParams.getVibrateTimings();
        }

        @Nullable
        public String getBody() {
            return this.f48580d;
        }

        @Nullable
        public String[] getBodyLocalizationArgs() {
            return this.f48582f;
        }

        @Nullable
        public String getBodyLocalizationKey() {
            return this.f48581e;
        }

        @Nullable
        public String getChannelId() {
            return this.m;
        }

        @Nullable
        public String getClickAction() {
            return this.f48588l;
        }

        @Nullable
        public String getColor() {
            return this.f48587k;
        }

        public boolean getDefaultLightSettings() {
            return this.f48600y;
        }

        public boolean getDefaultSound() {
            return this.f48598w;
        }

        public boolean getDefaultVibrateSettings() {
            return this.f48599x;
        }

        @Nullable
        public Long getEventTime() {
            return this.f48595t;
        }

        @Nullable
        public String getIcon() {
            return this.f48583g;
        }

        @Nullable
        public Uri getImageUrl() {
            String str = this.f48584h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @Nullable
        public int[] getLightSettings() {
            return this.f48594s;
        }

        @Nullable
        public Uri getLink() {
            return this.f48589n;
        }

        public boolean getLocalOnly() {
            return this.f48597v;
        }

        @Nullable
        public Integer getNotificationCount() {
            return this.f48593r;
        }

        @Nullable
        public Integer getNotificationPriority() {
            return this.f48591p;
        }

        @Nullable
        public String getSound() {
            return this.f48585i;
        }

        public boolean getSticky() {
            return this.f48596u;
        }

        @Nullable
        public String getTag() {
            return this.f48586j;
        }

        @Nullable
        public String getTicker() {
            return this.f48590o;
        }

        @Nullable
        public String getTitle() {
            return this.f48577a;
        }

        @Nullable
        public String[] getTitleLocalizationArgs() {
            return this.f48579c;
        }

        @Nullable
        public String getTitleLocalizationKey() {
            return this.f48578b;
        }

        @Nullable
        public long[] getVibrateTimings() {
            return this.f48601z;
        }

        @Nullable
        public Integer getVisibility() {
            return this.f48592q;
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f48572p0 = bundle;
    }

    @Nullable
    public String getCollapseKey() {
        return this.f48572p0.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @NonNull
    public Map<String, String> getData() {
        if (this.f48573q0 == null) {
            this.f48573q0 = Constants.MessagePayloadKeys.extractDeveloperDefinedPayload(this.f48572p0);
        }
        return this.f48573q0;
    }

    @Nullable
    public String getFrom() {
        return this.f48572p0.getString("from");
    }

    @Nullable
    public String getMessageId() {
        Bundle bundle = this.f48572p0;
        String string = bundle.getString(Constants.MessagePayloadKeys.MSGID);
        return string == null ? bundle.getString(Constants.MessagePayloadKeys.MSGID_SERVER) : string;
    }

    @Nullable
    public String getMessageType() {
        return this.f48572p0.getString("message_type");
    }

    @Nullable
    public Notification getNotification() {
        if (this.f48574r0 == null) {
            Bundle bundle = this.f48572p0;
            if (NotificationParams.isNotification(bundle)) {
                this.f48574r0 = new Notification(new NotificationParams(bundle));
            }
        }
        return this.f48574r0;
    }

    public int getOriginalPriority() {
        Bundle bundle = this.f48572p0;
        String string = bundle.getString(Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (string == null) {
            string = bundle.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    public int getPriority() {
        Bundle bundle = this.f48572p0;
        String string = bundle.getString(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(bundle.getString(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = bundle.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        if ("high".equals(string)) {
            return 1;
        }
        return "normal".equals(string) ? 2 : 0;
    }

    @Nullable
    @ShowFirstParty
    public byte[] getRawData() {
        return this.f48572p0.getByteArray(Constants.MessagePayloadKeys.RAW_DATA);
    }

    @Nullable
    public String getSenderId() {
        return this.f48572p0.getString(Constants.MessagePayloadKeys.SENDER_ID);
    }

    public long getSentTime() {
        Object obj = this.f48572p0.get(Constants.MessagePayloadKeys.SENT_TIME);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w(Constants.TAG, "Invalid sent time: " + obj);
            return 0L;
        }
    }

    @Nullable
    public String getTo() {
        return this.f48572p0.getString(Constants.MessagePayloadKeys.TO);
    }

    public int getTtl() {
        Object obj = this.f48572p0.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w(Constants.TAG, "Invalid TTL: " + obj);
            return 0;
        }
    }

    @KeepForSdk
    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.f48572p0);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f48572p0, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
