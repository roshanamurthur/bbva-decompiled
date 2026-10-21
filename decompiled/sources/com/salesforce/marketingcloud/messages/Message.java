package com.salesforce.marketingcloud.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SVGParser;
import com.mypinpad.tsdk.isolation.y2;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.extensions.PushExtensionsKt;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.m;
import com.salesforce.marketingcloud.storage.db.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b7\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 i2\u00020\u0001:\u0003ijkB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BÛ\u0001\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001eJ\r\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b8J\t\u00109\u001a\u00020\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0017HÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\t\u0010@\u001a\u00020\u0010HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001cHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010J\u001a\u00020\u0010HÆ\u0003J\t\u0010K\u001a\u00020\u0010HÆ\u0003J\r\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0002\bLJå\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\bNJ\u001b\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001cH\u0007¢\u0006\u0002\bOJ\t\u0010P\u001a\u00020\u0010HÖ\u0001J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\bQJ\u0013\u0010R\u001a\u00020\u00172\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020\u0010HÖ\u0001J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\bVJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\bWJ\r\u0010\u0018\u001a\u00020\u0010H\u0007¢\u0006\u0002\bXJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\bYJ\r\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0002\bZJ\r\u0010\u0014\u001a\u00020\u0010H\u0007¢\u0006\u0002\b[J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\\J\r\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0002\b]J\r\u0010\u0019\u001a\u00020\u0010H\u0007¢\u0006\u0002\b^J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b_J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\b`J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\baJ\t\u0010b\u001a\u00020\u0006HÖ\u0001J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\bcJ\u0019\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001fR\u0013\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001fR!\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001fR\u0013\u0010\u0016\u001a\u00020\u00178\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010#R0\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010$\u001a\u0004\u0018\u00010\r8A@AX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010\"\"\u0004\b(\u0010)R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010*R\u0013\u0010\u0018\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010 R\u0013\u0010\u000f\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0013\u0010\u0013\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 R0\u0010+\u001a\u0004\u0018\u00010\r2\b\u0010$\u001a\u0004\u0018\u00010\r8A@AX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010'\u001a\u0004\b-\u0010\"\"\u0004\b-\u0010)R,\u0010.\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00108A@AX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010'\u001a\u0004\b0\u0010 \"\u0004\b0\u00101R\u0013\u0010\u0014\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010 R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001fR,\u00102\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00108A@AX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b3\u0010'\u001a\u0004\b4\u0010 \"\u0004\b4\u00101R\u0013\u0010\u0015\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010 R\u0013\u0010\u0019\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010 R,\u00105\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00108A@AX\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010'\u001a\u0004\b7\u0010 \"\u0004\b7\u00101R\u0015\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\"R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001fR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001f¨\u0006l"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Message;", "Landroid/os/Parcelable;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "id", "", "title", "alert", "sound", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "Lcom/salesforce/marketingcloud/messages/Message$Media;", "startDateUtc", "Ljava/util/Date;", "endDateUtc", "messageType", "", "contentType", "url", "messagesPerPeriod", "numberOfPeriods", "periodType", "isRollingPeriod", "", "messageLimit", i.a.f65026x, "openDirect", "customKeys", "", "custom", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/Message$Media;Ljava/util/Date;Ljava/util/Date;IILjava/lang/String;IIIZIILjava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "()Ljava/lang/String;", "()I", "()Ljava/util/Map;", "()Ljava/util/Date;", "()Z", "<set-?>", "lastShownDate", "-lastShownDate$annotations", "()V", "-lastShownDate", "(Ljava/util/Date;)V", "()Lcom/salesforce/marketingcloud/messages/Message$Media;", "nextAllowedShow", "-nextAllowedShow$annotations", "-nextAllowedShow", "notificationId", "-notificationId$annotations", "-notificationId", "(I)V", "periodShowCount", "-periodShowCount$annotations", "-periodShowCount", "showCount", "-showCount$annotations", "-showCount", "-deprecated_alert", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "-deprecated_contentType", "copy", "-deprecated_custom", "-deprecated_customKeys", "describeContents", "-deprecated_endDateUtc", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "-deprecated_id", "-deprecated_media", "-deprecated_messageLimit", "-deprecated_messageType", "-deprecated_messagesPerPeriod", "-deprecated_numberOfPeriods", "-deprecated_openDirect", "-deprecated_periodType", "-deprecated_proximity", "-deprecated_sound", "-deprecated_startDateUtc", "-deprecated_title", "toString", "-deprecated_url", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Media", "MessageType", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Message implements Parcelable {
    public static final int CONTENT_TYPE_ALERT = 1;
    public static final int MESSAGE_TYPE_FENCE_ENTRY = 3;
    public static final int MESSAGE_TYPE_FENCE_EXIT = 4;
    public static final int MESSAGE_TYPE_NONE = 0;
    public static final int MESSAGE_TYPE_PROXIMITY = 5;
    public static final int PERIOD_TYPE_UNIT_DAY = 4;
    public static final int PERIOD_TYPE_UNIT_HOUR = 5;
    public static final int PERIOD_TYPE_UNIT_MONTH = 2;
    public static final int PERIOD_TYPE_UNIT_NONE = 0;
    public static final int PERIOD_TYPE_UNIT_WEEK = 3;
    public static final int PERIOD_TYPE_UNIT_YEAR = 1;
    public static final int PROXIMITY_UNKNOWN = 0;

    @NotNull
    private final String alert;
    private final int contentType;

    @Nullable
    private final String custom;

    @Nullable
    private final Map<String, String> customKeys;

    @Nullable
    private final Date endDateUtc;

    @NotNull
    private final String id;
    private final boolean isRollingPeriod;

    @Nullable
    private Date lastShownDate;

    @Nullable
    private final Media media;
    private final int messageLimit;
    private final int messageType;
    private final int messagesPerPeriod;

    @Nullable
    private Date nextAllowedShow;
    private int notificationId;
    private final int numberOfPeriods;

    @Nullable
    private final String openDirect;
    private int periodShowCount;
    private final int periodType;
    private final int proximity;
    private int showCount;

    @Nullable
    private final String sound;

    @Nullable
    private final Date startDateUtc;

    @Nullable
    private final String title;

    @Nullable
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Message> CREATOR = new a();

    @NotNull
    private static final String TAG = g.a("Message");

    @MCKeep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Message$Companion;", "", "()V", "CONTENT_TYPE_ALERT", "", "MESSAGE_TYPE_FENCE_ENTRY", "MESSAGE_TYPE_FENCE_EXIT", "MESSAGE_TYPE_NONE", "MESSAGE_TYPE_PROXIMITY", "PERIOD_TYPE_UNIT_DAY", "PERIOD_TYPE_UNIT_HOUR", "PERIOD_TYPE_UNIT_MONTH", "PERIOD_TYPE_UNIT_NONE", "PERIOD_TYPE_UNIT_WEEK", "PERIOD_TYPE_UNIT_YEAR", "PROXIMITY_UNKNOWN", "TAG", "", "getTAG$sdk_release", "()Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG$sdk_release() {
            return Message.TAG;
        }
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u001d\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004J\b\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0005\u0010\u0004R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0007\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Message$Media;", "Landroid/os/Parcelable;", "", "-deprecated_url", "()Ljava/lang/String;", "url", "-deprecated_altText", "altText", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Media implements Parcelable {

        @Nullable
        private final String altText;

        @Nullable
        private final String url;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<Media> CREATOR = new b();

        /* JADX INFO: renamed from: com.salesforce.marketingcloud.messages.Message$Media$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Message$Media$a;", "", "Lorg/json/JSONObject;", "json", "Lcom/salesforce/marketingcloud/messages/Message$Media;", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final Media a(@Nullable JSONObject json) {
                Media media = null;
                String stringOrNull = json != null ? PushExtensionsKt.getStringOrNull(json, "androidUrl") : null;
                String stringOrNull2 = json != null ? PushExtensionsKt.getStringOrNull(json, "alt") : null;
                if (stringOrNull != null || stringOrNull2 != null) {
                    if (stringOrNull == null) {
                        stringOrNull = "";
                    }
                    media = new Media(stringOrNull, stringOrNull2);
                }
                return media;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Media> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Media createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Media(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Media[] newArray(int i10) {
                return new Media[i10];
            }
        }

        public Media(@Nullable String str, @Nullable String str2) {
            this.url = str;
            this.altText = str2;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "altText", imports = {}))
        @JvmName(name = "-deprecated_altText")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_altText, reason: not valid java name and from getter */
        public final String getAltText() {
            return this.altText;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
        @JvmName(name = "-deprecated_url")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
        public final String getUrl() {
            return this.url;
        }

        @JvmName(name = "altText")
        @Nullable
        public final String altText() {
            return this.altText;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Media(url=");
            sb2.append(this.url);
            sb2.append(", altText=");
            return y2.b(sb2, this.altText, RootService.CLOSE_BRACKET);
        }

        @JvmName(name = "url")
        @Nullable
        public final String url() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.url);
            parcel.writeString(this.altText);
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/salesforce/marketingcloud/messages/Message$MessageType;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface MessageType {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Message> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Message createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Media mediaCreateFromParcel = parcel.readInt() == 0 ? null : Media.CREATOR.createFromParcel(parcel);
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            String string5 = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            boolean z10 = parcel.readInt() != 0;
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i17 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i17);
                int i18 = 0;
                while (i18 != i17) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i18++;
                    i17 = i17;
                    i14 = i14;
                }
            }
            return new Message(string, string2, string3, string4, mediaCreateFromParcel, date, date2, i10, i11, string5, i12, i13, i14, z10, i15, i16, string6, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Message[] newArray(int i10) {
            return new Message[i10];
        }
    }

    public Message(@NotNull String id, @Nullable String str, @NotNull String alert, @Nullable String str2, @Nullable Media media, @Nullable Date date, @Nullable Date date2, int i10, int i11, @Nullable String str3, int i12, int i13, int i14, boolean z10, int i15, int i16, @Nullable String str4, @Nullable Map<String, String> map, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alert, "alert");
        this.id = id;
        this.title = str;
        this.alert = alert;
        this.sound = str2;
        this.media = media;
        this.startDateUtc = date;
        this.endDateUtc = date2;
        this.messageType = i10;
        this.contentType = i11;
        this.url = str3;
        this.messagesPerPeriod = i12;
        this.numberOfPeriods = i13;
        this.periodType = i14;
        this.isRollingPeriod = z10;
        this.messageLimit = i15;
        this.proximity = i16;
        this.openDirect = str4;
        this.customKeys = map;
        this.custom = str5;
        this.notificationId = -1;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "alert", imports = {}))
    @JvmName(name = "-deprecated_alert")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_alert, reason: not valid java name and from getter */
    public final String getAlert() {
        return this.alert;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "contentType", imports = {}))
    @JvmName(name = "-deprecated_contentType")
    /* JADX INFO: renamed from: -deprecated_contentType, reason: not valid java name and from getter */
    public final int getContentType() {
        return this.contentType;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "custom", imports = {}))
    @JvmName(name = "-deprecated_custom")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_custom, reason: not valid java name and from getter */
    public final String getCustom() {
        return this.custom;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "customKeys", imports = {}))
    @JvmName(name = "-deprecated_customKeys")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_customKeys, reason: not valid java name */
    public final Map<String, String> m5350deprecated_customKeys() {
        return this.customKeys;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "endDateUtc", imports = {}))
    @JvmName(name = "-deprecated_endDateUtc")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_endDateUtc, reason: not valid java name and from getter */
    public final Date getEndDateUtc() {
        return this.endDateUtc;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "id", imports = {}))
    @JvmName(name = "-deprecated_id")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_id, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = SVGParser.XML_STYLESHEET_ATTR_MEDIA, imports = {}))
    @JvmName(name = "-deprecated_media")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_media, reason: not valid java name and from getter */
    public final Media getMedia() {
        return this.media;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "messageLimit", imports = {}))
    @JvmName(name = "-deprecated_messageLimit")
    /* JADX INFO: renamed from: -deprecated_messageLimit, reason: not valid java name and from getter */
    public final int getMessageLimit() {
        return this.messageLimit;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "messageType", imports = {}))
    @JvmName(name = "-deprecated_messageType")
    /* JADX INFO: renamed from: -deprecated_messageType, reason: not valid java name and from getter */
    public final int getMessageType() {
        return this.messageType;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "messagesPerPeriod", imports = {}))
    @JvmName(name = "-deprecated_messagesPerPeriod")
    /* JADX INFO: renamed from: -deprecated_messagesPerPeriod, reason: not valid java name and from getter */
    public final int getMessagesPerPeriod() {
        return this.messagesPerPeriod;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "numberOfPeriods", imports = {}))
    @JvmName(name = "-deprecated_numberOfPeriods")
    /* JADX INFO: renamed from: -deprecated_numberOfPeriods, reason: not valid java name and from getter */
    public final int getNumberOfPeriods() {
        return this.numberOfPeriods;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "openDirect", imports = {}))
    @JvmName(name = "-deprecated_openDirect")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_openDirect, reason: not valid java name and from getter */
    public final String getOpenDirect() {
        return this.openDirect;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "periodType", imports = {}))
    @JvmName(name = "-deprecated_periodType")
    /* JADX INFO: renamed from: -deprecated_periodType, reason: not valid java name and from getter */
    public final int getPeriodType() {
        return this.periodType;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = i.a.f65026x, imports = {}))
    @JvmName(name = "-deprecated_proximity")
    /* JADX INFO: renamed from: -deprecated_proximity, reason: not valid java name and from getter */
    public final int getProximity() {
        return this.proximity;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sound", imports = {}))
    @JvmName(name = "-deprecated_sound")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_sound, reason: not valid java name and from getter */
    public final String getSound() {
        return this.sound;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "startDateUtc", imports = {}))
    @JvmName(name = "-deprecated_startDateUtc")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_startDateUtc, reason: not valid java name and from getter */
    public final Date getStartDateUtc() {
        return this.startDateUtc;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "title", imports = {}))
    @JvmName(name = "-deprecated_title")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_title, reason: not valid java name and from getter */
    public final String getTitle() {
        return this.title;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final String getUrl() {
        return this.url;
    }

    @JvmName(name = "-lastShownDate")
    @Nullable
    /* JADX INFO: renamed from: -lastShownDate, reason: not valid java name and from getter */
    public final Date getLastShownDate() {
        return this.lastShownDate;
    }

    @JvmName(name = "-nextAllowedShow")
    @Nullable
    /* JADX INFO: renamed from: -nextAllowedShow, reason: not valid java name and from getter */
    public final Date getNextAllowedShow() {
        return this.nextAllowedShow;
    }

    @JvmName(name = "-notificationId")
    /* JADX INFO: renamed from: -notificationId, reason: not valid java name and from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    @JvmName(name = "-periodShowCount")
    /* JADX INFO: renamed from: -periodShowCount, reason: not valid java name and from getter */
    public final int getPeriodShowCount() {
        return this.periodShowCount;
    }

    @JvmName(name = "-showCount")
    /* JADX INFO: renamed from: -showCount, reason: not valid java name and from getter */
    public final int getShowCount() {
        return this.showCount;
    }

    @JvmName(name = "alert")
    @NotNull
    public final String alert() {
        return this.alert;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component10() {
        return this.url;
    }

    public final int component11() {
        return this.messagesPerPeriod;
    }

    public final int component12() {
        return this.numberOfPeriods;
    }

    public final int component13() {
        return this.periodType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsRollingPeriod() {
        return this.isRollingPeriod;
    }

    public final int component15() {
        return this.messageLimit;
    }

    public final int component16() {
        return this.proximity;
    }

    @Nullable
    public final String component17() {
        return this.openDirect;
    }

    @Nullable
    public final Map<String, String> component18() {
        return this.customKeys;
    }

    @Nullable
    public final String component19() {
        return this.custom;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.alert;
    }

    @Nullable
    public final String component4() {
        return this.sound;
    }

    @Nullable
    public final Media component5() {
        return this.media;
    }

    @Nullable
    public final Date component6() {
        return this.startDateUtc;
    }

    @Nullable
    public final Date component7() {
        return this.endDateUtc;
    }

    public final int component8() {
        return this.messageType;
    }

    public final int component9() {
        return this.contentType;
    }

    @JvmName(name = "contentType")
    public final int contentType() {
        return this.contentType;
    }

    @NotNull
    public final Message copy(@NotNull String id, @Nullable String title, @NotNull String alert, @Nullable String sound, @Nullable Media media, @Nullable Date startDateUtc, @Nullable Date endDateUtc, int messageType, int contentType, @Nullable String url, int messagesPerPeriod, int numberOfPeriods, int periodType, boolean isRollingPeriod, int messageLimit, int proximity, @Nullable String openDirect, @Nullable Map<String, String> customKeys, @Nullable String custom) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alert, "alert");
        return new Message(id, title, alert, sound, media, startDateUtc, endDateUtc, messageType, contentType, url, messagesPerPeriod, numberOfPeriods, periodType, isRollingPeriod, messageLimit, proximity, openDirect, customKeys, custom);
    }

    @JvmName(name = "custom")
    @Nullable
    public final String custom() {
        return this.custom;
    }

    @JvmName(name = "customKeys")
    @Nullable
    public final Map<String, String> customKeys() {
        return this.customKeys;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JvmName(name = "endDateUtc")
    @Nullable
    public final Date endDateUtc() {
        return this.endDateUtc;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.areEqual(this.id, message.id) && Intrinsics.areEqual(this.title, message.title) && Intrinsics.areEqual(this.alert, message.alert) && Intrinsics.areEqual(this.sound, message.sound) && Intrinsics.areEqual(this.media, message.media) && Intrinsics.areEqual(this.startDateUtc, message.startDateUtc) && Intrinsics.areEqual(this.endDateUtc, message.endDateUtc) && this.messageType == message.messageType && this.contentType == message.contentType && Intrinsics.areEqual(this.url, message.url) && this.messagesPerPeriod == message.messagesPerPeriod && this.numberOfPeriods == message.numberOfPeriods && this.periodType == message.periodType && this.isRollingPeriod == message.isRollingPeriod && this.messageLimit == message.messageLimit && this.proximity == message.proximity && Intrinsics.areEqual(this.openDirect, message.openDirect) && Intrinsics.areEqual(this.customKeys, message.customKeys) && Intrinsics.areEqual(this.custom, message.custom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v43 */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iC = n1.c(this.alert, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.sound;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Media media = this.media;
        int iHashCode3 = (iHashCode2 + (media == null ? 0 : media.hashCode())) * 31;
        Date date = this.startDateUtc;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endDateUtc;
        int iHashCode5 = (((((iHashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31) + this.messageType) * 31) + this.contentType) * 31;
        String str3 = this.url;
        int iHashCode6 = (((((((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.messagesPerPeriod) * 31) + this.numberOfPeriods) * 31) + this.periodType) * 31;
        boolean z10 = this.isRollingPeriod;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (((((iHashCode6 + r3) * 31) + this.messageLimit) * 31) + this.proximity) * 31;
        String str4 = this.openDirect;
        int iHashCode7 = (i10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.customKeys;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        String str5 = this.custom;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @JvmName(name = "id")
    @NotNull
    public final String id() {
        return this.id;
    }

    @JvmName(name = "isRollingPeriod")
    public final boolean isRollingPeriod() {
        return this.isRollingPeriod;
    }

    @JvmName(name = SVGParser.XML_STYLESHEET_ATTR_MEDIA)
    @Nullable
    public final Media media() {
        return this.media;
    }

    @JvmName(name = "messageLimit")
    public final int messageLimit() {
        return this.messageLimit;
    }

    @JvmName(name = "messageType")
    public final int messageType() {
        return this.messageType;
    }

    @JvmName(name = "messagesPerPeriod")
    public final int messagesPerPeriod() {
        return this.messagesPerPeriod;
    }

    @JvmName(name = "numberOfPeriods")
    public final int numberOfPeriods() {
        return this.numberOfPeriods;
    }

    @JvmName(name = "openDirect")
    @Nullable
    public final String openDirect() {
        return this.openDirect;
    }

    @JvmName(name = "periodType")
    public final int periodType() {
        return this.periodType;
    }

    @JvmName(name = i.a.f65026x)
    public final int proximity() {
        return this.proximity;
    }

    @JvmName(name = "sound")
    @Nullable
    public final String sound() {
        return this.sound;
    }

    @JvmName(name = "startDateUtc")
    @Nullable
    public final Date startDateUtc() {
        return this.startDateUtc;
    }

    @JvmName(name = "title")
    @Nullable
    public final String title() {
        return this.title;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Message(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", alert=");
        sb2.append(this.alert);
        sb2.append(", sound=");
        sb2.append(this.sound);
        sb2.append(", media=");
        sb2.append(this.media);
        sb2.append(", startDateUtc=");
        sb2.append(this.startDateUtc);
        sb2.append(", endDateUtc=");
        sb2.append(this.endDateUtc);
        sb2.append(", messageType=");
        sb2.append(this.messageType);
        sb2.append(", contentType=");
        sb2.append(this.contentType);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", messagesPerPeriod=");
        sb2.append(this.messagesPerPeriod);
        sb2.append(", numberOfPeriods=");
        sb2.append(this.numberOfPeriods);
        sb2.append(", periodType=");
        sb2.append(this.periodType);
        sb2.append(", isRollingPeriod=");
        sb2.append(this.isRollingPeriod);
        sb2.append(", messageLimit=");
        sb2.append(this.messageLimit);
        sb2.append(", proximity=");
        sb2.append(this.proximity);
        sb2.append(", openDirect=");
        sb2.append(this.openDirect);
        sb2.append(", customKeys=");
        sb2.append(this.customKeys);
        sb2.append(", custom=");
        return y2.b(sb2, this.custom, RootService.CLOSE_BRACKET);
    }

    @JvmName(name = "url")
    @Nullable
    public final String url() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.alert);
        parcel.writeString(this.sound);
        Media media = this.media;
        if (media == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            media.writeToParcel(parcel, flags);
        }
        parcel.writeSerializable(this.startDateUtc);
        parcel.writeSerializable(this.endDateUtc);
        parcel.writeInt(this.messageType);
        parcel.writeInt(this.contentType);
        parcel.writeString(this.url);
        parcel.writeInt(this.messagesPerPeriod);
        parcel.writeInt(this.numberOfPeriods);
        parcel.writeInt(this.periodType);
        parcel.writeInt(this.isRollingPeriod ? 1 : 0);
        parcel.writeInt(this.messageLimit);
        parcel.writeInt(this.proximity);
        parcel.writeString(this.openDirect);
        Map<String, String> map = this.customKeys;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.custom);
    }

    public /* synthetic */ Message(String str, String str2, String str3, String str4, Media media, Date date, Date date2, int i10, int i11, String str5, int i12, int i13, int i14, boolean z10, int i15, int i16, String str6, Map map, String str7, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i17 & 2) != 0 ? null : str2, str3, (i17 & 8) != 0 ? null : str4, (i17 & 16) != 0 ? null : media, (i17 & 32) != 0 ? null : date, (i17 & 64) != 0 ? null : date2, i10, i11, (i17 & 512) != 0 ? null : str5, (i17 & 1024) != 0 ? -1 : i12, (i17 & 2048) != 0 ? -1 : i13, (i17 & 4096) != 0 ? 0 : i14, (i17 & 8192) != 0 ? false : z10, (i17 & 16384) != 0 ? -1 : i15, (32768 & i17) != 0 ? 0 : i16, (65536 & i17) != 0 ? null : str6, (131072 & i17) != 0 ? null : map, (i17 & 262144) != 0 ? null : str7);
    }

    @JvmName(name = "-lastShownDate")
    /* JADX INFO: renamed from: -lastShownDate, reason: not valid java name */
    public final void m5366lastShownDate(@Nullable Date date) {
        this.lastShownDate = date;
    }

    @JvmName(name = "-nextAllowedShow")
    /* JADX INFO: renamed from: -nextAllowedShow, reason: not valid java name */
    public final void m5368nextAllowedShow(@Nullable Date date) {
        this.nextAllowedShow = date;
    }

    @JvmName(name = "-notificationId")
    /* JADX INFO: renamed from: -notificationId, reason: not valid java name */
    public final void m5370notificationId(int i10) {
        this.notificationId = i10;
    }

    @JvmName(name = "-periodShowCount")
    /* JADX INFO: renamed from: -periodShowCount, reason: not valid java name */
    public final void m5372periodShowCount(int i10) {
        this.periodShowCount = i10;
    }

    @JvmName(name = "-showCount")
    /* JADX INFO: renamed from: -showCount, reason: not valid java name */
    public final void m5374showCount(int i10) {
        this.showCount = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Message(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        String stringOrNull = PushExtensionsKt.getStringOrNull(json, "title");
        String string2 = json.getString("alert");
        String stringOrNull2 = PushExtensionsKt.getStringOrNull(json, "sound");
        Media mediaA = Media.INSTANCE.a(json.optJSONObject(SVGParser.XML_STYLESHEET_ATTR_MEDIA));
        String stringOrNull3 = PushExtensionsKt.getStringOrNull(json, "startDateUtc");
        Date dateA = stringOrNull3 != null ? m.a(stringOrNull3) : null;
        String stringOrNull4 = PushExtensionsKt.getStringOrNull(json, "endDateUtc");
        Date dateA2 = stringOrNull4 != null ? m.a(stringOrNull4) : null;
        int i10 = json.getInt("messageType");
        int i11 = json.getInt("contentType");
        String stringOrNull5 = PushExtensionsKt.getStringOrNull(json, "url");
        String stringOrNull6 = PushExtensionsKt.getStringOrNull(json, "openDirect");
        int iOptInt = json.optInt("messageObjectPerPeriod", -1);
        int iOptInt2 = json.optInt("numberOfPeriods", -1);
        int iOptInt3 = json.optInt("periodType", 0);
        boolean zOptBoolean = json.optBoolean("isRollingPeriod");
        int iOptInt4 = json.optInt("messageLimit", -1);
        int iOptInt5 = json.optInt(i.a.f65026x, 0);
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("keys");
        Map<String, String> mapB = jSONArrayOptJSONArray != null ? m.b(jSONArrayOptJSONArray) : null;
        String stringOrNull7 = PushExtensionsKt.getStringOrNull(json, "custom");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\"id\")");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(\"alert\")");
        this(string, stringOrNull, string2, stringOrNull2, mediaA, dateA, dateA2, i10, i11, stringOrNull5, iOptInt, iOptInt2, iOptInt3, zOptBoolean, iOptInt4, iOptInt5, stringOrNull6, mapB, stringOrNull7);
    }

    /* JADX INFO: renamed from: -lastShownDate$annotations, reason: not valid java name */
    public static /* synthetic */ void m5342lastShownDate$annotations() {
    }

    /* JADX INFO: renamed from: -nextAllowedShow$annotations, reason: not valid java name */
    public static /* synthetic */ void m5343nextAllowedShow$annotations() {
    }

    /* JADX INFO: renamed from: -notificationId$annotations, reason: not valid java name */
    public static /* synthetic */ void m5344notificationId$annotations() {
    }

    /* JADX INFO: renamed from: -periodShowCount$annotations, reason: not valid java name */
    public static /* synthetic */ void m5345periodShowCount$annotations() {
    }

    /* JADX INFO: renamed from: -showCount$annotations, reason: not valid java name */
    public static /* synthetic */ void m5346showCount$annotations() {
    }
}
