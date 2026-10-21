package com.salesforce.marketingcloud;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.n1;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cellscore.helper.WebHelperKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mypinpad.tsdk.isolation.y2;
import com.salesforce.marketingcloud.notifications.NotificationCustomizationOptions;
import com.salesforce.marketingcloud.proximity.ProximityNotificationCustomizationOptions;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleConfig;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002YZB§\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0000H\u0001¢\u0006\u0002\b$J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0012HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000e\u0010.\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b3J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003JÏ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\r\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0002\b=J\u0013\u0010>\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010?HÖ\u0003J\r\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\b@J\t\u0010A\u001a\u00020BHÖ\u0001J\r\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\bCJ \u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0016J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bLJ\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\bMJ\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bNJ\r\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\bOJ\r\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0002\bPJ\r\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0002\bQJ\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\bRJ\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bSJ\u0006\u0010T\u001a\u00020UJ\t\u0010V\u001a\u00020\u0003HÖ\u0001J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\bWJ\r\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0002\bXR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001bR\u0013\u0010\u000f\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0013\u0010\n\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001cR\u0013\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0013\u0010\u000e\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u0011\u001a\u00020\u00128\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0013\u0010\f\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0016\u0010\u0019\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001bR\u0013\u0010\r\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001bR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001fR\u0013\u0010\u0010\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001c¨\u0006["}, d2 = {"Lcom/salesforce/marketingcloud/MarketingCloudConfig;", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;", "applicationId", "", "accessToken", "senderId", "marketingCloudServerUrl", EventDataKeys.Identity.VISITOR_ID_MID, "analyticsEnabled", "", "geofencingEnabled", "inboxEnabled", "piAnalyticsEnabled", "proximityEnabled", "markMessageReadOnInboxNotificationOpen", "delayRegistrationUntilContactKeyIsSet", "useLegacyPiIdentifier", "notificationCustomizationOptions", "Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "proximityNotificationCustomizationOptions", "Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;", "urlHandler", "Lcom/salesforce/marketingcloud/UrlHandler;", "appPackageName", "appVersionName", "predictiveIntelligenceServerUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;Lcom/salesforce/marketingcloud/UrlHandler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "()Z", "()Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "()Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;", "()Lcom/salesforce/marketingcloud/UrlHandler;", "-deprecated_accessToken", "-deprecated_analyticsEnabled", "applicationChanged", "other", "-applicationChanged", "-deprecated_applicationId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component17$sdk_release", "component18", "component18$sdk_release", "component19", "component19$sdk_release", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "-deprecated_delayRegistrationUntilContactKeyIsSet", "equals", "", "-deprecated_geofencingEnabled", GenerateActivationFormCommand.HASH_CODE, "", "-deprecated_inboxEnabled", "init", "", "context", "Landroid/content/Context;", "components", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkComponents;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyListener;", "-deprecated_markMessageReadOnInboxNotificationOpen", "-deprecated_marketingCloudServerUrl", "-deprecated_mid", "-deprecated_notificationCustomizationOptions", "-deprecated_piAnalyticsEnabled", "-deprecated_proximityEnabled", "-deprecated_proximityNotificationCustomizationOptions", "-deprecated_senderId", "toBuilder", "Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "toString", "-deprecated_urlHandler", "-deprecated_useLegacyPiIdentifier", "Builder", "Companion", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MarketingCloudConfig extends PushModuleConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = g.a("MarketingCloudConfig");

    @NotNull
    private final String accessToken;
    private final boolean analyticsEnabled;

    @NotNull
    private final String appPackageName;

    @NotNull
    private final String appVersionName;

    @NotNull
    private final String applicationId;
    private final boolean delayRegistrationUntilContactKeyIsSet;
    private final boolean geofencingEnabled;
    private final boolean inboxEnabled;
    private final boolean markMessageReadOnInboxNotificationOpen;

    @NotNull
    private final String marketingCloudServerUrl;

    @Nullable
    private final String mid;

    @NotNull
    private final NotificationCustomizationOptions notificationCustomizationOptions;
    private final boolean piAnalyticsEnabled;

    @NotNull
    private final String predictiveIntelligenceServerUrl;
    private final boolean proximityEnabled;

    @Nullable
    private final ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions;

    @Nullable
    private final String senderId;

    @Nullable
    private final UrlHandler urlHandler;
    private final boolean useLegacyPiIdentifier;

    @MCKeep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001CB\t\b\u0010¢\u0006\u0004\b>\u0010?B\u0011\b\u0010\u0012\u0006\u0010@\u001a\u000201¢\u0006\u0004\b>\u0010AJ#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0082\bJ!\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0082\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020#J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0012J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0012J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0002H\u0007¢\u0006\u0004\b,\u0010-J\u000e\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00103R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00103R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00103R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00103R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00104R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00104R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00104R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00104R\u0018\u00108\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010<R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103¨\u0006D"}, d2 = {"Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "", "", "value", "Lkotlin/Function0;", "lazyMessage", "checkNotEmpty", "checkNotNullOrEmpty", "applicationId", "setApplicationId", "accessToken", "setAccessToken", "senderId", "setSenderId", "marketingCloudServerUrl", "setMarketingCloudServerUrl", EventDataKeys.Identity.VISITOR_ID_MID, "setMid", "", "analyticsEnabled", "setAnalyticsEnabled", "geofenceEnabled", "setGeofencingEnabled", "inboxEnabled", "setInboxEnabled", "piAnalyticsEnabled", "setPiAnalyticsEnabled", "proximityEnabled", "setProximityEnabled", "Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;", "options", "setProximityNotificationOptions", "Lcom/salesforce/marketingcloud/UrlHandler;", "urlHandler", "setUrlHandler", "Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "setNotificationCustomizationOptions", "useLegacyPiIdentifier", "setUseLegacyPiIdentifier", "markRead", "setMarkMessageReadOnInboxNotificationOpen", "delay", "setDelayRegistrationUntilContactKeyIsSet", "url", "-setPredictiveIntelligenceServerUrl", "(Ljava/lang/String;)Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "setPredictiveIntelligenceServerUrl", "Landroid/content/Context;", "context", "Lcom/salesforce/marketingcloud/MarketingCloudConfig;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Ljava/lang/String;", "Z", "geofencingEnabled", "markMessageReadOnInboxNotificationOpen", "delayRegistrationUntilContactKeyIsSet", "notificationCustomizationOptions", "Lcom/salesforce/marketingcloud/notifications/NotificationCustomizationOptions;", "proximityNotificationCustomizationOptions", "Lcom/salesforce/marketingcloud/proximity/ProximityNotificationCustomizationOptions;", "Lcom/salesforce/marketingcloud/UrlHandler;", "predictiveIntelligenceServerUrl", "<init>", "()V", "config", "(Lcom/salesforce/marketingcloud/MarketingCloudConfig;)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMarketingCloudConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketingCloudConfig.kt\ncom/salesforce/marketingcloud/MarketingCloudConfig$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,485:1\n476#1,5:487\n467#1,5:492\n467#1,5:497\n1#2:486\n*S KotlinDebug\n*F\n+ 1 MarketingCloudConfig.kt\ncom/salesforce/marketingcloud/MarketingCloudConfig$Builder\n*L\n427#1:487,5\n446#1:492,5\n448#1:497,5\n*E\n"})
    public static final class Builder {
        private static final int ACCESS_TOKEN_LENGTH = 24;

        @NotNull
        private static final String INITIAL_PI_VALUE = "";

        @NotNull
        private static final String TSE_ERROR_MSG = "An App Endpoint (the Marketing Cloud Server URL) is required in order to configure the SDK. See http://salesforce-marketingcloud.github.io/MarketingCloudSDK-Android for more information.";

        @Nullable
        private String accessToken;
        private boolean analyticsEnabled;

        @Nullable
        private String applicationId;
        private boolean delayRegistrationUntilContactKeyIsSet;
        private boolean geofencingEnabled;
        private boolean inboxEnabled;
        private boolean markMessageReadOnInboxNotificationOpen;

        @Nullable
        private String marketingCloudServerUrl;

        @Nullable
        private String mid;

        @Nullable
        private NotificationCustomizationOptions notificationCustomizationOptions;
        private boolean piAnalyticsEnabled;

        @NotNull
        private String predictiveIntelligenceServerUrl;
        private boolean proximityEnabled;

        @Nullable
        private ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions;

        @Nullable
        private String senderId;

        @Nullable
        private UrlHandler urlHandler;
        private boolean useLegacyPiIdentifier;

        @NotNull
        private static final Regex APP_ID_REGEX = new Regex("[0-9a-f]{8}-[a-f0-9]{4}-4[a-f0-9]{3}-[89aAbB][a-f0-9]{3}-[a-f0-9]{12}");

        public Builder() {
            this.markMessageReadOnInboxNotificationOpen = true;
            this.useLegacyPiIdentifier = true;
            this.predictiveIntelligenceServerUrl = "";
        }

        private final String checkNotEmpty(String value, Function0<? extends Object> lazyMessage) {
            if (value == null || TextUtils.getTrimmedLength(value) != 0) {
                return value;
            }
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }

        private final String checkNotNullOrEmpty(String value, Function0<? extends Object> lazyMessage) {
            if (value == null || TextUtils.getTrimmedLength(value) == 0) {
                throw new IllegalStateException(lazyMessage.invoke().toString());
            }
            return value;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @JvmName(name = "-setPredictiveIntelligenceServerUrl")
        @NotNull
        /* JADX INFO: renamed from: -setPredictiveIntelligenceServerUrl, reason: not valid java name */
        public final Builder m5327setPredictiveIntelligenceServerUrl(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.predictiveIntelligenceServerUrl = url;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0092  */
        @NotNull
        public final MarketingCloudConfig build(@NotNull Context context) {
            String str;
            String strF;
            Intrinsics.checkNotNullParameter(context, "context");
            String packageName = context.getPackageName();
            try {
                String str2 = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
                str = str2 == null ? AbstractJsonLexerKt.NULL : str2;
            } catch (Exception unused) {
            }
            String str3 = this.applicationId;
            if (str3 == null) {
                throw new IllegalStateException("applicationId == null".toString());
            }
            Locale locale = Locale.ENGLISH;
            if (!APP_ID_REGEX.matches(androidx.room.a.d(locale, "ENGLISH", str3, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                throw new IllegalArgumentException("The applicationId is not a valid UUID.".toString());
            }
            String str4 = this.accessToken;
            if (str4 == null) {
                throw new IllegalStateException("accessToken == null".toString());
            }
            if (str4.length() != 24) {
                throw new IllegalArgumentException("The accessToken must be 24 characters.".toString());
            }
            String str5 = this.marketingCloudServerUrl;
            if (str5 == null || TextUtils.getTrimmedLength(str5) == 0) {
                throw new IllegalStateException(TSE_ERROR_MSG.toString());
            }
            if (!URLUtil.isNetworkUrl(str5)) {
                throw new IllegalArgumentException(TSE_ERROR_MSG.toString());
            }
            if (Intrinsics.areEqual(this.predictiveIntelligenceServerUrl, "")) {
                String str6 = this.mid;
                if (str6 == null) {
                    strF = "https://app.igodigital.com/api/v1/collect/process_batch";
                } else {
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) androidx.room.a.d(locale, "ENGLISH", str6, locale, "this as java.lang.String).toLowerCase(locale)"), Constant.DASH_STRING, 0, false, 6, (Object) null);
                    this.mid = iIndexOf$default != -1 ? str6.subSequence(0, iIndexOf$default).toString() : str6;
                    strF = ad.d.f(ci.a.d(WebHelperKt.HTTPS_PROTOCOL, str6, ".collect.igodigital.com/c2/"), this.mid, "/process_batch.json");
                    if (strF == null) {
                        strF = "https://app.igodigital.com/api/v1/collect/process_batch";
                    }
                }
                this.predictiveIntelligenceServerUrl = strF;
            }
            String str7 = this.senderId;
            if (str7 != null && TextUtils.getTrimmedLength(str7) == 0) {
                throw new IllegalStateException("The senderId cannot be empty.".toString());
            }
            String str8 = this.mid;
            if (str8 != null && TextUtils.getTrimmedLength(str8) == 0) {
                throw new IllegalStateException("MID must not be empty.".toString());
            }
            boolean z10 = this.analyticsEnabled;
            boolean z11 = this.geofencingEnabled;
            boolean z12 = this.inboxEnabled;
            boolean z13 = this.piAnalyticsEnabled;
            boolean z14 = this.proximityEnabled;
            boolean z15 = this.markMessageReadOnInboxNotificationOpen;
            boolean z16 = this.delayRegistrationUntilContactKeyIsSet;
            boolean z17 = this.useLegacyPiIdentifier;
            NotificationCustomizationOptions notificationCustomizationOptions = this.notificationCustomizationOptions;
            if (notificationCustomizationOptions == null) {
                throw new IllegalStateException("notificationCustomizationOptions == null".toString());
            }
            UrlHandler urlHandler = this.urlHandler;
            String str9 = this.predictiveIntelligenceServerUrl;
            ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions = this.proximityNotificationCustomizationOptions;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            return new MarketingCloudConfig(str3, str4, str7, str5, str8, z10, z11, z12, z13, z14, z15, z16, z17, notificationCustomizationOptions, proximityNotificationCustomizationOptions, urlHandler, packageName, str, str9);
        }

        @NotNull
        public final Builder setAccessToken(@NotNull String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        @NotNull
        public final Builder setAnalyticsEnabled(boolean analyticsEnabled) {
            this.analyticsEnabled = analyticsEnabled;
            return this;
        }

        @NotNull
        public final Builder setApplicationId(@NotNull String applicationId) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            this.applicationId = applicationId;
            return this;
        }

        @NotNull
        public final Builder setDelayRegistrationUntilContactKeyIsSet(boolean delay) {
            this.delayRegistrationUntilContactKeyIsSet = delay;
            return this;
        }

        @NotNull
        public final Builder setGeofencingEnabled(boolean geofenceEnabled) {
            this.geofencingEnabled = geofenceEnabled;
            return this;
        }

        @NotNull
        public final Builder setInboxEnabled(boolean inboxEnabled) {
            this.inboxEnabled = inboxEnabled;
            return this;
        }

        @NotNull
        public final Builder setMarkMessageReadOnInboxNotificationOpen(boolean markRead) {
            this.markMessageReadOnInboxNotificationOpen = markRead;
            return this;
        }

        @NotNull
        public final Builder setMarketingCloudServerUrl(@NotNull String marketingCloudServerUrl) {
            Intrinsics.checkNotNullParameter(marketingCloudServerUrl, "marketingCloudServerUrl");
            this.marketingCloudServerUrl = marketingCloudServerUrl;
            return this;
        }

        @NotNull
        public final Builder setMid(@NotNull String mid) {
            Intrinsics.checkNotNullParameter(mid, "mid");
            this.mid = mid;
            return this;
        }

        @NotNull
        public final Builder setNotificationCustomizationOptions(@NotNull NotificationCustomizationOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.notificationCustomizationOptions = options;
            return this;
        }

        @NotNull
        public final Builder setPiAnalyticsEnabled(boolean piAnalyticsEnabled) {
            this.piAnalyticsEnabled = piAnalyticsEnabled;
            return this;
        }

        @NotNull
        public final Builder setProximityEnabled(boolean proximityEnabled) {
            this.proximityEnabled = proximityEnabled;
            return this;
        }

        @NotNull
        public final Builder setProximityNotificationOptions(@NotNull ProximityNotificationCustomizationOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.proximityNotificationCustomizationOptions = options;
            return this;
        }

        @NotNull
        public final Builder setSenderId(@NotNull String senderId) {
            Intrinsics.checkNotNullParameter(senderId, "senderId");
            this.senderId = senderId;
            return this;
        }

        @NotNull
        public final Builder setUrlHandler(@NotNull UrlHandler urlHandler) {
            Intrinsics.checkNotNullParameter(urlHandler, "urlHandler");
            this.urlHandler = urlHandler;
            return this;
        }

        @NotNull
        public final Builder setUseLegacyPiIdentifier(boolean useLegacyPiIdentifier) {
            this.useLegacyPiIdentifier = useLegacyPiIdentifier;
            return this;
        }

        public Builder(@NotNull MarketingCloudConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.markMessageReadOnInboxNotificationOpen = true;
            this.useLegacyPiIdentifier = true;
            this.applicationId = config.applicationId();
            this.accessToken = config.accessToken();
            this.senderId = config.senderId();
            this.marketingCloudServerUrl = config.marketingCloudServerUrl();
            this.mid = config.mid();
            this.analyticsEnabled = config.analyticsEnabled();
            this.geofencingEnabled = config.geofencingEnabled();
            this.inboxEnabled = config.inboxEnabled();
            this.piAnalyticsEnabled = config.piAnalyticsEnabled();
            this.proximityEnabled = config.proximityEnabled();
            this.markMessageReadOnInboxNotificationOpen = config.markMessageReadOnInboxNotificationOpen();
            this.delayRegistrationUntilContactKeyIsSet = config.delayRegistrationUntilContactKeyIsSet();
            this.useLegacyPiIdentifier = config.useLegacyPiIdentifier();
            this.notificationCustomizationOptions = config.notificationCustomizationOptions();
            this.proximityNotificationCustomizationOptions = config.proximityNotificationCustomizationOptions();
            this.urlHandler = config.urlHandler();
            this.predictiveIntelligenceServerUrl = config.predictiveIntelligenceServerUrl();
        }
    }

    @MCKeep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/salesforce/marketingcloud/MarketingCloudConfig$Companion;", "", "()V", "TAG", "", "builder", "Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InitializationStatus f63753a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InitializationStatus initializationStatus) {
            super(0);
            this.f63753a = initializationStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "InitializationStatus: " + this.f63753a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingCloudConfig(@NotNull String applicationId, @NotNull String accessToken, @Nullable String str, @NotNull String marketingCloudServerUrl, @Nullable String str2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, @NotNull NotificationCustomizationOptions notificationCustomizationOptions, @Nullable ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions, @Nullable UrlHandler urlHandler, @NotNull String appPackageName, @NotNull String appVersionName, @NotNull String predictiveIntelligenceServerUrl) {
        super(applicationId);
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(marketingCloudServerUrl, "marketingCloudServerUrl");
        Intrinsics.checkNotNullParameter(notificationCustomizationOptions, "notificationCustomizationOptions");
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        Intrinsics.checkNotNullParameter(appVersionName, "appVersionName");
        Intrinsics.checkNotNullParameter(predictiveIntelligenceServerUrl, "predictiveIntelligenceServerUrl");
        this.applicationId = applicationId;
        this.accessToken = accessToken;
        this.senderId = str;
        this.marketingCloudServerUrl = marketingCloudServerUrl;
        this.mid = str2;
        this.analyticsEnabled = z10;
        this.geofencingEnabled = z11;
        this.inboxEnabled = z12;
        this.piAnalyticsEnabled = z13;
        this.proximityEnabled = z14;
        this.markMessageReadOnInboxNotificationOpen = z15;
        this.delayRegistrationUntilContactKeyIsSet = z16;
        this.useLegacyPiIdentifier = z17;
        this.notificationCustomizationOptions = notificationCustomizationOptions;
        this.proximityNotificationCustomizationOptions = proximityNotificationCustomizationOptions;
        this.urlHandler = urlHandler;
        this.appPackageName = appPackageName;
        this.appVersionName = appVersionName;
        this.predictiveIntelligenceServerUrl = predictiveIntelligenceServerUrl;
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(ModuleReadyListener listener, InitializationStatus it) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(it, "it");
        g.e(g.f64223a, TAG, null, new a(it), 2, null);
        MarketingCloudSdk.requestSdk(new com.appsflyer.internal.a(listener, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1$lambda$0(ModuleReadyListener listener, MarketingCloudSdk sdk) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        listener.ready(sdk);
    }

    @JvmName(name = "-applicationChanged")
    /* JADX INFO: renamed from: -applicationChanged, reason: not valid java name */
    public final boolean m5310applicationChanged(@NotNull MarketingCloudConfig other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (Intrinsics.areEqual(this.applicationId, other.applicationId) && Intrinsics.areEqual(this.accessToken, other.accessToken)) ? false : true;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "accessToken", imports = {}))
    @JvmName(name = "-deprecated_accessToken")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_accessToken, reason: not valid java name and from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "analyticsEnabled", imports = {}))
    @JvmName(name = "-deprecated_analyticsEnabled")
    /* JADX INFO: renamed from: -deprecated_analyticsEnabled, reason: not valid java name and from getter */
    public final boolean getAnalyticsEnabled() {
        return this.analyticsEnabled;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "applicationId", imports = {}))
    @JvmName(name = "-deprecated_applicationId")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_applicationId, reason: not valid java name and from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delayRegistrationUntilContactKeyIsSet", imports = {}))
    @JvmName(name = "-deprecated_delayRegistrationUntilContactKeyIsSet")
    /* JADX INFO: renamed from: -deprecated_delayRegistrationUntilContactKeyIsSet, reason: not valid java name and from getter */
    public final boolean getDelayRegistrationUntilContactKeyIsSet() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "geofencingEnabled", imports = {}))
    @JvmName(name = "-deprecated_geofencingEnabled")
    /* JADX INFO: renamed from: -deprecated_geofencingEnabled, reason: not valid java name and from getter */
    public final boolean getGeofencingEnabled() {
        return this.geofencingEnabled;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "inboxEnabled", imports = {}))
    @JvmName(name = "-deprecated_inboxEnabled")
    /* JADX INFO: renamed from: -deprecated_inboxEnabled, reason: not valid java name and from getter */
    public final boolean getInboxEnabled() {
        return this.inboxEnabled;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "markMessageReadOnInboxNotificationOpen", imports = {}))
    @JvmName(name = "-deprecated_markMessageReadOnInboxNotificationOpen")
    /* JADX INFO: renamed from: -deprecated_markMessageReadOnInboxNotificationOpen, reason: not valid java name and from getter */
    public final boolean getMarkMessageReadOnInboxNotificationOpen() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "marketingCloudServerUrl", imports = {}))
    @JvmName(name = "-deprecated_marketingCloudServerUrl")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_marketingCloudServerUrl, reason: not valid java name and from getter */
    public final String getMarketingCloudServerUrl() {
        return this.marketingCloudServerUrl;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = EventDataKeys.Identity.VISITOR_ID_MID, imports = {}))
    @JvmName(name = "-deprecated_mid")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_mid, reason: not valid java name and from getter */
    public final String getMid() {
        return this.mid;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "notificationCustomizationOptions", imports = {}))
    @JvmName(name = "-deprecated_notificationCustomizationOptions")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_notificationCustomizationOptions, reason: not valid java name and from getter */
    public final NotificationCustomizationOptions getNotificationCustomizationOptions() {
        return this.notificationCustomizationOptions;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "piAnalyticsEnabled", imports = {}))
    @JvmName(name = "-deprecated_piAnalyticsEnabled")
    /* JADX INFO: renamed from: -deprecated_piAnalyticsEnabled, reason: not valid java name and from getter */
    public final boolean getPiAnalyticsEnabled() {
        return this.piAnalyticsEnabled;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proximityEnabled", imports = {}))
    @JvmName(name = "-deprecated_proximityEnabled")
    /* JADX INFO: renamed from: -deprecated_proximityEnabled, reason: not valid java name and from getter */
    public final boolean getProximityEnabled() {
        return this.proximityEnabled;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proximityNotificationCustomizationOptions", imports = {}))
    @JvmName(name = "-deprecated_proximityNotificationCustomizationOptions")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_proximityNotificationCustomizationOptions, reason: not valid java name and from getter */
    public final ProximityNotificationCustomizationOptions getProximityNotificationCustomizationOptions() {
        return this.proximityNotificationCustomizationOptions;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "senderId", imports = {}))
    @JvmName(name = "-deprecated_senderId")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_senderId, reason: not valid java name and from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "urlHandler", imports = {}))
    @JvmName(name = "-deprecated_urlHandler")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_urlHandler, reason: not valid java name and from getter */
    public final UrlHandler getUrlHandler() {
        return this.urlHandler;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "useLegacyPiIdentifier", imports = {}))
    @JvmName(name = "-deprecated_useLegacyPiIdentifier")
    /* JADX INFO: renamed from: -deprecated_useLegacyPiIdentifier, reason: not valid java name and from getter */
    public final boolean getUseLegacyPiIdentifier() {
        return this.useLegacyPiIdentifier;
    }

    @JvmName(name = "accessToken")
    @NotNull
    public final String accessToken() {
        return this.accessToken;
    }

    @JvmName(name = "analyticsEnabled")
    public final boolean analyticsEnabled() {
        return this.analyticsEnabled;
    }

    @JvmName(name = "appPackageName")
    @NotNull
    /* JADX INFO: renamed from: appPackageName, reason: from getter */
    public final String getAppPackageName() {
        return this.appPackageName;
    }

    @JvmName(name = "appVersionName")
    @NotNull
    /* JADX INFO: renamed from: appVersionName, reason: from getter */
    public final String getAppVersionName() {
        return this.appVersionName;
    }

    @JvmName(name = "applicationId")
    @NotNull
    public final String applicationId() {
        return this.applicationId;
    }

    @NotNull
    public final String component1() {
        return this.applicationId;
    }

    public final boolean component10() {
        return this.proximityEnabled;
    }

    public final boolean component11() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    public final boolean component12() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    public final boolean component13() {
        return this.useLegacyPiIdentifier;
    }

    @NotNull
    public final NotificationCustomizationOptions component14() {
        return this.notificationCustomizationOptions;
    }

    @Nullable
    public final ProximityNotificationCustomizationOptions component15() {
        return this.proximityNotificationCustomizationOptions;
    }

    @Nullable
    public final UrlHandler component16() {
        return this.urlHandler;
    }

    @NotNull
    public final String component17$sdk_release() {
        return this.appPackageName;
    }

    @NotNull
    public final String component18$sdk_release() {
        return this.appVersionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component19$sdk_release, reason: from getter */
    public final String getPredictiveIntelligenceServerUrl() {
        return this.predictiveIntelligenceServerUrl;
    }

    @NotNull
    public final String component2() {
        return this.accessToken;
    }

    @Nullable
    public final String component3() {
        return this.senderId;
    }

    @NotNull
    public final String component4() {
        return this.marketingCloudServerUrl;
    }

    @Nullable
    public final String component5() {
        return this.mid;
    }

    public final boolean component6() {
        return this.analyticsEnabled;
    }

    public final boolean component7() {
        return this.geofencingEnabled;
    }

    public final boolean component8() {
        return this.inboxEnabled;
    }

    public final boolean component9() {
        return this.piAnalyticsEnabled;
    }

    @NotNull
    public final MarketingCloudConfig copy(@NotNull String applicationId, @NotNull String accessToken, @Nullable String senderId, @NotNull String marketingCloudServerUrl, @Nullable String mid, boolean analyticsEnabled, boolean geofencingEnabled, boolean inboxEnabled, boolean piAnalyticsEnabled, boolean proximityEnabled, boolean markMessageReadOnInboxNotificationOpen, boolean delayRegistrationUntilContactKeyIsSet, boolean useLegacyPiIdentifier, @NotNull NotificationCustomizationOptions notificationCustomizationOptions, @Nullable ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions, @Nullable UrlHandler urlHandler, @NotNull String appPackageName, @NotNull String appVersionName, @NotNull String predictiveIntelligenceServerUrl) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(marketingCloudServerUrl, "marketingCloudServerUrl");
        Intrinsics.checkNotNullParameter(notificationCustomizationOptions, "notificationCustomizationOptions");
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        Intrinsics.checkNotNullParameter(appVersionName, "appVersionName");
        Intrinsics.checkNotNullParameter(predictiveIntelligenceServerUrl, "predictiveIntelligenceServerUrl");
        return new MarketingCloudConfig(applicationId, accessToken, senderId, marketingCloudServerUrl, mid, analyticsEnabled, geofencingEnabled, inboxEnabled, piAnalyticsEnabled, proximityEnabled, markMessageReadOnInboxNotificationOpen, delayRegistrationUntilContactKeyIsSet, useLegacyPiIdentifier, notificationCustomizationOptions, proximityNotificationCustomizationOptions, urlHandler, appPackageName, appVersionName, predictiveIntelligenceServerUrl);
    }

    @JvmName(name = "delayRegistrationUntilContactKeyIsSet")
    public final boolean delayRegistrationUntilContactKeyIsSet() {
        return this.delayRegistrationUntilContactKeyIsSet;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketingCloudConfig)) {
            return false;
        }
        MarketingCloudConfig marketingCloudConfig = (MarketingCloudConfig) other;
        return Intrinsics.areEqual(this.applicationId, marketingCloudConfig.applicationId) && Intrinsics.areEqual(this.accessToken, marketingCloudConfig.accessToken) && Intrinsics.areEqual(this.senderId, marketingCloudConfig.senderId) && Intrinsics.areEqual(this.marketingCloudServerUrl, marketingCloudConfig.marketingCloudServerUrl) && Intrinsics.areEqual(this.mid, marketingCloudConfig.mid) && this.analyticsEnabled == marketingCloudConfig.analyticsEnabled && this.geofencingEnabled == marketingCloudConfig.geofencingEnabled && this.inboxEnabled == marketingCloudConfig.inboxEnabled && this.piAnalyticsEnabled == marketingCloudConfig.piAnalyticsEnabled && this.proximityEnabled == marketingCloudConfig.proximityEnabled && this.markMessageReadOnInboxNotificationOpen == marketingCloudConfig.markMessageReadOnInboxNotificationOpen && this.delayRegistrationUntilContactKeyIsSet == marketingCloudConfig.delayRegistrationUntilContactKeyIsSet && this.useLegacyPiIdentifier == marketingCloudConfig.useLegacyPiIdentifier && Intrinsics.areEqual(this.notificationCustomizationOptions, marketingCloudConfig.notificationCustomizationOptions) && Intrinsics.areEqual(this.proximityNotificationCustomizationOptions, marketingCloudConfig.proximityNotificationCustomizationOptions) && Intrinsics.areEqual(this.urlHandler, marketingCloudConfig.urlHandler) && Intrinsics.areEqual(this.appPackageName, marketingCloudConfig.appPackageName) && Intrinsics.areEqual(this.appVersionName, marketingCloudConfig.appVersionName) && Intrinsics.areEqual(this.predictiveIntelligenceServerUrl, marketingCloudConfig.predictiveIntelligenceServerUrl);
    }

    @JvmName(name = "geofencingEnabled")
    public final boolean geofencingEnabled() {
        return this.geofencingEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        int iC = n1.c(this.accessToken, this.applicationId.hashCode() * 31, 31);
        String str = this.senderId;
        int iC2 = n1.c(this.marketingCloudServerUrl, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.mid;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z10 = this.analyticsEnabled;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        boolean z11 = this.geofencingEnabled;
        ?? r4 = z11;
        if (z11) {
            r4 = 1;
        }
        int i11 = (i10 + r4) * 31;
        boolean z12 = this.inboxEnabled;
        ?? r10 = z12;
        if (z12) {
            r10 = 1;
        }
        int i12 = (i11 + r10) * 31;
        boolean z13 = this.piAnalyticsEnabled;
        ?? r11 = z13;
        if (z13) {
            r11 = 1;
        }
        int i13 = (i12 + r11) * 31;
        boolean z14 = this.proximityEnabled;
        ?? r12 = z14;
        if (z14) {
            r12 = 1;
        }
        int i14 = (i13 + r12) * 31;
        boolean z15 = this.markMessageReadOnInboxNotificationOpen;
        ?? r13 = z15;
        if (z15) {
            r13 = 1;
        }
        int i15 = (i14 + r13) * 31;
        boolean z16 = this.delayRegistrationUntilContactKeyIsSet;
        ?? r14 = z16;
        if (z16) {
            r14 = 1;
        }
        int i16 = (i15 + r14) * 31;
        boolean z17 = this.useLegacyPiIdentifier;
        int iHashCode2 = (this.notificationCustomizationOptions.hashCode() + ((i16 + (z17 ? 1 : z17)) * 31)) * 31;
        ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions = this.proximityNotificationCustomizationOptions;
        int iHashCode3 = (iHashCode2 + (proximityNotificationCustomizationOptions == null ? 0 : proximityNotificationCustomizationOptions.hashCode())) * 31;
        UrlHandler urlHandler = this.urlHandler;
        return this.predictiveIntelligenceServerUrl.hashCode() + n1.c(this.appVersionName, n1.c(this.appPackageName, (iHashCode3 + (urlHandler != null ? urlHandler.hashCode() : 0)) * 31, 31), 31);
    }

    @JvmName(name = "inboxEnabled")
    public final boolean inboxEnabled() {
        return this.inboxEnabled;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.Config
    public void init(@NotNull Context context, @NotNull SFMCSdkComponents components, @NotNull ModuleReadyListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(listener, "listener");
        MarketingCloudSdk.b(context, this, components, new wf.b(listener));
    }

    @JvmName(name = "markMessageReadOnInboxNotificationOpen")
    public final boolean markMessageReadOnInboxNotificationOpen() {
        return this.markMessageReadOnInboxNotificationOpen;
    }

    @JvmName(name = "marketingCloudServerUrl")
    @NotNull
    public final String marketingCloudServerUrl() {
        return this.marketingCloudServerUrl;
    }

    @JvmName(name = EventDataKeys.Identity.VISITOR_ID_MID)
    @Nullable
    public final String mid() {
        return this.mid;
    }

    @JvmName(name = "notificationCustomizationOptions")
    @NotNull
    public final NotificationCustomizationOptions notificationCustomizationOptions() {
        return this.notificationCustomizationOptions;
    }

    @JvmName(name = "piAnalyticsEnabled")
    public final boolean piAnalyticsEnabled() {
        return this.piAnalyticsEnabled;
    }

    @JvmName(name = "predictiveIntelligenceServerUrl")
    @NotNull
    public final String predictiveIntelligenceServerUrl() {
        return this.predictiveIntelligenceServerUrl;
    }

    @JvmName(name = "proximityEnabled")
    public final boolean proximityEnabled() {
        return this.proximityEnabled;
    }

    @JvmName(name = "proximityNotificationCustomizationOptions")
    @Nullable
    public final ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions() {
        return this.proximityNotificationCustomizationOptions;
    }

    @JvmName(name = "senderId")
    @Nullable
    public final String senderId() {
        return this.senderId;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MarketingCloudConfig(applicationId=");
        sb2.append(this.applicationId);
        sb2.append(", accessToken=");
        sb2.append(this.accessToken);
        sb2.append(", senderId=");
        sb2.append(this.senderId);
        sb2.append(", marketingCloudServerUrl=");
        sb2.append(this.marketingCloudServerUrl);
        sb2.append(", mid=");
        sb2.append(this.mid);
        sb2.append(", analyticsEnabled=");
        sb2.append(this.analyticsEnabled);
        sb2.append(", geofencingEnabled=");
        sb2.append(this.geofencingEnabled);
        sb2.append(", inboxEnabled=");
        sb2.append(this.inboxEnabled);
        sb2.append(", piAnalyticsEnabled=");
        sb2.append(this.piAnalyticsEnabled);
        sb2.append(", proximityEnabled=");
        sb2.append(this.proximityEnabled);
        sb2.append(", markMessageReadOnInboxNotificationOpen=");
        sb2.append(this.markMessageReadOnInboxNotificationOpen);
        sb2.append(", delayRegistrationUntilContactKeyIsSet=");
        sb2.append(this.delayRegistrationUntilContactKeyIsSet);
        sb2.append(", useLegacyPiIdentifier=");
        sb2.append(this.useLegacyPiIdentifier);
        sb2.append(", notificationCustomizationOptions=");
        sb2.append(this.notificationCustomizationOptions);
        sb2.append(", proximityNotificationCustomizationOptions=");
        sb2.append(this.proximityNotificationCustomizationOptions);
        sb2.append(", urlHandler=");
        sb2.append(this.urlHandler);
        sb2.append(", appPackageName=");
        sb2.append(this.appPackageName);
        sb2.append(", appVersionName=");
        sb2.append(this.appVersionName);
        sb2.append(", predictiveIntelligenceServerUrl=");
        return y2.b(sb2, this.predictiveIntelligenceServerUrl, RootService.CLOSE_BRACKET);
    }

    @JvmName(name = "urlHandler")
    @Nullable
    public final UrlHandler urlHandler() {
        return this.urlHandler;
    }

    @JvmName(name = "useLegacyPiIdentifier")
    public final boolean useLegacyPiIdentifier() {
        return this.useLegacyPiIdentifier;
    }
}
