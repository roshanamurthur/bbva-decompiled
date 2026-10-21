package com.salesforce.marketingcloud.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.n1;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0004abcdBá\u0001\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00101\u001a\u00020.¢\u0006\u0004\b^\u0010_J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0004J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0004J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010!\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b \u0010\u0004J\u0011\u0010#\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\"\u0010\u0004J\u0011\u0010%\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b$\u0010\u0004J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0011\u0010+\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b*\u0010\u0004J\u001d\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&H\u0007¢\u0006\u0004\b,\u0010(J\u000f\u00101\u001a\u00020.H\u0007¢\u0006\u0004\b/\u00100J\t\u00102\u001a\u00020\u0002HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00105\u001a\u00020\u0002HÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010:\u001a\u00020\u0018HÆ\u0003J\t\u0010;\u001a\u00020\u001cHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0017\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&HÆ\u0003J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\bB\u0010\u0004J\u0010\u0010E\u001a\u00020.HÀ\u0003¢\u0006\u0004\bD\u00100Jë\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00101\u001a\u00020.HÆ\u0001J\t\u0010I\u001a\u00020\u0002HÖ\u0001J\t\u0010J\u001a\u00020.HÖ\u0001J\u0013\u0010N\u001a\u00020M2\b\u0010L\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010O\u001a\u00020.HÖ\u0001J\u0019\u0010T\u001a\u00020S2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020.HÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\b\u0005\u0010\u0004R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\b\u0007\u0010\u0004R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010W\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\b\u0015\u0010\u0004R\u0019\u0010F\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\bF\u0010U\u001a\u0004\bF\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\u00188\u0007¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\u001f\u0010Y\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b!\u0010U\u001a\u0004\b!\u0010\u0004R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b#\u0010U\u001a\u0004\b#\u0010\u0004R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b%\u0010U\u001a\u0004\b%\u0010\u0004R#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&8\u0007¢\u0006\f\n\u0004\b)\u0010Z\u001a\u0004\b)\u0010(R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b+\u0010U\u001a\u0004\b+\u0010\u0004R%\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0007¢\u0006\f\n\u0004\b-\u0010Z\u001a\u0004\b-\u0010(R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010U\u001a\u0004\bG\u0010\u0004R\"\u00101\u001a\u00020.8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010[\u001a\u0004\b1\u00100\"\u0004\b\\\u0010]¨\u0006e"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage;", "Landroid/os/Parcelable;", "", "-deprecated_id", "()Ljava/lang/String;", "id", "-deprecated_requestId", "requestId", "Lcom/salesforce/marketingcloud/messages/Region;", "-deprecated_region", "()Lcom/salesforce/marketingcloud/messages/Region;", "region", "-deprecated_alert", "alert", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "-deprecated_sound", "()Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "sound", "-deprecated_soundName", "soundName", "-deprecated_title", "title", "-deprecated_subTitle", "subTitle", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;", "-deprecated_type", "()Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;", "type", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;", "-deprecated_trigger", "()Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;", "trigger", "-deprecated_url", "url", "-deprecated_mediaUrl", i.a.f65008e, "-deprecated_mediaAltText", "mediaAltText", "", "-deprecated_customKeys", "()Ljava/util/Map;", "customKeys", "-deprecated_custom", "custom", "-deprecated_payload", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "", "-deprecated_notificationId", "()I", "notificationId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17$sdk_release", "component17", "component18$sdk_release", "component18", NotificationMessage.NOTIF_KEY_SUB_TITLE, "propertyBag", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "Lcom/salesforce/marketingcloud/messages/Region;", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;", "Ljava/util/Map;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setNotificationId$sdk_release", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/Region;Ljava/lang/String;Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V", "Companion", "a", "Sound", "Trigger", UUIDPreferences.TYPE_KEY, "sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class NotificationMessage implements Parcelable {

    @NotNull
    public static final String NOTIF_KEY_ALERT = "alert";

    @NotNull
    public static final String NOTIF_KEY_SOUND = "sound";

    @NotNull
    public static final String NOTIF_KEY_TIMESTAMP = "timestamp";

    @NotNull
    public static final String NOTIF_KEY_TITLE = "title";

    @NotNull
    private final String alert;

    @Nullable
    private final String custom;

    @NotNull
    private final Map<String, String> customKeys;

    @NotNull
    private final String id;

    @Nullable
    private final String mediaAltText;

    @Nullable
    private final String mediaUrl;
    private int notificationId;

    @Nullable
    private final Map<String, String> payload;

    @Nullable
    private final String propertyBag;

    @Nullable
    private final Region region;

    @Nullable
    private final String requestId;

    @NotNull
    private final Sound sound;

    @Nullable
    private final String soundName;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;

    @NotNull
    private final Trigger trigger;

    @NotNull
    private final Type type;

    @Nullable
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<NotificationMessage> CREATOR = new b();

    @NotNull
    public static final String NOTIF_KEY_ID = "_m";

    @NotNull
    public static final String NOTIF_KEY_SID = "_sid";

    @NotNull
    public static final String NOTIF_KEY_MESSAGE_TYPE = "_mt";

    @NotNull
    public static final String NOTIF_KEY_MESSAGE_HASH = "_h";

    @NotNull
    public static final String NOTIF_KEY_REQUEST_ID = "_r";

    @NotNull
    public static final String NOTIF_KEY_PB_ID = "_pb";

    @NotNull
    public static final String NOTIF_KEY_SUB_TITLE = "subtitle";

    @NotNull
    public static final String NOTIF_KEY_MEDIA_URL = "_mediaUrl";

    @NotNull
    public static final String NOTIF_KEY_MEDIA_ALT = "_mediaAlt";

    @NotNull
    public static final String NOTIF_KEY_CLOUD_PAGE_URL = "_x";

    @NotNull
    public static final String NOTIF_KEY_OPEN_DIRECT_URL = "_od";

    @NotNull
    private static final String[] KNOWN_KEYS = {NOTIF_KEY_ID, NOTIF_KEY_SID, "timestamp", NOTIF_KEY_MESSAGE_TYPE, NOTIF_KEY_MESSAGE_HASH, NOTIF_KEY_REQUEST_ID, NOTIF_KEY_PB_ID, "title", NOTIF_KEY_SUB_TITLE, "alert", "sound", NOTIF_KEY_MEDIA_URL, NOTIF_KEY_MEDIA_ALT, NOTIF_KEY_CLOUD_PAGE_URL, NOTIF_KEY_OPEN_DIRECT_URL};

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "", "(Ljava/lang/String;I)V", "CUSTOM", "DEFAULT", ExpectedUserActionOnPoiTypes.NONE, "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Sound {
        CUSTOM,
        DEFAULT,
        NONE
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Trigger;", "", "(Ljava/lang/String;I)V", "PUSH", ConstantsKt.GEOFENCING_TYPE, "BEACON", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Trigger {
        PUSH,
        GEOFENCE,
        BEACON
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Type;", "", "(Ljava/lang/String;I)V", "OPEN_DIRECT", "CLOUD_PAGE", "OTHER", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        OPEN_DIRECT,
        CLOUD_PAGE,
        OTHER
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.notifications.NotificationMessage$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0014\u0010 \u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0014\u0010!\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0014\u0010\"\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0014\u0010$\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lcom/salesforce/marketingcloud/notifications/NotificationMessage$a;", "", "", "", "data", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage;", "a", "(Ljava/util/Map;)Lcom/salesforce/marketingcloud/notifications/NotificationMessage;", "Lcom/salesforce/marketingcloud/messages/Message;", "message", "Lcom/salesforce/marketingcloud/messages/Region;", "region", "(Lcom/salesforce/marketingcloud/messages/Message;Lcom/salesforce/marketingcloud/messages/Region;)Lcom/salesforce/marketingcloud/notifications/NotificationMessage;", "sound", "Lkotlin/Pair;", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage$Sound;", "(Ljava/lang/String;)Lkotlin/Pair;", "", "KNOWN_KEYS", "[Ljava/lang/String;", "()[Ljava/lang/String;", "NOTIF_KEY_ALERT", "Ljava/lang/String;", "NOTIF_KEY_CLOUD_PAGE_URL", "NOTIF_KEY_ID", "NOTIF_KEY_MEDIA_ALT", "NOTIF_KEY_MEDIA_URL", "NOTIF_KEY_MESSAGE_HASH", "NOTIF_KEY_MESSAGE_TYPE", "NOTIF_KEY_OPEN_DIRECT_URL", "NOTIF_KEY_PB_ID", "NOTIF_KEY_REQUEST_ID", "NOTIF_KEY_SID", "NOTIF_KEY_SOUND", "NOTIF_KEY_SUB_TITLE", "NOTIF_KEY_TIMESTAMP", "NOTIF_KEY_TITLE", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationMessage.kt\ncom/salesforce/marketingcloud/notifications/NotificationMessage$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,338:1\n1#2:339\n467#3,7:340\n*S KotlinDebug\n*F\n+ 1 NotificationMessage.kt\ncom/salesforce/marketingcloud/notifications/NotificationMessage$Companion\n*L\n88#1:340,7\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0060  */
        /* JADX WARN: Code duplicated, block: B:14:0x0064  */
        /* JADX WARN: Code duplicated, block: B:17:0x0079  */
        /* JADX WARN: Code duplicated, block: B:19:0x0085  */
        /* JADX WARN: Code duplicated, block: B:22:0x0094  */
        /* JADX WARN: Code duplicated, block: B:23:0x009a  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
        @JvmName(name = "-fromMessage")
        @NotNull
        public final NotificationMessage a(@NotNull Message message, @NotNull Region region) {
            Pair pair;
            Type type;
            String strOpenDirect;
            Trigger trigger;
            Map mapEmptyMap;
            Message.Media media;
            String strUrl;
            Message.Media media2;
            String strAltText;
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(region, "region");
            if (message.url() == null) {
                if (message.openDirect() != null) {
                    type = Type.OPEN_DIRECT;
                    strOpenDirect = message.openDirect();
                } else {
                    pair = TuplesKt.to(Type.OTHER, null);
                }
                Type type2 = (Type) pair.component1();
                String str = (String) pair.component2();
                Pair<Sound, String> pairA = a(message.sound());
                Sound soundComponent1 = pairA.component1();
                String strComponent2 = pairA.component2();
                if (message.messageType() == 5) {
                    trigger = Trigger.BEACON;
                } else {
                    trigger = Trigger.GEOFENCE;
                }
                Trigger trigger2 = trigger;
                String strId = message.id();
                String strTitle = message.title();
                String strAlert = message.alert();
                if (message.customKeys() != null) {
                    mapEmptyMap = new HashMap(message.customKeys());
                } else {
                    mapEmptyMap = q.emptyMap();
                }
                Map map = mapEmptyMap;
                String strCustom = message.custom();
                media = message.media();
                if (media != null) {
                    strUrl = media.url();
                } else {
                    strUrl = null;
                }
                media2 = message.media();
                if (media2 != null) {
                    strAltText = media2.altText();
                } else {
                    strAltText = null;
                }
                return new NotificationMessage(strId, null, region, strAlert, soundComponent1, strComponent2, strTitle, null, type2, trigger2, str, strUrl, strAltText, map, strCustom, null, null, 0, 229506, null);
            }
            type = Type.CLOUD_PAGE;
            strOpenDirect = message.url();
            pair = TuplesKt.to(type, strOpenDirect);
            Type type3 = (Type) pair.component1();
            String str2 = (String) pair.component2();
            Pair<Sound, String> pairA2 = a(message.sound());
            Sound soundComponent2 = pairA2.component1();
            String strComponent3 = pairA2.component2();
            if (message.messageType() == 5) {
                trigger = Trigger.BEACON;
            } else {
                trigger = Trigger.GEOFENCE;
            }
            Trigger trigger3 = trigger;
            String strId2 = message.id();
            String strTitle2 = message.title();
            String strAlert2 = message.alert();
            if (message.customKeys() != null) {
                mapEmptyMap = new HashMap(message.customKeys());
            } else {
                mapEmptyMap = q.emptyMap();
            }
            Map map2 = mapEmptyMap;
            String strCustom2 = message.custom();
            media = message.media();
            if (media != null) {
                strUrl = media.url();
            } else {
                strUrl = null;
            }
            media2 = message.media();
            if (media2 != null) {
                strAltText = media2.altText();
            } else {
                strAltText = null;
            }
            return new NotificationMessage(strId2, null, region, strAlert2, soundComponent2, strComponent3, strTitle2, null, type3, trigger3, str2, strUrl, strAltText, map2, strCustom2, null, null, 0, 229506, null);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x005e  */
        /* JADX WARN: Code duplicated, block: B:14:0x0084  */
        /* JADX WARN: Code duplicated, block: B:17:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:19:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:27:0x0121  */
        /* JADX WARN: Code duplicated, block: B:29:0x012d  */
        /* JADX WARN: Code duplicated, block: B:32:0x00df A[SYNTHETIC] */
        @JvmName(name = "-fromPushData")
        @NotNull
        public final NotificationMessage a(@NotNull Map<String, String> data) {
            Pair pair;
            Type type;
            Type type2;
            String str;
            Sound soundComponent1;
            String strComponent2;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            HashMap map;
            LinkedHashMap linkedHashMap;
            Iterator<Map.Entry<String, String>> it;
            String key;
            HashMap map2;
            Iterator<Map.Entry<String, String>> it2;
            String str8;
            Object obj;
            Intrinsics.checkNotNullParameter(data, "data");
            String str9 = NotificationMessage.NOTIF_KEY_CLOUD_PAGE_URL;
            if (!data.containsKey(NotificationMessage.NOTIF_KEY_CLOUD_PAGE_URL)) {
                str9 = NotificationMessage.NOTIF_KEY_OPEN_DIRECT_URL;
                if (data.containsKey(NotificationMessage.NOTIF_KEY_OPEN_DIRECT_URL)) {
                    type = Type.OPEN_DIRECT;
                } else {
                    pair = TuplesKt.to(Type.OTHER, null);
                }
                type2 = (Type) pair.component1();
                str = (String) pair.component2();
                Pair<Sound, String> pairA = a(data.get("sound"));
                soundComponent1 = pairA.component1();
                strComponent2 = pairA.component2();
                str2 = data.get(NotificationMessage.NOTIF_KEY_ID);
                if (str2 != null) {
                    throw new IllegalStateException("message id missing".toString());
                }
                str3 = str2;
                str4 = data.get(NotificationMessage.NOTIF_KEY_REQUEST_ID);
                str5 = data.get("title");
                str6 = data.get(NotificationMessage.NOTIF_KEY_SUB_TITLE);
                str7 = data.get("alert");
                if (str7 != null) {
                    throw new IllegalStateException("alert missing".toString());
                }
                String str10 = str7;
                String str11 = data.get(NotificationMessage.NOTIF_KEY_MEDIA_URL);
                String str12 = data.get(NotificationMessage.NOTIF_KEY_MEDIA_ALT);
                map = new HashMap(data);
                linkedHashMap = new LinkedHashMap();
                it = data.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    key = next.getKey();
                    if (ArraysKt___ArraysKt.contains(NotificationMessage.INSTANCE.a(), key)) {
                        it2 = it;
                        map2 = map;
                        str8 = str;
                        obj = null;
                        if (l.startsWith$default(key, ".google", false, 2, null)) {
                        }
                        it = it2;
                        map = map2;
                        str = str8;
                    } else {
                        map2 = map;
                        it2 = it;
                        str8 = str;
                        obj = null;
                    }
                    linkedHashMap.put(next.getKey(), next.getValue());
                    it = it2;
                    map = map2;
                    str = str8;
                }
                return new NotificationMessage(str3, str4, null, str10, soundComponent1, strComponent2, str5, str6, type2, Trigger.PUSH, str, str11, str12, linkedHashMap, null, map, data.get(NotificationMessage.NOTIF_KEY_PB_ID), 0, 147460, null);
            }
            type = Type.CLOUD_PAGE;
            pair = TuplesKt.to(type, data.get(str9));
            type2 = (Type) pair.component1();
            str = (String) pair.component2();
            Pair<Sound, String> pairA2 = a(data.get("sound"));
            soundComponent1 = pairA2.component1();
            strComponent2 = pairA2.component2();
            str2 = data.get(NotificationMessage.NOTIF_KEY_ID);
            if (str2 != null) {
                throw new IllegalStateException("message id missing".toString());
            }
            str3 = str2;
            str4 = data.get(NotificationMessage.NOTIF_KEY_REQUEST_ID);
            str5 = data.get("title");
            str6 = data.get(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            str7 = data.get("alert");
            if (str7 != null) {
                throw new IllegalStateException("alert missing".toString());
            }
            String str13 = str7;
            String str14 = data.get(NotificationMessage.NOTIF_KEY_MEDIA_URL);
            String str15 = data.get(NotificationMessage.NOTIF_KEY_MEDIA_ALT);
            map = new HashMap(data);
            linkedHashMap = new LinkedHashMap();
            it = data.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next2 = it.next();
                key = next2.getKey();
                if (ArraysKt___ArraysKt.contains(NotificationMessage.INSTANCE.a(), key)) {
                    it2 = it;
                    map2 = map;
                    str8 = str;
                    obj = null;
                    if (l.startsWith$default(key, ".google", false, 2, null)) {
                    }
                    it = it2;
                    map = map2;
                    str = str8;
                } else {
                    map2 = map;
                    it2 = it;
                    str8 = str;
                    obj = null;
                }
                linkedHashMap.put(next2.getKey(), next2.getValue());
                it = it2;
                map = map2;
                str = str8;
            }
            return new NotificationMessage(str3, str4, null, str13, soundComponent1, strComponent2, str5, str6, type2, Trigger.PUSH, str, str14, str15, linkedHashMap, null, map, data.get(NotificationMessage.NOTIF_KEY_PB_ID), 0, 147460, null);
        }

        @JvmName(name = "-resolveSound")
        @NotNull
        public final Pair<Sound, String> a(@Nullable String sound) {
            Sound sound2;
            if (sound == null || l.equals(sound, "none", true)) {
                sound2 = Sound.NONE;
            } else {
                if (!l.equals(sound, "default", true)) {
                    return TuplesKt.to(Sound.CUSTOM, sound);
                }
                sound2 = Sound.DEFAULT;
            }
            return TuplesKt.to(sound2, null);
        }

        @NotNull
        public final String[] a() {
            return NotificationMessage.KNOWN_KEYS;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<NotificationMessage> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationMessage createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Region regionCreateFromParcel = parcel.readInt() == 0 ? null : Region.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Sound soundValueOf = Sound.valueOf(parcel.readString());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Type typeValueOf = Type.valueOf(parcel.readString());
            Trigger triggerValueOf = Trigger.valueOf(parcel.readString());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i10);
            int i11 = 0;
            while (i11 != i10) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
                i11++;
                i10 = i10;
                string9 = string9;
            }
            String str = string9;
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = linkedHashMap3;
                linkedHashMap2 = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i12);
                int i13 = 0;
                while (i13 != i12) {
                    linkedHashMap4.put(parcel.readString(), parcel.readString());
                    i13++;
                    i12 = i12;
                    linkedHashMap3 = linkedHashMap3;
                }
                linkedHashMap = linkedHashMap3;
                linkedHashMap2 = linkedHashMap4;
            }
            return new NotificationMessage(string, string2, regionCreateFromParcel, string3, soundValueOf, string4, string5, string6, typeValueOf, triggerValueOf, string7, string8, str, linkedHashMap, string10, linkedHashMap2, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationMessage[] newArray(int i10) {
            return new NotificationMessage[i10];
        }
    }

    public NotificationMessage(@NotNull String id, @Nullable String str, @Nullable Region region, @NotNull String alert, @NotNull Sound sound, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull Type type, @NotNull Trigger trigger, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull Map<String, String> customKeys, @Nullable String str8, @Nullable Map<String, String> map, @Nullable String str9, int i10) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(sound, "sound");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        this.id = id;
        this.requestId = str;
        this.region = region;
        this.alert = alert;
        this.sound = sound;
        this.soundName = str2;
        this.title = str3;
        this.subtitle = str4;
        this.type = type;
        this.trigger = trigger;
        this.url = str5;
        this.mediaUrl = str6;
        this.mediaAltText = str7;
        this.customKeys = customKeys;
        this.custom = str8;
        this.payload = map;
        this.propertyBag = str9;
        this.notificationId = i10;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "alert", imports = {}))
    @JvmName(name = "-deprecated_alert")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_alert, reason: not valid java name and from getter */
    public final String getAlert() {
        return this.alert;
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
    @NotNull
    /* JADX INFO: renamed from: -deprecated_customKeys, reason: not valid java name */
    public final Map<String, String> m5469deprecated_customKeys() {
        return this.customKeys;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "id", imports = {}))
    @JvmName(name = "-deprecated_id")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_id, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "mediaAltText", imports = {}))
    @JvmName(name = "-deprecated_mediaAltText")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_mediaAltText, reason: not valid java name and from getter */
    public final String getMediaAltText() {
        return this.mediaAltText;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = i.a.f65008e, imports = {}))
    @JvmName(name = "-deprecated_mediaUrl")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_mediaUrl, reason: not valid java name and from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "notificationId", imports = {}))
    @JvmName(name = "-deprecated_notificationId")
    /* JADX INFO: renamed from: -deprecated_notificationId, reason: not valid java name and from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = BanxicoConstants.KEY_HISTORICAL_PAYLOAD, imports = {}))
    @JvmName(name = "-deprecated_payload")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_payload, reason: not valid java name */
    public final Map<String, String> m5474deprecated_payload() {
        return this.payload;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "region", imports = {}))
    @JvmName(name = "-deprecated_region")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_region, reason: not valid java name and from getter */
    public final Region getRegion() {
        return this.region;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "requestId", imports = {}))
    @JvmName(name = "-deprecated_requestId")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_requestId, reason: not valid java name and from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sound", imports = {}))
    @JvmName(name = "-deprecated_sound")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_sound, reason: not valid java name and from getter */
    public final Sound getSound() {
        return this.sound;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "soundName", imports = {}))
    @JvmName(name = "-deprecated_soundName")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_soundName, reason: not valid java name and from getter */
    public final String getSoundName() {
        return this.soundName;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = NOTIF_KEY_SUB_TITLE, imports = {}))
    @JvmName(name = "-deprecated_subTitle")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_subTitle, reason: not valid java name and from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "title", imports = {}))
    @JvmName(name = "-deprecated_title")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_title, reason: not valid java name and from getter */
    public final String getTitle() {
        return this.title;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "trigger", imports = {}))
    @JvmName(name = "-deprecated_trigger")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_trigger, reason: not valid java name and from getter */
    public final Trigger getTrigger() {
        return this.trigger;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @JvmName(name = "-deprecated_type")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final Type getType() {
        return this.type;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final String getUrl() {
        return this.url;
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

    @NotNull
    public final Trigger component10() {
        return this.trigger;
    }

    @Nullable
    public final String component11() {
        return this.url;
    }

    @Nullable
    public final String component12() {
        return this.mediaUrl;
    }

    @Nullable
    public final String component13() {
        return this.mediaAltText;
    }

    @NotNull
    public final Map<String, String> component14() {
        return this.customKeys;
    }

    @Nullable
    public final String component15() {
        return this.custom;
    }

    @Nullable
    public final Map<String, String> component16() {
        return this.payload;
    }

    @Nullable
    /* JADX INFO: renamed from: component17$sdk_release, reason: from getter */
    public final String getPropertyBag() {
        return this.propertyBag;
    }

    public final int component18$sdk_release() {
        return this.notificationId;
    }

    @Nullable
    public final String component2() {
        return this.requestId;
    }

    @Nullable
    public final Region component3() {
        return this.region;
    }

    @NotNull
    public final String component4() {
        return this.alert;
    }

    @NotNull
    public final Sound component5() {
        return this.sound;
    }

    @Nullable
    public final String component6() {
        return this.soundName;
    }

    @Nullable
    public final String component7() {
        return this.title;
    }

    @Nullable
    public final String component8() {
        return this.subtitle;
    }

    @NotNull
    public final Type component9() {
        return this.type;
    }

    @NotNull
    public final NotificationMessage copy(@NotNull String id, @Nullable String requestId, @Nullable Region region, @NotNull String alert, @NotNull Sound sound, @Nullable String soundName, @Nullable String title, @Nullable String subtitle, @NotNull Type type, @NotNull Trigger trigger, @Nullable String url, @Nullable String mediaUrl, @Nullable String mediaAltText, @NotNull Map<String, String> customKeys, @Nullable String custom, @Nullable Map<String, String> payload, @Nullable String propertyBag, int notificationId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(sound, "sound");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(customKeys, "customKeys");
        return new NotificationMessage(id, requestId, region, alert, sound, soundName, title, subtitle, type, trigger, url, mediaUrl, mediaAltText, customKeys, custom, payload, propertyBag, notificationId);
    }

    @JvmName(name = "custom")
    @Nullable
    public final String custom() {
        return this.custom;
    }

    @JvmName(name = "customKeys")
    @NotNull
    public final Map<String, String> customKeys() {
        return this.customKeys;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationMessage)) {
            return false;
        }
        NotificationMessage notificationMessage = (NotificationMessage) other;
        return Intrinsics.areEqual(this.id, notificationMessage.id) && Intrinsics.areEqual(this.requestId, notificationMessage.requestId) && Intrinsics.areEqual(this.region, notificationMessage.region) && Intrinsics.areEqual(this.alert, notificationMessage.alert) && this.sound == notificationMessage.sound && Intrinsics.areEqual(this.soundName, notificationMessage.soundName) && Intrinsics.areEqual(this.title, notificationMessage.title) && Intrinsics.areEqual(this.subtitle, notificationMessage.subtitle) && this.type == notificationMessage.type && this.trigger == notificationMessage.trigger && Intrinsics.areEqual(this.url, notificationMessage.url) && Intrinsics.areEqual(this.mediaUrl, notificationMessage.mediaUrl) && Intrinsics.areEqual(this.mediaAltText, notificationMessage.mediaAltText) && Intrinsics.areEqual(this.customKeys, notificationMessage.customKeys) && Intrinsics.areEqual(this.custom, notificationMessage.custom) && Intrinsics.areEqual(this.payload, notificationMessage.payload) && Intrinsics.areEqual(this.propertyBag, notificationMessage.propertyBag) && this.notificationId == notificationMessage.notificationId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.requestId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Region region = this.region;
        int iHashCode3 = (this.sound.hashCode() + n1.c(this.alert, (iHashCode2 + (region == null ? 0 : region.hashCode())) * 31, 31)) * 31;
        String str2 = this.soundName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode6 = (this.trigger.hashCode() + ((this.type.hashCode() + ((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        String str5 = this.url;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mediaUrl;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mediaAltText;
        int iHashCode9 = (this.customKeys.hashCode() + ((iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31;
        String str8 = this.custom;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, String> map = this.payload;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        String str9 = this.propertyBag;
        return ((iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.notificationId;
    }

    @JvmName(name = "id")
    @NotNull
    public final String id() {
        return this.id;
    }

    @JvmName(name = "mediaAltText")
    @Nullable
    public final String mediaAltText() {
        return this.mediaAltText;
    }

    @JvmName(name = i.a.f65008e)
    @Nullable
    public final String mediaUrl() {
        return this.mediaUrl;
    }

    @JvmName(name = "notificationId")
    public final int notificationId() {
        return this.notificationId;
    }

    @JvmName(name = BanxicoConstants.KEY_HISTORICAL_PAYLOAD)
    @Nullable
    public final Map<String, String> payload() {
        return this.payload;
    }

    @JvmName(name = "propertyBag")
    @Nullable
    public final String propertyBag() {
        return this.propertyBag;
    }

    @JvmName(name = "region")
    @Nullable
    public final Region region() {
        return this.region;
    }

    @JvmName(name = "requestId")
    @Nullable
    public final String requestId() {
        return this.requestId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setNotificationId$sdk_release(int i10) {
        this.notificationId = i10;
    }

    @JvmName(name = "sound")
    @NotNull
    public final Sound sound() {
        return this.sound;
    }

    @JvmName(name = "soundName")
    @Nullable
    public final String soundName() {
        return this.soundName;
    }

    @JvmName(name = NOTIF_KEY_SUB_TITLE)
    @Nullable
    public final String subtitle() {
        return this.subtitle;
    }

    @JvmName(name = "title")
    @Nullable
    public final String title() {
        return this.title;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationMessage(id=");
        sb2.append(this.id);
        sb2.append(", requestId=");
        sb2.append(this.requestId);
        sb2.append(", region=");
        sb2.append(this.region);
        sb2.append(", alert=");
        sb2.append(this.alert);
        sb2.append(", sound=");
        sb2.append(this.sound);
        sb2.append(", soundName=");
        sb2.append(this.soundName);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", trigger=");
        sb2.append(this.trigger);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", mediaUrl=");
        sb2.append(this.mediaUrl);
        sb2.append(", mediaAltText=");
        sb2.append(this.mediaAltText);
        sb2.append(", customKeys=");
        sb2.append(this.customKeys);
        sb2.append(", custom=");
        sb2.append(this.custom);
        sb2.append(", payload=");
        sb2.append(this.payload);
        sb2.append(", propertyBag=");
        sb2.append(this.propertyBag);
        sb2.append(", notificationId=");
        return androidx.activity.a.d(sb2, this.notificationId, RootService.CLOSE_BRACKET);
    }

    @JvmName(name = "trigger")
    @NotNull
    public final Trigger trigger() {
        return this.trigger;
    }

    @JvmName(name = "type")
    @NotNull
    public final Type type() {
        return this.type;
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
        parcel.writeString(this.requestId);
        Region region = this.region;
        if (region == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            region.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.alert);
        parcel.writeString(this.sound.name());
        parcel.writeString(this.soundName);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.type.name());
        parcel.writeString(this.trigger.name());
        parcel.writeString(this.url);
        parcel.writeString(this.mediaUrl);
        parcel.writeString(this.mediaAltText);
        Map<String, String> map = this.customKeys;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.custom);
        Map<String, String> map2 = this.payload;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        parcel.writeString(this.propertyBag);
        parcel.writeInt(this.notificationId);
    }

    public /* synthetic */ NotificationMessage(String str, String str2, Region region, String str3, Sound sound, String str4, String str5, String str6, Type type, Trigger trigger, String str7, String str8, String str9, Map map, String str10, Map map2, String str11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : region, str3, sound, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, type, trigger, (i11 & 1024) != 0 ? null : str7, (i11 & 2048) != 0 ? null : str8, (i11 & 4096) != 0 ? null : str9, (i11 & 8192) != 0 ? q.emptyMap() : map, (i11 & 16384) != 0 ? null : str10, (32768 & i11) != 0 ? null : map2, (65536 & i11) != 0 ? null : str11, (i11 & 131072) != 0 ? -1 : i10);
    }
}
