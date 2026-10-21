package com.salesforce.marketingcloud.config;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.y2;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.analytics.m;
import com.salesforce.marketingcloud.extensions.PushExtensionsKt;
import com.salesforce.marketingcloud.k;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.fidoalliance.intent.api.UAFAppIntentExtras;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u00100\u001a\u00020.¢\u0006\u0004\b=\u0010>J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0007J\b\u0010\u0019\u001a\u00020\u0013H\u0007J\b\u0010\u001a\u001a\u00020\u0013H\u0007J\b\u0010\u001b\u001a\u00020\u0013H\u0007J\b\u0010\u001c\u001a\u00020\u0013H\u0007J\b\u0010\u001d\u001a\u00020\u0013H\u0007J\u0010\u0010\b\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0006H\u0007J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0007J\u001f\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\fH\u0007J\u0018\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\fH\u0017R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R$\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00103R\u0018\u00108\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R&\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00101¨\u0006@"}, d2 = {"Lcom/salesforce/marketingcloud/config/a;", "Lcom/salesforce/marketingcloud/k$e;", "Lcom/salesforce/marketingcloud/f;", "Lorg/json/JSONArray;", a.U, "", "", "Lcom/salesforce/marketingcloud/config/b;", "b", "f", "", "a", "Lorg/json/JSONObject;", "event", "appConfig", "key", "value", "componentState", UAFAppIntentExtras.IEN_COMPONENT_NAME, "", "changingApplication", "tearDown", "Lcom/salesforce/marketingcloud/InitializationStatus$a;", "statusBuilder", "i", "j", "g", "k", "h", "l", a.f64108s, "Lcom/salesforce/marketingcloud/storage/j;", "storage", a.f64109t, "d", "()Ljava/util/Map;", "data", "c", "Lcom/salesforce/marketingcloud/k$d;", "node", "onSyncReceived", "Lcom/salesforce/marketingcloud/k;", "Lcom/salesforce/marketingcloud/k;", "syncRouteComponent", "e", "Lcom/salesforce/marketingcloud/storage/j;", "Lcom/salesforce/marketingcloud/analytics/m;", "Lcom/salesforce/marketingcloud/analytics/m;", "triggerAnalytics", "Ljava/util/Map;", "endpointConfigMap", "Ljava/lang/Boolean;", "isEngagementEventTrackingEnabled", "isSystemEventTrackingEnabled", "isAppEventTrackingEnabled", "isIdentityEventTrackingEnabled", "isTelemetryInfoTrackingEnabled", "m", "isDebugInfoTrackingEnabled", "n", "activeEventMap", "<init>", "(Lcom/salesforce/marketingcloud/k;Lcom/salesforce/marketingcloud/storage/j;Lcom/salesforce/marketingcloud/analytics/m;)V", "o", "sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigComponent.kt\ncom/salesforce/marketingcloud/config/ConfigComponent\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n215#2:451\n216#2:453\n1#3:452\n*S KotlinDebug\n*F\n+ 1 ConfigComponent.kt\ncom/salesforce/marketingcloud/config/ConfigComponent\n*L\n136#1:451\n136#1:453\n*E\n"})
public final class a extends com.salesforce.marketingcloud.f implements k.e {
    private static final boolean A = true;
    private static final boolean B = false;
    private static final boolean C = false;
    private static final boolean D = false;
    private static final boolean E = false;
    private static final boolean F = false;

    @NotNull
    private static final String G = "items";

    @NotNull
    private static final String H = "inApp";

    @NotNull
    private static final String I = "maxDisplay";

    @NotNull
    private static final String J = "timeBetweenDisplaySec";

    @NotNull
    private static final String K = "invalidConfigurationKey";

    @NotNull
    private static final String L = "invalidConfigurationValue";

    @NotNull
    private static final String M = "event";

    @NotNull
    private static final String N = "activeEvents";

    @NotNull
    private static final String O = "enableEngagementEvents";

    @NotNull
    private static final String P = "enableSystemEvents";

