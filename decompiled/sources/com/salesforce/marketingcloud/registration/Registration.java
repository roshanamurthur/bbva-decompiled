package com.salesforce.marketingcloud.registration;

import android.text.TextUtils;
import androidx.camera.camera2.internal.n1;
import bk.p;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.semaas.model.Properties;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.internal.m;
import com.salesforce.marketingcloud.storage.db.k;
import com.veridas.contextualdata.ContextualDataConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B½\u0001\b\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\u0010\u001dJ\r\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0002\b&J\r\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0002\b'J\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001cH\u0007¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b*J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u001aHÆ\u0003J\u0015\u00104\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001cHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\b=Jß\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001cHÆ\u0001J\r\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0002\b?J\u0013\u0010@\u001a\u00020\u000e2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0006HÖ\u0001J\r\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0002\bCJ\r\u0010\u0018\u001a\u00020\bH\u0007¢\u0006\u0002\bDJ\r\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0002\bEJ\r\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0002\bFJ\r\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0002\bGJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\bHJ\r\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0002\bIJ\r\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0002\bJJ\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\bKJ\u000f\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\bLJ\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007¢\u0006\u0002\bMJ\r\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0002\bNJ\r\u0010O\u001a\u00020\u0003H\u0000¢\u0006\u0002\bPJ\t\u0010Q\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0017\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001eR\u0013\u0010\f\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u001f\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001c8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001fR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001eR\u0013\u0010\t\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001eR\u0013\u0010\r\u001a\u00020\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0013\u0010\u0016\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001eR\u001c\u0010\u0005\u001a\u00020\u00068\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0013\u0010\u0018\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001eR\u0013\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0013\u0010\u0015\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001eR\u0013\u0010\u0011\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0013\u0010\u0010\u001a\u00020\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010 R\u0013\u0010\u0012\u001a\u00020\u000e8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 R\u0013\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010%R\u0013\u0010\u0013\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\"¨\u0006R"}, d2 = {"Lcom/salesforce/marketingcloud/registration/Registration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "id", "", "signedString", "", "deviceId", "systemToken", ContextualDataConstants.CD_SDK_VERSION, Properties.APP_VERSION, k.a.f65039f, "", "locationEnabled", "proximityEnabled", "platformVersion", "pushEnabled", "timeZone", "contactKey", k.a.f65035b, k.a.m, "appId", "locale", k.a.f65040g, "", k.a.f65041h, "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;)V", "()Ljava/lang/String;", "()Ljava/util/Map;", "()Z", "-id", "()I", "setId$sdk_release", "(I)V", "()Ljava/util/Set;", "-deprecated_appId", "-deprecated_appVersion", "-deprecated_attributes", "component1", "component1$sdk_release", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "-deprecated_contactKey", "copy", "-deprecated_deviceId", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "-deprecated_hwid", "-deprecated_locale", "-deprecated_locationEnabled", "-deprecated_platform", "-deprecated_platformVersion", "-deprecated_proximityEnabled", "-deprecated_pushEnabled", "-deprecated_sdkVersion", "-deprecated_signedString", "-deprecated_systemToken", "-deprecated_tags", "-deprecated_timeZone", "toJson", "toJson$sdk_release", "toString", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegistration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Registration.kt\ncom/salesforce/marketingcloud/registration/Registration\n+ 2 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n41#2:216\n42#2,8:220\n51#2:229\n1549#3:217\n1620#3,2:218\n1622#3:228\n819#3:230\n847#3,2:231\n*S KotlinDebug\n*F\n+ 1 Registration.kt\ncom/salesforce/marketingcloud/registration/Registration\n*L\n55#1:216\n55#1:220,8\n55#1:229\n55#1:217\n55#1:218,2\n55#1:228\n55#1:230\n55#1:231,2\n*E\n"})
public final /* data */ class Registration {

    @NotNull
    private final String appId;

    @NotNull
    private final String appVersion;

    @NotNull
    private final Map<String, String> attributes;

    @Nullable
    private final String contactKey;

    @NotNull
    private final String deviceId;
    private final boolean dst;

    @NotNull
    private final String hwid;
    private int id;

    @NotNull
    private final String locale;
    private final boolean locationEnabled;

    @NotNull
    private final String platform;

    @NotNull
    private final String platformVersion;
    private final boolean proximityEnabled;
    private final boolean pushEnabled;

    @NotNull
    private final String sdkVersion;

    @Nullable
    private final String signedString;

    @Nullable
    private final String systemToken;

    @NotNull
    private final Set<String> tags;
    private final int timeZone;

    public Registration(int i10, @Nullable String str, @NotNull String deviceId, @Nullable String str2, @NotNull String sdkVersion, @NotNull String appVersion, boolean z10, boolean z11, boolean z12, @NotNull String platformVersion, boolean z13, int i11, @Nullable String str3, @NotNull String platform, @NotNull String hwid, @NotNull String appId, @NotNull String locale, @NotNull Set<String> tags, @NotNull Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(platformVersion, "platformVersion");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(hwid, "hwid");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.id = i10;
        this.signedString = str;
        this.deviceId = deviceId;
        this.systemToken = str2;
        this.sdkVersion = sdkVersion;
        this.appVersion = appVersion;
        this.dst = z10;
        this.locationEnabled = z11;
        this.proximityEnabled = z12;
        this.platformVersion = platformVersion;
        this.pushEnabled = z13;
        this.timeZone = i11;
        this.contactKey = str3;
        this.platform = platform;
        this.hwid = hwid;
        this.appId = appId;
        this.locale = locale;
        this.tags = tags;
        this.attributes = attributes;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "appId", imports = {}))
    @JvmName(name = "-deprecated_appId")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_appId, reason: not valid java name and from getter */
    public final String getAppId() {
        return this.appId;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = Properties.APP_VERSION, imports = {}))
    @JvmName(name = "-deprecated_appVersion")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_appVersion, reason: not valid java name and from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = k.a.f65041h, imports = {}))
    @JvmName(name = "-deprecated_attributes")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_attributes, reason: not valid java name */
    public final Map<String, String> m5486deprecated_attributes() {
        return this.attributes;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "contactKey", imports = {}))
    @JvmName(name = "-deprecated_contactKey")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_contactKey, reason: not valid java name and from getter */
    public final String getContactKey() {
        return this.contactKey;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "deviceId", imports = {}))
    @JvmName(name = "-deprecated_deviceId")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_deviceId, reason: not valid java name and from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = k.a.m, imports = {}))
    @JvmName(name = "-deprecated_hwid")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_hwid, reason: not valid java name and from getter */
    public final String getHwid() {
        return this.hwid;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "locale", imports = {}))
    @JvmName(name = "-deprecated_locale")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_locale, reason: not valid java name and from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "locationEnabled", imports = {}))
    @JvmName(name = "-deprecated_locationEnabled")
    /* JADX INFO: renamed from: -deprecated_locationEnabled, reason: not valid java name and from getter */
    public final boolean getLocationEnabled() {
        return this.locationEnabled;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = k.a.f65035b, imports = {}))
    @JvmName(name = "-deprecated_platform")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_platform, reason: not valid java name and from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "platformVersion", imports = {}))
    @JvmName(name = "-deprecated_platformVersion")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_platformVersion, reason: not valid java name and from getter */
    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proximityEnabled", imports = {}))
    @JvmName(name = "-deprecated_proximityEnabled")
    /* JADX INFO: renamed from: -deprecated_proximityEnabled, reason: not valid java name and from getter */
    public final boolean getProximityEnabled() {
        return this.proximityEnabled;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pushEnabled", imports = {}))
    @JvmName(name = "-deprecated_pushEnabled")
    /* JADX INFO: renamed from: -deprecated_pushEnabled, reason: not valid java name and from getter */
    public final boolean getPushEnabled() {
        return this.pushEnabled;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = ContextualDataConstants.CD_SDK_VERSION, imports = {}))
    @JvmName(name = "-deprecated_sdkVersion")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_sdkVersion, reason: not valid java name and from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "signedString", imports = {}))
    @JvmName(name = "-deprecated_signedString")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_signedString, reason: not valid java name and from getter */
    public final String getSignedString() {
        return this.signedString;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "systemToken", imports = {}))
    @JvmName(name = "-deprecated_systemToken")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_systemToken, reason: not valid java name and from getter */
    public final String getSystemToken() {
        return this.systemToken;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = k.a.f65040g, imports = {}))
    @JvmName(name = "-deprecated_tags")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_tags, reason: not valid java name */
    public final Set<String> m5499deprecated_tags() {
        return this.tags;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "timeZone", imports = {}))
    @JvmName(name = "-deprecated_timeZone")
    /* JADX INFO: renamed from: -deprecated_timeZone, reason: not valid java name and from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    @JvmName(name = "-id")
    /* JADX INFO: renamed from: -id, reason: not valid java name and from getter */
    public final int getId() {
        return this.id;
    }

    @JvmName(name = "appId")
    @NotNull
    public final String appId() {
        return this.appId;
    }

    @JvmName(name = Properties.APP_VERSION)
    @NotNull
    public final String appVersion() {
        return this.appVersion;
    }

    @JvmName(name = k.a.f65041h)
    @NotNull
    public final Map<String, String> attributes() {
        return this.attributes;
    }

    public final int component1$sdk_release() {
        return this.id;
    }

    @NotNull
    public final String component10() {
        return this.platformVersion;
    }

    public final boolean component11() {
        return this.pushEnabled;
    }

    public final int component12() {
        return this.timeZone;
    }

    @Nullable
    public final String component13() {
        return this.contactKey;
    }

    @NotNull
    public final String component14() {
        return this.platform;
    }

    @NotNull
    public final String component15() {
        return this.hwid;
    }

    @NotNull
    public final String component16() {
        return this.appId;
    }

    @NotNull
    public final String component17() {
        return this.locale;
    }

    @NotNull
    public final Set<String> component18() {
        return this.tags;
    }

    @NotNull
    public final Map<String, String> component19() {
        return this.attributes;
    }

    @Nullable
    public final String component2() {
        return this.signedString;
    }

    @NotNull
    public final String component3() {
        return this.deviceId;
    }

    @Nullable
    public final String component4() {
        return this.systemToken;
    }

    @NotNull
    public final String component5() {
        return this.sdkVersion;
    }

    @NotNull
    public final String component6() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDst() {
        return this.dst;
    }

    public final boolean component8() {
        return this.locationEnabled;
    }

    public final boolean component9() {
        return this.proximityEnabled;
    }

    @JvmName(name = "contactKey")
    @Nullable
    public final String contactKey() {
        return this.contactKey;
    }

    @NotNull
    public final Registration copy(int id, @Nullable String signedString, @NotNull String deviceId, @Nullable String systemToken, @NotNull String sdkVersion, @NotNull String appVersion, boolean dst, boolean locationEnabled, boolean proximityEnabled, @NotNull String platformVersion, boolean pushEnabled, int timeZone, @Nullable String contactKey, @NotNull String platform, @NotNull String hwid, @NotNull String appId, @NotNull String locale, @NotNull Set<String> tags, @NotNull Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(platformVersion, "platformVersion");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(hwid, "hwid");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new Registration(id, signedString, deviceId, systemToken, sdkVersion, appVersion, dst, locationEnabled, proximityEnabled, platformVersion, pushEnabled, timeZone, contactKey, platform, hwid, appId, locale, tags, attributes);
    }

    @JvmName(name = "deviceId")
    @NotNull
    public final String deviceId() {
        return this.deviceId;
    }

    @JvmName(name = k.a.f65039f)
    public final boolean dst() {
        return this.dst;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Registration)) {
            return false;
        }
        Registration registration = (Registration) other;
        return this.id == registration.id && Intrinsics.areEqual(this.signedString, registration.signedString) && Intrinsics.areEqual(this.deviceId, registration.deviceId) && Intrinsics.areEqual(this.systemToken, registration.systemToken) && Intrinsics.areEqual(this.sdkVersion, registration.sdkVersion) && Intrinsics.areEqual(this.appVersion, registration.appVersion) && this.dst == registration.dst && this.locationEnabled == registration.locationEnabled && this.proximityEnabled == registration.proximityEnabled && Intrinsics.areEqual(this.platformVersion, registration.platformVersion) && this.pushEnabled == registration.pushEnabled && this.timeZone == registration.timeZone && Intrinsics.areEqual(this.contactKey, registration.contactKey) && Intrinsics.areEqual(this.platform, registration.platform) && Intrinsics.areEqual(this.hwid, registration.hwid) && Intrinsics.areEqual(this.appId, registration.appId) && Intrinsics.areEqual(this.locale, registration.locale) && Intrinsics.areEqual(this.tags, registration.tags) && Intrinsics.areEqual(this.attributes, registration.attributes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        int i10 = this.id * 31;
        String str = this.signedString;
        int iC = n1.c(this.deviceId, (i10 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.systemToken;
        int iC2 = n1.c(this.appVersion, n1.c(this.sdkVersion, (iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        boolean z10 = this.dst;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i11 = (iC2 + r3) * 31;
        boolean z11 = this.locationEnabled;
        ?? r4 = z11;
        if (z11) {
            r4 = 1;
        }
        int i12 = (i11 + r4) * 31;
        boolean z12 = this.proximityEnabled;
        ?? r10 = z12;
        if (z12) {
            r10 = 1;
        }
        int iC3 = n1.c(this.platformVersion, (i12 + r10) * 31, 31);
        boolean z13 = this.pushEnabled;
        int i13 = (((iC3 + (z13 ? 1 : z13)) * 31) + this.timeZone) * 31;
        String str3 = this.contactKey;
        return this.attributes.hashCode() + ((this.tags.hashCode() + n1.c(this.locale, n1.c(this.appId, n1.c(this.hwid, n1.c(this.platform, (i13 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31), 31)) * 31);
    }

    @JvmName(name = k.a.m)
    @NotNull
    public final String hwid() {
        return this.hwid;
    }

    @JvmName(name = "locale")
    @NotNull
    public final String locale() {
        return this.locale;
    }

    @JvmName(name = "locationEnabled")
    public final boolean locationEnabled() {
        return this.locationEnabled;
    }

    @JvmName(name = k.a.f65035b)
    @NotNull
    public final String platform() {
        return this.platform;
    }

    @JvmName(name = "platformVersion")
    @NotNull
    public final String platformVersion() {
        return this.platformVersion;
    }

    @JvmName(name = "proximityEnabled")
    public final boolean proximityEnabled() {
        return this.proximityEnabled;
    }

    @JvmName(name = "pushEnabled")
    public final boolean pushEnabled() {
        return this.pushEnabled;
    }

    @JvmName(name = ContextualDataConstants.CD_SDK_VERSION)
    @NotNull
    public final String sdkVersion() {
        return this.sdkVersion;
    }

    public final void setId$sdk_release(int i10) {
        this.id = i10;
    }

    @JvmName(name = "signedString")
    @Nullable
    public final String signedString() {
        return this.signedString;
    }

    @JvmName(name = "systemToken")
    @Nullable
    public final String systemToken() {
        return this.systemToken;
    }

    @JvmName(name = k.a.f65040g)
    @NotNull
    public final Set<String> tags() {
        return this.tags;
    }

    @JvmName(name = "timeZone")
    public final int timeZone() {
        return this.timeZone;
    }

    @NotNull
    public final JSONObject toJson$sdk_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("signedString", this.signedString);
        jSONObject.put("deviceID", this.deviceId);
        String str = this.systemToken;
        if (str != null) {
            jSONObject.put("device_Token", str);
        }
        jSONObject.put("sdk_Version", this.sdkVersion);
        jSONObject.put("app_Version", this.appVersion);
        jSONObject.put("dST", this.dst);
        jSONObject.put("location_Enabled", this.locationEnabled);
        jSONObject.put("proximity_Enabled", this.proximityEnabled);
        jSONObject.put("platform_Version", this.platformVersion);
        jSONObject.put("push_Enabled", this.pushEnabled);
        jSONObject.put("timeZone", String.valueOf(this.timeZone));
        String str2 = this.contactKey;
        if (str2 != null) {
            jSONObject.put("subscriberKey", str2);
        }
        jSONObject.put(k.a.f65035b, this.platform);
        jSONObject.put(k.a.m, this.hwid);
        jSONObject.put("etAppId", this.appId);
        jSONObject.put("locale", this.locale);
        jSONObject.put(k.a.f65040g, new JSONArray((Collection) new TreeSet(this.tags)));
        jSONObject.put(k.a.f65041h, m.a(p.toSortedMap(this.attributes)));
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Registration(id=");
        sb2.append(this.id);
        sb2.append(", signedString=");
        sb2.append(this.signedString);
        sb2.append(", deviceId=");
        sb2.append(this.deviceId);
        sb2.append(", systemToken=");
        sb2.append(this.systemToken);
        sb2.append(", sdkVersion=");
        sb2.append(this.sdkVersion);
        sb2.append(", appVersion=");
        sb2.append(this.appVersion);
        sb2.append(", dst=");
        sb2.append(this.dst);
        sb2.append(", locationEnabled=");
        sb2.append(this.locationEnabled);
        sb2.append(", proximityEnabled=");
        sb2.append(this.proximityEnabled);
        sb2.append(", platformVersion=");
        sb2.append(this.platformVersion);
        sb2.append(", pushEnabled=");
        sb2.append(this.pushEnabled);
        sb2.append(", timeZone=");
        sb2.append(this.timeZone);
        sb2.append(", contactKey=");
        sb2.append(this.contactKey);
        sb2.append(", platform=");
        sb2.append(this.platform);
        sb2.append(", hwid=");
        sb2.append(this.hwid);
        sb2.append(", appId=");
        sb2.append(this.appId);
        sb2.append(", locale=");
        sb2.append(this.locale);
        sb2.append(", tags=");
        sb2.append(this.tags);
        sb2.append(", attributes=");
        return androidx.datastore.preferences.protobuf.e.g(sb2, this.attributes, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ Registration(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, String str6, boolean z13, int i11, String str7, String str8, String str9, String str10, String str11, Set set, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, str, str2, (i12 & 8) != 0 ? null : str3, str4, str5, z10, z11, z12, str6, z13, i11, (i12 & 4096) != 0 ? null : str7, str8, str9, str10, str11, set, map);
    }

    public Registration(@NotNull JSONObject json) throws JSONException {
        Object objValueOf;
        String string;
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = json.optString("signedString");
        Intrinsics.checkNotNullExpressionValue(strOptString, "json.optString(\"signedString\")");
        String strB = m.b(strOptString);
        String string2 = json.getString("deviceID");
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(\"deviceID\")");
        String strOptString2 = json.optString("device_Token");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "json.optString(\"device_Token\")");
        String strB2 = m.b(strOptString2);
        String string3 = json.getString("sdk_Version");
        Intrinsics.checkNotNullExpressionValue(string3, "json.getString(\"sdk_Version\")");
        String string4 = json.getString("app_Version");
        Intrinsics.checkNotNullExpressionValue(string4, "json.getString(\"app_Version\")");
        boolean z10 = json.getBoolean("dST");
        boolean z11 = json.getBoolean("location_Enabled");
        boolean z12 = json.getBoolean("proximity_Enabled");
        String string5 = json.getString("platform_Version");
        Intrinsics.checkNotNullExpressionValue(string5, "json.getString(\"platform_Version\")");
        boolean z13 = json.getBoolean("push_Enabled");
        String string6 = json.getString("timeZone");
        Intrinsics.checkNotNullExpressionValue(string6, "json.getString(\"timeZone\")");
        int i10 = Integer.parseInt(string6);
        String strG = androidx.databinding.f.g(json, "subscriberKey", "json.optString(\"subscriberKey\")");
        String string7 = json.getString(k.a.f65035b);
        Intrinsics.checkNotNullExpressionValue(string7, "json.getString(\"platform\")");
        String string8 = json.getString(k.a.m);
        Intrinsics.checkNotNullExpressionValue(string8, "json.getString(\"hwid\")");
        String string9 = json.getString("etAppId");
        Intrinsics.checkNotNullExpressionValue(string9, "json.getString(\"etAppId\")");
        String string10 = json.getString("locale");
        Intrinsics.checkNotNullExpressionValue(string10, "json.getString(\"locale\")");
        JSONArray jSONArray = json.getJSONArray(k.a.f65040g);
        Intrinsics.checkNotNullExpressionValue(jSONArray, "json.getJSONArray(\"tags\")");
        IntRange intRangeUntil = kotlin.ranges.c.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            Iterator<Integer> it2 = it;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
            int i11 = i10;
            boolean z14 = z13;
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                objValueOf = jSONArray.getJSONObject(iNextInt);
                if (objValueOf == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                objValueOf = Integer.valueOf(jSONArray.getInt(iNextInt));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                objValueOf = Double.valueOf(jSONArray.getDouble(iNextInt));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                objValueOf = Long.valueOf(jSONArray.getLong(iNextInt));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                objValueOf = Boolean.valueOf(jSONArray.getBoolean(iNextInt));
            } else {
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    string = jSONArray.getString(iNextInt);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    objValueOf = jSONArray.get(iNextInt);
                    if (objValueOf == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                arrayList.add(string);
                it = it2;
                z13 = z14;
                i10 = i11;
            }
            string = (String) objValueOf;
            arrayList.add(string);
            it = it2;
            z13 = z14;
            i10 = i11;
        }
        boolean z15 = z13;
        int i12 = i10;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!TextUtils.isEmpty((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Set set = CollectionsKt___CollectionsKt.toSet(arrayList2);
        JSONArray jSONArray2 = json.getJSONArray(k.a.f65041h);
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "json.getJSONArray(\"attributes\")");
        this(0, strB, string2, strB2, string3, string4, z10, z11, z12, string5, z15, i12, strG, string7, string8, string9, string10, set, m.b(jSONArray2));
    }
}
