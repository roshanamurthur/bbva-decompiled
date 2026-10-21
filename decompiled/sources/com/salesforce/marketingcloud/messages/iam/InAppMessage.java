package com.salesforce.marketingcloud.messages.iam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.n1;
import androidx.room.RoomDatabase;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SVGParser;
import com.salesforce.marketingcloud.MCKeep;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\tstuvwxyz{B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0081\u0002\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020)¢\u0006\u0002\u0010*J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b9J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\b:J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b;J\r\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\b<J\r\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\b=J\u0015\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0007¢\u0006\u0002\b>J\u000f\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\b?J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0016HÆ\u0003J\t\u0010F\u001a\u00020\u001aHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010!HÆ\u0003J\u000e\u0010K\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\bLJ\t\u0010M\u001a\u00020#HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020)HÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010U\u001a\u00020\tHÆ\u0003J\t\u0010V\u001a\u00020\u0010HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u008b\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020)HÆ\u0001J\r\u0010\u0018\u001a\u00020\u0016H\u0007¢\u0006\u0002\bYJ\t\u0010Z\u001a\u00020\tHÖ\u0001J\r\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\b[J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\b\\J\u000f\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b]J\u0013\u0010^\u001a\u00020)2\b\u0010_\u001a\u0004\u0018\u00010`HÖ\u0003J\t\u0010a\u001a\u00020\tHÖ\u0001J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\bbJ\r\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\bcJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0002\bdJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\beJ\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\bfJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\bgJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\bhJ\r\u0010i\u001a\u00020\u0003H\u0007¢\u0006\u0002\bjJ\t\u0010k\u001a\u00020\u0006HÖ\u0001J\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\blJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\bmJ\u0019\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010,R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010-R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010,R\u0013\u0010\u0015\u001a\u00020\u00168\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010.R\u0013\u0010\"\u001a\u00020#8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010/R\u001b\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u00100R\u0015\u0010 \u001a\u0004\u0018\u00010!8\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u00101R\u0013\u0010\u0018\u001a\u00020\u00168\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010.R\u0013\u0010\u0012\u001a\u00020\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00102R\u0013\u0010\u000e\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u00103R\u0013\u0010(\u001a\u00020)8\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u00104R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u00105R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010,R\u0013\u0010\u0019\u001a\u00020\u001a8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00106R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u00107R\u0013\u0010'\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u00103R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u00105R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u00103R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u00105R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010-R\u0013\u0010\u000f\u001a\u00020\u00108\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u00108R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010,¨\u0006|"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage;", "Landroid/os/Parcelable;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "id", "", "activityInstanceId", "priority", "", "startDateUtc", "Ljava/util/Date;", "endDateUtc", "modifiedDateUtc", "displayLimit", "type", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Type;", "windowColor", "displayDuration", "", "backgroundColor", "borderWidth", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "borderColor", "cornerRadius", "layoutOrder", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$LayoutOrder;", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;", "title", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;", "body", "closeButton", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "buttonConfiguration", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$ButtonConfig;", "buttons", "", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button;", "messageDelaySec", "displayLimitOverride", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILcom/salesforce/marketingcloud/messages/iam/InAppMessage$Type;Ljava/lang/String;JLjava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$LayoutOrder;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$ButtonConfig;Ljava/util/List;IZ)V", "-activityInstanceId", "()Ljava/lang/String;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$ButtonConfig;", "()Ljava/util/List;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "()J", "()I", "()Z", "()Ljava/util/Date;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$LayoutOrder;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Type;", "-deprecated_backgroundColor", "-deprecated_body", "-deprecated_borderColor", "-deprecated_borderWidth", "-deprecated_buttonConfiguration", "-deprecated_buttons", "-deprecated_closeButton", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component2$sdk_release", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "-deprecated_cornerRadius", "describeContents", "-deprecated_displayDuration", "-deprecated_displayLimit", "-deprecated_endDateUtc", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "-deprecated_id", "-deprecated_layoutOrder", "-deprecated_media", "-deprecated_modifiedDateUtc", "-deprecated_priority", "-deprecated_startDateUtc", "-deprecated_title", "toJson", "-toJson", "toString", "-deprecated_type", "-deprecated_windowColor", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Alignment", "Button", "ButtonConfig", "CloseButton", "LayoutOrder", "Media", "Size", "TextField", UUIDPreferences.TYPE_KEY, "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessage.kt\ncom/salesforce/marketingcloud/messages/iam/InAppMessage\n+ 2 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,743:1\n73#2,2:744\n73#2,2:746\n73#2,2:748\n73#2,2:750\n1#3:752\n1855#4,2:753\n*S KotlinDebug\n*F\n+ 1 InAppMessage.kt\ncom/salesforce/marketingcloud/messages/iam/InAppMessage\n*L\n58#1:744,2\n60#1:746,2\n61#1:748,2\n66#1:750,2\n98#1:753,2\n*E\n"})
public final /* data */ class InAppMessage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InAppMessage> CREATOR = new a();

    @NotNull
    private final String activityInstanceId;

    @Nullable
    private final String backgroundColor;

    @Nullable
    private final TextField body;

    @Nullable
    private final String borderColor;

    @NotNull
    private final Size borderWidth;

    @NotNull
    private final ButtonConfig buttonConfiguration;

    @Nullable
    private final List<Button> buttons;

    @Nullable
    private final CloseButton closeButton;

    @NotNull
    private final Size cornerRadius;
    private final long displayDuration;
    private final int displayLimit;
    private final boolean displayLimitOverride;

    @Nullable
    private final Date endDateUtc;

    @NotNull
    private final String id;

    @NotNull
    private final LayoutOrder layoutOrder;

    @Nullable
    private final Media media;
    private final int messageDelaySec;

    @Nullable
    private final Date modifiedDateUtc;
    private final int priority;

    @Nullable
    private final Date startDateUtc;

    @Nullable
    private final TextField title;

    @NotNull
    private final Type type;

    @Nullable
    private final String windowColor;

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "", "(Ljava/lang/String;I)V", "beginning", "center", "end", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Alignment {
        beginning,
        center,
        end
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<By\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0017J\u000f\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0018J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\r\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0002\b'J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b-J\r\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\b.J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b0J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b1J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b2J\r\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0012R\u0013\u0010\u000f\u001a\u00020\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0014R\u0013\u0010\u0010\u001a\u00020\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0013\u0010\u000b\u001a\u00020\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012¨\u0006="}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button;", "Landroid/os/Parcelable;", "id", "", FirebaseAnalytics.Param.INDEX, "", "text", "actionType", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button$ActionType;", "action", "fontColor", "fontSize", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "backgroundColor", "borderColor", "borderWidth", "cornerRadius", "(Ljava/lang/String;ILjava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button$ActionType;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;)V", "()Ljava/lang/String;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button$ActionType;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "()I", "-deprecated_action", "-deprecated_actionType", "-deprecated_backgroundColor", "-deprecated_borderColor", "-deprecated_borderWidth", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "-deprecated_cornerRadius", "describeContents", "equals", "", "other", "", "-deprecated_fontColor", "-deprecated_fontSize", GenerateActivationFormCommand.HASH_CODE, "-deprecated_id", "-deprecated_index", "-deprecated_text", "toJson", "Lorg/json/JSONObject;", "-toJson", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ActionType", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        @Nullable
        private final String action;

        @NotNull
        private final ActionType actionType;

        @Nullable
        private final String backgroundColor;

        @Nullable
        private final String borderColor;

        @NotNull
        private final Size borderWidth;

        @NotNull
        private final Size cornerRadius;

        @Nullable
        private final String fontColor;

        @NotNull
        private final Size fontSize;

        @NotNull
        private final String id;
        private final int index;

        @NotNull
        private final String text;

        @MCKeep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button$ActionType;", "", "(Ljava/lang/String;I)V", HearingDisabilitiesConstants.CLOSE_MODAL, "url", "pushSettings", "locationSettings", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum ActionType {
            close,
            url,
            pushSettings,
            locationSettings
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Button createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readInt(), parcel.readString(), ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Size.valueOf(parcel.readString()), Size.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Button[] newArray(int i10) {
                return new Button[i10];
            }
        }

        public Button(@NotNull String id, int i10, @NotNull String text, @NotNull ActionType actionType, @Nullable String str, @Nullable String str2, @NotNull Size fontSize, @Nullable String str3, @Nullable String str4, @NotNull Size borderWidth, @NotNull Size cornerRadius) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(fontSize, "fontSize");
            Intrinsics.checkNotNullParameter(borderWidth, "borderWidth");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.id = id;
            this.index = i10;
            this.text = text;
            this.actionType = actionType;
            this.action = str;
            this.fontColor = str2;
            this.fontSize = fontSize;
            this.backgroundColor = str3;
            this.borderColor = str4;
            this.borderWidth = borderWidth;
            this.cornerRadius = cornerRadius;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "action", imports = {}))
        @JvmName(name = "-deprecated_action")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_action, reason: not valid java name and from getter */
        public final String getAction() {
            return this.action;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "actionType", imports = {}))
        @JvmName(name = "-deprecated_actionType")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_actionType, reason: not valid java name and from getter */
        public final ActionType getActionType() {
            return this.actionType;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "backgroundColor", imports = {}))
        @JvmName(name = "-deprecated_backgroundColor")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_backgroundColor, reason: not valid java name and from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "borderColor", imports = {}))
        @JvmName(name = "-deprecated_borderColor")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_borderColor, reason: not valid java name and from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "borderWidth", imports = {}))
        @JvmName(name = "-deprecated_borderWidth")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_borderWidth, reason: not valid java name and from getter */
        public final Size getBorderWidth() {
            return this.borderWidth;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cornerRadius", imports = {}))
        @JvmName(name = "-deprecated_cornerRadius")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_cornerRadius, reason: not valid java name and from getter */
        public final Size getCornerRadius() {
            return this.cornerRadius;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fontColor", imports = {}))
        @JvmName(name = "-deprecated_fontColor")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_fontColor, reason: not valid java name and from getter */
        public final String getFontColor() {
            return this.fontColor;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fontSize", imports = {}))
        @JvmName(name = "-deprecated_fontSize")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_fontSize, reason: not valid java name and from getter */
        public final Size getFontSize() {
            return this.fontSize;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "id", imports = {}))
        @JvmName(name = "-deprecated_id")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_id, reason: not valid java name and from getter */
        public final String getId() {
            return this.id;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = FirebaseAnalytics.Param.INDEX, imports = {}))
        @JvmName(name = "-deprecated_index")
        /* JADX INFO: renamed from: -deprecated_index, reason: not valid java name and from getter */
        public final int getIndex() {
            return this.index;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "text", imports = {}))
        @JvmName(name = "-deprecated_text")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_text, reason: not valid java name and from getter */
        public final String getText() {
            return this.text;
        }

        @JvmName(name = "-toJson")
        @NotNull
        /* JADX INFO: renamed from: -toJson, reason: not valid java name */
        public final JSONObject m5428toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put(FirebaseAnalytics.Param.INDEX, this.index);
            jSONObject.put("text", this.text);
            jSONObject.put("actionType", this.actionType.name());
            String str = this.action;
            if (str != null) {
                jSONObject.put("actionAndroid", str);
            }
            String str2 = this.fontColor;
            if (str2 != null) {
                jSONObject.put("fontColor", str2);
            }
            jSONObject.put("fontSize", this.fontSize.name());
            String str3 = this.backgroundColor;
            if (str3 != null) {
                jSONObject.put("backgroundColor", str3);
            }
            String str4 = this.borderColor;
            if (str4 != null) {
                jSONObject.put("borderColor", str4);
            }
            jSONObject.put("borderWidth", this.borderWidth.name());
            jSONObject.put("cornerRadius", this.cornerRadius.name());
            return jSONObject;
        }

        @JvmName(name = "action")
        @Nullable
        public final String action() {
            return this.action;
        }

        @JvmName(name = "actionType")
        @NotNull
        public final ActionType actionType() {
            return this.actionType;
        }

        @JvmName(name = "backgroundColor")
        @Nullable
        public final String backgroundColor() {
            return this.backgroundColor;
        }

        @JvmName(name = "borderColor")
        @Nullable
        public final String borderColor() {
            return this.borderColor;
        }

        @JvmName(name = "borderWidth")
        @NotNull
        public final Size borderWidth() {
            return this.borderWidth;
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final Size component10() {
            return this.borderWidth;
        }

        @NotNull
        public final Size component11() {
            return this.cornerRadius;
        }

        public final int component2() {
            return this.index;
        }

        @NotNull
        public final String component3() {
            return this.text;
        }

        @NotNull
        public final ActionType component4() {
            return this.actionType;
        }

        @Nullable
        public final String component5() {
            return this.action;
        }

        @Nullable
        public final String component6() {
            return this.fontColor;
        }

        @NotNull
        public final Size component7() {
            return this.fontSize;
        }

        @Nullable
        public final String component8() {
            return this.backgroundColor;
        }

        @Nullable
        public final String component9() {
            return this.borderColor;
        }

        @NotNull
        public final Button copy(@NotNull String id, int index, @NotNull String text, @NotNull ActionType actionType, @Nullable String action, @Nullable String fontColor, @NotNull Size fontSize, @Nullable String backgroundColor, @Nullable String borderColor, @NotNull Size borderWidth, @NotNull Size cornerRadius) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(fontSize, "fontSize");
            Intrinsics.checkNotNullParameter(borderWidth, "borderWidth");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new Button(id, index, text, actionType, action, fontColor, fontSize, backgroundColor, borderColor, borderWidth, cornerRadius);
        }

        @JvmName(name = "cornerRadius")
        @NotNull
        public final Size cornerRadius() {
            return this.cornerRadius;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.areEqual(this.id, button.id) && this.index == button.index && Intrinsics.areEqual(this.text, button.text) && this.actionType == button.actionType && Intrinsics.areEqual(this.action, button.action) && Intrinsics.areEqual(this.fontColor, button.fontColor) && this.fontSize == button.fontSize && Intrinsics.areEqual(this.backgroundColor, button.backgroundColor) && Intrinsics.areEqual(this.borderColor, button.borderColor) && this.borderWidth == button.borderWidth && this.cornerRadius == button.cornerRadius;
        }

        @JvmName(name = "fontColor")
        @Nullable
        public final String fontColor() {
            return this.fontColor;
        }

        @JvmName(name = "fontSize")
        @NotNull
        public final Size fontSize() {
            return this.fontSize;
        }

        public int hashCode() {
            int iHashCode = (this.actionType.hashCode() + n1.c(this.text, ((this.id.hashCode() * 31) + this.index) * 31, 31)) * 31;
            String str = this.action;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fontColor;
            int iHashCode3 = (this.fontSize.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.backgroundColor;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.borderColor;
            return this.cornerRadius.hashCode() + ((this.borderWidth.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
        }

        @JvmName(name = "id")
        @NotNull
        public final String id() {
            return this.id;
        }

        @JvmName(name = FirebaseAnalytics.Param.INDEX)
        public final int index() {
            return this.index;
        }

        @JvmName(name = "text")
        @NotNull
        public final String text() {
            return this.text;
        }

        @NotNull
        public String toString() {
            return "Button(id=" + this.id + ", index=" + this.index + ", text=" + this.text + ", actionType=" + this.actionType + ", action=" + this.action + ", fontColor=" + this.fontColor + ", fontSize=" + this.fontSize + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ", cornerRadius=" + this.cornerRadius + RootService.CLOSE_BRACKET;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeInt(this.index);
            parcel.writeString(this.text);
            parcel.writeString(this.actionType.name());
            parcel.writeString(this.action);
            parcel.writeString(this.fontColor);
            parcel.writeString(this.fontSize.name());
            parcel.writeString(this.backgroundColor);
            parcel.writeString(this.borderColor);
            parcel.writeString(this.borderWidth.name());
            parcel.writeString(this.cornerRadius.name());
        }

        public /* synthetic */ Button(String str, int i10, String str2, ActionType actionType, String str3, String str4, Size size, String str5, String str6, Size size2, Size size3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 0 : i10, str2, (i11 & 8) != 0 ? ActionType.close : actionType, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? Size.s : size, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? Size.s : size2, (i11 & 1024) != 0 ? Size.s : size3);
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$ButtonConfig;", "", "(Ljava/lang/String;I)V", "stacked", "twoUp", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ButtonConfig {
        stacked,
        twoUp
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0013\b\u0000\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\t\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "-toJson", "()Lorg/json/JSONObject;", "toJson", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "-deprecated_alignment", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "alignment", "component1", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "<init>", "(Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CloseButton implements Parcelable {

        @NotNull
        private final Alignment alignment;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<CloseButton> CREATOR = new b();

        /* JADX INFO: renamed from: com.salesforce.marketingcloud.messages.iam.InAppMessage$CloseButton$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton$a;", "", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @JvmStatic
            @NotNull
            public final CloseButton a() {
                return new CloseButton(null, 1, 0 == true ? 1 : 0);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<CloseButton> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CloseButton createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CloseButton(Alignment.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CloseButton[] newArray(int i10) {
                return new CloseButton[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CloseButton() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CloseButton copy$default(CloseButton closeButton, Alignment alignment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                alignment = closeButton.alignment;
            }
            return closeButton.copy(alignment);
        }

        @JvmStatic
        @NotNull
        public static final CloseButton defaultCloseButton() {
            return INSTANCE.a();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "alignment", imports = {}))
        @JvmName(name = "-deprecated_alignment")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_alignment, reason: not valid java name and from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @JvmName(name = "-toJson")
        @NotNull
        /* JADX INFO: renamed from: -toJson, reason: not valid java name */
        public final JSONObject m5430toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alignment", this.alignment.name());
            return jSONObject;
        }

        @JvmName(name = "alignment")
        @NotNull
        public final Alignment alignment() {
            return this.alignment;
        }

        @NotNull
        public final Alignment component1() {
            return this.alignment;
        }

        @NotNull
        public final CloseButton copy(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new CloseButton(alignment);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CloseButton) && this.alignment == ((CloseButton) other).alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        @NotNull
        public String toString() {
            return "CloseButton(alignment=" + this.alignment + RootService.CLOSE_BRACKET;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.alignment.name());
        }

        public CloseButton(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.alignment = alignment;
        }

        public /* synthetic */ CloseButton(Alignment alignment, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Alignment.end : alignment);
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$LayoutOrder;", "", "(Ljava/lang/String;I)V", "ImageTitleBody", "TitleImageBody", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LayoutOrder {
        ImageTitleBody,
        TitleImageBody
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,BE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u000fJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0010J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\r\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0013\u0010\n\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\f¨\u0006-"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;", "Landroid/os/Parcelable;", "url", "", "size", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media$ImageSize;", "altText", "borderWidth", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "borderColor", "cornerRadius", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media$ImageSize;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;)V", "()Ljava/lang/String;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media$ImageSize;", "-deprecated_altText", "-deprecated_borderColor", "-deprecated_borderWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "-deprecated_cornerRadius", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "-deprecated_size", "toJson", "Lorg/json/JSONObject;", "-toJson", "toString", "-deprecated_url", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ImageSize", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Media implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Media> CREATOR = new a();

        @Nullable
        private final String altText;

        @Nullable
        private final String borderColor;

        @NotNull
        private final Size borderWidth;

        @NotNull
        private final Size cornerRadius;

        @NotNull
        private final ImageSize size;

        @NotNull
        private final String url;

        @MCKeep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media$ImageSize;", "", "(Ljava/lang/String;I)V", "full", "e2e", "inset", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum ImageSize {
            full,
            e2e,
            inset
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Media> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Media createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Media(parcel.readString(), ImageSize.valueOf(parcel.readString()), parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), Size.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Media[] newArray(int i10) {
                return new Media[i10];
            }
        }

        public Media(@NotNull String url, @NotNull ImageSize size, @Nullable String str, @NotNull Size borderWidth, @Nullable String str2, @NotNull Size cornerRadius) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(borderWidth, "borderWidth");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.url = url;
            this.size = size;
            this.altText = str;
            this.borderWidth = borderWidth;
            this.borderColor = str2;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ Media copy$default(Media media, String str, ImageSize imageSize, String str2, Size size, String str3, Size size2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = media.url;
            }
            if ((i10 & 2) != 0) {
                imageSize = media.size;
            }
            ImageSize imageSize2 = imageSize;
            if ((i10 & 4) != 0) {
                str2 = media.altText;
            }
            String str4 = str2;
            if ((i10 & 8) != 0) {
                size = media.borderWidth;
            }
            Size size3 = size;
            if ((i10 & 16) != 0) {
                str3 = media.borderColor;
            }
            String str5 = str3;
            if ((i10 & 32) != 0) {
                size2 = media.cornerRadius;
            }
            return media.copy(str, imageSize2, str4, size3, str5, size2);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "altText", imports = {}))
        @JvmName(name = "-deprecated_altText")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_altText, reason: not valid java name and from getter */
        public final String getAltText() {
            return this.altText;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "borderColor", imports = {}))
        @JvmName(name = "-deprecated_borderColor")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_borderColor, reason: not valid java name and from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "borderWidth", imports = {}))
        @JvmName(name = "-deprecated_borderWidth")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_borderWidth, reason: not valid java name and from getter */
        public final Size getBorderWidth() {
            return this.borderWidth;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cornerRadius", imports = {}))
        @JvmName(name = "-deprecated_cornerRadius")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_cornerRadius, reason: not valid java name and from getter */
        public final Size getCornerRadius() {
            return this.cornerRadius;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
        @JvmName(name = "-deprecated_size")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name and from getter */
        public final ImageSize getSize() {
            return this.size;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
        @JvmName(name = "-deprecated_url")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
        public final String getUrl() {
            return this.url;
        }

        @JvmName(name = "-toJson")
        @NotNull
        /* JADX INFO: renamed from: -toJson, reason: not valid java name */
        public final JSONObject m5437toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", this.url);
            jSONObject.put("size", this.size.name());
            String str = this.altText;
            if (str != null) {
                jSONObject.put("altText", str);
            }
            jSONObject.put("borderWidth", this.borderWidth.name());
            String str2 = this.borderColor;
            if (str2 != null) {
                jSONObject.put("borderColor", str2);
            }
            jSONObject.put("cornerRadius", this.cornerRadius);
            return jSONObject;
        }

        @JvmName(name = "altText")
        @Nullable
        public final String altText() {
            return this.altText;
        }

        @JvmName(name = "borderColor")
        @Nullable
        public final String borderColor() {
            return this.borderColor;
        }

        @JvmName(name = "borderWidth")
        @NotNull
        public final Size borderWidth() {
            return this.borderWidth;
        }

        @NotNull
        public final String component1() {
            return this.url;
        }

        @NotNull
        public final ImageSize component2() {
            return this.size;
        }

        @Nullable
        public final String component3() {
            return this.altText;
        }

        @NotNull
        public final Size component4() {
            return this.borderWidth;
        }

        @Nullable
        public final String component5() {
            return this.borderColor;
        }

        @NotNull
        public final Size component6() {
            return this.cornerRadius;
        }

        @NotNull
        public final Media copy(@NotNull String url, @NotNull ImageSize size, @Nullable String altText, @NotNull Size borderWidth, @Nullable String borderColor, @NotNull Size cornerRadius) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(borderWidth, "borderWidth");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new Media(url, size, altText, borderWidth, borderColor, cornerRadius);
        }

        @JvmName(name = "cornerRadius")
        @NotNull
        public final Size cornerRadius() {
            return this.cornerRadius;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Media)) {
                return false;
            }
            Media media = (Media) other;
            return Intrinsics.areEqual(this.url, media.url) && this.size == media.size && Intrinsics.areEqual(this.altText, media.altText) && this.borderWidth == media.borderWidth && Intrinsics.areEqual(this.borderColor, media.borderColor) && this.cornerRadius == media.cornerRadius;
        }

        public int hashCode() {
            int iHashCode = (this.size.hashCode() + (this.url.hashCode() * 31)) * 31;
            String str = this.altText;
            int iHashCode2 = (this.borderWidth.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.borderColor;
            return this.cornerRadius.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @JvmName(name = "size")
        @NotNull
        public final ImageSize size() {
            return this.size;
        }

        @NotNull
        public String toString() {
            return "Media(url=" + this.url + ", size=" + this.size + ", altText=" + this.altText + ", borderWidth=" + this.borderWidth + ", borderColor=" + this.borderColor + ", cornerRadius=" + this.cornerRadius + RootService.CLOSE_BRACKET;
        }

        @JvmName(name = "url")
        @NotNull
        public final String url() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.url);
            parcel.writeString(this.size.name());
            parcel.writeString(this.altText);
            parcel.writeString(this.borderWidth.name());
            parcel.writeString(this.borderColor);
            parcel.writeString(this.cornerRadius.name());
        }

        public /* synthetic */ Media(String str, ImageSize imageSize, String str2, Size size, String str3, Size size2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? ImageSize.e2e : imageSize, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? Size.s : size, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? Size.s : size2);
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "", "(Ljava/lang/String;I)V", "s", "m", "l", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Size {
        s,
        m,
        l
    }

    @MCKeep
    @Parcelize
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u0014HÖ\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fJ\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000b¨\u0006&"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;", "Landroid/os/Parcelable;", "text", "", "fontSize", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "fontColor", "alignment", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "(Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;Ljava/lang/String;Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;)V", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Alignment;", "()Ljava/lang/String;", "()Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Size;", "-deprecated_alignment", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "-deprecated_fontColor", "-deprecated_fontSize", GenerateActivationFormCommand.HASH_CODE, "-deprecated_text", "toJson", "Lorg/json/JSONObject;", "-toJson", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TextField implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextField> CREATOR = new a();

        @NotNull
        private final Alignment alignment;

        @Nullable
        private final String fontColor;

        @NotNull
        private final Size fontSize;

        @NotNull
        private final String text;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextField> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextField createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextField(parcel.readString(), Size.valueOf(parcel.readString()), parcel.readString(), Alignment.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextField[] newArray(int i10) {
                return new TextField[i10];
            }
        }

        public TextField(@NotNull String text, @NotNull Size fontSize, @Nullable String str, @NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(fontSize, "fontSize");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.text = text;
            this.fontSize = fontSize;
            this.fontColor = str;
            this.alignment = alignment;
        }

        public static /* synthetic */ TextField copy$default(TextField textField, String str, Size size, String str2, Alignment alignment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = textField.text;
            }
            if ((i10 & 2) != 0) {
                size = textField.fontSize;
            }
            if ((i10 & 4) != 0) {
                str2 = textField.fontColor;
            }
            if ((i10 & 8) != 0) {
                alignment = textField.alignment;
            }
            return textField.copy(str, size, str2, alignment);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "alignment", imports = {}))
        @JvmName(name = "-deprecated_alignment")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_alignment, reason: not valid java name and from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fontColor", imports = {}))
        @JvmName(name = "-deprecated_fontColor")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_fontColor, reason: not valid java name and from getter */
        public final String getFontColor() {
            return this.fontColor;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fontSize", imports = {}))
        @JvmName(name = "-deprecated_fontSize")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_fontSize, reason: not valid java name and from getter */
        public final Size getFontSize() {
            return this.fontSize;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "text", imports = {}))
        @JvmName(name = "-deprecated_text")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_text, reason: not valid java name and from getter */
        public final String getText() {
            return this.text;
        }

        @JvmName(name = "-toJson")
        @NotNull
        /* JADX INFO: renamed from: -toJson, reason: not valid java name */
        public final JSONObject m5442toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", this.text);
            jSONObject.put("fontSize", this.fontSize.name());
            String str = this.fontColor;
            if (str != null) {
                jSONObject.put("fontColor", str);
            }
            jSONObject.put("alignment", this.alignment.name());
            return jSONObject;
        }

        @JvmName(name = "alignment")
        @NotNull
        public final Alignment alignment() {
            return this.alignment;
        }

        @NotNull
        public final String component1() {
            return this.text;
        }

        @NotNull
        public final Size component2() {
            return this.fontSize;
        }

        @Nullable
        public final String component3() {
            return this.fontColor;
        }

        @NotNull
        public final Alignment component4() {
            return this.alignment;
        }

        @NotNull
        public final TextField copy(@NotNull String text, @NotNull Size fontSize, @Nullable String fontColor, @NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(fontSize, "fontSize");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new TextField(text, fontSize, fontColor, alignment);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) other;
            return Intrinsics.areEqual(this.text, textField.text) && this.fontSize == textField.fontSize && Intrinsics.areEqual(this.fontColor, textField.fontColor) && this.alignment == textField.alignment;
        }

        @JvmName(name = "fontColor")
        @Nullable
        public final String fontColor() {
            return this.fontColor;
        }

        @JvmName(name = "fontSize")
        @NotNull
        public final Size fontSize() {
            return this.fontSize;
        }

        public int hashCode() {
            int iHashCode = (this.fontSize.hashCode() + (this.text.hashCode() * 31)) * 31;
            String str = this.fontColor;
            return this.alignment.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @JvmName(name = "text")
        @NotNull
        public final String text() {
            return this.text;
        }

        @NotNull
        public String toString() {
            return "TextField(text=" + this.text + ", fontSize=" + this.fontSize + ", fontColor=" + this.fontColor + ", alignment=" + this.alignment + RootService.CLOSE_BRACKET;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.text);
            parcel.writeString(this.fontSize.name());
            parcel.writeString(this.fontColor);
            parcel.writeString(this.alignment.name());
        }

        public /* synthetic */ TextField(String str, Size size, String str2, Alignment alignment, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? Size.s : size, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? Alignment.center : alignment);
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Type;", "", "(Ljava/lang/String;I)V", "bannerTop", "bannerBottom", "modal", "full", "fullImageFill", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        bannerTop,
        bannerBottom,
        modal,
        full,
        fullImageFill
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InAppMessage> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InAppMessage createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i10 = parcel.readInt();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            Date date3 = (Date) parcel.readSerializable();
            int i11 = parcel.readInt();
            Type typeValueOf = Type.valueOf(parcel.readString());
            String string3 = parcel.readString();
            long j10 = parcel.readLong();
            String string4 = parcel.readString();
            Size sizeValueOf = Size.valueOf(parcel.readString());
            String string5 = parcel.readString();
            Size sizeValueOf2 = Size.valueOf(parcel.readString());
            LayoutOrder layoutOrderValueOf = LayoutOrder.valueOf(parcel.readString());
            Media mediaCreateFromParcel = parcel.readInt() == 0 ? null : Media.CREATOR.createFromParcel(parcel);
            TextField textFieldCreateFromParcel = parcel.readInt() == 0 ? null : TextField.CREATOR.createFromParcel(parcel);
            TextField textFieldCreateFromParcel2 = parcel.readInt() == 0 ? null : TextField.CREATOR.createFromParcel(parcel);
            CloseButton closeButtonCreateFromParcel = parcel.readInt() == 0 ? null : CloseButton.CREATOR.createFromParcel(parcel);
            ButtonConfig buttonConfigValueOf = ButtonConfig.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int i13 = 0;
                while (i13 != i12) {
                    arrayList2.add(Button.CREATOR.createFromParcel(parcel));
                    i13++;
                    i12 = i12;
                }
                arrayList = arrayList2;
            }
            return new InAppMessage(string, string2, i10, date, date2, date3, i11, typeValueOf, string3, j10, string4, sizeValueOf, string5, sizeValueOf2, layoutOrderValueOf, mediaCreateFromParcel, textFieldCreateFromParcel, textFieldCreateFromParcel2, closeButtonCreateFromParcel, buttonConfigValueOf, arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InAppMessage[] newArray(int i10) {
            return new InAppMessage[i10];
        }
    }

    public InAppMessage(@NotNull String id, @NotNull String activityInstanceId, int i10, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, int i11, @NotNull Type type, @Nullable String str, long j10, @Nullable String str2, @NotNull Size borderWidth, @Nullable String str3, @NotNull Size cornerRadius, @NotNull LayoutOrder layoutOrder, @Nullable Media media, @Nullable TextField textField, @Nullable TextField textField2, @Nullable CloseButton closeButton, @NotNull ButtonConfig buttonConfiguration, @Nullable List<Button> list, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(activityInstanceId, "activityInstanceId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(borderWidth, "borderWidth");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(layoutOrder, "layoutOrder");
        Intrinsics.checkNotNullParameter(buttonConfiguration, "buttonConfiguration");
        this.id = id;
        this.activityInstanceId = activityInstanceId;
        this.priority = i10;
        this.startDateUtc = date;
        this.endDateUtc = date2;
        this.modifiedDateUtc = date3;
        this.displayLimit = i11;
        this.type = type;
        this.windowColor = str;
        this.displayDuration = j10;
        this.backgroundColor = str2;
        this.borderWidth = borderWidth;
        this.borderColor = str3;
        this.cornerRadius = cornerRadius;
        this.layoutOrder = layoutOrder;
        this.media = media;
        this.title = textField;
        this.body = textField2;
        this.closeButton = closeButton;
        this.buttonConfiguration = buttonConfiguration;
        this.buttons = list;
        this.messageDelaySec = i12;
        this.displayLimitOverride = z10;
    }

    @JvmName(name = "-activityInstanceId")
    @NotNull
    /* JADX INFO: renamed from: -activityInstanceId, reason: not valid java name and from getter */
    public final String getActivityInstanceId() {
        return this.activityInstanceId;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "backgroundColor", imports = {}))
    @JvmName(name = "-deprecated_backgroundColor")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_backgroundColor, reason: not valid java name and from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @JvmName(name = "-deprecated_body")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final TextField getBody() {
        return this.body;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "borderColor", imports = {}))
    @JvmName(name = "-deprecated_borderColor")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_borderColor, reason: not valid java name and from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "borderWidth", imports = {}))
    @JvmName(name = "-deprecated_borderWidth")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_borderWidth, reason: not valid java name and from getter */
    public final Size getBorderWidth() {
        return this.borderWidth;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "buttonConfiguration", imports = {}))
    @JvmName(name = "-deprecated_buttonConfiguration")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_buttonConfiguration, reason: not valid java name and from getter */
    public final ButtonConfig getButtonConfiguration() {
        return this.buttonConfiguration;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "buttons", imports = {}))
    @JvmName(name = "-deprecated_buttons")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_buttons, reason: not valid java name */
    public final List<Button> m5401deprecated_buttons() {
        return this.buttons;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "closeButton", imports = {}))
    @JvmName(name = "-deprecated_closeButton")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_closeButton, reason: not valid java name and from getter */
    public final CloseButton getCloseButton() {
        return this.closeButton;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cornerRadius", imports = {}))
    @JvmName(name = "-deprecated_cornerRadius")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_cornerRadius, reason: not valid java name and from getter */
    public final Size getCornerRadius() {
        return this.cornerRadius;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "displayDuration", imports = {}))
    @JvmName(name = "-deprecated_displayDuration")
    /* JADX INFO: renamed from: -deprecated_displayDuration, reason: not valid java name and from getter */
    public final long getDisplayDuration() {
        return this.displayDuration;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "displayLimit", imports = {}))
    @JvmName(name = "-deprecated_displayLimit")
    /* JADX INFO: renamed from: -deprecated_displayLimit, reason: not valid java name and from getter */
    public final int getDisplayLimit() {
        return this.displayLimit;
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

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "layoutOrder", imports = {}))
    @JvmName(name = "-deprecated_layoutOrder")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_layoutOrder, reason: not valid java name and from getter */
    public final LayoutOrder getLayoutOrder() {
        return this.layoutOrder;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = SVGParser.XML_STYLESHEET_ATTR_MEDIA, imports = {}))
    @JvmName(name = "-deprecated_media")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_media, reason: not valid java name and from getter */
    public final Media getMedia() {
        return this.media;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "modifiedDateUtc", imports = {}))
    @JvmName(name = "-deprecated_modifiedDateUtc")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_modifiedDateUtc, reason: not valid java name and from getter */
    public final Date getModifiedDateUtc() {
        return this.modifiedDateUtc;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "priority", imports = {}))
    @JvmName(name = "-deprecated_priority")
    /* JADX INFO: renamed from: -deprecated_priority, reason: not valid java name and from getter */
    public final int getPriority() {
        return this.priority;
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
    public final TextField getTitle() {
        return this.title;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @JvmName(name = "-deprecated_type")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final Type getType() {
        return this.type;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "windowColor", imports = {}))
    @JvmName(name = "-deprecated_windowColor")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_windowColor, reason: not valid java name and from getter */
    public final String getWindowColor() {
        return this.windowColor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @JvmName(name = "-toJson")
    @NotNull
    /* JADX INFO: renamed from: -toJson, reason: not valid java name */
    public final JSONObject m5416toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("activityInstanceId", this.activityInstanceId);
        jSONObject.put("priority", this.priority);
        Date date = this.startDateUtc;
        if (date != null) {
            jSONObject.put("startDateUtc", com.salesforce.marketingcloud.internal.m.a(date));
        }
        Date date2 = this.endDateUtc;
        if (date2 != null) {
            jSONObject.put("endDateUtc", com.salesforce.marketingcloud.internal.m.a(date2));
        }
        Date date3 = this.modifiedDateUtc;
        if (date3 != null) {
            jSONObject.put("modifiedDateUtc", com.salesforce.marketingcloud.internal.m.a(date3));
        }
        jSONObject.put("displayLimit", this.displayLimit);
        jSONObject.put("type", this.type.name());
        String str = this.windowColor;
        if (str != null) {
            jSONObject.put("windowColor", str);
        }
        jSONObject.put("displayDuration", this.displayDuration);
        String str2 = this.backgroundColor;
        if (str2 != null) {
            jSONObject.put("backgroundColor", str2);
        }
        jSONObject.put("borderWidth", this.borderWidth.name());
        String str3 = this.borderColor;
        if (str3 != null) {
            jSONObject.put("borderColor", str3);
        }
        jSONObject.put("cornerRadius", this.cornerRadius.name());
        jSONObject.put("layoutOrder", this.layoutOrder.name());
        Media media = this.media;
        if (media != null) {
            jSONObject.put(SVGParser.XML_STYLESHEET_ATTR_MEDIA, media.m5437toJson());
        }
        TextField textField = this.title;
        if (textField != null) {
            jSONObject.put("title", textField.m5442toJson());
        }
        TextField textField2 = this.body;
        if (textField2 != null) {
            jSONObject.put("body", textField2.m5442toJson());
        }
        CloseButton closeButton = this.closeButton;
        if (closeButton != null) {
            jSONObject.put("closeButton", closeButton.m5430toJson());
        }
        jSONObject.put("buttonConfiguration", this.buttonConfiguration.name());
        if (this.buttons != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.buttons.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Button) it.next()).m5428toJson());
            }
            Unit unit = Unit.INSTANCE;
            jSONObject.put("buttons", jSONArray);
        }
        jSONObject.put("messageDelaySec", this.messageDelaySec);
        jSONObject.put("displayLimitOverride", this.displayLimitOverride);
        return jSONObject;
    }

    @JvmName(name = "backgroundColor")
    @Nullable
    public final String backgroundColor() {
        return this.backgroundColor;
    }

    @JvmName(name = "body")
    @Nullable
    public final TextField body() {
        return this.body;
    }

    @JvmName(name = "borderColor")
    @Nullable
    public final String borderColor() {
        return this.borderColor;
    }

    @JvmName(name = "borderWidth")
    @NotNull
    public final Size borderWidth() {
        return this.borderWidth;
    }

    @JvmName(name = "buttonConfiguration")
    @NotNull
    public final ButtonConfig buttonConfiguration() {
        return this.buttonConfiguration;
    }

    @JvmName(name = "buttons")
    @Nullable
    public final List<Button> buttons() {
        return this.buttons;
    }

    @JvmName(name = "closeButton")
    @Nullable
    public final CloseButton closeButton() {
        return this.closeButton;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.displayDuration;
    }

    @Nullable
    public final String component11() {
        return this.backgroundColor;
    }

    @NotNull
    public final Size component12() {
        return this.borderWidth;
    }

    @Nullable
    public final String component13() {
        return this.borderColor;
    }

    @NotNull
    public final Size component14() {
        return this.cornerRadius;
    }

    @NotNull
    public final LayoutOrder component15() {
        return this.layoutOrder;
    }

    @Nullable
    public final Media component16() {
        return this.media;
    }

    @Nullable
    public final TextField component17() {
        return this.title;
    }

    @Nullable
    public final TextField component18() {
        return this.body;
    }

    @Nullable
    public final CloseButton component19() {
        return this.closeButton;
    }

    @NotNull
    public final String component2$sdk_release() {
        return this.activityInstanceId;
    }

    @NotNull
    public final ButtonConfig component20() {
        return this.buttonConfiguration;
    }

    @Nullable
    public final List<Button> component21() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getMessageDelaySec() {
        return this.messageDelaySec;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getDisplayLimitOverride() {
        return this.displayLimitOverride;
    }

    public final int component3() {
        return this.priority;
    }

    @Nullable
    public final Date component4() {
        return this.startDateUtc;
    }

    @Nullable
    public final Date component5() {
        return this.endDateUtc;
    }

    @Nullable
    public final Date component6() {
        return this.modifiedDateUtc;
    }

    public final int component7() {
        return this.displayLimit;
    }

    @NotNull
    public final Type component8() {
        return this.type;
    }

    @Nullable
    public final String component9() {
        return this.windowColor;
    }

    @NotNull
    public final InAppMessage copy(@NotNull String id, @NotNull String activityInstanceId, int priority, @Nullable Date startDateUtc, @Nullable Date endDateUtc, @Nullable Date modifiedDateUtc, int displayLimit, @NotNull Type type, @Nullable String windowColor, long displayDuration, @Nullable String backgroundColor, @NotNull Size borderWidth, @Nullable String borderColor, @NotNull Size cornerRadius, @NotNull LayoutOrder layoutOrder, @Nullable Media media, @Nullable TextField title, @Nullable TextField body, @Nullable CloseButton closeButton, @NotNull ButtonConfig buttonConfiguration, @Nullable List<Button> buttons, int messageDelaySec, boolean displayLimitOverride) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(activityInstanceId, "activityInstanceId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(borderWidth, "borderWidth");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(layoutOrder, "layoutOrder");
        Intrinsics.checkNotNullParameter(buttonConfiguration, "buttonConfiguration");
        return new InAppMessage(id, activityInstanceId, priority, startDateUtc, endDateUtc, modifiedDateUtc, displayLimit, type, windowColor, displayDuration, backgroundColor, borderWidth, borderColor, cornerRadius, layoutOrder, media, title, body, closeButton, buttonConfiguration, buttons, messageDelaySec, displayLimitOverride);
    }

    @JvmName(name = "cornerRadius")
    @NotNull
    public final Size cornerRadius() {
        return this.cornerRadius;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JvmName(name = "displayDuration")
    public final long displayDuration() {
        return this.displayDuration;
    }

    @JvmName(name = "displayLimit")
    public final int displayLimit() {
        return this.displayLimit;
    }

    @JvmName(name = "displayLimitOverride")
    public final boolean displayLimitOverride() {
        return this.displayLimitOverride;
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
        if (!(other instanceof InAppMessage)) {
            return false;
        }
        InAppMessage inAppMessage = (InAppMessage) other;
        return Intrinsics.areEqual(this.id, inAppMessage.id) && Intrinsics.areEqual(this.activityInstanceId, inAppMessage.activityInstanceId) && this.priority == inAppMessage.priority && Intrinsics.areEqual(this.startDateUtc, inAppMessage.startDateUtc) && Intrinsics.areEqual(this.endDateUtc, inAppMessage.endDateUtc) && Intrinsics.areEqual(this.modifiedDateUtc, inAppMessage.modifiedDateUtc) && this.displayLimit == inAppMessage.displayLimit && this.type == inAppMessage.type && Intrinsics.areEqual(this.windowColor, inAppMessage.windowColor) && this.displayDuration == inAppMessage.displayDuration && Intrinsics.areEqual(this.backgroundColor, inAppMessage.backgroundColor) && this.borderWidth == inAppMessage.borderWidth && Intrinsics.areEqual(this.borderColor, inAppMessage.borderColor) && this.cornerRadius == inAppMessage.cornerRadius && this.layoutOrder == inAppMessage.layoutOrder && Intrinsics.areEqual(this.media, inAppMessage.media) && Intrinsics.areEqual(this.title, inAppMessage.title) && Intrinsics.areEqual(this.body, inAppMessage.body) && Intrinsics.areEqual(this.closeButton, inAppMessage.closeButton) && this.buttonConfiguration == inAppMessage.buttonConfiguration && Intrinsics.areEqual(this.buttons, inAppMessage.buttons) && this.messageDelaySec == inAppMessage.messageDelaySec && this.displayLimitOverride == inAppMessage.displayLimitOverride;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    public int hashCode() {
        int iC = (n1.c(this.activityInstanceId, this.id.hashCode() * 31, 31) + this.priority) * 31;
        Date date = this.startDateUtc;
        int iHashCode = (iC + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.endDateUtc;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.modifiedDateUtc;
        int iHashCode3 = (this.type.hashCode() + ((((iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31) + this.displayLimit) * 31)) * 31;
        String str = this.windowColor;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j10 = this.displayDuration;
        int i10 = (((iHashCode3 + iHashCode4) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.backgroundColor;
        int iHashCode5 = (this.borderWidth.hashCode() + ((i10 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.borderColor;
        int iHashCode6 = (this.layoutOrder.hashCode() + ((this.cornerRadius.hashCode() + ((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        Media media = this.media;
        int iHashCode7 = (iHashCode6 + (media == null ? 0 : media.hashCode())) * 31;
        TextField textField = this.title;
        int iHashCode8 = (iHashCode7 + (textField == null ? 0 : textField.hashCode())) * 31;
        TextField textField2 = this.body;
        int iHashCode9 = (iHashCode8 + (textField2 == null ? 0 : textField2.hashCode())) * 31;
        CloseButton closeButton = this.closeButton;
        int iHashCode10 = (this.buttonConfiguration.hashCode() + ((iHashCode9 + (closeButton == null ? 0 : closeButton.hashCode())) * 31)) * 31;
        List<Button> list = this.buttons;
        int iHashCode11 = (((iHashCode10 + (list != null ? list.hashCode() : 0)) * 31) + this.messageDelaySec) * 31;
        boolean z10 = this.displayLimitOverride;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode11 + r1;
    }

    @JvmName(name = "id")
    @NotNull
    public final String id() {
        return this.id;
    }

    @JvmName(name = "layoutOrder")
    @NotNull
    public final LayoutOrder layoutOrder() {
        return this.layoutOrder;
    }

    @JvmName(name = SVGParser.XML_STYLESHEET_ATTR_MEDIA)
    @Nullable
    public final Media media() {
        return this.media;
    }

    @JvmName(name = "messageDelaySec")
    public final int messageDelaySec() {
        return this.messageDelaySec;
    }

    @JvmName(name = "modifiedDateUtc")
    @Nullable
    public final Date modifiedDateUtc() {
        return this.modifiedDateUtc;
    }

    @JvmName(name = "priority")
    public final int priority() {
        return this.priority;
    }

    @JvmName(name = "startDateUtc")
    @Nullable
    public final Date startDateUtc() {
        return this.startDateUtc;
    }

    @JvmName(name = "title")
    @Nullable
    public final TextField title() {
        return this.title;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InAppMessage(id=");
        sb2.append(this.id);
        sb2.append(", activityInstanceId=");
        sb2.append(this.activityInstanceId);
        sb2.append(", priority=");
        sb2.append(this.priority);
        sb2.append(", startDateUtc=");
        sb2.append(this.startDateUtc);
        sb2.append(", endDateUtc=");
        sb2.append(this.endDateUtc);
        sb2.append(", modifiedDateUtc=");
        sb2.append(this.modifiedDateUtc);
        sb2.append(", displayLimit=");
        sb2.append(this.displayLimit);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", windowColor=");
        sb2.append(this.windowColor);
        sb2.append(", displayDuration=");
        sb2.append(this.displayDuration);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", borderWidth=");
        sb2.append(this.borderWidth);
        sb2.append(", borderColor=");
        sb2.append(this.borderColor);
        sb2.append(", cornerRadius=");
        sb2.append(this.cornerRadius);
        sb2.append(", layoutOrder=");
        sb2.append(this.layoutOrder);
        sb2.append(", media=");
        sb2.append(this.media);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", closeButton=");
        sb2.append(this.closeButton);
        sb2.append(", buttonConfiguration=");
        sb2.append(this.buttonConfiguration);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", messageDelaySec=");
        sb2.append(this.messageDelaySec);
        sb2.append(", displayLimitOverride=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.displayLimitOverride, RootService.CLOSE_BRACKET);
    }

    @JvmName(name = "type")
    @NotNull
    public final Type type() {
        return this.type;
    }

    @JvmName(name = "windowColor")
    @Nullable
    public final String windowColor() {
        return this.windowColor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.activityInstanceId);
        parcel.writeInt(this.priority);
        parcel.writeSerializable(this.startDateUtc);
        parcel.writeSerializable(this.endDateUtc);
        parcel.writeSerializable(this.modifiedDateUtc);
        parcel.writeInt(this.displayLimit);
        parcel.writeString(this.type.name());
        parcel.writeString(this.windowColor);
        parcel.writeLong(this.displayDuration);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.borderWidth.name());
        parcel.writeString(this.borderColor);
        parcel.writeString(this.cornerRadius.name());
        parcel.writeString(this.layoutOrder.name());
        Media media = this.media;
        if (media == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            media.writeToParcel(parcel, flags);
        }
        TextField textField = this.title;
        if (textField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textField.writeToParcel(parcel, flags);
        }
        TextField textField2 = this.body;
        if (textField2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textField2.writeToParcel(parcel, flags);
        }
        CloseButton closeButton = this.closeButton;
        if (closeButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            closeButton.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.buttonConfiguration.name());
        List<Button> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Button> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.messageDelaySec);
        parcel.writeInt(this.displayLimitOverride ? 1 : 0);
    }

    public /* synthetic */ InAppMessage(String str, String str2, int i10, Date date, Date date2, Date date3, int i11, Type type, String str3, long j10, String str4, Size size, String str5, Size size2, LayoutOrder layoutOrder, Media media, TextField textField, TextField textField2, CloseButton closeButton, ButtonConfig buttonConfig, List list, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? 999 : i10, (i13 & 8) != 0 ? null : date, (i13 & 16) != 0 ? null : date2, (i13 & 32) != 0 ? null : date3, (i13 & 64) != 0 ? 1 : i11, type, (i13 & 256) != 0 ? null : str3, (i13 & 512) != 0 ? -1L : j10, str4, (i13 & 2048) != 0 ? Size.s : size, (i13 & 4096) != 0 ? null : str5, (i13 & 8192) != 0 ? Size.s : size2, (i13 & 16384) != 0 ? LayoutOrder.ImageTitleBody : layoutOrder, (32768 & i13) != 0 ? null : media, (65536 & i13) != 0 ? null : textField, (131072 & i13) != 0 ? null : textField2, (262144 & i13) != 0 ? null : closeButton, (524288 & i13) != 0 ? ButtonConfig.twoUp : buttonConfig, (1048576 & i13) != 0 ? null : list, (2097152 & i13) != 0 ? 0 : i12, (i13 & 4194304) != 0 ? false : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InAppMessage(@NotNull JSONObject json) throws JSONException {
        Size sizeValueOf;
        Size sizeValueOf2;
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(\"id\")");
        String string2 = json.getString("activityInstanceId");
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(\"activityInstanceId\")");
        int iOptInt = json.optInt("priority", RoomDatabase.MAX_BIND_PARAMETER_CNT);
        String strG = androidx.databinding.f.g(json, "startDateUtc", "json.optString(\"startDateUtc\")");
        Date dateA = strG != null ? com.salesforce.marketingcloud.internal.m.a(strG) : null;
        String strG2 = androidx.databinding.f.g(json, "endDateUtc", "json.optString(\"endDateUtc\")");
        Date dateA2 = strG2 != null ? com.salesforce.marketingcloud.internal.m.a(strG2) : null;
        String strG3 = androidx.databinding.f.g(json, "modifiedDateUtc", "json.optString(\"modifiedDateUtc\")");
        Date dateA3 = strG3 != null ? com.salesforce.marketingcloud.internal.m.a(strG3) : null;
        int iOptInt2 = json.optInt("displayLimit", 1);
        String string3 = json.getString("type");
        Intrinsics.checkNotNullExpressionValue(string3, "json.getString(\"type\")");
        Type typeValueOf = Type.valueOf(string3);
        String strG4 = androidx.databinding.f.g(json, "windowColor", "json.optString(\"windowColor\")");
        long jOptLong = json.optLong("displayDuration", -1L);
        String strG5 = androidx.databinding.f.g(json, "backgroundColor", "json.optString(\"backgroundColor\")");
        Size size = Size.s;
        String strG6 = androidx.databinding.f.g(json, "borderWidth", "optString(name)");
        if (strG6 != null) {
            sizeValueOf = Size.valueOf(strG6);
            sizeValueOf2 = size;
        } else {
            sizeValueOf = size;
            sizeValueOf2 = sizeValueOf;
        }
        Size size2 = sizeValueOf;
        String strG7 = androidx.databinding.f.g(json, "borderColor", "json.optString(\"borderColor\")");
        String strG8 = androidx.databinding.f.g(json, "cornerRadius", "optString(name)");
        sizeValueOf2 = strG8 != null ? Size.valueOf(strG8) : sizeValueOf2;
        LayoutOrder layoutOrderValueOf = LayoutOrder.ImageTitleBody;
        String strG9 = androidx.databinding.f.g(json, "layoutOrder", "optString(name)");
        layoutOrderValueOf = strG9 != null ? LayoutOrder.valueOf(strG9) : layoutOrderValueOf;
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
        Media mediaB = jSONObjectOptJSONObject != null ? h.b(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("title");
        TextField textFieldC = jSONObjectOptJSONObject2 != null ? h.c(jSONObjectOptJSONObject2) : null;
        JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("body");
        TextField textFieldC2 = jSONObjectOptJSONObject3 != null ? h.c(jSONObjectOptJSONObject3) : null;
        JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("closeButton");
        CloseButton closeButtonA = jSONObjectOptJSONObject4 != null ? h.a(jSONObjectOptJSONObject4) : null;
        ButtonConfig buttonConfigValueOf = ButtonConfig.twoUp;
        String strG10 = androidx.databinding.f.g(json, "buttonConfiguration", "optString(name)");
        buttonConfigValueOf = strG10 != null ? ButtonConfig.valueOf(strG10) : buttonConfigValueOf;
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("buttons");
        this(string, string2, iOptInt, dateA, dateA2, dateA3, iOptInt2, typeValueOf, strG4, jOptLong, strG5, size2, strG7, sizeValueOf2, layoutOrderValueOf, mediaB, textFieldC, textFieldC2, closeButtonA, buttonConfigValueOf, jSONArrayOptJSONArray != null ? h.a(jSONArrayOptJSONArray) : null, json.optInt("messageDelaySec", 0), json.optBoolean("displayLimitOverride", false));
    }
}