    @NotNull
    private static final String Q = "enableAppEvents";

    @NotNull
    private static final String R = "enableIdentityEvents";

    @NotNull
    private static final String S = "enableDebugInfo";

    @NotNull
    private static final String T = "enableTelemetryInfo";

    @NotNull
    private static final String U = "endpoints";

    @NotNull
    private static final String V = "dataTypes";
    private static final int W = 1000;

    @NotNull
    private static final String X = "version";

    @Nullable
    private static a Y = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f64105p = "correlationIds";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f64106q = "gateEventProcessingMs";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f64107r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f64108s = "eventName";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f64109t = "endpoint";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f64110u = "path";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f64111v = "maxBatchSize";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final EnumSet<k.d> f64112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final Object f64113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final String f64114y = "~!ConfigComponent";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f64115z = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final k syncRouteComponent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final com.salesforce.marketingcloud.storage.j storage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final m triggerAnalytics;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private Map<String, com.salesforce.marketingcloud.config.b> endpointConfigMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private Boolean isEngagementEventTrackingEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private Boolean isSystemEventTrackingEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private Boolean isAppEventTrackingEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private Boolean isIdentityEventTrackingEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private Boolean isTelemetryInfoTrackingEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Boolean isDebugInfoTrackingEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private Map<String, String> activeEventMap;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.config.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b<\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0014\u0010)\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001aR\u0014\u0010+\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u0014\u0010,\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u0014\u0010-\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u001aR\u0014\u0010.\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u001aR\u0014\u0010/\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u0014\u00100\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u001aR\u0014\u00101\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u001aR\u0014\u00102\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u0014\u00103\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u001aR\u0014\u00104\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u001aR\u0014\u00105\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u001aR\u0014\u00106\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u001aR\u0014\u00107\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\u001aR\u0014\u00108\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u001aR\u0014\u00109\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010\u001aR\u0014\u0010:\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u0017R\u0014\u0010;\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010\u001a¨\u0006="}, d2 = {"Lcom/salesforce/marketingcloud/config/a$a;", "", "Ljava/util/EnumSet;", "Lcom/salesforce/marketingcloud/k$d;", "SYNC_NODES_INTERESTED", "Ljava/util/EnumSet;", "d", "()Ljava/util/EnumSet;", "Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "Lcom/salesforce/marketingcloud/config/a;", "instance", "Lcom/salesforce/marketingcloud/config/a;", "a", "()Lcom/salesforce/marketingcloud/config/a;", "(Lcom/salesforce/marketingcloud/config/a;)V", "getInstance$annotations", "()V", "", "BATCH_SIZE_DEFAULT_VALUE", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "", "CONFIG_KEY_EVENT_GATE_PROCESSING", "Ljava/lang/String;", "DISABLE_EVENT_GATE_MILLS", "", "ENABLE_APP_EVENTS_DEFAULT_VALUE", "Z", "ENABLE_DEBUG_INFO_DEFAULT_VALUE", "ENABLE_ENGAGEMENT_EVENTS_DEFAULT_VALUE", "ENABLE_IDENTITY_EVENTS_DEFAULT_VALUE", "ENABLE_SYSTEM_EVENTS_DEFAULT_VALUE", "ENABLE_TELEMETRY_INFO_DEFAULT_VALUE", "KEY_ITEMS", "KEY_ITEMS_APP_CONFIG", "KEY_ITEMS_APP_CONFIG_INVALID_CONFIGURATION_KEY", "KEY_ITEMS_APP_CONFIG_INVALID_CONFIGURATION_VALUE", "KEY_ITEMS_APP_CONFIG_MAX_DISPLAY", "KEY_ITEMS_APP_CONFIG_TIME_BETWEEN_DISPLAY", "KEY_ITEMS_ENDPOINTS", "KEY_ITEMS_ENDPOINTS_BATCH_SIZE", "KEY_ITEMS_ENDPOINTS_DATA_TYPES", "KEY_ITEMS_ENDPOINTS_ENDPOINT", "KEY_ITEMS_ENDPOINTS_PATH", "KEY_ITEMS_EVENT", "KEY_ITEMS_EVENT_ACTIVE_EVENTS", "KEY_ITEMS_EVENT_CORRELATION_ID_KEY", "KEY_ITEMS_EVENT_ENABLE_APP_EVENTS", "KEY_ITEMS_EVENT_ENABLE_DEBUG_INFO", "KEY_ITEMS_EVENT_ENABLE_ENGAGEMENT_EVENTS", "KEY_ITEMS_EVENT_ENABLE_IDENTITY_EVENTS", "KEY_ITEMS_EVENT_ENABLE_SYSTEM_EVENTS", "KEY_ITEMS_EVENT_ENABLE_TELEMETRY_INFO", "KEY_ITEMS_EVENT_EVENT_NAME", "KEY_VERSION", "SYNC_NODE_VERSION", "TAG", "<init>", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final a a() {
            return a.Y;
        }

        @NotNull
        public final Object c() {
            return a.f64113x;
        }

        @NotNull
        public final EnumSet<k.d> d() {
            return a.f64112w;
        }

        public final void a(@Nullable a aVar) {
            a.Y = aVar;
        }

        @JvmStatic
        public static /* synthetic */ void b() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64126a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to generate complete SDK state output for component.";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f64127a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse [Endpoint Config] sync data.";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f64128a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse [Event Config] sync data";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class e extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f64129a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse [InApp Config] sync data";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class f extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f64130a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ad.d.f(new StringBuilder("Unknown endpoint '"), this.f64130a, "' in config.");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class g extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f64131a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse endpoint from sync response.";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class h extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f64132a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to handle sync payload due to version mismatch";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class i extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f64133a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not process [AppConfig Node] from Sync.";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class j extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f64134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.f64134a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return y2.b(new StringBuilder("Failed to log analytics for InvalidConfig ["), this.f64134a, AbstractJsonLexerKt.END_LIST);
        }
    }

    static {
        EnumSet<k.d> enumSetOf = EnumSet.of(k.d.appConfig);
        Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(SyncRouteComponent.Node.appConfig)");
        f64112w = enumSetOf;
        f64113x = new Object();
    }

    public a(@NotNull k syncRouteComponent, @NotNull com.salesforce.marketingcloud.storage.j storage, @NotNull m triggerAnalytics) {
        Intrinsics.checkNotNullParameter(syncRouteComponent, "syncRouteComponent");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(triggerAnalytics, "triggerAnalytics");
        this.syncRouteComponent = syncRouteComponent;
        this.storage = storage;
        this.triggerAnalytics = triggerAnalytics;
        Y = this;
    }

    @Nullable
    public static final a e() {
        return INSTANCE.a();
    }

    private final Map<String, String> f() {
        return PushExtensionsKt.toMap(new JSONArray(this.storage.f().getString(N, new JSONArray().toString())));
    }

    @Override // com.salesforce.marketingcloud.d
    @NotNull
    public String componentName() {
        return "ConfigComponent";
    }

    @Override // com.salesforce.marketingcloud.d
    @NotNull
    public JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        synchronized (f64113x) {
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(O, this.storage.f().getBoolean(O, true));
                    jSONObject2.put(P, this.storage.f().getBoolean(P, false));
                    jSONObject2.put(Q, this.storage.f().getBoolean(Q, false));
                    jSONObject2.put(R, this.storage.f().getBoolean(R, false));
                    jSONObject2.put(T, this.storage.f().getBoolean(T, false));
                    jSONObject2.put(S, this.storage.f().getBoolean(S, false));
                    Map<String, String> mapEmptyMap = this.activeEventMap;
                    if (mapEmptyMap == null) {
                        mapEmptyMap = q.emptyMap();
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : mapEmptyMap.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(f64108s, entry.getKey());
                        String value = entry.getValue();
                        if (value != null) {
                            jSONObject3.put(f64105p, value);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    Unit unit = Unit.INSTANCE;
                    jSONObject2.put(N, jSONArray);
                    jSONObject.put("event", jSONObject2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(f64106q, this.storage.f().getInt(f64106q, 0));
                    jSONObject4.put(I, this.storage.f().getInt(I, Integer.MAX_VALUE));
                    jSONObject4.put(J, this.storage.f().getInt(J, 0));
                    jSONObject.put(H, jSONObject4);
                    Map<String, com.salesforce.marketingcloud.config.b> mapEmptyMap2 = this.endpointConfigMap;
                    if (mapEmptyMap2 == null) {
                        mapEmptyMap2 = q.emptyMap();
                    }
                    jSONObject.put(U, PushExtensionsKt.toJSONArray(mapEmptyMap2));
                } catch (Exception unused) {
                    com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f64223a, f64114y, null, b.f64126a, 2, null);
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONObject;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.activeEventMap;
    }

    @WorkerThread
    public final boolean g() {
        boolean zBooleanValue;
        synchronized (f64113x) {
            try {
                Boolean bool = this.isAppEventTrackingEnabled;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.storage.f().getBoolean(Q, false);
                    this.isAppEventTrackingEnabled = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean h() {
        boolean zBooleanValue;
        synchronized (f64113x) {
            try {
                Boolean bool = this.isDebugInfoTrackingEnabled;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.storage.f().getBoolean(S, false);
                    this.isDebugInfoTrackingEnabled = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean i() {
        boolean zBooleanValue;
        synchronized (f64113x) {
            try {
                Boolean bool = this.isEngagementEventTrackingEnabled;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.storage.f().getBoolean(O, true);
                    this.isEngagementEventTrackingEnabled = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean j() {
        boolean zBooleanValue;
        synchronized (f64113x) {
            try {
                Boolean bool = this.isIdentityEventTrackingEnabled;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.storage.f().getBoolean(R, false);
                    this.isIdentityEventTrackingEnabled = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean k() {
        boolean zBooleanValue;
        synchronized (f64113x) {
            try {
                Boolean bool = this.isSystemEventTrackingEnabled;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.storage.f().getBoolean(P, false);
                    this.isSystemEventTrackingEnabled = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @WorkerThread
    public final boolean l() {
        boolean zBooleanValue;
        synchronized (f64113x) {
            try {
                Boolean bool = this.isTelemetryInfoTrackingEnabled;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = this.storage.f().getBoolean(T, false);
                    this.isTelemetryInfoTrackingEnabled = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @Override // com.salesforce.marketingcloud.k.e
    @WorkerThread
    public void onSyncReceived(@NotNull k.d node, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(data, "data");
        if (f64112w.contains(node)) {
            if (data.optInt("version") != 1) {
                com.salesforce.marketingcloud.g.b(com.salesforce.marketingcloud.g.f64223a, f64114y, null, h.f64132a, 2, null);
                return;
            }
            try {
                if (node == k.d.appConfig) {
                    c(data);
                }
            } catch (Throwable th2) {
                com.salesforce.marketingcloud.g.f64223a.b(f64114y, th2, i.f64133a);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public void tearDown(boolean changingApplication) {
        this.syncRouteComponent.a(f64112w, (k.e) null);
        Y = null;
    }

    private final Map<String, com.salesforce.marketingcloud.config.b> b(JSONArray endpoints) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (endpoints.length() != 0) {
            int length = endpoints.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Object obj = endpoints.get(i10);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(V);
                    if (jSONArrayOptJSONArray != null) {
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            Object obj2 = jSONArrayOptJSONArray.get(i11);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (Intrinsics.areEqual(str, "EVENTS")) {
                                com.salesforce.marketingcloud.config.b.Companion companion = com.salesforce.marketingcloud.config.b.INSTANCE;
                                String stringOrNull = PushExtensionsKt.getStringOrNull(jSONObject, "path");
                                Integer intOrNull = PushExtensionsKt.getIntOrNull(jSONObject, f64111v);
                                linkedHashMap.put(str, companion.a(str, stringOrNull, Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 1000)));
                            } else {
                                com.salesforce.marketingcloud.g.e(com.salesforce.marketingcloud.g.f64223a, f64114y, null, new f(str), 2, null);
                            }
                        }
                    }
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.f64223a.e(f64114y, e5, g.f64131a);
                }
            }
        }
        return linkedHashMap;
    }

    @WorkerThread
    @Nullable
    public final com.salesforce.marketingcloud.config.b a(@Nullable com.salesforce.marketingcloud.storage.j storage, @Nullable String endpoint) {
        com.salesforce.marketingcloud.config.b bVar;
        if (storage == null || endpoint == null || endpoint.length() == 0) {
            return null;
        }
        synchronized (f64113x) {
            try {
                Map<String, com.salesforce.marketingcloud.config.b> map = this.endpointConfigMap;
                if (map == null || (bVar = map.get(endpoint)) == null) {
                    Map<String, com.salesforce.marketingcloud.config.b> mapB = b(new JSONArray(storage.f().getString(U, new JSONArray().toString())));
                    this.endpointConfigMap = mapB;
                    bVar = mapB.get(endpoint);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @VisibleForTesting
    public final void c(@NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObjectOptJSONObject = data.optJSONObject("items");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("event");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        } else {
            Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject2, "this.optJSONObject(KEY_I…MS_EVENT) ?: JSONObject()");
        }
        a(jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(H);
        if (jSONObjectOptJSONObject3 == null) {
            jSONObjectOptJSONObject3 = new JSONObject();
        } else {
            Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject3, "this.optJSONObject(KEY_I…P_CONFIG) ?: JSONObject()");
        }
        b(jSONObjectOptJSONObject3);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(U);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        } else {
            Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "this.optJSONArray(KEY_IT…ENDPOINTS) ?: JSONArray()");
        }
        a(jSONArrayOptJSONArray);
    }

    public static final void b(@Nullable a aVar) {
        INSTANCE.a(aVar);
    }

    @WorkerThread
    @Nullable
    public final String a(@NotNull String eventName) {
        String str;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        synchronized (f64113x) {
            try {
                Map<String, String> map = this.activeEventMap;
                if (map != null) {
                    String lowerCase = eventName.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    str = map.get(lowerCase);
                    if (str == null) {
                        Map<String, String> mapF = f();
                        this.activeEventMap = mapF;
                        String lowerCase2 = eventName.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        str = mapF.get(lowerCase2);
                    }
                } else {
                    Map<String, String> mapF2 = f();
                    this.activeEventMap = mapF2;
                    String lowerCase3 = eventName.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    str = mapF2.get(lowerCase3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    private final void b(JSONObject appConfig) {
        synchronized (f64113x) {
            try {
                try {
                    int iOptInt = appConfig.optInt(f64106q, 0);
                    int iOptInt2 = appConfig.optInt(I, Integer.MAX_VALUE);
                    int iOptInt3 = appConfig.optInt(J, 0);
                    SharedPreferences.Editor editorEdit = this.storage.f().edit();
                    Intrinsics.checkNotNullExpressionValue(editorEdit, "storage.sdkStatePreferences.edit()");
                    if (iOptInt >= 0) {
                        editorEdit.putInt(com.salesforce.marketingcloud.events.c.f64147s, iOptInt);
                    }
                    if (iOptInt2 >= 0) {
                        editorEdit.putInt(com.salesforce.marketingcloud.events.c.f64148t, iOptInt2);
                    }
                    if (iOptInt3 >= 0) {
                        editorEdit.putInt(com.salesforce.marketingcloud.events.c.f64149u, iOptInt3);
                    }
                    editorEdit.apply();
                    if (iOptInt < 0) {
                        a(f64106q, String.valueOf(iOptInt));
                    }
                    if (iOptInt2 < 0) {
                        a(I, String.valueOf(iOptInt2));
                    }
                    if (iOptInt3 < 0) {
                        a(J, String.valueOf(iOptInt3));
                    }
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.f64223a.b(f64114y, e5, e.f64129a);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NotNull InitializationStatus.a statusBuilder) {
        Intrinsics.checkNotNullParameter(statusBuilder, "statusBuilder");
        this.syncRouteComponent.a(f64112w, this);
    }

    @WorkerThread
    public final boolean b(@NotNull String eventName) {
        String lowerCase;
        String str;
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        synchronized (f64113x) {
            try {
                Map<String, String> mapF = this.activeEventMap;
                if (mapF != null) {
                    lowerCase = eventName.toLowerCase(Locale.ROOT);
                    str = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                } else {
                    mapF = f();
                    this.activeEventMap = mapF;
                    lowerCase = eventName.toLowerCase(Locale.ROOT);
                    str = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                }
                Intrinsics.checkNotNullExpressionValue(lowerCase, str);
                zContainsKey = mapF.containsKey(lowerCase);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    private final void a(String key, String value) {
        try {
            if (h()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(K, key);
                jSONObject.put(L, value);
                this.triggerAnalytics.b(jSONObject);
            }
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.f64223a.b(f64114y, e5, new j(key));
        }
    }

    private final void a(JSONArray endpoints) {
        synchronized (f64113x) {
            try {
                this.endpointConfigMap = b(endpoints);
                this.storage.f().edit().putString(U, endpoints.toString()).apply();
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.f64223a.b(f64114y, e5, c.f64127a);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void a(JSONObject event) {
        synchronized (f64113x) {
            try {
                try {
                    SharedPreferences.Editor editorEdit = this.storage.f().edit();
                    Intrinsics.checkNotNullExpressionValue(editorEdit, "storage.sdkStatePreferences.edit()");
                    Boolean boolValueOf = Boolean.valueOf(event.optBoolean(O, true));
                    editorEdit.putBoolean(O, boolValueOf.booleanValue());
                    this.isEngagementEventTrackingEnabled = boolValueOf;
                    Boolean boolValueOf2 = Boolean.valueOf(event.optBoolean(P, false));
                    editorEdit.putBoolean(P, boolValueOf2.booleanValue());
                    this.isSystemEventTrackingEnabled = boolValueOf2;
                    Boolean boolValueOf3 = Boolean.valueOf(event.optBoolean(Q, false));
                    editorEdit.putBoolean(Q, boolValueOf3.booleanValue());
                    this.isAppEventTrackingEnabled = boolValueOf3;
                    Boolean boolValueOf4 = Boolean.valueOf(event.optBoolean(R, false));
                    editorEdit.putBoolean(R, boolValueOf4.booleanValue());
                    this.isIdentityEventTrackingEnabled = boolValueOf4;
                    Boolean boolValueOf5 = Boolean.valueOf(event.optBoolean(S, false));
                    editorEdit.putBoolean(S, boolValueOf5.booleanValue());
                    this.isDebugInfoTrackingEnabled = boolValueOf5;
                    Boolean boolValueOf6 = Boolean.valueOf(event.optBoolean(T, false));
                    editorEdit.putBoolean(T, boolValueOf6.booleanValue());
                    this.isTelemetryInfoTrackingEnabled = boolValueOf6;
                    JSONArray jSONArrayOptJSONArray = event.optJSONArray(N);
                    if (jSONArrayOptJSONArray == null) {
                        jSONArrayOptJSONArray = new JSONArray();
                    } else {
                        Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "event.optJSONArray(KEY_I…VE_EVENTS) ?: JSONArray()");
                    }
                    this.activeEventMap = PushExtensionsKt.toMap(jSONArrayOptJSONArray);
                    editorEdit.putString(N, jSONArrayOptJSONArray.toString());
                    editorEdit.apply();
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.f64223a.b(f64114y, e5, d.f64128a);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
